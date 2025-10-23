package s3;

import android.os.Handler;
/* renamed from: s3.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1184l {
    public static volatile com.google.android.gms.internal.measurement.S d;

    /* renamed from: a  reason: collision with root package name */
    public final InterfaceC1193p0 f14107a;

    /* renamed from: b  reason: collision with root package name */
    public final R3.a f14108b;

    /* renamed from: c  reason: collision with root package name */
    public volatile long f14109c;

    public AbstractC1184l(InterfaceC1193p0 interfaceC1193p0) {
        g3.n.g(interfaceC1193p0);
        this.f14107a = interfaceC1193p0;
        this.f14108b = new R3.a(this, interfaceC1193p0, 12, false);
    }

    public final void a() {
        this.f14109c = 0L;
        d().removeCallbacks(this.f14108b);
    }

    public final void b(long j7) {
        a();
        if (j7 >= 0) {
            this.f14107a.f().getClass();
            this.f14109c = System.currentTimeMillis();
            if (!d().postDelayed(this.f14108b, j7)) {
                this.f14107a.b().f13807v.c(Long.valueOf(j7), "Failed to schedule delayed post. time");
            }
        }
    }

    public abstract void c();

    public final Handler d() {
        com.google.android.gms.internal.measurement.S s6;
        if (d != null) {
            return d;
        }
        synchronized (AbstractC1184l.class) {
            try {
                if (d == null) {
                    d = new com.google.android.gms.internal.measurement.S(this.f14107a.a().getMainLooper());
                }
                s6 = d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return s6;
    }
}
