package com.google.android.material.behavior;

import L3.p;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import v3.AbstractC1322a;
import x.AbstractC1438a;
/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends AbstractC1438a {

    /* renamed from: a  reason: collision with root package name */
    public int f8738a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f8739b = 2;

    /* renamed from: c  reason: collision with root package name */
    public ViewPropertyAnimator f8740c;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // x.AbstractC1438a
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i7) {
        this.f8738a = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        return false;
    }

    @Override // x.AbstractC1438a
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i7, int i8, int i9, int[] iArr) {
        if (i7 > 0) {
            if (this.f8739b != 1) {
                ViewPropertyAnimator viewPropertyAnimator = this.f8740c;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                    view.clearAnimation();
                }
                this.f8739b = 1;
                int i10 = this.f8738a;
                this.f8740c = view.animate().translationY(i10).setInterpolator(AbstractC1322a.f15314c).setDuration(175L).setListener(new p(2, this));
            }
        } else if (i7 < 0 && this.f8739b != 2) {
            ViewPropertyAnimator viewPropertyAnimator2 = this.f8740c;
            if (viewPropertyAnimator2 != null) {
                viewPropertyAnimator2.cancel();
                view.clearAnimation();
            }
            this.f8739b = 2;
            this.f8740c = view.animate().translationY(0).setInterpolator(AbstractC1322a.d).setDuration(225L).setListener(new p(2, this));
        }
    }

    @Override // x.AbstractC1438a
    public boolean o(View view, int i7, int i8) {
        if (i7 == 2) {
            return true;
        }
        return false;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
