package h5;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.D;
import androidx.leanback.widget.C0306n;
import d5.EnumC0557c;
import f5.C0700a;
import g5.C0737a;
import k.C0852F;
import w0.U;
import w0.V;
import w0.a0;
import w0.g0;
/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a  reason: collision with root package name */
    public final U f11050a;

    /* renamed from: b  reason: collision with root package name */
    public final d f11051b;

    /* renamed from: c  reason: collision with root package name */
    public final C0700a f11052c;
    public final j d;

    /* renamed from: e  reason: collision with root package name */
    public final D f11053e;
    public final C0737a f;

    /* renamed from: g  reason: collision with root package name */
    public final h f11054g;

    /* renamed from: h  reason: collision with root package name */
    public final e f11055h;

    /* renamed from: i  reason: collision with root package name */
    public final C0306n f11056i;

    /* renamed from: j  reason: collision with root package name */
    public final C0852F f11057j;

    /* renamed from: k  reason: collision with root package name */
    public final C0852F f11058k;

    /* JADX WARN: Type inference failed for: r2v2, types: [h5.h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [h5.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.leanback.widget.n, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [h5.j, java.lang.Object] */
    public i(U u7, d dVar, C0700a c0700a) {
        M5.g.f(u7, "layoutManager");
        M5.g.f(dVar, "layoutInfo");
        M5.g.f(c0700a, "layoutAlignment");
        this.f11050a = u7;
        this.f11051b = dVar;
        this.f11052c = c0700a;
        ?? obj = new Object();
        obj.f11059a = 0;
        obj.f11060b = 0;
        obj.f11061c = 0;
        obj.d = 0;
        this.d = obj;
        this.f11053e = new D(u7, dVar);
        this.f = new C0737a(dVar, 2);
        ?? obj2 = new Object();
        obj2.f11045a = -1;
        obj2.f11046b = -1;
        obj2.f11047c = Integer.MAX_VALUE;
        obj2.d = Integer.MIN_VALUE;
        this.f11054g = obj2;
        ?? obj3 = new Object();
        obj3.f11026a = c.f11015s;
        b bVar = b.f11011s;
        obj3.f11027b = bVar;
        obj3.f11028c = bVar;
        obj3.f11030g = true;
        obj3.f11034k = 8388611;
        obj3.f11035l = true;
        obj3.f11037o = EnumC0557c.f9258q;
        this.f11055h = obj3;
        this.f11056i = new Object();
        this.f11057j = new C0852F(3, false);
        this.f11058k = new C0852F(4);
    }

    public static boolean l(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        M5.g.d(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
        V v5 = (V) layoutParams;
        if (!v5.f15490a.m() && !v5.f15490a.p()) {
            return false;
        }
        return true;
    }

    public final void a(View view, e eVar) {
        M5.g.f(view, "view");
        M5.g.f(eVar, "layoutRequest");
        boolean z7 = eVar.n;
        U u7 = this.f11050a;
        boolean b7 = eVar.b();
        if (!z7) {
            if (b7) {
                u7.b(view);
            } else {
                u7.c(view, 0, false);
            }
        } else if (b7) {
            u7.c(view, -1, true);
        } else {
            u7.c(view, 0, true);
        }
    }

    public final int b(e eVar, C0852F c0852f, a0 a0Var, g0 g0Var) {
        M5.g.f(eVar, "layoutRequest");
        M5.g.f(c0852f, "viewProvider");
        M5.g.f(a0Var, "recycler");
        M5.g.f(g0Var, "state");
        int i7 = eVar.d;
        C0306n c0306n = this.f11056i;
        c0306n.f6611a = 0;
        c0306n.f6612b = false;
        D d = this.f11053e;
        d.O(a0Var, eVar);
        int i8 = i7;
        int i9 = 0;
        while (c0852f.x(eVar, g0Var) && (i8 > 0 || eVar.f11036m)) {
            d(eVar, c0852f, a0Var, g0Var, this.f11056i);
            int i10 = c0306n.f6611a;
            eVar.f11033j += eVar.f11026a.f11017q * i10;
            i9 += i10;
            if (!c0306n.f6612b) {
                i8 -= i10;
            }
            if (i10 > 0) {
                d.O(a0Var, eVar);
            } else if (c0852f.x(eVar, g0Var)) {
                Log.w("DpadRecyclerView", "View at position " + eVar.f11029e + " could not be laid out");
                eVar.c();
            } else {
                i8 = 0;
            }
            c0306n.f6611a = 0;
            c0306n.f6612b = false;
        }
        d.O(a0Var, eVar);
        return i9;
    }

    public abstract View c(int i7, e eVar, C0852F c0852f, a0 a0Var, g0 g0Var);

    public abstract void d(e eVar, C0852F c0852f, a0 a0Var, g0 g0Var, C0306n c0306n);

    public abstract void e(View view, View view2, e eVar, C0852F c0852f, a0 a0Var, g0 g0Var);

    public boolean f(View view, e eVar, C0852F c0852f, a0 a0Var, g0 g0Var) {
        M5.g.f(view, "pivotView");
        M5.g.f(eVar, "layoutRequest");
        M5.g.f(c0852f, "viewProvider");
        M5.g.f(a0Var, "recycler");
        M5.g.f(g0Var, "state");
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
        if (r4.width == (-2)) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002e, code lost:
        if (r4.height == (-2)) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void i(w0.g0 r11) {
        /*
            r10 = this;
            java.lang.String r0 = "state"
            M5.g.f(r11, r0)
            int r11 = r11.b()
            h5.d r0 = r10.f11051b
            e5.b r1 = r0.f11019b
            int r2 = r1.f10149c
            boolean r1 = r1.c()
            boolean r3 = r0.r()
            androidx.recyclerview.widget.RecyclerView r4 = r0.f11025j
            r5 = 0
            if (r4 != 0) goto L1e
        L1c:
            r8 = r5
            goto L3b
        L1e:
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            e5.b r6 = r0.f11019b
            boolean r7 = r6.c()
            r8 = 1
            r9 = -2
            if (r7 == 0) goto L31
            int r7 = r4.height
            if (r7 != r9) goto L31
            goto L3b
        L31:
            boolean r6 = r6.b()
            if (r6 == 0) goto L1c
            int r4 = r4.width
            if (r4 != r9) goto L1c
        L3b:
            e5.b r4 = r0.f11019b
            d5.c r4 = r4.d
            h5.e r6 = r10.f11055h
            r6.getClass()
            java.lang.String r7 = "loopDirection"
            M5.g.f(r4, r7)
            r6.f11038p = r11
            r6.f = r3
            r6.f11034k = r2
            r6.f11035l = r1
            r6.f11036m = r8
            r6.f11030g = r5
            if (r3 == 0) goto L5a
            h5.b r11 = h5.b.f11010r
            goto L5c
        L5a:
            h5.b r11 = h5.b.f11011s
        L5c:
            r6.f11027b = r11
            if (r8 != 0) goto L63
            r6.f11037o = r4
            goto L67
        L63:
            d5.c r1 = d5.EnumC0557c.f9258q
            r6.f11037o = r1
        L67:
            r6.f11028c = r11
            r6.f11039q = r5
            r6.f11040r = r5
            boolean r11 = r6.f11035l
            boolean r1 = r6.f
            f5.a r2 = r10.f11052c
            r2.f10429a = r11
            r2.f10430b = r1
            java.lang.Object r3 = r2.f
            f5.b r3 = (f5.C0701b) r3
            r3.getClass()
            java.lang.Object r2 = r2.f10431c
            w0.U r2 = (w0.U) r2
            java.lang.String r4 = "layoutManager"
            M5.g.f(r2, r4)
            if (r11 == 0) goto L8c
            int r4 = r2.f15489o
            goto L8e
        L8c:
            int r4 = r2.n
        L8e:
            r3.d = r4
            r3.f10436c = r1
            if (r11 == 0) goto La1
            int r11 = r2.N()
            r3.f10437e = r11
            int r11 = r2.K()
            r3.f = r11
            goto Lbb
        La1:
            androidx.recyclerview.widget.RecyclerView r11 = r2.f15479b
            if (r11 == 0) goto Lac
            java.lang.reflect.Field r1 = K.O.f1447a
            int r11 = r11.getPaddingStart()
            goto Lad
        Lac:
            r11 = r5
        Lad:
            r3.f10437e = r11
            androidx.recyclerview.widget.RecyclerView r11 = r2.f15479b
            if (r11 == 0) goto Lb9
            java.lang.reflect.Field r1 = K.O.f1447a
            int r5 = r11.getPaddingEnd()
        Lb9:
            r3.f = r5
        Lbb:
            boolean r11 = r0.f11024i
            r6.f11040r = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.i.i(w0.g0):void");
    }

    public final void j(View view, j jVar) {
        M5.g.f(jVar, "bounds");
        int i7 = jVar.f11059a;
        int i8 = jVar.f11060b;
        int i9 = jVar.f11061c;
        int i10 = jVar.d;
        this.f11050a.getClass();
        U.X(view, i7, i8, i9, i10);
    }

    public final void k(int i7, a0 a0Var, g0 g0Var, boolean z7) {
        int max;
        int i8;
        M5.g.f(a0Var, "recycler");
        M5.g.f(g0Var, "state");
        C0852F c0852f = this.f11057j;
        if (z7) {
            c0852f.getClass();
            c0852f.f11874r = a0Var;
        }
        int abs = Math.abs(i7);
        e eVar = this.f11055h;
        eVar.f11030g = z7;
        d dVar = this.f11051b;
        C0737a c0737a = this.f;
        if (i7 < 0) {
            View f = dVar.f();
            if (f != null) {
                int f7 = d.k(f).f15490a.f();
                eVar.a();
                eVar.f11026a = c.f11014r;
                eVar.f11028c = eVar.f11027b.a();
                eVar.f11029e = f7;
                eVar.c();
                eVar.f11033j = dVar.j(f);
                c0737a.a(eVar, g0Var);
                max = Math.max(0, dVar.f11020c.k() - eVar.f11033j);
                i8 = eVar.f11031h;
                eVar.d((abs + i8) - max);
            }
        } else {
            View e3 = dVar.e();
            if (e3 != null) {
                int f8 = d.k(e3).f15490a.f();
                eVar.a();
                eVar.f11026a = c.f11015s;
                eVar.f11028c = eVar.f11027b;
                eVar.f11029e = f8;
                eVar.c();
                eVar.f11033j = dVar.h(e3);
                c0737a.a(eVar, g0Var);
                max = Math.max(0, eVar.f11033j - dVar.f11020c.g());
                i8 = eVar.f11032i;
                eVar.d((abs + i8) - max);
            }
        }
        int i9 = -i7;
        dVar.f11020c.p(i9);
        eVar.f11033j += i9;
        g(i9);
        int b7 = b(eVar, c0852f, a0Var, g0Var);
        if (z7) {
            c0852f.f11874r = null;
        }
        if (b7 == 0) {
            this.f11052c.i();
        }
        eVar.f11030g = false;
        m();
    }

    public final void m() {
        int y3;
        e eVar = this.f11055h;
        boolean z7 = eVar.f11039q;
        d dVar = this.f11051b;
        boolean z8 = false;
        if (z7) {
            U u7 = this.f11050a;
            if (u7.y() != 0) {
                if (eVar.f11037o == EnumC0557c.f9259r) {
                    eVar.f11040r = true;
                    dVar.f11024i = true;
                    dVar.f11023h = true;
                    return;
                }
                if (!eVar.f) {
                    y3 = 0;
                } else {
                    y3 = u7.y() - 1;
                }
                View t5 = dVar.f11018a.t(0);
                if (t5 != null && u7.x(y3) != t5) {
                    z8 = true;
                }
                eVar.f11040r = z8;
                boolean z9 = eVar.f11040r;
                boolean z10 = eVar.f11039q;
                dVar.f11024i = z9;
                dVar.f11023h = z10;
                return;
            }
        }
        eVar.f11040r = false;
        dVar.f11024i = false;
        dVar.f11023h = false;
    }

    public void h() {
    }

    public void g(int i7) {
    }
}
