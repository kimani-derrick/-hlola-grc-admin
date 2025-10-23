package W5;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes.dex */
public class d0 extends j0 {

    /* renamed from: s  reason: collision with root package name */
    public final boolean f3979s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(InterfaceC0093a0 interfaceC0093a0) {
        super(true);
        C0104k c0104k;
        boolean z7 = true;
        N(interfaceC0093a0);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j0.f4003r;
        InterfaceC0103j interfaceC0103j = (InterfaceC0103j) atomicReferenceFieldUpdater.get(this);
        if (interfaceC0103j instanceof C0104k) {
            c0104k = (C0104k) interfaceC0103j;
        } else {
            c0104k = null;
        }
        if (c0104k != null) {
            do {
                j0 o7 = c0104k.o();
                if (o7.H()) {
                    break;
                }
                InterfaceC0103j interfaceC0103j2 = (InterfaceC0103j) atomicReferenceFieldUpdater.get(o7);
                if (interfaceC0103j2 instanceof C0104k) {
                    c0104k = (C0104k) interfaceC0103j2;
                    continue;
                } else {
                    c0104k = null;
                    continue;
                }
            } while (c0104k != null);
            z7 = false;
        } else {
            z7 = false;
        }
        this.f3979s = z7;
    }

    @Override // W5.j0
    public final boolean H() {
        return this.f3979s;
    }

    @Override // W5.j0
    public final boolean I() {
        return true;
    }
}
