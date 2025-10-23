package f1;

import W5.InterfaceC0116x;
import b1.C0358e;
import b1.CallableC0357d;
import c1.C0388b;
import k3.AbstractC0958a;
import x0.AbstractC1448d;
import z5.C1530l;
/* renamed from: f1.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0673a extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public int f10240u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ C0694v f10241v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ C0388b f10242w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0673a(C0694v c0694v, C0388b c0388b, D5.d dVar) {
        super(2, dVar);
        this.f10241v = c0694v;
        this.f10242w = c0388b;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new C0673a(this.f10241v, this.f10242w, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((C0673a) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        E5.a aVar = E5.a.f612q;
        int i7 = this.f10240u;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC0958a.H(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0958a.H(obj);
            C0358e c0358e = this.f10241v.d;
            this.f10240u = 1;
            c0358e.getClass();
            if (AbstractC1448d.b(c0358e.f7051a, new CallableC0357d(c0358e, 0, this.f10242w), this) == aVar) {
                return aVar;
            }
        }
        return new Y0.b(C1530l.f16479a);
    }
}
