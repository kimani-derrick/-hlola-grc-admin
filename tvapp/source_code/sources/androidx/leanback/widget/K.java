package androidx.leanback.widget;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class K extends H {

    /* renamed from: k  reason: collision with root package name */
    public final L f6406k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ q1.j f6407l;

    public K(q1.j jVar, L l7) {
        this.f6407l = jVar;
        this.f6406k = l7;
    }

    @Override // androidx.leanback.widget.H
    public final void k(AbstractC0281a0 abstractC0281a0, int i7) {
        int i8;
        w0.Z recycledViewPool = this.f6406k.n.getRecycledViewPool();
        HashMap hashMap = this.f6407l.f13249k;
        if (hashMap.containsKey(abstractC0281a0)) {
            i8 = ((Integer) hashMap.get(abstractC0281a0)).intValue();
        } else {
            i8 = 24;
        }
        w0.Y a7 = recycledViewPool.a(i7);
        a7.f15494b = i8;
        ArrayList arrayList = a7.f15493a;
        while (arrayList.size() > i8) {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    @Override // androidx.leanback.widget.H
    public final void l(G g7) {
        L l7 = this.f6406k;
        q1.j jVar = this.f6407l;
        View view = g7.f15576a;
        jVar.u(l7, view);
        int i7 = l7.f;
        if (i7 == 1) {
            view.setActivated(true);
        } else if (i7 == 2) {
            view.setActivated(false);
        }
    }

    @Override // androidx.leanback.widget.H
    public final void m(G g7) {
        if (this.f6406k.f6601m != null) {
            g7.f6367v.f6572a.setOnClickListener(new androidx.leanback.app.t(this, g7, 1));
        }
    }

    @Override // androidx.leanback.widget.H
    public final void n(G g7) {
        View view = g7.f15576a;
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).setTransitionGroup(true);
        }
        C0 c02 = this.f6407l.f13250l;
        if (c02 != null) {
            c02.a(view);
        }
    }

    @Override // androidx.leanback.widget.H
    public final void o(G g7) {
        if (this.f6406k.f6601m != null) {
            g7.f6367v.f6572a.setOnClickListener(null);
        }
    }
}
