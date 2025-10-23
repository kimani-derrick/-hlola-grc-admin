package com.google.crypto.tink.shaded.protobuf;

import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes.dex */
public final class Y {

    /* renamed from: c  reason: collision with root package name */
    public static final Y f9094c = new Y();

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentHashMap f9096b = new ConcurrentHashMap();

    /* renamed from: a  reason: collision with root package name */
    public final K f9095a = new K();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v7, types: [com.google.crypto.tink.shaded.protobuf.T] */
    /* JADX WARN: Type inference failed for: r4v9, types: [com.google.crypto.tink.shaded.protobuf.T] */
    public final b0 a(Class cls) {
        U u7;
        H h7;
        f0 f0Var;
        M m7;
        C0537o c0537o;
        S C3;
        S s6;
        Class cls2;
        AbstractC0547z.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f9096b;
        b0 b0Var = (b0) concurrentHashMap.get(cls);
        if (b0Var == null) {
            K k5 = this.f9095a;
            k5.getClass();
            Class cls3 = c0.f9106a;
            if (!AbstractC0543v.class.isAssignableFrom(cls) && (cls2 = c0.f9106a) != null && !cls2.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
            }
            a0 b7 = ((O) k5.f9070a).b(cls);
            if ((b7.d & 2) == 2) {
                boolean isAssignableFrom = AbstractC0543v.class.isAssignableFrom(cls);
                AbstractC0523a abstractC0523a = b7.f9100a;
                if (isAssignableFrom) {
                    s6 = new T(c0.d, AbstractC0538p.f9153a, abstractC0523a);
                } else {
                    f0 f0Var2 = c0.f9107b;
                    C0537o c0537o2 = AbstractC0538p.f9154b;
                    if (c0537o2 != null) {
                        s6 = new T(f0Var2, c0537o2, abstractC0523a);
                    } else {
                        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                    }
                }
                C3 = s6;
            } else if (AbstractC0543v.class.isAssignableFrom(cls)) {
                if (b7.d() == 1) {
                    u7 = V.f9093b;
                    h7 = H.f9067b;
                    f0Var = c0.d;
                    c0537o = AbstractC0538p.f9153a;
                    m7 = N.f9074b;
                    C3 = S.C(b7, u7, h7, f0Var, c0537o, m7);
                } else {
                    u7 = V.f9093b;
                    h7 = H.f9067b;
                    f0Var = c0.d;
                    m7 = N.f9074b;
                    c0537o = null;
                    C3 = S.C(b7, u7, h7, f0Var, c0537o, m7);
                }
            } else if (b7.d() == 1) {
                u7 = V.f9092a;
                F f = H.f9066a;
                f0Var = c0.f9107b;
                c0537o = AbstractC0538p.f9154b;
                if (c0537o != null) {
                    m7 = N.f9073a;
                    h7 = f;
                    C3 = S.C(b7, u7, h7, f0Var, c0537o, m7);
                } else {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
            } else {
                u7 = V.f9092a;
                h7 = H.f9066a;
                f0Var = c0.f9108c;
                m7 = N.f9073a;
                c0537o = null;
                C3 = S.C(b7, u7, h7, f0Var, c0537o, m7);
            }
            b0 b0Var2 = (b0) concurrentHashMap.putIfAbsent(cls, C3);
            if (b0Var2 != null) {
                return b0Var2;
            }
            return C3;
        }
        return b0Var;
    }
}
