package L3;

import android.animation.ValueAnimator;
/* loaded from: classes.dex */
public final class g implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2067a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ h f2068b;

    public /* synthetic */ g(h hVar, int i7) {
        this.f2067a = i7;
        this.f2068b = hVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f2067a) {
            case 0:
                this.f2068b.f2098c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h hVar = this.f2068b;
                hVar.f2098c.setScaleX(floatValue);
                hVar.f2098c.setScaleY(floatValue);
                return;
        }
    }
}
