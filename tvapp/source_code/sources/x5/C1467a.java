package x5;

import y5.InterfaceC1496a;
/* renamed from: x5.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1467a implements InterfaceC1496a {

    /* renamed from: c  reason: collision with root package name */
    public static final Object f16221c = new Object();

    /* renamed from: a  reason: collision with root package name */
    public volatile InterfaceC1496a f16222a;

    /* renamed from: b  reason: collision with root package name */
    public volatile Object f16223b = f16221c;

    public C1467a(InterfaceC1496a interfaceC1496a) {
        this.f16222a = interfaceC1496a;
    }

    public static InterfaceC1496a a(InterfaceC1496a interfaceC1496a) {
        if (interfaceC1496a instanceof C1467a) {
            return interfaceC1496a;
        }
        return new C1467a(interfaceC1496a);
    }

    @Override // y5.InterfaceC1496a
    public final Object get() {
        Object obj = this.f16223b;
        Object obj2 = f16221c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f16223b;
                    if (obj == obj2) {
                        obj = this.f16222a.get();
                        Object obj3 = this.f16223b;
                        if (obj3 != obj2 && obj3 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f16223b = obj;
                        this.f16222a = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
