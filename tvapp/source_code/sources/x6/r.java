package x6;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final Method f16322a;

    /* renamed from: b  reason: collision with root package name */
    public final List f16323b;

    public r(Method method, ArrayList arrayList) {
        this.f16322a = method;
        this.f16323b = Collections.unmodifiableList(arrayList);
    }

    public final String toString() {
        Method method = this.f16322a;
        return String.format("%s.%s() %s", method.getDeclaringClass().getName(), method.getName(), this.f16323b);
    }
}
