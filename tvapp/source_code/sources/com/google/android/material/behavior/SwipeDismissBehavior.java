package com.google.android.material.behavior;

import K.O;
import L.d;
import T.e;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Field;
import k.C0852F;
import x.AbstractC1438a;
import x3.C1465a;
/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends AbstractC1438a {

    /* renamed from: a  reason: collision with root package name */
    public e f8741a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f8742b;

    /* renamed from: c  reason: collision with root package name */
    public int f8743c = 2;
    public final float d = 0.5f;

    /* renamed from: e  reason: collision with root package name */
    public float f8744e = 0.0f;
    public float f = 0.5f;

    /* renamed from: g  reason: collision with root package name */
    public final C1465a f8745g = new C1465a(this);

    @Override // x.AbstractC1438a
    public boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z7 = this.f8742b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.f8742b = false;
            }
        } else {
            z7 = coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f8742b = z7;
        }
        if (!z7) {
            return false;
        }
        if (this.f8741a == null) {
            this.f8741a = new e(coordinatorLayout.getContext(), coordinatorLayout, this.f8745g);
        }
        return this.f8741a.p(motionEvent);
    }

    @Override // x.AbstractC1438a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i7) {
        Field field = O.f1447a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            O.f(view, 1048576);
            O.d(view, 0);
            if (r(view)) {
                O.g(view, d.f1844j, new C0852F(28, this));
            }
        }
        return false;
    }

    @Override // x.AbstractC1438a
    public final boolean q(View view, MotionEvent motionEvent) {
        e eVar = this.f8741a;
        if (eVar != null) {
            eVar.j(motionEvent);
            return true;
        }
        return false;
    }

    public boolean r(View view) {
        return true;
    }
}
