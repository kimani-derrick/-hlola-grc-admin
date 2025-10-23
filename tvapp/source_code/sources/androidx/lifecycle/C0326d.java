package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
/* renamed from: androidx.lifecycle.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0326d {

    /* renamed from: c  reason: collision with root package name */
    public static final C0326d f6811c = new C0326d();

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f6812a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f6813b = new HashMap();

    public static void b(HashMap hashMap, C0325c c0325c, EnumC0336n enumC0336n, Class cls) {
        EnumC0336n enumC0336n2 = (EnumC0336n) hashMap.get(c0325c);
        if (enumC0336n2 != null && enumC0336n != enumC0336n2) {
            Method method = c0325c.f6810b;
            throw new IllegalArgumentException("Method " + method.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + enumC0336n2 + ", new value " + enumC0336n);
        } else if (enumC0336n2 == null) {
            hashMap.put(c0325c, enumC0336n);
        }
    }

    public final C0324b a(Class cls, Method[] methodArr) {
        Class<?>[] interfaces;
        int i7;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.f6812a;
        if (superclass != null) {
            C0324b c0324b = (C0324b) hashMap2.get(superclass);
            if (c0324b == null) {
                c0324b = a(superclass, null);
            }
            hashMap.putAll(c0324b.f6807b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C0324b c0324b2 = (C0324b) hashMap2.get(cls2);
            if (c0324b2 == null) {
                c0324b2 = a(cls2, null);
            }
            for (Map.Entry entry : c0324b2.f6807b.entrySet()) {
                b(hashMap, (C0325c) entry.getKey(), (EnumC0336n) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e3) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e3);
            }
        }
        boolean z7 = false;
        for (Method method : methodArr) {
            B b7 = (B) method.getAnnotation(B.class);
            if (b7 != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length > 0) {
                    if (InterfaceC0342u.class.isAssignableFrom(parameterTypes[0])) {
                        i7 = 1;
                    } else {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                } else {
                    i7 = 0;
                }
                EnumC0336n value = b7.value();
                if (parameterTypes.length > 1) {
                    if (EnumC0336n.class.isAssignableFrom(parameterTypes[1])) {
                        if (value == EnumC0336n.ON_ANY) {
                            i7 = 2;
                        } else {
                            throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                        }
                    } else {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                }
                if (parameterTypes.length <= 2) {
                    b(hashMap, new C0325c(i7, method), value, cls);
                    z7 = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        C0324b c0324b3 = new C0324b(hashMap);
        hashMap2.put(cls, c0324b3);
        this.f6813b.put(cls, Boolean.valueOf(z7));
        return c0324b3;
    }
}
