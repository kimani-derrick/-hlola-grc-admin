package k1;

import F1.t;
import h6.F;
import h6.G;
import h6.I;
import h6.u;
/* renamed from: k1.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0933f implements u {

    /* renamed from: a  reason: collision with root package name */
    public t f12135a;

    @Override // h6.u
    public final G a(m6.e eVar) {
        C0929b c0929b;
        G b7 = eVar.b(eVar.f12450e);
        I i7 = b7.f11101w;
        if (i7 == null) {
            c0929b = null;
        } else {
            c0929b = new C0929b(i7, this.f12135a);
        }
        F h7 = b7.h();
        h7.f11084g = c0929b;
        return h7.a();
    }
}
