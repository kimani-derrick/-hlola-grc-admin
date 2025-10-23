package androidx.leanback.app;

import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import i0.C0767a;
/* renamed from: androidx.leanback.app.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0275d extends C0767a {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ int f6204h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ AbstractC0278g f6205i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0275d(AbstractC0278g abstractC0278g, int i7) {
        super("ENTRANCE_ON_PREPARED", true, false);
        this.f6204h = i7;
        switch (i7) {
            case 1:
                this.f6205i = abstractC0278g;
                super("ENTRANCE_ON_PREPARED_ON_CREATEVIEW");
                return;
            case 2:
                this.f6205i = abstractC0278g;
                super("STATE_ENTRANCE_PERFORM");
                return;
            case 3:
                this.f6205i = abstractC0278g;
                super("ENTRANCE_ON_ENDED");
                return;
            default:
                this.f6205i = abstractC0278g;
                return;
        }
    }

    @Override // i0.C0767a
    public final void c() {
        switch (this.f6204h) {
            case 0:
                C c5 = this.f6205i.f6217I0;
                if (c5.f6155q) {
                    c5.f6156r = true;
                    ((Handler) c5.f6159u).postDelayed((B) c5.f6160v, 1000L);
                    return;
                }
                return;
            case 1:
                this.f6205i.n0();
                return;
            case 2:
                AbstractC0278g abstractC0278g = this.f6205i;
                C c6 = abstractC0278g.f6217I0;
                c6.f6156r = false;
                ProgressBar progressBar = (ProgressBar) c6.f6158t;
                if (progressBar != null) {
                    ((ViewGroup) c6.f6157s).removeView(progressBar);
                    c6.f6158t = null;
                }
                ((Handler) c6.f6159u).removeCallbacks((B) c6.f6160v);
                View view = abstractC0278g.W;
                if (view != null) {
                    view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver$OnPreDrawListenerC0276e(abstractC0278g, view));
                    view.invalidate();
                    return;
                }
                return;
            default:
                this.f6205i.m0();
                return;
        }
    }
}
