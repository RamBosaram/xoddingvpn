.class public final Lcom/example/myapplication/ActivationActivity;
.super Landroidx/appcompat/app/AppCompatActivity;
.source "ActivationActivity.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\b\u0010\u0014\u001a\u00020\rH\u0002J\b\u0010\u0015\u001a\u00020\rH\u0002J\u0010\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\rH\u0002J\b\u0010\u001b\u001a\u00020\rH\u0002J\u0010\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\rH\u0002J\u0010\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u0018H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0082D¢\u0006\u0002\n\u0000¨\u0006 "
    }
    d2 = {
        "Lcom/example/myapplication/ActivationActivity;",
        "Landroidx/appcompat/app/AppCompatActivity;",
        "<init>",
        "()V",
        "keyEditText",
        "Landroid/widget/EditText;",
        "activateButton",
        "Landroidx/appcompat/widget/AppCompatButton;",
        "statusTextView",
        "Landroid/widget/TextView;",
        "prefs",
        "Landroid/content/SharedPreferences;",
        "VPS_URL",
        "",
        "APP_VERSION",
        "SECRET_KEY",
        "onCreate",
        "",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "generateDeviceHash",
        "getUniqueDeviceId",
        "setInputsEnabled",
        "enabled",
        "",
        "generateSignature",
        "data",
        "generateNonce",
        "activateKey",
        "key",
        "checkSubscription",
        "isAutoCheck",
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


# instance fields
.field private final APP_VERSION:Ljava/lang/String;

.field private final SECRET_KEY:Ljava/lang/String;

.field private final VPS_URL:Ljava/lang/String;

.field private activateButton:Landroidx/appcompat/widget/AppCompatButton;

.field private keyEditText:Landroid/widget/EditText;

.field private prefs:Landroid/content/SharedPreferences;

.field private statusTextView:Landroid/widget/TextView;


# direct methods
.method public static synthetic $r8$lambda$8bylyLJLyCdeG-SchGLVVw0x6Ss(B)Ljava/lang/CharSequence;
    .registers 1

    invoke-static {p0}, Lcom/example/myapplication/ActivationActivity;->generateDeviceHash$lambda$1(B)Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$OepbPYQ38GWSBvv9QBQkG4nYr_4(B)Ljava/lang/CharSequence;
    .registers 1

    invoke-static {p0}, Lcom/example/myapplication/ActivationActivity;->generateSignature$lambda$2(B)Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$xUlVuLrkyBNzwonZld1KoTIgoTM(Lcom/example/myapplication/ActivationActivity;Landroid/view/View;)V
    .registers 2

    invoke-static {p0, p1}, Lcom/example/myapplication/ActivationActivity;->onCreate$lambda$0(Lcom/example/myapplication/ActivationActivity;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>()V
    .registers 2

    .line 30
    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    .line 36
    const-string v0, "http://62.60.217.131:1488"

    iput-object v0, p0, Lcom/example/myapplication/ActivationActivity;->VPS_URL:Ljava/lang/String;

    .line 37
    const-string v0, "3.0"

    iput-object v0, p0, Lcom/example/myapplication/ActivationActivity;->APP_VERSION:Ljava/lang/String;

    .line 38
    const-string v0, "f7d8e9c0b1a2d3e4f5g6h7i8j9k0l1m2n3o4p5q6r7s8t9u0v1w2x3y4z5"

    iput-object v0, p0, Lcom/example/myapplication/ActivationActivity;->SECRET_KEY:Ljava/lang/String;

    .line 30
    return-void
.end method

.method public static final synthetic access$generateDeviceHash(Lcom/example/myapplication/ActivationActivity;)Ljava/lang/String;
    .registers 2
    .param p0, "$this"  # Lcom/example/myapplication/ActivationActivity;

    .line 30
    invoke-direct {p0}, Lcom/example/myapplication/ActivationActivity;->generateDeviceHash()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$generateNonce(Lcom/example/myapplication/ActivationActivity;)Ljava/lang/String;
    .registers 2
    .param p0, "$this"  # Lcom/example/myapplication/ActivationActivity;

    .line 30
    invoke-direct {p0}, Lcom/example/myapplication/ActivationActivity;->generateNonce()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$generateSignature(Lcom/example/myapplication/ActivationActivity;Ljava/lang/String;)Ljava/lang/String;
    .registers 3
    .param p0, "$this"  # Lcom/example/myapplication/ActivationActivity;
    .param p1, "data"  # Ljava/lang/String;

    .line 30
    invoke-direct {p0, p1}, Lcom/example/myapplication/ActivationActivity;->generateSignature(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$getAPP_VERSION$p(Lcom/example/myapplication/ActivationActivity;)Ljava/lang/String;
    .registers 2
    .param p0, "$this"  # Lcom/example/myapplication/ActivationActivity;

    .line 30
    iget-object v0, p0, Lcom/example/myapplication/ActivationActivity;->APP_VERSION:Ljava/lang/String;

    return-object v0
.end method

.method public static final synthetic access$getPrefs$p(Lcom/example/myapplication/ActivationActivity;)Landroid/content/SharedPreferences;
    .registers 2
    .param p0, "$this"  # Lcom/example/myapplication/ActivationActivity;

    .line 30
    iget-object v0, p0, Lcom/example/myapplication/ActivationActivity;->prefs:Landroid/content/SharedPreferences;

    return-object v0
.end method

.method public static final synthetic access$getStatusTextView$p(Lcom/example/myapplication/ActivationActivity;)Landroid/widget/TextView;
    .registers 2
    .param p0, "$this"  # Lcom/example/myapplication/ActivationActivity;

    .line 30
    iget-object v0, p0, Lcom/example/myapplication/ActivationActivity;->statusTextView:Landroid/widget/TextView;

    return-object v0
.end method

.method public static final synthetic access$getUniqueDeviceId(Lcom/example/myapplication/ActivationActivity;)Ljava/lang/String;
    .registers 2
    .param p0, "$this"  # Lcom/example/myapplication/ActivationActivity;

    .line 30
    invoke-direct {p0}, Lcom/example/myapplication/ActivationActivity;->getUniqueDeviceId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$getVPS_URL$p(Lcom/example/myapplication/ActivationActivity;)Ljava/lang/String;
    .registers 2
    .param p0, "$this"  # Lcom/example/myapplication/ActivationActivity;

    .line 30
    iget-object v0, p0, Lcom/example/myapplication/ActivationActivity;->VPS_URL:Ljava/lang/String;

    return-object v0
.end method

.method public static final synthetic access$setInputsEnabled(Lcom/example/myapplication/ActivationActivity;Z)V
    .registers 2
    .param p0, "$this"  # Lcom/example/myapplication/ActivationActivity;
    .param p1, "enabled"  # Z

    .line 30
    invoke-direct {p0, p1}, Lcom/example/myapplication/ActivationActivity;->setInputsEnabled(Z)V

    return-void
.end method

.method private final activateKey(Ljava/lang/String;)V
    .registers 11
    .param p1, "key"  # Ljava/lang/String;

    .line 118
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/example/myapplication/ActivationActivity;->setInputsEnabled(Z)V

    .line 119
    iget-object v0, p0, Lcom/example/myapplication/ActivationActivity;->statusTextView:Landroid/widget/TextView;

    const-string v1, "statusTextView"

    const/4 v2, 0x0

    if-nez v0, :cond_f

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v2

    :cond_f
    const-string v3, "Checking..."

    check-cast v3, Ljava/lang/CharSequence;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 120
    iget-object v0, p0, Lcom/example/myapplication/ActivationActivity;->statusTextView:Landroid/widget/TextView;

    if-nez v0, :cond_1e

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v2

    :cond_1e
    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 122
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v0

    check-cast v0, Lkotlin/coroutines/CoroutineContext;

    invoke-static {v0}, Lkotlinx/coroutines/CoroutineScopeKt;->CoroutineScope(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v3

    new-instance v0, Lcom/example/myapplication/ActivationActivity$activateKey$1;

    invoke-direct {v0, p0, p1, v2}, Lcom/example/myapplication/ActivationActivity$activateKey$1;-><init>(Lcom/example/myapplication/ActivationActivity;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    move-object v6, v0

    check-cast v6, Lkotlin/jvm/functions/Function2;

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v3 .. v8}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 200
    return-void
.end method

.method private final checkSubscription(Z)V
    .registers 10
    .param p1, "isAutoCheck"  # Z

    .line 203
    const/4 v0, 0x0

    if-eqz p1, :cond_22

    .line 204
    iget-object v1, p0, Lcom/example/myapplication/ActivationActivity;->statusTextView:Landroid/widget/TextView;

    const-string v2, "statusTextView"

    if-nez v1, :cond_d

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v1, v0

    :cond_d
    const-string v3, "Connecting..."

    check-cast v3, Ljava/lang/CharSequence;

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 205
    iget-object v1, p0, Lcom/example/myapplication/ActivationActivity;->statusTextView:Landroid/widget/TextView;

    if-nez v1, :cond_1c

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v1, v0

    :cond_1c
    const v2, -0x7f7f80

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 208
    :cond_22
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v1

    check-cast v1, Lkotlin/coroutines/CoroutineContext;

    invoke-static {v1}, Lkotlinx/coroutines/CoroutineScopeKt;->CoroutineScope(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v2

    new-instance v1, Lcom/example/myapplication/ActivationActivity$checkSubscription$1;

    invoke-direct {v1, p0, p1, v0}, Lcom/example/myapplication/ActivationActivity$checkSubscription$1;-><init>(Lcom/example/myapplication/ActivationActivity;ZLkotlin/coroutines/Continuation;)V

    move-object v5, v1

    check-cast v5, Lkotlin/jvm/functions/Function2;

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 284
    return-void
.end method

.method private final generateDeviceHash()Ljava/lang/String;
    .registers 32

    .line 67
    invoke-virtual/range {p0 .. p0}, Lcom/example/myapplication/ActivationActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "android_id"

    invoke-static {v0, v1}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_e

    const-string v0, "unknown"

    .line 68
    .local v0, "deviceId":Ljava/lang/String;
    :cond_e
    sget-object v1, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 69
    .local v1, "manufacturer":Ljava/lang/String;
    sget-object v2, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 70
    .local v2, "model":Ljava/lang/String;
    sget-object v3, Landroid/os/Build;->SERIAL:Ljava/lang/String;

    .line 71
    .local v3, "serial":Ljava/lang/String;
    sget-object v4, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    .line 72
    .local v4, "fingerprint":Ljava/lang/String;
    sget-object v5, Landroid/os/Build;->BOARD:Ljava/lang/String;

    .line 73
    .local v5, "board":Ljava/lang/String;
    sget-object v6, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 74
    .local v6, "brand":Ljava/lang/String;
    sget-object v7, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    .line 75
    .local v7, "device":Ljava/lang/String;
    sget-object v8, Landroid/os/Build;->DISPLAY:Ljava/lang/String;

    .line 76
    .local v8, "display":Ljava/lang/String;
    sget-object v9, Landroid/os/Build;->HOST:Ljava/lang/String;

    .line 77
    .local v9, "host":Ljava/lang/String;
    sget-object v10, Landroid/os/Build;->ID:Ljava/lang/String;

    .line 78
    .local v10, "id":Ljava/lang/String;
    sget-object v11, Landroid/os/Build;->PRODUCT:Ljava/lang/String;

    .line 79
    .local v11, "product":Ljava/lang/String;
    sget-object v12, Landroid/os/Build;->TAGS:Ljava/lang/String;

    .line 80
    .local v12, "tags":Ljava/lang/String;
    sget-object v13, Landroid/os/Build;->TYPE:Ljava/lang/String;

    .line 81
    .local v13, "type":Ljava/lang/String;
    sget-object v14, Landroid/os/Build;->USER:Ljava/lang/String;

    .line 82
    .local v14, "user":Ljava/lang/String;
    move-object/from16 v16, v14

    .end local v14  # "user":Ljava/lang/String;
    .local v16, "user":Ljava/lang/String;
    sget-wide v14, Landroid/os/Build;->TIME:J

    .line 84
    .local v14, "time":J
    move-wide/from16 v17, v14

    .end local v14  # "time":J
    .local v17, "time":J
    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    invoke-virtual {v14, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    invoke-virtual {v14, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    invoke-virtual {v14, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    invoke-virtual {v14, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    invoke-virtual {v14, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    invoke-virtual {v14, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    invoke-virtual {v14, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    invoke-virtual {v14, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    invoke-virtual {v14, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    invoke-virtual {v14, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    invoke-virtual {v14, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    invoke-virtual {v14, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    invoke-virtual {v14, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    move-object/from16 v15, v16

    .end local v16  # "user":Ljava/lang/String;
    .local v15, "user":Ljava/lang/String;
    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    move-object/from16 v16, v0

    move-object/from16 v19, v1

    move-wide/from16 v0, v17

    .end local v1  # "manufacturer":Ljava/lang/String;
    .end local v17  # "time":J
    .local v0, "time":J
    .local v16, "deviceId":Ljava/lang/String;
    .local v19, "manufacturer":Ljava/lang/String;
    invoke-virtual {v14, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v14

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    .line 85
    .local v14, "data":Ljava/lang/String;
    const-string v17, "SHA-256"

    move-wide/from16 v20, v0

    .end local v0  # "time":J
    .local v20, "time":J
    invoke-static/range {v17 .. v17}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v0

    .line 86
    .local v0, "md":Ljava/security/MessageDigest;
    sget-object v1, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v14, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v1

    move-object/from16 v17, v2

    .end local v2  # "model":Ljava/lang/String;
    .local v17, "model":Ljava/lang/String;
    const-string v2, "getBytes(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object v22

    .line 87
    .local v22, "bytes":[B
    invoke-static/range {v22 .. v22}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const-string v1, ""

    move-object/from16 v23, v1

    check-cast v23, Ljava/lang/CharSequence;

    new-instance v28, Lcom/example/myapplication/ActivationActivity$$ExternalSyntheticLambda2;

    invoke-direct/range {v28 .. v28}, Lcom/example/myapplication/ActivationActivity$$ExternalSyntheticLambda2;-><init>()V

    const/16 v29, 0x1e

    const/16 v30, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    invoke-static/range {v22 .. v30}, Lkotlin/collections/ArraysKt;->joinToString$default([BLjava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    return-object v1
.end method

.method private static final generateDeviceHash$lambda$1(B)Ljava/lang/CharSequence;
    .registers 3
    .param p0, "it"  # B

    .line 87
    invoke-static {p0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    const-string v1, "%02x"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "format(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/CharSequence;

    return-object v0
.end method

.method private final generateNonce()Ljava/lang/String;
    .registers 3

    .line 114
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "toString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method private final generateSignature(Ljava/lang/String;)Ljava/lang/String;
    .registers 15
    .param p1, "data"  # Ljava/lang/String;

    .line 106
    new-instance v0, Ljavax/crypto/spec/SecretKeySpec;

    iget-object v1, p0, Lcom/example/myapplication/ActivationActivity;->SECRET_KEY:Ljava/lang/String;

    sget-object v2, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v1, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v1

    const-string v2, "getBytes(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "HmacSHA256"

    invoke-direct {v0, v1, v3}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 107
    .local v0, "secretKeySpec":Ljavax/crypto/spec/SecretKeySpec;
    invoke-static {v3}, Ljavax/crypto/Mac;->getInstance(Ljava/lang/String;)Ljavax/crypto/Mac;

    move-result-object v1

    .line 108
    .local v1, "mac":Ljavax/crypto/Mac;
    move-object v3, v0

    check-cast v3, Ljava/security/Key;

    invoke-virtual {v1, v3}, Ljavax/crypto/Mac;->init(Ljava/security/Key;)V

    .line 109
    sget-object v3, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v3}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ljavax/crypto/Mac;->doFinal([B)[B

    move-result-object v4

    .line 110
    .local v4, "bytes":[B
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const-string v2, ""

    move-object v5, v2

    check-cast v5, Ljava/lang/CharSequence;

    new-instance v10, Lcom/example/myapplication/ActivationActivity$$ExternalSyntheticLambda0;

    invoke-direct {v10}, Lcom/example/myapplication/ActivationActivity$$ExternalSyntheticLambda0;-><init>()V

    const/16 v11, 0x1e

    const/4 v12, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v4 .. v12}, Lkotlin/collections/ArraysKt;->joinToString$default([BLjava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    return-object v2
.end method

.method private static final generateSignature$lambda$2(B)Ljava/lang/CharSequence;
    .registers 3
    .param p0, "it"  # B

    .line 110
    invoke-static {p0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    const-string v1, "%02x"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "format(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/CharSequence;

    return-object v0
.end method

.method private final getUniqueDeviceId()Ljava/lang/String;
    .registers 6

    .line 91
    iget-object v0, p0, Lcom/example/myapplication/ActivationActivity;->prefs:Landroid/content/SharedPreferences;

    const-string v1, "prefs"

    const/4 v2, 0x0

    if-nez v0, :cond_b

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v2

    :cond_b
    const-string v3, "device_id"

    invoke-interface {v0, v3, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 92
    .local v0, "deviceId":Ljava/lang/String;
    if-nez v0, :cond_2b

    .line 93
    invoke-direct {p0}, Lcom/example/myapplication/ActivationActivity;->generateDeviceHash()Ljava/lang/String;

    move-result-object v0

    .line 94
    iget-object v4, p0, Lcom/example/myapplication/ActivationActivity;->prefs:Landroid/content/SharedPreferences;

    if-nez v4, :cond_1f

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_20

    :cond_1f
    move-object v2, v4

    :goto_20
    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1, v3, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 96
    :cond_2b
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    return-object v0
.end method

.method private static final onCreate$lambda$0(Lcom/example/myapplication/ActivationActivity;Landroid/view/View;)V
    .registers 6
    .param p0, "this$0"  # Lcom/example/myapplication/ActivationActivity;
    .param p1, "it"  # Landroid/view/View;

    .line 57
    iget-object v0, p0, Lcom/example/myapplication/ActivationActivity;->keyEditText:Landroid/widget/EditText;

    if-nez v0, :cond_a

    const-string v0, "keyEditText"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_a
    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 58
    .local v0, "key":Ljava/lang/String;
    move-object v1, v0

    check-cast v1, Ljava/lang/CharSequence;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const/4 v2, 0x0

    if-lez v1, :cond_28

    const/4 v1, 0x1

    goto :goto_29

    :cond_28
    move v1, v2

    :goto_29
    if-eqz v1, :cond_2f

    .line 59
    invoke-direct {p0, v0}, Lcom/example/myapplication/ActivationActivity;->activateKey(Ljava/lang/String;)V

    goto :goto_3d

    .line 61
    :cond_2f
    move-object v1, p0

    check-cast v1, Landroid/content/Context;

    const-string v3, "Enter Key"

    check-cast v3, Ljava/lang/CharSequence;

    invoke-static {v1, v3, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    .line 63
    :goto_3d
    return-void
.end method

.method private final setInputsEnabled(Z)V
    .registers 5
    .param p1, "enabled"  # Z

    .line 100
    iget-object v0, p0, Lcom/example/myapplication/ActivationActivity;->activateButton:Landroidx/appcompat/widget/AppCompatButton;

    const-string v1, "activateButton"

    const/4 v2, 0x0

    if-nez v0, :cond_b

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v2

    :cond_b
    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/AppCompatButton;->setEnabled(Z)V

    .line 101
    iget-object v0, p0, Lcom/example/myapplication/ActivationActivity;->keyEditText:Landroid/widget/EditText;

    if-nez v0, :cond_18

    const-string v0, "keyEditText"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v2

    :cond_18
    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setEnabled(Z)V

    .line 102
    iget-object v0, p0, Lcom/example/myapplication/ActivationActivity;->activateButton:Landroidx/appcompat/widget/AppCompatButton;

    if-nez v0, :cond_23

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_24

    :cond_23
    move-object v2, v0

    :goto_24
    if-eqz p1, :cond_29

    const/high16 v0, 0x3f800000  # 1.0f

    goto :goto_2b

    :cond_29
    const/high16 v0, 0x3f000000  # 0.5f

    :goto_2b
    invoke-virtual {v2, v0}, Landroidx/appcompat/widget/AppCompatButton;->setAlpha(F)V

    .line 103
    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .registers 6
    .param p1, "savedInstanceState"  # Landroid/os/Bundle;

    .line 41
    invoke-super {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 42
    sget v0, Lcom/example/myapplication/R$layout;->activation_activity:I

    invoke-virtual {p0, v0}, Lcom/example/myapplication/ActivationActivity;->setContentView(I)V

    .line 44
    invoke-virtual {p0}, Lcom/example/myapplication/ActivationActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v1, 0x200

    invoke-virtual {v0, v1, v1}, Landroid/view/Window;->setFlags(II)V

    .line 46
    const-string v0, "app_prefs"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/example/myapplication/ActivationActivity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lcom/example/myapplication/ActivationActivity;->prefs:Landroid/content/SharedPreferences;

    .line 47
    sget v0, Lcom/example/myapplication/R$id;->keyEditText:I

    invoke-virtual {p0, v0}, Lcom/example/myapplication/ActivationActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/example/myapplication/ActivationActivity;->keyEditText:Landroid/widget/EditText;

    .line 48
    sget v0, Lcom/example/myapplication/R$id;->activateButton:I

    invoke-virtual {p0, v0}, Lcom/example/myapplication/ActivationActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/AppCompatButton;

    iput-object v0, p0, Lcom/example/myapplication/ActivationActivity;->activateButton:Landroidx/appcompat/widget/AppCompatButton;

    .line 49
    sget v0, Lcom/example/myapplication/R$id;->statusTextView:I

    invoke-virtual {p0, v0}, Lcom/example/myapplication/ActivationActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/example/myapplication/ActivationActivity;->statusTextView:Landroid/widget/TextView;

    .line 51
    iget-object v0, p0, Lcom/example/myapplication/ActivationActivity;->prefs:Landroid/content/SharedPreferences;

    const/4 v1, 0x0

    if-nez v0, :cond_43

    const-string v0, "prefs"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v1

    :cond_43
    const-string v2, "saved_key"

    const-string v3, ""

    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 52
    .local v0, "savedKey":Ljava/lang/String;
    iget-object v2, p0, Lcom/example/myapplication/ActivationActivity;->keyEditText:Landroid/widget/EditText;

    if-nez v2, :cond_55

    const-string v2, "keyEditText"

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v2, v1

    :cond_55
    move-object v3, v0

    check-cast v3, Ljava/lang/CharSequence;

    invoke-virtual {v2, v3}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 54
    const/4 v2, 0x1

    invoke-direct {p0, v2}, Lcom/example/myapplication/ActivationActivity;->checkSubscription(Z)V

    .line 56
    iget-object v2, p0, Lcom/example/myapplication/ActivationActivity;->activateButton:Landroidx/appcompat/widget/AppCompatButton;

    if-nez v2, :cond_69

    const-string v2, "activateButton"

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_6a

    :cond_69
    move-object v1, v2

    :goto_6a
    new-instance v2, Lcom/example/myapplication/ActivationActivity$$ExternalSyntheticLambda1;

    invoke-direct {v2, p0}, Lcom/example/myapplication/ActivationActivity$$ExternalSyntheticLambda1;-><init>(Lcom/example/myapplication/ActivationActivity;)V

    invoke-virtual {v1, v2}, Landroidx/appcompat/widget/AppCompatButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 64
    return-void
.end method
