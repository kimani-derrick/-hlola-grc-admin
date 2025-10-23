package com.google.crypto.tink.shaded.protobuf;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public abstract class c0 {

    /* renamed from: a  reason: collision with root package name */
    public static final Class f9106a;

    /* renamed from: b  reason: collision with root package name */
    public static final f0 f9107b;

    /* renamed from: c  reason: collision with root package name */
    public static final f0 f9108c;
    public static final f0 d;

    /* JADX WARN: Type inference failed for: r0v6, types: [com.google.crypto.tink.shaded.protobuf.f0, java.lang.Object] */
    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.crypto.tink.shaded.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f9106a = cls;
        f9107b = A(false);
        f9108c = A(true);
        d = new Object();
    }

    public static f0 A(boolean z7) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.crypto.tink.shaded.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (f0) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z7));
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static void B(f0 f0Var, Object obj, Object obj2) {
        f0Var.getClass();
        AbstractC0543v abstractC0543v = (AbstractC0543v) obj;
        e0 e0Var = abstractC0543v.unknownFields;
        e0 e0Var2 = ((AbstractC0543v) obj2).unknownFields;
        e0 e0Var3 = e0.f;
        if (!e0Var3.equals(e0Var2)) {
            if (e0Var3.equals(e0Var)) {
                int i7 = e0Var.f9110a + e0Var2.f9110a;
                int[] copyOf = Arrays.copyOf(e0Var.f9111b, i7);
                System.arraycopy(e0Var2.f9111b, 0, copyOf, e0Var.f9110a, e0Var2.f9110a);
                Object[] copyOf2 = Arrays.copyOf(e0Var.f9112c, i7);
                System.arraycopy(e0Var2.f9112c, 0, copyOf2, e0Var.f9110a, e0Var2.f9110a);
                e0Var = new e0(i7, copyOf, copyOf2, true);
            } else {
                e0Var.getClass();
                if (!e0Var2.equals(e0Var3)) {
                    if (e0Var.f9113e) {
                        int i8 = e0Var.f9110a + e0Var2.f9110a;
                        e0Var.a(i8);
                        System.arraycopy(e0Var2.f9111b, 0, e0Var.f9111b, e0Var.f9110a, e0Var2.f9110a);
                        System.arraycopy(e0Var2.f9112c, 0, e0Var.f9112c, e0Var.f9110a, e0Var2.f9110a);
                        e0Var.f9110a = i8;
                    } else {
                        throw new UnsupportedOperationException();
                    }
                }
            }
        }
        abstractC0543v.unknownFields = e0Var;
    }

    public static boolean C(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static void D(int i7, List list, K k5, boolean z7) {
        if (list != null && !list.isEmpty()) {
            C0533k c0533k = (C0533k) k5.f9070a;
            if (z7) {
                c0533k.p0(i7, 2);
                int i8 = 0;
                for (int i9 = 0; i9 < list.size(); i9++) {
                    ((Boolean) list.get(i9)).getClass();
                    Logger logger = C0533k.f9138e;
                    i8++;
                }
                c0533k.q0(i8);
                for (int i10 = 0; i10 < list.size(); i10++) {
                    c0533k.g0(((Boolean) list.get(i10)).booleanValue() ? (byte) 1 : (byte) 0);
                }
                return;
            }
            for (int i11 = 0; i11 < list.size(); i11++) {
                boolean booleanValue = ((Boolean) list.get(i11)).booleanValue();
                c0533k.p0(i7, 0);
                c0533k.g0(booleanValue ? (byte) 1 : (byte) 0);
            }
        }
    }

    public static void E(int i7, List list, K k5) {
        if (list != null && !list.isEmpty()) {
            k5.getClass();
            for (int i8 = 0; i8 < list.size(); i8++) {
                C0533k c0533k = (C0533k) k5.f9070a;
                c0533k.p0(i7, 2);
                c0533k.i0((AbstractC0530h) list.get(i8));
            }
        }
    }

    public static void F(int i7, List list, K k5, boolean z7) {
        if (list != null && !list.isEmpty()) {
            C0533k c0533k = (C0533k) k5.f9070a;
            int i8 = 0;
            if (z7) {
                c0533k.p0(i7, 2);
                int i9 = 0;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    ((Double) list.get(i10)).getClass();
                    Logger logger = C0533k.f9138e;
                    i9 += 8;
                }
                c0533k.q0(i9);
                while (i8 < list.size()) {
                    c0533k.m0(Double.doubleToRawLongBits(((Double) list.get(i8)).doubleValue()));
                    i8++;
                }
                return;
            }
            while (i8 < list.size()) {
                double doubleValue = ((Double) list.get(i8)).doubleValue();
                c0533k.getClass();
                c0533k.l0(Double.doubleToRawLongBits(doubleValue), i7);
                i8++;
            }
        }
    }

    public static void G(int i7, List list, K k5, boolean z7) {
        if (list != null && !list.isEmpty()) {
            C0533k c0533k = (C0533k) k5.f9070a;
            if (z7) {
                c0533k.p0(i7, 2);
                int i8 = 0;
                for (int i9 = 0; i9 < list.size(); i9++) {
                    i8 += C0533k.T(((Integer) list.get(i9)).intValue());
                }
                c0533k.q0(i8);
                for (int i10 = 0; i10 < list.size(); i10++) {
                    c0533k.n0(((Integer) list.get(i10)).intValue());
                }
                return;
            }
            for (int i11 = 0; i11 < list.size(); i11++) {
                int intValue = ((Integer) list.get(i11)).intValue();
                c0533k.p0(i7, 0);
                c0533k.n0(intValue);
            }
        }
    }

    public static void H(int i7, List list, K k5, boolean z7) {
        if (list != null && !list.isEmpty()) {
            C0533k c0533k = (C0533k) k5.f9070a;
            int i8 = 0;
            if (z7) {
                c0533k.p0(i7, 2);
                int i9 = 0;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    ((Integer) list.get(i10)).getClass();
                    Logger logger = C0533k.f9138e;
                    i9 += 4;
                }
                c0533k.q0(i9);
                while (i8 < list.size()) {
                    c0533k.k0(((Integer) list.get(i8)).intValue());
                    i8++;
                }
                return;
            }
            while (i8 < list.size()) {
                c0533k.j0(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
        }
    }

    public static void I(int i7, List list, K k5, boolean z7) {
        if (list != null && !list.isEmpty()) {
            C0533k c0533k = (C0533k) k5.f9070a;
            int i8 = 0;
            if (z7) {
                c0533k.p0(i7, 2);
                int i9 = 0;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    ((Long) list.get(i10)).getClass();
                    Logger logger = C0533k.f9138e;
                    i9 += 8;
                }
                c0533k.q0(i9);
                while (i8 < list.size()) {
                    c0533k.m0(((Long) list.get(i8)).longValue());
                    i8++;
                }
                return;
            }
            while (i8 < list.size()) {
                c0533k.l0(((Long) list.get(i8)).longValue(), i7);
                i8++;
            }
        }
    }

    public static void J(int i7, List list, K k5, boolean z7) {
        if (list != null && !list.isEmpty()) {
            C0533k c0533k = (C0533k) k5.f9070a;
            int i8 = 0;
            if (z7) {
                c0533k.p0(i7, 2);
                int i9 = 0;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    ((Float) list.get(i10)).getClass();
                    Logger logger = C0533k.f9138e;
                    i9 += 4;
                }
                c0533k.q0(i9);
                while (i8 < list.size()) {
                    c0533k.k0(Float.floatToRawIntBits(((Float) list.get(i8)).floatValue()));
                    i8++;
                }
                return;
            }
            while (i8 < list.size()) {
                float floatValue = ((Float) list.get(i8)).floatValue();
                c0533k.getClass();
                c0533k.j0(i7, Float.floatToRawIntBits(floatValue));
                i8++;
            }
        }
    }

    public static void K(int i7, List list, K k5, b0 b0Var) {
        if (list != null && !list.isEmpty()) {
            k5.getClass();
            for (int i8 = 0; i8 < list.size(); i8++) {
                k5.h(i7, list.get(i8), b0Var);
            }
        }
    }

    public static void L(int i7, List list, K k5, boolean z7) {
        if (list != null && !list.isEmpty()) {
            C0533k c0533k = (C0533k) k5.f9070a;
            if (z7) {
                c0533k.p0(i7, 2);
                int i8 = 0;
                for (int i9 = 0; i9 < list.size(); i9++) {
                    i8 += C0533k.T(((Integer) list.get(i9)).intValue());
                }
                c0533k.q0(i8);
                for (int i10 = 0; i10 < list.size(); i10++) {
                    c0533k.n0(((Integer) list.get(i10)).intValue());
                }
                return;
            }
            for (int i11 = 0; i11 < list.size(); i11++) {
                int intValue = ((Integer) list.get(i11)).intValue();
                c0533k.p0(i7, 0);
                c0533k.n0(intValue);
            }
        }
    }

    public static void M(int i7, List list, K k5, boolean z7) {
        if (list != null && !list.isEmpty()) {
            C0533k c0533k = (C0533k) k5.f9070a;
            int i8 = 0;
            if (z7) {
                c0533k.p0(i7, 2);
                int i9 = 0;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    i9 += C0533k.f0(((Long) list.get(i10)).longValue());
                }
                c0533k.q0(i9);
                while (i8 < list.size()) {
                    c0533k.s0(((Long) list.get(i8)).longValue());
                    i8++;
                }
                return;
            }
            while (i8 < list.size()) {
                c0533k.r0(((Long) list.get(i8)).longValue(), i7);
                i8++;
            }
        }
    }

    public static void N(int i7, List list, K k5, b0 b0Var) {
        if (list != null && !list.isEmpty()) {
            k5.getClass();
            for (int i8 = 0; i8 < list.size(); i8++) {
                k5.k(i7, list.get(i8), b0Var);
            }
        }
    }

    public static void O(int i7, List list, K k5, boolean z7) {
        if (list != null && !list.isEmpty()) {
            C0533k c0533k = (C0533k) k5.f9070a;
            int i8 = 0;
            if (z7) {
                c0533k.p0(i7, 2);
                int i9 = 0;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    ((Integer) list.get(i10)).getClass();
                    Logger logger = C0533k.f9138e;
                    i9 += 4;
                }
                c0533k.q0(i9);
                while (i8 < list.size()) {
                    c0533k.k0(((Integer) list.get(i8)).intValue());
                    i8++;
                }
                return;
            }
            while (i8 < list.size()) {
                c0533k.j0(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
        }
    }

    public static void P(int i7, List list, K k5, boolean z7) {
        if (list != null && !list.isEmpty()) {
            C0533k c0533k = (C0533k) k5.f9070a;
            int i8 = 0;
            if (z7) {
                c0533k.p0(i7, 2);
                int i9 = 0;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    ((Long) list.get(i10)).getClass();
                    Logger logger = C0533k.f9138e;
                    i9 += 8;
                }
                c0533k.q0(i9);
                while (i8 < list.size()) {
                    c0533k.m0(((Long) list.get(i8)).longValue());
                    i8++;
                }
                return;
            }
            while (i8 < list.size()) {
                c0533k.l0(((Long) list.get(i8)).longValue(), i7);
                i8++;
            }
        }
    }

    public static void Q(int i7, List list, K k5, boolean z7) {
        if (list != null && !list.isEmpty()) {
            C0533k c0533k = (C0533k) k5.f9070a;
            if (z7) {
                c0533k.p0(i7, 2);
                int i8 = 0;
                for (int i9 = 0; i9 < list.size(); i9++) {
                    int intValue = ((Integer) list.get(i9)).intValue();
                    i8 += C0533k.d0((intValue >> 31) ^ (intValue << 1));
                }
                c0533k.q0(i8);
                for (int i10 = 0; i10 < list.size(); i10++) {
                    int intValue2 = ((Integer) list.get(i10)).intValue();
                    c0533k.q0((intValue2 >> 31) ^ (intValue2 << 1));
                }
                return;
            }
            for (int i11 = 0; i11 < list.size(); i11++) {
                int intValue3 = ((Integer) list.get(i11)).intValue();
                c0533k.p0(i7, 0);
                c0533k.q0((intValue3 >> 31) ^ (intValue3 << 1));
            }
        }
    }

    public static void R(int i7, List list, K k5, boolean z7) {
        if (list != null && !list.isEmpty()) {
            C0533k c0533k = (C0533k) k5.f9070a;
            int i8 = 0;
            if (z7) {
                c0533k.p0(i7, 2);
                int i9 = 0;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    long longValue = ((Long) list.get(i10)).longValue();
                    i9 += C0533k.f0((longValue >> 63) ^ (longValue << 1));
                }
                c0533k.q0(i9);
                while (i8 < list.size()) {
                    long longValue2 = ((Long) list.get(i8)).longValue();
                    c0533k.s0((longValue2 >> 63) ^ (longValue2 << 1));
                    i8++;
                }
                return;
            }
            while (i8 < list.size()) {
                long longValue3 = ((Long) list.get(i8)).longValue();
                c0533k.r0((longValue3 >> 63) ^ (longValue3 << 1), i7);
                i8++;
            }
        }
    }

    public static void S(int i7, List list, K k5) {
        if (list != null && !list.isEmpty()) {
            k5.getClass();
            boolean z7 = list instanceof E;
            C0533k c0533k = (C0533k) k5.f9070a;
            int i8 = 0;
            if (z7) {
                E e3 = (E) list;
                while (i8 < list.size()) {
                    Object i9 = e3.i(i8);
                    if (i9 instanceof String) {
                        c0533k.p0(i7, 2);
                        c0533k.o0((String) i9);
                    } else {
                        c0533k.p0(i7, 2);
                        c0533k.i0((AbstractC0530h) i9);
                    }
                    i8++;
                }
                return;
            }
            while (i8 < list.size()) {
                c0533k.p0(i7, 2);
                c0533k.o0((String) list.get(i8));
                i8++;
            }
        }
    }

    public static void T(int i7, List list, K k5, boolean z7) {
        if (list != null && !list.isEmpty()) {
            C0533k c0533k = (C0533k) k5.f9070a;
            if (z7) {
                c0533k.p0(i7, 2);
                int i8 = 0;
                for (int i9 = 0; i9 < list.size(); i9++) {
                    i8 += C0533k.d0(((Integer) list.get(i9)).intValue());
                }
                c0533k.q0(i8);
                for (int i10 = 0; i10 < list.size(); i10++) {
                    c0533k.q0(((Integer) list.get(i10)).intValue());
                }
                return;
            }
            for (int i11 = 0; i11 < list.size(); i11++) {
                int intValue = ((Integer) list.get(i11)).intValue();
                c0533k.p0(i7, 0);
                c0533k.q0(intValue);
            }
        }
    }

    public static void U(int i7, List list, K k5, boolean z7) {
        if (list != null && !list.isEmpty()) {
            C0533k c0533k = (C0533k) k5.f9070a;
            int i8 = 0;
            if (z7) {
                c0533k.p0(i7, 2);
                int i9 = 0;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    i9 += C0533k.f0(((Long) list.get(i10)).longValue());
                }
                c0533k.q0(i9);
                while (i8 < list.size()) {
                    c0533k.s0(((Long) list.get(i8)).longValue());
                    i8++;
                }
                return;
            }
            while (i8 < list.size()) {
                c0533k.r0(((Long) list.get(i8)).longValue(), i7);
                i8++;
            }
        }
    }

    public static int a(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C0533k.J(i7) * size;
    }

    public static int b(List list) {
        return list.size();
    }

    public static int c(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int b02 = C0533k.b0(i7) * size;
        for (int i8 = 0; i8 < list.size(); i8++) {
            b02 += C0533k.L((AbstractC0530h) list.get(i8));
        }
        return b02;
    }

    public static int d(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0533k.b0(i7) * size) + e(list);
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC0544w) {
            AbstractC0544w abstractC0544w = (AbstractC0544w) list;
            if (size <= 0) {
                return 0;
            }
            abstractC0544w.g(0);
            abstractC0544w.getClass();
            throw null;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i7 += C0533k.T(((Integer) list.get(i8)).intValue());
        }
        return i7;
    }

    public static int f(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C0533k.O(i7) * size;
    }

    public static int g(List list) {
        return list.size() * 4;
    }

    public static int h(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C0533k.P(i7) * size;
    }

    public static int i(List list) {
        return list.size() * 8;
    }

    public static int j(int i7, List list, b0 b0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            i8 += C0533k.R(i7, (AbstractC0523a) list.get(i9), b0Var);
        }
        return i8;
    }

    public static int k(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0533k.b0(i7) * size) + l(list);
    }

    public static int l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC0544w) {
            AbstractC0544w abstractC0544w = (AbstractC0544w) list;
            if (size <= 0) {
                return 0;
            }
            abstractC0544w.g(0);
            abstractC0544w.getClass();
            throw null;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i7 += C0533k.T(((Integer) list.get(i8)).intValue());
        }
        return i7;
    }

    public static int m(int i7, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (C0533k.b0(i7) * list.size()) + n(list);
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
            i7.g(0);
            i7.getClass();
            throw null;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            i8 += C0533k.f0(((Long) list.get(i9)).longValue());
        }
        return i8;
    }

    public static int o(int i7, Object obj, b0 b0Var) {
        int b02 = C0533k.b0(i7);
        int a7 = ((AbstractC0523a) obj).a(b0Var);
        return C0533k.d0(a7) + a7 + b02;
    }

    public static int p(int i7, List list, b0 b0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int b02 = C0533k.b0(i7) * size;
        for (int i8 = 0; i8 < size; i8++) {
            int a7 = ((AbstractC0523a) list.get(i8)).a(b0Var);
            b02 += C0533k.d0(a7) + a7;
        }
        return b02;
    }

    public static int q(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0533k.b0(i7) * size) + r(list);
    }

    public static int r(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC0544w) {
            AbstractC0544w abstractC0544w = (AbstractC0544w) list;
            if (size <= 0) {
                return 0;
            }
            abstractC0544w.g(0);
            abstractC0544w.getClass();
            throw null;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            int intValue = ((Integer) list.get(i8)).intValue();
            i7 += C0533k.d0((intValue >> 31) ^ (intValue << 1));
        }
        return i7;
    }

    public static int s(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0533k.b0(i7) * size) + t(list);
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
            i7.g(0);
            i7.getClass();
            throw null;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            long longValue = ((Long) list.get(i9)).longValue();
            i8 += C0533k.f0((longValue >> 63) ^ (longValue << 1));
        }
        return i8;
    }

    public static int u(int i7, List list) {
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        int b02 = C0533k.b0(i7) * size;
        if (list instanceof E) {
            E e3 = (E) list;
            while (i8 < size) {
                Object i9 = e3.i(i8);
                b02 = (i9 instanceof AbstractC0530h ? C0533k.L((AbstractC0530h) i9) : C0533k.a0((String) i9)) + b02;
                i8++;
            }
        } else {
            while (i8 < size) {
                Object obj = list.get(i8);
                b02 = (obj instanceof AbstractC0530h ? C0533k.L((AbstractC0530h) obj) : C0533k.a0((String) obj)) + b02;
                i8++;
            }
        }
        return b02;
    }

    public static int v(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0533k.b0(i7) * size) + w(list);
    }

    public static int w(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC0544w) {
            AbstractC0544w abstractC0544w = (AbstractC0544w) list;
            if (size <= 0) {
                return 0;
            }
            abstractC0544w.g(0);
            abstractC0544w.getClass();
            throw null;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i7 += C0533k.d0(((Integer) list.get(i8)).intValue());
        }
        return i7;
    }

    public static int x(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0533k.b0(i7) * size) + y(list);
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
            i7.g(0);
            i7.getClass();
            throw null;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            i8 += C0533k.f0(((Long) list.get(i9)).longValue());
        }
        return i8;
    }

    public static Object z(Object obj, int i7, List list, Object obj2, f0 f0Var) {
        return obj2;
    }
}
