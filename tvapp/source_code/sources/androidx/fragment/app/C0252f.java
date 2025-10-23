package androidx.fragment.app;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.google.android.gms.internal.measurement.K1;
/* renamed from: androidx.fragment.app.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0252f extends d0 {

    /* renamed from: c  reason: collision with root package name */
    public final C0253g f6046c;

    public C0252f(C0253g c0253g) {
        this.f6046c = c0253g;
    }

    @Override // androidx.fragment.app.d0
    public final void a(ViewGroup viewGroup) {
        M5.g.f(viewGroup, "container");
        C0253g c0253g = this.f6046c;
        e0 e0Var = (e0) c0253g.f2765q;
        View view = e0Var.f6038c.W;
        view.clearAnimation();
        viewGroup.endViewTransition(view);
        ((e0) c0253g.f2765q).c(this);
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + e0Var + " has been cancelled.");
        }
    }

    @Override // androidx.fragment.app.d0
    public final void b(ViewGroup viewGroup) {
        M5.g.f(viewGroup, "container");
        C0253g c0253g = this.f6046c;
        boolean s6 = c0253g.s();
        e0 e0Var = (e0) c0253g.f2765q;
        if (s6) {
            e0Var.c(this);
            return;
        }
        Context context = viewGroup.getContext();
        View view = e0Var.f6038c.W;
        M5.g.e(context, "context");
        K1 E4 = c0253g.E(context);
        if (E4 != null) {
            Animation animation = (Animation) E4.f8367r;
            if (animation != null) {
                if (e0Var.f6036a != 1) {
                    view.startAnimation(animation);
                    e0Var.c(this);
                    return;
                }
                viewGroup.startViewTransition(view);
                A a7 = new A(animation, viewGroup, view);
                a7.setAnimationListener(new animation.Animation$AnimationListenerC0251e(e0Var, viewGroup, view, this));
                view.startAnimation(a7);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Animation from operation " + e0Var + " has started.");
                    return;
                }
                return;
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
        throw new IllegalStateException("Required value was null.".toString());
    }
}
