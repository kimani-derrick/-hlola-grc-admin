package a3;

import android.os.Handler;
import e2.SurfaceHolder$CallbackC0629y;
/* loaded from: classes.dex */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5134a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f5135b;

    /* renamed from: c  reason: collision with root package name */
    public final SurfaceHolder$CallbackC0629y f5136c;

    public /* synthetic */ y(Handler handler, SurfaceHolder$CallbackC0629y surfaceHolder$CallbackC0629y, int i7) {
        this.f5134a = i7;
        this.f5135b = handler;
        this.f5136c = surfaceHolder$CallbackC0629y;
    }

    private final void b(i2.e eVar) {
        synchronized (eVar) {
        }
        Handler handler = this.f5135b;
        if (handler != null) {
            handler.post(new w(this, eVar, 0));
        }
    }

    public final void a(i2.e eVar) {
        switch (this.f5134a) {
            case 0:
                b(eVar);
                return;
            default:
                synchronized (eVar) {
                }
                Handler handler = this.f5135b;
                if (handler != null) {
                    handler.post(new g2.r(this, eVar, 1));
                    return;
                }
                return;
        }
    }

    public void c(z zVar) {
        Handler handler = this.f5135b;
        if (handler != null) {
            handler.post(new A4.d(this, 6, zVar));
        }
    }
}
