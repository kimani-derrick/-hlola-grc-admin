package J3;

import a.AbstractC0189a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import java.util.BitSet;
import java.util.Objects;
/* loaded from: classes.dex */
public class g extends Drawable implements v {

    /* renamed from: M  reason: collision with root package name */
    public static final Paint f1350M = new Paint(1);

    /* renamed from: A  reason: collision with root package name */
    public final Region f1351A;

    /* renamed from: B  reason: collision with root package name */
    public final Region f1352B;

    /* renamed from: C  reason: collision with root package name */
    public k f1353C;

    /* renamed from: D  reason: collision with root package name */
    public final Paint f1354D;

    /* renamed from: E  reason: collision with root package name */
    public final Paint f1355E;
    public final I3.a F;

    /* renamed from: G  reason: collision with root package name */
    public final T4.c f1356G;

    /* renamed from: H  reason: collision with root package name */
    public final m f1357H;

    /* renamed from: I  reason: collision with root package name */
    public PorterDuffColorFilter f1358I;

    /* renamed from: J  reason: collision with root package name */
    public PorterDuffColorFilter f1359J;

    /* renamed from: K  reason: collision with root package name */
    public final RectF f1360K;

    /* renamed from: L  reason: collision with root package name */
    public final boolean f1361L;

    /* renamed from: q  reason: collision with root package name */
    public f f1362q;

    /* renamed from: r  reason: collision with root package name */
    public final t[] f1363r;

    /* renamed from: s  reason: collision with root package name */
    public final t[] f1364s;

    /* renamed from: t  reason: collision with root package name */
    public final BitSet f1365t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f1366u;

    /* renamed from: v  reason: collision with root package name */
    public final Matrix f1367v;

    /* renamed from: w  reason: collision with root package name */
    public final Path f1368w;

    /* renamed from: x  reason: collision with root package name */
    public final Path f1369x;

    /* renamed from: y  reason: collision with root package name */
    public final RectF f1370y;

    /* renamed from: z  reason: collision with root package name */
    public final RectF f1371z;

    public g() {
        this(new k());
    }

    public final void a(RectF rectF, Path path) {
        f fVar = this.f1362q;
        this.f1357H.b(fVar.f1332a, fVar.f1339j, rectF, this.f1356G, path);
        if (this.f1362q.f1338i != 1.0f) {
            Matrix matrix = this.f1367v;
            matrix.reset();
            float f = this.f1362q.f1338i;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f1360K, true);
    }

    public final PorterDuffColorFilter b(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z7) {
        PorterDuffColorFilter porterDuffColorFilter;
        int color;
        int c5;
        if (colorStateList != null && mode != null) {
            int colorForState = colorStateList.getColorForState(getState(), 0);
            if (z7) {
                colorForState = c(colorForState);
            }
            return new PorterDuffColorFilter(colorForState, mode);
        }
        if (z7 && (c5 = c((color = paint.getColor()))) != color) {
            porterDuffColorFilter = new PorterDuffColorFilter(c5, PorterDuff.Mode.SRC_IN);
        } else {
            porterDuffColorFilter = null;
        }
        return porterDuffColorFilter;
    }

    public final int c(int i7) {
        f fVar = this.f1362q;
        float f = fVar.n + fVar.f1343o + fVar.f1342m;
        E3.a aVar = fVar.f1333b;
        if (aVar != null && aVar.f609a && D.a.d(i7, 255) == aVar.f611c) {
            float f7 = aVar.d;
            float f8 = 0.0f;
            if (f7 > 0.0f && f > 0.0f) {
                f8 = Math.min(((((float) Math.log1p(f / f7)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
            }
            return D.a.d(AbstractC0189a.y(f8, D.a.d(i7, 255), aVar.f610b), Color.alpha(i7));
        }
        return i7;
    }

    public final void d(Canvas canvas) {
        if (this.f1365t.cardinality() > 0) {
            Log.w("g", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i7 = this.f1362q.f1346r;
        Path path = this.f1368w;
        I3.a aVar = this.F;
        if (i7 != 0) {
            canvas.drawPath(path, aVar.f1247a);
        }
        for (int i8 = 0; i8 < 4; i8++) {
            t tVar = this.f1363r[i8];
            int i9 = this.f1362q.f1345q;
            Matrix matrix = t.f1417a;
            tVar.a(matrix, aVar, i9, canvas);
            this.f1364s[i8].a(matrix, aVar, this.f1362q.f1345q, canvas);
        }
        if (this.f1361L) {
            f fVar = this.f1362q;
            int sin = (int) (Math.sin(Math.toRadians(fVar.f1347s)) * fVar.f1346r);
            f fVar2 = this.f1362q;
            int cos = (int) (Math.cos(Math.toRadians(fVar2.f1347s)) * fVar2.f1346r);
            canvas.translate(-sin, -cos);
            canvas.drawPath(path, f1350M);
            canvas.translate(sin, cos);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f8, code lost:
        if (r1 < 29) goto L36;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void draw(android.graphics.Canvas r21) {
        /*
            Method dump skipped, instructions count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: J3.g.draw(android.graphics.Canvas):void");
    }

    public final void e(Canvas canvas, Paint paint, Path path, k kVar, RectF rectF) {
        if (kVar.d(rectF)) {
            float a7 = kVar.f.a(rectF) * this.f1362q.f1339j;
            canvas.drawRoundRect(rectF, a7, a7, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    public final RectF f() {
        RectF rectF = this.f1370y;
        rectF.set(getBounds());
        return rectF;
    }

    public final boolean g() {
        Paint.Style style = this.f1362q.f1349u;
        if ((style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f1355E.getStrokeWidth() > 0.0f) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f1362q;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        f fVar = this.f1362q;
        if (fVar.f1344p == 2) {
            return;
        }
        if (fVar.f1332a.d(f())) {
            outline.setRoundRect(getBounds(), this.f1362q.f1332a.f1386e.a(f()) * this.f1362q.f1339j);
            return;
        }
        RectF f = f();
        Path path = this.f1368w;
        a(f, path);
        if (path.isConvex() || Build.VERSION.SDK_INT >= 29) {
            try {
                outline.setConvexPath(path);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f1362q.f1337h;
        if (rect2 != null) {
            rect.set(rect2);
            return true;
        }
        return super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f1351A;
        region.set(bounds);
        RectF f = f();
        Path path = this.f1368w;
        a(f, path);
        Region region2 = this.f1352B;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final void h(Context context) {
        this.f1362q.f1333b = new E3.a(context);
        m();
    }

    public final void i(float f) {
        f fVar = this.f1362q;
        if (fVar.n != f) {
            fVar.n = f;
            m();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f1366u = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        if (!super.isStateful() && (((colorStateList = this.f1362q.f) == null || !colorStateList.isStateful()) && (((colorStateList2 = this.f1362q.f1335e) == null || !colorStateList2.isStateful()) && (((colorStateList3 = this.f1362q.d) == null || !colorStateList3.isStateful()) && ((colorStateList4 = this.f1362q.f1334c) == null || !colorStateList4.isStateful()))))) {
            return false;
        }
        return true;
    }

    public final void j(ColorStateList colorStateList) {
        f fVar = this.f1362q;
        if (fVar.f1334c != colorStateList) {
            fVar.f1334c = colorStateList;
            onStateChange(getState());
        }
    }

    public final boolean k(int[] iArr) {
        boolean z7;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f1362q.f1334c != null && color2 != (colorForState2 = this.f1362q.f1334c.getColorForState(iArr, (color2 = (paint2 = this.f1354D).getColor())))) {
            paint2.setColor(colorForState2);
            z7 = true;
        } else {
            z7 = false;
        }
        if (this.f1362q.d != null && color != (colorForState = this.f1362q.d.getColorForState(iArr, (color = (paint = this.f1355E).getColor())))) {
            paint.setColor(colorForState);
            return true;
        }
        return z7;
    }

    public final boolean l() {
        PorterDuffColorFilter porterDuffColorFilter = this.f1358I;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f1359J;
        f fVar = this.f1362q;
        this.f1358I = b(fVar.f, fVar.f1336g, this.f1354D, true);
        f fVar2 = this.f1362q;
        this.f1359J = b(fVar2.f1335e, fVar2.f1336g, this.f1355E, false);
        f fVar3 = this.f1362q;
        if (fVar3.f1348t) {
            int colorForState = fVar3.f.getColorForState(getState(), 0);
            I3.a aVar = this.F;
            aVar.getClass();
            aVar.d = D.a.d(colorForState, 68);
            aVar.f1250e = D.a.d(colorForState, 20);
            aVar.f = D.a.d(colorForState, 0);
            aVar.f1247a.setColor(aVar.d);
        }
        if (!Objects.equals(porterDuffColorFilter, this.f1358I) || !Objects.equals(porterDuffColorFilter2, this.f1359J)) {
            return true;
        }
        return false;
    }

    public final void m() {
        f fVar = this.f1362q;
        float f = fVar.n + fVar.f1343o;
        fVar.f1345q = (int) Math.ceil(0.75f * f);
        this.f1362q.f1346r = (int) Math.ceil(f * 0.25f);
        l();
        super.invalidateSelf();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.graphics.drawable.Drawable$ConstantState, J3.f] */
    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        f fVar = this.f1362q;
        ?? constantState = new Drawable.ConstantState();
        constantState.f1334c = null;
        constantState.d = null;
        constantState.f1335e = null;
        constantState.f = null;
        constantState.f1336g = PorterDuff.Mode.SRC_IN;
        constantState.f1337h = null;
        constantState.f1338i = 1.0f;
        constantState.f1339j = 1.0f;
        constantState.f1341l = 255;
        constantState.f1342m = 0.0f;
        constantState.n = 0.0f;
        constantState.f1343o = 0.0f;
        constantState.f1344p = 0;
        constantState.f1345q = 0;
        constantState.f1346r = 0;
        constantState.f1347s = 0;
        constantState.f1348t = false;
        constantState.f1349u = Paint.Style.FILL_AND_STROKE;
        constantState.f1332a = fVar.f1332a;
        constantState.f1333b = fVar.f1333b;
        constantState.f1340k = fVar.f1340k;
        constantState.f1334c = fVar.f1334c;
        constantState.d = fVar.d;
        constantState.f1336g = fVar.f1336g;
        constantState.f = fVar.f;
        constantState.f1341l = fVar.f1341l;
        constantState.f1338i = fVar.f1338i;
        constantState.f1346r = fVar.f1346r;
        constantState.f1344p = fVar.f1344p;
        constantState.f1348t = fVar.f1348t;
        constantState.f1339j = fVar.f1339j;
        constantState.f1342m = fVar.f1342m;
        constantState.n = fVar.n;
        constantState.f1343o = fVar.f1343o;
        constantState.f1345q = fVar.f1345q;
        constantState.f1347s = fVar.f1347s;
        constantState.f1335e = fVar.f1335e;
        constantState.f1349u = fVar.f1349u;
        if (fVar.f1337h != null) {
            constantState.f1337h = new Rect(fVar.f1337h);
        }
        this.f1362q = constantState;
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f1366u = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z7;
        boolean k5 = k(iArr);
        boolean l7 = l();
        if (!k5 && !l7) {
            z7 = false;
        } else {
            z7 = true;
        }
        if (z7) {
            invalidateSelf();
        }
        return z7;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i7) {
        f fVar = this.f1362q;
        if (fVar.f1341l != i7) {
            fVar.f1341l = i7;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f1362q.getClass();
        super.invalidateSelf();
    }

    @Override // J3.v
    public final void setShapeAppearanceModel(k kVar) {
        this.f1362q.f1332a = kVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i7) {
        setTintList(ColorStateList.valueOf(i7));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f1362q.f = colorStateList;
        l();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        f fVar = this.f1362q;
        if (fVar.f1336g != mode) {
            fVar.f1336g = mode;
            l();
            super.invalidateSelf();
        }
    }

    public g(f fVar) {
        m mVar;
        this.f1363r = new t[4];
        this.f1364s = new t[4];
        this.f1365t = new BitSet(8);
        this.f1367v = new Matrix();
        this.f1368w = new Path();
        this.f1369x = new Path();
        this.f1370y = new RectF();
        this.f1371z = new RectF();
        this.f1351A = new Region();
        this.f1352B = new Region();
        Paint paint = new Paint(1);
        this.f1354D = paint;
        Paint paint2 = new Paint(1);
        this.f1355E = paint2;
        this.F = new I3.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            mVar = l.f1393a;
        } else {
            mVar = new m();
        }
        this.f1357H = mVar;
        this.f1360K = new RectF();
        this.f1361L = true;
        this.f1362q = fVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        Paint paint3 = f1350M;
        paint3.setColor(-1);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        l();
        k(getState());
        this.f1356G = new T4.c(9, this);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.graphics.drawable.Drawable$ConstantState, J3.f] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public g(J3.k r4) {
        /*
            r3 = this;
            J3.f r0 = new J3.f
            r0.<init>()
            r1 = 0
            r0.f1334c = r1
            r0.d = r1
            r0.f1335e = r1
            r0.f = r1
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            r0.f1336g = r2
            r0.f1337h = r1
            r2 = 1065353216(0x3f800000, float:1.0)
            r0.f1338i = r2
            r0.f1339j = r2
            r2 = 255(0xff, float:3.57E-43)
            r0.f1341l = r2
            r2 = 0
            r0.f1342m = r2
            r0.n = r2
            r0.f1343o = r2
            r2 = 0
            r0.f1344p = r2
            r0.f1345q = r2
            r0.f1346r = r2
            r0.f1347s = r2
            r0.f1348t = r2
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.FILL_AND_STROKE
            r0.f1349u = r2
            r0.f1332a = r4
            r0.f1333b = r1
            r3.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: J3.g.<init>(J3.k):void");
    }

    public g(Context context, AttributeSet attributeSet, int i7, int i8) {
        this(k.b(context, attributeSet, i7, i8).a());
    }
}
