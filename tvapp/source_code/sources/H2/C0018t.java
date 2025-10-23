package H2;

import e2.H0;
import e2.I0;
import e2.J0;
/* renamed from: H2.t  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0018t extends J0 {

    /* renamed from: r  reason: collision with root package name */
    public final e2.Z f1167r;

    public C0018t(e2.Z z7) {
        this.f1167r = z7;
    }

    @Override // e2.J0
    public final int b(Object obj) {
        if (obj == C0017s.f1164u) {
            return 0;
        }
        return -1;
    }

    @Override // e2.J0
    public final H0 g(int i7, H0 h02, boolean z7) {
        Integer num;
        Object obj = null;
        if (z7) {
            num = 0;
        } else {
            num = null;
        }
        if (z7) {
            obj = C0017s.f1164u;
        }
        h02.j(num, obj, 0, -9223372036854775807L, 0L, I2.b.f1233w, true);
        return h02;
    }

    @Override // e2.J0
    public final int i() {
        return 1;
    }

    @Override // e2.J0
    public final Object m(int i7) {
        return C0017s.f1164u;
    }

    @Override // e2.J0
    public final I0 n(int i7, I0 i02, long j7) {
        i02.b(I0.f9561H, this.f1167r, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
        i02.f9577B = true;
        return i02;
    }

    @Override // e2.J0
    public final int p() {
        return 1;
    }
}
