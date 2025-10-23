package a6;

import K.C0029e;
import W5.InterfaceC0116x;
import k3.AbstractC0958a;
import z5.C1530l;
/* loaded from: classes.dex */
public final class h extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public int f5211u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ C0029e f5212v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Z5.c f5213w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ Object f5214x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(C0029e c0029e, Z5.c cVar, Object obj, D5.d dVar) {
        super(2, dVar);
        this.f5212v = c0029e;
        this.f5213w = cVar;
        this.f5214x = obj;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new h(this.f5212v, this.f5213w, this.f5214x, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((h) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        E5.a aVar = E5.a.f612q;
        int i7 = this.f5211u;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC0958a.H(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0958a.H(obj);
            this.f5211u = 1;
            if (((L5.q) this.f5212v.f1480v).f(this.f5213w, this.f5214x, this) == aVar) {
                return aVar;
            }
        }
        return C1530l.f16479a;
    }
}
