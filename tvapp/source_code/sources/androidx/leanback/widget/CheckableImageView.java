package androidx.leanback.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import android.widget.ImageView;
/* loaded from: classes.dex */
class CheckableImageView extends ImageView implements Checkable {

    /* renamed from: r  reason: collision with root package name */
    public static final int[] f6353r = {16842912};

    /* renamed from: q  reason: collision with root package name */
    public boolean f6354q;

    public CheckableImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f6354q;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i7) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i7 + 1);
        if (this.f6354q) {
            View.mergeDrawableStates(onCreateDrawableState, f6353r);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z7) {
        if (this.f6354q != z7) {
            this.f6354q = z7;
            refreshDrawableState();
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f6354q);
    }
}
