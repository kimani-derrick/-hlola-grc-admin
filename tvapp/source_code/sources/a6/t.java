package a6;

import W5.C0114v;
import W5.InterfaceC0093a0;
import W5.InterfaceC0103j;
import W5.j0;
/* loaded from: classes.dex */
public final class t extends M5.h implements L5.p {

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ q f5240r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(q qVar) {
        super(2);
        this.f5240r = qVar;
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        int i7;
        int intValue = ((Number) obj).intValue();
        D5.g gVar = (D5.g) obj2;
        D5.h key = gVar.getKey();
        D5.g f = this.f5240r.f5234u.f(key);
        if (key != C0114v.f4028r) {
            if (gVar != f) {
                i7 = Integer.MIN_VALUE;
            } else {
                i7 = intValue + 1;
            }
            return Integer.valueOf(i7);
        }
        InterfaceC0093a0 interfaceC0093a0 = (InterfaceC0093a0) f;
        InterfaceC0093a0 interfaceC0093a02 = (InterfaceC0093a0) gVar;
        while (true) {
            if (interfaceC0093a02 == null) {
                interfaceC0093a02 = null;
                break;
            } else if (interfaceC0093a02 == interfaceC0093a0 || !(interfaceC0093a02 instanceof b6.s)) {
                break;
            } else {
                InterfaceC0103j interfaceC0103j = (InterfaceC0103j) j0.f4003r.get((j0) interfaceC0093a02);
                if (interfaceC0103j != null) {
                    interfaceC0093a02 = interfaceC0103j.getParent();
                } else {
                    interfaceC0093a02 = null;
                }
            }
        }
        if (interfaceC0093a02 == interfaceC0093a0) {
            if (interfaceC0093a0 != null) {
                intValue++;
            }
            return Integer.valueOf(intValue);
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + interfaceC0093a02 + ", expected child of " + interfaceC0093a0 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }
}
