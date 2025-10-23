package U5;

import java.util.Collection;
import java.util.Iterator;
import w4.l0;
/* loaded from: classes.dex */
public abstract class n extends m {
    public static boolean V(String str, String str2, boolean z7) {
        M5.g.f(str, "<this>");
        M5.g.f(str2, "suffix");
        if (!z7) {
            return str.endsWith(str2);
        }
        return Y(str.length() - str2.length(), 0, str2.length(), str, str2, true);
    }

    public static boolean W(String str, String str2) {
        if (str == null) {
            if (str2 == null) {
                return true;
            }
            return false;
        }
        return str.equalsIgnoreCase(str2);
    }

    public static boolean X(CharSequence charSequence) {
        M5.g.f(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return true;
        }
        R5.a aVar = new R5.a(0, charSequence.length() - 1, 1);
        if ((aVar instanceof Collection) && ((Collection) aVar).isEmpty()) {
            return true;
        }
        Iterator it = aVar.iterator();
        while (it.hasNext()) {
            if (!l0.y(charSequence.charAt(((R5.b) it).a()))) {
                return false;
            }
        }
        return true;
    }

    public static final boolean Y(int i7, int i8, int i9, String str, String str2, boolean z7) {
        M5.g.f(str, "<this>");
        M5.g.f(str2, "other");
        if (!z7) {
            return str.regionMatches(i7, str2, i8, i9);
        }
        return str.regionMatches(z7, i7, str2, i8, i9);
    }

    public static String Z(String str, String str2, String str3) {
        M5.g.f(str, "<this>");
        int g02 = f.g0(0, str, str2, false);
        if (g02 >= 0) {
            int length = str2.length();
            int i7 = 1;
            if (length >= 1) {
                i7 = length;
            }
            int length2 = str3.length() + (str.length() - length);
            if (length2 >= 0) {
                StringBuilder sb = new StringBuilder(length2);
                int i8 = 0;
                do {
                    sb.append((CharSequence) str, i8, g02);
                    sb.append(str3);
                    i8 = g02 + length;
                    if (g02 >= str.length()) {
                        break;
                    }
                    g02 = f.g0(g02 + i7, str, str2, false);
                } while (g02 > 0);
                sb.append((CharSequence) str, i8, str.length());
                String sb2 = sb.toString();
                M5.g.e(sb2, "toString(...)");
                return sb2;
            }
            throw new OutOfMemoryError();
        }
        return str;
    }

    public static boolean a0(int i7, String str, String str2, boolean z7) {
        M5.g.f(str, "<this>");
        if (!z7) {
            return str.startsWith(str2, i7);
        }
        return Y(i7, 0, str2.length(), str, str2, z7);
    }

    public static boolean b0(String str, String str2, boolean z7) {
        M5.g.f(str, "<this>");
        M5.g.f(str2, "prefix");
        if (!z7) {
            return str.startsWith(str2);
        }
        return Y(0, 0, str2.length(), str, str2, z7);
    }
}
