package X2;

import android.view.View;
import android.widget.PopupWindow;
import e2.C0585B;
import e2.C0597b0;
import e2.C0616l;
import e2.C0626v;
import e2.L0;
import e2.Z;
import e2.q0;
import e2.r0;
import e2.s0;
import e2.t0;
import e2.u0;
import e2.v0;
import java.util.List;
import x2.C1461c;
/* renamed from: X2.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class View$OnClickListenerC0130l implements t0, View.OnClickListener, PopupWindow.OnDismissListener {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ w f4186q;

    public View$OnClickListenerC0130l(w wVar) {
        this.f4186q = wVar;
    }

    @Override // e2.t0
    public final /* synthetic */ void A(W2.w wVar) {
    }

    @Override // e2.t0
    public final /* synthetic */ void B(List list) {
    }

    @Override // e2.t0
    public final /* synthetic */ void D(int i7, boolean z7) {
    }

    @Override // e2.t0
    public final /* synthetic */ void E(int i7, boolean z7) {
    }

    @Override // e2.t0
    public final /* synthetic */ void G(r0 r0Var) {
    }

    @Override // e2.t0
    public final /* synthetic */ void I(int i7, u0 u0Var, u0 u0Var2) {
    }

    @Override // e2.t0
    public final /* synthetic */ void K(C1461c c1461c) {
    }

    @Override // e2.t0
    public final /* synthetic */ void L(boolean z7) {
    }

    @Override // e2.t0
    public final /* synthetic */ void b(int i7) {
    }

    @Override // e2.t0
    public final /* synthetic */ void c(int i7) {
    }

    @Override // e2.t0
    public final /* synthetic */ void d(int i7) {
    }

    @Override // e2.t0
    public final void g(s0 s0Var) {
        boolean a7 = s0Var.a(4, 5, 13);
        w wVar = this.f4186q;
        if (a7) {
            wVar.m();
        }
        if (s0Var.a(4, 5, 7, 13)) {
            wVar.o();
        }
        if (s0Var.a(8, 13)) {
            wVar.p();
        }
        if (s0Var.a(9, 13)) {
            wVar.r();
        }
        if (s0Var.a(8, 9, 11, 0, 16, 17, 13)) {
            wVar.l();
        }
        if (s0Var.a(11, 0, 13)) {
            wVar.s();
        }
        if (s0Var.a(12, 13)) {
            wVar.n();
        }
        if (s0Var.a(2, 13)) {
            wVar.t();
        }
    }

    @Override // e2.t0
    public final /* synthetic */ void h(C0597b0 c0597b0) {
    }

    @Override // e2.t0
    public final /* synthetic */ void i(q0 q0Var) {
    }

    @Override // e2.t0
    public final /* synthetic */ void j(C0616l c0616l) {
    }

    @Override // e2.t0
    public final /* synthetic */ void l(boolean z7) {
    }

    @Override // e2.t0
    public final /* synthetic */ void m(L0 l02) {
    }

    @Override // e2.t0
    public final /* synthetic */ void n(int i7, int i8) {
    }

    @Override // e2.t0
    public final /* synthetic */ void o(int i7) {
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        w0.L l7;
        w wVar = this.f4186q;
        v0 v0Var = wVar.f4271x0;
        if (v0Var == null) {
            return;
        }
        B b7 = wVar.f4256q;
        b7.h();
        if (wVar.f4213D == view) {
            P1.c cVar = (P1.c) v0Var;
            if (cVar.n(9)) {
                cVar.x();
            }
        } else if (wVar.f4211C == view) {
            P1.c cVar2 = (P1.c) v0Var;
            if (cVar2.n(7)) {
                cVar2.z();
            }
        } else if (wVar.F == view) {
            if (((C0585B) v0Var).T() != 4) {
                P1.c cVar3 = (P1.c) v0Var;
                if (cVar3.n(12)) {
                    C0585B c0585b = (C0585B) cVar3;
                    c0585b.q0();
                    cVar3.y(c0585b.f9430L, 12);
                }
            }
        } else if (wVar.f4218G == view) {
            P1.c cVar4 = (P1.c) v0Var;
            if (cVar4.n(11)) {
                C0585B c0585b2 = (C0585B) cVar4;
                c0585b2.q0();
                cVar4.y(-c0585b2.f9429K, 11);
            }
        } else if (wVar.f4215E == view) {
            int i7 = Z2.H.f4603a;
            C0585B c0585b3 = (C0585B) v0Var;
            if (c0585b3.S() && c0585b3.T() != 1 && c0585b3.T() != 4) {
                P1.c cVar5 = (P1.c) v0Var;
                if (cVar5.n(1)) {
                    ((C0585B) cVar5).g0(false);
                    return;
                }
                return;
            }
            Z2.H.D(v0Var);
        } else if (wVar.f4223J == view) {
            if (((P1.c) v0Var).n(15)) {
                C0585B c0585b4 = (C0585B) v0Var;
                c0585b4.q0();
                int i8 = c0585b4.f9439U;
                int i9 = wVar.G0;
                for (int i10 = 1; i10 <= 2; i10++) {
                    int i11 = (i8 + i10) % 3;
                    if (i11 != 0) {
                        if (i11 != 1) {
                            if (i11 == 2 && (i9 & 2) != 0) {
                            }
                        } else if ((i9 & 1) == 0) {
                        }
                    }
                    i8 = i11;
                    break;
                }
                c0585b4.i0(i8);
            }
        } else if (wVar.f4225K == view) {
            if (((P1.c) v0Var).n(14)) {
                C0585B c0585b5 = (C0585B) v0Var;
                c0585b5.q0();
                boolean z7 = !c0585b5.f9440V ? 1 : 0;
                c0585b5.q0();
                if (c0585b5.f9440V != z7) {
                    c0585b5.f9440V = z7;
                    Z2.D d = c0585b5.f9420A.f9544x;
                    d.getClass();
                    Z2.C b8 = Z2.D.b();
                    b8.f4595a = d.f4597a.obtainMessage(12, z7 ? 1 : 0, 0);
                    b8.b();
                    C0626v c0626v = new C0626v(0, z7);
                    Z2.p pVar = c0585b5.f9421B;
                    pVar.c(9, c0626v);
                    c0585b5.m0();
                    pVar.b();
                }
            }
        } else {
            View view2 = wVar.f4233P;
            if (view2 == view) {
                b7.g();
                l7 = wVar.f4266v;
            } else {
                view2 = wVar.f4234Q;
                if (view2 == view) {
                    b7.g();
                    l7 = wVar.f4268w;
                } else {
                    view2 = wVar.f4235R;
                    if (view2 == view) {
                        b7.g();
                        l7 = wVar.f4272y;
                    } else {
                        view2 = wVar.f4229M;
                        if (view2 == view) {
                            b7.g();
                            l7 = wVar.f4270x;
                        } else {
                            return;
                        }
                    }
                }
            }
            wVar.e(l7, view2);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        w wVar = this.f4186q;
        if (wVar.f4230M0) {
            wVar.f4256q.h();
        }
    }

    @Override // e2.t0
    public final /* synthetic */ void s(Z z7, int i7) {
    }

    @Override // e2.t0
    public final /* synthetic */ void u(boolean z7) {
    }

    @Override // e2.t0
    public final /* synthetic */ void v() {
    }

    @Override // e2.t0
    public final /* synthetic */ void w(C0616l c0616l) {
    }

    @Override // e2.t0
    public final /* synthetic */ void x(M2.c cVar) {
    }

    @Override // e2.t0
    public final /* synthetic */ void y(boolean z7) {
    }

    @Override // e2.t0
    public final /* synthetic */ void z(a3.z zVar) {
    }
}
