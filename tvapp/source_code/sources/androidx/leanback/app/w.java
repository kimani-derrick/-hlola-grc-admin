package androidx.leanback.app;

import a.AbstractC0189a;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes.dex */
public final class w extends AbstractC0189a {
    @Override // a.AbstractC0189a
    public final void I(View view, View view2) {
        ((FrameLayout) view).addView(view2);
    }

    @Override // a.AbstractC0189a
    public final View o(RecyclerView recyclerView) {
        return new FrameLayout(recyclerView.getContext());
    }
}
