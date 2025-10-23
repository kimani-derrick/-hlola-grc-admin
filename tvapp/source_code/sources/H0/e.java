package H0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;
/* loaded from: classes.dex */
public final class e extends h implements Animatable {

    /* renamed from: s  reason: collision with root package name */
    public final Context f818s;

    /* renamed from: t  reason: collision with root package name */
    public final b f819t = new b(this);

    /* renamed from: r  reason: collision with root package name */
    public final c f817r = new Drawable.ConstantState();

    /* JADX WARN: Type inference failed for: r2v1, types: [android.graphics.drawable.Drawable$ConstantState, H0.c] */
    public e(Context context) {
        this.f818s = context;
    }

    @Override // H0.h, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f822q;
        if (drawable != null) {
            E.a.a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f822q;
        if (drawable != null) {
            return E.a.b(drawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f822q;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        c cVar = this.f817r;
        cVar.f813a.draw(canvas);
        if (cVar.f814b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f822q;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return this.f817r.f813a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f822q;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f817r.getClass();
        return changingConfigurations | 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f822q;
        if (drawable != null) {
            return E.a.c(drawable);
        }
        return this.f817r.f813a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f822q != null && Build.VERSION.SDK_INT >= 24) {
            return new d(this.f822q.getConstantState());
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f822q;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.f817r.f813a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f822q;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.f817r.f813a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f822q;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return this.f817r.f813a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f822q;
        if (drawable != null) {
            return drawable.isAutoMirrored();
        }
        return this.f817r.f813a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f822q;
        if (drawable != null) {
            return ((AnimatedVectorDrawable) drawable).isRunning();
        }
        return this.f817r.f814b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f822q;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.f817r.f813a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f822q;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f822q;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f817r.f813a.setBounds(rect);
        }
    }

    @Override // H0.h, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i7) {
        Drawable drawable = this.f822q;
        if (drawable != null) {
            return drawable.setLevel(i7);
        }
        return this.f817r.f813a.setLevel(i7);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f822q;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return this.f817r.f813a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        Drawable drawable = this.f822q;
        if (drawable != null) {
            drawable.setAlpha(i7);
        } else {
            this.f817r.f813a.setAlpha(i7);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z7) {
        Drawable drawable = this.f822q;
        if (drawable != null) {
            drawable.setAutoMirrored(z7);
        } else {
            this.f817r.f813a.setAutoMirrored(z7);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f822q;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f817r.f813a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i7) {
        Drawable drawable = this.f822q;
        if (drawable != null) {
            p6.l.I(drawable, i7);
        } else {
            this.f817r.f813a.setTint(i7);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f822q;
        if (drawable != null) {
            p6.l.J(drawable, colorStateList);
        } else {
            this.f817r.f813a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f822q;
        if (drawable != null) {
            p6.l.K(drawable, mode);
        } else {
            this.f817r.f813a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z7, boolean z8) {
        Drawable drawable = this.f822q;
        if (drawable != null) {
            return drawable.setVisible(z7, z8);
        }
        this.f817r.f813a.setVisible(z7, z8);
        return super.setVisible(z7, z8);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f822q;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        c cVar = this.f817r;
        if (cVar.f814b.isStarted()) {
            return;
        }
        cVar.f814b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f822q;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f817r.f814b.end();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0170, code lost:
        if (r8.f814b != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0172, code lost:
        r8.f814b = new android.animation.AnimatorSet();
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0179, code lost:
        r8.f814b.playTogether(r8.f815c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0180, code lost:
        return;
     */
    /* JADX WARN: Type inference failed for: r12v9, types: [o.e, o.j] */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void inflate(android.content.res.Resources r22, org.xmlpull.v1.XmlPullParser r23, android.util.AttributeSet r24, android.content.res.Resources.Theme r25) {
        /*
            Method dump skipped, instructions count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H0.e.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }
}
