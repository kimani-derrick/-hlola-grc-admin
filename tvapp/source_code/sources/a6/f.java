package a6;

import K.C0029e;
import k3.AbstractC0958a;
import z5.C1530l;
/* loaded from: classes.dex */
public final class f extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public int f5205u;

    /* renamed from: v  reason: collision with root package name */
    public /* synthetic */ Object f5206v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ C0029e f5207w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(C0029e c0029e, D5.d dVar) {
        super(2, dVar);
        this.f5207w = c0029e;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        f fVar = new f(this.f5207w, dVar);
        fVar.f5206v = obj;
        return fVar;
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((f) h((D5.d) obj2, (Y5.o) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        E5.a aVar = E5.a.f612q;
        int i7 = this.f5205u;
        C1530l c1530l = C1530l.f16479a;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC0958a.H(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0958a.H(obj);
            this.f5205u = 1;
            C0029e c0029e = this.f5207w;
            c0029e.getClass();
            Object b7 = c0029e.b(new u((Y5.o) this.f5206v), this);
            if (b7 != aVar) {
                b7 = c1530l;
            }
            if (b7 == aVar) {
                return aVar;
            }
        }
        return c1530l;
    }
}
