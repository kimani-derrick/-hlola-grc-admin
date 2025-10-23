package x6;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
/* loaded from: classes.dex */
public final class U implements WildcardType {

    /* renamed from: a  reason: collision with root package name */
    public final Type f16296a;

    /* renamed from: b  reason: collision with root package name */
    public final Type f16297b;

    public U(Type[] typeArr, Type[] typeArr2) {
        if (typeArr2.length <= 1) {
            if (typeArr.length == 1) {
                if (typeArr2.length == 1) {
                    typeArr2[0].getClass();
                    V.b(typeArr2[0]);
                    if (typeArr[0] == Object.class) {
                        this.f16297b = typeArr2[0];
                        this.f16296a = Object.class;
                        return;
                    }
                    throw new IllegalArgumentException();
                }
                typeArr[0].getClass();
                V.b(typeArr[0]);
                this.f16297b = null;
                this.f16296a = typeArr[0];
                return;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof WildcardType) && V.c(this, (WildcardType) obj)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f16297b;
        return type != null ? new Type[]{type} : V.f16298a;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.f16296a};
    }

    public final int hashCode() {
        int i7;
        Type type = this.f16297b;
        if (type != null) {
            i7 = type.hashCode() + 31;
        } else {
            i7 = 1;
        }
        return i7 ^ (this.f16296a.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.f16297b;
        if (type != null) {
            return "? super " + V.p(type);
        }
        Type type2 = this.f16296a;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + V.p(type2);
    }
}
