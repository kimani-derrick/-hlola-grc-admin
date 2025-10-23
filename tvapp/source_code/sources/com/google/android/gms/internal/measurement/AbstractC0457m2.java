package com.google.android.gms.internal.measurement;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* renamed from: com.google.android.gms.internal.measurement.m2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0457m2 extends V1 {
    private static Map<Object, AbstractC0457m2> zzc = new ConcurrentHashMap();
    protected M2 zzb;
    private int zzd;

    public AbstractC0457m2() {
        this.zza = 0;
        this.zzd = -1;
        this.zzb = M2.f;
    }

    public static AbstractC0457m2 d(Class cls) {
        AbstractC0457m2 abstractC0457m2 = zzc.get(cls);
        if (abstractC0457m2 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC0457m2 = zzc.get(cls);
            } catch (ClassNotFoundException e3) {
                throw new IllegalStateException("Class initialization cannot fail.", e3);
            }
        }
        if (abstractC0457m2 == null) {
            abstractC0457m2 = (AbstractC0457m2) ((AbstractC0457m2) Q2.b(cls)).g(6);
            if (abstractC0457m2 == null) {
                throw new IllegalStateException();
            }
            zzc.put(cls, abstractC0457m2);
        }
        return abstractC0457m2;
    }

    public static InterfaceC0481r2 e(InterfaceC0481r2 interfaceC0481r2) {
        int size = interfaceC0481r2.size();
        return interfaceC0481r2.d(size == 0 ? 10 : size << 1);
    }

    public static C0521z2 f(InterfaceC0486s2 interfaceC0486s2) {
        int i7;
        int size = interfaceC0486s2.size();
        if (size == 0) {
            i7 = 10;
        } else {
            i7 = size << 1;
        }
        C0521z2 c0521z2 = (C0521z2) interfaceC0486s2;
        if (i7 >= c0521z2.f8722s) {
            return new C0521z2(Arrays.copyOf(c0521z2.f8721r, i7), c0521z2.f8722s, true);
        }
        throw new IllegalArgumentException();
    }

    public static Object h(Object obj, Method method, Object... objArr) {
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

    public static void j(Class cls, AbstractC0457m2 abstractC0457m2) {
        abstractC0457m2.p();
        zzc.put(cls, abstractC0457m2);
    }

    public static final boolean k(AbstractC0457m2 abstractC0457m2, boolean z7) {
        byte byteValue = ((Byte) abstractC0457m2.g(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        I2 i22 = I2.f8358c;
        i22.getClass();
        boolean i7 = i22.a(abstractC0457m2.getClass()).i(abstractC0457m2);
        if (z7) {
            abstractC0457m2.g(2);
        }
        return i7;
    }

    @Override // com.google.android.gms.internal.measurement.V1
    public final int a(L2 l22) {
        if (q()) {
            if (l22 == null) {
                I2 i22 = I2.f8358c;
                i22.getClass();
                l22 = i22.a(getClass());
            }
            int d = l22.d(this);
            if (d >= 0) {
                return d;
            }
            throw new IllegalStateException(AbstractC0515y1.l("serialized size must be non-negative, was ", d));
        }
        int i7 = this.zzd;
        if ((i7 & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i7 & Integer.MAX_VALUE;
        }
        if (l22 == null) {
            I2 i23 = I2.f8358c;
            i23.getClass();
            l22 = i23.a(getClass());
        }
        int d7 = l22.d(this);
        m(d7);
        return d7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        I2 i22 = I2.f8358c;
        i22.getClass();
        return i22.a(getClass()).g(this, (AbstractC0457m2) obj);
    }

    public abstract Object g(int i7);

    public final int hashCode() {
        if (q()) {
            I2 i22 = I2.f8358c;
            i22.getClass();
            return i22.a(getClass()).h(this);
        }
        if (this.zza == 0) {
            I2 i23 = I2.f8358c;
            i23.getClass();
            this.zza = i23.a(getClass()).h(this);
        }
        return this.zza;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, com.google.android.gms.internal.measurement.y2] */
    public final void i(C0412d2 c0412d2) {
        I2 i22 = I2.f8358c;
        i22.getClass();
        L2 a7 = i22.a(getClass());
        C0516y2 c0516y2 = c0412d2.f8536b;
        C0516y2 c0516y22 = c0516y2;
        if (c0516y2 == null) {
            ?? obj = new Object();
            Charset charset = AbstractC0467o2.f8631a;
            if (c0412d2 != null) {
                obj.f8717a = c0412d2;
                c0412d2.f8536b = obj;
                c0516y22 = obj;
            } else {
                throw new NullPointerException("output");
            }
        }
        a7.b(this, c0516y22);
    }

    public final AbstractC0452l2 l() {
        return (AbstractC0452l2) g(5);
    }

    public final void m(int i7) {
        if (i7 >= 0) {
            this.zzd = (i7 & Integer.MAX_VALUE) | (this.zzd & Integer.MIN_VALUE);
            return;
        }
        throw new IllegalStateException(AbstractC0515y1.l("serialized size must be non-negative, was ", i7));
    }

    public final AbstractC0452l2 n() {
        AbstractC0452l2 abstractC0452l2 = (AbstractC0452l2) g(5);
        abstractC0452l2.b(this);
        return abstractC0452l2;
    }

    public final void o() {
        I2 i22 = I2.f8358c;
        i22.getClass();
        i22.a(getClass()).f(this);
        p();
    }

    public final void p() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final boolean q() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = E2.f8263a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        E2.b(this, sb, 0);
        return sb.toString();
    }
}
