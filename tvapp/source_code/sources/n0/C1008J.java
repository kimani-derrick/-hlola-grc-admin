package n0;

import android.os.Bundle;
import java.io.Serializable;
/* renamed from: n0.J  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1008J extends L {

    /* renamed from: m  reason: collision with root package name */
    public final Class f12499m;

    public C1008J(Class cls) {
        super(true);
        if (Serializable.class.isAssignableFrom(cls)) {
            try {
                this.f12499m = Class.forName("[L" + cls.getName() + ';');
                return;
            } catch (ClassNotFoundException e3) {
                throw new RuntimeException(e3);
            }
        }
        throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
    }

    @Override // n0.L
    public final Object a(String str, Bundle bundle) {
        return (Serializable[]) bundle.get(str);
    }

    @Override // n0.L
    public final String b() {
        return this.f12499m.getName();
    }

    @Override // n0.L
    public final Object c(String str) {
        M5.g.f(str, "value");
        throw new UnsupportedOperationException("Arrays don't support default values.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.io.Serializable[], java.io.Serializable] */
    @Override // n0.L
    public final void d(Bundle bundle, String str, Object obj) {
        ?? r42 = (Serializable[]) obj;
        M5.g.f(str, "key");
        this.f12499m.cast(r42);
        bundle.putSerializable(str, r42);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && M5.g.a(C1008J.class, obj.getClass())) {
            return M5.g.a(this.f12499m, ((C1008J) obj).f12499m);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12499m.hashCode();
    }
}
