package androidx.leanback.widget;

import a.AbstractC0189a;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class H extends w0.L {
    public P d;

    /* renamed from: e  reason: collision with root package name */
    public AbstractC0189a f6379e;
    public AbstractC0283b0 f;

    /* renamed from: g  reason: collision with root package name */
    public InterfaceC0304m f6380g;

    /* renamed from: h  reason: collision with root package name */
    public w4.l0 f6381h;

    /* renamed from: i  reason: collision with root package name */
    public ArrayList f6382i = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    public final androidx.leanback.app.z f6383j = new androidx.leanback.app.z(2, this);

    @Override // w0.L
    public final int a() {
        P p3 = this.d;
        if (p3 != null) {
            return p3.d();
        }
        return 0;
    }

    @Override // w0.L
    public final long b(int i7) {
        this.d.getClass();
        return -1L;
    }

    @Override // w0.L
    public final int c(int i7) {
        AbstractC0283b0 abstractC0283b0 = this.f;
        if (abstractC0283b0 == null) {
            abstractC0283b0 = this.d.f6438b;
        }
        AbstractC0281a0 a7 = abstractC0283b0.a(this.d.a(i7));
        int indexOf = this.f6382i.indexOf(a7);
        if (indexOf < 0) {
            this.f6382i.add(a7);
            indexOf = this.f6382i.indexOf(a7);
            k(a7, indexOf);
            w4.l0 l0Var = this.f6381h;
            if (l0Var != null) {
                l0Var.A();
            }
        }
        return indexOf;
    }

    @Override // w0.L
    public final void d(w0.k0 k0Var, int i7) {
        G g7 = (G) k0Var;
        Object a7 = this.d.a(i7);
        g7.f6369x = a7;
        g7.f6366u.c(g7.f6367v, a7);
        m(g7);
        w4.l0 l0Var = this.f6381h;
        if (l0Var != null) {
            l0Var.C();
        }
    }

    @Override // w0.L
    public final void e(w0.k0 k0Var, int i7) {
        G g7 = (G) k0Var;
        Object a7 = this.d.a(i7);
        g7.f6369x = a7;
        g7.f6366u.c(g7.f6367v, a7);
        m(g7);
        w4.l0 l0Var = this.f6381h;
        if (l0Var != null) {
            l0Var.C();
        }
    }

    @Override // w0.L
    public final w0.k0 f(RecyclerView recyclerView, int i7) {
        Z d;
        View view;
        AbstractC0281a0 abstractC0281a0 = (AbstractC0281a0) this.f6382i.get(i7);
        AbstractC0189a abstractC0189a = this.f6379e;
        if (abstractC0189a != null) {
            view = abstractC0189a.o(recyclerView);
            d = abstractC0281a0.d(recyclerView);
            this.f6379e.I(view, d.f6572a);
        } else {
            d = abstractC0281a0.d(recyclerView);
            view = d.f6572a;
        }
        G g7 = new G(this, abstractC0281a0, view, d);
        n(g7);
        w4.l0 l0Var = this.f6381h;
        if (l0Var != null) {
            l0Var.D(g7);
        }
        View view2 = g7.f6367v.f6572a;
        if (view2 != null) {
            View.OnFocusChangeListener onFocusChangeListener = view2.getOnFocusChangeListener();
            F f = g7.f6368w;
            f.f6364a = onFocusChangeListener;
            view2.setOnFocusChangeListener(f);
        }
        InterfaceC0304m interfaceC0304m = this.f6380g;
        if (interfaceC0304m != null) {
            interfaceC0304m.a(view);
        }
        return g7;
    }

    @Override // w0.L
    public final void g(w0.k0 k0Var) {
        j(k0Var);
    }

    @Override // w0.L
    public final void h(w0.k0 k0Var) {
        G g7 = (G) k0Var;
        l(g7);
        w4.l0 l0Var = this.f6381h;
        if (l0Var != null) {
            l0Var.B(g7);
        }
        g7.f6366u.f(g7.f6367v);
    }

    @Override // w0.L
    public final void i(w0.k0 k0Var) {
        G g7 = (G) k0Var;
        g7.f6366u.g(g7.f6367v);
        w4.l0 l0Var = this.f6381h;
        if (l0Var != null) {
            l0Var.E(g7);
        }
    }

    @Override // w0.L
    public final void j(w0.k0 k0Var) {
        G g7 = (G) k0Var;
        g7.f6366u.e(g7.f6367v);
        o(g7);
        w4.l0 l0Var = this.f6381h;
        if (l0Var != null) {
            l0Var.F(g7);
        }
        g7.f6369x = null;
    }

    public void k(AbstractC0281a0 abstractC0281a0, int i7) {
    }

    public void l(G g7) {
    }

    public void m(G g7) {
    }

    public void n(G g7) {
    }

    public void o(G g7) {
    }

    public final void p(P p3) {
        P p5 = this.d;
        if (p3 == p5) {
            return;
        }
        androidx.leanback.app.z zVar = this.f6383j;
        if (p5 != null) {
            p5.f6437a.unregisterObserver(zVar);
        }
        this.d = p3;
        O o7 = this.f15466a;
        if (p3 == null) {
            o7.b();
            return;
        }
        p3.f6437a.registerObserver(zVar);
        boolean z7 = this.f15467b;
        this.d.getClass();
        if (z7) {
            this.d.getClass();
            if (!o7.a()) {
                this.f15467b = false;
            } else {
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
        }
        o7.b();
    }
}
