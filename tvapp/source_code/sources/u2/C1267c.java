package u2;

import k2.C0943h;
import k2.C0950o;
import k2.InterfaceC0946k;
import k2.InterfaceC0947l;
import k2.InterfaceC0948m;
/* renamed from: u2.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1267c implements InterfaceC0946k {

    /* renamed from: a  reason: collision with root package name */
    public final C1266b f14740a = new C1266b(null, 1);

    /* renamed from: b  reason: collision with root package name */
    public final Z2.y f14741b = new Z2.y(16384);

    /* renamed from: c  reason: collision with root package name */
    public boolean f14742c;

    @Override // k2.InterfaceC0946k
    public final int d(InterfaceC0947l interfaceC0947l, U4.k kVar) {
        Z2.y yVar = this.f14741b;
        int r3 = ((C0943h) interfaceC0947l).r(yVar.f4691a, 0, 16384);
        if (r3 == -1) {
            return -1;
        }
        yVar.F(0);
        yVar.E(r3);
        boolean z7 = this.f14742c;
        C1266b c1266b = this.f14740a;
        if (!z7) {
            c1266b.e(0L, 4);
            this.f14742c = true;
        }
        c1266b.c(yVar);
        return 0;
    }

    @Override // k2.InterfaceC0946k
    public final void e(InterfaceC0948m interfaceC0948m) {
        this.f14740a.f(interfaceC0948m, new F(0, 1));
        interfaceC0948m.l();
        interfaceC0948m.t(new C0950o(-9223372036854775807L));
    }

    @Override // k2.InterfaceC0946k
    public final void h(long j7, long j8) {
        this.f14742c = false;
        this.f14740a.a();
    }

    @Override // k2.InterfaceC0946k
    public final boolean j(InterfaceC0947l interfaceC0947l) {
        C0943h c0943h;
        int i7;
        Z2.y yVar = new Z2.y(10);
        int i8 = 0;
        while (true) {
            c0943h = (C0943h) interfaceC0947l;
            c0943h.i(yVar.f4691a, 0, 10, false);
            yVar.F(0);
            if (yVar.w() != 4801587) {
                break;
            }
            yVar.G(3);
            int t5 = yVar.t();
            i8 += t5 + 10;
            c0943h.a(t5, false);
        }
        c0943h.f12168v = 0;
        c0943h.a(i8, false);
        int i9 = 0;
        int i10 = i8;
        while (true) {
            int i11 = 7;
            c0943h.i(yVar.f4691a, 0, 7, false);
            yVar.F(0);
            int z7 = yVar.z();
            if (z7 != 44096 && z7 != 44097) {
                c0943h.f12168v = 0;
                i10++;
                if (i10 - i8 >= 8192) {
                    return false;
                }
                c0943h.a(i10, false);
                i9 = 0;
            } else {
                i9++;
                if (i9 >= 4) {
                    return true;
                }
                byte[] bArr = yVar.f4691a;
                if (bArr.length < 7) {
                    i7 = -1;
                } else {
                    int i12 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    if (i12 == 65535) {
                        i12 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
                    } else {
                        i11 = 4;
                    }
                    if (z7 == 44097) {
                        i11 += 2;
                    }
                    i7 = i12 + i11;
                }
                if (i7 == -1) {
                    return false;
                }
                c0943h.a(i7 - 7, false);
            }
        }
    }

    @Override // k2.InterfaceC0946k
    public final void a() {
    }
}
