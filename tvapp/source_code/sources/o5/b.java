package o5;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import n5.AbstractC1043D;
/* loaded from: classes.dex */
public final class b implements GenericArrayType {

    /* renamed from: a  reason: collision with root package name */
    public final Type f12951a;

    public b(Type type) {
        this.f12951a = e.a(type);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof GenericArrayType) && AbstractC1043D.b(this, (GenericArrayType) obj)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f12951a;
    }

    public final int hashCode() {
        return this.f12951a.hashCode();
    }

    public final String toString() {
        return e.i(this.f12951a) + "[]";
    }
}
