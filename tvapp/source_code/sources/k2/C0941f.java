package k2;

import Z2.H;
import java.util.Arrays;
/* renamed from: k2.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0941f implements InterfaceC0955t {

    /* renamed from: a  reason: collision with root package name */
    public final int f12154a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f12155b;

    /* renamed from: c  reason: collision with root package name */
    public final long[] f12156c;
    public final long[] d;

    /* renamed from: e  reason: collision with root package name */
    public final long[] f12157e;
    public final long f;

    public C0941f(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f12155b = iArr;
        this.f12156c = jArr;
        this.d = jArr2;
        this.f12157e = jArr3;
        int length = iArr.length;
        this.f12154a = length;
        if (length > 0) {
            this.f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f = 0L;
        }
    }

    @Override // k2.InterfaceC0955t
    public final boolean b() {
        return true;
    }

    @Override // k2.InterfaceC0955t
    public final C0954s g(long j7) {
        long[] jArr = this.f12157e;
        int f = H.f(jArr, j7, true);
        long j8 = jArr[f];
        long[] jArr2 = this.f12156c;
        C0956u c0956u = new C0956u(j8, jArr2[f]);
        if (j8 < j7 && f != this.f12154a - 1) {
            int i7 = f + 1;
            return new C0954s(c0956u, new C0956u(jArr[i7], jArr2[i7]));
        }
        return new C0954s(c0956u, c0956u);
    }

    @Override // k2.InterfaceC0955t
    public final long i() {
        return this.f;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.f12154a + ", sizes=" + Arrays.toString(this.f12155b) + ", offsets=" + Arrays.toString(this.f12156c) + ", timeUs=" + Arrays.toString(this.f12157e) + ", durationsUs=" + Arrays.toString(this.d) + ")";
    }
}
