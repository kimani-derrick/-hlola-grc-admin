package n1;

import W5.AbstractC0117y;
import W5.InterfaceC0116x;
import k3.AbstractC0958a;
import z5.C1530l;
/* renamed from: n1.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1029d extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public int f12625u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ L1.m f12626v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1029d(L1.m mVar, D5.d dVar) {
        super(2, dVar);
        this.f12626v = mVar;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new C1029d(this.f12626v, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((C1029d) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        long d;
        E5.a aVar = E5.a.f612q;
        int i7 = this.f12625u;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC0958a.H(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0958a.H(obj);
            int i8 = V5.a.f3731t;
            long C02 = android.support.v4.media.session.b.C0(1, V5.c.MINUTES);
            C1028c c1028c = new C1028c(this.f12626v, null);
            this.f12625u = 1;
            long j7 = 0;
            if (V5.a.b(C02, 0L) > 0) {
                if ((((int) C02) & 1) == 1 && (!V5.a.c(C02))) {
                    d = C02 >> 1;
                } else {
                    d = V5.a.d(C02, V5.c.MILLISECONDS);
                }
                if (d < 1) {
                    j7 = 1;
                } else {
                    j7 = d;
                }
            }
            if (AbstractC0117y.z(j7, c1028c, this) == aVar) {
                return aVar;
            }
        }
        return C1530l.f16479a;
    }
}
