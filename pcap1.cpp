#include <jni.h>
#include <string>
#include <atomic>
#include <unistd.h>
#include <fcntl.h>
#include <android/log.h>

#define TAG "PCAP"
#define LOGI(...) __android_log_print(ANDROID_LOG_INFO, TAG, __VA_ARGS__)
#define LOGE(...) __android_log_print(ANDROID_LOG_ERROR, TAG, __VA_ARGS__)

// Глобальное состояние
std::atomic<bool> g_running(false);
std::string g_current_ip = "";
std::atomic<int> g_current_port(0);

// ПРОСТОЙ парсинг для TCP и UDP
void parsePacket(uint8_t* data, size_t len) {
    if (len < 28) return;

    // IPv4 check
    if ((data[0] >> 4) != 4) return;

    // 🔥 ПРОВЕРКА НА TCP ИЛИ UDP (6=TCP, 17=UDP)
    uint8_t protocol = data[9];
    if (protocol != 6 && protocol != 17) {
        return; // Не TCP и не UDP
    }

    // IP header length
    int ihl = (data[0] & 0x0F) * 4;

    // Destination IP
    char ip[16];
    snprintf(ip, sizeof(ip), "%d.%d.%d.%d", 
        data[16], data[17], data[18], data[19]);

    // Destination Port (TCP и UDP имеют порты в одном месте заголовка)
    int port = (data[ihl + 2] << 8) | data[ihl + 3];

    // 🔥 ФИЛЬТР: ТОЛЬКО 5-ЗНАЧНЫЕ ПОРТЫ (10000-65535)
    if (port < 10000 || port > 65535) {
        LOGI("Filtered port: %d (not 5-digit)", port);
        return;
    }

    // Обновляем глобальные переменные
    g_current_ip = ip;
    g_current_port = port;
    
    LOGI("%s:%d (protocol: %d)", ip, port, protocol);
}

void pcapLoop(int fd) {
    uint8_t buffer[2048];
    
    LOGI("PCAP started FD=%d", fd);

    // Установим неблокирующий режим
    int flags = fcntl(fd, F_GETFL, 0);
    fcntl(fd, F_SETFL, flags | O_NONBLOCK);

    while (g_running.load()) {
        ssize_t len = read(fd, buffer, sizeof(buffer));

        if (len > 0) {
            parsePacket(buffer, len);
            write(fd, buffer, len);  // Вернуть пакет!
        } else if (len < 0 && errno != EAGAIN && errno != EWOULDBLOCK) {
            LOGE("Read error: %d", errno);
            break;
        } else if (len == 0) {
            LOGI("No data available");
        }

        usleep(10000); // 10ms вместо 50us для экономии батареи
    }
    
    LOGI("PCAP stopped");
}

extern "C" JNIEXPORT void JNICALL
Java_com_creysvpn_app_PcapVpnService_startNativePcap(
        JNIEnv* env, jobject thiz, jint fd) {
    g_current_ip = "";
    g_current_port = 0;
    g_running = true;
    LOGI("Starting PCAP FD=%d", fd);
    pcapLoop(fd);
}

extern "C" JNIEXPORT void JNICALL
Java_com_creysvpn_app_PcapVpnService_stopNativePcap(
        JNIEnv* env, jobject thiz) {
    LOGI("Stopping PCAP");
    g_running = false;
    g_current_ip = "";
    g_current_port = 0;
}

extern "C" JNIEXPORT jstring JNICALL
Java_com_creysvpn_app_PcapVpnService_getNativeIP(
        JNIEnv* env, jobject thiz) {
    return env->NewStringUTF(g_current_ip.c_str());
}

extern "C" JNIEXPORT jint JNICALL
Java_com_creysvpn_app_PcapVpnService_getNativePort(
        JNIEnv* env, jobject thiz) {
    return g_current_port.load();
}
