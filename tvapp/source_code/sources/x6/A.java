package x6;

import java.lang.reflect.Method;
import java.util.Map;
import r0.AbstractC1111a;
/* loaded from: classes.dex */
public final class A extends V {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f16224b;

    /* renamed from: c  reason: collision with root package name */
    public final Method f16225c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f16226e;

    public /* synthetic */ A(Method method, int i7, boolean z7, int i8) {
        this.f16224b = i8;
        this.f16225c = method;
        this.d = i7;
        this.f16226e = z7;
    }

    @Override // x6.V
    public final void a(K k5, Object obj) {
        Map map = (Map) obj;
        switch (this.f16224b) {
            case 0:
                int i7 = this.d;
                Method method = this.f16225c;
                if (map != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        String str = (String) entry.getKey();
                        if (str != null) {
                            Object value = entry.getValue();
                            if (value != null) {
                                String obj2 = value.toString();
                                if (obj2 != null) {
                                    k5.a(str, obj2, this.f16226e);
                                } else {
                                    throw V.k(method, i7, "Field map value '" + value + "' converted to null by " + C1468a.class.getName() + " for key '" + str + "'.", new Object[0]);
                                }
                            } else {
                                throw V.k(method, i7, AbstractC1111a.r("Field map contained null value for key '", str, "'."), new Object[0]);
                            }
                        } else {
                            throw V.k(method, i7, "Field map contained null key.", new Object[0]);
                        }
                    }
                    return;
                }
                throw V.k(method, i7, "Field map was null.", new Object[0]);
            default:
                int i8 = this.d;
                Method method2 = this.f16225c;
                if (map != null) {
                    for (Map.Entry entry2 : map.entrySet()) {
                        String str2 = (String) entry2.getKey();
                        if (str2 != null) {
                            Object value2 = entry2.getValue();
                            if (value2 != null) {
                                String obj3 = value2.toString();
                                if (obj3 != null) {
                                    k5.d(str2, obj3, this.f16226e);
                                } else {
                                    throw V.k(method2, i8, "Query map value '" + value2 + "' converted to null by " + C1468a.class.getName() + " for key '" + str2 + "'.", new Object[0]);
                                }
                            } else {
                                throw V.k(method2, i8, AbstractC1111a.r("Query map contained null value for key '", str2, "'."), new Object[0]);
                            }
                        } else {
                            throw V.k(method2, i8, "Query map contained null key.", new Object[0]);
                        }
                    }
                    return;
                }
                throw V.k(method2, i8, "Query map was null", new Object[0]);
        }
    }
}
