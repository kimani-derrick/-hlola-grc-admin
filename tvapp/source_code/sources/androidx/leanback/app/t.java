package androidx.leanback.app;

import android.view.View;
import androidx.fragment.app.ComponentCallbacksC0269x;
import androidx.leanback.widget.AbstractC0287d0;
import androidx.leanback.widget.C0291f0;
import androidx.leanback.widget.HorizontalGridView;
import androidx.leanback.widget.J;
import androidx.leanback.widget.K;
import androidx.leanback.widget.L;
import androidx.leanback.widget.P0;
import androidx.leanback.widget.U;
/* loaded from: classes.dex */
public final class t implements View.OnClickListener {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f6292q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ androidx.leanback.widget.G f6293r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ Object f6294s;

    public /* synthetic */ t(Object obj, androidx.leanback.widget.G g7, int i7) {
        this.f6292q = i7;
        this.f6294s = obj;
        this.f6293r = g7;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ComponentCallbacksC0269x componentCallbacksC0269x;
        switch (this.f6292q) {
            case 0:
                i iVar = ((y) ((u) this.f6294s).f6296b).f6301w0;
                if (iVar != null) {
                    androidx.leanback.widget.G g7 = this.f6293r;
                    C0291f0 c0291f0 = (C0291f0) g7.f6367v;
                    AbstractC0287d0 abstractC0287d0 = (AbstractC0287d0) g7.f6369x;
                    s sVar = iVar.f6230q;
                    if (sVar.f6273b1 && sVar.f6272a1 && sVar.f6285p1 == null && (componentCallbacksC0269x = sVar.f6262P0) != null && componentCallbacksC0269x.W != null) {
                        sVar.E0(false);
                        sVar.f6262P0.W.requestFocus();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                K k5 = (K) this.f6294s;
                HorizontalGridView horizontalGridView = k5.f6406k.n;
                androidx.leanback.widget.G g8 = this.f6293r;
                androidx.leanback.widget.G g9 = (androidx.leanback.widget.G) horizontalGridView.M(g8.f15576a);
                L l7 = k5.f6406k;
                U u7 = l7.f6601m;
                if (u7 != null) {
                    u7.c(g8.f6367v, g9.f6369x, l7, (J) l7.d);
                    return;
                }
                return;
            default:
                U u8 = ((P0) this.f6294s).f6439k.f;
                if (u8 != null) {
                    androidx.leanback.widget.G g10 = this.f6293r;
                    u8.c(g10.f6367v, g10.f6369x, null, null);
                    return;
                }
                return;
        }
    }
}
