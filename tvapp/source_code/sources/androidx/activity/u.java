package androidx.activity;
/* loaded from: classes.dex */
public final class u implements c {

    /* renamed from: q  reason: collision with root package name */
    public final n f5378q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ w f5379r;

    public u(w wVar, n nVar) {
        M5.g.f(nVar, "onBackPressedCallback");
        this.f5379r = wVar;
        this.f5378q = nVar;
    }

    @Override // androidx.activity.c
    public final void cancel() {
        w wVar = this.f5379r;
        A5.i iVar = wVar.f5382b;
        n nVar = this.f5378q;
        iVar.remove(nVar);
        if (M5.g.a(wVar.f5383c, nVar)) {
            nVar.a();
            wVar.f5383c = null;
        }
        nVar.getClass();
        nVar.f5343b.remove(this);
        L5.a aVar = nVar.f5344c;
        if (aVar != null) {
            aVar.b();
        }
        nVar.f5344c = null;
    }
}
