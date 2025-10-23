package androidx.leanback.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
/* loaded from: classes.dex */
class ControlBar extends LinearLayout {

    /* renamed from: q  reason: collision with root package name */
    public int f6355q;

    /* renamed from: r  reason: collision with root package name */
    public final boolean f6356r;

    public ControlBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6355q = -1;
        this.f6356r = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i7, int i8) {
        int i9;
        if (i7 != 33 && i7 != 130) {
            super.addFocusables(arrayList, i7, i8);
            return;
        }
        int i10 = this.f6355q;
        if (i10 >= 0 && i10 < getChildCount()) {
            arrayList.add(getChildAt(this.f6355q));
        } else if (getChildCount() > 0) {
            if (this.f6356r) {
                i9 = getChildCount() / 2;
            } else {
                i9 = 0;
            }
            arrayList.add(getChildAt(i9));
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i8) {
        super.onMeasure(i7, i8);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i7, Rect rect) {
        int i8;
        if (getChildCount() > 0) {
            int i9 = this.f6355q;
            if (i9 >= 0 && i9 < getChildCount()) {
                i8 = this.f6355q;
            } else if (this.f6356r) {
                i8 = getChildCount() / 2;
            } else {
                i8 = 0;
            }
            if (getChildAt(i8).requestFocus(i7, rect)) {
                return true;
            }
        }
        return super.onRequestFocusInDescendants(i7, rect);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        this.f6355q = indexOfChild(view);
    }
}
