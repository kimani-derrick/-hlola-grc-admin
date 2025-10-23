package androidx.leanback.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
/* loaded from: classes.dex */
public final class z0 extends FrameLayout {

    /* renamed from: x  reason: collision with root package name */
    public static final Rect f6714x = new Rect();

    /* renamed from: q  reason: collision with root package name */
    public boolean f6715q;

    /* renamed from: r  reason: collision with root package name */
    public Object f6716r;

    /* renamed from: s  reason: collision with root package name */
    public View f6717s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f6718t;

    /* renamed from: u  reason: collision with root package name */
    public int f6719u;

    /* renamed from: v  reason: collision with root package name */
    public Paint f6720v;

    /* renamed from: w  reason: collision with root package name */
    public int f6721w;

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f6720v == null || this.f6721w == 0) {
            return;
        }
        canvas.drawRect(this.f6717s.getLeft(), this.f6717s.getTop(), this.f6717s.getRight(), this.f6717s.getBottom(), this.f6720v);
    }

    public int getShadowType() {
        return this.f6719u;
    }

    public View getWrappedView() {
        return this.f6717s;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        View view;
        super.onLayout(z7, i7, i8, i9, i10);
        if (!z7 || (view = this.f6717s) == null) {
            return;
        }
        Rect rect = f6714x;
        rect.left = (int) view.getPivotX();
        rect.top = (int) this.f6717s.getPivotY();
        offsetDescendantRectToMyCoords(this.f6717s, rect);
        setPivotX(rect.left);
        setPivotY(rect.top);
    }

    public void setOverlayColor(int i7) {
        Paint paint = this.f6720v;
        if (paint == null || i7 == this.f6721w) {
            return;
        }
        this.f6721w = i7;
        paint.setColor(i7);
        invalidate();
    }

    public void setShadowFocusLevel(float f) {
        Object obj = this.f6716r;
        if (obj != null) {
            C0.b(obj, this.f6719u, f);
        }
    }
}
