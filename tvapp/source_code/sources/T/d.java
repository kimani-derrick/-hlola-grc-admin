package T;

import android.view.animation.Interpolator;
/* loaded from: classes.dex */
public final class d implements Interpolator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3180a;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        switch (this.f3180a) {
            case 0:
                float f7 = f - 1.0f;
                return (f7 * f7 * f7 * f7 * f7) + 1.0f;
            default:
                float f8 = f - 1.0f;
                return (f8 * f8 * f8 * f8 * f8) + 1.0f;
        }
    }
}
