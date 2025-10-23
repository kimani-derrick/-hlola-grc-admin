package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
/* loaded from: classes.dex */
public final class j implements View.OnTouchListener {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ GestureDetector f9050q;

    public j(GestureDetector gestureDetector) {
        this.f9050q = gestureDetector;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (((Checkable) view).isChecked()) {
            return this.f9050q.onTouchEvent(motionEvent);
        }
        return false;
    }
}
