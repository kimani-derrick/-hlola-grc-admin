package androidx.leanback.widget;

import android.view.View;
/* loaded from: classes.dex */
public final class F implements View.OnFocusChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public View.OnFocusChangeListener f6364a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ H f6365b;

    public F(H h7) {
        this.f6365b = h7;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z7) {
        H h7 = this.f6365b;
        if (h7.f6379e != null) {
            view = (View) view.getParent();
        }
        InterfaceC0304m interfaceC0304m = h7.f6380g;
        if (interfaceC0304m != null) {
            interfaceC0304m.b(view, z7);
        }
        View.OnFocusChangeListener onFocusChangeListener = this.f6364a;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(view, z7);
        }
    }
}
