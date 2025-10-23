package H;

import O3.C0077v;
import O3.T;
import W2.n;
import W2.o;
import X2.C0125g;
import e2.K;
import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import w4.E;
import w4.i0;
import z4.C1517a;
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Comparator {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f772q;

    public /* synthetic */ b(int i7) {
        this.f772q = i7;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f772q) {
            case 0:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i7 = 0; i7 < bArr.length; i7++) {
                    byte b7 = bArr[i7];
                    byte b8 = bArr2[i7];
                    if (b7 != b8) {
                        return b7 - b8;
                    }
                }
                return 0;
            case 1:
                return Integer.compare(((N2.d) obj2).f2442b, ((N2.d) obj).f2442b);
            case 2:
                return Integer.compare(((V2.d) obj).f3633a.f3636b, ((V2.d) obj2).f3633a.f3636b);
            case 3:
                return Long.compare(((V2.c) obj).f3630b, ((V2.c) obj2).f3630b);
            case 4:
                return ((K) obj2).f9683x - ((K) obj).f9683x;
            case 5:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                if (num.intValue() == -1) {
                    if (num2.intValue() == -1) {
                        return 0;
                    }
                    return -1;
                } else if (num2.intValue() == -1) {
                    return 1;
                } else {
                    return num.intValue() - num2.intValue();
                }
            case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                Integer num3 = (Integer) obj;
                Integer num4 = (Integer) obj2;
                T t5 = o.f3864j;
                return 0;
            case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                List list = (List) obj;
                List list2 = (List) obj2;
                return C0077v.f(n.d((n) Collections.max(list, new b(10)), (n) Collections.max(list2, new b(10)))).a(list.size(), list2.size()).b((n) Collections.max(list, new b(11)), (n) Collections.max(list2, new b(11)), new b(11)).e();
            case 8:
                return ((W2.e) Collections.max((List) obj)).compareTo((W2.e) Collections.max((List) obj2));
            case 9:
                return ((W2.k) ((List) obj).get(0)).compareTo((W2.k) ((List) obj2).get(0));
            case 10:
                return n.d((n) obj, (n) obj2);
            case 11:
                return n.c((n) obj, (n) obj2);
            case 12:
                C0125g c0125g = (C0125g) obj;
                C0125g c0125g2 = (C0125g) obj2;
                int compare = Integer.compare(c0125g2.f4177b, c0125g.f4177b);
                if (compare == 0) {
                    int compareTo = c0125g.f4178c.compareTo(c0125g2.f4178c);
                    if (compareTo == 0) {
                        return c0125g.d.compareTo(c0125g2.d);
                    }
                    return compareTo;
                }
                return compare;
            case 13:
                C0125g c0125g3 = (C0125g) obj;
                C0125g c0125g4 = (C0125g) obj2;
                int compare2 = Integer.compare(c0125g4.f4176a, c0125g3.f4176a);
                if (compare2 == 0) {
                    int compareTo2 = c0125g4.f4178c.compareTo(c0125g3.f4178c);
                    if (compareTo2 == 0) {
                        return c0125g4.d.compareTo(c0125g3.d);
                    }
                    return compareTo2;
                }
                return compare2;
            case 14:
                return ((Y2.T) obj).f4355a - ((Y2.T) obj2).f4355a;
            case 15:
                return Float.compare(((Y2.T) obj).f4357c, ((Y2.T) obj2).f4357c);
            case 16:
                return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
            case 17:
                return ((E) ((i0) obj)).f15890a.compareTo(((E) ((i0) obj2)).f15890a);
            case 18:
                return ((File) obj2).getName().compareTo(((File) obj).getName());
            default:
                String name = ((File) obj).getName();
                int i8 = C1517a.f;
                return name.substring(0, i8).compareTo(((File) obj2).getName().substring(0, i8));
        }
    }
}
