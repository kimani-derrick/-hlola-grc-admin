package f5;

import M5.g;
import android.view.View;
import android.view.ViewGroup;
import d5.C0556b;
import d5.r;
import d5.s;
import e5.C0656a;
import h5.d;
import h6.F;
import h6.G;
import h6.H;
import h6.n;
import java.io.IOException;
import l6.e;
import l6.i;
import l6.k;
import o6.C1072a;
import o6.EnumC1073b;
import p6.l;
import w0.U;
/* renamed from: f5.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0700a {

    /* renamed from: a  reason: collision with root package name */
    public boolean f10429a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f10430b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f10431c;
    public final Object d;

    /* renamed from: e  reason: collision with root package name */
    public Object f10432e;
    public final Object f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f10433g;

    public C0700a(i iVar, n nVar, e eVar, m6.c cVar) {
        g.f(nVar, "eventListener");
        this.f10431c = iVar;
        this.d = nVar;
        this.f10432e = eVar;
        this.f = cVar;
        this.f10433g = cVar.h();
    }

    public IOException a(boolean z7, boolean z8, IOException iOException) {
        if (iOException != null) {
            g(iOException);
        }
        n nVar = (n) this.d;
        i iVar = (i) this.f10431c;
        if (z8) {
            nVar.getClass();
            if (iOException != null) {
                g.f(iVar, "call");
            } else {
                g.f(iVar, "call");
            }
        }
        if (z7) {
            nVar.getClass();
            if (iOException != null) {
                g.f(iVar, "call");
            } else {
                g.f(iVar, "call");
            }
        }
        return iVar.k(this, z8, z7, iOException);
    }

    public int b(View view) {
        int i7;
        int i8;
        int i9;
        g.f(view, "view");
        h(view);
        i();
        int d = d(view);
        s sVar = (s) this.f10432e;
        C0701b c0701b = (C0701b) this.f;
        c0701b.getClass();
        g.f(sVar, "alignment");
        int a7 = c0701b.a(sVar);
        boolean g7 = c0701b.g(d, a7, sVar);
        boolean f = c0701b.f(d, a7, sVar);
        if (!c0701b.f10436c) {
            if (g7) {
                i7 = c0701b.f10434a;
                i8 = c0701b.f10437e;
                return Math.min(i7, d - i8);
            }
            if (f) {
                i9 = c0701b.f10435b;
                return Math.max(i9, d - c0701b.b());
            }
            return d - a7;
        } else if (f) {
            i9 = c0701b.f10435b;
            return Math.max(i9, d - c0701b.b());
        } else {
            if (g7) {
                i7 = c0701b.f10434a;
                i8 = c0701b.f10437e;
                return Math.min(i7, d - i8);
            }
            return d - a7;
        }
    }

    public int c(View view, View view2) {
        g.f(view, "view");
        int b7 = b(view);
        if (view2 != null) {
            ((d) this.d).g(view);
        }
        return b7;
    }

    public int d(View view) {
        int left;
        int i7;
        h(view);
        if (this.f10429a) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            g.d(layoutParams, "null cannot be cast to non-null type com.rubensousa.dpadrecyclerview.layoutmanager.DpadLayoutParams");
            left = view.getTop();
            i7 = ((C0656a) layoutParams).f10144e;
        } else {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            g.d(layoutParams2, "null cannot be cast to non-null type com.rubensousa.dpadrecyclerview.layoutmanager.DpadLayoutParams");
            left = view.getLeft();
            i7 = ((C0656a) layoutParams2).f10144e;
        }
        return left + i7;
    }

    public H e(G g7) {
        m6.c cVar = (m6.c) this.f;
        try {
            String b7 = G.b(g7, "Content-Type");
            long b8 = cVar.b(g7);
            return new H(b7, b8, l.c(new l6.d(this, cVar.e(g7), b8)), 1);
        } catch (IOException e3) {
            ((n) this.d).getClass();
            g.f((i) this.f10431c, "call");
            g(e3);
            throw e3;
        }
    }

    public F f(boolean z7) {
        try {
            F g7 = ((m6.c) this.f).g(z7);
            if (g7 != null) {
                g7.f11090m = this;
            }
            return g7;
        } catch (IOException e3) {
            ((n) this.d).getClass();
            g.f((i) this.f10431c, "call");
            g(e3);
            throw e3;
        }
    }

    public void g(IOException iOException) {
        int i7;
        this.f10430b = true;
        ((e) this.f10432e).c(iOException);
        k h7 = ((m6.c) this.f).h();
        i iVar = (i) this.f10431c;
        synchronized (h7) {
            try {
                g.f(iVar, "call");
                if (iOException instanceof o6.F) {
                    if (((o6.F) iOException).f12984q == EnumC1073b.f12989v) {
                        int i8 = h7.n + 1;
                        h7.n = i8;
                        if (i8 > 1) {
                            h7.f12350j = true;
                            h7.f12352l++;
                        }
                    } else if (((o6.F) iOException).f12984q != EnumC1073b.f12990w || !iVar.F) {
                        h7.f12350j = true;
                        i7 = h7.f12352l;
                        h7.f12352l = i7 + 1;
                    }
                } else if (h7.f12347g == null || (iOException instanceof C1072a)) {
                    h7.f12350j = true;
                    if (h7.f12353m == 0) {
                        k.d(iVar.f12333q, h7.f12344b, iOException);
                        i7 = h7.f12352l;
                        h7.f12352l = i7 + 1;
                    }
                }
            } finally {
            }
        }
    }

    public void h(View view) {
        int measuredWidth;
        int g7;
        int g8;
        int measuredHeight;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        g.d(layoutParams, "null cannot be cast to non-null type com.rubensousa.dpadrecyclerview.layoutmanager.DpadLayoutParams");
        C0656a c0656a = (C0656a) layoutParams;
        if (((d) this.d).g(view) == null) {
            return;
        }
        boolean z7 = this.f10429a;
        boolean z8 = this.f10430b;
        Z5.n nVar = (Z5.n) this.f10433g;
        nVar.getClass();
        C0556b c0556b = (C0556b) nVar.f4918q;
        int i7 = AbstractC0702c.f10440a;
        g.f(c0556b, "alignment");
        int i8 = AbstractC0702c.f10440a;
        int i9 = 0;
        if (z7) {
            if (view.isLaidOut()) {
                measuredHeight = view.getHeight();
            } else {
                measuredHeight = view.getMeasuredHeight();
            }
            if (c0556b.a() && view.getBaseline() != -1) {
                i9 = view.getBaseline();
            }
            if (!z8) {
                if (c0556b.h()) {
                    i9 = (int) (c0556b.d() * measuredHeight);
                }
                if (c0556b.e()) {
                    if (c0556b.d() == 0.0f) {
                        i9 += view.getPaddingTop();
                    } else if (c0556b.d() == 1.0f) {
                        i9 -= view.getPaddingBottom();
                    }
                }
                g8 = c0556b.g();
                g7 = g8 + i9;
                c0656a.f10144e = g7;
            }
            if (c0556b.h()) {
                i9 = (int) ((1.0f - c0556b.d()) * measuredHeight);
            }
            if (c0556b.e()) {
                if (c0556b.d() == 0.0f) {
                    i9 -= view.getPaddingBottom();
                } else if (c0556b.d() == 1.0f) {
                    i9 += view.getPaddingTop();
                }
            }
            g7 = i9 - c0556b.g();
            c0656a.f10144e = g7;
        }
        if (view.isLaidOut()) {
            measuredWidth = view.getWidth();
        } else {
            measuredWidth = view.getMeasuredWidth();
        }
        if (!z8) {
            if (c0556b.h()) {
                i9 = (int) (c0556b.d() * measuredWidth);
            }
            if (c0556b.e()) {
                if (c0556b.d() == 0.0f) {
                    i9 += view.getPaddingLeft();
                } else if (c0556b.d() == 1.0f) {
                    i9 -= view.getPaddingRight();
                }
            }
            g8 = c0556b.g();
            g7 = g8 + i9;
            c0656a.f10144e = g7;
        }
        if (c0556b.h()) {
            i9 = (int) ((1.0f - c0556b.d()) * measuredWidth);
        }
        if (c0556b.e()) {
            if (c0556b.d() == 0.0f) {
                i9 -= view.getPaddingRight();
            } else if (c0556b.d() == 1.0f) {
                i9 += view.getPaddingLeft();
            }
        }
        g7 = i9 - c0556b.g();
        c0656a.f10144e = g7;
    }

    public void i() {
        int c5;
        int i7;
        int i8;
        int i9;
        boolean z7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int h7;
        int j7;
        Integer valueOf;
        U u7 = (U) this.f10431c;
        int I6 = u7.I();
        if (I6 == 0) {
            return;
        }
        boolean z8 = this.f10430b;
        boolean z9 = true;
        int i15 = 0;
        d dVar = (d) this.d;
        if (!z8) {
            int c6 = dVar.c();
            i9 = I6 - 1;
            c5 = dVar.a();
            i7 = c6;
            i8 = 0;
        } else {
            int a7 = dVar.a();
            c5 = dVar.c();
            i7 = a7;
            i8 = I6 - 1;
            i9 = 0;
        }
        C0701b c0701b = (C0701b) this.f;
        if (i7 >= 0 && c5 >= 0) {
            boolean z10 = this.f10430b;
            if (z10 ? i7 == i8 : i7 == i9) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (z10 ? c5 != i9 : c5 != i8) {
                z9 = false;
            }
            if (!z7 && C0701b.d(c0701b.f10438g) && !z9 && C0701b.d(c0701b.f10439h)) {
                return;
            }
            Integer num = null;
            if (z7) {
                View t5 = u7.t(i7);
                if (t5 == null) {
                    valueOf = null;
                } else {
                    if (!this.f10430b) {
                        j7 = dVar.h(t5);
                    } else {
                        j7 = dVar.j(t5);
                    }
                    valueOf = Integer.valueOf(j7);
                }
                if (valueOf != null) {
                    i10 = valueOf.intValue();
                } else {
                    i10 = Integer.MAX_VALUE;
                }
                View t7 = u7.t(i7);
                if (t7 != null) {
                    i11 = d(t7);
                    ViewGroup.LayoutParams layoutParams = t7.getLayoutParams();
                    g.d(layoutParams, "null cannot be cast to non-null type com.rubensousa.dpadrecyclerview.layoutmanager.DpadLayoutParams");
                    C0656a c0656a = (C0656a) layoutParams;
                } else {
                    i11 = 0;
                }
            } else {
                i10 = Integer.MAX_VALUE;
                i11 = Integer.MAX_VALUE;
            }
            if (z9) {
                View t8 = u7.t(c5);
                if (t8 != null) {
                    if (!this.f10430b) {
                        h7 = dVar.j(t8);
                    } else {
                        h7 = dVar.h(t8);
                    }
                    num = Integer.valueOf(h7);
                }
                if (num != null) {
                    i14 = num.intValue();
                } else {
                    i14 = Integer.MIN_VALUE;
                }
                View t9 = u7.t(c5);
                if (t9 != null) {
                    i15 = d(t9);
                }
                i12 = i14;
                i13 = i15;
            } else {
                i12 = Integer.MIN_VALUE;
                i13 = Integer.MIN_VALUE;
            }
            if (!this.f10430b) {
                ((C0701b) this.f).h(i12, i10, i13, i11, (s) this.f10432e);
                if (dVar.f11023h) {
                    c0701b.f10438g = Integer.MAX_VALUE;
                    c0701b.f10435b = Integer.MAX_VALUE;
                }
                if (dVar.f11024i) {
                    c0701b.f10439h = Integer.MIN_VALUE;
                    c0701b.f10434a = Integer.MIN_VALUE;
                    return;
                }
                return;
            }
            ((C0701b) this.f).h(i10, i12, i11, i13, (s) this.f10432e);
            if (dVar.f11023h) {
                c0701b.f10439h = Integer.MIN_VALUE;
                c0701b.f10434a = Integer.MIN_VALUE;
            }
            if (dVar.f11024i) {
                c0701b.f10438g = Integer.MAX_VALUE;
                c0701b.f10435b = Integer.MAX_VALUE;
                return;
            }
            return;
        }
        c0701b.f10439h = Integer.MIN_VALUE;
        c0701b.f10434a = Integer.MIN_VALUE;
        c0701b.f10438g = Integer.MAX_VALUE;
        c0701b.f10435b = Integer.MAX_VALUE;
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, f5.b] */
    /* JADX WARN: Type inference failed for: r8v3, types: [Z5.n, java.lang.Object] */
    public C0700a(U u7, d dVar) {
        g.f(u7, "layoutManager");
        this.f10431c = u7;
        this.d = dVar;
        this.f10432e = new s(r.f9280t, 0, 0.5f, true, false);
        ?? obj = new Object();
        obj.f10434a = Integer.MIN_VALUE;
        obj.f10435b = Integer.MAX_VALUE;
        obj.f10438g = Integer.MAX_VALUE;
        obj.f10439h = Integer.MIN_VALUE;
        this.f = obj;
        ?? obj2 = new Object();
        obj2.f4918q = new C0556b(0, 0.0f, false, 30);
        this.f10433g = obj2;
        this.f10429a = true;
    }
}
