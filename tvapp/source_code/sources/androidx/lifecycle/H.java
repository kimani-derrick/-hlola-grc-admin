package androidx.lifecycle;

import W5.AbstractC0117y;
import W5.InterfaceC0116x;
import k3.AbstractC0958a;
import z5.C1530l;
/* loaded from: classes.dex */
public final class H extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public e6.a f6745u;

    /* renamed from: v  reason: collision with root package name */
    public L5.p f6746v;

    /* renamed from: w  reason: collision with root package name */
    public int f6747w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ e6.a f6748x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ L5.p f6749y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(e6.a aVar, L5.p pVar, D5.d dVar) {
        super(2, dVar);
        this.f6748x = aVar;
        this.f6749y = pVar;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new H(this.f6748x, this.f6749y, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((H) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [e6.a] */
    @Override // F5.a
    public final Object p(Object obj) {
        L5.p pVar;
        e6.d dVar;
        e6.a aVar;
        Throwable th;
        E5.a aVar2 = E5.a.f612q;
        int i7 = this.f6747w;
        try {
            if (i7 == 0) {
                AbstractC0958a.H(obj);
                e6.a aVar3 = this.f6748x;
                this.f6745u = aVar3;
                pVar = this.f6749y;
                this.f6746v = pVar;
                this.f6747w = 1;
                dVar = (e6.d) aVar3;
                if (dVar.d(this) == aVar2) {
                    return aVar2;
                }
            } else if (i7 != 1) {
                if (i7 == 2) {
                    aVar = this.f6745u;
                    try {
                        AbstractC0958a.H(obj);
                        ((e6.d) aVar).e(null);
                        return C1530l.f16479a;
                    } catch (Throwable th2) {
                        th = th2;
                        ((e6.d) aVar).e(null);
                        throw th;
                    }
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                pVar = this.f6746v;
                ?? r3 = this.f6745u;
                AbstractC0958a.H(obj);
                dVar = r3;
            }
            G g7 = new G(pVar, null);
            this.f6745u = dVar;
            this.f6746v = null;
            this.f6747w = 2;
            if (AbstractC0117y.e(g7, this) == aVar2) {
                return aVar2;
            }
            aVar = dVar;
            ((e6.d) aVar).e(null);
            return C1530l.f16479a;
        } catch (Throwable th3) {
            aVar = dVar;
            th = th3;
            ((e6.d) aVar).e(null);
            throw th;
        }
    }
}
