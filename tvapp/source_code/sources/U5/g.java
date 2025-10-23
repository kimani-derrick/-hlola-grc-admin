package U5;

import a.AbstractC0189a;
import java.util.ArrayList;
import java.util.List;
import w4.l0;
/* loaded from: classes.dex */
public abstract class g extends AbstractC0189a {
    public static String S(String str) {
        M5.g.f(str, "<this>");
        if (!n.X("|")) {
            List n02 = f.n0(str);
            int length = str.length();
            n02.size();
            int K6 = A5.l.K(n02);
            ArrayList arrayList = new ArrayList();
            int i7 = 0;
            for (Object obj : n02) {
                int i8 = i7 + 1;
                String str2 = null;
                if (i7 >= 0) {
                    String str3 = (String) obj;
                    if ((i7 != 0 && i7 != K6) || !n.X(str3)) {
                        int length2 = str3.length();
                        int i9 = 0;
                        while (true) {
                            if (i9 < length2) {
                                if (!l0.y(str3.charAt(i9))) {
                                    break;
                                }
                                i9++;
                            } else {
                                i9 = -1;
                                break;
                            }
                        }
                        if (i9 != -1 && n.a0(i9, str3, "|", false)) {
                            str2 = str3.substring(i9 + 1);
                            M5.g.e(str2, "substring(...)");
                        }
                        if (str2 == null) {
                            str2 = str3;
                        }
                    }
                    if (str2 != null) {
                        arrayList.add(str2);
                    }
                    i7 = i8;
                } else {
                    A5.l.O();
                    throw null;
                }
            }
            StringBuilder sb = new StringBuilder(length);
            A5.k.Z(arrayList, sb);
            String sb2 = sb.toString();
            M5.g.e(sb2, "toString(...)");
            return sb2;
        }
        throw new IllegalArgumentException("marginPrefix must be non-blank string.".toString());
    }
}
