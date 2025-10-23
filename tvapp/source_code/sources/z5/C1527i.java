package z5;

import java.io.Serializable;
/* renamed from: z5.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1527i implements InterfaceC1522d, Serializable {

    /* renamed from: q  reason: collision with root package name */
    public L5.a f16472q;

    /* renamed from: r  reason: collision with root package name */
    public volatile Object f16473r = C1529k.f16478a;

    /* renamed from: s  reason: collision with root package name */
    public final Object f16474s = this;

    public C1527i(L5.a aVar) {
        this.f16472q = aVar;
    }

    @Override // z5.InterfaceC1522d
    public final Object getValue() {
        Object obj;
        Object obj2 = this.f16473r;
        C1529k c1529k = C1529k.f16478a;
        if (obj2 != c1529k) {
            return obj2;
        }
        synchronized (this.f16474s) {
            obj = this.f16473r;
            if (obj == c1529k) {
                L5.a aVar = this.f16472q;
                M5.g.c(aVar);
                obj = aVar.b();
                this.f16473r = obj;
                this.f16472q = null;
            }
        }
        return obj;
    }

    public final String toString() {
        if (this.f16473r != C1529k.f16478a) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
