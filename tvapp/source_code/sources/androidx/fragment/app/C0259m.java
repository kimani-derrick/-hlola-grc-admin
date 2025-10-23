package androidx.fragment.app;

import a.AbstractC0189a;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.boxhdo.android.tv.R;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import com.google.android.gms.internal.measurement.K1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import r0.AbstractC1111a;
/* renamed from: androidx.fragment.app.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0259m {

    /* renamed from: a  reason: collision with root package name */
    public final ViewGroup f6058a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f6059b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f6060c;
    public boolean d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f6061e;

    public C0259m(ViewGroup viewGroup) {
        M5.g.f(viewGroup, "container");
        this.f6058a = viewGroup;
        this.f6059b = new ArrayList();
        this.f6060c = new ArrayList();
    }

    public static final C0259m m(ViewGroup viewGroup, S s6) {
        M5.g.f(viewGroup, "container");
        M5.g.f(s6, "fragmentManager");
        M5.g.e(s6.L(), "fragmentManager.specialEffectsControllerFactory");
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof C0259m) {
            return (C0259m) tag;
        }
        C0259m c0259m = new C0259m(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, c0259m);
        return c0259m;
    }

    public final void a(e0 e0Var) {
        M5.g.f(e0Var, "operation");
        if (e0Var.f6042i) {
            AbstractC1111a.c(e0Var.f6036a, e0Var.f6038c.b0(), this.f6058a);
            e0Var.f6042i = false;
        }
    }

    public final void b(ArrayList arrayList, boolean z7) {
        Object obj;
        Object obj2;
        StringBuilder sb;
        String str;
        Iterator it = arrayList.iterator();
        while (true) {
            obj = null;
            if (it.hasNext()) {
                obj2 = it.next();
                e0 e0Var = (e0) obj2;
                View view = e0Var.f6038c.W;
                M5.g.e(view, "operation.fragment.mView");
                if (AbstractC0189a.d(view) == 2 && e0Var.f6036a != 2) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        e0 e0Var2 = (e0) obj2;
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            }
            Object previous = listIterator.previous();
            e0 e0Var3 = (e0) previous;
            View view2 = e0Var3.f6038c.W;
            M5.g.e(view2, "operation.fragment.mView");
            if (AbstractC0189a.d(view2) != 2 && e0Var3.f6036a == 2) {
                obj = previous;
                break;
            }
        }
        e0 e0Var4 = (e0) obj;
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Executing operations from " + e0Var2 + " to " + e0Var4);
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ComponentCallbacksC0269x componentCallbacksC0269x = ((e0) A5.k.b0(arrayList)).f6038c;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C0267v c0267v = ((e0) it2.next()).f6038c.f6121Z;
            C0267v c0267v2 = componentCallbacksC0269x.f6121Z;
            c0267v.f6089b = c0267v2.f6089b;
            c0267v.f6090c = c0267v2.f6090c;
            c0267v.d = c0267v2.d;
            c0267v.f6091e = c0267v2.f6091e;
        }
        Iterator it3 = arrayList.iterator();
        while (true) {
            boolean z8 = false;
            if (!it3.hasNext()) {
                break;
            }
            e0 e0Var5 = (e0) it3.next();
            arrayList2.add(new C0253g(e0Var5, z7));
            if (!z7 ? e0Var5 == e0Var4 : e0Var5 == e0Var2) {
                z8 = true;
            }
            P1.c cVar = new P1.c(e0Var5);
            int i7 = e0Var5.f6036a;
            ComponentCallbacksC0269x componentCallbacksC0269x2 = e0Var5.f6038c;
            if (i7 == 2) {
                if (z7) {
                    C0267v c0267v3 = componentCallbacksC0269x2.f6121Z;
                }
                componentCallbacksC0269x2.getClass();
            } else {
                if (z7) {
                    C0267v c0267v4 = componentCallbacksC0269x2.f6121Z;
                }
                componentCallbacksC0269x2.getClass();
            }
            if (e0Var5.f6036a == 2) {
                if (z7) {
                    C0267v c0267v5 = componentCallbacksC0269x2.f6121Z;
                } else {
                    C0267v c0267v6 = componentCallbacksC0269x2.f6121Z;
                }
            }
            if (z8) {
                if (z7) {
                    C0267v c0267v7 = componentCallbacksC0269x2.f6121Z;
                } else {
                    componentCallbacksC0269x2.getClass();
                }
            }
            arrayList3.add(cVar);
            e0Var5.d.add(new RunnableC0250d(this, e0Var5, 0));
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            Object next = it4.next();
            if (!((C0258l) next).s()) {
                arrayList4.add(next);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it5 = arrayList4.iterator();
        while (it5.hasNext()) {
            ((C0258l) it5.next()).getClass();
        }
        Iterator it6 = arrayList5.iterator();
        while (it6.hasNext()) {
            ((C0258l) it6.next()).getClass();
        }
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        Iterator it7 = arrayList2.iterator();
        while (it7.hasNext()) {
            A5.q.R(((e0) ((C0253g) it7.next()).f2765q).f6044k, arrayList7);
        }
        boolean z9 = !arrayList7.isEmpty();
        Iterator it8 = arrayList2.iterator();
        boolean z10 = false;
        while (it8.hasNext()) {
            C0253g c0253g = (C0253g) it8.next();
            Context context = this.f6058a.getContext();
            e0 e0Var6 = (e0) c0253g.f2765q;
            M5.g.e(context, "context");
            K1 E4 = c0253g.E(context);
            if (E4 != null) {
                if (((AnimatorSet) E4.f8368s) == null) {
                    arrayList6.add(c0253g);
                } else {
                    ComponentCallbacksC0269x componentCallbacksC0269x3 = e0Var6.f6038c;
                    if (!e0Var6.f6044k.isEmpty()) {
                        if (Log.isLoggable("FragmentManager", 2)) {
                            Log.v("FragmentManager", "Ignoring Animator set on " + componentCallbacksC0269x3 + " as this Fragment was involved in a Transition.");
                        }
                    } else {
                        if (e0Var6.f6036a == 3) {
                            e0Var6.f6042i = false;
                        }
                        e0Var6.f6043j.add(new C0255i(c0253g));
                        z10 = true;
                    }
                }
            }
        }
        Iterator it9 = arrayList6.iterator();
        while (it9.hasNext()) {
            C0253g c0253g2 = (C0253g) it9.next();
            e0 e0Var7 = (e0) c0253g2.f2765q;
            ComponentCallbacksC0269x componentCallbacksC0269x4 = e0Var7.f6038c;
            if (z9) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    sb = new StringBuilder("Ignoring Animation set on ");
                    sb.append(componentCallbacksC0269x4);
                    str = " as Animations cannot run alongside Transitions.";
                    sb.append(str);
                    Log.v("FragmentManager", sb.toString());
                }
            } else if (z10) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    sb = new StringBuilder("Ignoring Animation set on ");
                    sb.append(componentCallbacksC0269x4);
                    str = " as Animations cannot run alongside Animators.";
                    sb.append(str);
                    Log.v("FragmentManager", sb.toString());
                }
            } else {
                e0Var7.f6043j.add(new C0252f(c0253g2));
            }
        }
    }

    public final void c(ArrayList arrayList) {
        M5.g.f(arrayList, "operations");
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            A5.q.R(((e0) it.next()).f6044k, arrayList2);
        }
        List l02 = A5.k.l0(A5.k.o0(arrayList2));
        int size = l02.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((d0) l02.get(i7)).b(this.f6058a);
        }
        int size2 = arrayList.size();
        for (int i8 = 0; i8 < size2; i8++) {
            a((e0) arrayList.get(i8));
        }
        List l03 = A5.k.l0(arrayList);
        int size3 = l03.size();
        for (int i9 = 0; i9 < size3; i9++) {
            e0 e0Var = (e0) l03.get(i9);
            if (e0Var.f6044k.isEmpty()) {
                e0Var.b();
            }
        }
    }

    public final void d(int i7, int i8, Z z7) {
        synchronized (this.f6059b) {
            try {
                ComponentCallbacksC0269x componentCallbacksC0269x = z7.f5978c;
                M5.g.e(componentCallbacksC0269x, "fragmentStateManager.fragment");
                e0 j7 = j(componentCallbacksC0269x);
                if (j7 == null) {
                    ComponentCallbacksC0269x componentCallbacksC0269x2 = z7.f5978c;
                    if (componentCallbacksC0269x2.f6100C) {
                        j7 = k(componentCallbacksC0269x2);
                    } else {
                        j7 = null;
                    }
                }
                if (j7 != null) {
                    j7.d(i7, i8);
                    return;
                }
                e0 e0Var = new e0(i7, i8, z7);
                this.f6059b.add(e0Var);
                e0Var.d.add(new RunnableC0250d(this, e0Var, 1));
                e0Var.d.add(new RunnableC0250d(this, e0Var, 2));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(int i7, Z z7) {
        AbstractC1111a.x("finalState", i7);
        M5.g.f(z7, "fragmentStateManager");
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + z7.f5978c);
        }
        d(i7, 2, z7);
    }

    public final void f(Z z7) {
        M5.g.f(z7, "fragmentStateManager");
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + z7.f5978c);
        }
        d(3, 1, z7);
    }

    public final void g(Z z7) {
        M5.g.f(z7, "fragmentStateManager");
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + z7.f5978c);
        }
        d(1, 3, z7);
    }

    public final void h(Z z7) {
        M5.g.f(z7, "fragmentStateManager");
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + z7.f5978c);
        }
        d(2, 1, z7);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0152 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x017c A[Catch: all -> 0x005f, TryCatch #0 {all -> 0x005f, blocks: (B:11:0x0017, B:13:0x0020, B:14:0x002f, B:16:0x0035, B:18:0x0043, B:21:0x0062, B:25:0x0074, B:27:0x0078, B:24:0x0071, B:28:0x007e, B:29:0x008d, B:31:0x0094, B:33:0x00a2, B:34:0x00b8, B:40:0x00cf, B:42:0x00d3, B:38:0x00ca, B:39:0x00cc, B:43:0x00d9, B:47:0x00ea, B:49:0x00fc, B:50:0x0103, B:51:0x010e, B:53:0x0114, B:55:0x0123, B:57:0x0129, B:68:0x014b, B:60:0x0130, B:61:0x0134, B:63:0x013a, B:73:0x0156, B:74:0x015f, B:76:0x0165, B:77:0x0171, B:82:0x017c, B:87:0x019b, B:89:0x01a5, B:84:0x0185, B:86:0x018f), top: B:94:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01a5 A[Catch: all -> 0x005f, TRY_LEAVE, TryCatch #0 {all -> 0x005f, blocks: (B:11:0x0017, B:13:0x0020, B:14:0x002f, B:16:0x0035, B:18:0x0043, B:21:0x0062, B:25:0x0074, B:27:0x0078, B:24:0x0071, B:28:0x007e, B:29:0x008d, B:31:0x0094, B:33:0x00a2, B:34:0x00b8, B:40:0x00cf, B:42:0x00d3, B:38:0x00ca, B:39:0x00cc, B:43:0x00d9, B:47:0x00ea, B:49:0x00fc, B:50:0x0103, B:51:0x010e, B:53:0x0114, B:55:0x0123, B:57:0x0129, B:68:0x014b, B:60:0x0130, B:61:0x0134, B:63:0x013a, B:73:0x0156, B:74:0x015f, B:76:0x0165, B:77:0x0171, B:82:0x017c, B:87:0x019b, B:89:0x01a5, B:84:0x0185, B:86:0x018f), top: B:94:0x0017 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i() {
        /*
            Method dump skipped, instructions count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0259m.i():void");
    }

    public final e0 j(ComponentCallbacksC0269x componentCallbacksC0269x) {
        Object obj;
        Iterator it = this.f6059b.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                e0 e0Var = (e0) obj;
                if (M5.g.a(e0Var.f6038c, componentCallbacksC0269x) && !e0Var.f6039e) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (e0) obj;
    }

    public final e0 k(ComponentCallbacksC0269x componentCallbacksC0269x) {
        Object obj;
        Iterator it = this.f6060c.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                e0 e0Var = (e0) obj;
                if (M5.g.a(e0Var.f6038c, componentCallbacksC0269x) && !e0Var.f6039e) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (e0) obj;
    }

    public final void l() {
        String str;
        String str2;
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean isAttachedToWindow = this.f6058a.isAttachedToWindow();
        synchronized (this.f6059b) {
            try {
                p();
                o(this.f6059b);
                Iterator it = A5.k.m0(this.f6060c).iterator();
                while (it.hasNext()) {
                    e0 e0Var = (e0) it.next();
                    if (Log.isLoggable("FragmentManager", 2)) {
                        if (isAttachedToWindow) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.f6058a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str2 + "Cancelling running operation " + e0Var);
                    }
                    e0Var.a(this.f6058a);
                }
                Iterator it2 = A5.k.m0(this.f6059b).iterator();
                while (it2.hasNext()) {
                    e0 e0Var2 = (e0) it2.next();
                    if (Log.isLoggable("FragmentManager", 2)) {
                        if (isAttachedToWindow) {
                            str = "";
                        } else {
                            str = "Container " + this.f6058a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str + "Cancelling pending operation " + e0Var2);
                    }
                    e0Var2.a(this.f6058a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void n() {
        Object obj;
        synchronized (this.f6059b) {
            try {
                p();
                ArrayList arrayList = this.f6059b;
                ListIterator listIterator = arrayList.listIterator(arrayList.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        obj = listIterator.previous();
                        e0 e0Var = (e0) obj;
                        View view = e0Var.f6038c.W;
                        M5.g.e(view, "operation.fragment.mView");
                        int d = AbstractC0189a.d(view);
                        if (e0Var.f6036a == 2 && d != 2) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                e0 e0Var2 = (e0) obj;
                this.f6061e = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void o(ArrayList arrayList) {
        float f;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            e0 e0Var = (e0) arrayList.get(i7);
            if (!e0Var.f6041h) {
                e0Var.f6041h = true;
                int i8 = e0Var.f6037b;
                Z z7 = e0Var.f6045l;
                if (i8 == 2) {
                    ComponentCallbacksC0269x componentCallbacksC0269x = z7.f5978c;
                    M5.g.e(componentCallbacksC0269x, "fragmentStateManager.fragment");
                    View findFocus = componentCallbacksC0269x.W.findFocus();
                    if (findFocus != null) {
                        componentCallbacksC0269x.l().f6096k = findFocus;
                        if (Log.isLoggable("FragmentManager", 2)) {
                            Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + componentCallbacksC0269x);
                        }
                    }
                    View b02 = e0Var.f6038c.b0();
                    if (b02.getParent() == null) {
                        z7.b();
                        b02.setAlpha(0.0f);
                    }
                    if (b02.getAlpha() == 0.0f && b02.getVisibility() == 0) {
                        b02.setVisibility(4);
                    }
                    C0267v c0267v = componentCallbacksC0269x.f6121Z;
                    if (c0267v == null) {
                        f = 1.0f;
                    } else {
                        f = c0267v.f6095j;
                    }
                    b02.setAlpha(f);
                } else if (i8 == 3) {
                    ComponentCallbacksC0269x componentCallbacksC0269x2 = z7.f5978c;
                    M5.g.e(componentCallbacksC0269x2, "fragmentStateManager.fragment");
                    View b03 = componentCallbacksC0269x2.b0();
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Clearing focus " + b03.findFocus() + " on view " + b03 + " for Fragment " + componentCallbacksC0269x2);
                    }
                    b03.clearFocus();
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            A5.q.R(((e0) it.next()).f6044k, arrayList2);
        }
        List l02 = A5.k.l0(A5.k.o0(arrayList2));
        int size2 = l02.size();
        for (int i9 = 0; i9 < size2; i9++) {
            d0 d0Var = (d0) l02.get(i9);
            d0Var.getClass();
            ViewGroup viewGroup = this.f6058a;
            M5.g.f(viewGroup, "container");
            if (!d0Var.f6031a) {
                d0Var.d(viewGroup);
            }
            d0Var.f6031a = true;
        }
    }

    public final void p() {
        Iterator it = this.f6059b.iterator();
        while (it.hasNext()) {
            e0 e0Var = (e0) it.next();
            int i7 = 2;
            if (e0Var.f6037b == 2) {
                int visibility = e0Var.f6038c.b0().getVisibility();
                if (visibility != 0) {
                    i7 = 4;
                    if (visibility != 4) {
                        if (visibility == 8) {
                            i7 = 3;
                        } else {
                            throw new IllegalArgumentException(AbstractC0515y1.l("Unknown visibility ", visibility));
                        }
                    }
                }
                e0Var.d(i7, 1);
            }
        }
    }
}
