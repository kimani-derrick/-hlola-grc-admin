package H2;

import Y2.C0132a;
import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.Arrays;
import k2.C0957v;
/* loaded from: classes.dex */
public final class Y {

    /* renamed from: a  reason: collision with root package name */
    public final Y2.r f1001a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1002b;

    /* renamed from: c  reason: collision with root package name */
    public final Z2.y f1003c;
    public X d;

    /* renamed from: e  reason: collision with root package name */
    public X f1004e;
    public X f;

    /* renamed from: g  reason: collision with root package name */
    public long f1005g;

    public Y(Y2.r rVar) {
        this.f1001a = rVar;
        int i7 = rVar.f4431b;
        this.f1002b = i7;
        this.f1003c = new Z2.y(32);
        X x7 = new X(0L, i7);
        this.d = x7;
        this.f1004e = x7;
        this.f = x7;
    }

    public static X d(X x7, long j7, ByteBuffer byteBuffer, int i7) {
        while (j7 >= x7.f998r) {
            x7 = (X) x7.f1000t;
        }
        while (i7 > 0) {
            int min = Math.min(i7, (int) (x7.f998r - j7));
            C0132a c0132a = (C0132a) x7.f999s;
            byteBuffer.put(c0132a.f4377a, ((int) (j7 - x7.f997q)) + c0132a.f4378b, min);
            i7 -= min;
            j7 += min;
            if (j7 == x7.f998r) {
                x7 = (X) x7.f1000t;
            }
        }
        return x7;
    }

    public static X e(X x7, long j7, byte[] bArr, int i7) {
        while (j7 >= x7.f998r) {
            x7 = (X) x7.f1000t;
        }
        int i8 = i7;
        while (i8 > 0) {
            int min = Math.min(i8, (int) (x7.f998r - j7));
            C0132a c0132a = (C0132a) x7.f999s;
            System.arraycopy(c0132a.f4377a, ((int) (j7 - x7.f997q)) + c0132a.f4378b, bArr, i7 - i8, min);
            i8 -= min;
            j7 += min;
            if (j7 == x7.f998r) {
                x7 = (X) x7.f1000t;
            }
        }
        return x7;
    }

    public static X f(X x7, i2.g gVar, Z z7, Z2.y yVar) {
        long j7;
        ByteBuffer byteBuffer;
        boolean z8;
        int i7;
        if (gVar.d(1073741824)) {
            long j8 = z7.f1007b;
            yVar.C(1);
            X e3 = e(x7, j8, yVar.f4691a, 1);
            long j9 = j8 + 1;
            byte b7 = yVar.f4691a[0];
            if ((b7 & 128) != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            int i8 = b7 & Byte.MAX_VALUE;
            i2.c cVar = gVar.f11350s;
            byte[] bArr = cVar.f11332a;
            if (bArr == null) {
                cVar.f11332a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            x7 = e(e3, j9, cVar.f11332a, i8);
            long j10 = j9 + i8;
            if (z8) {
                yVar.C(2);
                x7 = e(x7, j10, yVar.f4691a, 2);
                j10 += 2;
                i7 = yVar.z();
            } else {
                i7 = 1;
            }
            int[] iArr = cVar.d;
            if (iArr == null || iArr.length < i7) {
                iArr = new int[i7];
            }
            int[] iArr2 = cVar.f11335e;
            if (iArr2 == null || iArr2.length < i7) {
                iArr2 = new int[i7];
            }
            if (z8) {
                int i9 = i7 * 6;
                yVar.C(i9);
                x7 = e(x7, j10, yVar.f4691a, i9);
                j10 += i9;
                yVar.F(0);
                for (int i10 = 0; i10 < i7; i10++) {
                    iArr[i10] = yVar.z();
                    iArr2[i10] = yVar.x();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = z7.f1006a - ((int) (j10 - z7.f1007b));
            }
            C0957v c0957v = (C0957v) z7.f1008c;
            int i11 = Z2.H.f4603a;
            byte[] bArr2 = c0957v.f12200b;
            byte[] bArr3 = cVar.f11332a;
            cVar.f = i7;
            cVar.d = iArr;
            cVar.f11335e = iArr2;
            cVar.f11333b = bArr2;
            cVar.f11332a = bArr3;
            int i12 = c0957v.f12199a;
            cVar.f11334c = i12;
            int i13 = c0957v.f12201c;
            cVar.f11336g = i13;
            int i14 = c0957v.d;
            cVar.f11337h = i14;
            MediaCodec.CryptoInfo cryptoInfo = cVar.f11338i;
            cryptoInfo.numSubSamples = i7;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i12;
            if (Z2.H.f4603a >= 24) {
                androidx.fragment.app.D d = cVar.f11339j;
                d.getClass();
                ((MediaCodec.CryptoInfo.Pattern) d.f5884s).set(i13, i14);
                ((MediaCodec.CryptoInfo) d.f5883r).setPattern((MediaCodec.CryptoInfo.Pattern) d.f5884s);
            }
            long j11 = z7.f1007b;
            int i15 = (int) (j10 - j11);
            z7.f1007b = j11 + i15;
            z7.f1006a -= i15;
        }
        if (gVar.d(268435456)) {
            yVar.C(4);
            X e7 = e(x7, z7.f1007b, yVar.f4691a, 4);
            int x8 = yVar.x();
            z7.f1007b += 4;
            z7.f1006a -= 4;
            gVar.i(x8);
            x7 = d(e7, z7.f1007b, gVar.f11351t, x8);
            z7.f1007b += x8;
            int i16 = z7.f1006a - x8;
            z7.f1006a = i16;
            ByteBuffer byteBuffer2 = gVar.f11354w;
            if (byteBuffer2 != null && byteBuffer2.capacity() >= i16) {
                gVar.f11354w.clear();
            } else {
                gVar.f11354w = ByteBuffer.allocate(i16);
            }
            j7 = z7.f1007b;
            byteBuffer = gVar.f11354w;
        } else {
            gVar.i(z7.f1006a);
            j7 = z7.f1007b;
            byteBuffer = gVar.f11351t;
        }
        return d(x7, j7, byteBuffer, z7.f1006a);
    }

    public final void a(X x7) {
        if (((C0132a) x7.f999s) == null) {
            return;
        }
        Y2.r rVar = this.f1001a;
        synchronized (rVar) {
            X x8 = x7;
            while (x8 != null) {
                try {
                    C0132a[] c0132aArr = rVar.f;
                    int i7 = rVar.f4433e;
                    rVar.f4433e = i7 + 1;
                    C0132a c0132a = (C0132a) x8.f999s;
                    c0132a.getClass();
                    c0132aArr[i7] = c0132a;
                    rVar.d--;
                    x8 = (X) x8.f1000t;
                    if (x8 == null || ((C0132a) x8.f999s) == null) {
                        x8 = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            rVar.notifyAll();
        }
        x7.f999s = null;
        x7.f1000t = null;
    }

    public final void b(long j7) {
        X x7;
        if (j7 == -1) {
            return;
        }
        while (true) {
            x7 = this.d;
            if (j7 < x7.f998r) {
                break;
            }
            Y2.r rVar = this.f1001a;
            C0132a c0132a = (C0132a) x7.f999s;
            synchronized (rVar) {
                C0132a[] c0132aArr = rVar.f;
                int i7 = rVar.f4433e;
                rVar.f4433e = i7 + 1;
                c0132aArr[i7] = c0132a;
                rVar.d--;
                rVar.notifyAll();
            }
            X x8 = this.d;
            x8.f999s = null;
            x8.f1000t = null;
            this.d = (X) x8.f1000t;
        }
        if (this.f1004e.f997q < x7.f997q) {
            this.f1004e = x7;
        }
    }

    public final int c(int i7) {
        C0132a c0132a;
        X x7 = this.f;
        if (((C0132a) x7.f999s) == null) {
            Y2.r rVar = this.f1001a;
            synchronized (rVar) {
                try {
                    int i8 = rVar.d + 1;
                    rVar.d = i8;
                    int i9 = rVar.f4433e;
                    if (i9 > 0) {
                        C0132a[] c0132aArr = rVar.f;
                        int i10 = i9 - 1;
                        rVar.f4433e = i10;
                        c0132a = c0132aArr[i10];
                        c0132a.getClass();
                        rVar.f[rVar.f4433e] = null;
                    } else {
                        C0132a c0132a2 = new C0132a(0, new byte[rVar.f4431b]);
                        C0132a[] c0132aArr2 = rVar.f;
                        if (i8 > c0132aArr2.length) {
                            rVar.f = (C0132a[]) Arrays.copyOf(c0132aArr2, c0132aArr2.length * 2);
                        }
                        c0132a = c0132a2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            X x8 = new X(this.f.f998r, this.f1002b);
            x7.f999s = c0132a;
            x7.f1000t = x8;
        }
        return Math.min(i7, (int) (this.f.f998r - this.f1005g));
    }
}
