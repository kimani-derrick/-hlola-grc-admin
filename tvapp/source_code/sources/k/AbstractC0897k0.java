package k;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import e.AbstractC0565a;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
/* renamed from: k.k0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0897k0 implements j.r {

    /* renamed from: M  reason: collision with root package name */
    public static final Method f12036M;

    /* renamed from: N  reason: collision with root package name */
    public static final Method f12037N;

    /* renamed from: O  reason: collision with root package name */
    public static final Method f12038O;

    /* renamed from: A  reason: collision with root package name */
    public Q.b f12039A;

    /* renamed from: B  reason: collision with root package name */
    public View f12040B;

    /* renamed from: C  reason: collision with root package name */
    public AdapterView.OnItemClickListener f12041C;

    /* renamed from: H  reason: collision with root package name */
    public final Handler f12045H;

    /* renamed from: J  reason: collision with root package name */
    public Rect f12047J;

    /* renamed from: K  reason: collision with root package name */
    public boolean f12048K;

    /* renamed from: L  reason: collision with root package name */
    public final C0916u f12049L;

    /* renamed from: q  reason: collision with root package name */
    public final Context f12050q;

    /* renamed from: r  reason: collision with root package name */
    public ListAdapter f12051r;

    /* renamed from: s  reason: collision with root package name */
    public C0907p0 f12052s;

    /* renamed from: u  reason: collision with root package name */
    public int f12054u;

    /* renamed from: v  reason: collision with root package name */
    public int f12055v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f12056w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f12057x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f12058y;

    /* renamed from: t  reason: collision with root package name */
    public int f12053t = -2;

    /* renamed from: z  reason: collision with root package name */
    public int f12059z = 0;

    /* renamed from: D  reason: collision with root package name */
    public final RunnableC0891h0 f12042D = new RunnableC0891h0(this, 1);

    /* renamed from: E  reason: collision with root package name */
    public final View$OnTouchListenerC0895j0 f12043E = new View$OnTouchListenerC0895j0(this);
    public final C0893i0 F = new C0893i0(this);

    /* renamed from: G  reason: collision with root package name */
    public final RunnableC0891h0 f12044G = new RunnableC0891h0(this, 0);

    /* renamed from: I  reason: collision with root package name */
    public final Rect f12046I = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f12036M = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f12038O = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                f12037N = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [k.u, android.widget.PopupWindow] */
    public AbstractC0897k0(Context context, int i7, int i8) {
        Drawable drawable;
        int resourceId;
        this.f12050q = context;
        this.f12045H = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC0565a.f9350l, i7, i8);
        this.f12054u = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f12055v = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f12056w = true;
        }
        obtainStyledAttributes.recycle();
        ?? popupWindow = new PopupWindow(context, (AttributeSet) null, i7, i8);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(null, AbstractC0565a.f9353p, i7, i8);
        if (obtainStyledAttributes2.hasValue(2)) {
            P.m.c(popupWindow, obtainStyledAttributes2.getBoolean(2, false));
        }
        if (obtainStyledAttributes2.hasValue(0) && (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) != 0) {
            drawable = android.support.v4.media.session.b.i0(context, resourceId);
        } else {
            drawable = obtainStyledAttributes2.getDrawable(0);
        }
        popupWindow.setBackgroundDrawable(drawable);
        obtainStyledAttributes2.recycle();
        this.f12049L = popupWindow;
        popupWindow.setInputMethodMode(1);
    }

    public final void b(j.g gVar) {
        Q.b bVar = this.f12039A;
        if (bVar == null) {
            this.f12039A = new Q.b(1, this);
        } else {
            ListAdapter listAdapter = this.f12051r;
            if (listAdapter != null) {
                listAdapter.unregisterDataSetObserver(bVar);
            }
        }
        this.f12051r = gVar;
        if (gVar != null) {
            gVar.registerDataSetObserver(this.f12039A);
        }
        C0907p0 c0907p0 = this.f12052s;
        if (c0907p0 != null) {
            c0907p0.setAdapter(this.f12051r);
        }
    }

    @Override // j.r
    public final void c() {
        int i7;
        boolean z7;
        int a7;
        int makeMeasureSpec;
        int i8;
        C0907p0 c0907p0;
        int i9;
        C0907p0 c0907p02 = this.f12052s;
        C0916u c0916u = this.f12049L;
        Context context = this.f12050q;
        if (c0907p02 == null) {
            C0907p0 c0907p03 = new C0907p0(context, !this.f12048K);
            c0907p03.setHoverListener((C0909q0) this);
            this.f12052s = c0907p03;
            c0907p03.setAdapter(this.f12051r);
            this.f12052s.setOnItemClickListener(this.f12041C);
            this.f12052s.setFocusable(true);
            this.f12052s.setFocusableInTouchMode(true);
            this.f12052s.setOnItemSelectedListener(new C0885e0(0, this));
            this.f12052s.setOnScrollListener(this.F);
            c0916u.setContentView(this.f12052s);
        } else {
            ViewGroup viewGroup = (ViewGroup) c0916u.getContentView();
        }
        Drawable background = c0916u.getBackground();
        Rect rect = this.f12046I;
        if (background != null) {
            background.getPadding(rect);
            int i10 = rect.top;
            i7 = rect.bottom + i10;
            if (!this.f12056w) {
                this.f12055v = -i10;
            }
        } else {
            rect.setEmpty();
            i7 = 0;
        }
        if (c0916u.getInputMethodMode() == 2) {
            z7 = true;
        } else {
            z7 = false;
        }
        View view = this.f12040B;
        int i11 = this.f12055v;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = f12037N;
            if (method != null) {
                try {
                    a7 = ((Integer) method.invoke(c0916u, view, Integer.valueOf(i11), Boolean.valueOf(z7))).intValue();
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                }
            }
            a7 = c0916u.getMaxAvailableHeight(view, i11);
        } else {
            a7 = AbstractC0887f0.a(c0916u, view, i11, z7);
        }
        int i12 = this.f12053t;
        int i13 = -1;
        if (i12 != -2) {
            if (i12 == -1) {
                i12 = context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right);
            }
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
        } else {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
        }
        int a8 = this.f12052s.a(makeMeasureSpec, a7);
        if (a8 > 0) {
            i8 = this.f12052s.getPaddingBottom() + this.f12052s.getPaddingTop() + i7;
        } else {
            i8 = 0;
        }
        int i14 = a8 + i8;
        this.f12049L.getInputMethodMode();
        P.m.d(c0916u, 1002);
        if (c0916u.isShowing()) {
            View view2 = this.f12040B;
            Field field = K.O.f1447a;
            if (!view2.isAttachedToWindow()) {
                return;
            }
            int i15 = this.f12053t;
            if (i15 == -1) {
                i15 = -1;
            } else if (i15 == -2) {
                i15 = this.f12040B.getWidth();
            }
            c0916u.setOutsideTouchable(true);
            View view3 = this.f12040B;
            int i16 = this.f12054u;
            int i17 = this.f12055v;
            if (i15 < 0) {
                i9 = -1;
            } else {
                i9 = i15;
            }
            if (i14 >= 0) {
                i13 = i14;
            }
            c0916u.update(view3, i16, i17, i9, i13);
            return;
        }
        int i18 = this.f12053t;
        if (i18 == -1) {
            i18 = -1;
        } else if (i18 == -2) {
            i18 = this.f12040B.getWidth();
        }
        c0916u.setWidth(i18);
        c0916u.setHeight(i14);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f12036M;
            if (method2 != null) {
                try {
                    method2.invoke(c0916u, Boolean.TRUE);
                } catch (Exception unused2) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            AbstractC0889g0.b(c0916u, true);
        }
        c0916u.setOutsideTouchable(true);
        c0916u.setTouchInterceptor(this.f12043E);
        if (this.f12058y) {
            P.m.c(c0916u, this.f12057x);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method3 = f12038O;
            if (method3 != null) {
                try {
                    method3.invoke(c0916u, this.f12047J);
                } catch (Exception e3) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e3);
                }
            }
        } else {
            AbstractC0889g0.a(c0916u, this.f12047J);
        }
        c0916u.showAsDropDown(this.f12040B, this.f12054u, this.f12055v, this.f12059z);
        this.f12052s.setSelection(-1);
        if ((!this.f12048K || this.f12052s.isInTouchMode()) && (c0907p0 = this.f12052s) != null) {
            c0907p0.setListSelectionHidden(true);
            c0907p0.requestLayout();
        }
        if (!this.f12048K) {
            this.f12045H.post(this.f12044G);
        }
    }

    @Override // j.r
    public final void dismiss() {
        C0916u c0916u = this.f12049L;
        c0916u.dismiss();
        c0916u.setContentView(null);
        this.f12052s = null;
        this.f12045H.removeCallbacks(this.f12042D);
    }

    @Override // j.r
    public final boolean h() {
        return this.f12049L.isShowing();
    }

    @Override // j.r
    public final ListView i() {
        return this.f12052s;
    }
}
