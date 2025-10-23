package p0;

import A5.k;
import A5.q;
import M5.g;
import Z5.u;
import a.AbstractC0189a;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.C0247a;
import androidx.fragment.app.ComponentCallbacksC0269x;
import androidx.fragment.app.I;
import androidx.fragment.app.O;
import androidx.fragment.app.Q;
import androidx.fragment.app.S;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import n0.C1002D;
import n0.C1019j;
import n0.M;
import n0.N;
import n0.v;
import z5.C1524f;
@M("fragment")
/* loaded from: classes.dex */
public class e extends N {

    /* renamed from: c  reason: collision with root package name */
    public final Context f13105c;
    public final S d;

    /* renamed from: e  reason: collision with root package name */
    public final int f13106e;
    public final LinkedHashSet f = new LinkedHashSet();

    public e(Context context, S s6, int i7) {
        this.f13105c = context;
        this.d = s6;
        this.f13106e = i7;
    }

    @Override // n0.N
    public final v a() {
        return new v(this);
    }

    @Override // n0.N
    public void d(List list, C1002D c1002d) {
        S s6 = this.d;
        if (s6.R()) {
            Log.i("FragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1019j c1019j = (C1019j) it.next();
            boolean isEmpty = ((List) ((u) b().f12559e.f3382r).getValue()).isEmpty();
            if (c1002d != null && !isEmpty && c1002d.f12487b && this.f.remove(c1019j.f12547v)) {
                s6.y(new Q(s6, c1019j.f12547v, 0), false);
            } else {
                C0247a k5 = k(c1019j, c1002d);
                if (!isEmpty) {
                    k5.c(c1019j.f12547v);
                }
                k5.e(false);
            }
            b().e(c1019j);
        }
    }

    @Override // n0.N
    public final void f(C1019j c1019j) {
        S s6 = this.d;
        if (s6.R()) {
            Log.i("FragmentNavigator", "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        C0247a k5 = k(c1019j, null);
        if (((List) ((u) b().f12559e.f3382r).getValue()).size() > 1) {
            String str = c1019j.f12547v;
            s6.y(new O(s6, str, -1), false);
            k5.c(str);
        }
        k5.e(false);
        b().b(c1019j);
    }

    @Override // n0.N
    public void g(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("androidx-nav-fragment:navigator:savedIds");
        if (stringArrayList != null) {
            LinkedHashSet linkedHashSet = this.f;
            linkedHashSet.clear();
            q.R(stringArrayList, linkedHashSet);
        }
    }

    @Override // n0.N
    public Bundle h() {
        LinkedHashSet linkedHashSet = this.f;
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return AbstractC0189a.h(new C1524f("androidx-nav-fragment:navigator:savedIds", new ArrayList(linkedHashSet)));
    }

    @Override // n0.N
    public void i(C1019j c1019j, boolean z7) {
        g.f(c1019j, "popUpTo");
        S s6 = this.d;
        if (s6.R()) {
            Log.i("FragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        if (z7) {
            List list = (List) ((u) b().f12559e.f3382r).getValue();
            C1019j c1019j2 = (C1019j) k.W(list);
            for (C1019j c1019j3 : k.g0(list.subList(list.indexOf(c1019j), list.size()))) {
                if (g.a(c1019j3, c1019j2)) {
                    Log.i("FragmentNavigator", "FragmentManager cannot save the state of the initial destination " + c1019j3);
                } else {
                    s6.y(new Q(s6, c1019j3.f12547v, 1), false);
                    this.f.add(c1019j3.f12547v);
                }
            }
        } else {
            s6.y(new O(s6, c1019j.f12547v, -1), false);
        }
        b().c(c1019j, z7);
    }

    public final C0247a k(C1019j c1019j, C1002D c1002d) {
        int i7;
        int i8;
        int i9;
        int i10;
        String str = ((d) c1019j.f12543r).f13104A;
        if (str != null) {
            int i11 = 0;
            char charAt = str.charAt(0);
            Context context = this.f13105c;
            if (charAt == '.') {
                str = context.getPackageName() + str;
            }
            S s6 = this.d;
            I K6 = s6.K();
            context.getClassLoader();
            ComponentCallbacksC0269x a7 = K6.a(str);
            g.e(a7, "fragmentManager.fragment…t.classLoader, className)");
            a7.d0(c1019j.f12544s);
            C0247a c0247a = new C0247a(s6);
            if (c1002d != null) {
                i7 = c1002d.f;
            } else {
                i7 = -1;
            }
            if (c1002d != null) {
                i8 = c1002d.f12490g;
            } else {
                i8 = -1;
            }
            if (c1002d != null) {
                i9 = c1002d.f12491h;
            } else {
                i9 = -1;
            }
            if (c1002d != null) {
                i10 = c1002d.f12492i;
            } else {
                i10 = -1;
            }
            if (i7 != -1 || i8 != -1 || i9 != -1 || i10 != -1) {
                if (i7 == -1) {
                    i7 = 0;
                }
                if (i8 == -1) {
                    i8 = 0;
                }
                if (i9 == -1) {
                    i9 = 0;
                }
                if (i10 != -1) {
                    i11 = i10;
                }
                c0247a.f5981b = i7;
                c0247a.f5982c = i8;
                c0247a.d = i9;
                c0247a.f5983e = i11;
            }
            c0247a.h(this.f13106e, a7);
            c0247a.i(a7);
            c0247a.f5992p = true;
            return c0247a;
        }
        throw new IllegalStateException("Fragment class was not set".toString());
    }
}
