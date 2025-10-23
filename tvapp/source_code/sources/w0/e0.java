package w0;

import android.util.Log;
import android.view.animation.BaseInterpolator;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a  reason: collision with root package name */
    public int f15526a;

    /* renamed from: b  reason: collision with root package name */
    public int f15527b;

    /* renamed from: c  reason: collision with root package name */
    public int f15528c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public Interpolator f15529e;
    public boolean f;

    /* renamed from: g  reason: collision with root package name */
    public int f15530g;

    public final void a(RecyclerView recyclerView) {
        int i7 = this.d;
        if (i7 >= 0) {
            this.d = -1;
            recyclerView.S(i7);
            this.f = false;
        } else if (this.f) {
            Interpolator interpolator = this.f15529e;
            if (interpolator != null && this.f15528c < 1) {
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            int i8 = this.f15528c;
            if (i8 >= 1) {
                recyclerView.f6953u0.c(this.f15526a, this.f15527b, i8, interpolator);
                int i9 = this.f15530g + 1;
                this.f15530g = i9;
                if (i9 > 10) {
                    Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                this.f = false;
                return;
            }
            throw new IllegalStateException("Scroll duration must be a positive number");
        } else {
            this.f15530g = 0;
        }
    }

    public final void b(int i7, int i8, int i9, BaseInterpolator baseInterpolator) {
        this.f15526a = i7;
        this.f15527b = i8;
        this.f15528c = i9;
        this.f15529e = baseInterpolator;
        this.f = true;
    }
}
