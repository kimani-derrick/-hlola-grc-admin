package androidx.leanback.widget;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.LinearLayout;
/* renamed from: androidx.leanback.widget.e0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0289e0 extends LinearLayout {

    /* renamed from: q  reason: collision with root package name */
    public ViewGroup f6577q;

    /* renamed from: r  reason: collision with root package name */
    public Drawable f6578r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f6579s;

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f6578r;
        if (drawable != null) {
            if (this.f6579s) {
                this.f6579s = false;
                drawable.setBounds(0, 0, getWidth(), getHeight());
            }
            this.f6578r.draw(canvas);
        }
    }

    @Override // android.view.View
    public final Drawable getForeground() {
        return this.f6578r;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i8, int i9, int i10) {
        super.onSizeChanged(i7, i8, i9, i10);
        this.f6579s = true;
    }

    @Override // android.view.View
    public final void setForeground(Drawable drawable) {
        this.f6578r = drawable;
        setWillNotDraw(drawable == null);
        invalidate();
    }
}
