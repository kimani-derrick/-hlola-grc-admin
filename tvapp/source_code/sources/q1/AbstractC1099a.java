package q1;

import H2.E;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.DataBinderMapperImpl;
import androidx.fragment.app.ComponentCallbacksC0269x;
import androidx.leanback.app.F;
import androidx.leanback.widget.AbstractC0281a0;
import androidx.leanback.widget.AbstractC0283b0;
import androidx.leanback.widget.AbstractC0287d0;
import androidx.leanback.widget.AbstractC0299j0;
import androidx.leanback.widget.C0280a;
import androidx.leanback.widget.C0297i0;
import androidx.leanback.widget.J;
import androidx.leanback.widget.L;
import androidx.leanback.widget.P;
import androidx.leanback.widget.U;
import androidx.leanback.widget.V;
import androidx.leanback.widget.VerticalGridView;
import androidx.leanback.widget.Z;
import com.boxhdo.android.tv.R;
import com.boxhdo.domain.model.Movie;
import j1.a0;
import j1.c0;
import j1.i0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
/* renamed from: q1.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1099a extends androidx.leanback.app.s implements V, U {

    /* renamed from: C1  reason: collision with root package name */
    public static final /* synthetic */ int f13221C1 = 0;

    /* renamed from: A1  reason: collision with root package name */
    public a0 f13222A1;

    /* renamed from: B1  reason: collision with root package name */
    public final C0280a f13223B1;

    /* renamed from: y1  reason: collision with root package name */
    public c0 f13224y1;

    /* renamed from: z1  reason: collision with root package name */
    public i0 f13225z1;

    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.leanback.widget.j0, q1.j, androidx.leanback.widget.a0] */
    public AbstractC1099a() {
        VerticalGridView verticalGridView;
        ?? abstractC0299j0 = new AbstractC0299j0();
        abstractC0299j0.d = 1;
        abstractC0299j0.f13245g = true;
        abstractC0299j0.f13246h = -1;
        abstractC0299j0.f13247i = true;
        abstractC0299j0.f13248j = true;
        abstractC0299j0.f13249k = new HashMap();
        abstractC0299j0.f13244e = 0;
        abstractC0299j0.f = false;
        abstractC0299j0.f13245g = false;
        abstractC0299j0.f6603b = false;
        C0280a c0280a = new C0280a((AbstractC0281a0) abstractC0299j0);
        F t02 = t0();
        if (t02 != null && (verticalGridView = t02.f6197o0) != null) {
            verticalGridView.setItemViewCacheSize(5);
        }
        this.f13223B1 = c0280a;
    }

    @Override // androidx.leanback.app.s, androidx.leanback.app.AbstractC0278g, androidx.fragment.app.ComponentCallbacksC0269x
    public final void G(Bundle bundle) {
        super.G(bundle);
        y0(3);
        this.f6277g1 = this;
        androidx.leanback.app.q qVar = this.f6264R0;
        if (qVar != null) {
            F f = (F) ((ComponentCallbacksC0269x) qVar.f6249a);
            f.f6172F0 = this;
            if (f.f6167A0) {
                throw new IllegalStateException("Item clicked listener must be set before views are created");
            }
        }
        this.f6276f1 = this;
    }

    @Override // androidx.leanback.app.s, androidx.fragment.app.ComponentCallbacksC0269x
    public final View H(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        M5.g.f(layoutInflater, "inflater");
        View H6 = super.H(layoutInflater, viewGroup, bundle);
        int i7 = c0.f11615x;
        DataBinderMapperImpl dataBinderMapperImpl = androidx.databinding.b.f5656a;
        c0 c0Var = (c0) androidx.databinding.d.K0(layoutInflater, R.layout.layout_movie_preview_home, viewGroup, false, null);
        M5.g.e(c0Var, "inflate(inflater, container, false)");
        this.f13224y1 = c0Var;
        int i8 = i0.f11650t;
        i0 i0Var = (i0) androidx.databinding.d.K0(layoutInflater, R.layout.layout_shimmer_home, viewGroup, false, null);
        M5.g.e(i0Var, "inflate(inflater, container, false)");
        this.f13225z1 = i0Var;
        int i9 = a0.f11608r;
        a0 a0Var = (a0) androidx.databinding.d.K0(layoutInflater, R.layout.layout_error, viewGroup, false, null);
        M5.g.e(a0Var, "inflate(inflater, container, false)");
        this.f13222A1 = a0Var;
        View view = I0().f5662g;
        M5.g.e(view, "movieBinding.root");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.width = -1;
            layoutParams2.height = u().getDimensionPixelSize(R.dimen.dp_256);
            layoutParams2.setMargins(u().getDimensionPixelSize(R.dimen.dp_75), 0, 0, 0);
            view.setLayoutParams(layoutParams2);
            View view2 = J0().f5662g;
            M5.g.e(view2, "shimmerBinding.root");
            ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
            if (layoutParams3 != null) {
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                layoutParams4.width = -1;
                layoutParams4.height = -1;
                layoutParams4.setMargins(u().getDimensionPixelSize(R.dimen.dp_75), 0, 0, 0);
                view2.setLayoutParams(layoutParams4);
                a0 a0Var2 = this.f13222A1;
                if (a0Var2 != null) {
                    View view3 = a0Var2.f5662g;
                    M5.g.e(view3, "errorBinding.root");
                    ViewGroup.LayoutParams layoutParams5 = view3.getLayoutParams();
                    if (layoutParams5 != null) {
                        FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) layoutParams5;
                        layoutParams6.width = -1;
                        layoutParams6.height = -1;
                        layoutParams6.setMargins(u().getDimensionPixelSize(R.dimen.dp_75), 0, 0, 0);
                        view3.setLayoutParams(layoutParams6);
                        if (this.f13222A1 != null) {
                            H6.setBackgroundColor(A.b.a(a0(), R.color.colorBackground));
                            p6.d.D(H6, J0().f5662g);
                            p6.d.D(H6, I0().f5662g);
                            return H6;
                        }
                        M5.g.l("errorBinding");
                        throw null;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                }
                M5.g.l("errorBinding");
                throw null;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }

    public abstract void H0();

    public final c0 I0() {
        c0 c0Var = this.f13224y1;
        if (c0Var != null) {
            return c0Var;
        }
        M5.g.l("movieBinding");
        throw null;
    }

    public final i0 J0() {
        i0 i0Var = this.f13225z1;
        if (i0Var != null) {
            return i0Var;
        }
        M5.g.l("shimmerBinding");
        throw null;
    }

    public void K0(Object obj, AbstractC0287d0 abstractC0287d0) {
        if (obj instanceof Movie) {
            M0((Movie) obj);
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0269x
    public void M(boolean z7) {
        int i7;
        ViewGroup viewGroup = null;
        if (z7) {
            View view = this.W;
            if (view instanceof ViewGroup) {
                viewGroup = (ViewGroup) view;
            }
            if (viewGroup != null) {
                i7 = 262144;
            } else {
                return;
            }
        } else {
            View view2 = this.W;
            if (view2 instanceof ViewGroup) {
                viewGroup = (ViewGroup) view2;
            }
            if (viewGroup != null) {
                i7 = 131072;
            } else {
                return;
            }
        }
        viewGroup.setDescendantFocusability(i7);
    }

    public abstract void M0(Movie movie);

    public final void N0(Movie movie) {
        M5.g.f(movie, "movie");
        c0 I02 = I0();
        LinearLayout linearLayout = I02.f11617s;
        M5.g.e(linearLayout, "layoutMovieInfo");
        linearLayout.setVisibility(0);
        I02.f11618t.setText(movie.f8032t);
        ImageView imageView = I02.f11616r;
        M5.g.e(imageView, "imageBackdropMovie");
        J0.j a7 = J0.a.a(imageView.getContext());
        S0.f fVar = new S0.f(imageView.getContext());
        fVar.f2984c = movie.f8030r;
        fVar.b(imageView);
        a7.b(fVar.a());
        I02.f11619u.setText(movie.f8034v);
        I02.f11620v.setText(String.format(Locale.getDefault(), "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(movie.F)}, 1)));
        I02.f11621w.setText(movie.e());
    }

    public final void O0(Movie movie) {
        M5.g.f(movie, "movie");
        c0 I02 = I0();
        ImageView imageView = I02.f11616r;
        M5.g.e(imageView, "imageBackdropMovie");
        TextView textView = I02.f11618t;
        M5.g.e(textView, "textMovieName");
        LinearLayout linearLayout = I02.f11617s;
        M5.g.e(linearLayout, "layoutMovieInfo");
        TextView textView2 = I02.f11619u;
        M5.g.e(textView2, "textOverview");
        for (View view : A5.l.L(imageView, textView, linearLayout, textView2)) {
            view.animate().alpha(0.0f).setDuration(200L).setInterpolator(new DecelerateInterpolator()).withEndAction(new E(this, movie, view, 9)).start();
        }
    }

    public final void P0() {
        View view = this.W;
        a0 a0Var = this.f13222A1;
        if (a0Var != null) {
            p6.d.C(view, a0Var.f5662g);
        } else {
            M5.g.l("errorBinding");
            throw null;
        }
    }

    @Override // androidx.leanback.app.C0279h, androidx.fragment.app.ComponentCallbacksC0269x
    public void Q() {
        VerticalGridView verticalGridView;
        super.Q();
        F t02 = t0();
        if (t02 != null) {
            verticalGridView = t02.f6197o0;
        } else {
            verticalGridView = null;
        }
        if (verticalGridView != null) {
            verticalGridView.setWindowAlignmentOffset(u().getDimensionPixelSize(R.dimen.dp_50));
        }
    }

    public final void Q0() {
        p6.d.E(this.W, I0().f5662g);
    }

    public final void R0() {
        p6.d.E(this.W, J0().f5662g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.leanback.widget.j0, androidx.leanback.widget.C] */
    @Override // androidx.leanback.app.AbstractC0278g, androidx.leanback.app.C0279h, androidx.fragment.app.ComponentCallbacksC0269x
    public final void U(View view, Bundle bundle) {
        M5.g.f(view, "view");
        super.U(view, bundle);
        C0280a c0280a = this.f13223B1;
        this.f6266T0 = c0280a;
        if (c0280a == null) {
            this.U0 = null;
        } else {
            AbstractC0283b0 abstractC0283b0 = c0280a.f6438b;
            if (abstractC0283b0 != null) {
                if (abstractC0283b0 != this.U0) {
                    this.U0 = abstractC0283b0;
                    AbstractC0281a0[] b7 = abstractC0283b0.b();
                    ?? abstractC0299j0 = new AbstractC0299j0();
                    abstractC0299j0.f6602a = null;
                    int length = b7.length;
                    AbstractC0281a0[] abstractC0281a0Arr = new AbstractC0281a0[length + 1];
                    System.arraycopy(abstractC0281a0Arr, 0, b7, 0, b7.length);
                    abstractC0281a0Arr[length] = abstractC0299j0;
                    this.f6266T0.c(new androidx.leanback.app.l(abstractC0283b0, abstractC0299j0, abstractC0281a0Arr));
                }
            } else {
                throw new IllegalArgumentException("Adapter.getPresenterSelector() is null");
            }
        }
        if (this.W != null) {
            F0();
            androidx.leanback.app.y yVar = this.f6263Q0;
            P p3 = this.f6266T0;
            if (yVar.f6196n0 != p3) {
                yVar.f6196n0 = p3;
                yVar.m0();
            }
        }
        H0();
    }

    public /* bridge */ /* synthetic */ void c(Z z7, Object obj, L l7, J j7) {
        K0(obj, j7);
    }

    public /* bridge */ /* synthetic */ void g(Z z7, Object obj, C0297i0 c0297i0, Object obj2) {
        AbstractC0287d0 abstractC0287d0 = (AbstractC0287d0) obj2;
        L0(z7, obj);
    }

    public void L0(Z z7, Object obj) {
    }
}
