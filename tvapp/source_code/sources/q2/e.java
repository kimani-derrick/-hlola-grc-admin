package q2;

import k2.C0943h;
/* loaded from: classes.dex */
public final class e {
    public static final long[] d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f13385a = new byte[8];

    /* renamed from: b  reason: collision with root package name */
    public int f13386b;

    /* renamed from: c  reason: collision with root package name */
    public int f13387c;

    public static long a(int i7, boolean z7, byte[] bArr) {
        long j7 = bArr[0] & 255;
        if (z7) {
            j7 &= ~d[i7 - 1];
        }
        for (int i8 = 1; i8 < i7; i8++) {
            j7 = (j7 << 8) | (bArr[i8] & 255);
        }
        return j7;
    }

    public static int b(int i7) {
        int i8 = 0;
        while (i8 < 8) {
            int i9 = ((d[i8] & i7) > 0L ? 1 : ((d[i8] & i7) == 0L ? 0 : -1));
            i8++;
            if (i9 != 0) {
                return i8;
            }
        }
        return -1;
    }

    public final long c(C0943h c0943h, boolean z7, boolean z8, int i7) {
        int i8 = this.f13386b;
        byte[] bArr = this.f13385a;
        if (i8 == 0) {
            if (!c0943h.e(bArr, 0, 1, z7)) {
                return -1L;
            }
            int b7 = b(bArr[0] & 255);
            this.f13387c = b7;
            if (b7 != -1) {
                this.f13386b = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i9 = this.f13387c;
        if (i9 > i7) {
            this.f13386b = 0;
            return -2L;
        }
        if (i9 != 1) {
            c0943h.e(bArr, 1, i9 - 1, false);
        }
        this.f13386b = 0;
        return a(this.f13387c, z8, bArr);
    }
}
