package H2;
/* loaded from: classes.dex */
public final /* synthetic */ class C implements Runnable {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f879q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ C.d f880r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ H f881s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ C0016q f882t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ C0020v f883u;

    public /* synthetic */ C(C.d dVar, H h7, C0016q c0016q, C0020v c0020v, int i7) {
        this.f879q = i7;
        this.f880r = dVar;
        this.f881s = h7;
        this.f882t = c0016q;
        this.f883u = c0020v;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f879q) {
            case 0:
                C.d dVar = this.f880r;
                this.f881s.C(dVar.f324r, (A) dVar.f325s, this.f882t, this.f883u);
                return;
            case 1:
                C.d dVar2 = this.f880r;
                this.f881s.a(dVar2.f324r, (A) dVar2.f325s, this.f882t, this.f883u);
                return;
            default:
                C.d dVar3 = this.f880r;
                this.f881s.t(dVar3.f324r, (A) dVar3.f325s, this.f882t, this.f883u);
                return;
        }
    }
}
