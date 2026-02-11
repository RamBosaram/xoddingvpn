#include <jni.h>
#include <string>
#include <atomic>
#include <unistd.h>
#include <android/log.h>

#define TAG "PCAP"
#define LOGI(...) __android_log_print(ANDROID_LOG_INFO, TAG, __VA_ARGS__)

std::atomic<bool> g_running(false);
std::string g_current_ip = "";
std::atomic<int> g_current_port(0);

void parsePacket(uint8_t* data, size_t len) {
    if (len < 28) return;
    if ((data[0] >> 4) != 4) return; // IPv4
    if (data[9] != 17) return; // UDP

    int ihl = (data[0] & 0x0F) * 4;
    
    char ip[16];
    snprintf(ip, 16, "%d.%d.%d.%d", 
        data[16], data[17], data[18], data[19]);
    
    int port = (data[ihl + 2] << 8) | data[ihl + 3];
    
    // ТОЛЬКО 5-ЗНАЧНЫЕ (без логирования!)
    if (port >= 10000 && port <= 99999) {
        g_current_ip = ip;
        g_current_port = port;
        LOGI("🎮 %s:%d", ip, port);
    }
}

void pcapLoop(int fd) {
    uint8_t buffer[2048];
    LOGI("✅ PCAP started FD=%d", fd);

    while (g_running.load()) {
        ssize_t len = read(fd, buffer, sizeof(buffer));
        
        if (len > 0) {
            parsePacket(buffer, len);
            write(fd, buffer, len); // КРИТИЧНО!
        }
        
        usleep(100); // 0.1ms
    }
}

extern "C" JNIEXPORT void JNICALL
Java_com_creysvpn_app_PcapVpnService_startNativePcap(
    JNIEnv* env, jobject thiz, jint fd) {
    g_current_ip = "";
    g_current_port = 0;
    g_running = true;
    pcapLoop(fd);
}

extern "C" JNIEXPORT void JNICALL
Java_com_creysvpn_app_PcapVpnService_stopNativePcap(
    JNIEnv* env, jobject thiz) {
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
