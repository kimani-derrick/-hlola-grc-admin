package P;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
/* loaded from: classes.dex */
public final class h implements View.OnTouchListener {

    /* renamed from: H  reason: collision with root package name */
    public static final int f2740H = ViewConfiguration.getTapTimeout();

    /* renamed from: A  reason: collision with root package name */
    public final float[] f2741A;

    /* renamed from: B  reason: collision with root package name */
    public boolean f2742B;

    /* renamed from: C  reason: collision with root package name */
    public boolean f2743C;

    /* renamed from: D  reason: collision with root package name */
    public boolean f2744D;

    /* renamed from: E  reason: collision with root package name */
    public boolean f2745E;
    public boolean F;

    /* renamed from: G  reason: collision with root package name */
    public final ListView f2746G;

    /* renamed from: q  reason: collision with root package name */
    public final a f2747q;

    /* renamed from: r  reason: collision with root package name */
    public final AccelerateInterpolator f2748r;

    /* renamed from: s  reason: collision with root package name */
    public final View f2749s;

    /* renamed from: t  reason: collision with root package name */
    public b f2750t;

    /* renamed from: u  reason: collision with root package name */
    public final float[] f2751u;

    /* renamed from: v  reason: collision with root package name */
    public final float[] f2752v;

    /* renamed from: w  reason: collision with root package name */
    public final int f2753w;

    /* renamed from: x  reason: collision with root package name */
    public final int f2754x;

    /* renamed from: y  reason: collision with root package name */
    public final float[] f2755y;

    /* renamed from: z  reason: collision with root package name */
    public final float[] f2756z;

    /* JADX WARN: Type inference failed for: r1v0, types: [P.a, java.lang.Object] */
    public h(ListView listView) {
        ?? obj = new Object();
        obj.f2734e = Long.MIN_VALUE;
        obj.f2735g = -1L;
        obj.f = 0L;
        this.f2747q = obj;
        this.f2748r = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f2751u = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f2752v = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f2755y = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f2756z = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f2741A = fArr5;
        this.f2749s = listView;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f7 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr5[0] = f7;
        fArr5[1] = f7;
        float f8 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f8;
        fArr4[1] = f8;
        this.f2753w = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f2754x = f2740H;
        obj.f2731a = 500;
        obj.f2732b = 500;
        this.f2746G = listView;
    }

    public static float b(float f, float f7, float f8) {
        if (f > f8) {
            return f8;
        }
        if (f < f7) {
            return f7;
        }
        return f;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float a(float r4, float r5, float r6, int r7) {
        /*
            r3 = this;
            float[] r0 = r3.f2751u
            r0 = r0[r7]
            float[] r1 = r3.f2752v
            r1 = r1[r7]
            float r0 = r0 * r5
            r2 = 0
            float r0 = b(r0, r2, r1)
            float r1 = r3.c(r4, r0)
            float r5 = r5 - r4
            float r4 = r3.c(r5, r0)
            float r4 = r4 - r1
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            android.view.animation.AccelerateInterpolator r0 = r3.f2748r
            if (r5 >= 0) goto L25
            float r4 = -r4
            float r4 = r0.getInterpolation(r4)
            float r4 = -r4
            goto L2d
        L25:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 <= 0) goto L36
            float r4 = r0.getInterpolation(r4)
        L2d:
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r4 = b(r4, r5, r0)
            goto L37
        L36:
            r4 = r2
        L37:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 != 0) goto L3c
            return r2
        L3c:
            float[] r0 = r3.f2755y
            r0 = r0[r7]
            float[] r1 = r3.f2756z
            r1 = r1[r7]
            float[] r2 = r3.f2741A
            r7 = r2[r7]
            float r0 = r0 * r6
            if (r5 <= 0) goto L51
            float r4 = r4 * r0
            float r4 = b(r4, r1, r7)
            return r4
        L51:
            float r4 = -r4
            float r4 = r4 * r0
            float r4 = b(r4, r1, r7)
            float r4 = -r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: P.h.a(float, float, float, int):float");
    }

    public final float c(float f, float f7) {
        if (f7 == 0.0f) {
            return 0.0f;
        }
        int i7 = this.f2753w;
        if (i7 != 0 && i7 != 1) {
            if (i7 == 2 && f < 0.0f) {
                return f / (-f7);
            }
        } else if (f < f7) {
            if (f >= 0.0f) {
                return 1.0f - (f / f7);
            }
            if (this.f2745E && i7 == 1) {
                return 1.0f;
            }
        }
        return 0.0f;
    }

    public final void d() {
        int i7 = 0;
        if (this.f2743C) {
            this.f2745E = false;
            return;
        }
        a aVar = this.f2747q;
        aVar.getClass();
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i8 = (int) (currentAnimationTimeMillis - aVar.f2734e);
        int i9 = aVar.f2732b;
        if (i8 > i9) {
            i7 = i9;
        } else if (i8 >= 0) {
            i7 = i8;
        }
        aVar.f2737i = i7;
        aVar.f2736h = aVar.a(currentAnimationTimeMillis);
        aVar.f2735g = currentAnimationTimeMillis;
    }

    public final boolean e() {
        ListView listView;
        int count;
        a aVar = this.f2747q;
        float f = aVar.d;
        int abs = (int) (f / Math.abs(f));
        Math.abs(aVar.f2733c);
        if (abs == 0 || (count = (listView = this.f2746G).getCount()) == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i7 = firstVisiblePosition + childCount;
        if (abs > 0) {
            if (i7 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else if (abs >= 0) {
            return false;
        } else {
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
        if (r0 != 3) goto L12;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            boolean r0 = r7.F
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r9.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r8 = 3
            if (r0 == r8) goto L16
            goto L7b
        L16:
            r7.d()
            goto L7b
        L1a:
            r7.f2744D = r2
            r7.f2742B = r1
        L1e:
            float r0 = r9.getX()
            int r3 = r8.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r7.f2749s
            int r5 = r4.getWidth()
            float r5 = (float) r5
            float r0 = r7.a(r0, r3, r5, r1)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r8 = r7.a(r9, r8, r3, r2)
            P.a r9 = r7.f2747q
            r9.f2733c = r0
            r9.d = r8
            boolean r8 = r7.f2745E
            if (r8 != 0) goto L7b
            boolean r8 = r7.e()
            if (r8 == 0) goto L7b
            P.b r8 = r7.f2750t
            if (r8 != 0) goto L5f
            P.b r8 = new P.b
            r8.<init>(r1, r7)
            r7.f2750t = r8
        L5f:
            r7.f2745E = r2
            r7.f2743C = r2
            boolean r8 = r7.f2742B
            if (r8 != 0) goto L74
            int r8 = r7.f2754x
            if (r8 <= 0) goto L74
            P.b r9 = r7.f2750t
            long r5 = (long) r8
            java.lang.reflect.Field r8 = K.O.f1447a
            r4.postOnAnimationDelayed(r9, r5)
            goto L79
        L74:
            P.b r8 = r7.f2750t
            r8.run()
        L79:
            r7.f2742B = r2
        L7b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: P.h.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
