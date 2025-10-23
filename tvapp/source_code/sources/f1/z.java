package f1;

import W5.InterfaceC0116x;
import a1.C0197a;
import k3.AbstractC0958a;
import z5.C1530l;
/* loaded from: classes.dex */
public final class z extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ C0660A f10332u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ String f10333v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(C0660A c0660a, String str, D5.d dVar) {
        super(2, dVar);
        this.f10332u = c0660a;
        this.f10333v = str;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new z(this.f10332u, this.f10333v, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((z) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        AbstractC0958a.H(obj);
        C0197a c0197a = this.f10332u.f10207c;
        M5.g.f(c0197a, "<this>");
        String str = this.f10333v;
        M5.g.f(str, "value");
        String z7 = g6.o.f10858a.z();
        B0.a aVar = (B0.a) c0197a.f4980a.edit();
        aVar.putString(z7, str);
        aVar.apply();
        return new Y0.b(C1530l.f16479a);
    }
}
