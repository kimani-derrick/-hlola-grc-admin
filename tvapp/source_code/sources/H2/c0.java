package H2;

import Y2.C0132a;
import Y2.InterfaceC0141j;
import Z2.AbstractC0156a;
import Z2.InterfaceC0158c;
import android.util.SparseArray;
import e2.C0593J;
import java.io.EOFException;
import k2.C0957v;
/* loaded from: classes.dex */
public class c0 implements k2.w {

    /* renamed from: A  reason: collision with root package name */
    public e2.K f1020A;

    /* renamed from: B  reason: collision with root package name */
    public e2.K f1021B;

    /* renamed from: C  reason: collision with root package name */
    public long f1022C;

    /* renamed from: D  reason: collision with root package name */
    public boolean f1023D;

    /* renamed from: E  reason: collision with root package name */
    public boolean f1024E;
    public long F;

    /* renamed from: G  reason: collision with root package name */
    public boolean f1025G;

    /* renamed from: a  reason: collision with root package name */
    public final Y f1026a;
    public final j2.q d;

    /* renamed from: e  reason: collision with root package name */
    public final j2.n f1029e;
    public b0 f;

    /* renamed from: g  reason: collision with root package name */
    public e2.K f1030g;

    /* renamed from: h  reason: collision with root package name */
    public j2.k f1031h;

    /* renamed from: p  reason: collision with root package name */
    public int f1038p;

    /* renamed from: q  reason: collision with root package name */
    public int f1039q;

    /* renamed from: r  reason: collision with root package name */
    public int f1040r;

    /* renamed from: s  reason: collision with root package name */
    public int f1041s;

    /* renamed from: w  reason: collision with root package name */
    public boolean f1045w;

    /* renamed from: z  reason: collision with root package name */
    public boolean f1048z;

    /* renamed from: b  reason: collision with root package name */
    public final Z f1027b = new Object();

    /* renamed from: i  reason: collision with root package name */
    public int f1032i = 1000;

    /* renamed from: j  reason: collision with root package name */
    public long[] f1033j = new long[1000];

    /* renamed from: k  reason: collision with root package name */
    public long[] f1034k = new long[1000];
    public long[] n = new long[1000];

    /* renamed from: m  reason: collision with root package name */
    public int[] f1036m = new int[1000];

    /* renamed from: l  reason: collision with root package name */
    public int[] f1035l = new int[1000];

    /* renamed from: o  reason: collision with root package name */
    public C0957v[] f1037o = new C0957v[1000];

    /* renamed from: c  reason: collision with root package name */
    public final C.d f1028c = new C.d(new A4.a(3));

    /* renamed from: t  reason: collision with root package name */
    public long f1042t = Long.MIN_VALUE;

    /* renamed from: u  reason: collision with root package name */
    public long f1043u = Long.MIN_VALUE;

    /* renamed from: v  reason: collision with root package name */
    public long f1044v = Long.MIN_VALUE;

    /* renamed from: y  reason: collision with root package name */
    public boolean f1047y = true;

    /* renamed from: x  reason: collision with root package name */
    public boolean f1046x = true;

    /* JADX WARN: Type inference failed for: r1v1, types: [H2.Z, java.lang.Object] */
    public c0(Y2.r rVar, j2.q qVar, j2.n nVar) {
        this.d = qVar;
        this.f1029e = nVar;
        this.f1026a = new Y(rVar);
    }

    public final synchronized void A() {
        this.f1041s = 0;
        Y y3 = this.f1026a;
        y3.f1004e = y3.d;
    }

    public final int B(InterfaceC0141j interfaceC0141j, int i7, boolean z7) {
        Y y3 = this.f1026a;
        int c5 = y3.c(i7);
        X x7 = y3.f;
        C0132a c0132a = (C0132a) x7.f999s;
        int r3 = interfaceC0141j.r(c0132a.f4377a, ((int) (y3.f1005g - x7.f997q)) + c0132a.f4378b, c5);
        if (r3 == -1) {
            if (z7) {
                return -1;
            }
            throw new EOFException();
        }
        long j7 = y3.f1005g + r3;
        y3.f1005g = j7;
        X x8 = y3.f;
        if (j7 == x8.f998r) {
            y3.f = (X) x8.f1000t;
            return r3;
        }
        return r3;
    }

    public final synchronized boolean C(boolean z7, long j7) {
        A();
        int q5 = q(this.f1041s);
        if (t() && j7 >= this.n[q5] && (j7 <= this.f1044v || z7)) {
            int k5 = k(q5, this.f1038p - this.f1041s, j7, true);
            if (k5 == -1) {
                return false;
            }
            this.f1042t = j7;
            this.f1041s += k5;
            return true;
        }
        return false;
    }

    public final synchronized void D(int i7) {
        boolean z7;
        if (i7 >= 0) {
            try {
                if (this.f1041s + i7 <= this.f1038p) {
                    z7 = true;
                    AbstractC0156a.f(z7);
                    this.f1041s += i7;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        z7 = false;
        AbstractC0156a.f(z7);
        this.f1041s += i7;
    }

    @Override // k2.w
    public final int a(InterfaceC0141j interfaceC0141j, int i7, boolean z7) {
        return B(interfaceC0141j, i7, z7);
    }

    @Override // k2.w
    public final void b(int i7, Z2.y yVar) {
        while (true) {
            Y y3 = this.f1026a;
            if (i7 > 0) {
                int c5 = y3.c(i7);
                X x7 = y3.f;
                C0132a c0132a = (C0132a) x7.f999s;
                yVar.e(c0132a.f4377a, ((int) (y3.f1005g - x7.f997q)) + c0132a.f4378b, c5);
                i7 -= c5;
                long j7 = y3.f1005g + c5;
                y3.f1005g = j7;
                X x8 = y3.f;
                if (j7 == x8.f998r) {
                    y3.f = (X) x8.f1000t;
                }
            } else {
                y3.getClass();
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    @Override // k2.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(long r13, int r15, int r16, int r17, k2.C0957v r18) {
        /*
            Method dump skipped, instructions count: 182
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H2.c0.c(long, int, int, int, k2.v):void");
    }

    @Override // k2.w
    public final void d(int i7, Z2.y yVar) {
        b(i7, yVar);
    }

    @Override // k2.w
    public final void e(e2.K k5) {
        e2.K l7 = l(k5);
        boolean z7 = false;
        this.f1048z = false;
        this.f1020A = k5;
        synchronized (this) {
            try {
                this.f1047y = false;
                if (!Z2.H.a(l7, this.f1021B)) {
                    if (((SparseArray) this.f1028c.f325s).size() != 0) {
                        SparseArray sparseArray = (SparseArray) this.f1028c.f325s;
                        if (((a0) sparseArray.valueAt(sparseArray.size() - 1)).f1014a.equals(l7)) {
                            SparseArray sparseArray2 = (SparseArray) this.f1028c.f325s;
                            this.f1021B = ((a0) sparseArray2.valueAt(sparseArray2.size() - 1)).f1014a;
                            e2.K k7 = this.f1021B;
                            this.f1023D = Z2.r.a(k7.f9655B, k7.f9684y);
                            this.f1024E = false;
                            z7 = true;
                        }
                    }
                    this.f1021B = l7;
                    e2.K k72 = this.f1021B;
                    this.f1023D = Z2.r.a(k72.f9655B, k72.f9684y);
                    this.f1024E = false;
                    z7 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        b0 b0Var = this.f;
        if (b0Var != null && z7) {
            b0Var.f();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x007c, code lost:
        if (((H2.a0) r9.valueAt(r9.size() - 1)).f1014a.equals(r8.f1021B) == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void f(long r9, int r11, long r12, int r14, k2.C0957v r15) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H2.c0.f(long, int, long, int, k2.v):void");
    }

    public final long g(int i7) {
        int i8;
        this.f1043u = Math.max(this.f1043u, o(i7));
        this.f1038p -= i7;
        int i9 = this.f1039q + i7;
        this.f1039q = i9;
        int i10 = this.f1040r + i7;
        this.f1040r = i10;
        int i11 = this.f1032i;
        if (i10 >= i11) {
            this.f1040r = i10 - i11;
        }
        int i12 = this.f1041s - i7;
        this.f1041s = i12;
        int i13 = 0;
        if (i12 < 0) {
            this.f1041s = 0;
        }
        while (true) {
            C.d dVar = this.f1028c;
            SparseArray sparseArray = (SparseArray) dVar.f325s;
            if (i13 >= sparseArray.size() - 1) {
                break;
            }
            int i14 = i13 + 1;
            if (i9 < sparseArray.keyAt(i14)) {
                break;
            }
            ((InterfaceC0158c) dVar.f326t).b(sparseArray.valueAt(i13));
            sparseArray.removeAt(i13);
            int i15 = dVar.f324r;
            if (i15 > 0) {
                dVar.f324r = i15 - 1;
            }
            i13 = i14;
        }
        if (this.f1038p == 0) {
            int i16 = this.f1040r;
            if (i16 == 0) {
                i16 = this.f1032i;
            }
            return this.f1034k[i16 - 1] + this.f1035l[i8];
        }
        return this.f1034k[this.f1040r];
    }

    public final void h(boolean z7, long j7) {
        long j8;
        int i7;
        Y y3 = this.f1026a;
        synchronized (this) {
            try {
                int i8 = this.f1038p;
                j8 = -1;
                if (i8 != 0) {
                    long[] jArr = this.n;
                    int i9 = this.f1040r;
                    if (j7 >= jArr[i9]) {
                        if (z7 && (i7 = this.f1041s) != i8) {
                            i8 = i7 + 1;
                        }
                        int k5 = k(i9, i8, j7, false);
                        if (k5 != -1) {
                            j8 = g(k5);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        y3.b(j8);
    }

    public final void i() {
        long g7;
        Y y3 = this.f1026a;
        synchronized (this) {
            int i7 = this.f1038p;
            if (i7 == 0) {
                g7 = -1;
            } else {
                g7 = g(i7);
            }
        }
        y3.b(g7);
    }

    public final long j(int i7) {
        boolean z7;
        int i8;
        int q5;
        int i9 = this.f1039q;
        int i10 = this.f1038p;
        int i11 = (i9 + i10) - i7;
        boolean z8 = false;
        if (i11 >= 0 && i11 <= i10 - this.f1041s) {
            z7 = true;
        } else {
            z7 = false;
        }
        AbstractC0156a.f(z7);
        int i12 = this.f1038p - i11;
        this.f1038p = i12;
        this.f1044v = Math.max(this.f1043u, o(i12));
        if (i11 == 0 && this.f1045w) {
            z8 = true;
        }
        this.f1045w = z8;
        C.d dVar = this.f1028c;
        SparseArray sparseArray = (SparseArray) dVar.f325s;
        for (int size = sparseArray.size() - 1; size >= 0 && i7 < sparseArray.keyAt(size); size--) {
            ((InterfaceC0158c) dVar.f326t).b(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
        }
        if (sparseArray.size() > 0) {
            i8 = Math.min(dVar.f324r, sparseArray.size() - 1);
        } else {
            i8 = -1;
        }
        dVar.f324r = i8;
        int i13 = this.f1038p;
        if (i13 != 0) {
            return this.f1034k[q(i13 - 1)] + this.f1035l[q5];
        }
        return 0L;
    }

    public final int k(int i7, int i8, long j7, boolean z7) {
        int i9 = -1;
        for (int i10 = 0; i10 < i8; i10++) {
            int i11 = (this.n[i7] > j7 ? 1 : (this.n[i7] == j7 ? 0 : -1));
            if (i11 > 0) {
                break;
            }
            if (!z7 || (this.f1036m[i7] & 1) != 0) {
                i9 = i10;
                if (i11 == 0) {
                    break;
                }
            }
            i7++;
            if (i7 == this.f1032i) {
                i7 = 0;
            }
        }
        return i9;
    }

    public e2.K l(e2.K k5) {
        if (this.F != 0 && k5.F != Long.MAX_VALUE) {
            C0593J a7 = k5.a();
            a7.f9608o = k5.F + this.F;
            return a7.a();
        }
        return k5;
    }

    public final synchronized long m() {
        return this.f1044v;
    }

    public final synchronized long n() {
        return Math.max(this.f1043u, o(this.f1041s));
    }

    public final long o(int i7) {
        long j7 = Long.MIN_VALUE;
        if (i7 == 0) {
            return Long.MIN_VALUE;
        }
        int q5 = q(i7 - 1);
        for (int i8 = 0; i8 < i7; i8++) {
            j7 = Math.max(j7, this.n[q5]);
            if ((this.f1036m[q5] & 1) != 0) {
                break;
            }
            q5--;
            if (q5 == -1) {
                q5 = this.f1032i - 1;
            }
        }
        return j7;
    }

    public final int p() {
        return this.f1039q + this.f1041s;
    }

    public final int q(int i7) {
        int i8 = this.f1040r + i7;
        int i9 = this.f1032i;
        if (i8 >= i9) {
            return i8 - i9;
        }
        return i8;
    }

    public final synchronized int r(boolean z7, long j7) {
        int q5 = q(this.f1041s);
        if (t() && j7 >= this.n[q5]) {
            if (j7 > this.f1044v && z7) {
                return this.f1038p - this.f1041s;
            }
            int k5 = k(q5, this.f1038p - this.f1041s, j7, true);
            if (k5 == -1) {
                return 0;
            }
            return k5;
        }
        return 0;
    }

    public final synchronized e2.K s() {
        e2.K k5;
        if (this.f1047y) {
            k5 = null;
        } else {
            k5 = this.f1021B;
        }
        return k5;
    }

    public final boolean t() {
        if (this.f1041s != this.f1038p) {
            return true;
        }
        return false;
    }

    public final synchronized boolean u(boolean z7) {
        e2.K k5;
        boolean z8 = true;
        if (!t()) {
            if (!z7 && !this.f1045w && ((k5 = this.f1021B) == null || k5 == this.f1030g)) {
                z8 = false;
            }
            return z8;
        } else if (((a0) this.f1028c.i(p())).f1014a != this.f1030g) {
            return true;
        } else {
            return v(q(this.f1041s));
        }
    }

    public final boolean v(int i7) {
        j2.k kVar = this.f1031h;
        if (kVar != null && kVar.getState() != 4 && ((this.f1036m[i7] & 1073741824) != 0 || !this.f1031h.b())) {
            return false;
        }
        return true;
    }

    public final void w(e2.K k5, androidx.fragment.app.D d) {
        boolean z7;
        j2.i iVar;
        e2.K k7;
        e2.K k8 = this.f1030g;
        if (k8 == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (z7) {
            iVar = null;
        } else {
            iVar = k8.f9658E;
        }
        this.f1030g = k5;
        j2.i iVar2 = k5.f9658E;
        j2.q qVar = this.d;
        if (qVar != null) {
            int o7 = qVar.o(k5);
            C0593J a7 = k5.a();
            a7.F = o7;
            k7 = a7.a();
        } else {
            k7 = k5;
        }
        d.f5884s = k7;
        d.f5883r = this.f1031h;
        if (qVar == null) {
            return;
        }
        if (!z7 && Z2.H.a(iVar, iVar2)) {
            return;
        }
        j2.k kVar = this.f1031h;
        j2.n nVar = this.f1029e;
        j2.k u7 = qVar.u(nVar, k5);
        this.f1031h = u7;
        d.f5883r = u7;
        if (kVar != null) {
            kVar.a(nVar);
        }
    }

    public final synchronized long x() {
        long j7;
        try {
            int q5 = q(this.f1041s);
            if (t()) {
                j7 = this.f1033j[q5];
            } else {
                j7 = this.f1022C;
            }
        } catch (Throwable th) {
            throw th;
        }
        return j7;
    }

    public final int y(androidx.fragment.app.D d, i2.g gVar, int i7, boolean z7) {
        boolean z8;
        int i8;
        boolean z9 = false;
        if ((i7 & 2) != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        Z z10 = this.f1027b;
        synchronized (this) {
            try {
                gVar.f11352u = false;
                i8 = -3;
                if (!t()) {
                    if (!z7 && !this.f1045w) {
                        e2.K k5 = this.f1021B;
                        if (k5 != null) {
                            if (!z8) {
                                if (k5 != this.f1030g) {
                                }
                            }
                            w(k5, d);
                            i8 = -5;
                        }
                    }
                    gVar.f11331r = 4;
                    i8 = -4;
                } else {
                    e2.K k7 = ((a0) this.f1028c.i(p())).f1014a;
                    if (!z8 && k7 == this.f1030g) {
                        int q5 = q(this.f1041s);
                        if (!v(q5)) {
                            gVar.f11352u = true;
                        } else {
                            gVar.f11331r = this.f1036m[q5];
                            if (this.f1041s == this.f1038p - 1 && (z7 || this.f1045w)) {
                                gVar.b(536870912);
                            }
                            long j7 = this.n[q5];
                            gVar.f11353v = j7;
                            if (j7 < this.f1042t) {
                                gVar.b(Integer.MIN_VALUE);
                            }
                            z10.f1006a = this.f1035l[q5];
                            z10.f1007b = this.f1034k[q5];
                            z10.f1008c = this.f1037o[q5];
                            i8 = -4;
                        }
                    }
                    w(k7, d);
                    i8 = -5;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i8 == -4 && !gVar.d(4)) {
            if ((i7 & 1) != 0) {
                z9 = true;
            }
            if ((i7 & 4) == 0) {
                Y y3 = this.f1026a;
                Z z11 = this.f1027b;
                if (z9) {
                    Y.f(y3.f1004e, gVar, z11, y3.f1003c);
                } else {
                    y3.f1004e = Y.f(y3.f1004e, gVar, z11, y3.f1003c);
                }
            }
            if (!z9) {
                this.f1041s++;
            }
        }
        return i8;
    }

    public final void z(boolean z7) {
        boolean z8;
        C.d dVar;
        SparseArray sparseArray;
        Y y3 = this.f1026a;
        y3.a(y3.d);
        X x7 = y3.d;
        int i7 = 0;
        if (((C0132a) x7.f999s) == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        AbstractC0156a.k(z8);
        x7.f997q = 0L;
        x7.f998r = y3.f1002b;
        X x8 = y3.d;
        y3.f1004e = x8;
        y3.f = x8;
        y3.f1005g = 0L;
        y3.f1001a.b();
        this.f1038p = 0;
        this.f1039q = 0;
        this.f1040r = 0;
        this.f1041s = 0;
        this.f1046x = true;
        this.f1042t = Long.MIN_VALUE;
        this.f1043u = Long.MIN_VALUE;
        this.f1044v = Long.MIN_VALUE;
        this.f1045w = false;
        while (true) {
            dVar = this.f1028c;
            sparseArray = (SparseArray) dVar.f325s;
            if (i7 >= sparseArray.size()) {
                break;
            }
            ((InterfaceC0158c) dVar.f326t).b(sparseArray.valueAt(i7));
            i7++;
        }
        dVar.f324r = -1;
        sparseArray.clear();
        if (z7) {
            this.f1020A = null;
            this.f1021B = null;
            this.f1047y = true;
        }
    }
}
