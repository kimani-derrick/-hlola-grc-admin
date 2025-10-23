package X2;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.exoplayer2.ui.DefaultTimeBar;
/* renamed from: X2.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0123e implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4170a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f4171b;

    public /* synthetic */ C0123e(View view, int i7) {
        this.f4170a = i7;
        this.f4171b = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        View view = this.f4171b;
        switch (this.f4170a) {
            case 0:
                int i7 = DefaultTimeBar.f8132i0;
                DefaultTimeBar defaultTimeBar = (DefaultTimeBar) view;
                defaultTimeBar.getClass();
                defaultTimeBar.f8153V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                defaultTimeBar.invalidate(defaultTimeBar.f8162q);
                return;
            default:
                M5.g.f(view, "$view");
                M5.g.f(valueAnimator, "animation");
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                Object animatedValue = valueAnimator.getAnimatedValue();
                M5.g.d(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                layoutParams.width = ((Integer) animatedValue).intValue();
                view.requestLayout();
                return;
        }
    }
}
