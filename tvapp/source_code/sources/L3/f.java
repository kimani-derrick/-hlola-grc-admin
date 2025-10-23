package L3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* loaded from: classes.dex */
public final class f extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2065a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ h f2066b;

    public /* synthetic */ f(h hVar, int i7) {
        this.f2065a = i7;
        this.f2066b = hVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f2065a) {
            case 1:
                this.f2066b.f2096a.setEndIconVisible(false);
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f2065a) {
            case 0:
                this.f2066b.f2096a.setEndIconVisible(true);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
