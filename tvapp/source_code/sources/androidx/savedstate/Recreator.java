package androidx.savedstate;

import A0.c;
import A0.e;
import A0.g;
import android.os.Bundle;
import androidx.lifecycle.EnumC0336n;
import androidx.lifecycle.InterfaceC0340s;
import androidx.lifecycle.InterfaceC0342u;
import androidx.lifecycle.P;
import androidx.lifecycle.V;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import r0.AbstractC1111a;
/* loaded from: classes.dex */
public final class Recreator implements InterfaceC0340s {

    /* renamed from: q  reason: collision with root package name */
    public final g f6988q;

    public Recreator(g gVar) {
        M5.g.f(gVar, "owner");
        this.f6988q = gVar;
    }

    @Override // androidx.lifecycle.InterfaceC0340s
    public final void d(InterfaceC0342u interfaceC0342u, EnumC0336n enumC0336n) {
        if (enumC0336n == EnumC0336n.ON_CREATE) {
            interfaceC0342u.q().v(this);
            g gVar = this.f6988q;
            Bundle b7 = gVar.f().b("androidx.savedstate.Restarter");
            if (b7 == null) {
                return;
            }
            ArrayList<String> stringArrayList = b7.getStringArrayList("classes_to_restore");
            if (stringArrayList != null) {
                for (String str : stringArrayList) {
                    try {
                        Class<? extends U> asSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(c.class);
                        M5.g.e(asSubclass, "{\n                Class.…class.java)\n            }");
                        try {
                            Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object newInstance = declaredConstructor.newInstance(null);
                                M5.g.e(newInstance, "{\n                constr…wInstance()\n            }");
                                c cVar = (c) newInstance;
                                if (gVar instanceof c0) {
                                    b0 p3 = ((c0) gVar).p();
                                    e f = gVar.f();
                                    p3.getClass();
                                    LinkedHashMap linkedHashMap = p3.f6808a;
                                    Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                                    while (it.hasNext()) {
                                        String str2 = (String) it.next();
                                        M5.g.f(str2, "key");
                                        V v5 = (V) linkedHashMap.get(str2);
                                        M5.g.c(v5);
                                        P.a(v5, f, gVar.q());
                                    }
                                    if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                        f.e();
                                    }
                                } else {
                                    throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner".toString());
                                }
                            } catch (Exception e3) {
                                throw new RuntimeException(AbstractC0515y1.x("Failed to instantiate ", str), e3);
                            }
                        } catch (NoSuchMethodException e7) {
                            throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e7);
                        }
                    } catch (ClassNotFoundException e8) {
                        throw new RuntimeException(AbstractC1111a.r("Class ", str, " wasn't found"), e8);
                    }
                }
                return;
            }
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}
