package o5;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Set;
import n5.AbstractC1043D;
/* loaded from: classes.dex */
public final class c implements ParameterizedType {

    /* renamed from: a  reason: collision with root package name */
    public final Type f12952a;

    /* renamed from: b  reason: collision with root package name */
    public final Type f12953b;

    /* renamed from: c  reason: collision with root package name */
    public final Type[] f12954c;

    public c(Type type, Type type2, Type... typeArr) {
        Type a7;
        if (type2 instanceof Class) {
            Class<?> enclosingClass = ((Class) type2).getEnclosingClass();
            if (type != null) {
                if (enclosingClass == null || AbstractC1043D.d(type) != enclosingClass) {
                    throw new IllegalArgumentException("unexpected owner type for " + type2 + ": " + type);
                }
            } else if (enclosingClass != null) {
                throw new IllegalArgumentException("unexpected owner type for " + type2 + ": null");
            }
        }
        if (type == null) {
            a7 = null;
        } else {
            a7 = e.a(type);
        }
        this.f12952a = a7;
        this.f12953b = e.a(type2);
        this.f12954c = (Type[]) typeArr.clone();
        int i7 = 0;
        while (true) {
            Type[] typeArr2 = this.f12954c;
            if (i7 < typeArr2.length) {
                typeArr2[i7].getClass();
                e.b(this.f12954c[i7]);
                Type[] typeArr3 = this.f12954c;
                typeArr3[i7] = e.a(typeArr3[i7]);
                i7++;
            } else {
                return;
            }
        }
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ParameterizedType) && AbstractC1043D.b(this, (ParameterizedType) obj)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f12954c.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f12952a;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f12953b;
    }

    public final int hashCode() {
        int i7;
        int hashCode = Arrays.hashCode(this.f12954c) ^ this.f12953b.hashCode();
        Set set = e.f12957a;
        Type type = this.f12952a;
        if (type != null) {
            i7 = type.hashCode();
        } else {
            i7 = 0;
        }
        return hashCode ^ i7;
    }

    public final String toString() {
        Type[] typeArr = this.f12954c;
        StringBuilder sb = new StringBuilder((typeArr.length + 1) * 30);
        sb.append(e.i(this.f12953b));
        if (typeArr.length == 0) {
            return sb.toString();
        }
        sb.append("<");
        sb.append(e.i(typeArr[0]));
        for (int i7 = 1; i7 < typeArr.length; i7++) {
            sb.append(", ");
            sb.append(e.i(typeArr[i7]));
        }
        sb.append(">");
        return sb.toString();
    }
}
