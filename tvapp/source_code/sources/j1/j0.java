package j1;

import H2.C0002c;
import android.util.SparseIntArray;
import com.boxhdo.android.tv.R;
/* loaded from: classes.dex */
public final class j0 extends i0 {

    /* renamed from: D  reason: collision with root package name */
    public static final C0002c f11655D;

    /* renamed from: E  reason: collision with root package name */
    public static final SparseIntArray f11656E;

    /* renamed from: A  reason: collision with root package name */
    public final C0797O f11657A;

    /* renamed from: B  reason: collision with root package name */
    public final C0797O f11658B;

    /* renamed from: C  reason: collision with root package name */
    public long f11659C;

    /* renamed from: u  reason: collision with root package name */
    public final C0797O f11660u;

    /* renamed from: v  reason: collision with root package name */
    public final C0797O f11661v;

    /* renamed from: w  reason: collision with root package name */
    public final C0797O f11662w;

    /* renamed from: x  reason: collision with root package name */
    public final C0797O f11663x;

    /* renamed from: y  reason: collision with root package name */
    public final C0797O f11664y;

    /* renamed from: z  reason: collision with root package name */
    public final C0797O f11665z;

    static {
        C0002c c0002c = new C0002c(18);
        f11655D = c0002c;
        c0002c.L(new String[]{"item_movie_shimmer", "item_movie_shimmer", "item_movie_shimmer", "item_movie_shimmer", "item_movie_shimmer", "item_movie_shimmer", "item_movie_shimmer", "item_movie_shimmer"}, new int[]{2, 3, 4, 5, 6, 7, 8, 9}, new int[]{R.layout.item_movie_shimmer, R.layout.item_movie_shimmer, R.layout.item_movie_shimmer, R.layout.item_movie_shimmer, R.layout.item_movie_shimmer, R.layout.item_movie_shimmer, R.layout.item_movie_shimmer, R.layout.item_movie_shimmer});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f11656E = sparseIntArray;
        sparseIntArray.put(R.id.imageBackdropMovie, 10);
        sparseIntArray.put(R.id.imageMask, 11);
        sparseIntArray.put(R.id.guideLine, 12);
        sparseIntArray.put(R.id.guideLine1, 13);
        sparseIntArray.put(R.id.textMovieName, 14);
        sparseIntArray.put(R.id.layoutMovieInfo, 15);
        sparseIntArray.put(R.id.textOverview, 16);
        sparseIntArray.put(R.id.textShimmerTitle, 17);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public j0(android.view.View r5) {
        /*
            r4 = this;
            H2.c r0 = j1.j0.f11655D
            android.util.SparseIntArray r1 = j1.j0.f11656E
            r2 = 18
            java.lang.Object[] r0 = androidx.databinding.d.N0(r5, r2, r0, r1)
            r1 = 12
            r1 = r0[r1]
            androidx.constraintlayout.widget.Guideline r1 = (androidx.constraintlayout.widget.Guideline) r1
            r1 = 13
            r1 = r0[r1]
            androidx.constraintlayout.widget.Guideline r1 = (androidx.constraintlayout.widget.Guideline) r1
            r1 = 10
            r1 = r0[r1]
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r1 = 11
            r1 = r0[r1]
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r1 = 15
            r1 = r0[r1]
            android.view.View r1 = (android.view.View) r1
            r1 = 1
            r1 = r0[r1]
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r2 = 0
            r2 = r0[r2]
            com.facebook.shimmer.ShimmerFrameLayout r2 = (com.facebook.shimmer.ShimmerFrameLayout) r2
            r3 = 14
            r3 = r0[r3]
            android.view.View r3 = (android.view.View) r3
            r3 = 16
            r3 = r0[r3]
            android.view.View r3 = (android.view.View) r3
            r3 = 17
            r3 = r0[r3]
            android.view.View r3 = (android.view.View) r3
            r3 = 0
            r4.<init>(r3, r5, r1, r2)
            r1 = -1
            r4.f11659C = r1
            android.widget.LinearLayout r1 = r4.f11651r
            r1.setTag(r3)
            r1 = 2
            r1 = r0[r1]
            j1.O r1 = (j1.C0797O) r1
            r4.f11660u = r1
            if (r1 == 0) goto L5c
            r1.f5667l = r4
        L5c:
            r1 = 3
            r1 = r0[r1]
            j1.O r1 = (j1.C0797O) r1
            r4.f11661v = r1
            if (r1 == 0) goto L67
            r1.f5667l = r4
        L67:
            r1 = 4
            r1 = r0[r1]
            j1.O r1 = (j1.C0797O) r1
            r4.f11662w = r1
            if (r1 == 0) goto L72
            r1.f5667l = r4
        L72:
            r1 = 5
            r1 = r0[r1]
            j1.O r1 = (j1.C0797O) r1
            r4.f11663x = r1
            if (r1 == 0) goto L7d
            r1.f5667l = r4
        L7d:
            r1 = 6
            r1 = r0[r1]
            j1.O r1 = (j1.C0797O) r1
            r4.f11664y = r1
            if (r1 == 0) goto L88
            r1.f5667l = r4
        L88:
            r1 = 7
            r1 = r0[r1]
            j1.O r1 = (j1.C0797O) r1
            r4.f11665z = r1
            if (r1 == 0) goto L93
            r1.f5667l = r4
        L93:
            r1 = 8
            r1 = r0[r1]
            j1.O r1 = (j1.C0797O) r1
            r4.f11657A = r1
            if (r1 == 0) goto L9f
            r1.f5667l = r4
        L9f:
            r1 = 9
            r0 = r0[r1]
            j1.O r0 = (j1.C0797O) r0
            r4.f11658B = r0
            if (r0 == 0) goto Lab
            r0.f5667l = r4
        Lab:
            com.facebook.shimmer.ShimmerFrameLayout r0 = r4.f11652s
            r0.setTag(r3)
            r4.Q0(r5)
            r4.L0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.j0.<init>(android.view.View):void");
    }

    @Override // androidx.databinding.d
    public final void G0() {
        synchronized (this) {
            this.f11659C = 0L;
        }
        this.f11660u.H0();
        this.f11661v.H0();
        this.f11662w.H0();
        this.f11663x.H0();
        this.f11664y.H0();
        this.f11665z.H0();
        this.f11657A.H0();
        this.f11658B.H0();
    }

    @Override // androidx.databinding.d
    public final boolean J0() {
        synchronized (this) {
            try {
                if (this.f11659C != 0) {
                    return true;
                }
                if (this.f11660u.J0() || this.f11661v.J0() || this.f11662w.J0() || this.f11663x.J0() || this.f11664y.J0() || this.f11665z.J0() || this.f11657A.J0() || this.f11658B.J0()) {
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
            this.f11659C = 1L;
        }
        this.f11660u.L0();
        this.f11661v.L0();
        this.f11662w.L0();
        this.f11663x.L0();
        this.f11664y.L0();
        this.f11665z.L0();
        this.f11657A.L0();
        this.f11658B.L0();
        O0();
    }

    @Override // androidx.databinding.d
    public final void P0(androidx.fragment.app.b0 b0Var) {
        super.P0(b0Var);
        this.f11660u.P0(b0Var);
        this.f11661v.P0(b0Var);
        this.f11662w.P0(b0Var);
        this.f11663x.P0(b0Var);
        this.f11664y.P0(b0Var);
        this.f11665z.P0(b0Var);
        this.f11657A.P0(b0Var);
        this.f11658B.P0(b0Var);
    }
}
