package com.boxhdo.android.tv.ui.hostMain;

import A1.i;
import A1.j;
import A1.k;
import A1.l;
import H.e;
import M5.p;
import android.animation.ValueAnimator;
import androidx.activity.w;
import androidx.fragment.app.ComponentCallbacksC0269x;
import androidx.fragment.app.S;
import androidx.navigation.fragment.NavHostFragment;
import com.boxhdo.android.tv.R;
import com.boxhdo.android.tv.customviews.CustomNavigationView;
import com.boxhdo.domain.model.Movie;
import h1.m;
import h4.b;
import i1.c;
import i1.d;
import j1.AbstractC0821s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n0.C0999A;
import n0.v;
import o1.C1061f;
import q1.InterfaceC1100b;
import q1.InterfaceC1101c;
import q1.InterfaceC1102d;
import q1.InterfaceC1103e;
import q1.g;
import t1.AbstractC1225a;
import t1.C1226b;
import t1.C1227c;
import w4.l0;
import z5.C1527i;
import z5.InterfaceC1522d;
/* loaded from: classes.dex */
public final class TvMainFragment extends AbstractC1225a<TvMainViewModel, AbstractC0821s> implements InterfaceC1101c, d, InterfaceC1102d, InterfaceC1100b, InterfaceC1103e {

    /* renamed from: A0  reason: collision with root package name */
    public final C1527i f7837A0;

    /* renamed from: u0  reason: collision with root package name */
    public final e f7838u0;

    /* renamed from: v0  reason: collision with root package name */
    public boolean f7839v0;

    /* renamed from: w0  reason: collision with root package name */
    public final C1527i f7840w0;

    /* renamed from: x0  reason: collision with root package name */
    public final C1527i f7841x0;
    public C0999A y0;

    /* renamed from: z0  reason: collision with root package name */
    public NavHostFragment f7842z0;

    public TvMainFragment() {
        InterfaceC1522d A6 = b.A(new j(new i(19, this), 10));
        this.f7838u0 = l0.k(this, p.a(TvMainViewModel.class), new k(A6, 16), new k(A6, 17), new l(this, 8, A6));
        this.f7840w0 = new C1527i(new C1226b(this, 2));
        this.f7841x0 = new C1527i(new C1226b(this, 1));
        this.f7837A0 = new C1527i(new C1226b(this, 0));
    }

    @Override // q1.t, androidx.fragment.app.ComponentCallbacksC0269x
    public final void M(boolean z7) {
        C0999A c0999a;
        v e3;
        super.M(z7);
        boolean z8 = false;
        if (z7) {
            r0().e(false);
        } else {
            r0().e((this.f7839v0 || (c0999a = this.y0) == null || (e3 = c0999a.e()) == null || e3.f12607x != R.id.home) ? true : true);
        }
    }

    @Override // q1.InterfaceC1102d
    public final void b() {
        S n;
        List A6;
        if (this.f7839v0) {
            NavHostFragment navHostFragment = this.f7842z0;
            if (navHostFragment != null && (n = navHostFragment.n()) != null && (A6 = n.f5925c.A()) != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : A6) {
                    if (obj instanceof InterfaceC1102d) {
                        arrayList.add(obj);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((InterfaceC1102d) it.next()).b();
                }
            }
            u0();
        }
    }

    @Override // q1.InterfaceC1100b
    public final void d() {
        S n;
        List A6;
        NavHostFragment navHostFragment = this.f7842z0;
        if (navHostFragment != null && (n = navHostFragment.n()) != null && (A6 = n.f5925c.A()) != null) {
            ArrayList<InterfaceC1100b> arrayList = new ArrayList();
            for (Object obj : A6) {
                if (obj instanceof InterfaceC1100b) {
                    arrayList.add(obj);
                }
            }
            for (InterfaceC1100b interfaceC1100b : arrayList) {
                interfaceC1100b.d();
            }
        }
    }

    @Override // q1.t
    public final int g0() {
        return R.layout.fragment_tv_main;
    }

    @Override // q1.InterfaceC1101c
    public final void h() {
        S n;
        List A6;
        ComponentCallbacksC0269x E4 = n().E(R.id.nested_nav_host_fragment);
        if (E4 != null && (n = E4.n()) != null && (A6 = n.f5925c.A()) != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : A6) {
                if (obj instanceof InterfaceC1101c) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((InterfaceC1101c) it.next()).h();
            }
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0269x, q1.InterfaceC1103e
    public final void i() {
        S n;
        List A6;
        NavHostFragment navHostFragment = this.f7842z0;
        if (navHostFragment != null && (n = navHostFragment.n()) != null && (A6 = n.f5925c.A()) != null) {
            ArrayList<InterfaceC1103e> arrayList = new ArrayList();
            for (Object obj : A6) {
                if (obj instanceof InterfaceC1103e) {
                    arrayList.add(obj);
                }
            }
            for (InterfaceC1103e interfaceC1103e : arrayList) {
                interfaceC1103e.i();
            }
        }
    }

    @Override // q1.t
    public final void o0() {
        NavHostFragment navHostFragment;
        S n;
        w e3;
        ((AbstractC0821s) f0()).f11717r.setMenuClickListener(this);
        ComponentCallbacksC0269x E4 = n().E(R.id.nested_nav_host_fragment);
        C0999A c0999a = null;
        if (E4 instanceof NavHostFragment) {
            navHostFragment = (NavHostFragment) E4;
        } else {
            navHostFragment = null;
        }
        this.f7842z0 = navHostFragment;
        if (navHostFragment != null && (c0999a = navHostFragment.f6849n0) == null) {
            throw new IllegalStateException("NavController is not available before onCreate()".toString());
        }
        this.y0 = c0999a;
        g m7 = m();
        if (m7 != null && (e3 = m7.e()) != null) {
            C1227c r02 = r0();
            M5.g.f(r02, "onBackPressedCallback");
            e3.b(r02);
        }
        NavHostFragment navHostFragment2 = this.f7842z0;
        if (navHostFragment2 != null && (n = navHostFragment2.n()) != null) {
            n.f5933m.add(new C1061f(1, this));
        }
        if (h0().f != c.f11324r) {
            v0(h0().f);
        }
    }

    public final C1227c r0() {
        return (C1227c) this.f7840w0.getValue();
    }

    @Override // q1.t
    /* renamed from: s0 */
    public final TvMainViewModel h0() {
        return (TvMainViewModel) this.f7838u0.getValue();
    }

    public final void t0(Movie movie) {
        M5.g.f(movie, "movie");
        i0(new m(movie));
    }

    public final void u0() {
        this.f7839v0 = false;
        ValueAnimator ofInt = ValueAnimator.ofInt(((AbstractC0821s) f0()).f11717r.getMeasuredWidth(), ((Number) this.f7841x0.getValue()).intValue());
        int i7 = CustomNavigationView.f7777t;
        CustomNavigationView customNavigationView = ((AbstractC0821s) f0()).f11717r;
        M5.g.e(customNavigationView, "binding.leftMenu");
        M5.g.e(ofInt, "valueAnimator");
        android.support.v4.media.session.b.b(customNavigationView, ofInt);
        CustomNavigationView customNavigationView2 = ((AbstractC0821s) f0()).f11717r;
        customNavigationView2.e(false);
        customNavigationView2.b(false);
        ((AbstractC0821s) f0()).f11717r.clearFocus();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0033, code lost:
        if (r5 != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
        r5.h(r0, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004f, code lost:
        if (r5 != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0067, code lost:
        if (r5 != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x007f, code lost:
        if (r5 != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a8, code lost:
        if (r5 != null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v0(i1.c r5) {
        /*
            r4 = this;
            java.lang.String r0 = "menuId"
            M5.g.f(r5, r0)
            int r0 = r5.ordinal()
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L93
            r3 = 1
            if (r0 == r3) goto L82
            r3 = 2
            if (r0 == r3) goto L6a
            r3 = 3
            if (r0 == r3) goto L52
            r3 = 4
            if (r0 == r3) goto L3a
            r3 = 5
            if (r0 == r3) goto L1e
            goto Lab
        L1e:
            com.boxhdo.android.tv.ui.hostMain.TvMainViewModel r0 = r4.h0()
            r0.f = r5
            n0.A r5 = r4.y0
            if (r5 == 0) goto Lab
            r0 = 2131427985(0x7f0b0291, float:1.8477602E38)
            boolean r5 = r5.l(r0, r2)
            if (r5 != 0) goto Lab
            n0.A r5 = r4.y0
            if (r5 == 0) goto Lab
        L35:
            r5.h(r0, r1)
            goto Lab
        L3a:
            com.boxhdo.android.tv.ui.hostMain.TvMainViewModel r0 = r4.h0()
            r0.f = r5
            n0.A r5 = r4.y0
            if (r5 == 0) goto Lab
            r0 = 2131427864(0x7f0b0218, float:1.8477356E38)
            boolean r5 = r5.l(r0, r2)
            if (r5 != 0) goto Lab
            n0.A r5 = r4.y0
            if (r5 == 0) goto Lab
            goto L35
        L52:
            com.boxhdo.android.tv.ui.hostMain.TvMainViewModel r0 = r4.h0()
            r0.f = r5
            n0.A r5 = r4.y0
            if (r5 == 0) goto Lab
            r0 = 2131428119(0x7f0b0317, float:1.8477873E38)
            boolean r5 = r5.l(r0, r2)
            if (r5 != 0) goto Lab
            n0.A r5 = r4.y0
            if (r5 == 0) goto Lab
            goto L35
        L6a:
            com.boxhdo.android.tv.ui.hostMain.TvMainViewModel r0 = r4.h0()
            r0.f = r5
            n0.A r5 = r4.y0
            if (r5 == 0) goto Lab
            r0 = 2131427839(0x7f0b01ff, float:1.8477306E38)
            boolean r5 = r5.l(r0, r2)
            if (r5 != 0) goto Lab
            n0.A r5 = r4.y0
            if (r5 == 0) goto Lab
            goto L35
        L82:
            com.boxhdo.android.tv.ui.hostMain.TvMainViewModel r0 = r4.h0()
            r0.f = r5
            n0.A r5 = r4.y0
            if (r5 == 0) goto Lab
            r0 = 2131427693(0x7f0b016d, float:1.847701E38)
            r5.l(r0, r2)
            goto Lab
        L93:
            com.boxhdo.android.tv.ui.hostMain.TvMainViewModel r0 = r4.h0()
            r0.f = r5
            n0.A r5 = r4.y0
            if (r5 == 0) goto Lab
            r0 = 2131427967(0x7f0b027f, float:1.8477565E38)
            boolean r5 = r5.l(r0, r2)
            if (r5 != 0) goto Lab
            n0.A r5 = r4.y0
            if (r5 == 0) goto Lab
            goto L35
        Lab:
            r4.u0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.boxhdo.android.tv.ui.hostMain.TvMainFragment.v0(i1.c):void");
    }

    public final void w0() {
        ValueAnimator ofInt = ValueAnimator.ofInt(((AbstractC0821s) f0()).f11717r.getMeasuredWidth(), ((Number) this.f7837A0.getValue()).intValue());
        this.f7839v0 = true;
        r0().e(true);
        int i7 = CustomNavigationView.f7777t;
        CustomNavigationView customNavigationView = ((AbstractC0821s) f0()).f11717r;
        M5.g.e(customNavigationView, "binding.leftMenu");
        M5.g.e(ofInt, "valueAnimator");
        android.support.v4.media.session.b.b(customNavigationView, ofInt);
        CustomNavigationView customNavigationView2 = ((AbstractC0821s) f0()).f11717r;
        customNavigationView2.getClass();
        customNavigationView2.postDelayed(new E1.b(16, customNavigationView2), 100L);
    }
}
