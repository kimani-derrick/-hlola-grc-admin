package L;

import android.view.accessibility.AccessibilityNodeInfo;
/* loaded from: classes.dex */
public abstract class e {
    public static Object a(int i7, float f, float f7, float f8) {
        return new AccessibilityNodeInfo.RangeInfo(i7, f, f7, f8);
    }

    public static CharSequence b(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }

    public static void c(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }
}
