package K;

import android.graphics.Insets;
import android.view.WindowInsets;
/* loaded from: classes.dex */
public class e0 extends d0 {

    /* renamed from: l  reason: collision with root package name */
    public D.d f1481l;

    public e0(i0 i0Var, WindowInsets windowInsets) {
        super(i0Var, windowInsets);
        this.f1481l = null;
    }

    @Override // K.h0
    public D.d f() {
        Insets mandatorySystemGestureInsets;
        if (this.f1481l == null) {
            mandatorySystemGestureInsets = this.f1472c.getMandatorySystemGestureInsets();
            this.f1481l = D.d.b(mandatorySystemGestureInsets);
        }
        return this.f1481l;
    }

    @Override // K.b0, K.h0
    public i0 i(int i7, int i8, int i9, int i10) {
        WindowInsets inset;
        inset = this.f1472c.inset(i7, i8, i9, i10);
        return i0.d(inset, null);
    }

    @Override // K.c0, K.h0
    public void n(D.d dVar) {
    }
}
