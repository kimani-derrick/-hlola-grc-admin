package androidx.leanback.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import f0.AbstractC0659a;
/* loaded from: classes.dex */
public class HorizontalGridView extends AbstractC0292g {

    /* renamed from: k1  reason: collision with root package name */
    public boolean f6388k1;
    public boolean l1;

    /* renamed from: m1  reason: collision with root package name */
    public final Paint f6389m1;

    /* renamed from: n1  reason: collision with root package name */
    public Bitmap f6390n1;

    /* renamed from: o1  reason: collision with root package name */
    public LinearGradient f6391o1;

    /* renamed from: p1  reason: collision with root package name */
    public int f6392p1;

    /* renamed from: q1  reason: collision with root package name */
    public int f6393q1;

    /* renamed from: r1  reason: collision with root package name */
    public Bitmap f6394r1;

    /* renamed from: s1  reason: collision with root package name */
    public LinearGradient f6395s1;

    /* renamed from: t1  reason: collision with root package name */
    public int f6396t1;

    /* renamed from: u1  reason: collision with root package name */
    public int f6397u1;

    /* renamed from: v1  reason: collision with root package name */
    public final Rect f6398v1;

    public HorizontalGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6389m1 = new Paint();
        this.f6398v1 = new Rect();
        this.d1.z1(0);
        v0(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0659a.f);
        setRowHeight(obtainStyledAttributes);
        setNumRows(obtainStyledAttributes.getInt(0, 1));
        obtainStyledAttributes.recycle();
        w0();
        Paint paint = new Paint();
        this.f6389m1 = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
    }

    private Bitmap getTempBitmapHigh() {
        Bitmap bitmap = this.f6394r1;
        if (bitmap == null || bitmap.getWidth() != this.f6396t1 || this.f6394r1.getHeight() != getHeight()) {
            this.f6394r1 = Bitmap.createBitmap(this.f6396t1, getHeight(), Bitmap.Config.ARGB_8888);
        }
        return this.f6394r1;
    }

    private Bitmap getTempBitmapLow() {
        Bitmap bitmap = this.f6390n1;
        if (bitmap == null || bitmap.getWidth() != this.f6392p1 || this.f6390n1.getHeight() != getHeight()) {
            this.f6390n1 = Bitmap.createBitmap(this.f6392p1, getHeight(), Bitmap.Config.ARGB_8888);
        }
        return this.f6390n1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void draw(Canvas canvas) {
        boolean z7;
        int i7;
        int width;
        int i8;
        int i9;
        int i10;
        boolean z8 = this.f6388k1;
        C0321y c0321y = this.d1;
        boolean z9 = true;
        if (z8) {
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                c0321y.getClass();
                C0317u c0317u = (C0317u) childAt.getLayoutParams();
                c0317u.getClass();
                if (childAt.getLeft() + c0317u.f6656e < getPaddingLeft() - this.f6393q1) {
                    z7 = true;
                    break;
                }
            }
        }
        z7 = false;
        if (this.l1) {
            for (int childCount2 = getChildCount() - 1; childCount2 >= 0; childCount2--) {
                View childAt2 = getChildAt(childCount2);
                c0321y.getClass();
                C0317u c0317u2 = (C0317u) childAt2.getLayoutParams();
                c0317u2.getClass();
                if (childAt2.getRight() - c0317u2.f6657g > (getWidth() - getPaddingRight()) + this.f6397u1) {
                    break;
                }
            }
        }
        z9 = false;
        if (!z7) {
            this.f6390n1 = null;
        }
        if (!z9) {
            this.f6394r1 = null;
        }
        if (!z7 && !z9) {
            super.draw(canvas);
            return;
        }
        if (this.f6388k1) {
            i7 = (getPaddingLeft() - this.f6393q1) - this.f6392p1;
        } else {
            i7 = 0;
        }
        if (this.l1) {
            width = (getWidth() - getPaddingRight()) + this.f6397u1 + this.f6396t1;
        } else {
            width = getWidth();
        }
        int save = canvas.save();
        if (this.f6388k1) {
            i8 = this.f6392p1;
        } else {
            i8 = 0;
        }
        int i12 = i8 + i7;
        if (this.l1) {
            i9 = this.f6396t1;
        } else {
            i9 = 0;
        }
        canvas.clipRect(i12, 0, width - i9, getHeight());
        super.draw(canvas);
        canvas.restoreToCount(save);
        Canvas canvas2 = new Canvas();
        Rect rect = this.f6398v1;
        rect.top = 0;
        rect.bottom = getHeight();
        if (z7 && this.f6392p1 > 0) {
            Bitmap tempBitmapLow = getTempBitmapLow();
            tempBitmapLow.eraseColor(0);
            canvas2.setBitmap(tempBitmapLow);
            int save2 = canvas2.save();
            canvas2.clipRect(0, 0, this.f6392p1, getHeight());
            float f = -i7;
            canvas2.translate(f, 0.0f);
            super.draw(canvas2);
            canvas2.restoreToCount(save2);
            this.f6389m1.setShader(this.f6391o1);
            canvas2.drawRect(0.0f, 0.0f, this.f6392p1, getHeight(), this.f6389m1);
            rect.left = 0;
            rect.right = this.f6392p1;
            canvas.translate(i7, 0.0f);
            canvas.drawBitmap(tempBitmapLow, rect, rect, (Paint) null);
            canvas.translate(f, 0.0f);
        }
        if (z9 && this.f6396t1 > 0) {
            Bitmap tempBitmapHigh = getTempBitmapHigh();
            tempBitmapHigh.eraseColor(0);
            canvas2.setBitmap(tempBitmapHigh);
            int save3 = canvas2.save();
            canvas2.clipRect(0, 0, this.f6396t1, getHeight());
            canvas2.translate(-(width - this.f6396t1), 0.0f);
            super.draw(canvas2);
            canvas2.restoreToCount(save3);
            this.f6389m1.setShader(this.f6395s1);
            canvas2.drawRect(0.0f, 0.0f, this.f6396t1, getHeight(), this.f6389m1);
            rect.left = 0;
            rect.right = this.f6396t1;
            canvas.translate(width - i10, 0.0f);
            canvas.drawBitmap(tempBitmapHigh, rect, rect, (Paint) null);
            canvas.translate(-(width - this.f6396t1), 0.0f);
        }
    }

    public final boolean getFadingLeftEdge() {
        return this.f6388k1;
    }

    public final int getFadingLeftEdgeLength() {
        return this.f6392p1;
    }

    public final int getFadingLeftEdgeOffset() {
        return this.f6393q1;
    }

    public final boolean getFadingRightEdge() {
        return this.l1;
    }

    public final int getFadingRightEdgeLength() {
        return this.f6396t1;
    }

    public final int getFadingRightEdgeOffset() {
        return this.f6397u1;
    }

    public final void setFadingLeftEdge(boolean z7) {
        if (this.f6388k1 != z7) {
            this.f6388k1 = z7;
            if (!z7) {
                this.f6390n1 = null;
            }
            invalidate();
            w0();
        }
    }

    public final void setFadingLeftEdgeLength(int i7) {
        if (this.f6392p1 != i7) {
            this.f6392p1 = i7;
            this.f6391o1 = i7 != 0 ? new LinearGradient(0.0f, 0.0f, this.f6392p1, 0.0f, 0, -16777216, Shader.TileMode.CLAMP) : null;
            invalidate();
        }
    }

    public final void setFadingLeftEdgeOffset(int i7) {
        if (this.f6393q1 != i7) {
            this.f6393q1 = i7;
            invalidate();
        }
    }

    public final void setFadingRightEdge(boolean z7) {
        if (this.l1 != z7) {
            this.l1 = z7;
            if (!z7) {
                this.f6394r1 = null;
            }
            invalidate();
            w0();
        }
    }

    public final void setFadingRightEdgeLength(int i7) {
        if (this.f6396t1 != i7) {
            this.f6396t1 = i7;
            this.f6395s1 = i7 != 0 ? new LinearGradient(0.0f, 0.0f, this.f6396t1, 0.0f, -16777216, 0, Shader.TileMode.CLAMP) : null;
            invalidate();
        }
    }

    public final void setFadingRightEdgeOffset(int i7) {
        if (this.f6397u1 != i7) {
            this.f6397u1 = i7;
            invalidate();
        }
    }

    public void setNumRows(int i7) {
        C0321y c0321y = this.d1;
        if (i7 >= 0) {
            c0321y.f6691V = i7;
            requestLayout();
            return;
        }
        c0321y.getClass();
        throw new IllegalArgumentException();
    }

    public void setRowHeight(int i7) {
        this.d1.A1(i7);
        requestLayout();
    }

    public final void w0() {
        if (this.f6388k1 || this.l1) {
            setLayerType(2, null);
            setWillNotDraw(false);
            return;
        }
        setLayerType(0, null);
        setWillNotDraw(true);
    }

    public void setRowHeight(TypedArray typedArray) {
        if (typedArray.peekValue(1) != null) {
            setRowHeight(typedArray.getLayoutDimension(1, 0));
        }
    }
}
