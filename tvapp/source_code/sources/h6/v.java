package h6;

import java.nio.charset.Charset;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class v {
    public static final Pattern d = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: e  reason: collision with root package name */
    public static final Pattern f11212e = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a  reason: collision with root package name */
    public final String f11213a;

    /* renamed from: b  reason: collision with root package name */
    public final String f11214b;

    /* renamed from: c  reason: collision with root package name */
    public final String[] f11215c;

    public v(String str, String str2, String[] strArr) {
        this.f11213a = str;
        this.f11214b = str2;
        this.f11215c = strArr;
    }

    public final Charset a(Charset charset) {
        String str;
        String[] strArr = this.f11215c;
        int i7 = 0;
        int w7 = p6.l.w(0, strArr.length - 1, 2);
        if (w7 >= 0) {
            while (true) {
                int i8 = i7 + 2;
                if (U5.n.W(strArr[i7], "charset")) {
                    str = strArr[i7 + 1];
                    break;
                } else if (i7 == w7) {
                    break;
                } else {
                    i7 = i8;
                }
            }
        }
        str = null;
        if (str == null) {
            return charset;
        }
        try {
            return Charset.forName(str);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof v) && M5.g.a(((v) obj).f11213a, this.f11213a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f11213a.hashCode();
    }

    public final String toString() {
        return this.f11213a;
    }
}
