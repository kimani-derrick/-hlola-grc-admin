package androidx.leanback.app;

import android.animation.TimeAnimator;
import android.os.Bundle;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.leanback.widget.AbstractC0299j0;
import androidx.leanback.widget.C0297i0;
import androidx.leanback.widget.U;
import androidx.leanback.widget.V;
import androidx.leanback.widget.VerticalGridView;
import com.boxhdo.android.tv.R;
import java.util.ArrayList;
import w0.Z;
import w0.k0;
/* loaded from: classes.dex */
public class F extends AbstractC0274c {

    /* renamed from: A0  reason: collision with root package name */
    public boolean f6167A0;

    /* renamed from: D0  reason: collision with root package name */
    public boolean f6170D0;

    /* renamed from: E0  reason: collision with root package name */
    public V f6171E0;

    /* renamed from: F0  reason: collision with root package name */
    public U f6172F0;
    public int G0;

    /* renamed from: I0  reason: collision with root package name */
    public Z f6174I0;

    /* renamed from: J0  reason: collision with root package name */
    public ArrayList f6175J0;

    /* renamed from: v0  reason: collision with root package name */
    public D f6177v0;

    /* renamed from: w0  reason: collision with root package name */
    public q f6178w0;

    /* renamed from: x0  reason: collision with root package name */
    public androidx.leanback.widget.G f6179x0;
    public int y0;

    /* renamed from: z0  reason: collision with root package name */
    public boolean f6180z0 = true;

    /* renamed from: B0  reason: collision with root package name */
    public int f6168B0 = Integer.MIN_VALUE;

    /* renamed from: C0  reason: collision with root package name */
    public boolean f6169C0 = true;

    /* renamed from: H0  reason: collision with root package name */
    public final DecelerateInterpolator f6173H0 = new DecelerateInterpolator(2.0f);

    /* renamed from: K0  reason: collision with root package name */
    public final u f6176K0 = new u(this, 1);

    public static void n0(androidx.leanback.widget.G g7, boolean z7, boolean z8) {
        float f;
        E e3 = (E) g7.f6370y;
        TimeAnimator timeAnimator = e3.f6163c;
        timeAnimator.end();
        if (z7) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        androidx.leanback.widget.Z z9 = e3.f6162b;
        AbstractC0299j0 abstractC0299j0 = e3.f6161a;
        abstractC0299j0.getClass();
        if (z8) {
            C0297i0 k5 = AbstractC0299j0.k(z9);
            k5.f6598j = f;
            abstractC0299j0.p(k5);
        } else if (AbstractC0299j0.k(z9).f6598j != f) {
            F f7 = e3.f6166h;
            e3.d = f7.G0;
            e3.f6164e = f7.f6173H0;
            float f8 = AbstractC0299j0.k(z9).f6598j;
            e3.f = f8;
            e3.f6165g = f - f8;
            timeAnimator.start();
        }
        AbstractC0299j0 abstractC0299j02 = (AbstractC0299j0) g7.f6366u;
        abstractC0299j02.getClass();
        C0297i0 k7 = AbstractC0299j0.k(g7.f6367v);
        k7.f6595g = z7;
        abstractC0299j02.o(k7, z7);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0269x
    public final void G(Bundle bundle) {
        super.G(bundle);
        this.G0 = u().getInteger(R.integer.lb_browse_rows_anim_duration);
    }

    @Override // androidx.leanback.app.AbstractC0274c, androidx.fragment.app.ComponentCallbacksC0269x
    public final void J() {
        this.f6167A0 = false;
        super.J();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0269x
    public final void U(View view, Bundle bundle) {
        if (bundle != null) {
            this.f6200r0 = bundle.getInt("currentSelectedPosition", -1);
        }
        k0();
        this.f6197o0.setOnChildViewHolderSelectedListener(this.f6203u0);
        this.f6197o0.setItemAlignmentViewId(R.id.row_content);
        this.f6197o0.setSaveChildrenPolicy(2);
        m0(this.f6168B0);
        this.f6174I0 = null;
        this.f6175J0 = null;
        D d = this.f6177v0;
        if (d != null) {
            s sVar = (s) ((I.h) d.f13c).f1201b;
            sVar.G0.w(sVar.f6258L0);
            if (!sVar.f6280j1) {
                sVar.G0.w(sVar.f6259M0);
            }
        }
    }

    @Override // androidx.leanback.app.AbstractC0274c
    public final VerticalGridView f0(View view) {
        return (VerticalGridView) view.findViewById(R.id.container_list);
    }

    @Override // androidx.leanback.app.AbstractC0274c
    public final int g0() {
        return R.layout.lb_rows_fragment;
    }

    @Override // androidx.leanback.app.AbstractC0274c
    public final void h0(k0 k0Var, int i7, int i8) {
        androidx.leanback.widget.G g7 = this.f6179x0;
        boolean z7 = true;
        if (g7 != k0Var || this.y0 != i8) {
            this.y0 = i8;
            if (g7 != null) {
                n0(g7, false, false);
            }
            androidx.leanback.widget.G g8 = (androidx.leanback.widget.G) k0Var;
            this.f6179x0 = g8;
            if (g8 != null) {
                n0(g8, true, false);
            }
        }
        D d = this.f6177v0;
        if (d != null) {
            I.h hVar = (I.h) d.f13c;
            if (i7 > 0) {
                z7 = false;
            }
            hVar.f1200a = z7;
            s sVar = (s) hVar.f1201b;
            A0.f fVar = sVar.f6261O0;
            if (fVar != null && ((I.h) fVar.f13c) == hVar && sVar.f6280j1) {
                sVar.G0();
            }
        }
    }

    @Override // androidx.leanback.app.AbstractC0274c
    public final void i0() {
        super.i0();
        l0(false);
    }

    @Override // androidx.leanback.app.AbstractC0274c
    public final boolean j0() {
        boolean j02 = super.j0();
        if (j02) {
            l0(true);
        }
        return j02;
    }

    public final void l0(boolean z7) {
        this.f6170D0 = z7;
        VerticalGridView verticalGridView = this.f6197o0;
        if (verticalGridView != null) {
            int childCount = verticalGridView.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                androidx.leanback.widget.G g7 = (androidx.leanback.widget.G) verticalGridView.M(verticalGridView.getChildAt(i7));
                AbstractC0299j0 abstractC0299j0 = (AbstractC0299j0) g7.f6366u;
                abstractC0299j0.getClass();
                abstractC0299j0.j(AbstractC0299j0.k(g7.f6367v), z7);
            }
        }
    }

    public final void m0(int i7) {
        if (i7 == Integer.MIN_VALUE) {
            return;
        }
        this.f6168B0 = i7;
        VerticalGridView verticalGridView = this.f6197o0;
        if (verticalGridView != null) {
            verticalGridView.setItemAlignmentOffset(0);
            verticalGridView.setItemAlignmentOffsetPercent(-1.0f);
            verticalGridView.setItemAlignmentOffsetWithPadding(true);
            verticalGridView.setWindowAlignmentOffset(this.f6168B0);
            verticalGridView.setWindowAlignmentOffsetPercent(-1.0f);
            verticalGridView.setWindowAlignment(0);
        }
    }

    public final void o0() {
        androidx.leanback.widget.H h7 = this.f6199q0;
        h7.p(this.f6196n0);
        h7.f = this.f6198p0;
        h7.f15466a.b();
        if (this.f6197o0 != null) {
            k0();
        }
        this.f6179x0 = null;
        this.f6167A0 = false;
        if (h7 != null) {
            h7.f6381h = this.f6176K0;
        }
    }
}
