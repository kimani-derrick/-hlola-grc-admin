package k;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.TextView;
import com.boxhdo.android.tv.R;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public final class U0 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: A  reason: collision with root package name */
    public static U0 f11945A;

    /* renamed from: B  reason: collision with root package name */
    public static U0 f11946B;

    /* renamed from: q  reason: collision with root package name */
    public final View f11947q;

    /* renamed from: r  reason: collision with root package name */
    public final CharSequence f11948r;

    /* renamed from: s  reason: collision with root package name */
    public final int f11949s;

    /* renamed from: t  reason: collision with root package name */
    public final T0 f11950t = new Runnable(this) { // from class: k.T0

        /* renamed from: r  reason: collision with root package name */
        public final /* synthetic */ U0 f11944r;

        {
            this.f11944r = this;
        }

        @Override // java.lang.Runnable
        public final void run() {
            switch (r2) {
                case 0:
                    this.f11944r.c(false);
                    return;
                default:
                    this.f11944r.a();
                    return;
            }
        }
    };

    /* renamed from: u  reason: collision with root package name */
    public final T0 f11951u = new Runnable(this) { // from class: k.T0

        /* renamed from: r  reason: collision with root package name */
        public final /* synthetic */ U0 f11944r;

        {
            this.f11944r = this;
        }

        @Override // java.lang.Runnable
        public final void run() {
            switch (r2) {
                case 0:
                    this.f11944r.c(false);
                    return;
                default:
                    this.f11944r.a();
                    return;
            }
        }
    };

    /* renamed from: v  reason: collision with root package name */
    public int f11952v;

    /* renamed from: w  reason: collision with root package name */
    public int f11953w;

    /* renamed from: x  reason: collision with root package name */
    public V0 f11954x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f11955y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f11956z;

    /* JADX WARN: Type inference failed for: r0v0, types: [k.T0] */
    /* JADX WARN: Type inference failed for: r0v1, types: [k.T0] */
    public U0(View view, CharSequence charSequence) {
        int scaledTouchSlop;
        this.f11947q = view;
        this.f11948r = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = K.T.f1451a;
        if (Build.VERSION.SDK_INT >= 28) {
            scaledTouchSlop = K.Q.a(viewConfiguration);
        } else {
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop() / 2;
        }
        this.f11949s = scaledTouchSlop;
        this.f11956z = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(U0 u02) {
        U0 u03 = f11945A;
        if (u03 != null) {
            u03.f11947q.removeCallbacks(u03.f11950t);
        }
        f11945A = u02;
        if (u02 != null) {
            u02.f11947q.postDelayed(u02.f11950t, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        U0 u02 = f11946B;
        View view = this.f11947q;
        if (u02 == this) {
            f11946B = null;
            V0 v02 = this.f11954x;
            if (v02 != null) {
                View view2 = (View) v02.f11961b;
                if (view2.getParent() != null) {
                    ((WindowManager) ((Context) v02.f11960a).getSystemService("window")).removeView(view2);
                }
                this.f11954x = null;
                this.f11956z = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f11945A == this) {
            b(null);
        }
        view.removeCallbacks(this.f11951u);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, k.V0] */
    public final void c(boolean z7) {
        int height;
        int i7;
        int i8;
        String str;
        int i9;
        String str2;
        int i10;
        long longPressTimeout;
        long j7;
        long j8;
        Field field = K.O.f1447a;
        View view = this.f11947q;
        if (!view.isAttachedToWindow()) {
            return;
        }
        b(null);
        U0 u02 = f11946B;
        if (u02 != null) {
            u02.a();
        }
        f11946B = this;
        this.f11955y = z7;
        Context context = view.getContext();
        ?? obj = new Object();
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        obj.d = layoutParams;
        obj.f11963e = new Rect();
        obj.f = new int[2];
        obj.f11964g = new int[2];
        obj.f11960a = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        obj.f11961b = inflate;
        obj.f11962c = (TextView) inflate.findViewById(R.id.message);
        layoutParams.setTitle(V0.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = 2132017157;
        layoutParams.flags = 24;
        this.f11954x = obj;
        int i11 = this.f11952v;
        int i12 = this.f11953w;
        boolean z8 = this.f11955y;
        View view2 = (View) obj.f11961b;
        ViewParent parent = view2.getParent();
        Context context2 = (Context) obj.f11960a;
        if (parent != null && view2.getParent() != null) {
            ((WindowManager) context2.getSystemService("window")).removeView(view2);
        }
        ((TextView) obj.f11962c).setText(this.f11948r);
        WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) obj.d;
        layoutParams2.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = context2.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
        if (view.getWidth() < dimensionPixelOffset) {
            i11 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = context2.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
            height = i12 + dimensionPixelOffset2;
            i7 = i12 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i7 = 0;
        }
        layoutParams2.gravity = 49;
        Resources resources = context2.getResources();
        if (z8) {
            i8 = R.dimen.tooltip_y_offset_touch;
        } else {
            i8 = R.dimen.tooltip_y_offset_non_touch;
        }
        int dimensionPixelOffset3 = resources.getDimensionPixelOffset(i8);
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams3 = rootView.getLayoutParams();
        if (!(layoutParams3 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams3).type != 2) {
            Context context3 = view.getContext();
            while (true) {
                if (!(context3 instanceof ContextWrapper)) {
                    break;
                } else if (context3 instanceof Activity) {
                    rootView = ((Activity) context3).getWindow().getDecorView();
                    break;
                } else {
                    context3 = ((ContextWrapper) context3).getBaseContext();
                }
            }
        }
        if (rootView == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            str2 = "window";
        } else {
            Rect rect = (Rect) obj.f11963e;
            rootView.getWindowVisibleDisplayFrame(rect);
            if (rect.left >= 0 || rect.top >= 0) {
                str = "window";
                i9 = 0;
            } else {
                Resources resources2 = context2.getResources();
                str = "window";
                int identifier = resources2.getIdentifier("status_bar_height", "dimen", "android");
                if (identifier != 0) {
                    i10 = resources2.getDimensionPixelSize(identifier);
                } else {
                    i10 = 0;
                }
                DisplayMetrics displayMetrics = resources2.getDisplayMetrics();
                i9 = 0;
                rect.set(0, i10, displayMetrics.widthPixels, displayMetrics.heightPixels);
            }
            int[] iArr = (int[]) obj.f11964g;
            rootView.getLocationOnScreen(iArr);
            int[] iArr2 = (int[]) obj.f;
            view.getLocationOnScreen(iArr2);
            int i13 = iArr2[i9] - iArr[i9];
            iArr2[i9] = i13;
            iArr2[1] = iArr2[1] - iArr[1];
            layoutParams2.x = (i13 + i11) - (rootView.getWidth() / 2);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9, i9);
            view2.measure(makeMeasureSpec, makeMeasureSpec);
            int measuredHeight = view2.getMeasuredHeight();
            int i14 = iArr2[1];
            int i15 = ((i7 + i14) - dimensionPixelOffset3) - measuredHeight;
            int i16 = i14 + height + dimensionPixelOffset3;
            if (!z8 ? measuredHeight + i16 > rect.height() : i15 >= 0) {
                layoutParams2.y = i15;
            } else {
                layoutParams2.y = i16;
            }
            str2 = str;
        }
        ((WindowManager) context2.getSystemService(str2)).addView(view2, layoutParams2);
        view.addOnAttachStateChangeListener(this);
        if (this.f11955y) {
            j8 = 2500;
        } else {
            if ((view.getWindowSystemUiVisibility() & 1) == 1) {
                longPressTimeout = ViewConfiguration.getLongPressTimeout();
                j7 = 3000;
            } else {
                longPressTimeout = ViewConfiguration.getLongPressTimeout();
                j7 = 15000;
            }
            j8 = j7 - longPressTimeout;
        }
        T0 t02 = this.f11951u;
        view.removeCallbacks(t02);
        view.postDelayed(t02, j8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0064, code lost:
        if (java.lang.Math.abs(r5 - r3.f11953w) <= r2) goto L17;
     */
    @Override // android.view.View.OnHoverListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onHover(android.view.View r4, android.view.MotionEvent r5) {
        /*
            r3 = this;
            k.V0 r4 = r3.f11954x
            r0 = 0
            if (r4 == 0) goto La
            boolean r4 = r3.f11955y
            if (r4 == 0) goto La
            return r0
        La:
            android.view.View r4 = r3.f11947q
            android.content.Context r1 = r4.getContext()
            java.lang.String r2 = "accessibility"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.view.accessibility.AccessibilityManager r1 = (android.view.accessibility.AccessibilityManager) r1
            boolean r2 = r1.isEnabled()
            if (r2 == 0) goto L25
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 == 0) goto L25
            return r0
        L25:
            int r1 = r5.getAction()
            r2 = 7
            if (r1 == r2) goto L38
            r4 = 10
            if (r1 == r4) goto L31
            goto L6f
        L31:
            r4 = 1
            r3.f11956z = r4
            r3.a()
            goto L6f
        L38:
            boolean r4 = r4.isEnabled()
            if (r4 == 0) goto L6f
            k.V0 r4 = r3.f11954x
            if (r4 != 0) goto L6f
            float r4 = r5.getX()
            int r4 = (int) r4
            float r5 = r5.getY()
            int r5 = (int) r5
            boolean r1 = r3.f11956z
            if (r1 != 0) goto L66
            int r1 = r3.f11952v
            int r1 = r4 - r1
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.f11949s
            if (r1 > r2) goto L66
            int r1 = r3.f11953w
            int r1 = r5 - r1
            int r1 = java.lang.Math.abs(r1)
            if (r1 <= r2) goto L6f
        L66:
            r3.f11952v = r4
            r3.f11953w = r5
            r3.f11956z = r0
            b(r3)
        L6f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k.U0.onHover(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.f11952v = view.getWidth() / 2;
        this.f11953w = view.getHeight() / 2;
        c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
