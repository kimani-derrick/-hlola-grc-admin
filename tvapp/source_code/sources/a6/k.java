package a6;

import K.C0029e;
import W5.InterfaceC0116x;
import k3.AbstractC0958a;
import z5.C1530l;
/* loaded from: classes.dex */
public final class k extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public int f5224u;

    /* renamed from: v  reason: collision with root package name */
    public /* synthetic */ Object f5225v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ C0029e f5226w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ Z5.c f5227x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(D5.d dVar, C0029e c0029e, Z5.c cVar) {
        super(2, dVar);
        this.f5226w = c0029e;
        this.f5227x = cVar;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        k kVar = new k(dVar, this.f5226w, this.f5227x);
        kVar.f5225v = obj;
        return kVar;
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((k) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, M5.o] */
    @Override // F5.a
    public final Object p(Object obj) {
        E5.a aVar = E5.a.f612q;
        int i7 = this.f5224u;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC0958a.H(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0958a.H(obj);
            ?? obj2 = new Object();
            C0029e c0029e = this.f5226w;
            j jVar = new j(obj2, (InterfaceC0116x) this.f5225v, c0029e, this.f5227x);
            this.f5224u = 1;
            if (((Z5.b) c0029e.f1479u).t(jVar, this) == aVar) {
                return aVar;
            }
        }
        return C1530l.f16479a;
    }
}
