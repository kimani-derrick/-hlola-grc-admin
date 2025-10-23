package A5;

import a.AbstractC0189a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import k3.AbstractC0958a;
/* loaded from: classes.dex */
public abstract class j extends AbstractC0958a {
    public static List M(Object[] objArr) {
        M5.g.f(objArr, "<this>");
        List asList = Arrays.asList(objArr);
        M5.g.e(asList, "asList(...)");
        return asList;
    }

    public static boolean N(Object[] objArr, Object obj) {
        int i7;
        M5.g.f(objArr, "<this>");
        if (obj == null) {
            int length = objArr.length;
            i7 = 0;
            while (i7 < length) {
                if (objArr[i7] != null) {
                    i7++;
                }
            }
            return false;
        }
        int length2 = objArr.length;
        for (int i8 = 0; i8 < length2; i8++) {
            if (M5.g.a(obj, objArr[i8])) {
                i7 = i8;
            }
        }
        return false;
        if (i7 < 0) {
            return false;
        }
        return true;
    }

    public static void O(int i7, int i8, int i9, byte[] bArr, byte[] bArr2) {
        M5.g.f(bArr, "<this>");
        M5.g.f(bArr2, "destination");
        System.arraycopy(bArr, i8, bArr2, i7, i9 - i8);
    }

    public static void P(int i7, int i8, int i9, int[] iArr, int[] iArr2) {
        M5.g.f(iArr, "<this>");
        M5.g.f(iArr2, "destination");
        System.arraycopy(iArr, i8, iArr2, i7, i9 - i8);
    }

    public static void Q(int i7, int i8, int i9, Object[] objArr, Object[] objArr2) {
        M5.g.f(objArr, "<this>");
        M5.g.f(objArr2, "destination");
        System.arraycopy(objArr, i8, objArr2, i7, i9 - i8);
    }

    public static /* synthetic */ void R(int i7, int i8, int i9, Object[] objArr, Object[] objArr2) {
        if ((i9 & 4) != 0) {
            i7 = 0;
        }
        Q(0, i7, i8, objArr, objArr2);
    }

    public static byte[] S(byte[] bArr, int i7, int i8) {
        M5.g.f(bArr, "<this>");
        AbstractC0958a.j(i8, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i7, i8);
        M5.g.e(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    public static Object[] T(Object[] objArr, int i7, int i8) {
        M5.g.f(objArr, "<this>");
        AbstractC0958a.j(i8, objArr.length);
        Object[] copyOfRange = Arrays.copyOfRange(objArr, i7, i8);
        M5.g.e(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    public static void U(Object[] objArr, int i7, int i8) {
        M5.g.f(objArr, "<this>");
        Arrays.fill(objArr, i7, i8, (Object) null);
    }

    public static ArrayList W(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static String X(Object[] objArr) {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i7 = 0;
        for (Object obj : objArr) {
            i7++;
            if (i7 > 1) {
                sb.append((CharSequence) ", ");
            }
            AbstractC0189a.b(sb, obj, null);
        }
        sb.append((CharSequence) "");
        String sb2 = sb.toString();
        M5.g.e(sb2, "toString(...)");
        return sb2;
    }

    public static char Y(char[] cArr) {
        M5.g.f(cArr, "<this>");
        int length = cArr.length;
        if (length != 0) {
            if (length == 1) {
                return cArr[0];
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static List Z(Object[] objArr) {
        int length = objArr.length;
        if (length != 0) {
            if (length != 1) {
                return new ArrayList(new h(objArr, false));
            }
            return m3.g.z(objArr[0]);
        }
        return t.f135q;
    }
}
