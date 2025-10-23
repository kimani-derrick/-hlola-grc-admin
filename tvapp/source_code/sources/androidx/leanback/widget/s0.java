package androidx.leanback.widget;

import android.animation.ValueAnimator;
/* loaded from: classes.dex */
public final class s0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6649a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ SearchOrbView f6650b;

    public /* synthetic */ s0(SearchOrbView searchOrbView, int i7) {
        this.f6649a = i7;
        this.f6650b = searchOrbView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f6649a) {
            case 0:
                this.f6650b.setOrbViewColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            default:
                this.f6650b.setSearchOrbZ(valueAnimator.getAnimatedFraction());
                return;
        }
    }
}
