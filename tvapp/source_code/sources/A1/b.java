package A1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.D;
import androidx.leanback.widget.A0;
import androidx.leanback.widget.AbstractC0281a0;
import androidx.leanback.widget.B0;
import androidx.leanback.widget.C0;
import androidx.leanback.widget.C0306n;
import androidx.leanback.widget.I;
import androidx.leanback.widget.P;
import androidx.leanback.widget.P0;
import androidx.leanback.widget.Q0;
import androidx.leanback.widget.U;
import androidx.leanback.widget.V;
import androidx.leanback.widget.VerticalGridView;
import androidx.leanback.widget.Z;
import com.boxhdo.android.tv.R;
import h0.C0741a;
/* loaded from: classes.dex */
public final class b extends AbstractC0281a0 {

    /* renamed from: e  reason: collision with root package name */
    public V f21e;
    public U f;

    /* renamed from: g  reason: collision with root package name */
    public C0 f22g;

    /* renamed from: h  reason: collision with root package name */
    public I f23h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f24i;

    /* renamed from: a  reason: collision with root package name */
    public int f18a = -1;
    public boolean d = true;

    /* renamed from: b  reason: collision with root package name */
    public final int f19b = 0;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f20c = false;

    public b(int i7) {
        this.f24i = i7;
    }

    @Override // androidx.leanback.widget.AbstractC0281a0
    public final void c(Z z7, Object obj) {
        Q0 q02 = (Q0) z7;
        q02.f6465b.p((P) obj);
        q02.f6466c.setAdapter(q02.f6465b);
    }

    @Override // androidx.leanback.widget.AbstractC0281a0
    public final void e(Z z7) {
        Q0 q02 = (Q0) z7;
        q02.f6465b.p(null);
        q02.f6466c.setAdapter(null);
    }

    public final void h(Q0 q02) {
        ViewGroup.LayoutParams layoutParams;
        switch (this.f24i) {
            case 0:
                i(q02);
                VerticalGridView verticalGridView = q02.f6466c;
                if (verticalGridView != null) {
                    ViewGroup.LayoutParams layoutParams2 = verticalGridView.getLayoutParams();
                    if (layoutParams2 != null) {
                        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) layoutParams2;
                        layoutParams3.setMargins(verticalGridView.getResources().getDimensionPixelSize(R.dimen.dp_60), verticalGridView.getResources().getDimensionPixelSize(R.dimen.dp_80), 0, 0);
                        layoutParams3.width = -1;
                        verticalGridView.setLayoutParams(layoutParams3);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                }
                return;
            case 1:
                i(q02);
                VerticalGridView verticalGridView2 = q02.f6466c;
                if (verticalGridView2 != null) {
                    layoutParams = verticalGridView2.getLayoutParams();
                } else {
                    layoutParams = null;
                }
                if (layoutParams != null) {
                    layoutParams.width = -1;
                }
                if (verticalGridView2 != null) {
                    verticalGridView2.setLayoutParams(layoutParams);
                    verticalGridView2.setPadding(verticalGridView2.getResources().getDimensionPixelSize(R.dimen.dp_80), verticalGridView2.getResources().getDimensionPixelSize(R.dimen.dp_60), 0, 0);
                    return;
                }
                return;
            default:
                i(q02);
                VerticalGridView verticalGridView3 = q02.f6466c;
                if (verticalGridView3 != null) {
                    ViewGroup.LayoutParams layoutParams4 = verticalGridView3.getLayoutParams();
                    if (layoutParams4 != null) {
                        FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) layoutParams4;
                        layoutParams5.setMargins(verticalGridView3.getResources().getDimensionPixelSize(R.dimen.dp_20), verticalGridView3.getResources().getDimensionPixelSize(R.dimen.dp_60), 0, 0);
                        layoutParams5.width = -1;
                        verticalGridView3.setLayoutParams(layoutParams5);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                }
                return;
        }
    }

    public final void i(Q0 q02) {
        int i7 = this.f18a;
        if (i7 != -1) {
            VerticalGridView verticalGridView = q02.f6466c;
            verticalGridView.setNumColumns(i7);
            boolean z7 = true;
            q02.d = true;
            Context context = verticalGridView.getContext();
            C0 c02 = this.f22g;
            boolean z8 = this.f20c;
            if (c02 == null) {
                A0 a02 = new A0();
                a02.f6339a = z8;
                a02.f6341c = this.d;
                a02.f6340b = true;
                a02.d = !C0741a.a(context).f10863a;
                a02.f6342e = true;
                a02.f = B0.f6343a;
                C0 a7 = a02.a(context);
                this.f22g = a7;
                if (a7.f6350e) {
                    this.f23h = new I(a7);
                }
            }
            q02.f6465b.f6379e = this.f23h;
            if (this.f22g.f6347a == 2) {
                verticalGridView.setLayoutMode(1);
            }
            if (this.f22g.f6347a == 3) {
                z7 = false;
            }
            verticalGridView.setFocusDrawingOrderEnabled(z7);
            q02.f6465b.f6380g = new C0306n(this.f19b, z8);
            verticalGridView.setOnChildSelectedListener(new D(this, 3, q02));
            return;
        }
        throw new IllegalStateException("Number of columns must be set");
    }

    @Override // androidx.leanback.widget.AbstractC0281a0
    /* renamed from: j */
    public final Q0 d(ViewGroup viewGroup) {
        Q0 q02 = new Q0((VerticalGridView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.lb_vertical_grid, viewGroup, false).findViewById(R.id.browse_grid));
        q02.d = false;
        q02.f6465b = new P0(this);
        h(q02);
        if (q02.d) {
            return q02;
        }
        throw new RuntimeException("super.initializeGridViewHolder() must be called");
    }

    public final void k(int i7) {
        if (i7 >= 0) {
            if (this.f18a != i7) {
                this.f18a = i7;
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Invalid number of columns");
    }
}
