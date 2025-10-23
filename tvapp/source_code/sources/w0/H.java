package w0;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
/* loaded from: classes.dex */
public final class H extends C {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ I f15459q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(I i7, Context context) {
        super(context);
        this.f15459q = i7;
    }

    @Override // w0.C
    public final float b(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // w0.C
    public final int d(int i7) {
        return Math.min(100, super.d(i7));
    }

    @Override // w0.C
    public final void i(View view, g0 g0Var, e0 e0Var) {
        I i7 = this.f15459q;
        int[] a7 = i7.a(i7.f15460a.getLayoutManager(), view);
        int i8 = a7[0];
        int i9 = a7[1];
        int c5 = c(Math.max(Math.abs(i8), Math.abs(i9)));
        if (c5 > 0) {
            e0Var.b(i8, i9, c5, this.f15452j);
        }
    }
}
