package I0;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import o.C1052e;
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public final C1052e f1205a;

    /* renamed from: b  reason: collision with root package name */
    public final C1052e f1206b;

    /* renamed from: c  reason: collision with root package name */
    public final C1052e f1207c;

    public a(C1052e c1052e, C1052e c1052e2, C1052e c1052e3) {
        this.f1205a = c1052e;
        this.f1206b = c1052e2;
        this.f1207c = c1052e3;
    }

    public abstract b a();

    public final Class b(Class cls) {
        String name = cls.getName();
        C1052e c1052e = this.f1207c;
        Class cls2 = (Class) c1052e.get(name);
        if (cls2 == null) {
            String name2 = cls.getPackage().getName();
            String simpleName = cls.getSimpleName();
            Class<?> cls3 = Class.forName(name2 + "." + simpleName + "Parcelizer", false, cls.getClassLoader());
            c1052e.put(cls.getName(), cls3);
            return cls3;
        }
        return cls2;
    }

    public final Method c(String str) {
        C1052e c1052e = this.f1205a;
        Method method = (Method) c1052e.get(str);
        if (method == null) {
            System.currentTimeMillis();
            Method declaredMethod = Class.forName(str, true, a.class.getClassLoader()).getDeclaredMethod("read", a.class);
            c1052e.put(str, declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    public final Method d(Class cls) {
        String name = cls.getName();
        C1052e c1052e = this.f1206b;
        Method method = (Method) c1052e.get(name);
        if (method == null) {
            Class b7 = b(cls);
            System.currentTimeMillis();
            Method declaredMethod = b7.getDeclaredMethod("write", cls, a.class);
            c1052e.put(cls.getName(), declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    public abstract boolean e(int i7);

    public final int f(int i7, int i8) {
        if (!e(i8)) {
            return i7;
        }
        return ((b) this).f1208e.readInt();
    }

    public final Parcelable g(Parcelable parcelable, int i7) {
        if (!e(i7)) {
            return parcelable;
        }
        return ((b) this).f1208e.readParcelable(b.class.getClassLoader());
    }

    public final c h() {
        String readString = ((b) this).f1208e.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (c) c(readString).invoke(null, a());
        } catch (ClassNotFoundException e3) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e3);
        } catch (IllegalAccessException e7) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e7);
        } catch (NoSuchMethodException e8) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e8);
        } catch (InvocationTargetException e9) {
            if (e9.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e9.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e9);
        }
    }

    public abstract void i(int i7);

    public final void j(int i7, int i8) {
        i(i8);
        ((b) this).f1208e.writeInt(i7);
    }

    public final void k(Parcelable parcelable, int i7) {
        i(i7);
        ((b) this).f1208e.writeParcelable(parcelable, 0);
    }

    public final void l(c cVar) {
        if (cVar == null) {
            ((b) this).f1208e.writeString(null);
            return;
        }
        try {
            ((b) this).f1208e.writeString(b(cVar.getClass()).getName());
            b a7 = a();
            try {
                d(cVar.getClass()).invoke(null, cVar, a7);
                int i7 = a7.f1211i;
                if (i7 >= 0) {
                    int i8 = a7.d.get(i7);
                    Parcel parcel = a7.f1208e;
                    int dataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i8);
                    parcel.writeInt(dataPosition - i8);
                    parcel.setDataPosition(dataPosition);
                }
            } catch (ClassNotFoundException e3) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e3);
            } catch (IllegalAccessException e7) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e7);
            } catch (NoSuchMethodException e8) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e8);
            } catch (InvocationTargetException e9) {
                if (e9.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e9.getCause());
                }
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e9);
            }
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException(cVar.getClass().getSimpleName().concat(" does not have a Parcelizer"), e10);
        }
    }
}
