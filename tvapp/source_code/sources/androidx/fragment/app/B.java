package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
/* loaded from: classes.dex */
public final class B implements View.OnAttachStateChangeListener {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ Z f5879q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ C f5880r;

    public B(C c5, Z z7) {
        this.f5880r = c5;
        this.f5879q = z7;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Z z7 = this.f5879q;
        ComponentCallbacksC0269x componentCallbacksC0269x = z7.f5978c;
        z7.k();
        C0259m.m((ViewGroup) componentCallbacksC0269x.W.getParent(), this.f5880r.f5881q).l();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
