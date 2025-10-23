package X2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.exoplayer2.ui.DefaultTimeBar;
/* loaded from: classes.dex */
public final class z extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4279a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ B f4280b;

    public /* synthetic */ z(B b7, int i7) {
        this.f4279a = i7;
        this.f4280b = b7;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f4279a) {
            case 0:
                B b7 = this.f4280b;
                View view = b7.f4089b;
                if (view != null) {
                    view.setVisibility(4);
                }
                ViewGroup viewGroup = b7.f4090c;
                if (viewGroup != null) {
                    viewGroup.setVisibility(4);
                }
                ViewGroup viewGroup2 = b7.f4091e;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(4);
                    return;
                }
                return;
            case 1:
            default:
                super.onAnimationEnd(animator);
                return;
            case 2:
                this.f4280b.j(0);
                return;
            case 3:
                this.f4280b.j(0);
                return;
            case 4:
                ViewGroup viewGroup3 = this.f4280b.f;
                if (viewGroup3 != null) {
                    viewGroup3.setVisibility(4);
                    return;
                }
                return;
            case 5:
                ViewGroup viewGroup4 = this.f4280b.f4093h;
                if (viewGroup4 != null) {
                    viewGroup4.setVisibility(4);
                    return;
                }
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        ViewGroup viewGroup;
        int i7 = 4;
        B b7 = this.f4280b;
        switch (this.f4279a) {
            case 0:
                View view = b7.f4095j;
                if ((view instanceof DefaultTimeBar) && !b7.f4085A) {
                    DefaultTimeBar defaultTimeBar = (DefaultTimeBar) view;
                    ValueAnimator valueAnimator = defaultTimeBar.f8152U;
                    if (valueAnimator.isStarted()) {
                        valueAnimator.cancel();
                    }
                    valueAnimator.setFloatValues(defaultTimeBar.f8153V, 0.0f);
                    valueAnimator.setDuration(250L);
                    valueAnimator.start();
                    return;
                }
                return;
            case 1:
                View view2 = b7.f4089b;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
                ViewGroup viewGroup2 = b7.f4090c;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(0);
                }
                ViewGroup viewGroup3 = b7.f4091e;
                if (viewGroup3 != null) {
                    if (b7.f4085A) {
                        i7 = 0;
                    }
                    viewGroup3.setVisibility(i7);
                }
                View view3 = b7.f4095j;
                if ((view3 instanceof DefaultTimeBar) && !b7.f4085A) {
                    DefaultTimeBar defaultTimeBar2 = (DefaultTimeBar) view3;
                    ValueAnimator valueAnimator2 = defaultTimeBar2.f8152U;
                    if (valueAnimator2.isStarted()) {
                        valueAnimator2.cancel();
                    }
                    defaultTimeBar2.W = false;
                    valueAnimator2.setFloatValues(defaultTimeBar2.f8153V, 1.0f);
                    valueAnimator2.setDuration(250L);
                    valueAnimator2.start();
                    return;
                }
                return;
            case 2:
                b7.j(4);
                return;
            case 3:
                b7.j(4);
                return;
            case 4:
                ViewGroup viewGroup4 = b7.f4093h;
                if (viewGroup4 != null) {
                    viewGroup4.setVisibility(0);
                    b7.f4093h.setTranslationX(viewGroup.getWidth());
                    ViewGroup viewGroup5 = b7.f4093h;
                    viewGroup5.scrollTo(viewGroup5.getWidth(), 0);
                    return;
                }
                return;
            default:
                ViewGroup viewGroup6 = b7.f;
                if (viewGroup6 != null) {
                    viewGroup6.setVisibility(0);
                    return;
                }
                return;
        }
    }
}
