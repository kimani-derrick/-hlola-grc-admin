package w0;

import K.C0040p;
import K.InterfaceC0033i;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class K implements InterfaceC0033i {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ RecyclerView f15465q;

    public /* synthetic */ K(RecyclerView recyclerView) {
        this.f15465q = recyclerView;
    }

    @Override // K.InterfaceC0033i
    public void E() {
        this.f15465q.u0();
    }

    public void a(C1347a c1347a) {
        int i7 = c1347a.f15499a;
        RecyclerView recyclerView = this.f15465q;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 4) {
                    if (i7 == 8) {
                        recyclerView.f6895D.n0(recyclerView, c1347a.f15500b, c1347a.d);
                        return;
                    }
                    return;
                }
                recyclerView.f6895D.q0(recyclerView, c1347a.f15500b, c1347a.d);
                return;
            }
            recyclerView.f6895D.o0(recyclerView, c1347a.f15500b, c1347a.d);
            return;
        }
        recyclerView.f6895D.l0(recyclerView, c1347a.f15500b, c1347a.d);
    }

    @Override // K.InterfaceC0033i
    public boolean b(float f) {
        int i7;
        int i8;
        RecyclerView recyclerView = this.f15465q;
        if (recyclerView.f6895D.g()) {
            i8 = (int) f;
            i7 = 0;
        } else if (recyclerView.f6895D.f()) {
            i7 = (int) f;
            i8 = 0;
        } else {
            i7 = 0;
            i8 = 0;
        }
        if (i7 == 0 && i8 == 0) {
            return false;
        }
        recyclerView.u0();
        return recyclerView.I(i7, i8, 0, Integer.MAX_VALUE);
    }

    public k0 c(int i7) {
        RecyclerView recyclerView = this.f15465q;
        k0 H6 = recyclerView.H(i7, true);
        if (H6 == null) {
            return null;
        }
        if (recyclerView.f6954v.o(H6.f15576a)) {
            if (RecyclerView.U0) {
                Log.d("RecyclerView", "assuming view holder cannot be find because it is hidden");
            }
            return null;
        }
        return H6;
    }

    public void d(int i7, int i8, Object obj) {
        int i9;
        int i10;
        RecyclerView recyclerView = this.f15465q;
        int l7 = recyclerView.f6954v.l();
        int i11 = i8 + i7;
        for (int i12 = 0; i12 < l7; i12++) {
            View k5 = recyclerView.f6954v.k(i12);
            k0 N6 = RecyclerView.N(k5);
            if (N6 != null && !N6.t() && (i10 = N6.f15578c) >= i7 && i10 < i11) {
                N6.c(2);
                N6.b(obj);
                ((V) k5.getLayoutParams()).f15492c = true;
            }
        }
        a0 a0Var = recyclerView.f6948s;
        ArrayList arrayList = a0Var.f15504c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            k0 k0Var = (k0) arrayList.get(size);
            if (k0Var != null && (i9 = k0Var.f15578c) >= i7 && i9 < i11) {
                k0Var.c(2);
                a0Var.h(size);
            }
        }
        recyclerView.f6892B0 = true;
    }

    public void e(int i7, int i8) {
        RecyclerView recyclerView = this.f15465q;
        int l7 = recyclerView.f6954v.l();
        for (int i9 = 0; i9 < l7; i9++) {
            k0 N6 = RecyclerView.N(recyclerView.f6954v.k(i9));
            if (N6 != null && !N6.t() && N6.f15578c >= i7) {
                if (RecyclerView.U0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert attached child " + i9 + " holder " + N6 + " now at position " + (N6.f15578c + i8));
                }
                N6.q(i8, false);
                recyclerView.f6959x0.f = true;
            }
        }
        ArrayList arrayList = recyclerView.f6948s.f15504c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            k0 k0Var = (k0) arrayList.get(i10);
            if (k0Var != null && k0Var.f15578c >= i7) {
                if (RecyclerView.U0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert cached " + i10 + " holder " + k0Var + " now at position " + (k0Var.f15578c + i8));
                }
                k0Var.q(i8, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.f6890A0 = true;
    }

    public void f(int i7, int i8) {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        RecyclerView recyclerView = this.f15465q;
        int l7 = recyclerView.f6954v.l();
        if (i7 < i8) {
            i10 = i7;
            i9 = i8;
            i11 = -1;
        } else {
            i9 = i7;
            i10 = i8;
            i11 = 1;
        }
        boolean z7 = false;
        for (int i17 = 0; i17 < l7; i17++) {
            k0 N6 = RecyclerView.N(recyclerView.f6954v.k(i17));
            if (N6 != null && (i16 = N6.f15578c) >= i10 && i16 <= i9) {
                if (RecyclerView.U0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove attached child " + i17 + " holder " + N6);
                }
                if (N6.f15578c == i7) {
                    N6.q(i8 - i7, false);
                } else {
                    N6.q(i11, false);
                }
                recyclerView.f6959x0.f = true;
            }
        }
        a0 a0Var = recyclerView.f6948s;
        a0Var.getClass();
        if (i7 < i8) {
            i13 = i7;
            i12 = i8;
            i14 = -1;
        } else {
            i12 = i7;
            i13 = i8;
            i14 = 1;
        }
        ArrayList arrayList = a0Var.f15504c;
        int size = arrayList.size();
        int i18 = 0;
        while (i18 < size) {
            k0 k0Var = (k0) arrayList.get(i18);
            if (k0Var != null && (i15 = k0Var.f15578c) >= i13 && i15 <= i12) {
                if (i15 == i7) {
                    k0Var.q(i8 - i7, z7);
                } else {
                    k0Var.q(i14, z7);
                }
                if (RecyclerView.U0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove cached child " + i18 + " holder " + k0Var);
                }
            }
            i18++;
            z7 = false;
        }
        recyclerView.requestLayout();
        recyclerView.f6890A0 = true;
    }

    public void g(k0 k0Var, C0040p c0040p, C0040p c0040p2) {
        RecyclerView recyclerView = this.f15465q;
        recyclerView.getClass();
        k0Var.s(false);
        C1359m c1359m = (C1359m) recyclerView.f6933f0;
        if (c0040p != null) {
            c1359m.getClass();
            int i7 = c0040p.f1501a;
            int i8 = c0040p2.f1501a;
            if (i7 != i8 || c0040p.f1502b != c0040p2.f1502b) {
                if (!c1359m.g(k0Var, i7, c0040p.f1502b, i8, c0040p2.f1502b)) {
                    return;
                }
                recyclerView.Z();
            }
        }
        c1359m.l(k0Var);
        k0Var.f15576a.setAlpha(0.0f);
        c1359m.f15600i.add(k0Var);
        recyclerView.Z();
    }

    public void h(k0 k0Var, C0040p c0040p, C0040p c0040p2) {
        int i7;
        int i8;
        RecyclerView recyclerView = this.f15465q;
        recyclerView.f6948s.m(k0Var);
        recyclerView.g(k0Var);
        k0Var.s(false);
        C1359m c1359m = (C1359m) recyclerView.f6933f0;
        c1359m.getClass();
        int i9 = c0040p.f1501a;
        int i10 = c0040p.f1502b;
        View view = k0Var.f15576a;
        if (c0040p2 == null) {
            i7 = view.getLeft();
        } else {
            i7 = c0040p2.f1501a;
        }
        int i11 = i7;
        if (c0040p2 == null) {
            i8 = view.getTop();
        } else {
            i8 = c0040p2.f1502b;
        }
        int i12 = i8;
        if (!k0Var.m() && (i9 != i11 || i10 != i12)) {
            view.layout(i11, i12, view.getWidth() + i11, view.getHeight() + i12);
            if (!c1359m.g(k0Var, i9, i10, i11, i12)) {
                return;
            }
        } else {
            c1359m.l(k0Var);
            c1359m.f15599h.add(k0Var);
        }
        recyclerView.Z();
    }

    public void i(int i7) {
        RecyclerView recyclerView = this.f15465q;
        View childAt = recyclerView.getChildAt(i7);
        if (childAt != null) {
            k0 N6 = RecyclerView.N(childAt);
            L l7 = recyclerView.f6893C;
            if (l7 != null && N6 != null) {
                l7.i(N6);
            }
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i7);
    }

    @Override // K.InterfaceC0033i
    public float x() {
        float f;
        RecyclerView recyclerView = this.f15465q;
        if (recyclerView.f6895D.g()) {
            f = recyclerView.f6949s0;
        } else if (recyclerView.f6895D.f()) {
            f = recyclerView.f6947r0;
        } else {
            return 0.0f;
        }
        return -f;
    }
}
