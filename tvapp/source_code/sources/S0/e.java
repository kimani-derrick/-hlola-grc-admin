package S0;

import androidx.lifecycle.EnumC0337o;
import androidx.lifecycle.InterfaceC0328f;
import androidx.lifecycle.InterfaceC0341t;
/* loaded from: classes.dex */
public final class e extends P1.c {

    /* renamed from: r  reason: collision with root package name */
    public static final e f2966r = new P1.c(3);

    /* renamed from: s  reason: collision with root package name */
    public static final d f2967s = new Object();

    @Override // P1.c
    public final void g(InterfaceC0341t interfaceC0341t) {
        if (interfaceC0341t instanceof InterfaceC0328f) {
            InterfaceC0328f interfaceC0328f = (InterfaceC0328f) interfaceC0341t;
            d dVar = f2967s;
            interfaceC0328f.c(dVar);
            interfaceC0328f.i(dVar);
            interfaceC0328f.a(dVar);
            return;
        }
        throw new IllegalArgumentException((interfaceC0341t + " must implement androidx.lifecycle.DefaultLifecycleObserver.").toString());
    }

    @Override // P1.c
    public final EnumC0337o l() {
        return EnumC0337o.f6821u;
    }

    public final String toString() {
        return "coil.request.GlobalLifecycle";
    }

    @Override // P1.c
    public final void v(InterfaceC0341t interfaceC0341t) {
    }
}
