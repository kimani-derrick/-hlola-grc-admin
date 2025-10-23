package androidx.recyclerview.widget;

import K.O;
import L.d;
import L.h;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.datastore.preferences.protobuf.C0230i;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import t2.i;
import u2.u;
import w0.C1346A;
import w0.C1369x;
import w0.L;
import w0.U;
import w0.V;
import w0.a0;
import w0.g0;
/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: P  reason: collision with root package name */
    public static final Set f6854P = Collections.unmodifiableSet(new HashSet(Arrays.asList(17, 66, 33, 130)));

    /* renamed from: E  reason: collision with root package name */
    public boolean f6855E;
    public int F;

    /* renamed from: G  reason: collision with root package name */
    public int[] f6856G;

    /* renamed from: H  reason: collision with root package name */
    public View[] f6857H;

    /* renamed from: I  reason: collision with root package name */
    public final SparseIntArray f6858I;

    /* renamed from: J  reason: collision with root package name */
    public final SparseIntArray f6859J;

    /* renamed from: K  reason: collision with root package name */
    public final i f6860K;

    /* renamed from: L  reason: collision with root package name */
    public final Rect f6861L;

    /* renamed from: M  reason: collision with root package name */
    public int f6862M;

    /* renamed from: N  reason: collision with root package name */
    public int f6863N;

    /* renamed from: O  reason: collision with root package name */
    public int f6864O;

    public GridLayoutManager(int i7) {
        super(1);
        this.f6855E = false;
        this.F = -1;
        this.f6858I = new SparseIntArray();
        this.f6859J = new SparseIntArray();
        this.f6860K = new i(10, (byte) 0);
        this.f6861L = new Rect();
        this.f6862M = -1;
        this.f6863N = -1;
        this.f6864O = -1;
        M1(i7);
    }

    @Override // w0.U
    public final int A(a0 a0Var, g0 g0Var) {
        if (this.f6869p == 1) {
            return Math.min(this.F, I());
        }
        if (g0Var.b() < 1) {
            return 0;
        }
        return I1(g0Var.b() - 1, a0Var, g0Var) + 1;
    }

    public final void B1(int i7) {
        int i8;
        int[] iArr = this.f6856G;
        int i9 = this.F;
        if (iArr == null || iArr.length != i9 + 1 || iArr[iArr.length - 1] != i7) {
            iArr = new int[i9 + 1];
        }
        int i10 = 0;
        iArr[0] = 0;
        int i11 = i7 / i9;
        int i12 = i7 % i9;
        int i13 = 0;
        for (int i14 = 1; i14 <= i9; i14++) {
            i10 += i12;
            if (i10 > 0 && i9 - i10 < i12) {
                i8 = i11 + 1;
                i10 -= i9;
            } else {
                i8 = i11;
            }
            i13 += i8;
            iArr[i14] = i13;
        }
        this.f6856G = iArr;
    }

    public final void C1() {
        View[] viewArr = this.f6857H;
        if (viewArr == null || viewArr.length != this.F) {
            this.f6857H = new View[this.F];
        }
    }

    public final int D1(int i7) {
        if (this.f6869p == 0) {
            RecyclerView recyclerView = this.f15479b;
            return I1(i7, recyclerView.f6948s, recyclerView.f6959x0);
        }
        RecyclerView recyclerView2 = this.f15479b;
        return J1(i7, recyclerView2.f6948s, recyclerView2.f6959x0);
    }

    public final int E1(int i7) {
        if (this.f6869p == 1) {
            RecyclerView recyclerView = this.f15479b;
            return I1(i7, recyclerView.f6948s, recyclerView.f6959x0);
        }
        RecyclerView recyclerView2 = this.f15479b;
        return J1(i7, recyclerView2.f6948s, recyclerView2.f6959x0);
    }

    public final HashSet F1(int i7) {
        return G1(E1(i7), i7);
    }

    public final HashSet G1(int i7, int i8) {
        HashSet hashSet = new HashSet();
        RecyclerView recyclerView = this.f15479b;
        int K12 = K1(i8, recyclerView.f6948s, recyclerView.f6959x0);
        for (int i9 = i7; i9 < i7 + K12; i9++) {
            hashSet.add(Integer.valueOf(i9));
        }
        return hashSet;
    }

    public final int H1(int i7, int i8) {
        if (this.f6869p != 1 || !p1()) {
            int[] iArr = this.f6856G;
            return iArr[i8 + i7] - iArr[i7];
        }
        int[] iArr2 = this.f6856G;
        int i9 = this.F;
        return iArr2[i9 - i7] - iArr2[(i9 - i7) - i8];
    }

    public final int I1(int i7, a0 a0Var, g0 g0Var) {
        boolean z7 = g0Var.f15543g;
        i iVar = this.f6860K;
        if (!z7) {
            int i8 = this.F;
            iVar.getClass();
            return i.r(i7, i8);
        }
        int b7 = a0Var.b(i7);
        if (b7 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i7);
            return 0;
        }
        int i9 = this.F;
        iVar.getClass();
        return i.r(b7, i9);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, w0.U
    public final int J0(int i7, a0 a0Var, g0 g0Var) {
        N1();
        C1();
        return super.J0(i7, a0Var, g0Var);
    }

    public final int J1(int i7, a0 a0Var, g0 g0Var) {
        boolean z7 = g0Var.f15543g;
        i iVar = this.f6860K;
        if (!z7) {
            int i8 = this.F;
            iVar.getClass();
            return i7 % i8;
        }
        int i9 = this.f6859J.get(i7, -1);
        if (i9 != -1) {
            return i9;
        }
        int b7 = a0Var.b(i7);
        if (b7 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i7);
            return 0;
        }
        int i10 = this.F;
        iVar.getClass();
        return b7 % i10;
    }

    public final int K1(int i7, a0 a0Var, g0 g0Var) {
        boolean z7 = g0Var.f15543g;
        i iVar = this.f6860K;
        if (!z7) {
            iVar.getClass();
            return 1;
        }
        int i8 = this.f6858I.get(i7, -1);
        if (i8 != -1) {
            return i8;
        }
        if (a0Var.b(i7) == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i7);
            return 1;
        }
        iVar.getClass();
        return 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, w0.U
    public final int L0(int i7, a0 a0Var, g0 g0Var) {
        N1();
        C1();
        return super.L0(i7, a0Var, g0Var);
    }

    public final void L1(View view, int i7, boolean z7) {
        int i8;
        int i9;
        boolean R02;
        C1369x c1369x = (C1369x) view.getLayoutParams();
        Rect rect = c1369x.f15491b;
        int i10 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c1369x).topMargin + ((ViewGroup.MarginLayoutParams) c1369x).bottomMargin;
        int i11 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c1369x).leftMargin + ((ViewGroup.MarginLayoutParams) c1369x).rightMargin;
        int H12 = H1(c1369x.f15692e, c1369x.f);
        if (this.f6869p == 1) {
            i9 = U.z(false, H12, i7, i11, ((ViewGroup.MarginLayoutParams) c1369x).width);
            i8 = U.z(true, this.f6871r.l(), this.f15488m, i10, ((ViewGroup.MarginLayoutParams) c1369x).height);
        } else {
            int z8 = U.z(false, H12, i7, i10, ((ViewGroup.MarginLayoutParams) c1369x).height);
            int z9 = U.z(true, this.f6871r.l(), this.f15487l, i11, ((ViewGroup.MarginLayoutParams) c1369x).width);
            i8 = z8;
            i9 = z9;
        }
        V v5 = (V) view.getLayoutParams();
        if (z7) {
            R02 = T0(view, i9, i8, v5);
        } else {
            R02 = R0(view, i9, i8, v5);
        }
        if (R02) {
            view.measure(i9, i8);
        }
    }

    public final void M1(int i7) {
        if (i7 == this.F) {
            return;
        }
        this.f6855E = true;
        if (i7 >= 1) {
            this.F = i7;
            this.f6860K.t();
            H0();
            return;
        }
        throw new IllegalArgumentException(AbstractC0515y1.l("Span count should be at least 1. Provided ", i7));
    }

    public final void N1() {
        int K6;
        int N6;
        if (this.f6869p == 1) {
            K6 = this.n - M();
            N6 = L();
        } else {
            K6 = this.f15489o - K();
            N6 = N();
        }
        B1(K6 - N6);
    }

    @Override // w0.U
    public final void O0(Rect rect, int i7, int i8) {
        int i9;
        int i10;
        if (this.f6856G == null) {
            super.O0(rect, i7, i8);
        }
        int M6 = M() + L();
        int K6 = K() + N();
        if (this.f6869p == 1) {
            int height = rect.height() + K6;
            RecyclerView recyclerView = this.f15479b;
            Field field = O.f1447a;
            i10 = U.i(i8, height, recyclerView.getMinimumHeight());
            int[] iArr = this.f6856G;
            i9 = U.i(i7, iArr[iArr.length - 1] + M6, this.f15479b.getMinimumWidth());
        } else {
            int width = rect.width() + M6;
            RecyclerView recyclerView2 = this.f15479b;
            Field field2 = O.f1447a;
            i9 = U.i(i7, width, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.f6856G;
            i10 = U.i(i8, iArr2[iArr2.length - 1] + K6, this.f15479b.getMinimumHeight());
        }
        this.f15479b.setMeasuredDimension(i9, i10);
    }

    @Override // w0.U
    public final int Q(a0 a0Var, g0 g0Var) {
        if (this.f6869p == 0) {
            return Math.min(this.F, I());
        }
        if (g0Var.b() < 1) {
            return 0;
        }
        return I1(g0Var.b() - 1, a0Var, g0Var) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, w0.U
    public final boolean W0() {
        return this.f6879z == null && !this.f6855E;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void Y0(g0 g0Var, C1346A c1346a, C0230i c0230i) {
        int i7;
        int i8 = this.F;
        for (int i9 = 0; i9 < this.F && (i7 = c1346a.d) >= 0 && i7 < g0Var.b() && i8 > 0; i9++) {
            c0230i.b(c1346a.d, Math.max(0, c1346a.f15436g));
            this.f6860K.getClass();
            i8--;
            c1346a.d += c1346a.f15435e;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c9, code lost:
        if (r13 == r7) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00f5, code lost:
        if (r13 == r7) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0110  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, w0.U
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View f0(android.view.View r23, int r24, w0.a0 r25, w0.g0 r26) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.f0(android.view.View, int, w0.a0, w0.g0):android.view.View");
    }

    @Override // w0.U
    public final boolean h(V v5) {
        return v5 instanceof C1369x;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, w0.U
    public final void h0(a0 a0Var, g0 g0Var, L.i iVar) {
        super.h0(a0Var, g0Var, iVar);
        iVar.i("android.widget.GridView");
        L l7 = this.f15479b.f6893C;
        if (l7 != null && l7.a() > 1) {
            iVar.b(d.f1849p);
        }
    }

    @Override // w0.U
    public final void j0(a0 a0Var, g0 g0Var, View view, L.i iVar) {
        h a7;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C1369x)) {
            i0(view, iVar);
            return;
        }
        C1369x c1369x = (C1369x) layoutParams;
        int I1 = I1(c1369x.f15490a.f(), a0Var, g0Var);
        if (this.f6869p == 0) {
            a7 = h.a(false, c1369x.f15692e, c1369x.f, I1, 1);
        } else {
            a7 = h.a(false, I1, 1, c1369x.f15692e, c1369x.f);
        }
        iVar.k(a7);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View k1(a0 a0Var, g0 g0Var, boolean z7, boolean z8) {
        int i7;
        int i8;
        int y3 = y();
        int i9 = 1;
        if (z8) {
            i8 = y() - 1;
            i7 = -1;
            i9 = -1;
        } else {
            i7 = y3;
            i8 = 0;
        }
        int b7 = g0Var.b();
        d1();
        int k5 = this.f6871r.k();
        int g7 = this.f6871r.g();
        View view = null;
        View view2 = null;
        while (i8 != i7) {
            View x7 = x(i8);
            int O5 = U.O(x7);
            if (O5 >= 0 && O5 < b7 && J1(O5, a0Var, g0Var) == 0) {
                if (((V) x7.getLayoutParams()).f15490a.m()) {
                    if (view2 == null) {
                        view2 = x7;
                    }
                } else if (this.f6871r.e(x7) < g7 && this.f6871r.b(x7) >= k5) {
                    return x7;
                } else {
                    if (view == null) {
                        view = x7;
                    }
                }
            }
            i8 += i9;
        }
        if (view == null) {
            return view2;
        }
        return view;
    }

    @Override // w0.U
    public final void l0(RecyclerView recyclerView, int i7, int i8) {
        i iVar = this.f6860K;
        iVar.t();
        ((SparseIntArray) iVar.f14557s).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, w0.U
    public final int m(g0 g0Var) {
        return a1(g0Var);
    }

    @Override // w0.U
    public final void m0(RecyclerView recyclerView) {
        i iVar = this.f6860K;
        iVar.t();
        ((SparseIntArray) iVar.f14557s).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, w0.U
    public final int n(g0 g0Var) {
        return b1(g0Var);
    }

    @Override // w0.U
    public final void n0(RecyclerView recyclerView, int i7, int i8) {
        i iVar = this.f6860K;
        iVar.t();
        ((SparseIntArray) iVar.f14557s).clear();
    }

    @Override // w0.U
    public final void o0(RecyclerView recyclerView, int i7, int i8) {
        i iVar = this.f6860K;
        iVar.t();
        ((SparseIntArray) iVar.f14557s).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, w0.U
    public final int p(g0 g0Var) {
        return a1(g0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, w0.U
    public final int q(g0 g0Var) {
        return b1(g0Var);
    }

    @Override // w0.U
    public final void q0(RecyclerView recyclerView, int i7, int i8) {
        i iVar = this.f6860K;
        iVar.t();
        ((SparseIntArray) iVar.f14557s).clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0099, code lost:
        r22.f15701b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009b, code lost:
        return;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q1(w0.a0 r19, w0.g0 r20, w0.C1346A r21, w0.C1371z r22) {
        /*
            Method dump skipped, instructions count: 613
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.q1(w0.a0, w0.g0, w0.A, w0.z):void");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, w0.U
    public final void r0(a0 a0Var, g0 g0Var) {
        boolean z7 = g0Var.f15543g;
        SparseIntArray sparseIntArray = this.f6859J;
        SparseIntArray sparseIntArray2 = this.f6858I;
        if (z7) {
            int y3 = y();
            for (int i7 = 0; i7 < y3; i7++) {
                C1369x c1369x = (C1369x) x(i7).getLayoutParams();
                int f = c1369x.f15490a.f();
                sparseIntArray2.put(f, c1369x.f);
                sparseIntArray.put(f, c1369x.f15692e);
            }
        }
        super.r0(a0Var, g0Var);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void r1(a0 a0Var, g0 g0Var, u uVar, int i7) {
        boolean z7;
        N1();
        if (g0Var.b() > 0 && !g0Var.f15543g) {
            if (i7 == 1) {
                z7 = true;
            } else {
                z7 = false;
            }
            int J12 = J1(uVar.f14915b, a0Var, g0Var);
            if (z7) {
                while (J12 > 0) {
                    int i8 = uVar.f14915b;
                    if (i8 <= 0) {
                        break;
                    }
                    int i9 = i8 - 1;
                    uVar.f14915b = i9;
                    J12 = J1(i9, a0Var, g0Var);
                }
            } else {
                int b7 = g0Var.b() - 1;
                int i10 = uVar.f14915b;
                while (i10 < b7) {
                    int i11 = i10 + 1;
                    int J13 = J1(i11, a0Var, g0Var);
                    if (J13 <= J12) {
                        break;
                    }
                    i10 = i11;
                    J12 = J13;
                }
                uVar.f14915b = i10;
            }
        }
        C1();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, w0.U
    public final void s0(g0 g0Var) {
        View t5;
        super.s0(g0Var);
        this.f6855E = false;
        int i7 = this.f6862M;
        if (i7 != -1 && (t5 = t(i7)) != null) {
            t5.sendAccessibilityEvent(67108864);
            this.f6862M = -1;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, w0.U
    public final V u() {
        if (this.f6869p == 0) {
            return new C1369x(-2, -1);
        }
        return new C1369x(-1, -2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [w0.x, w0.V] */
    @Override // w0.U
    public final V v(Context context, AttributeSet attributeSet) {
        ?? v5 = new V(context, attributeSet);
        v5.f15692e = -1;
        v5.f = 0;
        return v5;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [w0.x, w0.V] */
    /* JADX WARN: Type inference failed for: r0v2, types: [w0.x, w0.V] */
    @Override // w0.U
    public final V w(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ?? v5 = new V((ViewGroup.MarginLayoutParams) layoutParams);
            v5.f15692e = -1;
            v5.f = 0;
            return v5;
        }
        ?? v7 = new V(layoutParams);
        v7.f15692e = -1;
        v7.f = 0;
        return v7;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void x1(boolean z7) {
        if (z7) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.x1(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0274  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, w0.U
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean z0(int r12, android.os.Bundle r13) {
        /*
            Method dump skipped, instructions count: 730
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.z0(int, android.os.Bundle):boolean");
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, attributeSet, i7, i8);
        this.f6855E = false;
        this.F = -1;
        this.f6858I = new SparseIntArray();
        this.f6859J = new SparseIntArray();
        this.f6860K = new i(10, (byte) 0);
        this.f6861L = new Rect();
        this.f6862M = -1;
        this.f6863N = -1;
        this.f6864O = -1;
        M1(U.P(context, attributeSet, i7, i8).f15476b);
    }
}
