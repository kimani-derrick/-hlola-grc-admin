package u2;

import Z2.AbstractC0156a;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import k2.InterfaceC0948m;
/* loaded from: classes.dex */
public final class v implements G {

    /* renamed from: a  reason: collision with root package name */
    public final h f14918a;

    /* renamed from: b  reason: collision with root package name */
    public final N2.f f14919b = new N2.f(10, new byte[10]);

    /* renamed from: c  reason: collision with root package name */
    public int f14920c = 0;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public Z2.E f14921e;
    public boolean f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f14922g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f14923h;

    /* renamed from: i  reason: collision with root package name */
    public int f14924i;

    /* renamed from: j  reason: collision with root package name */
    public int f14925j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f14926k;

    /* renamed from: l  reason: collision with root package name */
    public long f14927l;

    public v(h hVar) {
        this.f14918a = hVar;
    }

    @Override // u2.G
    public final void a() {
        this.f14920c = 0;
        this.d = 0;
        this.f14923h = false;
        this.f14918a.a();
    }

    @Override // u2.G
    public final void b(Z2.E e3, InterfaceC0948m interfaceC0948m, F f) {
        this.f14921e = e3;
        this.f14918a.f(interfaceC0948m, f);
    }

    @Override // u2.G
    public final void c(int i7, Z2.y yVar) {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        AbstractC0156a.l(this.f14921e);
        int i13 = i7 & 1;
        h hVar = this.f14918a;
        int i14 = -1;
        int i15 = 3;
        int i16 = 2;
        if (i13 != 0) {
            int i17 = this.f14920c;
            if (i17 != 0 && i17 != 1) {
                if (i17 != 2) {
                    if (i17 == 3) {
                        if (this.f14925j != -1) {
                            AbstractC0156a.K("PesReader", "Unexpected start indicator: expected " + this.f14925j + " more bytes");
                        }
                        hVar.d();
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    AbstractC0156a.K("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            this.f14920c = 1;
            this.d = 0;
        }
        int i18 = i7;
        while (yVar.a() > 0) {
            int i19 = this.f14920c;
            if (i19 != 0) {
                N2.f fVar = this.f14919b;
                if (i19 != 1) {
                    if (i19 != i16) {
                        if (i19 == i15) {
                            int a7 = yVar.a();
                            int i20 = this.f14925j;
                            if (i20 == i14) {
                                i12 = 0;
                            } else {
                                i12 = a7 - i20;
                            }
                            if (i12 > 0) {
                                a7 -= i12;
                                yVar.E(yVar.f4692b + a7);
                            }
                            hVar.c(yVar);
                            int i21 = this.f14925j;
                            if (i21 != i14) {
                                int i22 = i21 - a7;
                                this.f14925j = i22;
                                if (i22 == 0) {
                                    hVar.d();
                                    this.f14920c = 1;
                                    this.d = 0;
                                }
                            }
                            i8 = i16;
                            int i23 = i15;
                            i9 = i14;
                            i10 = i23;
                        } else {
                            throw new IllegalStateException();
                        }
                    } else {
                        if (d(yVar, fVar.f2472b, Math.min(10, this.f14924i)) && d(yVar, null, this.f14924i)) {
                            fVar.p(0);
                            this.f14927l = -9223372036854775807L;
                            int i24 = 4;
                            if (this.f) {
                                fVar.s(4);
                                fVar.s(1);
                                long i25 = fVar.i(15) << 15;
                                fVar.s(1);
                                long i26 = i25 | (fVar.i(i15) << 30) | fVar.i(15);
                                fVar.s(1);
                                if (!this.f14923h && this.f14922g) {
                                    fVar.s(4);
                                    fVar.s(1);
                                    fVar.s(1);
                                    fVar.s(1);
                                    this.f14921e.b((fVar.i(3) << 30) | (fVar.i(15) << 15) | fVar.i(15));
                                    this.f14923h = true;
                                }
                                this.f14927l = this.f14921e.b(i26);
                            }
                            if (!this.f14926k) {
                                i24 = 0;
                            }
                            i18 |= i24;
                            hVar.e(this.f14927l, i18);
                            this.f14920c = 3;
                            this.d = 0;
                            i15 = 3;
                            i14 = -1;
                            i16 = 2;
                        } else {
                            i10 = i15;
                            i8 = i16;
                            i9 = -1;
                        }
                    }
                } else {
                    i10 = i15;
                    if (d(yVar, fVar.f2472b, 9)) {
                        fVar.p(0);
                        int i27 = fVar.i(24);
                        if (i27 != 1) {
                            AbstractC0515y1.q(i27, "Unexpected start code prefix: ", "PesReader");
                            this.f14925j = -1;
                            i11 = 0;
                            i9 = -1;
                            i8 = 2;
                        } else {
                            fVar.s(8);
                            int i28 = fVar.i(16);
                            fVar.s(5);
                            this.f14926k = fVar.h();
                            i8 = 2;
                            fVar.s(2);
                            this.f = fVar.h();
                            this.f14922g = fVar.h();
                            fVar.s(6);
                            int i29 = fVar.i(8);
                            this.f14924i = i29;
                            if (i28 == 0) {
                                this.f14925j = -1;
                                i9 = -1;
                            } else {
                                int i30 = (i28 - 3) - i29;
                                this.f14925j = i30;
                                if (i30 < 0) {
                                    AbstractC0156a.K("PesReader", "Found negative packet payload size: " + this.f14925j);
                                    i9 = -1;
                                    this.f14925j = -1;
                                } else {
                                    i9 = -1;
                                }
                            }
                            i11 = 2;
                        }
                        this.f14920c = i11;
                        this.d = 0;
                    } else {
                        i9 = -1;
                        i8 = 2;
                    }
                }
            } else {
                i8 = i16;
                int i31 = i15;
                i9 = i14;
                i10 = i31;
                yVar.G(yVar.a());
            }
            i16 = i8;
            int i32 = i9;
            i15 = i10;
            i14 = i32;
        }
    }

    public final boolean d(Z2.y yVar, byte[] bArr, int i7) {
        int min = Math.min(yVar.a(), i7 - this.d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            yVar.G(min);
        } else {
            yVar.e(bArr, this.d, min);
        }
        int i8 = this.d + min;
        this.d = i8;
        if (i8 == i7) {
            return true;
        }
        return false;
    }
}
