package androidx.leanback.app;
/* loaded from: classes.dex */
public final class m implements Runnable {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f6238q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ s f6239r;

    public /* synthetic */ m(s sVar, int i7) {
        this.f6238q = i7;
        this.f6239r = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6238q) {
            case 0:
                this.f6239r.D0(true);
                return;
            case 1:
                this.f6239r.D0(false);
                return;
            default:
                s sVar = this.f6239r;
                sVar.x0(sVar.f6272a1);
                sVar.C0(true);
                sVar.f6261O0.k(true);
                return;
        }
    }
}
