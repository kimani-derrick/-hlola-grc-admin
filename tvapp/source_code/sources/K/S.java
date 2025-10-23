package K;

import android.view.ViewConfiguration;
/* loaded from: classes.dex */
public abstract class S {
    public static int a(ViewConfiguration viewConfiguration, int i7, int i8, int i9) {
        return viewConfiguration.getScaledMaximumFlingVelocity(i7, i8, i9);
    }

    public static int b(ViewConfiguration viewConfiguration, int i7, int i8, int i9) {
        return viewConfiguration.getScaledMinimumFlingVelocity(i7, i8, i9);
    }
}
