package K;

import android.view.View;
import android.view.WindowInsets;
/* loaded from: classes.dex */
public abstract class E {
    public static i0 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        i0 d = i0.d(rootWindowInsets, null);
        h0 h0Var = d.f1495a;
        h0Var.m(d);
        h0Var.d(view.getRootView());
        return d;
    }

    public static int b(View view) {
        return view.getScrollIndicators();
    }

    public static void c(View view, int i7) {
        view.setScrollIndicators(i7);
    }

    public static void d(View view, int i7, int i8) {
        view.setScrollIndicators(i7, i8);
    }
}
