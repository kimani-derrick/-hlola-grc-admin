package androidx.leanback.widget;

import android.view.View;
import android.view.ViewGroup;
/* loaded from: classes.dex */
public final class P0 extends H {

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ A1.b f6439k;

    public P0(A1.b bVar) {
        this.f6439k = bVar;
    }

    @Override // androidx.leanback.widget.H
    public final void l(G g7) {
        g7.f15576a.setActivated(true);
    }

    @Override // androidx.leanback.widget.H
    public final void m(G g7) {
        if (this.f6439k.f != null) {
            g7.f6367v.f6572a.setOnClickListener(new androidx.leanback.app.t(this, g7, 2));
        }
    }

    @Override // androidx.leanback.widget.H
    public final void n(G g7) {
        View view = g7.f15576a;
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).setTransitionGroup(true);
        }
        C0 c02 = this.f6439k.f22g;
        if (c02 != null) {
            c02.a(view);
        }
    }

    @Override // androidx.leanback.widget.H
    public final void o(G g7) {
        if (this.f6439k.f != null) {
            g7.f6367v.f6572a.setOnClickListener(null);
        }
    }
}
