package k;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import com.boxhdo.android.tv.R;
import java.util.ArrayList;
/* renamed from: k.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0890h implements j.p {

    /* renamed from: A  reason: collision with root package name */
    public boolean f12007A;

    /* renamed from: B  reason: collision with root package name */
    public boolean f12008B;

    /* renamed from: C  reason: collision with root package name */
    public int f12009C;

    /* renamed from: D  reason: collision with root package name */
    public int f12010D;

    /* renamed from: E  reason: collision with root package name */
    public int f12011E;
    public boolean F;

    /* renamed from: H  reason: collision with root package name */
    public C0884e f12013H;

    /* renamed from: I  reason: collision with root package name */
    public C0884e f12014I;

    /* renamed from: J  reason: collision with root package name */
    public R3.a f12015J;

    /* renamed from: K  reason: collision with root package name */
    public C0886f f12016K;

    /* renamed from: q  reason: collision with root package name */
    public final Context f12018q;

    /* renamed from: r  reason: collision with root package name */
    public Context f12019r;

    /* renamed from: s  reason: collision with root package name */
    public j.j f12020s;

    /* renamed from: t  reason: collision with root package name */
    public final LayoutInflater f12021t;

    /* renamed from: u  reason: collision with root package name */
    public j.o f12022u;

    /* renamed from: w  reason: collision with root package name */
    public ActionMenuView f12024w;

    /* renamed from: x  reason: collision with root package name */
    public C0888g f12025x;

    /* renamed from: y  reason: collision with root package name */
    public Drawable f12026y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f12027z;

    /* renamed from: v  reason: collision with root package name */
    public final int f12023v = R.layout.abc_action_menu_item_layout;

    /* renamed from: G  reason: collision with root package name */
    public final SparseBooleanArray f12012G = new SparseBooleanArray();

    /* renamed from: L  reason: collision with root package name */
    public final Z5.n f12017L = new Z5.n(this);

    public C0890h(Context context) {
        this.f12018q = context;
        this.f12021t = LayoutInflater.from(context);
    }

    @Override // j.p
    public final void a(Context context, j.j jVar) {
        this.f12019r = context;
        LayoutInflater.from(context);
        this.f12020s = jVar;
        Resources resources = context.getResources();
        if (!this.f12008B) {
            this.f12007A = true;
        }
        int i7 = 2;
        this.f12009C = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i8 = configuration.screenWidthDp;
        int i9 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp <= 600 && i8 <= 600 && ((i8 <= 960 || i9 <= 720) && (i8 <= 720 || i9 <= 960))) {
            if (i8 < 500 && ((i8 <= 640 || i9 <= 480) && (i8 <= 480 || i9 <= 640))) {
                if (i8 >= 360) {
                    i7 = 3;
                }
            } else {
                i7 = 4;
            }
        } else {
            i7 = 5;
        }
        this.f12011E = i7;
        int i10 = this.f12009C;
        if (this.f12007A) {
            if (this.f12025x == null) {
                C0888g c0888g = new C0888g(this, this.f12018q);
                this.f12025x = c0888g;
                if (this.f12027z) {
                    c0888g.setImageDrawable(this.f12026y);
                    this.f12026y = null;
                    this.f12027z = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f12025x.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i10 -= this.f12025x.getMeasuredWidth();
        } else {
            this.f12025x = null;
        }
        this.f12010D = i10;
        float f = resources.getDisplayMetrics().density;
    }

    @Override // j.p
    public final void b(j.j jVar, boolean z7) {
        h();
        C0884e c0884e = this.f12014I;
        if (c0884e != null && c0884e.f()) {
            ((j.l) c0884e.f10174j).dismiss();
        }
        j.o oVar = this.f12022u;
        if (oVar != null) {
            oVar.b(jVar, z7);
        }
    }

    public final View c(j.k kVar, View view, ViewGroup viewGroup) {
        j.q qVar;
        View view2 = kVar.f11489z;
        if (view2 == null) {
            view2 = null;
        }
        int i7 = 0;
        if (view2 == null || kVar.c()) {
            if (view instanceof j.q) {
                qVar = (j.q) view;
            } else {
                qVar = (j.q) this.f12021t.inflate(this.f12023v, viewGroup, false);
            }
            qVar.c(kVar);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) qVar;
            actionMenuItemView.setItemInvoker(this.f12024w);
            if (this.f12016K == null) {
                this.f12016K = new C0886f(this);
            }
            actionMenuItemView.setPopupCallback(this.f12016K);
            view2 = (View) qVar;
        }
        if (kVar.f11466B) {
            i7 = 8;
        }
        view2.setVisibility(i7);
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof C0894j)) {
            view2.setLayoutParams(ActionMenuView.j(layoutParams));
        }
        return view2;
    }

    @Override // j.p
    public final boolean d() {
        int i7;
        ArrayList arrayList;
        int i8;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        j.j jVar = this.f12020s;
        if (jVar != null) {
            arrayList = jVar.k();
            i7 = arrayList.size();
        } else {
            i7 = 0;
            arrayList = null;
        }
        int i9 = this.f12011E;
        int i10 = this.f12010D;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ActionMenuView actionMenuView = this.f12024w;
        int i11 = 0;
        boolean z11 = false;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            i8 = 2;
            z7 = true;
            if (i11 >= i7) {
                break;
            }
            j.k kVar = (j.k) arrayList.get(i11);
            int i14 = kVar.f11488y;
            if ((i14 & 2) == 2) {
                i12++;
            } else if ((i14 & 1) == 1) {
                i13++;
            } else {
                z11 = true;
            }
            if (this.F && kVar.f11466B) {
                i9 = 0;
            }
            i11++;
        }
        if (this.f12007A && (z11 || i13 + i12 > i9)) {
            i9--;
        }
        int i15 = i9 - i12;
        SparseBooleanArray sparseBooleanArray = this.f12012G;
        sparseBooleanArray.clear();
        int i16 = 0;
        int i17 = 0;
        while (i16 < i7) {
            j.k kVar2 = (j.k) arrayList.get(i16);
            int i18 = kVar2.f11488y;
            if ((i18 & 2) == i8) {
                z8 = z7;
            } else {
                z8 = false;
            }
            int i19 = kVar2.f11468b;
            if (z8) {
                View c5 = c(kVar2, null, actionMenuView);
                c5.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = c5.getMeasuredWidth();
                i10 -= measuredWidth;
                if (i17 == 0) {
                    i17 = measuredWidth;
                }
                if (i19 != 0) {
                    sparseBooleanArray.put(i19, z7);
                }
                kVar2.f(z7);
            } else if ((i18 & 1) == z7) {
                boolean z12 = sparseBooleanArray.get(i19);
                if ((i15 > 0 || z12) && i10 > 0) {
                    z9 = z7;
                } else {
                    z9 = false;
                }
                if (z9) {
                    View c6 = c(kVar2, null, actionMenuView);
                    c6.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = c6.getMeasuredWidth();
                    i10 -= measuredWidth2;
                    if (i17 == 0) {
                        i17 = measuredWidth2;
                    }
                    if (i10 + i17 > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    z9 &= z10;
                }
                if (z9 && i19 != 0) {
                    sparseBooleanArray.put(i19, true);
                } else if (z12) {
                    sparseBooleanArray.put(i19, false);
                    for (int i20 = 0; i20 < i16; i20++) {
                        j.k kVar3 = (j.k) arrayList.get(i20);
                        if (kVar3.f11468b == i19) {
                            if (kVar3.d()) {
                                i15++;
                            }
                            kVar3.f(false);
                        }
                    }
                }
                if (z9) {
                    i15--;
                }
                kVar2.f(z9);
            } else {
                kVar2.f(false);
                i16++;
                i8 = 2;
                z7 = true;
            }
            i16++;
            i8 = 2;
            z7 = true;
        }
        return z7;
    }

    @Override // j.p
    public final boolean e(j.k kVar) {
        return false;
    }

    @Override // j.p
    public final void f() {
        int size;
        int i7;
        j.k kVar;
        ActionMenuView actionMenuView = this.f12024w;
        ArrayList arrayList = null;
        if (actionMenuView != null) {
            j.j jVar = this.f12020s;
            if (jVar != null) {
                jVar.i();
                ArrayList k5 = this.f12020s.k();
                int size2 = k5.size();
                i7 = 0;
                for (int i8 = 0; i8 < size2; i8++) {
                    j.k kVar2 = (j.k) k5.get(i8);
                    if (kVar2.d()) {
                        View childAt = actionMenuView.getChildAt(i7);
                        if (childAt instanceof j.q) {
                            kVar = ((j.q) childAt).getItemData();
                        } else {
                            kVar = null;
                        }
                        View c5 = c(kVar2, childAt, actionMenuView);
                        if (kVar2 != kVar) {
                            c5.setPressed(false);
                            c5.jumpDrawablesToCurrentState();
                        }
                        if (c5 != childAt) {
                            ViewGroup viewGroup = (ViewGroup) c5.getParent();
                            if (viewGroup != null) {
                                viewGroup.removeView(c5);
                            }
                            this.f12024w.addView(c5, i7);
                        }
                        i7++;
                    }
                }
            } else {
                i7 = 0;
            }
            while (i7 < actionMenuView.getChildCount()) {
                if (actionMenuView.getChildAt(i7) == this.f12025x) {
                    i7++;
                } else {
                    actionMenuView.removeViewAt(i7);
                }
            }
        }
        this.f12024w.requestLayout();
        j.j jVar2 = this.f12020s;
        if (jVar2 != null) {
            jVar2.i();
            ArrayList arrayList2 = jVar2.f11454i;
            int size3 = arrayList2.size();
            for (int i9 = 0; i9 < size3; i9++) {
                ((j.k) arrayList2.get(i9)).getClass();
            }
        }
        j.j jVar3 = this.f12020s;
        if (jVar3 != null) {
            jVar3.i();
            arrayList = jVar3.f11455j;
        }
        if (this.f12007A && arrayList != null && ((size = arrayList.size()) != 1 ? size > 0 : (!((j.k) arrayList.get(0)).f11466B))) {
            if (this.f12025x == null) {
                this.f12025x = new C0888g(this, this.f12018q);
            }
            ViewGroup viewGroup2 = (ViewGroup) this.f12025x.getParent();
            if (viewGroup2 != this.f12024w) {
                if (viewGroup2 != null) {
                    viewGroup2.removeView(this.f12025x);
                }
                ActionMenuView actionMenuView2 = this.f12024w;
                C0888g c0888g = this.f12025x;
                actionMenuView2.getClass();
                C0894j i10 = ActionMenuView.i();
                i10.f12031a = true;
                actionMenuView2.addView(c0888g, i10);
            }
        } else {
            C0888g c0888g2 = this.f12025x;
            if (c0888g2 != null) {
                ViewParent parent = c0888g2.getParent();
                ActionMenuView actionMenuView3 = this.f12024w;
                if (parent == actionMenuView3) {
                    actionMenuView3.removeView(this.f12025x);
                }
            }
        }
        this.f12024w.setOverflowReserved(this.f12007A);
    }

    @Override // j.p
    public final boolean g(j.k kVar) {
        return false;
    }

    public final boolean h() {
        ActionMenuView actionMenuView;
        R3.a aVar = this.f12015J;
        if (aVar != null && (actionMenuView = this.f12024w) != null) {
            actionMenuView.removeCallbacks(aVar);
            this.f12015J = null;
            return true;
        }
        C0884e c0884e = this.f12013H;
        if (c0884e != null) {
            if (c0884e.f()) {
                ((j.l) c0884e.f10174j).dismiss();
            }
            return true;
        }
        return false;
    }

    public final boolean i() {
        j.j jVar;
        if (this.f12007A) {
            C0884e c0884e = this.f12013H;
            if ((c0884e == null || !c0884e.f()) && (jVar = this.f12020s) != null && this.f12024w != null && this.f12015J == null) {
                jVar.i();
                if (!jVar.f11455j.isEmpty()) {
                    R3.a aVar = new R3.a(this, new C0884e(this, this.f12019r, this.f12020s, this.f12025x), 10, false);
                    this.f12015J = aVar;
                    this.f12024w.post(aVar);
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // j.p
    public final void j(j.o oVar) {
        this.f12022u = oVar;
    }

    @Override // j.p
    public final boolean k(j.t tVar) {
        boolean z7;
        if (!tVar.hasVisibleItems()) {
            return false;
        }
        j.t tVar2 = tVar;
        while (true) {
            j.j jVar = tVar2.f11511v;
            if (jVar == this.f12020s) {
                break;
            }
            tVar2 = (j.t) jVar;
        }
        ActionMenuView actionMenuView = this.f12024w;
        View view = null;
        if (actionMenuView != null) {
            int childCount = actionMenuView.getChildCount();
            int i7 = 0;
            while (true) {
                if (i7 >= childCount) {
                    break;
                }
                View childAt = actionMenuView.getChildAt(i7);
                if ((childAt instanceof j.q) && ((j.q) childAt).getItemData() == tVar2.f11512w) {
                    view = childAt;
                    break;
                }
                i7++;
            }
        }
        if (view == null) {
            return false;
        }
        tVar.f11512w.getClass();
        int size = tVar.f.size();
        int i8 = 0;
        while (true) {
            if (i8 < size) {
                MenuItem item = tVar.getItem(i8);
                if (item.isVisible() && item.getIcon() != null) {
                    z7 = true;
                    break;
                }
                i8++;
            } else {
                z7 = false;
                break;
            }
        }
        C0884e c0884e = new C0884e(this, this.f12019r, tVar, view);
        this.f12014I = c0884e;
        c0884e.f = z7;
        j.l lVar = (j.l) c0884e.f10174j;
        if (lVar != null) {
            lVar.o(z7);
        }
        C0884e c0884e2 = this.f12014I;
        if (!c0884e2.f()) {
            if (c0884e2.d != null) {
                c0884e2.i(0, 0, false, false);
            } else {
                throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
            }
        }
        j.o oVar = this.f12022u;
        if (oVar != null) {
            oVar.c(tVar);
        }
        return true;
    }
}
