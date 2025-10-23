package androidx.leanback.app;

import android.view.View;
import androidx.leanback.widget.AbstractC0281a0;
import androidx.leanback.widget.AbstractC0299j0;
import androidx.leanback.widget.C0297i0;
import androidx.leanback.widget.HorizontalGridView;
import androidx.leanback.widget.K;
import androidx.leanback.widget.L;
import androidx.leanback.widget.VerticalGridView;
import androidx.leanback.widget.Z;
import java.util.ArrayList;
import w4.l0;
/* loaded from: classes.dex */
public final class u extends l0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6295a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AbstractC0274c f6296b;

    public /* synthetic */ u(AbstractC0274c abstractC0274c, int i7) {
        this.f6295a = i7;
        this.f6296b = abstractC0274c;
    }

    @Override // w4.l0
    public void A() {
        switch (this.f6295a) {
            case 1:
                ((F) this.f6296b).getClass();
                return;
            default:
                return;
        }
    }

    @Override // w4.l0
    public void B(androidx.leanback.widget.G g7) {
        switch (this.f6295a) {
            case 1:
                F f = (F) this.f6296b;
                boolean z7 = f.f6180z0;
                AbstractC0281a0 abstractC0281a0 = g7.f6366u;
                AbstractC0299j0 abstractC0299j0 = (AbstractC0299j0) abstractC0281a0;
                abstractC0299j0.getClass();
                Z z8 = g7.f6367v;
                C0297i0 k5 = AbstractC0299j0.k(z8);
                k5.f6596h = z7;
                abstractC0299j0.n(k5, z7);
                AbstractC0299j0 abstractC0299j02 = (AbstractC0299j0) abstractC0281a0;
                abstractC0299j02.getClass();
                C0297i0 k7 = AbstractC0299j0.k(z8);
                abstractC0299j02.r(k7, f.f6169C0);
                abstractC0299j02.j(k7, f.f6170D0);
                return;
            default:
                return;
        }
    }

    @Override // w4.l0
    public void C() {
        switch (this.f6295a) {
            case 1:
                ((F) this.f6296b).getClass();
                return;
            default:
                return;
        }
    }

    @Override // w4.l0
    public final void D(androidx.leanback.widget.G g7) {
        switch (this.f6295a) {
            case 0:
                View view = g7.f6367v.f6572a;
                view.setOnClickListener(new t(this, g7, 0));
                if (((y) this.f6296b).f6299A0 != null) {
                    g7.f15576a.addOnLayoutChangeListener(y.f6298C0);
                    return;
                }
                view.addOnLayoutChangeListener(y.f6298C0);
                return;
            default:
                F f = (F) this.f6296b;
                VerticalGridView verticalGridView = f.f6197o0;
                if (verticalGridView != null) {
                    verticalGridView.setClipChildren(false);
                }
                AbstractC0281a0 abstractC0281a0 = g7.f6366u;
                ((AbstractC0299j0) abstractC0281a0).getClass();
                Z z7 = g7.f6367v;
                C0297i0 k5 = AbstractC0299j0.k(z7);
                if (k5 instanceof L) {
                    L l7 = (L) k5;
                    HorizontalGridView horizontalGridView = l7.n;
                    w0.Z z8 = f.f6174I0;
                    if (z8 == null) {
                        f.f6174I0 = horizontalGridView.getRecycledViewPool();
                    } else {
                        horizontalGridView.setRecycledViewPool(z8);
                    }
                    K k7 = l7.f6415o;
                    ArrayList arrayList = f.f6175J0;
                    if (arrayList == null) {
                        f.f6175J0 = k7.f6382i;
                    } else {
                        k7.f6382i = arrayList;
                    }
                }
                f.f6167A0 = true;
                g7.f6370y = new E(f, g7);
                F.n0(g7, false, true);
                ((AbstractC0299j0) abstractC0281a0).getClass();
                C0297i0 k8 = AbstractC0299j0.k(z7);
                k8.f6600l = f.f6171E0;
                k8.f6601m = f.f6172F0;
                return;
        }
    }

    @Override // w4.l0
    public void E(androidx.leanback.widget.G g7) {
        switch (this.f6295a) {
            case 1:
                F f = (F) this.f6296b;
                androidx.leanback.widget.G g8 = f.f6179x0;
                if (g8 == g7) {
                    F.n0(g8, false, true);
                    f.f6179x0 = null;
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // w4.l0
    public void F(androidx.leanback.widget.G g7) {
        switch (this.f6295a) {
            case 1:
                F.n0(g7, false, true);
                ((F) this.f6296b).getClass();
                return;
            default:
                return;
        }
    }
}
