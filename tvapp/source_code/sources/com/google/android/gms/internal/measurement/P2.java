package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;
/* loaded from: classes.dex */
public abstract class P2 {

    /* renamed from: a  reason: collision with root package name */
    public final Unsafe f8395a;

    public P2(Unsafe unsafe) {
        this.f8395a = unsafe;
    }

    public abstract double a(long j7, Object obj);

    public final void b(int i7, long j7, Object obj) {
        this.f8395a.putInt(obj, j7, i7);
    }

    public abstract void c(Object obj, long j7, byte b7);

    public abstract void d(Object obj, long j7, double d);

    public abstract void e(Object obj, long j7, float f);

    public final void f(Object obj, long j7, long j8) {
        this.f8395a.putLong(obj, j7, j8);
    }

    public abstract void g(Object obj, long j7, boolean z7);

    public final boolean h() {
        Unsafe unsafe = this.f8395a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            return true;
        } catch (Throwable th) {
            Unsafe unsafe2 = Q2.f8398a;
            Logger.getLogger(Q2.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(String.valueOf(th)));
            return false;
        }
    }

    public abstract float i(long j7, Object obj);

    public final boolean j() {
        Field field;
        Field field2;
        Unsafe unsafe = this.f8395a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("getLong", Object.class, Long.TYPE);
            Unsafe unsafe2 = Q2.f8398a;
            Field field3 = null;
            try {
                field = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                field = null;
            }
            if (field != null) {
                field3 = field;
            } else {
                try {
                    field2 = Buffer.class.getDeclaredField("address");
                } catch (Throwable unused2) {
                    field2 = null;
                }
                if (field2 != null) {
                    if (field2.getType() == Long.TYPE) {
                        field3 = field2;
                    }
                }
            }
            if (field3 != null) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            Unsafe unsafe3 = Q2.f8398a;
            Logger.getLogger(Q2.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(String.valueOf(th)));
            return false;
        }
    }

    public abstract boolean k(long j7, Object obj);

    public final int l(long j7, Object obj) {
        return this.f8395a.getInt(obj, j7);
    }

    public final long m(long j7, Object obj) {
        return this.f8395a.getLong(obj, j7);
    }
}
