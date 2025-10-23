package M5;

import A5.w;
import L5.s;
import L5.t;
import L5.u;
import L5.v;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import z5.C1524f;
/* loaded from: classes.dex */
public final class d implements S5.b, c {

    /* renamed from: b  reason: collision with root package name */
    public static final Map f2303b;

    /* renamed from: c  reason: collision with root package name */
    public static final LinkedHashMap f2304c;

    /* renamed from: a  reason: collision with root package name */
    public final Class f2305a;

    static {
        int i7 = 0;
        List L6 = A5.l.L(L5.a.class, L5.l.class, L5.p.class, L5.q.class, D0.b.class, L5.r.class, s.class, t.class, u.class, v.class, L5.b.class, L5.c.class, L5.d.class, L5.e.class, L5.f.class, L5.g.class, L5.h.class, L5.i.class, L5.j.class, L5.k.class, L5.m.class, L5.n.class, L5.o.class);
        ArrayList arrayList = new ArrayList(A5.m.P(L6));
        for (Object obj : L6) {
            int i8 = i7 + 1;
            if (i7 >= 0) {
                arrayList.add(new C1524f((Class) obj, Integer.valueOf(i7)));
                i7 = i8;
            } else {
                A5.l.O();
                throw null;
            }
        }
        f2303b = w.M(arrayList);
        HashMap hashMap = new HashMap();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        HashMap hashMap3 = new HashMap();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        g.e(values, "<get-values>(...)");
        for (String str : values) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            g.c(str);
            sb.append(U5.f.y0(str, '.', str));
            sb.append("CompanionObject");
            hashMap3.put(sb.toString(), str.concat(".Companion"));
        }
        for (Map.Entry entry : f2303b.entrySet()) {
            int intValue = ((Number) entry.getValue()).intValue();
            String name = ((Class) entry.getKey()).getName();
            hashMap3.put(name, "kotlin.Function" + intValue);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(w.J(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            Object key = entry2.getKey();
            String str2 = (String) entry2.getValue();
            linkedHashMap.put(key, U5.f.y0(str2, '.', str2));
        }
        f2304c = linkedHashMap;
    }

    public d(Class cls) {
        g.f(cls, "jClass");
        this.f2305a = cls;
    }

    @Override // M5.c
    public final Class a() {
        return this.f2305a;
    }

    public final String b() {
        String str;
        Method enclosingMethod;
        Constructor<?> enclosingConstructor;
        String str2;
        Class cls = this.f2305a;
        g.f(cls, "jClass");
        String str3 = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (cls.isLocalClass()) {
            String simpleName = cls.getSimpleName();
            if (cls.getEnclosingMethod() != null) {
                str2 = enclosingMethod.getName() + '$';
            } else {
                if (cls.getEnclosingConstructor() != null) {
                    str2 = enclosingConstructor.getName() + '$';
                } else {
                    return U5.f.w0(simpleName, '$');
                }
            }
            return U5.f.x0(simpleName, str2);
        }
        boolean isArray = cls.isArray();
        LinkedHashMap linkedHashMap = f2304c;
        if (isArray) {
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (str = (String) linkedHashMap.get(componentType.getName())) != null) {
                str3 = str.concat("Array");
            }
            if (str3 == null) {
                return "Array";
            }
            return str3;
        }
        String str4 = (String) linkedHashMap.get(cls.getName());
        if (str4 == null) {
            return cls.getSimpleName();
        }
        return str4;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof d) && g.a(m3.g.t(this), m3.g.t((S5.b) obj))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return m3.g.t(this).hashCode();
    }

    public final String toString() {
        return this.f2305a.toString() + " (Kotlin reflection is not available)";
    }
}
