package k;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public abstract class Y0 {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f11969a;

    static {
        boolean z7;
        if (Build.VERSION.SDK_INT >= 27) {
            z7 = true;
        } else {
            z7 = false;
        }
        f11969a = z7;
        try {
            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
            if (!declaredMethod.isAccessible()) {
                declaredMethod.setAccessible(true);
            }
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
        }
    }

    public static boolean a(View view) {
        Field field = K.O.f1447a;
        if (view.getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }
}
