package androidx.appcompat.widget;

import H2.C0002c;
import K.InterfaceC0035k;
import K.O;
import L3.e;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.fragment.app.H;
import com.boxhdo.android.tv.R;
import e.AbstractC0565a;
import i.C0766e;
import j.j;
import j.k;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import k.C0856H;
import k.C0884e;
import k.C0890h;
import k.C0912s;
import k.C0914t;
import k.C0919v0;
import k.InterfaceC0868S;
import k.K0;
import k.L0;
import k.M0;
import k.N0;
import k.O0;
import k.P0;
import k.Q0;
import k.R0;
import k.Y0;
/* loaded from: classes.dex */
public class Toolbar extends ViewGroup implements InterfaceC0035k {

    /* renamed from: A  reason: collision with root package name */
    public int f5522A;

    /* renamed from: B  reason: collision with root package name */
    public int f5523B;

    /* renamed from: C  reason: collision with root package name */
    public int f5524C;

    /* renamed from: D  reason: collision with root package name */
    public final int f5525D;

    /* renamed from: E  reason: collision with root package name */
    public final int f5526E;
    public int F;

    /* renamed from: G  reason: collision with root package name */
    public int f5527G;

    /* renamed from: H  reason: collision with root package name */
    public int f5528H;

    /* renamed from: I  reason: collision with root package name */
    public int f5529I;

    /* renamed from: J  reason: collision with root package name */
    public C0919v0 f5530J;

    /* renamed from: K  reason: collision with root package name */
    public int f5531K;

    /* renamed from: L  reason: collision with root package name */
    public int f5532L;

    /* renamed from: M  reason: collision with root package name */
    public final int f5533M;

    /* renamed from: N  reason: collision with root package name */
    public CharSequence f5534N;

    /* renamed from: O  reason: collision with root package name */
    public CharSequence f5535O;

    /* renamed from: P  reason: collision with root package name */
    public ColorStateList f5536P;

    /* renamed from: Q  reason: collision with root package name */
    public ColorStateList f5537Q;

    /* renamed from: R  reason: collision with root package name */
    public boolean f5538R;

    /* renamed from: S  reason: collision with root package name */
    public boolean f5539S;

    /* renamed from: T  reason: collision with root package name */
    public final ArrayList f5540T;

    /* renamed from: U  reason: collision with root package name */
    public final ArrayList f5541U;

    /* renamed from: V  reason: collision with root package name */
    public final int[] f5542V;
    public final C0002c W;

    /* renamed from: a0  reason: collision with root package name */
    public ArrayList f5543a0;

    /* renamed from: b0  reason: collision with root package name */
    public final L0 f5544b0;

    /* renamed from: c0  reason: collision with root package name */
    public R0 f5545c0;

    /* renamed from: d0  reason: collision with root package name */
    public N0 f5546d0;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f5547e0;

    /* renamed from: f0  reason: collision with root package name */
    public OnBackInvokedCallback f5548f0;

    /* renamed from: g0  reason: collision with root package name */
    public OnBackInvokedDispatcher f5549g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f5550h0;

    /* renamed from: i0  reason: collision with root package name */
    public final P.b f5551i0;

    /* renamed from: q  reason: collision with root package name */
    public ActionMenuView f5552q;

    /* renamed from: r  reason: collision with root package name */
    public C0856H f5553r;

    /* renamed from: s  reason: collision with root package name */
    public C0856H f5554s;

    /* renamed from: t  reason: collision with root package name */
    public C0912s f5555t;

    /* renamed from: u  reason: collision with root package name */
    public C0914t f5556u;

    /* renamed from: v  reason: collision with root package name */
    public final Drawable f5557v;

    /* renamed from: w  reason: collision with root package name */
    public final CharSequence f5558w;

    /* renamed from: x  reason: collision with root package name */
    public C0912s f5559x;

    /* renamed from: y  reason: collision with root package name */
    public View f5560y;

    /* renamed from: z  reason: collision with root package name */
    public Context f5561z;

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [k.O0, android.view.ViewGroup$MarginLayoutParams] */
    public static O0 g() {
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.f11916b = 0;
        marginLayoutParams.f11915a = 8388627;
        return marginLayoutParams;
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i7 = 0; i7 < menu.size(); i7++) {
            arrayList.add(menu.getItem(i7));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new C0766e(getContext());
    }

    public static O0 h(ViewGroup.LayoutParams layoutParams) {
        boolean z7 = layoutParams instanceof O0;
        if (z7) {
            O0 o02 = (O0) layoutParams;
            O0 o03 = new O0(o02);
            o03.f11916b = 0;
            o03.f11916b = o02.f11916b;
            return o03;
        } else if (z7) {
            O0 o04 = new O0((O0) layoutParams);
            o04.f11916b = 0;
            return o04;
        } else if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            O0 o05 = new O0(marginLayoutParams);
            o05.f11916b = 0;
            ((ViewGroup.MarginLayoutParams) o05).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) o05).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) o05).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) o05).bottomMargin = marginLayoutParams.bottomMargin;
            return o05;
        } else {
            O0 o06 = new O0(layoutParams);
            o06.f11916b = 0;
            return o06;
        }
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(int i7, ArrayList arrayList) {
        boolean z7;
        Field field = O.f1447a;
        if (getLayoutDirection() == 1) {
            z7 = true;
        } else {
            z7 = false;
        }
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i7, getLayoutDirection());
        arrayList.clear();
        if (z7) {
            for (int i8 = childCount - 1; i8 >= 0; i8--) {
                View childAt = getChildAt(i8);
                O0 o02 = (O0) childAt.getLayoutParams();
                if (o02.f11916b == 0 && s(childAt) && i(o02.f11915a) == absoluteGravity) {
                    arrayList.add(childAt);
                }
            }
            return;
        }
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt2 = getChildAt(i9);
            O0 o03 = (O0) childAt2.getLayoutParams();
            if (o03.f11916b == 0 && s(childAt2) && i(o03.f11915a) == absoluteGravity) {
                arrayList.add(childAt2);
            }
        }
    }

    public final void b(View view, boolean z7) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        O0 g7 = layoutParams == null ? g() : !checkLayoutParams(layoutParams) ? h(layoutParams) : (O0) layoutParams;
        g7.f11916b = 1;
        if (!z7 || this.f5560y == null) {
            addView(view, g7);
            return;
        }
        view.setLayoutParams(g7);
        this.f5541U.add(view);
    }

    public final void c() {
        if (this.f5559x == null) {
            C0912s c0912s = new C0912s(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.f5559x = c0912s;
            c0912s.setImageDrawable(this.f5557v);
            this.f5559x.setContentDescription(this.f5558w);
            O0 g7 = g();
            g7.f11915a = (this.f5525D & 112) | 8388611;
            g7.f11916b = 2;
            this.f5559x.setLayoutParams(g7);
            this.f5559x.setOnClickListener(new e(7, this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof O0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, k.v0] */
    public final void d() {
        if (this.f5530J == null) {
            ?? obj = new Object();
            obj.f12103a = 0;
            obj.f12104b = 0;
            obj.f12105c = Integer.MIN_VALUE;
            obj.d = Integer.MIN_VALUE;
            obj.f12106e = 0;
            obj.f = 0;
            obj.f12107g = false;
            obj.f12108h = false;
            this.f5530J = obj;
        }
    }

    public final void e() {
        if (this.f5552q == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f5552q = actionMenuView;
            actionMenuView.setPopupTheme(this.f5522A);
            this.f5552q.setOnMenuItemClickListener(this.f5544b0);
            ActionMenuView actionMenuView2 = this.f5552q;
            L0 l02 = new L0(this);
            actionMenuView2.f5461J = null;
            actionMenuView2.f5462K = l02;
            O0 g7 = g();
            g7.f11915a = (this.f5525D & 112) | 8388613;
            this.f5552q.setLayoutParams(g7);
            b(this.f5552q, false);
        }
        ActionMenuView actionMenuView3 = this.f5552q;
        if (actionMenuView3.F == null) {
            j jVar = (j) actionMenuView3.getMenu();
            if (this.f5546d0 == null) {
                this.f5546d0 = new N0(this);
            }
            this.f5552q.setExpandedActionViewsExclusive(true);
            jVar.b(this.f5546d0, this.f5561z);
            t();
        }
    }

    public final void f() {
        if (this.f5555t == null) {
            this.f5555t = new C0912s(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            O0 g7 = g();
            g7.f11915a = (this.f5525D & 112) | 8388611;
            this.f5555t.setLayoutParams(g7);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return g();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [k.O0, android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams] */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(context, attributeSet);
        marginLayoutParams.f11915a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0565a.f9342b);
        marginLayoutParams.f11915a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        marginLayoutParams.f11916b = 0;
        return marginLayoutParams;
    }

    public CharSequence getCollapseContentDescription() {
        C0912s c0912s = this.f5559x;
        if (c0912s != null) {
            return c0912s.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        C0912s c0912s = this.f5559x;
        if (c0912s != null) {
            return c0912s.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        C0919v0 c0919v0 = this.f5530J;
        if (c0919v0 != null) {
            if (c0919v0.f12107g) {
                return c0919v0.f12103a;
            }
            return c0919v0.f12104b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i7 = this.f5532L;
        return i7 != Integer.MIN_VALUE ? i7 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        C0919v0 c0919v0 = this.f5530J;
        if (c0919v0 != null) {
            return c0919v0.f12103a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        C0919v0 c0919v0 = this.f5530J;
        if (c0919v0 != null) {
            return c0919v0.f12104b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        C0919v0 c0919v0 = this.f5530J;
        if (c0919v0 != null) {
            if (c0919v0.f12107g) {
                return c0919v0.f12104b;
            }
            return c0919v0.f12103a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i7 = this.f5531K;
        return i7 != Integer.MIN_VALUE ? i7 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        j jVar;
        ActionMenuView actionMenuView = this.f5552q;
        if (actionMenuView != null && (jVar = actionMenuView.F) != null && jVar.hasVisibleItems()) {
            return Math.max(getContentInsetEnd(), Math.max(this.f5532L, 0));
        }
        return getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        Field field = O.f1447a;
        if (getLayoutDirection() == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        Field field = O.f1447a;
        if (getLayoutDirection() == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f5531K, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        C0914t c0914t = this.f5556u;
        if (c0914t != null) {
            return c0914t.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        C0914t c0914t = this.f5556u;
        if (c0914t != null) {
            return c0914t.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f5552q.getMenu();
    }

    public View getNavButtonView() {
        return this.f5555t;
    }

    public CharSequence getNavigationContentDescription() {
        C0912s c0912s = this.f5555t;
        if (c0912s != null) {
            return c0912s.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        C0912s c0912s = this.f5555t;
        if (c0912s != null) {
            return c0912s.getDrawable();
        }
        return null;
    }

    public C0890h getOuterActionMenuPresenter() {
        return null;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f5552q.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f5561z;
    }

    public int getPopupTheme() {
        return this.f5522A;
    }

    public CharSequence getSubtitle() {
        return this.f5535O;
    }

    public final TextView getSubtitleTextView() {
        return this.f5554s;
    }

    public CharSequence getTitle() {
        return this.f5534N;
    }

    public int getTitleMarginBottom() {
        return this.f5529I;
    }

    public int getTitleMarginEnd() {
        return this.f5527G;
    }

    public int getTitleMarginStart() {
        return this.F;
    }

    public int getTitleMarginTop() {
        return this.f5528H;
    }

    public final TextView getTitleTextView() {
        return this.f5553r;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [k.R0, java.lang.Object] */
    public InterfaceC0868S getWrapper() {
        boolean z7;
        Drawable drawable;
        if (this.f5545c0 == null) {
            ?? obj = new Object();
            obj.f11939l = 0;
            obj.f11930a = this;
            obj.f11935h = getTitle();
            obj.f11936i = getSubtitle();
            if (obj.f11935h != null) {
                z7 = true;
            } else {
                z7 = false;
            }
            obj.f11934g = z7;
            obj.f = getNavigationIcon();
            String str = null;
            g5.b C3 = g5.b.C(getContext(), null, AbstractC0565a.f9341a, R.attr.actionBarStyle, 0);
            obj.f11940m = C3.z(15);
            TypedArray typedArray = (TypedArray) C3.f10842s;
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                obj.f11934g = true;
                obj.f11935h = text;
                if ((obj.f11931b & 8) != 0) {
                    Toolbar toolbar = obj.f11930a;
                    toolbar.setTitle(text);
                    if (obj.f11934g) {
                        O.j(toolbar.getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                obj.f11936i = text2;
                if ((obj.f11931b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable z8 = C3.z(20);
            if (z8 != null) {
                obj.f11933e = z8;
                obj.c();
            }
            Drawable z9 = C3.z(17);
            if (z9 != null) {
                obj.d = z9;
                obj.c();
            }
            if (obj.f == null && (drawable = obj.f11940m) != null) {
                obj.f = drawable;
                int i7 = obj.f11931b & 4;
                Toolbar toolbar2 = obj.f11930a;
                if (i7 != 0) {
                    toolbar2.setNavigationIcon(drawable);
                } else {
                    toolbar2.setNavigationIcon((Drawable) null);
                }
            }
            obj.a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View inflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = obj.f11932c;
                if (view != null && (obj.f11931b & 16) != 0) {
                    removeView(view);
                }
                obj.f11932c = inflate;
                if (inflate != null && (obj.f11931b & 16) != 0) {
                    addView(inflate);
                }
                obj.a(obj.f11931b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = layoutDimension;
                setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int max = Math.max(dimensionPixelOffset, 0);
                int max2 = Math.max(dimensionPixelOffset2, 0);
                d();
                this.f5530J.a(max, max2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.f5523B = resourceId2;
                C0856H c0856h = this.f5553r;
                if (c0856h != null) {
                    c0856h.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.f5524C = resourceId3;
                C0856H c0856h2 = this.f5554s;
                if (c0856h2 != null) {
                    c0856h2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            C3.D();
            if (R.string.abc_action_bar_up_description != obj.f11939l) {
                obj.f11939l = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i8 = obj.f11939l;
                    if (i8 != 0) {
                        str = getContext().getString(i8);
                    }
                    obj.f11937j = str;
                    obj.b();
                }
            }
            obj.f11937j = getNavigationContentDescription();
            setNavigationOnClickListener(new e(obj));
            this.f5545c0 = obj;
        }
        return this.f5545c0;
    }

    public final int i(int i7) {
        Field field = O.f1447a;
        int layoutDirection = getLayoutDirection();
        int absoluteGravity = Gravity.getAbsoluteGravity(i7, layoutDirection) & 7;
        if (absoluteGravity != 1 && absoluteGravity != 3 && absoluteGravity != 5) {
            if (layoutDirection != 1) {
                return 3;
            }
            return 5;
        }
        return absoluteGravity;
    }

    public final int j(View view, int i7) {
        int i8;
        O0 o02 = (O0) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        if (i7 > 0) {
            i8 = (measuredHeight - i7) / 2;
        } else {
            i8 = 0;
        }
        int i9 = o02.f11915a & 112;
        if (i9 != 16 && i9 != 48 && i9 != 80) {
            i9 = this.f5533M & 112;
        }
        if (i9 != 48) {
            if (i9 != 80) {
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int height = getHeight();
                int i10 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
                int i11 = ((ViewGroup.MarginLayoutParams) o02).topMargin;
                if (i10 < i11) {
                    i10 = i11;
                } else {
                    int i12 = (((height - paddingBottom) - measuredHeight) - i10) - paddingTop;
                    int i13 = ((ViewGroup.MarginLayoutParams) o02).bottomMargin;
                    if (i12 < i13) {
                        i10 = Math.max(0, i10 - (i13 - i12));
                    }
                }
                return paddingTop + i10;
            }
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) o02).bottomMargin) - i8;
        }
        return getPaddingTop() - i8;
    }

    public final void m() {
        Iterator it = this.f5543a0.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator it2 = ((CopyOnWriteArrayList) this.W.f1018s).iterator();
        while (it2.hasNext()) {
            ((H) it2.next()).f5895a.k();
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f5543a0 = currentMenuItems2;
    }

    public final boolean n(View view) {
        return view.getParent() == this || this.f5541U.contains(view);
    }

    public final int o(View view, int i7, int i8, int[] iArr) {
        O0 o02 = (O0) view.getLayoutParams();
        int i9 = ((ViewGroup.MarginLayoutParams) o02).leftMargin - iArr[0];
        int max = Math.max(0, i9) + i7;
        iArr[0] = Math.max(0, -i9);
        int j7 = j(view, i8);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, j7, max + measuredWidth, view.getMeasuredHeight() + j7);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) o02).rightMargin + max;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        t();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f5551i0);
        t();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f5539S = false;
        }
        if (!this.f5539S) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f5539S = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f5539S = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0291 A[LOOP:0: B:111:0x028f->B:112:0x0291, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02ae A[LOOP:1: B:114:0x02ac->B:115:0x02ae, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02cc A[LOOP:2: B:117:0x02ca->B:118:0x02cc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x031b A[LOOP:3: B:126:0x0319->B:127:0x031b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0218  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 812
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i8) {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean a7 = Y0.a(this);
        int i16 = !a7 ? 1 : 0;
        int i17 = 0;
        if (s(this.f5555t)) {
            r(this.f5555t, i7, 0, i8, this.f5526E);
            i9 = k(this.f5555t) + this.f5555t.getMeasuredWidth();
            i10 = Math.max(0, l(this.f5555t) + this.f5555t.getMeasuredHeight());
            i11 = View.combineMeasuredStates(0, this.f5555t.getMeasuredState());
        } else {
            i9 = 0;
            i10 = 0;
            i11 = 0;
        }
        if (s(this.f5559x)) {
            r(this.f5559x, i7, 0, i8, this.f5526E);
            i9 = k(this.f5559x) + this.f5559x.getMeasuredWidth();
            i10 = Math.max(i10, l(this.f5559x) + this.f5559x.getMeasuredHeight());
            i11 = View.combineMeasuredStates(i11, this.f5559x.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i9);
        int max2 = Math.max(0, currentContentInsetStart - i9);
        int[] iArr = this.f5542V;
        iArr[a7 ? 1 : 0] = max2;
        if (s(this.f5552q)) {
            r(this.f5552q, i7, max, i8, this.f5526E);
            i12 = k(this.f5552q) + this.f5552q.getMeasuredWidth();
            i10 = Math.max(i10, l(this.f5552q) + this.f5552q.getMeasuredHeight());
            i11 = View.combineMeasuredStates(i11, this.f5552q.getMeasuredState());
        } else {
            i12 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max3 = max + Math.max(currentContentInsetEnd, i12);
        iArr[i16] = Math.max(0, currentContentInsetEnd - i12);
        if (s(this.f5560y)) {
            max3 += q(this.f5560y, i7, max3, i8, 0, iArr);
            i10 = Math.max(i10, l(this.f5560y) + this.f5560y.getMeasuredHeight());
            i11 = View.combineMeasuredStates(i11, this.f5560y.getMeasuredState());
        }
        if (s(this.f5556u)) {
            max3 += q(this.f5556u, i7, max3, i8, 0, iArr);
            i10 = Math.max(i10, l(this.f5556u) + this.f5556u.getMeasuredHeight());
            i11 = View.combineMeasuredStates(i11, this.f5556u.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            if (((O0) childAt.getLayoutParams()).f11916b == 0 && s(childAt)) {
                max3 += q(childAt, i7, max3, i8, 0, iArr);
                i10 = Math.max(i10, l(childAt) + childAt.getMeasuredHeight());
                i11 = View.combineMeasuredStates(i11, childAt.getMeasuredState());
            }
        }
        int i19 = this.f5528H + this.f5529I;
        int i20 = this.F + this.f5527G;
        if (s(this.f5553r)) {
            q(this.f5553r, i7, max3 + i20, i8, i19, iArr);
            int k5 = k(this.f5553r) + this.f5553r.getMeasuredWidth();
            i13 = l(this.f5553r) + this.f5553r.getMeasuredHeight();
            i14 = View.combineMeasuredStates(i11, this.f5553r.getMeasuredState());
            i15 = k5;
        } else {
            i13 = 0;
            i14 = i11;
            i15 = 0;
        }
        if (s(this.f5554s)) {
            i15 = Math.max(i15, q(this.f5554s, i7, max3 + i20, i8, i13 + i19, iArr));
            i13 += l(this.f5554s) + this.f5554s.getMeasuredHeight();
            i14 = View.combineMeasuredStates(i14, this.f5554s.getMeasuredState());
        }
        int max4 = Math.max(i10, i13);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max4;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight + max3 + i15, getSuggestedMinimumWidth()), i7, (-16777216) & i14);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i8, i14 << 16);
        if (this.f5547e0) {
            int childCount2 = getChildCount();
            for (int i21 = 0; i21 < childCount2; i21++) {
                View childAt2 = getChildAt(i21);
                if (!s(childAt2) || childAt2.getMeasuredWidth() <= 0 || childAt2.getMeasuredHeight() <= 0) {
                }
            }
            setMeasuredDimension(resolveSizeAndState, i17);
        }
        i17 = resolveSizeAndState2;
        setMeasuredDimension(resolveSizeAndState, i17);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        j jVar;
        MenuItem findItem;
        if (!(parcelable instanceof Q0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Q0 q02 = (Q0) parcelable;
        super.onRestoreInstanceState(q02.f2938q);
        ActionMenuView actionMenuView = this.f5552q;
        if (actionMenuView != null) {
            jVar = actionMenuView.F;
        } else {
            jVar = null;
        }
        int i7 = q02.f11928s;
        if (i7 != 0 && this.f5546d0 != null && jVar != null && (findItem = jVar.findItem(i7)) != null) {
            findItem.expandActionView();
        }
        if (q02.f11929t) {
            P.b bVar = this.f5551i0;
            removeCallbacks(bVar);
            post(bVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0027, code lost:
        if (r1 != Integer.MIN_VALUE) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002a, code lost:
        r1 = r0.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002c, code lost:
        r0.f12104b = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003a, code lost:
        if (r1 != Integer.MIN_VALUE) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
        return;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onRtlPropertiesChanged(int r3) {
        /*
            r2 = this;
            super.onRtlPropertiesChanged(r3)
            r2.d()
            k.v0 r0 = r2.f5530J
            r1 = 1
            if (r3 != r1) goto Lc
            goto Ld
        Lc:
            r1 = 0
        Ld:
            boolean r3 = r0.f12107g
            if (r1 != r3) goto L12
            goto L45
        L12:
            r0.f12107g = r1
            boolean r3 = r0.f12108h
            if (r3 == 0) goto L3d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == 0) goto L2f
            int r1 = r0.d
            if (r1 == r3) goto L21
            goto L23
        L21:
            int r1 = r0.f12106e
        L23:
            r0.f12103a = r1
            int r1 = r0.f12105c
            if (r1 == r3) goto L2a
            goto L2c
        L2a:
            int r1 = r0.f
        L2c:
            r0.f12104b = r1
            goto L45
        L2f:
            int r1 = r0.f12105c
            if (r1 == r3) goto L34
            goto L36
        L34:
            int r1 = r0.f12106e
        L36:
            r0.f12103a = r1
            int r1 = r0.d
            if (r1 == r3) goto L2a
            goto L2c
        L3d:
            int r3 = r0.f12106e
            r0.f12103a = r3
            int r3 = r0.f
            r0.f12104b = r3
        L45:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onRtlPropertiesChanged(int):void");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [k.Q0, android.os.Parcelable, S.b] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z7;
        C0890h c0890h;
        C0884e c0884e;
        k kVar;
        ?? bVar = new S.b(super.onSaveInstanceState());
        N0 n02 = this.f5546d0;
        if (n02 != null && (kVar = n02.f11913r) != null) {
            bVar.f11928s = kVar.f11467a;
        }
        ActionMenuView actionMenuView = this.f5552q;
        if (actionMenuView != null && (c0890h = actionMenuView.f5460I) != null && (c0884e = c0890h.f12013H) != null && c0884e.f()) {
            z7 = true;
        } else {
            z7 = false;
        }
        bVar.f11929t = z7;
        return bVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f5538R = false;
        }
        if (!this.f5538R) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f5538R = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f5538R = false;
        }
        return true;
    }

    public final int p(View view, int i7, int i8, int[] iArr) {
        O0 o02 = (O0) view.getLayoutParams();
        int i9 = ((ViewGroup.MarginLayoutParams) o02).rightMargin - iArr[1];
        int max = i7 - Math.max(0, i9);
        iArr[1] = Math.max(0, -i9);
        int j7 = j(view, i8);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, j7, max, view.getMeasuredHeight() + j7);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) o02).leftMargin);
    }

    public final int q(View view, int i7, int i8, int i9, int i10, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i11 = marginLayoutParams.leftMargin - iArr[0];
        int i12 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i12) + Math.max(0, i11);
        iArr[0] = Math.max(0, -i11);
        iArr[1] = Math.max(0, -i12);
        view.measure(ViewGroup.getChildMeasureSpec(i7, getPaddingRight() + getPaddingLeft() + max + i8, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i9, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i10, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final void r(View view, int i7, int i8, int i9, int i10) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i7, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i8, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i9, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i10 >= 0) {
            if (mode != 0) {
                i10 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i10);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i10, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean s(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public void setBackInvokedCallbackEnabled(boolean z7) {
        if (this.f5550h0 != z7) {
            this.f5550h0 = z7;
            t();
        }
    }

    public void setCollapseContentDescription(int i7) {
        setCollapseContentDescription(i7 != 0 ? getContext().getText(i7) : null);
    }

    public void setCollapseIcon(int i7) {
        setCollapseIcon(android.support.v4.media.session.b.i0(getContext(), i7));
    }

    public void setCollapsible(boolean z7) {
        this.f5547e0 = z7;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i7) {
        if (i7 < 0) {
            i7 = Integer.MIN_VALUE;
        }
        if (i7 != this.f5532L) {
            this.f5532L = i7;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i7) {
        if (i7 < 0) {
            i7 = Integer.MIN_VALUE;
        }
        if (i7 != this.f5531K) {
            this.f5531K = i7;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i7) {
        setLogo(android.support.v4.media.session.b.i0(getContext(), i7));
    }

    public void setLogoDescription(int i7) {
        setLogoDescription(getContext().getText(i7));
    }

    public void setNavigationContentDescription(int i7) {
        setNavigationContentDescription(i7 != 0 ? getContext().getText(i7) : null);
    }

    public void setNavigationIcon(int i7) {
        setNavigationIcon(android.support.v4.media.session.b.i0(getContext(), i7));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        f();
        this.f5555t.setOnClickListener(onClickListener);
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f5552q.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i7) {
        if (this.f5522A != i7) {
            this.f5522A = i7;
            if (i7 == 0) {
                this.f5561z = getContext();
            } else {
                this.f5561z = new ContextThemeWrapper(getContext(), i7);
            }
        }
    }

    public void setSubtitle(int i7) {
        setSubtitle(getContext().getText(i7));
    }

    public void setSubtitleTextColor(int i7) {
        setSubtitleTextColor(ColorStateList.valueOf(i7));
    }

    public void setTitle(int i7) {
        setTitle(getContext().getText(i7));
    }

    public void setTitleMarginBottom(int i7) {
        this.f5529I = i7;
        requestLayout();
    }

    public void setTitleMarginEnd(int i7) {
        this.f5527G = i7;
        requestLayout();
    }

    public void setTitleMarginStart(int i7) {
        this.F = i7;
        requestLayout();
    }

    public void setTitleMarginTop(int i7) {
        this.f5528H = i7;
        requestLayout();
    }

    public void setTitleTextColor(int i7) {
        setTitleTextColor(ColorStateList.valueOf(i7));
    }

    public final void t() {
        boolean z7;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher a7 = M0.a(this);
            N0 n02 = this.f5546d0;
            if (n02 != null && n02.f11913r != null && a7 != null) {
                Field field = O.f1447a;
                if (isAttachedToWindow() && this.f5550h0) {
                    z7 = true;
                    if (!z7 && this.f5549g0 == null) {
                        if (this.f5548f0 == null) {
                            this.f5548f0 = M0.b(new K0(this, 0));
                        }
                        M0.c(a7, this.f5548f0);
                        this.f5549g0 = a7;
                        return;
                    } else if (z7 && (onBackInvokedDispatcher = this.f5549g0) != null) {
                        M0.d(onBackInvokedDispatcher, this.f5548f0);
                        this.f5549g0 = null;
                        return;
                    }
                }
            }
            z7 = false;
            if (!z7) {
            }
            if (z7) {
            }
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.f5533M = 8388627;
        this.f5540T = new ArrayList();
        this.f5541U = new ArrayList();
        this.f5542V = new int[2];
        this.W = new C0002c(new K0(this, 1));
        this.f5543a0 = new ArrayList();
        this.f5544b0 = new L0(this);
        this.f5551i0 = new P.b(13, this);
        Context context2 = getContext();
        int[] iArr = AbstractC0565a.f9357t;
        g5.b C3 = g5.b.C(context2, attributeSet, iArr, R.attr.toolbarStyle, 0);
        O.h(this, context, iArr, attributeSet, (TypedArray) C3.f10842s, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) C3.f10842s;
        this.f5523B = typedArray.getResourceId(28, 0);
        this.f5524C = typedArray.getResourceId(19, 0);
        this.f5533M = typedArray.getInteger(0, 8388627);
        this.f5525D = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f5529I = dimensionPixelOffset;
        this.f5528H = dimensionPixelOffset;
        this.f5527G = dimensionPixelOffset;
        this.F = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.F = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f5527G = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f5528H = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f5529I = dimensionPixelOffset5;
        }
        this.f5526E = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        C0919v0 c0919v0 = this.f5530J;
        c0919v0.f12108h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            c0919v0.f12106e = dimensionPixelSize;
            c0919v0.f12103a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            c0919v0.f = dimensionPixelSize2;
            c0919v0.f12104b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            c0919v0.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f5531K = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.f5532L = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f5557v = C3.z(4);
        this.f5558w = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f5561z = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable z7 = C3.z(16);
        if (z7 != null) {
            setNavigationIcon(z7);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable z8 = C3.z(11);
        if (z8 != null) {
            setLogo(z8);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(C3.y(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(C3.y(20));
        }
        if (typedArray.hasValue(14)) {
            getMenuInflater().inflate(typedArray.getResourceId(14, 0), getMenu());
        }
        C3.D();
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        C0912s c0912s = this.f5559x;
        if (c0912s != null) {
            c0912s.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.f5559x.setImageDrawable(drawable);
            return;
        }
        C0912s c0912s = this.f5559x;
        if (c0912s != null) {
            c0912s.setImageDrawable(this.f5557v);
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f5556u == null) {
                this.f5556u = new C0914t(getContext(), 0);
            }
            if (!n(this.f5556u)) {
                b(this.f5556u, true);
            }
        } else {
            C0914t c0914t = this.f5556u;
            if (c0914t != null && n(c0914t)) {
                removeView(this.f5556u);
                this.f5541U.remove(this.f5556u);
            }
        }
        C0914t c0914t2 = this.f5556u;
        if (c0914t2 != null) {
            c0914t2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f5556u == null) {
            this.f5556u = new C0914t(getContext(), 0);
        }
        C0914t c0914t = this.f5556u;
        if (c0914t != null) {
            c0914t.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            f();
        }
        C0912s c0912s = this.f5555t;
        if (c0912s != null) {
            c0912s.setContentDescription(charSequence);
            p6.d.G(this.f5555t, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            f();
            if (!n(this.f5555t)) {
                b(this.f5555t, true);
            }
        } else {
            C0912s c0912s = this.f5555t;
            if (c0912s != null && n(c0912s)) {
                removeView(this.f5555t);
                this.f5541U.remove(this.f5555t);
            }
        }
        C0912s c0912s2 = this.f5555t;
        if (c0912s2 != null) {
            c0912s2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C0856H c0856h = this.f5554s;
            if (c0856h != null && n(c0856h)) {
                removeView(this.f5554s);
                this.f5541U.remove(this.f5554s);
            }
        } else {
            if (this.f5554s == null) {
                Context context = getContext();
                C0856H c0856h2 = new C0856H(context, null);
                this.f5554s = c0856h2;
                c0856h2.setSingleLine();
                this.f5554s.setEllipsize(TextUtils.TruncateAt.END);
                int i7 = this.f5524C;
                if (i7 != 0) {
                    this.f5554s.setTextAppearance(context, i7);
                }
                ColorStateList colorStateList = this.f5537Q;
                if (colorStateList != null) {
                    this.f5554s.setTextColor(colorStateList);
                }
            }
            if (!n(this.f5554s)) {
                b(this.f5554s, true);
            }
        }
        C0856H c0856h3 = this.f5554s;
        if (c0856h3 != null) {
            c0856h3.setText(charSequence);
        }
        this.f5535O = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f5537Q = colorStateList;
        C0856H c0856h = this.f5554s;
        if (c0856h != null) {
            c0856h.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C0856H c0856h = this.f5553r;
            if (c0856h != null && n(c0856h)) {
                removeView(this.f5553r);
                this.f5541U.remove(this.f5553r);
            }
        } else {
            if (this.f5553r == null) {
                Context context = getContext();
                C0856H c0856h2 = new C0856H(context, null);
                this.f5553r = c0856h2;
                c0856h2.setSingleLine();
                this.f5553r.setEllipsize(TextUtils.TruncateAt.END);
                int i7 = this.f5523B;
                if (i7 != 0) {
                    this.f5553r.setTextAppearance(context, i7);
                }
                ColorStateList colorStateList = this.f5536P;
                if (colorStateList != null) {
                    this.f5553r.setTextColor(colorStateList);
                }
            }
            if (!n(this.f5553r)) {
                b(this.f5553r, true);
            }
        }
        C0856H c0856h3 = this.f5553r;
        if (c0856h3 != null) {
            c0856h3.setText(charSequence);
        }
        this.f5534N = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f5536P = colorStateList;
        C0856H c0856h = this.f5553r;
        if (c0856h != null) {
            c0856h.setTextColor(colorStateList);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return h(layoutParams);
    }

    public void setOnMenuItemClickListener(P0 p02) {
    }
}
