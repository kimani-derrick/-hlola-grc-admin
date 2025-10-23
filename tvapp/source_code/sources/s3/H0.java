package s3;

import com.google.android.gms.internal.measurement.C0408c3;
/* loaded from: classes.dex */
public final class H0 implements Runnable {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ C1198s0 f13794q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ long f13795r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ long f13796s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ boolean f13797t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ C1198s0 f13798u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ C1212z0 f13799v;

    public H0(C1212z0 c1212z0, C1198s0 c1198s0, long j7, long j8, boolean z7, C1198s0 c1198s02) {
        this.f13794q = c1198s0;
        this.f13795r = j7;
        this.f13796s = j8;
        this.f13797t = z7;
        this.f13798u = c1198s02;
        this.f13799v = c1212z0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1212z0 c1212z0 = this.f13799v;
        C1198s0 c1198s0 = this.f13794q;
        c1212z0.U(c1198s0);
        C0408c3.a();
        if (!((C1175g0) c1212z0.f2765q).f14062w.O(null, AbstractC1203v.f14310a1)) {
            c1212z0.Y(false, this.f13795r);
        }
        C1212z0.W(this.f13799v, this.f13794q, this.f13796s, true, this.f13797t);
        C1212z0.X(c1212z0, c1198s0, this.f13798u);
    }
}
