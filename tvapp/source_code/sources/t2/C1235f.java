package t2;

import Z2.AbstractC0156a;
import Z2.y;
import e2.m0;
import java.io.EOFException;
import k2.C0943h;
/* renamed from: t2.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1235f {

    /* renamed from: a  reason: collision with root package name */
    public int f14548a;

    /* renamed from: b  reason: collision with root package name */
    public long f14549b;

    /* renamed from: c  reason: collision with root package name */
    public int f14550c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public int f14551e;
    public final int[] f = new int[255];

    /* renamed from: g  reason: collision with root package name */
    public final y f14552g = new y(255);

    public final boolean a(C0943h c0943h, boolean z7) {
        this.f14548a = 0;
        this.f14549b = 0L;
        this.f14550c = 0;
        this.d = 0;
        this.f14551e = 0;
        y yVar = this.f14552g;
        yVar.C(27);
        try {
            if (c0943h.i(yVar.f4691a, 0, 27, z7) && yVar.v() == 1332176723) {
                if (yVar.u() != 0) {
                    if (z7) {
                        return false;
                    }
                    throw m0.c("unsupported bit stream revision");
                }
                this.f14548a = yVar.u();
                this.f14549b = yVar.j();
                yVar.l();
                yVar.l();
                yVar.l();
                int u7 = yVar.u();
                this.f14550c = u7;
                this.d = u7 + 27;
                yVar.C(u7);
                try {
                    if (c0943h.i(yVar.f4691a, 0, this.f14550c, z7)) {
                        for (int i7 = 0; i7 < this.f14550c; i7++) {
                            int u8 = yVar.u();
                            this.f[i7] = u8;
                            this.f14551e += u8;
                        }
                        return true;
                    }
                } catch (EOFException e3) {
                    if (!z7) {
                        throw e3;
                    }
                }
                return false;
            }
        } catch (EOFException e7) {
            if (!z7) {
                throw e7;
            }
        }
        return false;
    }

    public final boolean b(C0943h c0943h, long j7) {
        boolean z7;
        int i7;
        if (c0943h.f12166t == c0943h.j()) {
            z7 = true;
        } else {
            z7 = false;
        }
        AbstractC0156a.f(z7);
        y yVar = this.f14552g;
        yVar.C(4);
        while (true) {
            i7 = (j7 > (-1L) ? 1 : (j7 == (-1L) ? 0 : -1));
            if (i7 != 0 && c0943h.f12166t + 4 >= j7) {
                break;
            }
            try {
                if (!c0943h.i(yVar.f4691a, 0, 4, true)) {
                    break;
                }
                yVar.F(0);
                if (yVar.v() == 1332176723) {
                    c0943h.f12168v = 0;
                    return true;
                }
                c0943h.d(1);
            } catch (EOFException unused) {
            }
        }
        do {
            if (i7 != 0 && c0943h.f12166t >= j7) {
                break;
            }
        } while (c0943h.q(1) != -1);
        return false;
    }
}
