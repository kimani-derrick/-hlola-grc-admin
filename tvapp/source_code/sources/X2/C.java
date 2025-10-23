package X2;

import android.view.TextureView;
import android.view.View;
import com.google.android.exoplayer2.ui.StyledPlayerView;
import com.google.android.exoplayer2.ui.SubtitleView;
import e2.C0585B;
import e2.C0597b0;
import e2.C0616l;
import e2.H0;
import e2.J0;
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
/* loaded from: classes.dex */
public final class C implements t0, View.OnLayoutChangeListener, View.OnClickListener, v, InterfaceC0131m {

    /* renamed from: q  reason: collision with root package name */
    public final H0 f4111q = new H0();

    /* renamed from: r  reason: collision with root package name */
    public Object f4112r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ StyledPlayerView f4113s;

    public C(StyledPlayerView styledPlayerView) {
        this.f4113s = styledPlayerView;
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
    public final void E(int i7, boolean z7) {
        int i8 = StyledPlayerView.f8172P;
        StyledPlayerView styledPlayerView = this.f4113s;
        styledPlayerView.j();
        if (styledPlayerView.c() && styledPlayerView.f8184M) {
            w wVar = styledPlayerView.f8196z;
            if (wVar != null) {
                wVar.g();
                return;
            }
            return;
        }
        styledPlayerView.d(false);
    }

    @Override // e2.t0
    public final /* synthetic */ void G(r0 r0Var) {
    }

    @Override // e2.t0
    public final void I(int i7, u0 u0Var, u0 u0Var2) {
        w wVar;
        int i8 = StyledPlayerView.f8172P;
        StyledPlayerView styledPlayerView = this.f4113s;
        if (styledPlayerView.c() && styledPlayerView.f8184M && (wVar = styledPlayerView.f8196z) != null) {
            wVar.g();
        }
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
    public final void c(int i7) {
        int i8 = StyledPlayerView.f8172P;
        StyledPlayerView styledPlayerView = this.f4113s;
        styledPlayerView.j();
        styledPlayerView.l();
        if (styledPlayerView.c() && styledPlayerView.f8184M) {
            w wVar = styledPlayerView.f8196z;
            if (wVar != null) {
                wVar.g();
                return;
            }
            return;
        }
        styledPlayerView.d(false);
    }

    @Override // e2.t0
    public final /* synthetic */ void d(int i7) {
    }

    @Override // e2.t0
    public final /* synthetic */ void g(s0 s0Var) {
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
    public final void m(L0 l02) {
        J0 j02;
        StyledPlayerView styledPlayerView = this.f4113s;
        v0 v0Var = styledPlayerView.f8175C;
        v0Var.getClass();
        P1.c cVar = (P1.c) v0Var;
        if (cVar.n(17)) {
            j02 = ((C0585B) v0Var).O();
        } else {
            j02 = J0.f9620q;
        }
        if (!j02.q()) {
            boolean n = cVar.n(30);
            H0 h02 = this.f4111q;
            if (n) {
                C0585B c0585b = (C0585B) v0Var;
                if (!c0585b.P().f9701q.isEmpty()) {
                    this.f4112r = j02.g(c0585b.L(), h02, true).f9553r;
                    styledPlayerView.m(false);
                }
            }
            Object obj = this.f4112r;
            if (obj != null) {
                int b7 = j02.b(obj);
                if (b7 != -1) {
                    if (((C0585B) v0Var).K() == j02.g(b7, h02, false).f9554s) {
                        return;
                    }
                }
            }
            styledPlayerView.m(false);
        }
        this.f4112r = null;
        styledPlayerView.m(false);
    }

    @Override // e2.t0
    public final /* synthetic */ void n(int i7, int i8) {
    }

    @Override // e2.t0
    public final /* synthetic */ void o(int i7) {
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = StyledPlayerView.f8172P;
        this.f4113s.h();
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
        StyledPlayerView.a((TextureView) view, this.f4113s.f8186O);
    }

    @Override // e2.t0
    public final /* synthetic */ void s(Z z7, int i7) {
    }

    @Override // e2.t0
    public final /* synthetic */ void u(boolean z7) {
    }

    @Override // e2.t0
    public final void v() {
        View view = this.f4113s.f8189s;
        if (view != null) {
            view.setVisibility(4);
        }
    }

    @Override // e2.t0
    public final /* synthetic */ void w(C0616l c0616l) {
    }

    @Override // e2.t0
    public final void x(M2.c cVar) {
        SubtitleView subtitleView = this.f4113s.f8193w;
        if (subtitleView != null) {
            subtitleView.setCues(cVar.f2254q);
        }
    }

    @Override // e2.t0
    public final /* synthetic */ void y(boolean z7) {
    }

    @Override // e2.t0
    public final void z(a3.z zVar) {
        StyledPlayerView styledPlayerView;
        v0 v0Var;
        if (!zVar.equals(a3.z.f5137u) && (v0Var = (styledPlayerView = this.f4113s).f8175C) != null && ((C0585B) v0Var).T() != 1) {
            styledPlayerView.i();
        }
    }
}
