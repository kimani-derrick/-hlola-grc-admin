package a6;

import k3.AbstractC0958a;
import z5.C1530l;
/* loaded from: classes.dex */
public final class w extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public int f5244u;

    /* renamed from: v  reason: collision with root package name */
    public /* synthetic */ Object f5245v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Z5.c f5246w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(Z5.c cVar, D5.d dVar) {
        super(2, dVar);
        this.f5246w = cVar;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        w wVar = new w(this.f5246w, dVar);
        wVar.f5245v = obj;
        return wVar;
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((w) h((D5.d) obj2, obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        E5.a aVar = E5.a.f612q;
        int i7 = this.f5244u;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC0958a.H(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0958a.H(obj);
            Object obj2 = this.f5245v;
            this.f5244u = 1;
            if (this.f5246w.a(obj2, this) == aVar) {
                return aVar;
            }
        }
        return C1530l.f16479a;
    }
}
