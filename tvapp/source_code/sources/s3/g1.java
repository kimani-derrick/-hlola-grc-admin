package s3;
/* loaded from: classes.dex */
public final class g1 implements Runnable {

    /* renamed from: q  reason: collision with root package name */
    public final long f14066q;

    /* renamed from: r  reason: collision with root package name */
    public final long f14067r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.D f14068s;

    public g1(androidx.fragment.app.D d, long j7, long j8) {
        this.f14068s = d;
        this.f14066q = j7;
        this.f14067r = j8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1169d0 d = ((f1) this.f14068s.f5884s).d();
        P.b bVar = new P.b(16);
        bVar.f2739r = this;
        d.M(bVar);
    }
}
