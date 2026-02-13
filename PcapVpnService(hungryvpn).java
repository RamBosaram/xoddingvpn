.class public final Lcom/example/myapplication/PcapVpnService;
.super Landroid/net/VpnService;
.source "PcapVpnService.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/example/myapplication/PcapVpnService$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPcapVpnService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PcapVpnService.kt\ncom/example/myapplication/PcapVpnService\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,271:1\n1863#2,2:272\n*S KotlinDebug\n*F\n+ 1 PcapVpnService.kt\ncom/example/myapplication/PcapVpnService\n*L\n260#1:272,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\n\n\u0002\u0010\n\n\u0002\b\u0007\u0018\u0000 82\u00020\u0001:\u00018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u0017H\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0002J\u0010\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020 H\u0002J0\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u00172\u0006\u0010$\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\'H\u0002J8\u0010(\u001a\u00020\u001d2\u0006\u0010)\u001a\u00020\u00132\u0006\u0010*\u001a\u00020\u00122\u0006\u0010+\u001a\u00020\u00122\u0006\u0010,\u001a\u00020\u00172\u0006\u0010-\u001a\u00020\u00122\u0006\u0010.\u001a\u00020\u0017H\u0002J0\u0010/\u001a\u00020\'2\u0006\u0010\"\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u00172\u0006\u0010$\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u00172\u0006\u00100\u001a\u00020\'H\u0002J \u00101\u001a\u0002022\u0006\u00100\u001a\u00020\'2\u0006\u00103\u001a\u00020\u00172\u0006\u00104\u001a\u00020\u0017H\u0002J\n\u00105\u001a\u0004\u0018\u00010\u0007H\u0002J\b\u00106\u001a\u00020\u001dH\u0002J\b\u00107\u001a\u00020\u001dH\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u0018\u0010\f\u001a\n \u000e*\u0004\u0018\u00010\r0\rX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000fR\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00150\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00069"
    }
    d2 = {
        "Lcom/example/myapplication/PcapVpnService;",
        "Landroid/net/VpnService;",
        "<init>",
        "()V",
        "vpnThread",
        "Ljava/lang/Thread;",
        "vpnInterface",
        "Landroid/os/ParcelFileDescriptor;",
        "vpnInput",
        "Ljava/io/FileInputStream;",
        "vpnOutput",
        "Ljava/io/FileOutputStream;",
        "executorService",
        "Ljava/util/concurrent/ExecutorService;",
        "kotlin.jvm.PlatformType",
        "Ljava/util/concurrent/ExecutorService;",
        "udpSockets",
        "Ljava/util/concurrent/ConcurrentHashMap;",
        "",
        "Ljava/net/DatagramSocket;",
        "socketLocks",
        "",
        "onStartCommand",
        "",
        "intent",
        "Landroid/content/Intent;",
        "flags",
        "startId",
        "runVpn",
        "",
        "processPacket",
        "packet",
        "Ljava/nio/ByteBuffer;",
        "forwardUdp",
        "srcIp",
        "srcPort",
        "destIp",
        "destPort",
        "payload",
        "",
        "listenForResponse",
        "socket",
        "id",
        "appIp",
        "appPort",
        "remoteIp",
        "remotePort",
        "buildUdpPacket",
        "data",
        "calculateIpChecksum",
        "",
        "offset",
        "length",
        "establishVpn",
        "closeVpn",
        "onDestroy",
        "Companion",
        "app_debug"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final ACTION_IP_FOUND:Ljava/lang/String; = "com.example.myapplication.IP_FOUND"

.field public static final Companion:Lcom/example/myapplication/PcapVpnService$Companion;

.field public static final EXTRA_IP_DATA:Ljava/lang/String; = "EXTRA_IP_DATA"


# instance fields
.field private final executorService:Ljava/util/concurrent/ExecutorService;

.field private final socketLocks:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final udpSockets:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Ljava/net/DatagramSocket;",
            ">;"
        }
    .end annotation
.end field

.field private vpnInput:Ljava/io/FileInputStream;

.field private vpnInterface:Landroid/os/ParcelFileDescriptor;

.field private vpnOutput:Ljava/io/FileOutputStream;

.field private vpnThread:Ljava/lang/Thread;


# direct methods
.method public static synthetic $r8$lambda$EvSA_wbA7org2mN5QXOd98xRWPk(Lcom/example/myapplication/PcapVpnService;Ljava/net/DatagramSocket;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;I)V
    .registers 7

    invoke-static/range {p0 .. p6}, Lcom/example/myapplication/PcapVpnService;->forwardUdp$lambda$5$lambda$4(Lcom/example/myapplication/PcapVpnService;Ljava/net/DatagramSocket;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;I)V

    return-void
.end method

.method public static synthetic $r8$lambda$Fy2i6eYX_wSXYI6XNP6xAgjDJwI(Lcom/example/myapplication/PcapVpnService;Ljava/nio/ByteBuffer;)V
    .registers 2

    invoke-static {p0, p1}, Lcom/example/myapplication/PcapVpnService;->runVpn$lambda$1(Lcom/example/myapplication/PcapVpnService;Ljava/nio/ByteBuffer;)V

    return-void
.end method

.method public static synthetic $r8$lambda$Jpebr7lrjAfe3iVW_B9IkMSk3hI(Ljava/lang/String;)Ljava/lang/Object;
    .registers 1

    invoke-static {p0}, Lcom/example/myapplication/PcapVpnService;->forwardUdp$lambda$2(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$MQNvwK-DqloWQS8qaIKYsU1AxK4(Lcom/example/myapplication/PcapVpnService;)V
    .registers 1

    invoke-static {p0}, Lcom/example/myapplication/PcapVpnService;->onStartCommand$lambda$0(Lcom/example/myapplication/PcapVpnService;)V

    return-void
.end method

.method public static synthetic $r8$lambda$Vy2c5zd8jyMTqJyaLKd6QvphfMs(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    invoke-static {p0, p1}, Lcom/example/myapplication/PcapVpnService;->forwardUdp$lambda$3(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Lcom/example/myapplication/PcapVpnService$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/example/myapplication/PcapVpnService$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/example/myapplication/PcapVpnService;->Companion:Lcom/example/myapplication/PcapVpnService$Companion;

    return-void
.end method

.method public constructor <init>()V
    .registers 2

    .line 14
    invoke-direct {p0}, Landroid/net/VpnService;-><init>()V

    .line 21
    invoke-static {}, Ljava/util/concurrent/Executors;->newCachedThreadPool()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/example/myapplication/PcapVpnService;->executorService:Ljava/util/concurrent/ExecutorService;

    .line 22
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/example/myapplication/PcapVpnService;->udpSockets:Ljava/util/concurrent/ConcurrentHashMap;

    .line 23
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/example/myapplication/PcapVpnService;->socketLocks:Ljava/util/concurrent/ConcurrentHashMap;

    .line 14
    return-void
.end method

.method private final buildUdpPacket(Ljava/lang/String;ILjava/lang/String;I[B)[B
    .registers 14
    .param p1, "srcIp"  # Ljava/lang/String;
    .param p2, "srcPort"  # I
    .param p3, "destIp"  # Ljava/lang/String;
    .param p4, "destPort"  # I
    .param p5, "data"  # [B

    .line 183
    const/16 v0, 0x14

    .line 184
    .local v0, "ipHeaderLen":I
    const/16 v1, 0x8

    .line 185
    .local v1, "udpHeaderLen":I
    add-int v2, v0, v1

    array-length v3, p5

    add-int/2addr v2, v3

    .line 187
    .local v2, "totalLen":I
    invoke-static {v2}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v3

    .line 189
    .local v3, "buffer":Ljava/nio/ByteBuffer;
    const/16 v4, 0x45

    invoke-virtual {v3, v4}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 190
    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 191
    int-to-short v5, v2

    invoke-virtual {v3, v5}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 192
    invoke-virtual {v3, v4}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 193
    const/16 v5, 0x40

    invoke-virtual {v3, v5}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 194
    const/16 v5, 0x11

    invoke-virtual {v3, v5}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 195
    invoke-virtual {v3, v4}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 197
    invoke-static {p1}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    move-result-object v5

    invoke-virtual {v5}, Ljava/net/InetAddress;->getAddress()[B

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 198
    invoke-static {p3}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    move-result-object v5

    invoke-virtual {v5}, Ljava/net/InetAddress;->getAddress()[B

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 200
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v5

    const-string v6, "array(...)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v5, v4, v0}, Lcom/example/myapplication/PcapVpnService;->calculateIpChecksum([BII)S

    move-result v5

    .line 201
    .local v5, "checksum":S
    const/16 v7, 0xa

    invoke-virtual {v3, v7, v5}, Ljava/nio/ByteBuffer;->putShort(IS)Ljava/nio/ByteBuffer;

    .line 203
    int-to-short v7, p2

    invoke-virtual {v3, v7}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 204
    int-to-short v7, p4

    invoke-virtual {v3, v7}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 205
    array-length v7, p5

    add-int/2addr v7, v1

    int-to-short v7, v7

    invoke-virtual {v3, v7}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 206
    invoke-virtual {v3, v4}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 207
    invoke-virtual {v3, p5}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 209
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v4

    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v4
.end method

.method private final calculateIpChecksum([BII)S
    .registers 8
    .param p1, "data"  # [B
    .param p2, "offset"  # I
    .param p3, "length"  # I

    .line 213
    const/4 v0, 0x0

    .line 214
    .local v0, "sum":I
    move v1, p2

    .line 215
    .local v1, "i":I
    :goto_2
    add-int/lit8 v2, p3, -0x1

    if-ge v1, v2, :cond_17

    .line 216
    aget-byte v2, p1, v1

    and-int/lit16 v2, v2, 0xff

    shl-int/lit8 v2, v2, 0x8

    add-int/lit8 v3, v1, 0x1

    aget-byte v3, p1, v3

    and-int/lit16 v3, v3, 0xff

    or-int/2addr v2, v3

    add-int/2addr v0, v2

    .line 217
    add-int/lit8 v1, v1, 0x2

    goto :goto_2

    .line 219
    :cond_17
    if-ge v1, p3, :cond_20

    .line 220
    aget-byte v2, p1, v1

    and-int/lit16 v2, v2, 0xff

    shl-int/lit8 v2, v2, 0x8

    add-int/2addr v0, v2

    .line 222
    :cond_20
    :goto_20
    shr-int/lit8 v2, v0, 0x10

    if-lez v2, :cond_2d

    .line 223
    const v2, 0xffff

    and-int/2addr v2, v0

    shr-int/lit8 v3, v0, 0x10

    add-int v0, v2, v3

    goto :goto_20

    .line 225
    :cond_2d
    not-int v2, v0

    int-to-short v2, v2

    return v2
.end method

.method private final closeVpn()V
    .registers 8

    .line 257
    nop

    .line 258
    :try_start_1
    iget-object v0, p0, Lcom/example/myapplication/PcapVpnService;->vpnThread:Ljava/lang/Thread;

    if-eqz v0, :cond_8

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 259
    :cond_8
    iget-object v0, p0, Lcom/example/myapplication/PcapVpnService;->vpnInterface:Landroid/os/ParcelFileDescriptor;

    if-eqz v0, :cond_f

    invoke-virtual {v0}, Landroid/os/ParcelFileDescriptor;->close()V

    .line 260
    :cond_f
    iget-object v0, p0, Lcom/example/myapplication/PcapVpnService;->udpSockets:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    const-string v1, "<get-values>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$forEach\\1":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 272
    .local v1, "$i$f$forEach\\1\\260":I
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_21
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3a

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .local v3, "element\\1":Ljava/lang/Object;
    move-object v4, v3

    check-cast v4, Ljava/net/DatagramSocket;

    .local v4, "it\\2":Ljava/net/DatagramSocket;
    const/4 v5, 0x0

    .line 260
    .local v5, "$i$a$-forEach-PcapVpnService$closeVpn$1\\2\\272\\0":I
    invoke-virtual {v4}, Ljava/net/DatagramSocket;->isClosed()Z

    move-result v6

    if-nez v6, :cond_38

    invoke-virtual {v4}, Ljava/net/DatagramSocket;->close()V

    .line 272
    .end local v4  # "it\\2":Ljava/net/DatagramSocket;
    .end local v5  # "$i$a$-forEach-PcapVpnService$closeVpn$1\\2\\272\\0":I
    :cond_38
    nop

    .end local v3  # "element\\1":Ljava/lang/Object;
    goto :goto_21

    .line 273
    :cond_3a
    nop

    .line 261
    .end local v0  # "$this$forEach\\1":Ljava/lang/Iterable;
    .end local v1  # "$i$f$forEach\\1\\260":I
    iget-object v0, p0, Lcom/example/myapplication/PcapVpnService;->udpSockets:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 262
    iget-object v0, p0, Lcom/example/myapplication/PcapVpnService;->executorService:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;
    :try_end_45
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_45} :catch_46

    goto :goto_47

    .line 263
    :catch_46
    move-exception v0

    .line 265
    :goto_47
    return-void
.end method

.method private final establishVpn()Landroid/os/ParcelFileDescriptor;
    .registers 6

    .line 229
    new-instance v0, Landroid/net/VpnService$Builder;

    move-object v1, p0

    check-cast v1, Landroid/net/VpnService;

    invoke-direct {v0, v1}, Landroid/net/VpnService$Builder;-><init>(Landroid/net/VpnService;)V

    .line 230
    .local v0, "builder":Landroid/net/VpnService$Builder;
    const-string v1, "10.0.0.1"

    const/16 v2, 0x20

    invoke-virtual {v0, v1, v2}, Landroid/net/VpnService$Builder;->addAddress(Ljava/lang/String;I)Landroid/net/VpnService$Builder;

    .line 232
    nop

    .line 233
    :try_start_10
    invoke-virtual {p0}, Lcom/example/myapplication/PcapVpnService;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/net/VpnService$Builder;->addDisallowedApplication(Ljava/lang/String;)Landroid/net/VpnService$Builder;
    :try_end_17
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_17} :catch_18

    goto :goto_1c

    .line 234
    :catch_18
    move-exception v1

    .line 235
    .local v1, "e":Ljava/lang/Exception;
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    .line 239
    .end local v1  # "e":Ljava/lang/Exception;
    :goto_1c
    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    const-string v3, "35.0.0.0"

    aput-object v3, v1, v2

    .line 240
    const/4 v2, 0x1

    aput-object v3, v1, v2

    .line 239
    nop

    .line 241
    const-string v2, "34.0.0.0"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    .line 239
    nop

    .line 238
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 244
    .local v1, "routes":Ljava/util/List;
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_36
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4b

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 245
    .local v3, "route":Ljava/lang/String;
    nop

    .line 246
    const/16 v4, 0x8

    :try_start_45
    invoke-virtual {v0, v3, v4}, Landroid/net/VpnService$Builder;->addRoute(Ljava/lang/String;I)Landroid/net/VpnService$Builder;
    :try_end_48
    .catch Ljava/lang/Exception; {:try_start_45 .. :try_end_48} :catch_49

    goto :goto_36

    .line 247
    :catch_49
    move-exception v4

    .end local v3  # "route":Ljava/lang/String;
    goto :goto_36

    .line 251
    :cond_4b
    const/16 v2, 0x578

    invoke-virtual {v0, v2}, Landroid/net/VpnService$Builder;->setMtu(I)Landroid/net/VpnService$Builder;

    .line 252
    sget v2, Lcom/example/myapplication/R$string;->app_name:I

    invoke-virtual {p0, v2}, Lcom/example/myapplication/PcapVpnService;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/net/VpnService$Builder;->setSession(Ljava/lang/String;)Landroid/net/VpnService$Builder;

    .line 253
    invoke-virtual {v0}, Landroid/net/VpnService$Builder;->establish()Landroid/os/ParcelFileDescriptor;

    move-result-object v2

    return-object v2
.end method

.method private final forwardUdp(Ljava/lang/String;ILjava/lang/String;I[B)V
    .registers 19
    .param p1, "srcIp"  # Ljava/lang/String;
    .param p2, "srcPort"  # I
    .param p3, "destIp"  # Ljava/lang/String;
    .param p4, "destPort"  # I
    .param p5, "payload"  # [B

    .line 124
    move-object/from16 v6, p3

    move/from16 v7, p4

    move-object/from16 v8, p5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 126
    .local v3, "connectionId":Ljava/lang/String;
    iget-object v0, p0, Lcom/example/myapplication/PcapVpnService;->socketLocks:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v1, Lcom/example/myapplication/PcapVpnService$$ExternalSyntheticLambda0;

    invoke-direct {v1}, Lcom/example/myapplication/PcapVpnService$$ExternalSyntheticLambda0;-><init>()V

    new-instance v2, Lcom/example/myapplication/PcapVpnService$$ExternalSyntheticLambda1;

    invoke-direct {v2, v1}, Lcom/example/myapplication/PcapVpnService$$ExternalSyntheticLambda1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v3, v2}, Ljava/util/concurrent/ConcurrentHashMap;->computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    .line 128
    const/4 v0, 0x0

    .local v0, "socket":Ljava/lang/Object;
    iget-object v1, p0, Lcom/example/myapplication/PcapVpnService;->udpSockets:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1, v3}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 130
    .end local v0  # "socket":Ljava/lang/Object;
    .local v1, "socket":Ljava/lang/Object;
    if-eqz v1, :cond_52

    move-object v0, v1

    check-cast v0, Ljava/net/DatagramSocket;

    invoke-virtual {v0}, Ljava/net/DatagramSocket;->isClosed()Z

    move-result v0

    if-eqz v0, :cond_a3

    .line 131
    :cond_52
    iget-object v0, p0, Lcom/example/myapplication/PcapVpnService;->socketLocks:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, v3}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    monitor-enter v9

    const/4 v10, 0x0

    .line 132
    .local v10, "$i$a$-synchronized-PcapVpnService$forwardUdp$2\\1\\131\\0":I
    :try_start_5d
    iget-object v0, p0, Lcom/example/myapplication/PcapVpnService;->udpSockets:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, v3}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    .line 133
    if-eqz v1, :cond_6f

    move-object v0, v1

    check-cast v0, Ljava/net/DatagramSocket;

    invoke-virtual {v0}, Ljava/net/DatagramSocket;->isClosed()Z

    move-result v0
    :try_end_6d
    .catchall {:try_start_5d .. :try_end_6d} :catchall_c2

    if-eqz v0, :cond_9f

    .line 134
    :cond_6f
    nop

    .line 135
    :try_start_70
    new-instance v2, Ljava/net/DatagramSocket;

    invoke-direct {v2}, Ljava/net/DatagramSocket;-><init>()V

    .line 136
    .local v2, "newSocket\\1":Ljava/net/DatagramSocket;
    invoke-virtual {p0, v2}, Lcom/example/myapplication/PcapVpnService;->protect(Ljava/net/DatagramSocket;)Z

    .line 137
    const/16 v0, 0x1388

    invoke-virtual {v2, v0}, Ljava/net/DatagramSocket;->setSoTimeout(I)V

    .line 138
    new-instance v0, Ljava/net/InetSocketAddress;

    invoke-direct {v0, v6, v7}, Ljava/net/InetSocketAddress;-><init>(Ljava/lang/String;I)V

    check-cast v0, Ljava/net/SocketAddress;

    invoke-virtual {v2, v0}, Ljava/net/DatagramSocket;->connect(Ljava/net/SocketAddress;)V

    .line 140
    iget-object v0, p0, Lcom/example/myapplication/PcapVpnService;->udpSockets:Ljava/util/concurrent/ConcurrentHashMap;

    check-cast v0, Ljava/util/Map;

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_8e
    .catch Ljava/lang/Exception; {:try_start_70 .. :try_end_8e} :catch_be
    .catchall {:try_start_70 .. :try_end_8e} :catchall_c2

    .line 141
    move-object v11, v2

    .line 143
    .end local v1  # "socket":Ljava/lang/Object;
    .local v11, "socket":Ljava/lang/Object;
    :try_start_8f
    iget-object v12, p0, Lcom/example/myapplication/PcapVpnService;->executorService:Ljava/util/concurrent/ExecutorService;

    new-instance v0, Lcom/example/myapplication/PcapVpnService$$ExternalSyntheticLambda2;

    move-object v1, p0

    move-object v4, p1

    move v5, p2

    invoke-direct/range {v0 .. v7}, Lcom/example/myapplication/PcapVpnService$$ExternalSyntheticLambda2;-><init>(Lcom/example/myapplication/PcapVpnService;Ljava/net/DatagramSocket;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;I)V

    move-object v1, v0

    move-object v0, v2

    .end local v2  # "newSocket\\1":Ljava/net/DatagramSocket;
    .local v0, "newSocket\\1":Ljava/net/DatagramSocket;
    invoke-interface {v12, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    :try_end_9e
    .catch Ljava/lang/Exception; {:try_start_8f .. :try_end_9e} :catch_bb
    .catchall {:try_start_8f .. :try_end_9e} :catchall_b8

    .line 147
    .end local v0  # "newSocket\\1":Ljava/net/DatagramSocket;
    move-object v1, v11

    .line 150
    .end local v11  # "socket":Ljava/lang/Object;
    .restart local v1  # "socket":Ljava/lang/Object;
    :cond_9f
    nop

    .end local v10  # "$i$a$-synchronized-PcapVpnService$forwardUdp$2\\1\\131\\0":I
    :try_start_a0
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_a2
    .catchall {:try_start_a0 .. :try_end_a2} :catchall_c2

    .line 131
    monitor-exit v9

    .line 153
    :cond_a3
    nop

    .line 154
    :try_start_a4
    move-object v0, v1

    check-cast v0, Ljava/net/DatagramSocket;

    new-instance v4, Ljava/net/DatagramPacket;

    array-length v5, v8

    invoke-direct {v4, v8, v5}, Ljava/net/DatagramPacket;-><init>([BI)V

    invoke-virtual {v0, v4}, Ljava/net/DatagramSocket;->send(Ljava/net/DatagramPacket;)V
    :try_end_b0
    .catch Ljava/lang/Exception; {:try_start_a4 .. :try_end_b0} :catch_b1

    goto :goto_b7

    .line 155
    :catch_b1
    move-exception v0

    .line 156
    .local v0, "e":Ljava/lang/Exception;
    iget-object v4, p0, Lcom/example/myapplication/PcapVpnService;->udpSockets:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v4, v3}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 158
    .end local v0  # "e":Ljava/lang/Exception;
    :goto_b7
    return-void

    .line 131
    .end local v1  # "socket":Ljava/lang/Object;
    .restart local v11  # "socket":Ljava/lang/Object;
    :catchall_b8
    move-exception v0

    move-object v1, v11

    goto :goto_c3

    .line 146
    .restart local v10  # "$i$a$-synchronized-PcapVpnService$forwardUdp$2\\1\\131\\0":I
    :catch_bb
    move-exception v0

    move-object v1, v11

    goto :goto_bf

    .end local v11  # "socket":Ljava/lang/Object;
    .restart local v1  # "socket":Ljava/lang/Object;
    :catch_be
    move-exception v0

    .line 147
    .local v0, "e\\1":Ljava/lang/Exception;
    :goto_bf
    nop

    .end local v0  # "e\\1":Ljava/lang/Exception;
    .end local v10  # "$i$a$-synchronized-PcapVpnService$forwardUdp$2\\1\\131\\0":I
    monitor-exit v9

    return-void

    .line 131
    :catchall_c2
    move-exception v0

    :goto_c3
    monitor-exit v9

    throw v0
.end method

.method private static final forwardUdp$lambda$2(Ljava/lang/String;)Ljava/lang/Object;
    .registers 2
    .param p0, "it"  # Ljava/lang/String;

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 126
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0
.end method

.method private static final forwardUdp$lambda$3(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3
    .param p0, "$tmp0"  # Lkotlin/jvm/functions/Function1;
    .param p1, "p0"  # Ljava/lang/Object;

    .line 126
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method private static final forwardUdp$lambda$5$lambda$4(Lcom/example/myapplication/PcapVpnService;Ljava/net/DatagramSocket;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;I)V
    .registers 7
    .param p0, "this$0"  # Lcom/example/myapplication/PcapVpnService;
    .param p1, "$newSocket"  # Ljava/net/DatagramSocket;
    .param p2, "$connectionId"  # Ljava/lang/String;
    .param p3, "$srcIp"  # Ljava/lang/String;
    .param p4, "$srcPort"  # I
    .param p5, "$destIp"  # Ljava/lang/String;
    .param p6, "$destPort"  # I

    .line 144
    invoke-direct/range {p0 .. p6}, Lcom/example/myapplication/PcapVpnService;->listenForResponse(Ljava/net/DatagramSocket;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;I)V

    .line 145
    return-void
.end method

.method private final listenForResponse(Ljava/net/DatagramSocket;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;I)V
    .registers 16
    .param p1, "socket"  # Ljava/net/DatagramSocket;
    .param p2, "id"  # Ljava/lang/String;
    .param p3, "appIp"  # Ljava/lang/String;
    .param p4, "appPort"  # I
    .param p5, "remoteIp"  # Ljava/lang/String;
    .param p6, "remotePort"  # I

    .line 161
    const/16 v0, 0x4000

    new-array v7, v0, [B

    .line 162
    .local v7, "buffer":[B
    new-instance v0, Ljava/net/DatagramPacket;

    array-length v1, v7

    invoke-direct {v0, v7, v1}, Ljava/net/DatagramPacket;-><init>([BI)V

    move-object v8, v0

    .line 164
    .local v8, "packet":Ljava/net/DatagramPacket;
    nop

    .line 165
    :cond_c
    :goto_c
    :try_start_c
    invoke-virtual {p1}, Ljava/net/DatagramSocket;->isClosed()Z

    move-result v0

    if-nez v0, :cond_60

    .line 166
    invoke-virtual {p1, v8}, Ljava/net/DatagramSocket;->receive(Ljava/net/DatagramPacket;)V

    .line 167
    invoke-virtual {v8}, Ljava/net/DatagramPacket;->getLength()I

    move-result v0

    if-lez v0, :cond_c

    .line 168
    invoke-virtual {v8}, Ljava/net/DatagramPacket;->getData()[B

    move-result-object v0

    const-string v1, "getData(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v8}, Ljava/net/DatagramPacket;->getLength()I

    move-result v1

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v6

    const-string v0, "copyOf(...)"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 169
    .local v6, "data":[B
    move-object v1, p0

    move-object v4, p3

    move v5, p4

    move-object v2, p5

    move v3, p6

    invoke-direct/range {v1 .. v6}, Lcom/example/myapplication/PcapVpnService;->buildUdpPacket(Ljava/lang/String;ILjava/lang/String;I[B)[B

    move-result-object v0

    move-object v2, v0

    .line 170
    .local v2, "vpnPacket":[B
    iget-object v0, p0, Lcom/example/myapplication/PcapVpnService;->vpnOutput:Ljava/io/FileOutputStream;

    const/4 v3, 0x0

    if-nez v0, :cond_47

    const-string v0, "vpnOutput"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v4, v3

    goto :goto_48

    :cond_47
    move-object v4, v0

    :goto_48
    monitor-enter v4
    :try_end_49
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_49} :catch_78
    .catchall {:try_start_c .. :try_end_49} :catchall_6b

    const/4 v0, 0x0

    .line 171
    .local v0, "$i$a$-synchronized-PcapVpnService$listenForResponse$1\\1\\170\\0":I
    :try_start_4a
    iget-object v5, p0, Lcom/example/myapplication/PcapVpnService;->vpnOutput:Ljava/io/FileOutputStream;

    if-nez v5, :cond_54

    const-string v5, "vpnOutput"

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_55

    :cond_54
    move-object v3, v5

    :goto_55
    invoke-virtual {v3, v2}, Ljava/io/FileOutputStream;->write([B)V

    .line 172
    nop

    .end local v0  # "$i$a$-synchronized-PcapVpnService$listenForResponse$1\\1\\170\\0":I
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_5b
    .catchall {:try_start_4a .. :try_end_5b} :catchall_5d

    .line 170
    :try_start_5b
    monitor-exit v4

    goto :goto_c

    :catchall_5d
    move-exception v0

    monitor-exit v4

    .end local v7  # "buffer":[B
    .end local v8  # "packet":Ljava/net/DatagramPacket;
    .end local p1  # "socket":Ljava/net/DatagramSocket;
    .end local p2  # "id":Ljava/lang/String;
    .end local p3  # "appIp":Ljava/lang/String;
    .end local p4  # "appPort":I
    .end local p5  # "remoteIp":Ljava/lang/String;
    .end local p6  # "remotePort":I
    throw v0
    :try_end_60
    .catch Ljava/lang/Exception; {:try_start_5b .. :try_end_60} :catch_78
    .catchall {:try_start_5b .. :try_end_60} :catchall_6b

    .line 177
    .end local v2  # "vpnPacket":[B
    .end local v6  # "data":[B
    .restart local v7  # "buffer":[B
    .restart local v8  # "packet":Ljava/net/DatagramPacket;
    .restart local p1  # "socket":Ljava/net/DatagramSocket;
    .restart local p2  # "id":Ljava/lang/String;
    .restart local p3  # "appIp":Ljava/lang/String;
    .restart local p4  # "appPort":I
    .restart local p5  # "remoteIp":Ljava/lang/String;
    .restart local p6  # "remotePort":I
    :cond_60
    iget-object v0, p0, Lcom/example/myapplication/PcapVpnService;->udpSockets:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p2}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 178
    :try_start_65
    invoke-virtual {p1}, Ljava/net/DatagramSocket;->close()V
    :try_end_68
    .catch Ljava/lang/Exception; {:try_start_65 .. :try_end_68} :catch_69

    goto :goto_83

    :catch_69
    move-exception v0

    goto :goto_83

    .line 177
    :catchall_6b
    move-exception v0

    move-object v2, v0

    iget-object v0, p0, Lcom/example/myapplication/PcapVpnService;->udpSockets:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p2}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 178
    :try_start_72
    invoke-virtual {p1}, Ljava/net/DatagramSocket;->close()V
    :try_end_75
    .catch Ljava/lang/Exception; {:try_start_72 .. :try_end_75} :catch_76

    goto :goto_77

    :catch_76
    move-exception v0

    :goto_77
    throw v2

    .line 175
    :catch_78
    move-exception v0

    .line 177
    iget-object v0, p0, Lcom/example/myapplication/PcapVpnService;->udpSockets:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p2}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 178
    :try_start_7e
    invoke-virtual {p1}, Ljava/net/DatagramSocket;->close()V
    :try_end_81
    .catch Ljava/lang/Exception; {:try_start_7e .. :try_end_81} :catch_82

    goto :goto_83

    :catch_82
    move-exception v0

    .line 179
    :goto_83
    nop

    .line 180
    return-void
.end method

.method private static final onStartCommand$lambda$0(Lcom/example/myapplication/PcapVpnService;)V
    .registers 1
    .param p0, "this$0"  # Lcom/example/myapplication/PcapVpnService;

    .line 36
    invoke-direct {p0}, Lcom/example/myapplication/PcapVpnService;->runVpn()V

    return-void
.end method

.method private final processPacket(Ljava/nio/ByteBuffer;)V
    .registers 22
    .param p1, "packet"  # Ljava/nio/ByteBuffer;

    .line 72
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    const-string v1, "array(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->limit()I

    move-result v1

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    const-string v1, "copyOf(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    .local v0, "rawData":[B
    array-length v1, v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez v1, :cond_1d

    move v1, v2

    goto :goto_1e

    :cond_1d
    move v1, v3

    :goto_1e
    if-eqz v1, :cond_21

    return-void

    .line 75
    :cond_21
    aget-byte v1, v0, v3

    const/4 v4, 0x4

    shr-int/2addr v1, v4

    .line 76
    .local v1, "ipVersion":I
    if-eq v1, v4, :cond_28

    return-void

    .line 78
    :cond_28
    aget-byte v5, v0, v3

    const/16 v6, 0xf

    and-int/2addr v5, v6

    mul-int/2addr v5, v4

    .line 79
    .local v5, "headerLength":I
    const/16 v4, 0x9

    aget-byte v4, v0, v4

    and-int/lit16 v4, v4, 0xff

    .line 81
    .local v4, "protocol":I
    const/16 v7, 0x11

    if-eq v4, v7, :cond_39

    return-void

    .line 83
    :cond_39
    move v8, v5

    .line 84
    .local v8, "udpHeaderOffset":I
    array-length v9, v0

    add-int/lit8 v10, v8, 0x8

    if-ge v9, v10, :cond_40

    return-void

    .line 86
    :cond_40
    const/16 v9, 0xc

    aget-byte v9, v0, v9

    and-int/lit16 v9, v9, 0xff

    .line 87
    const/16 v10, 0xd

    aget-byte v10, v0, v10

    and-int/lit16 v10, v10, 0xff

    .line 88
    const/16 v11, 0xe

    aget-byte v11, v0, v11

    and-int/lit16 v11, v11, 0xff

    .line 89
    aget-byte v6, v0, v6

    and-int/lit16 v6, v6, 0xff

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v9

    const-string v12, "."

    invoke-virtual {v9, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 86
    move-object v14, v6

    .line 91
    .local v14, "srcIp":Ljava/lang/String;
    const/16 v6, 0x10

    aget-byte v6, v0, v6

    and-int/lit16 v6, v6, 0xff

    .line 92
    aget-byte v7, v0, v7

    and-int/lit16 v7, v7, 0xff

    .line 93
    const/16 v9, 0x12

    aget-byte v9, v0, v9

    and-int/lit16 v9, v9, 0xff

    .line 94
    const/16 v10, 0x13

    aget-byte v10, v0, v10

    and-int/lit16 v10, v10, 0xff

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v16

    .line 91
    move-object/from16 v6, v16

    .line 96
    .local v6, "destIp":Ljava/lang/String;
    aget-byte v7, v0, v8

    and-int/lit16 v7, v7, 0xff

    shl-int/lit8 v7, v7, 0x8

    .line 97
    add-int/lit8 v9, v8, 0x1

    aget-byte v9, v0, v9

    and-int/lit16 v9, v9, 0xff

    .line 96
    or-int v15, v7, v9

    .line 99
    .local v15, "srcPort":I
    add-int/lit8 v7, v8, 0x2

    aget-byte v7, v0, v7

    and-int/lit16 v7, v7, 0xff

    shl-int/lit8 v7, v7, 0x8

    .line 100
    add-int/lit8 v9, v8, 0x3

    aget-byte v9, v0, v9

    and-int/lit16 v9, v9, 0xff

    .line 99
    or-int/2addr v7, v9

    .line 102
    .local v7, "destPort":I
    add-int/lit8 v9, v8, 0x4

    aget-byte v9, v0, v9

    and-int/lit16 v9, v9, 0xff

    shl-int/lit8 v9, v9, 0x8

    .line 103
    add-int/lit8 v10, v8, 0x5

    aget-byte v10, v0, v10

    and-int/lit16 v10, v10, 0xff

    .line 102
    or-int/2addr v9, v10

    .line 105
    .local v9, "length":I
    add-int/lit8 v10, v9, -0x8

    .line 106
    .local v10, "udpDataLength":I
    if-ltz v10, :cond_160

    array-length v11, v0

    add-int/lit8 v12, v8, 0x8

    add-int/2addr v12, v10

    if-ge v11, v12, :cond_f9

    move-object/from16 v19, v0

    move-object/from16 v16, v6

    move/from16 v17, v7

    goto/16 :goto_166

    .line 108
    :cond_f9
    new-array v11, v10, [B

    .line 109
    .local v11, "payload":[B
    add-int/lit8 v12, v8, 0x8

    invoke-static {v0, v12, v11, v3, v10}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 111
    const/16 v12, 0x2710

    if-gt v12, v7, :cond_109

    const/high16 v12, 0x10000

    if-ge v7, v12, :cond_109

    goto :goto_10a

    :cond_109
    move v2, v3

    .line 113
    .local v2, "isFiveDigitPort":Z
    :goto_10a
    const-string v12, "35.217."

    const/4 v13, 0x2

    move-object/from16 v19, v0

    .end local v0  # "rawData":[B
    .local v19, "rawData":[B
    const/4 v0, 0x0

    invoke-static {v6, v12, v3, v13, v0}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_122

    const-string v12, "34.88."

    invoke-static {v6, v12, v3, v13, v0}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_11f

    goto :goto_122

    :cond_11f
    move-object/from16 v13, p0

    goto :goto_156

    :cond_122
    :goto_122
    if-eqz v2, :cond_154

    .line 114
    new-instance v0, Landroid/content/Intent;

    const-string v3, "com.example.myapplication.IP_FOUND"

    invoke-direct {v0, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 115
    .local v0, "intent":Landroid/content/Intent;
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v12, ":"

    invoke-virtual {v3, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v12, "EXTRA_IP_DATA"

    invoke-virtual {v0, v12, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 116
    invoke-virtual/range {p0 .. p0}, Lcom/example/myapplication/PcapVpnService;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 117
    move-object/from16 v13, p0

    invoke-virtual {v13, v0}, Lcom/example/myapplication/PcapVpnService;->sendBroadcast(Landroid/content/Intent;)V

    goto :goto_156

    .line 113
    .end local v0  # "intent":Landroid/content/Intent;
    :cond_154
    move-object/from16 v13, p0

    .line 120
    :goto_156
    move-object/from16 v16, v6

    move/from16 v17, v7

    move-object/from16 v18, v11

    .end local v6  # "destIp":Ljava/lang/String;
    .end local v7  # "destPort":I
    .end local v11  # "payload":[B
    .local v16, "destIp":Ljava/lang/String;
    .local v17, "destPort":I
    .local v18, "payload":[B
    invoke-direct/range {v13 .. v18}, Lcom/example/myapplication/PcapVpnService;->forwardUdp(Ljava/lang/String;ILjava/lang/String;I[B)V

    .line 121
    return-void

    .line 106
    .end local v2  # "isFiveDigitPort":Z
    .end local v16  # "destIp":Ljava/lang/String;
    .end local v17  # "destPort":I
    .end local v18  # "payload":[B
    .end local v19  # "rawData":[B
    .local v0, "rawData":[B
    .restart local v6  # "destIp":Ljava/lang/String;
    .restart local v7  # "destPort":I
    :cond_160
    move-object/from16 v19, v0

    move-object/from16 v16, v6

    move/from16 v17, v7

    .end local v0  # "rawData":[B
    .end local v6  # "destIp":Ljava/lang/String;
    .end local v7  # "destPort":I
    .restart local v16  # "destIp":Ljava/lang/String;
    .restart local v17  # "destPort":I
    .restart local v19  # "rawData":[B
    :goto_166
    return-void
.end method

.method private final runVpn()V
    .registers 6

    .line 43
    nop

    .line 44
    :try_start_1
    invoke-direct {p0}, Lcom/example/myapplication/PcapVpnService;->establishVpn()Landroid/os/ParcelFileDescriptor;

    move-result-object v0
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_5} :catch_70
    .catchall {:try_start_1 .. :try_end_5} :catchall_6e

    if-nez v0, :cond_b

    .line 67
    invoke-direct {p0}, Lcom/example/myapplication/PcapVpnService;->closeVpn()V

    .line 44
    return-void

    :cond_b
    :try_start_b
    iput-object v0, p0, Lcom/example/myapplication/PcapVpnService;->vpnInterface:Landroid/os/ParcelFileDescriptor;

    .line 45
    new-instance v0, Ljava/io/FileInputStream;

    iget-object v1, p0, Lcom/example/myapplication/PcapVpnService;->vpnInterface:Landroid/os/ParcelFileDescriptor;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v1}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/FileInputStream;-><init>(Ljava/io/FileDescriptor;)V

    iput-object v0, p0, Lcom/example/myapplication/PcapVpnService;->vpnInput:Ljava/io/FileInputStream;

    .line 46
    new-instance v0, Ljava/io/FileOutputStream;

    iget-object v1, p0, Lcom/example/myapplication/PcapVpnService;->vpnInterface:Landroid/os/ParcelFileDescriptor;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v1}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/FileDescriptor;)V

    iput-object v0, p0, Lcom/example/myapplication/PcapVpnService;->vpnOutput:Ljava/io/FileOutputStream;

    .line 48
    const/16 v0, 0x4000

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 50
    .local v0, "packetBuffer":Ljava/nio/ByteBuffer;
    :cond_33
    :goto_33
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    move-result v1

    if-nez v1, :cond_6d

    .line 51
    iget-object v1, p0, Lcom/example/myapplication/PcapVpnService;->vpnInput:Ljava/io/FileInputStream;

    if-nez v1, :cond_43

    const-string v1, "vpnInput"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v1, 0x0

    :cond_43
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/io/FileInputStream;->read([B)I

    move-result v1

    .line 52
    .local v1, "bytesRead":I
    if-lez v1, :cond_33

    .line 53
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 54
    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v2

    .line 55
    .local v2, "packetCopy":Ljava/nio/ByteBuffer;
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4, v1}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    .line 56
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 58
    iget-object v3, p0, Lcom/example/myapplication/PcapVpnService;->executorService:Ljava/util/concurrent/ExecutorService;

    new-instance v4, Lcom/example/myapplication/PcapVpnService$$ExternalSyntheticLambda3;

    invoke-direct {v4, p0, v2}, Lcom/example/myapplication/PcapVpnService$$ExternalSyntheticLambda3;-><init>(Lcom/example/myapplication/PcapVpnService;Ljava/nio/ByteBuffer;)V

    invoke-interface {v3, v4}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 61
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;
    :try_end_6c
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_6c} :catch_70
    .catchall {:try_start_b .. :try_end_6c} :catchall_6e

    .end local v2  # "packetCopy":Ljava/nio/ByteBuffer;
    goto :goto_33

    .line 50
    .end local v0  # "packetBuffer":Ljava/nio/ByteBuffer;
    .end local v1  # "bytesRead":I
    :cond_6d
    goto :goto_74

    .line 67
    :catchall_6e
    move-exception v0

    goto :goto_79

    .line 64
    :catch_70
    move-exception v0

    .line 65
    .local v0, "e":Ljava/lang/Exception;
    :try_start_71
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_74
    .catchall {:try_start_71 .. :try_end_74} :catchall_6e

    .line 67
    .end local v0  # "e":Ljava/lang/Exception;
    :goto_74
    invoke-direct {p0}, Lcom/example/myapplication/PcapVpnService;->closeVpn()V

    .line 68
    nop

    .line 69
    return-void

    .line 67
    :goto_79
    invoke-direct {p0}, Lcom/example/myapplication/PcapVpnService;->closeVpn()V

    throw v0
.end method

.method private static final runVpn$lambda$1(Lcom/example/myapplication/PcapVpnService;Ljava/nio/ByteBuffer;)V
    .registers 2
    .param p0, "this$0"  # Lcom/example/myapplication/PcapVpnService;
    .param p1, "$packetCopy"  # Ljava/nio/ByteBuffer;

    .line 59
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-direct {p0, p1}, Lcom/example/myapplication/PcapVpnService;->processPacket(Ljava/nio/ByteBuffer;)V

    .line 60
    return-void
.end method


# virtual methods
.method public onDestroy()V
    .registers 1

    .line 268
    invoke-direct {p0}, Lcom/example/myapplication/PcapVpnService;->closeVpn()V

    .line 269
    invoke-super {p0}, Landroid/net/VpnService;->onDestroy()V

    .line 270
    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .registers 6
    .param p1, "intent"  # Landroid/content/Intent;
    .param p2, "flags"  # I
    .param p3, "startId"  # I

    .line 31
    if-eqz p1, :cond_7

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    goto :goto_8

    :cond_7
    const/4 v0, 0x0

    :goto_8
    const-string v1, "STOP"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_15

    .line 32
    invoke-virtual {p0}, Lcom/example/myapplication/PcapVpnService;->stopSelf()V

    .line 33
    const/4 v0, 0x2

    return v0

    .line 35
    :cond_15
    iget-object v0, p0, Lcom/example/myapplication/PcapVpnService;->vpnThread:Ljava/lang/Thread;

    if-eqz v0, :cond_24

    iget-object v0, p0, Lcom/example/myapplication/PcapVpnService;->vpnThread:Ljava/lang/Thread;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->isAlive()Z

    move-result v0

    if-nez v0, :cond_38

    .line 36
    :cond_24
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/example/myapplication/PcapVpnService$$ExternalSyntheticLambda4;

    invoke-direct {v1, p0}, Lcom/example/myapplication/PcapVpnService$$ExternalSyntheticLambda4;-><init>(Lcom/example/myapplication/PcapVpnService;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    iput-object v0, p0, Lcom/example/myapplication/PcapVpnService;->vpnThread:Ljava/lang/Thread;

    .line 37
    iget-object v0, p0, Lcom/example/myapplication/PcapVpnService;->vpnThread:Ljava/lang/Thread;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 39
    :cond_38
    const/4 v0, 0x1

    return v0
.end method
