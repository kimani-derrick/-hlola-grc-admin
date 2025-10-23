package Z4;

import W5.InterfaceC0116x;
import com.google.android.gms.internal.measurement.K1;
import k3.AbstractC0958a;
import z5.C1530l;
/* renamed from: Z4.v  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0184v extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public int f4870u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ E f4871v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0184v(E e3, D5.d dVar) {
        super(2, dVar);
        this.f4871v = e3;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new C0184v(this.f4871v, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((C0184v) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        E5.a aVar = E5.a.f612q;
        int i7 = this.f4870u;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC0958a.H(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0958a.H(obj);
            E e3 = this.f4871v;
            K1 k12 = e3.d;
            V.u uVar = new V.u(1, e3);
            this.f4870u = 1;
            if (k12.t(uVar, this) == aVar) {
                return aVar;
            }
        }
        return C1530l.f16479a;
    }
}
