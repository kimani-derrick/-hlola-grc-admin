package t;

import com.google.android.gms.internal.measurement.AbstractC0515y1;
import r0.AbstractC1111a;
import s.i;
/* renamed from: t.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1215a extends C1218d {

    /* renamed from: d0  reason: collision with root package name */
    public C1218d[] f14422d0;

    /* renamed from: e0  reason: collision with root package name */
    public int f14423e0;

    /* renamed from: f0  reason: collision with root package name */
    public int f14424f0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f14425g0;

    /* renamed from: h0  reason: collision with root package name */
    public int f14426h0;

    @Override // t.C1218d
    public final void a(s.e eVar) {
        boolean z7;
        boolean z8;
        boolean z9;
        int i7;
        i iVar;
        C1217c c1217c;
        int i8;
        int i9;
        int i10;
        C1217c[] c1217cArr = this.F;
        C1217c c1217c2 = this.f14493x;
        c1217cArr[0] = c1217c2;
        C1217c c1217c3 = this.f14494y;
        int i11 = 2;
        c1217cArr[2] = c1217c3;
        C1217c c1217c4 = this.f14495z;
        c1217cArr[1] = c1217c4;
        C1217c c1217c5 = this.f14446A;
        c1217cArr[3] = c1217c5;
        for (C1217c c1217c6 : c1217cArr) {
            c1217c6.f14445g = eVar.j(c1217c6);
        }
        int i12 = this.f14424f0;
        if (i12 >= 0 && i12 < 4) {
            C1217c c1217c7 = c1217cArr[i12];
            for (int i13 = 0; i13 < this.f14423e0; i13++) {
                C1218d c1218d = this.f14422d0[i13];
                if ((this.f14425g0 || c1218d.b()) && ((((i10 = this.f14424f0) == 0 || i10 == 1) && c1218d.f14475c0[0] == 3 && c1218d.f14493x.d != null && c1218d.f14495z.d != null) || ((i10 == 2 || i10 == 3) && c1218d.f14475c0[1] == 3 && c1218d.f14494y.d != null && c1218d.f14446A.d != null))) {
                    z7 = true;
                    break;
                }
            }
            z7 = false;
            if (!c1217c2.c() && !c1217c4.c()) {
                z8 = false;
            } else {
                z8 = true;
            }
            if (!c1217c3.c() && !c1217c5.c()) {
                z9 = false;
            } else {
                z9 = true;
            }
            if (!z7 && (((i9 = this.f14424f0) == 0 && z8) || ((i9 == 2 && z9) || ((i9 == 1 && z8) || (i9 == 3 && z9))))) {
                i7 = 5;
            } else {
                i7 = 4;
            }
            int i14 = 0;
            while (i14 < this.f14423e0) {
                C1218d c1218d2 = this.f14422d0[i14];
                if (this.f14425g0 || c1218d2.b()) {
                    i j7 = eVar.j(c1218d2.F[this.f14424f0]);
                    int i15 = this.f14424f0;
                    C1217c c1217c8 = c1218d2.F[i15];
                    c1217c8.f14445g = j7;
                    C1217c c1217c9 = c1217c8.d;
                    if (c1217c9 != null && c1217c9.f14442b == this) {
                        i8 = c1217c8.f14444e;
                    } else {
                        i8 = 0;
                    }
                    if (i15 != 0 && i15 != i11) {
                        s.c k5 = eVar.k();
                        i l7 = eVar.l();
                        l7.d = 0;
                        k5.b(c1217c7.f14445g, j7, l7, this.f14426h0 + i8);
                        eVar.c(k5);
                    } else {
                        s.c k7 = eVar.k();
                        i l8 = eVar.l();
                        l8.d = 0;
                        k7.c(c1217c7.f14445g, j7, l8, this.f14426h0 - i8);
                        eVar.c(k7);
                    }
                    eVar.e(c1217c7.f14445g, j7, this.f14426h0 + i8, i7);
                }
                i14++;
                i11 = 2;
            }
            int i16 = this.f14424f0;
            if (i16 == 0) {
                eVar.e(c1217c4.f14445g, c1217c2.f14445g, 0, 8);
                eVar.e(c1217c2.f14445g, this.f14453I.f14495z.f14445g, 0, 4);
                iVar = c1217c2.f14445g;
                c1217c = this.f14453I.f14493x;
            } else if (i16 == 1) {
                eVar.e(c1217c2.f14445g, c1217c4.f14445g, 0, 8);
                eVar.e(c1217c2.f14445g, this.f14453I.f14493x.f14445g, 0, 4);
                iVar = c1217c2.f14445g;
                c1217c = this.f14453I.f14495z;
            } else if (i16 == 2) {
                eVar.e(c1217c5.f14445g, c1217c3.f14445g, 0, 8);
                eVar.e(c1217c3.f14445g, this.f14453I.f14446A.f14445g, 0, 4);
                iVar = c1217c3.f14445g;
                c1217c = this.f14453I.f14494y;
            } else if (i16 == 3) {
                eVar.e(c1217c3.f14445g, c1217c5.f14445g, 0, 8);
                eVar.e(c1217c3.f14445g, this.f14453I.f14494y.f14445g, 0, 4);
                iVar = c1217c3.f14445g;
                c1217c = this.f14453I.f14446A;
            } else {
                return;
            }
            eVar.e(iVar, c1217c.f14445g, 0, 0);
        }
    }

    @Override // t.C1218d
    public final boolean b() {
        return true;
    }

    @Override // t.C1218d
    public final String toString() {
        String t5 = AbstractC1111a.t(new StringBuilder("[Barrier] "), this.W, " {");
        for (int i7 = 0; i7 < this.f14423e0; i7++) {
            C1218d c1218d = this.f14422d0[i7];
            if (i7 > 0) {
                t5 = AbstractC0515y1.m(t5, ", ");
            }
            t5 = t5 + c1218d.W;
        }
        return AbstractC0515y1.m(t5, "}");
    }
}
