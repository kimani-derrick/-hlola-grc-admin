package t2;

import O3.E;
import Z2.AbstractC0156a;
import Z2.C0163h;
import Z2.y;
import e2.C0593J;
import e2.K;
import e2.m0;
import g2.O;
import java.util.ArrayList;
import java.util.Arrays;
import k.C0852F;
import x2.C1461c;
/* loaded from: classes.dex */
public final class k extends j {
    public C0163h n;

    /* renamed from: o  reason: collision with root package name */
    public int f14569o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f14570p;

    /* renamed from: q  reason: collision with root package name */
    public O f14571q;

    /* renamed from: r  reason: collision with root package name */
    public C0852F f14572r;

    @Override // t2.j
    public final void a(long j7) {
        boolean z7;
        this.f14562g = j7;
        int i7 = 0;
        if (j7 != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.f14570p = z7;
        O o7 = this.f14571q;
        if (o7 != null) {
            i7 = o7.f10606e;
        }
        this.f14569o = i7;
    }

    @Override // t2.j
    public final long b(y yVar) {
        int i7;
        int i8 = 0;
        byte b7 = yVar.f4691a[0];
        if ((b7 & 1) == 1) {
            return -1L;
        }
        C0163h c0163h = this.n;
        AbstractC0156a.l(c0163h);
        boolean z7 = ((X0.j[]) c0163h.f4639v)[(b7 >> 1) & (255 >>> (8 - c0163h.f4635r))].f4072a;
        O o7 = (O) c0163h.f4636s;
        if (!z7) {
            i7 = o7.f10606e;
        } else {
            i7 = o7.f;
        }
        if (this.f14570p) {
            i8 = (this.f14569o + i7) / 4;
        }
        long j7 = i8;
        byte[] bArr = yVar.f4691a;
        int length = bArr.length;
        int i9 = yVar.f4693c + 4;
        if (length < i9) {
            byte[] copyOf = Arrays.copyOf(bArr, i9);
            yVar.D(copyOf.length, copyOf);
        } else {
            yVar.E(i9);
        }
        byte[] bArr2 = yVar.f4691a;
        int i10 = yVar.f4693c;
        bArr2[i10 - 4] = (byte) (j7 & 255);
        bArr2[i10 - 3] = (byte) ((j7 >>> 8) & 255);
        bArr2[i10 - 2] = (byte) ((j7 >>> 16) & 255);
        bArr2[i10 - 1] = (byte) ((j7 >>> 24) & 255);
        this.f14570p = true;
        this.f14569o = i7;
        return j7;
    }

    /* JADX WARN: Type inference failed for: r8v8, types: [g2.O, java.lang.Object] */
    @Override // t2.j
    public final boolean c(y yVar, long j7, i iVar) {
        C0163h c0163h;
        int i7;
        O o7;
        int i8;
        O o8;
        byte[] bArr;
        long j8;
        int i9;
        if (this.n != null) {
            ((K) iVar.f14556r).getClass();
            return false;
        }
        O o9 = this.f14571q;
        int i10 = 4;
        if (o9 == null) {
            h4.b.I(1, yVar, false);
            yVar.m();
            int u7 = yVar.u();
            int m7 = yVar.m();
            int i11 = yVar.i();
            if (i11 <= 0) {
                i11 = -1;
            }
            int i12 = yVar.i();
            if (i12 <= 0) {
                i9 = -1;
            } else {
                i9 = i12;
            }
            yVar.i();
            int u8 = yVar.u();
            int pow = (int) Math.pow(2.0d, (u8 & 240) >> 4);
            yVar.u();
            byte[] copyOf = Arrays.copyOf(yVar.f4691a, yVar.f4693c);
            ?? obj = new Object();
            obj.f10603a = u7;
            obj.f10604b = m7;
            obj.f10605c = i11;
            obj.d = i9;
            obj.f10606e = (int) Math.pow(2.0d, u8 & 15);
            obj.f = pow;
            obj.f10607g = copyOf;
            this.f14571q = obj;
        } else {
            C0852F c0852f = this.f14572r;
            if (c0852f == null) {
                this.f14572r = h4.b.F(yVar, true, true);
            } else {
                int i13 = yVar.f4693c;
                byte[] bArr2 = new byte[i13];
                System.arraycopy(yVar.f4691a, 0, bArr2, 0, i13);
                int i14 = 5;
                h4.b.I(5, yVar, false);
                int u9 = yVar.u() + 1;
                N2.f fVar = new N2.f(yVar.f4691a);
                fVar.s(yVar.f4692b * 8);
                int i15 = 0;
                while (true) {
                    int i16 = 2;
                    int i17 = 16;
                    if (i15 < u9) {
                        if (fVar.i(24) == 5653314) {
                            int i18 = fVar.i(16);
                            int i19 = fVar.i(24);
                            if (!fVar.h()) {
                                boolean h7 = fVar.h();
                                for (int i20 = 0; i20 < i19; i20++) {
                                    if (!h7 || fVar.h()) {
                                        fVar.s(i14);
                                    }
                                }
                            } else {
                                fVar.s(i14);
                                for (int i21 = 0; i21 < i19; i21 += fVar.i(h4.b.y(i19 - i21))) {
                                }
                            }
                            int i22 = fVar.i(i10);
                            if (i22 <= 2) {
                                if (i22 != 1 && i22 != 2) {
                                    o8 = o9;
                                    bArr = bArr2;
                                } else {
                                    fVar.s(32);
                                    fVar.s(32);
                                    int i23 = fVar.i(i10) + 1;
                                    fVar.s(1);
                                    if (i22 == 1) {
                                        if (i18 != 0) {
                                            o8 = o9;
                                            bArr = bArr2;
                                            j8 = (long) Math.floor(Math.pow(i19, 1.0d / i18));
                                        } else {
                                            o8 = o9;
                                            bArr = bArr2;
                                            j8 = 0;
                                        }
                                    } else {
                                        o8 = o9;
                                        bArr = bArr2;
                                        j8 = i19 * i18;
                                    }
                                    fVar.s((int) (j8 * i23));
                                }
                                i15++;
                                o9 = o8;
                                bArr2 = bArr;
                                i10 = 4;
                                i14 = 5;
                            } else {
                                throw m0.a("lookup type greater than 2 not decodable: " + i22, null);
                            }
                        } else {
                            throw m0.a("expected code book to start with [0x56, 0x43, 0x42] at " + ((fVar.d * 8) + fVar.f2474e), null);
                        }
                    } else {
                        O o10 = o9;
                        byte[] bArr3 = bArr2;
                        int i24 = 6;
                        int i25 = fVar.i(6) + 1;
                        for (int i26 = 0; i26 < i25; i26++) {
                            if (fVar.i(16) != 0) {
                                throw m0.a("placeholder of time domain transforms not zeroed out", null);
                            }
                        }
                        int i27 = fVar.i(6) + 1;
                        int i28 = 0;
                        while (true) {
                            int i29 = 3;
                            if (i28 < i27) {
                                int i30 = fVar.i(i17);
                                if (i30 != 0) {
                                    if (i30 == 1) {
                                        int i31 = fVar.i(5);
                                        int[] iArr = new int[i31];
                                        int i32 = -1;
                                        for (int i33 = 0; i33 < i31; i33++) {
                                            int i34 = fVar.i(4);
                                            iArr[i33] = i34;
                                            if (i34 > i32) {
                                                i32 = i34;
                                            }
                                        }
                                        int i35 = i32 + 1;
                                        int[] iArr2 = new int[i35];
                                        int i36 = 0;
                                        while (i36 < i35) {
                                            iArr2[i36] = fVar.i(i29) + 1;
                                            int i37 = fVar.i(i16);
                                            int i38 = 8;
                                            if (i37 > 0) {
                                                fVar.s(8);
                                            }
                                            int i39 = 0;
                                            while (i39 < (1 << i37)) {
                                                fVar.s(i38);
                                                i39++;
                                                i38 = 8;
                                            }
                                            i36++;
                                            i29 = 3;
                                            i16 = 2;
                                        }
                                        fVar.s(i16);
                                        int i40 = fVar.i(4);
                                        int i41 = 0;
                                        int i42 = 0;
                                        for (int i43 = 0; i43 < i31; i43++) {
                                            i41 += iArr2[iArr[i43]];
                                            while (i42 < i41) {
                                                fVar.s(i40);
                                                i42++;
                                            }
                                        }
                                    } else {
                                        throw m0.a("floor type greater than 1 not decodable: " + i30, null);
                                    }
                                } else {
                                    int i44 = 8;
                                    fVar.s(8);
                                    fVar.s(16);
                                    fVar.s(16);
                                    fVar.s(6);
                                    fVar.s(8);
                                    int i45 = fVar.i(4) + 1;
                                    int i46 = 0;
                                    while (i46 < i45) {
                                        fVar.s(i44);
                                        i46++;
                                        i44 = 8;
                                    }
                                }
                                i28++;
                                i24 = 6;
                                i17 = 16;
                                i16 = 2;
                            } else {
                                int i47 = fVar.i(i24) + 1;
                                int i48 = 0;
                                while (i48 < i47) {
                                    if (fVar.i(16) <= 2) {
                                        fVar.s(24);
                                        fVar.s(24);
                                        fVar.s(24);
                                        int i49 = fVar.i(i24) + 1;
                                        int i50 = 8;
                                        fVar.s(8);
                                        int[] iArr3 = new int[i49];
                                        for (int i51 = 0; i51 < i49; i51++) {
                                            int i52 = fVar.i(3);
                                            if (fVar.h()) {
                                                i8 = fVar.i(5);
                                            } else {
                                                i8 = 0;
                                            }
                                            iArr3[i51] = (i8 * 8) + i52;
                                        }
                                        int i53 = 0;
                                        while (i53 < i49) {
                                            int i54 = 0;
                                            while (i54 < i50) {
                                                if ((iArr3[i53] & (1 << i54)) != 0) {
                                                    fVar.s(i50);
                                                }
                                                i54++;
                                                i50 = 8;
                                            }
                                            i53++;
                                            i50 = 8;
                                        }
                                        i48++;
                                        i24 = 6;
                                    } else {
                                        throw m0.a("residueType greater than 2 is not decodable", null);
                                    }
                                }
                                int i55 = fVar.i(i24) + 1;
                                int i56 = 0;
                                while (i56 < i55) {
                                    int i57 = fVar.i(16);
                                    if (i57 != 0) {
                                        AbstractC0156a.q("VorbisUtil", "mapping type other than 0 not supported: " + i57);
                                        o7 = o10;
                                    } else {
                                        if (fVar.h()) {
                                            i7 = fVar.i(4) + 1;
                                        } else {
                                            i7 = 1;
                                        }
                                        boolean h8 = fVar.h();
                                        o7 = o10;
                                        int i58 = o7.f10603a;
                                        if (h8) {
                                            int i59 = fVar.i(8) + 1;
                                            for (int i60 = 0; i60 < i59; i60++) {
                                                int i61 = i58 - 1;
                                                fVar.s(h4.b.y(i61));
                                                fVar.s(h4.b.y(i61));
                                            }
                                        }
                                        if (fVar.i(2) == 0) {
                                            if (i7 > 1) {
                                                for (int i62 = 0; i62 < i58; i62++) {
                                                    fVar.s(4);
                                                }
                                            }
                                            for (int i63 = 0; i63 < i7; i63++) {
                                                fVar.s(8);
                                                fVar.s(8);
                                                fVar.s(8);
                                            }
                                        } else {
                                            throw m0.a("to reserved bits must be zero after mapping coupling steps", null);
                                        }
                                    }
                                    i56++;
                                    o10 = o7;
                                }
                                O o11 = o10;
                                int i64 = fVar.i(6);
                                int i65 = i64 + 1;
                                X0.j[] jVarArr = new X0.j[i65];
                                for (int i66 = 0; i66 < i65; i66++) {
                                    boolean h9 = fVar.h();
                                    fVar.i(16);
                                    fVar.i(16);
                                    fVar.i(8);
                                    jVarArr[i66] = new X0.j(h9);
                                }
                                if (fVar.h()) {
                                    c0163h = new C0163h(o11, c0852f, bArr3, jVarArr, h4.b.y(i64));
                                } else {
                                    throw m0.a("framing bit after modes not set as expected", null);
                                }
                            }
                        }
                    }
                }
            }
        }
        c0163h = null;
        this.n = c0163h;
        if (c0163h == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        O o12 = (O) c0163h.f4636s;
        arrayList.add((byte[]) o12.f10607g);
        arrayList.add((byte[]) c0163h.f4638u);
        C1461c D6 = h4.b.D(E.t((String[]) ((C0852F) c0163h.f4637t).f11874r));
        C0593J c0593j = new C0593J();
        c0593j.f9605k = "audio/vorbis";
        c0593j.f = o12.d;
        c0593j.f9601g = o12.f10605c;
        c0593j.f9617x = o12.f10603a;
        c0593j.f9618y = o12.f10604b;
        c0593j.f9607m = arrayList;
        c0593j.f9603i = D6;
        iVar.f14556r = new K(c0593j);
        return true;
    }

    @Override // t2.j
    public final void d(boolean z7) {
        super.d(z7);
        if (z7) {
            this.n = null;
            this.f14571q = null;
            this.f14572r = null;
        }
        this.f14569o = 0;
        this.f14570p = false;
    }
}
