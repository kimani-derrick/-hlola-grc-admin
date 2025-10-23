package n0;

import android.os.Bundle;
import java.io.Serializable;
/* renamed from: n0.K  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1009K extends L {

    /* renamed from: m  reason: collision with root package name */
    public final Class f12500m;

    public C1009K(int i7, Class cls) {
        super(false);
        if (Serializable.class.isAssignableFrom(cls)) {
            this.f12500m = cls;
            return;
        }
        throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
    }

    @Override // n0.L
    public final Object a(String str, Bundle bundle) {
        return (Serializable) bundle.get(str);
    }

    @Override // n0.L
    public String b() {
        return this.f12500m.getName();
    }

    @Override // n0.L
    public final void d(Bundle bundle, String str, Object obj) {
        Serializable serializable = (Serializable) obj;
        M5.g.f(str, "key");
        M5.g.f(serializable, "value");
        this.f12500m.cast(serializable);
        bundle.putSerializable(str, serializable);
    }

    @Override // n0.L
    /* renamed from: e */
    public Serializable c(String str) {
        M5.g.f(str, "value");
        throw new UnsupportedOperationException("Serializables don't support default values.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1009K)) {
            return false;
        }
        return M5.g.a(this.f12500m, ((C1009K) obj).f12500m);
    }

    public final int hashCode() {
        return this.f12500m.hashCode();
    }

    public C1009K(Class cls) {
        super(true);
        if (!Serializable.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
        } else if (true ^ cls.isEnum()) {
            this.f12500m = cls;
        } else {
            throw new IllegalArgumentException((cls + " is an Enum. You should use EnumType instead.").toString());
        }
    }
}
