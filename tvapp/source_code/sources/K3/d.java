package K3;

import F3.k;
import K.B;
import K.D;
import K.O;
import a.AbstractC0189a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.boxhdo.android.tv.R;
import java.lang.reflect.Field;
import m3.g;
import u3.AbstractC1272a;
/* loaded from: classes.dex */
public abstract class d extends FrameLayout {

    /* renamed from: v  reason: collision with root package name */
    public static final c f1827v = new Object();

    /* renamed from: q  reason: collision with root package name */
    public int f1828q;

    /* renamed from: r  reason: collision with root package name */
    public final float f1829r;

    /* renamed from: s  reason: collision with root package name */
    public final float f1830s;

    /* renamed from: t  reason: collision with root package name */
    public ColorStateList f1831t;

    /* renamed from: u  reason: collision with root package name */
    public PorterDuff.Mode f1832u;

    public d(Context context, AttributeSet attributeSet) {
        super(M3.a.a(context, attributeSet, 0, 0), attributeSet);
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, AbstractC1272a.f14965u);
        if (obtainStyledAttributes.hasValue(6)) {
            Field field = O.f1447a;
            D.s(this, obtainStyledAttributes.getDimensionPixelSize(6, 0));
        }
        this.f1828q = obtainStyledAttributes.getInt(2, 0);
        this.f1829r = obtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(g.p(context2, obtainStyledAttributes, 4));
        setBackgroundTintMode(k.f(obtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.f1830s = obtainStyledAttributes.getFloat(1, 1.0f);
        obtainStyledAttributes.recycle();
        setOnTouchListener(f1827v);
        setFocusable(true);
        if (getBackground() == null) {
            float dimension = getResources().getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(dimension);
            gradientDrawable.setColor(AbstractC0189a.y(getBackgroundOverlayColorAlpha(), AbstractC0189a.t(this, R.attr.colorSurface), AbstractC0189a.t(this, R.attr.colorOnSurface)));
            ColorStateList colorStateList = this.f1831t;
            if (colorStateList != null) {
                E.a.h(gradientDrawable, colorStateList);
            }
            Field field2 = O.f1447a;
            setBackground(gradientDrawable);
        }
    }

    public float getActionTextColorAlpha() {
        return this.f1830s;
    }

    public int getAnimationMode() {
        return this.f1828q;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f1829r;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Field field = O.f1447a;
        B.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        super.onLayout(z7, i7, i8, i9, i10);
    }

    public void setAnimationMode(int i7) {
        this.f1828q = i7;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.f1831t != null) {
            drawable = drawable.mutate();
            E.a.h(drawable, this.f1831t);
            E.a.i(drawable, this.f1832u);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.f1831t = colorStateList;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            E.a.h(mutate, colorStateList);
            E.a.i(mutate, this.f1832u);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.f1832u = mode;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            E.a.i(mutate, mode);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        c cVar;
        if (onClickListener != null) {
            cVar = null;
        } else {
            cVar = f1827v;
        }
        setOnTouchListener(cVar);
        super.setOnClickListener(onClickListener);
    }

    public void setOnAttachStateChangeListener(a aVar) {
    }

    public void setOnLayoutChangeListener(b bVar) {
    }
}
