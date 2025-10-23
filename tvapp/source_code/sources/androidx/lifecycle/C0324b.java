package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* renamed from: androidx.lifecycle.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0324b {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f6806a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final Map f6807b;

    public C0324b(HashMap hashMap) {
        this.f6807b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            EnumC0336n enumC0336n = (EnumC0336n) entry.getValue();
            List list = (List) this.f6806a.get(enumC0336n);
            if (list == null) {
                list = new ArrayList();
                this.f6806a.put(enumC0336n, list);
            }
            list.add((C0325c) entry.getKey());
        }
    }

    public static void a(List list, InterfaceC0342u interfaceC0342u, EnumC0336n enumC0336n, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C0325c c0325c = (C0325c) list.get(size);
                c0325c.getClass();
                try {
                    int i7 = c0325c.f6809a;
                    Method method = c0325c.f6810b;
                    if (i7 != 0) {
                        if (i7 != 1) {
                            if (i7 == 2) {
                                method.invoke(obj, interfaceC0342u, enumC0336n);
                            }
                        } else {
                            method.invoke(obj, interfaceC0342u);
                        }
                    } else {
                        method.invoke(obj, null);
                    }
                } catch (IllegalAccessException e3) {
                    throw new RuntimeException(e3);
                } catch (InvocationTargetException e7) {
                    throw new RuntimeException("Failed to call observer method", e7.getCause());
                }
            }
        }
    }
}
