package a3;

import H2.U;
import Z2.H;
import android.hardware.display.DisplayManager;
import android.os.Handler;
/* loaded from: classes.dex */
public final class r implements q, DisplayManager.DisplayListener {

    /* renamed from: q  reason: collision with root package name */
    public final DisplayManager f5100q;

    /* renamed from: r  reason: collision with root package name */
    public U f5101r;

    public r(DisplayManager displayManager) {
        this.f5100q = displayManager;
    }

    @Override // a3.q
    public final void h() {
        this.f5100q.unregisterDisplayListener(this);
        this.f5101r = null;
    }

    @Override // a3.q
    public final void l(U u7) {
        this.f5101r = u7;
        Handler n = H.n(null);
        DisplayManager displayManager = this.f5100q;
        displayManager.registerDisplayListener(this, n);
        u7.i(displayManager.getDisplay(0));
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i7) {
        U u7 = this.f5101r;
        if (u7 != null && i7 == 0) {
            u7.i(this.f5100q.getDisplay(0));
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i7) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i7) {
    }
}
