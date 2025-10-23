package P;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
/* loaded from: classes.dex */
public abstract class f {
    public static EdgeEffect a(Context context, AttributeSet attributeSet) {
        try {
            return new EdgeEffect(context, attributeSet);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    public static float b(EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    public static float c(EdgeEffect edgeEffect, float f, float f7) {
        try {
            return edgeEffect.onPullDistance(f, f7);
        } catch (Throwable unused) {
            edgeEffect.onPull(f, f7);
            return 0.0f;
        }
    }
}
