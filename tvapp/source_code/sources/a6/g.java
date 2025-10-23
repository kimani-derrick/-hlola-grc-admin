package a6;

import K.C0029e;
import k3.AbstractC0958a;
import z5.C1530l;
/* loaded from: classes.dex */
public final class g extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public int f5208u;

    /* renamed from: v  reason: collision with root package name */
    public /* synthetic */ Object f5209v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ C0029e f5210w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(C0029e c0029e, D5.d dVar) {
        super(2, dVar);
        this.f5210w = c0029e;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        g gVar = new g(this.f5210w, dVar);
        gVar.f5209v = obj;
        return gVar;
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((g) h((D5.d) obj2, (Z5.c) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        E5.a aVar = E5.a.f612q;
        int i7 = this.f5208u;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC0958a.H(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0958a.H(obj);
            this.f5208u = 1;
            if (this.f5210w.b((Z5.c) this.f5209v, this) == aVar) {
                return aVar;
            }
        }
        return C1530l.f16479a;
    }
}
