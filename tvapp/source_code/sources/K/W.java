package K;

import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;
/* loaded from: classes.dex */
public abstract class W {

    /* renamed from: a  reason: collision with root package name */
    public static final Field f1456a;

    /* renamed from: b  reason: collision with root package name */
    public static final Field f1457b;

    /* renamed from: c  reason: collision with root package name */
    public static final Field f1458c;
    public static final boolean d;

    static {
        try {
            Field declaredField = View.class.getDeclaredField("mAttachInfo");
            f1456a = declaredField;
            declaredField.setAccessible(true);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            Field declaredField2 = cls.getDeclaredField("mStableInsets");
            f1457b = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = cls.getDeclaredField("mContentInsets");
            f1458c = declaredField3;
            declaredField3.setAccessible(true);
            d = true;
        } catch (ReflectiveOperationException e3) {
            Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e3.getMessage(), e3);
        }
    }
}
