package k2;

import Z2.H;
import androidx.fragment.app.D;
import e2.C0593J;
import e2.K;
import java.util.Collections;
import x2.C1461c;
/* renamed from: k2.p  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0951p {

    /* renamed from: a  reason: collision with root package name */
    public final int f12178a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12179b;

    /* renamed from: c  reason: collision with root package name */
    public final int f12180c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final int f12181e;
    public final int f;

    /* renamed from: g  reason: collision with root package name */
    public final int f12182g;

    /* renamed from: h  reason: collision with root package name */
    public final int f12183h;

    /* renamed from: i  reason: collision with root package name */
    public final int f12184i;

    /* renamed from: j  reason: collision with root package name */
    public final long f12185j;

    /* renamed from: k  reason: collision with root package name */
    public final D f12186k;

    /* renamed from: l  reason: collision with root package name */
    public final C1461c f12187l;

    public C0951p(int i7, int i8, int i9, int i10, int i11, int i12, int i13, long j7, D d, C1461c c1461c) {
        this.f12178a = i7;
        this.f12179b = i8;
        this.f12180c = i9;
        this.d = i10;
        this.f12181e = i11;
        this.f = d(i11);
        this.f12182g = i12;
        this.f12183h = i13;
        this.f12184i = a(i13);
        this.f12185j = j7;
        this.f12186k = d;
        this.f12187l = c1461c;
    }

    public static int a(int i7) {
        if (i7 != 8) {
            if (i7 != 12) {
                if (i7 != 16) {
                    if (i7 != 20) {
                        if (i7 != 24) {
                            return -1;
                        }
                        return 6;
                    }
                    return 5;
                }
                return 4;
            }
            return 2;
        }
        return 1;
    }

    public static int d(int i7) {
        switch (i7) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long b() {
        long j7 = this.f12185j;
        if (j7 == 0) {
            return -9223372036854775807L;
        }
        return (j7 * 1000000) / this.f12181e;
    }

    public final K c(byte[] bArr, C1461c c1461c) {
        bArr[4] = Byte.MIN_VALUE;
        int i7 = this.d;
        if (i7 <= 0) {
            i7 = -1;
        }
        C1461c c1461c2 = this.f12187l;
        if (c1461c2 != null) {
            if (c1461c == null) {
                c1461c = c1461c2;
            } else {
                c1461c = c1461c2.a(c1461c.f16206q);
            }
        }
        C0593J c0593j = new C0593J();
        c0593j.f9605k = "audio/flac";
        c0593j.f9606l = i7;
        c0593j.f9617x = this.f12182g;
        c0593j.f9618y = this.f12181e;
        c0593j.f9607m = Collections.singletonList(bArr);
        c0593j.f9603i = c1461c;
        return new K(c0593j);
    }

    public C0951p(int i7, byte[] bArr) {
        N2.f fVar = new N2.f(bArr.length, bArr);
        fVar.p(i7 * 8);
        this.f12178a = fVar.i(16);
        this.f12179b = fVar.i(16);
        this.f12180c = fVar.i(24);
        this.d = fVar.i(24);
        int i8 = fVar.i(20);
        this.f12181e = i8;
        this.f = d(i8);
        this.f12182g = fVar.i(3) + 1;
        int i9 = fVar.i(5) + 1;
        this.f12183h = i9;
        this.f12184i = a(i9);
        int i10 = fVar.i(4);
        int i11 = fVar.i(32);
        int i12 = H.f4603a;
        this.f12185j = ((i10 & 4294967295L) << 32) | (i11 & 4294967295L);
        this.f12186k = null;
        this.f12187l = null;
    }
}
