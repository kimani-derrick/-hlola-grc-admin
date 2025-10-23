package e2;

import H2.AbstractC0014o;
/* loaded from: classes.dex */
public final class y0 extends AbstractC0014o {

    /* renamed from: s  reason: collision with root package name */
    public final I0 f10096s;

    public y0(J0 j02) {
        super(j02);
        this.f10096s = new I0();
    }

    @Override // H2.AbstractC0014o, e2.J0
    public final H0 g(int i7, H0 h02, boolean z7) {
        J0 j02 = this.f1149r;
        H0 g7 = j02.g(i7, h02, z7);
        if (j02.n(g7.f9554s, this.f10096s, 0L).a()) {
            g7.j(h02.f9552q, h02.f9553r, h02.f9554s, h02.f9555t, h02.f9556u, I2.b.f1233w, true);
        } else {
            g7.f9557v = true;
        }
        return g7;
    }
}
