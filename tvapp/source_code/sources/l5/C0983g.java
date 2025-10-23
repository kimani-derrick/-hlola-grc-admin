package l5;

import H.j;
import android.graphics.PointF;
import android.view.View;
import com.rubensousa.dpadrecyclerview.DpadRecyclerView;
import d5.l;
import e5.C0658c;
import f5.C0700a;
import w0.e0;
import w0.g0;
/* renamed from: l5.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0983g extends AbstractC0977a {

    /* renamed from: s  reason: collision with root package name */
    public final j f12293s;

    /* renamed from: t  reason: collision with root package name */
    public final C0658c f12294t;

    /* renamed from: u  reason: collision with root package name */
    public final C0700a f12295u;

    /* renamed from: v  reason: collision with root package name */
    public final C0979c f12296v;

    /* renamed from: w  reason: collision with root package name */
    public final O2.e f12297w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, O2.e] */
    public C0983g(DpadRecyclerView dpadRecyclerView, int i7, h5.d dVar, j jVar, C0658c c0658c, C0700a c0700a, C0979c c0979c) {
        super(dpadRecyclerView, dVar);
        M5.g.f(dVar, "layoutInfo");
        M5.g.f(jVar, "spanFocusFinder");
        M5.g.f(c0658c, "pivotSelector");
        M5.g.f(c0700a, "alignment");
        M5.g.f(c0979c, "listener");
        this.f12293s = jVar;
        this.f12294t = c0658c;
        this.f12295u = c0700a;
        this.f12296v = c0979c;
        M5.g.f(dVar, "layoutInfo");
        ?? obj = new Object();
        obj.f2559a = i7;
        obj.f2561c = dVar;
        this.f12297w = obj;
        this.f15445a = -2;
    }

    @Override // w0.C
    public final PointF e(int i7) {
        float f;
        int i8 = this.f12297w.f2560b;
        if (i8 == 0) {
            return null;
        }
        if (i8 < 0) {
            f = -1.0f;
        } else {
            f = 1.0f;
        }
        if (this.f12269q.f11019b.b()) {
            return new PointF(f, 0.0f);
        }
        return new PointF(0.0f, f);
    }

    @Override // w0.C
    public final void h() {
        super.h();
        boolean z7 = this.f12270r;
        C0979c c0979c = this.f12296v;
        if (z7) {
            c0979c.f12274a.f12283k = null;
            return;
        }
        this.f12297w.f2560b = 0;
        View f = f(this.f15445a);
        if (f != null) {
            c0979c.getClass();
            C0980d c0980d = c0979c.f12274a;
            c0980d.f(f, null, true, c0980d.f12275a.S());
        } else {
            int i7 = this.f15445a;
            C0980d c0980d2 = c0979c.f12274a;
            if (i7 >= 0) {
                c0980d2.d(i7, 0, true);
            } else {
                C0980d.e(c0980d2, false);
            }
        }
        c0979c.f12274a.f12283k = null;
    }

    @Override // w0.C
    public final void i(View view, g0 g0Var, e0 e0Var) {
        M5.g.f(view, "targetView");
        M5.g.f(g0Var, "state");
        M5.g.f(e0Var, "action");
        C0700a c0700a = this.f12295u;
        c0700a.getClass();
        ((h5.d) c0700a.d).g(view);
        int c5 = c0700a.c(view, null);
        if (c5 == 0) {
            return;
        }
        int i7 = 0;
        if (!this.f12269q.f11019b.b()) {
            i7 = c5;
            c5 = 0;
        }
        e0Var.b(c5, i7, c((int) Math.sqrt((i7 * i7) + (c5 * c5))), this.f15452j);
    }

    public final void l(boolean z7) {
        O2.e eVar = this.f12297w;
        boolean r3 = ((h5.d) eVar.f2561c).r();
        int i7 = eVar.f2559a;
        if (z7 != r3) {
            int i8 = eVar.f2560b;
            if (i8 < i7) {
                eVar.f2560b = i8 + 1;
                return;
            }
            return;
        }
        int i9 = eVar.f2560b;
        if (i9 > (-i7)) {
            eVar.f2560b = i9 - 1;
        }
    }

    public final View m(int i7, j jVar, boolean z7) {
        boolean z8;
        View f;
        O2.e eVar = this.f12297w;
        if (!eVar.h()) {
            return null;
        }
        h5.d dVar = this.f12269q;
        boolean r3 = dVar.r();
        if (r3 ? eVar.f2560b < 0 : eVar.f2560b > 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8 != r3) {
            f = dVar.e();
        } else {
            f = dVar.f();
        }
        if (f == null) {
            return null;
        }
        l lVar = dVar.f11019b.f10163t;
        int f7 = h5.d.k(f).f15490a.f();
        View view = null;
        int i8 = i7;
        while (i8 != f7 && eVar.h()) {
            i8 = jVar.l(i8, lVar, z8, f7, r3);
            if (i8 == -1) {
                break;
            }
            View t5 = dVar.f11018a.t(i8);
            if (t5 != null && h5.d.q(t5)) {
                jVar.q(i8, lVar);
                eVar.f();
                view = t5;
                if (!z7) {
                    break;
                }
            }
        }
        if (view == null) {
            jVar.q(i7, lVar);
        }
        return view;
    }
}
