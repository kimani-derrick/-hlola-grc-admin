package P;

import android.widget.PopupWindow;
/* loaded from: classes.dex */
public abstract class m {
    public static boolean a(PopupWindow popupWindow) {
        return popupWindow.getOverlapAnchor();
    }

    public static int b(PopupWindow popupWindow) {
        return popupWindow.getWindowLayoutType();
    }

    public static void c(PopupWindow popupWindow, boolean z7) {
        popupWindow.setOverlapAnchor(z7);
    }

    public static void d(PopupWindow popupWindow, int i7) {
        popupWindow.setWindowLayoutType(i7);
    }
}
