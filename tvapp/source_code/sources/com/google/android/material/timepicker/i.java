package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;
/* loaded from: classes.dex */
public final class i extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ TimePickerView f9049q;

    public i(TimePickerView timePickerView) {
        this.f9049q = timePickerView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        boolean onDoubleTap = super.onDoubleTap(motionEvent);
        int i7 = TimePickerView.f9041G;
        this.f9049q.getClass();
        return onDoubleTap;
    }
}
