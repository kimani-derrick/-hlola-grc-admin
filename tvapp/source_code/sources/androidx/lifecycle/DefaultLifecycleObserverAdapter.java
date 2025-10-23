package androidx.lifecycle;
/* loaded from: classes.dex */
public final class DefaultLifecycleObserverAdapter implements InterfaceC0340s {

    /* renamed from: q  reason: collision with root package name */
    public final InterfaceC0328f f6731q;

    /* renamed from: r  reason: collision with root package name */
    public final InterfaceC0340s f6732r;

    public DefaultLifecycleObserverAdapter(InterfaceC0328f interfaceC0328f, InterfaceC0340s interfaceC0340s) {
        M5.g.f(interfaceC0328f, "defaultLifecycleObserver");
        this.f6731q = interfaceC0328f;
        this.f6732r = interfaceC0340s;
    }

    @Override // androidx.lifecycle.InterfaceC0340s
    public final void d(InterfaceC0342u interfaceC0342u, EnumC0336n enumC0336n) {
        int i7 = AbstractC0329g.f6815a[enumC0336n.ordinal()];
        InterfaceC0328f interfaceC0328f = this.f6731q;
        switch (i7) {
            case 1:
                interfaceC0328f.c(interfaceC0342u);
                break;
            case 2:
                interfaceC0328f.i(interfaceC0342u);
                break;
            case 3:
                interfaceC0328f.a(interfaceC0342u);
                break;
            case 4:
                interfaceC0328f.f(interfaceC0342u);
                break;
            case 5:
                interfaceC0328f.h(interfaceC0342u);
                break;
            case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                interfaceC0328f.b(interfaceC0342u);
                break;
            case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        InterfaceC0340s interfaceC0340s = this.f6732r;
        if (interfaceC0340s != null) {
            interfaceC0340s.d(interfaceC0342u, enumC0336n);
        }
    }
}
