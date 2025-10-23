package androidx.leanback.app;

import X2.RunnableC0120b;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.transition.Scene;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.transition.TransitionManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C0247a;
import androidx.fragment.app.ComponentCallbacksC0269x;
import androidx.fragment.app.S;
import androidx.leanback.widget.AbstractC0283b0;
import androidx.leanback.widget.AbstractC0287d0;
import androidx.leanback.widget.AbstractC0299j0;
import androidx.leanback.widget.BrowseFrameLayout;
import androidx.leanback.widget.C0297i0;
import androidx.leanback.widget.M0;
import androidx.leanback.widget.O0;
import androidx.leanback.widget.P;
import androidx.leanback.widget.ScaleFrameLayout;
import androidx.leanback.widget.U;
import androidx.leanback.widget.V;
import androidx.leanback.widget.VerticalGridView;
import com.boxhdo.android.tv.R;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import f0.AbstractC0659a;
import java.util.HashMap;
/* loaded from: classes.dex */
public class s extends AbstractC0278g {

    /* renamed from: w1  reason: collision with root package name */
    public static final String f6254w1 = s.class.getCanonicalName() + ".title";

    /* renamed from: x1  reason: collision with root package name */
    public static final String f6255x1 = s.class.getCanonicalName() + ".headersState";

    /* renamed from: O0  reason: collision with root package name */
    public A0.f f6261O0;

    /* renamed from: P0  reason: collision with root package name */
    public ComponentCallbacksC0269x f6262P0;

    /* renamed from: Q0  reason: collision with root package name */
    public y f6263Q0;

    /* renamed from: R0  reason: collision with root package name */
    public q f6264R0;

    /* renamed from: S0  reason: collision with root package name */
    public A f6265S0;

    /* renamed from: T0  reason: collision with root package name */
    public P f6266T0;
    public AbstractC0283b0 U0;

    /* renamed from: W0  reason: collision with root package name */
    public BrowseFrameLayout f6268W0;

    /* renamed from: X0  reason: collision with root package name */
    public ScaleFrameLayout f6269X0;

    /* renamed from: Z0  reason: collision with root package name */
    public String f6271Z0;

    /* renamed from: c1  reason: collision with root package name */
    public int f6274c1;
    public int d1;

    /* renamed from: f1  reason: collision with root package name */
    public V f6276f1;

    /* renamed from: g1  reason: collision with root package name */
    public U f6277g1;

    /* renamed from: i1  reason: collision with root package name */
    public float f6279i1;

    /* renamed from: j1  reason: collision with root package name */
    public boolean f6280j1;

    /* renamed from: m1  reason: collision with root package name */
    public Scene f6282m1;

    /* renamed from: n1  reason: collision with root package name */
    public Scene f6283n1;

    /* renamed from: o1  reason: collision with root package name */
    public Scene f6284o1;

    /* renamed from: p1  reason: collision with root package name */
    public Transition f6285p1;

    /* renamed from: q1  reason: collision with root package name */
    public n f6286q1;

    /* renamed from: J0  reason: collision with root package name */
    public final k f6256J0 = new k(this, 0);

    /* renamed from: K0  reason: collision with root package name */
    public final B0.d f6257K0 = new B0.d(7, "headerFragmentViewCreated", false);

    /* renamed from: L0  reason: collision with root package name */
    public final B0.d f6258L0 = new B0.d(7, "mainFragmentViewCreated", false);

    /* renamed from: M0  reason: collision with root package name */
    public final B0.d f6259M0 = new B0.d(7, "screenDataReady", false);

    /* renamed from: N0  reason: collision with root package name */
    public final q f6260N0 = new q();

    /* renamed from: V0  reason: collision with root package name */
    public int f6267V0 = 1;

    /* renamed from: Y0  reason: collision with root package name */
    public final boolean f6270Y0 = true;

    /* renamed from: a1  reason: collision with root package name */
    public boolean f6272a1 = true;

    /* renamed from: b1  reason: collision with root package name */
    public boolean f6273b1 = true;

    /* renamed from: e1  reason: collision with root package name */
    public final boolean f6275e1 = true;

    /* renamed from: h1  reason: collision with root package name */
    public int f6278h1 = -1;

    /* renamed from: k1  reason: collision with root package name */
    public boolean f6281k1 = true;
    public final r l1 = new r(this);

    /* renamed from: r1  reason: collision with root package name */
    public final i f6287r1 = new i(this);

    /* renamed from: s1  reason: collision with root package name */
    public final i f6288s1 = new i(this);

    /* renamed from: t1  reason: collision with root package name */
    public final i f6289t1 = new i(this);

    /* renamed from: u1  reason: collision with root package name */
    public final i f6290u1 = new i(this);

    /* renamed from: v1  reason: collision with root package name */
    public final j f6291v1 = new j(0, this);

    public final void A0() {
        int i7 = this.d1;
        if (this.f6275e1 && this.f6261O0.f11a && this.f6272a1) {
            i7 = (int) ((i7 / this.f6279i1) + 0.5f);
        }
        this.f6261O0.i(i7);
    }

    public final void B0(q qVar) {
        C0297i0 k5;
        q qVar2 = this.f6264R0;
        if (qVar == qVar2) {
            return;
        }
        if (qVar2 != null) {
            F f = (F) ((ComponentCallbacksC0269x) qVar2.f6249a);
            if (f.f6196n0 != null) {
                f.f6196n0 = null;
                f.o0();
            }
        }
        this.f6264R0 = qVar;
        if (qVar != null) {
            androidx.fragment.app.D d = new androidx.fragment.app.D(this, 1, qVar);
            F f7 = (F) ((ComponentCallbacksC0269x) qVar.f6249a);
            f7.f6171E0 = d;
            VerticalGridView verticalGridView = f7.f6197o0;
            if (verticalGridView != null) {
                int childCount = verticalGridView.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    androidx.leanback.widget.G g7 = (androidx.leanback.widget.G) verticalGridView.M(verticalGridView.getChildAt(i7));
                    if (g7 == null) {
                        k5 = null;
                    } else {
                        ((AbstractC0299j0) g7.f6366u).getClass();
                        k5 = AbstractC0299j0.k(g7.f6367v);
                    }
                    k5.f6600l = f7.f6171E0;
                }
            }
            q qVar3 = this.f6264R0;
            U u7 = this.f6277g1;
            F f8 = (F) ((ComponentCallbacksC0269x) qVar3.f6249a);
            f8.f6172F0 = u7;
            if (f8.f6167A0) {
                throw new IllegalStateException("Item clicked listener must be set before views are created");
            }
        }
        F0();
    }

    public final void C0(boolean z7) {
        int i7;
        View searchAffordanceView = ((M0) this.f6227q0).f6423a.getSearchAffordanceView();
        if (searchAffordanceView != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) searchAffordanceView.getLayoutParams();
            if (z7) {
                i7 = 0;
            } else {
                i7 = -this.f6274c1;
            }
            marginLayoutParams.setMarginStart(i7);
            searchAffordanceView.setLayoutParams(marginLayoutParams);
        }
    }

    public final void D0(boolean z7) {
        y yVar = this.f6263Q0;
        yVar.f6302x0 = z7;
        yVar.n0();
        x0(z7);
        s0(!z7);
    }

    public final void E0(boolean z7) {
        P p3;
        if (!this.f6106J.f5916I && (p3 = this.f6266T0) != null && p3.d() != 0) {
            this.f6272a1 = z7;
            this.f6261O0.d();
            this.f6261O0.e();
            boolean z8 = !z7;
            RunnableC0120b runnableC0120b = new RunnableC0120b(this, z7, 1);
            if (z8) {
                runnableC0120b.run();
                return;
            }
            A0.f fVar = this.f6261O0;
            View view = this.W;
            o oVar = new o(this, runnableC0120b, fVar, view);
            view.getViewTreeObserver().addOnPreDrawListener(oVar);
            fVar.l(false);
            view.invalidate();
            oVar.f6245s = 0;
        }
    }

    public final void F0() {
        A a7 = this.f6265S0;
        A a8 = null;
        if (a7 != null) {
            a7.f6151c.f6437a.unregisterObserver(a7.f6152e);
            this.f6265S0 = null;
        }
        if (this.f6264R0 != null) {
            P p3 = this.f6266T0;
            if (p3 != null) {
                a8 = new A(p3);
            }
            this.f6265S0 = a8;
            F f = (F) ((ComponentCallbacksC0269x) this.f6264R0.f6249a);
            if (f.f6196n0 != a8) {
                f.f6196n0 = a8;
                f.o0();
            }
        }
    }

    @Override // androidx.leanback.app.AbstractC0278g, androidx.fragment.app.ComponentCallbacksC0269x
    public void G(Bundle bundle) {
        Context o7;
        super.G(bundle);
        TypedArray obtainStyledAttributes = o().obtainStyledAttributes(AbstractC0659a.f10198b);
        this.f6274c1 = (int) obtainStyledAttributes.getDimension(6, o7.getResources().getDimensionPixelSize(R.dimen.lb_browse_rows_margin_start));
        this.d1 = (int) obtainStyledAttributes.getDimension(7, o7.getResources().getDimensionPixelSize(R.dimen.lb_browse_rows_margin_top));
        obtainStyledAttributes.recycle();
        Bundle bundle2 = this.f6139v;
        if (bundle2 != null) {
            String str = f6254w1;
            if (bundle2.containsKey(str)) {
                String string = bundle2.getString(str);
                this.f6225o0 = string;
                O0 o02 = this.f6227q0;
                if (o02 != null) {
                    ((M0) o02).f6423a.setTitle(string);
                }
            }
            String str2 = f6255x1;
            if (bundle2.containsKey(str2)) {
                y0(bundle2.getInt(str2));
            }
        }
        if (this.f6273b1) {
            if (this.f6270Y0) {
                this.f6271Z0 = "lbHeadersBackStack_" + this;
                n nVar = new n(this);
                this.f6286q1 = nVar;
                this.f6106J.f5933m.add(nVar);
                n nVar2 = this.f6286q1;
                s sVar = nVar2.f6242c;
                boolean z7 = false;
                if (bundle != null) {
                    int i7 = bundle.getInt("headerStackIndex", -1);
                    nVar2.f6241b = i7;
                    if (i7 == -1) {
                        z7 = true;
                    }
                    sVar.f6272a1 = z7;
                } else if (!sVar.f6272a1) {
                    S s6 = sVar.f6106J;
                    s6.getClass();
                    C0247a c0247a = new C0247a(s6);
                    c0247a.c(sVar.f6271Z0);
                    c0247a.e(false);
                }
            } else if (bundle != null) {
                this.f6272a1 = bundle.getBoolean("headerShow");
            }
        }
        this.f6279i1 = u().getFraction(R.fraction.lb_browse_rows_scale, 1, 1);
    }

    public final void G0() {
        boolean v02;
        int i7;
        A0.f fVar;
        boolean v03;
        A0.f fVar2;
        if (!this.f6272a1) {
            if (this.f6280j1 && (fVar2 = this.f6261O0) != null) {
                v03 = ((I.h) fVar2.f13c).f1200a;
            } else {
                v03 = v0(this.f6278h1);
            }
            if (v03) {
                h0(6);
                return;
            } else {
                i0(false);
                return;
            }
        }
        if (this.f6280j1 && (fVar = this.f6261O0) != null) {
            v02 = ((I.h) fVar.f13c).f1200a;
        } else {
            v02 = v0(this.f6278h1);
        }
        int i8 = this.f6278h1;
        P p3 = this.f6266T0;
        boolean z7 = true;
        if (p3 != null && p3.d() != 0 && this.f6266T0.d() > 0) {
            ((AbstractC0287d0) this.f6266T0.a(0)).getClass();
            if (i8 != 0) {
                z7 = false;
            }
        }
        if (v02) {
            i7 = 2;
        } else {
            i7 = 0;
        }
        if (z7) {
            i7 |= 4;
        }
        if (i7 != 0) {
            h0(i7);
        } else {
            i0(false);
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0269x
    public View H(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z7;
        int i7;
        if (n().E(R.id.scale_frame) == null) {
            this.f6263Q0 = new y();
            r0(this.f6266T0, this.f6278h1);
            S n = n();
            n.getClass();
            C0247a c0247a = new C0247a(n);
            c0247a.h(R.id.browse_headers_dock, this.f6263Q0);
            ComponentCallbacksC0269x componentCallbacksC0269x = this.f6262P0;
            if (componentCallbacksC0269x != null) {
                c0247a.h(R.id.scale_frame, componentCallbacksC0269x);
            } else {
                A0.f fVar = new A0.f((F) null);
                this.f6261O0 = fVar;
                fVar.f13c = new I.h(this);
            }
            c0247a.e(false);
        } else {
            this.f6263Q0 = (y) n().E(R.id.browse_headers_dock);
            this.f6262P0 = n().E(R.id.scale_frame);
            if (bundle != null && bundle.getBoolean("isPageRow", false)) {
                z7 = true;
            } else {
                z7 = false;
            }
            this.f6280j1 = z7;
            if (bundle != null) {
                i7 = bundle.getInt("currentSelectedPosition", 0);
            } else {
                i7 = 0;
            }
            this.f6278h1 = i7;
            z0();
        }
        y yVar = this.f6263Q0;
        yVar.y0 = !this.f6273b1;
        yVar.n0();
        y yVar2 = this.f6263Q0;
        P p3 = this.f6266T0;
        if (yVar2.f6196n0 != p3) {
            yVar2.f6196n0 = p3;
            yVar2.m0();
        }
        y yVar3 = this.f6263Q0;
        yVar3.f6300v0 = this.f6290u1;
        yVar3.f6301w0 = this.f6289t1;
        View inflate = layoutInflater.inflate(R.layout.lb_browse_fragment, viewGroup, false);
        this.f6217I0.f6157s = (ViewGroup) inflate;
        BrowseFrameLayout browseFrameLayout = (BrowseFrameLayout) inflate.findViewById(R.id.browse_frame);
        this.f6268W0 = browseFrameLayout;
        browseFrameLayout.setOnChildFocusListener(this.f6288s1);
        this.f6268W0.setOnFocusSearchListener(this.f6287r1);
        f0(layoutInflater, this.f6268W0);
        ScaleFrameLayout scaleFrameLayout = (ScaleFrameLayout) inflate.findViewById(R.id.scale_frame);
        this.f6269X0 = scaleFrameLayout;
        scaleFrameLayout.setPivotX(0.0f);
        this.f6269X0.setPivotY(this.d1);
        this.f6282m1 = m3.g.i(this.f6268W0, new m(this, 0));
        this.f6283n1 = m3.g.i(this.f6268W0, new m(this, 1));
        this.f6284o1 = m3.g.i(this.f6268W0, new m(this, 2));
        return inflate;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0269x
    public final void I() {
        n nVar = this.f6286q1;
        if (nVar != null) {
            this.f6106J.f5933m.remove(nVar);
        }
        this.f6117U = true;
    }

    @Override // androidx.leanback.app.C0279h, androidx.fragment.app.ComponentCallbacksC0269x
    public final void J() {
        B0(null);
        this.f6261O0 = null;
        this.f6262P0 = null;
        this.f6263Q0 = null;
        super.J();
    }

    @Override // androidx.leanback.app.C0279h, androidx.fragment.app.ComponentCallbacksC0269x
    public final void R(Bundle bundle) {
        bundle.putBoolean("titleShow", this.f6224n0);
        bundle.putInt("currentSelectedPosition", this.f6278h1);
        bundle.putBoolean("isPageRow", this.f6280j1);
        n nVar = this.f6286q1;
        if (nVar != null) {
            bundle.putInt("headerStackIndex", nVar.f6241b);
        } else {
            bundle.putBoolean("headerShow", this.f6272a1);
        }
    }

    @Override // androidx.leanback.app.C0279h, androidx.fragment.app.ComponentCallbacksC0269x
    public final void S() {
        ComponentCallbacksC0269x componentCallbacksC0269x;
        View view;
        y yVar;
        View view2;
        super.S();
        y yVar2 = this.f6263Q0;
        int i7 = this.d1;
        VerticalGridView verticalGridView = yVar2.f6197o0;
        if (verticalGridView != null) {
            verticalGridView.setItemAlignmentOffset(0);
            yVar2.f6197o0.setItemAlignmentOffsetPercent(-1.0f);
            yVar2.f6197o0.setWindowAlignmentOffset(i7);
            yVar2.f6197o0.setWindowAlignmentOffsetPercent(-1.0f);
            yVar2.f6197o0.setWindowAlignment(0);
        }
        A0();
        boolean z7 = this.f6273b1;
        if (z7 && this.f6272a1 && (yVar = this.f6263Q0) != null && (view2 = yVar.W) != null) {
            view2.requestFocus();
        } else if ((!z7 || !this.f6272a1) && (componentCallbacksC0269x = this.f6262P0) != null && (view = componentCallbacksC0269x.W) != null) {
            view.requestFocus();
        }
        if (this.f6273b1) {
            D0(this.f6272a1);
        }
        this.G0.w(this.f6257K0);
        this.f6281k1 = false;
        q0();
        r rVar = this.l1;
        if (rVar.f6251r != -1) {
            rVar.f6253t.f6268W0.post(rVar);
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0269x
    public final void T() {
        this.f6281k1 = true;
        r rVar = this.l1;
        rVar.f6253t.f6268W0.removeCallbacks(rVar);
        this.f6117U = true;
    }

    public void b() {
        u0();
    }

    @Override // androidx.leanback.app.AbstractC0278g
    public final Transition j0() {
        return TransitionInflater.from(o()).inflateTransition(R.transition.lb_browse_entrance_transition);
    }

    @Override // androidx.leanback.app.AbstractC0278g
    public final void k0() {
        super.k0();
        this.G0.r(this.f6256J0);
    }

    @Override // androidx.leanback.app.AbstractC0278g
    public final void l0() {
        super.l0();
        this.G0.getClass();
        C0275d c0275d = this.f6220v0;
        g5.b.s(c0275d, this.f6256J0, this.f6257K0);
        g5.b.s(c0275d, this.f6221w0, this.f6258L0);
        g5.b.s(c0275d, this.f6222x0, this.f6259M0);
    }

    @Override // androidx.leanback.app.AbstractC0278g
    public final void m0() {
        A0.f fVar = this.f6261O0;
        if (fVar != null) {
            fVar.c();
        }
        y yVar = this.f6263Q0;
        if (yVar != null) {
            yVar.i0();
        }
    }

    @Override // androidx.leanback.app.AbstractC0278g
    public final void n0() {
        this.f6263Q0.j0();
        this.f6261O0.k(false);
        this.f6261O0.d();
    }

    @Override // androidx.leanback.app.AbstractC0278g
    public final void o0() {
        this.f6263Q0.l0();
        this.f6261O0.e();
    }

    @Override // androidx.leanback.app.AbstractC0278g
    public final void p0(Object obj) {
        TransitionManager.go(this.f6284o1, (Transition) obj);
    }

    public final void q0() {
        S n = n();
        if (n.E(R.id.scale_frame) != this.f6262P0) {
            C0247a c0247a = new C0247a(n);
            c0247a.h(R.id.scale_frame, this.f6262P0);
            c0247a.e(false);
        }
    }

    public final boolean r0(P p3, int i7) {
        Object a7;
        boolean z7 = true;
        if (!this.f6273b1) {
            a7 = null;
        } else if (p3 == null || p3.d() == 0) {
            return false;
        } else {
            if (i7 < 0) {
                i7 = 0;
            } else if (i7 >= p3.d()) {
                throw new IllegalArgumentException(String.format("Invalid position %d requested", Integer.valueOf(i7)));
            }
            a7 = p3.a(i7);
        }
        boolean z8 = this.f6280j1;
        this.f6280j1 = false;
        if (this.f6262P0 != null && !z8) {
            z7 = false;
        }
        if (z7) {
            q qVar = this.f6260N0;
            qVar.getClass();
            if (a7 != null) {
                p pVar = (p) ((HashMap) qVar.f6249a).get(a7.getClass());
            }
            this.f6262P0 = new F();
            z0();
        }
        return z7;
    }

    public final void s0(boolean z7) {
        int i7;
        float f;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f6269X0.getLayoutParams();
        if (!z7) {
            i7 = this.f6274c1;
        } else {
            i7 = 0;
        }
        marginLayoutParams.setMarginStart(i7);
        this.f6269X0.setLayoutParams(marginLayoutParams);
        this.f6261O0.l(z7);
        A0();
        if (!z7 && this.f6275e1 && this.f6261O0.f11a) {
            f = this.f6279i1;
        } else {
            f = 1.0f;
        }
        this.f6269X0.setLayoutScaleY(f);
        this.f6269X0.setChildScale(f);
    }

    public final F t0() {
        ComponentCallbacksC0269x componentCallbacksC0269x = this.f6262P0;
        if (componentCallbacksC0269x instanceof F) {
            return (F) componentCallbacksC0269x;
        }
        return null;
    }

    public final C0297i0 u0() {
        androidx.leanback.widget.G g7;
        q qVar = this.f6264R0;
        if (qVar == null) {
            return null;
        }
        ComponentCallbacksC0269x componentCallbacksC0269x = (ComponentCallbacksC0269x) qVar.f6249a;
        int i7 = ((F) componentCallbacksC0269x).f6200r0;
        VerticalGridView verticalGridView = ((F) componentCallbacksC0269x).f6197o0;
        if (verticalGridView == null || (g7 = (androidx.leanback.widget.G) verticalGridView.G(i7)) == null) {
            return null;
        }
        ((AbstractC0299j0) g7.f6366u).getClass();
        return AbstractC0299j0.k(g7.f6367v);
    }

    public final boolean v0(int i7) {
        P p3 = this.f6266T0;
        if (p3 == null || p3.d() == 0 || this.f6266T0.d() <= 0) {
            return true;
        }
        ((AbstractC0287d0) this.f6266T0.a(0)).getClass();
        return i7 == 0;
    }

    public final void w0(int i7) {
        r rVar = this.l1;
        if (rVar.f6251r <= 0) {
            rVar.f6250q = i7;
            rVar.f6251r = 0;
            rVar.f6252s = true;
            s sVar = rVar.f6253t;
            sVar.f6268W0.removeCallbacks(rVar);
            if (!sVar.f6281k1) {
                sVar.f6268W0.post(rVar);
            }
        }
    }

    public final void x0(boolean z7) {
        int i7;
        View view = this.f6263Q0.W;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (z7) {
            i7 = 0;
        } else {
            i7 = -this.f6274c1;
        }
        marginLayoutParams.setMarginStart(i7);
        view.setLayoutParams(marginLayoutParams);
    }

    public final void y0(int i7) {
        if (i7 >= 1 && i7 <= 3) {
            if (i7 != this.f6267V0) {
                this.f6267V0 = i7;
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            Log.w("BrowseSupportFragment", "Unknown headers state: " + i7);
                        } else {
                            this.f6273b1 = false;
                        }
                    } else {
                        this.f6273b1 = true;
                    }
                    this.f6272a1 = false;
                } else {
                    this.f6273b1 = true;
                    this.f6272a1 = true;
                }
                y yVar = this.f6263Q0;
                if (yVar != null) {
                    yVar.y0 = true ^ this.f6273b1;
                    yVar.n0();
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException(AbstractC0515y1.l("Invalid headers state: ", i7));
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.leanback.app.D, A0.f] */
    public final void z0() {
        ComponentCallbacksC0269x componentCallbacksC0269x = this.f6262P0;
        F f = (F) componentCallbacksC0269x;
        boolean z7 = true;
        if (f.f6177v0 == null) {
            ?? fVar = new A0.f(f);
            fVar.f11a = true;
            f.f6177v0 = fVar;
        }
        D d = f.f6177v0;
        this.f6261O0 = d;
        d.f13c = new I.h(this);
        if (!this.f6280j1) {
            if (componentCallbacksC0269x instanceof F) {
                F f7 = (F) componentCallbacksC0269x;
                if (f7.f6178w0 == null) {
                    f7.f6178w0 = new q(f7);
                }
                B0(f7.f6178w0);
            } else {
                B0(null);
            }
            if (this.f6264R0 != null) {
                z7 = false;
            }
            this.f6280j1 = z7;
            return;
        }
        B0(null);
    }
}
