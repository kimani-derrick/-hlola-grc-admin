package a3;

import Z2.AbstractC0156a;
import Z2.H;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;
/* loaded from: classes.dex */
public final class s implements Choreographer.FrameCallback, Handler.Callback {

    /* renamed from: u  reason: collision with root package name */
    public static final s f5102u = new s();

    /* renamed from: q  reason: collision with root package name */
    public volatile long f5103q = -9223372036854775807L;

    /* renamed from: r  reason: collision with root package name */
    public final Handler f5104r;

    /* renamed from: s  reason: collision with root package name */
    public Choreographer f5105s;

    /* renamed from: t  reason: collision with root package name */
    public int f5106t;

    public s() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        int i7 = H.f4603a;
        Handler handler = new Handler(looper, this);
        this.f5104r = handler;
        handler.sendEmptyMessage(0);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j7) {
        this.f5103q = j7;
        Choreographer choreographer = this.f5105s;
        choreographer.getClass();
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i7 = message.what;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    return false;
                }
                Choreographer choreographer = this.f5105s;
                if (choreographer != null) {
                    int i8 = this.f5106t - 1;
                    this.f5106t = i8;
                    if (i8 == 0) {
                        choreographer.removeFrameCallback(this);
                        this.f5103q = -9223372036854775807L;
                    }
                }
                return true;
            }
            Choreographer choreographer2 = this.f5105s;
            if (choreographer2 != null) {
                int i9 = this.f5106t + 1;
                this.f5106t = i9;
                if (i9 == 1) {
                    choreographer2.postFrameCallback(this);
                }
            }
            return true;
        }
        try {
            this.f5105s = Choreographer.getInstance();
        } catch (RuntimeException e3) {
            AbstractC0156a.L("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e3);
        }
        return true;
    }
}
