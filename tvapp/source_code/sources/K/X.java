package K;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
/* loaded from: classes.dex */
public final class X extends a0 {

    /* renamed from: c  reason: collision with root package name */
    public static Field f1459c = null;
    public static boolean d = false;

    /* renamed from: e  reason: collision with root package name */
    public static Constructor f1460e = null;
    public static boolean f = false;

    /* renamed from: a  reason: collision with root package name */
    public WindowInsets f1461a;

    /* renamed from: b  reason: collision with root package name */
    public D.d f1462b;

    public X() {
        this.f1461a = e();
    }

    private static WindowInsets e() {
        if (!d) {
            try {
                f1459c = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e3) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e3);
            }
            d = true;
        }
        Field field = f1459c;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e7) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e7);
            }
        }
        if (!f) {
            try {
                f1460e = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e8) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e8);
            }
            f = true;
        }
        Constructor constructor = f1460e;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e9) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e9);
            }
        }
        return null;
    }

    @Override // K.a0
    public i0 b() {
        a();
        i0 d7 = i0.d(this.f1461a, null);
        h0 h0Var = d7.f1495a;
        h0Var.l(null);
        h0Var.n(this.f1462b);
        return d7;
    }

    @Override // K.a0
    public void c(D.d dVar) {
        this.f1462b = dVar;
    }

    @Override // K.a0
    public void d(D.d dVar) {
        WindowInsets windowInsets = this.f1461a;
        if (windowInsets != null) {
            this.f1461a = windowInsets.replaceSystemWindowInsets(dVar.f429a, dVar.f430b, dVar.f431c, dVar.d);
        }
    }

    public X(i0 i0Var) {
        super(i0Var);
        this.f1461a = i0Var.c();
    }
}
