package androidx.leanback.widget;

import android.graphics.PointF;
import android.view.View;
/* renamed from: androidx.leanback.widget.v  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0318v extends AbstractC0316t {

    /* renamed from: s  reason: collision with root package name */
    public final boolean f6661s;

    /* renamed from: t  reason: collision with root package name */
    public int f6662t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ C0321y f6663u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0318v(C0321y c0321y, int i7, boolean z7) {
        super(c0321y);
        this.f6663u = c0321y;
        this.f6662t = i7;
        this.f6661s = z7;
        this.f15445a = -2;
    }

    @Override // w0.C
    public final PointF e(int i7) {
        int i8 = this.f6662t;
        if (i8 == 0) {
            return null;
        }
        C0321y c0321y = this.f6663u;
        int i9 = ((c0321y.f6712z & 262144) == 0 ? i8 >= 0 : i8 <= 0) ? 1 : -1;
        return c0321y.f6704r == 0 ? new PointF(i9, 0.0f) : new PointF(0.0f, i9);
    }

    @Override // w0.C
    public final void k(w0.e0 e0Var) {
        if (this.f6662t == 0) {
            return;
        }
        super.k(e0Var);
    }

    @Override // androidx.leanback.widget.AbstractC0316t
    public final void l() {
        super.l();
        this.f6662t = 0;
        View f = f(this.f15445a);
        if (f != null) {
            C0321y c0321y = this.f6663u;
            c0321y.getClass();
            c0321y.y1(f, f.findFocus(), true, 0, 0);
        }
    }
}
