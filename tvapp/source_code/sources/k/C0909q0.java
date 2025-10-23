package k;

import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
/* renamed from: k.q0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0909q0 extends AbstractC0897k0 implements InterfaceC0899l0 {

    /* renamed from: Q  reason: collision with root package name */
    public static final Method f12084Q;

    /* renamed from: P  reason: collision with root package name */
    public InterfaceC0899l0 f12085P;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f12084Q = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // k.InterfaceC0899l0
    public final void a(j.j jVar, j.k kVar) {
        InterfaceC0899l0 interfaceC0899l0 = this.f12085P;
        if (interfaceC0899l0 != null) {
            interfaceC0899l0.a(jVar, kVar);
        }
    }

    @Override // k.InterfaceC0899l0
    public final void g(j.j jVar, MenuItem menuItem) {
        InterfaceC0899l0 interfaceC0899l0 = this.f12085P;
        if (interfaceC0899l0 != null) {
            interfaceC0899l0.g(jVar, menuItem);
        }
    }
}
