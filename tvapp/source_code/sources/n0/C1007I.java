package n0;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
/* renamed from: n0.I  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1007I extends L {

    /* renamed from: m  reason: collision with root package name */
    public final Class f12498m;

    public C1007I(Class cls) {
        super(true);
        if (!Parcelable.class.isAssignableFrom(cls) && !Serializable.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException((cls + " does not implement Parcelable or Serializable.").toString());
        }
        this.f12498m = cls;
    }

    @Override // n0.L
    public final Object a(String str, Bundle bundle) {
        return bundle.get(str);
    }

    @Override // n0.L
    public final String b() {
        return this.f12498m.getName();
    }

    @Override // n0.L
    public final Object c(String str) {
        M5.g.f(str, "value");
        throw new UnsupportedOperationException("Parcelables don't support default values.");
    }

    @Override // n0.L
    public final void d(Bundle bundle, String str, Object obj) {
        M5.g.f(str, "key");
        this.f12498m.cast(obj);
        if (obj != null && !(obj instanceof Parcelable)) {
            if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
                return;
            }
            return;
        }
        bundle.putParcelable(str, (Parcelable) obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && M5.g.a(C1007I.class, obj.getClass())) {
            return M5.g.a(this.f12498m, ((C1007I) obj).f12498m);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12498m.hashCode();
    }
}
