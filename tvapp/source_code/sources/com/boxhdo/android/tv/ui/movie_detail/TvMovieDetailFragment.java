package com.boxhdo.android.tv.ui.movie_detail;

import A1.i;
import A1.j;
import A1.k;
import A1.l;
import D0.h;
import H.e;
import J0.a;
import M5.g;
import M5.p;
import S0.f;
import W5.AbstractC0117y;
import android.widget.ImageView;
import androidx.databinding.d;
import androidx.lifecycle.P;
import com.boxhdo.android.tv.R;
import com.boxhdo.android.tv.customviews.TvButton;
import com.boxhdo.domain.model.Movie;
import com.boxhdo.domain.type.MediaType;
import com.rubensousa.dpadrecyclerview.DpadRecyclerView;
import g5.b;
import h1.n;
import j1.AbstractC0823u;
import java.util.List;
import m5.C0998a;
import v1.AbstractC1315a;
import v1.c;
import v1.m;
import v1.r;
import v1.s;
import v1.t;
import w4.l0;
import z5.C1527i;
import z5.InterfaceC1522d;
/* loaded from: classes.dex */
public final class TvMovieDetailFragment extends AbstractC1315a<TvMovieDetailViewModel, AbstractC0823u> {

    /* renamed from: u0  reason: collision with root package name */
    public final e f7846u0;

    /* renamed from: v0  reason: collision with root package name */
    public final b f7847v0;

    /* renamed from: w0  reason: collision with root package name */
    public final C1527i f7848w0;

    public TvMovieDetailFragment() {
        InterfaceC1522d A6 = h4.b.A(new j(new i(22, this), 12));
        this.f7846u0 = l0.k(this, p.a(TvMovieDetailViewModel.class), new k(A6, 20), new k(A6, 21), new l(this, 10, A6));
        this.f7847v0 = new b(p.a(v1.l.class), 5, new i(21, this));
        this.f7848w0 = new C1527i(new h(16, this));
    }

    @Override // q1.t, androidx.fragment.app.ComponentCallbacksC0269x
    public final void Q() {
        super.Q();
        ((AbstractC0823u) f0()).f11723t.requestFocus();
        TvMovieDetailViewModel h02 = h0();
        Movie movie = r0().f15270a;
        g.f(movie, "movie");
        h02.d(false, new r(h02, movie, null));
    }

    @Override // q1.t
    public final int g0() {
        return R.layout.fragment_tv_movie_detail;
    }

    @Override // q1.t
    public final void j0(int i7) {
        q1.l lVar;
        if (i7 == R.id.buttonAddToWatchList) {
            boolean z7 = !((Boolean) h0().f7858q.getValue()).booleanValue();
            if (z7) {
                lVar = new q1.l(R.string.message_added_to_my_list);
            } else {
                lVar = new q1.l(R.string.message_remove_from_my_list);
            }
            n0(lVar, true);
            TvMovieDetailViewModel h02 = h0();
            Movie movie = r0().f15270a;
            g.f(movie, "movie");
            h02.d(true, new t(z7, h02, movie, null));
        } else if (i7 == R.id.buttonMoreEpisode) {
            Movie movie2 = r0().f15270a;
            g.f(movie2, "movie");
            i0(new m(movie2));
        } else if (i7 == R.id.buttonPlayNow) {
            String str = r0().f15270a.f8032t;
            MediaType mediaType = r0().f15270a.f8037y;
            String str2 = r0().f15270a.f8035w;
            g.f(str, "movieName");
            g.f(mediaType, "movieType");
            i0(new n(str, mediaType, r0().f15270a.f8029q, 1L, 1L, 1L, 0L, r0().f15270a.f8031s, r0().f15270a.f8034v, (float) r0().f15270a.F, str2));
        }
    }

    @Override // q1.t
    public final void k0() {
        AbstractC0117y.p(P.g(this), null, 0, new v1.k(null, this), 3);
        TvMovieDetailViewModel h02 = h0();
        Movie movie = r0().f15270a;
        g.f(movie, "movie");
        h02.d(false, new s(h02, movie, null));
    }

    @Override // q1.t
    public final List l0(d dVar) {
        AbstractC0823u abstractC0823u = (AbstractC0823u) dVar;
        return A5.l.L(abstractC0823u.f11723t, abstractC0823u.f11722s, abstractC0823u.f11721r);
    }

    @Override // q1.t
    public final void o0() {
        Movie movie = r0().f15270a;
        AbstractC0823u abstractC0823u = (AbstractC0823u) f0();
        abstractC0823u.f11728y.setText(movie.f8034v);
        ImageView imageView = abstractC0823u.f11724u;
        g.e(imageView, "imageBackdropMovie");
        J0.j a7 = a.a(imageView.getContext());
        f fVar = new f(imageView.getContext());
        fVar.f2984c = movie.f8030r;
        fVar.b(imageView);
        a7.b(fVar.a());
        abstractC0823u.f11727x.setText(movie.f8032t);
        DpadRecyclerView dpadRecyclerView = abstractC0823u.f11726w;
        dpadRecyclerView.setHasFixedSize(true);
        int dimensionPixelSize = u().getDimensionPixelSize(R.dimen.dp_6);
        int i7 = 0;
        dpadRecyclerView.h(new C0998a(dimensionPixelSize, dimensionPixelSize, 0));
        dpadRecyclerView.setAdapter((c) this.f7848w0.getValue());
        abstractC0823u.f11720A.setText(l0.q(movie.f8035w, "MMMM dd, yyyy"));
        abstractC0823u.f11729z.setText(String.valueOf(movie.F));
        TvButton tvButton = abstractC0823u.f11722s;
        g.e(tvButton, "buttonMoreEpisode");
        if (movie.f8037y != MediaType.f8097t) {
            i7 = 8;
        }
        tvButton.setVisibility(i7);
    }

    public final v1.l r0() {
        return (v1.l) this.f7847v0.getValue();
    }

    @Override // q1.t
    /* renamed from: s0 */
    public final TvMovieDetailViewModel h0() {
        return (TvMovieDetailViewModel) this.f7846u0.getValue();
    }
}
