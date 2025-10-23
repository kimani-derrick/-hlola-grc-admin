package K;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import com.boxhdo.android.tv.R;
/* loaded from: classes.dex */
public abstract class D {
    public static void a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static i0 b(View view, i0 i0Var, Rect rect) {
        WindowInsets c5 = i0Var.c();
        if (c5 != null) {
            return i0.d(view.computeSystemWindowInsets(c5, rect), view);
        }
        rect.setEmpty();
        return i0Var;
    }

    public static boolean c(View view, float f, float f7, boolean z7) {
        return view.dispatchNestedFling(f, f7, z7);
    }

    public static boolean d(View view, float f, float f7) {
        return view.dispatchNestedPreFling(f, f7);
    }

    public static boolean e(View view, int i7, int i8, int[] iArr, int[] iArr2) {
        return view.dispatchNestedPreScroll(i7, i8, iArr, iArr2);
    }

    public static boolean f(View view, int i7, int i8, int i9, int i10, int[] iArr) {
        return view.dispatchNestedScroll(i7, i8, i9, i10, iArr);
    }

    public static ColorStateList g(View view) {
        return view.getBackgroundTintList();
    }

    public static PorterDuff.Mode h(View view) {
        return view.getBackgroundTintMode();
    }

    public static float i(View view) {
        return view.getElevation();
    }

    public static i0 j(View view) {
        a0 x7;
        if (!W.d || !view.isAttachedToWindow()) {
            return null;
        }
        try {
            Object obj = W.f1456a.get(view.getRootView());
            if (obj == null) {
                return null;
            }
            Rect rect = (Rect) W.f1457b.get(obj);
            Rect rect2 = (Rect) W.f1458c.get(obj);
            if (rect == null || rect2 == null) {
                return null;
            }
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 30) {
                x7 = new Z();
            } else if (i7 >= 29) {
                x7 = new Y();
            } else {
                x7 = new X();
            }
            x7.c(D.d.a(rect.left, rect.top, rect.right, rect.bottom));
            x7.d(D.d.a(rect2.left, rect2.top, rect2.right, rect2.bottom));
            i0 b7 = x7.b();
            b7.f1495a.m(b7);
            b7.f1495a.d(view.getRootView());
            return b7;
        } catch (IllegalAccessException e3) {
            Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e3.getMessage(), e3);
            return null;
        }
    }

    public static String k(View view) {
        return view.getTransitionName();
    }

    public static float l(View view) {
        return view.getTranslationZ();
    }

    public static float m(View view) {
        return view.getZ();
    }

    public static boolean n(View view) {
        return view.hasNestedScrollingParent();
    }

    public static boolean o(View view) {
        return view.isImportantForAccessibility();
    }

    public static boolean p(View view) {
        return view.isNestedScrollingEnabled();
    }

    public static void q(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    public static void r(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    public static void s(View view, float f) {
        view.setElevation(f);
    }

    public static void t(View view, boolean z7) {
        view.setNestedScrollingEnabled(z7);
    }

    public static void u(View view, InterfaceC0041q interfaceC0041q) {
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, interfaceC0041q);
        }
        if (interfaceC0041q == null) {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        } else {
            view.setOnApplyWindowInsetsListener(new C(view, interfaceC0041q));
        }
    }

    public static void v(View view, String str) {
        view.setTransitionName(str);
    }

    public static void w(View view, float f) {
        view.setTranslationZ(f);
    }

    public static void x(View view, float f) {
        view.setZ(f);
    }

    public static boolean y(View view, int i7) {
        return view.startNestedScroll(i7);
    }

    public static void z(View view) {
        view.stopNestedScroll();
    }
}
