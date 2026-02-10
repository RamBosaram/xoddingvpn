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

// ПРОСТОЙ парсинг
void parsePacket(uint8_t* data, size_t len) {
    if (len < 28) return;

    // IPv4 check
    if ((data[0] >> 4) != 4) return;

    // UDP check
    if (data[9] != 17) return;

    // IP header length
    int ihl = (data[0] & 0x0F) * 4;

    // Destination IP
    char ip[16];
    snprintf(ip, sizeof(ip), "%d.%d.%d.%d", 
        data[16], data[17], data[18], data[19]);

    // Destination Port
    int port = (data[ihl + 2] << 8) | data[ihl + 3];

    // 🔥 ФИЛЬТР: ТОЛЬКО 5-ЗНАЧНЫЕ ПОРТЫ
    if (port < 10000 || port > 99999) return;

    // Обновляем глобальные переменные
    g_current_ip = ip;
    g_current_port = port;
    
    LOGI("🎮 %s:%d", ip, port);
}

void pcapLoop(int fd) {
    uint8_t buffer[2048];
    
    LOGI("✅ PCAP started FD=%d", fd);

    while (g_running.load()) {
        ssize_t len = read(fd, buffer, sizeof(buffer));

        if (len > 0) {
            parsePacket(buffer, len);
            write(fd, buffer, len);  // Вернуть пакет!
        } else if (len < 0 && errno != EAGAIN && errno != EWOULDBLOCK) {
            LOGE("Read error: %d", errno);
            break;
        }

        usleep(50);
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
