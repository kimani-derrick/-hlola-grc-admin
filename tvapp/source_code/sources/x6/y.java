package x6;

import java.io.IOException;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public final class y extends V {

    /* renamed from: b  reason: collision with root package name */
    public final Method f16341b;

    /* renamed from: c  reason: collision with root package name */
    public final int f16342c;
    public final InterfaceC1480m d;

    public y(Method method, int i7, InterfaceC1480m interfaceC1480m) {
        this.f16341b = method;
        this.f16342c = i7;
        this.d = interfaceC1480m;
    }

    @Override // x6.V
    public final void a(K k5, Object obj) {
        int i7 = this.f16342c;
        Method method = this.f16341b;
        if (obj != null) {
            try {
                k5.f16253k = (h6.E) this.d.o(obj);
                return;
            } catch (IOException e3) {
                throw V.l(method, e3, i7, "Unable to convert " + obj + " to RequestBody", new Object[0]);
            }
        }
        throw V.k(method, i7, "Body parameter value must not be null.", new Object[0]);
    }
}
