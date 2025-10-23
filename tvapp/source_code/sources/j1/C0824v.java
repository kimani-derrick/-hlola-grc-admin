package j1;

import H2.C0002c;
import android.util.SparseIntArray;
import com.boxhdo.android.tv.R;
/* renamed from: j1.v  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0824v extends AbstractC0823u {

    /* renamed from: K  reason: collision with root package name */
    public static final C0002c f11730K;

    /* renamed from: L  reason: collision with root package name */
    public static final SparseIntArray f11731L;

    /* renamed from: B  reason: collision with root package name */
    public final C0797O f11732B;

    /* renamed from: C  reason: collision with root package name */
    public final C0797O f11733C;

    /* renamed from: D  reason: collision with root package name */
    public final C0797O f11734D;

    /* renamed from: E  reason: collision with root package name */
    public final C0797O f11735E;
    public final C0797O F;

    /* renamed from: G  reason: collision with root package name */
    public final C0797O f11736G;

    /* renamed from: H  reason: collision with root package name */
    public final C0797O f11737H;

    /* renamed from: I  reason: collision with root package name */
    public final C0797O f11738I;

    /* renamed from: J  reason: collision with root package name */
    public long f11739J;

    static {
        C0002c c0002c = new C0002c(25);
        f11730K = c0002c;
        c0002c.L(new String[]{"item_movie_shimmer", "item_movie_shimmer", "item_movie_shimmer", "item_movie_shimmer", "item_movie_shimmer", "item_movie_shimmer", "item_movie_shimmer", "item_movie_shimmer"}, new int[]{2, 3, 4, 5, 6, 7, 8, 9}, new int[]{R.layout.item_movie_shimmer, R.layout.item_movie_shimmer, R.layout.item_movie_shimmer, R.layout.item_movie_shimmer, R.layout.item_movie_shimmer, R.layout.item_movie_shimmer, R.layout.item_movie_shimmer, R.layout.item_movie_shimmer});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f11731L = sparseIntArray;
        sparseIntArray.put(R.id.guideline, 10);
        sparseIntArray.put(R.id.imageBackdropMovie, 11);
        sparseIntArray.put(R.id.imageMask, 12);
        sparseIntArray.put(R.id.textMovieName, 13);
        sparseIntArray.put(R.id.layoutMovieInfo, 14);
        sparseIntArray.put(R.id.textRating, 15);
        sparseIntArray.put(R.id.imageDot, 16);
        sparseIntArray.put(R.id.textYear, 17);
        sparseIntArray.put(R.id.textOverview, 18);
        sparseIntArray.put(R.id.buttonPlayNow, 19);
        sparseIntArray.put(R.id.buttonMoreEpisode, 20);
        sparseIntArray.put(R.id.buttonAddToWatchList, 21);
        sparseIntArray.put(R.id.textRelate, 22);
        sparseIntArray.put(R.id.recyclerRelate, 23);
        sparseIntArray.put(R.id.layoutMovieShimmer, 24);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0824v(android.view.View r17) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.C0824v.<init>(android.view.View):void");
    }

    @Override // androidx.databinding.d
    public final void G0() {
        synchronized (this) {
            this.f11739J = 0L;
        }
        this.f11732B.H0();
        this.f11733C.H0();
        this.f11734D.H0();
        this.f11735E.H0();
        this.F.H0();
        this.f11736G.H0();
        this.f11737H.H0();
        this.f11738I.H0();
    }

    @Override // androidx.databinding.d
    public final boolean J0() {
        synchronized (this) {
            try {
                if (this.f11739J != 0) {
                    return true;
                }
                if (this.f11732B.J0() || this.f11733C.J0() || this.f11734D.J0() || this.f11735E.J0() || this.F.J0() || this.f11736G.J0() || this.f11737H.J0() || this.f11738I.J0()) {
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
            this.f11739J = 1L;
        }
        this.f11732B.L0();
        this.f11733C.L0();
        this.f11734D.L0();
        this.f11735E.L0();
        this.F.L0();
        this.f11736G.L0();
        this.f11737H.L0();
        this.f11738I.L0();
        O0();
    }

    @Override // androidx.databinding.d
    public final void P0(androidx.fragment.app.b0 b0Var) {
        super.P0(b0Var);
        this.f11732B.P0(b0Var);
        this.f11733C.P0(b0Var);
        this.f11734D.P0(b0Var);
        this.f11735E.P0(b0Var);
        this.F.P0(b0Var);
        this.f11736G.P0(b0Var);
        this.f11737H.P0(b0Var);
        this.f11738I.P0(b0Var);
    }
}
