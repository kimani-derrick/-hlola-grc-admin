package com.boxhdo.android.tv.ui.episode_list;

import A1.i;
import A1.j;
import A1.k;
import A1.l;
import H.e;
import M5.g;
import M5.p;
import W5.AbstractC0117y;
import androidx.lifecycle.P;
import com.boxhdo.android.tv.R;
import com.boxhdo.android.tv.customviews.CustomVerticalGridView;
import com.boxhdo.domain.model.Movie;
import g5.b;
import j1.AbstractC0817o;
import r1.AbstractC1112a;
import r1.c;
import r1.n;
import r1.q;
import w4.l0;
import z5.C1527i;
import z5.InterfaceC1522d;
/* loaded from: classes.dex */
public final class TvEpisodeListFragment extends AbstractC1112a<TvEpisodeListViewModel, AbstractC0817o> {

    /* renamed from: u0  reason: collision with root package name */
    public final e f7818u0;

    /* renamed from: v0  reason: collision with root package name */
    public final b f7819v0;

    /* renamed from: w0  reason: collision with root package name */
    public final C1527i f7820w0;

    /* renamed from: x0  reason: collision with root package name */
    public final C1527i f7821x0;

    public TvEpisodeListFragment() {
        InterfaceC1522d A6 = h4.b.A(new j(new i(17, this), 8));
        this.f7818u0 = l0.k(this, p.a(TvEpisodeListViewModel.class), new k(A6, 12), new k(A6, 13), new l(this, 6, A6));
        this.f7819v0 = new b(p.a(r1.l.class), 5, new i(16, this));
        this.f7820w0 = new C1527i(new r1.e(this, 1));
        this.f7821x0 = new C1527i(new r1.e(this, 0));
    }

    @Override // q1.t
    public final int g0() {
        return R.layout.fragment_tv_episode_list;
    }

    @Override // q1.t
    public final q1.i h0() {
        return (TvEpisodeListViewModel) this.f7818u0.getValue();
    }

    @Override // q1.t
    public final void k0() {
        AbstractC0117y.p(P.g(this), null, 0, new r1.k(this, null), 3);
        TvEpisodeListViewModel tvEpisodeListViewModel = (TvEpisodeListViewModel) this.f7818u0.getValue();
        Movie movie = r0().f13434a;
        g.f(movie, "movie");
        tvEpisodeListViewModel.d(true, new n(tvEpisodeListViewModel, movie, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
        if (r0 != null) goto L11;
     */
    @Override // q1.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m0(boolean r5) {
        /*
            r4 = this;
            q1.g r0 = r4.m()
            boolean r1 = r0 instanceof com.boxhdo.android.tv.ui.activity.main.TvActivity
            r2 = 0
            if (r1 == 0) goto Lc
            com.boxhdo.android.tv.ui.activity.main.TvActivity r0 = (com.boxhdo.android.tv.ui.activity.main.TvActivity) r0
            goto Ld
        Lc:
            r0 = r2
        Ld:
            if (r0 == 0) goto L49
            androidx.databinding.d r1 = r0.U()
            j1.c r1 = (j1.AbstractC0805c) r1
            java.lang.String r3 = "binding.progressBar"
            android.widget.ProgressBar r1 = r1.f11614s
            M5.g.e(r1, r3)
            if (r5 == 0) goto L20
            r3 = 0
            goto L22
        L20:
            r3 = 8
        L22:
            r1.setVisibility(r3)
            if (r5 == 0) goto L39
            android.view.View r1 = r0.getCurrentFocus()
            r0.f7792U = r1
            androidx.databinding.d r0 = r0.U()
            j1.c r0 = (j1.AbstractC0805c) r0
            android.widget.ProgressBar r0 = r0.f11614s
        L35:
            r0.requestFocus()
            goto L49
        L39:
            androidx.databinding.d r1 = r0.U()
            j1.c r1 = (j1.AbstractC0805c) r1
            android.widget.ProgressBar r1 = r1.f11614s
            r1.clearFocus()
            android.view.View r0 = r0.f7792U
            if (r0 == 0) goto L49
            goto L35
        L49:
            androidx.databinding.d r0 = r4.f0()
            j1.o r0 = (j1.AbstractC0817o) r0
            android.view.View r0 = r0.f5662g
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto L58
            r2 = r0
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
        L58:
            if (r2 != 0) goto L5b
            goto L65
        L5b:
            if (r5 == 0) goto L60
            r5 = 393216(0x60000, float:5.51013E-40)
            goto L62
        L60:
            r5 = 131072(0x20000, float:1.83671E-40)
        L62:
            r2.setDescendantFocusability(r5)
        L65:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.boxhdo.android.tv.ui.episode_list.TvEpisodeListFragment.m0(boolean):void");
    }

    @Override // q1.t
    public final void o0() {
        AbstractC0817o abstractC0817o = (AbstractC0817o) f0();
        abstractC0817o.f11699t.setText(r0().f13434a.f8032t);
        abstractC0817o.f11701v.setText(r0().f13434a.e());
        CustomVerticalGridView customVerticalGridView = abstractC0817o.f11698s;
        customVerticalGridView.setAdapter((q) this.f7820w0.getValue());
        customVerticalGridView.setHasFixedSize(true);
        CustomVerticalGridView customVerticalGridView2 = abstractC0817o.f11697r;
        customVerticalGridView2.setAdapter((c) this.f7821x0.getValue());
        customVerticalGridView2.setHasFixedSize(true);
        customVerticalGridView2.setFocusLeftId(R.id.recyclerSeason);
    }

    public final r1.l r0() {
        return (r1.l) this.f7819v0.getValue();
    }
}
