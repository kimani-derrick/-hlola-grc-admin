package F5;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import k3.AbstractC0958a;
/* loaded from: classes.dex */
public abstract class a implements D5.d, d, Serializable {

    /* renamed from: q  reason: collision with root package name */
    public final D5.d f729q;

    public a(D5.d dVar) {
        this.f729q = dVar;
    }

    @Override // F5.d
    public d g() {
        D5.d dVar = this.f729q;
        if (dVar instanceof d) {
            return (d) dVar;
        }
        return null;
    }

    public D5.d h(D5.d dVar, Object obj) {
        M5.g.f(dVar, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    @Override // D5.d
    public final void m(Object obj) {
        D5.d dVar = this;
        while (true) {
            a aVar = (a) dVar;
            D5.d dVar2 = aVar.f729q;
            M5.g.c(dVar2);
            try {
                obj = aVar.p(obj);
                if (obj == E5.a.f612q) {
                    return;
                }
            } catch (Throwable th) {
                obj = AbstractC0958a.m(th);
            }
            aVar.r();
            if (dVar2 instanceof a) {
                dVar = dVar2;
            } else {
                dVar2.m(obj);
                return;
            }
        }
    }

    public StackTraceElement n() {
        int i7;
        String str;
        Object obj;
        Object obj2;
        Object obj3;
        Integer num;
        int i8;
        e eVar = (e) getClass().getAnnotation(e.class);
        String str2 = null;
        if (eVar == null) {
            return null;
        }
        int v5 = eVar.v();
        if (v5 <= 1) {
            int i9 = -1;
            try {
                Field declaredField = getClass().getDeclaredField("label");
                declaredField.setAccessible(true);
                Object obj4 = declaredField.get(this);
                if (obj4 instanceof Integer) {
                    num = (Integer) obj4;
                } else {
                    num = null;
                }
                if (num != null) {
                    i8 = num.intValue();
                } else {
                    i8 = 0;
                }
                i7 = i8 - 1;
            } catch (Exception unused) {
                i7 = -1;
            }
            if (i7 >= 0) {
                i9 = eVar.l()[i7];
            }
            f fVar = g.f737b;
            f fVar2 = g.f736a;
            if (fVar == null) {
                try {
                    f fVar3 = new f(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                    g.f737b = fVar3;
                    fVar = fVar3;
                } catch (Exception unused2) {
                    g.f737b = fVar2;
                    fVar = fVar2;
                }
            }
            if (fVar != fVar2) {
                Method method = fVar.f733a;
                if (method != null) {
                    obj = method.invoke(getClass(), null);
                } else {
                    obj = null;
                }
                if (obj != null) {
                    Method method2 = fVar.f734b;
                    if (method2 != null) {
                        obj2 = method2.invoke(obj, null);
                    } else {
                        obj2 = null;
                    }
                    if (obj2 != null) {
                        Method method3 = fVar.f735c;
                        if (method3 != null) {
                            obj3 = method3.invoke(obj2, null);
                        } else {
                            obj3 = null;
                        }
                        if (obj3 instanceof String) {
                            str2 = obj3;
                        }
                    }
                }
            }
            if (str2 == null) {
                str = eVar.c();
            } else {
                str = str2 + '/' + eVar.c();
            }
            return new StackTraceElement(str, eVar.m(), eVar.f(), i9);
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + v5 + ". Please update the Kotlin standard library.").toString());
    }

    public abstract Object p(Object obj);

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object n = n();
        if (n == null) {
            n = getClass().getName();
        }
        sb.append(n);
        return sb.toString();
    }

    public void r() {
    }
}
