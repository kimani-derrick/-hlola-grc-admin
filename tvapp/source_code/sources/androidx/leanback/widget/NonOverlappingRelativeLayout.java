package androidx.leanback.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
/* loaded from: classes.dex */
class NonOverlappingRelativeLayout extends RelativeLayout {
    public NonOverlappingRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }
}
