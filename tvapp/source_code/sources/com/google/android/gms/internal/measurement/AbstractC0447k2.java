package com.google.android.gms.internal.measurement;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;
/* renamed from: com.google.android.gms.internal.measurement.k2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0447k2 {

    /* renamed from: a  reason: collision with root package name */
    public static final C0442j2 f8600a = new C0442j2(11);

    public static C0419f a(C0419f c0419f, C4.b bVar, C0469p c0469p, Boolean bool, Boolean bool2) {
        C0419f c0419f2 = new C0419f();
        Iterator z7 = c0419f.z();
        while (z7.hasNext()) {
            int intValue = ((Integer) z7.next()).intValue();
            if (c0419f.y(intValue)) {
                InterfaceC0464o a7 = c0469p.a(bVar, Arrays.asList(c0419f.s(intValue), new C0429h(Double.valueOf(intValue)), c0419f));
                if (a7.c().equals(bool)) {
                    return c0419f2;
                }
                if (bool2 == null || a7.c().equals(bool2)) {
                    c0419f2.x(intValue, a7);
                }
            }
        }
        return c0419f2;
    }

    public static InterfaceC0464o b(C0419f c0419f, C4.b bVar, ArrayList arrayList, boolean z7) {
        InterfaceC0464o interfaceC0464o;
        int i7;
        int i8;
        int i9;
        Q.m("reduce", 1, arrayList);
        Q.o("reduce", 2, arrayList);
        InterfaceC0464o S6 = ((androidx.fragment.app.D) bVar.f422s).S(bVar, (InterfaceC0464o) arrayList.get(0));
        if (S6 instanceof AbstractC0444k) {
            if (arrayList.size() == 2) {
                interfaceC0464o = ((androidx.fragment.app.D) bVar.f422s).S(bVar, (InterfaceC0464o) arrayList.get(1));
                if (interfaceC0464o instanceof C0434i) {
                    throw new IllegalArgumentException("Failed to parse initial value");
                }
            } else if (c0419f.u() != 0) {
                interfaceC0464o = null;
            } else {
                throw new IllegalStateException("Empty array with no initial value error");
            }
            AbstractC0444k abstractC0444k = (AbstractC0444k) S6;
            int u7 = c0419f.u();
            if (z7) {
                i7 = 0;
            } else {
                i7 = u7 - 1;
            }
            if (z7) {
                i8 = u7 - 1;
            } else {
                i8 = 0;
            }
            if (z7) {
                i9 = 1;
            } else {
                i9 = -1;
            }
            if (interfaceC0464o == null) {
                interfaceC0464o = c0419f.s(i7);
                i7 += i9;
            }
            while ((i8 - i7) * i9 >= 0) {
                if (c0419f.y(i7)) {
                    interfaceC0464o = abstractC0444k.a(bVar, Arrays.asList(interfaceC0464o, c0419f.s(i7), new C0429h(Double.valueOf(i7)), c0419f));
                    if (interfaceC0464o instanceof C0434i) {
                        throw new IllegalStateException("Reduce operation failed");
                    }
                    i7 += i9;
                } else {
                    i7 += i9;
                }
            }
            return interfaceC0464o;
        }
        throw new IllegalArgumentException("Callback should be a method");
    }

    public static C0422f2 c() {
        String str;
        ClassLoader classLoader = AbstractC0447k2.class.getClassLoader();
        if (!C0422f2.class.equals(C0422f2.class)) {
            if (!C0422f2.class.getPackage().equals(AbstractC0447k2.class.getPackage())) {
                throw new IllegalArgumentException(C0422f2.class.getName());
            }
            str = C0422f2.class.getPackage().getName() + ".BlazeGenerated" + C0422f2.class.getSimpleName() + "Loader";
        } else {
            str = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
        }
        try {
            try {
                try {
                    AbstractC0515y1.v(Class.forName(str, true, classLoader).getConstructor(null).newInstance(null));
                    throw null;
                } catch (IllegalAccessException e3) {
                    throw new IllegalStateException(e3);
                } catch (InvocationTargetException e7) {
                    throw new IllegalStateException(e7);
                }
            } catch (InstantiationException e8) {
                throw new IllegalStateException(e8);
            } catch (NoSuchMethodException e9) {
                throw new IllegalStateException(e9);
            }
        } catch (ClassNotFoundException unused) {
            Iterator it = ServiceLoader.load(AbstractC0447k2.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    AbstractC0515y1.v(it.next());
                    throw null;
                } catch (ServiceConfigurationError e10) {
                    Logger.getLogger(C0412d2.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(C0422f2.class.getSimpleName()), (Throwable) e10);
                }
            }
            if (arrayList.size() == 1) {
                return (C0422f2) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (C0422f2) C0422f2.class.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (IllegalAccessException e11) {
                throw new IllegalStateException(e11);
            } catch (NoSuchMethodException e12) {
                throw new IllegalStateException(e12);
            } catch (InvocationTargetException e13) {
                throw new IllegalStateException(e13);
            }
        }
    }

    public static boolean d(byte b7) {
        if (b7 > -65) {
            return true;
        }
        return false;
    }
}
