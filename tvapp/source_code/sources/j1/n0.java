package j1;

import H2.C0002c;
import com.boxhdo.android.tv.R;
/* loaded from: classes.dex */
public final class n0 extends m0 {

    /* renamed from: C  reason: collision with root package name */
    public static final C0002c f11688C;

    /* renamed from: A  reason: collision with root package name */
    public final C0797O f11689A;

    /* renamed from: B  reason: collision with root package name */
    public long f11690B;

    /* renamed from: u  reason: collision with root package name */
    public final C0797O f11691u;

    /* renamed from: v  reason: collision with root package name */
    public final C0797O f11692v;

    /* renamed from: w  reason: collision with root package name */
    public final C0797O f11693w;

    /* renamed from: x  reason: collision with root package name */
    public final C0797O f11694x;

    /* renamed from: y  reason: collision with root package name */
    public final C0797O f11695y;

    /* renamed from: z  reason: collision with root package name */
    public final C0797O f11696z;

    static {
        C0002c c0002c = new C0002c(9);
        f11688C = c0002c;
        c0002c.L(new String[]{"item_movie_shimmer", "item_movie_shimmer", "item_movie_shimmer", "item_movie_shimmer", "item_movie_shimmer", "item_movie_shimmer", "item_movie_shimmer"}, new int[]{2, 3, 4, 5, 6, 7, 8}, new int[]{R.layout.item_movie_shimmer, R.layout.item_movie_shimmer, R.layout.item_movie_shimmer, R.layout.item_movie_shimmer, R.layout.item_movie_shimmer, R.layout.item_movie_shimmer, R.layout.item_movie_shimmer});
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public n0(android.view.View r6) {
        /*
            r5 = this;
            H2.c r0 = j1.n0.f11688C
            r1 = 9
            r2 = 0
            java.lang.Object[] r0 = androidx.databinding.d.N0(r6, r1, r0, r2)
            r1 = 1
            r1 = r0[r1]
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r3 = 0
            r3 = r0[r3]
            com.facebook.shimmer.ShimmerFrameLayout r3 = (com.facebook.shimmer.ShimmerFrameLayout) r3
            r5.<init>(r2, r6, r1, r3)
            r3 = -1
            r5.f11690B = r3
            android.widget.LinearLayout r1 = r5.f11684r
            r1.setTag(r2)
            r1 = 2
            r1 = r0[r1]
            j1.O r1 = (j1.C0797O) r1
            r5.f11691u = r1
            if (r1 == 0) goto L2a
            r1.f5667l = r5
        L2a:
            r1 = 3
            r1 = r0[r1]
            j1.O r1 = (j1.C0797O) r1
            r5.f11692v = r1
            if (r1 == 0) goto L35
            r1.f5667l = r5
        L35:
            r1 = 4
            r1 = r0[r1]
            j1.O r1 = (j1.C0797O) r1
            r5.f11693w = r1
            if (r1 == 0) goto L40
            r1.f5667l = r5
        L40:
            r1 = 5
            r1 = r0[r1]
            j1.O r1 = (j1.C0797O) r1
            r5.f11694x = r1
            if (r1 == 0) goto L4b
            r1.f5667l = r5
        L4b:
            r1 = 6
            r1 = r0[r1]
            j1.O r1 = (j1.C0797O) r1
            r5.f11695y = r1
            if (r1 == 0) goto L56
            r1.f5667l = r5
        L56:
            r1 = 7
            r1 = r0[r1]
            j1.O r1 = (j1.C0797O) r1
            r5.f11696z = r1
            if (r1 == 0) goto L61
            r1.f5667l = r5
        L61:
            r1 = 8
            r0 = r0[r1]
            j1.O r0 = (j1.C0797O) r0
            r5.f11689A = r0
            if (r0 == 0) goto L6d
            r0.f5667l = r5
        L6d:
            com.facebook.shimmer.ShimmerFrameLayout r0 = r5.f11685s
            r0.setTag(r2)
            r5.Q0(r6)
            r5.L0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.n0.<init>(android.view.View):void");
    }

    @Override // androidx.databinding.d
    public final void G0() {
        synchronized (this) {
            this.f11690B = 0L;
        }
        this.f11691u.H0();
        this.f11692v.H0();
        this.f11693w.H0();
        this.f11694x.H0();
        this.f11695y.H0();
        this.f11696z.H0();
        this.f11689A.H0();
    }

    @Override // androidx.databinding.d
    public final boolean J0() {
        synchronized (this) {
            try {
                if (this.f11690B != 0) {
                    return true;
                }
                if (this.f11691u.J0() || this.f11692v.J0() || this.f11693w.J0() || this.f11694x.J0() || this.f11695y.J0() || this.f11696z.J0() || this.f11689A.J0()) {
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.d
    public final void L0() {
        synchronized (this) {
            this.f11690B = 1L;
        }
        this.f11691u.L0();
        this.f11692v.L0();
        this.f11693w.L0();
        this.f11694x.L0();
        this.f11695y.L0();
        this.f11696z.L0();
        this.f11689A.L0();
        O0();
    }

    @Override // androidx.databinding.d
    public final void P0(androidx.fragment.app.b0 b0Var) {
        super.P0(b0Var);
        this.f11691u.P0(b0Var);
        this.f11692v.P0(b0Var);
        this.f11693w.P0(b0Var);
        this.f11694x.P0(b0Var);
        this.f11695y.P0(b0Var);
        this.f11696z.P0(b0Var);
        this.f11689A.P0(b0Var);
    }
}
