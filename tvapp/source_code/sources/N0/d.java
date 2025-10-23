package N0;

import L5.p;
import M0.m;
import M5.o;
import W5.InterfaceC0116x;
import k3.AbstractC0958a;
import z5.C1530l;
/* loaded from: classes.dex */
public final class d extends F5.i implements p {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ o f2342A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ J0.c f2343B;

    /* renamed from: u  reason: collision with root package name */
    public int f2344u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ i f2345v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ o f2346w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ o f2347x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ S0.g f2348y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Object f2349z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(i iVar, o oVar, o oVar2, S0.g gVar, Object obj, o oVar3, J0.c cVar, D5.d dVar) {
        super(2, dVar);
        this.f2345v = iVar;
        this.f2346w = oVar;
        this.f2347x = oVar2;
        this.f2348y = gVar;
        this.f2349z = obj;
        this.f2342A = oVar3;
        this.f2343B = cVar;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new d(this.f2345v, this.f2346w, this.f2347x, this.f2348y, this.f2349z, this.f2342A, this.f2343B, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((d) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        E5.a aVar = E5.a.f612q;
        int i7 = this.f2344u;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC0958a.H(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0958a.H(obj);
            this.f2344u = 1;
            obj = i.a(this.f2345v, (m) this.f2346w.f2315q, (J0.b) this.f2347x.f2315q, this.f2348y, this.f2349z, (S0.k) this.f2342A.f2315q, this.f2343B, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}
