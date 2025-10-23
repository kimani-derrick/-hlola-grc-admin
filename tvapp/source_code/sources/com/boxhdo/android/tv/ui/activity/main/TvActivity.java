package com.boxhdo.android.tv.ui.activity.main;

import H.e;
import M5.p;
import W5.AbstractC0117y;
import android.app.Activity;
import android.view.KeyEvent;
import android.view.View;
import androidx.fragment.app.ComponentCallbacksC0269x;
import androidx.fragment.app.D;
import androidx.fragment.app.S;
import androidx.lifecycle.P;
import androidx.lifecycle.Y;
import androidx.navigation.fragment.NavHostFragment;
import com.boxhdo.android.tv.R;
import dagger.hilt.android.internal.managers.b;
import h1.C0745d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import n0.C0999A;
import n1.C1026a;
import n1.j;
import n1.o;
import q1.InterfaceC1100b;
import q1.InterfaceC1101c;
import q1.InterfaceC1102d;
import q1.InterfaceC1103e;
import q1.g;
import q1.l;
import t2.i;
import u5.C1298f;
import u5.InterfaceC1293a;
import w5.InterfaceC1437b;
/* loaded from: classes.dex */
public final class TvActivity extends g implements InterfaceC1437b {

    /* renamed from: Q  reason: collision with root package name */
    public volatile b f7788Q;

    /* renamed from: R  reason: collision with root package name */
    public final Object f7789R = new Object();

    /* renamed from: S  reason: collision with root package name */
    public boolean f7790S = false;

    /* renamed from: T  reason: collision with root package name */
    public final e f7791T;

    /* renamed from: U  reason: collision with root package name */
    public View f7792U;

    /* renamed from: V  reason: collision with root package name */
    public boolean f7793V;

    public TvActivity() {
        H(new C1026a(this, 0));
        this.f7791T = new e(p.a(TVViewModel.class), new n1.p(this, 1), new n1.p(this, 0), new n1.p(this, 2));
    }

    @Override // q1.g
    public final int V() {
        return R.layout.activity_tv;
    }

    @Override // q1.g
    public final void a0() {
        ComponentCallbacksC0269x E4 = W().E(R.id.nav_host_fragment);
        M5.g.d(E4, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
        C0999A c0999a = ((NavHostFragment) E4).f6849n0;
        if (c0999a != null) {
            this.f13235O = c0999a;
            AbstractC0117y.p(P.g(this), null, 0, new o(null, this), 3);
            return;
        }
        throw new IllegalStateException("NavController is not available before onCreate()".toString());
    }

    @Override // w5.InterfaceC1437b
    public final Object k() {
        if (this.f7788Q == null) {
            synchronized (this.f7789R) {
                try {
                    if (this.f7788Q == null) {
                        this.f7788Q = new b((Activity) this);
                    }
                } finally {
                }
            }
        }
        return this.f7788Q.k();
    }

    @Override // androidx.activity.l, android.app.Activity
    public final void onBackPressed() {
        List A6 = W().f5925c.A();
        M5.g.e(A6, "supportFragmentManager.fragments");
        if (!(!A6.isEmpty()) && !this.f7793V) {
            this.f7793V = true;
            Z(new l(R.string.title_message_confirm_back), true);
            AbstractC0117y.p(P.g(this), null, 0, new j(null, this), 3);
            return;
        }
        super.onBackPressed();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i7, KeyEvent keyEvent) {
        ComponentCallbacksC0269x E4;
        S n;
        List A6;
        ComponentCallbacksC0269x E6;
        S n7;
        List A7;
        ComponentCallbacksC0269x E7;
        S n8;
        List A8;
        ComponentCallbacksC0269x E8;
        S n9;
        List A9;
        if (keyEvent != null && keyEvent.getAction() == 0 && i7 == 19 && (E8 = W().E(R.id.nav_host_fragment)) != null && (n9 = E8.n()) != null && (A9 = n9.f5925c.A()) != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : A9) {
                if (obj instanceof InterfaceC1103e) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((InterfaceC1103e) it.next()).i();
            }
        }
        if (keyEvent != null && keyEvent.getAction() == 0 && i7 == 22 && (E7 = W().E(R.id.nav_host_fragment)) != null && (n8 = E7.n()) != null && (A8 = n8.f5925c.A()) != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : A8) {
                if (obj2 instanceof InterfaceC1102d) {
                    arrayList2.add(obj2);
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                ((InterfaceC1102d) it2.next()).b();
            }
        }
        if (keyEvent != null && keyEvent.getAction() == 0 && i7 == 21 && (E6 = W().E(R.id.nav_host_fragment)) != null && (n7 = E6.n()) != null && (A7 = n7.f5925c.A()) != null) {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : A7) {
                if (obj3 instanceof InterfaceC1101c) {
                    arrayList3.add(obj3);
                }
            }
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                ((InterfaceC1101c) it3.next()).h();
            }
        }
        if (keyEvent != null && keyEvent.getAction() == 0 && i7 == 20 && (E4 = W().E(R.id.nav_host_fragment)) != null && (n = E4.n()) != null && (A6 = n.f5925c.A()) != null) {
            ArrayList arrayList4 = new ArrayList();
            for (Object obj4 : A6) {
                if (obj4 instanceof InterfaceC1100b) {
                    arrayList4.add(obj4);
                }
            }
            Iterator it4 = arrayList4.iterator();
            while (it4.hasNext()) {
                ((InterfaceC1100b) it4.next()).d();
            }
        }
        return super.onKeyDown(i7, keyEvent);
    }

    @Override // androidx.activity.l, androidx.lifecycle.InterfaceC0332j
    public final Y r() {
        Y r3 = super.r();
        i a7 = ((C0745d) ((InterfaceC1293a) android.support.v4.media.session.b.g0(InterfaceC1293a.class, this))).a();
        r3.getClass();
        return new C1298f((Set) a7.f14556r, r3, (D) a7.f14557s);
    }
}
