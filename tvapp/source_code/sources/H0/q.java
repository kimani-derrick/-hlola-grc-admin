package H0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import java.util.ArrayDeque;
import o.C1052e;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public final class q extends h {

    /* renamed from: z  reason: collision with root package name */
    public static final PorterDuff.Mode f869z = PorterDuff.Mode.SRC_IN;

    /* renamed from: r  reason: collision with root package name */
    public o f870r;

    /* renamed from: s  reason: collision with root package name */
    public PorterDuffColorFilter f871s;

    /* renamed from: t  reason: collision with root package name */
    public ColorFilter f872t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f873u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f874v;

    /* renamed from: w  reason: collision with root package name */
    public final float[] f875w;

    /* renamed from: x  reason: collision with root package name */
    public final Matrix f876x;

    /* renamed from: y  reason: collision with root package name */
    public final Rect f877y;

    /* JADX WARN: Type inference failed for: r0v5, types: [android.graphics.drawable.Drawable$ConstantState, H0.o] */
    public q() {
        this.f874v = true;
        this.f875w = new float[9];
        this.f876x = new Matrix();
        this.f877y = new Rect();
        ?? constantState = new Drawable.ConstantState();
        constantState.f860c = null;
        constantState.d = f869z;
        constantState.f859b = new n();
        this.f870r = constantState;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList != null && mode != null) {
            return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f822q;
        if (drawable != null) {
            E.a.b(drawable);
            return false;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f822q;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f877y;
        copyBounds(rect);
        if (rect.width() > 0 && rect.height() > 0) {
            ColorFilter colorFilter = this.f872t;
            if (colorFilter == null) {
                colorFilter = this.f871s;
            }
            Matrix matrix = this.f876x;
            canvas.getMatrix(matrix);
            float[] fArr = this.f875w;
            matrix.getValues(fArr);
            float abs = Math.abs(fArr[0]);
            float abs2 = Math.abs(fArr[4]);
            float abs3 = Math.abs(fArr[1]);
            float abs4 = Math.abs(fArr[3]);
            if (abs3 != 0.0f || abs4 != 0.0f) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int min = Math.min(2048, (int) (rect.width() * abs));
            int min2 = Math.min(2048, (int) (rect.height() * abs2));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                canvas.translate(rect.left, rect.top);
                if (isAutoMirrored() && E.b.a(this) == 1) {
                    canvas.translate(rect.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                rect.offsetTo(0, 0);
                o oVar = this.f870r;
                Bitmap bitmap = oVar.f;
                if (bitmap == null || min != bitmap.getWidth() || min2 != oVar.f.getHeight()) {
                    oVar.f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
                    oVar.f866k = true;
                }
                if (!this.f874v) {
                    o oVar2 = this.f870r;
                    oVar2.f.eraseColor(0);
                    Canvas canvas2 = new Canvas(oVar2.f);
                    n nVar = oVar2.f859b;
                    nVar.a(nVar.f850g, n.f845p, canvas2, min, min2);
                } else {
                    o oVar3 = this.f870r;
                    if (oVar3.f866k || oVar3.f862g != oVar3.f860c || oVar3.f863h != oVar3.d || oVar3.f865j != oVar3.f861e || oVar3.f864i != oVar3.f859b.getRootAlpha()) {
                        o oVar4 = this.f870r;
                        oVar4.f.eraseColor(0);
                        Canvas canvas3 = new Canvas(oVar4.f);
                        n nVar2 = oVar4.f859b;
                        nVar2.a(nVar2.f850g, n.f845p, canvas3, min, min2);
                        o oVar5 = this.f870r;
                        oVar5.f862g = oVar5.f860c;
                        oVar5.f863h = oVar5.d;
                        oVar5.f864i = oVar5.f859b.getRootAlpha();
                        oVar5.f865j = oVar5.f861e;
                        oVar5.f866k = false;
                    }
                }
                o oVar6 = this.f870r;
                if (oVar6.f859b.getRootAlpha() >= 255 && colorFilter == null) {
                    paint = null;
                } else {
                    if (oVar6.f867l == null) {
                        Paint paint2 = new Paint();
                        oVar6.f867l = paint2;
                        paint2.setFilterBitmap(true);
                    }
                    oVar6.f867l.setAlpha(oVar6.f859b.getRootAlpha());
                    oVar6.f867l.setColorFilter(colorFilter);
                    paint = oVar6.f867l;
                }
                canvas.drawBitmap(oVar6.f, (Rect) null, rect, paint);
                canvas.restoreToCount(save);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f822q;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return this.f870r.f859b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f822q;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f870r.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f822q;
        if (drawable != null) {
            return E.a.c(drawable);
        }
        return this.f872t;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f822q != null && Build.VERSION.SDK_INT >= 24) {
            return new p(this.f822q.getConstantState());
        }
        this.f870r.f858a = getChangingConfigurations();
        return this.f870r;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f822q;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.f870r.f859b.f852i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f822q;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.f870r.f859b.f851h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f822q;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f822q;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f822q;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f822q;
        if (drawable != null) {
            return drawable.isAutoMirrored();
        }
        return this.f870r.f861e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        Drawable drawable = this.f822q;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            o oVar = this.f870r;
            if (oVar != null) {
                n nVar = oVar.f859b;
                if (nVar.n == null) {
                    nVar.n = Boolean.valueOf(nVar.f850g.a());
                }
                if (nVar.n.booleanValue() || ((colorStateList = this.f870r.f860c) != null && colorStateList.isStateful())) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.graphics.drawable.Drawable$ConstantState, H0.o] */
    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f822q;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f873u && super.mutate() == this) {
            o oVar = this.f870r;
            ?? constantState = new Drawable.ConstantState();
            constantState.f860c = null;
            constantState.d = f869z;
            if (oVar != null) {
                constantState.f858a = oVar.f858a;
                n nVar = new n(oVar.f859b);
                constantState.f859b = nVar;
                if (oVar.f859b.f849e != null) {
                    nVar.f849e = new Paint(oVar.f859b.f849e);
                }
                if (oVar.f859b.d != null) {
                    constantState.f859b.d = new Paint(oVar.f859b.d);
                }
                constantState.f860c = oVar.f860c;
                constantState.d = oVar.d;
                constantState.f861e = oVar.f861e;
            }
            this.f870r = constantState;
            this.f873u = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f822q;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z7;
        PorterDuff.Mode mode;
        Drawable drawable = this.f822q;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        o oVar = this.f870r;
        ColorStateList colorStateList = oVar.f860c;
        if (colorStateList != null && (mode = oVar.d) != null) {
            this.f871s = a(colorStateList, mode);
            invalidateSelf();
            z7 = true;
        } else {
            z7 = false;
        }
        n nVar = oVar.f859b;
        if (nVar.n == null) {
            nVar.n = Boolean.valueOf(nVar.f850g.a());
        }
        if (nVar.n.booleanValue()) {
            boolean b7 = oVar.f859b.f850g.b(iArr);
            oVar.f866k |= b7;
            if (b7) {
                invalidateSelf();
                return true;
            }
        }
        return z7;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j7) {
        Drawable drawable = this.f822q;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j7);
        } else {
            super.scheduleSelf(runnable, j7);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        Drawable drawable = this.f822q;
        if (drawable != null) {
            drawable.setAlpha(i7);
        } else if (this.f870r.f859b.getRootAlpha() != i7) {
            this.f870r.f859b.setRootAlpha(i7);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z7) {
        Drawable drawable = this.f822q;
        if (drawable != null) {
            drawable.setAutoMirrored(z7);
        } else {
            this.f870r.f861e = z7;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f822q;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f872t = colorFilter;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i7) {
        Drawable drawable = this.f822q;
        if (drawable != null) {
            p6.l.I(drawable, i7);
        } else {
            setTintList(ColorStateList.valueOf(i7));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f822q;
        if (drawable != null) {
            E.a.h(drawable, colorStateList);
            return;
        }
        o oVar = this.f870r;
        if (oVar.f860c != colorStateList) {
            oVar.f860c = colorStateList;
            this.f871s = a(colorStateList, oVar.d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f822q;
        if (drawable != null) {
            E.a.i(drawable, mode);
            return;
        }
        o oVar = this.f870r;
        if (oVar.d != mode) {
            oVar.d = mode;
            this.f871s = a(oVar.f860c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z7, boolean z8) {
        Drawable drawable = this.f822q;
        if (drawable != null) {
            return drawable.setVisible(z7, z8);
        }
        return super.setVisible(z7, z8);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f822q;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v21, types: [H0.j, H0.m, java.lang.Object] */
    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        n nVar;
        int i7;
        int i8;
        boolean z7;
        int i9;
        boolean z8;
        Paint.Cap cap;
        Paint.Join join;
        Drawable drawable = this.f822q;
        if (drawable != null) {
            E.a.d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        o oVar = this.f870r;
        oVar.f859b = new n();
        TypedArray g7 = C.b.g(resources, theme, attributeSet, a.f802a);
        o oVar2 = this.f870r;
        n nVar2 = oVar2.f859b;
        int i10 = !C.b.d(xmlPullParser, "tintMode") ? -1 : g7.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i11 = 3;
        if (i10 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i10 != 5) {
            if (i10 != 9) {
                switch (i10) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        oVar2.d = mode;
        int i12 = 1;
        ColorStateList colorStateList = null;
        boolean z9 = false;
        if (C.b.d(xmlPullParser, "tint")) {
            TypedValue typedValue = new TypedValue();
            g7.getValue(1, typedValue);
            int i13 = typedValue.type;
            if (i13 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            } else if (i13 >= 28 && i13 <= 31) {
                colorStateList = ColorStateList.valueOf(typedValue.data);
            } else {
                Resources resources2 = g7.getResources();
                int resourceId = g7.getResourceId(1, 0);
                ThreadLocal threadLocal = C.c.f322a;
                try {
                    colorStateList = C.c.a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e3) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e3);
                }
            }
        }
        ColorStateList colorStateList2 = colorStateList;
        if (colorStateList2 != null) {
            oVar2.f860c = colorStateList2;
        }
        boolean z10 = oVar2.f861e;
        if (C.b.d(xmlPullParser, "autoMirrored")) {
            z10 = g7.getBoolean(5, z10);
        }
        oVar2.f861e = z10;
        float f = nVar2.f853j;
        if (C.b.d(xmlPullParser, "viewportWidth")) {
            f = g7.getFloat(7, f);
        }
        nVar2.f853j = f;
        float f7 = nVar2.f854k;
        if (C.b.d(xmlPullParser, "viewportHeight")) {
            f7 = g7.getFloat(8, f7);
        }
        nVar2.f854k = f7;
        if (nVar2.f853j <= 0.0f) {
            throw new XmlPullParserException(g7.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (f7 <= 0.0f) {
            throw new XmlPullParserException(g7.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        } else {
            nVar2.f851h = g7.getDimension(3, nVar2.f851h);
            float dimension = g7.getDimension(2, nVar2.f852i);
            nVar2.f852i = dimension;
            if (nVar2.f851h <= 0.0f) {
                throw new XmlPullParserException(g7.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (dimension > 0.0f) {
                float alpha = nVar2.getAlpha();
                if (C.b.d(xmlPullParser, "alpha")) {
                    alpha = g7.getFloat(4, alpha);
                }
                nVar2.setAlpha(alpha);
                String string = g7.getString(0);
                if (string != null) {
                    nVar2.f856m = string;
                    nVar2.f857o.put(string, nVar2);
                }
                g7.recycle();
                oVar.f858a = getChangingConfigurations();
                oVar.f866k = true;
                o oVar3 = this.f870r;
                n nVar3 = oVar3.f859b;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(nVar3.f850g);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z11 = true;
                while (eventType != i12 && (xmlPullParser.getDepth() >= depth || eventType != i11)) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        k kVar = (k) arrayDeque.peek();
                        boolean equals = "path".equals(name);
                        i7 = depth;
                        C1052e c1052e = nVar3.f857o;
                        if (equals) {
                            ?? mVar = new m();
                            mVar.f = 0.0f;
                            mVar.f825h = 1.0f;
                            mVar.f826i = 1.0f;
                            mVar.f827j = 0.0f;
                            mVar.f828k = 1.0f;
                            mVar.f829l = 0.0f;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            mVar.f830m = cap2;
                            Paint.Join join2 = Paint.Join.MITER;
                            mVar.n = join2;
                            nVar = nVar3;
                            mVar.f831o = 4.0f;
                            TypedArray g8 = C.b.g(resources, theme, attributeSet, a.f804c);
                            if (C.b.d(xmlPullParser, "pathData")) {
                                String string2 = g8.getString(0);
                                if (string2 != null) {
                                    mVar.f843b = string2;
                                }
                                String string3 = g8.getString(2);
                                if (string3 != null) {
                                    mVar.f842a = android.support.v4.media.session.b.w(string3);
                                }
                                mVar.f824g = C.b.b(g8, xmlPullParser, theme, "fillColor", 1);
                                float f8 = mVar.f826i;
                                if (C.b.d(xmlPullParser, "fillAlpha")) {
                                    f8 = g8.getFloat(12, f8);
                                }
                                mVar.f826i = f8;
                                int i14 = !C.b.d(xmlPullParser, "strokeLineCap") ? -1 : g8.getInt(8, -1);
                                Paint.Cap cap3 = mVar.f830m;
                                if (i14 == 0) {
                                    cap = cap2;
                                } else if (i14 != 1) {
                                    cap = i14 != 2 ? cap3 : Paint.Cap.SQUARE;
                                } else {
                                    cap = Paint.Cap.ROUND;
                                }
                                mVar.f830m = cap;
                                int i15 = !C.b.d(xmlPullParser, "strokeLineJoin") ? -1 : g8.getInt(9, -1);
                                Paint.Join join3 = mVar.n;
                                if (i15 == 0) {
                                    join = join2;
                                } else if (i15 != 1) {
                                    join = i15 != 2 ? join3 : Paint.Join.BEVEL;
                                } else {
                                    join = Paint.Join.ROUND;
                                }
                                mVar.n = join;
                                float f9 = mVar.f831o;
                                if (C.b.d(xmlPullParser, "strokeMiterLimit")) {
                                    f9 = g8.getFloat(10, f9);
                                }
                                mVar.f831o = f9;
                                mVar.f823e = C.b.b(g8, xmlPullParser, theme, "strokeColor", 3);
                                float f10 = mVar.f825h;
                                if (C.b.d(xmlPullParser, "strokeAlpha")) {
                                    f10 = g8.getFloat(11, f10);
                                }
                                mVar.f825h = f10;
                                float f11 = mVar.f;
                                if (C.b.d(xmlPullParser, "strokeWidth")) {
                                    f11 = g8.getFloat(4, f11);
                                }
                                mVar.f = f11;
                                float f12 = mVar.f828k;
                                if (C.b.d(xmlPullParser, "trimPathEnd")) {
                                    f12 = g8.getFloat(6, f12);
                                }
                                mVar.f828k = f12;
                                float f13 = mVar.f829l;
                                if (C.b.d(xmlPullParser, "trimPathOffset")) {
                                    f13 = g8.getFloat(7, f13);
                                }
                                mVar.f829l = f13;
                                float f14 = mVar.f827j;
                                if (C.b.d(xmlPullParser, "trimPathStart")) {
                                    f14 = g8.getFloat(5, f14);
                                }
                                mVar.f827j = f14;
                                int i16 = mVar.f844c;
                                if (C.b.d(xmlPullParser, "fillType")) {
                                    i16 = g8.getInt(13, i16);
                                }
                                mVar.f844c = i16;
                            }
                            g8.recycle();
                            kVar.f833b.add(mVar);
                            if (mVar.getPathName() != null) {
                                c1052e.put(mVar.getPathName(), mVar);
                            }
                            oVar3.f858a |= mVar.d;
                            z8 = false;
                            i8 = 1;
                            z11 = false;
                        } else {
                            nVar = nVar3;
                            if ("clip-path".equals(name)) {
                                m mVar2 = new m();
                                if (C.b.d(xmlPullParser, "pathData")) {
                                    TypedArray g9 = C.b.g(resources, theme, attributeSet, a.d);
                                    String string4 = g9.getString(0);
                                    if (string4 != null) {
                                        mVar2.f843b = string4;
                                    }
                                    String string5 = g9.getString(1);
                                    if (string5 != null) {
                                        mVar2.f842a = android.support.v4.media.session.b.w(string5);
                                    }
                                    mVar2.f844c = !C.b.d(xmlPullParser, "fillType") ? 0 : g9.getInt(2, 0);
                                    g9.recycle();
                                }
                                kVar.f833b.add(mVar2);
                                if (mVar2.getPathName() != null) {
                                    c1052e.put(mVar2.getPathName(), mVar2);
                                }
                                oVar3.f858a = mVar2.d | oVar3.f858a;
                            } else if ("group".equals(name)) {
                                k kVar2 = new k();
                                TypedArray g10 = C.b.g(resources, theme, attributeSet, a.f803b);
                                float f15 = kVar2.f834c;
                                if (C.b.d(xmlPullParser, "rotation")) {
                                    f15 = g10.getFloat(5, f15);
                                }
                                kVar2.f834c = f15;
                                i8 = 1;
                                kVar2.d = g10.getFloat(1, kVar2.d);
                                kVar2.f835e = g10.getFloat(2, kVar2.f835e);
                                float f16 = kVar2.f;
                                if (C.b.d(xmlPullParser, "scaleX")) {
                                    f16 = g10.getFloat(3, f16);
                                }
                                kVar2.f = f16;
                                float f17 = kVar2.f836g;
                                if (C.b.d(xmlPullParser, "scaleY")) {
                                    f17 = g10.getFloat(4, f17);
                                }
                                kVar2.f836g = f17;
                                float f18 = kVar2.f837h;
                                if (C.b.d(xmlPullParser, "translateX")) {
                                    f18 = g10.getFloat(6, f18);
                                }
                                kVar2.f837h = f18;
                                float f19 = kVar2.f838i;
                                if (C.b.d(xmlPullParser, "translateY")) {
                                    f19 = g10.getFloat(7, f19);
                                }
                                kVar2.f838i = f19;
                                z8 = false;
                                String string6 = g10.getString(0);
                                if (string6 != null) {
                                    kVar2.f841l = string6;
                                }
                                kVar2.c();
                                g10.recycle();
                                kVar.f833b.add(kVar2);
                                arrayDeque.push(kVar2);
                                if (kVar2.getGroupName() != null) {
                                    c1052e.put(kVar2.getGroupName(), kVar2);
                                }
                                oVar3.f858a = kVar2.f840k | oVar3.f858a;
                            }
                            z8 = false;
                            i8 = 1;
                        }
                        z7 = z8;
                        i9 = 3;
                    } else {
                        nVar = nVar3;
                        i7 = depth;
                        i8 = i12;
                        z7 = z9;
                        i9 = 3;
                        if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    i11 = i9;
                    z9 = z7;
                    i12 = i8;
                    depth = i7;
                    nVar3 = nVar;
                }
                if (!z11) {
                    this.f871s = a(oVar.f860c, oVar.d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            } else {
                throw new XmlPullParserException(g7.getPositionDescription() + "<vector> tag requires height > 0");
            }
        }
    }

    public q(o oVar) {
        this.f874v = true;
        this.f875w = new float[9];
        this.f876x = new Matrix();
        this.f877y = new Rect();
        this.f870r = oVar;
        this.f871s = a(oVar.f860c, oVar.d);
    }
}
