package androidx.leanback.widget;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.boxhdo.android.tv.R;
import f0.AbstractC0659a;
/* loaded from: classes.dex */
public class PagingIndicator extends View {

    /* renamed from: M  reason: collision with root package name */
    public static final DecelerateInterpolator f6440M = new DecelerateInterpolator();

    /* renamed from: N  reason: collision with root package name */
    public static final W f6441N = new W(Float.class, "alpha", 0);

    /* renamed from: O  reason: collision with root package name */
    public static final W f6442O = new W(Float.class, "diameter", 1);

    /* renamed from: P  reason: collision with root package name */
    public static final W f6443P = new W(Float.class, "translation_x", 2);

    /* renamed from: A  reason: collision with root package name */
    public int[] f6444A;

    /* renamed from: B  reason: collision with root package name */
    public int[] f6445B;

    /* renamed from: C  reason: collision with root package name */
    public int f6446C;

    /* renamed from: D  reason: collision with root package name */
    public int f6447D;

    /* renamed from: E  reason: collision with root package name */
    public int f6448E;
    public int F;

    /* renamed from: G  reason: collision with root package name */
    public final Paint f6449G;

    /* renamed from: H  reason: collision with root package name */
    public final Paint f6450H;

    /* renamed from: I  reason: collision with root package name */
    public Bitmap f6451I;

    /* renamed from: J  reason: collision with root package name */
    public Paint f6452J;

    /* renamed from: K  reason: collision with root package name */
    public final Rect f6453K;

    /* renamed from: L  reason: collision with root package name */
    public final float f6454L;

    /* renamed from: q  reason: collision with root package name */
    public boolean f6455q;

    /* renamed from: r  reason: collision with root package name */
    public final int f6456r;

    /* renamed from: s  reason: collision with root package name */
    public final int f6457s;

    /* renamed from: t  reason: collision with root package name */
    public final int f6458t;

    /* renamed from: u  reason: collision with root package name */
    public final int f6459u;

    /* renamed from: v  reason: collision with root package name */
    public final int f6460v;

    /* renamed from: w  reason: collision with root package name */
    public final int f6461w;

    /* renamed from: x  reason: collision with root package name */
    public final int f6462x;

    /* renamed from: y  reason: collision with root package name */
    public X[] f6463y;

    /* renamed from: z  reason: collision with root package name */
    public int[] f6464z;

    public PagingIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        boolean z7;
        AnimatorSet animatorSet = new AnimatorSet();
        Resources resources = getResources();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0659a.f10199c, 0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(6, getResources().getDimensionPixelOffset(R.dimen.lb_page_indicator_dot_radius));
        this.f6457s = dimensionPixelOffset;
        int i7 = dimensionPixelOffset * 2;
        this.f6456r = i7;
        int dimensionPixelOffset2 = obtainStyledAttributes.getDimensionPixelOffset(2, getResources().getDimensionPixelOffset(R.dimen.lb_page_indicator_arrow_radius));
        this.f6460v = dimensionPixelOffset2;
        int i8 = dimensionPixelOffset2 * 2;
        this.f6459u = i8;
        this.f6458t = obtainStyledAttributes.getDimensionPixelOffset(5, getResources().getDimensionPixelOffset(R.dimen.lb_page_indicator_dot_gap));
        this.f6461w = obtainStyledAttributes.getDimensionPixelOffset(4, getResources().getDimensionPixelOffset(R.dimen.lb_page_indicator_arrow_gap));
        int color = obtainStyledAttributes.getColor(3, getResources().getColor(R.color.lb_page_indicator_dot));
        Paint paint = new Paint(1);
        this.f6449G = paint;
        paint.setColor(color);
        this.F = obtainStyledAttributes.getColor(0, getResources().getColor(R.color.lb_page_indicator_arrow_background));
        if (this.f6452J == null && obtainStyledAttributes.hasValue(1)) {
            setArrowColor(obtainStyledAttributes.getColor(1, 0));
        }
        obtainStyledAttributes.recycle();
        if (resources.getConfiguration().getLayoutDirection() == 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.f6455q = z7;
        int color2 = resources.getColor(R.color.lb_page_indicator_arrow_shadow);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.lb_page_indicator_arrow_shadow_radius);
        this.f6462x = dimensionPixelSize;
        Paint paint2 = new Paint(1);
        this.f6450H = paint2;
        float dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.lb_page_indicator_arrow_shadow_offset);
        paint2.setShadowLayer(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize2, color2);
        this.f6451I = d();
        this.f6453K = new Rect(0, 0, this.f6451I.getWidth(), this.f6451I.getHeight());
        float f = i8;
        this.f6454L = this.f6451I.getWidth() / f;
        AnimatorSet animatorSet2 = new AnimatorSet();
        W w7 = f6441N;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object) null, w7, 0.0f, 1.0f);
        ofFloat.setDuration(167L);
        DecelerateInterpolator decelerateInterpolator = f6440M;
        ofFloat.setInterpolator(decelerateInterpolator);
        float f7 = i7;
        W w8 = f6442O;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat((Object) null, w8, f7, f);
        ofFloat2.setDuration(417L);
        ofFloat2.setInterpolator(decelerateInterpolator);
        animatorSet2.playTogether(ofFloat, ofFloat2, c());
        AnimatorSet animatorSet3 = new AnimatorSet();
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat((Object) null, w7, 1.0f, 0.0f);
        ofFloat3.setDuration(167L);
        ofFloat3.setInterpolator(decelerateInterpolator);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat((Object) null, w8, f, f7);
        ofFloat4.setDuration(417L);
        ofFloat4.setInterpolator(decelerateInterpolator);
        animatorSet3.playTogether(ofFloat3, ofFloat4, c());
        animatorSet.playTogether(animatorSet2, animatorSet3);
        setLayerType(1, null);
    }

    private int getDesiredHeight() {
        return getPaddingBottom() + getPaddingTop() + this.f6459u + this.f6462x;
    }

    private int getDesiredWidth() {
        return getPaddingRight() + getPaddingLeft() + getRequiredWidth();
    }

    private int getRequiredWidth() {
        return ((this.f6447D - 3) * this.f6458t) + (this.f6461w * 2) + (this.f6457s * 2);
    }

    private void setSelectedPage(int i7) {
        if (i7 == this.f6448E) {
            return;
        }
        this.f6448E = i7;
        a();
    }

    public final void a() {
        int i7;
        float f;
        int i8 = 0;
        while (true) {
            i7 = this.f6448E;
            f = -1.0f;
            if (i8 >= i7) {
                break;
            }
            this.f6463y[i8].b();
            X x7 = this.f6463y[i8];
            if (i8 != 0) {
                f = 1.0f;
            }
            x7.f6569h = f;
            x7.d = this.f6444A[i8];
            i8++;
        }
        X x8 = this.f6463y[i7];
        x8.f6566c = 0.0f;
        x8.d = 0.0f;
        PagingIndicator pagingIndicator = x8.f6571j;
        x8.f6567e = pagingIndicator.f6459u;
        float f7 = pagingIndicator.f6460v;
        x8.f = f7;
        x8.f6568g = f7 * pagingIndicator.f6454L;
        x8.f6564a = 1.0f;
        x8.a();
        X[] xArr = this.f6463y;
        int i9 = this.f6448E;
        X x9 = xArr[i9];
        if (i9 <= 0) {
            f = 1.0f;
        }
        x9.f6569h = f;
        int i10 = this.f6464z[i9];
        while (true) {
            x9.d = i10;
            i9++;
            if (i9 < this.f6447D) {
                this.f6463y[i9].b();
                x9 = this.f6463y[i9];
                x9.f6569h = 1.0f;
                i10 = this.f6445B[i9];
            } else {
                return;
            }
        }
    }

    public final void b() {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int requiredWidth = getRequiredWidth();
        int i7 = (paddingLeft + width) / 2;
        int i8 = this.f6447D;
        int[] iArr = new int[i8];
        this.f6464z = iArr;
        int[] iArr2 = new int[i8];
        this.f6444A = iArr2;
        int[] iArr3 = new int[i8];
        this.f6445B = iArr3;
        boolean z7 = this.f6455q;
        int i9 = this.f6457s;
        int i10 = this.f6461w;
        int i11 = this.f6458t;
        int i12 = 1;
        int i13 = requiredWidth / 2;
        if (z7) {
            int i14 = i7 - i13;
            iArr[0] = ((i14 + i9) - i11) + i10;
            iArr2[0] = i14 + i9;
            iArr3[0] = (i10 * 2) + ((i14 + i9) - (i11 * 2));
            while (i12 < this.f6447D) {
                int[] iArr4 = this.f6464z;
                int[] iArr5 = this.f6444A;
                int i15 = i12 - 1;
                iArr4[i12] = iArr5[i15] + i10;
                iArr5[i12] = iArr5[i15] + i11;
                this.f6445B[i12] = iArr4[i15] + i10;
                i12++;
            }
        } else {
            int i16 = i13 + i7;
            iArr[0] = ((i16 - i9) + i11) - i10;
            iArr2[0] = i16 - i9;
            iArr3[0] = ((i11 * 2) + (i16 - i9)) - (i10 * 2);
            while (i12 < this.f6447D) {
                int[] iArr6 = this.f6464z;
                int[] iArr7 = this.f6444A;
                int i17 = i12 - 1;
                iArr6[i12] = iArr7[i17] - i10;
                iArr7[i12] = iArr7[i17] - i11;
                this.f6445B[i12] = iArr6[i17] - i10;
                i12++;
            }
        }
        this.f6446C = paddingTop + this.f6460v;
        a();
    }

    public final ObjectAnimator c() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object) null, f6443P, (-this.f6461w) + this.f6458t, 0.0f);
        ofFloat.setDuration(417L);
        ofFloat.setInterpolator(f6440M);
        return ofFloat;
    }

    public final Bitmap d() {
        Bitmap decodeResource = BitmapFactory.decodeResource(getResources(), R.drawable.lb_ic_nav_arrow);
        if (this.f6455q) {
            return decodeResource;
        }
        Matrix matrix = new Matrix();
        matrix.preScale(-1.0f, 1.0f);
        return Bitmap.createBitmap(decodeResource, 0, 0, decodeResource.getWidth(), decodeResource.getHeight(), matrix, false);
    }

    public int[] getDotSelectedLeftX() {
        return this.f6444A;
    }

    public int[] getDotSelectedRightX() {
        return this.f6445B;
    }

    public int[] getDotSelectedX() {
        return this.f6464z;
    }

    public int getPageCount() {
        return this.f6447D;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        for (int i7 = 0; i7 < this.f6447D; i7++) {
            X x7 = this.f6463y[i7];
            float f = x7.d + x7.f6566c;
            PagingIndicator pagingIndicator = x7.f6571j;
            canvas.drawCircle(f, pagingIndicator.f6446C, x7.f, pagingIndicator.f6449G);
            if (x7.f6564a > 0.0f) {
                Paint paint = pagingIndicator.f6450H;
                paint.setColor(x7.f6565b);
                canvas.drawCircle(f, pagingIndicator.f6446C, x7.f, paint);
                Bitmap bitmap = pagingIndicator.f6451I;
                float f7 = x7.f6568g;
                float f8 = pagingIndicator.f6446C;
                canvas.drawBitmap(bitmap, pagingIndicator.f6453K, new Rect((int) (f - f7), (int) (f8 - f7), (int) (f + f7), (int) (f8 + f7)), pagingIndicator.f6452J);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i8) {
        int desiredHeight = getDesiredHeight();
        int mode = View.MeasureSpec.getMode(i8);
        if (mode == Integer.MIN_VALUE) {
            desiredHeight = Math.min(desiredHeight, View.MeasureSpec.getSize(i8));
        } else if (mode == 1073741824) {
            desiredHeight = View.MeasureSpec.getSize(i8);
        }
        int desiredWidth = getDesiredWidth();
        int mode2 = View.MeasureSpec.getMode(i7);
        if (mode2 == Integer.MIN_VALUE) {
            desiredWidth = Math.min(desiredWidth, View.MeasureSpec.getSize(i7));
        } else if (mode2 == 1073741824) {
            desiredWidth = View.MeasureSpec.getSize(i7);
        }
        setMeasuredDimension(desiredWidth, desiredHeight);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i7) {
        boolean z7;
        float f;
        super.onRtlPropertiesChanged(i7);
        if (i7 == 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (this.f6455q != z7) {
            this.f6455q = z7;
            this.f6451I = d();
            X[] xArr = this.f6463y;
            if (xArr != null) {
                for (X x7 : xArr) {
                    if (x7.f6571j.f6455q) {
                        f = 1.0f;
                    } else {
                        f = -1.0f;
                    }
                    x7.f6570i = f;
                }
            }
            b();
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i8, int i9, int i10) {
        setMeasuredDimension(i7, i8);
        b();
    }

    public void setArrowBackgroundColor(int i7) {
        this.F = i7;
    }

    public void setArrowColor(int i7) {
        if (this.f6452J == null) {
            this.f6452J = new Paint();
        }
        this.f6452J.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN));
    }

    public void setDotBackgroundColor(int i7) {
        this.f6449G.setColor(i7);
    }

    public void setPageCount(int i7) {
        if (i7 <= 0) {
            throw new IllegalArgumentException("The page count should be a positive integer");
        }
        this.f6447D = i7;
        this.f6463y = new X[i7];
        for (int i8 = 0; i8 < this.f6447D; i8++) {
            this.f6463y[i8] = new X(this);
        }
        b();
        setSelectedPage(0);
    }
}
