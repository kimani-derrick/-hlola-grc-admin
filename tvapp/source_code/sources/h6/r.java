package h6;

import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import z5.C1524f;
/* loaded from: classes.dex */
public final class r implements Iterable, N5.a {

    /* renamed from: q  reason: collision with root package name */
    public final String[] f11195q;

    public r(String[] strArr) {
        this.f11195q = strArr;
    }

    public final String b(String str) {
        M5.g.f(str, "name");
        String[] strArr = this.f11195q;
        int length = strArr.length - 2;
        int w7 = p6.l.w(length, 0, -2);
        if (w7 <= length) {
            while (true) {
                int i7 = length - 2;
                if (U5.n.W(str, strArr[length])) {
                    return strArr[length + 1];
                }
                if (length == w7) {
                    break;
                }
                length = i7;
            }
        }
        return null;
    }

    public final Date c(String str) {
        String b7 = b(str);
        if (b7 == null) {
            return null;
        }
        P5.b bVar = m6.b.f12444a;
        if (b7.length() == 0) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date parse = ((DateFormat) m6.b.f12444a.get()).parse(b7, parsePosition);
        if (parsePosition.getIndex() == b7.length()) {
            return parse;
        }
        String[] strArr = m6.b.f12445b;
        synchronized (strArr) {
            try {
                int length = strArr.length;
                int i7 = 0;
                while (i7 < length) {
                    int i8 = i7 + 1;
                    DateFormat[] dateFormatArr = m6.b.f12446c;
                    DateFormat dateFormat = dateFormatArr[i7];
                    if (dateFormat == null) {
                        dateFormat = new SimpleDateFormat(m6.b.f12445b[i7], Locale.US);
                        dateFormat.setTimeZone(i6.b.f11393e);
                        dateFormatArr[i7] = dateFormat;
                    }
                    parsePosition.setIndex(0);
                    Date parse2 = dateFormat.parse(b7, parsePosition);
                    if (parsePosition.getIndex() != 0) {
                        return parse2;
                    }
                    i7 = i8;
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            if (Arrays.equals(this.f11195q, ((r) obj).f11195q)) {
                return true;
            }
        }
        return false;
    }

    public final String f(int i7) {
        return this.f11195q[i7 * 2];
    }

    public final q g() {
        q qVar = new q(0);
        ArrayList arrayList = qVar.f11194a;
        M5.g.f(arrayList, "<this>");
        String[] strArr = this.f11195q;
        M5.g.f(strArr, "elements");
        arrayList.addAll(A5.j.M(strArr));
        return qVar;
    }

    public final String h(int i7) {
        return this.f11195q[(i7 * 2) + 1];
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f11195q);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        C1524f[] c1524fArr = new C1524f[size];
        for (int i7 = 0; i7 < size; i7++) {
            c1524fArr[i7] = new C1524f(f(i7), h(i7));
        }
        return new A5.b(c1524fArr);
    }

    public final int size() {
        return this.f11195q.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        int i7 = 0;
        while (i7 < size) {
            int i8 = i7 + 1;
            String f = f(i7);
            String h7 = h(i7);
            sb.append(f);
            sb.append(": ");
            if (i6.b.q(f)) {
                h7 = "██";
            }
            sb.append(h7);
            sb.append("\n");
            i7 = i8;
        }
        String sb2 = sb.toString();
        M5.g.e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
