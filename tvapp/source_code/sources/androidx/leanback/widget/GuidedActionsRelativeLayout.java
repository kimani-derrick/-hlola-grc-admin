package androidx.leanback.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.boxhdo.android.tv.R;
import f0.AbstractC0659a;
/* loaded from: classes.dex */
class GuidedActionsRelativeLayout extends RelativeLayout {

    /* renamed from: q  reason: collision with root package name */
    public final float f6377q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f6378r;

    public GuidedActionsRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f6378r = false;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(AbstractC0659a.f10197a);
        float f = obtainStyledAttributes.getFloat(45, 40.0f);
        obtainStyledAttributes.recycle();
        this.f6377q = f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        super.onLayout(z7, i7, i8, i9, i10);
        this.f6378r = false;
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i7, int i8) {
        View findViewById;
        int size = View.MeasureSpec.getSize(i8);
        if (size > 0 && (findViewById = findViewById(R.id.guidedactions_sub_list)) != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) findViewById.getLayoutParams();
            if (marginLayoutParams.topMargin < 0 && !this.f6378r) {
                this.f6378r = true;
            }
            if (this.f6378r) {
                marginLayoutParams.topMargin = (int) ((this.f6377q * size) / 100.0f);
            }
        }
        super.onMeasure(i7, i8);
    }
}
