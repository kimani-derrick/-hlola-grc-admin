package androidx.leanback.app;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import androidx.leanback.widget.AbstractC0283b0;
import androidx.leanback.widget.AbstractC0287d0;
import androidx.leanback.widget.AbstractC0300k;
import androidx.leanback.widget.C0291f0;
import androidx.leanback.widget.C0293g0;
import androidx.leanback.widget.VerticalGridView;
import androidx.leanback.widget.u0;
import com.boxhdo.android.tv.R;
import w0.k0;
/* loaded from: classes.dex */
public class y extends AbstractC0274c {

    /* renamed from: B0  reason: collision with root package name */
    public static final l f6297B0;

    /* renamed from: C0  reason: collision with root package name */
    public static final v f6298C0;

    /* renamed from: v0  reason: collision with root package name */
    public i f6300v0;

    /* renamed from: w0  reason: collision with root package name */
    public i f6301w0;

    /* renamed from: x0  reason: collision with root package name */
    public boolean f6302x0 = true;
    public boolean y0 = false;

    /* renamed from: z0  reason: collision with root package name */
    public final u f6303z0 = new u(this, 0);

    /* renamed from: A0  reason: collision with root package name */
    public final w f6299A0 = new Object();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.leanback.app.v, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.leanback.widget.a0, java.lang.Object] */
    static {
        l lVar = new l();
        lVar.c(AbstractC0300k.class, new Object());
        lVar.c(u0.class, new C0293g0(R.layout.lb_section_header, false));
        lVar.c(AbstractC0287d0.class, new C0293g0(R.layout.lb_header, true));
        f6297B0 = lVar;
        f6298C0 = new Object();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [androidx.leanback.app.w, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.leanback.widget.q, androidx.leanback.widget.m, java.lang.Object] */
    public y() {
        AbstractC0283b0 abstractC0283b0 = this.f6198p0;
        l lVar = f6297B0;
        if (abstractC0283b0 != lVar) {
            this.f6198p0 = lVar;
            m0();
        }
        androidx.leanback.widget.H h7 = this.f6199q0;
        ?? obj = new Object();
        obj.d = true;
        h7.f6380g = obj;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0269x
    public final void U(View view, Bundle bundle) {
        if (bundle != null) {
            this.f6200r0 = bundle.getInt("currentSelectedPosition", -1);
        }
        k0();
        this.f6197o0.setOnChildViewHolderSelectedListener(this.f6203u0);
        VerticalGridView verticalGridView = this.f6197o0;
        if (verticalGridView == null) {
            return;
        }
        Drawable background = verticalGridView.getBackground();
        if (background instanceof ColorDrawable) {
            int color = ((ColorDrawable) background).getColor();
            Drawable background2 = this.W.findViewById(R.id.fade_out_edge).getBackground();
            if (background2 instanceof GradientDrawable) {
                background2.mutate();
                ((GradientDrawable) background2).setColors(new int[]{0, color});
            }
        }
        n0();
    }

    @Override // androidx.leanback.app.AbstractC0274c
    public final VerticalGridView f0(View view) {
        return (VerticalGridView) view.findViewById(R.id.browse_headers);
    }

    @Override // androidx.leanback.app.AbstractC0274c
    public final int g0() {
        return R.layout.lb_headers_fragment;
    }

    @Override // androidx.leanback.app.AbstractC0274c
    public final void h0(k0 k0Var, int i7, int i8) {
        int i9;
        i iVar = this.f6300v0;
        if (iVar != null) {
            s sVar = iVar.f6230q;
            if (k0Var != null && i7 >= 0) {
                androidx.leanback.widget.G g7 = (androidx.leanback.widget.G) k0Var;
                C0291f0 c0291f0 = (C0291f0) g7.f6367v;
                AbstractC0287d0 abstractC0287d0 = (AbstractC0287d0) g7.f6369x;
                i9 = sVar.f6263Q0.f6200r0;
                if (!sVar.f6272a1) {
                    return;
                }
            } else {
                i9 = sVar.f6263Q0.f6200r0;
                if (!sVar.f6272a1) {
                    return;
                }
            }
            sVar.w0(i9);
        }
    }

    @Override // androidx.leanback.app.AbstractC0274c
    public final void i0() {
        VerticalGridView verticalGridView;
        if (this.f6302x0 && (verticalGridView = this.f6197o0) != null) {
            verticalGridView.setDescendantFocusability(262144);
            if (verticalGridView.hasFocus()) {
                verticalGridView.requestFocus();
            }
        }
        super.i0();
    }

    public final void l0() {
        VerticalGridView verticalGridView;
        VerticalGridView verticalGridView2 = this.f6197o0;
        if (verticalGridView2 != null) {
            verticalGridView2.setPruneChild(false);
            this.f6197o0.setLayoutFrozen(true);
            this.f6197o0.setFocusSearchDisabled(true);
        }
        if (!this.f6302x0 && (verticalGridView = this.f6197o0) != null) {
            verticalGridView.setDescendantFocusability(131072);
            if (verticalGridView.hasFocus()) {
                verticalGridView.requestFocus();
            }
        }
    }

    public final void m0() {
        androidx.leanback.widget.H h7 = this.f6199q0;
        h7.p(this.f6196n0);
        h7.f = this.f6198p0;
        h7.f15466a.b();
        if (this.f6197o0 != null) {
            k0();
        }
        h7.f6381h = this.f6303z0;
        h7.f6379e = this.f6299A0;
    }

    public final void n0() {
        int i7;
        VerticalGridView verticalGridView = this.f6197o0;
        if (verticalGridView != null) {
            View view = this.W;
            if (this.y0) {
                i7 = 8;
            } else {
                i7 = 0;
            }
            view.setVisibility(i7);
            if (!this.y0) {
                if (this.f6302x0) {
                    verticalGridView.setChildrenVisibility(0);
                } else {
                    verticalGridView.setChildrenVisibility(4);
                }
            }
        }
    }
}
