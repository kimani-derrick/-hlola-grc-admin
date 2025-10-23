package s0;

import F5.i;
import L5.p;
import W5.InterfaceC0116x;
import k3.AbstractC0958a;
import t0.C1222c;
import z5.C1530l;
/* renamed from: s0.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1122a extends i implements p {

    /* renamed from: u  reason: collision with root package name */
    public int f13532u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ C1125d f13533v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1122a(C1125d c1125d, D5.d dVar) {
        super(2, dVar);
        this.f13533v = c1125d;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new C1122a(this.f13533v, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((C1122a) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        E5.a aVar = E5.a.f612q;
        int i7 = this.f13532u;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC0958a.H(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0958a.H(obj);
            C1222c c1222c = this.f13533v.f13541a;
            this.f13532u = 1;
            obj = c1222c.b(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}
