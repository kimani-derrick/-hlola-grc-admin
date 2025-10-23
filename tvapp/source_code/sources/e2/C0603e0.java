package e2;

import H2.C0023y;
import O3.AbstractC0080y;
import Z2.AbstractC0156a;
import android.util.Pair;
/* renamed from: e2.e0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0603e0 {

    /* renamed from: a  reason: collision with root package name */
    public final H0 f9948a = new H0();

    /* renamed from: b  reason: collision with root package name */
    public final I0 f9949b = new I0();

    /* renamed from: c  reason: collision with root package name */
    public final f2.f f9950c;
    public final Z2.j d;

    /* renamed from: e  reason: collision with root package name */
    public long f9951e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f9952g;

    /* renamed from: h  reason: collision with root package name */
    public C0599c0 f9953h;

    /* renamed from: i  reason: collision with root package name */
    public C0599c0 f9954i;

    /* renamed from: j  reason: collision with root package name */
    public C0599c0 f9955j;

    /* renamed from: k  reason: collision with root package name */
    public int f9956k;

    /* renamed from: l  reason: collision with root package name */
    public Object f9957l;

    /* renamed from: m  reason: collision with root package name */
    public long f9958m;

    public C0603e0(f2.f fVar, Z2.D d) {
        this.f9950c = fVar;
        this.d = d;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [H2.y, H2.A] */
    public static H2.A m(J0 j02, Object obj, long j7, long j8, I0 i02, H0 h02) {
        int i7;
        j02.h(obj, h02);
        j02.o(h02.f9554s, i02);
        int b7 = j02.b(obj);
        Object obj2 = obj;
        while (true) {
            int i8 = h02.f9558w.f1238r;
            if (i8 == 0) {
                break;
            }
            if ((i8 == 1 && h02.h(0)) || !h02.i(h02.f9558w.f1241u)) {
                break;
            }
            long j9 = 0;
            if (h02.c(0L) != -1) {
                break;
            }
            if (h02.f9555t != 0) {
                if (h02.h(i8 - 1)) {
                    i7 = 2;
                } else {
                    i7 = 1;
                }
                int i9 = i8 - i7;
                for (int i10 = 0; i10 <= i9; i10++) {
                    j9 += h02.f9558w.a(i10).f1228w;
                }
                if (h02.f9555t > j9) {
                    break;
                }
            }
            if (b7 > i02.F) {
                break;
            }
            j02.g(b7, h02, true);
            obj2 = h02.f9553r;
            obj2.getClass();
            b7++;
        }
        j02.h(obj2, h02);
        int c5 = h02.c(j7);
        if (c5 == -1) {
            return new H2.A(h02.b(j7), j8, obj2);
        }
        return new C0023y(obj2, c5, h02.f(c5), j8, -1);
    }

    public final C0599c0 a() {
        C0599c0 c0599c0 = this.f9953h;
        if (c0599c0 == null) {
            return null;
        }
        if (c0599c0 == this.f9954i) {
            this.f9954i = c0599c0.f9924l;
        }
        c0599c0.f();
        int i7 = this.f9956k - 1;
        this.f9956k = i7;
        if (i7 == 0) {
            this.f9955j = null;
            C0599c0 c0599c02 = this.f9953h;
            this.f9957l = c0599c02.f9916b;
            this.f9958m = c0599c02.f.f9941a.d;
        }
        this.f9953h = this.f9953h.f9924l;
        k();
        return this.f9953h;
    }

    public final void b() {
        if (this.f9956k == 0) {
            return;
        }
        C0599c0 c0599c0 = this.f9953h;
        AbstractC0156a.l(c0599c0);
        this.f9957l = c0599c0.f9916b;
        this.f9958m = c0599c0.f.f9941a.d;
        while (c0599c0 != null) {
            c0599c0.f();
            c0599c0 = c0599c0.f9924l;
        }
        this.f9953h = null;
        this.f9955j = null;
        this.f9954i = null;
        this.f9956k = 0;
        k();
    }

    public final C0601d0 c(J0 j02, C0599c0 c0599c0, long j7) {
        C0601d0 c0601d0;
        long j8;
        long j9;
        long j10;
        Object obj;
        long j11;
        long j12;
        C0601d0 c0601d02 = c0599c0.f;
        int d = j02.d(j02.b(c0601d02.f9941a.f1180a), this.f9948a, this.f9949b, this.f, this.f9952g);
        if (d == -1) {
            return null;
        }
        H0 h02 = this.f9948a;
        boolean z7 = true;
        int i7 = j02.g(d, h02, true).f9554s;
        Object obj2 = h02.f9553r;
        obj2.getClass();
        H2.A a7 = c0601d02.f9941a;
        long j13 = a7.d;
        if (j02.n(i7, this.f9949b, 0L).f9580E == d) {
            Pair k5 = j02.k(this.f9949b, this.f9948a, i7, -9223372036854775807L, Math.max(0L, j7));
            if (k5 == null) {
                return null;
            }
            Object obj3 = k5.first;
            long longValue = ((Long) k5.second).longValue();
            C0599c0 c0599c02 = c0599c0.f9924l;
            if (c0599c02 != null && c0599c02.f9916b.equals(obj3)) {
                j12 = c0599c02.f.f9941a.d;
            } else {
                j12 = this.f9951e;
                this.f9951e = 1 + j12;
            }
            c0601d0 = c0601d02;
            j8 = longValue;
            j9 = -9223372036854775807L;
            j10 = j12;
            obj = obj3;
        } else {
            c0601d0 = c0601d02;
            j8 = 0;
            j9 = 0;
            j10 = j13;
            obj = obj2;
        }
        H2.A m7 = m(j02, obj, j8, j10, this.f9949b, this.f9948a);
        if (j9 != -9223372036854775807L) {
            long j14 = c0601d0.f9943c;
            if (j14 != -9223372036854775807L) {
                int i8 = j02.h(a7.f1180a, h02).f9558w.f1238r;
                int i9 = h02.f9558w.f1241u;
                if (i8 <= 0 || !h02.i(i9) || (i8 <= 1 && h02.d(i9) == Long.MIN_VALUE)) {
                    z7 = false;
                }
                if (m7.a() && z7) {
                    j11 = j14;
                    return e(j02, m7, j11, j8);
                } else if (z7) {
                    j8 = j14;
                }
            }
        }
        j11 = j9;
        return e(j02, m7, j11, j8);
    }

    public final C0601d0 d(J0 j02, C0599c0 c0599c0, long j7) {
        int f;
        boolean z7;
        long j8;
        Object obj;
        long j9;
        long j10;
        Object obj2;
        int i7;
        C0603e0 c0603e0;
        J0 j03;
        long j11;
        long j12;
        C0601d0 c0601d0 = c0599c0.f;
        long j13 = (c0599c0.f9926o + c0601d0.f9944e) - j7;
        if (c0601d0.f9945g) {
            return c(j02, c0599c0, j13);
        }
        H2.A a7 = c0601d0.f9941a;
        Object obj3 = a7.f1180a;
        H0 h02 = this.f9948a;
        j02.h(obj3, h02);
        boolean a8 = a7.a();
        Object obj4 = a7.f1180a;
        if (a8) {
            I2.b bVar = h02.f9558w;
            i7 = a7.f1181b;
            int i8 = bVar.a(i7).f1223r;
            if (i8 != -1) {
                f = h02.f9558w.a(i7).a(a7.f1182c);
                if (f < i8) {
                    obj2 = a7.f1180a;
                    j10 = c0601d0.f9943c;
                    c0603e0 = this;
                    j03 = j02;
                    j11 = a7.d;
                    return c0603e0.f(j03, obj2, i7, f, j10, j11);
                }
                long j14 = c0601d0.f9943c;
                if (j14 == -9223372036854775807L) {
                    Pair k5 = j02.k(this.f9949b, h02, h02.f9554s, -9223372036854775807L, Math.max(0L, j13));
                    if (k5 != null) {
                        j14 = ((Long) k5.second).longValue();
                    }
                }
                j02.h(obj4, h02);
                int i9 = a7.f1181b;
                long d = h02.d(i9);
                if (d == Long.MIN_VALUE) {
                    j12 = h02.f9555t;
                } else {
                    j12 = h02.f9558w.a(i9).f1228w + d;
                }
                j8 = Math.max(j12, j14);
                obj = a7.f1180a;
                j9 = c0601d0.f9943c;
                return g(j02, obj, j8, j9, a7.d);
            }
            return null;
        }
        int i10 = a7.f1183e;
        if (i10 != -1 && h02.h(i10)) {
            return c(j02, c0599c0, j13);
        }
        f = h02.f(i10);
        if (h02.i(i10) && h02.e(i10, f) == 3) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (f != h02.f9558w.a(i10).f1223r && !z7) {
            j10 = c0601d0.f9944e;
            long j15 = a7.d;
            obj2 = a7.f1180a;
            i7 = a7.f1183e;
            c0603e0 = this;
            j03 = j02;
            j11 = j15;
            return c0603e0.f(j03, obj2, i7, f, j10, j11);
        }
        j02.h(obj4, h02);
        long d7 = h02.d(i10);
        if (d7 == Long.MIN_VALUE) {
            j8 = h02.f9555t;
        } else {
            j8 = h02.f9558w.a(i10).f1228w + d7;
        }
        obj = a7.f1180a;
        j9 = c0601d0.f9944e;
        return g(j02, obj, j8, j9, a7.d);
    }

    public final C0601d0 e(J0 j02, H2.A a7, long j7, long j8) {
        j02.h(a7.f1180a, this.f9948a);
        if (a7.a()) {
            return f(j02, a7.f1180a, a7.f1181b, a7.f1182c, j7, a7.d);
        }
        return g(j02, a7.f1180a, j8, j7, a7.d);
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [H2.y, H2.A] */
    public final C0601d0 f(J0 j02, Object obj, int i7, int i8, long j7, long j8) {
        long j9;
        long j10;
        ?? c0023y = new C0023y(obj, i7, i8, j8, -1);
        H0 h02 = this.f9948a;
        long a7 = j02.h(obj, h02).a(i7, i8);
        if (i8 == h02.f(i7)) {
            j9 = h02.f9558w.f1239s;
        } else {
            j9 = 0;
        }
        boolean i9 = h02.i(i7);
        if (a7 != -9223372036854775807L && j9 >= a7) {
            j10 = Math.max(0L, a7 - 1);
        } else {
            j10 = j9;
        }
        return new C0601d0(c0023y, j10, j7, -9223372036854775807L, a7, i9, false, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final e2.C0601d0 g(e2.J0 r27, java.lang.Object r28, long r29, long r31, long r33) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e2.C0603e0.g(e2.J0, java.lang.Object, long, long, long):e2.d0");
    }

    public final C0601d0 h(J0 j02, C0601d0 c0601d0) {
        boolean z7;
        long j7;
        long j8;
        boolean z8;
        H2.A a7 = c0601d0.f9941a;
        boolean a8 = a7.a();
        int i7 = a7.f1183e;
        if (!a8 && i7 == -1) {
            z7 = true;
        } else {
            z7 = false;
        }
        boolean j9 = j(j02, a7);
        boolean i8 = i(j02, a7, z7);
        Object obj = c0601d0.f9941a.f1180a;
        H0 h02 = this.f9948a;
        j02.h(obj, h02);
        if (!a7.a() && i7 != -1) {
            j7 = h02.d(i7);
        } else {
            j7 = -9223372036854775807L;
        }
        boolean a9 = a7.a();
        int i9 = a7.f1181b;
        if (a9) {
            j8 = h02.a(i9, a7.f1182c);
        } else if (j7 != -9223372036854775807L && j7 != Long.MIN_VALUE) {
            j8 = j7;
        } else {
            j8 = h02.f9555t;
        }
        if (a7.a()) {
            z8 = h02.i(i9);
        } else if (i7 != -1 && h02.i(i7)) {
            z8 = true;
        } else {
            z8 = false;
        }
        return new C0601d0(a7, c0601d0.f9942b, c0601d0.f9943c, j7, j8, z8, z7, j9, i8);
    }

    public final boolean i(J0 j02, H2.A a7, boolean z7) {
        int b7 = j02.b(a7.f1180a);
        if (j02.n(j02.g(b7, this.f9948a, false).f9554s, this.f9949b, 0L).f9590y) {
            return false;
        }
        if (j02.d(b7, this.f9948a, this.f9949b, this.f, this.f9952g) != -1 || !z7) {
            return false;
        }
        return true;
    }

    public final boolean j(J0 j02, H2.A a7) {
        boolean z7;
        if (!a7.a() && a7.f1183e == -1) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (!z7) {
            return false;
        }
        Object obj = a7.f1180a;
        if (j02.n(j02.h(obj, this.f9948a).f9554s, this.f9949b, 0L).F != j02.b(obj)) {
            return false;
        }
        return true;
    }

    public final void k() {
        H2.A a7;
        O3.C c5 = O3.E.f2597r;
        AbstractC0080y abstractC0080y = new AbstractC0080y();
        for (C0599c0 c0599c0 = this.f9953h; c0599c0 != null; c0599c0 = c0599c0.f9924l) {
            abstractC0080y.a(c0599c0.f.f9941a);
        }
        C0599c0 c0599c02 = this.f9954i;
        if (c0599c02 == null) {
            a7 = null;
        } else {
            a7 = c0599c02.f.f9941a;
        }
        ((Z2.D) this.d).c(new H2.E(this, abstractC0080y, a7, 5));
    }

    public final boolean l(C0599c0 c0599c0) {
        boolean z7;
        boolean z8 = false;
        if (c0599c0 != null) {
            z7 = true;
        } else {
            z7 = false;
        }
        AbstractC0156a.k(z7);
        if (c0599c0.equals(this.f9955j)) {
            return false;
        }
        this.f9955j = c0599c0;
        while (true) {
            c0599c0 = c0599c0.f9924l;
            if (c0599c0 == null) {
                break;
            }
            if (c0599c0 == this.f9954i) {
                this.f9954i = this.f9953h;
                z8 = true;
            }
            c0599c0.f();
            this.f9956k--;
        }
        C0599c0 c0599c02 = this.f9955j;
        if (c0599c02.f9924l != null) {
            c0599c02.b();
            c0599c02.f9924l = null;
            c0599c02.c();
        }
        k();
        return z8;
    }

    public final H2.A n(J0 j02, Object obj, long j7) {
        long j8;
        int b7;
        Object obj2 = obj;
        H0 h02 = this.f9948a;
        int i7 = j02.h(obj2, h02).f9554s;
        Object obj3 = this.f9957l;
        if (obj3 != null && (b7 = j02.b(obj3)) != -1 && j02.g(b7, h02, false).f9554s == i7) {
            j8 = this.f9958m;
        } else {
            C0599c0 c0599c0 = this.f9953h;
            while (true) {
                if (c0599c0 != null) {
                    if (c0599c0.f9916b.equals(obj2)) {
                        break;
                    }
                    c0599c0 = c0599c0.f9924l;
                } else {
                    c0599c0 = this.f9953h;
                    while (c0599c0 != null) {
                        int b8 = j02.b(c0599c0.f9916b);
                        if (b8 == -1 || j02.g(b8, h02, false).f9554s != i7) {
                            c0599c0 = c0599c0.f9924l;
                        }
                    }
                    j8 = this.f9951e;
                    this.f9951e = 1 + j8;
                    if (this.f9953h == null) {
                        this.f9957l = obj2;
                        this.f9958m = j8;
                    }
                }
            }
            j8 = c0599c0.f.f9941a.d;
        }
        long j9 = j8;
        j02.h(obj2, h02);
        int i8 = h02.f9554s;
        I0 i02 = this.f9949b;
        j02.o(i8, i02);
        boolean z7 = false;
        for (int b9 = j02.b(obj); b9 >= i02.f9580E; b9--) {
            boolean z8 = true;
            j02.g(b9, h02, true);
            if (h02.f9558w.f1238r <= 0) {
                z8 = false;
            }
            z7 |= z8;
            if (h02.c(h02.f9555t) != -1) {
                obj2 = h02.f9553r;
                obj2.getClass();
            }
            if (z7 && (!z8 || h02.f9555t != 0)) {
                break;
            }
        }
        return m(j02, obj2, j7, j9, this.f9949b, this.f9948a);
    }

    public final boolean o(J0 j02) {
        C0599c0 c0599c0;
        C0599c0 c0599c02 = this.f9953h;
        if (c0599c02 == null) {
            return true;
        }
        int b7 = j02.b(c0599c02.f9916b);
        while (true) {
            b7 = j02.d(b7, this.f9948a, this.f9949b, this.f, this.f9952g);
            while (true) {
                c0599c0 = c0599c02.f9924l;
                if (c0599c0 == null || c0599c02.f.f9945g) {
                    break;
                }
                c0599c02 = c0599c0;
            }
            if (b7 == -1 || c0599c0 == null || j02.b(c0599c0.f9916b) != b7) {
                break;
            }
            c0599c02 = c0599c0;
        }
        boolean l7 = l(c0599c02);
        c0599c02.f = h(j02, c0599c02.f);
        return !l7;
    }

    public final boolean p(J0 j02, long j7, long j8) {
        C0601d0 c0601d0;
        long j9;
        boolean z7;
        C0599c0 c0599c0 = null;
        for (C0599c0 c0599c02 = this.f9953h; c0599c02 != null; c0599c02 = c0599c02.f9924l) {
            C0601d0 c0601d02 = c0599c02.f;
            if (c0599c0 == null) {
                c0601d0 = h(j02, c0601d02);
            } else {
                C0601d0 d = d(j02, c0599c0, j7);
                if (d == null) {
                    return !l(c0599c0);
                }
                if (c0601d02.f9942b == d.f9942b && c0601d02.f9941a.equals(d.f9941a)) {
                    c0601d0 = d;
                } else {
                    return !l(c0599c0);
                }
            }
            c0599c02.f = c0601d0.a(c0601d02.f9943c);
            long j10 = c0601d02.f9944e;
            if (j10 != -9223372036854775807L) {
                long j11 = c0601d0.f9944e;
                if (j10 != j11) {
                    c0599c02.h();
                    if (j11 == -9223372036854775807L) {
                        j9 = Long.MAX_VALUE;
                    } else {
                        j9 = c0599c02.f9926o + j11;
                    }
                    if (c0599c02 == this.f9954i && !c0599c02.f.f && (j8 == Long.MIN_VALUE || j8 >= j9)) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (!l(c0599c02) && !z7) {
                        return true;
                    }
                    return false;
                }
            }
            c0599c0 = c0599c02;
        }
        return true;
    }
}
