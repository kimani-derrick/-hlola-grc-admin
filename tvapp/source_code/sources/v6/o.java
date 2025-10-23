package v6;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import r0.AbstractC1111a;
/* loaded from: classes.dex */
public final class o implements F {

    /* renamed from: q  reason: collision with root package name */
    public byte f15400q;

    /* renamed from: r  reason: collision with root package name */
    public final z f15401r;

    /* renamed from: s  reason: collision with root package name */
    public final Inflater f15402s;

    /* renamed from: t  reason: collision with root package name */
    public final p f15403t;

    /* renamed from: u  reason: collision with root package name */
    public final CRC32 f15404u;

    public o(F f) {
        M5.g.f(f, "source");
        z zVar = new z(f);
        this.f15401r = zVar;
        Inflater inflater = new Inflater(true);
        this.f15402s = inflater;
        this.f15403t = new p(zVar, inflater);
        this.f15404u = new CRC32();
    }

    public static void a(int i7, int i8, String str) {
        if (i8 == i7) {
            return;
        }
        throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i8), Integer.valueOf(i7)}, 3)));
    }

    @Override // v6.F
    public final long L(C1341f c1341f, long j7) {
        z zVar;
        boolean z7;
        long j8;
        M5.g.f(c1341f, "sink");
        int i7 = (j7 > 0L ? 1 : (j7 == 0L ? 0 : -1));
        if (i7 >= 0) {
            if (i7 == 0) {
                return 0L;
            }
            byte b7 = this.f15400q;
            CRC32 crc32 = this.f15404u;
            z zVar2 = this.f15401r;
            if (b7 == 0) {
                zVar2.F(10L);
                C1341f c1341f2 = zVar2.f15428r;
                byte y3 = c1341f2.y(3L);
                if (((y3 >> 1) & 1) == 1) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (z7) {
                    b(zVar2.f15428r, 0L, 10L);
                }
                a(8075, zVar2.readShort(), "ID1ID2");
                zVar2.p(8L);
                if (((y3 >> 2) & 1) == 1) {
                    zVar2.F(2L);
                    if (z7) {
                        b(zVar2.f15428r, 0L, 2L);
                    }
                    long Z6 = c1341f2.Z();
                    zVar2.F(Z6);
                    if (z7) {
                        b(zVar2.f15428r, 0L, Z6);
                        j8 = Z6;
                    } else {
                        j8 = Z6;
                    }
                    zVar2.p(j8);
                }
                if (((y3 >> 3) & 1) == 1) {
                    long a7 = zVar2.a((byte) 0, 0L, Long.MAX_VALUE);
                    if (a7 != -1) {
                        if (z7) {
                            zVar = zVar2;
                            b(zVar2.f15428r, 0L, a7 + 1);
                        } else {
                            zVar = zVar2;
                        }
                        zVar.p(a7 + 1);
                    } else {
                        throw new EOFException();
                    }
                } else {
                    zVar = zVar2;
                }
                if (((y3 >> 4) & 1) == 1) {
                    long a8 = zVar.a((byte) 0, 0L, Long.MAX_VALUE);
                    if (a8 != -1) {
                        if (z7) {
                            b(zVar.f15428r, 0L, a8 + 1);
                        }
                        zVar.p(a8 + 1);
                    } else {
                        throw new EOFException();
                    }
                }
                if (z7) {
                    a(zVar.b(), (short) crc32.getValue(), "FHCRC");
                    crc32.reset();
                }
                this.f15400q = (byte) 1;
            } else {
                zVar = zVar2;
            }
            if (this.f15400q == 1) {
                long j9 = c1341f.f15388r;
                long L6 = this.f15403t.L(c1341f, j7);
                if (L6 != -1) {
                    b(c1341f, j9, L6);
                    return L6;
                }
                this.f15400q = (byte) 2;
            }
            if (this.f15400q == 2) {
                a(zVar.H(), (int) crc32.getValue(), "CRC");
                a(zVar.H(), (int) this.f15402s.getBytesWritten(), "ISIZE");
                this.f15400q = (byte) 3;
                if (zVar.M()) {
                    return -1L;
                }
                throw new IOException("gzip finished without exhausting source");
            }
            return -1L;
        }
        throw new IllegalArgumentException(AbstractC1111a.o(j7, "byteCount < 0: ").toString());
    }

    public final void b(C1341f c1341f, long j7, long j8) {
        int i7;
        A a7 = c1341f.f15387q;
        while (true) {
            M5.g.c(a7);
            int i8 = a7.f15356c;
            int i9 = a7.f15355b;
            if (j7 < i8 - i9) {
                break;
            }
            j7 -= i8 - i9;
            a7 = a7.f;
        }
        while (j8 > 0) {
            int min = (int) Math.min(a7.f15356c - i7, j8);
            this.f15404u.update(a7.f15354a, (int) (a7.f15355b + j7), min);
            j8 -= min;
            a7 = a7.f;
            M5.g.c(a7);
            j7 = 0;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f15403t.close();
    }

    @Override // v6.F
    public final H d() {
        return this.f15401r.f15427q.d();
    }
}
