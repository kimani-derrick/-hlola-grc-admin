package androidx.datastore.preferences.protobuf;

import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes.dex */
public final class Y {

    /* renamed from: c  reason: collision with root package name */
    public static final Y f5733c = new Y();

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentHashMap f5735b = new ConcurrentHashMap();

    /* renamed from: a  reason: collision with root package name */
    public final K f5734a = new K();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v7, types: [androidx.datastore.preferences.protobuf.T] */
    /* JADX WARN: Type inference failed for: r4v9, types: [androidx.datastore.preferences.protobuf.T] */
    public final InterfaceC0223b0 a(Class cls) {
        U u7;
        H h7;
        k0 k0Var;
        N n;
        C0236o c0236o;
        S x7;
        S s6;
        Class cls2;
        AbstractC0246z.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f5735b;
        InterfaceC0223b0 interfaceC0223b0 = (InterfaceC0223b0) concurrentHashMap.get(cls);
        if (interfaceC0223b0 == null) {
            K k5 = this.f5734a;
            k5.getClass();
            Class cls3 = c0.f5745a;
            if (!AbstractC0243w.class.isAssignableFrom(cls) && (cls2 = c0.f5745a) != null && !cls2.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            }
            C0221a0 b7 = ((P) k5.f5705a).b(cls);
            if ((b7.d & 2) == 2) {
                boolean isAssignableFrom = AbstractC0243w.class.isAssignableFrom(cls);
                AbstractC0220a abstractC0220a = b7.f5739a;
                if (isAssignableFrom) {
                    s6 = new T(c0.d, AbstractC0237p.f5802a, abstractC0220a);
                } else {
                    k0 k0Var2 = c0.f5746b;
                    C0236o c0236o2 = AbstractC0237p.f5803b;
                    if (c0236o2 != null) {
                        s6 = new T(k0Var2, c0236o2, abstractC0220a);
                    } else {
                        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                    }
                }
                x7 = s6;
            } else if (AbstractC0243w.class.isAssignableFrom(cls)) {
                if (b7.d() == 1) {
                    u7 = V.f5732b;
                    h7 = H.f5702b;
                    k0Var = c0.d;
                    c0236o = AbstractC0237p.f5802a;
                    n = O.f5712b;
                    x7 = S.x(b7, u7, h7, k0Var, c0236o, n);
                } else {
                    u7 = V.f5732b;
                    h7 = H.f5702b;
                    k0Var = c0.d;
                    n = O.f5712b;
                    c0236o = null;
                    x7 = S.x(b7, u7, h7, k0Var, c0236o, n);
                }
            } else if (b7.d() == 1) {
                u7 = V.f5731a;
                F f = H.f5701a;
                k0Var = c0.f5746b;
                c0236o = AbstractC0237p.f5803b;
                if (c0236o != null) {
                    n = O.f5711a;
                    h7 = f;
                    x7 = S.x(b7, u7, h7, k0Var, c0236o, n);
                } else {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
            } else {
                u7 = V.f5731a;
                h7 = H.f5701a;
                k0Var = c0.f5747c;
                n = O.f5711a;
                c0236o = null;
                x7 = S.x(b7, u7, h7, k0Var, c0236o, n);
            }
            InterfaceC0223b0 interfaceC0223b02 = (InterfaceC0223b0) concurrentHashMap.putIfAbsent(cls, x7);
            if (interfaceC0223b02 != null) {
                return interfaceC0223b02;
            }
            return x7;
        }
        return interfaceC0223b0;
    }
}
