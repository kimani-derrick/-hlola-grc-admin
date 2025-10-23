package H3;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f1184a = {16842910, 16842919};

    /* renamed from: b  reason: collision with root package name */
    public static final String f1185b = a.class.getSimpleName();

    public static ColorStateList a(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f1184a, 0)) != 0) {
                Log.w(f1185b, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
            }
            return colorStateList;
        }
        return ColorStateList.valueOf(0);
    }

    public static boolean b(int[] iArr) {
        boolean z7 = false;
        boolean z8 = false;
        for (int i7 : iArr) {
            if (i7 == 16842910) {
                z7 = true;
            } else if (i7 == 16842908 || i7 == 16842919 || i7 == 16843623) {
                z8 = true;
            }
        }
        if (!z7 || !z8) {
            return false;
        }
        return true;
    }
}
