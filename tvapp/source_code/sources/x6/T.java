package x6;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;
/* loaded from: classes.dex */
public final class T implements ParameterizedType {

    /* renamed from: a  reason: collision with root package name */
    public final Type f16293a;

    /* renamed from: b  reason: collision with root package name */
    public final Type f16294b;

    /* renamed from: c  reason: collision with root package name */
    public final Type[] f16295c;

    public T(Type type, Type type2, Type... typeArr) {
        boolean z7;
        if (type2 instanceof Class) {
            if (type == null) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (z7 != (((Class) type2).getEnclosingClass() == null)) {
                throw new IllegalArgumentException();
            }
        }
        for (Type type3 : typeArr) {
            Objects.requireNonNull(type3, "typeArgument == null");
            V.b(type3);
        }
        this.f16293a = type;
        this.f16294b = type2;
        this.f16295c = (Type[]) typeArr.clone();
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ParameterizedType) && V.c(this, (ParameterizedType) obj)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f16295c.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f16293a;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f16294b;
    }

    public final int hashCode() {
        int i7;
        int hashCode = Arrays.hashCode(this.f16295c) ^ this.f16294b.hashCode();
        Type type = this.f16293a;
        if (type != null) {
            i7 = type.hashCode();
        } else {
            i7 = 0;
        }
        return hashCode ^ i7;
    }

    public final String toString() {
        Type[] typeArr = this.f16295c;
        int length = typeArr.length;
        Type type = this.f16294b;
        if (length == 0) {
            return V.p(type);
        }
        StringBuilder sb = new StringBuilder((typeArr.length + 1) * 30);
        sb.append(V.p(type));
        sb.append("<");
        sb.append(V.p(typeArr[0]));
        for (int i7 = 1; i7 < typeArr.length; i7++) {
            sb.append(", ");
            sb.append(V.p(typeArr[i7]));
        }
        sb.append(">");
        return sb.toString();
    }
}
