package G5;

import M5.g;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Method f768a;

    static {
        Method method;
        Method[] methods = Throwable.class.getMethods();
        g.c(methods);
        int length = methods.length;
        int i7 = 0;
        while (true) {
            method = null;
            if (i7 >= length) {
                break;
            }
            Method method2 = methods[i7];
            if (g.a(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                g.e(parameterTypes, "getParameterTypes(...)");
                if (parameterTypes.length == 1) {
                    method = parameterTypes[0];
                }
                if (g.a(method, Throwable.class)) {
                    method = method2;
                    break;
                }
            }
            i7++;
        }
        f768a = method;
        int length2 = methods.length;
        for (int i8 = 0; i8 < length2 && !g.a(methods[i8].getName(), "getSuppressed"); i8++) {
        }
    }
}
