package com.boxhdo.android.tv.ui.home;

import A1.i;
import A1.j;
import A1.k;
import A1.l;
import B0.d;
import H.e;
import M5.g;
import M5.p;
import W5.AbstractC0117y;
import W5.p0;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.ComponentCallbacksC0269x;
import androidx.leanback.app.F;
import androidx.leanback.widget.AbstractC0287d0;
import androidx.leanback.widget.AbstractC0299j0;
import androidx.leanback.widget.C0297i0;
import androidx.leanback.widget.G;
import androidx.leanback.widget.J;
import androidx.leanback.widget.L;
import androidx.leanback.widget.VerticalGridView;
import androidx.leanback.widget.Z;
import androidx.lifecycle.InterfaceC0342u;
import androidx.lifecycle.P;
import com.boxhdo.android.tv.R;
import com.boxhdo.android.tv.ui.hostMain.TvMainFragment;
import com.boxhdo.domain.model.ContinueWatch;
import com.boxhdo.domain.model.Movie;
import com.boxhdo.domain.model.Network;
import com.boxhdo.domain.model.Vote;
import com.boxhdo.domain.type.MediaType;
import com.boxhdo.domain.type.NetworkType;
import h1.n;
import h4.b;
import java.util.List;
import q1.InterfaceC1100b;
import q1.InterfaceC1101c;
import q1.InterfaceC1102d;
import q1.InterfaceC1103e;
import s1.AbstractC1126a;
import s1.C1136k;
import s1.C1137l;
import s1.C1142q;
import s1.C1144s;
import t1.C1228d;
import w4.l0;
import z5.C1527i;
import z5.InterfaceC1522d;
/* loaded from: classes.dex */
public final class TvHomeFragment extends AbstractC1126a implements InterfaceC1103e, InterfaceC1101c, InterfaceC1102d, InterfaceC1100b {

    /* renamed from: L1  reason: collision with root package name */
    public static final /* synthetic */ int f7827L1 = 0;
    public final e I1;

    /* renamed from: J1  reason: collision with root package name */
    public View f7828J1;

    /* renamed from: K1  reason: collision with root package name */
    public final C1527i f7829K1;

    public TvHomeFragment() {
        InterfaceC1522d A6 = b.A(new j(new i(18, this), 9));
        this.I1 = l0.k(this, p.a(TvHomeViewModel.class), new k(A6, 14), new k(A6, 15), new l(this, 7, A6));
        this.f7829K1 = new C1527i(C1137l.f13565r);
    }

    @Override // q1.AbstractC1099a
    public final void H0() {
        AbstractC0117y.p(P.g(this), null, 0, new C1136k(this, null), 3);
    }

    @Override // q1.AbstractC1099a
    public final void K0(Object obj, AbstractC0287d0 abstractC0287d0) {
        InterfaceC0342u interfaceC0342u;
        MediaType mediaType;
        long j7;
        long j8;
        long j9;
        long j10;
        String str;
        NetworkType networkType;
        ComponentCallbacksC0269x componentCallbacksC0269x;
        TvMainFragment tvMainFragment;
        d dVar;
        if (obj instanceof Movie) {
            M0((Movie) obj);
        }
        TvMainFragment tvMainFragment2 = null;
        if (obj instanceof Network) {
            if (abstractC0287d0 != null && (dVar = abstractC0287d0.f6576a) != null) {
                str = dVar.f149r;
            } else {
                str = null;
            }
            if (g.a(str, "Companies")) {
                networkType = NetworkType.f8100q;
            } else {
                networkType = NetworkType.f8101r;
            }
            Network network = (Network) obj;
            ComponentCallbacksC0269x componentCallbacksC0269x2 = this.f6109M;
            if (componentCallbacksC0269x2 != null) {
                componentCallbacksC0269x = componentCallbacksC0269x2.f6109M;
            } else {
                componentCallbacksC0269x = null;
            }
            if (componentCallbacksC0269x instanceof TvMainFragment) {
                tvMainFragment = (TvMainFragment) componentCallbacksC0269x;
            } else {
                tvMainFragment = null;
            }
            if (tvMainFragment != null) {
                g.f(network, "item");
                tvMainFragment.i0(new C1228d(network, networkType));
            }
        }
        if (obj instanceof ContinueWatch) {
            ComponentCallbacksC0269x componentCallbacksC0269x3 = this.f6109M;
            if (componentCallbacksC0269x3 != null) {
                interfaceC0342u = componentCallbacksC0269x3.f6109M;
            } else {
                interfaceC0342u = null;
            }
            if (interfaceC0342u instanceof TvMainFragment) {
                tvMainFragment2 = (TvMainFragment) interfaceC0342u;
            }
            if (tvMainFragment2 != null) {
                ContinueWatch continueWatch = (ContinueWatch) obj;
                g.f(continueWatch, "continueWatch");
                Long l7 = continueWatch.f7957x;
                if (l7 != null) {
                    mediaType = MediaType.f8097t;
                } else {
                    mediaType = MediaType.f8096s;
                }
                MediaType mediaType2 = mediaType;
                if (l7 != null) {
                    j7 = l7.longValue();
                } else {
                    j7 = 0;
                }
                Long l8 = continueWatch.f7958y;
                if (l8 != null) {
                    j8 = l8.longValue();
                } else {
                    j8 = 0;
                }
                Long l9 = continueWatch.f7959z;
                if (l9 != null) {
                    j9 = l9.longValue();
                } else {
                    j9 = 0;
                }
                Long l10 = continueWatch.f7947A;
                if (l10 != null) {
                    j10 = l10.longValue();
                } else {
                    j10 = 0;
                }
                String str2 = continueWatch.f7951r;
                g.f(str2, "movieName");
                tvMainFragment2.i0(new n(str2, mediaType2, continueWatch.f7950q, j7, j8, j9, j10, continueWatch.f7956w, continueWatch.f7952s, continueWatch.f7955v, continueWatch.f7954u));
            }
        }
    }

    @Override // q1.AbstractC1099a
    public final void L0(Z z7, Object obj) {
        TvHomeFragment tvHomeFragment;
        View view;
        String str;
        String str2;
        if (z7 != null) {
            view = z7.f6572a;
            tvHomeFragment = this;
        } else {
            tvHomeFragment = this;
            view = null;
        }
        tvHomeFragment.f7828J1 = view;
        if (obj instanceof Movie) {
            Movie movie = (Movie) obj;
            TvHomeViewModel T02 = T0();
            g.f(movie, "movie");
            p0 p0Var = T02.f7836m;
            if (p0Var != null) {
                p0Var.b(null);
            }
            T02.f7836m = T02.d(false, new C1144s(true, T02, movie, null));
        }
        if (obj instanceof ContinueWatch) {
            ContinueWatch continueWatch = (ContinueWatch) obj;
            TvHomeViewModel T03 = T0();
            long j7 = continueWatch.f7950q;
            String str3 = continueWatch.f7956w;
            if (str3 == null) {
                str3 = "";
            }
            String str4 = continueWatch.f7952s;
            if (str4 == null) {
                str = "";
            } else {
                str = str4;
            }
            double d = continueWatch.f7955v;
            String str5 = continueWatch.f7954u;
            if (str5 == null) {
                str2 = "";
            } else {
                str2 = str5;
            }
            Movie movie2 = new Movie(j7, str3, (String) null, continueWatch.f7951r, 0L, str, str2, 0, (MediaType) null, (String) null, (String) null, false, 0, 0, (String) null, d, 0L, (List) null, (List) null, (List) null, (List) null, false, (Vote) null, 16744340);
            p0 p0Var2 = T03.f7836m;
            if (p0Var2 != null) {
                p0Var2.b(null);
            }
            T03.f7836m = T03.d(false, new C1144s(true, T03, movie2, null));
        }
    }

    @Override // q1.AbstractC1099a, androidx.fragment.app.ComponentCallbacksC0269x
    public final void M(boolean z7) {
        super.M(z7);
        if (z7) {
            return;
        }
        View view = this.f7828J1;
        if (view != null) {
            view.requestFocus();
        }
        this.f7828J1 = null;
    }

    @Override // q1.AbstractC1099a
    public final void M0(Movie movie) {
        InterfaceC0342u interfaceC0342u;
        g.f(movie, "movie");
        ComponentCallbacksC0269x componentCallbacksC0269x = this.f6109M;
        TvMainFragment tvMainFragment = null;
        if (componentCallbacksC0269x != null) {
            interfaceC0342u = componentCallbacksC0269x.f6109M;
        } else {
            interfaceC0342u = null;
        }
        if (interfaceC0342u instanceof TvMainFragment) {
            tvMainFragment = (TvMainFragment) interfaceC0342u;
        }
        if (tvMainFragment != null) {
            tvMainFragment.t0(movie);
        }
    }

    @Override // q1.AbstractC1099a, androidx.leanback.app.C0279h, androidx.fragment.app.ComponentCallbacksC0269x
    public final void Q() {
        VerticalGridView verticalGridView;
        super.Q();
        F t02 = t0();
        if (t02 != null && (verticalGridView = t02.f6197o0) != null) {
            ViewGroup.LayoutParams layoutParams = verticalGridView.getLayoutParams();
            if (layoutParams != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.setMargins(0, u().getDimensionPixelSize(R.dimen.dp_200), 0, 0);
                verticalGridView.setLayoutParams(layoutParams2);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
        }
        TvHomeViewModel T02 = T0();
        T02.d(false, new C1142q(T02, null));
    }

    public final TvHomeViewModel T0() {
        return (TvHomeViewModel) this.I1.getValue();
    }

    @Override // androidx.leanback.app.s, q1.InterfaceC1102d
    public final void b() {
        View view;
        if (A() || (view = this.f7828J1) == null) {
            return;
        }
        view.requestFocus();
        this.f7828J1 = null;
    }

    @Override // q1.AbstractC1099a, androidx.leanback.widget.U
    public final /* bridge */ /* synthetic */ void c(Z z7, Object obj, L l7, J j7) {
        K0(obj, j7);
    }

    @Override // q1.InterfaceC1100b
    public final void d() {
    }

    @Override // q1.AbstractC1099a, androidx.leanback.widget.V
    public final /* bridge */ /* synthetic */ void g(Z z7, Object obj, C0297i0 c0297i0, Object obj2) {
        AbstractC0287d0 abstractC0287d0 = (AbstractC0287d0) obj2;
        L0(z7, obj);
    }

    @Override // q1.InterfaceC1101c
    public final void h() {
        ComponentCallbacksC0269x componentCallbacksC0269x;
        G g7;
        C0297i0 k5;
        L l7;
        int i7;
        View view;
        C0297i0 u02;
        C0297i0 u03;
        View view2;
        ComponentCallbacksC0269x componentCallbacksC0269x2 = this.f6109M;
        View view3 = null;
        if (componentCallbacksC0269x2 != null) {
            componentCallbacksC0269x = componentCallbacksC0269x2.f6109M;
        } else {
            componentCallbacksC0269x = null;
        }
        int i8 = t0().f6200r0;
        VerticalGridView verticalGridView = t0().f6197o0;
        if (verticalGridView == null || (g7 = (G) verticalGridView.G(i8)) == null) {
            k5 = null;
        } else {
            ((AbstractC0299j0) g7.f6366u).getClass();
            k5 = AbstractC0299j0.k(g7.f6367v);
        }
        if (k5 instanceof L) {
            l7 = (L) k5;
        } else {
            l7 = null;
        }
        if (l7 != null) {
            i7 = l7.n.getSelectedPosition();
        } else {
            i7 = -1;
        }
        if (componentCallbacksC0269x instanceof TvMainFragment) {
            if (u0() == null || ((u03 = u0()) != null && (view2 = u03.f6572a) != null && view2.hasFocus() && i7 == 0)) {
                C0297i0 u04 = u0();
                if (u04 != null && (view = u04.f6572a) != null && view.hasFocus() && (u02 = u0()) != null) {
                    view3 = u02.f6572a;
                }
                this.f7828J1 = view3;
                ((TvMainFragment) componentCallbacksC0269x).w0();
            }
        }
    }
}
