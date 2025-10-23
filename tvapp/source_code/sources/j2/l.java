package j2;
/* loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f11828q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ n f11829r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ o f11830s;

    public /* synthetic */ l(n nVar, o oVar, int i7) {
        this.f11828q = i7;
        this.f11829r = nVar;
        this.f11830s = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11828q) {
            case 0:
                n nVar = this.f11829r;
                this.f11830s.f(nVar.f11833a, nVar.f11834b);
                return;
            case 1:
                n nVar2 = this.f11829r;
                this.f11830s.e(nVar2.f11833a, nVar2.f11834b);
                return;
            case 2:
                n nVar3 = this.f11829r;
                this.f11830s.H(nVar3.f11833a, nVar3.f11834b);
                return;
            default:
                n nVar4 = this.f11829r;
                this.f11830s.J(nVar4.f11833a, nVar4.f11834b);
                return;
        }
    }
}
