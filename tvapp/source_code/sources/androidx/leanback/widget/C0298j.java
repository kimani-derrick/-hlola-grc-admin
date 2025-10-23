package androidx.leanback.widget;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.boxhdo.android.tv.R;
/* renamed from: androidx.leanback.widget.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0298j extends AbstractC0281a0 {
    @Override // androidx.leanback.widget.AbstractC0281a0
    public final void c(Z z7, Object obj) {
    }

    @Override // androidx.leanback.widget.AbstractC0281a0
    public final Z d(ViewGroup viewGroup) {
        return new Z(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.lb_divider, viewGroup, false));
    }

    @Override // androidx.leanback.widget.AbstractC0281a0
    public final void e(Z z7) {
    }
}
