package L;

import android.view.accessibility.AccessibilityNodeInfo;
/* loaded from: classes.dex */
public abstract class f {
    public static h a(boolean z7, int i7, int i8, int i9, int i10, boolean z8, String str, String str2) {
        return new h(new AccessibilityNodeInfo.CollectionItemInfo.Builder().setHeading(z7).setColumnIndex(i7).setRowIndex(i8).setColumnSpan(i9).setRowSpan(i10).setSelected(z8).setRowTitle(str).setColumnTitle(str2).build());
    }

    public static i b(AccessibilityNodeInfo accessibilityNodeInfo, int i7, int i8) {
        AccessibilityNodeInfo child = accessibilityNodeInfo.getChild(i7, i8);
        if (child != null) {
            return new i(child, 0);
        }
        return null;
    }

    public static String c(Object obj) {
        return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnTitle();
    }

    public static String d(Object obj) {
        return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowTitle();
    }

    public static AccessibilityNodeInfo.ExtraRenderingInfo e(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getExtraRenderingInfo();
    }

    public static i f(AccessibilityNodeInfo accessibilityNodeInfo, int i7) {
        AccessibilityNodeInfo parent = accessibilityNodeInfo.getParent(i7);
        if (parent != null) {
            return new i(parent, 0);
        }
        return null;
    }

    public static String g(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    public static boolean h(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }

    public static void i(AccessibilityNodeInfo accessibilityNodeInfo, boolean z7) {
        accessibilityNodeInfo.setTextSelectable(z7);
    }

    public static void j(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        accessibilityNodeInfo.setUniqueId(str);
    }
}
