package u2;

import g2.AbstractC0710a;
import k2.C0943h;
import k2.C0950o;
import k2.InterfaceC0946k;
import k2.InterfaceC0947l;
import k2.InterfaceC0948m;
/* renamed from: u2.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1265a implements InterfaceC0946k {

    /* renamed from: a  reason: collision with root package name */
    public final C1266b f14726a = new C1266b(null, 0);

    /* renamed from: b  reason: collision with root package name */
    public final Z2.y f14727b = new Z2.y(2786);

    /* renamed from: c  reason: collision with root package name */
    public boolean f14728c;

    @Override // k2.InterfaceC0946k
    public final int d(InterfaceC0947l interfaceC0947l, U4.k kVar) {
        Z2.y yVar = this.f14727b;
        int r3 = ((C0943h) interfaceC0947l).r(yVar.f4691a, 0, 2786);
        if (r3 == -1) {
            return -1;
        }
        yVar.F(0);
        yVar.E(r3);
        boolean z7 = this.f14728c;
        C1266b c1266b = this.f14726a;
        if (!z7) {
            c1266b.e(0L, 4);
            this.f14728c = true;
        }
        c1266b.c(yVar);
        return 0;
    }

    @Override // k2.InterfaceC0946k
    public final void e(InterfaceC0948m interfaceC0948m) {
        this.f14726a.f(interfaceC0948m, new F(0, 1));
        interfaceC0948m.l();
        interfaceC0948m.t(new C0950o(-9223372036854775807L));
    }

    @Override // k2.InterfaceC0946k
    public final void h(long j7, long j8) {
        this.f14728c = false;
        this.f14726a.a();
    }

    @Override // k2.InterfaceC0946k
    public final boolean j(InterfaceC0947l interfaceC0947l) {
        C0943h c0943h;
        int b7;
        Z2.y yVar = new Z2.y(10);
        int i7 = 0;
        while (true) {
            c0943h = (C0943h) interfaceC0947l;
            c0943h.i(yVar.f4691a, 0, 10, false);
            yVar.F(0);
            if (yVar.w() != 4801587) {
                break;
            }
            yVar.G(3);
            int t5 = yVar.t();
            i7 += t5 + 10;
            c0943h.a(t5, false);
        }
        c0943h.f12168v = 0;
        c0943h.a(i7, false);
        int i8 = 0;
        int i9 = i7;
        while (true) {
            c0943h.i(yVar.f4691a, 0, 6, false);
            yVar.F(0);
            if (yVar.z() != 2935) {
                c0943h.f12168v = 0;
                i9++;
                if (i9 - i7 >= 8192) {
                    return false;
                }
                c0943h.a(i9, false);
                i8 = 0;
            } else {
                i8++;
                if (i8 >= 4) {
                    return true;
                }
                byte[] bArr = yVar.f4691a;
                if (bArr.length < 6) {
                    b7 = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    b7 = ((((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1) * 2;
                } else {
                    byte b8 = bArr[4];
                    b7 = AbstractC0710a.b((b8 & 192) >> 6, b8 & 63);
                }
                if (b7 == -1) {
                    return false;
                }
                c0943h.a(b7 - 6, false);
            }
        }
    }

    @Override // k2.InterfaceC0946k
    public final void a() {
    }
}
