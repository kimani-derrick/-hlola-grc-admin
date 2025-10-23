package L3;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import w0.C1365t;
/* loaded from: classes.dex */
public final class k implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2076a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f2077b;

    public /* synthetic */ k(int i7, Object obj) {
        this.f2076a = i7;
        this.f2077b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f2076a) {
            case 0:
                ((q) this.f2077b).f2098c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                ((TextInputLayout) this.f2077b).f8974W0.i(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 2:
                ((P1.e) this.f2077b).invalidateSelf();
                return;
            case 3:
                int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                C1365t c1365t = (C1365t) this.f2077b;
                c1365t.f15661c.setAlpha(floatValue);
                c1365t.d.setAlpha(floatValue);
                c1365t.f15674s.invalidate();
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                J3.g gVar = ((BottomSheetBehavior) this.f2077b).f8773i;
                if (gVar != null) {
                    J3.f fVar = gVar.f1362q;
                    if (fVar.f1339j != floatValue2) {
                        fVar.f1339j = floatValue2;
                        gVar.f1366u = true;
                        gVar.invalidateSelf();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
