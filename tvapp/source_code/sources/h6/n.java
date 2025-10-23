package h6;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import w4.l0;
/* loaded from: classes.dex */
public final class n implements InterfaceC0752b {

    /* renamed from: q  reason: collision with root package name */
    public static final n f11185q = new Object();

    /* renamed from: r  reason: collision with root package name */
    public static final n f11186r = new Object();

    /* renamed from: s  reason: collision with root package name */
    public static final n f11187s = new Object();

    public static final C0760j a(n nVar, String str) {
        C0760j c0760j = new C0760j(str);
        C0760j.d.put(str, c0760j);
        return c0760j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [v6.f] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, v6.f] */
    public static String b(String str, int i7, int i8, String str2, boolean z7, boolean z8, boolean z9, boolean z10, int i9) {
        int i10;
        int i11;
        boolean z11;
        boolean z12;
        boolean z13;
        String str3;
        boolean z14 = false;
        if ((i9 & 1) != 0) {
            i10 = 0;
        } else {
            i10 = i7;
        }
        if ((i9 & 2) != 0) {
            i11 = str.length();
        } else {
            i11 = i8;
        }
        if ((i9 & 8) != 0) {
            z11 = false;
        } else {
            z11 = z7;
        }
        if ((i9 & 16) != 0) {
            z12 = false;
        } else {
            z12 = z8;
        }
        if ((i9 & 32) != 0) {
            z13 = false;
        } else {
            z13 = z9;
        }
        if ((i9 & 64) == 0) {
            z14 = z10;
        }
        M5.g.f(str, "<this>");
        int i12 = i10;
        while (i12 < i11) {
            int codePointAt = str.codePointAt(i12);
            int i13 = 32;
            int i14 = 128;
            if (codePointAt >= 32 && codePointAt != 127 && ((codePointAt < 128 || z14) && !U5.f.c0(str2, (char) codePointAt) && ((codePointAt != 37 || (z11 && (!z12 || d(i12, i11, str)))) && (codePointAt != 43 || !z13)))) {
                i12 += Character.charCount(codePointAt);
            } else {
                ?? obj = new Object();
                obj.n0(i10, i12, str);
                ?? r22 = 0;
                while (i12 < i11) {
                    int codePointAt2 = str.codePointAt(i12);
                    if (!z11 || (codePointAt2 != 9 && codePointAt2 != 10 && codePointAt2 != 12 && codePointAt2 != 13)) {
                        if (codePointAt2 == 43 && z13) {
                            if (z11) {
                                str3 = "+";
                            } else {
                                str3 = "%2B";
                            }
                            obj.o0(str3);
                        } else if (codePointAt2 >= i13 && codePointAt2 != 127 && ((codePointAt2 < i14 || z14) && !U5.f.c0(str2, (char) codePointAt2) && (codePointAt2 != 37 || (z11 && (!z12 || d(i12, i11, str)))))) {
                            obj.p0(codePointAt2);
                        } else {
                            if (r22 == 0) {
                                r22 = new Object();
                            }
                            r22.p0(codePointAt2);
                            while (!r22.M()) {
                                byte readByte = r22.readByte();
                                obj.i0(37);
                                char[] cArr = t.f11203k;
                                obj.i0(cArr[((readByte & 255) >> 4) & 15]);
                                obj.i0(cArr[readByte & 15]);
                            }
                        }
                    }
                    i12 += Character.charCount(codePointAt2);
                    i13 = 32;
                    i14 = 128;
                    r22 = r22;
                }
                return obj.b0();
            }
        }
        String substring = str.substring(i10, i11);
        M5.g.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static boolean d(int i7, int i8, String str) {
        int i9 = i7 + 2;
        if (i9 < i8 && str.charAt(i7) == '%' && i6.b.r(str.charAt(i7 + 1)) != -1 && i6.b.r(str.charAt(i9)) != -1) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, v6.f] */
    public static String f(String str, int i7, int i8, boolean z7, int i9) {
        int i10;
        if ((i9 & 1) != 0) {
            i7 = 0;
        }
        if ((i9 & 2) != 0) {
            i8 = str.length();
        }
        if ((i9 & 4) != 0) {
            z7 = false;
        }
        M5.g.f(str, "<this>");
        int i11 = i7;
        while (i11 < i8) {
            int i12 = i11 + 1;
            char charAt = str.charAt(i11);
            if (charAt != '%' && (charAt != '+' || !z7)) {
                i11 = i12;
            } else {
                ?? obj = new Object();
                obj.n0(i7, i11, str);
                while (i11 < i8) {
                    int codePointAt = str.codePointAt(i11);
                    if (codePointAt == 37 && (i10 = i11 + 2) < i8) {
                        int r3 = i6.b.r(str.charAt(i11 + 1));
                        int r5 = i6.b.r(str.charAt(i10));
                        if (r3 != -1 && r5 != -1) {
                            obj.i0((r3 << 4) + r5);
                            i11 = Character.charCount(codePointAt) + i10;
                        }
                        obj.p0(codePointAt);
                        i11 += Character.charCount(codePointAt);
                    } else {
                        if (codePointAt == 43 && z7) {
                            obj.i0(32);
                            i11++;
                        }
                        obj.p0(codePointAt);
                        i11 += Character.charCount(codePointAt);
                    }
                }
                return obj.b0();
            }
        }
        String substring = str.substring(i7, i8);
        M5.g.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static ArrayList g(String str) {
        String str2;
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        while (i7 <= str.length()) {
            int i02 = U5.f.i0(str, '&', i7, false, 4);
            if (i02 == -1) {
                i02 = str.length();
            }
            int i03 = U5.f.i0(str, '=', i7, false, 4);
            if (i03 != -1 && i03 <= i02) {
                String substring = str.substring(i7, i03);
                M5.g.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(substring);
                str2 = str.substring(i03 + 1, i02);
                M5.g.e(str2, "this as java.lang.String…ing(startIndex, endIndex)");
            } else {
                String substring2 = str.substring(i7, i02);
                M5.g.e(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(substring2);
                str2 = null;
            }
            arrayList.add(str2);
            i7 = i02 + 1;
        }
        return arrayList;
    }

    public static void h(List list, StringBuilder sb) {
        M5.g.f(list, "<this>");
        R5.a V6 = l0.V(l0.W(0, list.size()), 2);
        int i7 = V6.f2922q;
        int i8 = V6.f2923r;
        int i9 = V6.f2924s;
        if ((i9 <= 0 || i7 > i8) && (i9 >= 0 || i8 > i7)) {
            return;
        }
        while (true) {
            int i10 = i7 + i9;
            String str = (String) list.get(i7);
            String str2 = (String) list.get(i7 + 1);
            if (i7 > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
            if (i7 != i8) {
                i7 = i10;
            } else {
                return;
            }
        }
    }

    public synchronized C0760j c(String str) {
        C0760j c0760j;
        String str2;
        try {
            M5.g.f(str, "javaName");
            LinkedHashMap linkedHashMap = C0760j.d;
            c0760j = (C0760j) linkedHashMap.get(str);
            if (c0760j == null) {
                if (U5.n.b0(str, "TLS_", false)) {
                    String substring = str.substring(4);
                    M5.g.e(substring, "this as java.lang.String).substring(startIndex)");
                    str2 = M5.g.k(substring, "SSL_");
                } else if (U5.n.b0(str, "SSL_", false)) {
                    String substring2 = str.substring(4);
                    M5.g.e(substring2, "this as java.lang.String).substring(startIndex)");
                    str2 = M5.g.k(substring2, "TLS_");
                } else {
                    str2 = str;
                }
                c0760j = (C0760j) linkedHashMap.get(str2);
                if (c0760j == null) {
                    c0760j = new C0760j(str);
                }
                linkedHashMap.put(str, c0760j);
            }
        } catch (Throwable th) {
            throw th;
        }
        return c0760j;
    }

    public List e(String str) {
        M5.g.f(str, "hostname");
        try {
            InetAddress[] allByName = InetAddress.getAllByName(str);
            M5.g.e(allByName, "getAllByName(hostname)");
            return A5.j.Z(allByName);
        } catch (NullPointerException e3) {
            UnknownHostException unknownHostException = new UnknownHostException(M5.g.k(str, "Broken system behaviour for dns lookup of "));
            unknownHostException.initCause(e3);
            throw unknownHostException;
        }
    }

    @Override // h6.InterfaceC0752b
    public B i(J j7, G g7) {
        M5.g.f(g7, "response");
        return null;
    }
}
