package H2;

import java.util.Arrays;
import java.util.Random;
/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a  reason: collision with root package name */
    public final Random f1063a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f1064b;

    /* renamed from: c  reason: collision with root package name */
    public final int[] f1065c;

    public g0() {
        this(new Random());
    }

    public final g0 a(int i7) {
        int[] iArr;
        Random random;
        int[] iArr2 = new int[i7];
        int[] iArr3 = new int[i7];
        int i8 = 0;
        while (true) {
            iArr = this.f1064b;
            random = this.f1063a;
            if (i8 >= i7) {
                break;
            }
            iArr2[i8] = random.nextInt(iArr.length + 1);
            int i9 = i8 + 1;
            int nextInt = random.nextInt(i9);
            iArr3[i8] = iArr3[nextInt];
            iArr3[nextInt] = i8;
            i8 = i9;
        }
        Arrays.sort(iArr2);
        int[] iArr4 = new int[iArr.length + i7];
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < iArr.length + i7; i12++) {
            if (i10 < i7 && i11 == iArr2[i10]) {
                iArr4[i12] = iArr3[i10];
                i10++;
            } else {
                int i13 = i11 + 1;
                int i14 = iArr[i11];
                iArr4[i12] = i14;
                if (i14 >= 0) {
                    iArr4[i12] = i14 + i7;
                }
                i11 = i13;
            }
        }
        return new g0(iArr4, new Random(random.nextLong()));
    }

    public g0(Random random) {
        this(new int[0], random);
    }

    public g0(int[] iArr, Random random) {
        this.f1064b = iArr;
        this.f1063a = random;
        this.f1065c = new int[iArr.length];
        for (int i7 = 0; i7 < iArr.length; i7++) {
            this.f1065c[iArr[i7]] = i7;
        }
    }
}
