package T;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.OverScroller;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: v  reason: collision with root package name */
    public static final d f3181v = new d(0);

    /* renamed from: a  reason: collision with root package name */
    public int f3182a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3183b;
    public float[] d;

    /* renamed from: e  reason: collision with root package name */
    public float[] f3185e;
    public float[] f;

    /* renamed from: g  reason: collision with root package name */
    public float[] f3186g;

    /* renamed from: h  reason: collision with root package name */
    public int[] f3187h;

    /* renamed from: i  reason: collision with root package name */
    public int[] f3188i;

    /* renamed from: j  reason: collision with root package name */
    public int[] f3189j;

    /* renamed from: k  reason: collision with root package name */
    public int f3190k;

    /* renamed from: l  reason: collision with root package name */
    public VelocityTracker f3191l;

    /* renamed from: m  reason: collision with root package name */
    public final float f3192m;
    public final float n;

    /* renamed from: o  reason: collision with root package name */
    public final int f3193o;

    /* renamed from: p  reason: collision with root package name */
    public final OverScroller f3194p;

    /* renamed from: q  reason: collision with root package name */
    public final android.support.v4.media.session.b f3195q;

    /* renamed from: r  reason: collision with root package name */
    public View f3196r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f3197s;

    /* renamed from: t  reason: collision with root package name */
    public final ViewGroup f3198t;

    /* renamed from: c  reason: collision with root package name */
    public int f3184c = -1;

    /* renamed from: u  reason: collision with root package name */
    public final P.b f3199u = new P.b(1, this);

    public e(Context context, ViewGroup viewGroup, android.support.v4.media.session.b bVar) {
        if (viewGroup != null) {
            if (bVar != null) {
                this.f3198t = viewGroup;
                this.f3195q = bVar;
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                this.f3193o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
                this.f3183b = viewConfiguration.getScaledTouchSlop();
                this.f3192m = viewConfiguration.getScaledMaximumFlingVelocity();
                this.n = viewConfiguration.getScaledMinimumFlingVelocity();
                this.f3194p = new OverScroller(context, f3181v);
                return;
            }
            throw new IllegalArgumentException("Callback may not be null");
        }
        throw new IllegalArgumentException("Parent view may not be null");
    }

    public final void a() {
        this.f3184c = -1;
        float[] fArr = this.d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f3185e, 0.0f);
            Arrays.fill(this.f, 0.0f);
            Arrays.fill(this.f3186g, 0.0f);
            Arrays.fill(this.f3187h, 0);
            Arrays.fill(this.f3188i, 0);
            Arrays.fill(this.f3189j, 0);
            this.f3190k = 0;
        }
        VelocityTracker velocityTracker = this.f3191l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f3191l = null;
        }
    }

    public final void b(View view, int i7) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = this.f3198t;
        if (parent == viewGroup) {
            this.f3196r = view;
            this.f3184c = i7;
            this.f3195q.t0(view, i7);
            n(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + viewGroup + ")");
    }

    public final boolean c(View view, float f, float f7) {
        boolean z7;
        boolean z8;
        if (view == null) {
            return false;
        }
        android.support.v4.media.session.b bVar = this.f3195q;
        if (bVar.m0(view) > 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (bVar.n0() > 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z7 && z8) {
            float f8 = f7 * f7;
            int i7 = this.f3183b;
            if (f8 + (f * f) <= i7 * i7) {
                return false;
            }
            return true;
        } else if (z7) {
            if (Math.abs(f) <= this.f3183b) {
                return false;
            }
            return true;
        } else if (!z8 || Math.abs(f7) <= this.f3183b) {
            return false;
        } else {
            return true;
        }
    }

    public final void d(int i7) {
        float[] fArr = this.d;
        if (fArr != null) {
            int i8 = this.f3190k;
            int i9 = 1 << i7;
            if ((i8 & i9) != 0) {
                fArr[i7] = 0.0f;
                this.f3185e[i7] = 0.0f;
                this.f[i7] = 0.0f;
                this.f3186g[i7] = 0.0f;
                this.f3187h[i7] = 0;
                this.f3188i[i7] = 0;
                this.f3189j[i7] = 0;
                this.f3190k = (~i9) & i8;
            }
        }
    }

    public final int e(int i7, int i8, int i9) {
        int width;
        int abs;
        if (i7 == 0) {
            return 0;
        }
        float width2 = this.f3198t.getWidth() / 2;
        float sin = (((float) Math.sin((Math.min(1.0f, Math.abs(i7) / width) - 0.5f) * 0.47123894f)) * width2) + width2;
        int abs2 = Math.abs(i8);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(sin / abs2) * 1000.0f) * 4;
        } else {
            abs = (int) (((Math.abs(i7) / i9) + 1.0f) * 256.0f);
        }
        return Math.min(abs, 600);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
        if (r2 == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f() {
        /*
            r9 = this;
            int r0 = r9.f3182a
            r1 = 2
            if (r0 != r1) goto L5b
            android.widget.OverScroller r0 = r9.f3194p
            boolean r2 = r0.computeScrollOffset()
            int r3 = r0.getCurrX()
            int r4 = r0.getCurrY()
            android.view.View r5 = r9.f3196r
            int r5 = r5.getLeft()
            int r5 = r3 - r5
            android.view.View r6 = r9.f3196r
            int r6 = r6.getTop()
            int r6 = r4 - r6
            if (r5 == 0) goto L2c
            android.view.View r7 = r9.f3196r
            java.lang.reflect.Field r8 = K.O.f1447a
            r7.offsetLeftAndRight(r5)
        L2c:
            if (r6 == 0) goto L35
            android.view.View r7 = r9.f3196r
            java.lang.reflect.Field r8 = K.O.f1447a
            r7.offsetTopAndBottom(r6)
        L35:
            if (r5 != 0) goto L39
            if (r6 == 0) goto L40
        L39:
            android.support.v4.media.session.b r5 = r9.f3195q
            android.view.View r6 = r9.f3196r
            r5.v0(r6, r3, r4)
        L40:
            if (r2 == 0) goto L52
            int r5 = r0.getFinalX()
            if (r3 != r5) goto L52
            int r3 = r0.getFinalY()
            if (r4 != r3) goto L52
            r0.abortAnimation()
            goto L54
        L52:
            if (r2 != 0) goto L5b
        L54:
            P.b r0 = r9.f3199u
            android.view.ViewGroup r2 = r9.f3198t
            r2.post(r0)
        L5b:
            int r0 = r9.f3182a
            if (r0 != r1) goto L61
            r0 = 1
            goto L62
        L61:
            r0 = 0
        L62:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: T.e.f():boolean");
    }

    public final View g(int i7, int i8) {
        ViewGroup viewGroup = this.f3198t;
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f3195q.getClass();
            View childAt = viewGroup.getChildAt(childCount);
            if (i7 >= childAt.getLeft() && i7 < childAt.getRight() && i8 >= childAt.getTop() && i8 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h(int r11, int r12, int r13, int r14) {
        /*
            r10 = this;
            android.view.View r0 = r10.f3196r
            int r2 = r0.getLeft()
            android.view.View r0 = r10.f3196r
            int r3 = r0.getTop()
            int r4 = r11 - r2
            int r5 = r12 - r3
            android.widget.OverScroller r1 = r10.f3194p
            r11 = 0
            if (r4 != 0) goto L1e
            if (r5 != 0) goto L1e
            r1.abortAnimation()
            r10.n(r11)
            return r11
        L1e:
            android.view.View r12 = r10.f3196r
            float r0 = r10.n
            int r0 = (int) r0
            float r6 = r10.f3192m
            int r6 = (int) r6
            int r7 = java.lang.Math.abs(r13)
            if (r7 >= r0) goto L2e
            r13 = r11
            goto L35
        L2e:
            if (r7 <= r6) goto L35
            if (r13 <= 0) goto L34
            r13 = r6
            goto L35
        L34:
            int r13 = -r6
        L35:
            int r7 = java.lang.Math.abs(r14)
            if (r7 >= r0) goto L3d
        L3b:
            r14 = r11
            goto L45
        L3d:
            if (r7 <= r6) goto L45
            if (r14 <= 0) goto L43
            r14 = r6
            goto L45
        L43:
            int r11 = -r6
            goto L3b
        L45:
            int r11 = java.lang.Math.abs(r4)
            int r0 = java.lang.Math.abs(r5)
            int r6 = java.lang.Math.abs(r13)
            int r7 = java.lang.Math.abs(r14)
            int r8 = r6 + r7
            int r9 = r11 + r0
            if (r13 == 0) goto L5f
            float r11 = (float) r6
            float r6 = (float) r8
        L5d:
            float r11 = r11 / r6
            goto L62
        L5f:
            float r11 = (float) r11
            float r6 = (float) r9
            goto L5d
        L62:
            if (r14 == 0) goto L68
            float r0 = (float) r7
            float r6 = (float) r8
        L66:
            float r0 = r0 / r6
            goto L6b
        L68:
            float r0 = (float) r0
            float r6 = (float) r9
            goto L66
        L6b:
            android.support.v4.media.session.b r6 = r10.f3195q
            int r12 = r6.m0(r12)
            int r12 = r10.e(r4, r13, r12)
            int r13 = r6.n0()
            int r13 = r10.e(r5, r14, r13)
            float r12 = (float) r12
            float r12 = r12 * r11
            float r11 = (float) r13
            float r11 = r11 * r0
            float r11 = r11 + r12
            int r6 = (int) r11
            r1.startScroll(r2, r3, r4, r5, r6)
            r11 = 2
            r10.n(r11)
            r11 = 1
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: T.e.h(int, int, int, int):boolean");
    }

    public final boolean i(int i7) {
        if ((this.f3190k & (1 << i7)) != 0) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i7 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0068, code lost:
        if (r9.f3184c == (-1)) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006d, code lost:
        k();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instructions count: 471
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: T.e.j(android.view.MotionEvent):void");
    }

    public final void k() {
        VelocityTracker velocityTracker = this.f3191l;
        float f = this.f3192m;
        velocityTracker.computeCurrentVelocity(1000, f);
        float xVelocity = this.f3191l.getXVelocity(this.f3184c);
        float f7 = this.n;
        float abs = Math.abs(xVelocity);
        float f8 = 0.0f;
        if (abs < f7) {
            xVelocity = 0.0f;
        } else if (abs > f) {
            if (xVelocity > 0.0f) {
                xVelocity = f;
            } else {
                xVelocity = -f;
            }
        }
        float yVelocity = this.f3191l.getYVelocity(this.f3184c);
        float abs2 = Math.abs(yVelocity);
        if (abs2 >= f7) {
            if (abs2 > f) {
                if (yVelocity <= 0.0f) {
                    f = -f;
                }
                f8 = f;
            } else {
                f8 = yVelocity;
            }
        }
        this.f3197s = true;
        this.f3195q.w0(this.f3196r, xVelocity, f8);
        this.f3197s = false;
        if (this.f3182a == 1) {
            n(0);
        }
    }

    public final void l(float f, float f7, int i7) {
        float[] fArr = this.d;
        int i8 = 0;
        if (fArr == null || fArr.length <= i7) {
            int i9 = i7 + 1;
            float[] fArr2 = new float[i9];
            float[] fArr3 = new float[i9];
            float[] fArr4 = new float[i9];
            float[] fArr5 = new float[i9];
            int[] iArr = new int[i9];
            int[] iArr2 = new int[i9];
            int[] iArr3 = new int[i9];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f3185e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f3186g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f3187h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f3188i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f3189j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.d = fArr2;
            this.f3185e = fArr3;
            this.f = fArr4;
            this.f3186g = fArr5;
            this.f3187h = iArr;
            this.f3188i = iArr2;
            this.f3189j = iArr3;
        }
        float[] fArr9 = this.d;
        this.f[i7] = f;
        fArr9[i7] = f;
        float[] fArr10 = this.f3185e;
        this.f3186g[i7] = f7;
        fArr10[i7] = f7;
        int[] iArr7 = this.f3187h;
        int i10 = (int) f;
        int i11 = (int) f7;
        ViewGroup viewGroup = this.f3198t;
        int left = viewGroup.getLeft();
        int i12 = this.f3193o;
        if (i10 < left + i12) {
            i8 = 1;
        }
        if (i11 < viewGroup.getTop() + i12) {
            i8 |= 4;
        }
        if (i10 > viewGroup.getRight() - i12) {
            i8 |= 2;
        }
        if (i11 > viewGroup.getBottom() - i12) {
            i8 |= 8;
        }
        iArr7[i7] = i8;
        this.f3190k |= 1 << i7;
    }

    public final void m(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i7 = 0; i7 < pointerCount; i7++) {
            int pointerId = motionEvent.getPointerId(i7);
            if (i(pointerId)) {
                float x7 = motionEvent.getX(i7);
                float y3 = motionEvent.getY(i7);
                this.f[pointerId] = x7;
                this.f3186g[pointerId] = y3;
            }
        }
    }

    public final void n(int i7) {
        this.f3198t.removeCallbacks(this.f3199u);
        if (this.f3182a != i7) {
            this.f3182a = i7;
            this.f3195q.u0(i7);
            if (this.f3182a == 0) {
                this.f3196r = null;
            }
        }
    }

    public final boolean o(int i7, int i8) {
        if (this.f3197s) {
            return h(i7, i8, (int) this.f3191l.getXVelocity(this.f3184c), (int) this.f3191l.getYVelocity(this.f3184c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00cd, code lost:
        if (r12 != r11) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean p(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: T.e.p(android.view.MotionEvent):boolean");
    }

    public final boolean q(View view, int i7) {
        if (view == this.f3196r && this.f3184c == i7) {
            return true;
        }
        if (view != null && this.f3195q.E0(view, i7)) {
            this.f3184c = i7;
            b(view, i7);
            return true;
        }
        return false;
    }
}
