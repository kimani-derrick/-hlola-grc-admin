package E2;

import Z2.E;
import Z2.y;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import x2.C1461c;
import x2.C1463e;
import x2.InterfaceC1460b;
/* loaded from: classes.dex */
public final class c extends h4.b {

    /* renamed from: a  reason: collision with root package name */
    public final y f576a = new y();

    /* renamed from: b  reason: collision with root package name */
    public final N2.f f577b = new N2.f();

    /* renamed from: c  reason: collision with root package name */
    public E f578c;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // h4.b
    public final C1461c q(C1463e c1463e, ByteBuffer byteBuffer) {
        Object obj;
        boolean z7;
        int i7;
        int i8;
        long j7;
        ArrayList arrayList;
        long j8;
        long j9;
        boolean z8;
        boolean z9;
        boolean z10;
        int i9;
        int i10;
        int i11;
        boolean z11;
        boolean z12;
        boolean z13;
        long j10;
        long j11;
        boolean z14;
        boolean z15;
        List list;
        long j12;
        long j13;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        int i12;
        int i13;
        int i14;
        boolean z20;
        boolean z21;
        boolean z22;
        boolean z23;
        long j14;
        boolean z24;
        long j15;
        int i15 = 32;
        boolean z25 = true;
        E e3 = this.f578c;
        if (e3 == null || c1463e.f16209z != e3.d()) {
            E e7 = new E(c1463e.f11353v);
            this.f578c = e7;
            e7.a(c1463e.f11353v - c1463e.f16209z);
        }
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        y yVar = this.f576a;
        yVar.D(limit, array);
        N2.f fVar = this.f577b;
        fVar.n(limit, array);
        fVar.s(39);
        long i16 = (fVar.i(1) << 32) | fVar.i(32);
        fVar.s(20);
        int i17 = fVar.i(12);
        int i18 = fVar.i(8);
        yVar.G(14);
        if (i18 != 0) {
            if (i18 != 255) {
                long j16 = 1;
                long j17 = -9223372036854775807L;
                if (i18 != 4) {
                    if (i18 != 5) {
                        if (i18 != 6) {
                            obj = null;
                        } else {
                            E e8 = this.f578c;
                            long a7 = j.a(i16, yVar);
                            obj = new j(a7, e8.b(a7));
                        }
                    } else {
                        E e9 = this.f578c;
                        long v5 = yVar.v();
                        if ((yVar.u() & 128) != 0) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        List emptyList = Collections.emptyList();
                        if (!z15) {
                            int u7 = yVar.u();
                            if ((u7 & 128) != 0) {
                                z20 = true;
                            } else {
                                z20 = false;
                            }
                            if ((u7 & 64) != 0) {
                                z21 = true;
                            } else {
                                z21 = false;
                            }
                            if ((u7 & 32) != 0) {
                                z22 = true;
                            } else {
                                z22 = false;
                            }
                            if ((u7 & 16) != 0) {
                                z23 = true;
                            } else {
                                z23 = false;
                            }
                            if (z21 && !z23) {
                                j14 = j.a(i16, yVar);
                            } else {
                                j14 = -9223372036854775807L;
                            }
                            if (!z21) {
                                int u8 = yVar.u();
                                ArrayList arrayList2 = new ArrayList(u8);
                                for (int i19 = 0; i19 < u8; i19++) {
                                    int u9 = yVar.u();
                                    if (!z23) {
                                        j15 = j.a(i16, yVar);
                                    } else {
                                        j15 = -9223372036854775807L;
                                    }
                                    arrayList2.add(new d(u9, j15, e9.b(j15)));
                                }
                                emptyList = arrayList2;
                            }
                            if (z22) {
                                long u10 = yVar.u();
                                if ((u10 & 128) != 0) {
                                    z24 = true;
                                } else {
                                    z24 = false;
                                }
                                j17 = ((((u10 & 1) << 32) | yVar.v()) * 1000) / 90;
                            } else {
                                z24 = false;
                            }
                            int z26 = yVar.z();
                            int u11 = yVar.u();
                            z19 = z24;
                            i12 = z26;
                            list = emptyList;
                            i14 = yVar.u();
                            i13 = u11;
                            z16 = z20;
                            j13 = j17;
                            j12 = j14;
                            z18 = z23;
                            z17 = z21;
                        } else {
                            list = emptyList;
                            j12 = -9223372036854775807L;
                            j13 = -9223372036854775807L;
                            z16 = false;
                            z17 = false;
                            z18 = false;
                            z19 = false;
                            i12 = 0;
                            i13 = 0;
                            i14 = 0;
                        }
                        obj = new e(v5, z15, z16, z17, z18, j12, e9.b(j12), list, z19, j13, i12, i13, i14);
                    }
                } else {
                    int u12 = yVar.u();
                    ArrayList arrayList3 = new ArrayList(u12);
                    int i20 = 0;
                    while (i20 < u12) {
                        long v7 = yVar.v();
                        if ((yVar.u() & 128) != 0) {
                            z7 = z25;
                        } else {
                            z7 = false;
                        }
                        ArrayList arrayList4 = new ArrayList();
                        if (!z7) {
                            int u13 = yVar.u();
                            if ((u13 & 128) != 0) {
                                z11 = z25;
                            } else {
                                z11 = false;
                            }
                            if ((u13 & 64) != 0) {
                                z12 = z25;
                            } else {
                                z12 = false;
                            }
                            if ((u13 & i15) != 0) {
                                z13 = z25;
                            } else {
                                z13 = false;
                            }
                            if (z12) {
                                j10 = yVar.v();
                            } else {
                                j10 = -9223372036854775807L;
                            }
                            if (!z12) {
                                int u14 = yVar.u();
                                ArrayList arrayList5 = new ArrayList(u14);
                                int i21 = 0;
                                while (i21 < u14) {
                                    arrayList5.add(new g(yVar.v(), yVar.u()));
                                    i21++;
                                    i20 = i20;
                                }
                                i8 = i20;
                                arrayList4 = arrayList5;
                            } else {
                                i8 = i20;
                            }
                            if (z13) {
                                long u15 = yVar.u();
                                if ((u15 & 128) != 0) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                j7 = 1;
                                i7 = 32;
                                j11 = ((((u15 & 1) << 32) | yVar.v()) * 1000) / 90;
                            } else {
                                i7 = 32;
                                j7 = 1;
                                j11 = -9223372036854775807L;
                                z14 = false;
                            }
                            j9 = j11;
                            z10 = z14;
                            arrayList = arrayList4;
                            z8 = z11;
                            z9 = z12;
                            j8 = j10;
                            i9 = yVar.z();
                            i10 = yVar.u();
                            i11 = yVar.u();
                        } else {
                            i7 = i15;
                            i8 = i20;
                            j7 = j16;
                            arrayList = arrayList4;
                            j8 = -9223372036854775807L;
                            j9 = -9223372036854775807L;
                            z8 = false;
                            z9 = false;
                            z10 = false;
                            i9 = 0;
                            i10 = 0;
                            i11 = 0;
                        }
                        arrayList3.add(new h(v7, z7, z8, z9, arrayList, j8, z10, j9, i9, i10, i11));
                        i20 = i8 + 1;
                        z25 = true;
                        i15 = i7;
                        j16 = j7;
                    }
                    obj = new i(arrayList3);
                }
            } else {
                long v8 = yVar.v();
                int i22 = i17 - 4;
                byte[] bArr = new byte[i22];
                yVar.e(bArr, 0, i22);
                obj = new a(v8, bArr, i16);
            }
        } else {
            obj = new Object();
        }
        if (obj == null) {
            return new C1461c(new InterfaceC1460b[0]);
        }
        return new C1461c(obj);
    }
}
