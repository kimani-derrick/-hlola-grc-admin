package j;

import K.O;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.fragment.app.Y;
import com.boxhdo.android.tv.R;
import e5.C0658c;
import java.lang.reflect.Field;
import k.AbstractC0897k0;
import k.C0907p0;
import k.C0909q0;
/* loaded from: classes.dex */
public final class s extends l implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: B  reason: collision with root package name */
    public PopupWindow.OnDismissListener f11493B;

    /* renamed from: C  reason: collision with root package name */
    public View f11494C;

    /* renamed from: D  reason: collision with root package name */
    public View f11495D;

    /* renamed from: E  reason: collision with root package name */
    public o f11496E;
    public ViewTreeObserver F;

    /* renamed from: G  reason: collision with root package name */
    public boolean f11497G;

    /* renamed from: H  reason: collision with root package name */
    public boolean f11498H;

    /* renamed from: I  reason: collision with root package name */
    public int f11499I;

    /* renamed from: K  reason: collision with root package name */
    public boolean f11501K;

    /* renamed from: r  reason: collision with root package name */
    public final Context f11502r;

    /* renamed from: s  reason: collision with root package name */
    public final j f11503s;

    /* renamed from: t  reason: collision with root package name */
    public final g f11504t;

    /* renamed from: u  reason: collision with root package name */
    public final boolean f11505u;

    /* renamed from: v  reason: collision with root package name */
    public final int f11506v;

    /* renamed from: w  reason: collision with root package name */
    public final int f11507w;

    /* renamed from: x  reason: collision with root package name */
    public final int f11508x;

    /* renamed from: y  reason: collision with root package name */
    public final C0909q0 f11509y;

    /* renamed from: z  reason: collision with root package name */
    public final ViewTreeObserver$OnGlobalLayoutListenerC0778c f11510z = new ViewTreeObserver$OnGlobalLayoutListenerC0778c(this, 1);

    /* renamed from: A  reason: collision with root package name */
    public final Y f11492A = new Y(2, this);

    /* renamed from: J  reason: collision with root package name */
    public int f11500J = 0;

    /* JADX WARN: Type inference failed for: r7v1, types: [k.q0, k.k0] */
    public s(int i7, int i8, Context context, View view, j jVar, boolean z7) {
        this.f11502r = context;
        this.f11503s = jVar;
        this.f11505u = z7;
        this.f11504t = new g(jVar, LayoutInflater.from(context), z7, R.layout.abc_popup_menu_item_layout);
        this.f11507w = i7;
        this.f11508x = i8;
        Resources resources = context.getResources();
        this.f11506v = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f11494C = view;
        this.f11509y = new AbstractC0897k0(context, i7, i8);
        jVar.b(this, context);
    }

    @Override // j.p
    public final void b(j jVar, boolean z7) {
        if (jVar != this.f11503s) {
            return;
        }
        dismiss();
        o oVar = this.f11496E;
        if (oVar != null) {
            oVar.b(jVar, z7);
        }
    }

    @Override // j.r
    public final void c() {
        View view;
        boolean z7;
        Rect rect;
        if (!h()) {
            if (!this.f11497G && (view = this.f11494C) != null) {
                this.f11495D = view;
                C0909q0 c0909q0 = this.f11509y;
                c0909q0.f12049L.setOnDismissListener(this);
                c0909q0.f12041C = this;
                c0909q0.f12048K = true;
                c0909q0.f12049L.setFocusable(true);
                View view2 = this.f11495D;
                if (this.F == null) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
                this.F = viewTreeObserver;
                if (z7) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f11510z);
                }
                view2.addOnAttachStateChangeListener(this.f11492A);
                c0909q0.f12040B = view2;
                c0909q0.f12059z = this.f11500J;
                boolean z8 = this.f11498H;
                Context context = this.f11502r;
                g gVar = this.f11504t;
                if (!z8) {
                    this.f11499I = l.m(gVar, context, this.f11506v);
                    this.f11498H = true;
                }
                int i7 = this.f11499I;
                Drawable background = c0909q0.f12049L.getBackground();
                if (background != null) {
                    Rect rect2 = c0909q0.f12046I;
                    background.getPadding(rect2);
                    c0909q0.f12053t = rect2.left + rect2.right + i7;
                } else {
                    c0909q0.f12053t = i7;
                }
                c0909q0.f12049L.setInputMethodMode(2);
                Rect rect3 = this.f11490q;
                if (rect3 != null) {
                    rect = new Rect(rect3);
                } else {
                    rect = null;
                }
                c0909q0.f12047J = rect;
                c0909q0.c();
                C0907p0 c0907p0 = c0909q0.f12052s;
                c0907p0.setOnKeyListener(this);
                if (this.f11501K) {
                    j jVar = this.f11503s;
                    if (jVar.f11457l != null) {
                        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c0907p0, false);
                        TextView textView = (TextView) frameLayout.findViewById(16908310);
                        if (textView != null) {
                            textView.setText(jVar.f11457l);
                        }
                        frameLayout.setEnabled(false);
                        c0907p0.addHeaderView(frameLayout, null, false);
                    }
                }
                c0909q0.b(gVar);
                c0909q0.c();
                return;
            }
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // j.p
    public final boolean d() {
        return false;
    }

    @Override // j.r
    public final void dismiss() {
        if (h()) {
            this.f11509y.dismiss();
        }
    }

    @Override // j.p
    public final void f() {
        this.f11498H = false;
        g gVar = this.f11504t;
        if (gVar != null) {
            gVar.notifyDataSetChanged();
        }
    }

    @Override // j.r
    public final boolean h() {
        if (!this.f11497G && this.f11509y.f12049L.isShowing()) {
            return true;
        }
        return false;
    }

    @Override // j.r
    public final ListView i() {
        return this.f11509y.f12052s;
    }

    @Override // j.p
    public final void j(o oVar) {
        this.f11496E = oVar;
    }

    @Override // j.p
    public final boolean k(t tVar) {
        int i7;
        if (tVar.hasVisibleItems()) {
            C0658c c0658c = new C0658c(this.f11507w, this.f11508x, this.f11502r, this.f11495D, tVar, this.f11505u);
            o oVar = this.f11496E;
            c0658c.f10173i = oVar;
            l lVar = (l) c0658c.f10174j;
            if (lVar != null) {
                lVar.j(oVar);
            }
            boolean u7 = l.u(tVar);
            c0658c.f = u7;
            l lVar2 = (l) c0658c.f10174j;
            if (lVar2 != null) {
                lVar2.o(u7);
            }
            c0658c.f10175k = this.f11493B;
            this.f11493B = null;
            this.f11503s.c(false);
            C0909q0 c0909q0 = this.f11509y;
            int i8 = c0909q0.f12054u;
            if (!c0909q0.f12056w) {
                i7 = 0;
            } else {
                i7 = c0909q0.f12055v;
            }
            int i9 = this.f11500J;
            View view = this.f11494C;
            Field field = O.f1447a;
            if ((Gravity.getAbsoluteGravity(i9, view.getLayoutDirection()) & 7) == 5) {
                i8 += this.f11494C.getWidth();
            }
            if (!c0658c.f()) {
                if (c0658c.d != null) {
                    c0658c.i(i8, i7, true, true);
                }
            }
            o oVar2 = this.f11496E;
            if (oVar2 != null) {
                oVar2.c(tVar);
            }
            return true;
        }
        return false;
    }

    @Override // j.l
    public final void n(View view) {
        this.f11494C = view;
    }

    @Override // j.l
    public final void o(boolean z7) {
        this.f11504t.f11443s = z7;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f11497G = true;
        this.f11503s.c(true);
        ViewTreeObserver viewTreeObserver = this.F;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.F = this.f11495D.getViewTreeObserver();
            }
            this.F.removeGlobalOnLayoutListener(this.f11510z);
            this.F = null;
        }
        this.f11495D.removeOnAttachStateChangeListener(this.f11492A);
        PopupWindow.OnDismissListener onDismissListener = this.f11493B;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i7, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i7 == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override // j.l
    public final void p(int i7) {
        this.f11500J = i7;
    }

    @Override // j.l
    public final void q(int i7) {
        this.f11509y.f12054u = i7;
    }

    @Override // j.l
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f11493B = onDismissListener;
    }

    @Override // j.l
    public final void s(boolean z7) {
        this.f11501K = z7;
    }

    @Override // j.l
    public final void t(int i7) {
        C0909q0 c0909q0 = this.f11509y;
        c0909q0.f12055v = i7;
        c0909q0.f12056w = true;
    }

    @Override // j.l
    public final void l(j jVar) {
    }
}
