package androidx.core.widget;

import K.C0032h;
import K.C0037m;
import K.C0040p;
import K.D;
import K.InterfaceC0039o;
import K.O;
import P.f;
import P.i;
import P.j;
import P.k;
import P.l;
import T4.c;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.support.v4.media.session.b;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import com.boxhdo.android.tv.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC0039o {

    /* renamed from: R  reason: collision with root package name */
    public static final float f5623R = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* renamed from: S  reason: collision with root package name */
    public static final i f5624S = new i(0);

    /* renamed from: T  reason: collision with root package name */
    public static final int[] f5625T = {16843130};

    /* renamed from: A  reason: collision with root package name */
    public boolean f5626A;

    /* renamed from: B  reason: collision with root package name */
    public VelocityTracker f5627B;

    /* renamed from: C  reason: collision with root package name */
    public boolean f5628C;

    /* renamed from: D  reason: collision with root package name */
    public boolean f5629D;

    /* renamed from: E  reason: collision with root package name */
    public final int f5630E;
    public final int F;

    /* renamed from: G  reason: collision with root package name */
    public final int f5631G;

    /* renamed from: H  reason: collision with root package name */
    public int f5632H;

    /* renamed from: I  reason: collision with root package name */
    public final int[] f5633I;

    /* renamed from: J  reason: collision with root package name */
    public final int[] f5634J;

    /* renamed from: K  reason: collision with root package name */
    public int f5635K;

    /* renamed from: L  reason: collision with root package name */
    public int f5636L;

    /* renamed from: M  reason: collision with root package name */
    public l f5637M;

    /* renamed from: N  reason: collision with root package name */
    public final C0040p f5638N;

    /* renamed from: O  reason: collision with root package name */
    public final C0037m f5639O;

    /* renamed from: P  reason: collision with root package name */
    public float f5640P;

    /* renamed from: Q  reason: collision with root package name */
    public final C0032h f5641Q;

    /* renamed from: q  reason: collision with root package name */
    public final float f5642q;

    /* renamed from: r  reason: collision with root package name */
    public long f5643r;

    /* renamed from: s  reason: collision with root package name */
    public final Rect f5644s;

    /* renamed from: t  reason: collision with root package name */
    public final OverScroller f5645t;

    /* renamed from: u  reason: collision with root package name */
    public final EdgeEffect f5646u;

    /* renamed from: v  reason: collision with root package name */
    public final EdgeEffect f5647v;

    /* renamed from: w  reason: collision with root package name */
    public int f5648w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f5649x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f5650y;

    /* renamed from: z  reason: collision with root package name */
    public View f5651z;

    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, K.p] */
    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.nestedScrollViewStyle);
        EdgeEffect edgeEffect;
        EdgeEffect edgeEffect2;
        this.f5644s = new Rect();
        this.f5649x = true;
        this.f5650y = false;
        this.f5651z = null;
        this.f5626A = false;
        this.f5629D = true;
        this.f5632H = -1;
        this.f5633I = new int[2];
        this.f5634J = new int[2];
        this.f5641Q = new C0032h(getContext(), new c(21, this));
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 31) {
            edgeEffect = f.a(context, attributeSet);
        } else {
            edgeEffect = new EdgeEffect(context);
        }
        this.f5646u = edgeEffect;
        if (i7 >= 31) {
            edgeEffect2 = f.a(context, attributeSet);
        } else {
            edgeEffect2 = new EdgeEffect(context);
        }
        this.f5647v = edgeEffect2;
        this.f5642q = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f5645t = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f5630E = viewConfiguration.getScaledTouchSlop();
        this.F = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f5631G = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f5625T, R.attr.nestedScrollViewStyle, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f5638N = new Object();
        this.f5639O = new C0037m(this);
        setNestedScrollingEnabled(true);
        O.i(this, f5624S);
    }

    public static boolean k(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        return (parent instanceof ViewGroup) && k((View) parent, view2);
    }

    @Override // K.InterfaceC0038n
    public final void a(View view, View view2, int i7, int i8) {
        C0040p c0040p = this.f5638N;
        if (i8 == 1) {
            c0040p.f1502b = i7;
        } else {
            c0040p.f1501a = i7;
        }
        this.f5639O.h(2, i8);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // K.InterfaceC0038n
    public final void b(View view, int i7) {
        C0040p c0040p = this.f5638N;
        if (i7 == 1) {
            c0040p.f1502b = 0;
        } else {
            c0040p.f1501a = 0;
        }
        v(i7);
    }

    @Override // K.InterfaceC0038n
    public final void c(View view, int i7, int i8, int[] iArr, int i9) {
        this.f5639O.c(i7, i8, i9, iArr, null);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e6  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void computeScroll() {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.computeScroll():void");
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    @Override // K.InterfaceC0039o
    public final void d(View view, int i7, int i8, int i9, int i10, int i11, int[] iArr) {
        m(i10, i11, iArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r6) {
        /*
            r5 = this;
            boolean r0 = super.dispatchKeyEvent(r6)
            if (r0 != 0) goto Lbb
            android.graphics.Rect r0 = r5.f5644s
            r0.setEmpty()
            int r0 = r5.getChildCount()
            r1 = 0
            r2 = 130(0x82, float:1.82E-43)
            if (r0 <= 0) goto L95
            android.view.View r0 = r5.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r3 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r3 = (android.widget.FrameLayout.LayoutParams) r3
            int r0 = r0.getHeight()
            int r4 = r3.topMargin
            int r0 = r0 + r4
            int r3 = r3.bottomMargin
            int r0 = r0 + r3
            int r3 = r5.getHeight()
            int r4 = r5.getPaddingTop()
            int r3 = r3 - r4
            int r4 = r5.getPaddingBottom()
            int r3 = r3 - r4
            if (r0 <= r3) goto L95
            int r0 = r6.getAction()
            if (r0 != 0) goto Lbc
            int r0 = r6.getKeyCode()
            r3 = 19
            r4 = 33
            if (r0 == r3) goto L87
            r3 = 20
            if (r0 == r3) goto L7b
            r3 = 62
            if (r0 == r3) goto L73
            r6 = 92
            if (r0 == r6) goto L6e
            r6 = 93
            if (r0 == r6) goto L69
            r6 = 122(0x7a, float:1.71E-43)
            if (r0 == r6) goto L65
            r6 = 123(0x7b, float:1.72E-43)
            if (r0 == r6) goto L61
            goto Lbc
        L61:
            r5.p(r2)
            goto Lbc
        L65:
            r5.p(r4)
            goto Lbc
        L69:
            boolean r6 = r5.j(r2)
            goto L92
        L6e:
            boolean r6 = r5.j(r4)
            goto L92
        L73:
            boolean r6 = r6.isShiftPressed()
            if (r6 == 0) goto L61
            r2 = r4
            goto L61
        L7b:
            boolean r6 = r6.isAltPressed()
            if (r6 == 0) goto L82
            goto L69
        L82:
            boolean r6 = r5.g(r2)
            goto L92
        L87:
            boolean r6 = r6.isAltPressed()
            if (r6 == 0) goto L8e
            goto L6e
        L8e:
            boolean r6 = r5.g(r4)
        L92:
            if (r6 == 0) goto Lbc
            goto Lbb
        L95:
            boolean r0 = r5.isFocused()
            if (r0 == 0) goto Lbc
            int r6 = r6.getKeyCode()
            r0 = 4
            if (r6 == r0) goto Lbc
            android.view.View r6 = r5.findFocus()
            if (r6 != r5) goto La9
            r6 = 0
        La9:
            android.view.FocusFinder r0 = android.view.FocusFinder.getInstance()
            android.view.View r6 = r0.findNextFocus(r5, r6, r2)
            if (r6 == 0) goto Lbc
            if (r6 == r5) goto Lbc
            boolean r6 = r6.requestFocus(r2)
            if (r6 == 0) goto Lbc
        Lbb:
            r1 = 1
        Lbc:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f7, boolean z7) {
        return this.f5639O.a(f, f7, z7);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f7) {
        return this.f5639O.b(f, f7);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i7, int i8, int[] iArr, int[] iArr2) {
        return this.f5639O.c(i7, i8, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i7, int i8, int i9, int i10, int[] iArr) {
        return this.f5639O.e(i7, i8, i9, i10, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i7;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f5646u;
        int i8 = 0;
        if (!edgeEffect.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (j.a(this)) {
                width -= getPaddingRight() + getPaddingLeft();
                i7 = getPaddingLeft();
            } else {
                i7 = 0;
            }
            if (j.a(this)) {
                height -= getPaddingBottom() + getPaddingTop();
                min += getPaddingTop();
            }
            canvas.translate(i7, min);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect2 = this.f5647v;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int save2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int max = Math.max(getScrollRange(), scrollY) + height2;
        if (j.a(this)) {
            width2 -= getPaddingRight() + getPaddingLeft();
            i8 = getPaddingLeft();
        }
        if (j.a(this)) {
            height2 -= getPaddingBottom() + getPaddingTop();
            max -= getPaddingBottom();
        }
        canvas.translate(i8 - width2, max);
        canvas.rotate(180.0f, width2, 0.0f);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(save2);
    }

    @Override // K.InterfaceC0038n
    public final void e(View view, int i7, int i8, int i9, int i10, int i11) {
        m(i10, i11, null);
    }

    @Override // K.InterfaceC0038n
    public final boolean f(View view, View view2, int i7, int i8) {
        return (i7 & 2) != 0;
    }

    public final boolean g(int i7) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i7);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus != null && l(findNextFocus, maxScrollAmount, getHeight())) {
            Rect rect = this.f5644s;
            findNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findNextFocus, rect);
            r(h(rect), 0, 1, true);
            findNextFocus.requestFocus(i7);
        } else {
            if (i7 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i7 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i7 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            r(maxScrollAmount, 0, 1, true);
        }
        if (findFocus != null && findFocus.isFocused() && (!l(findFocus, 0, getHeight()))) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0040p c0040p = this.f5638N;
        return c0040p.f1502b | c0040p.f1501a;
    }

    public int getScrollRange() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
        }
        return 0;
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        if (this.f5640P == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f5640P = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f5640P;
    }

    public final int h(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i7 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i8 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i7 - verticalFadingEdgeLength : i7;
        int i9 = rect.bottom;
        if (i9 > i8 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i8, (childAt.getBottom() + layoutParams.bottomMargin) - i7);
        } else if (rect.top >= scrollY || i9 >= i8) {
            return 0;
        } else {
            return Math.max(rect.height() > height ? 0 - (i8 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
        }
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f5639O.g(0);
    }

    public final void i(int i7) {
        if (getChildCount() > 0) {
            this.f5645t.fling(getScrollX(), getScrollY(), 0, i7, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            this.f5639O.h(2, 1);
            this.f5636L = getScrollY();
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f5639O.d;
    }

    public final boolean j(int i7) {
        int childCount;
        boolean z7 = i7 == 130;
        int height = getHeight();
        Rect rect = this.f5644s;
        rect.top = 0;
        rect.bottom = height;
        if (z7 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return q(i7, rect.top, rect.bottom);
    }

    public final boolean l(View view, int i7, int i8) {
        Rect rect = this.f5644s;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i7 >= getScrollY() && rect.top - i7 <= getScrollY() + i8;
    }

    public final void m(int i7, int i8, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i7);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f5639O.d(scrollY2, i7 - scrollY2, i8, iArr);
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i7, int i8) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i7, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i7, int i8, int i9, int i10) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i7, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i8, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final void n(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f5632H) {
            int i7 = actionIndex == 0 ? 1 : 0;
            this.f5648w = (int) motionEvent.getY(i7);
            this.f5632H = motionEvent.getPointerId(i7);
            VelocityTracker velocityTracker = this.f5627B;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean o(int i7, int i8, int i9, int i10) {
        boolean z7;
        boolean z8;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i11 = i9 + i7;
        if (i8 > 0 || i8 < 0) {
            i8 = 0;
            z7 = true;
        } else {
            z7 = false;
        }
        if (i11 <= i10) {
            if (i11 < 0) {
                i10 = 0;
            } else {
                i10 = i11;
                z8 = false;
                if (z8 && !this.f5639O.g(1)) {
                    this.f5645t.springBack(i8, i10, 0, 0, 0, getScrollRange());
                }
                super.scrollTo(i8, i10);
                if (z7 && !z8) {
                    return false;
                }
            }
        }
        z8 = true;
        if (z8) {
            this.f5645t.springBack(i8, i10, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i8, i10);
        return z7 ? true : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f5650y = false;
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i7;
        int i8;
        float f;
        if (motionEvent.getAction() == 8 && !this.f5626A) {
            if (b.q0(motionEvent, 2)) {
                i7 = 9;
                f = motionEvent.getAxisValue(9);
                i8 = (int) motionEvent.getX();
            } else if (b.q0(motionEvent, 4194304)) {
                float axisValue = motionEvent.getAxisValue(26);
                i8 = getWidth() / 2;
                i7 = 26;
                f = axisValue;
            } else {
                i7 = 0;
                i8 = 0;
                f = 0.0f;
            }
            if (f != 0.0f) {
                r(-((int) (getVerticalScrollFactorCompat() * f)), i8, 1, b.q0(motionEvent, 8194));
                if (i7 != 0) {
                    this.f5641Q.a(motionEvent, i7);
                }
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z7 = true;
        if (action == 2 && this.f5626A) {
            return true;
        }
        int i7 = action & 255;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        if (i7 == 6) {
                            n(motionEvent);
                        }
                    }
                } else {
                    int i8 = this.f5632H;
                    if (i8 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i8);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i8 + " in onInterceptTouchEvent");
                        } else {
                            int y3 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y3 - this.f5648w) > this.f5630E && (2 & getNestedScrollAxes()) == 0) {
                                this.f5626A = true;
                                this.f5648w = y3;
                                if (this.f5627B == null) {
                                    this.f5627B = VelocityTracker.obtain();
                                }
                                this.f5627B.addMovement(motionEvent);
                                this.f5635K = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                }
            }
            this.f5626A = false;
            this.f5632H = -1;
            VelocityTracker velocityTracker = this.f5627B;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f5627B = null;
            }
            if (this.f5645t.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            v(0);
        } else {
            int y4 = (int) motionEvent.getY();
            int x7 = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y4 >= childAt.getTop() - scrollY && y4 < childAt.getBottom() - scrollY && x7 >= childAt.getLeft() && x7 < childAt.getRight()) {
                    this.f5648w = y4;
                    this.f5632H = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker2 = this.f5627B;
                    if (velocityTracker2 == null) {
                        this.f5627B = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.f5627B.addMovement(motionEvent);
                    this.f5645t.computeScrollOffset();
                    if (!u(motionEvent) && this.f5645t.isFinished()) {
                        z7 = false;
                    }
                    this.f5626A = z7;
                    this.f5639O.h(2, 0);
                }
            }
            if (!u(motionEvent) && this.f5645t.isFinished()) {
                z7 = false;
            }
            this.f5626A = z7;
            VelocityTracker velocityTracker3 = this.f5627B;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.f5627B = null;
            }
        }
        return this.f5626A;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        int i11;
        super.onLayout(z7, i7, i8, i9, i10);
        int i12 = 0;
        this.f5649x = false;
        View view = this.f5651z;
        if (view != null && k(view, this)) {
            View view2 = this.f5651z;
            Rect rect = this.f5644s;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int h7 = h(rect);
            if (h7 != 0) {
                scrollBy(0, h7);
            }
        }
        this.f5651z = null;
        if (!this.f5650y) {
            if (this.f5637M != null) {
                scrollTo(getScrollX(), this.f5637M.f2757q);
                this.f5637M = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i11 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                i11 = 0;
            }
            int paddingTop = ((i10 - i8) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < i11 && scrollY >= 0) {
                i12 = paddingTop + scrollY > i11 ? i11 - paddingTop : scrollY;
            }
            if (i12 != scrollY) {
                scrollTo(getScrollX(), i12);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f5650y = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i8) {
        super.onMeasure(i7, i8);
        if (this.f5628C && View.MeasureSpec.getMode(i8) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i7, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f7, boolean z7) {
        if (z7) {
            return false;
        }
        dispatchNestedFling(0.0f, f7, true);
        i((int) f7);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f7) {
        return this.f5639O.b(f, f7);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i7, int i8, int[] iArr) {
        this.f5639O.c(i7, i8, 0, iArr, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i7, int i8, int i9, int i10) {
        m(i10, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i7) {
        a(view, view2, i7, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i7, int i8, boolean z7, boolean z8) {
        super.scrollTo(i7, i8);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i7, Rect rect) {
        View findNextFocusFromRect;
        if (i7 == 2) {
            i7 = 130;
        } else if (i7 == 1) {
            i7 = 33;
        }
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (rect == null) {
            findNextFocusFromRect = focusFinder.findNextFocus(this, null, i7);
        } else {
            findNextFocusFromRect = focusFinder.findNextFocusFromRect(this, rect, i7);
        }
        if (findNextFocusFromRect == null || (true ^ l(findNextFocusFromRect, 0, getHeight()))) {
            return false;
        }
        return findNextFocusFromRect.requestFocus(i7, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof l)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        l lVar = (l) parcelable;
        super.onRestoreInstanceState(lVar.getSuperState());
        this.f5637M = lVar;
        requestLayout();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View$BaseSavedState, android.os.Parcelable, P.l] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        baseSavedState.f2757q = getScrollY();
        return baseSavedState;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i7, int i8, int i9, int i10) {
        super.onScrollChanged(i7, i8, i9, i10);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i8, int i9, int i10) {
        super.onSizeChanged(i7, i8, i9, i10);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && l(findFocus, 0, i10)) {
            Rect rect = this.f5644s;
            findFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findFocus, rect);
            int h7 = h(rect);
            if (h7 != 0) {
                if (this.f5629D) {
                    t(0, h7, false);
                } else {
                    scrollBy(0, h7);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i7) {
        return f(view, view2, i7, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        b(view, 0);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        int i7;
        if (this.f5627B == null) {
            this.f5627B = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f5635K = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        float f = 0.0f;
        obtain.offsetLocation(0.0f, this.f5635K);
        C0037m c0037m = this.f5639O;
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.f5647v;
            EdgeEffect edgeEffect2 = this.f5646u;
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                n(motionEvent);
                                this.f5648w = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f5632H));
                            }
                        } else {
                            int actionIndex = motionEvent.getActionIndex();
                            this.f5648w = (int) motionEvent.getY(actionIndex);
                            this.f5632H = motionEvent.getPointerId(actionIndex);
                        }
                    } else {
                        if (this.f5626A && getChildCount() > 0 && this.f5645t.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                            postInvalidateOnAnimation();
                        }
                        this.f5632H = -1;
                        this.f5626A = false;
                        VelocityTracker velocityTracker = this.f5627B;
                        if (velocityTracker != null) {
                            velocityTracker.recycle();
                            this.f5627B = null;
                        }
                        v(0);
                        this.f5646u.onRelease();
                        this.f5647v.onRelease();
                    }
                } else {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f5632H);
                    if (findPointerIndex == -1) {
                        Log.e("NestedScrollView", "Invalid pointerId=" + this.f5632H + " in onTouchEvent");
                    } else {
                        int y3 = (int) motionEvent.getY(findPointerIndex);
                        int i8 = this.f5648w - y3;
                        float x7 = motionEvent.getX(findPointerIndex) / getWidth();
                        float height = i8 / getHeight();
                        if (p6.l.t(edgeEffect2) != 0.0f) {
                            float f7 = -p6.l.C(edgeEffect2, -height, x7);
                            if (p6.l.t(edgeEffect2) == 0.0f) {
                                edgeEffect2.onRelease();
                            }
                            f = f7;
                        } else if (p6.l.t(edgeEffect) != 0.0f) {
                            float C3 = p6.l.C(edgeEffect, height, 1.0f - x7);
                            if (p6.l.t(edgeEffect) == 0.0f) {
                                edgeEffect.onRelease();
                            }
                            f = C3;
                        }
                        int round = Math.round(f * getHeight());
                        if (round != 0) {
                            invalidate();
                        }
                        int i9 = i8 - round;
                        if (!this.f5626A && Math.abs(i9) > this.f5630E) {
                            ViewParent parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                            this.f5626A = true;
                            int i10 = this.f5630E;
                            i9 = i9 > 0 ? i9 - i10 : i9 + i10;
                        }
                        if (this.f5626A) {
                            int r3 = r(i9, (int) motionEvent.getX(findPointerIndex), 0, false);
                            this.f5648w = y3 - r3;
                            this.f5635K += r3;
                        }
                    }
                }
            } else {
                VelocityTracker velocityTracker2 = this.f5627B;
                velocityTracker2.computeCurrentVelocity(1000, this.f5631G);
                int yVelocity = (int) velocityTracker2.getYVelocity(this.f5632H);
                if (Math.abs(yVelocity) >= this.F) {
                    if (p6.l.t(edgeEffect2) != 0.0f) {
                        if (s(edgeEffect2, yVelocity)) {
                            edgeEffect2.onAbsorb(yVelocity);
                        } else {
                            i7 = -yVelocity;
                            i(i7);
                        }
                    } else if (p6.l.t(edgeEffect) != 0.0f) {
                        i7 = -yVelocity;
                        if (s(edgeEffect, i7)) {
                            edgeEffect.onAbsorb(i7);
                        }
                        i(i7);
                    } else {
                        int i11 = -yVelocity;
                        float f8 = i11;
                        if (!c0037m.b(0.0f, f8)) {
                            dispatchNestedFling(0.0f, f8, true);
                            i(i11);
                        }
                    }
                } else if (this.f5645t.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f5632H = -1;
                this.f5626A = false;
                VelocityTracker velocityTracker3 = this.f5627B;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f5627B = null;
                }
                v(0);
                this.f5646u.onRelease();
                this.f5647v.onRelease();
            }
        } else if (getChildCount() == 0) {
            return false;
        } else {
            if (this.f5626A && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f5645t.isFinished()) {
                this.f5645t.abortAnimation();
                v(1);
            }
            int pointerId = motionEvent.getPointerId(0);
            this.f5648w = (int) motionEvent.getY();
            this.f5632H = pointerId;
            c0037m.h(2, 0);
        }
        VelocityTracker velocityTracker4 = this.f5627B;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
        if (r0 < 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(int r6) {
        /*
            r5 = this;
            r0 = 130(0x82, float:1.82E-43)
            r1 = 0
            r2 = 1
            if (r6 != r0) goto L8
            r0 = r2
            goto L9
        L8:
            r0 = r1
        L9:
            int r3 = r5.getHeight()
            android.graphics.Rect r4 = r5.f5644s
            if (r0 == 0) goto L3c
            int r0 = r5.getScrollY()
            int r0 = r0 + r3
            r4.top = r0
            int r0 = r5.getChildCount()
            if (r0 <= 0) goto L47
            int r0 = r0 - r2
            android.view.View r0 = r5.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            int r0 = r0.getBottom()
            int r1 = r1.bottomMargin
            int r0 = r0 + r1
            int r1 = r5.getPaddingBottom()
            int r1 = r1 + r0
            int r0 = r4.top
            int r0 = r0 + r3
            if (r0 <= r1) goto L47
            int r1 = r1 - r3
            goto L45
        L3c:
            int r0 = r5.getScrollY()
            int r0 = r0 - r3
            r4.top = r0
            if (r0 >= 0) goto L47
        L45:
            r4.top = r1
        L47:
            int r0 = r4.top
            int r3 = r3 + r0
            r4.bottom = r3
            r5.q(r6, r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.p(int):void");
    }

    public final boolean q(int i7, int i8, int i9) {
        boolean z7;
        int i10;
        boolean z8;
        boolean z9;
        boolean z10;
        int height = getHeight();
        int scrollY = getScrollY();
        int i11 = height + scrollY;
        if (i7 == 33) {
            z7 = true;
        } else {
            z7 = false;
        }
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z11 = false;
        for (int i12 = 0; i12 < size; i12++) {
            View view2 = focusables.get(i12);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i8 < bottom && top < i9) {
                if (i8 < top && bottom < i9) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (view == null) {
                    view = view2;
                    z11 = z9;
                } else {
                    if ((z7 && top < view.getTop()) || (!z7 && bottom > view.getBottom())) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z11) {
                        if (z9) {
                            if (!z10) {
                            }
                            view = view2;
                        }
                    } else if (z9) {
                        view = view2;
                        z11 = true;
                    } else {
                        if (!z10) {
                        }
                        view = view2;
                    }
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i8 >= scrollY && i9 <= i11) {
            z8 = false;
        } else {
            if (z7) {
                i10 = i8 - scrollY;
            } else {
                i10 = i9 - i11;
            }
            r(i10, 0, 1, true);
            z8 = true;
        }
        if (view != findFocus()) {
            view.requestFocus(i7);
        }
        return z8;
    }

    public final int r(int i7, int i8, int i9, boolean z7) {
        int i10;
        int i11;
        boolean z8;
        boolean z9;
        VelocityTracker velocityTracker;
        C0037m c0037m = this.f5639O;
        if (i9 == 1) {
            c0037m.h(2, i9);
        }
        boolean c5 = this.f5639O.c(0, i7, i9, this.f5634J, this.f5633I);
        int[] iArr = this.f5634J;
        int[] iArr2 = this.f5633I;
        if (c5) {
            i10 = i7 - iArr[1];
            i11 = iArr2[1];
        } else {
            i10 = i7;
            i11 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        if ((overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z7) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (o(i10, 0, scrollY, scrollRange) && !c0037m.g(i9)) {
            z9 = true;
        } else {
            z9 = false;
        }
        int scrollY2 = getScrollY() - scrollY;
        iArr[1] = 0;
        this.f5639O.e(0, scrollY2, 0, i10 - scrollY2, this.f5633I, i9, iArr);
        int i12 = i11 + iArr2[1];
        int i13 = i10 - iArr[1];
        int i14 = scrollY + i13;
        EdgeEffect edgeEffect = this.f5647v;
        EdgeEffect edgeEffect2 = this.f5646u;
        if (i14 < 0) {
            if (z8) {
                p6.l.C(edgeEffect2, (-i13) / getHeight(), i8 / getWidth());
                if (!edgeEffect.isFinished()) {
                    edgeEffect.onRelease();
                }
            }
        } else if (i14 > scrollRange && z8) {
            p6.l.C(edgeEffect, i13 / getHeight(), 1.0f - (i8 / getWidth()));
            if (!edgeEffect2.isFinished()) {
                edgeEffect2.onRelease();
            }
        }
        if (edgeEffect2.isFinished() && edgeEffect.isFinished()) {
            if (z9 && i9 == 0 && (velocityTracker = this.f5627B) != null) {
                velocityTracker.clear();
            }
        } else {
            postInvalidateOnAnimation();
        }
        if (i9 == 1) {
            v(i9);
            edgeEffect2.onRelease();
            edgeEffect.onRelease();
        }
        return i12;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (!this.f5649x) {
            Rect rect = this.f5644s;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int h7 = h(rect);
            if (h7 != 0) {
                scrollBy(0, h7);
            }
        } else {
            this.f5651z = view2;
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z7) {
        boolean z8;
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int h7 = h(rect);
        if (h7 != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            if (z7) {
                scrollBy(0, h7);
            } else {
                t(0, h7, false);
            }
        }
        return z8;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z7) {
        VelocityTracker velocityTracker;
        if (z7 && (velocityTracker = this.f5627B) != null) {
            velocityTracker.recycle();
            this.f5627B = null;
        }
        super.requestDisallowInterceptTouchEvent(z7);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f5649x = true;
        super.requestLayout();
    }

    public final boolean s(EdgeEffect edgeEffect, int i7) {
        if (i7 > 0) {
            return true;
        }
        float t5 = p6.l.t(edgeEffect) * getHeight();
        float f = this.f5642q * 0.015f;
        double log = Math.log((Math.abs(-i7) * 0.35f) / f);
        double d = f5623R;
        if (((float) (Math.exp((d / (d - 1.0d)) * log) * f)) < t5) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final void scrollTo(int i7, int i8) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width < width2 && i7 >= 0) {
                if (width + i7 > width2) {
                    i7 = width2 - width;
                }
            } else {
                i7 = 0;
            }
            if (height < height2 && i8 >= 0) {
                if (height + i8 > height2) {
                    i8 = height2 - height;
                }
            } else {
                i8 = 0;
            }
            if (i7 != getScrollX() || i8 != getScrollY()) {
                super.scrollTo(i7, i8);
            }
        }
    }

    public void setFillViewport(boolean z7) {
        if (z7 != this.f5628C) {
            this.f5628C = z7;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z7) {
        C0037m c0037m = this.f5639O;
        if (c0037m.d) {
            Field field = O.f1447a;
            D.z(c0037m.f1499c);
        }
        c0037m.d = z7;
    }

    public void setSmoothScrollingEnabled(boolean z7) {
        this.f5629D = z7;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i7) {
        return this.f5639O.h(i7, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        v(0);
    }

    public final void t(int i7, int i8, boolean z7) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f5643r > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int scrollY = getScrollY();
            OverScroller overScroller = this.f5645t;
            int scrollX = getScrollX();
            overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i8 + scrollY, Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom())))) - scrollY, 250);
            if (z7) {
                this.f5639O.h(2, 1);
            } else {
                v(1);
            }
            this.f5636L = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.f5645t.isFinished()) {
                this.f5645t.abortAnimation();
                v(1);
            }
            scrollBy(i7, i8);
        }
        this.f5643r = AnimationUtils.currentAnimationTimeMillis();
    }

    public final boolean u(MotionEvent motionEvent) {
        boolean z7;
        EdgeEffect edgeEffect = this.f5646u;
        if (p6.l.t(edgeEffect) != 0.0f) {
            p6.l.C(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z7 = true;
        } else {
            z7 = false;
        }
        EdgeEffect edgeEffect2 = this.f5647v;
        if (p6.l.t(edgeEffect2) != 0.0f) {
            p6.l.C(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
            return true;
        }
        return z7;
    }

    public final void v(int i7) {
        this.f5639O.i(i7);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i7) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i7);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i7, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, layoutParams);
    }

    public void setOnScrollChangeListener(k kVar) {
    }
}
