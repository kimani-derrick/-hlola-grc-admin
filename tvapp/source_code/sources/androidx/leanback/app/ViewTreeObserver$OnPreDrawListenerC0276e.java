package androidx.leanback.app;

import android.transition.Transition;
import android.view.View;
import android.view.ViewTreeObserver;
/* renamed from: androidx.leanback.app.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserver$OnPreDrawListenerC0276e implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ View f6206q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ AbstractC0278g f6207r;

    public ViewTreeObserver$OnPreDrawListenerC0276e(AbstractC0278g abstractC0278g, View view) {
        this.f6207r = abstractC0278g;
        this.f6206q = view;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.f6206q.getViewTreeObserver().removeOnPreDrawListener(this);
        AbstractC0278g abstractC0278g = this.f6207r;
        if (abstractC0278g.o() != null && abstractC0278g.W != null) {
            Transition j02 = abstractC0278g.j0();
            abstractC0278g.f6216H0 = j02;
            if (j02 != null) {
                j02.addListener(new androidx.leanback.transition.g(new C0277f(abstractC0278g, 0)));
            }
            abstractC0278g.o0();
            Object obj = abstractC0278g.f6216H0;
            if (obj != null) {
                abstractC0278g.p0(obj);
                return false;
            }
            abstractC0278g.G0.w(abstractC0278g.f6214E0);
            return false;
        }
        return true;
    }
}
