package e2;

import Z2.AbstractC0156a;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class K0 implements InterfaceC0604f {

    /* renamed from: v  reason: collision with root package name */
    public static final String f9686v;

    /* renamed from: w  reason: collision with root package name */
    public static final String f9687w;

    /* renamed from: x  reason: collision with root package name */
    public static final String f9688x;

    /* renamed from: y  reason: collision with root package name */
    public static final String f9689y;

    /* renamed from: q  reason: collision with root package name */
    public final int f9690q;

    /* renamed from: r  reason: collision with root package name */
    public final H2.m0 f9691r;

    /* renamed from: s  reason: collision with root package name */
    public final boolean f9692s;

    /* renamed from: t  reason: collision with root package name */
    public final int[] f9693t;

    /* renamed from: u  reason: collision with root package name */
    public final boolean[] f9694u;

    static {
        int i7 = Z2.H.f4603a;
        f9686v = Integer.toString(0, 36);
        f9687w = Integer.toString(1, 36);
        f9688x = Integer.toString(3, 36);
        f9689y = Integer.toString(4, 36);
    }

    public K0(H2.m0 m0Var, boolean z7, int[] iArr, boolean[] zArr) {
        boolean z8;
        int i7 = m0Var.f1133q;
        this.f9690q = i7;
        boolean z9 = false;
        if (i7 == iArr.length && i7 == zArr.length) {
            z8 = true;
        } else {
            z8 = false;
        }
        AbstractC0156a.f(z8);
        this.f9691r = m0Var;
        if (z7 && i7 > 1) {
            z9 = true;
        }
        this.f9692s = z9;
        this.f9693t = (int[]) iArr.clone();
        this.f9694u = (boolean[]) zArr.clone();
    }

    public final int a() {
        return this.f9691r.f1135s;
    }

    public final boolean b() {
        for (boolean z7 : this.f9694u) {
            if (z7) {
                return true;
            }
        }
        return false;
    }

    public final boolean c() {
        for (int i7 = 0; i7 < this.f9693t.length; i7++) {
            if (d(i7)) {
                return true;
            }
        }
        return false;
    }

    public final boolean d(int i7) {
        if (this.f9693t[i7] != 4) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || K0.class != obj.getClass()) {
            return false;
        }
        K0 k02 = (K0) obj;
        if (this.f9692s == k02.f9692s && this.f9691r.equals(k02.f9691r) && Arrays.equals(this.f9693t, k02.f9693t) && Arrays.equals(this.f9694u, k02.f9694u)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.f9693t);
        return Arrays.hashCode(this.f9694u) + ((hashCode + (((this.f9691r.hashCode() * 31) + (this.f9692s ? 1 : 0)) * 31)) * 31);
    }
}
