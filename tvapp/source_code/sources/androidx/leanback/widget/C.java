package androidx.leanback.widget;

import android.view.ViewGroup;
import android.widget.RelativeLayout;
/* loaded from: classes.dex */
public final class C extends AbstractC0299j0 {
    @Override // androidx.leanback.widget.AbstractC0299j0
    public final C0297i0 h(ViewGroup viewGroup) {
        RelativeLayout relativeLayout = new RelativeLayout(viewGroup.getContext());
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(0, 0));
        return new C0297i0(relativeLayout);
    }
}
