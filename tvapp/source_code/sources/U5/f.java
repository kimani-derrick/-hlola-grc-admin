package U5;

import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.util.ArrayList;
import java.util.List;
import r0.AbstractC1111a;
import w4.l0;
/* loaded from: classes.dex */
public abstract class f extends n {
    public static String A0(String str, char c5) {
        M5.g.f(str, "<this>");
        M5.g.f(str, "missingDelimiterValue");
        int l02 = l0(str, c5, 0, 6);
        if (l02 != -1) {
            String substring = str.substring(0, l02);
            M5.g.e(substring, "substring(...)");
            return substring;
        }
        return str;
    }

    public static String B0(String str, int i7) {
        M5.g.f(str, "<this>");
        if (i7 >= 0) {
            int length = str.length();
            if (i7 > length) {
                i7 = length;
            }
            String substring = str.substring(0, i7);
            M5.g.e(substring, "substring(...)");
            return substring;
        }
        throw new IllegalArgumentException(AbstractC1111a.n(i7, "Requested character count ", " is less than zero.").toString());
    }

    public static CharSequence C0(CharSequence charSequence) {
        int i7;
        M5.g.f(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i8 = 0;
        boolean z7 = false;
        while (i8 <= length) {
            if (!z7) {
                i7 = i8;
            } else {
                i7 = length;
            }
            boolean y3 = l0.y(charSequence.charAt(i7));
            if (!z7) {
                if (!y3) {
                    z7 = true;
                } else {
                    i8++;
                }
            } else if (!y3) {
                break;
            } else {
                length--;
            }
        }
        return charSequence.subSequence(i8, length + 1);
    }

    public static boolean c0(CharSequence charSequence, char c5) {
        M5.g.f(charSequence, "<this>");
        if (i0(charSequence, c5, 0, false, 2) < 0) {
            return false;
        }
        return true;
    }

    public static boolean d0(CharSequence charSequence, String str) {
        M5.g.f(charSequence, "<this>");
        if (j0(charSequence, str, 0, false, 2) < 0) {
            return false;
        }
        return true;
    }

    public static boolean e0(String str, char c5) {
        if (str.length() <= 0 || !l0.n(str.charAt(f0(str)), c5, false)) {
            return false;
        }
        return true;
    }

    public static final int f0(CharSequence charSequence) {
        M5.g.f(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int g0(int i7, CharSequence charSequence, String str, boolean z7) {
        M5.g.f(charSequence, "<this>");
        M5.g.f(str, "string");
        if (!z7 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i7);
        }
        return h0(charSequence, str, i7, charSequence.length(), z7, false);
    }

    public static final int h0(CharSequence charSequence, CharSequence charSequence2, int i7, int i8, boolean z7, boolean z8) {
        R5.a aVar;
        if (!z8) {
            if (i7 < 0) {
                i7 = 0;
            }
            int length = charSequence.length();
            if (i8 > length) {
                i8 = length;
            }
            aVar = new R5.a(i7, i8, 1);
        } else {
            int f02 = f0(charSequence);
            if (i7 > f02) {
                i7 = f02;
            }
            if (i8 < 0) {
                i8 = 0;
            }
            aVar = new R5.a(i7, i8, -1);
        }
        boolean z9 = charSequence instanceof String;
        int i9 = aVar.f2924s;
        int i10 = aVar.f2923r;
        int i11 = aVar.f2922q;
        if (z9 && (charSequence2 instanceof String)) {
            if ((i9 > 0 && i11 <= i10) || (i9 < 0 && i10 <= i11)) {
                while (!n.Y(0, i11, ((String) charSequence2).length(), (String) charSequence2, (String) charSequence, z7)) {
                    if (i11 != i10) {
                        i11 += i9;
                    }
                }
                return i11;
            }
        } else if ((i9 > 0 && i11 <= i10) || (i9 < 0 && i10 <= i11)) {
            while (!p0(charSequence2, 0, charSequence, i11, charSequence2.length(), z7)) {
                if (i11 != i10) {
                    i11 += i9;
                }
            }
            return i11;
        }
        return -1;
    }

    public static int i0(CharSequence charSequence, char c5, int i7, boolean z7, int i8) {
        if ((i8 & 2) != 0) {
            i7 = 0;
        }
        if ((i8 & 4) != 0) {
            z7 = false;
        }
        M5.g.f(charSequence, "<this>");
        if (!z7 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c5, i7);
        }
        return k0(charSequence, new char[]{c5}, i7, z7);
    }

    public static /* synthetic */ int j0(CharSequence charSequence, String str, int i7, boolean z7, int i8) {
        if ((i8 & 2) != 0) {
            i7 = 0;
        }
        if ((i8 & 4) != 0) {
            z7 = false;
        }
        return g0(i7, charSequence, str, z7);
    }

    public static final int k0(CharSequence charSequence, char[] cArr, int i7, boolean z7) {
        M5.g.f(charSequence, "<this>");
        M5.g.f(cArr, "chars");
        if (!z7 && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(A5.j.Y(cArr), i7);
        }
        if (i7 < 0) {
            i7 = 0;
        }
        R5.b it = new R5.a(i7, f0(charSequence), 1).iterator();
        while (it.f2927s) {
            int a7 = it.a();
            char charAt = charSequence.charAt(a7);
            for (char c5 : cArr) {
                if (l0.n(c5, charAt, z7)) {
                    return a7;
                }
            }
        }
        return -1;
    }

    public static int l0(CharSequence charSequence, char c5, int i7, int i8) {
        if ((i8 & 2) != 0) {
            i7 = f0(charSequence);
        }
        M5.g.f(charSequence, "<this>");
        if (!(charSequence instanceof String)) {
            char[] cArr = {c5};
            if (charSequence instanceof String) {
                return ((String) charSequence).lastIndexOf(A5.j.Y(cArr), i7);
            }
            int f02 = f0(charSequence);
            if (i7 > f02) {
                i7 = f02;
            }
            while (-1 < i7) {
                if (l0.n(cArr[0], charSequence.charAt(i7), false)) {
                    return i7;
                }
                i7--;
            }
            return -1;
        }
        return ((String) charSequence).lastIndexOf(c5, i7);
    }

    public static int m0(CharSequence charSequence, String str, int i7) {
        int i8;
        if ((i7 & 2) != 0) {
            i8 = f0(charSequence);
        } else {
            i8 = 0;
        }
        int i9 = i8;
        M5.g.f(charSequence, "<this>");
        M5.g.f(str, "string");
        if (!(charSequence instanceof String)) {
            return h0(charSequence, str, i9, 0, false, true);
        }
        return ((String) charSequence).lastIndexOf(str, i9);
    }

    public static final List n0(CharSequence charSequence) {
        M5.g.f(charSequence, "<this>");
        return T5.j.L(new T5.f(2, new A5.a(2, charSequence), o0(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0)));
    }

    public static c o0(CharSequence charSequence, String[] strArr, boolean z7, int i7) {
        r0(i7);
        return new c(charSequence, 0, i7, new o(A5.j.M(strArr), z7, 1));
    }

    public static final boolean p0(CharSequence charSequence, int i7, CharSequence charSequence2, int i8, int i9, boolean z7) {
        M5.g.f(charSequence, "<this>");
        M5.g.f(charSequence2, "other");
        if (i8 < 0 || i7 < 0 || i7 > charSequence.length() - i9 || i8 > charSequence2.length() - i9) {
            return false;
        }
        for (int i10 = 0; i10 < i9; i10++) {
            if (!l0.n(charSequence.charAt(i7 + i10), charSequence2.charAt(i8 + i10), z7)) {
                return false;
            }
        }
        return true;
    }

    public static String q0(String str, String str2) {
        if (n.b0(str, str2, false)) {
            String substring = str.substring(str2.length());
            M5.g.e(substring, "substring(...)");
            return substring;
        }
        return str;
    }

    public static final void r0(int i7) {
        if (i7 >= 0) {
            return;
        }
        throw new IllegalArgumentException(AbstractC0515y1.l("Limit must be non-negative, but was ", i7).toString());
    }

    public static final List s0(int i7, CharSequence charSequence, String str, boolean z7) {
        boolean z8;
        r0(i7);
        int i8 = 0;
        int g02 = g0(0, charSequence, str, z7);
        if (g02 != -1 && i7 != 1) {
            if (i7 > 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            int i9 = 10;
            if (z8 && i7 <= 10) {
                i9 = i7;
            }
            ArrayList arrayList = new ArrayList(i9);
            do {
                arrayList.add(charSequence.subSequence(i8, g02).toString());
                i8 = str.length() + g02;
                if (z8 && arrayList.size() == i7 - 1) {
                    break;
                }
                g02 = g0(i8, charSequence, str, z7);
            } while (g02 != -1);
            arrayList.add(charSequence.subSequence(i8, charSequence.length()).toString());
            return arrayList;
        }
        return m3.g.z(charSequence.toString());
    }

    public static List t0(CharSequence charSequence, char[] cArr) {
        M5.g.f(charSequence, "<this>");
        if (cArr.length == 1) {
            return s0(0, charSequence, String.valueOf(cArr[0]), false);
        }
        r0(0);
        c<R5.c> cVar = new c(charSequence, 0, 0, new o(cArr, false, 0));
        ArrayList arrayList = new ArrayList(A5.m.P(new T5.l(cVar)));
        for (R5.c cVar2 : cVar) {
            arrayList.add(v0(charSequence, cVar2));
        }
        return arrayList;
    }

    public static List u0(CharSequence charSequence, String[] strArr) {
        M5.g.f(charSequence, "<this>");
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return s0(0, charSequence, str, false);
            }
        }
        c<R5.c> o02 = o0(charSequence, strArr, false, 0);
        ArrayList arrayList = new ArrayList(A5.m.P(new T5.l(o02)));
        for (R5.c cVar : o02) {
            arrayList.add(v0(charSequence, cVar));
        }
        return arrayList;
    }

    public static final String v0(CharSequence charSequence, R5.c cVar) {
        M5.g.f(charSequence, "<this>");
        M5.g.f(cVar, "range");
        return charSequence.subSequence(cVar.f2922q, cVar.f2923r + 1).toString();
    }

    public static String w0(String str, char c5) {
        int i02 = i0(str, c5, 0, false, 6);
        if (i02 != -1) {
            String substring = str.substring(i02 + 1, str.length());
            M5.g.e(substring, "substring(...)");
            return substring;
        }
        return str;
    }

    public static String x0(String str, String str2) {
        M5.g.f(str2, "delimiter");
        int j02 = j0(str, str2, 0, false, 6);
        if (j02 != -1) {
            String substring = str.substring(str2.length() + j02, str.length());
            M5.g.e(substring, "substring(...)");
            return substring;
        }
        return str;
    }

    public static String y0(String str, char c5, String str2) {
        M5.g.f(str, "<this>");
        M5.g.f(str2, "missingDelimiterValue");
        int l02 = l0(str, c5, 0, 6);
        if (l02 != -1) {
            String substring = str.substring(l02 + 1, str.length());
            M5.g.e(substring, "substring(...)");
            return substring;
        }
        return str2;
    }

    public static String z0(String str, char c5) {
        int i02 = i0(str, c5, 0, false, 6);
        if (i02 != -1) {
            String substring = str.substring(0, i02);
            M5.g.e(substring, "substring(...)");
            return substring;
        }
        return str;
    }
}
