package T0;

import W5.C0100g;
import W5.InterfaceC0099f;
import android.view.ViewTreeObserver;
import r0.AbstractC1111a;
/* loaded from: classes.dex */
public final class i implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: q  reason: collision with root package name */
    public boolean f3213q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ e f3214r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserver f3215s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ InterfaceC0099f f3216t;

    public i(e eVar, ViewTreeObserver viewTreeObserver, C0100g c0100g) {
        this.f3214r = eVar;
        this.f3215s = viewTreeObserver;
        this.f3216t = c0100g;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        e eVar = this.f3214r;
        f b7 = AbstractC1111a.b(eVar);
        if (b7 != null) {
            ViewTreeObserver viewTreeObserver = this.f3215s;
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this);
            } else {
                eVar.f3204a.getViewTreeObserver().removeOnPreDrawListener(this);
            }
            if (!this.f3213q) {
                this.f3213q = true;
                this.f3216t.m(b7);
            }
        }
        return true;
    }
}
