package x6;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
/* loaded from: classes.dex */
public final class S implements GenericArrayType {

    /* renamed from: a  reason: collision with root package name */
    public final Type f16292a;

    public S(Type type) {
        this.f16292a = type;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof GenericArrayType) && V.c(this, (GenericArrayType) obj)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f16292a;
    }

    public final int hashCode() {
        return this.f16292a.hashCode();
    }

    public final String toString() {
        return V.p(this.f16292a) + "[]";
    }
}
