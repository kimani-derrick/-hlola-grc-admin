package U3;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f3432a = c(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});

    public static void a(int i7, int i8, int i9, int i10, int[] iArr) {
        int i11 = iArr[i7] + iArr[i8];
        iArr[i7] = i11;
        int i12 = i11 ^ iArr[i10];
        int i13 = (i12 >>> (-16)) | (i12 << 16);
        iArr[i10] = i13;
        int i14 = iArr[i9] + i13;
        iArr[i9] = i14;
        int i15 = iArr[i8] ^ i14;
        int i16 = (i15 >>> (-12)) | (i15 << 12);
        iArr[i8] = i16;
        int i17 = iArr[i7] + i16;
        iArr[i7] = i17;
        int i18 = iArr[i10] ^ i17;
        int i19 = (i18 >>> (-8)) | (i18 << 8);
        iArr[i10] = i19;
        int i20 = iArr[i9] + i19;
        iArr[i9] = i20;
        int i21 = iArr[i8] ^ i20;
        iArr[i8] = (i21 >>> (-7)) | (i21 << 7);
    }

    public static void b(int[] iArr) {
        for (int i7 = 0; i7 < 10; i7++) {
            a(0, 4, 8, 12, iArr);
            a(1, 5, 9, 13, iArr);
            a(2, 6, 10, 14, iArr);
            a(3, 7, 11, 15, iArr);
            a(0, 5, 10, 15, iArr);
            a(1, 6, 11, 12, iArr);
            a(2, 7, 8, 13, iArr);
            a(3, 4, 9, 14, iArr);
        }
    }

    public static int[] c(byte[] bArr) {
        IntBuffer asIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[asIntBuffer.remaining()];
        asIntBuffer.get(iArr);
        return iArr;
    }
}
