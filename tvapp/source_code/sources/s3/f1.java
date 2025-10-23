package s3;

import android.os.Looper;
import android.os.SystemClock;
import k.C0852F;
/* loaded from: classes.dex */
public final class f1 extends AbstractC1157L {

    /* renamed from: s  reason: collision with root package name */
    public com.google.android.gms.internal.measurement.S f14016s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f14017t;

    /* renamed from: u  reason: collision with root package name */
    public final C0852F f14018u;

    /* renamed from: v  reason: collision with root package name */
    public final H2.X f14019v;

    /* renamed from: w  reason: collision with root package name */
    public final androidx.fragment.app.D f14020w;

    /* JADX WARN: Type inference failed for: r4v3, types: [H2.X, java.lang.Object] */
    public f1(C1175g0 c1175g0) {
        super(c1175g0);
        this.f14017t = true;
        this.f14018u = new C0852F(17, this);
        ?? obj = new Object();
        obj.f1000t = this;
        obj.f999s = new h1(obj, (C1175g0) this.f2765q, 0);
        ((C1175g0) this.f2765q).f14037D.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        obj.f997q = elapsedRealtime;
        obj.f998r = elapsedRealtime;
        this.f14019v = obj;
        this.f14020w = new androidx.fragment.app.D(this);
    }

    @Override // s3.AbstractC1157L
    public final boolean J() {
        return false;
    }

    public final void K() {
        D();
        if (this.f14016s == null) {
            this.f14016s = new com.google.android.gms.internal.measurement.S(Looper.getMainLooper());
        }
    }
}
