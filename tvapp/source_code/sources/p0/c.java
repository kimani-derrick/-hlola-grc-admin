package p0;

import A5.k;
import M5.g;
import M5.r;
import Z5.u;
import android.content.Context;
import android.util.Log;
import androidx.fragment.app.ComponentCallbacksC0269x;
import androidx.fragment.app.DialogInterface$OnCancelListenerC0263q;
import androidx.fragment.app.I;
import androidx.fragment.app.S;
import androidx.fragment.app.W;
import androidx.lifecycle.C0344w;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import n0.C1002D;
import n0.C1019j;
import n0.C1021l;
import n0.M;
import n0.N;
import n0.v;
import r0.AbstractC1111a;
@M("dialog")
/* loaded from: classes.dex */
public final class c extends N {

    /* renamed from: c  reason: collision with root package name */
    public final Context f13102c;
    public final S d;

    /* renamed from: e  reason: collision with root package name */
    public final LinkedHashSet f13103e = new LinkedHashSet();
    public final A0.b f = new A0.b(2, this);

    public c(Context context, S s6) {
        this.f13102c = context;
        this.d = s6;
    }

    @Override // n0.N
    public final v a() {
        return new v(this);
    }

    @Override // n0.N
    public final void d(List list, C1002D c1002d) {
        S s6 = this.d;
        if (s6.R()) {
            Log.i("DialogFragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1019j c1019j = (C1019j) it.next();
            b bVar = (b) c1019j.f12543r;
            String str = bVar.f13101A;
            if (str != null) {
                char charAt = str.charAt(0);
                Context context = this.f13102c;
                if (charAt == '.') {
                    str = context.getPackageName() + str;
                }
                I K6 = s6.K();
                context.getClassLoader();
                ComponentCallbacksC0269x a7 = K6.a(str);
                g.e(a7, "fragmentManager.fragment…ader, className\n        )");
                if (DialogInterface$OnCancelListenerC0263q.class.isAssignableFrom(a7.getClass())) {
                    DialogInterface$OnCancelListenerC0263q dialogInterface$OnCancelListenerC0263q = (DialogInterface$OnCancelListenerC0263q) a7;
                    dialogInterface$OnCancelListenerC0263q.d0(c1019j.f12544s);
                    dialogInterface$OnCancelListenerC0263q.f6126e0.g(this.f);
                    dialogInterface$OnCancelListenerC0263q.i0(s6, c1019j.f12547v);
                    b().e(c1019j);
                } else {
                    StringBuilder sb = new StringBuilder("Dialog destination ");
                    String str2 = bVar.f13101A;
                    if (str2 != null) {
                        throw new IllegalArgumentException(AbstractC1111a.t(sb, str2, " is not an instance of DialogFragment").toString());
                    }
                    throw new IllegalStateException("DialogFragment class was not set".toString());
                }
            } else {
                throw new IllegalStateException("DialogFragment class was not set".toString());
            }
        }
    }

    @Override // n0.N
    public final void e(C1021l c1021l) {
        C0344w c0344w;
        this.f12511a = c1021l;
        this.f12512b = true;
        Iterator it = ((List) ((u) c1021l.f12559e.f3382r).getValue()).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            S s6 = this.d;
            if (hasNext) {
                C1019j c1019j = (C1019j) it.next();
                DialogInterface$OnCancelListenerC0263q dialogInterface$OnCancelListenerC0263q = (DialogInterface$OnCancelListenerC0263q) s6.F(c1019j.f12547v);
                if (dialogInterface$OnCancelListenerC0263q != null && (c0344w = dialogInterface$OnCancelListenerC0263q.f6126e0) != null) {
                    c0344w.g(this.f);
                } else {
                    this.f13103e.add(c1019j.f12547v);
                }
            } else {
                s6.f5934o.add(new W() { // from class: p0.a
                    @Override // androidx.fragment.app.W
                    public final void a(S s7, ComponentCallbacksC0269x componentCallbacksC0269x) {
                        c cVar = c.this;
                        g.f(cVar, "this$0");
                        LinkedHashSet linkedHashSet = cVar.f13103e;
                        String str = componentCallbacksC0269x.f6112P;
                        r.a(linkedHashSet);
                        if (linkedHashSet.remove(str)) {
                            componentCallbacksC0269x.f6126e0.g(cVar.f);
                        }
                    }
                });
                return;
            }
        }
    }

    @Override // n0.N
    public final void i(C1019j c1019j, boolean z7) {
        g.f(c1019j, "popUpTo");
        S s6 = this.d;
        if (s6.R()) {
            Log.i("DialogFragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List list = (List) ((u) b().f12559e.f3382r).getValue();
        for (C1019j c1019j2 : k.g0(list.subList(list.indexOf(c1019j), list.size()))) {
            ComponentCallbacksC0269x F = s6.F(c1019j2.f12547v);
            if (F != null) {
                F.f6126e0.v(this.f);
                ((DialogInterface$OnCancelListenerC0263q) F).f0(false, false);
            }
        }
        b().c(c1019j, z7);
    }
}
