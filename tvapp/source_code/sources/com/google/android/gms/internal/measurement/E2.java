package com.google.android.gms.internal.measurement;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
/* loaded from: classes.dex */
public abstract class E2 {

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f8263a;

    static {
        char[] cArr = new char[80];
        f8263a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(int i7, StringBuilder sb) {
        while (i7 > 0) {
            int i8 = 80;
            if (i7 <= 80) {
                i8 = i7;
            }
            sb.append(f8263a, 0, i8);
            i7 -= i8;
        }
    }

    public static void b(V1 v12, StringBuilder sb, int i7) {
        int i8;
        Object obj;
        Method method;
        String substring;
        Object h7;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = v12.getClass().getDeclaredMethods();
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
                h7 = AbstractC0457m2.h(v12, method2, new Object[0]);
            } else if (substring2.endsWith("Map") && !substring2.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                substring = substring2.substring(0, substring2.length() - 3);
                h7 = AbstractC0457m2.h(v12, method, new Object[0]);
            } else {
                if (hashSet.contains("set".concat(substring2))) {
                    if (substring2.endsWith("Bytes")) {
                        if (treeMap.containsKey("get" + substring2.substring(0, substring2.length() - 5))) {
                        }
                    }
                    Method method4 = (Method) entry.getValue();
                    Method method5 = (Method) hashMap.get("has".concat(substring2));
                    if (method4 != null) {
                        Object h8 = AbstractC0457m2.h(v12, method4, new Object[0]);
                        if (method5 == null) {
                            if (h8 instanceof Boolean) {
                                if (!((Boolean) h8).booleanValue()) {
                                }
                                c(sb, i7, substring2, h8);
                            } else if (h8 instanceof Integer) {
                                if (((Integer) h8).intValue() == 0) {
                                }
                                c(sb, i7, substring2, h8);
                            } else if (h8 instanceof Float) {
                                if (Float.floatToRawIntBits(((Float) h8).floatValue()) == 0) {
                                }
                                c(sb, i7, substring2, h8);
                            } else if (h8 instanceof Double) {
                                if (Double.doubleToRawLongBits(((Double) h8).doubleValue()) == 0) {
                                }
                                c(sb, i7, substring2, h8);
                            } else {
                                if (h8 instanceof String) {
                                    obj = "";
                                } else if (h8 instanceof C0407c2) {
                                    obj = C0407c2.f8526s;
                                } else if (h8 instanceof V1) {
                                    if (h8 == ((AbstractC0457m2) ((AbstractC0457m2) ((V1) h8)).g(6))) {
                                    }
                                    c(sb, i7, substring2, h8);
                                } else {
                                    if ((h8 instanceof Enum) && ((Enum) h8).ordinal() == 0) {
                                    }
                                    c(sb, i7, substring2, h8);
                                }
                                if (h8.equals(obj)) {
                                }
                                c(sb, i7, substring2, h8);
                            }
                        } else {
                            if (!((Boolean) AbstractC0457m2.h(v12, method5, new Object[0])).booleanValue()) {
                            }
                            c(sb, i7, substring2, h8);
                        }
                    }
                }
                i8 = 3;
            }
            c(sb, i7, substring, h7);
            i8 = 3;
        }
        M2 m22 = ((AbstractC0457m2) v12).zzb;
        if (m22 != null) {
            for (int i10 = 0; i10 < m22.f8376a; i10++) {
                c(sb, i7, String.valueOf(m22.f8377b[i10] >>> 3), m22.f8378c[i10]);
            }
        }
    }

    public static void c(StringBuilder sb, int i7, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                c(sb, i7, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                c(sb, i7, str, entry);
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
                C0407c2 c0407c2 = C0407c2.f8526s;
                sb.append(M1.l(new C0407c2(((String) obj).getBytes(AbstractC0467o2.f8631a))));
                sb.append('\"');
            } else if (obj instanceof C0407c2) {
                sb.append(": \"");
                sb.append(M1.l((C0407c2) obj));
                sb.append('\"');
            } else if (obj instanceof AbstractC0457m2) {
                sb.append(" {");
                b((AbstractC0457m2) obj, sb, i7 + 2);
                sb.append("\n");
                a(i7, sb);
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry2 = (Map.Entry) obj;
                int i9 = i7 + 2;
                c(sb, i9, "key", entry2.getKey());
                c(sb, i9, "value", entry2.getValue());
                sb.append("\n");
                a(i7, sb);
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj);
            }
        }
    }
}
