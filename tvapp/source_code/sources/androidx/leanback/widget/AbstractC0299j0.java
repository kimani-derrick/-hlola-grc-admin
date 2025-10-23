package androidx.leanback.widget;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.boxhdo.android.tv.R;
/* renamed from: androidx.leanback.widget.j0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0299j0 extends AbstractC0281a0 {

    /* renamed from: a  reason: collision with root package name */
    public C0293g0 f6602a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f6603b;

    /* renamed from: c  reason: collision with root package name */
    public final int f6604c;

    public AbstractC0299j0() {
        C0293g0 c0293g0 = new C0293g0(R.layout.lb_row_header, true);
        this.f6602a = c0293g0;
        this.f6603b = true;
        this.f6604c = 1;
        c0293g0.f6590c = true;
    }

    public static C0297i0 k(Z z7) {
        if (z7 instanceof C0295h0) {
            return ((C0295h0) z7).f6591b;
        }
        return (C0297i0) z7;
    }

    @Override // androidx.leanback.widget.AbstractC0281a0
    public final void c(Z z7, Object obj) {
        m(k(z7), obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.widget.LinearLayout, android.view.View, androidx.leanback.widget.e0, android.view.ViewGroup] */
    @Override // androidx.leanback.widget.AbstractC0281a0
    public final Z d(ViewGroup viewGroup) {
        Z c0295h0;
        C0297i0 h7 = h(viewGroup);
        h7.f6597i = false;
        if (this.f6602a == null && (!(!(this instanceof q1.j)) || !this.f6603b)) {
            c0295h0 = h7;
        } else {
            Context context = viewGroup.getContext();
            ?? linearLayout = new LinearLayout(context, null, 0);
            linearLayout.f6579s = true;
            linearLayout.setOrientation(1);
            LayoutInflater.from(context).inflate((int) R.layout.lb_row_container, (ViewGroup) linearLayout);
            linearLayout.f6577q = (ViewGroup) linearLayout.findViewById(R.id.lb_row_container_header_dock);
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            C0293g0 c0293g0 = this.f6602a;
            if (c0293g0 != null) {
                h7.f6593c = (C0291f0) c0293g0.d((ViewGroup) h7.f6572a);
            }
            c0295h0 = new C0295h0(linearLayout, h7);
        }
        l(h7);
        if (h7.f6597i) {
            return c0295h0;
        }
        throw new RuntimeException("super.initializeRowViewHolder() must be called");
    }

    @Override // androidx.leanback.widget.AbstractC0281a0
    public final void e(Z z7) {
        q(k(z7));
    }

    @Override // androidx.leanback.widget.AbstractC0281a0
    public final void f(Z z7) {
        if (k(z7).f6593c != null) {
            this.f6602a.getClass();
        }
    }

    @Override // androidx.leanback.widget.AbstractC0281a0
    public final void g(Z z7) {
        C0297i0 k5 = k(z7);
        C0291f0 c0291f0 = k5.f6593c;
        if (c0291f0 != null) {
            this.f6602a.getClass();
            AbstractC0281a0.b(c0291f0.f6572a);
        }
        AbstractC0281a0.b(k5.f6572a);
    }

    public abstract C0297i0 h(ViewGroup viewGroup);

    public void i(C0297i0 c0297i0, boolean z7) {
        V v5;
        if (z7 && (v5 = c0297i0.f6600l) != null) {
            v5.g(null, null, c0297i0, c0297i0.f6594e);
        }
    }

    public void j(C0297i0 c0297i0, boolean z7) {
    }

    public void l(C0297i0 c0297i0) {
        c0297i0.f6597i = true;
        View view = c0297i0.f6572a;
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).setClipChildren(false);
        }
        C0295h0 c0295h0 = c0297i0.f6592b;
        if (c0295h0 != null) {
            ((ViewGroup) c0295h0.f6572a).setClipChildren(false);
        }
    }

    public void m(C0297i0 c0297i0, Object obj) {
        c0297i0.f6594e = obj;
        AbstractC0287d0 abstractC0287d0 = obj instanceof AbstractC0287d0 ? (AbstractC0287d0) obj : null;
        c0297i0.d = abstractC0287d0;
        C0291f0 c0291f0 = c0297i0.f6593c;
        if (c0291f0 == null || abstractC0287d0 == null) {
            return;
        }
        this.f6602a.c(c0291f0, obj);
    }

    public void n(C0297i0 c0297i0, boolean z7) {
        t(c0297i0);
        s(c0297i0, c0297i0.f6572a);
    }

    public void o(C0297i0 c0297i0, boolean z7) {
        i(c0297i0, z7);
        t(c0297i0);
        s(c0297i0, c0297i0.f6572a);
    }

    public void p(C0297i0 c0297i0) {
        if (this.f6603b) {
            float f = c0297i0.f6598j;
            g0.a aVar = c0297i0.f6599k;
            aVar.b(f);
            C0291f0 c0291f0 = c0297i0.f6593c;
            if (c0291f0 != null) {
                this.f6602a.h(c0291f0, c0297i0.f6598j);
            }
            if (!(this instanceof q1.j)) {
                C0289e0 c0289e0 = (C0289e0) c0297i0.f6592b.f6572a;
                int color = aVar.f10504c.getColor();
                Drawable drawable = c0289e0.f6578r;
                if (drawable instanceof ColorDrawable) {
                    ((ColorDrawable) drawable.mutate()).setColor(color);
                    c0289e0.invalidate();
                    return;
                }
                c0289e0.setForeground(new ColorDrawable(color));
            }
        }
    }

    public void q(C0297i0 c0297i0) {
        C0291f0 c0291f0 = c0297i0.f6593c;
        if (c0291f0 != null) {
            this.f6602a.e(c0291f0);
        }
        c0297i0.d = null;
        c0297i0.f6594e = null;
    }

    public void r(C0297i0 c0297i0, boolean z7) {
        C0291f0 c0291f0 = c0297i0.f6593c;
        if (c0291f0 == null || c0291f0.f6572a.getVisibility() == 8) {
            return;
        }
        c0297i0.f6593c.f6572a.setVisibility(z7 ? 0 : 4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0012, code lost:
        if (r5.f6595g != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0014, code lost:
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x001c, code lost:
        if (r5.f6595g != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0021, code lost:
        if (r5.f6596h != false) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(androidx.leanback.widget.C0297i0 r5, android.view.View r6) {
        /*
            r4 = this;
            int r0 = r4.f6604c
            r1 = 2
            r2 = 1
            if (r0 == r2) goto L1f
            if (r0 == r1) goto L1a
            r3 = 3
            if (r0 == r3) goto Lc
            goto L24
        Lc:
            boolean r0 = r5.f6596h
            if (r0 == 0) goto L16
            boolean r0 = r5.f6595g
            if (r0 == 0) goto L16
        L14:
            r0 = r2
            goto L17
        L16:
            r0 = r1
        L17:
            r5.f = r0
            goto L24
        L1a:
            boolean r0 = r5.f6595g
            if (r0 == 0) goto L16
            goto L14
        L1f:
            boolean r0 = r5.f6596h
            if (r0 == 0) goto L16
            goto L14
        L24:
            int r5 = r5.f
            if (r5 != r2) goto L2c
            r6.setActivated(r2)
            goto L32
        L2c:
            if (r5 != r1) goto L32
            r5 = 0
            r6.setActivated(r5)
        L32:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.AbstractC0299j0.s(androidx.leanback.widget.i0, android.view.View):void");
    }

    public final void t(C0297i0 c0297i0) {
        int i7;
        if (this.f6602a != null && c0297i0.f6593c != null) {
            C0289e0 c0289e0 = (C0289e0) c0297i0.f6592b.f6572a;
            boolean z7 = c0297i0.f6596h;
            c0289e0.getClass();
            if (z7) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            c0289e0.f6577q.setVisibility(i7);
        }
    }
}
