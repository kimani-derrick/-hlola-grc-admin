package Y;

import A5.w;
import F5.i;
import L5.p;
import java.util.Collections;
import java.util.Map;
import k3.AbstractC0958a;
import z5.C1530l;
/* loaded from: classes.dex */
public final class f extends i implements p {

    /* renamed from: u  reason: collision with root package name */
    public int f4303u;

    /* renamed from: v  reason: collision with root package name */
    public /* synthetic */ Object f4304v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ p f4305w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(p pVar, D5.d dVar) {
        super(2, dVar);
        this.f4305w = pVar;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        f fVar = new f(this.f4305w, dVar);
        fVar.f4304v = obj;
        return fVar;
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((f) h((D5.d) obj2, (b) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        E5.a aVar = E5.a.f612q;
        int i7 = this.f4303u;
        if (i7 != 0) {
            if (i7 == 1) {
                b bVar = (b) this.f4304v;
                AbstractC0958a.H(obj);
                return bVar;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC0958a.H(obj);
        Map unmodifiableMap = Collections.unmodifiableMap(((b) this.f4304v).f4297a);
        M5.g.e(unmodifiableMap, "unmodifiableMap(preferencesMap)");
        b bVar2 = new b(w.P(unmodifiableMap), false);
        this.f4304v = bVar2;
        this.f4303u = 1;
        if (this.f4305w.j(bVar2, this) == aVar) {
            return aVar;
        }
        return bVar2;
    }
}
