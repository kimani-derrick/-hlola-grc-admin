package x6;

import java.lang.reflect.Method;
import java.util.Map;
import r0.AbstractC1111a;
/* loaded from: classes.dex */
public final class C extends V {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f16229b;

    /* renamed from: c  reason: collision with root package name */
    public final Method f16230c;
    public final int d;

    public /* synthetic */ C(Method method, int i7, int i8) {
        this.f16229b = i8;
        this.f16230c = method;
        this.d = i7;
    }

    @Override // x6.V
    public final void a(K k5, Object obj) {
        switch (this.f16229b) {
            case 0:
                Map map = (Map) obj;
                int i7 = this.d;
                Method method = this.f16230c;
                if (map != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        String str = (String) entry.getKey();
                        if (str != null) {
                            Object value = entry.getValue();
                            if (value != null) {
                                k5.b(str, value.toString());
                            } else {
                                throw V.k(method, i7, AbstractC1111a.r("Header map contained null value for key '", str, "'."), new Object[0]);
                            }
                        } else {
                            throw V.k(method, i7, "Header map contained null key.", new Object[0]);
                        }
                    }
                    return;
                }
                throw V.k(method, i7, "Header map was null.", new Object[0]);
            case 1:
                h6.r rVar = (h6.r) obj;
                if (rVar != null) {
                    h6.q qVar = k5.f;
                    qVar.getClass();
                    int size = rVar.size();
                    for (int i8 = 0; i8 < size; i8++) {
                        qVar.b(rVar.f(i8), rVar.h(i8));
                    }
                    return;
                }
                int i9 = this.d;
                throw V.k(this.f16230c, i9, "Headers parameter must not be null.", new Object[0]);
            default:
                if (obj != null) {
                    k5.f16247c = obj.toString();
                    return;
                }
                int i10 = this.d;
                throw V.k(this.f16230c, i10, "@Url parameter is null.", new Object[0]);
        }
    }
}
