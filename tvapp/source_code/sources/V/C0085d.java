package V;

import java.util.List;
import k3.AbstractC0958a;
import z5.C1530l;
/* renamed from: V.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0085d extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public int f3539u;

    /* renamed from: v  reason: collision with root package name */
    public /* synthetic */ Object f3540v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ List f3541w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0085d(List list, D5.d dVar) {
        super(2, dVar);
        this.f3541w = list;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        C0085d c0085d = new C0085d(this.f3541w, dVar);
        c0085d.f3540v = obj;
        return c0085d;
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((C0085d) h((D5.d) obj2, (z) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        E5.a aVar = E5.a.f612q;
        int i7 = this.f3539u;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC0958a.H(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0958a.H(obj);
            L4.f fVar = AbstractC0089h.f3554a;
            this.f3539u = 1;
            if (L4.f.F(fVar, this.f3541w, (z) this.f3540v, this) == aVar) {
                return aVar;
            }
        }
        return C1530l.f16479a;
    }
}
