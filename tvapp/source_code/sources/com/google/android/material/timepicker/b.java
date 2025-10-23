package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;
/* loaded from: classes.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f9043q;

    public b(ClockFaceView clockFaceView) {
        this.f9043q = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f9043q;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.f9017I.f9032r) - clockFaceView.f9024P;
        if (height != clockFaceView.f9045G) {
            clockFaceView.f9045G = height;
            clockFaceView.f();
            int i7 = clockFaceView.f9045G;
            ClockHandView clockHandView = clockFaceView.f9017I;
            clockHandView.f9040z = i7;
            clockHandView.invalidate();
        }
        return true;
    }
}
