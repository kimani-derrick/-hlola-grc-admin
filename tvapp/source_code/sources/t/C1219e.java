package t;

import g2.O;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import s.i;
import u.j;
import u.l;
import u.m;
/* renamed from: t.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1219e extends C1218d {

    /* renamed from: d0  reason: collision with root package name */
    public ArrayList f14496d0 = new ArrayList();

    /* renamed from: e0  reason: collision with root package name */
    public final g5.b f14497e0 = new g5.b(this);

    /* renamed from: f0  reason: collision with root package name */
    public final u.e f14498f0;

    /* renamed from: g0  reason: collision with root package name */
    public O f14499g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f14500h0;

    /* renamed from: i0  reason: collision with root package name */
    public final s.e f14501i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f14502j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f14503k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f14504l0;

    /* renamed from: m0  reason: collision with root package name */
    public int f14505m0;

    /* renamed from: n0  reason: collision with root package name */
    public C1216b[] f14506n0;

    /* renamed from: o0  reason: collision with root package name */
    public C1216b[] f14507o0;

    /* renamed from: p0  reason: collision with root package name */
    public int f14508p0;

    /* renamed from: q0  reason: collision with root package name */
    public boolean f14509q0;

    /* renamed from: r0  reason: collision with root package name */
    public boolean f14510r0;

    public C1219e() {
        u.e eVar = new u.e();
        eVar.f14613b = true;
        eVar.f14614c = true;
        eVar.f = new ArrayList();
        new ArrayList();
        eVar.f14617h = null;
        eVar.f14618i = new Object();
        eVar.f14616g = new ArrayList();
        eVar.d = this;
        eVar.f14615e = this;
        this.f14498f0 = eVar;
        this.f14499g0 = null;
        this.f14500h0 = false;
        this.f14501i0 = new s.e();
        this.f14504l0 = 0;
        this.f14505m0 = 0;
        this.f14506n0 = new C1216b[4];
        this.f14507o0 = new C1216b[4];
        this.f14508p0 = 263;
        this.f14509q0 = false;
        this.f14510r0 = false;
    }

    public final boolean A(int i7, boolean z7) {
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11 = z7 & true;
        u.e eVar = this.f14498f0;
        C1219e c1219e = (C1219e) eVar.d;
        int f = c1219e.f(0);
        int f7 = c1219e.f(1);
        int k5 = c1219e.k();
        int l7 = c1219e.l();
        ArrayList arrayList = (ArrayList) eVar.f;
        l lVar = c1219e.f14476e;
        j jVar = c1219e.d;
        if (z11 && (f == 2 || f7 == 2)) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                m mVar = (m) it.next();
                if (mVar.f == i7 && !mVar.k()) {
                    z11 = false;
                    break;
                }
            }
            if (i7 == 0) {
                if (z11 && f == 2) {
                    c1219e.t(1);
                    c1219e.v(eVar.d(c1219e, 0));
                    jVar.f14638e.d(c1219e.j());
                }
            } else if (z11 && f7 == 2) {
                c1219e.u(1);
                c1219e.s(eVar.d(c1219e, 1));
                lVar.f14638e.d(c1219e.g());
            }
        }
        int[] iArr = c1219e.f14475c0;
        if (i7 == 0) {
            int i8 = iArr[0];
            if (i8 != 1 && i8 != 4) {
                z8 = true;
                z9 = false;
            } else {
                int j7 = c1219e.j() + k5;
                jVar.f14641i.d(j7);
                jVar.f14638e.d(j7 - k5);
                z9 = true;
                z8 = true;
            }
        } else {
            z8 = true;
            int i9 = iArr[1];
            if (i9 == 1 || i9 == 4) {
                int g7 = c1219e.g() + l7;
                lVar.f14641i.d(g7);
                lVar.f14638e.d(g7 - l7);
                z9 = true;
            }
            z9 = false;
        }
        eVar.g();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            m mVar2 = (m) it2.next();
            if (mVar2.f == i7 && (mVar2.f14636b != c1219e || mVar2.f14639g)) {
                mVar2.e();
            }
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            m mVar3 = (m) it3.next();
            if (mVar3.f == i7 && (z9 || mVar3.f14636b != c1219e)) {
                if (!mVar3.f14640h.f14626j || !mVar3.f14641i.f14626j || (!(mVar3 instanceof u.c) && !mVar3.f14638e.f14626j)) {
                    z10 = false;
                    break;
                }
            }
        }
        z10 = z8;
        c1219e.t(f);
        c1219e.u(f7);
        return z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fc A[LOOP:5: B:59:0x00fa->B:60:0x00fc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01c0  */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B() {
        /*
            Method dump skipped, instructions count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t.C1219e.B():void");
    }

    @Override // t.C1218d
    public final void q() {
        this.f14501i0.r();
        this.f14502j0 = 0;
        this.f14503k0 = 0;
        this.f14496d0.clear();
        super.q();
    }

    @Override // t.C1218d
    public final void r(C4.b bVar) {
        super.r(bVar);
        int size = this.f14496d0.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((C1218d) this.f14496d0.get(i7)).r(bVar);
        }
    }

    @Override // t.C1218d
    public final void w(boolean z7, boolean z8) {
        super.w(z7, z8);
        int size = this.f14496d0.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((C1218d) this.f14496d0.get(i7)).w(z7, z8);
        }
    }

    public final void y(C1218d c1218d, int i7) {
        if (i7 == 0) {
            int i8 = this.f14504l0 + 1;
            C1216b[] c1216bArr = this.f14507o0;
            if (i8 >= c1216bArr.length) {
                this.f14507o0 = (C1216b[]) Arrays.copyOf(c1216bArr, c1216bArr.length * 2);
            }
            C1216b[] c1216bArr2 = this.f14507o0;
            int i9 = this.f14504l0;
            c1216bArr2[i9] = new C1216b(c1218d, 0, this.f14500h0);
            this.f14504l0 = i9 + 1;
        } else if (i7 == 1) {
            int i10 = this.f14505m0 + 1;
            C1216b[] c1216bArr3 = this.f14506n0;
            if (i10 >= c1216bArr3.length) {
                this.f14506n0 = (C1216b[]) Arrays.copyOf(c1216bArr3, c1216bArr3.length * 2);
            }
            C1216b[] c1216bArr4 = this.f14506n0;
            int i11 = this.f14505m0;
            c1216bArr4[i11] = new C1216b(c1218d, 1, this.f14500h0);
            this.f14505m0 = i11 + 1;
        }
    }

    public final void z(s.e eVar) {
        a(eVar);
        int size = this.f14496d0.size();
        boolean z7 = false;
        for (int i7 = 0; i7 < size; i7++) {
            C1218d c1218d = (C1218d) this.f14496d0.get(i7);
            boolean[] zArr = c1218d.f14452H;
            zArr[0] = false;
            zArr[1] = false;
            if (c1218d instanceof C1215a) {
                z7 = true;
            }
        }
        if (z7) {
            for (int i8 = 0; i8 < size; i8++) {
                C1218d c1218d2 = (C1218d) this.f14496d0.get(i8);
                if (c1218d2 instanceof C1215a) {
                    C1215a c1215a = (C1215a) c1218d2;
                    for (int i9 = 0; i9 < c1215a.f14423e0; i9++) {
                        C1218d c1218d3 = c1215a.f14422d0[i9];
                        int i10 = c1215a.f14424f0;
                        if (i10 != 0 && i10 != 1) {
                            if (i10 == 2 || i10 == 3) {
                                c1218d3.f14452H[1] = true;
                            }
                        } else {
                            c1218d3.f14452H[0] = true;
                        }
                    }
                }
            }
        }
        for (int i11 = 0; i11 < size; i11++) {
            C1218d c1218d4 = (C1218d) this.f14496d0.get(i11);
            c1218d4.getClass();
            if (c1218d4 instanceof f) {
                c1218d4.a(eVar);
            }
        }
        for (int i12 = 0; i12 < size; i12++) {
            C1218d c1218d5 = (C1218d) this.f14496d0.get(i12);
            if (c1218d5 instanceof C1219e) {
                int[] iArr = c1218d5.f14475c0;
                int i13 = iArr[0];
                int i14 = iArr[1];
                if (i13 == 2) {
                    c1218d5.t(1);
                }
                if (i14 == 2) {
                    c1218d5.u(1);
                }
                c1218d5.a(eVar);
                if (i13 == 2) {
                    c1218d5.t(i13);
                }
                if (i14 == 2) {
                    c1218d5.u(i14);
                }
            } else {
                c1218d5.f14478h = -1;
                c1218d5.f14479i = -1;
                int[] iArr2 = this.f14475c0;
                int i15 = iArr2[0];
                int[] iArr3 = c1218d5.f14475c0;
                if (i15 != 2 && iArr3[0] == 4) {
                    C1217c c1217c = c1218d5.f14493x;
                    int i16 = c1217c.f14444e;
                    int j7 = j();
                    C1217c c1217c2 = c1218d5.f14495z;
                    int i17 = j7 - c1217c2.f14444e;
                    c1217c.f14445g = eVar.j(c1217c);
                    c1217c2.f14445g = eVar.j(c1217c2);
                    eVar.d(c1217c.f14445g, i16);
                    eVar.d(c1217c2.f14445g, i17);
                    c1218d5.f14478h = 2;
                    c1218d5.f14458N = i16;
                    int i18 = i17 - i16;
                    c1218d5.f14454J = i18;
                    int i19 = c1218d5.f14461Q;
                    if (i18 < i19) {
                        c1218d5.f14454J = i19;
                    }
                }
                if (iArr2[1] != 2 && iArr3[1] == 4) {
                    C1217c c1217c3 = c1218d5.f14494y;
                    int i20 = c1217c3.f14444e;
                    int g7 = g();
                    C1217c c1217c4 = c1218d5.f14446A;
                    int i21 = g7 - c1217c4.f14444e;
                    c1217c3.f14445g = eVar.j(c1217c3);
                    c1217c4.f14445g = eVar.j(c1217c4);
                    eVar.d(c1217c3.f14445g, i20);
                    eVar.d(c1217c4.f14445g, i21);
                    if (c1218d5.f14460P > 0 || c1218d5.f14466V == 8) {
                        C1217c c1217c5 = c1218d5.f14447B;
                        i j8 = eVar.j(c1217c5);
                        c1217c5.f14445g = j8;
                        eVar.d(j8, c1218d5.f14460P + i20);
                    }
                    c1218d5.f14479i = 2;
                    c1218d5.f14459O = i20;
                    int i22 = i21 - i20;
                    c1218d5.f14455K = i22;
                    int i23 = c1218d5.f14462R;
                    if (i22 < i23) {
                        c1218d5.f14455K = i23;
                    }
                }
                if (!(c1218d5 instanceof f)) {
                    c1218d5.a(eVar);
                }
            }
        }
        if (this.f14504l0 > 0) {
            g.a(this, eVar, 0);
        }
        if (this.f14505m0 > 0) {
            g.a(this, eVar, 1);
        }
    }
}
