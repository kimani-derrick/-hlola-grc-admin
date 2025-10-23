package e2;
/* renamed from: e2.t  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0624t implements Z2.m {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f10071q = 0;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ int f10072r;

    public /* synthetic */ C0624t(int i7) {
        this.f10072r = i7;
    }

    @Override // Z2.m
    public final void c(Object obj) {
        switch (this.f10071q) {
            case 0:
                ((t0) obj).o(this.f10072r);
                return;
            default:
                f2.k kVar = (f2.k) obj;
                kVar.getClass();
                int i7 = this.f10072r;
                if (i7 == 1) {
                    kVar.f10387u = true;
                }
                kVar.f10378k = i7;
                return;
        }
    }
}
