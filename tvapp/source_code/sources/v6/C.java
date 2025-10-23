package v6;

import a.AbstractC0189a;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.security.MessageDigest;
import r0.AbstractC1111a;
/* loaded from: classes.dex */
public final class C extends C1344i {

    /* renamed from: u  reason: collision with root package name */
    public final transient byte[][] f15362u;

    /* renamed from: v  reason: collision with root package name */
    public final transient int[] f15363v;

    public C(byte[][] bArr, int[] iArr) {
        super(C1344i.f15389t.f15390q);
        this.f15362u = bArr;
        this.f15363v = iArr;
    }

    @Override // v6.C1344i
    public final String a() {
        return t().a();
    }

    @Override // v6.C1344i
    public final C1344i c(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        byte[][] bArr = this.f15362u;
        int length = bArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            int[] iArr = this.f15363v;
            int i9 = iArr[length + i7];
            int i10 = iArr[i7];
            messageDigest.update(bArr[i7], i9, i10 - i8);
            i7++;
            i8 = i10;
        }
        byte[] digest = messageDigest.digest();
        M5.g.e(digest, "digestBytes");
        return new C1344i(digest);
    }

    @Override // v6.C1344i
    public final int d() {
        return this.f15363v[this.f15362u.length - 1];
    }

    @Override // v6.C1344i
    public final String e() {
        return t().e();
    }

    @Override // v6.C1344i
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1344i) {
            C1344i c1344i = (C1344i) obj;
            if (c1344i.d() == d() && m(0, c1344i, d())) {
                return true;
            }
        }
        return false;
    }

    @Override // v6.C1344i
    public final int f(int i7, byte[] bArr) {
        M5.g.f(bArr, "other");
        return t().f(i7, bArr);
    }

    @Override // v6.C1344i
    public final byte[] h() {
        return s();
    }

    @Override // v6.C1344i
    public final int hashCode() {
        int i7 = this.f15391r;
        if (i7 == 0) {
            byte[][] bArr = this.f15362u;
            int length = bArr.length;
            int i8 = 0;
            int i9 = 1;
            int i10 = 0;
            while (i8 < length) {
                int[] iArr = this.f15363v;
                int i11 = iArr[length + i8];
                int i12 = iArr[i8];
                byte[] bArr2 = bArr[i8];
                int i13 = (i12 - i10) + i11;
                while (i11 < i13) {
                    i9 = (i9 * 31) + bArr2[i11];
                    i11++;
                }
                i8++;
                i10 = i12;
            }
            this.f15391r = i9;
            return i9;
        }
        return i7;
    }

    @Override // v6.C1344i
    public final byte i(int i7) {
        int i8;
        byte[][] bArr = this.f15362u;
        int[] iArr = this.f15363v;
        AbstractC0189a.m(iArr[bArr.length - 1], i7, 1L);
        int g7 = w6.h.g(this, i7);
        if (g7 == 0) {
            i8 = 0;
        } else {
            i8 = iArr[g7 - 1];
        }
        return bArr[g7][(i7 - i8) + iArr[bArr.length + g7]];
    }

    @Override // v6.C1344i
    public final int j(int i7, byte[] bArr) {
        M5.g.f(bArr, "other");
        return t().j(i7, bArr);
    }

    @Override // v6.C1344i
    public final boolean l(int i7, int i8, int i9, byte[] bArr) {
        int i10;
        M5.g.f(bArr, "other");
        if (i7 < 0 || i7 > d() - i9 || i8 < 0 || i8 > bArr.length - i9) {
            return false;
        }
        int i11 = i9 + i7;
        int g7 = w6.h.g(this, i7);
        while (i7 < i11) {
            int[] iArr = this.f15363v;
            if (g7 == 0) {
                i10 = 0;
            } else {
                i10 = iArr[g7 - 1];
            }
            byte[][] bArr2 = this.f15362u;
            int i12 = iArr[bArr2.length + g7];
            int min = Math.min(i11, (iArr[g7] - i10) + i10) - i7;
            if (!AbstractC0189a.c((i7 - i10) + i12, i8, min, bArr2[g7], bArr)) {
                return false;
            }
            i8 += min;
            i7 += min;
            g7++;
        }
        return true;
    }

    @Override // v6.C1344i
    public final boolean m(int i7, C1344i c1344i, int i8) {
        int i9;
        M5.g.f(c1344i, "other");
        if (i7 < 0 || i7 > d() - i8) {
            return false;
        }
        int i10 = i8 + i7;
        int g7 = w6.h.g(this, i7);
        int i11 = 0;
        while (i7 < i10) {
            int[] iArr = this.f15363v;
            if (g7 == 0) {
                i9 = 0;
            } else {
                i9 = iArr[g7 - 1];
            }
            byte[][] bArr = this.f15362u;
            int i12 = iArr[bArr.length + g7];
            int min = Math.min(i10, (iArr[g7] - i9) + i9) - i7;
            if (!c1344i.l(i11, (i7 - i9) + i12, min, bArr[g7])) {
                return false;
            }
            i11 += min;
            i7 += min;
            g7++;
        }
        return true;
    }

    @Override // v6.C1344i
    public final C1344i n(int i7, int i8) {
        int G6 = AbstractC0189a.G(this, i8);
        if (i7 >= 0) {
            if (G6 <= d()) {
                int i9 = G6 - i7;
                if (i9 >= 0) {
                    if (i7 == 0 && G6 == d()) {
                        return this;
                    }
                    if (i7 == G6) {
                        return C1344i.f15389t;
                    }
                    int g7 = w6.h.g(this, i7);
                    int g8 = w6.h.g(this, G6 - 1);
                    byte[][] bArr = this.f15362u;
                    byte[][] bArr2 = (byte[][]) A5.j.T(bArr, g7, g8 + 1);
                    int[] iArr = new int[bArr2.length * 2];
                    int i10 = 0;
                    int[] iArr2 = this.f15363v;
                    if (g7 <= g8) {
                        int i11 = g7;
                        int i12 = 0;
                        while (true) {
                            iArr[i12] = Math.min(iArr2[i11] - i7, i9);
                            int i13 = i12 + 1;
                            iArr[i12 + bArr2.length] = iArr2[bArr.length + i11];
                            if (i11 == g8) {
                                break;
                            }
                            i11++;
                            i12 = i13;
                        }
                    }
                    if (g7 != 0) {
                        i10 = iArr2[g7 - 1];
                    }
                    int length = bArr2.length;
                    iArr[length] = (i7 - i10) + iArr[length];
                    return new C(bArr2, iArr);
                }
                throw new IllegalArgumentException(AbstractC1111a.m(G6, i7, "endIndex=", " < beginIndex=").toString());
            }
            StringBuilder o7 = AbstractC0515y1.o(G6, "endIndex=", " > length(");
            o7.append(d());
            o7.append(')');
            throw new IllegalArgumentException(o7.toString().toString());
        }
        throw new IllegalArgumentException(AbstractC1111a.n(i7, "beginIndex=", " < 0").toString());
    }

    @Override // v6.C1344i
    public final C1344i p() {
        return t().p();
    }

    @Override // v6.C1344i
    public final void r(C1341f c1341f, int i7) {
        int i8;
        M5.g.f(c1341f, "buffer");
        int g7 = w6.h.g(this, 0);
        int i9 = 0;
        while (i9 < i7) {
            int[] iArr = this.f15363v;
            if (g7 == 0) {
                i8 = 0;
            } else {
                i8 = iArr[g7 - 1];
            }
            byte[][] bArr = this.f15362u;
            int i10 = iArr[bArr.length + g7];
            int min = Math.min(i7, (iArr[g7] - i8) + i8) - i9;
            int i11 = (i9 - i8) + i10;
            A a7 = new A(bArr[g7], i11, i11 + min, true);
            A a8 = c1341f.f15387q;
            if (a8 == null) {
                a7.f15358g = a7;
                a7.f = a7;
                c1341f.f15387q = a7;
            } else {
                A a9 = a8.f15358g;
                M5.g.c(a9);
                a9.b(a7);
            }
            i9 += min;
            g7++;
        }
        c1341f.f15388r += i7;
    }

    public final byte[] s() {
        byte[] bArr = new byte[d()];
        byte[][] bArr2 = this.f15362u;
        int length = bArr2.length;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i7 < length) {
            int[] iArr = this.f15363v;
            int i10 = iArr[length + i7];
            int i11 = iArr[i7];
            int i12 = i11 - i8;
            A5.j.O(i9, i10, i10 + i12, bArr2[i7], bArr);
            i9 += i12;
            i7++;
            i8 = i11;
        }
        return bArr;
    }

    public final C1344i t() {
        return new C1344i(s());
    }

    @Override // v6.C1344i
    public final String toString() {
        return t().toString();
    }
}
