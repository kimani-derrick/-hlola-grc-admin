package e2;

import Z2.AbstractC0156a;
import android.util.Pair;
/* loaded from: classes.dex */
public abstract class J0 implements InterfaceC0604f {

    /* renamed from: q  reason: collision with root package name */
    public static final G0 f9620q = new Object();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, e2.G0] */
    static {
        int i7 = Z2.H.f4603a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
    }

    public int a(boolean z7) {
        if (q()) {
            return -1;
        }
        return 0;
    }

    public abstract int b(Object obj);

    public int c(boolean z7) {
        if (q()) {
            return -1;
        }
        return p() - 1;
    }

    public final int d(int i7, H0 h02, I0 i02, int i8, boolean z7) {
        int i9 = g(i7, h02, false).f9554s;
        if (n(i9, i02, 0L).F == i7) {
            int e3 = e(i9, i8, z7);
            if (e3 == -1) {
                return -1;
            }
            return n(e3, i02, 0L).f9580E;
        }
        return i7 + 1;
    }

    public int e(int i7, int i8, boolean z7) {
        if (i8 != 0) {
            if (i8 != 1) {
                if (i8 == 2) {
                    if (i7 == c(z7)) {
                        return a(z7);
                    }
                    return i7 + 1;
                }
                throw new IllegalStateException();
            }
            return i7;
        } else if (i7 == c(z7)) {
            return -1;
        } else {
            return i7 + 1;
        }
    }

    public final boolean equals(Object obj) {
        int c5;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J0)) {
            return false;
        }
        J0 j02 = (J0) obj;
        if (j02.p() != p() || j02.i() != i()) {
            return false;
        }
        I0 i02 = new I0();
        H0 h02 = new H0();
        I0 i03 = new I0();
        H0 h03 = new H0();
        for (int i7 = 0; i7 < p(); i7++) {
            if (!n(i7, i02, 0L).equals(j02.n(i7, i03, 0L))) {
                return false;
            }
        }
        for (int i8 = 0; i8 < i(); i8++) {
            if (!g(i8, h02, true).equals(j02.g(i8, h03, true))) {
                return false;
            }
        }
        int a7 = a(true);
        if (a7 != j02.a(true) || (c5 = c(true)) != j02.c(true)) {
            return false;
        }
        while (a7 != c5) {
            int e3 = e(a7, 0, true);
            if (e3 != j02.e(a7, 0, true)) {
                return false;
            }
            a7 = e3;
        }
        return true;
    }

    public final H0 f(int i7, H0 h02) {
        return g(i7, h02, false);
    }

    public abstract H0 g(int i7, H0 h02, boolean z7);

    public H0 h(Object obj, H0 h02) {
        return g(b(obj), h02, true);
    }

    public final int hashCode() {
        I0 i02 = new I0();
        H0 h02 = new H0();
        int p3 = p() + 217;
        for (int i7 = 0; i7 < p(); i7++) {
            p3 = (p3 * 31) + n(i7, i02, 0L).hashCode();
        }
        int i8 = i() + (p3 * 31);
        for (int i9 = 0; i9 < i(); i9++) {
            i8 = (i8 * 31) + g(i9, h02, true).hashCode();
        }
        int a7 = a(true);
        while (a7 != -1) {
            i8 = (i8 * 31) + a7;
            a7 = e(a7, 0, true);
        }
        return i8;
    }

    public abstract int i();

    public final Pair j(I0 i02, H0 h02, int i7, long j7) {
        Pair k5 = k(i02, h02, i7, j7, 0L);
        k5.getClass();
        return k5;
    }

    public final Pair k(I0 i02, H0 h02, int i7, long j7, long j8) {
        AbstractC0156a.i(i7, p());
        n(i7, i02, j8);
        if (j7 == -9223372036854775807L) {
            j7 = i02.f9578C;
            if (j7 == -9223372036854775807L) {
                return null;
            }
        }
        int i8 = i02.f9580E;
        g(i8, h02, false);
        while (i8 < i02.F && h02.f9556u != j7) {
            int i9 = i8 + 1;
            if (g(i9, h02, false).f9556u > j7) {
                break;
            }
            i8 = i9;
        }
        g(i8, h02, true);
        long j9 = j7 - h02.f9556u;
        long j10 = h02.f9555t;
        if (j10 != -9223372036854775807L) {
            j9 = Math.min(j9, j10 - 1);
        }
        long max = Math.max(0L, j9);
        Object obj = h02.f9553r;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(max));
    }

    public int l(int i7, int i8, boolean z7) {
        if (i8 != 0) {
            if (i8 != 1) {
                if (i8 == 2) {
                    if (i7 == a(z7)) {
                        return c(z7);
                    }
                    return i7 - 1;
                }
                throw new IllegalStateException();
            }
            return i7;
        } else if (i7 == a(z7)) {
            return -1;
        } else {
            return i7 - 1;
        }
    }

    public abstract Object m(int i7);

    public abstract I0 n(int i7, I0 i02, long j7);

    public final void o(int i7, I0 i02) {
        n(i7, i02, 0L);
    }

    public abstract int p();

    public final boolean q() {
        if (p() == 0) {
            return true;
        }
        return false;
    }
}
