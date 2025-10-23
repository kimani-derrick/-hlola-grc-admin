package q1;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.D;
import androidx.leanback.widget.A0;
import androidx.leanback.widget.AbstractC0299j0;
import androidx.leanback.widget.B0;
import androidx.leanback.widget.C0;
import androidx.leanback.widget.C0291f0;
import androidx.leanback.widget.C0293g0;
import androidx.leanback.widget.C0297i0;
import androidx.leanback.widget.C0306n;
import androidx.leanback.widget.G;
import androidx.leanback.widget.HorizontalGridView;
import androidx.leanback.widget.I;
import androidx.leanback.widget.J;
import androidx.leanback.widget.K;
import androidx.leanback.widget.L;
import androidx.leanback.widget.V;
import androidx.leanback.widget.z0;
import com.boxhdo.android.tv.R;
import f0.AbstractC0659a;
import h0.C0741a;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class j extends AbstractC0299j0 {
    public static int n;

    /* renamed from: o  reason: collision with root package name */
    public static int f13242o;

    /* renamed from: p  reason: collision with root package name */
    public static int f13243p;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public int f13244e;
    public boolean f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f13245g;

    /* renamed from: h  reason: collision with root package name */
    public int f13246h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f13247i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f13248j;

    /* renamed from: k  reason: collision with root package name */
    public HashMap f13249k;

    /* renamed from: l  reason: collision with root package name */
    public C0 f13250l;

    /* renamed from: m  reason: collision with root package name */
    public I f13251m;

    public static void v(L l7, View view, boolean z7) {
        V v5;
        V v7;
        if (view != null) {
            if (l7.f6595g) {
                G g7 = (G) l7.n.M(view);
                if (z7 && (v7 = l7.f6600l) != null) {
                    v7.g(g7.f6367v, g7.f6369x, l7, l7.d);
                }
            }
        } else if (z7 && (v5 = l7.f6600l) != null) {
            v5.g(null, null, l7, l7.d);
        }
    }

    public static void x(L l7) {
        View view;
        if (l7.f6596h && l7.f6595g) {
            HorizontalGridView horizontalGridView = l7.n;
            G g7 = (G) horizontalGridView.H(horizontalGridView.getSelectedPosition(), false);
            if (g7 == null) {
                view = null;
            } else {
                view = g7.f15576a;
            }
            v(l7, view, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.widget.LinearLayout, androidx.leanback.widget.M, android.view.View, android.view.ViewGroup] */
    @Override // androidx.leanback.widget.AbstractC0299j0
    public final C0297i0 h(ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        if (n == 0) {
            n = context.getResources().getDimensionPixelSize(R.dimen.lb_browse_selected_row_top_padding);
            f13242o = context.getResources().getDimensionPixelSize(R.dimen.lb_browse_expanded_selected_row_top_padding);
            f13243p = context.getResources().getDimensionPixelSize(R.dimen.lb_browse_expanded_row_no_hovercard_bottom_padding);
        }
        Context context2 = viewGroup.getContext();
        ?? linearLayout = new LinearLayout(context2, null, 0);
        LayoutInflater.from(context2).inflate((int) R.layout.lb_list_row, (ViewGroup) linearLayout);
        HorizontalGridView horizontalGridView = (HorizontalGridView) linearLayout.findViewById(R.id.row_content);
        linearLayout.f6422q = horizontalGridView;
        horizontalGridView.setHasFixedSize(false);
        linearLayout.setOrientation(1);
        linearLayout.setDescendantFocusability(262144);
        HorizontalGridView gridView = linearLayout.getGridView();
        if (this.f13246h < 0) {
            TypedArray obtainStyledAttributes = gridView.getContext().obtainStyledAttributes(AbstractC0659a.f10198b);
            this.f13246h = (int) obtainStyledAttributes.getDimension(5, 0.0f);
            obtainStyledAttributes.recycle();
        }
        gridView.setFadingLeftEdgeLength(this.f13246h);
        return new L(linearLayout, linearLayout.getGridView());
    }

    @Override // androidx.leanback.widget.AbstractC0299j0
    public final void i(C0297i0 c0297i0, boolean z7) {
        V v5;
        L l7 = (L) c0297i0;
        HorizontalGridView horizontalGridView = l7.n;
        G g7 = (G) horizontalGridView.H(horizontalGridView.getSelectedPosition(), false);
        if (g7 == null) {
            super.i(c0297i0, z7);
        } else if (z7 && (v5 = c0297i0.f6600l) != null) {
            v5.g(g7.f6367v, g7.f6369x, l7, l7.d);
        }
    }

    @Override // androidx.leanback.widget.AbstractC0299j0
    public final void j(C0297i0 c0297i0, boolean z7) {
        L l7 = (L) c0297i0;
        l7.n.setScrollEnabled(!z7);
        l7.n.setAnimateChildLayout(!z7);
    }

    @Override // androidx.leanback.widget.AbstractC0299j0
    public final void l(C0297i0 c0297i0) {
        boolean z7;
        super.l(c0297i0);
        L l7 = (L) c0297i0;
        Context context = c0297i0.f6572a.getContext();
        boolean z8 = false;
        if (this.f13250l == null) {
            A0 a02 = new A0();
            a02.f6339a = this.f6603b;
            a02.f6341c = this.f13245g;
            if ((!C0741a.a(context).f10864b) && this.f13247i) {
                z7 = true;
            } else {
                z7 = false;
            }
            a02.f6340b = z7;
            a02.d = !C0741a.a(context).f10863a;
            a02.f6342e = this.f13248j;
            a02.f = B0.f6343a;
            C0 a7 = a02.a(context);
            this.f13250l = a7;
            if (a7.f6350e) {
                this.f13251m = new I(a7);
            }
        }
        K k5 = new K(this, l7);
        l7.f6415o = k5;
        k5.f6379e = this.f13251m;
        int i7 = this.f13250l.f6347a;
        HorizontalGridView horizontalGridView = l7.n;
        if (i7 == 2) {
            horizontalGridView.setLayoutMode(1);
        }
        l7.f6415o.f6380g = new C0306n(this.f13244e, this.f);
        if (this.f13250l.f6347a != 3) {
            z8 = true;
        }
        horizontalGridView.setFocusDrawingOrderEnabled(z8);
        horizontalGridView.setOnChildSelectedListener(new D(this, 2, l7));
        horizontalGridView.setOnUnhandledKeyListener(new Z5.n(l7));
        horizontalGridView.setNumRows(this.d);
    }

    @Override // androidx.leanback.widget.AbstractC0299j0
    public final void m(C0297i0 c0297i0, Object obj) {
        String str;
        super.m(c0297i0, obj);
        L l7 = (L) c0297i0;
        J j7 = (J) obj;
        l7.f6415o.p(j7.f6402b);
        K k5 = l7.f6415o;
        HorizontalGridView horizontalGridView = l7.n;
        horizontalGridView.setAdapter(k5);
        B0.d dVar = j7.f6576a;
        if (dVar != null) {
            str = dVar.f149r;
        } else {
            str = null;
        }
        horizontalGridView.setContentDescription(str);
    }

    @Override // androidx.leanback.widget.AbstractC0299j0
    public final void n(C0297i0 c0297i0, boolean z7) {
        super.n(c0297i0, z7);
        L l7 = (L) c0297i0;
        w(l7);
        x(l7);
    }

    @Override // androidx.leanback.widget.AbstractC0299j0
    public final void o(C0297i0 c0297i0, boolean z7) {
        super.o(c0297i0, z7);
        L l7 = (L) c0297i0;
        w(l7);
        x(l7);
    }

    @Override // androidx.leanback.widget.AbstractC0299j0
    public final void p(C0297i0 c0297i0) {
        super.p(c0297i0);
        L l7 = (L) c0297i0;
        HorizontalGridView horizontalGridView = l7.n;
        int childCount = horizontalGridView.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            u(l7, horizontalGridView.getChildAt(i7));
        }
    }

    @Override // androidx.leanback.widget.AbstractC0299j0
    public final void q(C0297i0 c0297i0) {
        L l7 = (L) c0297i0;
        l7.n.setAdapter(null);
        l7.f6415o.p(null);
        super.q(c0297i0);
    }

    @Override // androidx.leanback.widget.AbstractC0299j0
    public final void r(C0297i0 c0297i0, boolean z7) {
        int i7;
        super.r(c0297i0, z7);
        L l7 = (L) c0297i0;
        if (z7) {
            i7 = 0;
        } else {
            i7 = 4;
        }
        l7.n.setChildrenVisibility(i7);
    }

    public final void u(L l7, View view) {
        C0 c02 = this.f13250l;
        if (c02 != null && c02.f6348b) {
            int color = l7.f6599k.f10504c.getColor();
            if (this.f13250l.f6350e) {
                ((z0) view).setOverlayColor(color);
                return;
            }
            Drawable foreground = view.getForeground();
            if (foreground instanceof ColorDrawable) {
                ((ColorDrawable) foreground).setColor(color);
            } else {
                view.setForeground(new ColorDrawable(color));
            }
        }
    }

    public final void w(L l7) {
        int i7;
        int i8;
        int i9 = 0;
        if (l7.f6596h) {
            C0291f0 c0291f0 = l7.f6593c;
            if (c0291f0 != null) {
                C0293g0 c0293g0 = this.f6602a;
                View view = c0291f0.f6572a;
                if (c0293g0 != null) {
                    int paddingBottom = view.getPaddingBottom();
                    if (view instanceof TextView) {
                        TextView textView = (TextView) view;
                        Paint paint = c0293g0.f6589b;
                        if (paint.getTextSize() != textView.getTextSize()) {
                            paint.setTextSize(textView.getTextSize());
                        }
                        if (paint.getTypeface() != textView.getTypeface()) {
                            paint.setTypeface(textView.getTypeface());
                        }
                        paddingBottom += (int) paint.descent();
                    }
                    i9 = paddingBottom;
                } else {
                    i9 = view.getPaddingBottom();
                }
            }
            if (l7.f6595g) {
                i8 = f13242o;
            } else {
                i8 = l7.f6416p;
            }
            i9 = i8 - i9;
            i7 = f13243p;
        } else {
            boolean z7 = l7.f6595g;
            int i10 = l7.f6417q;
            if (z7) {
                i7 = n;
                i9 = i7 - i10;
            } else {
                i7 = i10;
            }
        }
        l7.n.setPadding(l7.f6418r, i9, l7.f6419s, i7);
    }
}
