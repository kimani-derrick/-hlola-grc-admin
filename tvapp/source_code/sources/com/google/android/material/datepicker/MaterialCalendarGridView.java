package com.google.android.material.datepicker;

import K.O;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.boxhdo.android.tv.R;
/* loaded from: classes.dex */
final class MaterialCalendarGridView extends GridView {

    /* renamed from: q  reason: collision with root package name */
    public final boolean f8841q;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        u.c(null);
        if (k.k0(getContext(), 16843277)) {
            setNextFocusLeftId(R.id.cancel_button);
            setNextFocusRightId(R.id.confirm_button);
        }
        this.f8841q = k.k0(getContext(), R.attr.nestedScrollable);
        O.i(this, new P.i(2));
    }

    public final n a() {
        return (n) super.getAdapter();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final ListAdapter getAdapter() {
        return (n) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((n) super.getAdapter()).notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        n nVar = (n) super.getAdapter();
        nVar.getClass();
        nVar.getItem(nVar.f8898q.g());
        nVar.getItem(nVar.b());
        throw null;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z7, int i7, Rect rect) {
        int g7;
        if (z7) {
            if (i7 == 33) {
                g7 = ((n) super.getAdapter()).b();
            } else if (i7 == 130) {
                g7 = ((n) super.getAdapter()).f8898q.g();
            } else {
                super.onFocusChanged(true, i7, rect);
                return;
            }
            setSelection(g7);
            return;
        }
        super.onFocusChanged(false, i7, rect);
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i7, KeyEvent keyEvent) {
        if (!super.onKeyDown(i7, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= ((n) super.getAdapter()).f8898q.g()) {
            return true;
        }
        if (19 != i7) {
            return false;
        }
        setSelection(((n) super.getAdapter()).f8898q.g());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i7, int i8) {
        if (!this.f8841q) {
            super.onMeasure(i7, i8);
            return;
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i7) {
        if (i7 < ((n) super.getAdapter()).f8898q.g()) {
            i7 = ((n) super.getAdapter()).f8898q.g();
        }
        super.setSelection(i7);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* renamed from: getAdapter  reason: avoid collision after fix types in other method */
    public final ListAdapter getAdapter2() {
        return (n) super.getAdapter();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof n)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), n.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }
}
