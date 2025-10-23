package u2;

import Z2.AbstractC0156a;
import e2.C0593J;
import e2.K;
import g2.O;
import k2.InterfaceC0948m;
/* loaded from: classes.dex */
public final class t implements h {

    /* renamed from: a  reason: collision with root package name */
    public final Z2.y f14904a;

    /* renamed from: b  reason: collision with root package name */
    public final O f14905b;

    /* renamed from: c  reason: collision with root package name */
    public final String f14906c;
    public k2.w d;

    /* renamed from: e  reason: collision with root package name */
    public String f14907e;
    public int f = 0;

    /* renamed from: g  reason: collision with root package name */
    public int f14908g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f14909h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f14910i;

    /* renamed from: j  reason: collision with root package name */
    public long f14911j;

    /* renamed from: k  reason: collision with root package name */
    public int f14912k;

    /* renamed from: l  reason: collision with root package name */
    public long f14913l;

    /* JADX WARN: Type inference failed for: r0v1, types: [g2.O, java.lang.Object] */
    public t(String str) {
        Z2.y yVar = new Z2.y(4);
        this.f14904a = yVar;
        yVar.f4691a[0] = -1;
        this.f14905b = new Object();
        this.f14913l = -9223372036854775807L;
        this.f14906c = str;
    }

    @Override // u2.h
    public final void a() {
        this.f = 0;
        this.f14908g = 0;
        this.f14910i = false;
        this.f14913l = -9223372036854775807L;
    }

    @Override // u2.h
    public final void c(Z2.y yVar) {
        boolean z7;
        boolean z8;
        AbstractC0156a.l(this.d);
        while (yVar.a() > 0) {
            int i7 = this.f;
            Z2.y yVar2 = this.f14904a;
            if (i7 != 0) {
                if (i7 != 1) {
                    if (i7 == 2) {
                        int min = Math.min(yVar.a(), this.f14912k - this.f14908g);
                        this.d.d(min, yVar);
                        int i8 = this.f14908g + min;
                        this.f14908g = i8;
                        int i9 = this.f14912k;
                        if (i8 >= i9) {
                            long j7 = this.f14913l;
                            if (j7 != -9223372036854775807L) {
                                this.d.c(j7, 1, i9, 0, null);
                                this.f14913l += this.f14911j;
                            }
                            this.f14908g = 0;
                            this.f = 0;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    int min2 = Math.min(yVar.a(), 4 - this.f14908g);
                    yVar.e(yVar2.f4691a, this.f14908g, min2);
                    int i10 = this.f14908g + min2;
                    this.f14908g = i10;
                    if (i10 >= 4) {
                        yVar2.F(0);
                        int g7 = yVar2.g();
                        O o7 = this.f14905b;
                        if (!o7.b(g7)) {
                            this.f14908g = 0;
                            this.f = 1;
                        } else {
                            this.f14912k = o7.f10604b;
                            if (!this.f14909h) {
                                int i11 = o7.f10605c;
                                this.f14911j = (o7.f * 1000000) / i11;
                                C0593J c0593j = new C0593J();
                                c0593j.f9597a = this.f14907e;
                                c0593j.f9605k = (String) o7.f10607g;
                                c0593j.f9606l = 4096;
                                c0593j.f9617x = o7.d;
                                c0593j.f9618y = i11;
                                c0593j.f9599c = this.f14906c;
                                this.d.e(new K(c0593j));
                                this.f14909h = true;
                            }
                            yVar2.F(0);
                            this.d.d(4, yVar2);
                            this.f = 2;
                        }
                    }
                }
            } else {
                byte[] bArr = yVar.f4691a;
                int i12 = yVar.f4692b;
                int i13 = yVar.f4693c;
                while (true) {
                    if (i12 < i13) {
                        byte b7 = bArr[i12];
                        if ((b7 & 255) == 255) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        if (this.f14910i && (b7 & 224) == 224) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        this.f14910i = z7;
                        if (z8) {
                            yVar.F(i12 + 1);
                            this.f14910i = false;
                            yVar2.f4691a[1] = bArr[i12];
                            this.f14908g = 2;
                            this.f = 1;
                            break;
                        }
                        i12++;
                    } else {
                        yVar.F(i13);
                        break;
                    }
                }
            }
        }
    }

    @Override // u2.h
    public final void e(long j7, int i7) {
        if (j7 != -9223372036854775807L) {
            this.f14913l = j7;
        }
    }

    @Override // u2.h
    public final void f(InterfaceC0948m interfaceC0948m, F f) {
        f.a();
        f.b();
        this.f14907e = f.f14725e;
        f.b();
        this.d = interfaceC0948m.q(f.d, 1);
    }

    @Override // u2.h
    public final void d() {
    }
}
