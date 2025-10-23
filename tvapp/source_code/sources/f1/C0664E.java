package f1;

import W5.InterfaceC0116x;
import k3.AbstractC0958a;
import z5.C1530l;
/* renamed from: f1.E  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0664E extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public int f10215u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ C0669J f10216v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ int f10217w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0664E(C0669J c0669j, int i7, D5.d dVar) {
        super(2, dVar);
        this.f10216v = c0669j;
        this.f10217w = i7;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new C0664E(this.f10216v, this.f10217w, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((C0664E) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        E5.a aVar = E5.a.f612q;
        int i7 = this.f10215u;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC0958a.H(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0958a.H(obj);
            Object obj2 = this.f10216v.f10229a.get();
            M5.g.e(obj2, "traktService.get()");
            this.f10215u = 1;
            obj = ((e1.r) obj2).h(this.f10217w, 20, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return new Y0.b(obj);
    }
}
