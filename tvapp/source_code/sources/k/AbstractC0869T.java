package k;

import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
/* renamed from: k.T  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0869T {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f11941a = {16842912};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f11942b = new int[0];

    static {
        new Rect();
    }

    public static void a(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 29 && i7 < 31 && "android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            int[] state = drawable.getState();
            if (state != null && state.length != 0) {
                drawable.setState(f11942b);
            } else {
                drawable.setState(f11941a);
            }
            drawable.setState(state);
        }
    }

    public static PorterDuff.Mode b(int i7, PorterDuff.Mode mode) {
        if (i7 != 3) {
            if (i7 != 5) {
                if (i7 != 9) {
                    switch (i7) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }
}
