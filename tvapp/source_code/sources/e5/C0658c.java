package e5;

import K.O;
import M5.g;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.RecyclerView;
import com.boxhdo.android.tv.R;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import com.rubensousa.dpadrecyclerview.DpadRecyclerView;
import com.rubensousa.dpadrecyclerview.layoutmanager.PivotLayoutManager;
import d5.u;
import h5.d;
import j.f;
import j.j;
import j.l;
import j.m;
import j.n;
import j.o;
import j.s;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import w0.U;
import w0.k0;
/* renamed from: e5.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0658c {

    /* renamed from: a  reason: collision with root package name */
    public boolean f10167a;

    /* renamed from: b  reason: collision with root package name */
    public int f10168b;

    /* renamed from: c  reason: collision with root package name */
    public int f10169c;
    public View d;

    /* renamed from: e  reason: collision with root package name */
    public int f10170e;
    public boolean f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f10171g;

    /* renamed from: h  reason: collision with root package name */
    public final Object f10172h;

    /* renamed from: i  reason: collision with root package name */
    public Object f10173i;

    /* renamed from: j  reason: collision with root package name */
    public Object f10174j;

    /* renamed from: k  reason: collision with root package name */
    public Object f10175k;

    /* renamed from: l  reason: collision with root package name */
    public final Object f10176l;

    public C0658c(int i7, int i8, Context context, View view, j jVar, boolean z7) {
        this.f10170e = 8388611;
        this.f10176l = new m(this);
        this.f10171g = context;
        this.f10172h = jVar;
        this.d = view;
        this.f10167a = z7;
        this.f10168b = i7;
        this.f10169c = i8;
    }

    public static RecyclerView c(View view) {
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof RecyclerView) {
                return (RecyclerView) parent;
            }
        }
        return null;
    }

    public void a() {
        View t5;
        RecyclerView recyclerView = (RecyclerView) this.f10173i;
        if (recyclerView == null) {
            return;
        }
        int i7 = this.f10168b;
        k0 k0Var = null;
        d dVar = (d) this.f10172h;
        if (i7 == -1) {
            t5 = null;
        } else {
            t5 = dVar.f11018a.t(i7);
        }
        if (t5 != null) {
            k0Var = recyclerView.M(t5);
        }
        ArrayList arrayList = (ArrayList) this.f10174j;
        if (!(!arrayList.isEmpty())) {
            return;
        }
        Iterator it = arrayList.iterator();
        if (k0Var != null) {
            while (it.hasNext()) {
                ((u) it.next()).getClass();
            }
        } else {
            while (it.hasNext()) {
                ((u) it.next()).getClass();
            }
        }
        if (!dVar.f && !recyclerView.isLayoutRequested()) {
            U u7 = dVar.f11018a;
            int y3 = u7.y();
            for (int i8 = 0; i8 < y3; i8++) {
                View x7 = u7.x(i8);
                if (x7 != null && x7.isLayoutRequested()) {
                    Field field = O.f1447a;
                    recyclerView.postOnAnimation((E1.b) this.f10176l);
                    return;
                }
            }
        }
    }

    public void b() {
        View t5;
        RecyclerView recyclerView = (RecyclerView) this.f10173i;
        if (recyclerView == null) {
            return;
        }
        int i7 = this.f10168b;
        k0 k0Var = null;
        if (i7 == -1) {
            t5 = null;
        } else {
            t5 = ((d) this.f10172h).f11018a.t(i7);
        }
        if (t5 != null) {
            k0Var = recyclerView.M(t5);
        }
        ArrayList arrayList = (ArrayList) this.f10174j;
        if (!(!arrayList.isEmpty())) {
            return;
        }
        Iterator it = arrayList.iterator();
        if (k0Var != null) {
            while (it.hasNext()) {
                ((u) it.next()).getClass();
            }
            return;
        }
        while (it.hasNext()) {
            ((u) it.next()).getClass();
        }
    }

    public void d(View view) {
        RecyclerView recyclerView;
        k0 M6;
        View findFocus;
        g.f(view, "view");
        view.requestFocus();
        ArrayList arrayList = (ArrayList) this.f10175k;
        if (arrayList.isEmpty() || this.f10167a || (recyclerView = (RecyclerView) this.f10173i) == null || c(view) != recyclerView) {
            return;
        }
        if (view.hasFocus() && !view.isFocused() && (findFocus = view.findFocus()) != null && c(findFocus) != recyclerView) {
            return;
        }
        View C3 = recyclerView.C(view);
        if (C3 == null) {
            M6 = null;
        } else {
            M6 = recyclerView.M(C3);
        }
        if (M6 == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            RecyclerView c5 = c(recyclerView);
            if (c5 instanceof DpadRecyclerView) {
                DpadRecyclerView dpadRecyclerView = (DpadRecyclerView) c5;
                dpadRecyclerView.getClass();
                PivotLayoutManager pivotLayoutManager = dpadRecyclerView.f9185f1;
                if (pivotLayoutManager != null) {
                    pivotLayoutManager.f9198s.g(view);
                    return;
                }
                return;
            }
            return;
        }
        AbstractC0515y1.v(it.next());
        throw null;
    }

    public l e() {
        l sVar;
        if (((l) this.f10174j) == null) {
            Context context = (Context) this.f10171g;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            n.a(defaultDisplay, point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                sVar = new f((Context) this.f10171g, this.d, this.f10168b, this.f10169c, this.f10167a);
            } else {
                View view = this.d;
                int i7 = this.f10169c;
                boolean z7 = this.f10167a;
                sVar = new s(this.f10168b, i7, (Context) this.f10171g, view, (j) this.f10172h, z7);
            }
            sVar.l((j) this.f10172h);
            sVar.r((m) this.f10176l);
            sVar.n(this.d);
            sVar.j((o) this.f10173i);
            sVar.o(this.f);
            sVar.p(this.f10170e);
            this.f10174j = sVar;
        }
        return (l) this.f10174j;
    }

    public boolean f() {
        l lVar = (l) this.f10174j;
        if (lVar != null && lVar.h()) {
            return true;
        }
        return false;
    }

    public void g(View view) {
        k0 H6;
        g.f(view, "view");
        this.d = null;
        RecyclerView recyclerView = (RecyclerView) this.f10173i;
        if (recyclerView != null && (H6 = recyclerView.H(this.f10168b, false)) != null) {
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                if (parent == H6.f15576a) {
                    Iterator it = ((ArrayList) this.f10175k).iterator();
                    if (!it.hasNext()) {
                        return;
                    }
                    AbstractC0515y1.v(it.next());
                    throw null;
                }
            }
            this.d = view;
        }
    }

    public void h() {
        this.f10174j = null;
        PopupWindow.OnDismissListener onDismissListener = (PopupWindow.OnDismissListener) this.f10175k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void i(int i7, int i8, boolean z7, boolean z8) {
        l e3 = e();
        e3.s(z8);
        if (z7) {
            int i9 = this.f10170e;
            View view = this.d;
            Field field = O.f1447a;
            if ((Gravity.getAbsoluteGravity(i9, view.getLayoutDirection()) & 7) == 5) {
                i7 -= this.d.getWidth();
            }
            e3.q(i7);
            e3.t(i8);
            int i10 = (int) ((((Context) this.f10171g).getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            e3.f11490q = new Rect(i7 - i10, i8 - i10, i7 + i10, i8 + i10);
        }
        e3.c();
    }

    public boolean j(int i7, int i8) {
        int max;
        int i9 = this.f10168b;
        int i10 = this.f10169c;
        int I6 = ((U) this.f10171g).I();
        if (I6 == 0) {
            max = -1;
        } else {
            max = Math.max(0, Math.min(I6 - 1, i7));
        }
        this.f10168b = max;
        this.f10169c = i8;
        if (max == i9 && i8 == i10) {
            return false;
        }
        return true;
    }

    public C0658c(U u7, d dVar) {
        g.f(u7, "layoutManager");
        this.f10171g = u7;
        this.f10172h = dVar;
        this.f10168b = -1;
        this.f10174j = new ArrayList();
        this.f10175k = new ArrayList();
        this.f10176l = new E1.b(14, this);
    }
}
