package androidx.leanback.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import k3.AbstractC0958a;
/* loaded from: classes.dex */
class GuidedActionItemContainer extends N {

    /* renamed from: q  reason: collision with root package name */
    public final boolean f6376q;

    public GuidedActionItemContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        new Rect();
        if (context.getApplicationInfo().targetSdkVersion < 23) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16843017});
            Drawable drawable = obtainStyledAttributes.getDrawable(0);
            if (drawable != null) {
                setForeground(drawable);
            }
            obtainStyledAttributes.recycle();
        }
        this.f6376q = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i7) {
        if (this.f6376q || !AbstractC0958a.u(this, view)) {
            return super.focusSearch(view, i7);
        }
        View focusSearch = super.focusSearch(view, i7);
        if (AbstractC0958a.u(this, focusSearch)) {
            return focusSearch;
        }
        return null;
    }
}
