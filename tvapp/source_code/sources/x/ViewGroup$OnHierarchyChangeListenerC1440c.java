package x;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
/* renamed from: x.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewGroup$OnHierarchyChangeListenerC1440c implements ViewGroup.OnHierarchyChangeListener {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ CoordinatorLayout f16128q;

    public ViewGroup$OnHierarchyChangeListenerC1440c(CoordinatorLayout coordinatorLayout) {
        this.f16128q = coordinatorLayout;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f16128q.f5597G;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewAdded(view, view2);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        CoordinatorLayout coordinatorLayout = this.f16128q;
        coordinatorLayout.p(2);
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = coordinatorLayout.f5597G;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
    }
}
