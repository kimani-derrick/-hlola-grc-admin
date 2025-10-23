package androidx.coordinatorlayout.widget;

import C4.b;
import J.c;
import K.B;
import K.C0040p;
import K.D;
import K.InterfaceC0038n;
import K.InterfaceC0039o;
import K.O;
import K.i0;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.boxhdo.android.tv.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import k.C0852F;
import n5.r;
import o.j;
import w.a;
import x.AbstractC1438a;
import x.AbstractC1444g;
import x.C1441d;
import x.C1443f;
import x.InterfaceC1439b;
import x.ViewGroup$OnHierarchyChangeListenerC1440c;
import x.ViewTreeObserver$OnPreDrawListenerC1442e;
/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements InterfaceC0038n, InterfaceC0039o {

    /* renamed from: J  reason: collision with root package name */
    public static final String f5587J;

    /* renamed from: K  reason: collision with root package name */
    public static final Class[] f5588K;

    /* renamed from: L  reason: collision with root package name */
    public static final ThreadLocal f5589L;

    /* renamed from: M  reason: collision with root package name */
    public static final r f5590M;

    /* renamed from: N  reason: collision with root package name */
    public static final c f5591N;

    /* renamed from: A  reason: collision with root package name */
    public View f5592A;

    /* renamed from: B  reason: collision with root package name */
    public ViewTreeObserver$OnPreDrawListenerC1442e f5593B;

    /* renamed from: C  reason: collision with root package name */
    public boolean f5594C;

    /* renamed from: D  reason: collision with root package name */
    public i0 f5595D;

    /* renamed from: E  reason: collision with root package name */
    public boolean f5596E;
    public Drawable F;

    /* renamed from: G  reason: collision with root package name */
    public ViewGroup.OnHierarchyChangeListener f5597G;

    /* renamed from: H  reason: collision with root package name */
    public C0852F f5598H;

    /* renamed from: I  reason: collision with root package name */
    public final C0040p f5599I;

    /* renamed from: q  reason: collision with root package name */
    public final ArrayList f5600q;

    /* renamed from: r  reason: collision with root package name */
    public final b f5601r;

    /* renamed from: s  reason: collision with root package name */
    public final ArrayList f5602s;

    /* renamed from: t  reason: collision with root package name */
    public final ArrayList f5603t;

    /* renamed from: u  reason: collision with root package name */
    public final int[] f5604u;

    /* renamed from: v  reason: collision with root package name */
    public final int[] f5605v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f5606w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f5607x;

    /* renamed from: y  reason: collision with root package name */
    public final int[] f5608y;

    /* renamed from: z  reason: collision with root package name */
    public View f5609z;

    static {
        String str;
        Package r02 = CoordinatorLayout.class.getPackage();
        if (r02 != null) {
            str = r02.getName();
        } else {
            str = null;
        }
        f5587J = str;
        f5590M = new r(6);
        f5588K = new Class[]{Context.class, AttributeSet.class};
        f5589L = new ThreadLocal();
        f5591N = new c();
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, K.p] */
    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        this.f5600q = new ArrayList();
        this.f5601r = new b(26);
        this.f5602s = new ArrayList();
        this.f5603t = new ArrayList();
        this.f5604u = new int[2];
        this.f5605v = new int[2];
        this.f5599I = new Object();
        int[] iArr = a.f15430a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.f5608y = intArray;
            float f = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i7 = 0; i7 < length; i7++) {
                int[] iArr2 = this.f5608y;
                iArr2[i7] = (int) (iArr2[i7] * f);
            }
        }
        this.F = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        w();
        super.setOnHierarchyChangeListener(new ViewGroup$OnHierarchyChangeListenerC1440c(this));
        Field field = O.f1447a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static Rect g() {
        Rect rect = (Rect) f5591N.a();
        return rect == null ? new Rect() : rect;
    }

    public static void l(int i7, Rect rect, Rect rect2, C1441d c1441d, int i8, int i9) {
        int width;
        int height;
        int i10 = c1441d.f16131c;
        if (i10 == 0) {
            i10 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i10, i7);
        int i11 = c1441d.d;
        if ((i11 & 7) == 0) {
            i11 |= 8388611;
        }
        if ((i11 & 112) == 0) {
            i11 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i11, i7);
        int i12 = absoluteGravity & 7;
        int i13 = absoluteGravity & 112;
        int i14 = absoluteGravity2 & 7;
        int i15 = absoluteGravity2 & 112;
        if (i14 != 1) {
            if (i14 != 5) {
                width = rect.left;
            } else {
                width = rect.right;
            }
        } else {
            width = rect.left + (rect.width() / 2);
        }
        if (i15 != 16) {
            if (i15 != 80) {
                height = rect.top;
            } else {
                height = rect.bottom;
            }
        } else {
            height = rect.top + (rect.height() / 2);
        }
        if (i12 != 1) {
            if (i12 != 5) {
                width -= i8;
            }
        } else {
            width -= i8 / 2;
        }
        if (i13 != 16) {
            if (i13 != 80) {
                height -= i9;
            }
        } else {
            height -= i9 / 2;
        }
        rect2.set(width, height, i8 + width, i9 + height);
    }

    public static C1441d n(View view) {
        C1441d c1441d = (C1441d) view.getLayoutParams();
        if (!c1441d.f16130b) {
            InterfaceC1439b interfaceC1439b = null;
            for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                interfaceC1439b = (InterfaceC1439b) cls.getAnnotation(InterfaceC1439b.class);
                if (interfaceC1439b != null) {
                    break;
                }
            }
            if (interfaceC1439b != null) {
                try {
                    AbstractC1438a abstractC1438a = (AbstractC1438a) interfaceC1439b.value().getDeclaredConstructor(null).newInstance(null);
                    AbstractC1438a abstractC1438a2 = c1441d.f16129a;
                    if (abstractC1438a2 != abstractC1438a) {
                        if (abstractC1438a2 != null) {
                            abstractC1438a2.e();
                        }
                        c1441d.f16129a = abstractC1438a;
                        c1441d.f16130b = true;
                        if (abstractC1438a != null) {
                            abstractC1438a.c(c1441d);
                        }
                    }
                } catch (Exception e3) {
                    Log.e("CoordinatorLayout", "Default behavior class " + interfaceC1439b.value().getName() + " could not be instantiated. Did you forget a default constructor?", e3);
                }
            }
            c1441d.f16130b = true;
        }
        return c1441d;
    }

    public static void u(View view, int i7) {
        C1441d c1441d = (C1441d) view.getLayoutParams();
        int i8 = c1441d.f16135i;
        if (i8 != i7) {
            Field field = O.f1447a;
            view.offsetLeftAndRight(i7 - i8);
            c1441d.f16135i = i7;
        }
    }

    public static void v(View view, int i7) {
        C1441d c1441d = (C1441d) view.getLayoutParams();
        int i8 = c1441d.f16136j;
        if (i8 != i7) {
            Field field = O.f1447a;
            view.offsetTopAndBottom(i7 - i8);
            c1441d.f16136j = i7;
        }
    }

    @Override // K.InterfaceC0038n
    public final void a(View view, View view2, int i7, int i8) {
        C0040p c0040p = this.f5599I;
        if (i8 == 1) {
            c0040p.f1502b = i7;
        } else {
            c0040p.f1501a = i7;
        }
        this.f5592A = view2;
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            ((C1441d) getChildAt(i9).getLayoutParams()).getClass();
        }
    }

    @Override // K.InterfaceC0038n
    public final void b(View view, int i7) {
        C0040p c0040p = this.f5599I;
        if (i7 == 1) {
            c0040p.f1502b = 0;
        } else {
            c0040p.f1501a = 0;
        }
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            C1441d c1441d = (C1441d) childAt.getLayoutParams();
            if (c1441d.a(i7)) {
                AbstractC1438a abstractC1438a = c1441d.f16129a;
                if (abstractC1438a != null) {
                    abstractC1438a.p(childAt, view, i7);
                }
                if (i7 != 0) {
                    if (i7 == 1) {
                        c1441d.f16140o = false;
                    }
                } else {
                    c1441d.n = false;
                }
                c1441d.getClass();
            }
        }
        this.f5592A = null;
    }

    @Override // K.InterfaceC0038n
    public final void c(View view, int i7, int i8, int[] iArr, int i9) {
        AbstractC1438a abstractC1438a;
        int min;
        int min2;
        int childCount = getChildCount();
        boolean z7 = false;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                C1441d c1441d = (C1441d) childAt.getLayoutParams();
                if (c1441d.a(i9) && (abstractC1438a = c1441d.f16129a) != null) {
                    int[] iArr2 = this.f5604u;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC1438a.j(this, childAt, view, i7, i8, iArr2, i9);
                    if (i7 > 0) {
                        min = Math.max(i10, iArr2[0]);
                    } else {
                        min = Math.min(i10, iArr2[0]);
                    }
                    i10 = min;
                    if (i8 > 0) {
                        min2 = Math.max(i11, iArr2[1]);
                    } else {
                        min2 = Math.min(i11, iArr2[1]);
                    }
                    i11 = min2;
                    z7 = true;
                }
            }
        }
        iArr[0] = i10;
        iArr[1] = i11;
        if (z7) {
            p(1);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C1441d) && super.checkLayoutParams(layoutParams);
    }

    @Override // K.InterfaceC0039o
    public final void d(View view, int i7, int i8, int i9, int i10, int i11, int[] iArr) {
        AbstractC1438a abstractC1438a;
        int min;
        int min2;
        int childCount = getChildCount();
        boolean z7 = false;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                C1441d c1441d = (C1441d) childAt.getLayoutParams();
                if (c1441d.a(i11) && (abstractC1438a = c1441d.f16129a) != null) {
                    int[] iArr2 = this.f5604u;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC1438a.k(this, childAt, i8, i9, i10, iArr2);
                    if (i9 > 0) {
                        min = Math.max(i12, iArr2[0]);
                    } else {
                        min = Math.min(i12, iArr2[0]);
                    }
                    i12 = min;
                    if (i10 > 0) {
                        min2 = Math.max(i13, iArr2[1]);
                    } else {
                        min2 = Math.min(i13, iArr2[1]);
                    }
                    i13 = min2;
                    z7 = true;
                }
            }
        }
        iArr[0] = iArr[0] + i12;
        iArr[1] = iArr[1] + i13;
        if (z7) {
            p(1);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j7) {
        AbstractC1438a abstractC1438a = ((C1441d) view.getLayoutParams()).f16129a;
        if (abstractC1438a != null) {
            abstractC1438a.getClass();
        }
        return super.drawChild(canvas, view, j7);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.F;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // K.InterfaceC0038n
    public final void e(View view, int i7, int i8, int i9, int i10, int i11) {
        d(view, i7, i8, i9, i10, 0, this.f5605v);
    }

    @Override // K.InterfaceC0038n
    public final boolean f(View view, View view2, int i7, int i8) {
        int childCount = getChildCount();
        boolean z7 = false;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                C1441d c1441d = (C1441d) childAt.getLayoutParams();
                AbstractC1438a abstractC1438a = c1441d.f16129a;
                if (abstractC1438a != null) {
                    boolean o7 = abstractC1438a.o(childAt, i7, i8);
                    z7 |= o7;
                    if (i8 != 0) {
                        if (i8 == 1) {
                            c1441d.f16140o = o7;
                        }
                    } else {
                        c1441d.n = o7;
                    }
                } else if (i8 != 0) {
                    if (i8 == 1) {
                        c1441d.f16140o = false;
                    }
                } else {
                    c1441d.n = false;
                }
            }
        }
        return z7;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C1441d();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C1441d(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        s();
        return Collections.unmodifiableList(this.f5600q);
    }

    public final i0 getLastWindowInsets() {
        return this.f5595D;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0040p c0040p = this.f5599I;
        return c0040p.f1502b | c0040p.f1501a;
    }

    public Drawable getStatusBarBackground() {
        return this.F;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public final void h(C1441d c1441d, Rect rect, int i7, int i8) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c1441d).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i7) - ((ViewGroup.MarginLayoutParams) c1441d).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c1441d).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i8) - ((ViewGroup.MarginLayoutParams) c1441d).bottomMargin));
        rect.set(max, max2, i7 + max, i8 + max2);
    }

    public final void i(View view, Rect rect, boolean z7) {
        if (!view.isLayoutRequested() && view.getVisibility() != 8) {
            if (z7) {
                k(view, rect);
                return;
            } else {
                rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                return;
            }
        }
        rect.setEmpty();
    }

    public final ArrayList j(View view) {
        j jVar = (j) this.f5601r.f422s;
        int i7 = jVar.f12809s;
        ArrayList arrayList = null;
        for (int i8 = 0; i8 < i7; i8++) {
            ArrayList arrayList2 = (ArrayList) jVar.i(i8);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(jVar.f(i8));
            }
        }
        ArrayList arrayList3 = this.f5603t;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    public final void k(View view, Rect rect) {
        ThreadLocal threadLocal = AbstractC1444g.f16144a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = AbstractC1444g.f16144a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        AbstractC1444g.a(this, view, matrix);
        ThreadLocal threadLocal3 = AbstractC1444g.f16145b;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public final int m(int i7) {
        StringBuilder sb;
        int[] iArr = this.f5608y;
        if (iArr == null) {
            sb = new StringBuilder("No keylines defined for ");
            sb.append(this);
            sb.append(" - attempted index lookup ");
            sb.append(i7);
        } else if (i7 >= 0 && i7 < iArr.length) {
            return iArr[i7];
        } else {
            sb = new StringBuilder("Keyline index ");
            sb.append(i7);
            sb.append(" out of range for ");
            sb.append(this);
        }
        Log.e("CoordinatorLayout", sb.toString());
        return 0;
    }

    public final boolean o(View view, int i7, int i8) {
        c cVar = f5591N;
        Rect g7 = g();
        k(view, g7);
        try {
            return g7.contains(i7, i8);
        } finally {
            g7.setEmpty();
            cVar.c(g7);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        t(false);
        if (this.f5594C) {
            if (this.f5593B == null) {
                this.f5593B = new ViewTreeObserver$OnPreDrawListenerC1442e(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f5593B);
        }
        if (this.f5595D == null) {
            Field field = O.f1447a;
            if (getFitsSystemWindows()) {
                B.c(this);
            }
        }
        this.f5607x = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        t(false);
        if (this.f5594C && this.f5593B != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f5593B);
        }
        View view = this.f5592A;
        if (view != null) {
            b(view, 0);
        }
        this.f5607x = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f5596E || this.F == null) {
            return;
        }
        i0 i0Var = this.f5595D;
        int a7 = i0Var != null ? i0Var.a() : 0;
        if (a7 > 0) {
            this.F.setBounds(0, 0, getWidth(), a7);
            this.F.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            t(true);
        }
        boolean r3 = r(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            t(true);
        }
        return r3;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        AbstractC1438a abstractC1438a;
        Field field = O.f1447a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.f5600q;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            View view = (View) arrayList.get(i11);
            if (view.getVisibility() != 8 && ((abstractC1438a = ((C1441d) view.getLayoutParams()).f16129a) == null || !abstractC1438a.g(this, view, layoutDirection))) {
                q(view, layoutDirection);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i8) {
        boolean z7;
        boolean z8;
        boolean z9;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        AbstractC1438a abstractC1438a;
        int i14;
        int i15;
        int i16;
        boolean z10;
        int i17;
        int i18;
        ArrayList arrayList;
        boolean z11;
        s();
        int childCount = getChildCount();
        int i19 = 0;
        loop0: while (true) {
            if (i19 < childCount) {
                View childAt = getChildAt(i19);
                j jVar = (j) this.f5601r.f422s;
                int i20 = jVar.f12809s;
                for (int i21 = 0; i21 < i20; i21++) {
                    ArrayList arrayList2 = (ArrayList) jVar.i(i21);
                    if (arrayList2 != null && arrayList2.contains(childAt)) {
                        z7 = true;
                        break loop0;
                    }
                }
                i19++;
            } else {
                z7 = false;
                break;
            }
        }
        if (z7 != this.f5594C) {
            if (z7) {
                if (this.f5607x) {
                    if (this.f5593B == null) {
                        this.f5593B = new ViewTreeObserver$OnPreDrawListenerC1442e(this);
                    }
                    getViewTreeObserver().addOnPreDrawListener(this.f5593B);
                }
                this.f5594C = true;
            } else {
                if (this.f5607x && this.f5593B != null) {
                    getViewTreeObserver().removeOnPreDrawListener(this.f5593B);
                }
                this.f5594C = false;
            }
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        Field field = O.f1447a;
        int layoutDirection = getLayoutDirection();
        if (layoutDirection == 1) {
            z8 = true;
        } else {
            z8 = false;
        }
        int mode = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i7);
        int mode2 = View.MeasureSpec.getMode(i8);
        int size2 = View.MeasureSpec.getSize(i8);
        int i22 = paddingLeft + paddingRight;
        int i23 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (this.f5595D != null && getFitsSystemWindows()) {
            z9 = true;
        } else {
            z9 = false;
        }
        ArrayList arrayList3 = this.f5600q;
        int size3 = arrayList3.size();
        int i24 = suggestedMinimumWidth;
        int i25 = suggestedMinimumHeight;
        int i26 = 0;
        int i27 = 0;
        while (i27 < size3) {
            View view = (View) arrayList3.get(i27);
            int i28 = i26;
            if (view.getVisibility() == 8) {
                i18 = size3;
                arrayList = arrayList3;
                i26 = i28;
                z11 = true;
                z10 = false;
                i15 = i27;
            } else {
                C1441d c1441d = (C1441d) view.getLayoutParams();
                int i29 = c1441d.f16132e;
                if (i29 >= 0 && mode != 0) {
                    int m7 = m(i29);
                    i9 = i27;
                    int i30 = c1441d.f16131c;
                    if (i30 == 0) {
                        i30 = 8388661;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i30, layoutDirection) & 7;
                    i10 = i25;
                    if ((absoluteGravity == 3 && !z8) || (absoluteGravity == 5 && z8)) {
                        i11 = Math.max(0, (size - paddingRight) - m7);
                    } else if ((absoluteGravity == 5 && !z8) || (absoluteGravity == 3 && z8)) {
                        i11 = Math.max(0, m7 - paddingLeft);
                    }
                    if (!z9 && !view.getFitsSystemWindows()) {
                        int i31 = this.f5595D.f1495a.h().f431c + this.f5595D.f1495a.h().f429a;
                        int a7 = this.f5595D.f1495a.h().d + this.f5595D.a();
                        i12 = View.MeasureSpec.makeMeasureSpec(size - i31, mode);
                        i13 = View.MeasureSpec.makeMeasureSpec(size2 - a7, mode2);
                    } else {
                        i12 = i7;
                        i13 = i8;
                    }
                    abstractC1438a = c1441d.f16129a;
                    if (abstractC1438a == null && abstractC1438a.h(this, view)) {
                        i17 = i24;
                        i18 = size3;
                        i14 = i28;
                        i15 = i9;
                        i16 = i10;
                        z10 = false;
                        arrayList = arrayList3;
                    } else {
                        i14 = i28;
                        i15 = i9;
                        i16 = i10;
                        z10 = false;
                        i17 = i24;
                        int i32 = i11;
                        i18 = size3;
                        arrayList = arrayList3;
                        measureChildWithMargins(view, i12, i32, i13, 0);
                    }
                    int max = Math.max(i17, view.getMeasuredWidth() + i22 + ((ViewGroup.MarginLayoutParams) c1441d).leftMargin + ((ViewGroup.MarginLayoutParams) c1441d).rightMargin);
                    int max2 = Math.max(i16, view.getMeasuredHeight() + i23 + ((ViewGroup.MarginLayoutParams) c1441d).topMargin + ((ViewGroup.MarginLayoutParams) c1441d).bottomMargin);
                    i24 = max;
                    i26 = View.combineMeasuredStates(i14, view.getMeasuredState());
                    z11 = true;
                    i25 = max2;
                } else {
                    i9 = i27;
                    i10 = i25;
                }
                i11 = 0;
                if (!z9) {
                }
                i12 = i7;
                i13 = i8;
                abstractC1438a = c1441d.f16129a;
                if (abstractC1438a == null) {
                }
                i14 = i28;
                i15 = i9;
                i16 = i10;
                z10 = false;
                i17 = i24;
                int i322 = i11;
                i18 = size3;
                arrayList = arrayList3;
                measureChildWithMargins(view, i12, i322, i13, 0);
                int max3 = Math.max(i17, view.getMeasuredWidth() + i22 + ((ViewGroup.MarginLayoutParams) c1441d).leftMargin + ((ViewGroup.MarginLayoutParams) c1441d).rightMargin);
                int max22 = Math.max(i16, view.getMeasuredHeight() + i23 + ((ViewGroup.MarginLayoutParams) c1441d).topMargin + ((ViewGroup.MarginLayoutParams) c1441d).bottomMargin);
                i24 = max3;
                i26 = View.combineMeasuredStates(i14, view.getMeasuredState());
                z11 = true;
                i25 = max22;
            }
            i27 = i15 + 1;
            size3 = i18;
            arrayList3 = arrayList;
        }
        int i33 = i26;
        setMeasuredDimension(View.resolveSizeAndState(i24, i7, (-16777216) & i33), View.resolveSizeAndState(i25, i8, i33 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f7, boolean z7) {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                C1441d c1441d = (C1441d) childAt.getLayoutParams();
                if (c1441d.a(0)) {
                    AbstractC1438a abstractC1438a = c1441d.f16129a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f7) {
        AbstractC1438a abstractC1438a;
        int childCount = getChildCount();
        boolean z7 = false;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                C1441d c1441d = (C1441d) childAt.getLayoutParams();
                if (c1441d.a(0) && (abstractC1438a = c1441d.f16129a) != null) {
                    z7 |= abstractC1438a.i(view);
                }
            }
        }
        return z7;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i7, int i8, int[] iArr) {
        c(view, i7, i8, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i7, int i8, int i9, int i10) {
        e(view, i7, i8, i9, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i7) {
        a(view, view2, i7, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C1443f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1443f c1443f = (C1443f) parcelable;
        super.onRestoreInstanceState(c1443f.f2938q);
        SparseArray sparseArray = c1443f.f16143s;
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            int id = childAt.getId();
            AbstractC1438a abstractC1438a = n(childAt).f16129a;
            if (id != -1 && abstractC1438a != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                abstractC1438a.m(childAt, parcelable2);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [x.f, android.os.Parcelable, S.b] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable n;
        ?? bVar = new S.b(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            int id = childAt.getId();
            AbstractC1438a abstractC1438a = ((C1441d) childAt.getLayoutParams()).f16129a;
            if (id != -1 && abstractC1438a != null && (n = abstractC1438a.n(childAt)) != null) {
                sparseArray.append(id, n);
            }
        }
        bVar.f16143s = sparseArray;
        return bVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i7) {
        return f(view, view2, i7, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        b(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r3 != false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.f5609z
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L17
            boolean r3 = r0.r(r1, r4)
            if (r3 == 0) goto L15
            goto L18
        L15:
            r6 = r5
            goto L2a
        L17:
            r3 = r5
        L18:
            android.view.View r6 = r0.f5609z
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            x.d r6 = (x.C1441d) r6
            x.a r6 = r6.f16129a
            if (r6 == 0) goto L15
            android.view.View r7 = r0.f5609z
            boolean r6 = r6.q(r7, r1)
        L2a:
            android.view.View r7 = r0.f5609z
            r8 = 0
            if (r7 != 0) goto L35
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L48
        L35:
            if (r3 == 0) goto L48
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L48:
            if (r8 == 0) goto L4d
            r8.recycle()
        L4d:
            if (r2 == r4) goto L52
            r1 = 3
            if (r2 != r1) goto L55
        L52:
            r0.t(r5)
        L55:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x004b A[EDGE_INSN: B:133:0x004b->B:10:0x004b ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(int r26) {
        /*
            Method dump skipped, instructions count: 792
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.p(int):void");
    }

    public final void q(View view, int i7) {
        Rect g7;
        Rect g8;
        int i8;
        C1441d c1441d = (C1441d) view.getLayoutParams();
        View view2 = c1441d.f16137k;
        if (view2 == null && c1441d.f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        c cVar = f5591N;
        if (view2 != null) {
            g7 = g();
            g8 = g();
            try {
                k(view2, g7);
                C1441d c1441d2 = (C1441d) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                l(i7, g7, g8, c1441d2, measuredWidth, measuredHeight);
                h(c1441d2, g8, measuredWidth, measuredHeight);
                view.layout(g8.left, g8.top, g8.right, g8.bottom);
                return;
            } finally {
                g7.setEmpty();
                cVar.c(g7);
                g8.setEmpty();
                cVar.c(g8);
            }
        }
        int i9 = c1441d.f16132e;
        if (i9 >= 0) {
            C1441d c1441d3 = (C1441d) view.getLayoutParams();
            int i10 = c1441d3.f16131c;
            if (i10 == 0) {
                i10 = 8388661;
            }
            int absoluteGravity = Gravity.getAbsoluteGravity(i10, i7);
            int i11 = absoluteGravity & 7;
            int i12 = absoluteGravity & 112;
            int width = getWidth();
            int height = getHeight();
            int measuredWidth2 = view.getMeasuredWidth();
            int measuredHeight2 = view.getMeasuredHeight();
            if (i7 == 1) {
                i9 = width - i9;
            }
            int m7 = m(i9) - measuredWidth2;
            if (i11 != 1) {
                if (i11 == 5) {
                    m7 += measuredWidth2;
                }
            } else {
                m7 += measuredWidth2 / 2;
            }
            if (i12 != 16) {
                if (i12 != 80) {
                    i8 = 0;
                } else {
                    i8 = measuredHeight2;
                }
            } else {
                i8 = measuredHeight2 / 2;
            }
            int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c1441d3).leftMargin, Math.min(m7, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) c1441d3).rightMargin));
            int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c1441d3).topMargin, Math.min(i8, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) c1441d3).bottomMargin));
            view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
            return;
        }
        C1441d c1441d4 = (C1441d) view.getLayoutParams();
        g7 = g();
        g7.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c1441d4).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) c1441d4).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c1441d4).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c1441d4).bottomMargin);
        if (this.f5595D != null) {
            Field field = O.f1447a;
            if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                g7.left = this.f5595D.f1495a.h().f429a + g7.left;
                g7.top = this.f5595D.a() + g7.top;
                g7.right -= this.f5595D.f1495a.h().f431c;
                g7.bottom -= this.f5595D.f1495a.h().d;
            }
        }
        g8 = g();
        int i13 = c1441d4.f16131c;
        if ((i13 & 7) == 0) {
            i13 |= 8388611;
        }
        if ((i13 & 112) == 0) {
            i13 |= 48;
        }
        Gravity.apply(i13, view.getMeasuredWidth(), view.getMeasuredHeight(), g7, g8, i7);
        view.layout(g8.left, g8.top, g8.right, g8.bottom);
    }

    public final boolean r(MotionEvent motionEvent, int i7) {
        boolean z7;
        int i8;
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f5602s;
        arrayList.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i9 = childCount - 1; i9 >= 0; i9--) {
            if (isChildrenDrawingOrderEnabled) {
                i8 = getChildDrawingOrder(childCount, i9);
            } else {
                i8 = i9;
            }
            arrayList.add(getChildAt(i8));
        }
        r rVar = f5590M;
        if (rVar != null) {
            Collections.sort(arrayList, rVar);
        }
        int size = arrayList.size();
        MotionEvent motionEvent2 = null;
        boolean z8 = false;
        boolean z9 = false;
        for (int i10 = 0; i10 < size; i10++) {
            View view = (View) arrayList.get(i10);
            C1441d c1441d = (C1441d) view.getLayoutParams();
            AbstractC1438a abstractC1438a = c1441d.f16129a;
            if ((z8 || z9) && actionMasked != 0) {
                if (abstractC1438a != null) {
                    if (motionEvent2 == null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i7 != 0) {
                        if (i7 == 1) {
                            abstractC1438a.q(view, motionEvent2);
                        }
                    } else {
                        abstractC1438a.f(this, view, motionEvent2);
                    }
                }
            } else {
                if (!z8 && abstractC1438a != null) {
                    if (i7 != 0) {
                        if (i7 == 1) {
                            z8 = abstractC1438a.q(view, motionEvent);
                        }
                    } else {
                        z8 = abstractC1438a.f(this, view, motionEvent);
                    }
                    if (z8) {
                        this.f5609z = view;
                    }
                }
                if (c1441d.f16129a == null) {
                    c1441d.f16139m = false;
                }
                boolean z10 = c1441d.f16139m;
                if (z10) {
                    z7 = true;
                } else {
                    c1441d.f16139m = z10;
                    z7 = z10;
                }
                if (z7 && !z10) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z7 && !z9) {
                    break;
                }
            }
        }
        arrayList.clear();
        return z8;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z7) {
        AbstractC1438a abstractC1438a = ((C1441d) view.getLayoutParams()).f16129a;
        if (abstractC1438a != null) {
            abstractC1438a.l(this, view);
        }
        return super.requestChildRectangleOnScreen(view, rect, z7);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z7) {
        super.requestDisallowInterceptTouchEvent(z7);
        if (!z7 || this.f5606w) {
            return;
        }
        t(false);
        this.f5606w = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x013d, code lost:
        throw new java.lang.IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s() {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.s():void");
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z7) {
        super.setFitsSystemWindows(z7);
        w();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f5597G = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        boolean z7;
        Drawable drawable2 = this.F;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.F = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.F.setState(getDrawableState());
                }
                Drawable drawable4 = this.F;
                Field field = O.f1447a;
                E.b.b(drawable4, getLayoutDirection());
                Drawable drawable5 = this.F;
                if (getVisibility() == 0) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                drawable5.setVisible(z7, false);
                this.F.setCallback(this);
            }
            Field field2 = O.f1447a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i7) {
        setStatusBarBackground(new ColorDrawable(i7));
    }

    public void setStatusBarBackgroundResource(int i7) {
        Drawable drawable;
        if (i7 != 0) {
            drawable = A.a.b(getContext(), i7);
        } else {
            drawable = null;
        }
        setStatusBarBackground(drawable);
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        boolean z7 = i7 == 0;
        Drawable drawable = this.F;
        if (drawable == null || drawable.isVisible() == z7) {
            return;
        }
        this.F.setVisible(z7, false);
    }

    public final void t(boolean z7) {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            AbstractC1438a abstractC1438a = ((C1441d) childAt.getLayoutParams()).f16129a;
            if (abstractC1438a != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z7) {
                    abstractC1438a.f(this, childAt, obtain);
                } else {
                    abstractC1438a.q(childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i8 = 0; i8 < childCount; i8++) {
            ((C1441d) getChildAt(i8).getLayoutParams()).f16139m = false;
        }
        this.f5609z = null;
        this.f5606w = false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.F;
    }

    public final void w() {
        Field field = O.f1447a;
        if (getFitsSystemWindows()) {
            if (this.f5598H == null) {
                this.f5598H = new C0852F(27, this);
            }
            D.u(this, this.f5598H);
            setSystemUiVisibility(1280);
            return;
        }
        D.u(this, null);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1441d ? new C1441d((C1441d) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C1441d((ViewGroup.MarginLayoutParams) layoutParams) : new C1441d(layoutParams);
    }
}
