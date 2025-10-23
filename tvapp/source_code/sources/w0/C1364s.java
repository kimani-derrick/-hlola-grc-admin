package w0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* renamed from: w0.s  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1364s extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public boolean f15650a = false;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C1365t f15651b;

    public C1364s(C1365t c1365t) {
        this.f15651b = c1365t;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f15650a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f15650a) {
            this.f15650a = false;
            return;
        }
        C1365t c1365t = this.f15651b;
        if (((Float) c1365t.f15681z.getAnimatedValue()).floatValue() == 0.0f) {
            c1365t.f15657A = 0;
            c1365t.g(0);
            return;
        }
        c1365t.f15657A = 2;
        c1365t.f15674s.invalidate();
    }
}
