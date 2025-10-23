package androidx.lifecycle;

import H2.C0002c;
import W5.AbstractC0117y;
import W5.InterfaceC0116x;
import W5.q0;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicReference;
import l0.C0967c;
import l0.C0968d;
import z5.C1530l;
/* loaded from: classes.dex */
public abstract class P {

    /* renamed from: a  reason: collision with root package name */
    public static final W f6773a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final W f6774b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static final W f6775c = new Object();

    public static final void a(V v5, A0.e eVar, P1.c cVar) {
        Object obj;
        M5.g.f(eVar, "registry");
        M5.g.f(cVar, "lifecycle");
        HashMap hashMap = v5.f6798a;
        if (hashMap == null) {
            obj = null;
        } else {
            synchronized (hashMap) {
                obj = v5.f6798a.get("androidx.lifecycle.savedstate.vm.tag");
            }
        }
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) obj;
        if (savedStateHandleController != null && !savedStateHandleController.f6791s) {
            savedStateHandleController.j(eVar, cVar);
            l(eVar, cVar);
        }
    }

    public static final SavedStateHandleController b(A0.e eVar, P1.c cVar, String str, Bundle bundle) {
        Bundle b7 = eVar.b(str);
        Class[] clsArr = N.f;
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, c(b7, bundle));
        savedStateHandleController.j(eVar, cVar);
        l(eVar, cVar);
        return savedStateHandleController;
    }

    public static N c(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            if (bundle2 == null) {
                return new N();
            }
            HashMap hashMap = new HashMap();
            for (String str : bundle2.keySet()) {
                M5.g.e(str, "key");
                hashMap.put(str, bundle2.get(str));
            }
            return new N(hashMap);
        }
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
        if (parcelableArrayList != null && parcelableArrayList2 != null && parcelableArrayList.size() == parcelableArrayList2.size()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size = parcelableArrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                Object obj = parcelableArrayList.get(i7);
                M5.g.d(obj, "null cannot be cast to non-null type kotlin.String");
                linkedHashMap.put((String) obj, parcelableArrayList2.get(i7));
            }
            return new N(linkedHashMap);
        }
        throw new IllegalStateException("Invalid bundle passed as restored state".toString());
    }

    public static final N d(C0967c c0967c) {
        Q q5;
        Bundle bundle;
        W w7 = f6773a;
        LinkedHashMap linkedHashMap = c0967c.f12233a;
        A0.g gVar = (A0.g) linkedHashMap.get(w7);
        if (gVar != null) {
            c0 c0Var = (c0) linkedHashMap.get(f6774b);
            if (c0Var != null) {
                Bundle bundle2 = (Bundle) linkedHashMap.get(f6775c);
                String str = (String) linkedHashMap.get(W.f6802b);
                if (str != null) {
                    A0.d c5 = gVar.f().c();
                    if (c5 instanceof Q) {
                        q5 = (Q) c5;
                    } else {
                        q5 = null;
                    }
                    if (q5 != null) {
                        LinkedHashMap linkedHashMap2 = h(c0Var).d;
                        N n = (N) linkedHashMap2.get(str);
                        if (n == null) {
                            Class[] clsArr = N.f;
                            q5.b();
                            Bundle bundle3 = q5.f6778c;
                            if (bundle3 != null) {
                                bundle = bundle3.getBundle(str);
                            } else {
                                bundle = null;
                            }
                            Bundle bundle4 = q5.f6778c;
                            if (bundle4 != null) {
                                bundle4.remove(str);
                            }
                            Bundle bundle5 = q5.f6778c;
                            if (bundle5 != null && bundle5.isEmpty()) {
                                q5.f6778c = null;
                            }
                            N c6 = c(bundle, bundle2);
                            linkedHashMap2.put(str, c6);
                            return c6;
                        }
                        return n;
                    }
                    throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
                }
                throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            }
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
    }

    public static void e(Activity activity, EnumC0336n enumC0336n) {
        M5.g.f(activity, "activity");
        M5.g.f(enumC0336n, "event");
        if (activity instanceof InterfaceC0342u) {
            P1.c q5 = ((InterfaceC0342u) activity).q();
            if (q5 instanceof C0344w) {
                ((C0344w) q5).G(enumC0336n);
            }
        }
    }

    public static final void f(A0.g gVar) {
        M5.g.f(gVar, "<this>");
        EnumC0337o l7 = gVar.q().l();
        if (l7 != EnumC0337o.f6818r && l7 != EnumC0337o.f6819s) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (gVar.f().c() == null) {
            Q q5 = new Q(gVar.f(), (c0) gVar);
            gVar.f().d("androidx.lifecycle.internal.SavedStateHandlesProvider", q5);
            gVar.q().g(new SavedStateHandleAttacher(q5));
        }
    }

    public static final LifecycleCoroutineScopeImpl g(InterfaceC0342u interfaceC0342u) {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl;
        M5.g.f(interfaceC0342u, "<this>");
        P1.c q5 = interfaceC0342u.q();
        M5.g.f(q5, "<this>");
        loop0: while (true) {
            AtomicReference atomicReference = (AtomicReference) q5.f2765q;
            lifecycleCoroutineScopeImpl = (LifecycleCoroutineScopeImpl) atomicReference.get();
            if (lifecycleCoroutineScopeImpl == null) {
                q0 b7 = AbstractC0117y.b();
                d6.d dVar = W5.G.f3945a;
                lifecycleCoroutineScopeImpl = new LifecycleCoroutineScopeImpl(q5, p6.d.A(b7, b6.o.f7208a.f4295v));
                while (!atomicReference.compareAndSet(null, lifecycleCoroutineScopeImpl)) {
                    if (atomicReference.get() != null) {
                        break;
                    }
                }
                d6.d dVar2 = W5.G.f3945a;
                AbstractC0117y.p(lifecycleCoroutineScopeImpl, b6.o.f7208a.f4295v, 0, new C0338p(lifecycleCoroutineScopeImpl, null), 2);
                break loop0;
            }
            break;
        }
        return lifecycleCoroutineScopeImpl;
    }

    public static final S h(c0 c0Var) {
        M5.g.f(c0Var, "<this>");
        ArrayList arrayList = new ArrayList();
        Class a7 = M5.p.a(S.class).a();
        M5.g.d(a7, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        arrayList.add(new C0968d(a7));
        C0968d[] c0968dArr = (C0968d[]) arrayList.toArray(new C0968d[0]);
        return (S) new C0002c(c0Var, new dagger.hilt.android.internal.managers.c((C0968d[]) Arrays.copyOf(c0968dArr, c0968dArr.length))).y(S.class, "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static final InterfaceC0116x i(V v5) {
        Object obj;
        Object obj2;
        M5.g.f(v5, "<this>");
        HashMap hashMap = v5.f6798a;
        if (hashMap == null) {
            obj2 = null;
        } else {
            synchronized (hashMap) {
                obj = v5.f6798a.get("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY");
            }
            obj2 = obj;
        }
        InterfaceC0116x interfaceC0116x = (InterfaceC0116x) obj2;
        if (interfaceC0116x != null) {
            return interfaceC0116x;
        }
        q0 b7 = AbstractC0117y.b();
        d6.d dVar = W5.G.f3945a;
        return (InterfaceC0116x) v5.c(new C0327e(p6.d.A(b7, b6.o.f7208a.f4295v)), "androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY");
    }

    public static void j(Activity activity) {
        M5.g.f(activity, "activity");
        if (Build.VERSION.SDK_INT >= 29) {
            L.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new L());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new Fragment(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    public static final Object k(InterfaceC0342u interfaceC0342u, EnumC0337o enumC0337o, L5.p pVar, D5.d dVar) {
        Object e3;
        P1.c q5 = interfaceC0342u.q();
        if (enumC0337o != EnumC0337o.f6818r) {
            EnumC0337o l7 = q5.l();
            EnumC0337o enumC0337o2 = EnumC0337o.f6817q;
            C1530l c1530l = C1530l.f16479a;
            E5.a aVar = E5.a.f612q;
            if (l7 == enumC0337o2 || (e3 = AbstractC0117y.e(new J(q5, enumC0337o, pVar, null), dVar)) != aVar) {
                e3 = c1530l;
            }
            if (e3 == aVar) {
                return e3;
            }
            return c1530l;
        }
        throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.".toString());
    }

    public static void l(final A0.e eVar, final P1.c cVar) {
        EnumC0337o l7 = cVar.l();
        if (l7 != EnumC0337o.f6818r && l7.compareTo(EnumC0337o.f6820t) < 0) {
            cVar.g(new InterfaceC0340s() { // from class: androidx.lifecycle.LegacySavedStateHandleController$tryToAddRecreator$1
                @Override // androidx.lifecycle.InterfaceC0340s
                public final void d(InterfaceC0342u interfaceC0342u, EnumC0336n enumC0336n) {
                    if (enumC0336n == EnumC0336n.ON_START) {
                        cVar.v(this);
                        eVar.e();
                    }
                }
            });
        } else {
            eVar.e();
        }
    }
}
