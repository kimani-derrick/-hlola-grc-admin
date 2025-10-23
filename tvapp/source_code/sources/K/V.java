package K;

import android.view.View;
import android.view.ViewParent;
/* loaded from: classes.dex */
public abstract class V {
    public static boolean a(ViewParent viewParent, View view, float f, float f7, boolean z7) {
        return viewParent.onNestedFling(view, f, f7, z7);
    }

    public static boolean b(ViewParent viewParent, View view, float f, float f7) {
        return viewParent.onNestedPreFling(view, f, f7);
    }

    public static void c(ViewParent viewParent, View view, int i7, int i8, int[] iArr) {
        viewParent.onNestedPreScroll(view, i7, i8, iArr);
    }

    public static void d(ViewParent viewParent, View view, int i7, int i8, int i9, int i10) {
        viewParent.onNestedScroll(view, i7, i8, i9, i10);
    }

    public static void e(ViewParent viewParent, View view, View view2, int i7) {
        viewParent.onNestedScrollAccepted(view, view2, i7);
    }

    public static boolean f(ViewParent viewParent, View view, View view2, int i7) {
        return viewParent.onStartNestedScroll(view, view2, i7);
    }

    public static void g(ViewParent viewParent, View view) {
        viewParent.onStopNestedScroll(view);
    }
}
