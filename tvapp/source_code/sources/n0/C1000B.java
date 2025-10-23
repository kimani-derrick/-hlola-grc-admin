package n0;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import java.io.Serializable;
import org.xmlpull.v1.XmlPullParserException;
/* renamed from: n0.B  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1000B {

    /* renamed from: c  reason: collision with root package name */
    public static final ThreadLocal f12480c = new ThreadLocal();

    /* renamed from: a  reason: collision with root package name */
    public final Context f12481a;

    /* renamed from: b  reason: collision with root package name */
    public final O f12482b;

    public C1000B(Context context, O o7) {
        M5.g.f(context, "context");
        M5.g.f(o7, "navigatorProvider");
        this.f12481a = context;
        this.f12482b = o7;
    }

    public static C1018i c(TypedArray typedArray, Resources resources, int i7) {
        boolean z7;
        L l7;
        L l8;
        L l9;
        Class cls;
        boolean z8;
        L l10;
        Object obj;
        L l11;
        L i8;
        float f;
        Object obj2;
        int dimension;
        boolean z9;
        int i9;
        String str;
        boolean z10 = typedArray.getBoolean(3, false);
        ThreadLocal threadLocal = f12480c;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        String string = typedArray.getString(2);
        L l12 = L.f12502c;
        L l13 = L.f12505h;
        L l14 = L.f12509l;
        L l15 = L.f12507j;
        L l16 = L.f;
        L l17 = L.d;
        L l18 = L.f12503e;
        L l19 = L.f12508k;
        L l20 = L.f12506i;
        L l21 = L.f12504g;
        L l22 = L.f12501b;
        L l23 = null;
        if (string != null) {
            l7 = l17;
            String resourcePackageName = resources.getResourcePackageName(i7);
            if (M5.g.a("integer", string)) {
                z7 = z10;
                l9 = l22;
            } else {
                z7 = z10;
                if (M5.g.a("integer[]", string)) {
                    l8 = l18;
                    l9 = l7;
                } else if (M5.g.a("long", string)) {
                    l9 = l18;
                    l8 = l9;
                } else if (M5.g.a("long[]", string)) {
                    l8 = l18;
                    l9 = l16;
                } else if (M5.g.a("boolean", string)) {
                    l8 = l18;
                    l9 = l20;
                } else if (M5.g.a("boolean[]", string)) {
                    l8 = l18;
                    l9 = l15;
                } else {
                    if (!M5.g.a("string", string)) {
                        if (M5.g.a("string[]", string)) {
                            l8 = l18;
                            l9 = l14;
                        } else if (M5.g.a("float", string)) {
                            l9 = l21;
                        } else if (M5.g.a("float[]", string)) {
                            l8 = l18;
                            l9 = l13;
                        } else if (M5.g.a("reference", string)) {
                            l9 = l12;
                        } else if (string.length() != 0) {
                            try {
                                l8 = l18;
                                if (U5.n.b0(string, ".", false) && resourcePackageName != null) {
                                    str = resourcePackageName.concat(string);
                                } else {
                                    str = string;
                                }
                                if (U5.n.V(string, "[]", false)) {
                                    str = str.substring(0, str.length() - 2);
                                    M5.g.e(str, "this as java.lang.String…ing(startIndex, endIndex)");
                                    Class<?> cls2 = Class.forName(str);
                                    if (Parcelable.class.isAssignableFrom(cls2)) {
                                        l9 = new C1006H(cls2);
                                    } else {
                                        if (Serializable.class.isAssignableFrom(cls2)) {
                                            l9 = new C1008J(cls2);
                                        }
                                        throw new IllegalArgumentException(str + " is not Serializable or Parcelable.");
                                    }
                                } else {
                                    Class<?> cls3 = Class.forName(str);
                                    if (Parcelable.class.isAssignableFrom(cls3)) {
                                        l9 = new C1007I(cls3);
                                    } else if (Enum.class.isAssignableFrom(cls3)) {
                                        l9 = new C1005G(cls3);
                                    } else {
                                        if (Serializable.class.isAssignableFrom(cls3)) {
                                            l9 = new C1009K(cls3);
                                        }
                                        throw new IllegalArgumentException(str + " is not Serializable or Parcelable.");
                                    }
                                }
                            } catch (ClassNotFoundException e3) {
                                throw new RuntimeException(e3);
                            }
                        }
                    }
                    l8 = l18;
                    l9 = l19;
                }
            }
            l8 = l18;
        } else {
            z7 = z10;
            l7 = l17;
            l8 = l18;
            l9 = null;
        }
        if (typedArray.getValue(1, typedValue)) {
            cls = Serializable.class;
            if (l9 == l12) {
                int i10 = typedValue.resourceId;
                if (i10 != 0) {
                    i9 = i10;
                } else if (typedValue.type == 16 && typedValue.data == 0) {
                    i9 = 0;
                } else {
                    throw new XmlPullParserException("unsupported value '" + ((Object) typedValue.string) + "' for " + l9.b() + ". Must be a reference to a resource.");
                }
                obj = Integer.valueOf(i9);
            } else {
                int i11 = typedValue.resourceId;
                if (i11 != 0) {
                    if (l9 == null) {
                        obj = Integer.valueOf(i11);
                        l9 = l12;
                    } else {
                        throw new XmlPullParserException("unsupported value '" + ((Object) typedValue.string) + "' for " + l9.b() + ". You must use a \"reference\" type to reference other resources.");
                    }
                } else {
                    z8 = true;
                    if (l9 == l19) {
                        obj = typedArray.getString(1);
                    } else {
                        int i12 = typedValue.type;
                        if (i12 != 3) {
                            if (i12 != 4) {
                                if (i12 != 5) {
                                    if (i12 != 18) {
                                        if (i12 >= 16 && i12 <= 31) {
                                            if (l9 == l21) {
                                                i8 = android.support.v4.media.session.b.i(typedValue, l9, l21, string, "float");
                                                f = typedValue.data;
                                            } else {
                                                i8 = android.support.v4.media.session.b.i(typedValue, l9, l22, string, "integer");
                                                dimension = typedValue.data;
                                            }
                                        } else {
                                            throw new XmlPullParserException("unsupported argument type " + typedValue.type);
                                        }
                                    } else {
                                        i8 = android.support.v4.media.session.b.i(typedValue, l9, l20, string, "boolean");
                                        if (typedValue.data != 0) {
                                            z9 = true;
                                        } else {
                                            z9 = false;
                                        }
                                        obj2 = Boolean.valueOf(z9);
                                        l9 = i8;
                                        obj = obj2;
                                    }
                                } else {
                                    i8 = android.support.v4.media.session.b.i(typedValue, l9, l22, string, "dimension");
                                    dimension = (int) typedValue.getDimension(resources.getDisplayMetrics());
                                }
                                obj2 = Integer.valueOf(dimension);
                                l9 = i8;
                                obj = obj2;
                            } else {
                                i8 = android.support.v4.media.session.b.i(typedValue, l9, l21, string, "float");
                                f = typedValue.getFloat();
                            }
                            obj2 = Float.valueOf(f);
                            l9 = i8;
                            obj = obj2;
                        } else {
                            String obj3 = typedValue.string.toString();
                            if (l9 == null) {
                                M5.g.f(obj3, "value");
                                try {
                                    l22.c(obj3);
                                    l9 = l22;
                                } catch (IllegalArgumentException unused) {
                                    l10 = l8;
                                    try {
                                        try {
                                            try {
                                                l10.c(obj3);
                                                l9 = l10;
                                            } catch (IllegalArgumentException unused2) {
                                                l20.c(obj3);
                                                l9 = l20;
                                            }
                                        } catch (IllegalArgumentException unused3) {
                                            l21.c(obj3);
                                            l9 = l21;
                                        }
                                    } catch (IllegalArgumentException unused4) {
                                        l9 = l19;
                                    }
                                }
                            }
                            l10 = l8;
                            obj = l9.c(obj3);
                        }
                    }
                    l10 = l8;
                }
            }
            l10 = l8;
            z8 = true;
        } else {
            cls = Serializable.class;
            z8 = true;
            l10 = l8;
            obj = null;
        }
        if (obj == null) {
            obj = null;
            z8 = false;
        }
        if (l9 != null) {
            l23 = l9;
        }
        if (l23 == null) {
            if (obj instanceof Integer) {
                l11 = l22;
            } else if (obj instanceof int[]) {
                l11 = l7;
            } else if (obj instanceof Long) {
                l11 = l10;
            } else if (obj instanceof long[]) {
                l11 = l16;
            } else if (obj instanceof Float) {
                l11 = l21;
            } else if (obj instanceof float[]) {
                l11 = l13;
            } else if (obj instanceof Boolean) {
                l11 = l20;
            } else if (obj instanceof boolean[]) {
                l11 = l15;
            } else if (!(obj instanceof String) && obj != null) {
                if ((obj instanceof Object[]) && (((Object[]) obj) instanceof String[])) {
                    l11 = l14;
                } else {
                    if (obj.getClass().isArray()) {
                        Class<?> componentType = obj.getClass().getComponentType();
                        M5.g.c(componentType);
                        if (Parcelable.class.isAssignableFrom(componentType)) {
                            Class<?> componentType2 = obj.getClass().getComponentType();
                            if (componentType2 != null) {
                                l11 = new C1006H(componentType2);
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<android.os.Parcelable>");
                            }
                        }
                    }
                    if (obj.getClass().isArray()) {
                        Class<?> componentType3 = obj.getClass().getComponentType();
                        M5.g.c(componentType3);
                        if (cls.isAssignableFrom(componentType3)) {
                            Class<?> componentType4 = obj.getClass().getComponentType();
                            if (componentType4 != null) {
                                l11 = new C1008J(componentType4);
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<java.io.Serializable>");
                            }
                        }
                    }
                    if (obj instanceof Parcelable) {
                        l11 = new C1007I(obj.getClass());
                    } else if (obj instanceof Enum) {
                        l11 = new C1005G(obj.getClass());
                    } else if (obj instanceof Serializable) {
                        l11 = new C1009K(obj.getClass());
                    } else {
                        throw new IllegalArgumentException("Object of type " + obj.getClass().getName() + " is not supported for navigation arguments.");
                    }
                }
            } else {
                l11 = l19;
            }
        } else {
            l11 = l23;
        }
        return new C1018i(l11, z7, obj, z8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0258, code lost:
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0108, code lost:
        throw new org.xmlpull.v1.XmlPullParserException("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final n0.v a(android.content.res.Resources r27, android.content.res.XmlResourceParser r28, android.util.AttributeSet r29, int r30) {
        /*
            Method dump skipped, instructions count: 601
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.C1000B.a(android.content.res.Resources, android.content.res.XmlResourceParser, android.util.AttributeSet, int):n0.v");
    }

    public final y b(int i7) {
        int next;
        Resources resources = this.f12481a.getResources();
        XmlResourceParser xml = resources.getXml(i7);
        M5.g.e(xml, "res.getXml(graphResId)");
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            try {
                try {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } catch (Exception e3) {
                    throw new RuntimeException("Exception inflating " + resources.getResourceName(i7) + " line " + xml.getLineNumber(), e3);
                }
            } finally {
                xml.close();
            }
        } while (next != 1);
        if (next == 2) {
            String name = xml.getName();
            M5.g.e(asAttributeSet, "attrs");
            v a7 = a(resources, xml, asAttributeSet, i7);
            if (a7 instanceof y) {
                return (y) a7;
            }
            throw new IllegalArgumentException(("Root element <" + name + "> did not inflate into a NavGraph").toString());
        }
        throw new XmlPullParserException("No start tag found");
    }
}
