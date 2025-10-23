package androidx.lifecycle;
/* loaded from: classes.dex */
public final class SavedStateHandleController implements InterfaceC0340s {

    /* renamed from: q  reason: collision with root package name */
    public final String f6789q;

    /* renamed from: r  reason: collision with root package name */
    public final N f6790r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f6791s;

    public SavedStateHandleController(String str, N n) {
        this.f6789q = str;
        this.f6790r = n;
    }

    @Override // androidx.lifecycle.InterfaceC0340s
    public final void d(InterfaceC0342u interfaceC0342u, EnumC0336n enumC0336n) {
        if (enumC0336n == EnumC0336n.ON_DESTROY) {
            this.f6791s = false;
            interfaceC0342u.q().v(this);
        }
    }

    public final void j(A0.e eVar, P1.c cVar) {
        M5.g.f(eVar, "registry");
        M5.g.f(cVar, "lifecycle");
        if (!this.f6791s) {
            this.f6791s = true;
            cVar.g(this);
            eVar.d(this.f6789q, this.f6790r.f6771e);
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner".toString());
    }
}
