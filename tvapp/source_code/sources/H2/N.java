package H2;
/* loaded from: classes.dex */
public final /* synthetic */ class N implements Runnable {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f925q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ S f926r;

    public /* synthetic */ N(S s6, int i7) {
        this.f925q = i7;
        this.f926r = s6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f925q) {
            case 0:
                this.f926r.p();
                return;
            case 1:
                S s6 = this.f926r;
                if (!s6.f969b0) {
                    InterfaceC0021w interfaceC0021w = s6.f949G;
                    interfaceC0021w.getClass();
                    interfaceC0021w.h(s6);
                    return;
                }
                return;
            default:
                this.f926r.f964V = true;
                return;
        }
    }
}
