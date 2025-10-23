package k;

import android.view.MotionEvent;
import android.view.View;
/* renamed from: k.j0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class View$OnTouchListenerC0895j0 implements View.OnTouchListener {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ AbstractC0897k0 f12035q;

    public View$OnTouchListenerC0895j0(AbstractC0897k0 abstractC0897k0) {
        this.f12035q = abstractC0897k0;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C0916u c0916u;
        int action = motionEvent.getAction();
        int x7 = (int) motionEvent.getX();
        int y3 = (int) motionEvent.getY();
        AbstractC0897k0 abstractC0897k0 = this.f12035q;
        if (action == 0 && (c0916u = abstractC0897k0.f12049L) != null && c0916u.isShowing() && x7 >= 0 && x7 < abstractC0897k0.f12049L.getWidth() && y3 >= 0 && y3 < abstractC0897k0.f12049L.getHeight()) {
            abstractC0897k0.f12045H.postDelayed(abstractC0897k0.f12042D, 250L);
            return false;
        } else if (action == 1) {
            abstractC0897k0.f12045H.removeCallbacks(abstractC0897k0.f12042D);
            return false;
        } else {
            return false;
        }
    }
}
