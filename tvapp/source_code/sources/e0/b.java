package e0;

import android.view.animation.Interpolator;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
/* loaded from: classes.dex */
public abstract class b implements Interpolator {

    /* renamed from: a  reason: collision with root package name */
    public final float[] f9362a;

    /* renamed from: b  reason: collision with root package name */
    public final float f9363b;

    public b(float[] fArr) {
        this.f9362a = fArr;
        this.f9363b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f9362a;
        int min = Math.min((int) ((fArr.length - 1) * f), fArr.length - 2);
        float f7 = this.f9363b;
        float f8 = fArr[min];
        return AbstractC0515y1.g(fArr[min + 1], f8, (f - (min * f7)) / f7, f8);
    }
}
