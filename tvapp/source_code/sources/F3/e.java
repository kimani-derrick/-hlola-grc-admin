package F3;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import k.AbstractC0883d0;
import u3.AbstractC1272a;
/* loaded from: classes.dex */
public abstract class e extends AbstractC0883d0 {
    public Drawable F;

    /* renamed from: G  reason: collision with root package name */
    public final Rect f704G;

    /* renamed from: H  reason: collision with root package name */
    public final Rect f705H;

    /* renamed from: I  reason: collision with root package name */
    public int f706I;

    /* renamed from: J  reason: collision with root package name */
    public final boolean f707J;

    /* renamed from: K  reason: collision with root package name */
    public boolean f708K;

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f704G = new Rect();
        this.f705H = new Rect();
        this.f706I = 119;
        this.f707J = true;
        this.f708K = false;
        int[] iArr = AbstractC1272a.f14954i;
        k.a(context, attributeSet, 0, 0);
        k.b(context, attributeSet, iArr, 0, 0, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        this.f706I = obtainStyledAttributes.getInt(1, this.f706I);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f707J = obtainStyledAttributes.getBoolean(2, true);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.F;
        if (drawable != null) {
            if (this.f708K) {
                this.f708K = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z7 = this.f707J;
                Rect rect = this.f704G;
                if (z7) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int i7 = this.f706I;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Rect rect2 = this.f705H;
                Gravity.apply(i7, intrinsicWidth, intrinsicHeight, rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f, float f7) {
        super.drawableHotspotChanged(f, f7);
        Drawable drawable = this.F;
        if (drawable != null) {
            drawable.setHotspot(f, f7);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.F;
        if (drawable != null && drawable.isStateful()) {
            this.F.setState(getDrawableState());
        }
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.F;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f706I;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.F;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // k.AbstractC0883d0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        super.onLayout(z7, i7, i8, i9, i10);
        this.f708K = z7 | this.f708K;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i8, int i9, int i10) {
        super.onSizeChanged(i7, i8, i9, i10);
        this.f708K = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.F;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.F);
            }
            this.F = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f706I == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i7) {
        if (this.f706I != i7) {
            if ((8388615 & i7) == 0) {
                i7 |= 8388611;
            }
            if ((i7 & 112) == 0) {
                i7 |= 48;
            }
            this.f706I = i7;
            if (i7 == 119 && this.F != null) {
                this.F.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.F) {
            return false;
        }
        return true;
    }
}
