package K;

import android.view.WindowInsets;
/* loaded from: classes.dex */
public class c0 extends b0 {

    /* renamed from: k  reason: collision with root package name */
    public D.d f1474k;

    public c0(i0 i0Var, WindowInsets windowInsets) {
        super(i0Var, windowInsets);
        this.f1474k = null;
    }

    @Override // K.h0
    public i0 b() {
        return i0.d(this.f1472c.consumeStableInsets(), null);
    }

    @Override // K.h0
    public i0 c() {
        return i0.d(this.f1472c.consumeSystemWindowInsets(), null);
    }

    @Override // K.h0
    public final D.d g() {
        if (this.f1474k == null) {
            WindowInsets windowInsets = this.f1472c;
            this.f1474k = D.d.a(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f1474k;
    }

    @Override // K.h0
    public boolean j() {
        return this.f1472c.isConsumed();
    }

    @Override // K.h0
    public void n(D.d dVar) {
        this.f1474k = dVar;
    }
}
