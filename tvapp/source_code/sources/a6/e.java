package a6;

import K.C0029e;
import W5.AbstractC0117y;
import W5.InterfaceC0116x;
import k3.AbstractC0958a;
import z5.C1530l;
/* loaded from: classes.dex */
public final class e extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public int f5201u;

    /* renamed from: v  reason: collision with root package name */
    public /* synthetic */ Object f5202v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Z5.c f5203w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ C0029e f5204x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(D5.d dVar, C0029e c0029e, Z5.c cVar) {
        super(2, dVar);
        this.f5203w = cVar;
        this.f5204x = c0029e;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        e eVar = new e(dVar, this.f5204x, this.f5203w);
        eVar.f5202v = obj;
        return eVar;
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((e) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        E5.a aVar = E5.a.f612q;
        int i7 = this.f5201u;
        C1530l c1530l = C1530l.f16479a;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC0958a.H(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0958a.H(obj);
            InterfaceC0116x interfaceC0116x = (InterfaceC0116x) this.f5202v;
            C0029e c0029e = this.f5204x;
            int i8 = c0029e.f1477s;
            if (i8 == -3) {
                i8 = -2;
            }
            L5.p fVar = new f(c0029e, null);
            Y5.n nVar = new Y5.n(AbstractC0117y.q(interfaceC0116x, (D5.i) c0029e.f1476r), Y5.i.a(i8, c0029e.f1478t, 4));
            nVar.d0(3, nVar, fVar);
            this.f5201u = 1;
            Object f = Z5.s.f(this.f5203w, nVar, true, this);
            if (f != aVar) {
                f = c1530l;
            }
            if (f == aVar) {
                return aVar;
            }
        }
        return c1530l;
    }
}
