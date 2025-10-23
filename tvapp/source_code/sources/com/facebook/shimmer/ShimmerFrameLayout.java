package com.facebook.shimmer;

import P1.a;
import P1.b;
import P1.d;
import P1.e;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
/* loaded from: classes.dex */
public class ShimmerFrameLayout extends FrameLayout {

    /* renamed from: q  reason: collision with root package name */
    public final Paint f8115q;

    /* renamed from: r  reason: collision with root package name */
    public final e f8116r;

    /* renamed from: s  reason: collision with root package name */
    public final boolean f8117s;

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b bVar;
        this.f8115q = new Paint();
        e eVar = new e();
        this.f8116r = eVar;
        this.f8117s = true;
        setWillNotDraw(false);
        eVar.setCallback(this);
        if (attributeSet == null) {
            a(new b(0).h());
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f2763a, 0, 0);
        try {
            if (obtainStyledAttributes.hasValue(4) && obtainStyledAttributes.getBoolean(4, false)) {
                bVar = new b(1);
                ((d) bVar.f2765q).f2778p = false;
            } else {
                bVar = new b(0);
            }
            a(bVar.i(obtainStyledAttributes).h());
            obtainStyledAttributes.recycle();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void a(d dVar) {
        boolean z7;
        PorterDuff.Mode mode;
        e eVar = this.f8116r;
        eVar.f = dVar;
        if (dVar != null) {
            Paint paint = eVar.f2784b;
            if (eVar.f.f2778p) {
                mode = PorterDuff.Mode.DST_IN;
            } else {
                mode = PorterDuff.Mode.SRC_IN;
            }
            paint.setXfermode(new PorterDuffXfermode(mode));
        }
        eVar.b();
        if (eVar.f != null) {
            ValueAnimator valueAnimator = eVar.f2786e;
            if (valueAnimator != null) {
                z7 = valueAnimator.isStarted();
                eVar.f2786e.cancel();
                eVar.f2786e.removeAllUpdateListeners();
            } else {
                z7 = false;
            }
            d dVar2 = eVar.f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, ((float) (dVar2.f2782t / dVar2.f2781s)) + 1.0f);
            eVar.f2786e = ofFloat;
            ofFloat.setRepeatMode(eVar.f.f2780r);
            eVar.f2786e.setRepeatCount(eVar.f.f2779q);
            ValueAnimator valueAnimator2 = eVar.f2786e;
            d dVar3 = eVar.f;
            valueAnimator2.setDuration(dVar3.f2781s + dVar3.f2782t);
            eVar.f2786e.addUpdateListener(eVar.f2783a);
            if (z7) {
                eVar.f2786e.start();
            }
        }
        eVar.invalidateSelf();
        if (dVar != null && dVar.n) {
            setLayerType(2, this.f8115q);
        } else {
            setLayerType(0, null);
        }
    }

    public final void b() {
        e eVar = this.f8116r;
        ValueAnimator valueAnimator = eVar.f2786e;
        if (valueAnimator != null && valueAnimator != null && valueAnimator.isStarted()) {
            eVar.f2786e.cancel();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f8117s) {
            this.f8116r.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f8116r.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        super.onLayout(z7, i7, i8, i9, i10);
        this.f8116r.setBounds(0, 0, getWidth(), getHeight());
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f8116r;
    }
}
