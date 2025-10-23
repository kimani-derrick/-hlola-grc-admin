package W5;

import k3.AbstractC0958a;
import z5.C1530l;
/* loaded from: classes.dex */
public final class J extends e0 {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f3948u;

    /* renamed from: v  reason: collision with root package name */
    public final Object f3949v;

    public /* synthetic */ J(int i7, Object obj) {
        this.f3948u = i7;
        this.f3949v = obj;
    }

    @Override // L5.l
    public final /* bridge */ /* synthetic */ Object c(Object obj) {
        switch (this.f3948u) {
            case 0:
                p((Throwable) obj);
                return C1530l.f16479a;
            case 1:
                p((Throwable) obj);
                return C1530l.f16479a;
            case 2:
                p((Throwable) obj);
                return C1530l.f16479a;
            default:
                p((Throwable) obj);
                return C1530l.f16479a;
        }
    }

    @Override // W5.e0
    public final void p(Throwable th) {
        Object w7;
        switch (this.f3948u) {
            case 0:
                ((I) this.f3949v).d();
                return;
            case 1:
                ((L5.l) this.f3949v).c(th);
                return;
            case 2:
                Object K6 = o().K();
                boolean z7 = K6 instanceof C0109p;
                C0100g c0100g = (C0100g) this.f3949v;
                if (z7) {
                    w7 = AbstractC0958a.m(((C0109p) K6).f4012a);
                } else {
                    w7 = AbstractC0117y.w(K6);
                }
                c0100g.m(w7);
                return;
            default:
                ((D5.d) this.f3949v).m(C1530l.f16479a);
                return;
        }
    }
}
