package j;

import K.O;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.fragment.app.Y;
import com.boxhdo.android.tv.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import k.AbstractC0901m0;
import k.C0909q0;
/* loaded from: classes.dex */
public final class f extends l implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: E  reason: collision with root package name */
    public View f11420E;
    public View F;

    /* renamed from: G  reason: collision with root package name */
    public int f11421G;

    /* renamed from: H  reason: collision with root package name */
    public boolean f11422H;

    /* renamed from: I  reason: collision with root package name */
    public boolean f11423I;

    /* renamed from: J  reason: collision with root package name */
    public int f11424J;

    /* renamed from: K  reason: collision with root package name */
    public int f11425K;

    /* renamed from: M  reason: collision with root package name */
    public boolean f11427M;

    /* renamed from: N  reason: collision with root package name */
    public o f11428N;

    /* renamed from: O  reason: collision with root package name */
    public ViewTreeObserver f11429O;

    /* renamed from: P  reason: collision with root package name */
    public PopupWindow.OnDismissListener f11430P;

    /* renamed from: Q  reason: collision with root package name */
    public boolean f11431Q;

    /* renamed from: r  reason: collision with root package name */
    public final Context f11432r;

    /* renamed from: s  reason: collision with root package name */
    public final int f11433s;

    /* renamed from: t  reason: collision with root package name */
    public final int f11434t;

    /* renamed from: u  reason: collision with root package name */
    public final int f11435u;

    /* renamed from: v  reason: collision with root package name */
    public final boolean f11436v;

    /* renamed from: w  reason: collision with root package name */
    public final Handler f11437w;

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList f11438x = new ArrayList();

    /* renamed from: y  reason: collision with root package name */
    public final ArrayList f11439y = new ArrayList();

    /* renamed from: z  reason: collision with root package name */
    public final ViewTreeObserver$OnGlobalLayoutListenerC0778c f11440z = new ViewTreeObserver$OnGlobalLayoutListenerC0778c(this, 0);

    /* renamed from: A  reason: collision with root package name */
    public final Y f11416A = new Y(1, this);

    /* renamed from: B  reason: collision with root package name */
    public final Z5.n f11417B = new Z5.n(this);

    /* renamed from: C  reason: collision with root package name */
    public int f11418C = 0;

    /* renamed from: D  reason: collision with root package name */
    public int f11419D = 0;

    /* renamed from: L  reason: collision with root package name */
    public boolean f11426L = false;

    public f(Context context, View view, int i7, int i8, boolean z7) {
        this.f11432r = context;
        this.f11420E = view;
        this.f11434t = i7;
        this.f11435u = i8;
        this.f11436v = z7;
        Field field = O.f1447a;
        this.f11421G = view.getLayoutDirection() == 1 ? 0 : 1;
        Resources resources = context.getResources();
        this.f11433s = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f11437w = new Handler();
    }

    @Override // j.p
    public final void b(j jVar, boolean z7) {
        int i7;
        ArrayList arrayList = this.f11439y;
        int size = arrayList.size();
        int i8 = 0;
        while (true) {
            if (i8 < size) {
                if (jVar == ((e) arrayList.get(i8)).f11414b) {
                    break;
                }
                i8++;
            } else {
                i8 = -1;
                break;
            }
        }
        if (i8 < 0) {
            return;
        }
        int i9 = i8 + 1;
        if (i9 < arrayList.size()) {
            ((e) arrayList.get(i9)).f11414b.c(false);
        }
        e eVar = (e) arrayList.remove(i8);
        CopyOnWriteArrayList copyOnWriteArrayList = eVar.f11414b.f11462r;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            p pVar = (p) weakReference.get();
            if (pVar == null || pVar == this) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        boolean z8 = this.f11431Q;
        C0909q0 c0909q0 = eVar.f11413a;
        if (z8) {
            AbstractC0901m0.b(c0909q0.f12049L, null);
            c0909q0.f12049L.setAnimationStyle(0);
        }
        c0909q0.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            i7 = ((e) arrayList.get(size2 - 1)).f11415c;
        } else {
            View view = this.f11420E;
            Field field = O.f1447a;
            if (view.getLayoutDirection() == 1) {
                i7 = 0;
            } else {
                i7 = 1;
            }
        }
        this.f11421G = i7;
        if (size2 == 0) {
            dismiss();
            o oVar = this.f11428N;
            if (oVar != null) {
                oVar.b(jVar, true);
            }
            ViewTreeObserver viewTreeObserver = this.f11429O;
            if (viewTreeObserver != null) {
                if (viewTreeObserver.isAlive()) {
                    this.f11429O.removeGlobalOnLayoutListener(this.f11440z);
                }
                this.f11429O = null;
            }
            this.F.removeOnAttachStateChangeListener(this.f11416A);
            this.f11430P.onDismiss();
        } else if (z7) {
            ((e) arrayList.get(0)).f11414b.c(false);
        }
    }

    @Override // j.r
    public final void c() {
        boolean z7;
        if (h()) {
            return;
        }
        ArrayList arrayList = this.f11438x;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            v((j) it.next());
        }
        arrayList.clear();
        View view = this.f11420E;
        this.F = view;
        if (view != null) {
            if (this.f11429O == null) {
                z7 = true;
            } else {
                z7 = false;
            }
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f11429O = viewTreeObserver;
            if (z7) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f11440z);
            }
            this.F.addOnAttachStateChangeListener(this.f11416A);
        }
    }

    @Override // j.p
    public final boolean d() {
        return false;
    }

    @Override // j.r
    public final void dismiss() {
        ArrayList arrayList = this.f11439y;
        int size = arrayList.size();
        if (size > 0) {
            e[] eVarArr = (e[]) arrayList.toArray(new e[size]);
            for (int i7 = size - 1; i7 >= 0; i7--) {
                e eVar = eVarArr[i7];
                if (eVar.f11413a.f12049L.isShowing()) {
                    eVar.f11413a.dismiss();
                }
            }
        }
    }

    @Override // j.p
    public final void f() {
        Iterator it = this.f11439y.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((e) it.next()).f11413a.f12052s.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((g) adapter).notifyDataSetChanged();
        }
    }

    @Override // j.r
    public final boolean h() {
        ArrayList arrayList = this.f11439y;
        if (arrayList.size() <= 0 || !((e) arrayList.get(0)).f11413a.f12049L.isShowing()) {
            return false;
        }
        return true;
    }

    @Override // j.r
    public final ListView i() {
        ArrayList arrayList = this.f11439y;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((e) arrayList.get(arrayList.size() - 1)).f11413a.f12052s;
    }

    @Override // j.p
    public final void j(o oVar) {
        this.f11428N = oVar;
    }

    @Override // j.p
    public final boolean k(t tVar) {
        Iterator it = this.f11439y.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            if (tVar == eVar.f11414b) {
                eVar.f11413a.f12052s.requestFocus();
                return true;
            }
        }
        if (tVar.hasVisibleItems()) {
            l(tVar);
            o oVar = this.f11428N;
            if (oVar != null) {
                oVar.c(tVar);
            }
            return true;
        }
        return false;
    }

    @Override // j.l
    public final void l(j jVar) {
        jVar.b(this, this.f11432r);
        if (h()) {
            v(jVar);
        } else {
            this.f11438x.add(jVar);
        }
    }

    @Override // j.l
    public final void n(View view) {
        if (this.f11420E != view) {
            this.f11420E = view;
            int i7 = this.f11418C;
            Field field = O.f1447a;
            this.f11419D = Gravity.getAbsoluteGravity(i7, view.getLayoutDirection());
        }
    }

    @Override // j.l
    public final void o(boolean z7) {
        this.f11426L = z7;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        e eVar;
        ArrayList arrayList = this.f11439y;
        int size = arrayList.size();
        int i7 = 0;
        while (true) {
            if (i7 < size) {
                eVar = (e) arrayList.get(i7);
                if (!eVar.f11413a.f12049L.isShowing()) {
                    break;
                }
                i7++;
            } else {
                eVar = null;
                break;
            }
        }
        if (eVar != null) {
            eVar.f11414b.c(false);
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
        if (this.f11418C != i7) {
            this.f11418C = i7;
            View view = this.f11420E;
            Field field = O.f1447a;
            this.f11419D = Gravity.getAbsoluteGravity(i7, view.getLayoutDirection());
        }
    }

    @Override // j.l
    public final void q(int i7) {
        this.f11422H = true;
        this.f11424J = i7;
    }

    @Override // j.l
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f11430P = onDismissListener;
    }

    @Override // j.l
    public final void s(boolean z7) {
        this.f11427M = z7;
    }

    @Override // j.l
    public final void t(int i7) {
        this.f11423I = true;
        this.f11425K = i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b1  */
    /* JADX WARN: Type inference failed for: r8v0, types: [k.q0, k.k0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v(j.j r19) {
        /*
            Method dump skipped, instructions count: 547
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j.f.v(j.j):void");
    }
}
