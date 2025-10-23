package V1;

import y5.InterfaceC1496a;
/* loaded from: classes.dex */
public final class a implements InterfaceC1496a {

    /* renamed from: c  reason: collision with root package name */
    public static final Object f3609c = new Object();

    /* renamed from: a  reason: collision with root package name */
    public volatile InterfaceC1496a f3610a;

    /* renamed from: b  reason: collision with root package name */
    public volatile Object f3611b;

    /* JADX WARN: Type inference failed for: r0v1, types: [y5.a, V1.a, java.lang.Object] */
    public static InterfaceC1496a a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        ?? obj = new Object();
        obj.f3611b = f3609c;
        obj.f3610a = bVar;
        return obj;
    }

    @Override // y5.InterfaceC1496a
    public final Object get() {
        Object obj = this.f3611b;
        Object obj2 = f3609c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f3611b;
                    if (obj == obj2) {
                        obj = this.f3610a.get();
                        Object obj3 = this.f3611b;
                        if (obj3 != obj2 && obj3 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f3611b = obj;
                        this.f3610a = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
