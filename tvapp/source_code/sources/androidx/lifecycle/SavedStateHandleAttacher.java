package androidx.lifecycle;
/* loaded from: classes.dex */
public final class SavedStateHandleAttacher implements InterfaceC0340s {

    /* renamed from: q  reason: collision with root package name */
    public final Q f6788q;

    public SavedStateHandleAttacher(Q q5) {
        this.f6788q = q5;
    }

    @Override // androidx.lifecycle.InterfaceC0340s
    public final void d(InterfaceC0342u interfaceC0342u, EnumC0336n enumC0336n) {
        if (enumC0336n == EnumC0336n.ON_CREATE) {
            interfaceC0342u.q().v(this);
            this.f6788q.b();
            return;
        }
        throw new IllegalStateException(("Next event must be ON_CREATE, it was " + enumC0336n).toString());
    }
}
