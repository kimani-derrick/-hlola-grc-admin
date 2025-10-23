package androidx.lifecycle;

import W5.InterfaceC0116x;
import k3.AbstractC0958a;
import z5.C1530l;
/* loaded from: classes.dex */
public final class G extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public int f6742u;

    /* renamed from: v  reason: collision with root package name */
    public /* synthetic */ Object f6743v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ L5.p f6744w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(L5.p pVar, D5.d dVar) {
        super(2, dVar);
        this.f6744w = pVar;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        G g7 = new G(this.f6744w, dVar);
        g7.f6743v = obj;
        return g7;
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((G) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        E5.a aVar = E5.a.f612q;
        int i7 = this.f6742u;
        if (i7 == 0) {
            AbstractC0958a.H(obj);
            this.f6742u = 1;
            if (this.f6744w.j((InterfaceC0116x) this.f6743v, this) == aVar) {
                return aVar;
            }
        } else if (i7 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            AbstractC0958a.H(obj);
        }
        return C1530l.f16479a;
    }
}
