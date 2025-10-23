package w0;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;
import java.util.ArrayList;
/* renamed from: w0.t  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1365t extends Q {

    /* renamed from: C  reason: collision with root package name */
    public static final int[] f15655C = {16842919};

    /* renamed from: D  reason: collision with root package name */
    public static final int[] f15656D = new int[0];

    /* renamed from: A  reason: collision with root package name */
    public int f15657A;

    /* renamed from: B  reason: collision with root package name */
    public final P.b f15658B;

    /* renamed from: a  reason: collision with root package name */
    public final int f15659a;

    /* renamed from: b  reason: collision with root package name */
    public final int f15660b;

    /* renamed from: c  reason: collision with root package name */
    public final StateListDrawable f15661c;
    public final Drawable d;

    /* renamed from: e  reason: collision with root package name */
    public final int f15662e;
    public final int f;

    /* renamed from: g  reason: collision with root package name */
    public final StateListDrawable f15663g;

    /* renamed from: h  reason: collision with root package name */
    public final Drawable f15664h;

    /* renamed from: i  reason: collision with root package name */
    public final int f15665i;

    /* renamed from: j  reason: collision with root package name */
    public final int f15666j;

    /* renamed from: k  reason: collision with root package name */
    public int f15667k;

    /* renamed from: l  reason: collision with root package name */
    public int f15668l;

    /* renamed from: m  reason: collision with root package name */
    public float f15669m;
    public int n;

    /* renamed from: o  reason: collision with root package name */
    public int f15670o;

    /* renamed from: p  reason: collision with root package name */
    public float f15671p;

    /* renamed from: s  reason: collision with root package name */
    public final RecyclerView f15674s;

    /* renamed from: z  reason: collision with root package name */
    public final ValueAnimator f15681z;

    /* renamed from: q  reason: collision with root package name */
    public int f15672q = 0;

    /* renamed from: r  reason: collision with root package name */
    public int f15673r = 0;

    /* renamed from: t  reason: collision with root package name */
    public boolean f15675t = false;

    /* renamed from: u  reason: collision with root package name */
    public boolean f15676u = false;

    /* renamed from: v  reason: collision with root package name */
    public int f15677v = 0;

    /* renamed from: w  reason: collision with root package name */
    public int f15678w = 0;

    /* renamed from: x  reason: collision with root package name */
    public final int[] f15679x = new int[2];

    /* renamed from: y  reason: collision with root package name */
    public final int[] f15680y = new int[2];

    public C1365t(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i7, int i8, int i9) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f15681z = ofFloat;
        this.f15657A = 0;
        P.b bVar = new P.b(21, this);
        this.f15658B = bVar;
        androidx.leanback.app.j jVar = new androidx.leanback.app.j(1, this);
        this.f15661c = stateListDrawable;
        this.d = drawable;
        this.f15663g = stateListDrawable2;
        this.f15664h = drawable2;
        this.f15662e = Math.max(i7, stateListDrawable.getIntrinsicWidth());
        this.f = Math.max(i7, drawable.getIntrinsicWidth());
        this.f15665i = Math.max(i7, stateListDrawable2.getIntrinsicWidth());
        this.f15666j = Math.max(i7, drawable2.getIntrinsicWidth());
        this.f15659a = i8;
        this.f15660b = i9;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new C1364s(this));
        ofFloat.addUpdateListener(new L3.k(3, this));
        RecyclerView recyclerView2 = this.f15674s;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                U u7 = recyclerView2.f6895D;
                if (u7 != null) {
                    u7.d("Cannot remove item decoration during a scroll  or layout");
                }
                ArrayList arrayList = recyclerView2.f6900G;
                arrayList.remove(this);
                if (arrayList.isEmpty()) {
                    recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
                }
                recyclerView2.T();
                recyclerView2.requestLayout();
                RecyclerView recyclerView3 = this.f15674s;
                recyclerView3.f6901H.remove(this);
                if (recyclerView3.f6903I == this) {
                    recyclerView3.f6903I = null;
                }
                ArrayList arrayList2 = this.f15674s.f6962z0;
                if (arrayList2 != null) {
                    arrayList2.remove(jVar);
                }
                this.f15674s.removeCallbacks(bVar);
            }
            this.f15674s = recyclerView;
            if (recyclerView != null) {
                recyclerView.h(this);
                this.f15674s.f6901H.add(this);
                this.f15674s.i(jVar);
            }
        }
    }

    public static int f(float f, float f7, int[] iArr, int i7, int i8, int i9) {
        int i10 = iArr[1] - iArr[0];
        if (i10 == 0) {
            return 0;
        }
        int i11 = i7 - i9;
        int i12 = (int) (((f7 - f) / i10) * i11);
        int i13 = i8 + i12;
        if (i13 >= i11 || i13 < 0) {
            return 0;
        }
        return i12;
    }

    @Override // w0.Q
    public final void c(Canvas canvas) {
        int i7;
        int i8 = this.f15672q;
        RecyclerView recyclerView = this.f15674s;
        if (i8 == recyclerView.getWidth() && this.f15673r == recyclerView.getHeight()) {
            if (this.f15657A != 0) {
                if (this.f15675t) {
                    int i9 = this.f15672q;
                    int i10 = this.f15662e;
                    int i11 = i9 - i10;
                    int i12 = this.f15668l;
                    int i13 = this.f15667k;
                    int i14 = i12 - (i13 / 2);
                    StateListDrawable stateListDrawable = this.f15661c;
                    stateListDrawable.setBounds(0, 0, i10, i13);
                    int i15 = this.f15673r;
                    int i16 = this.f;
                    Drawable drawable = this.d;
                    drawable.setBounds(0, 0, i16, i15);
                    Field field = K.O.f1447a;
                    if (recyclerView.getLayoutDirection() == 1) {
                        drawable.draw(canvas);
                        canvas.translate(i10, i14);
                        canvas.scale(-1.0f, 1.0f);
                        stateListDrawable.draw(canvas);
                        canvas.scale(-1.0f, 1.0f);
                        i7 = -i10;
                    } else {
                        canvas.translate(i11, 0.0f);
                        drawable.draw(canvas);
                        canvas.translate(0.0f, i14);
                        stateListDrawable.draw(canvas);
                        i7 = -i11;
                    }
                    canvas.translate(i7, -i14);
                }
                if (this.f15676u) {
                    int i17 = this.f15673r;
                    int i18 = this.f15665i;
                    int i19 = i17 - i18;
                    int i20 = this.f15670o;
                    int i21 = this.n;
                    int i22 = i20 - (i21 / 2);
                    StateListDrawable stateListDrawable2 = this.f15663g;
                    stateListDrawable2.setBounds(0, 0, i21, i18);
                    int i23 = this.f15672q;
                    int i24 = this.f15666j;
                    Drawable drawable2 = this.f15664h;
                    drawable2.setBounds(0, 0, i23, i24);
                    canvas.translate(0.0f, i19);
                    drawable2.draw(canvas);
                    canvas.translate(i22, 0.0f);
                    stateListDrawable2.draw(canvas);
                    canvas.translate(-i22, -i19);
                    return;
                }
                return;
            }
            return;
        }
        this.f15672q = recyclerView.getWidth();
        this.f15673r = recyclerView.getHeight();
        g(0);
    }

    public final boolean d(float f, float f7) {
        if (f7 >= this.f15673r - this.f15665i) {
            int i7 = this.f15670o;
            int i8 = this.n;
            if (f >= i7 - (i8 / 2) && f <= (i8 / 2) + i7) {
                return true;
            }
        }
        return false;
    }

    public final boolean e(float f, float f7) {
        boolean z7;
        RecyclerView recyclerView = this.f15674s;
        Field field = K.O.f1447a;
        if (recyclerView.getLayoutDirection() == 1) {
            z7 = true;
        } else {
            z7 = false;
        }
        int i7 = this.f15662e;
        if (z7) {
            if (f > i7) {
                return false;
            }
        } else if (f < this.f15672q - i7) {
            return false;
        }
        int i8 = this.f15668l;
        int i9 = this.f15667k / 2;
        if (f7 < i8 - i9 || f7 > i9 + i8) {
            return false;
        }
        return true;
    }

    public final void g(int i7) {
        RecyclerView recyclerView;
        int i8;
        P.b bVar = this.f15658B;
        StateListDrawable stateListDrawable = this.f15661c;
        if (i7 == 2 && this.f15677v != 2) {
            stateListDrawable.setState(f15655C);
            this.f15674s.removeCallbacks(bVar);
        }
        if (i7 == 0) {
            this.f15674s.invalidate();
        } else {
            h();
        }
        if (this.f15677v == 2 && i7 != 2) {
            stateListDrawable.setState(f15656D);
            this.f15674s.removeCallbacks(bVar);
            recyclerView = this.f15674s;
            i8 = 1200;
        } else {
            if (i7 == 1) {
                this.f15674s.removeCallbacks(bVar);
                recyclerView = this.f15674s;
                i8 = 1500;
            }
            this.f15677v = i7;
        }
        recyclerView.postDelayed(bVar, i8);
        this.f15677v = i7;
    }

    public final void h() {
        int i7 = this.f15657A;
        ValueAnimator valueAnimator = this.f15681z;
        if (i7 != 0) {
            if (i7 == 3) {
                valueAnimator.cancel();
            } else {
                return;
            }
        }
        this.f15657A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
