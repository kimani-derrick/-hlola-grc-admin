package w0;

import K.C0026b;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public final class l0 extends C0026b {
    public final m0 d;

    /* renamed from: e  reason: collision with root package name */
    public final WeakHashMap f15596e = new WeakHashMap();

    public l0(m0 m0Var) {
        this.d = m0Var;
    }

    @Override // K.C0026b
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        C0026b c0026b = (C0026b) this.f15596e.get(view);
        if (c0026b != null) {
            return c0026b.a(view, accessibilityEvent);
        }
        return this.f1466a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // K.C0026b
    public final K3.f b(View view) {
        C0026b c0026b = (C0026b) this.f15596e.get(view);
        if (c0026b != null) {
            return c0026b.b(view);
        }
        return super.b(view);
    }

    @Override // K.C0026b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        C0026b c0026b = (C0026b) this.f15596e.get(view);
        if (c0026b != null) {
            c0026b.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    @Override // K.C0026b
    public final void d(View view, L.i iVar) {
        m0 m0Var = this.d;
        boolean P6 = m0Var.d.P();
        View.AccessibilityDelegate accessibilityDelegate = this.f1466a;
        AccessibilityNodeInfo accessibilityNodeInfo = iVar.f1854a;
        if (!P6) {
            RecyclerView recyclerView = m0Var.d;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().i0(view, iVar);
                C0026b c0026b = (C0026b) this.f15596e.get(view);
                if (c0026b != null) {
                    c0026b.d(view, iVar);
                    return;
                }
            }
        }
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
    }

    @Override // K.C0026b
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        C0026b c0026b = (C0026b) this.f15596e.get(view);
        if (c0026b != null) {
            c0026b.e(view, accessibilityEvent);
        } else {
            super.e(view, accessibilityEvent);
        }
    }

    @Override // K.C0026b
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        C0026b c0026b = (C0026b) this.f15596e.get(viewGroup);
        if (c0026b != null) {
            return c0026b.f(viewGroup, view, accessibilityEvent);
        }
        return this.f1466a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // K.C0026b
    public final boolean g(View view, int i7, Bundle bundle) {
        m0 m0Var = this.d;
        if (!m0Var.d.P()) {
            RecyclerView recyclerView = m0Var.d;
            if (recyclerView.getLayoutManager() != null) {
                C0026b c0026b = (C0026b) this.f15596e.get(view);
                if (c0026b != null) {
                    if (c0026b.g(view, i7, bundle)) {
                        return true;
                    }
                } else if (super.g(view, i7, bundle)) {
                    return true;
                }
                a0 a0Var = recyclerView.getLayoutManager().f15479b.f6948s;
                return false;
            }
        }
        return super.g(view, i7, bundle);
    }

    @Override // K.C0026b
    public final void h(View view, int i7) {
        C0026b c0026b = (C0026b) this.f15596e.get(view);
        if (c0026b != null) {
            c0026b.h(view, i7);
        } else {
            super.h(view, i7);
        }
    }

    @Override // K.C0026b
    public final void i(View view, AccessibilityEvent accessibilityEvent) {
        C0026b c0026b = (C0026b) this.f15596e.get(view);
        if (c0026b != null) {
            c0026b.i(view, accessibilityEvent);
        } else {
            super.i(view, accessibilityEvent);
        }
    }
}
