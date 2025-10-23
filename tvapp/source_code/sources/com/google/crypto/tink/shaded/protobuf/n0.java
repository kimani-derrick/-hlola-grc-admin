package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;
/* loaded from: classes.dex */
public abstract class n0 {

    /* renamed from: a  reason: collision with root package name */
    public static final Unsafe f9147a;

    /* renamed from: b  reason: collision with root package name */
    public static final Class f9148b;

    /* renamed from: c  reason: collision with root package name */
    public static final m0 f9149c;
    public static final boolean d;

    /* renamed from: e  reason: collision with root package name */
    public static final boolean f9150e;
    public static final long f;

    /* renamed from: g  reason: collision with root package name */
    public static final boolean f9151g;

    static {
        boolean s6;
        boolean r3;
        Unsafe m7 = m();
        f9147a = m7;
        f9148b = AbstractC0525c.f9104a;
        boolean f7 = f(Long.TYPE);
        boolean f8 = f(Integer.TYPE);
        m0 m0Var = null;
        if (m7 != null) {
            if (AbstractC0525c.a()) {
                if (f7) {
                    m0Var = new k0(m7, 1);
                } else if (f8) {
                    m0Var = new k0(m7, 0);
                }
            } else {
                m0Var = new m0(m7);
            }
        }
        f9149c = m0Var;
        boolean z7 = false;
        if (m0Var == null) {
            s6 = false;
        } else {
            s6 = m0Var.s();
        }
        d = s6;
        if (m0Var == null) {
            r3 = false;
        } else {
            r3 = m0Var.r();
        }
        f9150e = r3;
        f = c(byte[].class);
        c(boolean[].class);
        d(boolean[].class);
        c(int[].class);
        d(int[].class);
        c(long[].class);
        d(long[].class);
        c(float[].class);
        d(float[].class);
        c(double[].class);
        d(double[].class);
        c(Object[].class);
        d(Object[].class);
        Field e3 = e();
        if (e3 != null && m0Var != null) {
            m0Var.j(e3);
        }
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            z7 = true;
        }
        f9151g = z7;
    }

    public static void a(Throwable th) {
        Logger logger = Logger.getLogger(n0.class.getName());
        Level level = Level.WARNING;
        logger.log(level, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static Object b(Class cls) {
        try {
            return f9147a.allocateInstance(cls);
        } catch (InstantiationException e3) {
            throw new IllegalStateException(e3);
        }
    }

    public static int c(Class cls) {
        if (f9150e) {
            return f9149c.a(cls);
        }
        return -1;
    }

    public static void d(Class cls) {
        if (f9150e) {
            f9149c.b(cls);
        }
    }

    public static Field e() {
        Field field;
        Field field2;
        if (AbstractC0525c.a()) {
            try {
                field2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                field2 = null;
            }
            if (field2 != null) {
                return field2;
            }
        }
        try {
            field = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            field = null;
        }
        if (field == null || field.getType() != Long.TYPE) {
            return null;
        }
        return field;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean f(Class cls) {
        if (AbstractC0525c.a()) {
            try {
                Class cls2 = f9148b;
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
        return false;
    }

    public static byte g(byte[] bArr, long j7) {
        return f9149c.d(f + j7, bArr);
    }

    public static byte h(long j7, Object obj) {
        return (byte) ((f9149c.g((-4) & j7, obj) >>> ((int) (((~j7) & 3) << 3))) & 255);
    }

    public static byte i(long j7, Object obj) {
        return (byte) ((f9149c.g((-4) & j7, obj) >>> ((int) ((j7 & 3) << 3))) & 255);
    }

    public static int j(long j7, Object obj) {
        return f9149c.g(j7, obj);
    }

    public static long k(long j7, Object obj) {
        return f9149c.h(j7, obj);
    }

    public static Object l(long j7, Object obj) {
        return f9149c.i(j7, obj);
    }

    public static Unsafe m() {
        try {
            return (Unsafe) AccessController.doPrivileged(new j0());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void n(Object obj, long j7, boolean z7) {
        f9149c.k(obj, j7, z7);
    }

    public static void o(byte[] bArr, long j7, byte b7) {
        f9149c.l(bArr, f + j7, b7);
    }

    public static void p(Object obj, long j7, byte b7) {
        long j8 = (-4) & j7;
        int g7 = f9149c.g(j8, obj);
        int i7 = ((~((int) j7)) & 3) << 3;
        t(((255 & b7) << i7) | (g7 & (~(255 << i7))), j8, obj);
    }

    public static void q(Object obj, long j7, byte b7) {
        long j8 = (-4) & j7;
        int i7 = (((int) j7) & 3) << 3;
        t(((255 & b7) << i7) | (f9149c.g(j8, obj) & (~(255 << i7))), j8, obj);
    }

    public static void r(Object obj, long j7, double d7) {
        f9149c.m(obj, j7, d7);
    }

    public static void s(Object obj, long j7, float f7) {
        f9149c.n(obj, j7, f7);
    }

    public static void t(int i7, long j7, Object obj) {
        f9149c.o(i7, j7, obj);
    }

    public static void u(Object obj, long j7, long j8) {
        f9149c.p(obj, j7, j8);
    }

    public static void v(long j7, Object obj, Object obj2) {
        f9149c.q(j7, obj, obj2);
    }
}
