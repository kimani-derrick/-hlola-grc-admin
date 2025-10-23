package B3;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.boxhdo.android.tv.R;
import com.google.android.material.chip.Chip;
import java.lang.ref.WeakReference;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class f extends J3.g implements Drawable.Callback, F3.h {

    /* renamed from: W0  reason: collision with root package name */
    public static final int[] f194W0 = {16842910};

    /* renamed from: X0  reason: collision with root package name */
    public static final ShapeDrawable f195X0 = new ShapeDrawable(new OvalShape());

    /* renamed from: A0  reason: collision with root package name */
    public final F3.i f196A0;

    /* renamed from: B0  reason: collision with root package name */
    public int f197B0;

    /* renamed from: C0  reason: collision with root package name */
    public int f198C0;

    /* renamed from: D0  reason: collision with root package name */
    public int f199D0;

    /* renamed from: E0  reason: collision with root package name */
    public int f200E0;

    /* renamed from: F0  reason: collision with root package name */
    public int f201F0;
    public int G0;

    /* renamed from: H0  reason: collision with root package name */
    public boolean f202H0;

    /* renamed from: I0  reason: collision with root package name */
    public int f203I0;

    /* renamed from: J0  reason: collision with root package name */
    public int f204J0;

    /* renamed from: K0  reason: collision with root package name */
    public ColorFilter f205K0;

    /* renamed from: L0  reason: collision with root package name */
    public PorterDuffColorFilter f206L0;

    /* renamed from: M0  reason: collision with root package name */
    public ColorStateList f207M0;

    /* renamed from: N  reason: collision with root package name */
    public ColorStateList f208N;

    /* renamed from: N0  reason: collision with root package name */
    public PorterDuff.Mode f209N0;

    /* renamed from: O  reason: collision with root package name */
    public ColorStateList f210O;

    /* renamed from: O0  reason: collision with root package name */
    public int[] f211O0;

    /* renamed from: P  reason: collision with root package name */
    public float f212P;

    /* renamed from: P0  reason: collision with root package name */
    public boolean f213P0;

    /* renamed from: Q  reason: collision with root package name */
    public float f214Q;

    /* renamed from: Q0  reason: collision with root package name */
    public ColorStateList f215Q0;

    /* renamed from: R  reason: collision with root package name */
    public ColorStateList f216R;

    /* renamed from: R0  reason: collision with root package name */
    public WeakReference f217R0;

    /* renamed from: S  reason: collision with root package name */
    public float f218S;

    /* renamed from: S0  reason: collision with root package name */
    public TextUtils.TruncateAt f219S0;

    /* renamed from: T  reason: collision with root package name */
    public ColorStateList f220T;

    /* renamed from: T0  reason: collision with root package name */
    public boolean f221T0;

    /* renamed from: U  reason: collision with root package name */
    public CharSequence f222U;
    public int U0;

    /* renamed from: V  reason: collision with root package name */
    public boolean f223V;

    /* renamed from: V0  reason: collision with root package name */
    public boolean f224V0;
    public Drawable W;

    /* renamed from: X  reason: collision with root package name */
    public ColorStateList f225X;

    /* renamed from: Y  reason: collision with root package name */
    public float f226Y;

    /* renamed from: Z  reason: collision with root package name */
    public boolean f227Z;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f228a0;

    /* renamed from: b0  reason: collision with root package name */
    public Drawable f229b0;

    /* renamed from: c0  reason: collision with root package name */
    public RippleDrawable f230c0;

    /* renamed from: d0  reason: collision with root package name */
    public ColorStateList f231d0;

    /* renamed from: e0  reason: collision with root package name */
    public float f232e0;

    /* renamed from: f0  reason: collision with root package name */
    public SpannableStringBuilder f233f0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f234g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f235h0;

    /* renamed from: i0  reason: collision with root package name */
    public Drawable f236i0;

    /* renamed from: j0  reason: collision with root package name */
    public ColorStateList f237j0;

    /* renamed from: k0  reason: collision with root package name */
    public v3.b f238k0;

    /* renamed from: l0  reason: collision with root package name */
    public v3.b f239l0;

    /* renamed from: m0  reason: collision with root package name */
    public float f240m0;

    /* renamed from: n0  reason: collision with root package name */
    public float f241n0;

    /* renamed from: o0  reason: collision with root package name */
    public float f242o0;

    /* renamed from: p0  reason: collision with root package name */
    public float f243p0;

    /* renamed from: q0  reason: collision with root package name */
    public float f244q0;

    /* renamed from: r0  reason: collision with root package name */
    public float f245r0;

    /* renamed from: s0  reason: collision with root package name */
    public float f246s0;

    /* renamed from: t0  reason: collision with root package name */
    public float f247t0;

    /* renamed from: u0  reason: collision with root package name */
    public final Context f248u0;

    /* renamed from: v0  reason: collision with root package name */
    public final Paint f249v0;

    /* renamed from: w0  reason: collision with root package name */
    public final Paint.FontMetrics f250w0;

    /* renamed from: x0  reason: collision with root package name */
    public final RectF f251x0;
    public final PointF y0;

    /* renamed from: z0  reason: collision with root package name */
    public final Path f252z0;

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.chipStyle, 2132017946);
        this.f214Q = -1.0f;
        this.f249v0 = new Paint(1);
        this.f250w0 = new Paint.FontMetrics();
        this.f251x0 = new RectF();
        this.y0 = new PointF();
        this.f252z0 = new Path();
        this.f204J0 = 255;
        this.f209N0 = PorterDuff.Mode.SRC_IN;
        this.f217R0 = new WeakReference(null);
        h(context);
        this.f248u0 = context;
        F3.i iVar = new F3.i(this);
        this.f196A0 = iVar;
        this.f222U = "";
        iVar.f719a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = f194W0;
        setState(iArr);
        if (!Arrays.equals(this.f211O0, iArr)) {
            this.f211O0 = iArr;
            if (T()) {
                v(getState(), iArr);
            }
        }
        this.f221T0 = true;
        int[] iArr2 = H3.a.f1184a;
        f195X0.setTint(-1);
    }

    public static void U(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public static boolean s(ColorStateList colorStateList) {
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        return false;
    }

    public static boolean t(Drawable drawable) {
        if (drawable != null && drawable.isStateful()) {
            return true;
        }
        return false;
    }

    public final void A(float f) {
        if (this.f214Q != f) {
            this.f214Q = f;
            J3.j e3 = this.f1362q.f1332a.e();
            e3.f1376e = new J3.a(f);
            e3.f = new J3.a(f);
            e3.f1377g = new J3.a(f);
            e3.f1378h = new J3.a(f);
            setShapeAppearanceModel(e3.a());
        }
    }

    public final void B(Drawable drawable) {
        Drawable drawable2 = this.W;
        Drawable drawable3 = null;
        if (drawable2 != null) {
            if (drawable2 instanceof E.d) {
                ((E.e) ((E.d) drawable2)).getClass();
                drawable2 = null;
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float p3 = p();
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.W = drawable3;
            float p5 = p();
            U(drawable2);
            if (S()) {
                n(this.W);
            }
            invalidateSelf();
            if (p3 != p5) {
                u();
            }
        }
    }

    public final void C(float f) {
        if (this.f226Y != f) {
            float p3 = p();
            this.f226Y = f;
            float p5 = p();
            invalidateSelf();
            if (p3 != p5) {
                u();
            }
        }
    }

    public final void D(ColorStateList colorStateList) {
        this.f227Z = true;
        if (this.f225X != colorStateList) {
            this.f225X = colorStateList;
            if (S()) {
                E.a.h(this.W, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void E(boolean z7) {
        if (this.f223V != z7) {
            boolean S6 = S();
            this.f223V = z7;
            boolean S7 = S();
            if (S6 != S7) {
                if (S7) {
                    n(this.W);
                } else {
                    U(this.W);
                }
                invalidateSelf();
                u();
            }
        }
    }

    public final void F(ColorStateList colorStateList) {
        if (this.f216R != colorStateList) {
            this.f216R = colorStateList;
            if (this.f224V0) {
                J3.f fVar = this.f1362q;
                if (fVar.d != colorStateList) {
                    fVar.d = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    public final void G(float f) {
        if (this.f218S != f) {
            this.f218S = f;
            this.f249v0.setStrokeWidth(f);
            if (this.f224V0) {
                this.f1362q.f1340k = f;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void H(android.graphics.drawable.Drawable r6) {
        /*
            r5 = this;
            r0 = 0
            android.graphics.drawable.Drawable r1 = r5.f229b0
            if (r1 == 0) goto L10
            boolean r2 = r1 instanceof E.d
            if (r2 == 0) goto L11
            E.d r1 = (E.d) r1
            E.e r1 = (E.e) r1
            r1.getClass()
        L10:
            r1 = r0
        L11:
            if (r1 == r6) goto L4e
            float r2 = r5.q()
            if (r6 == 0) goto L1d
            android.graphics.drawable.Drawable r0 = r6.mutate()
        L1d:
            r5.f229b0 = r0
            int[] r6 = H3.a.f1184a
            android.graphics.drawable.RippleDrawable r6 = new android.graphics.drawable.RippleDrawable
            android.content.res.ColorStateList r0 = r5.f220T
            android.content.res.ColorStateList r0 = H3.a.a(r0)
            android.graphics.drawable.Drawable r3 = r5.f229b0
            android.graphics.drawable.ShapeDrawable r4 = B3.f.f195X0
            r6.<init>(r0, r3, r4)
            r5.f230c0 = r6
            float r6 = r5.q()
            U(r1)
            boolean r0 = r5.T()
            if (r0 == 0) goto L44
            android.graphics.drawable.Drawable r0 = r5.f229b0
            r5.n(r0)
        L44:
            r5.invalidateSelf()
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 == 0) goto L4e
            r5.u()
        L4e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: B3.f.H(android.graphics.drawable.Drawable):void");
    }

    public final void I(float f) {
        if (this.f246s0 != f) {
            this.f246s0 = f;
            invalidateSelf();
            if (T()) {
                u();
            }
        }
    }

    public final void J(float f) {
        if (this.f232e0 != f) {
            this.f232e0 = f;
            invalidateSelf();
            if (T()) {
                u();
            }
        }
    }

    public final void K(float f) {
        if (this.f245r0 != f) {
            this.f245r0 = f;
            invalidateSelf();
            if (T()) {
                u();
            }
        }
    }

    public final void L(ColorStateList colorStateList) {
        if (this.f231d0 != colorStateList) {
            this.f231d0 = colorStateList;
            if (T()) {
                E.a.h(this.f229b0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void M(boolean z7) {
        if (this.f228a0 != z7) {
            boolean T6 = T();
            this.f228a0 = z7;
            boolean T7 = T();
            if (T6 != T7) {
                if (T7) {
                    n(this.f229b0);
                } else {
                    U(this.f229b0);
                }
                invalidateSelf();
                u();
            }
        }
    }

    public final void N(float f) {
        if (this.f242o0 != f) {
            float p3 = p();
            this.f242o0 = f;
            float p5 = p();
            invalidateSelf();
            if (p3 != p5) {
                u();
            }
        }
    }

    public final void O(float f) {
        if (this.f241n0 != f) {
            float p3 = p();
            this.f241n0 = f;
            float p5 = p();
            invalidateSelf();
            if (p3 != p5) {
                u();
            }
        }
    }

    public final void P(ColorStateList colorStateList) {
        ColorStateList colorStateList2;
        if (this.f220T != colorStateList) {
            this.f220T = colorStateList;
            if (this.f213P0) {
                colorStateList2 = H3.a.a(colorStateList);
            } else {
                colorStateList2 = null;
            }
            this.f215Q0 = colorStateList2;
            onStateChange(getState());
        }
    }

    public final void Q(G3.d dVar) {
        F3.i iVar = this.f196A0;
        if (iVar.f != dVar) {
            iVar.f = dVar;
            if (dVar != null) {
                TextPaint textPaint = iVar.f719a;
                Context context = this.f248u0;
                b bVar = iVar.f720b;
                dVar.f(context, textPaint, bVar);
                F3.h hVar = (F3.h) iVar.f722e.get();
                if (hVar != null) {
                    textPaint.drawableState = hVar.getState();
                }
                dVar.e(context, textPaint, bVar);
                iVar.d = true;
            }
            F3.h hVar2 = (F3.h) iVar.f722e.get();
            if (hVar2 != null) {
                f fVar = (f) hVar2;
                fVar.u();
                fVar.invalidateSelf();
                fVar.onStateChange(hVar2.getState());
            }
        }
    }

    public final boolean R() {
        if (this.f235h0 && this.f236i0 != null && this.f202H0) {
            return true;
        }
        return false;
    }

    public final boolean S() {
        if (this.f223V && this.W != null) {
            return true;
        }
        return false;
    }

    public final boolean T() {
        if (this.f228a0 && this.f229b0 != null) {
            return true;
        }
        return false;
    }

    @Override // J3.g, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i7;
        int i8;
        RectF rectF;
        int i9;
        int i10;
        int i11;
        RectF rectF2;
        float f;
        boolean z7;
        int i12;
        float f7;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && (i7 = this.f204J0) != 0) {
            if (i7 < 255) {
                i8 = canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i7);
            } else {
                i8 = 0;
            }
            boolean z8 = this.f224V0;
            Paint paint = this.f249v0;
            RectF rectF3 = this.f251x0;
            if (!z8) {
                paint.setColor(this.f197B0);
                paint.setStyle(Paint.Style.FILL);
                rectF3.set(bounds);
                canvas.drawRoundRect(rectF3, r(), r(), paint);
            }
            if (!this.f224V0) {
                paint.setColor(this.f198C0);
                paint.setStyle(Paint.Style.FILL);
                ColorFilter colorFilter = this.f205K0;
                if (colorFilter == null) {
                    colorFilter = this.f206L0;
                }
                paint.setColorFilter(colorFilter);
                rectF3.set(bounds);
                canvas.drawRoundRect(rectF3, r(), r(), paint);
            }
            if (this.f224V0) {
                super.draw(canvas);
            }
            float f8 = 0.0f;
            if (this.f218S > 0.0f && !this.f224V0) {
                paint.setColor(this.f200E0);
                paint.setStyle(Paint.Style.STROKE);
                if (!this.f224V0) {
                    ColorFilter colorFilter2 = this.f205K0;
                    if (colorFilter2 == null) {
                        colorFilter2 = this.f206L0;
                    }
                    paint.setColorFilter(colorFilter2);
                }
                float f9 = this.f218S / 2.0f;
                rectF3.set(bounds.left + f9, bounds.top + f9, bounds.right - f9, bounds.bottom - f9);
                float f10 = this.f214Q - (this.f218S / 2.0f);
                canvas.drawRoundRect(rectF3, f10, f10, paint);
            }
            paint.setColor(this.f201F0);
            paint.setStyle(Paint.Style.FILL);
            rectF3.set(bounds);
            if (!this.f224V0) {
                canvas.drawRoundRect(rectF3, r(), r(), paint);
            } else {
                RectF rectF4 = new RectF(bounds);
                Path path = this.f252z0;
                J3.f fVar = this.f1362q;
                this.f1357H.b(fVar.f1332a, fVar.f1339j, rectF4, this.f1356G, path);
                e(canvas, paint, path, this.f1362q.f1332a, f());
            }
            if (S()) {
                o(bounds, rectF3);
                float f11 = rectF3.left;
                float f12 = rectF3.top;
                canvas.translate(f11, f12);
                this.W.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
                this.W.draw(canvas);
                canvas.translate(-f11, -f12);
            }
            if (R()) {
                o(bounds, rectF3);
                float f13 = rectF3.left;
                float f14 = rectF3.top;
                canvas.translate(f13, f14);
                this.f236i0.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
                this.f236i0.draw(canvas);
                canvas.translate(-f13, -f14);
            }
            if (this.f221T0 && this.f222U != null) {
                PointF pointF = this.y0;
                pointF.set(0.0f, 0.0f);
                Paint.Align align = Paint.Align.LEFT;
                CharSequence charSequence = this.f222U;
                F3.i iVar = this.f196A0;
                if (charSequence != null) {
                    float p3 = p() + this.f240m0 + this.f243p0;
                    if (E.b.a(this) == 0) {
                        pointF.x = bounds.left + p3;
                    } else {
                        pointF.x = bounds.right - p3;
                        align = Paint.Align.RIGHT;
                    }
                    TextPaint textPaint = iVar.f719a;
                    Paint.FontMetrics fontMetrics = this.f250w0;
                    textPaint.getFontMetrics(fontMetrics);
                    pointF.y = bounds.centerY() - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
                }
                rectF3.setEmpty();
                if (this.f222U != null) {
                    float p5 = p() + this.f240m0 + this.f243p0;
                    float q5 = q() + this.f247t0 + this.f244q0;
                    if (E.b.a(this) == 0) {
                        rectF3.left = bounds.left + p5;
                        f7 = bounds.right - q5;
                    } else {
                        rectF3.left = bounds.left + q5;
                        f7 = bounds.right - p5;
                    }
                    rectF3.right = f7;
                    rectF3.top = bounds.top;
                    rectF3.bottom = bounds.bottom;
                }
                G3.d dVar = iVar.f;
                TextPaint textPaint2 = iVar.f719a;
                if (dVar != null) {
                    textPaint2.drawableState = getState();
                    iVar.f.e(this.f248u0, textPaint2, iVar.f720b);
                }
                textPaint2.setTextAlign(align);
                String charSequence2 = this.f222U.toString();
                if (!iVar.d) {
                    f = iVar.f721c;
                } else {
                    if (charSequence2 != null) {
                        f8 = textPaint2.measureText((CharSequence) charSequence2, 0, charSequence2.length());
                    }
                    iVar.f721c = f8;
                    iVar.d = false;
                    f = f8;
                }
                if (Math.round(f) > Math.round(rectF3.width())) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (z7) {
                    i12 = canvas.save();
                    canvas.clipRect(rectF3);
                } else {
                    i12 = 0;
                }
                CharSequence charSequence3 = this.f222U;
                if (z7 && this.f219S0 != null) {
                    charSequence3 = TextUtils.ellipsize(charSequence3, textPaint2, rectF3.width(), this.f219S0);
                }
                CharSequence charSequence4 = charSequence3;
                int length = charSequence4.length();
                float f15 = pointF.x;
                float f16 = pointF.y;
                rectF = rectF3;
                i9 = i8;
                i10 = 255;
                i11 = 0;
                canvas.drawText(charSequence4, 0, length, f15, f16, textPaint2);
                if (z7) {
                    canvas.restoreToCount(i12);
                }
            } else {
                rectF = rectF3;
                i9 = i8;
                i10 = 255;
                i11 = 0;
            }
            if (T()) {
                rectF.setEmpty();
                if (T()) {
                    float f17 = this.f247t0 + this.f246s0;
                    if (E.b.a(this) == 0) {
                        float f18 = bounds.right - f17;
                        rectF2 = rectF;
                        rectF2.right = f18;
                        rectF2.left = f18 - this.f232e0;
                    } else {
                        rectF2 = rectF;
                        float f19 = bounds.left + f17;
                        rectF2.left = f19;
                        rectF2.right = f19 + this.f232e0;
                    }
                    float exactCenterY = bounds.exactCenterY();
                    float f20 = this.f232e0;
                    float f21 = exactCenterY - (f20 / 2.0f);
                    rectF2.top = f21;
                    rectF2.bottom = f21 + f20;
                } else {
                    rectF2 = rectF;
                }
                float f22 = rectF2.left;
                float f23 = rectF2.top;
                canvas.translate(f22, f23);
                this.f229b0.setBounds(i11, i11, (int) rectF2.width(), (int) rectF2.height());
                int[] iArr = H3.a.f1184a;
                this.f230c0.setBounds(this.f229b0.getBounds());
                this.f230c0.jumpToCurrentState();
                this.f230c0.draw(canvas);
                canvas.translate(-f22, -f23);
            }
            if (this.f204J0 < i10) {
                canvas.restoreToCount(i9);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f204J0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f205K0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.f212P;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float measureText;
        float p3 = p() + this.f240m0 + this.f243p0;
        String charSequence = this.f222U.toString();
        F3.i iVar = this.f196A0;
        if (!iVar.d) {
            measureText = iVar.f721c;
        } else {
            if (charSequence == null) {
                measureText = 0.0f;
            } else {
                measureText = iVar.f719a.measureText((CharSequence) charSequence, 0, charSequence.length());
            }
            iVar.f721c = measureText;
            iVar.d = false;
        }
        return Math.min(Math.round(q() + measureText + p3 + this.f244q0 + this.f247t0), this.U0);
    }

    @Override // J3.g, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // J3.g, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        if (this.f224V0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.f214Q);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f212P, this.f214Q);
        }
        outline.setAlpha(this.f204J0 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // J3.g, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        G3.d dVar;
        ColorStateList colorStateList;
        if (!s(this.f208N) && !s(this.f210O) && !s(this.f216R) && ((!this.f213P0 || !s(this.f215Q0)) && (((dVar = this.f196A0.f) == null || (colorStateList = dVar.f755a) == null || !colorStateList.isStateful()) && ((!this.f235h0 || this.f236i0 == null || !this.f234g0) && !t(this.W) && !t(this.f236i0) && !s(this.f207M0))))) {
            return false;
        }
        return true;
    }

    public final void n(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        E.b.b(drawable, E.b.a(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f229b0) {
            if (drawable.isStateful()) {
                drawable.setState(this.f211O0);
            }
            E.a.h(drawable, this.f231d0);
            return;
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
        Drawable drawable2 = this.W;
        if (drawable == drawable2 && this.f227Z) {
            E.a.h(drawable2, this.f225X);
        }
    }

    public final void o(Rect rect, RectF rectF) {
        Drawable drawable;
        Drawable drawable2;
        rectF.setEmpty();
        if (S() || R()) {
            float f = this.f240m0 + this.f241n0;
            if (this.f202H0) {
                drawable = this.f236i0;
            } else {
                drawable = this.W;
            }
            float f7 = this.f226Y;
            if (f7 <= 0.0f && drawable != null) {
                f7 = drawable.getIntrinsicWidth();
            }
            if (E.b.a(this) == 0) {
                float f8 = rect.left + f;
                rectF.left = f8;
                rectF.right = f8 + f7;
            } else {
                float f9 = rect.right - f;
                rectF.right = f9;
                rectF.left = f9 - f7;
            }
            if (this.f202H0) {
                drawable2 = this.f236i0;
            } else {
                drawable2 = this.W;
            }
            float f10 = this.f226Y;
            if (f10 <= 0.0f && drawable2 != null) {
                f10 = (float) Math.ceil(TypedValue.applyDimension(1, 24, this.f248u0.getResources().getDisplayMetrics()));
                if (drawable2.getIntrinsicHeight() <= f10) {
                    f10 = drawable2.getIntrinsicHeight();
                }
            }
            float exactCenterY = rect.exactCenterY() - (f10 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + f10;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i7) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i7);
        if (S()) {
            onLayoutDirectionChanged |= E.b.b(this.W, i7);
        }
        if (R()) {
            onLayoutDirectionChanged |= E.b.b(this.f236i0, i7);
        }
        if (T()) {
            onLayoutDirectionChanged |= E.b.b(this.f229b0, i7);
        }
        if (onLayoutDirectionChanged) {
            invalidateSelf();
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i7) {
        boolean onLevelChange = super.onLevelChange(i7);
        if (S()) {
            onLevelChange |= this.W.setLevel(i7);
        }
        if (R()) {
            onLevelChange |= this.f236i0.setLevel(i7);
        }
        if (T()) {
            onLevelChange |= this.f229b0.setLevel(i7);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // J3.g, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.f224V0) {
            super.onStateChange(iArr);
        }
        return v(iArr, this.f211O0);
    }

    public final float p() {
        Drawable drawable;
        if (!S() && !R()) {
            return 0.0f;
        }
        float f = this.f241n0;
        if (this.f202H0) {
            drawable = this.f236i0;
        } else {
            drawable = this.W;
        }
        float f7 = this.f226Y;
        if (f7 <= 0.0f && drawable != null) {
            f7 = drawable.getIntrinsicWidth();
        }
        return f7 + f + this.f242o0;
    }

    public final float q() {
        if (T()) {
            return this.f245r0 + this.f232e0 + this.f246s0;
        }
        return 0.0f;
    }

    public final float r() {
        if (this.f224V0) {
            return this.f1362q.f1332a.f1386e.a(f());
        }
        return this.f214Q;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j7) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j7);
        }
    }

    @Override // J3.g, android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        if (this.f204J0 != i7) {
            this.f204J0 = i7;
            invalidateSelf();
        }
    }

    @Override // J3.g, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f205K0 != colorFilter) {
            this.f205K0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // J3.g, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.f207M0 != colorStateList) {
            this.f207M0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // J3.g, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        if (this.f209N0 != mode) {
            this.f209N0 = mode;
            ColorStateList colorStateList = this.f207M0;
            if (colorStateList != null && mode != null) {
                porterDuffColorFilter = new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            } else {
                porterDuffColorFilter = null;
            }
            this.f206L0 = porterDuffColorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z7, boolean z8) {
        boolean visible = super.setVisible(z7, z8);
        if (S()) {
            visible |= this.W.setVisible(z7, z8);
        }
        if (R()) {
            visible |= this.f236i0.setVisible(z7, z8);
        }
        if (T()) {
            visible |= this.f229b0.setVisible(z7, z8);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final void u() {
        e eVar = (e) this.f217R0.get();
        if (eVar != null) {
            Chip chip = (Chip) eVar;
            chip.c(chip.F);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean v(int[] r9, int[] r10) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B3.f.v(int[], int[]):boolean");
    }

    public final void w(boolean z7) {
        if (this.f234g0 != z7) {
            this.f234g0 = z7;
            float p3 = p();
            if (!z7 && this.f202H0) {
                this.f202H0 = false;
            }
            float p5 = p();
            invalidateSelf();
            if (p3 != p5) {
                u();
            }
        }
    }

    public final void x(Drawable drawable) {
        if (this.f236i0 != drawable) {
            float p3 = p();
            this.f236i0 = drawable;
            float p5 = p();
            U(this.f236i0);
            n(this.f236i0);
            invalidateSelf();
            if (p3 != p5) {
                u();
            }
        }
    }

    public final void y(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.f237j0 != colorStateList) {
            this.f237j0 = colorStateList;
            if (this.f235h0 && (drawable = this.f236i0) != null && this.f234g0) {
                E.a.h(drawable, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void z(boolean z7) {
        if (this.f235h0 != z7) {
            boolean R6 = R();
            this.f235h0 = z7;
            boolean R7 = R();
            if (R6 != R7) {
                if (R7) {
                    n(this.f236i0);
                } else {
                    U(this.f236i0);
                }
                invalidateSelf();
                u();
            }
        }
    }
}
