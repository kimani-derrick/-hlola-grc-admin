package androidx.appcompat.widget;

import J3.e;
import Z5.n;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import j.h;
import j.i;
import j.j;
import j.k;
import j.l;
import j.o;
import k.AbstractC0883d0;
import k.C0881c0;
import k.C0884e;
import k.C0888g;
import k.C0890h;
import k.C0894j;
import k.InterfaceC0892i;
import k.InterfaceC0896k;
import k.Y0;
/* loaded from: classes.dex */
public class ActionMenuView extends AbstractC0883d0 implements i {
    public j F;

    /* renamed from: G  reason: collision with root package name */
    public Context f5458G;

    /* renamed from: H  reason: collision with root package name */
    public int f5459H;

    /* renamed from: I  reason: collision with root package name */
    public C0890h f5460I;

    /* renamed from: J  reason: collision with root package name */
    public o f5461J;

    /* renamed from: K  reason: collision with root package name */
    public h f5462K;

    /* renamed from: L  reason: collision with root package name */
    public boolean f5463L;

    /* renamed from: M  reason: collision with root package name */
    public int f5464M;

    /* renamed from: N  reason: collision with root package name */
    public final int f5465N;

    /* renamed from: O  reason: collision with root package name */
    public final int f5466O;

    /* renamed from: P  reason: collision with root package name */
    public InterfaceC0896k f5467P;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f5465N = (int) (56.0f * f);
        this.f5466O = (int) (f * 4.0f);
        this.f5458G = context;
        this.f5459H = 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [k.j, android.widget.LinearLayout$LayoutParams] */
    public static C0894j i() {
        ?? layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.f12031a = false;
        ((LinearLayout.LayoutParams) layoutParams).gravity = 16;
        return layoutParams;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [k.j, android.widget.LinearLayout$LayoutParams] */
    public static C0894j j(ViewGroup.LayoutParams layoutParams) {
        C0894j c0894j;
        if (layoutParams != null) {
            if (layoutParams instanceof C0894j) {
                C0894j c0894j2 = (C0894j) layoutParams;
                ?? layoutParams2 = new LinearLayout.LayoutParams((ViewGroup.LayoutParams) c0894j2);
                layoutParams2.f12031a = c0894j2.f12031a;
                c0894j = layoutParams2;
            } else {
                c0894j = new LinearLayout.LayoutParams(layoutParams);
            }
            if (((LinearLayout.LayoutParams) c0894j).gravity <= 0) {
                ((LinearLayout.LayoutParams) c0894j).gravity = 16;
            }
            return c0894j;
        }
        return i();
    }

    @Override // j.i
    public final boolean a(k kVar) {
        return this.F.p(kVar, null, 0);
    }

    @Override // k.AbstractC0883d0, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0894j;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // k.AbstractC0883d0
    public final /* bridge */ /* synthetic */ C0881c0 e() {
        return i();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [k.c0, android.widget.LinearLayout$LayoutParams] */
    @Override // k.AbstractC0883d0
    public final C0881c0 f(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }

    @Override // k.AbstractC0883d0
    public final /* bridge */ /* synthetic */ C0881c0 g(ViewGroup.LayoutParams layoutParams) {
        return j(layoutParams);
    }

    @Override // k.AbstractC0883d0, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return i();
    }

    @Override // k.AbstractC0883d0, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }

    public Menu getMenu() {
        if (this.F == null) {
            Context context = getContext();
            j jVar = new j(context);
            this.F = jVar;
            jVar.f11451e = new n(this);
            C0890h c0890h = new C0890h(context);
            this.f5460I = c0890h;
            c0890h.f12007A = true;
            c0890h.f12008B = true;
            o oVar = this.f5461J;
            if (oVar == null) {
                oVar = new e(26);
            }
            c0890h.f12022u = oVar;
            this.F.b(c0890h, this.f5458G);
            C0890h c0890h2 = this.f5460I;
            c0890h2.f12024w = this;
            this.F = c0890h2.f12020s;
        }
        return this.F;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C0890h c0890h = this.f5460I;
        C0888g c0888g = c0890h.f12025x;
        if (c0888g != null) {
            return c0888g.getDrawable();
        }
        if (c0890h.f12027z) {
            return c0890h.f12026y;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f5459H;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public final boolean k(int i7) {
        boolean z7 = false;
        if (i7 == 0) {
            return false;
        }
        View childAt = getChildAt(i7 - 1);
        View childAt2 = getChildAt(i7);
        if (i7 < getChildCount() && (childAt instanceof InterfaceC0892i)) {
            z7 = ((InterfaceC0892i) childAt).a();
        }
        return (i7 <= 0 || !(childAt2 instanceof InterfaceC0892i)) ? z7 : z7 | ((InterfaceC0892i) childAt2).b();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0890h c0890h = this.f5460I;
        if (c0890h != null) {
            c0890h.f();
            C0884e c0884e = this.f5460I.f12013H;
            if (c0884e != null && c0884e.f()) {
                this.f5460I.h();
                this.f5460I.i();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0890h c0890h = this.f5460I;
        if (c0890h != null) {
            c0890h.h();
            C0884e c0884e = c0890h.f12014I;
            if (c0884e != null && c0884e.f()) {
                ((l) c0884e.f10174j).dismiss();
            }
        }
    }

    @Override // k.AbstractC0883d0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        int width;
        int i11;
        if (!this.f5463L) {
            super.onLayout(z7, i7, i8, i9, i10);
            return;
        }
        int childCount = getChildCount();
        int i12 = (i10 - i8) / 2;
        int dividerWidth = getDividerWidth();
        int i13 = i9 - i7;
        int paddingRight = (i13 - getPaddingRight()) - getPaddingLeft();
        boolean a7 = Y0.a(this);
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                C0894j c0894j = (C0894j) childAt.getLayoutParams();
                if (c0894j.f12031a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (k(i16)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a7) {
                        i11 = getPaddingLeft() + ((LinearLayout.LayoutParams) c0894j).leftMargin;
                        width = i11 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c0894j).rightMargin;
                        i11 = width - measuredWidth;
                    }
                    int i17 = i12 - (measuredHeight / 2);
                    childAt.layout(i11, i17, width, measuredHeight + i17);
                    paddingRight -= measuredWidth;
                    i14 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c0894j).leftMargin) + ((LinearLayout.LayoutParams) c0894j).rightMargin;
                    k(i16);
                    i15++;
                }
            }
        }
        if (childCount == 1 && i14 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i18 = (i13 / 2) - (measuredWidth2 / 2);
            int i19 = i12 - (measuredHeight2 / 2);
            childAt2.layout(i18, i19, measuredWidth2 + i18, measuredHeight2 + i19);
            return;
        }
        int i20 = i15 - (i14 ^ 1);
        int max = Math.max(0, i20 > 0 ? paddingRight / i20 : 0);
        if (a7) {
            int width2 = getWidth() - getPaddingRight();
            for (int i21 = 0; i21 < childCount; i21++) {
                View childAt3 = getChildAt(i21);
                C0894j c0894j2 = (C0894j) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c0894j2.f12031a) {
                    int i22 = width2 - ((LinearLayout.LayoutParams) c0894j2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i23 = i12 - (measuredHeight3 / 2);
                    childAt3.layout(i22 - measuredWidth3, i23, i22, measuredHeight3 + i23);
                    width2 = i22 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c0894j2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i24 = 0; i24 < childCount; i24++) {
            View childAt4 = getChildAt(i24);
            C0894j c0894j3 = (C0894j) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c0894j3.f12031a) {
                int i25 = paddingLeft + ((LinearLayout.LayoutParams) c0894j3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i26 = i12 - (measuredHeight4 / 2);
                childAt4.layout(i25, i26, i25 + measuredWidth4, measuredHeight4 + i26);
                paddingLeft = measuredWidth4 + ((LinearLayout.LayoutParams) c0894j3).rightMargin + max + i25;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v26 */
    @Override // k.AbstractC0883d0, android.view.View
    public final void onMeasure(int i7, int i8) {
        boolean z7;
        int i9;
        boolean z8;
        int i10;
        int i11;
        boolean z9;
        boolean z10;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        ?? r12;
        boolean z11;
        int i17;
        int i18;
        int i19;
        ActionMenuItemView actionMenuItemView;
        boolean z12;
        int i20;
        boolean z13;
        j jVar;
        boolean z14 = this.f5463L;
        if (View.MeasureSpec.getMode(i7) == 1073741824) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.f5463L = z7;
        if (z14 != z7) {
            this.f5464M = 0;
        }
        int size = View.MeasureSpec.getSize(i7);
        if (this.f5463L && (jVar = this.F) != null && size != this.f5464M) {
            this.f5464M = size;
            jVar.o(true);
        }
        int childCount = getChildCount();
        if (this.f5463L && childCount > 0) {
            int mode = View.MeasureSpec.getMode(i8);
            int size2 = View.MeasureSpec.getSize(i7);
            int size3 = View.MeasureSpec.getSize(i8);
            int paddingRight = getPaddingRight() + getPaddingLeft();
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i8, paddingBottom, -2);
            int i21 = size2 - paddingRight;
            int i22 = this.f5465N;
            int i23 = i21 / i22;
            int i24 = i21 % i22;
            if (i23 == 0) {
                setMeasuredDimension(i21, 0);
                return;
            }
            int i25 = (i24 / i23) + i22;
            int childCount2 = getChildCount();
            int i26 = 0;
            int i27 = 0;
            int i28 = 0;
            boolean z15 = false;
            int i29 = 0;
            int i30 = 0;
            long j7 = 0;
            while (true) {
                i9 = this.f5466O;
                if (i28 >= childCount2) {
                    break;
                }
                View childAt = getChildAt(i28);
                int i31 = size3;
                if (childAt.getVisibility() == 8) {
                    i18 = i21;
                    i19 = paddingBottom;
                } else {
                    boolean z16 = childAt instanceof ActionMenuItemView;
                    int i32 = i26 + 1;
                    if (z16) {
                        childAt.setPadding(i9, 0, i9, 0);
                    }
                    C0894j c0894j = (C0894j) childAt.getLayoutParams();
                    c0894j.f = false;
                    c0894j.f12033c = 0;
                    c0894j.f12032b = 0;
                    c0894j.d = false;
                    ((LinearLayout.LayoutParams) c0894j).leftMargin = 0;
                    ((LinearLayout.LayoutParams) c0894j).rightMargin = 0;
                    if (z16 && (!TextUtils.isEmpty(((ActionMenuItemView) childAt).getText()))) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    c0894j.f12034e = z11;
                    if (c0894j.f12031a) {
                        i17 = 1;
                    } else {
                        i17 = i23;
                    }
                    C0894j c0894j2 = (C0894j) childAt.getLayoutParams();
                    i18 = i21;
                    i19 = paddingBottom;
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingBottom, View.MeasureSpec.getMode(childMeasureSpec));
                    if (z16) {
                        actionMenuItemView = (ActionMenuItemView) childAt;
                    } else {
                        actionMenuItemView = null;
                    }
                    if (actionMenuItemView != null && (!TextUtils.isEmpty(actionMenuItemView.getText()))) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (i17 > 0 && (!z12 || i17 >= 2)) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i17 * i25, Integer.MIN_VALUE), makeMeasureSpec);
                        int measuredWidth = childAt.getMeasuredWidth();
                        i20 = measuredWidth / i25;
                        if (measuredWidth % i25 != 0) {
                            i20++;
                        }
                        if (z12 && i20 < 2) {
                            i20 = 2;
                        }
                    } else {
                        i20 = 0;
                    }
                    if (!c0894j2.f12031a && z12) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    c0894j2.d = z13;
                    c0894j2.f12032b = i20;
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i20 * i25, 1073741824), makeMeasureSpec);
                    i27 = Math.max(i27, i20);
                    if (c0894j.d) {
                        i29++;
                    }
                    if (c0894j.f12031a) {
                        z15 = true;
                    }
                    i23 -= i20;
                    i30 = Math.max(i30, childAt.getMeasuredHeight());
                    if (i20 == 1) {
                        j7 |= 1 << i28;
                    }
                    i26 = i32;
                }
                i28++;
                size3 = i31;
                paddingBottom = i19;
                i21 = i18;
            }
            int i33 = i21;
            int i34 = size3;
            int i35 = i30;
            if (z15 && i26 == 2) {
                z8 = true;
            } else {
                z8 = false;
            }
            boolean z17 = false;
            while (i29 > 0 && i23 > 0) {
                int i36 = Integer.MAX_VALUE;
                int i37 = 0;
                int i38 = 0;
                long j8 = 0;
                while (i38 < childCount2) {
                    int i39 = i35;
                    C0894j c0894j3 = (C0894j) getChildAt(i38).getLayoutParams();
                    boolean z18 = z17;
                    if (c0894j3.d) {
                        int i40 = c0894j3.f12032b;
                        if (i40 < i36) {
                            j8 = 1 << i38;
                            i36 = i40;
                            i37 = 1;
                        } else if (i40 == i36) {
                            i37++;
                            j8 |= 1 << i38;
                        }
                    }
                    i38++;
                    z17 = z18;
                    i35 = i39;
                }
                i11 = i35;
                z9 = z17;
                j7 |= j8;
                if (i37 > i23) {
                    i10 = mode;
                    break;
                }
                int i41 = i36 + 1;
                int i42 = 0;
                while (i42 < childCount2) {
                    View childAt2 = getChildAt(i42);
                    C0894j c0894j4 = (C0894j) childAt2.getLayoutParams();
                    int i43 = mode;
                    int i44 = childMeasureSpec;
                    int i45 = childCount2;
                    long j9 = 1 << i42;
                    if ((j8 & j9) == 0) {
                        if (c0894j4.f12032b == i41) {
                            j7 |= j9;
                        }
                    } else {
                        if (z8 && c0894j4.f12034e) {
                            r12 = 1;
                            r12 = 1;
                            if (i23 == 1) {
                                childAt2.setPadding(i9 + i25, 0, i9, 0);
                            }
                        } else {
                            r12 = 1;
                        }
                        c0894j4.f12032b += r12;
                        c0894j4.f = r12;
                        i23--;
                    }
                    i42++;
                    childMeasureSpec = i44;
                    mode = i43;
                    childCount2 = i45;
                }
                i35 = i11;
                z17 = true;
            }
            i10 = mode;
            i11 = i35;
            z9 = z17;
            int i46 = childMeasureSpec;
            int i47 = childCount2;
            if (!z15 && i26 == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i23 <= 0 || j7 == 0 || (i23 >= i26 - 1 && !z10 && i27 <= 1)) {
                i12 = i47;
            } else {
                float bitCount = Long.bitCount(j7);
                if (!z10) {
                    if ((j7 & 1) != 0 && !((C0894j) getChildAt(0).getLayoutParams()).f12034e) {
                        bitCount -= 0.5f;
                    }
                    int i48 = i47 - 1;
                    if ((j7 & (1 << i48)) != 0 && !((C0894j) getChildAt(i48).getLayoutParams()).f12034e) {
                        bitCount -= 0.5f;
                    }
                }
                if (bitCount > 0.0f) {
                    i16 = (int) ((i23 * i25) / bitCount);
                } else {
                    i16 = 0;
                }
                i12 = i47;
                for (int i49 = 0; i49 < i12; i49++) {
                    if ((j7 & (1 << i49)) != 0) {
                        View childAt3 = getChildAt(i49);
                        C0894j c0894j5 = (C0894j) childAt3.getLayoutParams();
                        if (childAt3 instanceof ActionMenuItemView) {
                            c0894j5.f12033c = i16;
                            c0894j5.f = true;
                            if (i49 == 0 && !c0894j5.f12034e) {
                                ((LinearLayout.LayoutParams) c0894j5).leftMargin = (-i16) / 2;
                            }
                            z9 = true;
                        } else if (c0894j5.f12031a) {
                            c0894j5.f12033c = i16;
                            c0894j5.f = true;
                            ((LinearLayout.LayoutParams) c0894j5).rightMargin = (-i16) / 2;
                            z9 = true;
                        } else {
                            if (i49 != 0) {
                                ((LinearLayout.LayoutParams) c0894j5).leftMargin = i16 / 2;
                            }
                            if (i49 != i12 - 1) {
                                ((LinearLayout.LayoutParams) c0894j5).rightMargin = i16 / 2;
                            }
                        }
                    }
                }
            }
            if (z9) {
                int i50 = 0;
                while (i50 < i12) {
                    View childAt4 = getChildAt(i50);
                    C0894j c0894j6 = (C0894j) childAt4.getLayoutParams();
                    if (!c0894j6.f) {
                        i15 = i46;
                    } else {
                        i15 = i46;
                        childAt4.measure(View.MeasureSpec.makeMeasureSpec((c0894j6.f12032b * i25) + c0894j6.f12033c, 1073741824), i15);
                    }
                    i50++;
                    i46 = i15;
                }
            }
            if (i10 != 1073741824) {
                i14 = i33;
                i13 = i11;
            } else {
                i13 = i34;
                i14 = i33;
            }
            setMeasuredDimension(i14, i13);
            return;
        }
        for (int i51 = 0; i51 < childCount; i51++) {
            C0894j c0894j7 = (C0894j) getChildAt(i51).getLayoutParams();
            ((LinearLayout.LayoutParams) c0894j7).rightMargin = 0;
            ((LinearLayout.LayoutParams) c0894j7).leftMargin = 0;
        }
        super.onMeasure(i7, i8);
    }

    public void setExpandedActionViewsExclusive(boolean z7) {
        this.f5460I.F = z7;
    }

    public void setOnMenuItemClickListener(InterfaceC0896k interfaceC0896k) {
        this.f5467P = interfaceC0896k;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C0890h c0890h = this.f5460I;
        C0888g c0888g = c0890h.f12025x;
        if (c0888g != null) {
            c0888g.setImageDrawable(drawable);
            return;
        }
        c0890h.f12027z = true;
        c0890h.f12026y = drawable;
    }

    public void setOverflowReserved(boolean z7) {
    }

    public void setPopupTheme(int i7) {
        if (this.f5459H != i7) {
            this.f5459H = i7;
            if (i7 == 0) {
                this.f5458G = getContext();
            } else {
                this.f5458G = new ContextThemeWrapper(getContext(), i7);
            }
        }
    }

    public void setPresenter(C0890h c0890h) {
        this.f5460I = c0890h;
        c0890h.f12024w = this;
        this.F = c0890h.f12020s;
    }

    @Override // k.AbstractC0883d0, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return j(layoutParams);
    }
}
