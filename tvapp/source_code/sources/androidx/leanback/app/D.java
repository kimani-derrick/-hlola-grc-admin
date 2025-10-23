package androidx.leanback.app;

import androidx.fragment.app.ComponentCallbacksC0269x;
import androidx.leanback.widget.AbstractC0299j0;
import androidx.leanback.widget.C0297i0;
import androidx.leanback.widget.VerticalGridView;
/* loaded from: classes.dex */
public final class D extends A0.f {
    @Override // A0.f
    public final boolean b() {
        VerticalGridView verticalGridView = ((F) ((ComponentCallbacksC0269x) this.f12b)).f6197o0;
        if (verticalGridView == null || verticalGridView.getScrollState() == 0) {
            return false;
        }
        return true;
    }

    @Override // A0.f
    public final void c() {
        ((F) ((ComponentCallbacksC0269x) this.f12b)).i0();
    }

    @Override // A0.f
    public final void d() {
        ((F) ((ComponentCallbacksC0269x) this.f12b)).j0();
    }

    @Override // A0.f
    public final void e() {
        F f = (F) ((ComponentCallbacksC0269x) this.f12b);
        VerticalGridView verticalGridView = f.f6197o0;
        if (verticalGridView != null) {
            verticalGridView.setPruneChild(false);
            f.f6197o0.setLayoutFrozen(true);
            f.f6197o0.setFocusSearchDisabled(true);
        }
    }

    @Override // A0.f
    public final void i(int i7) {
        ((F) ((ComponentCallbacksC0269x) this.f12b)).m0(i7);
    }

    @Override // A0.f
    public final void k(boolean z7) {
        F f = (F) ((ComponentCallbacksC0269x) this.f12b);
        f.f6169C0 = z7;
        VerticalGridView verticalGridView = f.f6197o0;
        if (verticalGridView != null) {
            int childCount = verticalGridView.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                androidx.leanback.widget.G g7 = (androidx.leanback.widget.G) verticalGridView.M(verticalGridView.getChildAt(i7));
                AbstractC0299j0 abstractC0299j0 = (AbstractC0299j0) g7.f6366u;
                abstractC0299j0.getClass();
                abstractC0299j0.r(AbstractC0299j0.k(g7.f6367v), f.f6169C0);
            }
        }
    }

    @Override // A0.f
    public final void l(boolean z7) {
        F f = (F) ((ComponentCallbacksC0269x) this.f12b);
        f.f6180z0 = z7;
        VerticalGridView verticalGridView = f.f6197o0;
        if (verticalGridView != null) {
            int childCount = verticalGridView.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                androidx.leanback.widget.G g7 = (androidx.leanback.widget.G) verticalGridView.M(verticalGridView.getChildAt(i7));
                boolean z8 = f.f6180z0;
                AbstractC0299j0 abstractC0299j0 = (AbstractC0299j0) g7.f6366u;
                abstractC0299j0.getClass();
                C0297i0 k5 = AbstractC0299j0.k(g7.f6367v);
                k5.f6596h = z8;
                abstractC0299j0.n(k5, z8);
            }
        }
    }
}
