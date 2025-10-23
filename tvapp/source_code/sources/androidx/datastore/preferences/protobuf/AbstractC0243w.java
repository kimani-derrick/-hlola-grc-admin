package androidx.datastore.preferences.protobuf;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* renamed from: androidx.datastore.preferences.protobuf.w  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0243w extends AbstractC0220a {
    private static Map<Object, AbstractC0243w> defaultInstanceMap = new ConcurrentHashMap();
    protected int memoizedSerializedSize;
    protected j0 unknownFields;

    public AbstractC0243w() {
        this.memoizedHashCode = 0;
        this.unknownFields = j0.f;
        this.memoizedSerializedSize = -1;
    }

    public static AbstractC0243w e(Class cls) {
        AbstractC0243w abstractC0243w = defaultInstanceMap.get(cls);
        if (abstractC0243w == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC0243w = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e3) {
                throw new IllegalStateException("Class initialization cannot fail.", e3);
            }
        }
        if (abstractC0243w == null) {
            abstractC0243w = (AbstractC0243w) ((AbstractC0243w) s0.a(cls)).d(6);
            if (abstractC0243w != null) {
                defaultInstanceMap.put(cls, abstractC0243w);
            } else {
                throw new IllegalStateException();
            }
        }
        return abstractC0243w;
    }

    public static Object f(Object obj, Method method, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e3) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e3);
        } catch (InvocationTargetException e7) {
            Throwable cause = e7.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static void h(Class cls, AbstractC0243w abstractC0243w) {
        defaultInstanceMap.put(cls, abstractC0243w);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0220a
    public final int a() {
        if (this.memoizedSerializedSize == -1) {
            Y y3 = Y.f5733c;
            y3.getClass();
            this.memoizedSerializedSize = y3.a(getClass()).d(this);
        }
        return this.memoizedSerializedSize;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0220a
    public final void c(C0232k c0232k) {
        Y y3 = Y.f5733c;
        y3.getClass();
        InterfaceC0223b0 a7 = y3.a(getClass());
        K k5 = c0232k.f5793c;
        if (k5 == null) {
            k5 = new K(c0232k);
        }
        a7.i(this, k5);
    }

    public abstract Object d(int i7);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((AbstractC0243w) d(6)).getClass().isInstance(obj)) {
            return false;
        }
        Y y3 = Y.f5733c;
        y3.getClass();
        return y3.a(getClass()).c(this, (AbstractC0243w) obj);
    }

    public final boolean g() {
        byte byteValue = ((Byte) d(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        Y y3 = Y.f5733c;
        y3.getClass();
        boolean a7 = y3.a(getClass()).a(this);
        d(2);
        return a7;
    }

    public final int hashCode() {
        int i7 = this.memoizedHashCode;
        if (i7 != 0) {
            return i7;
        }
        Y y3 = Y.f5733c;
        y3.getClass();
        int g7 = y3.a(getClass()).g(this);
        this.memoizedHashCode = g7;
        return g7;
    }

    public final String toString() {
        String obj = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        Q.l(this, sb, 0);
        return sb.toString();
    }
}
