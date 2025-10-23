package com.rubensousa.dpadrecyclerview.layoutmanager;

import H.e;
import H.j;
import J3.m;
import L.h;
import L.i;
import M5.g;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.datastore.preferences.protobuf.C0230i;
import androidx.emoji2.text.f;
import androidx.emoji2.text.n;
import androidx.recyclerview.widget.RecyclerView;
import com.rubensousa.dpadrecyclerview.DpadRecyclerView;
import d5.C0564j;
import d5.EnumC0557c;
import d5.l;
import d5.o;
import e5.C0656a;
import e5.C0657b;
import e5.C0658c;
import f5.C0700a;
import g5.C0737a;
import g5.c;
import h5.C0750a;
import h5.b;
import h5.d;
import java.util.ArrayList;
import java.util.Iterator;
import l5.C0978b;
import l5.C0980d;
import l5.C0981e;
import l5.C0983g;
import w0.C;
import w0.L;
import w0.T;
import w0.U;
import w0.V;
import w0.a0;
import w0.f0;
import w0.g0;
import w0.k0;
/* loaded from: classes.dex */
public final class PivotLayoutManager extends U implements f0 {

    /* renamed from: A  reason: collision with root package name */
    public boolean f9191A;

    /* renamed from: B  reason: collision with root package name */
    public DpadRecyclerView f9192B;

    /* renamed from: C  reason: collision with root package name */
    public boolean f9193C;

    /* renamed from: D  reason: collision with root package name */
    public C0564j f9194D;

    /* renamed from: p  reason: collision with root package name */
    public int f9195p;

    /* renamed from: q  reason: collision with root package name */
    public final C0657b f9196q;

    /* renamed from: r  reason: collision with root package name */
    public final d f9197r;

    /* renamed from: s  reason: collision with root package name */
    public final C0658c f9198s;

    /* renamed from: t  reason: collision with root package name */
    public final C0700a f9199t;

    /* renamed from: u  reason: collision with root package name */
    public final j f9200u;

    /* renamed from: v  reason: collision with root package name */
    public final C0980d f9201v;

    /* renamed from: w  reason: collision with root package name */
    public final m f9202w;

    /* renamed from: x  reason: collision with root package name */
    public final C0737a f9203x;

    /* renamed from: y  reason: collision with root package name */
    public final g5.d f9204y;

    /* renamed from: z  reason: collision with root package name */
    public final e f9205z;

    /* JADX WARN: Type inference failed for: r10v0, types: [H.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, e5.b] */
    public PivotLayoutManager(T t5) {
        ?? obj = new Object();
        obj.f10147a = 1;
        obj.f10148b = 1;
        obj.f10149c = 8388659;
        obj.d = EnumC0557c.f9258q;
        obj.f10151g = true;
        obj.f10152h = true;
        obj.f10153i = o.f9275q;
        obj.f10155k = true;
        obj.n = 4;
        obj.f10158o = true;
        obj.f10159p = 10;
        obj.f10160q = Integer.MAX_VALUE;
        obj.f10161r = true;
        obj.f10162s = true;
        obj.f10163t = l.f9263e;
        obj.f10164u = 1.0f;
        obj.f10148b = Math.max(1, t5.f15476b);
        l lVar = obj.f10163t;
        lVar.f9264a.clear();
        lVar.f9265b.clear();
        int i7 = t5.f15475a;
        if (i7 != 0 && i7 != 1) {
            throw new IllegalArgumentException("Invalid orientation value. Must be RecyclerView.HORIZONTAL or RecyclerView.VERTICAL".toString());
        }
        obj.f10147a = i7;
        obj.f10154j = t5.f15477c;
        this.f9196q = obj;
        d dVar = new d(this, obj);
        this.f9197r = dVar;
        C0658c c0658c = new C0658c(this, dVar);
        this.f9198s = c0658c;
        C0700a c0700a = new C0700a(this, dVar);
        this.f9199t = c0700a;
        ?? obj2 = new Object();
        obj2.f794r = obj;
        obj2.f793q = -1;
        this.f9200u = obj2;
        C0980d c0980d = new C0980d(this, dVar, c0700a, obj, c0658c, obj2);
        this.f9201v = c0980d;
        this.f9202w = new m(this, c0700a, obj, c0658c, c0980d, dVar);
        this.f9203x = new C0737a(dVar, 3);
        this.f9204y = new g5.d(this, obj, c0980d, dVar, c0658c, obj2);
        this.f9205z = new e(this, obj, dVar, c0658c, c0980d);
    }

    @Override // w0.U
    public final int A(a0 a0Var, g0 g0Var) {
        g.f(a0Var, "recycler");
        g.f(g0Var, "state");
        return this.f9205z.v(g0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
        if (r1 != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
        if (r9 == L.d.n.a()) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
        r9 = 4096;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0036, code lost:
        if (r1 != false) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008d  */
    @Override // w0.U
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0(w0.a0 r7, w0.g0 r8, int r9, android.os.Bundle r10) {
        /*
            r6 = this;
            java.lang.String r10 = "recycler"
            M5.g.f(r7, r10)
            java.lang.String r7 = "state"
            M5.g.f(r8, r7)
            com.rubensousa.dpadrecyclerview.DpadRecyclerView r7 = r6.f9192B
            H.e r10 = r6.f9205z
            r10.getClass()
            java.lang.Object r0 = r10.f778s
            e5.b r0 = (e5.C0657b) r0
            boolean r1 = r0.f10155k
            r2 = 1
            if (r1 != 0) goto L1c
            goto L93
        L1c:
            java.lang.Object r1 = r10.f779t
            h5.d r1 = (h5.d) r1
            boolean r1 = r1.r()
            boolean r0 = r0.b()
            r3 = 8192(0x2000, float:1.148E-41)
            r4 = 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L44
            L.d r0 = L.d.f1847m
            int r0 = r0.a()
            if (r9 != r0) goto L39
            if (r1 == 0) goto L4c
            goto L56
        L39:
            L.d r0 = L.d.f1848o
            int r0 = r0.a()
            if (r9 != r0) goto L57
            if (r1 == 0) goto L56
            goto L4c
        L44:
            L.d r0 = L.d.f1846l
            int r0 = r0.a()
            if (r9 != r0) goto L4e
        L4c:
            r9 = r3
            goto L57
        L4e:
            L.d r0 = L.d.n
            int r0 = r0.a()
            if (r9 != r0) goto L57
        L56:
            r9 = r4
        L57:
            java.lang.Object r0 = r10.f780u
            e5.c r0 = (e5.C0658c) r0
            int r0 = r0.f10168b
            r1 = 0
            if (r0 != 0) goto L64
            if (r9 != r3) goto L64
            r5 = r2
            goto L65
        L64:
            r5 = r1
        L65:
            int r8 = r8.b()
            int r8 = r8 - r2
            if (r0 != r8) goto L70
            if (r9 != r4) goto L70
            r8 = r2
            goto L71
        L70:
            r8 = r1
        L71:
            if (r5 != 0) goto L87
            if (r8 == 0) goto L76
            goto L87
        L76:
            java.lang.Object r7 = r10.f781v
            l5.d r7 = (l5.C0980d) r7
            if (r9 == r4) goto L83
            if (r9 == r3) goto L7f
            goto L93
        L7f:
            r7.b(r1, r2)
            goto L93
        L83:
            r7.b(r2, r2)
            goto L93
        L87:
            android.view.accessibility.AccessibilityEvent r8 = android.view.accessibility.AccessibilityEvent.obtain(r4)
            if (r7 == 0) goto L93
            r7.onInitializeAccessibilityEvent(r8)
            r7.requestSendAccessibilityEvent(r7, r8)
        L93:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.rubensousa.dpadrecyclerview.layoutmanager.PivotLayoutManager.A0(w0.a0, w0.g0, int, android.os.Bundle):boolean");
    }

    @Override // w0.U
    public final boolean F0(RecyclerView recyclerView, View view, Rect rect, boolean z7) {
        g.f(recyclerView, "parent");
        g.f(view, "child");
        g.f(rect, "rect");
        return false;
    }

    @Override // w0.U
    public final int J0(int i7, a0 a0Var, g0 g0Var) {
        g.f(a0Var, "recycler");
        g.f(g0Var, "state");
        m mVar = this.f9202w;
        mVar.getClass();
        if (((C0657b) mVar.d).c()) {
            return 0;
        }
        return mVar.k(i7, a0Var, g0Var);
    }

    @Override // w0.U
    public final void K0(int i7) {
        C0980d c0980d = this.f9201v;
        C0658c c0658c = c0980d.f12278e;
        if (c0658c.j(i7, 0)) {
            c0658c.f10170e = Integer.MIN_VALUE;
            c0658c.f = true;
            c0980d.f12275a.H0();
        }
    }

    @Override // w0.U
    public final int L0(int i7, a0 a0Var, g0 g0Var) {
        g.f(a0Var, "recycler");
        g.f(g0Var, "state");
        m mVar = this.f9202w;
        mVar.getClass();
        if (((C0657b) mVar.d).b()) {
            return 0;
        }
        return mVar.k(i7, a0Var, g0Var);
    }

    @Override // w0.U
    public final int Q(a0 a0Var, g0 g0Var) {
        g.f(a0Var, "recycler");
        g.f(g0Var, "state");
        return this.f9205z.x(g0Var);
    }

    @Override // w0.U
    public final boolean T() {
        return true;
    }

    @Override // w0.U
    public final boolean U() {
        return this.f9196q.f10154j;
    }

    @Override // w0.U
    public final void U0(RecyclerView recyclerView, g0 g0Var, int i7) {
        g.f(recyclerView, "recyclerView");
        g.f(g0Var, "state");
        this.f9201v.d(i7, 0, true);
    }

    @Override // w0.U
    public final void V0(C c5) {
        C0981e c0981e;
        C0980d c0980d = this.f9201v;
        c0980d.c();
        super.V0(c5);
        boolean z7 = c5.f15448e;
        C0983g c0983g = null;
        if (z7 && (c5 instanceof C0981e)) {
            c0981e = (C0981e) c5;
        } else {
            c0981e = null;
        }
        c0980d.f12282j = c0981e;
        if (z7 && (c5 instanceof C0983g)) {
            c0983g = (C0983g) c5;
        }
        c0980d.f12283k = c0983g;
    }

    @Override // w0.U
    public final boolean W0() {
        return !this.f9197r.f11023h;
    }

    public final int X0(g0 g0Var) {
        View t5;
        if (y() == 0) {
            return 0;
        }
        d dVar = this.f9197r;
        f fVar = dVar.f11020c;
        U u7 = dVar.f11018a;
        int b7 = dVar.b(0, u7.y());
        View view = null;
        if (b7 == -1) {
            t5 = null;
        } else {
            t5 = u7.t(b7);
        }
        int b8 = dVar.b(u7.y() - 1, -1);
        if (b8 != -1) {
            view = u7.t(b8);
        }
        g.f(g0Var, "state");
        g.f(fVar, "orientationHelper");
        if (y() == 0 || g0Var.b() == 0 || t5 == null || view == null) {
            return 0;
        }
        return Math.min(fVar.l(), fVar.b(view) - fVar.e(t5));
    }

    public final int Y0(g0 g0Var) {
        View t5;
        int max;
        if (y() == 0) {
            return 0;
        }
        d dVar = this.f9197r;
        f fVar = dVar.f11020c;
        U u7 = dVar.f11018a;
        int b7 = dVar.b(0, u7.y());
        View view = null;
        if (b7 == -1) {
            t5 = null;
        } else {
            t5 = u7.t(b7);
        }
        int b8 = dVar.b(u7.y() - 1, -1);
        if (b8 != -1) {
            view = u7.t(b8);
        }
        boolean z7 = this.f9196q.f10154j;
        g.f(g0Var, "state");
        g.f(fVar, "orientationHelper");
        if (y() == 0 || g0Var.b() == 0 || t5 == null || view == null) {
            return 0;
        }
        int min = Math.min(U.O(t5), U.O(view));
        int max2 = Math.max(U.O(t5), U.O(view));
        if (z7) {
            max = Math.max(0, (g0Var.b() - max2) - 1);
        } else {
            max = Math.max(0, min);
        }
        return Math.round((max * (Math.abs(fVar.b(view) - fVar.e(t5)) / (Math.abs(U.O(t5) - U.O(view)) + 1))) + (fVar.k() - fVar.e(t5)));
    }

    public final int Z0(g0 g0Var) {
        View t5;
        if (y() == 0) {
            return 0;
        }
        d dVar = this.f9197r;
        f fVar = dVar.f11020c;
        U u7 = dVar.f11018a;
        int b7 = dVar.b(0, u7.y());
        View view = null;
        if (b7 == -1) {
            t5 = null;
        } else {
            t5 = u7.t(b7);
        }
        int b8 = dVar.b(u7.y() - 1, -1);
        if (b8 != -1) {
            view = u7.t(b8);
        }
        g.f(g0Var, "state");
        g.f(fVar, "orientationHelper");
        if (y() == 0 || g0Var.b() == 0 || t5 == null || view == null) {
            return 0;
        }
        return (int) (((fVar.b(view) - fVar.e(t5)) / (Math.abs(U.O(t5) - U.O(view)) + 1)) * g0Var.b());
    }

    @Override // w0.f0
    public final PointF a(int i7) {
        if (y() == 0) {
            return null;
        }
        boolean z7 = false;
        View x7 = this.f9197r.f11018a.x(0);
        if (x7 == null) {
            return null;
        }
        int i8 = 1;
        if (i7 < U.O(x7)) {
            z7 = true;
        }
        C0657b c0657b = this.f9196q;
        if (z7 != c0657b.f10154j) {
            i8 = -1;
        }
        if (c0657b.b()) {
            return new PointF(i8, 0.0f);
        }
        return new PointF(0.0f, i8);
    }

    public final void a1(o oVar) {
        g5.e eVar;
        g.f(oVar, "direction");
        C0657b c0657b = this.f9196q;
        c0657b.getClass();
        c0657b.f10153i = oVar;
        g5.d dVar = this.f9204y;
        dVar.getClass();
        int ordinal = oVar.ordinal();
        if (ordinal != 0) {
            d dVar2 = dVar.d;
            if (ordinal != 1) {
                if (ordinal == 2) {
                    eVar = new C0737a(dVar2, 1);
                } else {
                    throw new RuntimeException();
                }
            } else {
                eVar = new C0737a(dVar2, 0);
            }
        } else {
            eVar = dVar.f10855h;
        }
        dVar.f10856i = eVar;
    }

    @Override // w0.U
    public final void b0(L l7, L l8) {
        boolean z7;
        if (l7 != null) {
            this.f9202w.j();
            C0658c c0658c = this.f9198s;
            if (c0658c.f10168b != -1) {
                z7 = true;
            } else {
                z7 = false;
            }
            c0658c.f10168b = -1;
            c0658c.f10169c = 0;
            c0658c.f10170e = 0;
            if (z7) {
                c0658c.a();
                c0658c.b();
            }
        }
    }

    public final void b1(DpadRecyclerView dpadRecyclerView) {
        ArrayList arrayList;
        if (dpadRecyclerView == null) {
            this.f9204y.f10857j = null;
        }
        this.f9192B = dpadRecyclerView;
        this.f9197r.f11025j = dpadRecyclerView;
        C0980d c0980d = this.f9201v;
        DpadRecyclerView dpadRecyclerView2 = c0980d.f12281i;
        C0978b c0978b = c0980d.f12285m;
        if (dpadRecyclerView2 != null && (arrayList = dpadRecyclerView2.f6962z0) != null) {
            arrayList.remove(c0978b);
        }
        if (dpadRecyclerView != null) {
            dpadRecyclerView.i(c0978b);
        }
        c0980d.f12281i = dpadRecyclerView;
        this.f9198s.f10173i = dpadRecyclerView;
    }

    @Override // w0.U
    public final boolean c0(RecyclerView recyclerView, ArrayList arrayList, int i7, int i8) {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        View f;
        boolean z7;
        k0 g7;
        g.f(recyclerView, "recyclerView");
        g.f(arrayList, "views");
        g5.d dVar = this.f9204y;
        dVar.getClass();
        C0657b c0657b = dVar.f10851b;
        boolean z8 = true;
        if (c0657b.a(recyclerView)) {
            if (recyclerView.isFocusable()) {
                arrayList.add(recyclerView);
            }
        } else {
            boolean hasFocus = recyclerView.hasFocus();
            d dVar2 = dVar.d;
            if (hasFocus) {
                if (dVar.f10852c.f12283k == null) {
                    U u7 = dVar.f10850a;
                    if (u7.y() != 0) {
                        View findFocus = recyclerView.findFocus();
                        if (findFocus != null && (g7 = dVar2.g(findFocus)) != null) {
                            i9 = g7.d();
                        } else {
                            i9 = -1;
                        }
                        View t5 = u7.t(i9);
                        if (t5 != null) {
                            t5.addFocusables(arrayList, i7, i8);
                        }
                        boolean c5 = c0657b.c();
                        boolean r3 = dVar2.r();
                        c.f10844q.getClass();
                        c H6 = L4.f.H(i7, c5, r3);
                        if (H6 != null) {
                            c cVar = c.f10848u;
                            c cVar2 = c.f10847t;
                            if ((H6 != cVar && H6 != cVar2) || c0657b.f10148b != 1) {
                                int i14 = c0657b.f10148b;
                                c cVar3 = c.f10845r;
                                c cVar4 = c.f10846s;
                                int i15 = 0;
                                if (i14 != 1 && ((H6 == cVar3 || H6 == cVar4) && i9 != -1)) {
                                    boolean r5 = dVar2.r();
                                    if (H6 != cVar4) {
                                        z8 = false;
                                    }
                                    if (z8 != r5) {
                                        f = dVar2.e();
                                    } else {
                                        f = dVar2.f();
                                    }
                                    if (f != null) {
                                        int O5 = U.O(f);
                                        int i16 = i9;
                                        while (true) {
                                            l lVar = c0657b.f10163t;
                                            if (H6 == cVar4) {
                                                z7 = true;
                                            } else {
                                                z7 = false;
                                            }
                                            C0657b c0657b2 = c0657b;
                                            int l7 = dVar.f.l(i16, lVar, z7, O5, dVar2.r());
                                            View t7 = u7.t(l7);
                                            if (t7 == null) {
                                                break;
                                            } else if (t7.hasFocusable()) {
                                                t7.addFocusables(arrayList, i7, i8);
                                                break;
                                            } else if (l7 == -1) {
                                                break;
                                            } else {
                                                i16 = l7;
                                                c0657b = c0657b2;
                                            }
                                        }
                                    }
                                }
                                if (t5 != null) {
                                    if (t5 != dVar2.f11025j) {
                                        U u8 = dVar2.f11018a;
                                        int y3 = u8.y();
                                        i10 = 0;
                                        while (i10 < y3) {
                                            int i17 = y3;
                                            if (u8.x(i10) == t5) {
                                                break;
                                            }
                                            i10++;
                                            y3 = i17;
                                        }
                                    }
                                    i10 = -1;
                                    n nVar = dVar.f10854g;
                                    nVar.getClass();
                                    nVar.f5856e = t5;
                                    nVar.f = H6;
                                    d dVar3 = (d) nVar.d;
                                    nVar.f5855c = dVar3.m(i9, true);
                                    if (H6 != cVar4 && H6 != cVar) {
                                        i11 = -1;
                                    } else {
                                        i11 = 1;
                                    }
                                    nVar.f5854b = i11;
                                    if (dVar3.r() && (H6 == cVar4 || H6 == cVar3)) {
                                        nVar.f5854b *= -1;
                                    }
                                    int i18 = nVar.f5854b;
                                    U u9 = dVar3.f11018a;
                                    if (i18 > 0) {
                                        i12 = u9.y() - 1;
                                    } else {
                                        i12 = 0;
                                    }
                                    nVar.f5853a = i12;
                                    if (i10 == -1) {
                                        if (nVar.f5854b <= 0) {
                                            i15 = u9.y() - 1;
                                        }
                                    } else if (dVar3.r()) {
                                        i15 = i10 - nVar.f5854b;
                                    } else {
                                        i15 = i10 + nVar.f5854b;
                                    }
                                    int i19 = nVar.f5854b;
                                    int i20 = i15;
                                    while (true) {
                                        int i21 = nVar.f5853a;
                                        if ((i20 > i21 || i19 <= 0) && (i20 < i21 || i19 >= 0)) {
                                            break;
                                        }
                                        View x7 = u7.x(i20);
                                        if (x7 != null && d.q(x7)) {
                                            if (((View) nVar.f5856e) == null) {
                                                x7.addFocusables(arrayList, i7, i8);
                                                break;
                                            }
                                            int m7 = dVar2.m(d.d(x7), true);
                                            c cVar5 = (c) nVar.f;
                                            if (cVar5 != cVar4 && cVar5 != cVar3) {
                                                if (cVar5 == cVar) {
                                                    int i22 = nVar.f5855c;
                                                    if (m7 == i22) {
                                                        continue;
                                                    } else if (m7 < i22) {
                                                        break;
                                                    }
                                                } else if (cVar5 == cVar2 && m7 != (i13 = nVar.f5855c)) {
                                                    if (m7 > i13) {
                                                        break;
                                                    }
                                                }
                                            }
                                            x7.addFocusables(arrayList, i7, i8);
                                        }
                                        i20 += i19;
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                int size = arrayList.size();
                View t8 = dVar2.f11018a.t(dVar.f10853e.f10168b);
                if (t8 != null) {
                    t8.addFocusables(arrayList, i7, i8);
                }
                if (arrayList.size() == size && recyclerView.isFocusable()) {
                    arrayList.add(recyclerView);
                }
            }
            return true;
        }
        return true;
    }

    @Override // w0.U
    public final void d0(RecyclerView recyclerView) {
        g.f(recyclerView, "view");
        g5.d dVar = this.f9204y;
        dVar.getClass();
        View view = recyclerView;
        while (true) {
            ViewParent parent = view.getParent();
            if (parent == null || !(parent instanceof ViewGroup)) {
                break;
            } else if (parent instanceof RecyclerView) {
                dVar.f10857j = (RecyclerView) parent;
                break;
            } else {
                view = (ViewGroup) parent;
            }
        }
        if (this.f9196q.f10165v) {
            H0();
        }
    }

    @Override // w0.U
    public final void e0(RecyclerView recyclerView, a0 a0Var) {
        g.f(recyclerView, "view");
        g.f(a0Var, "recycler");
        this.f9204y.f10857j = null;
        if (this.f9196q.f10165v) {
            B0(a0Var);
            a0Var.f15502a.clear();
            a0Var.g();
        }
    }

    @Override // w0.U
    public final boolean f() {
        return this.f9196q.b();
    }

    @Override // w0.U
    public final boolean g() {
        return this.f9196q.c();
    }

    @Override // w0.U
    public final boolean h(V v5) {
        return v5 instanceof C0656a;
    }

    @Override // w0.U
    public final void h0(a0 a0Var, g0 g0Var, i iVar) {
        L.d dVar;
        L.d dVar2;
        g.f(a0Var, "recycler");
        g.f(g0Var, "state");
        e eVar = this.f9205z;
        eVar.getClass();
        int b7 = g0Var.b();
        d dVar3 = (d) eVar.f779t;
        boolean r3 = dVar3.r();
        C0657b c0657b = (C0657b) eVar.f778s;
        if (!c0657b.f10150e || (b7 > 1 && !dVar3.p(0))) {
            if (c0657b.b()) {
                if (r3) {
                    dVar = L.d.f1848o;
                } else {
                    dVar = L.d.f1847m;
                }
            } else {
                dVar = L.d.f1846l;
            }
            iVar.b(dVar);
            iVar.m();
        }
        if (!c0657b.f || (b7 > 1 && !dVar3.p(b7 - 1))) {
            if (c0657b.b()) {
                if (r3) {
                    dVar2 = L.d.f1847m;
                } else {
                    dVar2 = L.d.f1848o;
                }
            } else {
                dVar2 = L.d.n;
            }
            iVar.b(dVar2);
            iVar.m();
        }
        int x7 = eVar.x(g0Var);
        int v5 = eVar.v(g0Var);
        ((U) eVar.f777r).getClass();
        iVar.j(K3.f.c(x7, v5, 0));
    }

    @Override // w0.U
    public final void j(int i7, int i8, g0 g0Var, C0230i c0230i) {
        h5.c cVar;
        b bVar;
        View f;
        int k5;
        g.f(g0Var, "state");
        g.f(c0230i, "layoutPrefetchRegistry");
        C0737a c0737a = this.f9203x;
        c0737a.getClass();
        d dVar = c0737a.f10839r;
        if (dVar.f11019b.c()) {
            i7 = i8;
        }
        if (dVar.f11018a.y() != 0 && i7 != 0) {
            h5.c cVar2 = h5.c.f11015s;
            if (i7 > 0) {
                cVar = cVar2;
            } else {
                cVar = h5.c.f11014r;
            }
            if (cVar == cVar2) {
                bVar = b.f11011s;
            } else {
                bVar = b.f11010r;
            }
            if (dVar.r()) {
                bVar = bVar.a();
            }
            if (cVar == cVar2) {
                f = dVar.e();
            } else {
                f = dVar.f();
            }
            if (f != null) {
                int f7 = d.k(f).f15490a.f();
                int i9 = bVar.f11013q;
                int i10 = f7 + i9;
                C0657b c0657b = dVar.f11019b;
                int i11 = c0657b.f10148b;
                if (cVar == cVar2) {
                    k5 = dVar.h(f) - dVar.f11020c.g();
                } else {
                    k5 = (-dVar.j(f)) + dVar.f11020c.k();
                }
                int i12 = i11;
                for (int i13 = 0; i13 < i11 && i10 >= 0 && i10 < g0Var.b() && i12 > 0; i13++) {
                    c0230i.b(i10, Math.max(0, k5));
                    c0657b.f10163t.getClass();
                    i12--;
                    i10 += i9;
                }
            }
        }
    }

    @Override // w0.U
    public final void j0(a0 a0Var, g0 g0Var, View view, i iVar) {
        h a7;
        g.f(a0Var, "recycler");
        g.f(g0Var, "state");
        g.f(view, "host");
        e eVar = this.f9205z;
        eVar.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        g.e(layoutParams, "getLayoutParams(...)");
        if (layoutParams instanceof C0656a) {
            C0656a c0656a = (C0656a) layoutParams;
            int f = c0656a.f15490a.f();
            d dVar = (d) eVar.f779t;
            int l7 = dVar.l(f);
            if (dVar.f11019b.b()) {
                a7 = h.a(false, c0656a.f10145g, c0656a.f, l7, 1);
            } else {
                a7 = h.a(false, l7, 1, c0656a.f10145g, c0656a.f);
            }
            iVar.k(a7);
        }
    }

    @Override // w0.U
    public final void k(int i7, C0230i c0230i) {
        g.f(c0230i, "layoutPrefetchRegistry");
        int i8 = this.f9196q.n;
        int i9 = this.f9198s.f10168b;
        this.f9203x.getClass();
        if (i8 != 0 && i7 != 0) {
            int max = Math.max(0, Math.min(i9 - ((i8 - 1) / 2), i7 - i8));
            for (int i10 = max; i10 < i7 && i10 < max + i8; i10++) {
                c0230i.b(i10, 0);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0131, code lost:
        if (r8.b(false, false) != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x011b, code lost:
        if (r8.b(true, false) != false) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0138  */
    @Override // w0.U
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View k0(android.view.View r12, int r13) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.rubensousa.dpadrecyclerview.layoutmanager.PivotLayoutManager.k0(android.view.View, int):android.view.View");
    }

    @Override // w0.U
    public final int l(g0 g0Var) {
        g.f(g0Var, "state");
        return X0(g0Var);
    }

    @Override // w0.U
    public final void l0(RecyclerView recyclerView, int i7, int i8) {
        int i9;
        g.f(recyclerView, "recyclerView");
        l lVar = this.f9197r.f11019b.f10163t;
        lVar.f9264a.clear();
        lVar.f9265b.clear();
        C0750a c0750a = (C0750a) this.f9202w.f1402k;
        c0750a.f11005a = i7;
        c0750a.f11006b = i8;
        C0658c c0658c = this.f9198s;
        c0658c.getClass();
        int i10 = DpadRecyclerView.l1;
        int i11 = c0658c.f10168b;
        if (i11 != -1 && (i9 = c0658c.f10170e) != Integer.MIN_VALUE && i7 <= i11 + i9) {
            c0658c.f10170e = i9 + i8;
        }
    }

    @Override // w0.U
    public final int m(g0 g0Var) {
        g.f(g0Var, "state");
        return Y0(g0Var);
    }

    @Override // w0.U
    public final void m0(RecyclerView recyclerView) {
        g.f(recyclerView, "recyclerView");
        l lVar = this.f9197r.f11019b.f10163t;
        lVar.f9264a.clear();
        lVar.f9265b.clear();
        this.f9198s.f10170e = 0;
    }

    @Override // w0.U
    public final int n(g0 g0Var) {
        g.f(g0Var, "state");
        return Z0(g0Var);
    }

    @Override // w0.U
    public final void n0(RecyclerView recyclerView, int i7, int i8) {
        int i9;
        int i10;
        g.f(recyclerView, "recyclerView");
        l lVar = this.f9197r.f11019b.f10163t;
        lVar.f9264a.clear();
        lVar.f9265b.clear();
        C0750a c0750a = (C0750a) this.f9202w.f1402k;
        c0750a.f11008e = i7;
        c0750a.f = i8;
        c0750a.f11009g = 1;
        C0658c c0658c = this.f9198s;
        c0658c.getClass();
        int i11 = DpadRecyclerView.l1;
        int i12 = c0658c.f10168b;
        if (i12 != -1 && (i9 = c0658c.f10170e) != Integer.MIN_VALUE) {
            int i13 = i12 + i9;
            if (i7 <= i13 && i13 < i7 + 1) {
                c0658c.f10170e = (i8 - i7) + i9;
                return;
            }
            if (i7 < i13 && i8 > i13 - 1) {
                i10 = i9 - 1;
            } else if (i7 > i13 && i8 < i13) {
                i10 = i9 + 1;
            } else {
                return;
            }
            c0658c.f10170e = i10;
        }
    }

    @Override // w0.U
    public final int o(g0 g0Var) {
        g.f(g0Var, "state");
        return X0(g0Var);
    }

    @Override // w0.U
    public final void o0(RecyclerView recyclerView, int i7, int i8) {
        int i9;
        int i10;
        g.f(recyclerView, "recyclerView");
        l lVar = this.f9197r.f11019b.f10163t;
        lVar.f9264a.clear();
        lVar.f9265b.clear();
        C0750a c0750a = (C0750a) this.f9202w.f1402k;
        c0750a.f11007c = i7;
        c0750a.d = i8;
        C0658c c0658c = this.f9198s;
        c0658c.getClass();
        int i11 = DpadRecyclerView.l1;
        int i12 = c0658c.f10168b;
        int i13 = -1;
        if (i12 != -1 && (i9 = c0658c.f10170e) != Integer.MIN_VALUE && i7 <= (i10 = i12 + i9)) {
            if (i7 + i8 > i10) {
                c0658c.f10170e = (i7 - i10) + i9;
                int I6 = ((U) c0658c.f10171g).I();
                int i14 = c0658c.f10168b;
                int i15 = c0658c.f10170e + i14;
                if (I6 != 0) {
                    i13 = Math.max(0, Math.min(I6 - 1, i15));
                }
                c0658c.f10168b = i13;
                if (i13 != i14) {
                    c0658c.f = true;
                }
                c0658c.f10170e = Integer.MIN_VALUE;
                c0658c.f = true;
                return;
            }
            c0658c.f10170e = i9 - i8;
        }
    }

    @Override // w0.U
    public final int p(g0 g0Var) {
        g.f(g0Var, "state");
        return Y0(g0Var);
    }

    @Override // w0.U
    public final int q(g0 g0Var) {
        g.f(g0Var, "state");
        return Z0(g0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:265:0x05a3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:270:0x05bb  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x05eb  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0658  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0688  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x06bd  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x06d4  */
    /* JADX WARN: Removed duplicated region for block: B:309:? A[RETURN, SYNTHETIC] */
    @Override // w0.U
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r0(w0.a0 r30, w0.g0 r31) {
        /*
            Method dump skipped, instructions count: 1754
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.rubensousa.dpadrecyclerview.layoutmanager.PivotLayoutManager.r0(w0.a0, w0.g0):void");
    }

    @Override // w0.U
    public final void s0(g0 g0Var) {
        boolean z7;
        k0 G6;
        View view;
        k0 G7;
        g.f(g0Var, "state");
        m mVar = this.f9202w;
        mVar.getClass();
        boolean z8 = mVar.f1394a;
        View view2 = null;
        d dVar = (d) mVar.f1398g;
        if (z8) {
            mVar.f1394a = false;
            int I6 = ((U) mVar.f1395b).I();
            int i7 = 0;
            while (true) {
                if (i7 < I6) {
                    RecyclerView recyclerView = dVar.f11025j;
                    if (recyclerView != null && (G7 = recyclerView.G(i7)) != null) {
                        view = G7.f15576a;
                    } else {
                        view = null;
                    }
                    if (view != null && d.q(view)) {
                        break;
                    }
                    i7++;
                } else {
                    view = null;
                    break;
                }
            }
            if (view != null) {
                dVar.getClass();
                int d = d.d(view);
                if (d != -1) {
                    C0658c c0658c = (C0658c) mVar.f1397e;
                    if (c0658c.f10168b != d) {
                        c0658c.j(d, 0);
                        C0980d.e((C0980d) mVar.f, false);
                    }
                }
            }
        }
        C0750a c0750a = (C0750a) mVar.f1402k;
        c0750a.f11005a = -1;
        c0750a.f11006b = 0;
        c0750a.f11007c = -1;
        c0750a.d = 0;
        c0750a.f11008e = -1;
        c0750a.f = -1;
        c0750a.f11009g = 0;
        dVar.f = false;
        f fVar = dVar.f11020c;
        fVar.f5837a = fVar.l();
        if (dVar.f11018a.y() > 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        dVar.f11022g = z7;
        Iterator it = ((ArrayList) mVar.f1401j).iterator();
        while (it.hasNext()) {
            C0564j c0564j = (C0564j) it.next();
            c0564j.getClass();
            c0564j.f9262a.f9190k1 = false;
        }
        if (this.f9191A) {
            DpadRecyclerView dpadRecyclerView = this.f9192B;
            g5.d dVar2 = this.f9204y;
            if (dpadRecyclerView == null) {
                dVar2.getClass();
            } else if (dVar2.f10851b.a(dpadRecyclerView)) {
                C0658c c0658c2 = dVar2.f10853e;
                int i8 = c0658c2.f10168b;
                RecyclerView recyclerView2 = dVar2.d.f11025j;
                if (recyclerView2 != null && (G6 = recyclerView2.G(i8)) != null) {
                    view2 = G6.f15576a;
                }
                if (view2 != null && d.q(view2) && !view2.hasFocus()) {
                    c0658c2.d(view2);
                }
            }
        }
        C0658c c0658c3 = this.f9198s;
        if (c0658c3.f) {
            c0658c3.f = false;
            c0658c3.a();
            c0658c3.b();
        }
        this.f9191A = false;
    }

    @Override // w0.U
    public final V u() {
        C0657b c0657b = this.f9196q;
        if (c0657b.f10148b == 1) {
            return new C0656a(-2, -2);
        }
        if (c0657b.c()) {
            return new C0656a(-1, -2);
        }
        return new C0656a(-2, -1);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [w0.V, e5.a] */
    @Override // w0.U
    public final V v(Context context, AttributeSet attributeSet) {
        g.f(context, "context");
        g.f(attributeSet, "attrs");
        ?? v5 = new V(context, attributeSet);
        v5.f = 1;
        v5.f10145g = -1;
        v5.f10146h = -1;
        return v5;
    }

    @Override // w0.U
    public final boolean v0(RecyclerView recyclerView, g0 g0Var, View view, View view2) {
        boolean z7;
        U layoutManager;
        g.f(recyclerView, "parent");
        g.f(g0Var, "state");
        g.f(view, "child");
        g5.d dVar = this.f9204y;
        dVar.getClass();
        C0657b c0657b = dVar.f10851b;
        if (c0657b.a(recyclerView)) {
            z7 = false;
        } else {
            RecyclerView recyclerView2 = dVar.f10857j;
            if (recyclerView2 != null && (layoutManager = recyclerView2.getLayoutManager()) != null) {
                z7 = !layoutManager.W();
            } else {
                z7 = true;
            }
        }
        if (z7) {
            d dVar2 = dVar.d;
            dVar2.getClass();
            int d = d.d(view);
            if (d != -1) {
                dVar.f.q(d, c0657b.f10163t);
                C0980d c0980d = dVar.f10852c;
                if (!c0980d.f12279g && !dVar2.f) {
                    c0980d.f(view, view2, c0657b.f10158o, true);
                }
                C0658c c0658c = dVar.f10853e;
                View view3 = c0658c.d;
                if (view3 != null && view3 == view2) {
                    c0658c.g(view3);
                }
                c0658c.d = null;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [w0.V, e5.a] */
    /* JADX WARN: Type inference failed for: r0v5, types: [w0.V, e5.a] */
    /* JADX WARN: Type inference failed for: r0v6, types: [w0.V, e5.a] */
    /* JADX WARN: Type inference failed for: r0v7, types: [w0.V, e5.a] */
    @Override // w0.U
    public final V w(ViewGroup.LayoutParams layoutParams) {
        g.f(layoutParams, "layoutParams");
        if (layoutParams instanceof C0656a) {
            ?? v5 = new V((V) ((C0656a) layoutParams));
            v5.f = 1;
            v5.f10145g = -1;
            v5.f10146h = -1;
            return v5;
        } else if (layoutParams instanceof V) {
            ?? v7 = new V((V) layoutParams);
            v7.f = 1;
            v7.f10145g = -1;
            v7.f10146h = -1;
            return v7;
        } else if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ?? v8 = new V((ViewGroup.MarginLayoutParams) layoutParams);
            v8.f = 1;
            v8.f10145g = -1;
            v8.f10146h = -1;
            return v8;
        } else {
            ?? v9 = new V(layoutParams);
            v9.f = 1;
            v9.f10145g = -1;
            v9.f10146h = -1;
            return v9;
        }
    }

    @Override // w0.U
    public final void w0(Parcelable parcelable) {
        m mVar = this.f9202w;
        mVar.getClass();
        if (parcelable instanceof h5.g) {
            h5.g gVar = (h5.g) parcelable;
            int i7 = gVar.f11041q;
            C0658c c0658c = (C0658c) mVar.f1397e;
            c0658c.j(i7, 0);
            boolean z7 = gVar.f11042r;
            d dVar = (d) mVar.f1398g;
            dVar.f11024i = z7;
            dVar.f11023h = gVar.f11043s;
            C0657b c0657b = dVar.f11019b;
            c0657b.getClass();
            EnumC0557c enumC0557c = gVar.f11044t;
            g.f(enumC0557c, "strategy");
            c0657b.d = enumC0557c;
            if (gVar.f11041q != -1) {
                c0658c.f = true;
                ((U) mVar.f1395b).H0();
            }
        }
    }

    @Override // w0.U
    public final Parcelable x0() {
        m mVar = this.f9202w;
        int i7 = ((C0658c) mVar.f1397e).f10168b;
        d dVar = (d) mVar.f1398g;
        return new h5.g(i7, dVar.f11024i, dVar.f11023h, dVar.f11019b.d);
    }
}
