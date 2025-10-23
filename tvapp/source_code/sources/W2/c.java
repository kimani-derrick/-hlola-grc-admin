package W2;

import H2.m0;
import Z2.AbstractC0156a;
import Z2.H;
import android.os.SystemClock;
import e2.K;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
public abstract class c implements q {

    /* renamed from: a  reason: collision with root package name */
    public final m0 f3782a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3783b;

    /* renamed from: c  reason: collision with root package name */
    public final int[] f3784c;
    public final K[] d;

    /* renamed from: e  reason: collision with root package name */
    public final long[] f3785e;
    public int f;

    public c(m0 m0Var, int[] iArr) {
        boolean z7;
        int i7 = 0;
        if (iArr.length > 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        AbstractC0156a.k(z7);
        m0Var.getClass();
        this.f3782a = m0Var;
        int length = iArr.length;
        this.f3783b = length;
        this.d = new K[length];
        for (int i8 = 0; i8 < iArr.length; i8++) {
            this.d[i8] = m0Var.f1136t[iArr[i8]];
        }
        Arrays.sort(this.d, new H.b(4));
        this.f3784c = new int[this.f3783b];
        while (true) {
            int i9 = this.f3783b;
            if (i7 < i9) {
                this.f3784c[i7] = m0Var.a(this.d[i7]);
                i7++;
            } else {
                this.f3785e = new long[i9];
                return;
            }
        }
    }

    @Override // W2.q
    public final int a() {
        return this.f3784c[g()];
    }

    @Override // W2.q
    public final m0 b() {
        return this.f3782a;
    }

    @Override // W2.q
    public final /* synthetic */ boolean c(long j7, J2.a aVar, List list) {
        return false;
    }

    @Override // W2.q
    public final /* synthetic */ void d(boolean z7) {
    }

    @Override // W2.q
    public final K e() {
        return this.d[g()];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f3782a == cVar.f3782a && Arrays.equals(this.f3784c, cVar.f3784c)) {
            return true;
        }
        return false;
    }

    @Override // W2.q
    public final K h(int i7) {
        return this.d[i7];
    }

    public final int hashCode() {
        if (this.f == 0) {
            this.f = Arrays.hashCode(this.f3784c) + (System.identityHashCode(this.f3782a) * 31);
        }
        return this.f;
    }

    @Override // W2.q
    public final int k(int i7) {
        return this.f3784c[i7];
    }

    @Override // W2.q
    public final int length() {
        return this.f3784c.length;
    }

    @Override // W2.q
    public final /* synthetic */ void m() {
    }

    @Override // W2.q
    public int n(long j7, List list) {
        return list.size();
    }

    @Override // W2.q
    public final boolean o(long j7, int i7) {
        if (this.f3785e[i7] > j7) {
            return true;
        }
        return false;
    }

    @Override // W2.q
    public final boolean p(long j7, int i7) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean o7 = o(elapsedRealtime, i7);
        for (int i8 = 0; i8 < this.f3783b && !o7; i8++) {
            if (i8 != i7 && !o(elapsedRealtime, i8)) {
                o7 = true;
            } else {
                o7 = false;
            }
        }
        if (!o7) {
            return false;
        }
        long[] jArr = this.f3785e;
        long j8 = jArr[i7];
        int i9 = H.f4603a;
        long j9 = elapsedRealtime + j7;
        if (((j7 ^ j9) & (elapsedRealtime ^ j9)) < 0) {
            j9 = Long.MAX_VALUE;
        }
        jArr[i7] = Math.max(j8, j9);
        return true;
    }

    @Override // W2.q
    public final /* synthetic */ void r() {
    }

    @Override // W2.q
    public final int t(int i7) {
        for (int i8 = 0; i8 < this.f3783b; i8++) {
            if (this.f3784c[i8] == i7) {
                return i8;
            }
        }
        return -1;
    }

    @Override // W2.q
    public void i() {
    }

    @Override // W2.q
    public void q() {
    }

    @Override // W2.q
    public void j(float f) {
    }
}
