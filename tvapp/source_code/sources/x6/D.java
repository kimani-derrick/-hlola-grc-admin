package x6;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;
import r0.AbstractC1111a;
/* loaded from: classes.dex */
public final class D extends V {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f16231b = 0;

    /* renamed from: c  reason: collision with root package name */
    public final Method f16232c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final InterfaceC1480m f16233e;
    public final Object f;

    public D(Method method, int i7, h6.r rVar, InterfaceC1480m interfaceC1480m) {
        this.f16232c = method;
        this.d = i7;
        this.f = rVar;
        this.f16233e = interfaceC1480m;
    }

    @Override // x6.V
    public final void a(K k5, Object obj) {
        InterfaceC1480m interfaceC1480m = this.f16233e;
        Object obj2 = this.f;
        Method method = this.f16232c;
        int i7 = this.d;
        switch (this.f16231b) {
            case 0:
                if (obj != null) {
                    try {
                        k5.c((h6.r) obj2, (h6.E) interfaceC1480m.o(obj));
                        return;
                    } catch (IOException e3) {
                        throw V.k(method, i7, "Unable to convert " + obj + " to RequestBody", e3);
                    }
                }
                return;
            default:
                Map map = (Map) obj;
                if (map != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        String str = (String) entry.getKey();
                        if (str != null) {
                            Object value = entry.getValue();
                            if (value != null) {
                                k5.c(p6.d.u("Content-Disposition", AbstractC1111a.r("form-data; name=\"", str, "\""), "Content-Transfer-Encoding", (String) obj2), (h6.E) interfaceC1480m.o(value));
                            } else {
                                throw V.k(method, i7, AbstractC1111a.r("Part map contained null value for key '", str, "'."), new Object[0]);
                            }
                        } else {
                            throw V.k(method, i7, "Part map contained null key.", new Object[0]);
                        }
                    }
                    return;
                }
                throw V.k(method, i7, "Part map was null.", new Object[0]);
        }
    }

    public D(Method method, int i7, InterfaceC1480m interfaceC1480m, String str) {
        this.f16232c = method;
        this.d = i7;
        this.f16233e = interfaceC1480m;
        this.f = str;
    }
}
