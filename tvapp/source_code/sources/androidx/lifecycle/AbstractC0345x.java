package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import r0.AbstractC1111a;
/* renamed from: androidx.lifecycle.x  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0345x {

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap f6836a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public static final HashMap f6837b = new HashMap();

    public static void a(Constructor constructor, Object obj) {
        try {
            Object newInstance = constructor.newInstance(obj);
            M5.g.e(newInstance, "{\n            constructo…tance(`object`)\n        }");
            AbstractC1111a.w(newInstance);
            throw null;
        } catch (IllegalAccessException e3) {
            throw new RuntimeException(e3);
        } catch (InstantiationException e7) {
            throw new RuntimeException(e7);
        } catch (InvocationTargetException e8) {
            throw new RuntimeException(e8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b6, code lost:
        if (r8.booleanValue() != false) goto L80;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int b(java.lang.Class r13) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.AbstractC0345x.b(java.lang.Class):int");
    }
}
