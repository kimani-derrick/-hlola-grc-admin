package x6;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public final class O implements InvocationHandler {

    /* renamed from: a  reason: collision with root package name */
    public final J f16288a = J.f16240c;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f16289b = new Object[0];

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Class f16290c;
    public final /* synthetic */ u4.v d;

    public O(u4.v vVar, Class cls) {
        this.d = vVar;
        this.f16290c = cls;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        boolean isDefault;
        if (method.getDeclaringClass() == Object.class) {
            return method.invoke(this, objArr);
        }
        if (objArr == null) {
            objArr = this.f16289b;
        }
        J j7 = this.f16288a;
        if (j7.f16241a) {
            isDefault = method.isDefault();
            if (isDefault) {
                return j7.b(method, this.f16290c, obj, objArr);
            }
        }
        C1484q d = this.d.d(method);
        return d.a(new C1488v(d.f16318a, objArr, d.f16319b, d.f16320c), objArr);
    }
}
