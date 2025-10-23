package g;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import p6.l;
/* renamed from: g.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0707e extends Drawable implements Drawable.Callback {

    /* renamed from: J  reason: collision with root package name */
    public static final /* synthetic */ int f10483J = 0;

    /* renamed from: A  reason: collision with root package name */
    public long f10484A;

    /* renamed from: B  reason: collision with root package name */
    public H0.b f10485B;

    /* renamed from: C  reason: collision with root package name */
    public C0704b f10486C;

    /* renamed from: D  reason: collision with root package name */
    public boolean f10487D;

    /* renamed from: E  reason: collision with root package name */
    public C0704b f10488E;
    public l F;

    /* renamed from: I  reason: collision with root package name */
    public boolean f10491I;

    /* renamed from: q  reason: collision with root package name */
    public C0704b f10492q;

    /* renamed from: r  reason: collision with root package name */
    public Rect f10493r;

    /* renamed from: s  reason: collision with root package name */
    public Drawable f10494s;

    /* renamed from: t  reason: collision with root package name */
    public Drawable f10495t;

    /* renamed from: v  reason: collision with root package name */
    public boolean f10497v;

    /* renamed from: x  reason: collision with root package name */
    public boolean f10499x;

    /* renamed from: y  reason: collision with root package name */
    public P.b f10500y;

    /* renamed from: z  reason: collision with root package name */
    public long f10501z;

    /* renamed from: u  reason: collision with root package name */
    public int f10496u = 255;

    /* renamed from: w  reason: collision with root package name */
    public int f10498w = -1;

    /* renamed from: G  reason: collision with root package name */
    public int f10489G = -1;

    /* renamed from: H  reason: collision with root package name */
    public int f10490H = -1;

    public C0707e(C0704b c0704b, Resources resources) {
        i(new C0704b(c0704b, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x026f, code lost:
        r5.onStateChange(r5.getState());
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0276, code lost:
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static g.C0707e c(android.content.Context r20, android.content.res.Resources r21, android.content.res.XmlResourceParser r22, android.util.AttributeSet r23, android.content.res.Resources.Theme r24) {
        /*
            Method dump skipped, instructions count: 661
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g.C0707e.c(android.content.Context, android.content.res.Resources, android.content.res.XmlResourceParser, android.util.AttributeSet, android.content.res.Resources$Theme):g.e");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0062 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f10497v = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f10494s
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r8 = 0
            if (r3 == 0) goto L1f
            long r9 = r13.f10501z
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 == 0) goto L36
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L22
            int r9 = r13.f10496u
            r3.setAlpha(r9)
        L1f:
            r13.f10501z = r6
            goto L36
        L22:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r9 = (int) r9
            g.b r10 = r13.f10492q
            int r10 = r10.f10476y
            int r9 = r9 / r10
            int r9 = 255 - r9
            int r10 = r13.f10496u
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = r0
            goto L37
        L36:
            r3 = r8
        L37:
            android.graphics.drawable.Drawable r9 = r13.f10495t
            if (r9 == 0) goto L4b
            long r10 = r13.f10484A
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 == 0) goto L5f
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L4e
            r9.setVisible(r8, r8)
            r0 = 0
            r13.f10495t = r0
        L4b:
            r13.f10484A = r6
            goto L5f
        L4e:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            g.b r4 = r13.f10492q
            int r4 = r4.f10477z
            int r3 = r3 / r4
            int r4 = r13.f10496u
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L60
        L5f:
            r0 = r3
        L60:
            if (r14 == 0) goto L6c
            if (r0 == 0) goto L6c
            P.b r14 = r13.f10500y
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L6c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.C0707e.a(boolean):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        b(theme);
        onStateChange(getState());
    }

    public final void b(Resources.Theme theme) {
        C0704b c0704b = this.f10492q;
        if (theme != null) {
            c0704b.c();
            int i7 = c0704b.f10460h;
            Drawable[] drawableArr = c0704b.f10459g;
            for (int i8 = 0; i8 < i7; i8++) {
                Drawable drawable = drawableArr[i8];
                if (drawable != null && E.a.b(drawable)) {
                    E.a.a(drawableArr[i8], theme);
                    c0704b.f10458e |= drawableArr[i8].getChangingConfigurations();
                }
            }
            Resources resources = theme.getResources();
            if (resources != null) {
                c0704b.f10456b = resources;
                int i9 = resources.getDisplayMetrics().densityDpi;
                if (i9 == 0) {
                    i9 = 160;
                }
                int i10 = c0704b.f10457c;
                c0704b.f10457c = i9;
                if (i10 != i9) {
                    c0704b.f10465m = false;
                    c0704b.f10462j = false;
                    return;
                }
                return;
            }
            return;
        }
        c0704b.getClass();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return this.f10492q.canApplyTheme();
    }

    public final void d(Drawable drawable) {
        if (this.f10485B == null) {
            this.f10485B = new H0.b();
        }
        H0.b bVar = this.f10485B;
        bVar.f812r = drawable.getCallback();
        drawable.setCallback(bVar);
        try {
            if (this.f10492q.f10476y <= 0 && this.f10497v) {
                drawable.setAlpha(this.f10496u);
            }
            C0704b c0704b = this.f10492q;
            if (c0704b.f10448C) {
                drawable.setColorFilter(c0704b.f10447B);
            } else {
                if (c0704b.F) {
                    E.a.h(drawable, c0704b.f10449D);
                }
                C0704b c0704b2 = this.f10492q;
                if (c0704b2.f10451G) {
                    E.a.i(drawable, c0704b2.f10450E);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f10492q.f10474w);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            E.b.b(drawable, E.b.a(this));
            drawable.setAutoMirrored(this.f10492q.f10446A);
            Rect rect = this.f10493r;
            if (rect != null) {
                E.a.f(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
            H0.b bVar2 = this.f10485B;
            bVar2.f812r = null;
            drawable.setCallback((Drawable.Callback) bVar2.f812r);
        } catch (Throwable th) {
            H0.b bVar3 = this.f10485B;
            bVar3.f812r = null;
            drawable.setCallback((Drawable.Callback) bVar3.f812r);
            throw th;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f10494s;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f10495t;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public final void e() {
        boolean z7;
        Drawable drawable = this.f10495t;
        boolean z8 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f10495t = null;
            z7 = true;
        } else {
            z7 = false;
        }
        Drawable drawable2 = this.f10494s;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f10497v) {
                this.f10494s.setAlpha(this.f10496u);
            }
        }
        if (this.f10484A != 0) {
            this.f10484A = 0L;
        } else {
            z8 = z7;
        }
        if (this.f10501z != 0) {
            this.f10501z = 0L;
        } else if (!z8) {
            return;
        }
        invalidateSelf();
    }

    public final Drawable f() {
        if (!this.f10499x && super.mutate() == this) {
            C0704b c0704b = new C0704b(this.f10488E, this, null);
            c0704b.f10453I = c0704b.f10453I.clone();
            c0704b.f10454J = c0704b.f10454J.clone();
            i(c0704b);
            this.f10499x = true;
        }
        return this;
    }

    public final Drawable g() {
        if (!this.f10487D) {
            f();
            C0704b c0704b = this.f10486C;
            c0704b.f10453I = c0704b.f10453I.clone();
            c0704b.f10454J = c0704b.f10454J.clone();
            this.f10487D = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f10496u;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f10492q.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        C0704b c0704b = this.f10492q;
        if (c0704b.f10472u) {
            if (!c0704b.f10473v) {
                return null;
            }
        } else {
            c0704b.c();
            c0704b.f10472u = true;
            int i7 = c0704b.f10460h;
            Drawable[] drawableArr = c0704b.f10459g;
            for (int i8 = 0; i8 < i7; i8++) {
                if (drawableArr[i8].getConstantState() == null) {
                    c0704b.f10473v = false;
                    return null;
                }
            }
            c0704b.f10473v = true;
        }
        this.f10492q.d = getChangingConfigurations();
        return this.f10492q;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.f10494s;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f10493r;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        C0704b c0704b = this.f10492q;
        if (c0704b.f10464l) {
            if (!c0704b.f10465m) {
                c0704b.b();
            }
            return c0704b.f10466o;
        }
        Drawable drawable = this.f10494s;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        C0704b c0704b = this.f10492q;
        if (c0704b.f10464l) {
            if (!c0704b.f10465m) {
                c0704b.b();
            }
            return c0704b.n;
        }
        Drawable drawable = this.f10494s;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        C0704b c0704b = this.f10492q;
        if (c0704b.f10464l) {
            if (!c0704b.f10465m) {
                c0704b.b();
            }
            return c0704b.f10468q;
        }
        Drawable drawable = this.f10494s;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        C0704b c0704b = this.f10492q;
        if (c0704b.f10464l) {
            if (!c0704b.f10465m) {
                c0704b.b();
            }
            return c0704b.f10467p;
        }
        Drawable drawable = this.f10494s;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f10494s;
        int i7 = -2;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        C0704b c0704b = this.f10492q;
        if (c0704b.f10469r) {
            return c0704b.f10470s;
        }
        c0704b.c();
        int i8 = c0704b.f10460h;
        Drawable[] drawableArr = c0704b.f10459g;
        if (i8 > 0) {
            i7 = drawableArr[0].getOpacity();
        }
        for (int i9 = 1; i9 < i8; i9++) {
            i7 = Drawable.resolveOpacity(i7, drawableArr[i9].getOpacity());
        }
        c0704b.f10470s = i7;
        c0704b.f10469r = true;
        return i7;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Drawable drawable = this.f10494s;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        C0704b c0704b = this.f10492q;
        boolean z7 = false;
        Rect rect2 = null;
        if (!c0704b.f10461i) {
            Rect rect3 = c0704b.f10463k;
            if (rect3 == null && !c0704b.f10462j) {
                c0704b.c();
                Rect rect4 = new Rect();
                int i7 = c0704b.f10460h;
                Drawable[] drawableArr = c0704b.f10459g;
                for (int i8 = 0; i8 < i7; i8++) {
                    if (drawableArr[i8].getPadding(rect4)) {
                        if (rect2 == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        int i9 = rect4.left;
                        if (i9 > rect2.left) {
                            rect2.left = i9;
                        }
                        int i10 = rect4.top;
                        if (i10 > rect2.top) {
                            rect2.top = i10;
                        }
                        int i11 = rect4.right;
                        if (i11 > rect2.right) {
                            rect2.right = i11;
                        }
                        int i12 = rect4.bottom;
                        if (i12 > rect2.bottom) {
                            rect2.bottom = i12;
                        }
                    }
                }
                c0704b.f10462j = true;
                c0704b.f10463k = rect2;
            } else {
                rect2 = rect3;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            if ((rect2.left | rect2.top | rect2.bottom | rect2.right) != 0) {
                z7 = true;
            }
        } else {
            Drawable drawable = this.f10494s;
            if (drawable != null) {
                z7 = drawable.getPadding(rect);
            } else {
                z7 = super.getPadding(rect);
            }
        }
        if (this.f10492q.f10446A && E.b.a(this) == 1) {
            int i13 = rect.left;
            rect.left = rect.right;
            rect.right = i13;
        }
        return z7;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h(int r10) {
        /*
            r9 = this;
            int r0 = r9.f10498w
            r1 = 0
            if (r10 != r0) goto L6
            return r1
        L6:
            long r2 = android.os.SystemClock.uptimeMillis()
            g.b r0 = r9.f10492q
            int r0 = r0.f10477z
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L2e
            android.graphics.drawable.Drawable r0 = r9.f10495t
            if (r0 == 0) goto L1a
            r0.setVisible(r1, r1)
        L1a:
            android.graphics.drawable.Drawable r0 = r9.f10494s
            if (r0 == 0) goto L29
            r9.f10495t = r0
            g.b r0 = r9.f10492q
            int r0 = r0.f10477z
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f10484A = r0
            goto L35
        L29:
            r9.f10495t = r4
            r9.f10484A = r5
            goto L35
        L2e:
            android.graphics.drawable.Drawable r0 = r9.f10494s
            if (r0 == 0) goto L35
            r0.setVisible(r1, r1)
        L35:
            if (r10 < 0) goto L55
            g.b r0 = r9.f10492q
            int r1 = r0.f10460h
            if (r10 >= r1) goto L55
            android.graphics.drawable.Drawable r0 = r0.d(r10)
            r9.f10494s = r0
            r9.f10498w = r10
            if (r0 == 0) goto L5a
            g.b r10 = r9.f10492q
            int r10 = r10.f10476y
            if (r10 <= 0) goto L51
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f10501z = r2
        L51:
            r9.d(r0)
            goto L5a
        L55:
            r9.f10494s = r4
            r10 = -1
            r9.f10498w = r10
        L5a:
            long r0 = r9.f10501z
            int r10 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            r0 = 1
            if (r10 != 0) goto L67
            long r1 = r9.f10484A
            int r10 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r10 == 0) goto L7b
        L67:
            P.b r10 = r9.f10500y
            if (r10 != 0) goto L75
            P.b r10 = new P.b
            r1 = 11
            r10.<init>(r1, r9)
            r9.f10500y = r10
            goto L78
        L75:
            r9.unscheduleSelf(r10)
        L78:
            r9.a(r0)
        L7b:
            r9.invalidateSelf()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g.C0707e.h(int):boolean");
    }

    public final void i(C0704b c0704b) {
        this.f10492q = c0704b;
        int i7 = this.f10498w;
        if (i7 >= 0) {
            Drawable d = c0704b.d(i7);
            this.f10494s = d;
            if (d != null) {
                d(d);
            }
        }
        this.f10495t = null;
        this.f10486C = c0704b;
        this.f10488E = c0704b;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        C0704b c0704b = this.f10492q;
        if (c0704b != null) {
            c0704b.f10469r = false;
            c0704b.f10471t = false;
        }
        if (drawable == this.f10494s && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.f10492q.f10446A;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    public final boolean j(boolean z7, boolean z8) {
        boolean visible = super.setVisible(z7, z8);
        Drawable drawable = this.f10495t;
        if (drawable != null) {
            drawable.setVisible(z7, z8);
        }
        Drawable drawable2 = this.f10494s;
        if (drawable2 != null) {
            drawable2.setVisible(z7, z8);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        e();
        l lVar = this.F;
        if (lVar != null) {
            lVar.P();
            this.F = null;
            h(this.f10489G);
            this.f10489G = -1;
            this.f10490H = -1;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.f10491I) {
            g();
            C0704b c0704b = this.f10488E;
            c0704b.f10453I = c0704b.f10453I.clone();
            c0704b.f10454J = c0704b.f10454J.clone();
            this.f10491I = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f10495t;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f10494s;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i7) {
        C0704b c0704b = this.f10492q;
        int i8 = this.f10498w;
        int i9 = c0704b.f10460h;
        Drawable[] drawableArr = c0704b.f10459g;
        boolean z7 = false;
        for (int i10 = 0; i10 < i9; i10++) {
            Drawable drawable = drawableArr[i10];
            if (drawable != null) {
                boolean b7 = E.b.b(drawable, i7);
                if (i10 == i8) {
                    z7 = b7;
                }
            }
        }
        c0704b.f10475x = i7;
        return z7;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i7) {
        Drawable drawable = this.f10495t;
        if (drawable != null) {
            return drawable.setLevel(i7);
        }
        Drawable drawable2 = this.f10494s;
        if (drawable2 != null) {
            return drawable2.setLevel(i7);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d1, code lost:
        if (h(r1) != false) goto L16;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onStateChange(int[] r15) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g.C0707e.onStateChange(int[]):boolean");
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j7) {
        if (drawable == this.f10494s && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j7);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        if (!this.f10497v || this.f10496u != i7) {
            this.f10497v = true;
            this.f10496u = i7;
            Drawable drawable = this.f10494s;
            if (drawable != null) {
                if (this.f10501z == 0) {
                    drawable.setAlpha(i7);
                } else {
                    a(false);
                }
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z7) {
        C0704b c0704b = this.f10492q;
        if (c0704b.f10446A != z7) {
            c0704b.f10446A = z7;
            Drawable drawable = this.f10494s;
            if (drawable != null) {
                drawable.setAutoMirrored(z7);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        C0704b c0704b = this.f10492q;
        c0704b.f10448C = true;
        if (c0704b.f10447B != colorFilter) {
            c0704b.f10447B = colorFilter;
            Drawable drawable = this.f10494s;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z7) {
        C0704b c0704b = this.f10492q;
        if (c0704b.f10474w != z7) {
            c0704b.f10474w = z7;
            Drawable drawable = this.f10494s;
            if (drawable != null) {
                drawable.setDither(z7);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f7) {
        Drawable drawable = this.f10494s;
        if (drawable != null) {
            E.a.e(drawable, f, f7);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i7, int i8, int i9, int i10) {
        Rect rect = this.f10493r;
        if (rect == null) {
            this.f10493r = new Rect(i7, i8, i9, i10);
        } else {
            rect.set(i7, i8, i9, i10);
        }
        Drawable drawable = this.f10494s;
        if (drawable != null) {
            E.a.f(drawable, i7, i8, i9, i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i7) {
        setTintList(ColorStateList.valueOf(i7));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        C0704b c0704b = this.f10492q;
        c0704b.F = true;
        if (c0704b.f10449D != colorStateList) {
            c0704b.f10449D = colorStateList;
            l.J(this.f10494s, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        C0704b c0704b = this.f10492q;
        c0704b.f10451G = true;
        if (c0704b.f10450E != mode) {
            c0704b.f10450E = mode;
            l.K(this.f10494s, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z7, boolean z8) {
        boolean j7 = j(z7, z8);
        l lVar = this.F;
        if (lVar != null && (j7 || z8)) {
            if (z7) {
                lVar.O();
            } else {
                jumpToCurrentState();
            }
        }
        return j7;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.f10494s && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }
}
