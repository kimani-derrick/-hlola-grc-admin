package androidx.appcompat.widget;

import K.B;
import K.C0040p;
import K.InterfaceC0038n;
import K.InterfaceC0039o;
import K.O;
import K.X;
import K.Y;
import K.Z;
import K.a0;
import K.i0;
import L3.p;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import com.boxhdo.android.tv.R;
import java.lang.reflect.Field;
import k.C0882d;
import k.InterfaceC0868S;
import k.InterfaceC0880c;
import k.R0;
import k.RunnableC0878b;
@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC0038n, InterfaceC0039o {

    /* renamed from: O  reason: collision with root package name */
    public static final int[] f5434O = {R.attr.actionBarSize, 16842841};

    /* renamed from: A  reason: collision with root package name */
    public int f5435A;

    /* renamed from: B  reason: collision with root package name */
    public final Rect f5436B;

    /* renamed from: C  reason: collision with root package name */
    public final Rect f5437C;

    /* renamed from: D  reason: collision with root package name */
    public final Rect f5438D;

    /* renamed from: E  reason: collision with root package name */
    public i0 f5439E;
    public i0 F;

    /* renamed from: G  reason: collision with root package name */
    public i0 f5440G;

    /* renamed from: H  reason: collision with root package name */
    public i0 f5441H;

    /* renamed from: I  reason: collision with root package name */
    public OverScroller f5442I;

    /* renamed from: J  reason: collision with root package name */
    public ViewPropertyAnimator f5443J;

    /* renamed from: K  reason: collision with root package name */
    public final p f5444K;

    /* renamed from: L  reason: collision with root package name */
    public final RunnableC0878b f5445L;

    /* renamed from: M  reason: collision with root package name */
    public final RunnableC0878b f5446M;

    /* renamed from: N  reason: collision with root package name */
    public final C0040p f5447N;

    /* renamed from: q  reason: collision with root package name */
    public int f5448q;

    /* renamed from: r  reason: collision with root package name */
    public ContentFrameLayout f5449r;

    /* renamed from: s  reason: collision with root package name */
    public ActionBarContainer f5450s;

    /* renamed from: t  reason: collision with root package name */
    public InterfaceC0868S f5451t;

    /* renamed from: u  reason: collision with root package name */
    public Drawable f5452u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f5453v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f5454w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f5455x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f5456y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f5457z;

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, K.p] */
    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5436B = new Rect();
        this.f5437C = new Rect();
        this.f5438D = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        i0 i0Var = i0.f1494b;
        this.f5439E = i0Var;
        this.F = i0Var;
        this.f5440G = i0Var;
        this.f5441H = i0Var;
        this.f5444K = new p(1, this);
        this.f5445L = new RunnableC0878b(this, 0);
        this.f5446M = new RunnableC0878b(this, 1);
        i(context);
        this.f5447N = new Object();
    }

    public static boolean g(FrameLayout frameLayout, Rect rect, boolean z7) {
        boolean z8;
        C0882d c0882d = (C0882d) frameLayout.getLayoutParams();
        int i7 = ((ViewGroup.MarginLayoutParams) c0882d).leftMargin;
        int i8 = rect.left;
        if (i7 != i8) {
            ((ViewGroup.MarginLayoutParams) c0882d).leftMargin = i8;
            z8 = true;
        } else {
            z8 = false;
        }
        int i9 = ((ViewGroup.MarginLayoutParams) c0882d).topMargin;
        int i10 = rect.top;
        if (i9 != i10) {
            ((ViewGroup.MarginLayoutParams) c0882d).topMargin = i10;
            z8 = true;
        }
        int i11 = ((ViewGroup.MarginLayoutParams) c0882d).rightMargin;
        int i12 = rect.right;
        if (i11 != i12) {
            ((ViewGroup.MarginLayoutParams) c0882d).rightMargin = i12;
            z8 = true;
        }
        if (z7) {
            int i13 = ((ViewGroup.MarginLayoutParams) c0882d).bottomMargin;
            int i14 = rect.bottom;
            if (i13 != i14) {
                ((ViewGroup.MarginLayoutParams) c0882d).bottomMargin = i14;
                return true;
            }
        }
        return z8;
    }

    @Override // K.InterfaceC0038n
    public final void a(View view, View view2, int i7, int i8) {
        if (i8 == 0) {
            onNestedScrollAccepted(view, view2, i7);
        }
    }

    @Override // K.InterfaceC0038n
    public final void b(View view, int i7) {
        if (i7 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // K.InterfaceC0038n
    public final void c(View view, int i7, int i8, int[] iArr, int i9) {
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0882d;
    }

    @Override // K.InterfaceC0039o
    public final void d(View view, int i7, int i8, int i9, int i10, int i11, int[] iArr) {
        e(view, i7, i8, i9, i10, i11);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i7;
        super.draw(canvas);
        if (this.f5452u == null || this.f5453v) {
            return;
        }
        if (this.f5450s.getVisibility() == 0) {
            i7 = (int) (this.f5450s.getTranslationY() + this.f5450s.getBottom() + 0.5f);
        } else {
            i7 = 0;
        }
        this.f5452u.setBounds(0, i7, getWidth(), this.f5452u.getIntrinsicHeight() + i7);
        this.f5452u.draw(canvas);
    }

    @Override // K.InterfaceC0038n
    public final void e(View view, int i7, int i8, int i9, int i10, int i11) {
        if (i11 == 0) {
            onNestedScroll(view, i7, i8, i9, i10);
        }
    }

    @Override // K.InterfaceC0038n
    public final boolean f(View view, View view2, int i7, int i8) {
        return i8 == 0 && onStartNestedScroll(view, view2, i7);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f5450s;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0040p c0040p = this.f5447N;
        return c0040p.f1502b | c0040p.f1501a;
    }

    public CharSequence getTitle() {
        j();
        return ((R0) this.f5451t).f11930a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.f5445L);
        removeCallbacks(this.f5446M);
        ViewPropertyAnimator viewPropertyAnimator = this.f5443J;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void i(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f5434O);
        this.f5448q = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f5452u = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f5453v = context.getApplicationInfo().targetSdkVersion < 19;
        this.f5442I = new OverScroller(context);
    }

    public final void j() {
        InterfaceC0868S wrapper;
        if (this.f5449r == null) {
            this.f5449r = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f5450s = (ActionBarContainer) findViewById(R.id.action_bar_container);
            View findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof InterfaceC0868S) {
                wrapper = (InterfaceC0868S) findViewById;
            } else if (findViewById instanceof Toolbar) {
                wrapper = ((Toolbar) findViewById).getWrapper();
            } else {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
            }
            this.f5451t = wrapper;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0059, code lost:
        if (r0 != false) goto L7;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets r7) {
        /*
            r6 = this;
            r6.j()
            K.i0 r7 = K.i0.d(r7, r6)
            android.graphics.Rect r0 = new android.graphics.Rect
            K.h0 r1 = r7.f1495a
            D.d r2 = r1.h()
            int r2 = r2.f429a
            int r3 = r7.a()
            D.d r4 = r1.h()
            int r4 = r4.f431c
            D.d r5 = r1.h()
            int r5 = r5.d
            r0.<init>(r2, r3, r4, r5)
            androidx.appcompat.widget.ActionBarContainer r2 = r6.f5450s
            r3 = 0
            boolean r0 = g(r2, r0, r3)
            java.lang.reflect.Field r2 = K.O.f1447a
            android.graphics.Rect r2 = r6.f5436B
            K.D.b(r6, r7, r2)
            int r7 = r2.left
            int r3 = r2.top
            int r4 = r2.right
            int r5 = r2.bottom
            K.i0 r7 = r1.i(r7, r3, r4, r5)
            r6.f5439E = r7
            K.i0 r3 = r6.F
            boolean r7 = r3.equals(r7)
            if (r7 != 0) goto L4d
            K.i0 r7 = r6.f5439E
            r6.F = r7
            r0 = 1
        L4d:
            android.graphics.Rect r7 = r6.f5437C
            boolean r3 = r7.equals(r2)
            if (r3 != 0) goto L59
            r7.set(r2)
            goto L5b
        L59:
            if (r0 == 0) goto L5e
        L5b:
            r6.requestLayout()
        L5e:
            K.i0 r7 = r1.a()
            K.h0 r7 = r7.f1495a
            K.i0 r7 = r7.c()
            K.h0 r7 = r7.f1495a
            K.i0 r7 = r7.b()
            android.view.WindowInsets r7 = r7.c()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onApplyWindowInsets(android.view.WindowInsets):android.view.WindowInsets");
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        Field field = O.f1447a;
        B.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                C0882d c0882d = (C0882d) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i12 = ((ViewGroup.MarginLayoutParams) c0882d).leftMargin + paddingLeft;
                int i13 = ((ViewGroup.MarginLayoutParams) c0882d).topMargin + paddingTop;
                childAt.layout(i12, i13, measuredWidth + i12, measuredHeight + i13);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i8) {
        boolean z7;
        int measuredHeight;
        a0 x7;
        i0 b7;
        j();
        measureChildWithMargins(this.f5450s, i7, 0, i8, 0);
        C0882d c0882d = (C0882d) this.f5450s.getLayoutParams();
        int max = Math.max(0, this.f5450s.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0882d).leftMargin + ((ViewGroup.MarginLayoutParams) c0882d).rightMargin);
        int max2 = Math.max(0, this.f5450s.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0882d).topMargin + ((ViewGroup.MarginLayoutParams) c0882d).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f5450s.getMeasuredState());
        Field field = O.f1447a;
        if ((getWindowSystemUiVisibility() & 256) != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (z7) {
            measuredHeight = this.f5448q;
            if (this.f5455x && this.f5450s.getTabContainer() != null) {
                measuredHeight += this.f5448q;
            }
        } else {
            measuredHeight = this.f5450s.getVisibility() != 8 ? this.f5450s.getMeasuredHeight() : 0;
        }
        Rect rect = this.f5436B;
        Rect rect2 = this.f5438D;
        rect2.set(rect);
        i0 i0Var = this.f5439E;
        this.f5440G = i0Var;
        if (!this.f5454w && !z7) {
            rect2.top += measuredHeight;
            rect2.bottom = rect2.bottom;
            b7 = i0Var.f1495a.i(0, measuredHeight, 0, 0);
        } else {
            D.d a7 = D.d.a(i0Var.f1495a.h().f429a, this.f5440G.a() + measuredHeight, this.f5440G.f1495a.h().f431c, this.f5440G.f1495a.h().d);
            i0 i0Var2 = this.f5440G;
            int i9 = Build.VERSION.SDK_INT;
            if (i9 >= 30) {
                x7 = new Z(i0Var2);
            } else if (i9 >= 29) {
                x7 = new Y(i0Var2);
            } else {
                x7 = new X(i0Var2);
            }
            x7.d(a7);
            b7 = x7.b();
        }
        this.f5440G = b7;
        g(this.f5449r, rect2, true);
        if (!this.f5441H.equals(this.f5440G)) {
            i0 i0Var3 = this.f5440G;
            this.f5441H = i0Var3;
            ContentFrameLayout contentFrameLayout = this.f5449r;
            WindowInsets c5 = i0Var3.c();
            if (c5 != null) {
                WindowInsets a8 = B.a(contentFrameLayout, c5);
                if (!a8.equals(c5)) {
                    i0.d(a8, contentFrameLayout);
                }
            }
        }
        measureChildWithMargins(this.f5449r, i7, 0, i8, 0);
        C0882d c0882d2 = (C0882d) this.f5449r.getLayoutParams();
        int max3 = Math.max(max, this.f5449r.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0882d2).leftMargin + ((ViewGroup.MarginLayoutParams) c0882d2).rightMargin);
        int max4 = Math.max(max2, this.f5449r.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0882d2).topMargin + ((ViewGroup.MarginLayoutParams) c0882d2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f5449r.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i7, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i8, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f7, boolean z7) {
        if (this.f5456y && z7) {
            this.f5442I.fling(0, 0, 0, (int) f7, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
            if (this.f5442I.getFinalY() > this.f5450s.getHeight()) {
                h();
                this.f5446M.run();
            } else {
                h();
                this.f5445L.run();
            }
            this.f5457z = true;
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f7) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i7, int i8, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i7, int i8, int i9, int i10) {
        int i11 = this.f5435A + i8;
        this.f5435A = i11;
        setActionBarHideOffset(i11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i7) {
        this.f5447N.f1501a = i7;
        this.f5435A = getActionBarHideOffset();
        h();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i7) {
        if ((i7 & 2) == 0 || this.f5450s.getVisibility() != 0) {
            return false;
        }
        return this.f5456y;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (this.f5456y && !this.f5457z) {
            if (this.f5435A <= this.f5450s.getHeight()) {
                h();
                postDelayed(this.f5445L, 600L);
                return;
            }
            h();
            postDelayed(this.f5446M, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i7) {
        super.onWindowSystemUiVisibilityChanged(i7);
        j();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i7) {
        super.onWindowVisibilityChanged(i7);
    }

    public void setActionBarHideOffset(int i7) {
        h();
        this.f5450s.setTranslationY(-Math.max(0, Math.min(i7, this.f5450s.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC0880c interfaceC0880c) {
        if (getWindowToken() == null) {
            return;
        }
        throw null;
    }

    public void setHasNonEmbeddedTabs(boolean z7) {
        this.f5455x = z7;
    }

    public void setHideOnContentScrollEnabled(boolean z7) {
        if (z7 != this.f5456y) {
            this.f5456y = z7;
            if (z7) {
                return;
            }
            h();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i7) {
        j();
        R0 r02 = (R0) this.f5451t;
        r02.d = i7 != 0 ? android.support.v4.media.session.b.i0(r02.f11930a.getContext(), i7) : null;
        r02.c();
    }

    public void setLogo(int i7) {
        Drawable drawable;
        j();
        R0 r02 = (R0) this.f5451t;
        if (i7 != 0) {
            drawable = android.support.v4.media.session.b.i0(r02.f11930a.getContext(), i7);
        } else {
            drawable = null;
        }
        r02.f11933e = drawable;
        r02.c();
    }

    public void setOverlayMode(boolean z7) {
        this.f5454w = z7;
        this.f5453v = z7 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z7) {
    }

    public void setUiOptions(int i7) {
    }

    public void setWindowCallback(Window.Callback callback) {
        j();
        ((R0) this.f5451t).f11938k = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        j();
        R0 r02 = (R0) this.f5451t;
        if (!r02.f11934g) {
            r02.f11935h = charSequence;
            if ((r02.f11931b & 8) != 0) {
                Toolbar toolbar = r02.f11930a;
                toolbar.setTitle(charSequence);
                if (r02.f11934g) {
                    O.j(toolbar.getRootView(), charSequence);
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        j();
        R0 r02 = (R0) this.f5451t;
        r02.d = drawable;
        r02.c();
    }
}
