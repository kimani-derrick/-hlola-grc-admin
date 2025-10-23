package x6;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class L {

    /* renamed from: x  reason: collision with root package name */
    public static final Pattern f16254x = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

    /* renamed from: y  reason: collision with root package name */
    public static final Pattern f16255y = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

    /* renamed from: a  reason: collision with root package name */
    public final u4.v f16256a;

    /* renamed from: b  reason: collision with root package name */
    public final Method f16257b;

    /* renamed from: c  reason: collision with root package name */
    public final Annotation[] f16258c;
    public final Annotation[][] d;

    /* renamed from: e  reason: collision with root package name */
    public final Type[] f16259e;
    public boolean f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f16260g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f16261h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f16262i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f16263j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f16264k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f16265l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f16266m;
    public String n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f16267o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f16268p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f16269q;

    /* renamed from: r  reason: collision with root package name */
    public String f16270r;

    /* renamed from: s  reason: collision with root package name */
    public h6.r f16271s;

    /* renamed from: t  reason: collision with root package name */
    public h6.v f16272t;

    /* renamed from: u  reason: collision with root package name */
    public LinkedHashSet f16273u;

    /* renamed from: v  reason: collision with root package name */
    public V[] f16274v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f16275w;

    public L(u4.v vVar, Method method) {
        this.f16256a = vVar;
        this.f16257b = method;
        this.f16258c = method.getAnnotations();
        this.f16259e = method.getGenericParameterTypes();
        this.d = method.getParameterAnnotations();
    }

    public static Class a(Class cls) {
        if (Boolean.TYPE == cls) {
            return Boolean.class;
        }
        if (Byte.TYPE == cls) {
            return Byte.class;
        }
        if (Character.TYPE == cls) {
            return Character.class;
        }
        if (Double.TYPE == cls) {
            return Double.class;
        }
        if (Float.TYPE == cls) {
            return Float.class;
        }
        if (Integer.TYPE == cls) {
            return Integer.class;
        }
        if (Long.TYPE == cls) {
            return Long.class;
        }
        if (Short.TYPE == cls) {
            return Short.class;
        }
        return cls;
    }

    public final void b(String str, String str2, boolean z7) {
        String str3 = this.n;
        Method method = this.f16257b;
        if (str3 == null) {
            this.n = str;
            this.f16267o = z7;
            if (str2.isEmpty()) {
                return;
            }
            int indexOf = str2.indexOf(63);
            Pattern pattern = f16254x;
            if (indexOf != -1 && indexOf < str2.length() - 1) {
                String substring = str2.substring(indexOf + 1);
                if (pattern.matcher(substring).find()) {
                    throw V.j(method, null, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                }
            }
            this.f16270r = str2;
            Matcher matcher = pattern.matcher(str2);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            this.f16273u = linkedHashSet;
            return;
        }
        throw V.j(method, null, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
    }

    public final void c(int i7, Type type) {
        if (!V.h(type)) {
            return;
        }
        throw V.k(this.f16257b, i7, "Parameter type must not include a type variable or wildcard: %s", type);
    }
}
