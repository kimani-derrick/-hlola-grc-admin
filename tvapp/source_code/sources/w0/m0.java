package w0;

import K.C0026b;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes.dex */
public final class m0 extends C0026b {
    public final RecyclerView d;

    /* renamed from: e  reason: collision with root package name */
    public final l0 f15609e;

    public m0(RecyclerView recyclerView) {
        this.d = recyclerView;
        l0 l0Var = this.f15609e;
        this.f15609e = l0Var == null ? new l0(this) : l0Var;
    }

    @Override // K.C0026b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !this.d.P()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().g0(accessibilityEvent);
            }
        }
    }

    @Override // K.C0026b
    public final void d(View view, L.i iVar) {
        this.f1466a.onInitializeAccessibilityNodeInfo(view, iVar.f1854a);
        RecyclerView recyclerView = this.d;
        if (!recyclerView.P() && recyclerView.getLayoutManager() != null) {
            U layoutManager = recyclerView.getLayoutManager();
            RecyclerView recyclerView2 = layoutManager.f15479b;
            layoutManager.h0(recyclerView2.f6948s, recyclerView2.f6959x0, iVar);
        }
    }

    @Override // K.C0026b
    public final boolean g(View view, int i7, Bundle bundle) {
        if (super.g(view, i7, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.d;
        if (!recyclerView.P() && recyclerView.getLayoutManager() != null) {
            return recyclerView.getLayoutManager().z0(i7, bundle);
        }
        return false;
    }
}
