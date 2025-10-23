package i;

import android.view.MenuItem;
import java.lang.reflect.Method;
/* renamed from: i.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class MenuItem$OnMenuItemClickListenerC0764c implements MenuItem.OnMenuItemClickListener {

    /* renamed from: c  reason: collision with root package name */
    public static final Class[] f11277c = {MenuItem.class};

    /* renamed from: a  reason: collision with root package name */
    public Object f11278a;

    /* renamed from: b  reason: collision with root package name */
    public Method f11279b;

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        Method method = this.f11279b;
        try {
            Class<?> returnType = method.getReturnType();
            Class<?> cls = Boolean.TYPE;
            Object obj = this.f11278a;
            if (returnType == cls) {
                return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
            }
            method.invoke(obj, menuItem);
            return true;
        } catch (Exception e3) {
            throw new RuntimeException(e3);
        }
    }
}
