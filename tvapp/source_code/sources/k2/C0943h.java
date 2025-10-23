package k2;

import Y2.InterfaceC0141j;
import Z2.H;
import e2.AbstractC0592I;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
/* renamed from: k2.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0943h implements InterfaceC0947l {

    /* renamed from: r  reason: collision with root package name */
    public final InterfaceC0141j f12164r;

    /* renamed from: s  reason: collision with root package name */
    public final long f12165s;

    /* renamed from: t  reason: collision with root package name */
    public long f12166t;

    /* renamed from: v  reason: collision with root package name */
    public int f12168v;

    /* renamed from: w  reason: collision with root package name */
    public int f12169w;

    /* renamed from: u  reason: collision with root package name */
    public byte[] f12167u = new byte[65536];

    /* renamed from: q  reason: collision with root package name */
    public final byte[] f12163q = new byte[4096];

    static {
        AbstractC0592I.a("goog.exo.extractor");
    }

    public C0943h(InterfaceC0141j interfaceC0141j, long j7, long j8) {
        this.f12164r = interfaceC0141j;
        this.f12166t = j7;
        this.f12165s = j8;
    }

    public final boolean a(int i7, boolean z7) {
        h(i7);
        int i8 = this.f12169w - this.f12168v;
        while (i8 < i7) {
            i8 = l(this.f12167u, this.f12168v, i7, i8, z7);
            if (i8 == -1) {
                return false;
            }
            this.f12169w = this.f12168v + i8;
        }
        this.f12168v += i7;
        return true;
    }

    @Override // k2.InterfaceC0947l
    public final void b() {
        this.f12168v = 0;
    }

    @Override // k2.InterfaceC0947l
    public final void d(int i7) {
        int min = Math.min(this.f12169w, i7);
        t(min);
        int i8 = min;
        while (i8 < i7 && i8 != -1) {
            i8 = l(this.f12163q, -i8, Math.min(i7, this.f12163q.length + i8), i8, false);
        }
        if (i8 != -1) {
            this.f12166t += i8;
        }
    }

    @Override // k2.InterfaceC0947l
    public final boolean e(byte[] bArr, int i7, int i8, boolean z7) {
        int min;
        int i9 = this.f12169w;
        if (i9 == 0) {
            min = 0;
        } else {
            min = Math.min(i9, i8);
            System.arraycopy(this.f12167u, 0, bArr, i7, min);
            t(min);
        }
        int i10 = min;
        while (i10 < i8 && i10 != -1) {
            i10 = l(bArr, i7, i8, i10, z7);
        }
        if (i10 != -1) {
            this.f12166t += i10;
        }
        if (i10 == -1) {
            return false;
        }
        return true;
    }

    @Override // k2.InterfaceC0947l
    public final long f() {
        return this.f12165s;
    }

    public final void h(int i7) {
        int i8 = this.f12168v + i7;
        byte[] bArr = this.f12167u;
        if (i8 > bArr.length) {
            this.f12167u = Arrays.copyOf(this.f12167u, H.j(bArr.length * 2, 65536 + i8, i8 + 524288));
        }
    }

    @Override // k2.InterfaceC0947l
    public final boolean i(byte[] bArr, int i7, int i8, boolean z7) {
        if (!a(i8, z7)) {
            return false;
        }
        System.arraycopy(this.f12167u, this.f12168v - i8, bArr, i7, i8);
        return true;
    }

    @Override // k2.InterfaceC0947l
    public final long j() {
        return this.f12166t + this.f12168v;
    }

    public final int k(byte[] bArr, int i7, int i8) {
        int min;
        h(i8);
        int i9 = this.f12169w;
        int i10 = this.f12168v;
        int i11 = i9 - i10;
        if (i11 == 0) {
            min = l(this.f12167u, i10, i8, 0, true);
            if (min == -1) {
                return -1;
            }
            this.f12169w += min;
        } else {
            min = Math.min(i8, i11);
        }
        System.arraycopy(this.f12167u, this.f12168v, bArr, i7, min);
        this.f12168v += min;
        return min;
    }

    public final int l(byte[] bArr, int i7, int i8, int i9, boolean z7) {
        if (!Thread.interrupted()) {
            int r3 = this.f12164r.r(bArr, i7 + i9, i8 - i9);
            if (r3 == -1) {
                if (i9 == 0 && z7) {
                    return -1;
                }
                throw new EOFException();
            }
            return i9 + r3;
        }
        throw new InterruptedIOException();
    }

    @Override // k2.InterfaceC0947l
    public final void o(byte[] bArr, int i7, int i8) {
        i(bArr, i7, i8, false);
    }

    @Override // k2.InterfaceC0947l
    public final void p(int i7) {
        a(i7, false);
    }

    public final int q(int i7) {
        int min = Math.min(this.f12169w, i7);
        t(min);
        if (min == 0) {
            byte[] bArr = this.f12163q;
            min = l(bArr, 0, Math.min(i7, bArr.length), 0, true);
        }
        if (min != -1) {
            this.f12166t += min;
        }
        return min;
    }

    @Override // Y2.InterfaceC0141j
    public final int r(byte[] bArr, int i7, int i8) {
        int i9 = this.f12169w;
        int i10 = 0;
        if (i9 != 0) {
            int min = Math.min(i9, i8);
            System.arraycopy(this.f12167u, 0, bArr, i7, min);
            t(min);
            i10 = min;
        }
        if (i10 == 0) {
            i10 = l(bArr, i7, i8, 0, true);
        }
        if (i10 != -1) {
            this.f12166t += i10;
        }
        return i10;
    }

    @Override // k2.InterfaceC0947l
    public final void readFully(byte[] bArr, int i7, int i8) {
        e(bArr, i7, i8, false);
    }

    @Override // k2.InterfaceC0947l
    public final long s() {
        return this.f12166t;
    }

    public final void t(int i7) {
        byte[] bArr;
        int i8 = this.f12169w - i7;
        this.f12169w = i8;
        this.f12168v = 0;
        byte[] bArr2 = this.f12167u;
        if (i8 < bArr2.length - 524288) {
            bArr = new byte[65536 + i8];
        } else {
            bArr = bArr2;
        }
        System.arraycopy(bArr2, i7, bArr, 0, i8);
        this.f12167u = bArr;
    }
}
