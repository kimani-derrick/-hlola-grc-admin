package s;

import java.util.Arrays;
import t.C1217c;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: o  reason: collision with root package name */
    public static int f13494o = 1000;

    /* renamed from: p  reason: collision with root package name */
    public static boolean f13495p = true;

    /* renamed from: b  reason: collision with root package name */
    public final g f13497b;

    /* renamed from: e  reason: collision with root package name */
    public c[] f13499e;

    /* renamed from: k  reason: collision with root package name */
    public final C4.b f13504k;
    public c n;

    /* renamed from: a  reason: collision with root package name */
    public int f13496a = 0;

    /* renamed from: c  reason: collision with root package name */
    public int f13498c = 32;
    public int d = 32;
    public boolean f = false;

    /* renamed from: g  reason: collision with root package name */
    public boolean[] f13500g = new boolean[32];

    /* renamed from: h  reason: collision with root package name */
    public int f13501h = 1;

    /* renamed from: i  reason: collision with root package name */
    public int f13502i = 0;

    /* renamed from: j  reason: collision with root package name */
    public int f13503j = 32;

    /* renamed from: l  reason: collision with root package name */
    public i[] f13505l = new i[f13494o];

    /* renamed from: m  reason: collision with root package name */
    public int f13506m = 0;

    /* JADX WARN: Type inference failed for: r1v2, types: [s.c, s.g] */
    public e() {
        c cVar;
        this.f13499e = null;
        this.f13499e = new c[32];
        q();
        C4.b bVar = new C4.b(19, false);
        bVar.f421r = new J.b();
        bVar.f422s = new J.b();
        bVar.f423t = new J.b();
        bVar.f424u = new i[32];
        this.f13504k = bVar;
        ?? cVar2 = new c(bVar);
        cVar2.f = new i[128];
        cVar2.f13509g = new i[128];
        cVar2.f13510h = 0;
        cVar2.f13511i = new f(cVar2);
        this.f13497b = cVar2;
        if (f13495p) {
            cVar = new d(bVar);
        } else {
            cVar = new c(bVar);
        }
        this.n = cVar;
    }

    public static int m(C1217c c1217c) {
        i iVar = c1217c.f14445g;
        if (iVar != null) {
            return (int) (iVar.f13516e + 0.5f);
        }
        return 0;
    }

    public final i a(int i7) {
        i iVar = (i) ((J.b) this.f13504k.f423t).a();
        if (iVar == null) {
            iVar = new i(i7);
        } else {
            iVar.c();
        }
        iVar.f13522l = i7;
        int i8 = this.f13506m;
        int i9 = f13494o;
        if (i8 >= i9) {
            int i10 = i9 * 2;
            f13494o = i10;
            this.f13505l = (i[]) Arrays.copyOf(this.f13505l, i10);
        }
        i[] iVarArr = this.f13505l;
        int i11 = this.f13506m;
        this.f13506m = i11 + 1;
        iVarArr[i11] = iVar;
        return iVar;
    }

    public final void b(i iVar, i iVar2, int i7, float f, i iVar3, i iVar4, int i8, int i9) {
        int i10;
        float f7;
        c k5 = k();
        if (iVar2 == iVar3) {
            k5.d.i(iVar, 1.0f);
            k5.d.i(iVar4, 1.0f);
            k5.d.i(iVar2, -2.0f);
        } else {
            if (f == 0.5f) {
                k5.d.i(iVar, 1.0f);
                k5.d.i(iVar2, -1.0f);
                k5.d.i(iVar3, -1.0f);
                k5.d.i(iVar4, 1.0f);
                if (i7 > 0 || i8 > 0) {
                    i10 = (-i7) + i8;
                    f7 = i10;
                }
            } else if (f <= 0.0f) {
                k5.d.i(iVar, -1.0f);
                k5.d.i(iVar2, 1.0f);
                f7 = i7;
            } else if (f >= 1.0f) {
                k5.d.i(iVar4, -1.0f);
                k5.d.i(iVar3, 1.0f);
                i10 = -i8;
                f7 = i10;
            } else {
                float f8 = 1.0f - f;
                k5.d.i(iVar, f8 * 1.0f);
                k5.d.i(iVar2, f8 * (-1.0f));
                k5.d.i(iVar3, (-1.0f) * f);
                k5.d.i(iVar4, 1.0f * f);
                if (i7 > 0 || i8 > 0) {
                    k5.f13491b = (i8 * f) + ((-i7) * f8);
                }
            }
            k5.f13491b = f7;
        }
        if (i9 != 8) {
            k5.a(this, i9);
        }
        c(k5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b9, code lost:
        if (r5.f13521k <= 1) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00bc, code lost:
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c6, code lost:
        if (r5.f13521k <= 1) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00db, code lost:
        if (r5.f13521k <= 1) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00de, code lost:
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00e8, code lost:
        if (r5.f13521k <= 1) goto L87;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(s.c r17) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s.e.c(s.c):void");
    }

    public final void d(i iVar, int i7) {
        c k5;
        InterfaceC1121b interfaceC1121b;
        float f;
        int i8 = iVar.f13515c;
        if (i8 == -1) {
            iVar.f13516e = i7;
            iVar.f = true;
            int i9 = iVar.f13520j;
            for (int i10 = 0; i10 < i9; i10++) {
                iVar.f13519i[i10].g(iVar, false);
            }
            iVar.f13520j = 0;
            return;
        }
        if (i8 != -1) {
            c cVar = this.f13499e[i8];
            if (!cVar.f13493e) {
                if (cVar.d.k() == 0) {
                    cVar.f13493e = true;
                } else {
                    k5 = k();
                    if (i7 < 0) {
                        k5.f13491b = i7 * (-1);
                        interfaceC1121b = k5.d;
                        f = 1.0f;
                    } else {
                        k5.f13491b = i7;
                        interfaceC1121b = k5.d;
                        f = -1.0f;
                    }
                    interfaceC1121b.i(iVar, f);
                }
            }
            cVar.f13491b = i7;
            return;
        }
        k5 = k();
        k5.f13490a = iVar;
        float f7 = i7;
        iVar.f13516e = f7;
        k5.f13491b = f7;
        k5.f13493e = true;
        c(k5);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(s.i r7, s.i r8, int r9, int r10) {
        /*
            r6 = this;
            r0 = 0
            r1 = 1
            r2 = 8
            if (r10 != r2) goto L29
            boolean r3 = r8.f
            if (r3 == 0) goto L29
            int r3 = r7.f13515c
            r4 = -1
            if (r3 != r4) goto L29
            float r8 = r8.f13516e
            float r9 = (float) r9
            float r8 = r8 + r9
            r7.f13516e = r8
            r7.f = r1
            int r8 = r7.f13520j
            r9 = r0
        L1a:
            if (r9 >= r8) goto L26
            s.c[] r10 = r7.f13519i
            r10 = r10[r9]
            r10.g(r7, r0)
            int r9 = r9 + 1
            goto L1a
        L26:
            r7.f13520j = r0
            return
        L29:
            s.c r3 = r6.k()
            r4 = 1065353216(0x3f800000, float:1.0)
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r9 == 0) goto L49
            if (r9 >= 0) goto L38
            int r9 = r9 * (-1)
            r0 = r1
        L38:
            float r9 = (float) r9
            r3.f13491b = r9
            if (r0 != 0) goto L3e
            goto L49
        L3e:
            s.b r9 = r3.d
            r9.i(r7, r4)
            s.b r7 = r3.d
            r7.i(r8, r5)
            goto L53
        L49:
            s.b r9 = r3.d
            r9.i(r7, r5)
            s.b r7 = r3.d
            r7.i(r8, r4)
        L53:
            if (r10 == r2) goto L58
            r3.a(r6, r10)
        L58:
            r6.c(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s.e.e(s.i, s.i, int, int):void");
    }

    public final void f(i iVar, i iVar2, int i7, int i8) {
        c k5 = k();
        i l7 = l();
        l7.d = 0;
        k5.b(iVar, iVar2, l7, i7);
        if (i8 != 8) {
            k5.d.i(i(i8), (int) (k5.d.e(l7) * (-1.0f)));
        }
        c(k5);
    }

    public final void g(i iVar, i iVar2, int i7, int i8) {
        c k5 = k();
        i l7 = l();
        l7.d = 0;
        k5.c(iVar, iVar2, l7, i7);
        if (i8 != 8) {
            k5.d.i(i(i8), (int) (k5.d.e(l7) * (-1.0f)));
        }
        c(k5);
    }

    public final void h(c cVar) {
        c cVar2;
        Object obj;
        boolean z7 = f13495p;
        C4.b bVar = this.f13504k;
        if (z7) {
            cVar2 = this.f13499e[this.f13502i];
            if (cVar2 != null) {
                obj = bVar.f421r;
                ((J.b) obj).b(cVar2);
            }
        } else {
            cVar2 = this.f13499e[this.f13502i];
            if (cVar2 != null) {
                obj = bVar.f422s;
                ((J.b) obj).b(cVar2);
            }
        }
        c[] cVarArr = this.f13499e;
        int i7 = this.f13502i;
        cVarArr[i7] = cVar;
        i iVar = cVar.f13490a;
        iVar.f13515c = i7;
        this.f13502i = i7 + 1;
        iVar.d(cVar);
    }

    public final i i(int i7) {
        if (this.f13501h + 1 >= this.d) {
            n();
        }
        i a7 = a(4);
        int i8 = this.f13496a + 1;
        this.f13496a = i8;
        this.f13501h++;
        a7.f13514b = i8;
        a7.d = i7;
        ((i[]) this.f13504k.f424u)[i8] = a7;
        g gVar = this.f13497b;
        gVar.f13511i.f13507q = a7;
        float[] fArr = a7.f13518h;
        Arrays.fill(fArr, 0.0f);
        fArr[a7.d] = 1.0f;
        gVar.i(a7);
        return a7;
    }

    public final i j(Object obj) {
        i iVar = null;
        if (obj == null) {
            return null;
        }
        if (this.f13501h + 1 >= this.d) {
            n();
        }
        if (obj instanceof C1217c) {
            C1217c c1217c = (C1217c) obj;
            iVar = c1217c.f14445g;
            if (iVar == null) {
                c1217c.f();
                iVar = c1217c.f14445g;
            }
            int i7 = iVar.f13514b;
            C4.b bVar = this.f13504k;
            if (i7 == -1 || i7 > this.f13496a || ((i[]) bVar.f424u)[i7] == null) {
                if (i7 != -1) {
                    iVar.c();
                }
                int i8 = this.f13496a + 1;
                this.f13496a = i8;
                this.f13501h++;
                iVar.f13514b = i8;
                iVar.f13522l = 1;
                ((i[]) bVar.f424u)[i8] = iVar;
            }
        }
        return iVar;
    }

    public final c k() {
        c cVar;
        boolean z7 = f13495p;
        C4.b bVar = this.f13504k;
        if (z7) {
            cVar = (c) ((J.b) bVar.f421r).a();
            if (cVar == null) {
                return new d(bVar);
            }
        } else {
            cVar = (c) ((J.b) bVar.f422s).a();
            if (cVar == null) {
                return new c(bVar);
            }
        }
        cVar.f13490a = null;
        cVar.d.clear();
        cVar.f13491b = 0.0f;
        cVar.f13493e = false;
        return cVar;
    }

    public final i l() {
        if (this.f13501h + 1 >= this.d) {
            n();
        }
        i a7 = a(3);
        int i7 = this.f13496a + 1;
        this.f13496a = i7;
        this.f13501h++;
        a7.f13514b = i7;
        ((i[]) this.f13504k.f424u)[i7] = a7;
        return a7;
    }

    public final void n() {
        int i7 = this.f13498c * 2;
        this.f13498c = i7;
        this.f13499e = (c[]) Arrays.copyOf(this.f13499e, i7);
        C4.b bVar = this.f13504k;
        bVar.f424u = (i[]) Arrays.copyOf((i[]) bVar.f424u, this.f13498c);
        int i8 = this.f13498c;
        this.f13500g = new boolean[i8];
        this.d = i8;
        this.f13503j = i8;
    }

    public final void o(g gVar) {
        C4.b bVar;
        int i7 = 0;
        while (true) {
            if (i7 >= this.f13502i) {
                break;
            }
            c cVar = this.f13499e[i7];
            int i8 = 1;
            if (cVar.f13490a.f13522l != 1) {
                float f = 0.0f;
                if (cVar.f13491b < 0.0f) {
                    boolean z7 = false;
                    int i9 = 0;
                    while (!z7) {
                        i9 += i8;
                        float f7 = Float.MAX_VALUE;
                        int i10 = -1;
                        int i11 = -1;
                        int i12 = 0;
                        int i13 = 0;
                        while (true) {
                            int i14 = this.f13502i;
                            bVar = this.f13504k;
                            if (i12 >= i14) {
                                break;
                            }
                            c cVar2 = this.f13499e[i12];
                            if (cVar2.f13490a.f13522l != i8 && !cVar2.f13493e && cVar2.f13491b < f) {
                                int i15 = i8;
                                while (i15 < this.f13501h) {
                                    i iVar = ((i[]) bVar.f424u)[i15];
                                    float e3 = cVar2.d.e(iVar);
                                    if (e3 > f) {
                                        for (int i16 = 0; i16 < 9; i16++) {
                                            float f8 = iVar.f13517g[i16] / e3;
                                            if ((f8 < f7 && i16 == i13) || i16 > i13) {
                                                i13 = i16;
                                                f7 = f8;
                                                i10 = i12;
                                                i11 = i15;
                                            }
                                        }
                                    }
                                    i15++;
                                    f = 0.0f;
                                }
                            }
                            i12++;
                            f = 0.0f;
                            i8 = 1;
                        }
                        if (i10 != -1) {
                            c cVar3 = this.f13499e[i10];
                            cVar3.f13490a.f13515c = -1;
                            cVar3.f(((i[]) bVar.f424u)[i11]);
                            i iVar2 = cVar3.f13490a;
                            iVar2.f13515c = i10;
                            iVar2.d(cVar3);
                        } else {
                            z7 = true;
                        }
                        if (i9 > this.f13501h / 2) {
                            z7 = true;
                        }
                        f = 0.0f;
                        i8 = 1;
                    }
                }
            }
            i7++;
        }
        p(gVar);
        for (int i17 = 0; i17 < this.f13502i; i17++) {
            c cVar4 = this.f13499e[i17];
            cVar4.f13490a.f13516e = cVar4.f13491b;
        }
    }

    public final void p(c cVar) {
        for (int i7 = 0; i7 < this.f13501h; i7++) {
            this.f13500g[i7] = false;
        }
        boolean z7 = false;
        int i8 = 0;
        while (!z7) {
            i8++;
            if (i8 >= this.f13501h * 2) {
                return;
            }
            i iVar = cVar.f13490a;
            if (iVar != null) {
                this.f13500g[iVar.f13514b] = true;
            }
            i d = cVar.d(this.f13500g);
            if (d != null) {
                boolean[] zArr = this.f13500g;
                int i9 = d.f13514b;
                if (zArr[i9]) {
                    return;
                }
                zArr[i9] = true;
            }
            if (d != null) {
                float f = Float.MAX_VALUE;
                int i10 = -1;
                for (int i11 = 0; i11 < this.f13502i; i11++) {
                    c cVar2 = this.f13499e[i11];
                    if (cVar2.f13490a.f13522l != 1 && !cVar2.f13493e && cVar2.d.f(d)) {
                        float e3 = cVar2.d.e(d);
                        if (e3 < 0.0f) {
                            float f7 = (-cVar2.f13491b) / e3;
                            if (f7 < f) {
                                i10 = i11;
                                f = f7;
                            }
                        }
                    }
                }
                if (i10 > -1) {
                    c cVar3 = this.f13499e[i10];
                    cVar3.f13490a.f13515c = -1;
                    cVar3.f(d);
                    i iVar2 = cVar3.f13490a;
                    iVar2.f13515c = i10;
                    iVar2.d(cVar3);
                }
            } else {
                z7 = true;
            }
        }
    }

    public final void q() {
        boolean z7 = f13495p;
        C4.b bVar = this.f13504k;
        int i7 = 0;
        if (z7) {
            while (true) {
                c[] cVarArr = this.f13499e;
                if (i7 < cVarArr.length) {
                    c cVar = cVarArr[i7];
                    if (cVar != null) {
                        ((J.b) bVar.f421r).b(cVar);
                    }
                    this.f13499e[i7] = null;
                    i7++;
                } else {
                    return;
                }
            }
        } else {
            while (true) {
                c[] cVarArr2 = this.f13499e;
                if (i7 < cVarArr2.length) {
                    c cVar2 = cVarArr2[i7];
                    if (cVar2 != null) {
                        ((J.b) bVar.f422s).b(cVar2);
                    }
                    this.f13499e[i7] = null;
                    i7++;
                } else {
                    return;
                }
            }
        }
    }

    public final void r() {
        C4.b bVar;
        c cVar;
        int i7 = 0;
        while (true) {
            bVar = this.f13504k;
            i[] iVarArr = (i[]) bVar.f424u;
            if (i7 >= iVarArr.length) {
                break;
            }
            i iVar = iVarArr[i7];
            if (iVar != null) {
                iVar.c();
            }
            i7++;
        }
        J.b bVar2 = (J.b) bVar.f423t;
        i[] iVarArr2 = this.f13505l;
        int i8 = this.f13506m;
        bVar2.getClass();
        if (i8 > iVarArr2.length) {
            i8 = iVarArr2.length;
        }
        for (int i9 = 0; i9 < i8; i9++) {
            i iVar2 = iVarArr2[i9];
            int i10 = bVar2.f1269c;
            Object[] objArr = bVar2.f1268b;
            if (i10 < objArr.length) {
                objArr[i10] = iVar2;
                bVar2.f1269c = i10 + 1;
            }
        }
        this.f13506m = 0;
        Arrays.fill((i[]) bVar.f424u, (Object) null);
        this.f13496a = 0;
        g gVar = this.f13497b;
        gVar.f13510h = 0;
        gVar.f13491b = 0.0f;
        this.f13501h = 1;
        for (int i11 = 0; i11 < this.f13502i; i11++) {
            this.f13499e[i11].getClass();
        }
        q();
        this.f13502i = 0;
        if (f13495p) {
            cVar = new d(bVar);
        } else {
            cVar = new c(bVar);
        }
        this.n = cVar;
    }
}
