package com.google.android.gms.internal.measurement;

import java.security.AccessController;
import sun.misc.Unsafe;
/* loaded from: classes.dex */
public abstract class Q2 {

    /* renamed from: a  reason: collision with root package name */
    public static final Unsafe f8398a;

    /* renamed from: b  reason: collision with root package name */
    public static final Class f8399b;

    /* renamed from: c  reason: collision with root package name */
    public static final P2 f8400c;
    public static final boolean d;

    /* renamed from: e  reason: collision with root package name */
    public static final boolean f8401e;
    public static final long f;

    /* renamed from: g  reason: collision with root package name */
    public static final boolean f8402g;

    /* JADX WARN: Can't wrap try/catch for region: R(16:1|(14:(1:4)(1:(1:39))|5|(1:7)(1:37)|8|(1:10)(1:36)|11|12|13|(1:15)(4:25|26|27|(1:31))|(1:18)|19|(1:21)|22|23)|40|5|(0)(0)|8|(0)(0)|11|12|13|(0)(0)|(1:18)|19|(0)|22|23) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0085, code lost:
        r4 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00af  */
    static {
        /*
            sun.misc.Unsafe r0 = i()
            com.google.android.gms.internal.measurement.Q2.f8398a = r0
            java.lang.Class r1 = com.google.android.gms.internal.measurement.X1.f8446a
            com.google.android.gms.internal.measurement.Q2.f8399b = r1
            java.lang.Class r1 = java.lang.Long.TYPE
            boolean r1 = n(r1)
            java.lang.Class r2 = java.lang.Integer.TYPE
            boolean r2 = n(r2)
            r3 = 0
            if (r0 == 0) goto L2b
            if (r1 == 0) goto L22
            com.google.android.gms.internal.measurement.O2 r1 = new com.google.android.gms.internal.measurement.O2
            r2 = 0
            r1.<init>(r0, r2)
            goto L2c
        L22:
            if (r2 == 0) goto L2b
            com.google.android.gms.internal.measurement.O2 r1 = new com.google.android.gms.internal.measurement.O2
            r2 = 1
            r1.<init>(r0, r2)
            goto L2c
        L2b:
            r1 = r3
        L2c:
            com.google.android.gms.internal.measurement.Q2.f8400c = r1
            r0 = 0
            if (r1 != 0) goto L33
            r2 = r0
            goto L37
        L33:
            boolean r2 = r1.j()
        L37:
            com.google.android.gms.internal.measurement.Q2.d = r2
            if (r1 != 0) goto L3d
            r2 = r0
            goto L41
        L3d:
            boolean r2 = r1.h()
        L41:
            com.google.android.gms.internal.measurement.Q2.f8401e = r2
            java.lang.Class<byte[]> r2 = byte[].class
            int r2 = h(r2)
            long r4 = (long) r2
            com.google.android.gms.internal.measurement.Q2.f = r4
            java.lang.Class<boolean[]> r2 = boolean[].class
            h(r2)
            j(r2)
            java.lang.Class<int[]> r2 = int[].class
            h(r2)
            j(r2)
            java.lang.Class<long[]> r2 = long[].class
            h(r2)
            j(r2)
            java.lang.Class<float[]> r2 = float[].class
            h(r2)
            j(r2)
            java.lang.Class<double[]> r2 = double[].class
            h(r2)
            j(r2)
            java.lang.Class<java.lang.Object[]> r2 = java.lang.Object[].class
            h(r2)
            j(r2)
            java.lang.Class<java.nio.Buffer> r2 = java.nio.Buffer.class
            java.lang.String r4 = "effectiveDirectAddress"
            java.lang.reflect.Field r4 = r2.getDeclaredField(r4)     // Catch: java.lang.Throwable -> L85
            goto L86
        L85:
            r4 = r3
        L86:
            if (r4 == 0) goto L8a
            r3 = r4
            goto L9d
        L8a:
            java.lang.String r4 = "address"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r4)     // Catch: java.lang.Throwable -> L91
            goto L92
        L91:
            r2 = r3
        L92:
            if (r2 == 0) goto L9d
            java.lang.Class r4 = r2.getType()
            java.lang.Class r5 = java.lang.Long.TYPE
            if (r4 != r5) goto L9d
            r3 = r2
        L9d:
            if (r3 == 0) goto La7
            if (r1 != 0) goto La2
            goto La7
        La2:
            sun.misc.Unsafe r1 = r1.f8395a
            r1.objectFieldOffset(r3)
        La7:
            java.nio.ByteOrder r1 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r2 = java.nio.ByteOrder.BIG_ENDIAN
            if (r1 != r2) goto Lb0
            r0 = 1
        Lb0:
            com.google.android.gms.internal.measurement.Q2.f8402g = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.Q2.<clinit>():void");
    }

    public static double a(long j7, Object obj) {
        return f8400c.a(j7, obj);
    }

    public static Object b(Class cls) {
        try {
            return f8398a.allocateInstance(cls);
        } catch (InstantiationException e3) {
            throw new IllegalStateException(e3);
        }
    }

    public static void c(int i7, long j7, Object obj) {
        f8400c.b(i7, j7, obj);
    }

    public static void d(long j7, Object obj, Object obj2) {
        f8400c.f8395a.putObject(obj, j7, obj2);
    }

    public static void e(Object obj, long j7, double d7) {
        f8400c.d(obj, j7, d7);
    }

    public static void f(Object obj, long j7, float f7) {
        f8400c.e(obj, j7, f7);
    }

    public static float g(long j7, Object obj) {
        return f8400c.i(j7, obj);
    }

    public static int h(Class cls) {
        if (f8401e) {
            return f8400c.f8395a.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static Unsafe i() {
        try {
            return (Unsafe) AccessController.doPrivileged(new N2());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void j(Class cls) {
        if (f8401e) {
            f8400c.f8395a.arrayIndexScale(cls);
        }
    }

    public static void k(Object obj, long j7, byte b7) {
        long j8 = (-4) & j7;
        int l7 = f8400c.l(j8, obj);
        int i7 = ((~((int) j7)) & 3) << 3;
        c(((255 & b7) << i7) | (l7 & (~(255 << i7))), j8, obj);
    }

    public static void l(Object obj, long j7, boolean z7) {
        f8400c.g(obj, j7, z7);
    }

    public static void m(Object obj, long j7, byte b7) {
        long j8 = (-4) & j7;
        int i7 = (((int) j7) & 3) << 3;
        c(((255 & b7) << i7) | (f8400c.l(j8, obj) & (~(255 << i7))), j8, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean n(Class cls) {
        try {
            Class cls2 = f8399b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static Object o(long j7, Object obj) {
        return f8400c.f8395a.getObject(obj, j7);
    }

    public static boolean p(long j7, Object obj) {
        return f8400c.k(j7, obj);
    }
}
