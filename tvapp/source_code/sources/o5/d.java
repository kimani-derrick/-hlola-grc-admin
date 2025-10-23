package o5;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import n5.AbstractC1043D;
/* loaded from: classes.dex */
public final class d implements WildcardType {

    /* renamed from: a  reason: collision with root package name */
    public final Type f12955a;

    /* renamed from: b  reason: collision with root package name */
    public final Type f12956b;

    public d(Type[] typeArr, Type[] typeArr2) {
        if (typeArr2.length <= 1) {
            if (typeArr.length == 1) {
                if (typeArr2.length == 1) {
                    typeArr2[0].getClass();
                    e.b(typeArr2[0]);
                    if (typeArr[0] == Object.class) {
                        this.f12956b = e.a(typeArr2[0]);
                        this.f12955a = Object.class;
                        return;
                    }
                    throw new IllegalArgumentException();
                }
                typeArr[0].getClass();
                e.b(typeArr[0]);
                this.f12956b = null;
                this.f12955a = e.a(typeArr[0]);
                return;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof WildcardType) && AbstractC1043D.b(this, (WildcardType) obj)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f12956b;
        return type != null ? new Type[]{type} : e.f12958b;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.f12955a};
    }

    public final int hashCode() {
        int i7;
        Type type = this.f12956b;
        if (type != null) {
            i7 = type.hashCode() + 31;
        } else {
            i7 = 1;
        }
        return i7 ^ (this.f12955a.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.f12956b;
        if (type != null) {
            return "? super " + e.i(type);
        }
        Type type2 = this.f12955a;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + e.i(type2);
    }
}
