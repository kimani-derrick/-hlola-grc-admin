package f1;

import W5.InterfaceC0116x;
import k3.AbstractC0958a;
import w4.l0;
import z5.C1530l;
/* renamed from: f1.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0685m extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public int f10283u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ C0694v f10284v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ long f10285w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0685m(C0694v c0694v, long j7, D5.d dVar) {
        super(2, dVar);
        this.f10284v = c0694v;
        this.f10285w = j7;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new C0685m(this.f10284v, this.f10285w, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((C0685m) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        E5.a aVar = E5.a.f612q;
        int i7 = this.f10283u;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC0958a.H(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0958a.H(obj);
            C0694v c0694v = this.f10284v;
            this.f10283u = 1;
            obj = c0694v.f10322a.b().e(l0.s(c0694v.f10323b) + g6.o.f10858a.E() + this.f10285w, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return new Y0.b(obj);
    }
}
