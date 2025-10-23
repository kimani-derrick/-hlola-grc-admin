package b5;

import A5.w;
import L5.p;
import W5.InterfaceC0116x;
import Z5.s;
import java.util.Collections;
import java.util.Map;
import k3.AbstractC0958a;
import z5.C1530l;
/* loaded from: classes.dex */
public final class k extends F5.i implements p {

    /* renamed from: u  reason: collision with root package name */
    public n f7161u;

    /* renamed from: v  reason: collision with root package name */
    public int f7162v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ n f7163w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(n nVar, D5.d dVar) {
        super(2, dVar);
        this.f7163w = nVar;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new k(this.f7163w, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((k) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        n nVar;
        E5.a aVar = E5.a.f612q;
        int i7 = this.f7162v;
        if (i7 != 0) {
            if (i7 == 1) {
                nVar = this.f7161u;
                AbstractC0958a.H(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0958a.H(obj);
            n nVar2 = this.f7163w;
            Z5.b D6 = nVar2.f7174a.D();
            this.f7161u = nVar2;
            this.f7162v = 1;
            Object g7 = s.g(D6, this);
            if (g7 == aVar) {
                return aVar;
            }
            nVar = nVar2;
            obj = g7;
        }
        Map unmodifiableMap = Collections.unmodifiableMap(((Y.b) obj).f4297a);
        M5.g.e(unmodifiableMap, "unmodifiableMap(preferencesMap)");
        n.a(nVar, new Y.b(w.P(unmodifiableMap), true));
        return C1530l.f16479a;
    }
}
