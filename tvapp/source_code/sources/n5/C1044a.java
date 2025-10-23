package n5;

import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;
/* renamed from: n5.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1044a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12680a;

    public /* synthetic */ C1044a(int i7) {
        this.f12680a = i7;
    }

    public static void b(Type type, Class cls) {
        Class<?> d = AbstractC1043D.d(type);
        if (!cls.isAssignableFrom(d)) {
            return;
        }
        throw new IllegalArgumentException("No JsonAdapter for " + type + ", you should probably use " + cls.getSimpleName() + " instead of " + d.getSimpleName() + " (Moshi only supports the collection interfaces by default) or else register a custom JsonAdapter.");
    }

    public final k a(Type type, Set set, y yVar) {
        Type type2;
        AbstractC1043D c1046c;
        Class cls;
        boolean z7;
        Field[] fieldArr;
        int i7;
        int i8;
        Set set2;
        f fVar;
        h hVar;
        Class d;
        Type[] actualTypeArguments;
        o5.a aVar;
        Constructor<?> declaredConstructor;
        Object[] objArr;
        Type type3 = type;
        Class<?> cls2 = null;
        int i9 = 0;
        int i10 = 1;
        switch (this.f12680a) {
            case 0:
                if (type3 instanceof GenericArrayType) {
                    type2 = ((GenericArrayType) type3).getGenericComponentType();
                } else if (type3 instanceof Class) {
                    type2 = ((Class) type3).getComponentType();
                } else {
                    type2 = null;
                }
                if (type2 == null || !set.isEmpty()) {
                    return null;
                }
                Class d7 = AbstractC1043D.d(type2);
                yVar.getClass();
                return new C1045b(d7, yVar.c(type2, o5.e.f12957a, null)).d();
            case 1:
                if (!(type3 instanceof Class) && !(type3 instanceof ParameterizedType)) {
                    return null;
                }
                Class d8 = AbstractC1043D.d(type);
                if (d8.isInterface() || d8.isEnum() || !set.isEmpty()) {
                    return null;
                }
                if (o5.e.d(d8)) {
                    b(type3, List.class);
                    b(type3, Set.class);
                    b(type3, Map.class);
                    b(type3, Collection.class);
                    String str = "Platform " + d8;
                    if (type3 instanceof ParameterizedType) {
                        str = str + " in " + type3;
                    }
                    throw new IllegalArgumentException(AbstractC0515y1.m(str, " requires explicit JsonAdapter to be registered"));
                } else if (!d8.isAnonymousClass()) {
                    if (!d8.isLocalClass()) {
                        if (d8.getEnclosingClass() != null && !Modifier.isStatic(d8.getModifiers())) {
                            throw new IllegalArgumentException("Cannot serialize non-static nested class ".concat(d8.getName()));
                        }
                        if (!Modifier.isAbstract(d8.getModifiers())) {
                            Class<? extends Annotation> cls3 = o5.e.d;
                            if (cls3 != null && d8.isAnnotationPresent(cls3)) {
                                throw new IllegalArgumentException("Cannot serialize Kotlin type " + d8.getName() + ". Reflective serialization of Kotlin classes without using kotlin-reflect has undefined and unexpected behavior. Please use KotlinJsonAdapterFactory from the moshi-kotlin artifact or use code gen from the moshi-kotlin-codegen artifact.");
                            }
                            try {
                                try {
                                    try {
                                        try {
                                            Constructor declaredConstructor2 = d8.getDeclaredConstructor(null);
                                            declaredConstructor2.setAccessible(true);
                                            c1046c = new C1046c(declaredConstructor2, d8, 0);
                                        } catch (NoSuchMethodException unused) {
                                            Class<?> cls4 = Class.forName("sun.misc.Unsafe");
                                            Field declaredField = cls4.getDeclaredField("theUnsafe");
                                            declaredField.setAccessible(true);
                                            c1046c = new C1047d(cls4.getMethod("allocateInstance", Class.class), declaredField.get(null), d8);
                                        }
                                    } catch (Exception unused2) {
                                        throw new IllegalArgumentException("cannot construct instances of ".concat(d8.getName()));
                                    }
                                } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused3) {
                                    Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                                    declaredMethod.setAccessible(true);
                                    int intValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                                    Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                                    declaredMethod2.setAccessible(true);
                                    c1046c = new e(declaredMethod2, d8, intValue);
                                } catch (IllegalAccessException unused4) {
                                    throw new AssertionError();
                                }
                            } catch (IllegalAccessException unused5) {
                                throw new AssertionError();
                            } catch (NoSuchMethodException unused6) {
                                Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                                declaredMethod3.setAccessible(true);
                                c1046c = new C1046c(declaredMethod3, d8, 1);
                            } catch (InvocationTargetException e3) {
                                o5.e.g(e3);
                                throw null;
                            }
                            TreeMap treeMap = new TreeMap();
                            while (type3 != Object.class) {
                                Class d9 = AbstractC1043D.d(type3);
                                boolean d10 = o5.e.d(d9);
                                Field[] declaredFields = d9.getDeclaredFields();
                                int length = declaredFields.length;
                                int i11 = i9;
                                while (i11 < length) {
                                    Field field = declaredFields[i11];
                                    int modifiers = field.getModifiers();
                                    if (Modifier.isStatic(modifiers) || Modifier.isTransient(modifiers) || (!Modifier.isPublic(modifiers) && !Modifier.isProtected(modifiers) && d10)) {
                                        cls = d9;
                                        z7 = d10;
                                        fieldArr = declaredFields;
                                        i7 = length;
                                    } else {
                                        i iVar = (i) field.getAnnotation(i.class);
                                        if (iVar != null && iVar.ignore()) {
                                            cls = d9;
                                            z7 = d10;
                                            fieldArr = declaredFields;
                                            i7 = length;
                                            i8 = i10;
                                            i11 += i8;
                                            d10 = z7;
                                            i10 = i8;
                                            declaredFields = fieldArr;
                                            length = i7;
                                            d9 = cls;
                                        } else {
                                            Type f = o5.e.f(type3, d9, field.getGenericType(), new LinkedHashSet());
                                            Annotation[] annotations = field.getAnnotations();
                                            int length2 = annotations.length;
                                            cls = d9;
                                            int i12 = 0;
                                            LinkedHashSet linkedHashSet = null;
                                            while (true) {
                                                z7 = d10;
                                                if (i12 < length2) {
                                                    Annotation annotation = annotations[i12];
                                                    Field[] fieldArr2 = declaredFields;
                                                    int i13 = length;
                                                    if (annotation.annotationType().isAnnotationPresent(m.class)) {
                                                        if (linkedHashSet == null) {
                                                            linkedHashSet = new LinkedHashSet();
                                                        }
                                                        LinkedHashSet linkedHashSet2 = linkedHashSet;
                                                        linkedHashSet2.add(annotation);
                                                        linkedHashSet = linkedHashSet2;
                                                    }
                                                    i12++;
                                                    d10 = z7;
                                                    declaredFields = fieldArr2;
                                                    length = i13;
                                                } else {
                                                    fieldArr = declaredFields;
                                                    i7 = length;
                                                    if (linkedHashSet != null) {
                                                        set2 = Collections.unmodifiableSet(linkedHashSet);
                                                    } else {
                                                        set2 = o5.e.f12957a;
                                                    }
                                                    String name = field.getName();
                                                    k c5 = yVar.c(f, set2, name);
                                                    field.setAccessible(true);
                                                    if (iVar != null) {
                                                        String name2 = iVar.name();
                                                        if (!"\u0000".equals(name2)) {
                                                            name = name2;
                                                        }
                                                    }
                                                    if (((f) treeMap.put(name, new f(name, field, c5))) != null) {
                                                        throw new IllegalArgumentException("Conflicting fields:\n    " + fVar.f12695b + "\n    " + field);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i8 = 1;
                                    i11 += i8;
                                    d10 = z7;
                                    i10 = i8;
                                    declaredFields = fieldArr;
                                    length = i7;
                                    d9 = cls;
                                }
                                Class d11 = AbstractC1043D.d(type3);
                                type3 = o5.e.f(type3, d11, d11.getGenericSuperclass(), new LinkedHashSet());
                                i10 = i10;
                                i9 = 0;
                            }
                            return new g(c1046c, treeMap).d();
                        }
                        throw new IllegalArgumentException("Cannot serialize abstract class ".concat(d8.getName()));
                    }
                    throw new IllegalArgumentException("Cannot serialize local class ".concat(d8.getName()));
                } else {
                    throw new IllegalArgumentException("Cannot serialize anonymous class ".concat(d8.getName()));
                }
            case 2:
                Class d12 = AbstractC1043D.d(type);
                if (!set.isEmpty()) {
                    return null;
                }
                if (d12 != List.class && d12 != Collection.class) {
                    if (d12 != Set.class) {
                        return null;
                    }
                    Type a7 = AbstractC1043D.a(type);
                    yVar.getClass();
                    hVar = new h(yVar.c(a7, o5.e.f12957a, null), 1);
                } else {
                    Type a8 = AbstractC1043D.a(type);
                    yVar.getClass();
                    hVar = new h(yVar.c(a8, o5.e.f12957a, null), 0);
                }
                return hVar.d();
            case 3:
                if (!set.isEmpty() || (d = AbstractC1043D.d(type)) != Map.class) {
                    return null;
                }
                if (type3 == Properties.class) {
                    actualTypeArguments = new Type[]{String.class, String.class};
                } else if (Map.class.isAssignableFrom(d)) {
                    Type f7 = o5.e.f(type3, d, o5.e.c(type3, d, Map.class), new LinkedHashSet());
                    actualTypeArguments = f7 instanceof ParameterizedType ? ((ParameterizedType) f7).getActualTypeArguments() : new Type[]{Object.class, Object.class};
                } else {
                    throw new IllegalArgumentException();
                }
                return new C1045b(yVar, actualTypeArguments[0], actualTypeArguments[1]).d();
            case 4:
                return null;
            default:
                if (!set.isEmpty()) {
                    return null;
                }
                Class cls5 = Boolean.TYPE;
                C1040A c1040a = AbstractC1043D.f12673b;
                if (type3 == cls5) {
                    return c1040a;
                }
                Class cls6 = Byte.TYPE;
                C1040A c1040a2 = AbstractC1043D.f12674c;
                if (type3 == cls6) {
                    return c1040a2;
                }
                Class cls7 = Character.TYPE;
                C1040A c1040a3 = AbstractC1043D.d;
                if (type3 == cls7) {
                    return c1040a3;
                }
                Class cls8 = Double.TYPE;
                C1040A c1040a4 = AbstractC1043D.f12675e;
                if (type3 == cls8) {
                    return c1040a4;
                }
                Class cls9 = Float.TYPE;
                C1040A c1040a5 = AbstractC1043D.f;
                if (type3 == cls9) {
                    return c1040a5;
                }
                Class cls10 = Integer.TYPE;
                C1040A c1040a6 = AbstractC1043D.f12676g;
                if (type3 == cls10) {
                    return c1040a6;
                }
                Class cls11 = Long.TYPE;
                C1040A c1040a7 = AbstractC1043D.f12677h;
                if (type3 == cls11) {
                    return c1040a7;
                }
                Class cls12 = Short.TYPE;
                C1040A c1040a8 = AbstractC1043D.f12678i;
                if (type3 == cls12) {
                    return c1040a8;
                }
                if (type3 == Boolean.class) {
                    return c1040a.d();
                }
                if (type3 == Byte.class) {
                    return c1040a2.d();
                }
                if (type3 == Character.class) {
                    return c1040a3.d();
                }
                if (type3 == Double.class) {
                    return c1040a4.d();
                }
                if (type3 == Float.class) {
                    return c1040a5.d();
                }
                if (type3 == Integer.class) {
                    return c1040a6.d();
                }
                if (type3 == Long.class) {
                    return c1040a7.d();
                }
                if (type3 == Short.class) {
                    return c1040a8.d();
                }
                if (type3 == String.class) {
                    return AbstractC1043D.f12679j.d();
                }
                if (type3 == Object.class) {
                    return new C1042C(yVar).d();
                }
                Class d13 = AbstractC1043D.d(type);
                Set set3 = o5.e.f12957a;
                l lVar = (l) d13.getAnnotation(l.class);
                if (lVar != null && lVar.generateAdapter()) {
                    String name3 = d13.getName();
                    try {
                        try {
                            Class<?> cls13 = Class.forName(name3.replace("$", "_") + "JsonAdapter", true, d13.getClassLoader());
                            try {
                                if (type3 instanceof ParameterizedType) {
                                    Type[] actualTypeArguments2 = ((ParameterizedType) type3).getActualTypeArguments();
                                    try {
                                        declaredConstructor = cls13.getDeclaredConstructor(y.class, Type[].class);
                                        objArr = new Object[]{yVar, actualTypeArguments2};
                                    } catch (NoSuchMethodException unused7) {
                                        declaredConstructor = cls13.getDeclaredConstructor(Type[].class);
                                        objArr = new Object[]{actualTypeArguments2};
                                    }
                                } else {
                                    try {
                                        declaredConstructor = cls13.getDeclaredConstructor(y.class);
                                        objArr = new Object[]{yVar};
                                    } catch (NoSuchMethodException unused8) {
                                        declaredConstructor = cls13.getDeclaredConstructor(null);
                                        objArr = new Object[0];
                                    }
                                }
                                declaredConstructor.setAccessible(true);
                                aVar = ((k) declaredConstructor.newInstance(objArr)).d();
                            } catch (NoSuchMethodException e7) {
                                e = e7;
                                cls2 = cls13;
                                if (!(type3 instanceof ParameterizedType) && cls2.getTypeParameters().length != 0) {
                                    throw new RuntimeException("Failed to find the generated JsonAdapter constructor for '" + type3 + "'. Suspiciously, the type was not parameterized but the target class '" + cls2.getCanonicalName() + "' is generic. Consider using Types#newParameterizedType() to define these missing type variables.", e);
                                }
                                throw new RuntimeException("Failed to find the generated JsonAdapter constructor for " + type3, e);
                            }
                        } catch (NoSuchMethodException e8) {
                            e = e8;
                        }
                    } catch (ClassNotFoundException e9) {
                        throw new RuntimeException("Failed to find the generated JsonAdapter class for " + type3, e9);
                    } catch (IllegalAccessException e10) {
                        throw new RuntimeException("Failed to access the generated JsonAdapter for " + type3, e10);
                    } catch (InstantiationException e11) {
                        throw new RuntimeException("Failed to instantiate the generated JsonAdapter for " + type3, e11);
                    } catch (InvocationTargetException e12) {
                        o5.e.g(e12);
                        throw null;
                    }
                } else {
                    aVar = null;
                }
                if (aVar != null) {
                    return aVar;
                }
                if (!d13.isEnum()) {
                    return null;
                }
                return new C1041B(d13).d();
        }
    }
}
