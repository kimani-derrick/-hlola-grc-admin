package K;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
/* loaded from: classes.dex */
public abstract class b0 extends h0 {
    public static boolean f = false;

    /* renamed from: g  reason: collision with root package name */
    public static Method f1468g;

    /* renamed from: h  reason: collision with root package name */
    public static Class f1469h;

    /* renamed from: i  reason: collision with root package name */
    public static Field f1470i;

    /* renamed from: j  reason: collision with root package name */
    public static Field f1471j;

    /* renamed from: c  reason: collision with root package name */
    public final WindowInsets f1472c;
    public D.d d;

    /* renamed from: e  reason: collision with root package name */
    public D.d f1473e;

    public b0(i0 i0Var, WindowInsets windowInsets) {
        super(i0Var);
        this.d = null;
        this.f1472c = windowInsets;
    }

    private D.d o(View view) {
        if (Build.VERSION.SDK_INT < 30) {
            if (!f) {
                p();
            }
            Method method = f1468g;
            if (method != null && f1469h != null && f1470i != null) {
                try {
                    Object invoke = method.invoke(view, null);
                    if (invoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f1470i.get(f1471j.get(invoke));
                    if (rect == null) {
                        return null;
                    }
                    return D.d.a(rect.left, rect.top, rect.right, rect.bottom);
                } catch (ReflectiveOperationException e3) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e3.getMessage(), e3);
                }
            }
            return null;
        }
        throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
    }

    @SuppressLint({"PrivateApi"})
    private static void p() {
        try {
            f1468g = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f1469h = cls;
            f1470i = cls.getDeclaredField("mVisibleInsets");
            f1471j = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f1470i.setAccessible(true);
            f1471j.setAccessible(true);
        } catch (ReflectiveOperationException e3) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e3.getMessage(), e3);
        }
        f = true;
    }

    @Override // K.h0
    public void d(View view) {
        D.d o7 = o(view);
        if (o7 == null) {
            o7 = D.d.f428e;
        }
        q(o7);
    }

    @Override // K.h0
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        return Objects.equals(this.f1473e, ((b0) obj).f1473e);
    }

    @Override // K.h0
    public final D.d h() {
        if (this.d == null) {
            WindowInsets windowInsets = this.f1472c;
            this.d = D.d.a(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.d;
    }

    @Override // K.h0
    public i0 i(int i7, int i8, int i9, int i10) {
        a0 x7;
        i0 d = i0.d(this.f1472c, null);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 30) {
            x7 = new Z(d);
        } else if (i11 >= 29) {
            x7 = new Y(d);
        } else {
            x7 = new X(d);
        }
        x7.d(i0.b(h(), i7, i8, i9, i10));
        x7.c(i0.b(g(), i7, i8, i9, i10));
        return x7.b();
    }

    @Override // K.h0
    public boolean k() {
        return this.f1472c.isRound();
    }

    public void q(D.d dVar) {
        this.f1473e = dVar;
    }

    @Override // K.h0
    public void l(D.d[] dVarArr) {
    }

    @Override // K.h0
    public void m(i0 i0Var) {
    }
}
