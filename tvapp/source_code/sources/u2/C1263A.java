package u2;

import Z2.H;
import k2.InterfaceC0948m;
/* renamed from: u2.A  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1263A implements G {

    /* renamed from: a  reason: collision with root package name */
    public final z f14691a;

    /* renamed from: b  reason: collision with root package name */
    public final Z2.y f14692b = new Z2.y(32);

    /* renamed from: c  reason: collision with root package name */
    public int f14693c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f14694e;
    public boolean f;

    public C1263A(z zVar) {
        this.f14691a = zVar;
    }

    @Override // u2.G
    public final void a() {
        this.f = true;
    }

    @Override // u2.G
    public final void b(Z2.E e3, InterfaceC0948m interfaceC0948m, F f) {
        this.f14691a.b(e3, interfaceC0948m, f);
        this.f = true;
    }

    @Override // u2.G
    public final void c(int i7, Z2.y yVar) {
        boolean z7;
        int i8;
        boolean z8;
        if ((i7 & 1) != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (z7) {
            i8 = yVar.f4692b + yVar.u();
        } else {
            i8 = -1;
        }
        if (this.f) {
            if (!z7) {
                return;
            }
            this.f = false;
            yVar.F(i8);
            this.d = 0;
        }
        while (yVar.a() > 0) {
            int i9 = this.d;
            Z2.y yVar2 = this.f14692b;
            if (i9 < 3) {
                if (i9 == 0) {
                    int u7 = yVar.u();
                    yVar.F(yVar.f4692b - 1);
                    if (u7 == 255) {
                        this.f = true;
                        return;
                    }
                }
                int min = Math.min(yVar.a(), 3 - this.d);
                yVar.e(yVar2.f4691a, this.d, min);
                int i10 = this.d + min;
                this.d = i10;
                if (i10 == 3) {
                    yVar2.F(0);
                    yVar2.E(3);
                    yVar2.G(1);
                    int u8 = yVar2.u();
                    int u9 = yVar2.u();
                    if ((u8 & 128) != 0) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    this.f14694e = z8;
                    int i11 = (((u8 & 15) << 8) | u9) + 3;
                    this.f14693c = i11;
                    byte[] bArr = yVar2.f4691a;
                    if (bArr.length < i11) {
                        yVar2.b(Math.min(4098, Math.max(i11, bArr.length * 2)));
                    }
                }
            } else {
                int min2 = Math.min(yVar.a(), this.f14693c - this.d);
                yVar.e(yVar2.f4691a, this.d, min2);
                int i12 = this.d + min2;
                this.d = i12;
                int i13 = this.f14693c;
                if (i12 != i13) {
                    continue;
                } else {
                    if (this.f14694e) {
                        if (H.m(0, i13, -1, yVar2.f4691a) != 0) {
                            this.f = true;
                            return;
                        }
                        i13 = this.f14693c - 4;
                    }
                    yVar2.E(i13);
                    yVar2.F(0);
                    this.f14691a.c(yVar2);
                    this.d = 0;
                }
            }
        }
    }
}
