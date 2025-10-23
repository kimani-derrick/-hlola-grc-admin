package Z5;

import k3.AbstractC0958a;
import z5.C1530l;
/* loaded from: classes.dex */
public final class j extends F5.i implements L5.q {

    /* renamed from: u  reason: collision with root package name */
    public int f4909u;

    /* renamed from: v  reason: collision with root package name */
    public /* synthetic */ c f4910v;

    /* renamed from: w  reason: collision with root package name */
    public /* synthetic */ Object f4911w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ L5.p f4912x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(L5.p pVar, D5.d dVar) {
        super(3, dVar);
        this.f4912x = pVar;
    }

    @Override // L5.q
    public final Object f(c cVar, Object obj, Object obj2) {
        j jVar = new j(this.f4912x, (D5.d) obj2);
        jVar.f4910v = cVar;
        jVar.f4911w = obj;
        return jVar.p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        c cVar;
        E5.a aVar = E5.a.f612q;
        int i7 = this.f4909u;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 == 2) {
                    AbstractC0958a.H(obj);
                    return C1530l.f16479a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cVar = this.f4910v;
            AbstractC0958a.H(obj);
        } else {
            AbstractC0958a.H(obj);
            cVar = this.f4910v;
            Object obj2 = this.f4911w;
            this.f4910v = cVar;
            this.f4909u = 1;
            obj = this.f4912x.j(obj2, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        this.f4910v = null;
        this.f4909u = 2;
        if (cVar.a(obj, this) == aVar) {
            return aVar;
        }
        return C1530l.f16479a;
    }
}
