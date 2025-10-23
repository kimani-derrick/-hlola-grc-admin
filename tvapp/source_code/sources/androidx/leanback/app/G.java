package androidx.leanback.app;

import androidx.leanback.widget.AbstractC0287d0;
import androidx.leanback.widget.C0297i0;
import androidx.leanback.widget.Q;
import androidx.leanback.widget.V;
import androidx.leanback.widget.Z;
/* loaded from: classes.dex */
public final class G implements V, Q {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ H f6181q;

    @Override // androidx.leanback.widget.V
    public void g(Z z7, Object obj, C0297i0 c0297i0, Object obj2) {
        AbstractC0287d0 abstractC0287d0 = (AbstractC0287d0) obj2;
        H h7 = this.f6181q;
        int selectedPosition = h7.f6184L0.f6466c.getSelectedPosition();
        if (selectedPosition != h7.f6188P0) {
            h7.f6188P0 = selectedPosition;
            h7.r0();
        }
        V v5 = h7.f6185M0;
        if (v5 != null) {
            v5.g(z7, obj, c0297i0, abstractC0287d0);
        }
    }
}
