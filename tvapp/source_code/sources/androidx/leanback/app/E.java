package androidx.leanback.app;

import android.animation.TimeAnimator;
import android.view.animation.DecelerateInterpolator;
import androidx.leanback.widget.AbstractC0299j0;
import androidx.leanback.widget.C0297i0;
import androidx.leanback.widget.Z;
/* loaded from: classes.dex */
public final class E implements TimeAnimator.TimeListener {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC0299j0 f6161a;

    /* renamed from: b  reason: collision with root package name */
    public final Z f6162b;

    /* renamed from: c  reason: collision with root package name */
    public final TimeAnimator f6163c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public DecelerateInterpolator f6164e;
    public float f;

    /* renamed from: g  reason: collision with root package name */
    public float f6165g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ F f6166h;

    public E(F f, androidx.leanback.widget.G g7) {
        this.f6166h = f;
        TimeAnimator timeAnimator = new TimeAnimator();
        this.f6163c = timeAnimator;
        this.f6161a = (AbstractC0299j0) g7.f6366u;
        this.f6162b = g7.f6367v;
        timeAnimator.setTimeListener(this);
    }

    @Override // android.animation.TimeAnimator.TimeListener
    public final void onTimeUpdate(TimeAnimator timeAnimator, long j7, long j8) {
        float f;
        TimeAnimator timeAnimator2 = this.f6163c;
        if (timeAnimator2.isRunning()) {
            int i7 = this.d;
            if (j7 >= i7) {
                timeAnimator2.end();
                f = 1.0f;
            } else {
                f = (float) (j7 / i7);
            }
            DecelerateInterpolator decelerateInterpolator = this.f6164e;
            if (decelerateInterpolator != null) {
                f = decelerateInterpolator.getInterpolation(f);
            }
            float f7 = (f * this.f6165g) + this.f;
            AbstractC0299j0 abstractC0299j0 = this.f6161a;
            abstractC0299j0.getClass();
            C0297i0 k5 = AbstractC0299j0.k(this.f6162b);
            k5.f6598j = f7;
            abstractC0299j0.p(k5);
        }
    }
}
