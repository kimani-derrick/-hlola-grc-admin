package androidx.leanback.widget;

import androidx.datastore.preferences.protobuf.C0230i;
/* loaded from: classes.dex */
public final class H0 extends r {

    /* renamed from: j  reason: collision with root package name */
    public C0230i f6384j;

    /* renamed from: k  reason: collision with root package name */
    public int f6385k;

    /* renamed from: l  reason: collision with root package name */
    public Object f6386l;

    /* renamed from: m  reason: collision with root package name */
    public int f6387m;

    @Override // androidx.leanback.widget.r
    public final boolean b(int i7, boolean z7) {
        Object[] objArr = this.f6641a;
        if (this.f6642b.r() == 0) {
            return false;
        }
        if (!z7 && c(i7)) {
            return false;
        }
        try {
            if (o(i7, z7)) {
                objArr[0] = null;
                this.f6386l = null;
                return true;
            }
            return q(i7, z7);
        } finally {
            objArr[0] = null;
            this.f6386l = null;
        }
    }

    @Override // androidx.leanback.widget.r
    public final int f(int i7, boolean z7, int[] iArr) {
        int i8;
        int s6 = this.f6642b.s(i7);
        G0 k5 = k(i7);
        int i9 = k5.f259q;
        if (this.f6643c) {
            i8 = i9;
            int i10 = i8;
            int i11 = 1;
            int i12 = s6;
            for (int i13 = i7 + 1; i11 < this.f6644e && i13 <= this.f6645g; i13++) {
                G0 k7 = k(i13);
                i12 += k7.f6371r;
                int i14 = k7.f259q;
                if (i14 != i10) {
                    i11++;
                    if (!z7 ? i12 < s6 : i12 > s6) {
                        s6 = i12;
                        i7 = i13;
                        i8 = i14;
                        i10 = i8;
                    } else {
                        i10 = i14;
                    }
                }
            }
        } else {
            int i15 = 1;
            int i16 = i9;
            G0 g02 = k5;
            int i17 = s6;
            s6 = this.f6642b.u(i7) + s6;
            i8 = i16;
            for (int i18 = i7 - 1; i15 < this.f6644e && i18 >= this.f; i18--) {
                i17 -= g02.f6371r;
                g02 = k(i18);
                int i19 = g02.f259q;
                if (i19 != i16) {
                    i15++;
                    int u7 = this.f6642b.u(i18) + i17;
                    if (!z7 ? u7 < s6 : u7 > s6) {
                        s6 = u7;
                        i7 = i18;
                        i8 = i19;
                        i16 = i8;
                    } else {
                        i16 = i19;
                    }
                }
            }
        }
        if (iArr != null) {
            iArr[0] = i8;
            iArr[1] = i7;
        }
        return s6;
    }

    @Override // androidx.leanback.widget.r
    public final int h(int i7, boolean z7, int[] iArr) {
        int i8;
        int s6 = this.f6642b.s(i7);
        G0 k5 = k(i7);
        int i9 = k5.f259q;
        if (this.f6643c) {
            int i10 = 1;
            i8 = s6 - this.f6642b.u(i7);
            int i11 = i9;
            for (int i12 = i7 - 1; i10 < this.f6644e && i12 >= this.f; i12--) {
                s6 -= k5.f6371r;
                k5 = k(i12);
                int i13 = k5.f259q;
                if (i13 != i11) {
                    i10++;
                    int u7 = s6 - this.f6642b.u(i12);
                    if (!z7 ? u7 < i8 : u7 > i8) {
                        i8 = u7;
                        i7 = i12;
                        i9 = i13;
                        i11 = i9;
                    } else {
                        i11 = i13;
                    }
                }
            }
        } else {
            int i14 = i9;
            int i15 = i14;
            int i16 = 1;
            int i17 = s6;
            for (int i18 = i7 + 1; i16 < this.f6644e && i18 <= this.f6645g; i18++) {
                G0 k7 = k(i18);
                i17 += k7.f6371r;
                int i19 = k7.f259q;
                if (i19 != i15) {
                    i16++;
                    if (!z7 ? i17 < s6 : i17 > s6) {
                        s6 = i17;
                        i7 = i18;
                        i14 = i19;
                        i15 = i14;
                    } else {
                        i15 = i19;
                    }
                }
            }
            i8 = s6;
            i9 = i14;
        }
        if (iArr != null) {
            iArr[0] = i9;
            iArr[1] = i7;
        }
        return i8;
    }

    @Override // androidx.leanback.widget.r
    public final O2.e[] j(int i7, int i8) {
        for (int i9 = 0; i9 < this.f6644e; i9++) {
            this.f6646h[i9].f2559a = 0;
        }
        if (i7 >= 0) {
            while (i7 <= i8) {
                O2.e eVar = this.f6646h[k(i7).f259q];
                int i10 = eVar.f2559a;
                int i11 = eVar.f2560b;
                if ((i10 & i11) > 0) {
                    if (i10 != 0) {
                        int i12 = i11 & (i10 - 1);
                        if (((int[]) eVar.f2561c)[i12] == i7 - 1) {
                            if (i10 != 0) {
                                eVar.f2559a = i12;
                                eVar.d(i7);
                                i7++;
                            } else {
                                throw new ArrayIndexOutOfBoundsException();
                            }
                        }
                    } else {
                        throw new ArrayIndexOutOfBoundsException();
                    }
                }
                eVar.d(i7);
                eVar.d(i7);
                i7++;
            }
        }
        return this.f6646h;
    }

    @Override // androidx.leanback.widget.r
    public final void l(int i7) {
        super.l(i7);
        C0230i c0230i = this.f6384j;
        c0230i.b0((s() - i7) + 1);
        if (c0230i.h0() == 0) {
            this.f6385k = -1;
        }
    }

    @Override // androidx.leanback.widget.r
    public final boolean m(int i7, boolean z7) {
        Object[] objArr = this.f6641a;
        if (this.f6642b.r() == 0) {
            return false;
        }
        if (!z7 && d(i7)) {
            return false;
        }
        try {
            if (w(i7, z7)) {
                objArr[0] = null;
                this.f6386l = null;
                return true;
            }
            return y(i7, z7);
        } finally {
            objArr[0] = null;
            this.f6386l = null;
        }
    }

    public final boolean o(int i7, boolean z7) {
        int i8;
        int i9;
        int i10;
        C0230i c0230i = this.f6384j;
        if (c0230i.h0() == 0) {
            return false;
        }
        int r3 = this.f6642b.r();
        int i11 = this.f6645g;
        if (i11 >= 0) {
            i8 = i11 + 1;
            i9 = this.f6642b.s(i11);
        } else {
            int i12 = this.f6647i;
            if (i12 != -1) {
                i8 = i12;
            } else {
                i8 = 0;
            }
            if (i8 <= s() + 1 && i8 >= this.f6385k) {
                if (i8 > s()) {
                    return false;
                }
                i9 = Integer.MAX_VALUE;
            } else {
                c0230i.c0(c0230i.h0());
                return false;
            }
        }
        int s6 = s();
        int i13 = i8;
        while (i13 < r3 && i13 <= s6) {
            G0 k5 = k(i13);
            if (i9 != Integer.MAX_VALUE) {
                i9 += k5.f6371r;
            }
            int i14 = k5.f259q;
            Z5.n nVar = this.f6642b;
            Object[] objArr = this.f6641a;
            int q5 = nVar.q(i13, true, objArr, false);
            if (q5 != k5.f6372s) {
                k5.f6372s = q5;
                c0230i.b0(s6 - i13);
                i10 = i13;
            } else {
                i10 = s6;
            }
            this.f6645g = i13;
            if (this.f < 0) {
                this.f = i13;
            }
            this.f6642b.o(objArr[0], i13, q5, i14, i9);
            if (!z7 && c(i7)) {
                return true;
            }
            if (i9 == Integer.MAX_VALUE) {
                i9 = this.f6642b.s(i13);
            }
            if (i14 == this.f6644e - 1 && z7) {
                return true;
            }
            i13++;
            s6 = i10;
        }
        return false;
    }

    public final int p(int i7, int i8, int i9) {
        int s6;
        int i10 = this.f6645g;
        if (i10 >= 0 && (i10 != s() || this.f6645g != i7 - 1)) {
            throw new IllegalStateException();
        }
        int i11 = this.f6645g;
        C0230i c0230i = this.f6384j;
        if (i11 < 0) {
            if (c0230i.h0() > 0 && i7 == s() + 1) {
                int s7 = s();
                while (true) {
                    if (s7 >= this.f6385k) {
                        if (k(s7).f259q == i8) {
                            break;
                        }
                        s7--;
                    } else {
                        s7 = s();
                        break;
                    }
                }
                if (this.f6643c) {
                    s6 = (-k(s7).f6372s) - this.d;
                } else {
                    s6 = k(s7).f6372s + this.d;
                }
                for (int i12 = s7 + 1; i12 <= s(); i12++) {
                    s6 -= k(i12).f6371r;
                }
            } else {
                s6 = 0;
            }
        } else {
            s6 = i9 - this.f6642b.s(i11);
        }
        G0 g02 = new G0(i8, s6);
        int i13 = c0230i.f5783c;
        ((Object[]) c0230i.f5784e)[i13] = g02;
        int i14 = c0230i.d & (i13 + 1);
        c0230i.f5783c = i14;
        if (i14 == c0230i.f5782b) {
            c0230i.e();
        }
        Object obj = this.f6386l;
        if (obj != null) {
            g02.f6372s = this.f6387m;
            this.f6386l = null;
        } else {
            Z5.n nVar = this.f6642b;
            Object[] objArr = this.f6641a;
            g02.f6372s = nVar.q(i7, true, objArr, false);
            obj = objArr[0];
        }
        Object obj2 = obj;
        if (c0230i.h0() == 1) {
            this.f6645g = i7;
            this.f = i7;
            this.f6385k = i7;
        } else {
            int i15 = this.f6645g;
            if (i15 < 0) {
                this.f6645g = i7;
                this.f = i7;
            } else {
                this.f6645g = i15 + 1;
            }
        }
        this.f6642b.o(obj2, i7, g02.f6372s, i8, i9);
        return g02.f6372s;
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x012f, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0147, code lost:
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00c1, code lost:
        if (r13.f6643c != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00c3, code lost:
        r10 = -r13.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00c7, code lost:
        r10 = r13.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00e6, code lost:
        if (r13.f6643c != false) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0100 A[LOOP:2: B:85:0x0100->B:101:0x0124, LOOP_START, PHI: r6 r9 r10 
      PHI: (r6v12 int) = (r6v6 int), (r6v16 int) binds: [B:84:0x00fe, B:101:0x0124] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r9v20 int) = (r9v18 int), (r9v21 int) binds: [B:84:0x00fe, B:101:0x0124] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r10v6 int) = (r10v4 int), (r10v8 int) binds: [B:84:0x00fe, B:101:0x0124] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean q(int r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.H0.q(int, boolean):boolean");
    }

    public final int r(boolean z7) {
        boolean z8 = false;
        if (z7) {
            for (int i7 = this.f6645g; i7 >= this.f; i7--) {
                int i8 = k(i7).f259q;
                if (i8 == 0) {
                    z8 = true;
                } else if (z8 && i8 == this.f6644e - 1) {
                    return i7;
                }
            }
            return -1;
        }
        for (int i9 = this.f; i9 <= this.f6645g; i9++) {
            int i10 = k(i9).f259q;
            if (i10 == this.f6644e - 1) {
                z8 = true;
            } else if (z8 && i10 == 0) {
                return i9;
            }
        }
        return -1;
    }

    public final int s() {
        return (this.f6384j.h0() + this.f6385k) - 1;
    }

    @Override // androidx.leanback.widget.r
    /* renamed from: t */
    public final G0 k(int i7) {
        int i8 = i7 - this.f6385k;
        if (i8 >= 0) {
            C0230i c0230i = this.f6384j;
            if (i8 < c0230i.h0()) {
                if (i8 >= 0) {
                    if (i8 < c0230i.h0()) {
                        Object obj = ((Object[]) c0230i.f5784e)[c0230i.d & (c0230i.f5782b + i8)];
                        M5.g.c(obj);
                        return (G0) obj;
                    }
                } else {
                    c0230i.getClass();
                }
                throw new ArrayIndexOutOfBoundsException();
            }
            return null;
        }
        return null;
    }

    public final int u(int i7) {
        int i8;
        G0 k5;
        int i9 = this.f;
        if (i9 < 0) {
            return Integer.MIN_VALUE;
        }
        if (this.f6643c) {
            int s6 = this.f6642b.s(i9);
            if (k(this.f).f259q == i7) {
                return s6;
            }
            int i10 = this.f;
            do {
                i10++;
                if (i10 <= s()) {
                    k5 = k(i10);
                    s6 += k5.f6371r;
                }
            } while (k5.f259q != i7);
            return s6;
        }
        int s7 = this.f6642b.s(this.f6645g);
        G0 k7 = k(this.f6645g);
        if (k7.f259q == i7) {
            i8 = k7.f6372s;
        } else {
            int i11 = this.f6645g;
            while (true) {
                i11--;
                if (i11 < this.f6385k) {
                    break;
                }
                s7 -= k7.f6371r;
                k7 = k(i11);
                if (k7.f259q == i7) {
                    i8 = k7.f6372s;
                    break;
                }
            }
        }
        return s7 + i8;
        return Integer.MIN_VALUE;
    }

    public final int v(int i7) {
        G0 k5;
        int i8;
        int i9 = this.f;
        if (i9 < 0) {
            return Integer.MAX_VALUE;
        }
        if (this.f6643c) {
            int s6 = this.f6642b.s(this.f6645g);
            G0 k7 = k(this.f6645g);
            if (k7.f259q == i7) {
                i8 = k7.f6372s;
            } else {
                int i10 = this.f6645g;
                while (true) {
                    i10--;
                    if (i10 < this.f6385k) {
                        break;
                    }
                    s6 -= k7.f6371r;
                    k7 = k(i10);
                    if (k7.f259q == i7) {
                        i8 = k7.f6372s;
                        break;
                    }
                }
            }
            return s6 - i8;
        }
        int s7 = this.f6642b.s(i9);
        if (k(this.f).f259q == i7) {
            return s7;
        }
        int i11 = this.f;
        do {
            i11++;
            if (i11 <= s()) {
                k5 = k(i11);
                s7 += k5.f6371r;
            }
        } while (k5.f259q != i7);
        return s7;
        return Integer.MAX_VALUE;
    }

    public final boolean w(int i7, boolean z7) {
        int i8;
        int i9;
        int i10;
        C0230i c0230i = this.f6384j;
        if (c0230i.h0() == 0) {
            return false;
        }
        int i11 = this.f;
        if (i11 >= 0) {
            i9 = this.f6642b.s(i11);
            i10 = k(this.f).f6371r;
            i8 = this.f - 1;
        } else {
            int i12 = this.f6647i;
            if (i12 != -1) {
                i8 = i12;
            } else {
                i8 = 0;
            }
            if (i8 <= s()) {
                int i13 = this.f6385k;
                if (i8 >= i13 - 1) {
                    if (i8 < i13) {
                        return false;
                    }
                    i9 = Integer.MAX_VALUE;
                    i10 = 0;
                }
            }
            c0230i.c0(c0230i.h0());
            return false;
        }
        int max = Math.max(((C0321y) this.f6642b.f4918q).f6707u, this.f6385k);
        while (i8 >= max) {
            G0 k5 = k(i8);
            int i14 = k5.f259q;
            Z5.n nVar = this.f6642b;
            Object[] objArr = this.f6641a;
            int q5 = nVar.q(i8, false, objArr, false);
            if (q5 != k5.f6372s) {
                c0230i.c0((i8 + 1) - this.f6385k);
                this.f6385k = this.f;
                this.f6386l = objArr[0];
                this.f6387m = q5;
                return false;
            }
            this.f = i8;
            if (this.f6645g < 0) {
                this.f6645g = i8;
            }
            this.f6642b.o(objArr[0], i8, q5, i14, i9 - i10);
            if (!z7 && d(i7)) {
                return true;
            }
            i9 = this.f6642b.s(i8);
            i10 = k5.f6371r;
            if (i14 == 0 && z7) {
                return true;
            }
            i8--;
        }
        return false;
    }

    public final int x(int i7, int i8, int i9) {
        G0 g02;
        int i10;
        int i11 = this.f;
        if (i11 >= 0 && (i11 != this.f6385k || i11 != i7 + 1)) {
            throw new IllegalStateException();
        }
        int i12 = this.f6385k;
        if (i12 >= 0) {
            g02 = k(i12);
        } else {
            g02 = null;
        }
        int s6 = this.f6642b.s(this.f6385k);
        G0 g03 = new G0(i8, 0);
        C0230i c0230i = this.f6384j;
        int i13 = (c0230i.f5782b - 1) & c0230i.d;
        c0230i.f5782b = i13;
        ((Object[]) c0230i.f5784e)[i13] = g03;
        if (i13 == c0230i.f5783c) {
            c0230i.e();
        }
        Object obj = this.f6386l;
        if (obj != null) {
            g03.f6372s = this.f6387m;
            this.f6386l = null;
        } else {
            Z5.n nVar = this.f6642b;
            Object[] objArr = this.f6641a;
            g03.f6372s = nVar.q(i7, false, objArr, false);
            obj = objArr[0];
        }
        Object obj2 = obj;
        this.f = i7;
        this.f6385k = i7;
        if (this.f6645g < 0) {
            this.f6645g = i7;
        }
        if (!this.f6643c) {
            i10 = i9 - g03.f6372s;
        } else {
            i10 = i9 + g03.f6372s;
        }
        int i14 = i10;
        if (g02 != null) {
            g02.f6371r = s6 - i14;
        }
        this.f6642b.o(obj2, i7, g03.f6372s, i8, i14);
        return g03.f6372s;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0125, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x013d, code lost:
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00b8, code lost:
        if (r12.f6643c != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ba, code lost:
        r9 = r12.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00bd, code lost:
        r9 = -r12.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00da, code lost:
        if (r12.f6643c != false) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f6 A[LOOP:2: B:84:0x00f6->B:100:0x011a, LOOP_START, PHI: r5 r8 r9 
      PHI: (r5v12 int) = (r5v6 int), (r5v17 int) binds: [B:83:0x00f4, B:100:0x011a] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r8v19 int) = (r8v17 int), (r8v20 int) binds: [B:83:0x00f4, B:100:0x011a] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r9v6 int) = (r9v4 int), (r9v8 int) binds: [B:83:0x00f4, B:100:0x011a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean y(int r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.H0.y(int, boolean):boolean");
    }
}
