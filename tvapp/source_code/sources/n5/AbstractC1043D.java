package n5;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
/* renamed from: n5.D  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1043D {

    /* renamed from: a  reason: collision with root package name */
    public static final C1044a f12672a = new C1044a(5);

    /* renamed from: b  reason: collision with root package name */
    public static final C1040A f12673b = new C1040A(1);

    /* renamed from: c  reason: collision with root package name */
    public static final C1040A f12674c = new C1040A(2);
    public static final C1040A d = new C1040A(3);

    /* renamed from: e  reason: collision with root package name */
    public static final C1040A f12675e = new C1040A(4);
    public static final C1040A f = new C1040A(5);

    /* renamed from: g  reason: collision with root package name */
    public static final C1040A f12676g = new C1040A(6);

    /* renamed from: h  reason: collision with root package name */
    public static final C1040A f12677h = new C1040A(7);

    /* renamed from: i  reason: collision with root package name */
    public static final C1040A f12678i = new C1040A(8);

    /* renamed from: j  reason: collision with root package name */
    public static final C1040A f12679j = new C1040A(0);

    public static Type a(Type type) {
        if (Collection.class.isAssignableFrom(Collection.class)) {
            Type f7 = o5.e.f(type, Collection.class, o5.e.c(type, Collection.class, Collection.class), new LinkedHashSet());
            if (f7 instanceof WildcardType) {
                f7 = ((WildcardType) f7).getUpperBounds()[0];
            }
            if (f7 instanceof ParameterizedType) {
                return ((ParameterizedType) f7).getActualTypeArguments()[0];
            }
            return Object.class;
        }
        throw new IllegalArgumentException();
    }

    public static boolean b(Type type, Type type2) {
        Type[] actualTypeArguments;
        Type[] actualTypeArguments2;
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            if (type2 instanceof GenericArrayType) {
                return b(((Class) type).getComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return type.equals(type2);
        } else if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            if (parameterizedType instanceof o5.c) {
                actualTypeArguments = ((o5.c) parameterizedType).f12954c;
            } else {
                actualTypeArguments = parameterizedType.getActualTypeArguments();
            }
            if (parameterizedType2 instanceof o5.c) {
                actualTypeArguments2 = ((o5.c) parameterizedType2).f12954c;
            } else {
                actualTypeArguments2 = parameterizedType2.getActualTypeArguments();
            }
            if (b(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(actualTypeArguments, actualTypeArguments2)) {
                return true;
            }
            return false;
        } else if (type instanceof GenericArrayType) {
            if (type2 instanceof Class) {
                return b(((Class) type2).getComponentType(), ((GenericArrayType) type).getGenericComponentType());
            }
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            return b(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
        } else if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            if (Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds())) {
                return true;
            }
            return false;
        } else if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        } else {
            TypeVariable typeVariable = (TypeVariable) type;
            TypeVariable typeVariable2 = (TypeVariable) type2;
            if (typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName())) {
                return true;
            }
            return false;
        }
    }

    public static String c(int i7, int[] iArr, String[] strArr, int[] iArr2) {
        StringBuilder sb = new StringBuilder("$");
        for (int i8 = 0; i8 < i7; i8++) {
            int i9 = iArr[i8];
            if (i9 != 1 && i9 != 2) {
                if (i9 == 3 || i9 == 4 || i9 == 5) {
                    sb.append('.');
                    String str = strArr[i8];
                    if (str != null) {
                        sb.append(str);
                    }
                }
            } else {
                sb.append('[');
                sb.append(iArr2[i8]);
                sb.append(']');
            }
        }
        return sb.toString();
    }

    public static Class d(Type type) {
        String name;
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return (Class) ((ParameterizedType) type).getRawType();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(d(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return d(((WildcardType) type).getUpperBounds()[0]);
        }
        if (type == null) {
            name = "null";
        } else {
            name = type.getClass().getName();
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + name);
    }

    public static o5.c f(Type... typeArr) {
        if (typeArr.length != 0) {
            return new o5.c(null, List.class, typeArr);
        }
        throw new IllegalArgumentException("Missing type arguments for " + List.class);
    }

    public static int g(n nVar, String str, int i7, int i8) {
        int x7 = nVar.x();
        if (x7 >= i7 && x7 <= i8) {
            return x7;
        }
        String j7 = nVar.j();
        throw new RuntimeException("Expected " + str + " but was " + x7 + " at path " + j7);
    }

    public abstract Object e();
}
