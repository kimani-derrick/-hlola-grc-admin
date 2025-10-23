package androidx.recyclerview.widget;

import L.d;
import L.i;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.datastore.preferences.protobuf.C0230i;
import androidx.emoji2.text.f;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.util.List;
import u2.u;
import w0.AbstractC1348b;
import w0.B;
import w0.C;
import w0.C1346A;
import w0.C1371z;
import w0.L;
import w0.T;
import w0.U;
import w0.V;
import w0.a0;
import w0.f0;
import w0.g0;
import w0.k0;
/* loaded from: classes.dex */
public class LinearLayoutManager extends U implements f0 {

    /* renamed from: A  reason: collision with root package name */
    public final u f6865A;

    /* renamed from: B  reason: collision with root package name */
    public final C1371z f6866B;

    /* renamed from: C  reason: collision with root package name */
    public final int f6867C;

    /* renamed from: D  reason: collision with root package name */
    public final int[] f6868D;

    /* renamed from: p  reason: collision with root package name */
    public int f6869p;

    /* renamed from: q  reason: collision with root package name */
    public C1346A f6870q;

    /* renamed from: r  reason: collision with root package name */
    public f f6871r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f6872s;

    /* renamed from: t  reason: collision with root package name */
    public final boolean f6873t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f6874u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f6875v;

    /* renamed from: w  reason: collision with root package name */
    public final boolean f6876w;

    /* renamed from: x  reason: collision with root package name */
    public int f6877x;

    /* renamed from: y  reason: collision with root package name */
    public int f6878y;

    /* renamed from: z  reason: collision with root package name */
    public B f6879z;

    /* JADX WARN: Type inference failed for: r2v1, types: [w0.z, java.lang.Object] */
    public LinearLayoutManager(int i7) {
        this.f6869p = 1;
        this.f6873t = false;
        this.f6874u = false;
        this.f6875v = false;
        this.f6876w = true;
        this.f6877x = -1;
        this.f6878y = Integer.MIN_VALUE;
        this.f6879z = null;
        this.f6865A = new u();
        this.f6866B = new Object();
        this.f6867C = 2;
        this.f6868D = new int[2];
        w1(i7);
        d(null);
        if (this.f6873t) {
            this.f6873t = false;
            H0();
        }
    }

    public final void A1(int i7, int i8) {
        this.f6870q.f15434c = i8 - this.f6871r.k();
        C1346A c1346a = this.f6870q;
        c1346a.d = i7;
        c1346a.f15435e = this.f6874u ? 1 : -1;
        c1346a.f = -1;
        c1346a.f15433b = i8;
        c1346a.f15436g = Integer.MIN_VALUE;
    }

    @Override // w0.U
    public int J0(int i7, a0 a0Var, g0 g0Var) {
        if (this.f6869p == 1) {
            return 0;
        }
        return v1(i7, a0Var, g0Var);
    }

    @Override // w0.U
    public final void K0(int i7) {
        this.f6877x = i7;
        this.f6878y = Integer.MIN_VALUE;
        B b7 = this.f6879z;
        if (b7 != null) {
            b7.f15442q = -1;
        }
        H0();
    }

    @Override // w0.U
    public int L0(int i7, a0 a0Var, g0 g0Var) {
        if (this.f6869p == 0) {
            return 0;
        }
        return v1(i7, a0Var, g0Var);
    }

    @Override // w0.U
    public final boolean S0() {
        if (this.f15488m == 1073741824 || this.f15487l == 1073741824) {
            return false;
        }
        int y3 = y();
        for (int i7 = 0; i7 < y3; i7++) {
            ViewGroup.LayoutParams layoutParams = x(i7).getLayoutParams();
            if (layoutParams.width < 0 && layoutParams.height < 0) {
                return true;
            }
        }
        return false;
    }

    @Override // w0.U
    public final boolean T() {
        return true;
    }

    @Override // w0.U
    public final boolean U() {
        return this.f6873t;
    }

    @Override // w0.U
    public void U0(RecyclerView recyclerView, g0 g0Var, int i7) {
        C c5 = new C(recyclerView.getContext());
        c5.f15445a = i7;
        V0(c5);
    }

    @Override // w0.U
    public boolean W0() {
        return this.f6879z == null && this.f6872s == this.f6875v;
    }

    public void X0(g0 g0Var, int[] iArr) {
        int i7;
        int i8;
        if (g0Var.f15539a != -1) {
            i7 = this.f6871r.l();
        } else {
            i7 = 0;
        }
        if (this.f6870q.f == -1) {
            i8 = 0;
        } else {
            i8 = i7;
            i7 = 0;
        }
        iArr[0] = i7;
        iArr[1] = i8;
    }

    public void Y0(g0 g0Var, C1346A c1346a, C0230i c0230i) {
        int i7 = c1346a.d;
        if (i7 >= 0 && i7 < g0Var.b()) {
            c0230i.b(i7, Math.max(0, c1346a.f15436g));
        }
    }

    public final int Z0(g0 g0Var) {
        if (y() == 0) {
            return 0;
        }
        d1();
        f fVar = this.f6871r;
        boolean z7 = !this.f6876w;
        return AbstractC1348b.c(g0Var, fVar, g1(z7), f1(z7), this, this.f6876w);
    }

    @Override // w0.f0
    public final PointF a(int i7) {
        if (y() == 0) {
            return null;
        }
        int i8 = (i7 < U.O(x(0))) != this.f6874u ? -1 : 1;
        return this.f6869p == 0 ? new PointF(i8, 0.0f) : new PointF(0.0f, i8);
    }

    public final int a1(g0 g0Var) {
        if (y() == 0) {
            return 0;
        }
        d1();
        f fVar = this.f6871r;
        boolean z7 = !this.f6876w;
        return AbstractC1348b.d(g0Var, fVar, g1(z7), f1(z7), this, this.f6876w, this.f6874u);
    }

    public final int b1(g0 g0Var) {
        if (y() == 0) {
            return 0;
        }
        d1();
        f fVar = this.f6871r;
        boolean z7 = !this.f6876w;
        return AbstractC1348b.e(g0Var, fVar, g1(z7), f1(z7), this, this.f6876w);
    }

    public final int c1(int i7) {
        return i7 != 1 ? i7 != 2 ? i7 != 17 ? i7 != 33 ? i7 != 66 ? (i7 == 130 && this.f6869p == 1) ? 1 : Integer.MIN_VALUE : this.f6869p == 0 ? 1 : Integer.MIN_VALUE : this.f6869p == 1 ? -1 : Integer.MIN_VALUE : this.f6869p == 0 ? -1 : Integer.MIN_VALUE : (this.f6869p != 1 && p1()) ? -1 : 1 : (this.f6869p != 1 && p1()) ? 1 : -1;
    }

    @Override // w0.U
    public final void d(String str) {
        if (this.f6879z == null) {
            super.d(str);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, w0.A] */
    public final void d1() {
        if (this.f6870q == null) {
            ?? obj = new Object();
            obj.f15432a = true;
            obj.f15437h = 0;
            obj.f15438i = 0;
            obj.f15440k = null;
            this.f6870q = obj;
        }
    }

    public final int e1(a0 a0Var, C1346A c1346a, g0 g0Var, boolean z7) {
        int i7;
        int i8 = c1346a.f15434c;
        int i9 = c1346a.f15436g;
        if (i9 != Integer.MIN_VALUE) {
            if (i8 < 0) {
                c1346a.f15436g = i9 + i8;
            }
            s1(a0Var, c1346a);
        }
        int i10 = c1346a.f15434c + c1346a.f15437h;
        while (true) {
            if ((!c1346a.f15441l && i10 <= 0) || (i7 = c1346a.d) < 0 || i7 >= g0Var.b()) {
                break;
            }
            C1371z c1371z = this.f6866B;
            c1371z.f15700a = 0;
            c1371z.f15701b = false;
            c1371z.f15702c = false;
            c1371z.d = false;
            q1(a0Var, g0Var, c1346a, c1371z);
            if (!c1371z.f15701b) {
                int i11 = c1346a.f15433b;
                int i12 = c1371z.f15700a;
                c1346a.f15433b = (c1346a.f * i12) + i11;
                if (!c1371z.f15702c || c1346a.f15440k != null || !g0Var.f15543g) {
                    c1346a.f15434c -= i12;
                    i10 -= i12;
                }
                int i13 = c1346a.f15436g;
                if (i13 != Integer.MIN_VALUE) {
                    int i14 = i13 + i12;
                    c1346a.f15436g = i14;
                    int i15 = c1346a.f15434c;
                    if (i15 < 0) {
                        c1346a.f15436g = i14 + i15;
                    }
                    s1(a0Var, c1346a);
                }
                if (z7 && c1371z.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i8 - c1346a.f15434c;
    }

    @Override // w0.U
    public final boolean f() {
        return this.f6869p == 0;
    }

    @Override // w0.U
    public View f0(View view, int i7, a0 a0Var, g0 g0Var) {
        int c12;
        View i12;
        View n12;
        u1();
        if (y() == 0 || (c12 = c1(i7)) == Integer.MIN_VALUE) {
            return null;
        }
        d1();
        y1(c12, (int) (this.f6871r.l() * 0.33333334f), false, g0Var);
        C1346A c1346a = this.f6870q;
        c1346a.f15436g = Integer.MIN_VALUE;
        c1346a.f15432a = false;
        e1(a0Var, c1346a, g0Var, true);
        if (c12 == -1) {
            if (this.f6874u) {
                i12 = i1(y() - 1, -1);
            } else {
                i12 = i1(0, y());
            }
        } else if (this.f6874u) {
            i12 = i1(0, y());
        } else {
            i12 = i1(y() - 1, -1);
        }
        if (c12 == -1) {
            n12 = o1();
        } else {
            n12 = n1();
        }
        if (n12.hasFocusable()) {
            if (i12 == null) {
                return null;
            }
            return n12;
        }
        return i12;
    }

    public final View f1(boolean z7) {
        int y3;
        int i7;
        if (this.f6874u) {
            y3 = 0;
            i7 = y();
        } else {
            y3 = y() - 1;
            i7 = -1;
        }
        return j1(y3, i7, z7);
    }

    @Override // w0.U
    public final boolean g() {
        return this.f6869p == 1;
    }

    @Override // w0.U
    public final void g0(AccessibilityEvent accessibilityEvent) {
        int O5;
        super.g0(accessibilityEvent);
        if (y() > 0) {
            View j12 = j1(0, y(), false);
            if (j12 == null) {
                O5 = -1;
            } else {
                O5 = U.O(j12);
            }
            accessibilityEvent.setFromIndex(O5);
            accessibilityEvent.setToIndex(h1());
        }
    }

    public final View g1(boolean z7) {
        int i7;
        int y3;
        if (this.f6874u) {
            i7 = y() - 1;
            y3 = -1;
        } else {
            i7 = 0;
            y3 = y();
        }
        return j1(i7, y3, z7);
    }

    @Override // w0.U
    public void h0(a0 a0Var, g0 g0Var, i iVar) {
        super.h0(a0Var, g0Var, iVar);
        L l7 = this.f15479b.f6893C;
        if (l7 != null && l7.a() > 0) {
            iVar.b(d.f1845k);
        }
    }

    public final int h1() {
        View j12 = j1(y() - 1, -1, false);
        if (j12 == null) {
            return -1;
        }
        return U.O(j12);
    }

    public final View i1(int i7, int i8) {
        int i9;
        int i10;
        d1();
        if (i8 <= i7 && i8 >= i7) {
            return x(i7);
        }
        if (this.f6871r.e(x(i7)) < this.f6871r.k()) {
            i9 = 16644;
            i10 = 16388;
        } else {
            i9 = 4161;
            i10 = 4097;
        }
        return (this.f6869p == 0 ? this.f15480c : this.d).q(i7, i8, i9, i10);
    }

    @Override // w0.U
    public final void j(int i7, int i8, g0 g0Var, C0230i c0230i) {
        int i9;
        if (this.f6869p != 0) {
            i7 = i8;
        }
        if (y() != 0 && i7 != 0) {
            d1();
            if (i7 > 0) {
                i9 = 1;
            } else {
                i9 = -1;
            }
            y1(i9, Math.abs(i7), true, g0Var);
            Y0(g0Var, this.f6870q, c0230i);
        }
    }

    public final View j1(int i7, int i8, boolean z7) {
        int i9;
        t2.i iVar;
        d1();
        if (z7) {
            i9 = 24579;
        } else {
            i9 = 320;
        }
        if (this.f6869p == 0) {
            iVar = this.f15480c;
        } else {
            iVar = this.d;
        }
        return iVar.q(i7, i8, i9, 320);
    }

    @Override // w0.U
    public final void k(int i7, C0230i c0230i) {
        boolean z7;
        int i8;
        B b7 = this.f6879z;
        int i9 = -1;
        if (b7 != null && (i8 = b7.f15442q) >= 0) {
            z7 = b7.f15444s;
        } else {
            u1();
            z7 = this.f6874u;
            i8 = this.f6877x;
            if (i8 == -1) {
                i8 = z7 ? i7 - 1 : 0;
            }
        }
        if (!z7) {
            i9 = 1;
        }
        for (int i10 = 0; i10 < this.f6867C && i8 >= 0 && i8 < i7; i10++) {
            c0230i.b(i8, 0);
            i8 += i9;
        }
    }

    public View k1(a0 a0Var, g0 g0Var, boolean z7, boolean z8) {
        int i7;
        int i8;
        int i9;
        boolean z9;
        boolean z10;
        d1();
        int y3 = y();
        if (z8) {
            i8 = y() - 1;
            i7 = -1;
            i9 = -1;
        } else {
            i7 = y3;
            i8 = 0;
            i9 = 1;
        }
        int b7 = g0Var.b();
        int k5 = this.f6871r.k();
        int g7 = this.f6871r.g();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i8 != i7) {
            View x7 = x(i8);
            int O5 = U.O(x7);
            int e3 = this.f6871r.e(x7);
            int b8 = this.f6871r.b(x7);
            if (O5 >= 0 && O5 < b7) {
                if (((V) x7.getLayoutParams()).f15490a.m()) {
                    if (view3 == null) {
                        view3 = x7;
                    }
                } else {
                    if (b8 <= k5 && e3 < k5) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (e3 >= g7 && b8 > g7) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z9 && !z10) {
                        return x7;
                    }
                    if (z7) {
                        if (!z10) {
                            if (view != null) {
                            }
                            view = x7;
                        }
                        view2 = x7;
                    } else {
                        if (!z9) {
                            if (view != null) {
                            }
                            view = x7;
                        }
                        view2 = x7;
                    }
                }
            }
            i8 += i9;
        }
        if (view == null) {
            if (view2 != null) {
                return view2;
            }
            return view3;
        }
        return view;
    }

    @Override // w0.U
    public final int l(g0 g0Var) {
        return Z0(g0Var);
    }

    public final int l1(int i7, a0 a0Var, g0 g0Var, boolean z7) {
        int g7;
        int g8 = this.f6871r.g() - i7;
        if (g8 > 0) {
            int i8 = -v1(-g8, a0Var, g0Var);
            int i9 = i7 + i8;
            if (z7 && (g7 = this.f6871r.g() - i9) > 0) {
                this.f6871r.p(g7);
                return g7 + i8;
            }
            return i8;
        }
        return 0;
    }

    @Override // w0.U
    public int m(g0 g0Var) {
        return a1(g0Var);
    }

    public final int m1(int i7, a0 a0Var, g0 g0Var, boolean z7) {
        int k5;
        int k7 = i7 - this.f6871r.k();
        if (k7 > 0) {
            int i8 = -v1(k7, a0Var, g0Var);
            int i9 = i7 + i8;
            if (z7 && (k5 = i9 - this.f6871r.k()) > 0) {
                this.f6871r.p(-k5);
                return i8 - k5;
            }
            return i8;
        }
        return 0;
    }

    @Override // w0.U
    public int n(g0 g0Var) {
        return b1(g0Var);
    }

    public final View n1() {
        return x(this.f6874u ? 0 : y() - 1);
    }

    @Override // w0.U
    public final int o(g0 g0Var) {
        return Z0(g0Var);
    }

    public final View o1() {
        return x(this.f6874u ? y() - 1 : 0);
    }

    @Override // w0.U
    public int p(g0 g0Var) {
        return a1(g0Var);
    }

    public final boolean p1() {
        return J() == 1;
    }

    @Override // w0.U
    public int q(g0 g0Var) {
        return b1(g0Var);
    }

    public void q1(a0 a0Var, g0 g0Var, C1346A c1346a, C1371z c1371z) {
        boolean z7;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z8;
        View b7 = c1346a.b(a0Var);
        if (b7 == null) {
            c1371z.f15701b = true;
            return;
        }
        V v5 = (V) b7.getLayoutParams();
        if (c1346a.f15440k == null) {
            boolean z9 = this.f6874u;
            if (c1346a.f == -1) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (z9 == z8) {
                b(b7);
            } else {
                c(b7, 0, false);
            }
        } else {
            boolean z10 = this.f6874u;
            if (c1346a.f == -1) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (z10 == z7) {
                c(b7, -1, true);
            } else {
                c(b7, 0, true);
            }
        }
        Y(b7);
        c1371z.f15700a = this.f6871r.c(b7);
        if (this.f6869p == 1) {
            if (p1()) {
                i10 = this.n - M();
                i7 = i10 - this.f6871r.d(b7);
            } else {
                i7 = L();
                i10 = this.f6871r.d(b7) + i7;
            }
            if (c1346a.f == -1) {
                i8 = c1346a.f15433b;
                i9 = i8 - c1371z.f15700a;
            } else {
                i9 = c1346a.f15433b;
                i8 = c1371z.f15700a + i9;
            }
        } else {
            int N6 = N();
            int d = this.f6871r.d(b7) + N6;
            int i11 = c1346a.f;
            int i12 = c1346a.f15433b;
            if (i11 == -1) {
                int i13 = i12 - c1371z.f15700a;
                i10 = i12;
                i8 = d;
                i7 = i13;
                i9 = N6;
            } else {
                int i14 = c1371z.f15700a + i12;
                i7 = i12;
                i8 = d;
                i9 = N6;
                i10 = i14;
            }
        }
        U.X(b7, i7, i9, i10, i8);
        if (v5.f15490a.m() || v5.f15490a.p()) {
            c1371z.f15702c = true;
        }
        c1371z.d = b7.hasFocusable();
    }

    @Override // w0.U
    public void r0(a0 a0Var, g0 g0Var) {
        View focusedChild;
        int i7;
        View focusedChild2;
        View k12;
        boolean z7;
        boolean z8;
        int i8;
        int k5;
        int i9;
        int g7;
        int i10;
        boolean z9;
        boolean z10;
        int e3;
        int i11;
        int i12;
        boolean z11;
        int i13;
        int i14;
        List list;
        boolean z12;
        int i15;
        int i16;
        int l1;
        int i17;
        View t5;
        int e7;
        int i18;
        int i19;
        int i20 = -1;
        if ((this.f6879z != null || this.f6877x != -1) && g0Var.b() == 0) {
            B0(a0Var);
            return;
        }
        B b7 = this.f6879z;
        if (b7 != null && (i19 = b7.f15442q) >= 0) {
            this.f6877x = i19;
        }
        d1();
        this.f6870q.f15432a = false;
        u1();
        RecyclerView recyclerView = this.f15479b;
        if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f15478a.o(focusedChild)) {
            focusedChild = null;
        }
        u uVar = this.f6865A;
        if (uVar.f14917e && this.f6877x == -1 && this.f6879z == null) {
            if (focusedChild != null && (this.f6871r.e(focusedChild) >= this.f6871r.g() || this.f6871r.b(focusedChild) <= this.f6871r.k())) {
                uVar.d(focusedChild, U.O(focusedChild));
            }
        } else {
            uVar.f();
            uVar.d = this.f6874u ^ this.f6875v;
            if (!g0Var.f15543g && (i8 = this.f6877x) != -1) {
                if (i8 >= 0 && i8 < g0Var.b()) {
                    int i21 = this.f6877x;
                    uVar.f14915b = i21;
                    B b8 = this.f6879z;
                    if (b8 != null && b8.f15442q >= 0) {
                        boolean z13 = b8.f15444s;
                        uVar.d = z13;
                        if (z13) {
                            g7 = this.f6871r.g();
                            i10 = this.f6879z.f15443r;
                            i11 = g7 - i10;
                        } else {
                            k5 = this.f6871r.k();
                            i9 = this.f6879z.f15443r;
                            i11 = k5 + i9;
                        }
                    } else if (this.f6878y == Integer.MIN_VALUE) {
                        View t7 = t(i21);
                        if (t7 != null) {
                            if (this.f6871r.c(t7) <= this.f6871r.l()) {
                                if (this.f6871r.e(t7) - this.f6871r.k() < 0) {
                                    uVar.f14916c = this.f6871r.k();
                                    uVar.d = false;
                                } else if (this.f6871r.g() - this.f6871r.b(t7) < 0) {
                                    uVar.f14916c = this.f6871r.g();
                                    uVar.d = true;
                                } else {
                                    if (uVar.d) {
                                        e3 = this.f6871r.m() + this.f6871r.b(t7);
                                    } else {
                                        e3 = this.f6871r.e(t7);
                                    }
                                    uVar.f14916c = e3;
                                }
                                uVar.f14917e = true;
                            }
                        } else if (y() > 0) {
                            if (this.f6877x < U.O(x(0))) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            if (z9 == this.f6874u) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            uVar.d = z10;
                        }
                        uVar.b();
                        uVar.f14917e = true;
                    } else {
                        boolean z14 = this.f6874u;
                        uVar.d = z14;
                        if (z14) {
                            g7 = this.f6871r.g();
                            i10 = this.f6878y;
                            i11 = g7 - i10;
                        } else {
                            k5 = this.f6871r.k();
                            i9 = this.f6878y;
                            i11 = k5 + i9;
                        }
                    }
                    uVar.f14916c = i11;
                    uVar.f14917e = true;
                } else {
                    this.f6877x = -1;
                    this.f6878y = Integer.MIN_VALUE;
                }
            }
            if (y() != 0) {
                RecyclerView recyclerView2 = this.f15479b;
                if (recyclerView2 == null || (focusedChild2 = recyclerView2.getFocusedChild()) == null || this.f15478a.o(focusedChild2)) {
                    focusedChild2 = null;
                }
                if (focusedChild2 != null) {
                    V v5 = (V) focusedChild2.getLayoutParams();
                    if (!v5.f15490a.m() && v5.f15490a.f() >= 0 && v5.f15490a.f() < g0Var.b()) {
                        uVar.d(focusedChild2, U.O(focusedChild2));
                        uVar.f14917e = true;
                    }
                }
                boolean z15 = this.f6872s;
                boolean z16 = this.f6875v;
                if (z15 == z16 && (k12 = k1(a0Var, g0Var, uVar.d, z16)) != null) {
                    uVar.c(k12, U.O(k12));
                    if (!g0Var.f15543g && W0()) {
                        int e8 = this.f6871r.e(k12);
                        int b9 = this.f6871r.b(k12);
                        int k7 = this.f6871r.k();
                        int g8 = this.f6871r.g();
                        if (b9 <= k7 && e8 < k7) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        if (e8 >= g8 && b9 > g8) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        if (z7 || z8) {
                            if (uVar.d) {
                                k7 = g8;
                            }
                            uVar.f14916c = k7;
                        }
                    }
                    uVar.f14917e = true;
                }
            }
            uVar.b();
            if (this.f6875v) {
                i7 = g0Var.b() - 1;
            } else {
                i7 = 0;
            }
            uVar.f14915b = i7;
            uVar.f14917e = true;
        }
        C1346A c1346a = this.f6870q;
        if (c1346a.f15439j >= 0) {
            i12 = 1;
        } else {
            i12 = -1;
        }
        c1346a.f = i12;
        int[] iArr = this.f6868D;
        iArr[0] = 0;
        iArr[1] = 0;
        X0(g0Var, iArr);
        int k8 = this.f6871r.k() + Math.max(0, iArr[0]);
        int h7 = this.f6871r.h() + Math.max(0, iArr[1]);
        if (g0Var.f15543g && (i17 = this.f6877x) != -1 && this.f6878y != Integer.MIN_VALUE && (t5 = t(i17)) != null) {
            if (this.f6874u) {
                i18 = this.f6871r.g() - this.f6871r.b(t5);
                e7 = this.f6878y;
            } else {
                e7 = this.f6871r.e(t5) - this.f6871r.k();
                i18 = this.f6878y;
            }
            int i22 = i18 - e7;
            if (i22 > 0) {
                k8 += i22;
            } else {
                h7 -= i22;
            }
        }
        if (!uVar.d ? !this.f6874u : this.f6874u) {
            i20 = 1;
        }
        r1(a0Var, g0Var, uVar, i20);
        r(a0Var);
        C1346A c1346a2 = this.f6870q;
        if (this.f6871r.i() == 0 && this.f6871r.f() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        c1346a2.f15441l = z11;
        this.f6870q.getClass();
        this.f6870q.f15438i = 0;
        if (uVar.d) {
            A1(uVar.f14915b, uVar.f14916c);
            C1346A c1346a3 = this.f6870q;
            c1346a3.f15437h = k8;
            e1(a0Var, c1346a3, g0Var, false);
            C1346A c1346a4 = this.f6870q;
            i14 = c1346a4.f15433b;
            int i23 = c1346a4.d;
            int i24 = c1346a4.f15434c;
            if (i24 > 0) {
                h7 += i24;
            }
            z1(uVar.f14915b, uVar.f14916c);
            C1346A c1346a5 = this.f6870q;
            c1346a5.f15437h = h7;
            c1346a5.d += c1346a5.f15435e;
            e1(a0Var, c1346a5, g0Var, false);
            C1346A c1346a6 = this.f6870q;
            i13 = c1346a6.f15433b;
            int i25 = c1346a6.f15434c;
            if (i25 > 0) {
                A1(i23, i14);
                C1346A c1346a7 = this.f6870q;
                c1346a7.f15437h = i25;
                e1(a0Var, c1346a7, g0Var, false);
                i14 = this.f6870q.f15433b;
            }
        } else {
            z1(uVar.f14915b, uVar.f14916c);
            C1346A c1346a8 = this.f6870q;
            c1346a8.f15437h = h7;
            e1(a0Var, c1346a8, g0Var, false);
            C1346A c1346a9 = this.f6870q;
            i13 = c1346a9.f15433b;
            int i26 = c1346a9.d;
            int i27 = c1346a9.f15434c;
            if (i27 > 0) {
                k8 += i27;
            }
            A1(uVar.f14915b, uVar.f14916c);
            C1346A c1346a10 = this.f6870q;
            c1346a10.f15437h = k8;
            c1346a10.d += c1346a10.f15435e;
            e1(a0Var, c1346a10, g0Var, false);
            C1346A c1346a11 = this.f6870q;
            int i28 = c1346a11.f15433b;
            int i29 = c1346a11.f15434c;
            if (i29 > 0) {
                z1(i26, i13);
                C1346A c1346a12 = this.f6870q;
                c1346a12.f15437h = i29;
                e1(a0Var, c1346a12, g0Var, false);
                i13 = this.f6870q.f15433b;
            }
            i14 = i28;
        }
        if (y() > 0) {
            if (this.f6874u ^ this.f6875v) {
                int l12 = l1(i13, a0Var, g0Var, true);
                i15 = i14 + l12;
                i16 = i13 + l12;
                l1 = m1(i15, a0Var, g0Var, false);
            } else {
                int m12 = m1(i14, a0Var, g0Var, true);
                i15 = i14 + m12;
                i16 = i13 + m12;
                l1 = l1(i16, a0Var, g0Var, false);
            }
            i14 = i15 + l1;
            i13 = i16 + l1;
        }
        if (g0Var.f15547k && y() != 0 && !g0Var.f15543g && W0()) {
            List list2 = a0Var.d;
            int size = list2.size();
            int O5 = U.O(x(0));
            int i30 = 0;
            int i31 = 0;
            for (int i32 = 0; i32 < size; i32++) {
                k0 k0Var = (k0) list2.get(i32);
                if (!k0Var.m()) {
                    if (k0Var.f() < O5) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    boolean z17 = this.f6874u;
                    View view = k0Var.f15576a;
                    if (z12 != z17) {
                        i30 += this.f6871r.c(view);
                    } else {
                        i31 += this.f6871r.c(view);
                    }
                }
            }
            this.f6870q.f15440k = list2;
            if (i30 > 0) {
                A1(U.O(o1()), i14);
                C1346A c1346a13 = this.f6870q;
                c1346a13.f15437h = i30;
                c1346a13.f15434c = 0;
                c1346a13.a(null);
                e1(a0Var, this.f6870q, g0Var, false);
            }
            if (i31 > 0) {
                z1(U.O(n1()), i13);
                C1346A c1346a14 = this.f6870q;
                c1346a14.f15437h = i31;
                c1346a14.f15434c = 0;
                list = null;
                c1346a14.a(null);
                e1(a0Var, this.f6870q, g0Var, false);
            } else {
                list = null;
            }
            this.f6870q.f15440k = list;
        }
        if (!g0Var.f15543g) {
            f fVar = this.f6871r;
            fVar.f5837a = fVar.l();
        } else {
            uVar.f();
        }
        this.f6872s = this.f6875v;
    }

    @Override // w0.U
    public void s0(g0 g0Var) {
        this.f6879z = null;
        this.f6877x = -1;
        this.f6878y = Integer.MIN_VALUE;
        this.f6865A.f();
    }

    public final void s1(a0 a0Var, C1346A c1346a) {
        if (c1346a.f15432a && !c1346a.f15441l) {
            int i7 = c1346a.f15436g;
            int i8 = c1346a.f15438i;
            if (c1346a.f == -1) {
                int y3 = y();
                if (i7 >= 0) {
                    int f = (this.f6871r.f() - i7) + i8;
                    if (this.f6874u) {
                        for (int i9 = 0; i9 < y3; i9++) {
                            View x7 = x(i9);
                            if (this.f6871r.e(x7) < f || this.f6871r.o(x7) < f) {
                                t1(a0Var, 0, i9);
                                return;
                            }
                        }
                        return;
                    }
                    int i10 = y3 - 1;
                    for (int i11 = i10; i11 >= 0; i11--) {
                        View x8 = x(i11);
                        if (this.f6871r.e(x8) < f || this.f6871r.o(x8) < f) {
                            t1(a0Var, i10, i11);
                            return;
                        }
                    }
                }
            } else if (i7 >= 0) {
                int i12 = i7 - i8;
                int y4 = y();
                if (this.f6874u) {
                    int i13 = y4 - 1;
                    for (int i14 = i13; i14 >= 0; i14--) {
                        View x9 = x(i14);
                        if (this.f6871r.b(x9) > i12 || this.f6871r.n(x9) > i12) {
                            t1(a0Var, i13, i14);
                            return;
                        }
                    }
                    return;
                }
                for (int i15 = 0; i15 < y4; i15++) {
                    View x10 = x(i15);
                    if (this.f6871r.b(x10) > i12 || this.f6871r.n(x10) > i12) {
                        t1(a0Var, 0, i15);
                        return;
                    }
                }
            }
        }
    }

    @Override // w0.U
    public final View t(int i7) {
        int y3 = y();
        if (y3 == 0) {
            return null;
        }
        int O5 = i7 - U.O(x(0));
        if (O5 >= 0 && O5 < y3) {
            View x7 = x(O5);
            if (U.O(x7) == i7) {
                return x7;
            }
        }
        return super.t(i7);
    }

    public final void t1(a0 a0Var, int i7, int i8) {
        if (i7 == i8) {
            return;
        }
        if (i8 > i7) {
            for (int i9 = i8 - 1; i9 >= i7; i9--) {
                E0(i9, a0Var);
            }
            return;
        }
        while (i7 > i8) {
            E0(i7, a0Var);
            i7--;
        }
    }

    @Override // w0.U
    public V u() {
        return new V(-2, -2);
    }

    public final void u1() {
        this.f6874u = (this.f6869p == 1 || !p1()) ? this.f6873t : !this.f6873t;
    }

    public final int v1(int i7, a0 a0Var, g0 g0Var) {
        int i8;
        if (y() == 0 || i7 == 0) {
            return 0;
        }
        d1();
        this.f6870q.f15432a = true;
        if (i7 > 0) {
            i8 = 1;
        } else {
            i8 = -1;
        }
        int abs = Math.abs(i7);
        y1(i8, abs, true, g0Var);
        C1346A c1346a = this.f6870q;
        int e12 = e1(a0Var, c1346a, g0Var, false) + c1346a.f15436g;
        if (e12 < 0) {
            return 0;
        }
        if (abs > e12) {
            i7 = i8 * e12;
        }
        this.f6871r.p(-i7);
        this.f6870q.f15439j = i7;
        return i7;
    }

    @Override // w0.U
    public final void w0(Parcelable parcelable) {
        if (parcelable instanceof B) {
            B b7 = (B) parcelable;
            this.f6879z = b7;
            if (this.f6877x != -1) {
                b7.f15442q = -1;
            }
            H0();
        }
    }

    public final void w1(int i7) {
        if (i7 != 0 && i7 != 1) {
            throw new IllegalArgumentException(AbstractC0515y1.l("invalid orientation:", i7));
        }
        d(null);
        if (i7 != this.f6869p || this.f6871r == null) {
            f a7 = f.a(this, i7);
            this.f6871r = a7;
            this.f6865A.f = a7;
            this.f6869p = i7;
            H0();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.os.Parcelable, java.lang.Object, w0.B] */
    /* JADX WARN: Type inference failed for: r1v9, types: [android.os.Parcelable, java.lang.Object, w0.B] */
    @Override // w0.U
    public final Parcelable x0() {
        B b7 = this.f6879z;
        if (b7 != null) {
            ?? obj = new Object();
            obj.f15442q = b7.f15442q;
            obj.f15443r = b7.f15443r;
            obj.f15444s = b7.f15444s;
            return obj;
        }
        ?? obj2 = new Object();
        if (y() > 0) {
            d1();
            boolean z7 = this.f6872s ^ this.f6874u;
            obj2.f15444s = z7;
            if (z7) {
                View n12 = n1();
                obj2.f15443r = this.f6871r.g() - this.f6871r.b(n12);
                obj2.f15442q = U.O(n12);
            } else {
                View o12 = o1();
                obj2.f15442q = U.O(o12);
                obj2.f15443r = this.f6871r.e(o12) - this.f6871r.k();
            }
        } else {
            obj2.f15442q = -1;
        }
        return obj2;
    }

    public void x1(boolean z7) {
        d(null);
        if (this.f6875v == z7) {
            return;
        }
        this.f6875v = z7;
        H0();
    }

    public final void y1(int i7, int i8, boolean z7, g0 g0Var) {
        boolean z8;
        int i9;
        int k5;
        C1346A c1346a = this.f6870q;
        boolean z9 = false;
        int i10 = 1;
        if (this.f6871r.i() == 0 && this.f6871r.f() == 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        c1346a.f15441l = z8;
        this.f6870q.f = i7;
        int[] iArr = this.f6868D;
        iArr[0] = 0;
        iArr[1] = 0;
        X0(g0Var, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        if (i7 == 1) {
            z9 = true;
        }
        C1346A c1346a2 = this.f6870q;
        if (z9) {
            i9 = max2;
        } else {
            i9 = max;
        }
        c1346a2.f15437h = i9;
        if (!z9) {
            max = max2;
        }
        c1346a2.f15438i = max;
        if (z9) {
            c1346a2.f15437h = this.f6871r.h() + i9;
            View n12 = n1();
            C1346A c1346a3 = this.f6870q;
            if (this.f6874u) {
                i10 = -1;
            }
            c1346a3.f15435e = i10;
            int O5 = U.O(n12);
            C1346A c1346a4 = this.f6870q;
            c1346a3.d = O5 + c1346a4.f15435e;
            c1346a4.f15433b = this.f6871r.b(n12);
            k5 = this.f6871r.b(n12) - this.f6871r.g();
        } else {
            View o12 = o1();
            C1346A c1346a5 = this.f6870q;
            c1346a5.f15437h = this.f6871r.k() + c1346a5.f15437h;
            C1346A c1346a6 = this.f6870q;
            if (!this.f6874u) {
                i10 = -1;
            }
            c1346a6.f15435e = i10;
            int O6 = U.O(o12);
            C1346A c1346a7 = this.f6870q;
            c1346a6.d = O6 + c1346a7.f15435e;
            c1346a7.f15433b = this.f6871r.e(o12);
            k5 = (-this.f6871r.e(o12)) + this.f6871r.k();
        }
        C1346A c1346a8 = this.f6870q;
        c1346a8.f15434c = i8;
        if (z7) {
            c1346a8.f15434c = i8 - k5;
        }
        c1346a8.f15436g = k5;
    }

    @Override // w0.U
    public boolean z0(int i7, Bundle bundle) {
        int i8;
        int A6;
        if (super.z0(i7, bundle)) {
            return true;
        }
        if (i7 == 16908343 && bundle != null) {
            if (this.f6869p == 1) {
                i8 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
                if (i8 < 0) {
                    return false;
                }
                RecyclerView recyclerView = this.f15479b;
                A6 = Q(recyclerView.f6948s, recyclerView.f6959x0);
            } else {
                i8 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
                if (i8 < 0) {
                    return false;
                }
                RecyclerView recyclerView2 = this.f15479b;
                A6 = A(recyclerView2.f6948s, recyclerView2.f6959x0);
            }
            int min = Math.min(i8, A6 - 1);
            if (min >= 0) {
                this.f6877x = min;
                this.f6878y = 0;
                B b7 = this.f6879z;
                if (b7 != null) {
                    b7.f15442q = -1;
                }
                H0();
                return true;
            }
        }
        return false;
    }

    public final void z1(int i7, int i8) {
        this.f6870q.f15434c = this.f6871r.g() - i8;
        C1346A c1346a = this.f6870q;
        c1346a.f15435e = this.f6874u ? -1 : 1;
        c1346a.d = i7;
        c1346a.f = 1;
        c1346a.f15433b = i8;
        c1346a.f15436g = Integer.MIN_VALUE;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [w0.z, java.lang.Object] */
    @SuppressLint({"UnknownNullness"})
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i7, int i8) {
        this.f6869p = 1;
        this.f6873t = false;
        this.f6874u = false;
        this.f6875v = false;
        this.f6876w = true;
        this.f6877x = -1;
        this.f6878y = Integer.MIN_VALUE;
        this.f6879z = null;
        this.f6865A = new u();
        this.f6866B = new Object();
        this.f6867C = 2;
        this.f6868D = new int[2];
        T P6 = U.P(context, attributeSet, i7, i8);
        w1(P6.f15475a);
        boolean z7 = P6.f15477c;
        d(null);
        if (z7 != this.f6873t) {
            this.f6873t = z7;
            H0();
        }
        x1(P6.d);
    }

    @Override // w0.U
    public final void e0(RecyclerView recyclerView, a0 a0Var) {
    }

    public void r1(a0 a0Var, g0 g0Var, u uVar, int i7) {
    }
}
