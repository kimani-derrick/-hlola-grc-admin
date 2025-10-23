package androidx.leanback.widget;

import android.view.View;
/* renamed from: androidx.leanback.widget.t  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0316t extends w0.C {

    /* renamed from: q  reason: collision with root package name */
    public boolean f6651q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ C0321y f6652r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0316t(C0321y c0321y) {
        super(c0321y.f6703q.getContext());
        this.f6652r = c0321y;
    }

    @Override // w0.C
    public final int d(int i7) {
        int d = super.d(i7);
        int i8 = ((R0) this.f6652r.f6693Y.f423t).f6473i;
        if (i8 > 0) {
            float f = (30.0f / i8) * i7;
            if (d < f) {
                return (int) f;
            }
            return d;
        }
        return d;
    }

    @Override // w0.C
    public final void h() {
        super.h();
        if (!this.f6651q) {
            l();
        }
        C0321y c0321y = this.f6652r;
        if (c0321y.F == this) {
            c0321y.F = null;
        }
        if (c0321y.f6676G == this) {
            c0321y.f6676G = null;
        }
    }

    @Override // w0.C
    public final void i(View view, w0.g0 g0Var, w0.e0 e0Var) {
        int i7;
        int i8;
        int[] iArr = C0321y.f6670i0;
        C0321y c0321y = this.f6652r;
        if (c0321y.g1(view, null, iArr)) {
            if (c0321y.f6704r == 0) {
                i7 = iArr[0];
                i8 = iArr[1];
            } else {
                i7 = iArr[1];
                i8 = iArr[0];
            }
            e0Var.b(i7, i8, c((int) Math.sqrt((i8 * i8) + (i7 * i7))), this.f15452j);
        }
    }

    public void l() {
        View f = f(this.f15445a);
        C0321y c0321y = this.f6652r;
        if (f == null) {
            int i7 = this.f15445a;
            if (i7 >= 0) {
                c0321y.x1(i7, 0, 0, false);
                return;
            }
            return;
        }
        int i8 = c0321y.f6674D;
        int i9 = this.f15445a;
        if (i8 != i9) {
            c0321y.f6674D = i9;
        }
        if (c0321y.S()) {
            c0321y.f6712z |= 32;
            f.requestFocus();
            c0321y.f6712z &= -33;
        }
        c0321y.Y0();
        c0321y.Z0();
    }
}
