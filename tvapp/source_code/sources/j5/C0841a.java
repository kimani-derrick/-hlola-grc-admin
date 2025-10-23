package j5;

import M5.g;
import Z5.n;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.D;
import androidx.leanback.widget.C0306n;
import com.rubensousa.dpadrecyclerview.DpadRecyclerView;
import d5.s;
import e5.C0656a;
import f5.C0700a;
import f5.C0701b;
import h5.c;
import h5.d;
import h5.e;
import h5.i;
import h5.j;
import k.C0852F;
import o.k;
import w0.U;
import w0.V;
import w0.a0;
import w0.g0;
import w0.k0;
/* renamed from: j5.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0841a extends i {

    /* renamed from: l  reason: collision with root package name */
    public final n f11856l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0841a(U u7, d dVar, C0700a c0700a, n nVar) {
        super(u7, dVar, c0700a);
        g.f(u7, "layoutManager");
        g.f(dVar, "layoutInfo");
        g.f(c0700a, "layoutAlignment");
        g.f(nVar, "onChildLayoutListener");
        this.f11856l = nVar;
    }

    @Override // h5.i
    public final View c(int i7, e eVar, C0852F c0852f, a0 a0Var, g0 g0Var) {
        int measuredWidth;
        int i8;
        int i9;
        g.f(eVar, "layoutRequest");
        g.f(c0852f, "viewProvider");
        g.f(a0Var, "recycler");
        g.f(g0Var, "state");
        View d = a0Var.d(i7);
        g.e(d, "getViewForPosition(...)");
        U u7 = this.f11050a;
        u7.b(d);
        u7.Y(d);
        if (eVar.f11035l) {
            measuredWidth = d.getMeasuredHeight();
        } else {
            measuredWidth = d.getMeasuredWidth();
        }
        C0700a c0700a = this.f11052c;
        c0700a.getClass();
        c0700a.h(d);
        ViewGroup.LayoutParams layoutParams = d.getLayoutParams();
        g.d(layoutParams, "null cannot be cast to non-null type com.rubensousa.dpadrecyclerview.layoutmanager.DpadLayoutParams");
        int a7 = ((C0701b) c0700a.f).a((s) c0700a.f10432e) - ((C0656a) layoutParams).f10144e;
        int i10 = measuredWidth + a7;
        if (eVar.f11035l) {
            i8 = ((V) d.getLayoutParams()).f15491b.top;
        } else {
            i8 = ((V) d.getLayoutParams()).f15491b.left;
        }
        int i11 = a7 - i8;
        if (eVar.f11035l) {
            i9 = ((V) d.getLayoutParams()).f15491b.bottom;
        } else {
            i9 = ((V) d.getLayoutParams()).f15491b.right;
        }
        int i12 = i10 + i9;
        boolean z7 = eVar.f11035l;
        j jVar = this.d;
        if (z7) {
            jVar.f11060b = i11;
            jVar.d = i12;
            n(d, jVar, eVar);
        } else {
            jVar.f11059a = i11;
            jVar.f11061c = i12;
            o(d, jVar, eVar);
        }
        n nVar = this.f11856l;
        nVar.y(d);
        j(d, jVar);
        int i13 = DpadRecyclerView.l1;
        jVar.f11059a = 0;
        jVar.f11060b = 0;
        jVar.f11061c = 0;
        jVar.d = 0;
        nVar.z(d);
        eVar.a();
        eVar.f11026a = c.f11014r;
        eVar.f11028c = eVar.f11027b.a();
        eVar.f11029e = i7;
        eVar.c();
        d dVar = this.f11051b;
        int j7 = dVar.j(d);
        eVar.f11033j = j7;
        eVar.d(Math.max(0, j7 - dVar.f11020c.k()));
        b(eVar, c0852f, a0Var, g0Var);
        eVar.a();
        eVar.f11026a = c.f11015s;
        eVar.f11028c = eVar.f11027b;
        eVar.f11029e = i7;
        eVar.c();
        eVar.f11033j = dVar.h(d);
        eVar.d(Math.max(0, dVar.f11020c.g() - eVar.f11033j));
        b(eVar, c0852f, a0Var, g0Var);
        return d;
    }

    @Override // h5.i
    public final void d(e eVar, C0852F c0852f, a0 a0Var, g0 g0Var, C0306n c0306n) {
        int i7;
        g.f(eVar, "layoutRequest");
        g.f(c0852f, "viewProvider");
        g.f(a0Var, "recycler");
        g.f(g0Var, "state");
        g.f(c0306n, "layoutResult");
        View z7 = c0852f.z(eVar, g0Var);
        a(z7, eVar);
        n nVar = this.f11856l;
        nVar.y(z7);
        this.f11050a.Y(z7);
        boolean b7 = eVar.b();
        d dVar = this.f11051b;
        j jVar = this.d;
        if (b7) {
            i7 = dVar.i(z7);
            if (eVar.f11035l) {
                n(z7, jVar, eVar);
                int i8 = eVar.f11033j;
                jVar.f11060b = i8;
                jVar.d = i8 + i7;
            } else {
                o(z7, jVar, eVar);
                int i9 = eVar.f11033j;
                jVar.f11059a = i9;
                jVar.f11061c = i9 + i7;
            }
        } else {
            i7 = dVar.i(z7);
            if (eVar.f11035l) {
                n(z7, jVar, eVar);
                int i10 = eVar.f11033j;
                jVar.d = i10;
                jVar.f11060b = i10 - i7;
            } else {
                o(z7, jVar, eVar);
                int i11 = eVar.f11033j;
                jVar.f11061c = i11;
                jVar.f11059a = i11 - i7;
            }
        }
        c0306n.f6611a = i7;
        int i12 = DpadRecyclerView.l1;
        if (i.l(z7)) {
            c0306n.f6612b = true;
        }
        j(z7, jVar);
        jVar.f11059a = 0;
        jVar.f11060b = 0;
        jVar.f11061c = 0;
        jVar.d = 0;
        nVar.z(z7);
        nVar.x();
    }

    @Override // h5.i
    public final void e(View view, View view2, e eVar, C0852F c0852f, a0 a0Var, g0 g0Var) {
        c cVar;
        c cVar2;
        boolean z7;
        g.f(eVar, "layoutRequest");
        g.f(c0852f, "scrapViewProvider");
        g.f(a0Var, "recycler");
        g.f(g0Var, "state");
        d dVar = this.f11051b;
        dVar.getClass();
        int f = d.k(view).f15490a.f();
        k kVar = (k) c0852f.f11874r;
        int k5 = kVar.k();
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            cVar = c.f11015s;
            cVar2 = c.f11014r;
            if (i7 >= k5) {
                break;
            }
            int g7 = kVar.g(i7);
            k0 k0Var = (k0) kVar.l(i7);
            int i10 = f;
            if (g7 < f) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (z7 != eVar.f) {
                cVar = cVar2;
            }
            View view3 = k0Var.f15576a;
            g.e(view3, "itemView");
            int i11 = dVar.i(view3);
            if (cVar == cVar2) {
                i8 += i11;
            } else {
                i9 += i11;
            }
            i7++;
            f = i10;
        }
        int i12 = DpadRecyclerView.l1;
        if (i8 > 0) {
            int f7 = d.k(view).f15490a.f();
            eVar.a();
            eVar.f11026a = cVar2;
            eVar.f11028c = eVar.f11027b.a();
            eVar.f11029e = f7;
            eVar.c();
            eVar.f11030g = false;
            eVar.f11033j = dVar.j(view);
            eVar.d(i8);
            c0852f.E(eVar);
            b(eVar, c0852f, a0Var, g0Var);
        }
        if (i9 > 0) {
            int f8 = d.k(view2).f15490a.f();
            eVar.a();
            eVar.f11026a = cVar;
            eVar.f11028c = eVar.f11027b;
            eVar.f11029e = f8;
            eVar.c();
            eVar.f11030g = false;
            eVar.f11033j = dVar.h(view2);
            eVar.d(i9);
            c0852f.E(eVar);
            b(eVar, c0852f, a0Var, g0Var);
        }
    }

    @Override // h5.i
    public final boolean f(View view, e eVar, C0852F c0852f, a0 a0Var, g0 g0Var) {
        int f;
        View f7;
        int f8;
        g.f(view, "pivotView");
        g.f(eVar, "layoutRequest");
        g.f(c0852f, "viewProvider");
        g.f(a0Var, "recycler");
        g.f(g0Var, "state");
        d dVar = this.f11051b;
        View e3 = dVar.e();
        if (e3 == null || (f = d.k(e3).f15490a.f()) == -1 || (f7 = dVar.f()) == null || (f8 = d.k(f7).f15490a.f()) == -1) {
            return false;
        }
        int max = Math.max(0, dVar.j(view));
        int i7 = dVar.i(view) + Math.max(0, dVar.f11020c.g() - dVar.h(view));
        int i8 = dVar.i(view) + max;
        int i9 = dVar.i(view) + dVar.f11020c.l();
        eVar.f11030g = true;
        eVar.a();
        c cVar = c.f11015s;
        eVar.f11026a = cVar;
        eVar.f11028c = eVar.f11027b;
        eVar.f11029e = f;
        eVar.c();
        eVar.f11033j = dVar.h(e3);
        eVar.d(i8);
        b(eVar, c0852f, a0Var, g0Var);
        int i10 = eVar.f11033j;
        D d = this.f11053e;
        d.P(a0Var, eVar);
        eVar.a();
        c cVar2 = c.f11014r;
        eVar.f11026a = cVar2;
        eVar.f11028c = eVar.f11027b.a();
        eVar.f11029e = f8;
        eVar.c();
        eVar.f11033j = dVar.j(f7);
        eVar.d(i7);
        b(eVar, c0852f, a0Var, g0Var);
        int i11 = eVar.f11033j;
        d.Q(a0Var, eVar);
        eVar.f11030g = false;
        if (i10 - i11 < i9) {
            eVar.f11029e = f;
            eVar.c();
            return false;
        }
        eVar.f11039q = true;
        eVar.a();
        eVar.f11026a = cVar;
        eVar.f11028c = eVar.f11027b;
        eVar.f11029e = f;
        eVar.c();
        eVar.f11033j = dVar.h(e3);
        eVar.d(Math.max(0, dVar.f11020c.g() - dVar.h(e3)));
        b(eVar, c0852f, a0Var, g0Var);
        eVar.a();
        eVar.f11026a = cVar2;
        eVar.f11028c = eVar.f11027b.a();
        eVar.f11029e = f8;
        eVar.c();
        eVar.f11033j = dVar.j(f7);
        eVar.d(Math.max(0, dVar.j(f7) - dVar.f11020c.k()));
        b(eVar, c0852f, a0Var, g0Var);
        return true;
    }

    public final void n(View view, j jVar, e eVar) {
        int i7;
        if (eVar.f) {
            i7 = Gravity.getAbsoluteGravity(eVar.f11034k & 8388615, 1);
        } else {
            i7 = eVar.f11034k & 7;
        }
        d dVar = this.f11051b;
        U u7 = this.f11050a;
        if (i7 != 1) {
            if (i7 != 5) {
                if (i7 != 17) {
                    int L6 = u7.L();
                    jVar.f11059a = L6;
                    jVar.f11061c = dVar.f11020c.d(view) + L6;
                    return;
                }
            } else {
                int d = dVar.f11020c.d(view);
                int M6 = u7.n - u7.M();
                jVar.f11061c = M6;
                jVar.f11059a = M6 - d;
                return;
            }
        }
        int d7 = dVar.f11020c.d(view);
        int i8 = (u7.n / 2) - (d7 / 2);
        jVar.f11059a = i8;
        jVar.f11061c = i8 + d7;
    }

    public final void o(View view, j jVar, e eVar) {
        int i7 = eVar.f11034k & 112;
        d dVar = this.f11051b;
        U u7 = this.f11050a;
        if (i7 != 16 && i7 != 17) {
            if (i7 != 80) {
                int N6 = u7.N();
                jVar.f11060b = N6;
                jVar.d = dVar.f11020c.d(view) + N6;
                return;
            }
            int d = dVar.f11020c.d(view);
            int K6 = u7.f15489o - u7.K();
            jVar.d = K6;
            jVar.f11060b = K6 - d;
            return;
        }
        int d7 = dVar.f11020c.d(view);
        int i8 = (u7.f15489o / 2) - (d7 / 2);
        jVar.f11060b = i8;
        jVar.d = i8 + d7;
    }
}
