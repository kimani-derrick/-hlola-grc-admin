package s3;
/* renamed from: s3.z  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1211z implements Runnable {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f14395q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ long f14396r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ AbstractC1205w f14397s;

    public /* synthetic */ RunnableC1211z(AbstractC1205w abstractC1205w, long j7, int i7) {
        this.f14395q = i7;
        this.f14396r = j7;
        this.f14397s = abstractC1205w;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14395q) {
            case 0:
                ((C1164b) this.f14397s).L(this.f14396r);
                return;
            default:
                N0 n02 = (N0) this.f14397s;
                ((C1175g0) n02.f2765q).m().H(this.f14396r);
                n02.f13840u = null;
                return;
        }
    }
}
