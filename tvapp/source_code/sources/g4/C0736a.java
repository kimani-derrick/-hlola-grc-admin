package g4;

import java.util.Arrays;
import m3.g;
/* renamed from: g4.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0736a {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f10837a;

    public C0736a(int i7, byte[] bArr) {
        byte[] bArr2 = new byte[i7];
        this.f10837a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i7);
    }

    public static C0736a a(byte[] bArr) {
        if (bArr != null) {
            return new C0736a(bArr.length, bArr);
        }
        throw new NullPointerException("data must be non-null");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0736a)) {
            return false;
        }
        return Arrays.equals(((C0736a) obj).f10837a, this.f10837a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f10837a);
    }

    public final String toString() {
        return "Bytes(" + g.k(this.f10837a) + ")";
    }
}
