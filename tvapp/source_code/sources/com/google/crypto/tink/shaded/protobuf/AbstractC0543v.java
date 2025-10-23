package com.google.crypto.tink.shaded.protobuf;

import androidx.datastore.preferences.protobuf.C0230i;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* renamed from: com.google.crypto.tink.shaded.protobuf.v  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0543v extends AbstractC0523a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, AbstractC0543v> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected e0 unknownFields;

    public AbstractC0543v() {
        this.memoizedHashCode = UNINITIALIZED_HASH_CODE;
        this.memoizedSerializedSize = -1;
        this.unknownFields = e0.f;
    }

    public static void g(AbstractC0543v abstractC0543v) {
        if (o(abstractC0543v, true)) {
            return;
        }
        throw new IOException(new d0().getMessage());
    }

    public static AbstractC0543v l(Class cls) {
        AbstractC0543v abstractC0543v = defaultInstanceMap.get(cls);
        if (abstractC0543v == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC0543v = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e3) {
                throw new IllegalStateException("Class initialization cannot fail.", e3);
            }
        }
        if (abstractC0543v == null) {
            abstractC0543v = ((AbstractC0543v) n0.b(cls)).b();
            if (abstractC0543v == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, abstractC0543v);
        }
        return abstractC0543v;
    }

    public static Object n(Object obj, Method method, Object... objArr) {
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

    public static final boolean o(AbstractC0543v abstractC0543v, boolean z7) {
        byte byteValue = ((Byte) abstractC0543v.k(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        Y y3 = Y.f9094c;
        y3.getClass();
        boolean a7 = y3.a(abstractC0543v.getClass()).a(abstractC0543v);
        if (z7) {
            abstractC0543v.k(2);
        }
        return a7;
    }

    public static AbstractC0543v u(AbstractC0543v abstractC0543v, AbstractC0530h abstractC0530h, C0536n c0536n) {
        C0529g c0529g = (C0529g) abstractC0530h;
        C0531i l7 = B5.e.l(c0529g.f9116t, c0529g.n(), c0529g.size(), true);
        AbstractC0543v v5 = v(abstractC0543v, l7, c0536n);
        l7.c(UNINITIALIZED_HASH_CODE);
        g(v5);
        return v5;
    }

    public static AbstractC0543v v(AbstractC0543v abstractC0543v, B5.e eVar, C0536n c0536n) {
        AbstractC0543v t5 = abstractC0543v.t();
        try {
            Y y3 = Y.f9094c;
            y3.getClass();
            b0 a7 = y3.a(t5.getClass());
            C0230i c0230i = (C0230i) eVar.f295t;
            if (c0230i == null) {
                c0230i = new C0230i(eVar);
            }
            a7.j(t5, c0230i, c0536n);
            a7.f(t5);
            return t5;
        } catch (B e3) {
            if (e3.f9051q) {
                throw new IOException(e3.getMessage(), e3);
            }
            throw e3;
        } catch (d0 e7) {
            throw new IOException(e7.getMessage());
        } catch (IOException e8) {
            if (e8.getCause() instanceof B) {
                throw ((B) e8.getCause());
            }
            throw new IOException(e8.getMessage(), e8);
        } catch (RuntimeException e9) {
            if (e9.getCause() instanceof B) {
                throw ((B) e9.getCause());
            }
            throw e9;
        }
    }

    public static void w(Class cls, AbstractC0543v abstractC0543v) {
        abstractC0543v.r();
        defaultInstanceMap.put(cls, abstractC0543v);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0523a
    public final int a(b0 b0Var) {
        if (p()) {
            if (b0Var == null) {
                Y y3 = Y.f9094c;
                y3.getClass();
                b0Var = y3.a(getClass());
            }
            int d = b0Var.d(this);
            if (d >= 0) {
                return d;
            }
            throw new IllegalStateException(AbstractC0515y1.l("serialized size must be non-negative, was ", d));
        }
        int i7 = this.memoizedSerializedSize;
        if ((i7 & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i7 & Integer.MAX_VALUE;
        }
        if (b0Var == null) {
            Y y4 = Y.f9094c;
            y4.getClass();
            b0Var = y4.a(getClass());
        }
        int d7 = b0Var.d(this);
        x(d7);
        return d7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Y y3 = Y.f9094c;
        y3.getClass();
        return y3.a(getClass()).c(this, (AbstractC0543v) obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0523a
    public final void f(C0533k c0533k) {
        Y y3 = Y.f9094c;
        y3.getClass();
        b0 a7 = y3.a(getClass());
        K k5 = c0533k.f9139a;
        if (k5 == null) {
            k5 = new K(c0533k);
        }
        a7.h(this, k5);
    }

    public final void h() {
        this.memoizedHashCode = UNINITIALIZED_HASH_CODE;
    }

    public final int hashCode() {
        if (p()) {
            Y y3 = Y.f9094c;
            y3.getClass();
            return y3.a(getClass()).g(this);
        }
        if (this.memoizedHashCode == 0) {
            Y y4 = Y.f9094c;
            y4.getClass();
            this.memoizedHashCode = y4.a(getClass()).g(this);
        }
        return this.memoizedHashCode;
    }

    public final void i() {
        x(Integer.MAX_VALUE);
    }

    public final AbstractC0541t j() {
        return (AbstractC0541t) k(5);
    }

    public abstract Object k(int i7);

    @Override // com.google.crypto.tink.shaded.protobuf.P
    /* renamed from: m */
    public final AbstractC0543v b() {
        return (AbstractC0543v) k(6);
    }

    public final boolean p() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public final void q() {
        Y y3 = Y.f9094c;
        y3.getClass();
        y3.a(getClass()).f(this);
        r();
    }

    public final void r() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0523a
    /* renamed from: s */
    public final AbstractC0541t d() {
        return (AbstractC0541t) k(5);
    }

    public final AbstractC0543v t() {
        return (AbstractC0543v) k(4);
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = Q.f9075a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        Q.c(this, sb, UNINITIALIZED_HASH_CODE);
        return sb.toString();
    }

    public final void x(int i7) {
        if (i7 >= 0) {
            this.memoizedSerializedSize = (i7 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
            return;
        }
        throw new IllegalStateException(AbstractC0515y1.l("serialized size must be non-negative, was ", i7));
    }

    public final AbstractC0541t y() {
        AbstractC0541t abstractC0541t = (AbstractC0541t) k(5);
        abstractC0541t.k(this);
        return abstractC0541t;
    }
}
