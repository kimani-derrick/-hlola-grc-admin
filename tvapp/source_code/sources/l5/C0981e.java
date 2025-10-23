package l5;

import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.rubensousa.dpadrecyclerview.DpadRecyclerView;
import e5.C0658c;
import f5.C0700a;
import w0.e0;
import w0.g0;
/* renamed from: l5.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0981e extends AbstractC0977a {

    /* renamed from: s  reason: collision with root package name */
    public final RecyclerView f12287s;

    /* renamed from: t  reason: collision with root package name */
    public final C0700a f12288t;

    /* renamed from: u  reason: collision with root package name */
    public final C0979c f12289u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0981e(DpadRecyclerView dpadRecyclerView, int i7, int i8, h5.d dVar, C0700a c0700a, C0979c c0979c) {
        super(dpadRecyclerView, dVar);
        M5.g.f(dVar, "layoutInfo");
        M5.g.f(c0700a, "alignment");
        M5.g.f(c0979c, "listener");
        this.f12287s = dpadRecyclerView;
        this.f12288t = c0700a;
        this.f12289u = c0979c;
        this.f15445a = i7;
    }

    @Override // l5.AbstractC0977a, w0.C
    public final float b(DisplayMetrics displayMetrics) {
        return super.b(displayMetrics) * this.f12269q.f11019b.f10164u;
    }

    @Override // w0.C
    public final PointF e(int i7) {
        float f;
        if (this.f15446b.f6895D.y() == 0) {
            return null;
        }
        View childAt = this.f12287s.getChildAt(0);
        if (childAt != null) {
            h5.d dVar = this.f12269q;
            dVar.getClass();
            int f7 = h5.d.k(childAt).f15490a.f();
            if (!dVar.r() ? i7 < f7 : i7 > f7) {
                f = -1.0f;
            } else {
                f = 1.0f;
            }
            if (dVar.f11019b.b()) {
                return new PointF(f, 0.0f);
            }
            return new PointF(0.0f, f);
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    @Override // w0.C
    public final void h() {
        super.h();
        boolean z7 = this.f12270r;
        C0979c c0979c = this.f12289u;
        if (!z7) {
            View f = f(this.f15445a);
            if (f != null) {
                c0979c.getClass();
                C0980d c0980d = c0979c.f12274a;
                boolean S6 = c0980d.f12275a.S();
                C0658c c0658c = c0980d.f12278e;
                if (S6) {
                    c0980d.f12279g = true;
                    C0700a c0700a = c0980d.f12277c;
                    c0700a.getClass();
                    ((h5.d) c0700a.d).g(f);
                    c0658c.d(f);
                    c0980d.f12279g = false;
                }
                c0658c.a();
            } else {
                int i7 = this.f15445a;
                if (i7 >= 0) {
                    C0980d c0980d2 = c0979c.f12274a;
                    C0658c c0658c2 = c0980d2.f12278e;
                    if (c0658c2.j(i7, 0)) {
                        c0658c2.f10170e = Integer.MIN_VALUE;
                        c0658c2.f = true;
                        c0980d2.f12275a.H0();
                    }
                }
            }
        }
        C0980d c0980d3 = c0979c.f12274a;
        c0980d3.f12276b.f11021e = false;
        c0980d3.f12282j = null;
    }

    @Override // w0.C
    public final void i(View view, g0 g0Var, e0 e0Var) {
        M5.g.f(view, "targetView");
        M5.g.f(g0Var, "state");
        M5.g.f(e0Var, "action");
        C0700a c0700a = this.f12288t;
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
}
