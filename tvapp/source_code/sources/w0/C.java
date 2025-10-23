package w0;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes.dex */
public class C {

    /* renamed from: a  reason: collision with root package name */
    public int f15445a = -1;

    /* renamed from: b  reason: collision with root package name */
    public RecyclerView f15446b;

    /* renamed from: c  reason: collision with root package name */
    public U f15447c;
    public boolean d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f15448e;
    public View f;

    /* renamed from: g  reason: collision with root package name */
    public final e0 f15449g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f15450h;

    /* renamed from: i  reason: collision with root package name */
    public final LinearInterpolator f15451i;

    /* renamed from: j  reason: collision with root package name */
    public final DecelerateInterpolator f15452j;

    /* renamed from: k  reason: collision with root package name */
    public PointF f15453k;

    /* renamed from: l  reason: collision with root package name */
    public final DisplayMetrics f15454l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f15455m;
    public float n;

    /* renamed from: o  reason: collision with root package name */
    public int f15456o;

    /* renamed from: p  reason: collision with root package name */
    public int f15457p;

    /* JADX WARN: Type inference failed for: r1v0, types: [w0.e0, java.lang.Object] */
    public C(Context context) {
        ?? obj = new Object();
        obj.d = -1;
        obj.f = false;
        obj.f15530g = 0;
        obj.f15526a = 0;
        obj.f15527b = 0;
        obj.f15528c = Integer.MIN_VALUE;
        obj.f15529e = null;
        this.f15449g = obj;
        this.f15451i = new LinearInterpolator();
        this.f15452j = new DecelerateInterpolator();
        this.f15455m = false;
        this.f15456o = 0;
        this.f15457p = 0;
        this.f15454l = context.getResources().getDisplayMetrics();
    }

    public static int a(int i7, int i8, int i9, int i10, int i11) {
        if (i11 != -1) {
            if (i11 != 0) {
                if (i11 == 1) {
                    return i10 - i8;
                }
                throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
            }
            int i12 = i9 - i7;
            if (i12 > 0) {
                return i12;
            }
            int i13 = i10 - i8;
            if (i13 < 0) {
                return i13;
            }
            return 0;
        }
        return i9 - i7;
    }

    public float b(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public final int c(int i7) {
        return (int) Math.ceil(d(i7) / 0.3356d);
    }

    public int d(int i7) {
        float abs = Math.abs(i7);
        if (!this.f15455m) {
            this.n = b(this.f15454l);
            this.f15455m = true;
        }
        return (int) Math.ceil(abs * this.n);
    }

    public PointF e(int i7) {
        U u7 = this.f15447c;
        if (u7 instanceof f0) {
            return ((f0) u7).a(i7);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + f0.class.getCanonicalName());
        return null;
    }

    public final View f(int i7) {
        return this.f15446b.f6895D.t(i7);
    }

    public final void g(int i7, int i8) {
        PointF e3;
        RecyclerView recyclerView = this.f15446b;
        if (this.f15445a == -1 || recyclerView == null) {
            j();
        }
        if (this.d && this.f == null && this.f15447c != null && (e3 = e(this.f15445a)) != null) {
            float f = e3.x;
            if (f != 0.0f || e3.y != 0.0f) {
                recyclerView.i0((int) Math.signum(f), (int) Math.signum(e3.y), null);
            }
        }
        boolean z7 = false;
        this.d = false;
        View view = this.f;
        e0 e0Var = this.f15449g;
        if (view != null) {
            this.f15446b.getClass();
            if (RecyclerView.L(view) == this.f15445a) {
                i(this.f, recyclerView.f6959x0, e0Var);
                e0Var.a(recyclerView);
                j();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f = null;
            }
        }
        if (this.f15448e) {
            g0 g0Var = recyclerView.f6959x0;
            if (this.f15446b.f6895D.y() == 0) {
                j();
            } else {
                int i9 = this.f15456o;
                int i10 = i9 - i7;
                if (i9 * i10 <= 0) {
                    i10 = 0;
                }
                this.f15456o = i10;
                int i11 = this.f15457p;
                int i12 = i11 - i8;
                if (i11 * i12 <= 0) {
                    i12 = 0;
                }
                this.f15457p = i12;
                if (i10 == 0 && i12 == 0) {
                    k(e0Var);
                }
            }
            if (e0Var.d >= 0) {
                z7 = true;
            }
            e0Var.a(recyclerView);
            if (z7 && this.f15448e) {
                this.d = true;
                recyclerView.f6953u0.b();
            }
        }
    }

    public void h() {
        this.f15457p = 0;
        this.f15456o = 0;
        this.f15453k = null;
    }

    public void i(View view, g0 g0Var, e0 e0Var) {
        int i7;
        int i8;
        int i9;
        int i10;
        PointF pointF = this.f15453k;
        int i11 = -1;
        int i12 = 0;
        if (pointF != null && pointF.x != 0.0f) {
            if (i10 > 0) {
                i7 = 1;
            } else {
                i7 = -1;
            }
        } else {
            i7 = 0;
        }
        U u7 = this.f15447c;
        if (u7 != null && u7.f()) {
            V v5 = (V) view.getLayoutParams();
            i8 = a(u7.D(view) - ((ViewGroup.MarginLayoutParams) v5).leftMargin, u7.G(view) + ((ViewGroup.MarginLayoutParams) v5).rightMargin, u7.L(), u7.n - u7.M(), i7);
        } else {
            i8 = 0;
        }
        PointF pointF2 = this.f15453k;
        if (pointF2 != null && pointF2.y != 0.0f) {
            if (i9 > 0) {
                i11 = 1;
            }
        } else {
            i11 = 0;
        }
        U u8 = this.f15447c;
        if (u8 != null && u8.g()) {
            V v7 = (V) view.getLayoutParams();
            i12 = a(u8.H(view) - ((ViewGroup.MarginLayoutParams) v7).topMargin, u8.B(view) + ((ViewGroup.MarginLayoutParams) v7).bottomMargin, u8.N(), u8.f15489o - u8.K(), i11);
        }
        int c5 = c((int) Math.sqrt((i12 * i12) + (i8 * i8)));
        if (c5 > 0) {
            e0Var.b(-i8, -i12, c5, this.f15452j);
        }
    }

    public final void j() {
        if (!this.f15448e) {
            return;
        }
        this.f15448e = false;
        h();
        this.f15446b.f6959x0.f15539a = -1;
        this.f = null;
        this.f15445a = -1;
        this.d = false;
        U u7 = this.f15447c;
        if (u7.f15481e == this) {
            u7.f15481e = null;
        }
        this.f15447c = null;
        this.f15446b = null;
    }

    public void k(e0 e0Var) {
        PointF e3 = e(this.f15445a);
        if (e3 != null) {
            float f = e3.x;
            if (f != 0.0f || e3.y != 0.0f) {
                float f7 = e3.y;
                float sqrt = (float) Math.sqrt((f7 * f7) + (f * f));
                float f8 = e3.x / sqrt;
                e3.x = f8;
                float f9 = e3.y / sqrt;
                e3.y = f9;
                this.f15453k = e3;
                this.f15456o = (int) (f8 * 10000.0f);
                this.f15457p = (int) (f9 * 10000.0f);
                e0Var.b((int) (this.f15456o * 1.2f), (int) (this.f15457p * 1.2f), (int) (d(10000) * 1.2f), this.f15451i);
                return;
            }
        }
        e0Var.d = this.f15445a;
        j();
    }
}
