package S0;

import W5.p0;
import android.view.View;
import androidx.lifecycle.InterfaceC0341t;
import coil.request.ViewTargetRequestDelegate;
import coil.target.GenericViewTarget;
/* loaded from: classes.dex */
public final class r implements View.OnAttachStateChangeListener {

    /* renamed from: q  reason: collision with root package name */
    public i f3065q;

    /* renamed from: r  reason: collision with root package name */
    public p0 f3066r;

    /* renamed from: s  reason: collision with root package name */
    public ViewTargetRequestDelegate f3067s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f3068t;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        ViewTargetRequestDelegate viewTargetRequestDelegate = this.f3067s;
        if (viewTargetRequestDelegate == null) {
            return;
        }
        this.f3068t = true;
        viewTargetRequestDelegate.f7276q.b(viewTargetRequestDelegate.f7277r);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewTargetRequestDelegate viewTargetRequestDelegate = this.f3067s;
        if (viewTargetRequestDelegate != null) {
            viewTargetRequestDelegate.f7280u.b(null);
            GenericViewTarget genericViewTarget = viewTargetRequestDelegate.f7278s;
            boolean z7 = genericViewTarget instanceof InterfaceC0341t;
            P1.c cVar = viewTargetRequestDelegate.f7279t;
            if (z7) {
                cVar.v(genericViewTarget);
            }
            cVar.v(viewTargetRequestDelegate);
        }
    }
}
