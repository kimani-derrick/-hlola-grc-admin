package w0;

import K.C0026b;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.datastore.preferences.protobuf.C0230i;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import k3.AbstractC0958a;
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f15502a;

    /* renamed from: b  reason: collision with root package name */
    public ArrayList f15503b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f15504c;
    public final List d;

    /* renamed from: e  reason: collision with root package name */
    public int f15505e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public Z f15506g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ RecyclerView f15507h;

    public a0(RecyclerView recyclerView) {
        this.f15507h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f15502a = arrayList;
        this.f15503b = null;
        this.f15504c = new ArrayList();
        this.d = Collections.unmodifiableList(arrayList);
        this.f15505e = 2;
        this.f = 2;
    }

    public final void a(k0 k0Var, boolean z7) {
        C0026b c0026b;
        RecyclerView.k(k0Var);
        RecyclerView recyclerView = this.f15507h;
        m0 m0Var = recyclerView.f6898E0;
        View view = k0Var.f15576a;
        if (m0Var != null) {
            l0 l0Var = m0Var.f15609e;
            if (l0Var instanceof l0) {
                c0026b = (C0026b) l0Var.f15596e.remove(view);
            } else {
                c0026b = null;
            }
            K.O.i(view, c0026b);
        }
        if (z7) {
            b0 b0Var = recyclerView.f6897E;
            if (b0Var != null) {
                b0Var.a(k0Var);
            }
            ArrayList arrayList = recyclerView.F;
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                ((b0) arrayList.get(i7)).a(k0Var);
            }
            L l7 = recyclerView.f6893C;
            if (l7 != null) {
                l7.j(k0Var);
            }
            if (recyclerView.f6959x0 != null) {
                recyclerView.f6956w.B(k0Var);
            }
            if (RecyclerView.U0) {
                Log.d("RecyclerView", "dispatchViewRecycled: " + k0Var);
            }
        }
        k0Var.f15591s = null;
        k0Var.f15590r = null;
        Z c5 = c();
        c5.getClass();
        int i8 = k0Var.f;
        ArrayList arrayList2 = c5.a(i8).f15493a;
        if (((Y) c5.f15496a.get(i8)).f15494b <= arrayList2.size()) {
            AbstractC0958a.e(view);
        } else if (RecyclerView.f6880T0 && arrayList2.contains(k0Var)) {
            throw new IllegalArgumentException("this scrap item already exists");
        } else {
            k0Var.r();
            arrayList2.add(k0Var);
        }
    }

    public final int b(int i7) {
        RecyclerView recyclerView = this.f15507h;
        if (i7 >= 0 && i7 < recyclerView.f6959x0.b()) {
            if (!recyclerView.f6959x0.f15543g) {
                return i7;
            }
            return recyclerView.f6952u.h(i7, 0);
        }
        StringBuilder o7 = AbstractC0515y1.o(i7, "invalid position ", ". State item count is ");
        o7.append(recyclerView.f6959x0.b());
        o7.append(recyclerView.A());
        throw new IndexOutOfBoundsException(o7.toString());
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [w0.Z, java.lang.Object] */
    public final Z c() {
        if (this.f15506g == null) {
            ?? obj = new Object();
            obj.f15496a = new SparseArray();
            obj.f15497b = 0;
            obj.f15498c = Collections.newSetFromMap(new IdentityHashMap());
            this.f15506g = obj;
            e();
        }
        return this.f15506g;
    }

    public final View d(int i7) {
        return l(Long.MAX_VALUE, i7).f15576a;
    }

    public final void e() {
        RecyclerView recyclerView;
        L l7;
        Z z7 = this.f15506g;
        if (z7 != null && (l7 = (recyclerView = this.f15507h).f6893C) != null && recyclerView.f6905J) {
            z7.f15498c.add(l7);
        }
    }

    public final void f(L l7, boolean z7) {
        Z z8 = this.f15506g;
        if (z8 != null) {
            Set set = z8.f15498c;
            set.remove(l7);
            if (set.size() == 0 && !z7) {
                int i7 = 0;
                while (true) {
                    SparseArray sparseArray = z8.f15496a;
                    if (i7 < sparseArray.size()) {
                        ArrayList arrayList = ((Y) sparseArray.get(sparseArray.keyAt(i7))).f15493a;
                        for (int i8 = 0; i8 < arrayList.size(); i8++) {
                            AbstractC0958a.e(((k0) arrayList.get(i8)).f15576a);
                        }
                        i7++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void g() {
        ArrayList arrayList = this.f15504c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            h(size);
        }
        arrayList.clear();
        if (RecyclerView.f6885Z0) {
            C0230i c0230i = this.f15507h.f6957w0;
            int[] iArr = (int[]) c0230i.f5784e;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            c0230i.d = 0;
        }
    }

    public final void h(int i7) {
        if (RecyclerView.U0) {
            Log.d("RecyclerView", "Recycling cached view at index " + i7);
        }
        ArrayList arrayList = this.f15504c;
        k0 k0Var = (k0) arrayList.get(i7);
        if (RecyclerView.U0) {
            Log.d("RecyclerView", "CachedViewHolder to be recycled: " + k0Var);
        }
        a(k0Var, true);
        arrayList.remove(i7);
    }

    public final void i(View view) {
        k0 N6 = RecyclerView.N(view);
        boolean o7 = N6.o();
        RecyclerView recyclerView = this.f15507h;
        if (o7) {
            recyclerView.removeDetachedView(view, false);
        }
        if (N6.n()) {
            N6.n.m(N6);
        } else if (N6.u()) {
            N6.f15583j &= -33;
        }
        j(N6);
        if (recyclerView.f6933f0 != null && !N6.l()) {
            recyclerView.f6933f0.d(N6);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c1, code lost:
        r5 = r5 - 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(w0.k0 r13) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.a0.j(w0.k0):void");
    }

    public final void k(View view) {
        ArrayList arrayList;
        P p3;
        k0 N6 = RecyclerView.N(view);
        boolean h7 = N6.h(12);
        RecyclerView recyclerView = this.f15507h;
        if (!h7 && N6.p() && (p3 = recyclerView.f6933f0) != null) {
            C1359m c1359m = (C1359m) p3;
            if (N6.g().isEmpty() && c1359m.f15598g && !N6.k()) {
                if (this.f15503b == null) {
                    this.f15503b = new ArrayList();
                }
                N6.n = this;
                N6.f15587o = true;
                arrayList = this.f15503b;
                arrayList.add(N6);
            }
        }
        if (N6.k() && !N6.m() && !recyclerView.f6893C.f15467b) {
            throw new IllegalArgumentException(AbstractC0515y1.k(recyclerView, new StringBuilder("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
        }
        N6.n = this;
        N6.f15587o = false;
        arrayList = this.f15502a;
        arrayList.add(N6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x01d8, code lost:
        if (r5.f15543g == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0208, code lost:
        if (r11.f15579e != r7.b(r11.f15578c)) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:337:0x05ee  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x05f8  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0609 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0082  */
    /* JADX WARN: Type inference failed for: r2v45, types: [java.lang.Object, K.p] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final w0.k0 l(long r26, int r28) {
        /*
            Method dump skipped, instructions count: 1602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.a0.l(long, int):w0.k0");
    }

    public final void m(k0 k0Var) {
        ArrayList arrayList;
        if (k0Var.f15587o) {
            arrayList = this.f15503b;
        } else {
            arrayList = this.f15502a;
        }
        arrayList.remove(k0Var);
        k0Var.n = null;
        k0Var.f15587o = false;
        k0Var.f15583j &= -33;
    }

    public final void n() {
        int i7;
        U u7 = this.f15507h.f6895D;
        if (u7 != null) {
            i7 = u7.f15485j;
        } else {
            i7 = 0;
        }
        this.f = this.f15505e + i7;
        ArrayList arrayList = this.f15504c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f; size--) {
            h(size);
        }
    }
}
