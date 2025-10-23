package w0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
/* renamed from: w0.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1355i extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k0 f15556a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f15557b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f15558c;
    public final /* synthetic */ int d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f15559e;
    public final /* synthetic */ C1359m f;

    public C1355i(C1359m c1359m, k0 k0Var, int i7, View view, int i8, ViewPropertyAnimator viewPropertyAnimator) {
        this.f = c1359m;
        this.f15556a = k0Var;
        this.f15557b = i7;
        this.f15558c = view;
        this.d = i8;
        this.f15559e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i7 = this.f15557b;
        View view = this.f15558c;
        if (i7 != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f15559e.setListener(null);
        C1359m c1359m = this.f;
        k0 k0Var = this.f15556a;
        c1359m.c(k0Var);
        c1359m.f15606p.remove(k0Var);
        c1359m.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f.getClass();
    }
}
