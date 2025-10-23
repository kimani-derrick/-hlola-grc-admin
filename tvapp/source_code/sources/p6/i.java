package p6;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
public final class i implements InvocationHandler {

    /* renamed from: a  reason: collision with root package name */
    public final List f13179a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f13180b;

    /* renamed from: c  reason: collision with root package name */
    public String f13181c;

    public i(ArrayList arrayList) {
        this.f13179a = arrayList;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        M5.g.f(obj, "proxy");
        M5.g.f(method, "method");
        if (objArr == null) {
            objArr = new Object[0];
        }
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (M5.g.a(name, "supports") && M5.g.a(Boolean.TYPE, returnType)) {
            return Boolean.TRUE;
        }
        if (M5.g.a(name, "unsupported") && M5.g.a(Void.TYPE, returnType)) {
            this.f13180b = true;
            return null;
        }
        boolean a7 = M5.g.a(name, "protocols");
        List list = this.f13179a;
        if (a7 && objArr.length == 0) {
            return list;
        }
        if ((M5.g.a(name, "selectProtocol") || M5.g.a(name, "select")) && M5.g.a(String.class, returnType) && objArr.length == 1) {
            Object obj2 = objArr[0];
            if (obj2 instanceof List) {
                if (obj2 != null) {
                    List list2 = (List) obj2;
                    int size = list2.size();
                    if (size >= 0) {
                        int i7 = 0;
                        while (true) {
                            int i8 = i7 + 1;
                            Object obj3 = list2.get(i7);
                            if (obj3 != null) {
                                String str = (String) obj3;
                                if (list.contains(str)) {
                                    this.f13181c = str;
                                    return str;
                                } else if (i7 == size) {
                                    break;
                                } else {
                                    i7 = i8;
                                }
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                            }
                        }
                    }
                    String str2 = (String) list.get(0);
                    this.f13181c = str2;
                    return str2;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<*>");
            }
        }
        if ((M5.g.a(name, "protocolSelected") || M5.g.a(name, "selected")) && objArr.length == 1) {
            Object obj4 = objArr[0];
            if (obj4 != null) {
                this.f13181c = (String) obj4;
                return null;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
    }
}
