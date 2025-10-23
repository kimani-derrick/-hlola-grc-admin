package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;
/* loaded from: classes.dex */
public abstract class m0 {

    /* renamed from: a  reason: collision with root package name */
    public final Unsafe f9144a;

    public m0(Unsafe unsafe) {
        this.f9144a = unsafe;
    }

    public final int a(Class cls) {
        return this.f9144a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.f9144a.arrayIndexScale(cls);
    }

    public abstract boolean c(long j7, Object obj);

    public abstract byte d(long j7, Object obj);

    public abstract double e(long j7, Object obj);

    public abstract float f(long j7, Object obj);

    public final int g(long j7, Object obj) {
        return this.f9144a.getInt(obj, j7);
    }

    public final long h(long j7, Object obj) {
        return this.f9144a.getLong(obj, j7);
    }

    public final Object i(long j7, Object obj) {
        return this.f9144a.getObject(obj, j7);
    }

    public final long j(Field field) {
        return this.f9144a.objectFieldOffset(field);
    }

    public abstract void k(Object obj, long j7, boolean z7);

    public abstract void l(Object obj, long j7, byte b7);

    public abstract void m(Object obj, long j7, double d);

    public abstract void n(Object obj, long j7, float f);

    public final void o(int i7, long j7, Object obj) {
        this.f9144a.putInt(obj, j7, i7);
    }

    public final void p(Object obj, long j7, long j8) {
        this.f9144a.putLong(obj, j7, j8);
    }

    public final void q(long j7, Object obj, Object obj2) {
        this.f9144a.putObject(obj, j7, obj2);
    }

    public boolean r() {
        Unsafe unsafe = this.f9144a;
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
            n0.a(th);
            return false;
        }
    }

    public abstract boolean s();
}
