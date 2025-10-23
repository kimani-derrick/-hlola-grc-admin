package com.boxhdo.android.tv.customviews;

import M5.g;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.leanback.widget.VerticalGridView;
/* loaded from: classes.dex */
public final class CustomVerticalGridView extends VerticalGridView {

    /* renamed from: k1  reason: collision with root package name */
    public int f7781k1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomVerticalGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        g.f(context, "context");
        this.f7781k1 = -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i7) {
        if (i7 != 17 || this.f7781k1 == -1) {
            View focusSearch = super.focusSearch(view, i7);
            g.e(focusSearch, "super.focusSearch(focused, direction)");
            return focusSearch;
        }
        View findViewById = getRootView().findViewById(this.f7781k1);
        if (findViewById == null) {
            View focusSearch2 = super.focusSearch(view, i7);
            g.e(focusSearch2, "super.focusSearch(focused, direction)");
            return focusSearch2;
        }
        return findViewById;
    }

    public final void setFocusLeftId(int i7) {
        this.f7781k1 = i7;
    }
}
