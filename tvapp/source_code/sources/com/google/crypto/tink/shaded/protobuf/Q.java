package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import k3.AbstractC0958a;
/* loaded from: classes.dex */
public abstract class Q {

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f9075a;

    static {
        char[] cArr = new char[80];
        f9075a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(int i7, StringBuilder sb) {
        while (i7 > 0) {
            int i8 = 80;
            if (i7 <= 80) {
                i8 = i7;
            }
            sb.append(f9075a, 0, i8);
            i7 -= i8;
        }
    }

    public static void b(StringBuilder sb, int i7, String str, Object obj) {
        String p3;
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                b(sb, i7, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                b(sb, i7, str, entry);
            }
        } else {
            sb.append('\n');
            a(i7, sb);
            if (!str.isEmpty()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Character.toLowerCase(str.charAt(0)));
                for (int i8 = 1; i8 < str.length(); i8++) {
                    char charAt = str.charAt(i8);
                    if (Character.isUpperCase(charAt)) {
                        sb2.append("_");
                    }
                    sb2.append(Character.toLowerCase(charAt));
                }
                str = sb2.toString();
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                C0529g c0529g = AbstractC0530h.f9118r;
                p3 = AbstractC0958a.p(new C0529g(((String) obj).getBytes(AbstractC0547z.f9165a)));
            } else if (obj instanceof AbstractC0530h) {
                sb.append(": \"");
                p3 = AbstractC0958a.p((AbstractC0530h) obj);
            } else {
                if (obj instanceof AbstractC0543v) {
                    sb.append(" {");
                    c((AbstractC0543v) obj, sb, i7 + 2);
                } else if (obj instanceof Map.Entry) {
                    sb.append(" {");
                    Map.Entry entry2 = (Map.Entry) obj;
                    int i9 = i7 + 2;
                    b(sb, i9, "key", entry2.getKey());
                    b(sb, i9, "value", entry2.getValue());
                } else {
                    sb.append(": ");
                    sb.append(obj);
                    return;
                }
                sb.append("\n");
                a(i7, sb);
                sb.append("}");
                return;
            }
            sb.append(p3);
            sb.append('\"');
        }
    }

    public static void c(AbstractC0523a abstractC0523a, StringBuilder sb, int i7) {
        int i8;
        Object obj;
        boolean equals;
        Method method;
        String substring;
        Object n;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = abstractC0523a.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i9 = 0;
        while (true) {
            i8 = 3;
            if (i9 >= length) {
                break;
            }
            Method method3 = declaredMethods[i9];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i9++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring2 = ((String) entry.getKey()).substring(i8);
            if (substring2.endsWith("List") && !substring2.endsWith("OrBuilderList") && !substring2.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                substring = substring2.substring(0, substring2.length() - 4);
                n = AbstractC0543v.n(abstractC0523a, method2, new Object[0]);
            } else if (substring2.endsWith("Map") && !substring2.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                substring = substring2.substring(0, substring2.length() - 3);
                n = AbstractC0543v.n(abstractC0523a, method, new Object[0]);
            } else {
                if (hashSet.contains("set".concat(substring2))) {
                    if (substring2.endsWith("Bytes")) {
                        if (treeMap.containsKey("get" + substring2.substring(0, substring2.length() - 5))) {
                        }
                    }
                    Method method4 = (Method) entry.getValue();
                    Method method5 = (Method) hashMap.get("has".concat(substring2));
                    if (method4 != null) {
                        Object n7 = AbstractC0543v.n(abstractC0523a, method4, new Object[0]);
                        if (method5 == null) {
                            if (n7 instanceof Boolean) {
                                equals = !((Boolean) n7).booleanValue();
                            } else if (n7 instanceof Integer) {
                                if (((Integer) n7).intValue() == 0) {
                                }
                                b(sb, i7, substring2, n7);
                            } else if (n7 instanceof Float) {
                                if (Float.floatToRawIntBits(((Float) n7).floatValue()) == 0) {
                                }
                                b(sb, i7, substring2, n7);
                            } else if (n7 instanceof Double) {
                                if (Double.doubleToRawLongBits(((Double) n7).doubleValue()) == 0) {
                                }
                                b(sb, i7, substring2, n7);
                            } else {
                                if (n7 instanceof String) {
                                    obj = "";
                                } else if (n7 instanceof AbstractC0530h) {
                                    obj = AbstractC0530h.f9118r;
                                } else if (n7 instanceof AbstractC0523a) {
                                    if (n7 == ((AbstractC0523a) n7).b()) {
                                    }
                                    b(sb, i7, substring2, n7);
                                } else {
                                    if ((n7 instanceof Enum) && ((Enum) n7).ordinal() == 0) {
                                    }
                                    b(sb, i7, substring2, n7);
                                }
                                equals = n7.equals(obj);
                            }
                            if (equals) {
                            }
                            b(sb, i7, substring2, n7);
                        } else {
                            if (!((Boolean) AbstractC0543v.n(abstractC0523a, method5, new Object[0])).booleanValue()) {
                            }
                            b(sb, i7, substring2, n7);
                        }
                    }
                }
                i8 = 3;
            }
            b(sb, i7, substring, n);
            i8 = 3;
        }
        e0 e0Var = ((AbstractC0543v) abstractC0523a).unknownFields;
        if (e0Var != null) {
            for (int i10 = 0; i10 < e0Var.f9110a; i10++) {
                b(sb, i7, String.valueOf(e0Var.f9111b[i10] >>> 3), e0Var.f9112c[i10]);
            }
        }
    }
}
