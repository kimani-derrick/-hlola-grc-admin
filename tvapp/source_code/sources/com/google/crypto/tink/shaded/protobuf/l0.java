package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;
/* loaded from: classes.dex */
public final class l0 extends m0 {
    @Override // com.google.crypto.tink.shaded.protobuf.m0
    public final boolean c(long j7, Object obj) {
        return this.f9144a.getBoolean(obj, j7);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m0
    public final byte d(long j7, Object obj) {
        return this.f9144a.getByte(obj, j7);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m0
    public final double e(long j7, Object obj) {
        return this.f9144a.getDouble(obj, j7);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m0
    public final float f(long j7, Object obj) {
        return this.f9144a.getFloat(obj, j7);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m0
    public final void k(Object obj, long j7, boolean z7) {
        this.f9144a.putBoolean(obj, j7, z7);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m0
    public final void l(Object obj, long j7, byte b7) {
        this.f9144a.putByte(obj, j7, b7);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m0
    public final void m(Object obj, long j7, double d) {
        this.f9144a.putDouble(obj, j7, d);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m0
    public final void n(Object obj, long j7, float f) {
        this.f9144a.putFloat(obj, j7, f);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m0
    public final boolean r() {
        if (super.r()) {
            try {
                Class<?> cls = this.f9144a.getClass();
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getByte", Object.class, cls2);
                cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
                cls.getMethod("getBoolean", Object.class, cls2);
                cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
                cls.getMethod("getFloat", Object.class, cls2);
                cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
                cls.getMethod("getDouble", Object.class, cls2);
                cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
                return true;
            } catch (Throwable th) {
                n0.a(th);
                return false;
            }
        }
        return false;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m0
    public final boolean s() {
        Unsafe unsafe = this.f9144a;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getLong", Object.class, cls2);
                if (n0.e() != null) {
                    try {
                        Class<?> cls3 = this.f9144a.getClass();
                        cls3.getMethod("getByte", cls2);
                        cls3.getMethod("putByte", cls2, Byte.TYPE);
                        cls3.getMethod("getInt", cls2);
                        cls3.getMethod("putInt", cls2, Integer.TYPE);
                        cls3.getMethod("getLong", cls2);
                        cls3.getMethod("putLong", cls2, cls2);
                        cls3.getMethod("copyMemory", cls2, cls2, cls2);
                        cls3.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                        return true;
                    } catch (Throwable th) {
                        n0.a(th);
                        return false;
                    }
                }
            } catch (Throwable th2) {
                n0.a(th2);
            }
        }
        return false;
    }
}
