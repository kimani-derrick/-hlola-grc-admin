package f1;

import W5.InterfaceC0116x;
import b1.C0361h;
import b1.CallableC0359f;
import k3.AbstractC0958a;
import x0.AbstractC1448d;
import z5.C1530l;
/* renamed from: f1.s  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0691s extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public int f10312u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ C0694v f10313v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ long f10314w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0691s(C0694v c0694v, long j7, D5.d dVar) {
        super(2, dVar);
        this.f10313v = c0694v;
        this.f10314w = j7;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new C0691s(this.f10313v, this.f10314w, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((C0691s) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        E5.a aVar = E5.a.f612q;
        int i7 = this.f10312u;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC0958a.H(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0958a.H(obj);
            C0361h c0361h = this.f10313v.f10324c;
            this.f10312u = 1;
            c0361h.getClass();
            if (AbstractC1448d.b(c0361h.f7059a, new CallableC0359f(0, this.f10314w, c0361h), this) == aVar) {
                return aVar;
            }
        }
        return new Y0.b(C1530l.f16479a);
    }
}
