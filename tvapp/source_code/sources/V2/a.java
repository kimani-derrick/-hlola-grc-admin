package V2;

import Z2.y;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: c  reason: collision with root package name */
    public static final Pattern f3612c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    public static final Pattern d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* renamed from: a  reason: collision with root package name */
    public final y f3613a = new y();

    /* renamed from: b  reason: collision with root package name */
    public final StringBuilder f3614b = new StringBuilder();

    public static String a(y yVar, StringBuilder sb) {
        boolean z7 = false;
        sb.setLength(0);
        int i7 = yVar.f4692b;
        int i8 = yVar.f4693c;
        while (i7 < i8 && !z7) {
            char c5 = (char) yVar.f4691a[i7];
            if ((c5 < 'A' || c5 > 'Z') && ((c5 < 'a' || c5 > 'z') && ((c5 < '0' || c5 > '9') && c5 != '#' && c5 != '-' && c5 != '.' && c5 != '_'))) {
                z7 = true;
            } else {
                i7++;
                sb.append(c5);
            }
        }
        yVar.G(i7 - yVar.f4692b);
        return sb.toString();
    }

    public static String b(y yVar, StringBuilder sb) {
        c(yVar);
        if (yVar.a() == 0) {
            return null;
        }
        String a7 = a(yVar, sb);
        if (!"".equals(a7)) {
            return a7;
        }
        return "" + ((char) yVar.u());
    }

    public static void c(y yVar) {
        while (true) {
            for (boolean z7 = true; yVar.a() > 0 && z7; z7 = false) {
                int i7 = yVar.f4692b;
                byte[] bArr = yVar.f4691a;
                byte b7 = bArr[i7];
                char c5 = (char) b7;
                if (c5 != '\t' && c5 != '\n' && c5 != '\f' && c5 != '\r' && c5 != ' ') {
                    int i8 = yVar.f4693c;
                    int i9 = i7 + 2;
                    if (i9 <= i8) {
                        int i10 = i7 + 1;
                        if (b7 == 47 && bArr[i10] == 42) {
                            while (true) {
                                int i11 = i9 + 1;
                                if (i11 >= i8) {
                                    break;
                                } else if (((char) bArr[i9]) == '*' && ((char) bArr[i11]) == '/') {
                                    i9 += 2;
                                    i8 = i9;
                                } else {
                                    i9 = i11;
                                }
                            }
                            yVar.G(i8 - yVar.f4692b);
                        }
                    }
                } else {
                    yVar.G(1);
                }
            }
            return;
        }
    }
}
