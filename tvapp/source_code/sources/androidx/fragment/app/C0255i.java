package androidx.fragment.app;

import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.measurement.K1;
/* renamed from: androidx.fragment.app.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0255i extends d0 {

    /* renamed from: c  reason: collision with root package name */
    public final C0253g f6055c;
    public AnimatorSet d;

    public C0255i(C0253g c0253g) {
        this.f6055c = c0253g;
    }

    @Override // androidx.fragment.app.d0
    public final void a(ViewGroup viewGroup) {
        String str;
        M5.g.f(viewGroup, "container");
        AnimatorSet animatorSet = this.d;
        C0253g c0253g = this.f6055c;
        if (animatorSet == null) {
            ((e0) c0253g.f2765q).c(this);
            return;
        }
        e0 e0Var = (e0) c0253g.f2765q;
        if (e0Var.f6040g) {
            if (Build.VERSION.SDK_INT >= 26) {
                C0257k.f6057a.a(animatorSet);
            }
        } else {
            animatorSet.end();
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            StringBuilder sb = new StringBuilder("Animator from operation ");
            sb.append(e0Var);
            sb.append(" has been canceled");
            if (e0Var.f6040g) {
                str = " with seeking.";
            } else {
                str = ".";
            }
            sb.append(str);
            sb.append(' ');
            Log.v("FragmentManager", sb.toString());
        }
    }

    @Override // androidx.fragment.app.d0
    public final void b(ViewGroup viewGroup) {
        M5.g.f(viewGroup, "container");
        e0 e0Var = (e0) this.f6055c.f2765q;
        AnimatorSet animatorSet = this.d;
        if (animatorSet == null) {
            e0Var.c(this);
            return;
        }
        animatorSet.start();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animator from operation " + e0Var + " has started.");
        }
    }

    @Override // androidx.fragment.app.d0
    public final void c(androidx.activity.b bVar, ViewGroup viewGroup) {
        M5.g.f(bVar, "backEvent");
        M5.g.f(viewGroup, "container");
        e0 e0Var = (e0) this.f6055c.f2765q;
        AnimatorSet animatorSet = this.d;
        if (animatorSet == null) {
            e0Var.c(this);
        } else if (Build.VERSION.SDK_INT >= 34 && e0Var.f6038c.f6100C) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Adding BackProgressCallbacks for Animators to operation " + e0Var);
            }
            long a7 = C0256j.f6056a.a(animatorSet);
            long j7 = bVar.f5307c * ((float) a7);
            if (j7 == 0) {
                j7 = 1;
            }
            if (j7 == a7) {
                j7 = a7 - 1;
            }
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Setting currentPlayTime to " + j7 + " for Animator " + animatorSet + " on operation " + e0Var);
            }
            C0257k.f6057a.b(animatorSet, j7);
        }
    }

    @Override // androidx.fragment.app.d0
    public final void d(ViewGroup viewGroup) {
        AnimatorSet animatorSet;
        boolean z7;
        C0253g c0253g = this.f6055c;
        if (c0253g.s()) {
            return;
        }
        Context context = viewGroup.getContext();
        M5.g.e(context, "context");
        K1 E4 = c0253g.E(context);
        if (E4 != null) {
            animatorSet = (AnimatorSet) E4.f8368s;
        } else {
            animatorSet = null;
        }
        this.d = animatorSet;
        e0 e0Var = (e0) c0253g.f2765q;
        ComponentCallbacksC0269x componentCallbacksC0269x = e0Var.f6038c;
        if (e0Var.f6036a == 3) {
            z7 = true;
        } else {
            z7 = false;
        }
        boolean z8 = z7;
        View view = componentCallbacksC0269x.W;
        viewGroup.startViewTransition(view);
        AnimatorSet animatorSet2 = this.d;
        if (animatorSet2 != null) {
            animatorSet2.addListener(new C0254h(viewGroup, view, z8, e0Var, this));
        }
        AnimatorSet animatorSet3 = this.d;
        if (animatorSet3 != null) {
            animatorSet3.setTarget(view);
        }
    }
}
