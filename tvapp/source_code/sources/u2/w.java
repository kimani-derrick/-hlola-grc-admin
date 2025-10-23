package u2;

import Z2.H;
import k2.C0943h;
/* loaded from: classes.dex */
public final class w {

    /* renamed from: c  reason: collision with root package name */
    public boolean f14930c;
    public boolean d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f14931e;

    /* renamed from: a  reason: collision with root package name */
    public final Z2.E f14928a = new Z2.E(0);
    public long f = -9223372036854775807L;

    /* renamed from: g  reason: collision with root package name */
    public long f14932g = -9223372036854775807L;

    /* renamed from: h  reason: collision with root package name */
    public long f14933h = -9223372036854775807L;

    /* renamed from: b  reason: collision with root package name */
    public final Z2.y f14929b = new Z2.y();

    public static int b(int i7, byte[] bArr) {
        return (bArr[i7 + 3] & 255) | ((bArr[i7] & 255) << 24) | ((bArr[i7 + 1] & 255) << 16) | ((bArr[i7 + 2] & 255) << 8);
    }

    public static long c(Z2.y yVar) {
        int i7 = yVar.f4692b;
        if (yVar.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        yVar.e(bArr, 0, 9);
        yVar.F(i7);
        byte b7 = bArr[0];
        if ((b7 & 196) == 68) {
            byte b8 = bArr[2];
            if ((b8 & 4) == 4) {
                byte b9 = bArr[4];
                if ((b9 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j7 = b7;
                    long j8 = b8;
                    return ((j8 & 3) << 13) | ((j7 & 3) << 28) | (((56 & j7) >> 3) << 30) | ((bArr[1] & 255) << 20) | (((j8 & 248) >> 3) << 15) | ((bArr[3] & 255) << 5) | ((b9 & 248) >> 3);
                }
            }
        }
        return -9223372036854775807L;
    }

    public final void a(C0943h c0943h) {
        byte[] bArr = H.f;
        Z2.y yVar = this.f14929b;
        yVar.getClass();
        yVar.D(bArr.length, bArr);
        this.f14930c = true;
        c0943h.f12168v = 0;
    }
}
