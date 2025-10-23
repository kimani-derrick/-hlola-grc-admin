package androidx.leanback.widget;

import android.view.View;
import android.view.ViewGroup;
/* renamed from: androidx.leanback.widget.a0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0281a0 implements InterfaceC0302l {
    public static void b(View view) {
        if (view == null || !view.hasTransientState()) {
            return;
        }
        view.animate().cancel();
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i7 = 0; view.hasTransientState() && i7 < childCount; i7++) {
                b(viewGroup.getChildAt(i7));
            }
        }
    }

    public abstract void c(Z z7, Object obj);

    public abstract Z d(ViewGroup viewGroup);

    public abstract void e(Z z7);

    public void f(Z z7) {
    }

    public void g(Z z7) {
        b(z7.f6572a);
    }

    @Override // androidx.leanback.widget.InterfaceC0302l
    public final void a() {
    }
}
