package s3;
/* loaded from: classes.dex */
public final class P0 implements Runnable {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f13854q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ N0 f13855r;

    public /* synthetic */ P0(N0 n02, int i7) {
        this.f13854q = i7;
        this.f13855r = n02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13854q) {
            case 0:
                N0 n02 = this.f13855r;
                n02.f13840u = n02.f13845z;
                return;
            default:
                this.f13855r.f13845z = null;
                return;
        }
    }
}
