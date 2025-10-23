package f1;

import W5.InterfaceC0116x;
import com.boxhdo.android.data.model.response.ResultResponse;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import e1.InterfaceC0567a;
import java.util.List;
import k3.AbstractC0958a;
import w4.l0;
import z5.C1530l;
/* renamed from: f1.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0682j extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public int f10273u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ C0694v f10274v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0682j(C0694v c0694v, D5.d dVar) {
        super(2, dVar);
        this.f10274v = c0694v;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new C0682j(this.f10274v, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((C0682j) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        E5.a aVar = E5.a.f612q;
        int i7 = this.f10273u;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC0958a.H(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0958a.H(obj);
            C0694v c0694v = this.f10274v;
            InterfaceC0567a b7 = c0694v.f10322a.b();
            String m7 = AbstractC0515y1.m(l0.s(c0694v.f10323b), g6.o.f10858a.m());
            this.f10273u = 1;
            obj = b7.f(m7, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        Object obj2 = (List) ((ResultResponse) obj).f7636a;
        if (obj2 == null) {
            obj2 = A5.t.f135q;
        }
        return new Y0.b(obj2);
    }
}
