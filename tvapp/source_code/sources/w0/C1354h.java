package w0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
/* renamed from: w0.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1354h extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15552a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ k0 f15553b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f15554c;
    public final /* synthetic */ ViewPropertyAnimator d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ C1359m f15555e;

    public C1354h(C1359m c1359m, k0 k0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f15555e = c1359m;
        this.f15553b = k0Var;
        this.f15554c = view;
        this.d = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f15552a) {
            case 1:
                this.f15554c.setAlpha(1.0f);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f15552a) {
            case 0:
                this.d.setListener(null);
                this.f15554c.setAlpha(1.0f);
                C1359m c1359m = this.f15555e;
                k0 k0Var = this.f15553b;
                c1359m.c(k0Var);
                c1359m.f15607q.remove(k0Var);
                c1359m.i();
                return;
            default:
                this.d.setListener(null);
                C1359m c1359m2 = this.f15555e;
                k0 k0Var2 = this.f15553b;
                c1359m2.c(k0Var2);
                c1359m2.f15605o.remove(k0Var2);
                c1359m2.i();
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f15552a) {
            case 0:
                this.f15555e.getClass();
                return;
            default:
                this.f15555e.getClass();
                return;
        }
    }

    public C1354h(C1359m c1359m, k0 k0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f15555e = c1359m;
        this.f15553b = k0Var;
        this.d = viewPropertyAnimator;
        this.f15554c = view;
    }
}
