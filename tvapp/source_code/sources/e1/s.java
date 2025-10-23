package e1;

import W5.InterfaceC0116x;
import java.util.Map;
import k3.AbstractC0958a;
import x5.C1467a;
import z5.C1530l;
/* loaded from: classes.dex */
public final class s extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public int f9413u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ C0575i f9414v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ H.e f9415w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(C0575i c0575i, H.e eVar, D5.d dVar) {
        super(2, dVar);
        this.f9414v = c0575i;
        this.f9415w = eVar;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new s(this.f9414v, this.f9415w, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((s) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        E5.a aVar = E5.a.f612q;
        int i7 = this.f9413u;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC0958a.H(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0958a.H(obj);
            this.f9413u = 1;
            obj = ((C0580n) ((C1467a) this.f9414v.f9380b).get()).a(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            this.f9415w.o((String) entry.getKey(), (String) entry.getValue());
        }
        return C1530l.f16479a;
    }
}
