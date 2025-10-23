package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Logger;
import sun.misc.Unsafe;
/* loaded from: classes.dex */
public abstract class s0 {

    /* renamed from: a  reason: collision with root package name */
    public static final Logger f5814a = Logger.getLogger(s0.class.getName());

    /* renamed from: b  reason: collision with root package name */
    public static final Unsafe f5815b;

    /* renamed from: c  reason: collision with root package name */
    public static final Class f5816c;
    public static final r0 d;

    /* renamed from: e  reason: collision with root package name */
    public static final boolean f5817e;
    public static final boolean f;

    /* renamed from: g  reason: collision with root package name */
    public static final long f5818g;

    /* renamed from: h  reason: collision with root package name */
    public static final boolean f5819h;

    /* JADX WARN: Removed duplicated region for block: B:110:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x027a  */
    static {
        /*
            Method dump skipped, instructions count: 638
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.s0.<clinit>():void");
    }

    public static Object a(Class cls) {
        try {
            return f5815b.allocateInstance(cls);
        } catch (InstantiationException e3) {
            throw new IllegalStateException(e3);
        }
    }

    public static int b(Class cls) {
        if (f) {
            return d.a(cls);
        }
        return -1;
    }

    public static void c(Class cls) {
        if (f) {
            d.b(cls);
        }
    }

    public static Field d() {
        Field field;
        Field field2;
        if (AbstractC0224c.a()) {
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
    public static boolean e(Class cls) {
        if (AbstractC0224c.a()) {
            try {
                Class cls2 = f5816c;
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

    public static byte f(byte[] bArr, long j7) {
        return d.d(f5818g + j7, bArr);
    }

    public static byte g(long j7, Object obj) {
        return (byte) ((d.g((-4) & j7, obj) >>> ((int) (((~j7) & 3) << 3))) & 255);
    }

    public static byte h(long j7, Object obj) {
        return (byte) ((d.g((-4) & j7, obj) >>> ((int) ((j7 & 3) << 3))) & 255);
    }

    public static int i(long j7, Object obj) {
        return d.g(j7, obj);
    }

    public static long j(long j7, Object obj) {
        return d.h(j7, obj);
    }

    public static Object k(long j7, Object obj) {
        return d.i(j7, obj);
    }

    public static Unsafe l() {
        try {
            return (Unsafe) AccessController.doPrivileged(new o0());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void m(byte[] bArr, long j7, byte b7) {
        d.l(bArr, f5818g + j7, b7);
    }

    public static void n(Object obj, long j7, byte b7) {
        long j8 = (-4) & j7;
        int g7 = d.g(j8, obj);
        int i7 = ((~((int) j7)) & 3) << 3;
        p(((255 & b7) << i7) | (g7 & (~(255 << i7))), j8, obj);
    }

    public static void o(Object obj, long j7, byte b7) {
        long j8 = (-4) & j7;
        int i7 = (((int) j7) & 3) << 3;
        p(((255 & b7) << i7) | (d.g(j8, obj) & (~(255 << i7))), j8, obj);
    }

    public static void p(int i7, long j7, Object obj) {
        d.o(i7, j7, obj);
    }

    public static void q(Object obj, long j7, long j8) {
        d.p(obj, j7, j8);
    }

    public static void r(long j7, Object obj, Object obj2) {
        d.q(j7, obj, obj2);
    }
}
