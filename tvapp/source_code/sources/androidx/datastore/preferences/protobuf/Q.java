package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
/* loaded from: classes.dex */
public abstract class Q {

    /* renamed from: a  reason: collision with root package name */
    public static final e0 f5713a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final f0 f5714b = new Object();

    public static void a(byte b7, byte b8, byte b9, byte b10, char[] cArr, int i7) {
        if (!i(b8)) {
            if ((((b8 + 112) + (b7 << 28)) >> 30) == 0 && !i(b9) && !i(b10)) {
                int i8 = ((b7 & 7) << 18) | ((b8 & 63) << 12) | ((b9 & 63) << 6) | (b10 & 63);
                cArr[i7] = (char) ((i8 >>> 10) + 55232);
                cArr[i7 + 1] = (char) ((i8 & 1023) + 56320);
                return;
            }
        }
        throw B.a();
    }

    public static boolean b(byte b7) {
        return b7 >= 0;
    }

    public static void c(byte b7, byte b8, char[] cArr, int i7) {
        if (b7 >= -62 && !i(b8)) {
            cArr[i7] = (char) (((b7 & 31) << 6) | (b8 & 63));
            return;
        }
        throw B.a();
    }

    public static void d(byte b7, byte b8, byte b9, char[] cArr, int i7) {
        if (!i(b8) && ((b7 != -32 || b8 >= -96) && ((b7 != -19 || b8 < -96) && !i(b9)))) {
            cArr[i7] = (char) (((b7 & 15) << 12) | ((b8 & 63) << 6) | (b9 & 63));
            return;
        }
        throw B.a();
    }

    public static final String e(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i7 = 0; i7 < str.length(); i7++) {
            char charAt = str.charAt(i7);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    public static String h(C0228g c0228g) {
        String str;
        StringBuilder sb = new StringBuilder(c0228g.size());
        for (int i7 = 0; i7 < c0228g.size(); i7++) {
            int b7 = c0228g.b(i7);
            if (b7 != 34) {
                if (b7 != 39) {
                    if (b7 != 92) {
                        switch (b7) {
                            case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                                str = "\\a";
                                break;
                            case 8:
                                str = "\\b";
                                break;
                            case 9:
                                str = "\\t";
                                break;
                            case 10:
                                str = "\\n";
                                break;
                            case 11:
                                str = "\\v";
                                break;
                            case 12:
                                str = "\\f";
                                break;
                            case 13:
                                str = "\\r";
                                break;
                            default:
                                if (b7 < 32 || b7 > 126) {
                                    sb.append('\\');
                                    sb.append((char) (((b7 >>> 6) & 3) + 48));
                                    sb.append((char) (((b7 >>> 3) & 7) + 48));
                                    b7 = (b7 & 7) + 48;
                                }
                                sb.append((char) b7);
                                continue;
                                break;
                        }
                    } else {
                        str = "\\\\";
                    }
                } else {
                    str = "\\'";
                }
            } else {
                str = "\\\"";
            }
            sb.append(str);
        }
        return sb.toString();
    }

    public static boolean i(byte b7) {
        if (b7 > -65) {
            return true;
        }
        return false;
    }

    public static final void k(StringBuilder sb, int i7, String str, Object obj) {
        String h7;
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                k(sb, i7, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                k(sb, i7, str, entry);
            }
        } else {
            sb.append('\n');
            int i8 = 0;
            for (int i9 = 0; i9 < i7; i9++) {
                sb.append(' ');
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                C0228g c0228g = C0228g.f5760s;
                h7 = h(new C0228g(((String) obj).getBytes(AbstractC0246z.f5827a)));
            } else if (obj instanceof C0228g) {
                sb.append(": \"");
                h7 = h((C0228g) obj);
            } else {
                if (obj instanceof AbstractC0243w) {
                    sb.append(" {");
                    l((AbstractC0243w) obj, sb, i7 + 2);
                    sb.append("\n");
                    while (i8 < i7) {
                        sb.append(' ');
                        i8++;
                    }
                } else if (obj instanceof Map.Entry) {
                    sb.append(" {");
                    Map.Entry entry2 = (Map.Entry) obj;
                    int i10 = i7 + 2;
                    k(sb, i10, "key", entry2.getKey());
                    k(sb, i10, "value", entry2.getValue());
                    sb.append("\n");
                    while (i8 < i7) {
                        sb.append(' ');
                        i8++;
                    }
                } else {
                    sb.append(": ");
                    sb.append(obj.toString());
                    return;
                }
                sb.append("}");
                return;
            }
            sb.append(h7);
            sb.append('\"');
        }
    }

    public static void l(AbstractC0220a abstractC0220a, StringBuilder sb, int i7) {
        Method[] declaredMethods;
        boolean z7;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet treeSet = new TreeSet();
        for (Method method : abstractC0220a.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Object obj = "";
            String replaceFirst = str.replaceFirst("get", "");
            if (replaceFirst.endsWith("List") && !replaceFirst.endsWith("OrBuilderList") && !replaceFirst.equals("List")) {
                String str2 = replaceFirst.substring(0, 1).toLowerCase() + replaceFirst.substring(1, replaceFirst.length() - 4);
                Method method2 = (Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    k(sb, i7, e(str2), AbstractC0243w.f(abstractC0220a, method2, new Object[0]));
                }
            }
            if (replaceFirst.endsWith("Map") && !replaceFirst.equals("Map")) {
                String str3 = replaceFirst.substring(0, 1).toLowerCase() + replaceFirst.substring(1, replaceFirst.length() - 3);
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    k(sb, i7, e(str3), AbstractC0243w.f(abstractC0220a, method3, new Object[0]));
                }
            }
            if (((Method) hashMap2.get("set".concat(replaceFirst))) != null) {
                if (replaceFirst.endsWith("Bytes")) {
                    if (hashMap.containsKey("get" + replaceFirst.substring(0, replaceFirst.length() - 5))) {
                    }
                }
                String str4 = replaceFirst.substring(0, 1).toLowerCase() + replaceFirst.substring(1);
                Method method4 = (Method) hashMap.get("get".concat(replaceFirst));
                Method method5 = (Method) hashMap.get("has".concat(replaceFirst));
                if (method4 != null) {
                    Object f = AbstractC0243w.f(abstractC0220a, method4, new Object[0]);
                    if (method5 == null) {
                        if (f instanceof Boolean) {
                            z7 = !((Boolean) f).booleanValue();
                        } else if (f instanceof Integer) {
                            if (((Integer) f).intValue() != 0) {
                                k(sb, i7, e(str4), f);
                            }
                        } else if (f instanceof Float) {
                            if (((Float) f).floatValue() != 0.0f) {
                                k(sb, i7, e(str4), f);
                            }
                        } else if (f instanceof Double) {
                            if (((Double) f).doubleValue() != 0.0d) {
                                k(sb, i7, e(str4), f);
                            }
                        } else {
                            if (!(f instanceof String)) {
                                if (f instanceof C0228g) {
                                    obj = C0228g.f5760s;
                                } else if (f instanceof AbstractC0220a) {
                                    if (f != ((AbstractC0243w) ((AbstractC0243w) ((AbstractC0220a) f)).d(6))) {
                                        k(sb, i7, e(str4), f);
                                    }
                                } else {
                                    if ((f instanceof Enum) && ((Enum) f).ordinal() == 0) {
                                    }
                                    k(sb, i7, e(str4), f);
                                }
                            }
                            z7 = f.equals(obj);
                        }
                        if (!z7) {
                            k(sb, i7, e(str4), f);
                        }
                    } else if (((Boolean) AbstractC0243w.f(abstractC0220a, method5, new Object[0])).booleanValue()) {
                        k(sb, i7, e(str4), f);
                    }
                }
            }
        }
        j0 j0Var = ((AbstractC0243w) abstractC0220a).unknownFields;
        if (j0Var != null) {
            for (int i8 = 0; i8 < j0Var.f5787a; i8++) {
                k(sb, i7, String.valueOf(j0Var.f5788b[i8] >>> 3), j0Var.f5789c[i8]);
            }
        }
    }

    public abstract String f(byte[] bArr, int i7, int i8);

    public abstract int g(CharSequence charSequence, byte[] bArr, int i7, int i8);

    public abstract int j(byte[] bArr, int i7, int i8);

    public abstract void m(byte[] bArr, int i7, int i8);
}
