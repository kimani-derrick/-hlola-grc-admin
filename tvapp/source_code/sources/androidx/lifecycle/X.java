package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;
import l0.C0967c;
/* loaded from: classes.dex */
public final class X extends Z {

    /* renamed from: c  reason: collision with root package name */
    public static X f6803c;

    /* renamed from: b  reason: collision with root package name */
    public final Application f6804b;

    public X(Application application) {
        this.f6804b = application;
    }

    @Override // androidx.lifecycle.Z, androidx.lifecycle.Y
    public final V a(Class cls) {
        Application application = this.f6804b;
        if (application != null) {
            return c(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // androidx.lifecycle.Z, androidx.lifecycle.Y
    public final V b(Class cls, C0967c c0967c) {
        if (this.f6804b != null) {
            return a(cls);
        }
        Application application = (Application) c0967c.f12233a.get(W.f6801a);
        if (application != null) {
            return c(cls, application);
        }
        if (!AbstractC0323a.class.isAssignableFrom(cls)) {
            return super.a(cls);
        }
        throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
    }

    public final V c(Class cls, Application application) {
        if (AbstractC0323a.class.isAssignableFrom(cls)) {
            try {
                V v5 = (V) cls.getConstructor(Application.class).newInstance(application);
                M5.g.e(v5, "{\n                try {\n…          }\n            }");
                return v5;
            } catch (IllegalAccessException e3) {
                throw new RuntimeException("Cannot create an instance of " + cls, e3);
            } catch (InstantiationException e7) {
                throw new RuntimeException("Cannot create an instance of " + cls, e7);
            } catch (NoSuchMethodException e8) {
                throw new RuntimeException("Cannot create an instance of " + cls, e8);
            } catch (InvocationTargetException e9) {
                throw new RuntimeException("Cannot create an instance of " + cls, e9);
            }
        }
        return super.a(cls);
    }
}
