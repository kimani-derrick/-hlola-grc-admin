package androidx.fragment.app;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.reflect.Field;
/* loaded from: classes.dex */
public final class Y implements View.OnAttachStateChangeListener {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f5974q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ Object f5975r;

    public /* synthetic */ Y(int i7, Object obj) {
        this.f5974q = i7;
        this.f5975r = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.f5974q) {
            case 0:
                View view2 = (View) this.f5975r;
                view2.removeOnAttachStateChangeListener(this);
                Field field = K.O.f1447a;
                K.B.c(view2);
                return;
            case 1:
            default:
                return;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f5974q) {
            case 0:
                return;
            case 1:
                j.f fVar = (j.f) this.f5975r;
                ViewTreeObserver viewTreeObserver = fVar.f11429O;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        fVar.f11429O = view.getViewTreeObserver();
                    }
                    fVar.f11429O.removeGlobalOnLayoutListener(fVar.f11440z);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            default:
                j.s sVar = (j.s) this.f5975r;
                ViewTreeObserver viewTreeObserver2 = sVar.F;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        sVar.F = view.getViewTreeObserver();
                    }
                    sVar.F.removeGlobalOnLayoutListener(sVar.f11510z);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }
}
