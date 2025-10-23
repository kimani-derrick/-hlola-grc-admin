package K;

import android.view.VelocityTracker;
/* renamed from: K.v  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0045v {
    public static float a(VelocityTracker velocityTracker, int i7) {
        return velocityTracker.getAxisVelocity(i7);
    }

    public static float b(VelocityTracker velocityTracker, int i7, int i8) {
        return velocityTracker.getAxisVelocity(i7, i8);
    }

    public static boolean c(VelocityTracker velocityTracker, int i7) {
        return velocityTracker.isAxisSupported(i7);
    }
}
