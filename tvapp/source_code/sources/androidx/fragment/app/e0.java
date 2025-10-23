package androidx.fragment.app;

import android.util.Log;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import r0.AbstractC1111a;
/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a  reason: collision with root package name */
    public int f6036a;

    /* renamed from: b  reason: collision with root package name */
    public int f6037b;

    /* renamed from: c  reason: collision with root package name */
    public final ComponentCallbacksC0269x f6038c;
    public final ArrayList d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f6039e;
    public boolean f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f6040g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f6041h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f6042i;

    /* renamed from: j  reason: collision with root package name */
    public final ArrayList f6043j;

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList f6044k;

    /* renamed from: l  reason: collision with root package name */
    public final Z f6045l;

    public e0(int i7, int i8, Z z7) {
        AbstractC1111a.x("finalState", i7);
        AbstractC1111a.x("lifecycleImpact", i8);
        M5.g.f(z7, "fragmentStateManager");
        ComponentCallbacksC0269x componentCallbacksC0269x = z7.f5978c;
        M5.g.e(componentCallbacksC0269x, "fragmentStateManager.fragment");
        AbstractC1111a.x("finalState", i7);
        AbstractC1111a.x("lifecycleImpact", i8);
        this.f6036a = i7;
        this.f6037b = i8;
        this.f6038c = componentCallbacksC0269x;
        this.d = new ArrayList();
        this.f6042i = true;
        ArrayList arrayList = new ArrayList();
        this.f6043j = arrayList;
        this.f6044k = arrayList;
        this.f6045l = z7;
    }

    public final void a(ViewGroup viewGroup) {
        M5.g.f(viewGroup, "container");
        this.f6041h = false;
        if (this.f6039e) {
            return;
        }
        this.f6039e = true;
        if (this.f6043j.isEmpty()) {
            b();
            return;
        }
        for (d0 d0Var : A5.k.l0(this.f6044k)) {
            d0Var.getClass();
            if (!d0Var.f6032b) {
                d0Var.a(viewGroup);
            }
            d0Var.f6032b = true;
        }
    }

    public final void b() {
        this.f6041h = false;
        if (!this.f) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f = true;
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.f6038c.f6100C = false;
        this.f6045l.k();
    }

    public final void c(d0 d0Var) {
        M5.g.f(d0Var, "effect");
        ArrayList arrayList = this.f6043j;
        if (arrayList.remove(d0Var) && arrayList.isEmpty()) {
            b();
        }
    }

    public final void d(int i7, int i8) {
        AbstractC1111a.x("finalState", i7);
        AbstractC1111a.x("lifecycleImpact", i8);
        int b7 = s.h.b(i8);
        ComponentCallbacksC0269x componentCallbacksC0269x = this.f6038c;
        if (b7 != 0) {
            if (b7 != 1) {
                if (b7 == 2) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + componentCallbacksC0269x + " mFinalState = " + AbstractC1111a.I(this.f6036a) + " -> REMOVED. mLifecycleImpact  = " + AbstractC1111a.H(this.f6037b) + " to REMOVING.");
                    }
                    this.f6036a = 1;
                    this.f6037b = 3;
                } else {
                    return;
                }
            } else if (this.f6036a == 1) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + componentCallbacksC0269x + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + AbstractC1111a.H(this.f6037b) + " to ADDING.");
                }
                this.f6036a = 2;
                this.f6037b = 2;
            } else {
                return;
            }
            this.f6042i = true;
        } else if (this.f6036a != 1) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "SpecialEffectsController: For fragment " + componentCallbacksC0269x + " mFinalState = " + AbstractC1111a.I(this.f6036a) + " -> " + AbstractC1111a.I(i7) + '.');
            }
            this.f6036a = i7;
        }
    }

    public final String toString() {
        StringBuilder u7 = AbstractC1111a.u("Operation {", Integer.toHexString(System.identityHashCode(this)), "} {finalState = ");
        u7.append(AbstractC1111a.I(this.f6036a));
        u7.append(" lifecycleImpact = ");
        u7.append(AbstractC1111a.H(this.f6037b));
        u7.append(" fragment = ");
        u7.append(this.f6038c);
        u7.append('}');
        return u7.toString();
    }
}
