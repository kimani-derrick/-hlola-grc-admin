package i5;

import M5.g;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final int f11381a;

    /* renamed from: b  reason: collision with root package name */
    public int f11382b;

    /* renamed from: c  reason: collision with root package name */
    public int f11383c = -1;
    public int d = -1;

    /* renamed from: e  reason: collision with root package name */
    public int f11384e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public int f11385g;

    /* renamed from: h  reason: collision with root package name */
    public final int[] f11386h;

    /* renamed from: i  reason: collision with root package name */
    public final int[] f11387i;

    public b(int i7, int i8) {
        this.f11381a = i7;
        this.f11382b = i8;
        int[] iArr = new int[i7];
        for (int i9 = 0; i9 < i7; i9++) {
            iArr[i9] = -1;
        }
        this.f11386h = iArr;
        int i10 = this.f11381a + 1;
        int[] iArr2 = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            iArr2[i11] = 0;
        }
        this.f11387i = iArr2;
        d(this.f11382b);
    }

    public final void a(b bVar) {
        g.f(bVar, "row");
        this.f11383c = bVar.f11383c;
        this.d = bVar.d;
        this.f11384e = bVar.f11384e;
        this.f = bVar.f;
        this.f11385g = bVar.f11385g;
        int i7 = 0;
        while (true) {
            int[] iArr = this.f11387i;
            int[] iArr2 = bVar.f11387i;
            int i8 = this.f11381a;
            if (i7 < i8) {
                this.f11386h[i7] = bVar.f11386h[i7];
                iArr[i7] = iArr2[i7];
                i7++;
            } else {
                iArr[i8] = iArr2[i8];
                return;
            }
        }
    }

    public final int b(int i7, int i8, boolean z7) {
        int[] iArr = this.f11387i;
        if (!z7) {
            return iArr[i8 + i7] - iArr[i7];
        }
        int i9 = this.f11381a;
        return iArr[i9 - i7] - iArr[(i9 - i7) - i8];
    }

    public final void c(int i7) {
        this.f = i7;
        this.f11385g = i7;
        for (int i8 = 0; i8 < this.f11381a; i8++) {
            this.f11386h[i8] = -1;
        }
        this.f11384e = 0;
        this.f11383c = -1;
        this.d = -1;
    }

    public final void d(int i7) {
        int i8;
        this.f11382b = i7;
        int[] iArr = this.f11387i;
        int i9 = 0;
        iArr[0] = 0;
        int i10 = this.f11381a;
        int i11 = i7 / i10;
        int i12 = i7 % i10;
        if (1 <= i10) {
            int i13 = 1;
            int i14 = 0;
            while (true) {
                i9 += i12;
                if (i9 > 0 && i10 - i9 < i12) {
                    i8 = i11 + 1;
                    i9 -= i10;
                } else {
                    i8 = i11;
                }
                i14 += i8;
                iArr[i13] = i14;
                if (i13 != i10) {
                    i13++;
                } else {
                    return;
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        int i7 = bVar.f11381a;
        int i8 = this.f11381a;
        if (i8 != i7 || this.f11382b != bVar.f11382b) {
            return false;
        }
        for (int i9 = 0; i9 < i8; i9++) {
            if (this.f11386h[i9] != bVar.f11386h[i9]) {
                return false;
            }
        }
        if (this.f11383c != bVar.f11383c || this.d != bVar.d || this.f != bVar.f || this.f11384e != bVar.f11384e) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f11386h) + (((((((((((this.f11381a * 31) + this.f11382b) * 31) + this.f11383c) * 31) + this.d) * 31) + this.f11384e) * 31) + this.f) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GridRow(startIndex=");
        sb.append(this.f11383c);
        sb.append(", endIndex=");
        sb.append(this.d);
        sb.append(", height=");
        sb.append(this.f11384e);
        sb.append(", startOffset=");
        sb.append(this.f);
        sb.append(", endOffset=");
        sb.append(this.f11385g);
        sb.append(", positions=");
        String arrays = Arrays.toString(this.f11386h);
        g.e(arrays, "toString(...)");
        sb.append(arrays);
        sb.append(')');
        return sb.toString();
    }
}
