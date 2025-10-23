package h5;

import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import d5.k;
import d5.l;
import e5.C0656a;
import e5.C0657b;
import w0.U;
import w0.k0;
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final U f11018a;

    /* renamed from: b  reason: collision with root package name */
    public final C0657b f11019b;

    /* renamed from: c  reason: collision with root package name */
    public androidx.emoji2.text.f f11020c;
    public androidx.emoji2.text.f d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f11021e;
    public boolean f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f11022g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f11023h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f11024i;

    /* renamed from: j  reason: collision with root package name */
    public RecyclerView f11025j;

    public d(U u7, C0657b c0657b) {
        M5.g.f(u7, "layout");
        this.f11018a = u7;
        this.f11019b = c0657b;
        this.f11020c = androidx.emoji2.text.f.a(u7, c0657b.f10147a);
        this.d = androidx.emoji2.text.f.a(u7, !c0657b.c());
    }

    public static int d(View view) {
        M5.g.f(view, "view");
        return k(view).f15490a.d();
    }

    public static C0656a k(View view) {
        M5.g.f(view, "child");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        M5.g.d(layoutParams, "null cannot be cast to non-null type com.rubensousa.dpadrecyclerview.layoutmanager.DpadLayoutParams");
        return (C0656a) layoutParams;
    }

    public static boolean q(View view) {
        if (view.getVisibility() == 0 && (view.isFocusable() || view.hasFocusable())) {
            return true;
        }
        return false;
    }

    public final int a() {
        View x7;
        U u7 = this.f11018a;
        if (u7.y() == 0 || (x7 = u7.x(0)) == null) {
            return -1;
        }
        return d(x7);
    }

    public final int b(int i7, int i8) {
        int i9;
        boolean z7;
        boolean z8;
        if (i7 < i8) {
            i9 = 1;
        } else {
            i9 = -1;
        }
        int k5 = this.f11020c.k();
        int g7 = this.f11020c.g();
        while (i7 != i8) {
            View x7 = this.f11018a.x(i7);
            if (x7 != null) {
                int j7 = j(x7);
                int h7 = h(x7);
                boolean z9 = false;
                if (j7 >= k5 && h7 <= g7) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (h7 >= k5 && j7 <= k5) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (j7 <= g7 && h7 >= g7) {
                    z9 = true;
                }
                if (!z7 && !z9 && !z8) {
                    i7 += i9;
                } else {
                    return k(x7).f15490a.f();
                }
            }
        }
        return -1;
    }

    public final int c() {
        View x7;
        U u7 = this.f11018a;
        if (u7.y() == 0 || (x7 = u7.x(u7.y() - 1)) == null) {
            return -1;
        }
        return d(x7);
    }

    public final View e() {
        U u7 = this.f11018a;
        return u7.x(u7.y() - 1);
    }

    public final View f() {
        return this.f11018a.x(0);
    }

    public final k0 g(View view) {
        View C3;
        M5.g.f(view, "view");
        RecyclerView recyclerView = this.f11025j;
        if (recyclerView == null || (C3 = recyclerView.C(view)) == null) {
            return null;
        }
        return recyclerView.M(C3);
    }

    public final int h(View view) {
        M5.g.f(view, "view");
        return this.f11020c.b(view);
    }

    public final int i(View view) {
        M5.g.f(view, "view");
        return this.f11020c.c(view);
    }

    public final int j(View view) {
        M5.g.f(view, "view");
        return this.f11020c.e(view);
    }

    public final int l(int i7) {
        C0657b c0657b = this.f11019b;
        l lVar = c0657b.f10163t;
        int i8 = c0657b.f10148b;
        if (!lVar.d) {
            return i7 / i8;
        }
        SparseIntArray sparseIntArray = lVar.f9265b;
        int i9 = sparseIntArray.get(i7, -1);
        if (i9 != -1) {
            return i9;
        }
        int i10 = i7 / i8;
        sparseIntArray.put(i7, i10);
        return i10;
    }

    public final int m(int i7, boolean z7) {
        C0657b c0657b = this.f11019b;
        if (z7) {
            return c0657b.f10163t.a(i7, c0657b.f10148b);
        }
        l lVar = c0657b.f10163t;
        int i8 = c0657b.f10148b;
        ((k) lVar).getClass();
        return i7 % i8;
    }

    public final boolean n() {
        k0 k0Var;
        if (this.f11018a.I() != 0) {
            RecyclerView recyclerView = this.f11025j;
            if (recyclerView != null) {
                k0Var = recyclerView.G(0);
            } else {
                k0Var = null;
            }
            if (k0Var == null) {
                return false;
            }
        }
        return true;
    }

    public final boolean o() {
        k0 k0Var;
        int I6 = this.f11018a.I();
        if (I6 == 0) {
            return true;
        }
        RecyclerView recyclerView = this.f11025j;
        if (recyclerView != null) {
            k0Var = recyclerView.G(I6 - 1);
        } else {
            k0Var = null;
        }
        if (k0Var != null) {
            return true;
        }
        return false;
    }

    public final boolean p(int i7) {
        k0 G6;
        View view;
        RecyclerView recyclerView = this.f11025j;
        if (recyclerView == null || (G6 = recyclerView.G(i7)) == null || (view = G6.f15576a) == null || view.getLeft() < 0 || view.getRight() > recyclerView.getWidth() || view.getTop() < 0 || view.getBottom() > recyclerView.getHeight()) {
            return false;
        }
        return true;
    }

    public final boolean r() {
        C0657b c0657b = this.f11019b;
        if (!c0657b.c() && this.f11018a.J() == 1) {
            if (!c0657b.f10154j) {
                return true;
            }
            return false;
        }
        return c0657b.f10154j;
    }
}
