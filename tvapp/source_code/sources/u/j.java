package u;

import java.util.ArrayList;
import t.C1215a;
import t.C1217c;
import t.C1218d;
/* loaded from: classes.dex */
public final class j extends m {

    /* renamed from: k  reason: collision with root package name */
    public static final int[] f14630k = new int[2];

    public static void m(int[] iArr, int i7, int i8, int i9, int i10, float f, int i11) {
        int i12 = i8 - i7;
        int i13 = i10 - i9;
        if (i11 != -1) {
            if (i11 != 0) {
                if (i11 == 1) {
                    iArr[0] = i12;
                    iArr[1] = (int) ((i12 * f) + 0.5f);
                    return;
                }
                return;
            }
            iArr[0] = (int) ((i13 * f) + 0.5f);
            iArr[1] = i13;
            return;
        }
        int i14 = (int) ((i13 * f) + 0.5f);
        int i15 = (int) ((i12 / f) + 0.5f);
        if (i14 <= i12) {
            iArr[0] = i14;
            iArr[1] = i13;
        } else if (i15 <= i13) {
            iArr[0] = i12;
            iArr[1] = i15;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x0233, code lost:
        if (r3 != 1) goto L127;
     */
    @Override // u.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(u.d r24) {
        /*
            Method dump skipped, instructions count: 876
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u.j.a(u.d):void");
    }

    @Override // u.m
    public final void d() {
        C1218d c1218d;
        C1218d c1218d2;
        C1218d c1218d3;
        C1217c c1217c;
        ArrayList arrayList;
        C1218d c1218d4;
        C1218d c1218d5 = this.f14636b;
        boolean z7 = c1218d5.f14470a;
        g gVar = this.f14638e;
        if (z7) {
            gVar.d(c1218d5.j());
        }
        boolean z8 = gVar.f14626j;
        f fVar = this.f14641i;
        f fVar2 = this.f14640h;
        if (!z8) {
            C1218d c1218d6 = this.f14636b;
            int i7 = c1218d6.f14475c0[0];
            this.d = i7;
            if (i7 != 3) {
                if (i7 == 4 && (((c1218d4 = c1218d6.f14453I) != null && c1218d4.f14475c0[0] == 1) || c1218d4.f14475c0[0] == 4)) {
                    int j7 = (c1218d4.j() - this.f14636b.f14493x.b()) - this.f14636b.f14495z.b();
                    j jVar = c1218d4.d;
                    m.b(fVar2, jVar.f14640h, this.f14636b.f14493x.b());
                    m.b(fVar, jVar.f14641i, -this.f14636b.f14495z.b());
                    gVar.d(j7);
                    return;
                } else if (i7 == 1) {
                    gVar.d(c1218d6.j());
                }
            }
        } else if (this.d == 4 && (((c1218d2 = (c1218d = this.f14636b).f14453I) != null && c1218d2.f14475c0[0] == 1) || c1218d2.f14475c0[0] == 4)) {
            m.b(fVar2, c1218d2.d.f14640h, c1218d.f14493x.b());
            m.b(fVar, c1218d2.d.f14641i, -this.f14636b.f14495z.b());
            return;
        }
        if (gVar.f14626j) {
            C1218d c1218d7 = this.f14636b;
            if (c1218d7.f14470a) {
                C1217c[] c1217cArr = c1218d7.F;
                C1217c c1217c2 = c1217cArr[0];
                C1217c c1217c3 = c1217c2.d;
                if (c1217c3 != null && c1217cArr[1].d != null) {
                    if (c1218d7.o()) {
                        fVar2.f = this.f14636b.F[0].b();
                        c1217c = this.f14636b.F[1];
                        fVar.f = -c1217c.b();
                        return;
                    }
                    f h7 = m.h(this.f14636b.F[0]);
                    if (h7 != null) {
                        m.b(fVar2, h7, this.f14636b.F[0].b());
                    }
                    f h8 = m.h(this.f14636b.F[1]);
                    if (h8 != null) {
                        m.b(fVar, h8, -this.f14636b.F[1].b());
                    }
                    fVar2.f14620b = true;
                    fVar.f14620b = true;
                    return;
                }
                if (c1217c3 != null) {
                    f h9 = m.h(c1217c2);
                    if (h9 != null) {
                        m.b(fVar2, h9, this.f14636b.F[0].b());
                    } else {
                        return;
                    }
                } else {
                    C1217c c1217c4 = c1217cArr[1];
                    if (c1217c4.d != null) {
                        f h10 = m.h(c1217c4);
                        if (h10 != null) {
                            m.b(fVar, h10, -this.f14636b.F[1].b());
                            m.b(fVar2, fVar, -gVar.f14623g);
                            return;
                        }
                        return;
                    } else if (!(c1218d7 instanceof C1215a) && c1218d7.f14453I != null && c1218d7.e(7).d == null) {
                        C1218d c1218d8 = this.f14636b;
                        m.b(fVar2, c1218d8.f14453I.d.f14640h, c1218d8.k());
                    } else {
                        return;
                    }
                }
                m.b(fVar, fVar2, gVar.f14623g);
                return;
            }
        }
        if (this.d == 3) {
            C1218d c1218d9 = this.f14636b;
            int i8 = c1218d9.f14480j;
            if (i8 != 2) {
                if (i8 == 3) {
                    if (c1218d9.f14481k == 3) {
                        fVar2.f14619a = this;
                        fVar.f14619a = this;
                        l lVar = c1218d9.f14476e;
                        lVar.f14640h.f14619a = this;
                        lVar.f14641i.f14619a = this;
                        gVar.f14619a = this;
                        if (c1218d9.p()) {
                            gVar.f14628l.add(this.f14636b.f14476e.f14638e);
                            this.f14636b.f14476e.f14638e.f14627k.add(gVar);
                            l lVar2 = this.f14636b.f14476e;
                            lVar2.f14638e.f14619a = this;
                            gVar.f14628l.add(lVar2.f14640h);
                            gVar.f14628l.add(this.f14636b.f14476e.f14641i);
                            this.f14636b.f14476e.f14640h.f14627k.add(gVar);
                            arrayList = this.f14636b.f14476e.f14641i.f14627k;
                        } else if (this.f14636b.o()) {
                            this.f14636b.f14476e.f14638e.f14628l.add(gVar);
                            gVar.f14627k.add(this.f14636b.f14476e.f14638e);
                        } else {
                            arrayList = this.f14636b.f14476e.f14638e.f14628l;
                        }
                    } else {
                        g gVar2 = c1218d9.f14476e.f14638e;
                        gVar.f14628l.add(gVar2);
                        gVar2.f14627k.add(gVar);
                        this.f14636b.f14476e.f14640h.f14627k.add(gVar);
                        this.f14636b.f14476e.f14641i.f14627k.add(gVar);
                        gVar.f14620b = true;
                        gVar.f14627k.add(fVar2);
                        gVar.f14627k.add(fVar);
                        fVar2.f14628l.add(gVar);
                        arrayList = fVar.f14628l;
                    }
                    arrayList.add(gVar);
                }
            } else {
                C1218d c1218d10 = c1218d9.f14453I;
                if (c1218d10 != null) {
                    g gVar3 = c1218d10.f14476e.f14638e;
                    gVar.f14628l.add(gVar3);
                    gVar3.f14627k.add(gVar);
                    gVar.f14620b = true;
                    gVar.f14627k.add(fVar2);
                    gVar.f14627k.add(fVar);
                }
            }
        }
        C1218d c1218d11 = this.f14636b;
        C1217c[] c1217cArr2 = c1218d11.F;
        C1217c c1217c5 = c1217cArr2[0];
        C1217c c1217c6 = c1217c5.d;
        if (c1217c6 != null && c1217cArr2[1].d != null) {
            if (c1218d11.o()) {
                fVar2.f = this.f14636b.F[0].b();
                c1217c = this.f14636b.F[1];
                fVar.f = -c1217c.b();
                return;
            }
            f h11 = m.h(this.f14636b.F[0]);
            f h12 = m.h(this.f14636b.F[1]);
            h11.b(this);
            h12.b(this);
            this.f14642j = 4;
            return;
        }
        if (c1217c6 != null) {
            f h13 = m.h(c1217c5);
            if (h13 != null) {
                m.b(fVar2, h13, this.f14636b.F[0].b());
            } else {
                return;
            }
        } else {
            C1217c c1217c7 = c1217cArr2[1];
            if (c1217c7.d != null) {
                f h14 = m.h(c1217c7);
                if (h14 != null) {
                    m.b(fVar, h14, -this.f14636b.F[1].b());
                    c(fVar2, fVar, -1, gVar);
                    return;
                }
                return;
            } else if (!(c1218d11 instanceof C1215a) && (c1218d3 = c1218d11.f14453I) != null) {
                m.b(fVar2, c1218d3.d.f14640h, c1218d11.k());
            } else {
                return;
            }
        }
        c(fVar, fVar2, 1, gVar);
    }

    @Override // u.m
    public final void e() {
        f fVar = this.f14640h;
        if (fVar.f14626j) {
            this.f14636b.f14458N = fVar.f14623g;
        }
    }

    @Override // u.m
    public final void f() {
        this.f14637c = null;
        this.f14640h.c();
        this.f14641i.c();
        this.f14638e.c();
        this.f14639g = false;
    }

    @Override // u.m
    public final boolean k() {
        if (this.d != 3 || this.f14636b.f14480j == 0) {
            return true;
        }
        return false;
    }

    public final void n() {
        this.f14639g = false;
        f fVar = this.f14640h;
        fVar.c();
        fVar.f14626j = false;
        f fVar2 = this.f14641i;
        fVar2.c();
        fVar2.f14626j = false;
        this.f14638e.f14626j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f14636b.W;
    }
}
