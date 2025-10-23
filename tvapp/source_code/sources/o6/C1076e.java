package o6;

import java.util.ArrayList;
import java.util.Arrays;
import v6.C1341f;
import v6.C1344i;
/* renamed from: o6.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1076e {

    /* renamed from: b  reason: collision with root package name */
    public final C1341f f13006b;
    public boolean d;

    /* renamed from: h  reason: collision with root package name */
    public int f13010h;

    /* renamed from: i  reason: collision with root package name */
    public int f13011i;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f13005a = true;

    /* renamed from: c  reason: collision with root package name */
    public int f13007c = Integer.MAX_VALUE;

    /* renamed from: e  reason: collision with root package name */
    public int f13008e = 4096;
    public C1074c[] f = new C1074c[8];

    /* renamed from: g  reason: collision with root package name */
    public int f13009g = 7;

    public C1076e(C1341f c1341f) {
        this.f13006b = c1341f;
    }

    public final void a(int i7) {
        int i8;
        if (i7 > 0) {
            int length = this.f.length - 1;
            int i9 = 0;
            while (true) {
                i8 = this.f13009g;
                if (length < i8 || i7 <= 0) {
                    break;
                }
                C1074c c1074c = this.f[length];
                M5.g.c(c1074c);
                i7 -= c1074c.f12999c;
                int i10 = this.f13011i;
                C1074c c1074c2 = this.f[length];
                M5.g.c(c1074c2);
                this.f13011i = i10 - c1074c2.f12999c;
                this.f13010h--;
                i9++;
                length--;
            }
            C1074c[] c1074cArr = this.f;
            int i11 = i8 + 1;
            System.arraycopy(c1074cArr, i11, c1074cArr, i11 + i9, this.f13010h);
            C1074c[] c1074cArr2 = this.f;
            int i12 = this.f13009g + 1;
            Arrays.fill(c1074cArr2, i12, i12 + i9, (Object) null);
            this.f13009g += i9;
        }
    }

    public final void b(C1074c c1074c) {
        int i7 = this.f13008e;
        int i8 = c1074c.f12999c;
        if (i8 > i7) {
            A5.j.U(r7, 0, this.f.length);
            this.f13009g = this.f.length - 1;
            this.f13010h = 0;
            this.f13011i = 0;
            return;
        }
        a((this.f13011i + i8) - i7);
        int i9 = this.f13010h + 1;
        C1074c[] c1074cArr = this.f;
        if (i9 > c1074cArr.length) {
            C1074c[] c1074cArr2 = new C1074c[c1074cArr.length * 2];
            System.arraycopy(c1074cArr, 0, c1074cArr2, c1074cArr.length, c1074cArr.length);
            this.f13009g = this.f.length - 1;
            this.f = c1074cArr2;
        }
        int i10 = this.f13009g;
        this.f13009g = i10 - 1;
        this.f[i10] = c1074c;
        this.f13010h++;
        this.f13011i += i8;
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, v6.f] */
    public final void c(C1344i c1344i) {
        M5.g.f(c1344i, "data");
        boolean z7 = this.f13005a;
        C1341f c1341f = this.f13006b;
        int i7 = 0;
        if (z7) {
            int[] iArr = C.f12978a;
            int d = c1344i.d();
            int i8 = 0;
            long j7 = 0;
            while (i8 < d) {
                int i9 = i8 + 1;
                byte i10 = c1344i.i(i8);
                byte[] bArr = i6.b.f11390a;
                j7 += C.f12979b[i10 & 255];
                i8 = i9;
            }
            if (((int) ((j7 + 7) >> 3)) < c1344i.d()) {
                ?? obj = new Object();
                int[] iArr2 = C.f12978a;
                int d7 = c1344i.d();
                long j8 = 0;
                byte b7 = 0;
                while (i7 < d7) {
                    int i11 = i7 + 1;
                    byte i12 = c1344i.i(i7);
                    byte[] bArr2 = i6.b.f11390a;
                    int i13 = i12 & 255;
                    int i14 = C.f12978a[i13];
                    byte b8 = C.f12979b[i13];
                    j8 = (j8 << b8) | i14;
                    int i15 = b7 + b8;
                    while (i15 >= 8) {
                        i15 = (i15 == 1 ? 1 : 0) - 8;
                        obj.i0((int) (j8 >> i15));
                    }
                    i7 = i11;
                    b7 = i15;
                }
                if (b7 > 0) {
                    obj.i0((int) ((255 >>> b7) | (j8 << (8 - b7))));
                }
                c1344i = obj.l(obj.f15388r);
                e(c1344i.d(), 127, 128);
                c1341f.f0(c1344i);
            }
        }
        e(c1344i.d(), 127, 0);
        c1341f.f0(c1344i);
    }

    public final void d(ArrayList arrayList) {
        int i7;
        int i8;
        if (this.d) {
            int i9 = this.f13007c;
            if (i9 < this.f13008e) {
                e(i9, 31, 32);
            }
            this.d = false;
            this.f13007c = Integer.MAX_VALUE;
            e(this.f13008e, 31, 32);
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            C1074c c1074c = (C1074c) arrayList.get(i10);
            C1344i p3 = c1074c.f12997a.p();
            Integer num = (Integer) AbstractC1077f.f13013b.get(p3);
            C1344i c1344i = c1074c.f12998b;
            if (num != null) {
                int intValue = num.intValue();
                i8 = intValue + 1;
                if (2 <= i8 && i8 < 8) {
                    C1074c[] c1074cArr = AbstractC1077f.f13012a;
                    if (M5.g.a(c1074cArr[intValue].f12998b, c1344i)) {
                        i7 = i8;
                    } else if (M5.g.a(c1074cArr[i8].f12998b, c1344i)) {
                        i8 = intValue + 2;
                        i7 = i8;
                    }
                }
                i7 = i8;
                i8 = -1;
            } else {
                i7 = -1;
                i8 = -1;
            }
            if (i8 == -1) {
                int i12 = this.f13009g + 1;
                int length = this.f.length;
                while (true) {
                    if (i12 >= length) {
                        break;
                    }
                    int i13 = i12 + 1;
                    C1074c c1074c2 = this.f[i12];
                    M5.g.c(c1074c2);
                    if (M5.g.a(c1074c2.f12997a, p3)) {
                        C1074c c1074c3 = this.f[i12];
                        M5.g.c(c1074c3);
                        if (M5.g.a(c1074c3.f12998b, c1344i)) {
                            i8 = AbstractC1077f.f13012a.length + (i12 - this.f13009g);
                            break;
                        } else if (i7 == -1) {
                            i7 = AbstractC1077f.f13012a.length + (i12 - this.f13009g);
                        }
                    }
                    i12 = i13;
                }
            }
            if (i8 != -1) {
                e(i8, 127, 128);
            } else {
                if (i7 == -1) {
                    this.f13006b.i0(64);
                    c(p3);
                } else {
                    C1344i c1344i2 = C1074c.d;
                    p3.getClass();
                    M5.g.f(c1344i2, "prefix");
                    if (p3.m(0, c1344i2, c1344i2.d()) && !M5.g.a(C1074c.f12996i, p3)) {
                        e(i7, 15, 0);
                        c(c1344i);
                    } else {
                        e(i7, 63, 64);
                    }
                }
                c(c1344i);
                b(c1074c);
            }
            i10 = i11;
        }
    }

    public final void e(int i7, int i8, int i9) {
        C1341f c1341f = this.f13006b;
        if (i7 < i8) {
            c1341f.i0(i7 | i9);
            return;
        }
        c1341f.i0(i9 | i8);
        int i10 = i7 - i8;
        while (i10 >= 128) {
            c1341f.i0(128 | (i10 & 127));
            i10 >>>= 7;
        }
        c1341f.i0(i10);
    }
}
