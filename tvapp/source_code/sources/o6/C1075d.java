package o6;

import java.io.IOException;
import java.util.ArrayList;
import v6.C1344i;
/* renamed from: o6.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1075d {

    /* renamed from: c  reason: collision with root package name */
    public final v6.z f13002c;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public int f13004g;

    /* renamed from: a  reason: collision with root package name */
    public int f13000a = 4096;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f13001b = new ArrayList();
    public C1074c[] d = new C1074c[8];

    /* renamed from: e  reason: collision with root package name */
    public int f13003e = 7;

    public C1075d(v vVar) {
        this.f13002c = p6.l.c(vVar);
    }

    public final int a(int i7) {
        int i8;
        int i9 = 0;
        if (i7 > 0) {
            int length = this.d.length;
            while (true) {
                length--;
                i8 = this.f13003e;
                if (length < i8 || i7 <= 0) {
                    break;
                }
                C1074c c1074c = this.d[length];
                M5.g.c(c1074c);
                int i10 = c1074c.f12999c;
                i7 -= i10;
                this.f13004g -= i10;
                this.f--;
                i9++;
            }
            C1074c[] c1074cArr = this.d;
            System.arraycopy(c1074cArr, i8 + 1, c1074cArr, i8 + 1 + i9, this.f);
            this.f13003e += i9;
        }
        return i9;
    }

    public final C1344i b(int i7) {
        C1074c c1074c;
        if (i7 >= 0) {
            C1074c[] c1074cArr = AbstractC1077f.f13012a;
            if (i7 <= c1074cArr.length - 1) {
                c1074c = c1074cArr[i7];
                return c1074c.f12997a;
            }
        }
        int length = this.f13003e + 1 + (i7 - AbstractC1077f.f13012a.length);
        if (length >= 0) {
            C1074c[] c1074cArr2 = this.d;
            if (length < c1074cArr2.length) {
                c1074c = c1074cArr2[length];
                M5.g.c(c1074c);
                return c1074c.f12997a;
            }
        }
        throw new IOException(M5.g.k(Integer.valueOf(i7 + 1), "Header index too large "));
    }

    public final void c(C1074c c1074c) {
        this.f13001b.add(c1074c);
        int i7 = this.f13000a;
        int i8 = c1074c.f12999c;
        if (i8 > i7) {
            A5.j.U(r7, 0, this.d.length);
            this.f13003e = this.d.length - 1;
            this.f = 0;
            this.f13004g = 0;
            return;
        }
        a((this.f13004g + i8) - i7);
        int i9 = this.f + 1;
        C1074c[] c1074cArr = this.d;
        if (i9 > c1074cArr.length) {
            C1074c[] c1074cArr2 = new C1074c[c1074cArr.length * 2];
            System.arraycopy(c1074cArr, 0, c1074cArr2, c1074cArr.length, c1074cArr.length);
            this.f13003e = this.d.length - 1;
            this.d = c1074cArr2;
        }
        int i10 = this.f13003e;
        this.f13003e = i10 - 1;
        this.d[i10] = c1074c;
        this.f++;
        this.f13004g += i8;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, v6.f] */
    public final C1344i d() {
        boolean z7;
        int i7;
        v6.z zVar = this.f13002c;
        byte readByte = zVar.readByte();
        byte[] bArr = i6.b.f11390a;
        int i8 = readByte & 255;
        int i9 = 0;
        if ((readByte & 128) == 128) {
            z7 = true;
        } else {
            z7 = false;
        }
        long e3 = e(i8, 127);
        if (z7) {
            ?? obj = new Object();
            int[] iArr = C.f12978a;
            M5.g.f(zVar, "source");
            O2.e eVar = C.f12980c;
            O2.e eVar2 = eVar;
            long j7 = 0;
            int i10 = 0;
            while (j7 < e3) {
                j7++;
                byte readByte2 = zVar.readByte();
                byte[] bArr2 = i6.b.f11390a;
                i9 = (i9 << 8) | (readByte2 & 255);
                i10 += 8;
                while (i10 >= 8) {
                    O2.e[] eVarArr = (O2.e[]) eVar2.f2561c;
                    M5.g.c(eVarArr);
                    eVar2 = eVarArr[(i9 >>> (i10 - 8)) & 255];
                    M5.g.c(eVar2);
                    if (((O2.e[]) eVar2.f2561c) == null) {
                        obj.i0(eVar2.f2559a);
                        i10 -= eVar2.f2560b;
                        eVar2 = eVar;
                    } else {
                        i10 -= 8;
                    }
                }
            }
            while (i10 > 0) {
                O2.e[] eVarArr2 = (O2.e[]) eVar2.f2561c;
                M5.g.c(eVarArr2);
                O2.e eVar3 = eVarArr2[(i9 << (8 - i10)) & 255];
                M5.g.c(eVar3);
                if (((O2.e[]) eVar3.f2561c) != null || (i7 = eVar3.f2560b) > i10) {
                    break;
                }
                obj.i0(eVar3.f2559a);
                i10 -= i7;
                eVar2 = eVar;
            }
            return obj.l(obj.f15388r);
        }
        return zVar.l(e3);
    }

    public final int e(int i7, int i8) {
        int i9 = i7 & i8;
        if (i9 < i8) {
            return i9;
        }
        int i10 = 0;
        while (true) {
            byte readByte = this.f13002c.readByte();
            byte[] bArr = i6.b.f11390a;
            int i11 = readByte & 255;
            if ((readByte & 128) != 0) {
                i8 += (readByte & Byte.MAX_VALUE) << i10;
                i10 += 7;
            } else {
                return i8 + (i11 << i10);
            }
        }
    }
}
