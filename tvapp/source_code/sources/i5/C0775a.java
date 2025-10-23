package i5;

import M5.g;
import Z5.n;
import android.graphics.Rect;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.rubensousa.dpadrecyclerview.DpadRecyclerView;
import d5.s;
import e5.C0656a;
import e5.C0657b;
import f5.C0700a;
import f5.C0701b;
import h5.c;
import h5.d;
import h5.e;
import h5.i;
import k.C0852F;
import o.k;
import w0.U;
import w0.a0;
import w0.g0;
import w0.k0;
/* renamed from: i5.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0775a extends i {

    /* renamed from: l  reason: collision with root package name */
    public final n f11374l;

    /* renamed from: m  reason: collision with root package name */
    public final Rect f11375m;
    public final View[] n;

    /* renamed from: o  reason: collision with root package name */
    public final b f11376o;

    /* renamed from: p  reason: collision with root package name */
    public final C4.b f11377p;

    /* renamed from: q  reason: collision with root package name */
    public final b f11378q;

    /* renamed from: r  reason: collision with root package name */
    public int f11379r;

    /* renamed from: s  reason: collision with root package name */
    public View f11380s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0775a(U u7, d dVar, C0700a c0700a, n nVar) {
        super(u7, dVar, c0700a);
        g.f(u7, "layoutManager");
        g.f(dVar, "layoutInfo");
        g.f(c0700a, "layoutAlignment");
        g.f(nVar, "onChildLayoutListener");
        this.f11374l = nVar;
        this.f11375m = new Rect();
        C0657b c0657b = dVar.f11019b;
        int i7 = c0657b.f10148b;
        View[] viewArr = new View[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            viewArr[i8] = null;
        }
        this.n = viewArr;
        int i9 = c0657b.f10148b;
        b bVar = new b(i9, dVar.d.l());
        this.f11376o = bVar;
        this.f11377p = new C4.b(u7);
        b bVar2 = new b(i9, bVar.f11382b);
        bVar2.a(bVar);
        this.f11378q = bVar2;
        this.f11379r = -1;
    }

    public static boolean q(int i7, int i8, int i9) {
        int mode = View.MeasureSpec.getMode(i8);
        int size = View.MeasureSpec.getSize(i8);
        if (i9 > 0 && i7 != i9) {
            return false;
        }
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                return true;
            }
            if (mode != 1073741824 || size != i7) {
                return false;
            }
            return true;
        } else if (size < i7) {
            return false;
        } else {
            return true;
        }
    }

    @Override // h5.i
    public final View c(int i7, e eVar, C0852F c0852f, a0 a0Var, g0 g0Var) {
        int a7;
        int i8;
        int i9;
        g.f(eVar, "layoutRequest");
        g.f(c0852f, "viewProvider");
        g.f(a0Var, "recycler");
        g.f(g0Var, "state");
        this.f11379r = i7;
        C0700a c0700a = this.f11052c;
        int a8 = ((C0701b) c0700a.f).a((s) c0700a.f10432e);
        b bVar = this.f11376o;
        bVar.c(a8);
        C0701b c0701b = (C0701b) c0700a.f;
        int a9 = c0701b.a((s) c0700a.f10432e);
        b bVar2 = this.f11378q;
        bVar2.c(a9);
        int max = Math.max(0, i7 - o(i7, a0Var, g0Var));
        boolean z7 = eVar.f;
        c cVar = c.f11014r;
        c cVar2 = c.f11015s;
        eVar.a();
        if (!z7) {
            eVar.f11026a = cVar2;
            eVar.f11028c = eVar.f11027b;
            eVar.f11029e = max;
            eVar.c();
            eVar.f11029e = max;
            a7 = c0701b.a((s) c0700a.f10432e);
        } else {
            eVar.f11026a = cVar;
            eVar.f11028c = eVar.f11027b.a();
            eVar.f11029e = max;
            eVar.c();
            eVar.f11029e = max;
            a7 = c0701b.a((s) c0700a.f10432e);
        }
        eVar.f11033j = a7;
        eVar.d(1);
        b(eVar, c0852f, a0Var, g0Var);
        View view = this.f11380s;
        if (view != null) {
            this.f11380s = null;
            bVar2.a(bVar);
            int i10 = bVar2.f11383c;
            int[] iArr = bVar2.f11386h;
            if (i10 == -1) {
                i8 = -1;
            } else {
                i8 = iArr[i10];
            }
            eVar.a();
            eVar.f11026a = cVar;
            eVar.f11028c = eVar.f11027b.a();
            eVar.f11029e = i8;
            eVar.c();
            int i11 = bVar2.f;
            eVar.f11033j = i11;
            d dVar = this.f11051b;
            eVar.d(i11 - dVar.f11020c.k());
            b(eVar, c0852f, a0Var, g0Var);
            int i12 = bVar2.d;
            if (i12 == -1) {
                i9 = -1;
            } else {
                i9 = iArr[i12];
            }
            eVar.a();
            eVar.f11026a = cVar2;
            eVar.f11028c = eVar.f11027b;
            eVar.f11029e = i9;
            eVar.c();
            eVar.f11033j = bVar2.f11385g;
            eVar.d(dVar.f11020c.g() - eVar.f11033j);
            b(eVar, c0852f, a0Var, g0Var);
            this.f11379r = -1;
            return view;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c4  */
    @Override // h5.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(h5.e r22, k.C0852F r23, w0.a0 r24, w0.g0 r25, androidx.leanback.widget.C0306n r26) {
        /*
            Method dump skipped, instructions count: 877
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i5.C0775a.d(h5.e, k.F, w0.a0, w0.g0, androidx.leanback.widget.n):void");
    }

    @Override // h5.i
    public final void e(View view, View view2, e eVar, C0852F c0852f, a0 a0Var, g0 g0Var) {
        c cVar;
        c cVar2;
        boolean z7;
        c cVar3;
        g.f(eVar, "layoutRequest");
        g.f(c0852f, "scrapViewProvider");
        g.f(a0Var, "recycler");
        g.f(g0Var, "state");
        d dVar = this.f11051b;
        dVar.getClass();
        int f = d.k(view).f15490a.f();
        k kVar = new k(0);
        k kVar2 = new k(0);
        k kVar3 = (k) c0852f.f11874r;
        int k5 = kVar3.k();
        int i7 = 0;
        while (true) {
            cVar = c.f11015s;
            cVar2 = c.f11014r;
            if (i7 >= k5) {
                break;
            }
            int g7 = kVar3.g(i7);
            k0 k0Var = (k0) kVar3.l(i7);
            k kVar4 = kVar3;
            View view3 = k0Var.f15576a;
            int i8 = k5;
            g.e(view3, "itemView");
            int i9 = d.k(view3).f10146h;
            if (i9 != -1) {
                if (g7 < f) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (z7 != eVar.f) {
                    cVar3 = cVar2;
                } else {
                    cVar3 = cVar;
                }
                View view4 = k0Var.f15576a;
                g.e(view4, "itemView");
                Integer valueOf = Integer.valueOf(dVar.i(view4));
                if (cVar3 == cVar2) {
                    kVar.i(i9, valueOf);
                } else {
                    kVar2.i(i9, valueOf);
                }
            }
            i7++;
            kVar3 = kVar4;
            k5 = i8;
        }
        int k7 = kVar.k();
        int i10 = 0;
        for (int i11 = 0; i11 < k7; i11++) {
            kVar.g(i11);
            i10 += ((Number) kVar.l(i11)).intValue();
        }
        int k8 = kVar2.k();
        int i12 = 0;
        for (int i13 = 0; i13 < k8; i13++) {
            kVar2.g(i13);
            i12 += ((Number) kVar2.l(i13)).intValue();
        }
        int i14 = DpadRecyclerView.l1;
        if (i10 > 0) {
            int f7 = d.k(view).f15490a.f();
            eVar.a();
            eVar.f11026a = cVar2;
            eVar.f11028c = eVar.f11027b.a();
            eVar.f11029e = f7;
            eVar.c();
            eVar.f11033j = dVar.j(view);
            eVar.d(i10);
            c0852f.E(eVar);
            b(eVar, c0852f, a0Var, g0Var);
        }
        if (i12 > 0) {
            int f8 = d.k(view2).f15490a.f();
            eVar.a();
            eVar.f11026a = cVar;
            eVar.f11028c = eVar.f11027b;
            eVar.f11029e = f8;
            eVar.c();
            eVar.f11033j = dVar.h(view2);
            eVar.d(i12);
            c0852f.E(eVar);
            b(eVar, c0852f, a0Var, g0Var);
        }
    }

    @Override // h5.i
    public final void g(int i7) {
        b bVar = this.f11376o;
        bVar.f += i7;
        bVar.f11385g += i7;
        b bVar2 = this.f11378q;
        bVar2.f += i7;
        bVar2.f11385g += i7;
    }

    @Override // h5.i
    public final void h() {
        C4.b bVar = this.f11377p;
        ((SparseIntArray) bVar.f422s).clear();
        ((SparseIntArray) bVar.f423t).clear();
    }

    @Override // h5.i
    public final void i(g0 g0Var) {
        g.f(g0Var, "state");
        super.i(g0Var);
        C4.b bVar = this.f11377p;
        U u7 = (U) bVar.f421r;
        int y3 = u7.y();
        for (int i7 = 0; i7 < y3; i7++) {
            View x7 = u7.x(i7);
            if (x7 != null) {
                ViewGroup.LayoutParams layoutParams = x7.getLayoutParams();
                g.d(layoutParams, "null cannot be cast to non-null type com.rubensousa.dpadrecyclerview.layoutmanager.DpadLayoutParams");
                C0656a c0656a = (C0656a) layoutParams;
                int f = c0656a.f15490a.f();
                ((SparseIntArray) bVar.f422s).put(f, c0656a.f);
                ((SparseIntArray) bVar.f423t).put(f, c0656a.f10145g);
                ((SparseIntArray) bVar.f424u).put(f, c0656a.f10146h);
            }
        }
        int l7 = this.f11051b.d.l();
        b bVar2 = this.f11376o;
        bVar2.d(l7);
        this.f11378q.d(bVar2.f11382b);
    }

    public final View n(int i7) {
        View view = this.n[i7];
        if (view != null) {
            return view;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final int o(int i7, a0 a0Var, g0 g0Var) {
        boolean z7 = g0Var.f15543g;
        d dVar = this.f11051b;
        if (!z7) {
            return dVar.m(i7, true);
        }
        int i8 = ((SparseIntArray) this.f11377p.f423t).get(i7, -1);
        if (i8 != -1) {
            return i8;
        }
        int b7 = a0Var.b(i7);
        if (b7 == -1) {
            Log.w("DpadRecyclerView", "Cannot find post layout position for pre layout position: " + i7);
            return dVar.m(i7, false);
        }
        return dVar.m(b7, false);
    }

    public final int p(int i7, a0 a0Var, g0 g0Var) {
        boolean z7 = g0Var.f15543g;
        d dVar = this.f11051b;
        if (!z7) {
            dVar.f11019b.f10163t.getClass();
            return 1;
        }
        int i8 = ((SparseIntArray) this.f11377p.f422s).get(i7, -1);
        if (i8 != -1) {
            return i8;
        }
        if (a0Var.b(i7) == -1) {
            Log.w("DpadRecyclerView", "Cannot find post layout position for pre layout position: " + i7);
            dVar.f11019b.f10163t.getClass();
            return 1;
        }
        dVar.f11019b.f10163t.getClass();
        return 1;
    }

    public final void r(View view, C0656a c0656a, int i7, int i8, boolean z7) {
        U u7 = this.f11050a;
        if (z7) {
            if (u7.f15483h && q(view.getMeasuredWidth(), i7, ((ViewGroup.MarginLayoutParams) c0656a).width) && q(view.getMeasuredHeight(), i8, ((ViewGroup.MarginLayoutParams) c0656a).height)) {
                return;
            }
        } else if (!view.isLayoutRequested() && u7.f15483h && q(view.getWidth(), i7, ((ViewGroup.MarginLayoutParams) c0656a).width) && q(view.getHeight(), i8, ((ViewGroup.MarginLayoutParams) c0656a).height)) {
            return;
        }
        view.measure(i7, i8);
    }
}
