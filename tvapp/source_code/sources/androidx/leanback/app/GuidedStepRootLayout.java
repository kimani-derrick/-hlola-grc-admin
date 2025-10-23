package androidx.leanback.app;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import k3.AbstractC0958a;
/* loaded from: classes.dex */
class GuidedStepRootLayout extends LinearLayout {
    public GuidedStepRootLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i7) {
        View focusSearch = super.focusSearch(view, i7);
        if ((i7 == 17 || i7 == 66) && !AbstractC0958a.u(this, focusSearch)) {
            getLayoutDirection();
            return view;
        }
        return focusSearch;
    }
}
