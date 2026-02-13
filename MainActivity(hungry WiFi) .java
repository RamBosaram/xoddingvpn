.class public final Lcom/example/myapplication/MainActivity;
.super Landroidx/appcompat/app/AppCompatActivity;
.source "MainActivity.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\b\u0010\u0013\u001a\u00020\u0010H\u0002J\b\u0010\u0014\u001a\u00020\u0010H\u0002J\b\u0010\u0015\u001a\u00020\u0010H\u0002J\b\u0010\u0016\u001a\u00020\u0010H\u0002J\b\u0010\u0017\u001a\u00020\u0010H\u0002J\b\u0010\u0018\u001a\u00020\u0010H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\f0\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\f0\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"
    }
    d2 = {
        "Lcom/example/myapplication/MainActivity;",
        "Landroidx/appcompat/app/AppCompatActivity;",
        "<init>",
        "()V",
        "startButton",
        "Landroidx/appcompat/widget/AppCompatButton;",
        "capturedIpTextView",
        "Landroid/widget/TextView;",
        "isVpnRunning",
        "",
        "vpnPrepareLauncher",
        "Landroidx/activity/result/ActivityResultLauncher;",
        "Landroid/content/Intent;",
        "kotlin.jvm.PlatformType",
        "overlayPermissionLauncher",
        "onCreate",
        "",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "handleVpnStart",
        "requestOverlayPermission",
        "updateButtonState",
        "requestVpnPermission",
        "startVpnServices",
        "stopVpnServices",
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
.field private capturedIpTextView:Landroid/widget/TextView;

.field private isVpnRunning:Z

.field private final overlayPermissionLauncher:Landroidx/activity/result/ActivityResultLauncher;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/activity/result/ActivityResultLauncher<",
            "Landroid/content/Intent;",
            ">;"
        }
    .end annotation
.end field

.field private startButton:Landroidx/appcompat/widget/AppCompatButton;

.field private final vpnPrepareLauncher:Landroidx/activity/result/ActivityResultLauncher;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/activity/result/ActivityResultLauncher<",
            "Landroid/content/Intent;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static synthetic $r8$lambda$C58SgbF8PPUn475noaVgMqAznFg(Lcom/example/myapplication/MainActivity;)V
    .registers 1

    invoke-static {p0}, Lcom/example/myapplication/MainActivity;->updateButtonState$lambda$3(Lcom/example/myapplication/MainActivity;)V

    return-void
.end method

.method public static synthetic $r8$lambda$DGCGE0hudgf62lfwoNJwLH4PhJM(Lcom/example/myapplication/MainActivity;Landroid/view/View;)V
    .registers 2

    invoke-static {p0, p1}, Lcom/example/myapplication/MainActivity;->onCreate$lambda$2(Lcom/example/myapplication/MainActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic $r8$lambda$j9iPeCciZ-Pjib9vWi5Fy5ulF5o(Lcom/example/myapplication/MainActivity;Landroidx/activity/result/ActivityResult;)V
    .registers 2

    invoke-static {p0, p1}, Lcom/example/myapplication/MainActivity;->vpnPrepareLauncher$lambda$0(Lcom/example/myapplication/MainActivity;Landroidx/activity/result/ActivityResult;)V

    return-void
.end method

.method public static synthetic $r8$lambda$yf5YphlA_rIU05KHsypjyymGC6c(Lcom/example/myapplication/MainActivity;Landroidx/activity/result/ActivityResult;)V
    .registers 2

    invoke-static {p0, p1}, Lcom/example/myapplication/MainActivity;->overlayPermissionLauncher$lambda$1(Lcom/example/myapplication/MainActivity;Landroidx/activity/result/ActivityResult;)V

    return-void
.end method

.method public constructor <init>()V
    .registers 4

    .line 18
    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    .line 24
    nop

    .line 25
    new-instance v0, Landroidx/activity/result/contract/ActivityResultContracts$StartActivityForResult;

    invoke-direct {v0}, Landroidx/activity/result/contract/ActivityResultContracts$StartActivityForResult;-><init>()V

    check-cast v0, Landroidx/activity/result/contract/ActivityResultContract;

    .line 26
    nop

    .line 24
    new-instance v1, Lcom/example/myapplication/MainActivity$$ExternalSyntheticLambda2;

    invoke-direct {v1, p0}, Lcom/example/myapplication/MainActivity$$ExternalSyntheticLambda2;-><init>(Lcom/example/myapplication/MainActivity;)V

    invoke-virtual {p0, v0, v1}, Lcom/example/myapplication/MainActivity;->registerForActivityResult(Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;

    move-result-object v0

    const-string v1, "registerForActivityResult(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/example/myapplication/MainActivity;->vpnPrepareLauncher:Landroidx/activity/result/ActivityResultLauncher;

    .line 32
    nop

    .line 33
    new-instance v0, Landroidx/activity/result/contract/ActivityResultContracts$StartActivityForResult;

    invoke-direct {v0}, Landroidx/activity/result/contract/ActivityResultContracts$StartActivityForResult;-><init>()V

    check-cast v0, Landroidx/activity/result/contract/ActivityResultContract;

    .line 34
    nop

    .line 32
    new-instance v2, Lcom/example/myapplication/MainActivity$$ExternalSyntheticLambda3;

    invoke-direct {v2, p0}, Lcom/example/myapplication/MainActivity$$ExternalSyntheticLambda3;-><init>(Lcom/example/myapplication/MainActivity;)V

    invoke-virtual {p0, v0, v2}, Lcom/example/myapplication/MainActivity;->registerForActivityResult(Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/example/myapplication/MainActivity;->overlayPermissionLauncher:Landroidx/activity/result/ActivityResultLauncher;

    .line 18
    return-void
.end method

.method private final handleVpnStart()V
    .registers 2

    .line 66
    move-object v0, p0

    check-cast v0, Landroid/content/Context;

    invoke-static {v0}, Landroid/provider/Settings;->canDrawOverlays(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 67
    invoke-direct {p0}, Lcom/example/myapplication/MainActivity;->requestVpnPermission()V

    goto :goto_10

    .line 69
    :cond_d
    invoke-direct {p0}, Lcom/example/myapplication/MainActivity;->requestOverlayPermission()V

    .line 71
    :goto_10
    return-void
.end method

.method private static final onCreate$lambda$2(Lcom/example/myapplication/MainActivity;Landroid/view/View;)V
    .registers 3
    .param p0, "this$0"  # Lcom/example/myapplication/MainActivity;
    .param p1, "it"  # Landroid/view/View;

    .line 57
    iget-boolean v0, p0, Lcom/example/myapplication/MainActivity;->isVpnRunning:Z

    if-eqz v0, :cond_8

    .line 58
    invoke-direct {p0}, Lcom/example/myapplication/MainActivity;->stopVpnServices()V

    goto :goto_b

    .line 60
    :cond_8
    invoke-direct {p0}, Lcom/example/myapplication/MainActivity;->handleVpnStart()V

    .line 62
    :goto_b
    return-void
.end method

.method private static final overlayPermissionLauncher$lambda$1(Lcom/example/myapplication/MainActivity;Landroidx/activity/result/ActivityResult;)V
    .registers 5
    .param p0, "this$0"  # Lcom/example/myapplication/MainActivity;
    .param p1, "it"  # Landroidx/activity/result/ActivityResult;

    .line 35
    move-object v0, p0

    check-cast v0, Landroid/content/Context;

    invoke-static {v0}, Landroid/provider/Settings;->canDrawOverlays(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_19

    .line 36
    move-object v0, p0

    check-cast v0, Landroid/content/Context;

    const-string v1, "Permission Required"

    check-cast v1, Ljava/lang/CharSequence;

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_1c

    .line 38
    :cond_19
    invoke-direct {p0}, Lcom/example/myapplication/MainActivity;->handleVpnStart()V

    .line 40
    :goto_1c
    return-void
.end method

.method private final requestOverlayPermission()V
    .registers 5

    .line 74
    new-instance v0, Landroid/content/Intent;

    .line 75
    nop

    .line 76
    invoke-virtual {p0}, Lcom/example/myapplication/MainActivity;->getPackageName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "package:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    .line 74
    const-string v2, "android.settings.action.MANAGE_OVERLAY_PERMISSION"

    invoke-direct {v0, v2, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 78
    .local v0, "intent":Landroid/content/Intent;
    iget-object v1, p0, Lcom/example/myapplication/MainActivity;->overlayPermissionLauncher:Landroidx/activity/result/ActivityResultLauncher;

    invoke-virtual {v1, v0}, Landroidx/activity/result/ActivityResultLauncher;->launch(Ljava/lang/Object;)V

    .line 79
    return-void
.end method

.method private final requestVpnPermission()V
    .registers 3

    .line 105
    move-object v0, p0

    check-cast v0, Landroid/content/Context;

    invoke-static {v0}, Landroid/net/VpnService;->prepare(Landroid/content/Context;)Landroid/content/Intent;

    move-result-object v0

    .line 106
    .local v0, "intent":Landroid/content/Intent;
    if-eqz v0, :cond_f

    .line 107
    iget-object v1, p0, Lcom/example/myapplication/MainActivity;->vpnPrepareLauncher:Landroidx/activity/result/ActivityResultLauncher;

    invoke-virtual {v1, v0}, Landroidx/activity/result/ActivityResultLauncher;->launch(Ljava/lang/Object;)V

    goto :goto_12

    .line 109
    :cond_f
    invoke-direct {p0}, Lcom/example/myapplication/MainActivity;->startVpnServices()V

    .line 111
    :goto_12
    return-void
.end method

.method private final startVpnServices()V
    .registers 5

    .line 114
    nop

    .line 115
    :try_start_1
    new-instance v0, Landroid/content/Intent;

    move-object v1, p0

    check-cast v1, Landroid/content/Context;

    const-class v2, Lcom/example/myapplication/PcapVpnService;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 116
    .local v0, "vpnIntent":Landroid/content/Intent;
    invoke-virtual {p0, v0}, Lcom/example/myapplication/MainActivity;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 118
    new-instance v1, Landroid/content/Intent;

    move-object v2, p0

    check-cast v2, Landroid/content/Context;

    const-class v3, Lcom/example/myapplication/FloatingButtonService;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 119
    .local v1, "floatingIntent":Landroid/content/Intent;
    invoke-virtual {p0, v1}, Lcom/example/myapplication/MainActivity;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 121
    const/4 v2, 0x1

    iput-boolean v2, p0, Lcom/example/myapplication/MainActivity;->isVpnRunning:Z

    .line 122
    invoke-direct {p0}, Lcom/example/myapplication/MainActivity;->updateButtonState()V
    :try_end_21
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_21} :catch_22

    .end local v0  # "vpnIntent":Landroid/content/Intent;
    .end local v1  # "floatingIntent":Landroid/content/Intent;
    goto :goto_26

    .line 123
    :catch_22
    move-exception v0

    .line 124
    .local v0, "e":Ljava/lang/Exception;
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 126
    .end local v0  # "e":Ljava/lang/Exception;
    :goto_26
    return-void
.end method

.method private final stopVpnServices()V
    .registers 5

    .line 129
    nop

    .line 130
    :try_start_1
    new-instance v0, Landroid/content/Intent;

    move-object v1, p0

    check-cast v1, Landroid/content/Context;

    const-class v2, Lcom/example/myapplication/PcapVpnService;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 131
    .local v0, "vpnIntent":Landroid/content/Intent;
    invoke-virtual {p0, v0}, Lcom/example/myapplication/MainActivity;->stopService(Landroid/content/Intent;)Z

    .line 133
    new-instance v1, Landroid/content/Intent;

    move-object v2, p0

    check-cast v2, Landroid/content/Context;

    const-class v3, Lcom/example/myapplication/FloatingButtonService;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 134
    .local v1, "floatingIntent":Landroid/content/Intent;
    invoke-virtual {p0, v1}, Lcom/example/myapplication/MainActivity;->stopService(Landroid/content/Intent;)Z

    .line 136
    const/4 v2, 0x0

    iput-boolean v2, p0, Lcom/example/myapplication/MainActivity;->isVpnRunning:Z

    .line 137
    invoke-direct {p0}, Lcom/example/myapplication/MainActivity;->updateButtonState()V
    :try_end_21
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_21} :catch_22

    .end local v0  # "vpnIntent":Landroid/content/Intent;
    .end local v1  # "floatingIntent":Landroid/content/Intent;
    goto :goto_26

    .line 138
    :catch_22
    move-exception v0

    .line 139
    .local v0, "e":Ljava/lang/Exception;
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 141
    .end local v0  # "e":Ljava/lang/Exception;
    :goto_26
    return-void
.end method

.method private final updateButtonState()V
    .registers 6

    .line 82
    nop

    .line 83
    :try_start_1
    iget-boolean v0, p0, Lcom/example/myapplication/MainActivity;->isVpnRunning:Z
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_3} :catch_6a

    const/4 v1, -0x1

    const/4 v2, 0x0

    const-string v3, "startButton"

    if-eqz v0, :cond_31

    .line 84
    :try_start_9
    iget-object v0, p0, Lcom/example/myapplication/MainActivity;->startButton:Landroidx/appcompat/widget/AppCompatButton;

    if-nez v0, :cond_11

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v2

    :cond_11
    const-string v4, "STOP"

    check-cast v4, Ljava/lang/CharSequence;

    invoke-virtual {v0, v4}, Landroidx/appcompat/widget/AppCompatButton;->setText(Ljava/lang/CharSequence;)V

    .line 85
    iget-object v0, p0, Lcom/example/myapplication/MainActivity;->startButton:Landroidx/appcompat/widget/AppCompatButton;

    if-nez v0, :cond_20

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v2

    :cond_20
    sget v4, Lcom/example/myapplication/R$drawable;->bg_stop_glow:I

    invoke-virtual {v0, v4}, Landroidx/appcompat/widget/AppCompatButton;->setBackgroundResource(I)V

    .line 86
    iget-object v0, p0, Lcom/example/myapplication/MainActivity;->startButton:Landroidx/appcompat/widget/AppCompatButton;

    if-nez v0, :cond_2d

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v2

    :cond_2d
    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/AppCompatButton;->setTextColor(I)V

    goto :goto_58

    .line 88
    :cond_31
    iget-object v0, p0, Lcom/example/myapplication/MainActivity;->startButton:Landroidx/appcompat/widget/AppCompatButton;

    if-nez v0, :cond_39

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v2

    :cond_39
    const-string v4, "START"

    check-cast v4, Ljava/lang/CharSequence;

    invoke-virtual {v0, v4}, Landroidx/appcompat/widget/AppCompatButton;->setText(Ljava/lang/CharSequence;)V

    .line 89
    iget-object v0, p0, Lcom/example/myapplication/MainActivity;->startButton:Landroidx/appcompat/widget/AppCompatButton;

    if-nez v0, :cond_48

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v2

    :cond_48
    sget v4, Lcom/example/myapplication/R$drawable;->bg_start_glow:I

    invoke-virtual {v0, v4}, Landroidx/appcompat/widget/AppCompatButton;->setBackgroundResource(I)V

    .line 90
    iget-object v0, p0, Lcom/example/myapplication/MainActivity;->startButton:Landroidx/appcompat/widget/AppCompatButton;

    if-nez v0, :cond_55

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v2

    :cond_55
    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/AppCompatButton;->setTextColor(I)V

    .line 93
    :goto_58
    iget-object v0, p0, Lcom/example/myapplication/MainActivity;->startButton:Landroidx/appcompat/widget/AppCompatButton;

    if-nez v0, :cond_60

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_61

    :cond_60
    move-object v2, v0

    :goto_61
    new-instance v0, Lcom/example/myapplication/MainActivity$$ExternalSyntheticLambda0;

    invoke-direct {v0, p0}, Lcom/example/myapplication/MainActivity$$ExternalSyntheticLambda0;-><init>(Lcom/example/myapplication/MainActivity;)V

    invoke-virtual {v2, v0}, Landroidx/appcompat/widget/AppCompatButton;->post(Ljava/lang/Runnable;)Z
    :try_end_69
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_69} :catch_6a

    goto :goto_6e

    .line 99
    :catch_6a
    move-exception v0

    .line 100
    .local v0, "e":Ljava/lang/Exception;
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 102
    .end local v0  # "e":Ljava/lang/Exception;
    :goto_6e
    return-void
.end method

.method private static final updateButtonState$lambda$3(Lcom/example/myapplication/MainActivity;)V
    .registers 3
    .param p0, "this$0"  # Lcom/example/myapplication/MainActivity;

    .line 94
    iget-object v0, p0, Lcom/example/myapplication/MainActivity;->startButton:Landroidx/appcompat/widget/AppCompatButton;

    if-nez v0, :cond_a

    const-string v0, "startButton"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_a
    invoke-virtual {v0}, Landroidx/appcompat/widget/AppCompatButton;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 95
    .local v0, "background":Landroid/graphics/drawable/Drawable;
    instance-of v1, v0, Landroid/graphics/drawable/Animatable;

    if-eqz v1, :cond_18

    .line 96
    move-object v1, v0

    check-cast v1, Landroid/graphics/drawable/Animatable;

    invoke-interface {v1}, Landroid/graphics/drawable/Animatable;->start()V

    .line 98
    :cond_18
    return-void
.end method

.method private static final vpnPrepareLauncher$lambda$0(Lcom/example/myapplication/MainActivity;Landroidx/activity/result/ActivityResult;)V
    .registers 4
    .param p0, "this$0"  # Lcom/example/myapplication/MainActivity;
    .param p1, "result"  # Landroidx/activity/result/ActivityResult;

    .line 27
    invoke-virtual {p1}, Landroidx/activity/result/ActivityResult;->getResultCode()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_a

    .line 28
    invoke-direct {p0}, Lcom/example/myapplication/MainActivity;->startVpnServices()V

    .line 30
    :cond_a
    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .registers 4
    .param p1, "savedInstanceState"  # Landroid/os/Bundle;

    .line 43
    invoke-super {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 44
    sget v0, Lcom/example/myapplication/R$layout;->activity_main:I

    invoke-virtual {p0, v0}, Lcom/example/myapplication/MainActivity;->setContentView(I)V

    .line 46
    invoke-virtual {p0}, Lcom/example/myapplication/MainActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    .line 47
    nop

    .line 48
    nop

    .line 46
    const/16 v1, 0x200

    invoke-virtual {v0, v1, v1}, Landroid/view/Window;->setFlags(II)V

    .line 51
    sget v0, Lcom/example/myapplication/R$id;->startButton:I

    invoke-virtual {p0, v0}, Lcom/example/myapplication/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/AppCompatButton;

    iput-object v0, p0, Lcom/example/myapplication/MainActivity;->startButton:Landroidx/appcompat/widget/AppCompatButton;

    .line 52
    sget v0, Lcom/example/myapplication/R$id;->capturedIpTextView:I

    invoke-virtual {p0, v0}, Lcom/example/myapplication/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/example/myapplication/MainActivity;->capturedIpTextView:Landroid/widget/TextView;

    .line 54
    invoke-direct {p0}, Lcom/example/myapplication/MainActivity;->updateButtonState()V

    .line 56
    iget-object v0, p0, Lcom/example/myapplication/MainActivity;->startButton:Landroidx/appcompat/widget/AppCompatButton;

    if-nez v0, :cond_34

    const-string v0, "startButton"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_34
    new-instance v1, Lcom/example/myapplication/MainActivity$$ExternalSyntheticLambda1;

    invoke-direct {v1, p0}, Lcom/example/myapplication/MainActivity$$ExternalSyntheticLambda1;-><init>(Lcom/example/myapplication/MainActivity;)V

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/AppCompatButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 63
    return-void
.end method
