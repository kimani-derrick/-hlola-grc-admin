package androidx.leanback.widget;

import android.graphics.Paint;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.boxhdo.android.tv.R;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
/* renamed from: androidx.leanback.widget.g0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0293g0 extends AbstractC0281a0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f6588a;

    /* renamed from: b  reason: collision with root package name */
    public final Paint f6589b = new Paint(1);

    /* renamed from: c  reason: collision with root package name */
    public boolean f6590c;
    public final boolean d;

    public C0293g0(int i7, boolean z7) {
        this.f6588a = i7;
        this.d = z7;
    }

    @Override // androidx.leanback.widget.AbstractC0281a0
    public final void c(Z z7, Object obj) {
        B0.d dVar;
        if (obj == null) {
            dVar = null;
        } else {
            dVar = ((AbstractC0287d0) obj).f6576a;
        }
        C0291f0 c0291f0 = (C0291f0) z7;
        if (dVar == null) {
            RowHeaderView rowHeaderView = c0291f0.f6581c;
            if (rowHeaderView != null) {
                rowHeaderView.setText((CharSequence) null);
            }
            TextView textView = c0291f0.d;
            if (textView != null) {
                textView.setText((CharSequence) null);
            }
            z7.f6572a.setContentDescription(null);
            if (this.f6590c) {
                z7.f6572a.setVisibility(8);
                return;
            }
            return;
        }
        RowHeaderView rowHeaderView2 = c0291f0.f6581c;
        if (rowHeaderView2 != null) {
            rowHeaderView2.setText(dVar.f149r);
        }
        TextView textView2 = c0291f0.d;
        if (textView2 != null) {
            if (TextUtils.isEmpty(null)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
            }
            textView2.setText((CharSequence) null);
        }
        z7.f6572a.setContentDescription(null);
        z7.f6572a.setVisibility(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.leanback.widget.Z, androidx.leanback.widget.f0] */
    @Override // androidx.leanback.widget.AbstractC0281a0
    public final Z d(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(this.f6588a, viewGroup, false);
        ?? z7 = new Z(inflate);
        RowHeaderView rowHeaderView = (RowHeaderView) inflate.findViewById(R.id.row_header);
        z7.f6581c = rowHeaderView;
        z7.d = (TextView) inflate.findViewById(R.id.row_header_description);
        if (rowHeaderView != null) {
            rowHeaderView.getCurrentTextColor();
        }
        z7.f6580b = inflate.getResources().getFraction(R.fraction.lb_browse_header_unselect_alpha, 1, 1);
        if (this.d) {
            h(z7, 0.0f);
        }
        return z7;
    }

    @Override // androidx.leanback.widget.AbstractC0281a0
    public final void e(Z z7) {
        C0291f0 c0291f0 = (C0291f0) z7;
        RowHeaderView rowHeaderView = c0291f0.f6581c;
        if (rowHeaderView != null) {
            rowHeaderView.setText((CharSequence) null);
        }
        TextView textView = c0291f0.d;
        if (textView != null) {
            textView.setText((CharSequence) null);
        }
        if (this.d) {
            h(c0291f0, 0.0f);
        }
    }

    public final void h(C0291f0 c0291f0, float f) {
        c0291f0.getClass();
        if (this.d) {
            float f7 = c0291f0.f6580b;
            c0291f0.f6572a.setAlpha(AbstractC0515y1.g(1.0f, f7, f, f7));
        }
    }
}
