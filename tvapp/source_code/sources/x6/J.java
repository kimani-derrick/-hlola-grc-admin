package x6;

import android.os.Build;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class J {

    /* renamed from: c  reason: collision with root package name */
    public static final J f16240c;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f16241a;

    /* renamed from: b  reason: collision with root package name */
    public final Constructor f16242b;

    static {
        J j7;
        boolean z7 = true;
        if ("Dalvik".equals(System.getProperty("java.vm.name"))) {
            if (Build.VERSION.SDK_INT < 24) {
                z7 = false;
            }
            j7 = new J(z7);
        } else {
            j7 = new J(true);
        }
        f16240c = j7;
    }

    public J(boolean z7) {
        this.f16241a = z7;
        Constructor constructor = null;
        if (z7) {
            try {
                constructor = v6.v.a().getDeclaredConstructor(Class.class, Integer.TYPE);
                constructor.setAccessible(true);
            } catch (NoClassDefFoundError | NoSuchMethodException unused) {
            }
        }
        this.f16242b = constructor;
    }

    public Executor a() {
        return null;
    }

    public Object b(Method method, Class cls, Object obj, Object... objArr) {
        MethodHandles.Lookup lookup;
        MethodHandle unreflectSpecial;
        MethodHandle bindTo;
        Object invokeWithArguments;
        Constructor constructor = this.f16242b;
        if (constructor == null) {
            lookup = MethodHandles.lookup();
        } else {
            lookup = v6.v.f(constructor.newInstance(cls, -1));
        }
        unreflectSpecial = lookup.unreflectSpecial(method, cls);
        bindTo = unreflectSpecial.bindTo(obj);
        invokeWithArguments = bindTo.invokeWithArguments(objArr);
        return invokeWithArguments;
    }
}
