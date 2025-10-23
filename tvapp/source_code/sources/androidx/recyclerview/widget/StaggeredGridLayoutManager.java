package androidx.recyclerview.widget;

import K.O;
import L.h;
import P.b;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.datastore.preferences.protobuf.C0230i;
import androidx.emoji2.text.f;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import t2.i;
import w0.AbstractC1348b;
import w0.C;
import w0.C1370y;
import w0.L;
import w0.T;
import w0.U;
import w0.V;
import w0.a0;
import w0.f0;
import w0.g0;
import w0.o0;
import w0.p0;
import w0.r0;
/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends U implements f0 {

    /* renamed from: B  reason: collision with root package name */
    public final i f6964B;

    /* renamed from: C  reason: collision with root package name */
    public final int f6965C;

    /* renamed from: D  reason: collision with root package name */
    public boolean f6966D;

    /* renamed from: E  reason: collision with root package name */
    public boolean f6967E;
    public r0 F;

    /* renamed from: G  reason: collision with root package name */
    public final Rect f6968G;

    /* renamed from: H  reason: collision with root package name */
    public final o0 f6969H;

    /* renamed from: I  reason: collision with root package name */
    public final boolean f6970I;

    /* renamed from: J  reason: collision with root package name */
    public int[] f6971J;

    /* renamed from: K  reason: collision with root package name */
    public final b f6972K;

    /* renamed from: p  reason: collision with root package name */
    public final int f6973p;

    /* renamed from: q  reason: collision with root package name */
    public final o.i[] f6974q;

    /* renamed from: r  reason: collision with root package name */
    public final f f6975r;

    /* renamed from: s  reason: collision with root package name */
    public final f f6976s;

    /* renamed from: t  reason: collision with root package name */
    public final int f6977t;

    /* renamed from: u  reason: collision with root package name */
    public int f6978u;

    /* renamed from: v  reason: collision with root package name */
    public final C1370y f6979v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f6980w;

    /* renamed from: y  reason: collision with root package name */
    public final BitSet f6982y;

    /* renamed from: x  reason: collision with root package name */
    public boolean f6981x = false;

    /* renamed from: z  reason: collision with root package name */
    public int f6983z = -1;

    /* renamed from: A  reason: collision with root package name */
    public int f6963A = Integer.MIN_VALUE;

    /* JADX WARN: Type inference failed for: r6v3, types: [w0.y, java.lang.Object] */
    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i7, int i8) {
        this.f6973p = -1;
        this.f6980w = false;
        i iVar = new i((char) 0, 11);
        this.f6964B = iVar;
        this.f6965C = 2;
        this.f6968G = new Rect();
        this.f6969H = new o0(this);
        this.f6970I = true;
        this.f6972K = new b(22, this);
        T P6 = U.P(context, attributeSet, i7, i8);
        int i9 = P6.f15475a;
        if (i9 != 0 && i9 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        d(null);
        if (i9 != this.f6977t) {
            this.f6977t = i9;
            f fVar = this.f6975r;
            this.f6975r = this.f6976s;
            this.f6976s = fVar;
            H0();
        }
        int i10 = P6.f15476b;
        d(null);
        if (i10 != this.f6973p) {
            iVar.m();
            H0();
            this.f6973p = i10;
            this.f6982y = new BitSet(this.f6973p);
            this.f6974q = new o.i[this.f6973p];
            for (int i11 = 0; i11 < this.f6973p; i11++) {
                this.f6974q[i11] = new o.i(this, i11);
            }
            H0();
        }
        boolean z7 = P6.f15477c;
        d(null);
        r0 r0Var = this.F;
        if (r0Var != null && r0Var.f15647x != z7) {
            r0Var.f15647x = z7;
        }
        this.f6980w = z7;
        H0();
        ?? obj = new Object();
        obj.f15693a = true;
        obj.f = 0;
        obj.f15697g = 0;
        this.f6979v = obj;
        this.f6975r = f.a(this, this.f6977t);
        this.f6976s = f.a(this, 1 - this.f6977t);
    }

    public static int A1(int i7, int i8, int i9) {
        if (i8 == 0 && i9 == 0) {
            return i7;
        }
        int mode = View.MeasureSpec.getMode(i7);
        if (mode != Integer.MIN_VALUE && mode != 1073741824) {
            return i7;
        }
        return View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i7) - i8) - i9), mode);
    }

    @Override // w0.U
    public final int A(a0 a0Var, g0 g0Var) {
        if (this.f6977t == 1) {
            return Math.min(this.f6973p, g0Var.b());
        }
        return -1;
    }

    @Override // w0.U
    public final int J0(int i7, a0 a0Var, g0 g0Var) {
        return w1(i7, a0Var, g0Var);
    }

    @Override // w0.U
    public final void K0(int i7) {
        r0 r0Var = this.F;
        if (r0Var != null && r0Var.f15640q != i7) {
            r0Var.f15643t = null;
            r0Var.f15642s = 0;
            r0Var.f15640q = -1;
            r0Var.f15641r = -1;
        }
        this.f6983z = i7;
        this.f6963A = Integer.MIN_VALUE;
        H0();
    }

    @Override // w0.U
    public final int L0(int i7, a0 a0Var, g0 g0Var) {
        return w1(i7, a0Var, g0Var);
    }

    @Override // w0.U
    public final void O0(Rect rect, int i7, int i8) {
        int i9;
        int i10;
        int i11 = this.f6973p;
        int M6 = M() + L();
        int K6 = K() + N();
        if (this.f6977t == 1) {
            int height = rect.height() + K6;
            RecyclerView recyclerView = this.f15479b;
            Field field = O.f1447a;
            i10 = U.i(i8, height, recyclerView.getMinimumHeight());
            i9 = U.i(i7, (this.f6978u * i11) + M6, this.f15479b.getMinimumWidth());
        } else {
            int width = rect.width() + M6;
            RecyclerView recyclerView2 = this.f15479b;
            Field field2 = O.f1447a;
            i9 = U.i(i7, width, recyclerView2.getMinimumWidth());
            i10 = U.i(i8, (this.f6978u * i11) + K6, this.f15479b.getMinimumHeight());
        }
        this.f15479b.setMeasuredDimension(i9, i10);
    }

    @Override // w0.U
    public final int Q(a0 a0Var, g0 g0Var) {
        if (this.f6977t == 0) {
            return Math.min(this.f6973p, g0Var.b());
        }
        return -1;
    }

    @Override // w0.U
    public final boolean T() {
        return this.f6965C != 0;
    }

    @Override // w0.U
    public final boolean U() {
        return this.f6980w;
    }

    @Override // w0.U
    public final void U0(RecyclerView recyclerView, g0 g0Var, int i7) {
        C c5 = new C(recyclerView.getContext());
        c5.f15445a = i7;
        V0(c5);
    }

    @Override // w0.U
    public final boolean W0() {
        return this.F == null;
    }

    public final int X0(int i7) {
        if (y() == 0) {
            return this.f6981x ? 1 : -1;
        }
        return (i7 < h1()) != this.f6981x ? -1 : 1;
    }

    public final boolean Y0() {
        int h12;
        if (y() != 0 && this.f6965C != 0 && this.f15482g) {
            if (this.f6981x) {
                h12 = i1();
                h1();
            } else {
                h12 = h1();
                i1();
            }
            i iVar = this.f6964B;
            if (h12 == 0 && m1() != null) {
                iVar.m();
                this.f = true;
                H0();
                return true;
            }
        }
        return false;
    }

    @Override // w0.U
    public final void Z(int i7) {
        super.Z(i7);
        for (int i8 = 0; i8 < this.f6973p; i8++) {
            o.i iVar = this.f6974q[i8];
            int i9 = iVar.f12803b;
            if (i9 != Integer.MIN_VALUE) {
                iVar.f12803b = i9 + i7;
            }
            int i10 = iVar.f12804c;
            if (i10 != Integer.MIN_VALUE) {
                iVar.f12804c = i10 + i7;
            }
        }
    }

    public final int Z0(g0 g0Var) {
        if (y() == 0) {
            return 0;
        }
        f fVar = this.f6975r;
        boolean z7 = this.f6970I;
        return AbstractC1348b.c(g0Var, fVar, e1(!z7), d1(!z7), this, this.f6970I);
    }

    @Override // w0.f0
    public final PointF a(int i7) {
        int X02 = X0(i7);
        PointF pointF = new PointF();
        if (X02 == 0) {
            return null;
        }
        if (this.f6977t == 0) {
            pointF.x = X02;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = X02;
        }
        return pointF;
    }

    @Override // w0.U
    public final void a0(int i7) {
        super.a0(i7);
        for (int i8 = 0; i8 < this.f6973p; i8++) {
            o.i iVar = this.f6974q[i8];
            int i9 = iVar.f12803b;
            if (i9 != Integer.MIN_VALUE) {
                iVar.f12803b = i9 + i7;
            }
            int i10 = iVar.f12804c;
            if (i10 != Integer.MIN_VALUE) {
                iVar.f12804c = i10 + i7;
            }
        }
    }

    public final int a1(g0 g0Var) {
        if (y() == 0) {
            return 0;
        }
        f fVar = this.f6975r;
        boolean z7 = this.f6970I;
        return AbstractC1348b.d(g0Var, fVar, e1(!z7), d1(!z7), this, this.f6970I, this.f6981x);
    }

    @Override // w0.U
    public final void b0(L l7, L l8) {
        this.f6964B.m();
        for (int i7 = 0; i7 < this.f6973p; i7++) {
            this.f6974q[i7].b();
        }
    }

    public final int b1(g0 g0Var) {
        if (y() == 0) {
            return 0;
        }
        f fVar = this.f6975r;
        boolean z7 = this.f6970I;
        return AbstractC1348b.e(g0Var, fVar, e1(!z7), d1(!z7), this, this.f6970I);
    }

    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [boolean, int] */
    public final int c1(a0 a0Var, C1370y c1370y, g0 g0Var) {
        int i7;
        int k5;
        int i8;
        int j12;
        int i9;
        o.i iVar;
        ?? r5;
        int i10;
        int k7;
        int c5;
        int k8;
        int c6;
        int i11;
        int i12;
        int i13;
        a0 a0Var2 = a0Var;
        int i14 = 0;
        int i15 = 1;
        this.f6982y.set(0, this.f6973p, true);
        C1370y c1370y2 = this.f6979v;
        if (c1370y2.f15699i) {
            if (c1370y.f15696e == 1) {
                i7 = Integer.MAX_VALUE;
            } else {
                i7 = Integer.MIN_VALUE;
            }
        } else if (c1370y.f15696e == 1) {
            i7 = c1370y.f15697g + c1370y.f15694b;
        } else {
            i7 = c1370y.f - c1370y.f15694b;
        }
        int i16 = c1370y.f15696e;
        for (int i17 = 0; i17 < this.f6973p; i17++) {
            if (!((ArrayList) this.f6974q[i17].f).isEmpty()) {
                z1(this.f6974q[i17], i16, i7);
            }
        }
        if (this.f6981x) {
            k5 = this.f6975r.g();
        } else {
            k5 = this.f6975r.k();
        }
        boolean z7 = false;
        while (true) {
            int i18 = c1370y.f15695c;
            if (i18 >= 0 && i18 < g0Var.b()) {
                i8 = i15;
            } else {
                i8 = i14;
            }
            int i19 = -1;
            if (i8 == 0 || (!c1370y2.f15699i && this.f6982y.isEmpty())) {
                break;
            }
            View d = a0Var2.d(c1370y.f15695c);
            c1370y.f15695c += c1370y.d;
            p0 p0Var = (p0) d.getLayoutParams();
            int f = p0Var.f15490a.f();
            i iVar2 = this.f6964B;
            int[] iArr = (int[]) iVar2.f14556r;
            if (iArr != null && f < iArr.length) {
                i9 = iArr[f];
            } else {
                i9 = -1;
            }
            if (i9 == -1) {
                if (q1(c1370y.f15696e)) {
                    i12 = this.f6973p - i15;
                    i13 = -1;
                } else {
                    i19 = this.f6973p;
                    i12 = i14;
                    i13 = i15;
                }
                o.i iVar3 = null;
                if (c1370y.f15696e == i15) {
                    int k9 = this.f6975r.k();
                    int i20 = Integer.MAX_VALUE;
                    while (i12 != i19) {
                        o.i iVar4 = this.f6974q[i12];
                        int i21 = iVar4.i(k9);
                        if (i21 < i20) {
                            i20 = i21;
                            iVar3 = iVar4;
                        }
                        i12 += i13;
                    }
                } else {
                    int g7 = this.f6975r.g();
                    int i22 = Integer.MIN_VALUE;
                    while (i12 != i19) {
                        o.i iVar5 = this.f6974q[i12];
                        int k10 = iVar5.k(g7);
                        if (k10 > i22) {
                            iVar3 = iVar5;
                            i22 = k10;
                        }
                        i12 += i13;
                    }
                }
                iVar = iVar3;
                iVar2.p(f);
                ((int[]) iVar2.f14556r)[f] = iVar.f12805e;
            } else {
                iVar = this.f6974q[i9];
            }
            p0Var.f15628e = iVar;
            if (c1370y.f15696e == 1) {
                b(d);
                r5 = 0;
            } else {
                r5 = 0;
                c(d, 0, false);
            }
            if (this.f6977t == 1) {
                i10 = 1;
                o1(d, U.z(r5, this.f6978u, this.f15487l, r5, ((ViewGroup.MarginLayoutParams) p0Var).width), U.z(true, this.f15489o, this.f15488m, K() + N(), ((ViewGroup.MarginLayoutParams) p0Var).height));
            } else {
                i10 = 1;
                o1(d, U.z(true, this.n, this.f15487l, M() + L(), ((ViewGroup.MarginLayoutParams) p0Var).width), U.z(false, this.f6978u, this.f15488m, 0, ((ViewGroup.MarginLayoutParams) p0Var).height));
            }
            if (c1370y.f15696e == i10) {
                c5 = iVar.i(k5);
                k7 = this.f6975r.c(d) + c5;
            } else {
                k7 = iVar.k(k5);
                c5 = k7 - this.f6975r.c(d);
            }
            if (c1370y.f15696e == 1) {
                o.i iVar6 = p0Var.f15628e;
                iVar6.getClass();
                p0 p0Var2 = (p0) d.getLayoutParams();
                p0Var2.f15628e = iVar6;
                ArrayList arrayList = (ArrayList) iVar6.f;
                arrayList.add(d);
                iVar6.f12804c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    iVar6.f12803b = Integer.MIN_VALUE;
                }
                if (p0Var2.f15490a.m() || p0Var2.f15490a.p()) {
                    iVar6.d = ((StaggeredGridLayoutManager) iVar6.f12806g).f6975r.c(d) + iVar6.d;
                }
            } else {
                o.i iVar7 = p0Var.f15628e;
                iVar7.getClass();
                p0 p0Var3 = (p0) d.getLayoutParams();
                p0Var3.f15628e = iVar7;
                ArrayList arrayList2 = (ArrayList) iVar7.f;
                arrayList2.add(0, d);
                iVar7.f12803b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    iVar7.f12804c = Integer.MIN_VALUE;
                }
                if (p0Var3.f15490a.m() || p0Var3.f15490a.p()) {
                    iVar7.d = ((StaggeredGridLayoutManager) iVar7.f12806g).f6975r.c(d) + iVar7.d;
                }
            }
            if (n1() && this.f6977t == 1) {
                c6 = this.f6976s.g() - (((this.f6973p - 1) - iVar.f12805e) * this.f6978u);
                k8 = c6 - this.f6976s.c(d);
            } else {
                k8 = this.f6976s.k() + (iVar.f12805e * this.f6978u);
                c6 = this.f6976s.c(d) + k8;
            }
            if (this.f6977t == 1) {
                U.X(d, k8, c5, c6, k7);
            } else {
                U.X(d, c5, k8, k7, c6);
            }
            z1(iVar, c1370y2.f15696e, i7);
            s1(a0Var, c1370y2);
            if (c1370y2.f15698h && d.hasFocusable()) {
                i11 = 0;
                this.f6982y.set(iVar.f12805e, false);
            } else {
                i11 = 0;
            }
            a0Var2 = a0Var;
            i14 = i11;
            i15 = 1;
            z7 = true;
        }
        int i23 = i14;
        a0 a0Var3 = a0Var2;
        if (!z7) {
            s1(a0Var3, c1370y2);
        }
        if (c1370y2.f15696e == -1) {
            j12 = this.f6975r.k() - k1(this.f6975r.k());
        } else {
            j12 = j1(this.f6975r.g()) - this.f6975r.g();
        }
        if (j12 > 0) {
            return Math.min(c1370y.f15694b, j12);
        }
        return i23;
    }

    @Override // w0.U
    public final void d(String str) {
        if (this.F == null) {
            super.d(str);
        }
    }

    public final View d1(boolean z7) {
        int k5 = this.f6975r.k();
        int g7 = this.f6975r.g();
        View view = null;
        for (int y3 = y() - 1; y3 >= 0; y3--) {
            View x7 = x(y3);
            int e3 = this.f6975r.e(x7);
            int b7 = this.f6975r.b(x7);
            if (b7 > k5 && e3 < g7) {
                if (b7 <= g7 || !z7) {
                    return x7;
                }
                if (view == null) {
                    view = x7;
                }
            }
        }
        return view;
    }

    @Override // w0.U
    public final void e0(RecyclerView recyclerView, a0 a0Var) {
        RecyclerView recyclerView2 = this.f15479b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.f6972K);
        }
        for (int i7 = 0; i7 < this.f6973p; i7++) {
            this.f6974q[i7].b();
        }
        recyclerView.requestLayout();
    }

    public final View e1(boolean z7) {
        int k5 = this.f6975r.k();
        int g7 = this.f6975r.g();
        int y3 = y();
        View view = null;
        for (int i7 = 0; i7 < y3; i7++) {
            View x7 = x(i7);
            int e3 = this.f6975r.e(x7);
            if (this.f6975r.b(x7) > k5 && e3 < g7) {
                if (e3 >= k5 || !z7) {
                    return x7;
                }
                if (view == null) {
                    view = x7;
                }
            }
        }
        return view;
    }

    @Override // w0.U
    public final boolean f() {
        return this.f6977t == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0039, code lost:
        if (r8.f6977t == 1) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x003e, code lost:
        if (r8.f6977t == 0) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x004b, code lost:
        if (n1() == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0058, code lost:
        if (n1() == false) goto L113;
     */
    @Override // w0.U
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View f0(android.view.View r9, int r10, w0.a0 r11, w0.g0 r12) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.f0(android.view.View, int, w0.a0, w0.g0):android.view.View");
    }

    public final void f1(a0 a0Var, g0 g0Var, boolean z7) {
        int g7;
        int j12 = j1(Integer.MIN_VALUE);
        if (j12 != Integer.MIN_VALUE && (g7 = this.f6975r.g() - j12) > 0) {
            int i7 = g7 - (-w1(-g7, a0Var, g0Var));
            if (z7 && i7 > 0) {
                this.f6975r.p(i7);
            }
        }
    }

    @Override // w0.U
    public final boolean g() {
        return this.f6977t == 1;
    }

    @Override // w0.U
    public final void g0(AccessibilityEvent accessibilityEvent) {
        super.g0(accessibilityEvent);
        if (y() > 0) {
            View e12 = e1(false);
            View d1 = d1(false);
            if (e12 == null || d1 == null) {
                return;
            }
            int O5 = U.O(e12);
            int O6 = U.O(d1);
            if (O5 < O6) {
                accessibilityEvent.setFromIndex(O5);
                accessibilityEvent.setToIndex(O6);
                return;
            }
            accessibilityEvent.setFromIndex(O6);
            accessibilityEvent.setToIndex(O5);
        }
    }

    public final void g1(a0 a0Var, g0 g0Var, boolean z7) {
        int k5;
        int k12 = k1(Integer.MAX_VALUE);
        if (k12 != Integer.MAX_VALUE && (k5 = k12 - this.f6975r.k()) > 0) {
            int w12 = k5 - w1(k5, a0Var, g0Var);
            if (z7 && w12 > 0) {
                this.f6975r.p(-w12);
            }
        }
    }

    @Override // w0.U
    public final boolean h(V v5) {
        return v5 instanceof p0;
    }

    @Override // w0.U
    public final void h0(a0 a0Var, g0 g0Var, L.i iVar) {
        super.h0(a0Var, g0Var, iVar);
        iVar.i("androidx.recyclerview.widget.StaggeredGridLayoutManager");
    }

    public final int h1() {
        if (y() == 0) {
            return 0;
        }
        return U.O(x(0));
    }

    public final int i1() {
        int y3 = y();
        if (y3 == 0) {
            return 0;
        }
        return U.O(x(y3 - 1));
    }

    @Override // w0.U
    public final void j(int i7, int i8, g0 g0Var, C0230i c0230i) {
        C1370y c1370y;
        int i9;
        int i10;
        if (this.f6977t != 0) {
            i7 = i8;
        }
        if (y() != 0 && i7 != 0) {
            r1(i7, g0Var);
            int[] iArr = this.f6971J;
            if (iArr == null || iArr.length < this.f6973p) {
                this.f6971J = new int[this.f6973p];
            }
            int i11 = 0;
            int i12 = 0;
            while (true) {
                int i13 = this.f6973p;
                c1370y = this.f6979v;
                if (i11 >= i13) {
                    break;
                }
                if (c1370y.d == -1) {
                    i9 = c1370y.f;
                    i10 = this.f6974q[i11].k(i9);
                } else {
                    i9 = this.f6974q[i11].i(c1370y.f15697g);
                    i10 = c1370y.f15697g;
                }
                int i14 = i9 - i10;
                if (i14 >= 0) {
                    this.f6971J[i12] = i14;
                    i12++;
                }
                i11++;
            }
            Arrays.sort(this.f6971J, 0, i12);
            for (int i15 = 0; i15 < i12; i15++) {
                int i16 = c1370y.f15695c;
                if (i16 >= 0 && i16 < g0Var.b()) {
                    c0230i.b(c1370y.f15695c, this.f6971J[i15]);
                    c1370y.f15695c += c1370y.d;
                } else {
                    return;
                }
            }
        }
    }

    @Override // w0.U
    public final void j0(a0 a0Var, g0 g0Var, View view, L.i iVar) {
        int i7;
        h a7;
        int i8;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof p0)) {
            i0(view, iVar);
            return;
        }
        p0 p0Var = (p0) layoutParams;
        if (this.f6977t == 0) {
            o.i iVar2 = p0Var.f15628e;
            if (iVar2 == null) {
                i8 = -1;
            } else {
                i8 = iVar2.f12805e;
            }
            a7 = h.a(false, i8, 1, -1, -1);
        } else {
            o.i iVar3 = p0Var.f15628e;
            if (iVar3 == null) {
                i7 = -1;
            } else {
                i7 = iVar3.f12805e;
            }
            a7 = h.a(false, -1, -1, i7, 1);
        }
        iVar.k(a7);
    }

    public final int j1(int i7) {
        int i8 = this.f6974q[0].i(i7);
        for (int i9 = 1; i9 < this.f6973p; i9++) {
            int i10 = this.f6974q[i9].i(i7);
            if (i10 > i8) {
                i8 = i10;
            }
        }
        return i8;
    }

    public final int k1(int i7) {
        int k5 = this.f6974q[0].k(i7);
        for (int i8 = 1; i8 < this.f6973p; i8++) {
            int k7 = this.f6974q[i8].k(i7);
            if (k7 < k5) {
                k5 = k7;
            }
        }
        return k5;
    }

    @Override // w0.U
    public final int l(g0 g0Var) {
        return Z0(g0Var);
    }

    @Override // w0.U
    public final void l0(RecyclerView recyclerView, int i7, int i8) {
        l1(i7, i8, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l1(int r8, int r9, int r10) {
        /*
            r7 = this;
            boolean r0 = r7.f6981x
            if (r0 == 0) goto L9
            int r0 = r7.i1()
            goto Ld
        L9:
            int r0 = r7.h1()
        Ld:
            r1 = 8
            if (r10 != r1) goto L1b
            if (r8 >= r9) goto L17
            int r2 = r9 + 1
        L15:
            r3 = r8
            goto L1e
        L17:
            int r2 = r8 + 1
            r3 = r9
            goto L1e
        L1b:
            int r2 = r8 + r9
            goto L15
        L1e:
            t2.i r4 = r7.f6964B
            r4.s(r3)
            r5 = 1
            if (r10 == r5) goto L37
            r6 = 2
            if (r10 == r6) goto L33
            if (r10 == r1) goto L2c
            goto L3a
        L2c:
            r4.w(r8, r5)
            r4.v(r9, r5)
            goto L3a
        L33:
            r4.w(r8, r9)
            goto L3a
        L37:
            r4.v(r8, r9)
        L3a:
            if (r2 > r0) goto L3d
            return
        L3d:
            boolean r8 = r7.f6981x
            if (r8 == 0) goto L46
            int r8 = r7.h1()
            goto L4a
        L46:
            int r8 = r7.i1()
        L4a:
            if (r3 > r8) goto L4f
            r7.H0()
        L4f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.l1(int, int, int):void");
    }

    @Override // w0.U
    public final int m(g0 g0Var) {
        return a1(g0Var);
    }

    @Override // w0.U
    public final void m0(RecyclerView recyclerView) {
        this.f6964B.m();
        H0();
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ff A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x002c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View m1() {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m1():android.view.View");
    }

    @Override // w0.U
    public final int n(g0 g0Var) {
        return b1(g0Var);
    }

    @Override // w0.U
    public final void n0(RecyclerView recyclerView, int i7, int i8) {
        l1(i7, i8, 8);
    }

    public final boolean n1() {
        return J() == 1;
    }

    @Override // w0.U
    public final int o(g0 g0Var) {
        return Z0(g0Var);
    }

    @Override // w0.U
    public final void o0(RecyclerView recyclerView, int i7, int i8) {
        l1(i7, i8, 2);
    }

    public final void o1(View view, int i7, int i8) {
        Rect rect = this.f6968G;
        e(view, rect);
        p0 p0Var = (p0) view.getLayoutParams();
        int A12 = A1(i7, ((ViewGroup.MarginLayoutParams) p0Var).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) p0Var).rightMargin + rect.right);
        int A13 = A1(i8, ((ViewGroup.MarginLayoutParams) p0Var).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) p0Var).bottomMargin + rect.bottom);
        if (R0(view, A12, A13, p0Var)) {
            view.measure(A12, A13);
        }
    }

    @Override // w0.U
    public final int p(g0 g0Var) {
        return a1(g0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:250:0x03eb, code lost:
        if (Y0() != false) goto L258;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p1(w0.a0 r17, w0.g0 r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 1033
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.p1(w0.a0, w0.g0, boolean):void");
    }

    @Override // w0.U
    public final int q(g0 g0Var) {
        return b1(g0Var);
    }

    @Override // w0.U
    public final void q0(RecyclerView recyclerView, int i7, int i8) {
        l1(i7, i8, 4);
    }

    public final boolean q1(int i7) {
        if (this.f6977t == 0) {
            return (i7 == -1) != this.f6981x;
        }
        return ((i7 == -1) == this.f6981x) == n1();
    }

    @Override // w0.U
    public final void r0(a0 a0Var, g0 g0Var) {
        p1(a0Var, g0Var, true);
    }

    public final void r1(int i7, g0 g0Var) {
        int h12;
        int i8;
        if (i7 > 0) {
            h12 = i1();
            i8 = 1;
        } else {
            h12 = h1();
            i8 = -1;
        }
        C1370y c1370y = this.f6979v;
        c1370y.f15693a = true;
        y1(h12, g0Var);
        x1(i8);
        c1370y.f15695c = h12 + c1370y.d;
        c1370y.f15694b = Math.abs(i7);
    }

    @Override // w0.U
    public final void s0(g0 g0Var) {
        this.f6983z = -1;
        this.f6963A = Integer.MIN_VALUE;
        this.F = null;
        this.f6969H.a();
    }

    public final void s1(a0 a0Var, C1370y c1370y) {
        int min;
        int min2;
        if (c1370y.f15693a && !c1370y.f15699i) {
            if (c1370y.f15694b == 0) {
                if (c1370y.f15696e == -1) {
                    t1(c1370y.f15697g, a0Var);
                    return;
                } else {
                    u1(c1370y.f, a0Var);
                    return;
                }
            }
            int i7 = 1;
            if (c1370y.f15696e == -1) {
                int i8 = c1370y.f;
                int k5 = this.f6974q[0].k(i8);
                while (i7 < this.f6973p) {
                    int k7 = this.f6974q[i7].k(i8);
                    if (k7 > k5) {
                        k5 = k7;
                    }
                    i7++;
                }
                int i9 = i8 - k5;
                if (i9 < 0) {
                    min2 = c1370y.f15697g;
                } else {
                    min2 = c1370y.f15697g - Math.min(i9, c1370y.f15694b);
                }
                t1(min2, a0Var);
                return;
            }
            int i10 = c1370y.f15697g;
            int i11 = this.f6974q[0].i(i10);
            while (i7 < this.f6973p) {
                int i12 = this.f6974q[i7].i(i10);
                if (i12 < i11) {
                    i11 = i12;
                }
                i7++;
            }
            int i13 = i11 - c1370y.f15697g;
            if (i13 < 0) {
                min = c1370y.f;
            } else {
                min = Math.min(i13, c1370y.f15694b) + c1370y.f;
            }
            u1(min, a0Var);
        }
    }

    public final void t1(int i7, a0 a0Var) {
        for (int y3 = y() - 1; y3 >= 0; y3--) {
            View x7 = x(y3);
            if (this.f6975r.e(x7) >= i7 && this.f6975r.o(x7) >= i7) {
                p0 p0Var = (p0) x7.getLayoutParams();
                p0Var.getClass();
                if (((ArrayList) p0Var.f15628e.f).size() == 1) {
                    return;
                }
                o.i iVar = p0Var.f15628e;
                ArrayList arrayList = (ArrayList) iVar.f;
                int size = arrayList.size();
                View view = (View) arrayList.remove(size - 1);
                p0 p0Var2 = (p0) view.getLayoutParams();
                p0Var2.f15628e = null;
                if (p0Var2.f15490a.m() || p0Var2.f15490a.p()) {
                    iVar.d -= ((StaggeredGridLayoutManager) iVar.f12806g).f6975r.c(view);
                }
                if (size == 1) {
                    iVar.f12803b = Integer.MIN_VALUE;
                }
                iVar.f12804c = Integer.MIN_VALUE;
                D0(x7, a0Var);
            } else {
                return;
            }
        }
    }

    @Override // w0.U
    public final V u() {
        if (this.f6977t == 0) {
            return new V(-2, -1);
        }
        return new V(-1, -2);
    }

    public final void u1(int i7, a0 a0Var) {
        while (y() > 0) {
            View x7 = x(0);
            if (this.f6975r.b(x7) <= i7 && this.f6975r.n(x7) <= i7) {
                p0 p0Var = (p0) x7.getLayoutParams();
                p0Var.getClass();
                if (((ArrayList) p0Var.f15628e.f).size() == 1) {
                    return;
                }
                o.i iVar = p0Var.f15628e;
                ArrayList arrayList = (ArrayList) iVar.f;
                View view = (View) arrayList.remove(0);
                p0 p0Var2 = (p0) view.getLayoutParams();
                p0Var2.f15628e = null;
                if (arrayList.size() == 0) {
                    iVar.f12804c = Integer.MIN_VALUE;
                }
                if (p0Var2.f15490a.m() || p0Var2.f15490a.p()) {
                    iVar.d -= ((StaggeredGridLayoutManager) iVar.f12806g).f6975r.c(view);
                }
                iVar.f12803b = Integer.MIN_VALUE;
                D0(x7, a0Var);
            } else {
                return;
            }
        }
    }

    @Override // w0.U
    public final V v(Context context, AttributeSet attributeSet) {
        return new V(context, attributeSet);
    }

    public final void v1() {
        boolean z7;
        if (this.f6977t != 1 && n1()) {
            z7 = !this.f6980w;
        } else {
            z7 = this.f6980w;
        }
        this.f6981x = z7;
    }

    @Override // w0.U
    public final V w(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new V((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new V(layoutParams);
    }

    @Override // w0.U
    public final void w0(Parcelable parcelable) {
        if (parcelable instanceof r0) {
            r0 r0Var = (r0) parcelable;
            this.F = r0Var;
            if (this.f6983z != -1) {
                r0Var.f15643t = null;
                r0Var.f15642s = 0;
                r0Var.f15640q = -1;
                r0Var.f15641r = -1;
                r0Var.f15643t = null;
                r0Var.f15642s = 0;
                r0Var.f15644u = 0;
                r0Var.f15645v = null;
                r0Var.f15646w = null;
            }
            H0();
        }
    }

    public final int w1(int i7, a0 a0Var, g0 g0Var) {
        if (y() == 0 || i7 == 0) {
            return 0;
        }
        r1(i7, g0Var);
        C1370y c1370y = this.f6979v;
        int c12 = c1(a0Var, c1370y, g0Var);
        if (c1370y.f15694b >= c12) {
            if (i7 < 0) {
                i7 = -c12;
            } else {
                i7 = c12;
            }
        }
        this.f6975r.p(-i7);
        this.f6966D = this.f6981x;
        c1370y.f15694b = 0;
        s1(a0Var, c1370y);
        return i7;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [w0.r0, android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v28, types: [w0.r0, android.os.Parcelable, java.lang.Object] */
    @Override // w0.U
    public final Parcelable x0() {
        int h12;
        View e12;
        int k5;
        int k7;
        int[] iArr;
        r0 r0Var = this.F;
        if (r0Var != null) {
            ?? obj = new Object();
            obj.f15642s = r0Var.f15642s;
            obj.f15640q = r0Var.f15640q;
            obj.f15641r = r0Var.f15641r;
            obj.f15643t = r0Var.f15643t;
            obj.f15644u = r0Var.f15644u;
            obj.f15645v = r0Var.f15645v;
            obj.f15647x = r0Var.f15647x;
            obj.f15648y = r0Var.f15648y;
            obj.f15649z = r0Var.f15649z;
            obj.f15646w = r0Var.f15646w;
            return obj;
        }
        ?? obj2 = new Object();
        obj2.f15647x = this.f6980w;
        obj2.f15648y = this.f6966D;
        obj2.f15649z = this.f6967E;
        i iVar = this.f6964B;
        if (iVar != null && (iArr = (int[]) iVar.f14556r) != null) {
            obj2.f15645v = iArr;
            obj2.f15644u = iArr.length;
            obj2.f15646w = (List) iVar.f14557s;
        } else {
            obj2.f15644u = 0;
        }
        int i7 = -1;
        if (y() > 0) {
            if (this.f6966D) {
                h12 = i1();
            } else {
                h12 = h1();
            }
            obj2.f15640q = h12;
            if (this.f6981x) {
                e12 = d1(true);
            } else {
                e12 = e1(true);
            }
            if (e12 != null) {
                i7 = U.O(e12);
            }
            obj2.f15641r = i7;
            int i8 = this.f6973p;
            obj2.f15642s = i8;
            obj2.f15643t = new int[i8];
            for (int i9 = 0; i9 < this.f6973p; i9++) {
                if (this.f6966D) {
                    k5 = this.f6974q[i9].i(Integer.MIN_VALUE);
                    if (k5 != Integer.MIN_VALUE) {
                        k7 = this.f6975r.g();
                        k5 -= k7;
                        obj2.f15643t[i9] = k5;
                    } else {
                        obj2.f15643t[i9] = k5;
                    }
                } else {
                    k5 = this.f6974q[i9].k(Integer.MIN_VALUE);
                    if (k5 != Integer.MIN_VALUE) {
                        k7 = this.f6975r.k();
                        k5 -= k7;
                        obj2.f15643t[i9] = k5;
                    } else {
                        obj2.f15643t[i9] = k5;
                    }
                }
            }
        } else {
            obj2.f15640q = -1;
            obj2.f15641r = -1;
            obj2.f15642s = 0;
        }
        return obj2;
    }

    public final void x1(int i7) {
        C1370y c1370y = this.f6979v;
        c1370y.f15696e = i7;
        c1370y.d = this.f6981x != (i7 == -1) ? -1 : 1;
    }

    @Override // w0.U
    public final void y0(int i7) {
        if (i7 == 0) {
            Y0();
        }
    }

    public final void y1(int i7, g0 g0Var) {
        int i8;
        int i9;
        int i10;
        boolean z7;
        C1370y c1370y = this.f6979v;
        boolean z8 = false;
        c1370y.f15694b = 0;
        c1370y.f15695c = i7;
        if (W() && (i10 = g0Var.f15539a) != -1) {
            boolean z9 = this.f6981x;
            if (i10 < i7) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (z9 == z7) {
                i8 = this.f6975r.l();
                i9 = 0;
            } else {
                i9 = this.f6975r.l();
                i8 = 0;
            }
        } else {
            i8 = 0;
            i9 = 0;
        }
        RecyclerView recyclerView = this.f15479b;
        if (recyclerView != null && recyclerView.f6958x) {
            c1370y.f = this.f6975r.k() - i9;
            c1370y.f15697g = this.f6975r.g() + i8;
        } else {
            c1370y.f15697g = this.f6975r.f() + i8;
            c1370y.f = -i9;
        }
        c1370y.f15698h = false;
        c1370y.f15693a = true;
        if (this.f6975r.i() == 0 && this.f6975r.f() == 0) {
            z8 = true;
        }
        c1370y.f15699i = z8;
    }

    public final void z1(o.i iVar, int i7, int i8) {
        int i9 = iVar.d;
        int i10 = iVar.f12805e;
        if (i7 == -1) {
            int i11 = iVar.f12803b;
            if (i11 == Integer.MIN_VALUE) {
                View view = (View) ((ArrayList) iVar.f).get(0);
                iVar.f12803b = ((StaggeredGridLayoutManager) iVar.f12806g).f6975r.e(view);
                ((p0) view.getLayoutParams()).getClass();
                i11 = iVar.f12803b;
            }
            if (i11 + i9 > i8) {
                return;
            }
        } else {
            int i12 = iVar.f12804c;
            if (i12 == Integer.MIN_VALUE) {
                iVar.a();
                i12 = iVar.f12804c;
            }
            if (i12 - i9 < i8) {
                return;
            }
        }
        this.f6982y.set(i10, false);
    }
}
