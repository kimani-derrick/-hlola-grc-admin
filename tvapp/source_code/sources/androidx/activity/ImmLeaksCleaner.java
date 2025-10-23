package androidx.activity;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.EnumC0336n;
import androidx.lifecycle.InterfaceC0340s;
import androidx.lifecycle.InterfaceC0342u;
import java.lang.reflect.Field;
/* loaded from: classes.dex */
final class ImmLeaksCleaner implements InterfaceC0340s {

    /* renamed from: r  reason: collision with root package name */
    public static int f5295r;

    /* renamed from: s  reason: collision with root package name */
    public static Field f5296s;

    /* renamed from: t  reason: collision with root package name */
    public static Field f5297t;

    /* renamed from: u  reason: collision with root package name */
    public static Field f5298u;

    /* renamed from: q  reason: collision with root package name */
    public Activity f5299q;

    @Override // androidx.lifecycle.InterfaceC0340s
    public final void d(InterfaceC0342u interfaceC0342u, EnumC0336n enumC0336n) {
        if (enumC0336n != EnumC0336n.ON_DESTROY) {
            return;
        }
        if (f5295r == 0) {
            try {
                f5295r = 2;
                Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
                f5297t = declaredField;
                declaredField.setAccessible(true);
                Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
                f5298u = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
                f5296s = declaredField3;
                declaredField3.setAccessible(true);
                f5295r = 1;
            } catch (NoSuchFieldException unused) {
            }
        }
        if (f5295r == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f5299q.getSystemService("input_method");
            try {
                Object obj = f5296s.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            View view = (View) f5297t.get(inputMethodManager);
                            if (view == null) {
                                return;
                            }
                            if (view.isAttachedToWindow()) {
                                return;
                            }
                            try {
                                f5298u.set(inputMethodManager, null);
                                inputMethodManager.isActive();
                            } catch (IllegalAccessException unused2) {
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    } catch (ClassCastException unused3) {
                    } catch (IllegalAccessException unused4) {
                    }
                }
            } catch (IllegalAccessException unused5) {
            }
        }
    }
}
