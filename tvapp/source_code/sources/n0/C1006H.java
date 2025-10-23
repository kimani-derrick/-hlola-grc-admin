package n0;

import android.os.Bundle;
import android.os.Parcelable;
/* renamed from: n0.H  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1006H extends L {

    /* renamed from: m  reason: collision with root package name */
    public final Class f12497m;

    public C1006H(Class cls) {
        super(true);
        if (Parcelable.class.isAssignableFrom(cls)) {
            try {
                this.f12497m = Class.forName("[L" + cls.getName() + ';');
                return;
            } catch (ClassNotFoundException e3) {
                throw new RuntimeException(e3);
            }
        }
        throw new IllegalArgumentException((cls + " does not implement Parcelable.").toString());
    }

    @Override // n0.L
    public final Object a(String str, Bundle bundle) {
        return (Parcelable[]) bundle.get(str);
    }

    @Override // n0.L
    public final String b() {
        return this.f12497m.getName();
    }

    @Override // n0.L
    public final Object c(String str) {
        M5.g.f(str, "value");
        throw new UnsupportedOperationException("Arrays don't support default values.");
    }

    @Override // n0.L
    public final void d(Bundle bundle, String str, Object obj) {
        Parcelable[] parcelableArr = (Parcelable[]) obj;
        M5.g.f(str, "key");
        this.f12497m.cast(parcelableArr);
        bundle.putParcelableArray(str, parcelableArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && M5.g.a(C1006H.class, obj.getClass())) {
            return M5.g.a(this.f12497m, ((C1006H) obj).f12497m);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12497m.hashCode();
    }
}
