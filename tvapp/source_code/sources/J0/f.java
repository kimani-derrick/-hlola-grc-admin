package J0;

import L5.p;
import W5.InterfaceC0116x;
import k3.AbstractC0958a;
import z5.C1530l;
/* loaded from: classes.dex */
public final class f extends F5.i implements p {

    /* renamed from: u  reason: collision with root package name */
    public int f1280u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ j f1281v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ S0.g f1282w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(j jVar, S0.g gVar, D5.d dVar) {
        super(2, dVar);
        this.f1281v = jVar;
        this.f1282w = gVar;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new f(this.f1281v, this.f1282w, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((f) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        E5.a aVar = E5.a.f612q;
        int i7 = this.f1280u;
        j jVar = this.f1281v;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC0958a.H(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0958a.H(obj);
            this.f1280u = 1;
            obj = j.a(jVar, this.f1282w, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        if (((S0.h) obj) instanceof S0.c) {
            jVar.getClass();
        }
        return obj;
    }
}
