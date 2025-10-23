package androidx.leanback.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import com.boxhdo.android.tv.R;
/* loaded from: classes.dex */
public final class SeekBar extends View {

    /* renamed from: A  reason: collision with root package name */
    public int f6531A;

    /* renamed from: B  reason: collision with root package name */
    public int f6532B;

    /* renamed from: C  reason: collision with root package name */
    public int f6533C;

    /* renamed from: D  reason: collision with root package name */
    public int f6534D;

    /* renamed from: q  reason: collision with root package name */
    public final RectF f6535q;

    /* renamed from: r  reason: collision with root package name */
    public final RectF f6536r;

    /* renamed from: s  reason: collision with root package name */
    public final RectF f6537s;

    /* renamed from: t  reason: collision with root package name */
    public final Paint f6538t;

    /* renamed from: u  reason: collision with root package name */
    public final Paint f6539u;

    /* renamed from: v  reason: collision with root package name */
    public final Paint f6540v;

    /* renamed from: w  reason: collision with root package name */
    public final Paint f6541w;

    /* renamed from: x  reason: collision with root package name */
    public int f6542x;

    /* renamed from: y  reason: collision with root package name */
    public int f6543y;

    /* renamed from: z  reason: collision with root package name */
    public int f6544z;

    public SeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6535q = new RectF();
        this.f6536r = new RectF();
        this.f6537s = new RectF();
        Paint paint = new Paint(1);
        this.f6538t = paint;
        Paint paint2 = new Paint(1);
        this.f6539u = paint2;
        Paint paint3 = new Paint(1);
        this.f6540v = paint3;
        Paint paint4 = new Paint(1);
        this.f6541w = paint4;
        setWillNotDraw(false);
        paint3.setColor(-7829368);
        paint.setColor(-3355444);
        paint2.setColor(-65536);
        paint4.setColor(-1);
        this.f6533C = context.getResources().getDimensionPixelSize(R.dimen.lb_playback_transport_progressbar_bar_height);
        this.f6534D = context.getResources().getDimensionPixelSize(R.dimen.lb_playback_transport_progressbar_active_bar_height);
        this.f6532B = context.getResources().getDimensionPixelSize(R.dimen.lb_playback_transport_progressbar_active_radius);
    }

    public final void a() {
        int i7 = isFocused() ? this.f6534D : this.f6533C;
        int width = getWidth();
        int height = getHeight();
        int i8 = (height - i7) / 2;
        RectF rectF = this.f6537s;
        int i9 = this.f6533C;
        float f = i8;
        float f7 = height - i8;
        rectF.set(i9 / 2, f, width - (i9 / 2), f7);
        int i10 = isFocused() ? this.f6532B : this.f6533C / 2;
        float f8 = width - (i10 * 2);
        float f9 = (this.f6542x / this.f6544z) * f8;
        RectF rectF2 = this.f6535q;
        int i11 = this.f6533C;
        rectF2.set(i11 / 2, f, (i11 / 2) + f9, f7);
        this.f6536r.set(rectF2.right, f, (this.f6533C / 2) + ((this.f6543y / this.f6544z) * f8), f7);
        this.f6531A = i10 + ((int) f9);
        invalidate();
    }

    @Override // android.view.View
    public CharSequence getAccessibilityClassName() {
        return android.widget.SeekBar.class.getName();
    }

    public int getMax() {
        return this.f6544z;
    }

    public int getProgress() {
        return this.f6542x;
    }

    public int getSecondProgress() {
        return this.f6543y;
    }

    public int getSecondaryProgressColor() {
        return this.f6538t.getColor();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f = isFocused() ? this.f6532B : this.f6533C / 2;
        canvas.drawRoundRect(this.f6537s, f, f, this.f6540v);
        RectF rectF = this.f6536r;
        if (rectF.right > rectF.left) {
            canvas.drawRoundRect(rectF, f, f, this.f6538t);
        }
        canvas.drawRoundRect(this.f6535q, f, f, this.f6539u);
        canvas.drawCircle(this.f6531A, getHeight() / 2, f, this.f6541w);
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z7, int i7, Rect rect) {
        super.onFocusChanged(z7, i7, rect);
        a();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i8, int i9, int i10) {
        super.onSizeChanged(i7, i8, i9, i10);
        a();
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i7, Bundle bundle) {
        return super.performAccessibilityAction(i7, bundle);
    }

    public void setAccessibilitySeekListener(v0 v0Var) {
    }

    public void setActiveBarHeight(int i7) {
        this.f6534D = i7;
        a();
    }

    public void setActiveRadius(int i7) {
        this.f6532B = i7;
        a();
    }

    public void setBarHeight(int i7) {
        this.f6533C = i7;
        a();
    }

    public void setMax(int i7) {
        this.f6544z = i7;
        a();
    }

    public void setProgress(int i7) {
        int i8 = this.f6544z;
        if (i7 > i8) {
            i7 = i8;
        } else if (i7 < 0) {
            i7 = 0;
        }
        this.f6542x = i7;
        a();
    }

    public void setProgressColor(int i7) {
        this.f6539u.setColor(i7);
    }

    public void setSecondaryProgress(int i7) {
        int i8 = this.f6544z;
        if (i7 > i8) {
            i7 = i8;
        } else if (i7 < 0) {
            i7 = 0;
        }
        this.f6543y = i7;
        a();
    }

    public void setSecondaryProgressColor(int i7) {
        this.f6538t.setColor(i7);
    }
}
