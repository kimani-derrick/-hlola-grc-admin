package com.google.android.exoplayer2.ui;

import E1.b;
import P1.c;
import X2.AbstractC0124f;
import X2.C0123e;
import X2.H;
import X2.View$OnClickListenerC0130l;
import X2.w;
import Z2.AbstractC0156a;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import e2.C0585B;
import e2.J0;
import e2.v0;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
@Deprecated
/* loaded from: classes.dex */
public class DefaultTimeBar extends View implements H {

    /* renamed from: i0  reason: collision with root package name */
    public static final /* synthetic */ int f8132i0 = 0;

    /* renamed from: A  reason: collision with root package name */
    public final Drawable f8133A;

    /* renamed from: B  reason: collision with root package name */
    public final int f8134B;

    /* renamed from: C  reason: collision with root package name */
    public final int f8135C;

    /* renamed from: D  reason: collision with root package name */
    public final int f8136D;

    /* renamed from: E  reason: collision with root package name */
    public final int f8137E;
    public final int F;

    /* renamed from: G  reason: collision with root package name */
    public final int f8138G;

    /* renamed from: H  reason: collision with root package name */
    public final int f8139H;

    /* renamed from: I  reason: collision with root package name */
    public final int f8140I;

    /* renamed from: J  reason: collision with root package name */
    public final int f8141J;

    /* renamed from: K  reason: collision with root package name */
    public final StringBuilder f8142K;

    /* renamed from: L  reason: collision with root package name */
    public final Formatter f8143L;

    /* renamed from: M  reason: collision with root package name */
    public final b f8144M;

    /* renamed from: N  reason: collision with root package name */
    public final CopyOnWriteArraySet f8145N;

    /* renamed from: O  reason: collision with root package name */
    public final Point f8146O;

    /* renamed from: P  reason: collision with root package name */
    public final float f8147P;

    /* renamed from: Q  reason: collision with root package name */
    public int f8148Q;

    /* renamed from: R  reason: collision with root package name */
    public long f8149R;

    /* renamed from: S  reason: collision with root package name */
    public int f8150S;

    /* renamed from: T  reason: collision with root package name */
    public Rect f8151T;

    /* renamed from: U  reason: collision with root package name */
    public final ValueAnimator f8152U;

    /* renamed from: V  reason: collision with root package name */
    public float f8153V;
    public boolean W;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f8154a0;

    /* renamed from: b0  reason: collision with root package name */
    public long f8155b0;

    /* renamed from: c0  reason: collision with root package name */
    public long f8156c0;

    /* renamed from: d0  reason: collision with root package name */
    public long f8157d0;

    /* renamed from: e0  reason: collision with root package name */
    public long f8158e0;

    /* renamed from: f0  reason: collision with root package name */
    public int f8159f0;

    /* renamed from: g0  reason: collision with root package name */
    public long[] f8160g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean[] f8161h0;

    /* renamed from: q  reason: collision with root package name */
    public final Rect f8162q;

    /* renamed from: r  reason: collision with root package name */
    public final Rect f8163r;

    /* renamed from: s  reason: collision with root package name */
    public final Rect f8164s;

    /* renamed from: t  reason: collision with root package name */
    public final Rect f8165t;

    /* renamed from: u  reason: collision with root package name */
    public final Paint f8166u;

    /* renamed from: v  reason: collision with root package name */
    public final Paint f8167v;

    /* renamed from: w  reason: collision with root package name */
    public final Paint f8168w;

    /* renamed from: x  reason: collision with root package name */
    public final Paint f8169x;

    /* renamed from: y  reason: collision with root package name */
    public final Paint f8170y;

    /* renamed from: z  reason: collision with root package name */
    public final Paint f8171z;

    public DefaultTimeBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, attributeSet, 0);
    }

    public static int a(int i7, float f) {
        return (int) ((i7 * f) + 0.5f);
    }

    private long getPositionIncrement() {
        long j7 = this.f8149R;
        if (j7 == -9223372036854775807L) {
            long j8 = this.f8156c0;
            if (j8 == -9223372036854775807L) {
                return 0L;
            }
            return j8 / this.f8148Q;
        }
        return j7;
    }

    private String getProgressText() {
        return Z2.H.z(this.f8142K, this.f8143L, this.f8157d0);
    }

    private long getScrubberPosition() {
        Rect rect = this.f8163r;
        if (rect.width() <= 0 || this.f8156c0 == -9223372036854775807L) {
            return 0L;
        }
        return (this.f8165t.width() * this.f8156c0) / rect.width();
    }

    public final boolean b(long j7) {
        long j8 = this.f8156c0;
        if (j8 <= 0) {
            return false;
        }
        long j9 = this.f8154a0 ? this.f8155b0 : this.f8157d0;
        long k5 = Z2.H.k(j9 + j7, 0L, j8);
        if (k5 == j9) {
            return false;
        }
        if (this.f8154a0) {
            f(k5);
        } else {
            c(k5);
        }
        e();
        return true;
    }

    public final void c(long j7) {
        this.f8155b0 = j7;
        this.f8154a0 = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator it = this.f8145N.iterator();
        while (it.hasNext()) {
            w wVar = ((View$OnClickListenerC0130l) it.next()).f4186q;
            wVar.f4214D0 = true;
            TextView textView = wVar.f4237T;
            if (textView != null) {
                textView.setText(Z2.H.z(wVar.f4239V, wVar.W, j7));
            }
            wVar.f4256q.g();
        }
    }

    public final void d(boolean z7) {
        v0 v0Var;
        removeCallbacks(this.f8144M);
        this.f8154a0 = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator it = this.f8145N.iterator();
        while (it.hasNext()) {
            long j7 = this.f8155b0;
            w wVar = ((View$OnClickListenerC0130l) it.next()).f4186q;
            wVar.f4214D0 = false;
            if (!z7 && (v0Var = wVar.f4271x0) != null) {
                if (wVar.f4212C0) {
                    c cVar = (c) v0Var;
                    if (cVar.n(17) && cVar.n(10)) {
                        J0 O5 = ((C0585B) cVar).O();
                        int p3 = O5.p();
                        int i7 = 0;
                        while (true) {
                            long S6 = Z2.H.S(O5.n(i7, wVar.f4241b0, 0L).f9579D);
                            if (j7 < S6) {
                                break;
                            } else if (i7 == p3 - 1) {
                                j7 = S6;
                                break;
                            } else {
                                j7 -= S6;
                                i7++;
                            }
                        }
                        cVar.w(i7, j7, false);
                    }
                } else {
                    c cVar2 = (c) v0Var;
                    if (cVar2.n(5)) {
                        cVar2.w(((C0585B) cVar2).K(), j7, false);
                    }
                }
                wVar.o();
            }
            wVar.f4256q.h();
        }
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f8133A;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    public final void e() {
        Rect rect = this.f8164s;
        Rect rect2 = this.f8163r;
        rect.set(rect2);
        Rect rect3 = this.f8165t;
        rect3.set(rect2);
        long j7 = this.f8154a0 ? this.f8155b0 : this.f8157d0;
        if (this.f8156c0 > 0) {
            rect.right = Math.min(rect2.left + ((int) ((rect2.width() * this.f8158e0) / this.f8156c0)), rect2.right);
            rect3.right = Math.min(rect2.left + ((int) ((rect2.width() * j7) / this.f8156c0)), rect2.right);
        } else {
            int i7 = rect2.left;
            rect.right = i7;
            rect3.right = i7;
        }
        invalidate(this.f8162q);
    }

    public final void f(long j7) {
        if (this.f8155b0 == j7) {
            return;
        }
        this.f8155b0 = j7;
        Iterator it = this.f8145N.iterator();
        while (it.hasNext()) {
            w wVar = ((View$OnClickListenerC0130l) it.next()).f4186q;
            TextView textView = wVar.f4237T;
            if (textView != null) {
                textView.setText(Z2.H.z(wVar.f4239V, wVar.W, j7));
            }
        }
    }

    @Override // X2.H
    public long getPreferredUpdateDelay() {
        int width = (int) (this.f8163r.width() / this.f8147P);
        if (width != 0) {
            long j7 = this.f8156c0;
            if (j7 != 0 && j7 != -9223372036854775807L) {
                return j7 / width;
            }
        }
        return Long.MAX_VALUE;
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f8133A;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint;
        int i7;
        canvas.save();
        Rect rect = this.f8163r;
        int height = rect.height();
        int centerY = rect.centerY() - (height / 2);
        int i8 = centerY + height;
        int i9 = (this.f8156c0 > 0L ? 1 : (this.f8156c0 == 0L ? 0 : -1));
        Paint paint2 = this.f8168w;
        Rect rect2 = this.f8165t;
        if (i9 <= 0) {
            canvas.drawRect(rect.left, centerY, rect.right, i8, paint2);
        } else {
            Rect rect3 = this.f8164s;
            int i10 = rect3.left;
            int i11 = rect3.right;
            int max = Math.max(Math.max(rect.left, i11), rect2.right);
            int i12 = rect.right;
            if (max < i12) {
                canvas.drawRect(max, centerY, i12, i8, paint2);
            }
            int max2 = Math.max(i10, rect2.right);
            if (i11 > max2) {
                canvas.drawRect(max2, centerY, i11, i8, this.f8167v);
            }
            if (rect2.width() > 0) {
                canvas.drawRect(rect2.left, centerY, rect2.right, i8, this.f8166u);
            }
            if (this.f8159f0 != 0) {
                long[] jArr = this.f8160g0;
                jArr.getClass();
                boolean[] zArr = this.f8161h0;
                zArr.getClass();
                int i13 = this.f8137E;
                int i14 = i13 / 2;
                int i15 = 0;
                int i16 = 0;
                while (i16 < this.f8159f0) {
                    int min = Math.min(rect.width() - i13, Math.max(i15, ((int) ((rect.width() * Z2.H.k(jArr[i16], 0L, this.f8156c0)) / this.f8156c0)) - i14)) + rect.left;
                    if (zArr[i16]) {
                        paint = this.f8170y;
                    } else {
                        paint = this.f8169x;
                    }
                    canvas.drawRect(min, centerY, min + i13, i8, paint);
                    i16++;
                    i15 = i15;
                    i13 = i13;
                }
            }
        }
        if (this.f8156c0 > 0) {
            int j7 = Z2.H.j(rect2.right, rect2.left, rect.right);
            int centerY2 = rect2.centerY();
            Drawable drawable = this.f8133A;
            if (drawable == null) {
                if (!this.f8154a0 && !isFocused()) {
                    if (isEnabled()) {
                        i7 = this.F;
                    } else {
                        i7 = this.f8138G;
                    }
                } else {
                    i7 = this.f8139H;
                }
                canvas.drawCircle(j7, centerY2, (int) ((i7 * this.f8153V) / 2.0f), this.f8171z);
            } else {
                int intrinsicWidth = ((int) (drawable.getIntrinsicWidth() * this.f8153V)) / 2;
                int intrinsicHeight = ((int) (drawable.getIntrinsicHeight() * this.f8153V)) / 2;
                drawable.setBounds(j7 - intrinsicWidth, centerY2 - intrinsicHeight, j7 + intrinsicWidth, centerY2 + intrinsicHeight);
                drawable.draw(canvas);
            }
        }
        canvas.restore();
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z7, int i7, Rect rect) {
        super.onFocusChanged(z7, i7, rect);
        if (!this.f8154a0 || z7) {
            return;
        }
        d(false);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.f8156c0 <= 0) {
            return;
        }
        if (Z2.H.f4603a >= 21) {
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
            return;
        }
        accessibilityNodeInfo.addAction(4096);
        accessibilityNodeInfo.addAction(8192);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onKeyDown(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            boolean r0 = r4.isEnabled()
            if (r0 == 0) goto L2e
            long r0 = r4.getPositionIncrement()
            r2 = 66
            r3 = 1
            if (r5 == r2) goto L25
            switch(r5) {
                case 21: goto L13;
                case 22: goto L14;
                case 23: goto L25;
                default: goto L12;
            }
        L12:
            goto L2e
        L13:
            long r0 = -r0
        L14:
            boolean r0 = r4.b(r0)
            if (r0 == 0) goto L2e
            E1.b r5 = r4.f8144M
            r4.removeCallbacks(r5)
            r0 = 1000(0x3e8, double:4.94E-321)
            r4.postDelayed(r5, r0)
            return r3
        L25:
            boolean r0 = r4.f8154a0
            if (r0 == 0) goto L2e
            r5 = 0
            r4.d(r5)
            return r3
        L2e:
            boolean r5 = super.onKeyDown(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.DefaultTimeBar.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public final void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        int i11;
        int i12;
        int i13;
        Rect rect;
        int i14 = i9 - i7;
        int i15 = i10 - i8;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i14 - getPaddingRight();
        if (this.W) {
            i11 = 0;
        } else {
            i11 = this.f8140I;
        }
        int i16 = this.f8136D;
        int i17 = this.f8134B;
        int i18 = this.f8135C;
        if (i16 == 1) {
            i12 = (i15 - getPaddingBottom()) - i18;
            i13 = ((i15 - getPaddingBottom()) - i17) - Math.max(i11 - (i17 / 2), 0);
        } else {
            i12 = (i15 - i18) / 2;
            i13 = (i15 - i17) / 2;
        }
        Rect rect2 = this.f8162q;
        rect2.set(paddingLeft, i12, paddingRight, i18 + i12);
        this.f8163r.set(rect2.left + i11, i13, rect2.right - i11, i17 + i13);
        if (Z2.H.f4603a >= 29 && ((rect = this.f8151T) == null || rect.width() != i14 || this.f8151T.height() != i15)) {
            Rect rect3 = new Rect(0, 0, i14, i15);
            this.f8151T = rect3;
            D.b.r(this, Collections.singletonList(rect3));
        }
        e();
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i8) {
        int mode = View.MeasureSpec.getMode(i8);
        int size = View.MeasureSpec.getSize(i8);
        int i9 = this.f8135C;
        if (mode == 0) {
            size = i9;
        } else if (mode != 1073741824) {
            size = Math.min(i9, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i7), size);
        Drawable drawable = this.f8133A;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i7) {
        Drawable drawable = this.f8133A;
        if (drawable != null && Z2.H.f4603a >= 23 && drawable.setLayoutDirection(i7)) {
            invalidate();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
        if (r3 != 3) goto L33;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            boolean r0 = r9.isEnabled()
            r1 = 0
            if (r0 == 0) goto L90
            long r2 = r9.f8156c0
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L11
            goto L90
        L11:
            android.graphics.Point r0 = r9.f8146O
            float r2 = r10.getX()
            int r2 = (int) r2
            float r3 = r10.getY()
            int r3 = (int) r3
            r0.set(r2, r3)
            int r2 = r0.x
            int r0 = r0.y
            int r3 = r10.getAction()
            android.graphics.Rect r4 = r9.f8165t
            android.graphics.Rect r5 = r9.f8163r
            r6 = 1
            if (r3 == 0) goto L72
            r7 = 3
            if (r3 == r6) goto L63
            r8 = 2
            if (r3 == r8) goto L38
            if (r3 == r7) goto L63
            goto L90
        L38:
            boolean r10 = r9.f8154a0
            if (r10 == 0) goto L90
            int r10 = r9.f8141J
            if (r0 >= r10) goto L52
            int r10 = r9.f8150S
            int r2 = r2 - r10
            int r2 = r2 / r7
            int r2 = r2 + r10
        L45:
            float r10 = (float) r2
            int r10 = (int) r10
            int r0 = r5.left
            int r1 = r5.right
            int r10 = Z2.H.j(r10, r0, r1)
            r4.right = r10
            goto L55
        L52:
            r9.f8150S = r2
            goto L45
        L55:
            long r0 = r9.getScrubberPosition()
            r9.f(r0)
        L5c:
            r9.e()
            r9.invalidate()
            return r6
        L63:
            boolean r0 = r9.f8154a0
            if (r0 == 0) goto L90
            int r10 = r10.getAction()
            if (r10 != r7) goto L6e
            r1 = r6
        L6e:
            r9.d(r1)
            return r6
        L72:
            float r10 = (float) r2
            float r0 = (float) r0
            int r10 = (int) r10
            int r0 = (int) r0
            android.graphics.Rect r2 = r9.f8162q
            boolean r0 = r2.contains(r10, r0)
            if (r0 == 0) goto L90
            int r0 = r5.left
            int r1 = r5.right
            int r10 = Z2.H.j(r10, r0, r1)
            r4.right = r10
            long r0 = r9.getScrubberPosition()
            r9.c(r0)
            goto L5c
        L90:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.DefaultTimeBar.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
        if (b(-getPositionIncrement()) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0021, code lost:
        d(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
        if (b(getPositionIncrement()) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
        sendAccessibilityEvent(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0038, code lost:
        return true;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean performAccessibilityAction(int r6, android.os.Bundle r7) {
        /*
            r5 = this;
            boolean r7 = super.performAccessibilityAction(r6, r7)
            r0 = 1
            if (r7 == 0) goto L8
            return r0
        L8:
            long r1 = r5.f8156c0
            r3 = 0
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r1 = 0
            if (r7 > 0) goto L12
            return r1
        L12:
            r7 = 8192(0x2000, float:1.148E-41)
            if (r6 != r7) goto L25
            long r6 = r5.getPositionIncrement()
            long r6 = -r6
            boolean r6 = r5.b(r6)
            if (r6 == 0) goto L34
        L21:
            r5.d(r1)
            goto L34
        L25:
            r7 = 4096(0x1000, float:5.74E-42)
            if (r6 != r7) goto L39
            long r6 = r5.getPositionIncrement()
            boolean r6 = r5.b(r6)
            if (r6 == 0) goto L34
            goto L21
        L34:
            r6 = 4
            r5.sendAccessibilityEvent(r6)
            return r0
        L39:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.DefaultTimeBar.performAccessibilityAction(int, android.os.Bundle):boolean");
    }

    public void setAdMarkerColor(int i7) {
        this.f8169x.setColor(i7);
        invalidate(this.f8162q);
    }

    public void setBufferedColor(int i7) {
        this.f8167v.setColor(i7);
        invalidate(this.f8162q);
    }

    @Override // X2.H
    public void setBufferedPosition(long j7) {
        if (this.f8158e0 == j7) {
            return;
        }
        this.f8158e0 = j7;
        e();
    }

    @Override // X2.H
    public void setDuration(long j7) {
        if (this.f8156c0 == j7) {
            return;
        }
        this.f8156c0 = j7;
        if (this.f8154a0 && j7 == -9223372036854775807L) {
            d(true);
        }
        e();
    }

    @Override // android.view.View, X2.H
    public void setEnabled(boolean z7) {
        super.setEnabled(z7);
        if (!this.f8154a0 || z7) {
            return;
        }
        d(true);
    }

    public void setKeyCountIncrement(int i7) {
        AbstractC0156a.f(i7 > 0);
        this.f8148Q = i7;
        this.f8149R = -9223372036854775807L;
    }

    public void setKeyTimeIncrement(long j7) {
        AbstractC0156a.f(j7 > 0);
        this.f8148Q = -1;
        this.f8149R = j7;
    }

    public void setPlayedAdMarkerColor(int i7) {
        this.f8170y.setColor(i7);
        invalidate(this.f8162q);
    }

    public void setPlayedColor(int i7) {
        this.f8166u.setColor(i7);
        invalidate(this.f8162q);
    }

    @Override // X2.H
    public void setPosition(long j7) {
        if (this.f8157d0 == j7) {
            return;
        }
        this.f8157d0 = j7;
        setContentDescription(getProgressText());
        e();
    }

    public void setScrubberColor(int i7) {
        this.f8171z.setColor(i7);
        invalidate(this.f8162q);
    }

    public void setUnplayedColor(int i7) {
        this.f8168w.setColor(i7);
        invalidate(this.f8162q);
    }

    public DefaultTimeBar(Context context, AttributeSet attributeSet, AttributeSet attributeSet2, int i7) {
        super(context, attributeSet, 0);
        int i8;
        int max;
        this.f8162q = new Rect();
        this.f8163r = new Rect();
        this.f8164s = new Rect();
        this.f8165t = new Rect();
        Paint paint = new Paint();
        this.f8166u = paint;
        Paint paint2 = new Paint();
        this.f8167v = paint2;
        Paint paint3 = new Paint();
        this.f8168w = paint3;
        Paint paint4 = new Paint();
        this.f8169x = paint4;
        Paint paint5 = new Paint();
        this.f8170y = paint5;
        Paint paint6 = new Paint();
        this.f8171z = paint6;
        paint6.setAntiAlias(true);
        this.f8145N = new CopyOnWriteArraySet();
        this.f8146O = new Point();
        float f = context.getResources().getDisplayMetrics().density;
        this.f8147P = f;
        this.f8141J = a(-50, f);
        int a7 = a(4, f);
        int a8 = a(26, f);
        int a9 = a(4, f);
        int a10 = a(12, f);
        int a11 = a(0, f);
        int a12 = a(16, f);
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, AbstractC0124f.f4173b, 0, i7);
            try {
                Drawable drawable = obtainStyledAttributes.getDrawable(10);
                this.f8133A = drawable;
                if (drawable != null) {
                    int i9 = Z2.H.f4603a;
                    if (i9 >= 23) {
                        int layoutDirection = getLayoutDirection();
                        if (i9 >= 23) {
                            drawable.setLayoutDirection(layoutDirection);
                        }
                    }
                    a8 = Math.max(drawable.getMinimumHeight(), a8);
                }
                this.f8134B = obtainStyledAttributes.getDimensionPixelSize(3, a7);
                this.f8135C = obtainStyledAttributes.getDimensionPixelSize(12, a8);
                this.f8136D = obtainStyledAttributes.getInt(2, 0);
                this.f8137E = obtainStyledAttributes.getDimensionPixelSize(1, a9);
                this.F = obtainStyledAttributes.getDimensionPixelSize(11, a10);
                this.f8138G = obtainStyledAttributes.getDimensionPixelSize(8, a11);
                this.f8139H = obtainStyledAttributes.getDimensionPixelSize(9, a12);
                int i10 = obtainStyledAttributes.getInt(6, -1);
                int i11 = obtainStyledAttributes.getInt(7, -1);
                int i12 = obtainStyledAttributes.getInt(4, -855638017);
                int i13 = obtainStyledAttributes.getInt(13, 872415231);
                int i14 = obtainStyledAttributes.getInt(0, -1291845888);
                int i15 = obtainStyledAttributes.getInt(5, 872414976);
                paint.setColor(i10);
                paint6.setColor(i11);
                paint2.setColor(i12);
                paint3.setColor(i13);
                paint4.setColor(i14);
                paint5.setColor(i15);
                obtainStyledAttributes.recycle();
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            this.f8134B = a7;
            this.f8135C = a8;
            this.f8136D = 0;
            this.f8137E = a9;
            this.F = a10;
            this.f8138G = a11;
            this.f8139H = a12;
            paint.setColor(-1);
            paint6.setColor(-1);
            paint2.setColor(-855638017);
            paint3.setColor(872415231);
            paint4.setColor(-1291845888);
            paint5.setColor(872414976);
            this.f8133A = null;
        }
        StringBuilder sb = new StringBuilder();
        this.f8142K = sb;
        this.f8143L = new Formatter(sb, Locale.getDefault());
        this.f8144M = new b(3, this);
        Drawable drawable2 = this.f8133A;
        if (drawable2 != null) {
            max = drawable2.getMinimumWidth() + 1;
            i8 = 2;
        } else {
            i8 = 2;
            max = Math.max(this.f8138G, Math.max(this.F, this.f8139H)) + 1;
        }
        this.f8140I = max / i8;
        this.f8153V = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f8152U = valueAnimator;
        valueAnimator.addUpdateListener(new C0123e(this, 0));
        this.f8156c0 = -9223372036854775807L;
        this.f8149R = -9223372036854775807L;
        this.f8148Q = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }
}
