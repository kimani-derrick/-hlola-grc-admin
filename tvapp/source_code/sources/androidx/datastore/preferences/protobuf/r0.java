package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;
/* loaded from: classes.dex */
public abstract class r0 {

    /* renamed from: a  reason: collision with root package name */
    public final Unsafe f5813a;

    public r0(Unsafe unsafe) {
        this.f5813a = unsafe;
    }

    public final int a(Class cls) {
        return this.f5813a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.f5813a.arrayIndexScale(cls);
    }

    public abstract boolean c(long j7, Object obj);

    public abstract byte d(long j7, Object obj);

    public abstract double e(long j7, Object obj);

    public abstract float f(long j7, Object obj);

    public final int g(long j7, Object obj) {
        return this.f5813a.getInt(obj, j7);
    }

    public final long h(long j7, Object obj) {
        return this.f5813a.getLong(obj, j7);
    }

    public final Object i(long j7, Object obj) {
        return this.f5813a.getObject(obj, j7);
    }

    public final long j(Field field) {
        return this.f5813a.objectFieldOffset(field);
    }

    public abstract void k(Object obj, long j7, boolean z7);

    public abstract void l(Object obj, long j7, byte b7);

    public abstract void m(Object obj, long j7, double d);

    public abstract void n(Object obj, long j7, float f);

    public final void o(int i7, long j7, Object obj) {
        this.f5813a.putInt(obj, j7, i7);
    }

    public final void p(Object obj, long j7, long j8) {
        this.f5813a.putLong(obj, j7, j8);
    }

    public final void q(long j7, Object obj, Object obj2) {
        this.f5813a.putObject(obj, j7, obj2);
    }
}
