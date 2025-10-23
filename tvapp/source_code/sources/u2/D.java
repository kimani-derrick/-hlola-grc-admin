package u2;

import Z2.AbstractC0156a;
import a.AbstractC0189a;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import e2.m0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import k2.C0943h;
import k2.C0950o;
import k2.InterfaceC0946k;
import k2.InterfaceC0947l;
import k2.InterfaceC0948m;
import n2.C1030a;
/* loaded from: classes.dex */
public final class D implements InterfaceC0946k {

    /* renamed from: a  reason: collision with root package name */
    public final int f14705a;

    /* renamed from: b  reason: collision with root package name */
    public final List f14706b;

    /* renamed from: c  reason: collision with root package name */
    public final Z2.y f14707c;
    public final SparseIntArray d;

    /* renamed from: e  reason: collision with root package name */
    public final l6.n f14708e;
    public final SparseArray f;

    /* renamed from: g  reason: collision with root package name */
    public final SparseBooleanArray f14709g;

    /* renamed from: h  reason: collision with root package name */
    public final SparseBooleanArray f14710h;

    /* renamed from: i  reason: collision with root package name */
    public final C f14711i;

    /* renamed from: j  reason: collision with root package name */
    public C1030a f14712j;

    /* renamed from: k  reason: collision with root package name */
    public InterfaceC0948m f14713k;

    /* renamed from: l  reason: collision with root package name */
    public int f14714l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f14715m;
    public boolean n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f14716o;

    /* renamed from: p  reason: collision with root package name */
    public G f14717p;

    /* renamed from: q  reason: collision with root package name */
    public int f14718q;

    /* renamed from: r  reason: collision with root package name */
    public int f14719r;

    public D(int i7, Z2.E e3, l6.n nVar) {
        this.f14708e = nVar;
        this.f14705a = i7;
        if (i7 != 1 && i7 != 2) {
            ArrayList arrayList = new ArrayList();
            this.f14706b = arrayList;
            arrayList.add(e3);
        } else {
            this.f14706b = Collections.singletonList(e3);
        }
        this.f14707c = new Z2.y(0, new byte[9400]);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f14709g = sparseBooleanArray;
        this.f14710h = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.f = sparseArray;
        this.d = new SparseIntArray();
        this.f14711i = new C();
        this.f14713k = InterfaceC0948m.f12174p;
        this.f14719r = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i8 = 0; i8 < size; i8++) {
            sparseArray.put(sparseArray2.keyAt(i8), (G) sparseArray2.valueAt(i8));
        }
        sparseArray.put(0, new C1263A(new t2.i(this)));
        this.f14717p = null;
    }

    /* JADX WARN: Type inference failed for: r13v8, types: [Y2.v, java.lang.Object, k2.e] */
    @Override // k2.InterfaceC0946k
    public final int d(InterfaceC0947l interfaceC0947l, U4.k kVar) {
        int i7;
        int i8;
        long j7;
        int i9;
        int i10;
        boolean z7;
        int i11;
        C0943h c0943h = (C0943h) interfaceC0947l;
        boolean z8 = this.f14715m;
        long j8 = c0943h.f12165s;
        int i12 = this.f14705a;
        if (z8) {
            int i13 = (j8 > (-1L) ? 1 : (j8 == (-1L) ? 0 : -1));
            long j9 = -9223372036854775807L;
            C c5 = this.f14711i;
            if (i13 != 0 && i12 != 2 && !c5.d) {
                int i14 = this.f14719r;
                if (i14 <= 0) {
                    c5.a(c0943h);
                    return 0;
                }
                boolean z9 = c5.f;
                Z2.y yVar = c5.f14700c;
                int i15 = c5.f14698a;
                if (!z9) {
                    int min = (int) Math.min(i15, j8);
                    long j10 = j8 - min;
                    if (c0943h.f12166t != j10) {
                        kVar.f3459a = j10;
                    } else {
                        yVar.C(min);
                        c0943h.f12168v = 0;
                        c0943h.i(yVar.f4691a, 0, min, false);
                        int i16 = yVar.f4692b;
                        int i17 = yVar.f4693c;
                        int i18 = i17 - 188;
                        while (true) {
                            if (i18 < i16) {
                                break;
                            }
                            byte[] bArr = yVar.f4691a;
                            int i19 = -4;
                            int i20 = 0;
                            while (true) {
                                if (i19 > 4) {
                                    break;
                                }
                                int i21 = (i19 * 188) + i18;
                                if (i21 >= i16 && i21 < i17 && bArr[i21] == 71) {
                                    i20++;
                                    if (i20 == 5) {
                                        long F = AbstractC0189a.F(yVar, i18, i14);
                                        if (F != -9223372036854775807L) {
                                            j9 = F;
                                            break;
                                        }
                                    }
                                } else {
                                    i20 = 0;
                                }
                                i19++;
                            }
                            i18--;
                        }
                        c5.f14703h = j9;
                        c5.f = true;
                        return 0;
                    }
                } else {
                    if (c5.f14703h != -9223372036854775807L) {
                        if (!c5.f14701e) {
                            int min2 = (int) Math.min(i15, j8);
                            long j11 = 0;
                            if (c0943h.f12166t != j11) {
                                kVar.f3459a = j11;
                            } else {
                                yVar.C(min2);
                                c0943h.f12168v = 0;
                                c0943h.i(yVar.f4691a, 0, min2, false);
                                int i22 = yVar.f4692b;
                                int i23 = yVar.f4693c;
                                while (true) {
                                    if (i22 >= i23) {
                                        break;
                                    }
                                    if (yVar.f4691a[i22] == 71) {
                                        long F4 = AbstractC0189a.F(yVar, i22, i14);
                                        if (F4 != -9223372036854775807L) {
                                            j9 = F4;
                                            break;
                                        }
                                    }
                                    i22++;
                                }
                                c5.f14702g = j9;
                                c5.f14701e = true;
                                return 0;
                            }
                        } else {
                            long j12 = c5.f14702g;
                            if (j12 != -9223372036854775807L) {
                                Z2.E e3 = c5.f14699b;
                                long b7 = e3.b(c5.f14703h) - e3.b(j12);
                                c5.f14704i = b7;
                                if (b7 < 0) {
                                    AbstractC0156a.K("TsDurationReader", "Invalid duration: " + c5.f14704i + ". Using TIME_UNSET instead.");
                                    c5.f14704i = -9223372036854775807L;
                                }
                            }
                        }
                    }
                    c5.a(c0943h);
                    return 0;
                }
                return 1;
            }
            if (!this.n) {
                this.n = true;
                long j13 = c5.f14704i;
                if (j13 != -9223372036854775807L) {
                    int i24 = this.f14719r;
                    L4.f fVar = new L4.f(26);
                    Z2.E e7 = c5.f14699b;
                    ?? obj = new Object();
                    obj.f4463q = i24;
                    obj.f4465s = e7;
                    obj.f4464r = 112800;
                    obj.f4466t = new Z2.y();
                    i7 = i12;
                    i8 = 2;
                    j7 = j8;
                    C1030a c1030a = new C1030a(fVar, obj, j13, j13 + 1, 0L, j7, 188L, 940);
                    this.f14712j = c1030a;
                    this.f14713k.t(c1030a.f12649a);
                } else {
                    i7 = i12;
                    i8 = 2;
                    j7 = j8;
                    this.f14713k.t(new C0950o(j13));
                }
            } else {
                i7 = i12;
                i8 = 2;
                j7 = j8;
            }
            if (this.f14716o) {
                this.f14716o = false;
                h(0L, 0L);
                if (c0943h.f12166t != 0) {
                    kVar.f3459a = 0L;
                    return 1;
                }
            }
            C1030a c1030a2 = this.f14712j;
            if (c1030a2 != null && c1030a2.f12651c != null) {
                return c1030a2.b(c0943h, kVar);
            }
        } else {
            i7 = i12;
            i8 = 2;
            j7 = j8;
        }
        Z2.y yVar2 = this.f14707c;
        byte[] bArr2 = yVar2.f4691a;
        if (9400 - yVar2.f4692b < 188) {
            int a7 = yVar2.a();
            if (a7 > 0) {
                System.arraycopy(bArr2, yVar2.f4692b, bArr2, 0, a7);
            }
            yVar2.D(a7, bArr2);
        }
        while (yVar2.a() < 188) {
            int i25 = yVar2.f4693c;
            int r3 = c0943h.r(bArr2, i25, 9400 - i25);
            if (r3 == -1) {
                return -1;
            }
            yVar2.E(i25 + r3);
        }
        int i26 = yVar2.f4692b;
        int i27 = yVar2.f4693c;
        byte[] bArr3 = yVar2.f4691a;
        int i28 = i26;
        while (i28 < i27 && bArr3[i28] != 71) {
            i28++;
        }
        yVar2.F(i28);
        int i29 = i28 + 188;
        G g7 = null;
        if (i29 > i27) {
            int i30 = (i28 - i26) + this.f14718q;
            this.f14718q = i30;
            i9 = i7;
            if (i9 == i8 && i30 > 376) {
                throw m0.a("Cannot find sync byte. Most likely not a Transport Stream.", null);
            }
        } else {
            i9 = i7;
            this.f14718q = 0;
        }
        int i31 = yVar2.f4693c;
        if (i29 > i31) {
            return 0;
        }
        int g8 = yVar2.g();
        if ((8388608 & g8) != 0) {
            yVar2.F(i29);
            return 0;
        }
        if ((4194304 & g8) != 0) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i32 = (2096896 & g8) >> 8;
        if ((g8 & 32) != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        if ((g8 & 16) != 0) {
            g7 = (G) this.f.get(i32);
        }
        if (g7 == null) {
            yVar2.F(i29);
            return 0;
        }
        if (i9 != i8) {
            int i33 = g8 & 15;
            SparseIntArray sparseIntArray = this.d;
            int i34 = sparseIntArray.get(i32, i33 - 1);
            sparseIntArray.put(i32, i33);
            if (i34 == i33) {
                yVar2.F(i29);
                return 0;
            } else if (i33 != ((i34 + 1) & 15)) {
                g7.a();
            }
        }
        if (z7) {
            int u7 = yVar2.u();
            if ((yVar2.u() & 64) != 0) {
                i11 = i8;
            } else {
                i11 = 0;
            }
            i10 |= i11;
            yVar2.G(u7 - 1);
        }
        boolean z10 = this.f14715m;
        if (i9 == i8 || z10 || !this.f14710h.get(i32, false)) {
            yVar2.E(i29);
            g7.c(i10, yVar2);
            yVar2.E(i31);
        }
        if (i9 != i8 && !z10 && this.f14715m && j7 != -1) {
            this.f14716o = true;
        }
        yVar2.F(i29);
        return 0;
    }

    @Override // k2.InterfaceC0946k
    public final void e(InterfaceC0948m interfaceC0948m) {
        this.f14713k = interfaceC0948m;
    }

    @Override // k2.InterfaceC0946k
    public final void h(long j7, long j8) {
        boolean z7;
        C1030a c1030a;
        boolean z8;
        if (this.f14705a != 2) {
            z7 = true;
        } else {
            z7 = false;
        }
        AbstractC0156a.k(z7);
        List list = this.f14706b;
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            Z2.E e3 = (Z2.E) list.get(i7);
            if (e3.d() == -9223372036854775807L) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (!z8) {
                long c5 = e3.c();
                if (c5 != -9223372036854775807L) {
                    if (c5 != 0) {
                        if (c5 == j8) {
                        }
                        e3.f(j8);
                    }
                }
            } else {
                if (!z8) {
                }
                e3.f(j8);
            }
        }
        if (j8 != 0 && (c1030a = this.f14712j) != null) {
            c1030a.d(j8);
        }
        this.f14707c.C(0);
        this.d.clear();
        int i8 = 0;
        while (true) {
            SparseArray sparseArray = this.f;
            if (i8 < sparseArray.size()) {
                ((G) sparseArray.valueAt(i8)).a();
                i8++;
            } else {
                this.f14718q = 0;
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
        r2 = r2 + 1;
     */
    @Override // k2.InterfaceC0946k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean j(k2.InterfaceC0947l r7) {
        /*
            r6 = this;
            Z2.y r0 = r6.f14707c
            byte[] r0 = r0.f4691a
            k2.h r7 = (k2.C0943h) r7
            r1 = 0
            r2 = 940(0x3ac, float:1.317E-42)
            r7.i(r0, r1, r2, r1)
            r2 = r1
        Ld:
            r3 = 188(0xbc, float:2.63E-43)
            if (r2 >= r3) goto L29
            r3 = r1
        L12:
            r4 = 5
            if (r3 >= r4) goto L24
            int r4 = r3 * 188
            int r4 = r4 + r2
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L21
            int r2 = r2 + 1
            goto Ld
        L21:
            int r3 = r3 + 1
            goto L12
        L24:
            r7.d(r2)
            r7 = 1
            return r7
        L29:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: u2.D.j(k2.l):boolean");
    }

    @Override // k2.InterfaceC0946k
    public final void a() {
    }
}
