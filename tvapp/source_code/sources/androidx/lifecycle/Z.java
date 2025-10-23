package androidx.lifecycle;

import l0.C0967c;
/* loaded from: classes.dex */
public class Z implements Y {

    /* renamed from: a  reason: collision with root package name */
    public static Z f6805a;

    @Override // androidx.lifecycle.Y
    public V a(Class cls) {
        try {
            Object newInstance = cls.getDeclaredConstructor(null).newInstance(null);
            M5.g.e(newInstance, "{\n                modelC…wInstance()\n            }");
            return (V) newInstance;
        } catch (IllegalAccessException e3) {
            throw new RuntimeException("Cannot create an instance of " + cls, e3);
        } catch (InstantiationException e7) {
            throw new RuntimeException("Cannot create an instance of " + cls, e7);
        } catch (NoSuchMethodException e8) {
            throw new RuntimeException("Cannot create an instance of " + cls, e8);
        }
    }

    @Override // androidx.lifecycle.Y
    public V b(Class cls, C0967c c0967c) {
        return a(cls);
    }
}
