package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
public abstract class U {

    /* renamed from: a  reason: collision with root package name */
    public static final List f6796a = A5.l.L(Application.class, N.class);

    /* renamed from: b  reason: collision with root package name */
    public static final List f6797b = m3.g.z(N.class);

    public static final Constructor a(Class cls, List list) {
        M5.g.f(list, "signature");
        Constructor<?>[] constructors = cls.getConstructors();
        M5.g.e(constructors, "modelClass.constructors");
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            M5.g.e(parameterTypes, "constructor.parameterTypes");
            List Z6 = A5.j.Z(parameterTypes);
            if (M5.g.a(list, Z6)) {
                return constructor;
            }
            if (list.size() == Z6.size() && Z6.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final V b(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (V) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e3) {
            throw new RuntimeException("Failed to access " + cls, e3);
        } catch (InstantiationException e7) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e7);
        } catch (InvocationTargetException e8) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e8.getCause());
        }
    }
}
