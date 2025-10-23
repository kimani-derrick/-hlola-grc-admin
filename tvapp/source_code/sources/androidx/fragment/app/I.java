package androidx.fragment.app;

import java.lang.reflect.InvocationTargetException;
import r0.AbstractC1111a;
/* loaded from: classes.dex */
public final class I {

    /* renamed from: b  reason: collision with root package name */
    public static final o.j f5896b = new o.j();

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ S f5897a;

    public I(S s6) {
        this.f5897a = s6;
    }

    public static Class b(ClassLoader classLoader, String str) {
        o.j jVar = f5896b;
        o.j jVar2 = (o.j) jVar.get(classLoader);
        if (jVar2 == null) {
            jVar2 = new o.j();
            jVar.put(classLoader, jVar2);
        }
        Class cls = (Class) jVar2.get(str);
        if (cls == null) {
            Class<?> cls2 = Class.forName(str, false, classLoader);
            jVar2.put(str, cls2);
            return cls2;
        }
        return cls;
    }

    public static Class c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e3) {
            throw new RuntimeException(AbstractC1111a.r("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e3);
        } catch (ClassNotFoundException e7) {
            throw new RuntimeException(AbstractC1111a.r("Unable to instantiate fragment ", str, ": make sure class name exists"), e7);
        }
    }

    public final ComponentCallbacksC0269x a(String str) {
        try {
            return (ComponentCallbacksC0269x) c(this.f5897a.f5941v.f6147s.getClassLoader(), str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e3) {
            throw new RuntimeException(AbstractC1111a.r("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e3);
        } catch (InstantiationException e7) {
            throw new RuntimeException(AbstractC1111a.r("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e7);
        } catch (NoSuchMethodException e8) {
            throw new RuntimeException(AbstractC1111a.r("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e8);
        } catch (InvocationTargetException e9) {
            throw new RuntimeException(AbstractC1111a.r("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e9);
        }
    }
}
