package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public abstract class Q {

    /* renamed from: a  reason: collision with root package name */
    public static final C0442j2 f8396a = new C0442j2(7);

    /* renamed from: b  reason: collision with root package name */
    public static final C0442j2 f8397b = new C0442j2(12);

    public static double a(double d) {
        int i7;
        int i8;
        if (Double.isNaN(d)) {
            return 0.0d;
        }
        if (!Double.isInfinite(d) && d != 0.0d && d != -0.0d) {
            if (i7 > 0) {
                i8 = 1;
            } else {
                i8 = -1;
            }
            return Math.floor(Math.abs(d)) * i8;
        }
        return d;
    }

    public static int b(int i7) {
        return (-(i7 & 1)) ^ (i7 >>> 1);
    }

    public static long c(long j7) {
        return (-(j7 & 1)) ^ (j7 >>> 1);
    }

    public static G d(String str) {
        G g7;
        if (str != null && !str.isEmpty()) {
            g7 = (G) G.f8273B0.get(Integer.valueOf(Integer.parseInt(str)));
        } else {
            g7 = null;
        }
        if (g7 != null) {
            return g7;
        }
        throw new IllegalArgumentException(AbstractC0515y1.x("Unsupported commandId ", str));
    }

    public static Object e(InterfaceC0464o interfaceC0464o) {
        if (InterfaceC0464o.f.equals(interfaceC0464o)) {
            return null;
        }
        if (InterfaceC0464o.f8621e.equals(interfaceC0464o)) {
            return "";
        }
        if (interfaceC0464o instanceof C0459n) {
            return f((C0459n) interfaceC0464o);
        }
        if (interfaceC0464o instanceof C0419f) {
            ArrayList arrayList = new ArrayList();
            C0419f c0419f = (C0419f) interfaceC0464o;
            c0419f.getClass();
            int i7 = 0;
            while (i7 < c0419f.u()) {
                if (i7 < c0419f.u()) {
                    int i8 = i7 + 1;
                    Object e3 = e(c0419f.s(i7));
                    if (e3 != null) {
                        arrayList.add(e3);
                    }
                    i7 = i8;
                } else {
                    throw new NoSuchElementException(AbstractC0515y1.l("Out of bounds index: ", i7));
                }
            }
            return arrayList;
        } else if (!interfaceC0464o.r().isNaN()) {
            return interfaceC0464o.r();
        } else {
            return interfaceC0464o.g();
        }
    }

    public static HashMap f(C0459n c0459n) {
        HashMap hashMap = new HashMap();
        c0459n.getClass();
        Iterator it = new ArrayList(c0459n.f8615q.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Object e3 = e(c0459n.b(str));
            if (e3 != null) {
                hashMap.put(str, e3);
            }
        }
        return hashMap;
    }

    public static void g(C4.b bVar) {
        int k5 = k(bVar.e0("runtime.counter").r().doubleValue() + 1.0d);
        if (k5 <= 1000000) {
            bVar.i0("runtime.counter", new C0429h(Double.valueOf(k5)));
            return;
        }
        throw new IllegalStateException("Instructions allowed exceeded");
    }

    public static void h(G g7, int i7, ArrayList arrayList) {
        i(g7.name(), i7, arrayList);
    }

    public static void i(String str, int i7, List list) {
        if (list.size() == i7) {
            return;
        }
        int size = list.size();
        throw new IllegalArgumentException(str + " operation requires " + i7 + " parameters found " + size);
    }

    public static boolean j(InterfaceC0464o interfaceC0464o, InterfaceC0464o interfaceC0464o2) {
        if (!interfaceC0464o.getClass().equals(interfaceC0464o2.getClass())) {
            return false;
        }
        if ((interfaceC0464o instanceof C0493u) || (interfaceC0464o instanceof C0454m)) {
            return true;
        }
        if (interfaceC0464o instanceof C0429h) {
            if (Double.isNaN(interfaceC0464o.r().doubleValue()) || Double.isNaN(interfaceC0464o2.r().doubleValue())) {
                return false;
            }
            return interfaceC0464o.r().equals(interfaceC0464o2.r());
        } else if (interfaceC0464o instanceof C0474q) {
            return interfaceC0464o.g().equals(interfaceC0464o2.g());
        } else {
            if (interfaceC0464o instanceof C0424g) {
                return interfaceC0464o.c().equals(interfaceC0464o2.c());
            }
            if (interfaceC0464o != interfaceC0464o2) {
                return false;
            }
            return true;
        }
    }

    public static int k(double d) {
        int i7;
        int i8;
        if (!Double.isNaN(d) && !Double.isInfinite(d) && d != 0.0d) {
            if (i7 > 0) {
                i8 = 1;
            } else {
                i8 = -1;
            }
            return (int) ((Math.floor(Math.abs(d)) * i8) % 4.294967296E9d);
        }
        return 0;
    }

    public static void l(G g7, int i7, ArrayList arrayList) {
        m(g7.name(), i7, arrayList);
    }

    public static void m(String str, int i7, List list) {
        if (list.size() >= i7) {
            return;
        }
        int size = list.size();
        throw new IllegalArgumentException(str + " operation requires at least " + i7 + " parameters found " + size);
    }

    public static boolean n(InterfaceC0464o interfaceC0464o) {
        if (interfaceC0464o == null) {
            return false;
        }
        Double r3 = interfaceC0464o.r();
        if (r3.isNaN() || r3.doubleValue() < 0.0d || !r3.equals(Double.valueOf(Math.floor(r3.doubleValue())))) {
            return false;
        }
        return true;
    }

    public static void o(String str, int i7, ArrayList arrayList) {
        if (arrayList.size() <= i7) {
            return;
        }
        int size = arrayList.size();
        throw new IllegalArgumentException(str + " operation requires at most " + i7 + " parameters found " + size);
    }
}
