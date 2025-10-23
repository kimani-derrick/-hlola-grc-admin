package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public abstract class c0 {

    /* renamed from: a  reason: collision with root package name */
    public static final Class f5745a;

    /* renamed from: b  reason: collision with root package name */
    public static final k0 f5746b;

    /* renamed from: c  reason: collision with root package name */
    public static final k0 f5747c;
    public static final k0 d;

    /* JADX WARN: Type inference failed for: r0v6, types: [androidx.datastore.preferences.protobuf.k0, java.lang.Object] */
    static {
        Class<?> cls;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f5745a = cls;
        f5746b = A(false);
        f5747c = A(true);
        d = new Object();
    }

    public static k0 A(boolean z7) {
        Class<?> cls;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (k0) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z7));
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static void B(k0 k0Var, Object obj, Object obj2) {
        k0Var.getClass();
        AbstractC0243w abstractC0243w = (AbstractC0243w) obj;
        j0 j0Var = abstractC0243w.unknownFields;
        j0 j0Var2 = ((AbstractC0243w) obj2).unknownFields;
        if (!j0Var2.equals(j0.f)) {
            int i7 = j0Var.f5787a + j0Var2.f5787a;
            int[] copyOf = Arrays.copyOf(j0Var.f5788b, i7);
            System.arraycopy(j0Var2.f5788b, 0, copyOf, j0Var.f5787a, j0Var2.f5787a);
            Object[] copyOf2 = Arrays.copyOf(j0Var.f5789c, i7);
            System.arraycopy(j0Var2.f5789c, 0, copyOf2, j0Var.f5787a, j0Var2.f5787a);
            j0Var = new j0(i7, copyOf, copyOf2, true);
        }
        abstractC0243w.unknownFields = j0Var;
    }

    public static boolean C(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static void D(int i7, List list, K k5, boolean z7) {
        if (list != null && !list.isEmpty()) {
            C0232k c0232k = (C0232k) k5.f5705a;
            int i8 = 0;
            if (z7) {
                c0232k.i0(i7, 2);
                int i9 = 0;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    ((Boolean) list.get(i10)).getClass();
                    Logger logger = C0232k.f5791h;
                    i9++;
                }
                c0232k.k0(i9);
                while (i8 < list.size()) {
                    c0232k.S(((Boolean) list.get(i8)).booleanValue() ? (byte) 1 : (byte) 0);
                    i8++;
                }
                return;
            }
            while (i8 < list.size()) {
                c0232k.U(i7, ((Boolean) list.get(i8)).booleanValue());
                i8++;
            }
        }
    }

    public static void E(int i7, List list, K k5) {
        if (list != null && !list.isEmpty()) {
            k5.getClass();
            for (int i8 = 0; i8 < list.size(); i8++) {
                ((C0232k) k5.f5705a).W(i7, (C0228g) list.get(i8));
            }
        }
    }

    public static void F(int i7, List list, K k5, boolean z7) {
        if (list != null && !list.isEmpty()) {
            C0232k c0232k = (C0232k) k5.f5705a;
            int i8 = 0;
            if (z7) {
                c0232k.i0(i7, 2);
                int i9 = 0;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    ((Double) list.get(i10)).getClass();
                    Logger logger = C0232k.f5791h;
                    i9 += 8;
                }
                c0232k.k0(i9);
                while (i8 < list.size()) {
                    c0232k.b0(Double.doubleToRawLongBits(((Double) list.get(i8)).doubleValue()));
                    i8++;
                }
                return;
            }
            while (i8 < list.size()) {
                double doubleValue = ((Double) list.get(i8)).doubleValue();
                c0232k.getClass();
                c0232k.a0(Double.doubleToRawLongBits(doubleValue), i7);
                i8++;
            }
        }
    }

    public static void G(int i7, List list, K k5, boolean z7) {
        if (list != null && !list.isEmpty()) {
            C0232k c0232k = (C0232k) k5.f5705a;
            int i8 = 0;
            if (z7) {
                c0232k.i0(i7, 2);
                int i9 = 0;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    i9 += C0232k.C(((Integer) list.get(i10)).intValue());
                }
                c0232k.k0(i9);
                while (i8 < list.size()) {
                    c0232k.d0(((Integer) list.get(i8)).intValue());
                    i8++;
                }
                return;
            }
            while (i8 < list.size()) {
                c0232k.c0(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
        }
    }

    public static void H(int i7, List list, K k5, boolean z7) {
        if (list != null && !list.isEmpty()) {
            C0232k c0232k = (C0232k) k5.f5705a;
            int i8 = 0;
            if (z7) {
                c0232k.i0(i7, 2);
                int i9 = 0;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    ((Integer) list.get(i10)).getClass();
                    Logger logger = C0232k.f5791h;
                    i9 += 4;
                }
                c0232k.k0(i9);
                while (i8 < list.size()) {
                    c0232k.Z(((Integer) list.get(i8)).intValue());
                    i8++;
                }
                return;
            }
            while (i8 < list.size()) {
                c0232k.Y(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
        }
    }

    public static void I(int i7, List list, K k5, boolean z7) {
        if (list != null && !list.isEmpty()) {
            C0232k c0232k = (C0232k) k5.f5705a;
            int i8 = 0;
            if (z7) {
                c0232k.i0(i7, 2);
                int i9 = 0;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    ((Long) list.get(i10)).getClass();
                    Logger logger = C0232k.f5791h;
                    i9 += 8;
                }
                c0232k.k0(i9);
                while (i8 < list.size()) {
                    c0232k.b0(((Long) list.get(i8)).longValue());
                    i8++;
                }
                return;
            }
            while (i8 < list.size()) {
                c0232k.a0(((Long) list.get(i8)).longValue(), i7);
                i8++;
            }
        }
    }

    public static void J(int i7, List list, K k5, boolean z7) {
        if (list != null && !list.isEmpty()) {
            C0232k c0232k = (C0232k) k5.f5705a;
            int i8 = 0;
            if (z7) {
                c0232k.i0(i7, 2);
                int i9 = 0;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    ((Float) list.get(i10)).getClass();
                    Logger logger = C0232k.f5791h;
                    i9 += 4;
                }
                c0232k.k0(i9);
                while (i8 < list.size()) {
                    c0232k.Z(Float.floatToRawIntBits(((Float) list.get(i8)).floatValue()));
                    i8++;
                }
                return;
            }
            while (i8 < list.size()) {
                float floatValue = ((Float) list.get(i8)).floatValue();
                c0232k.getClass();
                c0232k.Y(i7, Float.floatToRawIntBits(floatValue));
                i8++;
            }
        }
    }

    public static void K(int i7, List list, K k5, InterfaceC0223b0 interfaceC0223b0) {
        if (list != null && !list.isEmpty()) {
            k5.getClass();
            for (int i8 = 0; i8 < list.size(); i8++) {
                k5.h(i7, list.get(i8), interfaceC0223b0);
            }
        }
    }

    public static void L(int i7, List list, K k5, boolean z7) {
        if (list != null && !list.isEmpty()) {
            C0232k c0232k = (C0232k) k5.f5705a;
            int i8 = 0;
            if (z7) {
                c0232k.i0(i7, 2);
                int i9 = 0;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    i9 += C0232k.C(((Integer) list.get(i10)).intValue());
                }
                c0232k.k0(i9);
                while (i8 < list.size()) {
                    c0232k.d0(((Integer) list.get(i8)).intValue());
                    i8++;
                }
                return;
            }
            while (i8 < list.size()) {
                c0232k.c0(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
        }
    }

    public static void M(int i7, List list, K k5, boolean z7) {
        if (list != null && !list.isEmpty()) {
            C0232k c0232k = (C0232k) k5.f5705a;
            int i8 = 0;
            if (z7) {
                c0232k.i0(i7, 2);
                int i9 = 0;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    i9 += C0232k.O(((Long) list.get(i10)).longValue());
                }
                c0232k.k0(i9);
                while (i8 < list.size()) {
                    c0232k.m0(((Long) list.get(i8)).longValue());
                    i8++;
                }
                return;
            }
            while (i8 < list.size()) {
                c0232k.l0(((Long) list.get(i8)).longValue(), i7);
                i8++;
            }
        }
    }

    public static void N(int i7, List list, K k5, InterfaceC0223b0 interfaceC0223b0) {
        if (list != null && !list.isEmpty()) {
            k5.getClass();
            for (int i8 = 0; i8 < list.size(); i8++) {
                k5.k(i7, list.get(i8), interfaceC0223b0);
            }
        }
    }

    public static void O(int i7, List list, K k5, boolean z7) {
        if (list != null && !list.isEmpty()) {
            C0232k c0232k = (C0232k) k5.f5705a;
            int i8 = 0;
            if (z7) {
                c0232k.i0(i7, 2);
                int i9 = 0;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    ((Integer) list.get(i10)).getClass();
                    Logger logger = C0232k.f5791h;
                    i9 += 4;
                }
                c0232k.k0(i9);
                while (i8 < list.size()) {
                    c0232k.Z(((Integer) list.get(i8)).intValue());
                    i8++;
                }
                return;
            }
            while (i8 < list.size()) {
                c0232k.Y(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
        }
    }

    public static void P(int i7, List list, K k5, boolean z7) {
        if (list != null && !list.isEmpty()) {
            C0232k c0232k = (C0232k) k5.f5705a;
            int i8 = 0;
            if (z7) {
                c0232k.i0(i7, 2);
                int i9 = 0;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    ((Long) list.get(i10)).getClass();
                    Logger logger = C0232k.f5791h;
                    i9 += 8;
                }
                c0232k.k0(i9);
                while (i8 < list.size()) {
                    c0232k.b0(((Long) list.get(i8)).longValue());
                    i8++;
                }
                return;
            }
            while (i8 < list.size()) {
                c0232k.a0(((Long) list.get(i8)).longValue(), i7);
                i8++;
            }
        }
    }

    public static void Q(int i7, List list, K k5, boolean z7) {
        if (list != null && !list.isEmpty()) {
            C0232k c0232k = (C0232k) k5.f5705a;
            int i8 = 0;
            if (z7) {
                c0232k.i0(i7, 2);
                int i9 = 0;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    int intValue = ((Integer) list.get(i10)).intValue();
                    i9 += C0232k.M((intValue >> 31) ^ (intValue << 1));
                }
                c0232k.k0(i9);
                while (i8 < list.size()) {
                    int intValue2 = ((Integer) list.get(i8)).intValue();
                    c0232k.k0((intValue2 >> 31) ^ (intValue2 << 1));
                    i8++;
                }
                return;
            }
            while (i8 < list.size()) {
                int intValue3 = ((Integer) list.get(i8)).intValue();
                c0232k.j0(i7, (intValue3 >> 31) ^ (intValue3 << 1));
                i8++;
            }
        }
    }

    public static void R(int i7, List list, K k5, boolean z7) {
        if (list != null && !list.isEmpty()) {
            C0232k c0232k = (C0232k) k5.f5705a;
            int i8 = 0;
            if (z7) {
                c0232k.i0(i7, 2);
                int i9 = 0;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    long longValue = ((Long) list.get(i10)).longValue();
                    i9 += C0232k.O((longValue >> 63) ^ (longValue << 1));
                }
                c0232k.k0(i9);
                while (i8 < list.size()) {
                    long longValue2 = ((Long) list.get(i8)).longValue();
                    c0232k.m0((longValue2 >> 63) ^ (longValue2 << 1));
                    i8++;
                }
                return;
            }
            while (i8 < list.size()) {
                long longValue3 = ((Long) list.get(i8)).longValue();
                c0232k.l0((longValue3 >> 63) ^ (longValue3 << 1), i7);
                i8++;
            }
        }
    }

    public static void S(int i7, List list, K k5) {
        if (list != null && !list.isEmpty()) {
            k5.getClass();
            boolean z7 = list instanceof E;
            C0232k c0232k = (C0232k) k5.f5705a;
            int i8 = 0;
            if (z7) {
                E e3 = (E) list;
                while (i8 < list.size()) {
                    Object i9 = e3.i(i8);
                    if (i9 instanceof String) {
                        c0232k.g0((String) i9, i7);
                    } else {
                        c0232k.W(i7, (C0228g) i9);
                    }
                    i8++;
                }
                return;
            }
            while (i8 < list.size()) {
                c0232k.g0((String) list.get(i8), i7);
                i8++;
            }
        }
    }

    public static void T(int i7, List list, K k5, boolean z7) {
        if (list != null && !list.isEmpty()) {
            C0232k c0232k = (C0232k) k5.f5705a;
            int i8 = 0;
            if (z7) {
                c0232k.i0(i7, 2);
                int i9 = 0;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    i9 += C0232k.M(((Integer) list.get(i10)).intValue());
                }
                c0232k.k0(i9);
                while (i8 < list.size()) {
                    c0232k.k0(((Integer) list.get(i8)).intValue());
                    i8++;
                }
                return;
            }
            while (i8 < list.size()) {
                c0232k.j0(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
        }
    }

    public static void U(int i7, List list, K k5, boolean z7) {
        if (list != null && !list.isEmpty()) {
            C0232k c0232k = (C0232k) k5.f5705a;
            int i8 = 0;
            if (z7) {
                c0232k.i0(i7, 2);
                int i9 = 0;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    i9 += C0232k.O(((Long) list.get(i10)).longValue());
                }
                c0232k.k0(i9);
                while (i8 < list.size()) {
                    c0232k.m0(((Long) list.get(i8)).longValue());
                    i8++;
                }
                return;
            }
            while (i8 < list.size()) {
                c0232k.l0(((Long) list.get(i8)).longValue(), i7);
                i8++;
            }
        }
    }

    public static int a(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C0232k.s(i7) * size;
    }

    public static int b(List list) {
        return list.size();
    }

    public static int c(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int K6 = C0232k.K(i7) * size;
        for (int i8 = 0; i8 < list.size(); i8++) {
            K6 += C0232k.u((C0228g) list.get(i8));
        }
        return K6;
    }

    public static int d(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0232k.K(i7) * size) + e(list);
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC0244x) {
            AbstractC0244x abstractC0244x = (AbstractC0244x) list;
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i7 += C0232k.C(((Integer) list.get(i8)).intValue());
        }
        return i7;
    }

    public static int f(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C0232k.x(i7) * size;
    }

    public static int g(List list) {
        return list.size() * 4;
    }

    public static int h(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C0232k.y(i7) * size;
    }

    public static int i(List list) {
        return list.size() * 8;
    }

    public static int j(int i7, List list, InterfaceC0223b0 interfaceC0223b0) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            i8 += C0232k.A(i7, (AbstractC0220a) list.get(i9), interfaceC0223b0);
        }
        return i8;
    }

    public static int k(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0232k.K(i7) * size) + l(list);
    }

    public static int l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC0244x) {
            AbstractC0244x abstractC0244x = (AbstractC0244x) list;
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i7 += C0232k.C(((Integer) list.get(i8)).intValue());
        }
        return i7;
    }

    public static int m(int i7, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (C0232k.K(i7) * list.size()) + n(list);
    }

    public static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof I) {
            I i7 = (I) list;
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            i8 += C0232k.O(((Long) list.get(i9)).longValue());
        }
        return i8;
    }

    public static int o(int i7, Object obj, InterfaceC0223b0 interfaceC0223b0) {
        int K6 = C0232k.K(i7);
        int b7 = ((AbstractC0220a) obj).b(interfaceC0223b0);
        return C0232k.M(b7) + b7 + K6;
    }

    public static int p(int i7, List list, InterfaceC0223b0 interfaceC0223b0) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int K6 = C0232k.K(i7) * size;
        for (int i8 = 0; i8 < size; i8++) {
            int b7 = ((AbstractC0220a) list.get(i8)).b(interfaceC0223b0);
            K6 += C0232k.M(b7) + b7;
        }
        return K6;
    }

    public static int q(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0232k.K(i7) * size) + r(list);
    }

    public static int r(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC0244x) {
            AbstractC0244x abstractC0244x = (AbstractC0244x) list;
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            int intValue = ((Integer) list.get(i8)).intValue();
            i7 += C0232k.M((intValue >> 31) ^ (intValue << 1));
        }
        return i7;
    }

    public static int s(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0232k.K(i7) * size) + t(list);
    }

    public static int t(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof I) {
            I i7 = (I) list;
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            long longValue = ((Long) list.get(i9)).longValue();
            i8 += C0232k.O((longValue >> 63) ^ (longValue << 1));
        }
        return i8;
    }

    public static int u(int i7, List list) {
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        int K6 = C0232k.K(i7) * size;
        if (list instanceof E) {
            E e3 = (E) list;
            while (i8 < size) {
                Object i9 = e3.i(i8);
                K6 = (i9 instanceof C0228g ? C0232k.u((C0228g) i9) : C0232k.J((String) i9)) + K6;
                i8++;
            }
        } else {
            while (i8 < size) {
                Object obj = list.get(i8);
                K6 = (obj instanceof C0228g ? C0232k.u((C0228g) obj) : C0232k.J((String) obj)) + K6;
                i8++;
            }
        }
        return K6;
    }

    public static int v(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0232k.K(i7) * size) + w(list);
    }

    public static int w(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC0244x) {
            AbstractC0244x abstractC0244x = (AbstractC0244x) list;
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i7 += C0232k.M(((Integer) list.get(i8)).intValue());
        }
        return i7;
    }

    public static int x(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0232k.K(i7) * size) + y(list);
    }

    public static int y(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof I) {
            I i7 = (I) list;
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            i8 += C0232k.O(((Long) list.get(i9)).longValue());
        }
        return i8;
    }

    public static Object z(int i7, List list, Object obj, k0 k0Var) {
        return obj;
    }
}
