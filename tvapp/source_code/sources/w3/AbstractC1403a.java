package w3;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.datastore.preferences.protobuf.C0230i;
import x.AbstractC1438a;
/* renamed from: w3.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1403a extends AbstractC1438a {

    /* renamed from: a  reason: collision with root package name */
    public C0230i f15867a;

    /* renamed from: b  reason: collision with root package name */
    public int f15868b = 0;

    public AbstractC1403a() {
    }

    @Override // x.AbstractC1438a
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i7) {
        r(coordinatorLayout, view, i7);
        if (this.f15867a == null) {
            this.f15867a = new C0230i(view);
        }
        C0230i c0230i = this.f15867a;
        View view2 = (View) c0230i.f5784e;
        c0230i.f5782b = view2.getTop();
        c0230i.f5783c = view2.getLeft();
        this.f15867a.c();
        int i8 = this.f15868b;
        if (i8 != 0) {
            C0230i c0230i2 = this.f15867a;
            if (c0230i2.d != i8) {
                c0230i2.d = i8;
                c0230i2.c();
            }
            this.f15868b = 0;
            return true;
        }
        return true;
    }

    public void r(CoordinatorLayout coordinatorLayout, View view, int i7) {
        coordinatorLayout.q(view, i7);
    }

    public AbstractC1403a(int i7) {
    }
}
