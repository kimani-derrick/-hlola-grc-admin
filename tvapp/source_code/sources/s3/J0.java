package s3;
/* loaded from: classes.dex */
public final class J0 implements Runnable {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f13813q = 1;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ long f13814r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ boolean f13815s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ Object f13816t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ Object f13817u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ AbstractC1157L f13818v;

    public J0(C1212z0 c1212z0, C1198s0 c1198s0, long j7, boolean z7, C1198s0 c1198s02) {
        this.f13816t = c1198s0;
        this.f13814r = j7;
        this.f13815s = z7;
        this.f13817u = c1198s02;
        this.f13818v = c1212z0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13813q) {
            case 0:
                C1212z0 c1212z0 = (C1212z0) this.f13818v;
                C1198s0 c1198s0 = (C1198s0) this.f13816t;
                c1212z0.U(c1198s0);
                C1212z0.W((C1212z0) this.f13818v, (C1198s0) this.f13816t, this.f13814r, false, this.f13815s);
                C1212z0.X(c1212z0, c1198s0, (C1198s0) this.f13817u);
                return;
            default:
                ((N0) this.f13818v).O((O0) this.f13816t, (O0) this.f13817u, this.f13814r, this.f13815s, null);
                return;
        }
    }

    public J0(N0 n02, O0 o02, O0 o03, long j7, boolean z7) {
        this.f13816t = o02;
        this.f13817u = o03;
        this.f13814r = j7;
        this.f13815s = z7;
        this.f13818v = n02;
    }
}
