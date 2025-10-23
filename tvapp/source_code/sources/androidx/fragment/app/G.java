package androidx.fragment.app;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import n0.C0999A;
/* loaded from: classes.dex */
public final class G extends androidx.activity.n {
    public final /* synthetic */ int d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f5894e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ G(int i7, Object obj) {
        super(false);
        this.d = i7;
        this.f5894e = obj;
    }

    @Override // androidx.activity.n
    public void a() {
        switch (this.d) {
            case 0:
                boolean isLoggable = Log.isLoggable("FragmentManager", 3);
                S s6 = (S) this.f5894e;
                if (isLoggable) {
                    Log.d("FragmentManager", "handleOnBackCancelled. PREDICTIVE_BACK = true fragment manager " + s6);
                }
                C0247a c0247a = s6.f5928h;
                if (c0247a != null) {
                    c0247a.f5994r = false;
                    c0247a.e(false);
                    s6.A(true);
                    s6.G();
                    Iterator it = s6.f5933m.iterator();
                    while (it.hasNext()) {
                        ((M) it.next()).getClass();
                    }
                }
                s6.f5928h = null;
                return;
            default:
                return;
        }
    }

    @Override // androidx.activity.n
    public final void b() {
        switch (this.d) {
            case 0:
                boolean isLoggable = Log.isLoggable("FragmentManager", 3);
                S s6 = (S) this.f5894e;
                if (isLoggable) {
                    Log.d("FragmentManager", "handleOnBackPressed. PREDICTIVE_BACK = true fragment manager " + s6);
                }
                s6.A(true);
                C0247a c0247a = s6.f5928h;
                G g7 = s6.f5929i;
                if (c0247a != null) {
                    ArrayList arrayList = s6.f5933m;
                    if (!arrayList.isEmpty()) {
                        LinkedHashSet<ComponentCallbacksC0269x> linkedHashSet = new LinkedHashSet(S.H(s6.f5928h));
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            M m7 = (M) it.next();
                            for (ComponentCallbacksC0269x componentCallbacksC0269x : linkedHashSet) {
                                m7.getClass();
                            }
                        }
                    }
                    Iterator it2 = s6.f5928h.f5980a.iterator();
                    while (it2.hasNext()) {
                        ComponentCallbacksC0269x componentCallbacksC0269x2 = ((a0) it2.next()).f5998b;
                        if (componentCallbacksC0269x2 != null) {
                            componentCallbacksC0269x2.f6100C = false;
                        }
                    }
                    Iterator it3 = s6.f(new ArrayList(Collections.singletonList(s6.f5928h)), 0, 1).iterator();
                    while (it3.hasNext()) {
                        C0259m c0259m = (C0259m) it3.next();
                        c0259m.getClass();
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Log.d("FragmentManager", "SpecialEffectsController: Completing Back ");
                        }
                        ArrayList arrayList2 = c0259m.f6060c;
                        c0259m.o(arrayList2);
                        c0259m.c(arrayList2);
                    }
                    s6.f5928h = null;
                    s6.j0();
                    if (Log.isLoggable("FragmentManager", 3)) {
                        Log.d("FragmentManager", "Op is being set to null");
                        Log.d("FragmentManager", "OnBackPressedCallback enabled=" + g7.f5342a + " for  FragmentManager " + s6);
                        return;
                    }
                    return;
                } else if (g7.f5342a) {
                    if (Log.isLoggable("FragmentManager", 3)) {
                        Log.d("FragmentManager", "Calling popBackStackImmediate via onBackPressed callback");
                    }
                    s6.U();
                    return;
                } else {
                    if (Log.isLoggable("FragmentManager", 3)) {
                        Log.d("FragmentManager", "Calling onBackPressed via onBackPressed callback");
                    }
                    s6.f5927g.c();
                    return;
                }
            default:
                ((C0999A) this.f5894e).k();
                return;
        }
    }

    @Override // androidx.activity.n
    public void c(androidx.activity.b bVar) {
        switch (this.d) {
            case 0:
                boolean isLoggable = Log.isLoggable("FragmentManager", 2);
                S s6 = (S) this.f5894e;
                if (isLoggable) {
                    Log.v("FragmentManager", "handleOnBackProgressed. PREDICTIVE_BACK = true fragment manager " + s6);
                }
                if (s6.f5928h != null) {
                    Iterator it = s6.f(new ArrayList(Collections.singletonList(s6.f5928h)), 0, 1).iterator();
                    while (it.hasNext()) {
                        C0259m c0259m = (C0259m) it.next();
                        c0259m.getClass();
                        M5.g.f(bVar, "backEvent");
                        if (Log.isLoggable("FragmentManager", 2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Processing Progress " + bVar.f5307c);
                        }
                        ArrayList arrayList = c0259m.f6060c;
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            A5.q.R(((e0) it2.next()).f6044k, arrayList2);
                        }
                        List l02 = A5.k.l0(A5.k.o0(arrayList2));
                        int size = l02.size();
                        for (int i7 = 0; i7 < size; i7++) {
                            ((d0) l02.get(i7)).c(bVar, c0259m.f6058a);
                        }
                    }
                    Iterator it3 = s6.f5933m.iterator();
                    while (it3.hasNext()) {
                        ((M) it3.next()).getClass();
                    }
                    return;
                }
                return;
            default:
                super.c(bVar);
                return;
        }
    }

    @Override // androidx.activity.n
    public void d(androidx.activity.b bVar) {
        switch (this.d) {
            case 0:
                boolean isLoggable = Log.isLoggable("FragmentManager", 3);
                S s6 = (S) this.f5894e;
                if (isLoggable) {
                    Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = true fragment manager " + s6);
                }
                s6.x();
                s6.getClass();
                s6.y(new P(s6), false);
                return;
            default:
                super.d(bVar);
                return;
        }
    }
}
