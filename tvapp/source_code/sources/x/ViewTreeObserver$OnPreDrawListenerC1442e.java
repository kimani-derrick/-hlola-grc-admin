package x;

import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
/* renamed from: x.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserver$OnPreDrawListenerC1442e implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ CoordinatorLayout f16142q;

    public ViewTreeObserver$OnPreDrawListenerC1442e(CoordinatorLayout coordinatorLayout) {
        this.f16142q = coordinatorLayout;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.f16142q.p(0);
        return true;
    }
}
