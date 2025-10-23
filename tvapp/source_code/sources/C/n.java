package C;

import com.google.android.gms.internal.measurement.AbstractC0515y1;
import e2.C0585B;
import e2.C0596b;
import e2.C0598c;
import e2.SurfaceHolder$CallbackC0629y;
import g2.C0713d;
/* loaded from: classes.dex */
public final /* synthetic */ class n implements Runnable {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f340q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ int f341r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ Object f342s;

    public /* synthetic */ n(int i7, int i8, Object obj) {
        this.f340q = i8;
        this.f342s = obj;
        this.f341r = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z7;
        switch (this.f340q) {
            case 0:
                ((b) this.f342s).h(this.f341r);
                return;
            default:
                C0598c c0598c = ((C0596b) this.f342s).f9843b;
                c0598c.getClass();
                int i7 = 2;
                int i8 = 1;
                int i9 = this.f341r;
                if (i9 != -3 && i9 != -2) {
                    if (i9 != -1) {
                        if (i9 != 1) {
                            AbstractC0515y1.q(i9, "Unknown focus change type: ", "AudioFocusManager");
                            return;
                        }
                        c0598c.c(1);
                        SurfaceHolder$CallbackC0629y surfaceHolder$CallbackC0629y = c0598c.f9911c;
                        if (surfaceHolder$CallbackC0629y != null) {
                            C0585B c0585b = surfaceHolder$CallbackC0629y.f10095q;
                            c0585b.n0(1, 1, c0585b.S());
                            return;
                        }
                        return;
                    }
                    SurfaceHolder$CallbackC0629y surfaceHolder$CallbackC0629y2 = c0598c.f9911c;
                    if (surfaceHolder$CallbackC0629y2 != null) {
                        C0585B c0585b2 = surfaceHolder$CallbackC0629y2.f10095q;
                        boolean S6 = c0585b2.S();
                        if (!S6) {
                            i7 = 1;
                        }
                        c0585b2.n0(-1, i7, S6);
                    }
                    c0598c.a();
                    return;
                }
                if (i9 != -2) {
                    C0713d c0713d = c0598c.d;
                    if (c0713d != null && c0713d.f10678q == 1) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (!z7) {
                        i7 = 3;
                        c0598c.c(i7);
                        return;
                    }
                }
                SurfaceHolder$CallbackC0629y surfaceHolder$CallbackC0629y3 = c0598c.f9911c;
                if (surfaceHolder$CallbackC0629y3 != null) {
                    C0585B c0585b3 = surfaceHolder$CallbackC0629y3.f10095q;
                    boolean S7 = c0585b3.S();
                    if (S7) {
                        i8 = 2;
                    }
                    c0585b3.n0(0, i8, S7);
                }
                c0598c.c(i7);
                return;
        }
    }
}
