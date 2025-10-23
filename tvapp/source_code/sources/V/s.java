package V;

import k3.AbstractC0958a;
import z5.C1530l;
/* loaded from: classes.dex */
public final class s extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public /* synthetic */ Object f3569u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ I f3570v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(I i7, D5.d dVar) {
        super(2, dVar);
        this.f3570v = i7;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        s sVar = new s(this.f3570v, dVar);
        sVar.f3569u = obj;
        return sVar;
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((s) h((D5.d) obj2, (I) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        AbstractC0958a.H(obj);
        I i7 = (I) this.f3569u;
        I i8 = this.f3570v;
        boolean z7 = false;
        if (!(i8 instanceof C0084c) && !(i8 instanceof C0091j) && i7 == i8) {
            z7 = true;
        }
        return Boolean.valueOf(z7);
    }
}
