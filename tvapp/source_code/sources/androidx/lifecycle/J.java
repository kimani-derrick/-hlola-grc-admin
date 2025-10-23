package androidx.lifecycle;

import W5.AbstractC0117y;
import W5.InterfaceC0116x;
import k3.AbstractC0958a;
import z5.C1530l;
/* loaded from: classes.dex */
public final class J extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public int f6757u;

    /* renamed from: v  reason: collision with root package name */
    public /* synthetic */ Object f6758v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ P1.c f6759w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ EnumC0337o f6760x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ L5.p f6761y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(P1.c cVar, EnumC0337o enumC0337o, L5.p pVar, D5.d dVar) {
        super(2, dVar);
        this.f6759w = cVar;
        this.f6760x = enumC0337o;
        this.f6761y = pVar;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        J j7 = new J(this.f6759w, this.f6760x, this.f6761y, dVar);
        j7.f6758v = obj;
        return j7;
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((J) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        E5.a aVar = E5.a.f612q;
        int i7 = this.f6757u;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC0958a.H(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0958a.H(obj);
            InterfaceC0116x interfaceC0116x = (InterfaceC0116x) this.f6758v;
            d6.d dVar = W5.G.f3945a;
            X5.e eVar = b6.o.f7208a.f4295v;
            I i8 = new I(this.f6759w, this.f6760x, interfaceC0116x, this.f6761y, null);
            this.f6757u = 1;
            if (AbstractC0117y.y(this, eVar, i8) == aVar) {
                return aVar;
            }
        }
        return C1530l.f16479a;
    }
}
