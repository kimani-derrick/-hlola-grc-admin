package w0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
/* renamed from: w0.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1356j extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15560a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C1357k f15561b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f15562c;
    public final /* synthetic */ View d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ C1359m f15563e;

    public /* synthetic */ C1356j(C1359m c1359m, C1357k c1357k, ViewPropertyAnimator viewPropertyAnimator, View view, int i7) {
        this.f15560a = i7;
        this.f15563e = c1359m;
        this.f15561b = c1357k;
        this.f15562c = viewPropertyAnimator;
        this.d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f15560a) {
            case 0:
                this.f15562c.setListener(null);
                View view = this.d;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                C1357k c1357k = this.f15561b;
                k0 k0Var = c1357k.f15571a;
                C1359m c1359m = this.f15563e;
                c1359m.c(k0Var);
                c1359m.f15608r.remove(c1357k.f15571a);
                c1359m.i();
                return;
            default:
                this.f15562c.setListener(null);
                View view2 = this.d;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                C1357k c1357k2 = this.f15561b;
                k0 k0Var2 = c1357k2.f15572b;
                C1359m c1359m2 = this.f15563e;
                c1359m2.c(k0Var2);
                c1359m2.f15608r.remove(c1357k2.f15572b);
                c1359m2.i();
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f15560a) {
            case 0:
                k0 k0Var = this.f15561b.f15571a;
                this.f15563e.getClass();
                return;
            default:
                k0 k0Var2 = this.f15561b.f15572b;
                this.f15563e.getClass();
                return;
        }
    }
}
