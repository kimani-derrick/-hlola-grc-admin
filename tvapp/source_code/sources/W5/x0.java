package W5;

import com.google.android.gms.internal.measurement.AbstractC0515y1;
/* loaded from: classes.dex */
public final class x0 extends AbstractC0113u {

    /* renamed from: s  reason: collision with root package name */
    public static final /* synthetic */ int f4033s = 0;

    static {
        new AbstractC0113u();
    }

    @Override // W5.AbstractC0113u
    public final void V(D5.i iVar, Runnable runnable) {
        AbstractC0515y1.s(iVar.f(B0.f3942r));
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }

    @Override // W5.AbstractC0113u
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
