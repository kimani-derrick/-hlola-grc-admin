package com.google.android.material.appbar;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import r0.AbstractC1111a;
import w3.AbstractC1403a;
/* loaded from: classes.dex */
public class AppBarLayout$BaseBehavior<T> extends AbstractC1403a {

    /* renamed from: c  reason: collision with root package name */
    public boolean f8731c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public int f8732e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public VelocityTracker f8733g;

    public AppBarLayout$BaseBehavior() {
        this.d = -1;
        this.f = -1;
    }

    @Override // x.AbstractC1438a
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.f < 0) {
            this.f = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f8731c) {
            int i7 = this.d;
            if (i7 == -1 || (findPointerIndex = motionEvent.findPointerIndex(i7)) == -1) {
                return false;
            }
            int y3 = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y3 - this.f8732e) > this.f) {
                this.f8732e = y3;
                return true;
            }
        }
        if (motionEvent.getActionMasked() != 0) {
            VelocityTracker velocityTracker = this.f8733g;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            return false;
        }
        this.d = -1;
        motionEvent.getX();
        motionEvent.getY();
        AbstractC1111a.w(view);
        throw null;
    }

    @Override // w3.AbstractC1403a, x.AbstractC1438a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i7) {
        AbstractC1111a.w(view);
        throw null;
    }

    @Override // x.AbstractC1438a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view) {
        AbstractC1111a.w(view);
        throw null;
    }

    @Override // x.AbstractC1438a
    public final void j(CoordinatorLayout coordinatorLayout, View view, View view2, int i7, int i8, int[] iArr, int i9) {
        AbstractC1111a.w(view);
        throw null;
    }

    @Override // x.AbstractC1438a
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i7, int i8, int i9, int[] iArr) {
        AbstractC1111a.w(view);
        throw null;
    }

    @Override // x.AbstractC1438a
    public final void m(View view, Parcelable parcelable) {
        AbstractC1111a.w(view);
        throw null;
    }

    @Override // x.AbstractC1438a
    public final Parcelable n(View view) {
        AbstractC1111a.w(view);
        throw null;
    }

    @Override // x.AbstractC1438a
    public final boolean o(View view, int i7, int i8) {
        AbstractC1111a.w(view);
        throw null;
    }

    @Override // x.AbstractC1438a
    public final void p(View view, View view2, int i7) {
        AbstractC1111a.w(view);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0056  */
    @Override // x.AbstractC1438a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean q(android.view.View r7, android.view.MotionEvent r8) {
        /*
            r6 = this;
            int r0 = r8.getActionMasked()
            r1 = -1
            r2 = 1
            r3 = 0
            r4 = 0
            if (r0 == r2) goto L41
            r5 = 2
            if (r0 == r5) goto L2d
            r7 = 3
            if (r0 == r7) goto L45
            r7 = 6
            if (r0 == r7) goto L14
            goto L52
        L14:
            int r7 = r8.getActionIndex()
            if (r7 != 0) goto L1b
            goto L1c
        L1b:
            r2 = r4
        L1c:
            int r7 = r8.getPointerId(r2)
            r6.d = r7
            float r7 = r8.getY(r2)
            r0 = 1056964608(0x3f000000, float:0.5)
            float r7 = r7 + r0
            int r7 = (int) r7
            r6.f8732e = r7
            goto L52
        L2d:
            int r0 = r6.d
            int r0 = r8.findPointerIndex(r0)
            if (r0 != r1) goto L36
            return r4
        L36:
            float r8 = r8.getY(r0)
            int r8 = (int) r8
            r6.f8732e = r8
            com.google.android.gms.internal.measurement.AbstractC0515y1.v(r7)
            throw r3
        L41:
            android.view.VelocityTracker r0 = r6.f8733g
            if (r0 != 0) goto L5c
        L45:
            r6.f8731c = r4
            r6.d = r1
            android.view.VelocityTracker r7 = r6.f8733g
            if (r7 == 0) goto L52
            r7.recycle()
            r6.f8733g = r3
        L52:
            android.view.VelocityTracker r7 = r6.f8733g
            if (r7 == 0) goto L59
            r7.addMovement(r8)
        L59:
            boolean r7 = r6.f8731c
            return r7
        L5c:
            r0.addMovement(r8)
            android.view.VelocityTracker r8 = r6.f8733g
            r0 = 1000(0x3e8, float:1.401E-42)
            r8.computeCurrentVelocity(r0)
            android.view.VelocityTracker r8 = r6.f8733g
            int r0 = r6.d
            r8.getYVelocity(r0)
            com.google.android.gms.internal.measurement.AbstractC0515y1.v(r7)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout$BaseBehavior.q(android.view.View, android.view.MotionEvent):boolean");
    }

    public AppBarLayout$BaseBehavior(Context context, AttributeSet attributeSet) {
        super(0);
        this.d = -1;
        this.f = -1;
    }
}
