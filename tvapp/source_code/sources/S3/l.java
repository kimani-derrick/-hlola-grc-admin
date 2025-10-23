package S3;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class l implements Comparable {

    /* renamed from: q  reason: collision with root package name */
    public final byte[] f3155q;

    public l(byte[] bArr) {
        this.f3155q = Arrays.copyOf(bArr, bArr.length);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        l lVar = (l) obj;
        byte[] bArr = this.f3155q;
        int length = bArr.length;
        byte[] bArr2 = lVar.f3155q;
        if (length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i7 = 0; i7 < bArr.length; i7++) {
            byte b7 = bArr[i7];
            byte b8 = lVar.f3155q[i7];
            if (b7 != b8) {
                return b7 - b8;
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        return Arrays.equals(this.f3155q, ((l) obj).f3155q);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f3155q);
    }

    public final String toString() {
        return m3.g.k(this.f3155q);
    }
}
