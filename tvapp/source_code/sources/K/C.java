package K;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
/* loaded from: classes.dex */
public final class C implements View.OnApplyWindowInsetsListener {

    /* renamed from: a  reason: collision with root package name */
    public i0 f1440a = null;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f1441b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ InterfaceC0041q f1442c;

    public C(View view, InterfaceC0041q interfaceC0041q) {
        this.f1441b = view;
        this.f1442c = interfaceC0041q;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        i0 d = i0.d(windowInsets, view);
        int i7 = Build.VERSION.SDK_INT;
        InterfaceC0041q interfaceC0041q = this.f1442c;
        if (i7 < 30) {
            D.a(windowInsets, this.f1441b);
            if (d.equals(this.f1440a)) {
                return interfaceC0041q.e(view, d).c();
            }
        }
        this.f1440a = d;
        i0 e3 = interfaceC0041q.e(view, d);
        if (i7 >= 30) {
            return e3.c();
        }
        Field field = O.f1447a;
        B.c(view);
        return e3.c();
    }
}
