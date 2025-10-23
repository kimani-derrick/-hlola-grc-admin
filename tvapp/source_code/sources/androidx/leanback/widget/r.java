package androidx.leanback.widget;

import androidx.datastore.preferences.protobuf.C0230i;
/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: b  reason: collision with root package name */
    public Z5.n f6642b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f6643c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public int f6644e;

    /* renamed from: h  reason: collision with root package name */
    public O2.e[] f6646h;

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f6641a = new Object[1];
    public int f = -1;

    /* renamed from: g  reason: collision with root package name */
    public int f6645g = -1;

    /* renamed from: i  reason: collision with root package name */
    public int f6647i = -1;

    public final boolean a() {
        return b(this.f6643c ? Integer.MAX_VALUE : Integer.MIN_VALUE, true);
    }

    public abstract boolean b(int i7, boolean z7);

    public final boolean c(int i7) {
        if (this.f6645g < 0) {
            return false;
        }
        if (this.f6643c) {
            if (i(true, null) > i7 + this.d) {
                return false;
            }
        } else if (g(false, null) < i7 - this.d) {
            return false;
        }
        return true;
    }

    public final boolean d(int i7) {
        if (this.f6645g < 0) {
            return false;
        }
        if (this.f6643c) {
            if (g(false, null) < i7 - this.d) {
                return false;
            }
        } else if (i(true, null) > i7 + this.d) {
            return false;
        }
        return true;
    }

    public abstract int f(int i7, boolean z7, int[] iArr);

    public final int g(boolean z7, int[] iArr) {
        return f(this.f6643c ? this.f : this.f6645g, z7, iArr);
    }

    public abstract int h(int i7, boolean z7, int[] iArr);

    public final int i(boolean z7, int[] iArr) {
        return h(this.f6643c ? this.f6645g : this.f, z7, iArr);
    }

    public abstract O2.e[] j(int i7, int i8);

    public abstract B4.b k(int i7);

    public void l(int i7) {
        int i8;
        if (i7 < 0 || (i8 = this.f6645g) < 0) {
            return;
        }
        if (i8 >= i7) {
            this.f6645g = i7 - 1;
        }
        if (this.f6645g < this.f) {
            this.f6645g = -1;
            this.f = -1;
        }
        if (this.f < 0) {
            this.f6647i = i7;
        }
    }

    public abstract boolean m(int i7, boolean z7);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, O2.e] */
    public final void n(int i7) {
        if (i7 > 0) {
            if (this.f6644e == i7) {
                return;
            }
            this.f6644e = i7;
            this.f6646h = new O2.e[i7];
            for (int i8 = 0; i8 < this.f6644e; i8++) {
                O2.e[] eVarArr = this.f6646h;
                ?? obj = new Object();
                int i9 = 8;
                if (Integer.bitCount(8) != 1) {
                    i9 = Integer.highestOneBit(7) << 1;
                }
                obj.f2560b = i9 - 1;
                obj.f2561c = new int[i9];
                eVarArr[i8] = obj;
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    public void e(int i7, int i8, C0230i c0230i) {
    }
}
