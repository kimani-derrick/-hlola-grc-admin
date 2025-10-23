package k;

import androidx.appcompat.widget.ActionBarOverlayLayout;
/* renamed from: k.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0878b implements Runnable {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f11983q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f11984r;

    public /* synthetic */ RunnableC0878b(ActionBarOverlayLayout actionBarOverlayLayout, int i7) {
        this.f11983q = i7;
        this.f11984r = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11983q) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f11984r;
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.f5443J = actionBarOverlayLayout.f5450s.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f5444K);
                return;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f11984r;
                actionBarOverlayLayout2.h();
                actionBarOverlayLayout2.f5443J = actionBarOverlayLayout2.f5450s.animate().translationY(-actionBarOverlayLayout2.f5450s.getHeight()).setListener(actionBarOverlayLayout2.f5444K);
                return;
        }
    }
}
