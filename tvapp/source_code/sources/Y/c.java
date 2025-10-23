package Y;

import F5.i;
import L5.p;
import k3.AbstractC0958a;
import z5.C1530l;
/* loaded from: classes.dex */
public final class c extends i implements p {

    /* renamed from: u  reason: collision with root package name */
    public int f4299u;

    /* renamed from: v  reason: collision with root package name */
    public /* synthetic */ Object f4300v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ p f4301w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(p pVar, D5.d dVar) {
        super(2, dVar);
        this.f4301w = pVar;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        c cVar = new c(this.f4301w, dVar);
        cVar.f4300v = obj;
        return cVar;
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((c) h((D5.d) obj2, (b) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        E5.a aVar = E5.a.f612q;
        int i7 = this.f4299u;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC0958a.H(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0958a.H(obj);
            this.f4299u = 1;
            obj = this.f4301w.j((b) this.f4300v, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        b bVar = (b) obj;
        bVar.f4298b.set(true);
        return bVar;
    }
}
