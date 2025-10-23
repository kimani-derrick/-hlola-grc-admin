package z;

import android.app.Activity;
import android.app.SharedElementCallback;
/* renamed from: z.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1497a {
    public static void a(Object obj) {
        ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
    }

    public static void b(Activity activity, String[] strArr, int i7) {
        activity.requestPermissions(strArr, i7);
    }

    public static boolean c(Activity activity, String str) {
        return activity.shouldShowRequestPermissionRationale(str);
    }
}
