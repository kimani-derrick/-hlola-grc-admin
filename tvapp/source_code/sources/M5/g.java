package M5;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import r0.AbstractC1111a;
/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a  reason: collision with root package name */
    public static final Object[] f2308a = new Object[0];

    public static boolean a(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null) {
                return true;
            }
            return false;
        }
        return obj.equals(obj2);
    }

    public static void b(Object obj, String str) {
        if (obj != null) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException(str.concat(" must not be null"));
        j(illegalStateException, g.class.getName());
        throw illegalStateException;
    }

    public static void c(Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        j(nullPointerException, g.class.getName());
        throw nullPointerException;
    }

    public static void d(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str);
        j(nullPointerException, g.class.getName());
        throw nullPointerException;
    }

    public static void e(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str.concat(" must not be null"));
        j(nullPointerException, g.class.getName());
        throw nullPointerException;
    }

    public static void f(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(i(str));
        j(nullPointerException, g.class.getName());
        throw nullPointerException;
    }

    public static void g(Object obj, String str) {
        if (obj != null) {
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(i(str));
        j(illegalArgumentException, g.class.getName());
        throw illegalArgumentException;
    }

    public static int h(int i7, int i8) {
        if (i7 < i8) {
            return -1;
        }
        if (i7 == i8) {
            return 0;
        }
        return 1;
    }

    public static String i(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = g.class.getName();
        int i7 = 0;
        while (!stackTrace[i7].getClassName().equals(name)) {
            i7++;
        }
        while (stackTrace[i7].getClassName().equals(name)) {
            i7++;
        }
        StackTraceElement stackTraceElement = stackTrace[i7];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        return "Parameter specified as non-null is null: method " + className + "." + methodName + ", parameter " + str;
    }

    public static void j(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i7 = -1;
        for (int i8 = 0; i8 < length; i8++) {
            if (str.equals(stackTrace[i8].getClassName())) {
                i7 = i8;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i7 + 1, length));
    }

    public static String k(Object obj, String str) {
        return str + obj;
    }

    public static void l(String str) {
        RuntimeException runtimeException = new RuntimeException(AbstractC1111a.r("lateinit property ", str, " has not been initialized"));
        j(runtimeException, g.class.getName());
        throw runtimeException;
    }

    public static final Object[] m(Collection collection) {
        f(collection, "collection");
        int size = collection.size();
        Object[] objArr = f2308a;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArr2 = new Object[size];
                int i7 = 0;
                while (true) {
                    int i8 = i7 + 1;
                    objArr2[i7] = it.next();
                    if (i8 >= objArr2.length) {
                        if (it.hasNext()) {
                            int i9 = ((i8 * 3) + 1) >>> 1;
                            if (i9 <= i8) {
                                i9 = 2147483645;
                                if (i8 >= 2147483645) {
                                    throw new OutOfMemoryError();
                                }
                            }
                            objArr2 = Arrays.copyOf(objArr2, i9);
                            e(objArr2, "copyOf(...)");
                        } else {
                            return objArr2;
                        }
                    } else if (!it.hasNext()) {
                        Object[] copyOf = Arrays.copyOf(objArr2, i8);
                        e(copyOf, "copyOf(...)");
                        return copyOf;
                    }
                    i7 = i8;
                }
            } else {
                return objArr;
            }
        } else {
            return objArr;
        }
    }

    public static final Object[] n(Collection collection, Object[] objArr) {
        Object[] objArr2;
        f(collection, "collection");
        objArr.getClass();
        int size = collection.size();
        int i7 = 0;
        if (size == 0) {
            if (objArr.length > 0) {
                objArr[0] = null;
                return objArr;
            }
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            if (objArr.length > 0) {
                objArr[0] = null;
                return objArr;
            }
            return objArr;
        }
        if (size <= objArr.length) {
            objArr2 = objArr;
        } else {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
            d(newInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr2 = (Object[]) newInstance;
        }
        while (true) {
            int i8 = i7 + 1;
            objArr2[i7] = it.next();
            if (i8 >= objArr2.length) {
                if (!it.hasNext()) {
                    return objArr2;
                }
                int i9 = ((i8 * 3) + 1) >>> 1;
                if (i9 <= i8) {
                    i9 = 2147483645;
                    if (i8 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArr2 = Arrays.copyOf(objArr2, i9);
                e(objArr2, "copyOf(...)");
            } else if (!it.hasNext()) {
                if (objArr2 == objArr) {
                    objArr[i8] = null;
                    return objArr;
                }
                Object[] copyOf = Arrays.copyOf(objArr2, i8);
                e(copyOf, "copyOf(...)");
                return copyOf;
            }
            i7 = i8;
        }
    }
}
