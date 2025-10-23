package K;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.util.Objects;
/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: b  reason: collision with root package name */
    public static final i0 f1494b;

    /* renamed from: a  reason: collision with root package name */
    public final h0 f1495a;

    static {
        i0 i0Var;
        if (Build.VERSION.SDK_INT >= 30) {
            i0Var = g0.f1483m;
        } else {
            i0Var = h0.f1492b;
        }
        f1494b = i0Var;
    }

    public i0() {
        this.f1495a = new h0(this);
    }

    public static D.d b(D.d dVar, int i7, int i8, int i9, int i10) {
        int max = Math.max(0, dVar.f429a - i7);
        int max2 = Math.max(0, dVar.f430b - i8);
        int max3 = Math.max(0, dVar.f431c - i9);
        int max4 = Math.max(0, dVar.d - i10);
        if (max == i7 && max2 == i8 && max3 == i9 && max4 == i10) {
            return dVar;
        }
        return D.d.a(max, max2, max3, max4);
    }

    public static i0 d(WindowInsets windowInsets, View view) {
        windowInsets.getClass();
        i0 i0Var = new i0(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            Field field = O.f1447a;
            i0 a7 = E.a(view);
            h0 h0Var = i0Var.f1495a;
            h0Var.m(a7);
            h0Var.d(view.getRootView());
        }
        return i0Var;
    }

    public final int a() {
        return this.f1495a.h().f430b;
    }

    public final WindowInsets c() {
        h0 h0Var = this.f1495a;
        if (h0Var instanceof b0) {
            return ((b0) h0Var).f1472c;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        return Objects.equals(this.f1495a, ((i0) obj).f1495a);
    }

    public final int hashCode() {
        h0 h0Var = this.f1495a;
        if (h0Var == null) {
            return 0;
        }
        return h0Var.hashCode();
    }

    public i0(WindowInsets windowInsets) {
        int i7 = Build.VERSION.SDK_INT;
        this.f1495a = i7 >= 30 ? new g0(this, windowInsets) : i7 >= 29 ? new e0(this, windowInsets) : i7 >= 28 ? new d0(this, windowInsets) : new c0(this, windowInsets);
    }
}
