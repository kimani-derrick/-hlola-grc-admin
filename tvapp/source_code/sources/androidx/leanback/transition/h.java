package androidx.leanback.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.transition.Transition;
import android.view.View;
import com.boxhdo.android.tv.R;
/* loaded from: classes.dex */
public final class h extends AnimatorListenerAdapter implements Transition.TransitionListener {

    /* renamed from: a  reason: collision with root package name */
    public final View f6332a;

    /* renamed from: b  reason: collision with root package name */
    public final View f6333b;

    /* renamed from: c  reason: collision with root package name */
    public final int f6334c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public int[] f6335e;
    public float f;

    /* renamed from: g  reason: collision with root package name */
    public float f6336g;

    /* renamed from: h  reason: collision with root package name */
    public final float f6337h;

    /* renamed from: i  reason: collision with root package name */
    public final float f6338i;

    public h(View view, View view2, int i7, int i8, float f, float f7) {
        this.f6333b = view;
        this.f6332a = view2;
        this.f6334c = i7 - Math.round(view.getTranslationX());
        this.d = i8 - Math.round(view.getTranslationY());
        this.f6337h = f;
        this.f6338i = f7;
        int[] iArr = (int[]) view2.getTag(R.id.transitionPosition);
        this.f6335e = iArr;
        if (iArr != null) {
            view2.setTag(R.id.transitionPosition, null);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        if (this.f6335e == null) {
            this.f6335e = new int[2];
        }
        int[] iArr = this.f6335e;
        View view = this.f6333b;
        iArr[0] = Math.round(view.getTranslationX() + this.f6334c);
        this.f6335e[1] = Math.round(view.getTranslationY() + this.d);
        this.f6332a.setTag(R.id.transitionPosition, this.f6335e);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        View view = this.f6333b;
        this.f = view.getTranslationX();
        this.f6336g = view.getTranslationY();
        view.setTranslationX(this.f6337h);
        view.setTranslationY(this.f6338i);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        float f = this.f;
        View view = this.f6333b;
        view.setTranslationX(f);
        view.setTranslationY(this.f6336g);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        float f = this.f6337h;
        View view = this.f6333b;
        view.setTranslationX(f);
        view.setTranslationY(this.f6338i);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
    }
}
