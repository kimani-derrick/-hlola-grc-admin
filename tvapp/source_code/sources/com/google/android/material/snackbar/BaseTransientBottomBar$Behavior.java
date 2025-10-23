package com.google.android.material.snackbar;

import K3.d;
import L4.f;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
/* loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* renamed from: h  reason: collision with root package name */
    public final f f8926h;

    public BaseTransientBottomBar$Behavior() {
        f fVar = new f(6);
        this.f8744e = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        this.f = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.f8743c = 0;
        this.f8926h = fVar;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, x.AbstractC1438a
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.f8926h.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (K3.f.f1835b == null) {
                    K3.f.f1835b = new K3.f(0);
                }
                synchronized (K3.f.f1835b.f1836a) {
                }
            }
        } else if (coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (K3.f.f1835b == null) {
                K3.f.f1835b = new K3.f(0);
            }
            K3.f.f1835b.d();
        }
        return super.f(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean r(View view) {
        this.f8926h.getClass();
        return view instanceof d;
    }
}
