package W2;

import H2.m0;
import O3.AbstractC0072p;
import O3.E;
import O3.N;
import O3.P;
import O3.S;
import O3.U;
import Y2.C0150t;
import Y2.InterfaceC0137f;
import Z2.AbstractC0156a;
import Z2.B;
import Z2.H;
import android.os.SystemClock;
import e2.K;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
public final class b extends c {

    /* renamed from: g  reason: collision with root package name */
    public final InterfaceC0137f f3768g;

    /* renamed from: h  reason: collision with root package name */
    public final long f3769h;

    /* renamed from: i  reason: collision with root package name */
    public final long f3770i;

    /* renamed from: j  reason: collision with root package name */
    public final long f3771j;

    /* renamed from: k  reason: collision with root package name */
    public final int f3772k;

    /* renamed from: l  reason: collision with root package name */
    public final int f3773l;

    /* renamed from: m  reason: collision with root package name */
    public final float f3774m;
    public final float n;

    /* renamed from: o  reason: collision with root package name */
    public final E f3775o;

    /* renamed from: p  reason: collision with root package name */
    public final B f3776p;

    /* renamed from: q  reason: collision with root package name */
    public float f3777q;

    /* renamed from: r  reason: collision with root package name */
    public int f3778r;

    /* renamed from: s  reason: collision with root package name */
    public int f3779s;

    /* renamed from: t  reason: collision with root package name */
    public long f3780t;

    /* renamed from: u  reason: collision with root package name */
    public J2.b f3781u;

    public b(m0 m0Var, int[] iArr, int i7, InterfaceC0137f interfaceC0137f, long j7, long j8, long j9, int i8, int i9, float f, float f7, E e3, B b7) {
        super(m0Var, iArr);
        InterfaceC0137f interfaceC0137f2;
        long j10;
        if (j9 < j7) {
            AbstractC0156a.K("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            interfaceC0137f2 = interfaceC0137f;
            j10 = j7;
        } else {
            interfaceC0137f2 = interfaceC0137f;
            j10 = j9;
        }
        this.f3768g = interfaceC0137f2;
        this.f3769h = j7 * 1000;
        this.f3770i = j8 * 1000;
        this.f3771j = j10 * 1000;
        this.f3772k = i8;
        this.f3773l = i9;
        this.f3774m = f;
        this.n = f7;
        this.f3775o = E.s(e3);
        this.f3776p = b7;
        this.f3777q = 1.0f;
        this.f3779s = 0;
        this.f3780t = -9223372036854775807L;
    }

    public static U u(p[] pVarArr) {
        int i7;
        U h7;
        int i8;
        double d;
        long j7;
        O3.B b7;
        ArrayList arrayList = new ArrayList();
        int i9 = 0;
        int i10 = 0;
        while (true) {
            i7 = 1;
            if (i10 >= pVarArr.length) {
                break;
            }
            p pVar = pVarArr[i10];
            if (pVar != null && pVar.f3872b.length > 1) {
                b7 = E.r();
                b7.d(new a(0L, 0L));
            } else {
                b7 = null;
            }
            arrayList.add(b7);
            i10++;
        }
        int length = pVarArr.length;
        long[][] jArr = new long[length];
        for (int i11 = 0; i11 < pVarArr.length; i11++) {
            p pVar2 = pVarArr[i11];
            if (pVar2 == null) {
                jArr[i11] = new long[0];
            } else {
                int[] iArr = pVar2.f3872b;
                jArr[i11] = new long[iArr.length];
                for (int i12 = 0; i12 < iArr.length; i12++) {
                    long j8 = pVar2.f3871a.f1136t[iArr[i12]].f9683x;
                    long[] jArr2 = jArr[i11];
                    if (j8 == -1) {
                        j8 = 0;
                    }
                    jArr2[i12] = j8;
                }
                Arrays.sort(jArr[i11]);
            }
        }
        int[] iArr2 = new int[length];
        long[] jArr3 = new long[length];
        for (int i13 = 0; i13 < length; i13++) {
            long[] jArr4 = jArr[i13];
            if (jArr4.length == 0) {
                j7 = 0;
            } else {
                j7 = jArr4[0];
            }
            jArr3[i13] = j7;
        }
        v(arrayList, jArr3);
        S s6 = S.f2620q;
        s6.getClass();
        P j9 = new N(s6).a().j();
        int i14 = 0;
        while (i14 < length) {
            long[] jArr5 = jArr[i14];
            if (jArr5.length <= i7) {
                i8 = length;
            } else {
                int length2 = jArr5.length;
                double[] dArr = new double[length2];
                int i15 = i9;
                while (true) {
                    long[] jArr6 = jArr[i14];
                    double d7 = 0.0d;
                    i8 = length;
                    if (i15 >= jArr6.length) {
                        break;
                    }
                    long j10 = jArr6[i15];
                    if (j10 != -1) {
                        d7 = Math.log(j10);
                    }
                    dArr[i15] = d7;
                    i15++;
                    length = i8;
                }
                int i16 = length2 - 1;
                double d8 = dArr[i16] - dArr[0];
                int i17 = 0;
                while (i17 < i16) {
                    double d9 = dArr[i17];
                    i17++;
                    double d10 = (d9 + dArr[i17]) * 0.5d;
                    if (d8 == 0.0d) {
                        d = 1.0d;
                    } else {
                        d = (d10 - dArr[0]) / d8;
                    }
                    j9.i(Double.valueOf(d), Integer.valueOf(i14));
                }
            }
            i14++;
            length = i8;
            i9 = 0;
            i7 = 1;
        }
        E s7 = E.s(j9.j());
        for (int i18 = 0; i18 < s7.size(); i18++) {
            int intValue = ((Integer) s7.get(i18)).intValue();
            int i19 = iArr2[intValue] + 1;
            iArr2[intValue] = i19;
            jArr3[intValue] = jArr[intValue][i19];
            v(arrayList, jArr3);
        }
        for (int i20 = 0; i20 < pVarArr.length; i20++) {
            if (arrayList.get(i20) != null) {
                jArr3[i20] = jArr3[i20] * 2;
            }
        }
        v(arrayList, jArr3);
        O3.B r3 = E.r();
        for (int i21 = 0; i21 < arrayList.size(); i21++) {
            O3.B b8 = (O3.B) arrayList.get(i21);
            if (b8 == null) {
                h7 = E.v();
            } else {
                h7 = b8.h();
            }
            r3.d(h7);
        }
        return r3.h();
    }

    public static void v(ArrayList arrayList, long[] jArr) {
        long j7 = 0;
        for (long j8 : jArr) {
            j7 += j8;
        }
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            O3.B b7 = (O3.B) arrayList.get(i7);
            if (b7 != null) {
                b7.a(new a(j7, jArr[i7]));
            }
        }
    }

    public static long x(List list) {
        if (list.isEmpty()) {
            return -9223372036854775807L;
        }
        J2.b bVar = (J2.b) AbstractC0072p.i(list);
        long j7 = bVar.f1321g;
        if (j7 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j8 = bVar.f1322h;
        if (j8 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j8 - j7;
    }

    @Override // W2.q
    public final int f() {
        return this.f3779s;
    }

    @Override // W2.q
    public final int g() {
        return this.f3778r;
    }

    @Override // W2.c, W2.q
    public final void i() {
        this.f3780t = -9223372036854775807L;
        this.f3781u = null;
    }

    @Override // W2.c, W2.q
    public final void j(float f) {
        this.f3777q = f;
    }

    @Override // W2.q
    public final Object l() {
        return null;
    }

    @Override // W2.c, W2.q
    public final int n(long j7, List list) {
        J2.b bVar;
        int i7;
        int i8;
        this.f3776p.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j8 = this.f3780t;
        if (j8 != -9223372036854775807L && elapsedRealtime - j8 < 1000 && (list.isEmpty() || ((J2.b) AbstractC0072p.i(list)).equals(this.f3781u))) {
            return list.size();
        }
        this.f3780t = elapsedRealtime;
        if (list.isEmpty()) {
            bVar = null;
        } else {
            bVar = (J2.b) AbstractC0072p.i(list);
        }
        this.f3781u = bVar;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long y3 = H.y(((J2.b) list.get(size - 1)).f1321g - j7, this.f3777q);
        long j9 = this.f3771j;
        if (y3 < j9) {
            return size;
        }
        x(list);
        K k5 = this.d[w(elapsedRealtime)];
        for (int i9 = 0; i9 < size; i9++) {
            J2.b bVar2 = (J2.b) list.get(i9);
            K k7 = bVar2.d;
            if (H.y(bVar2.f1321g - j7, this.f3777q) >= j9 && k7.f9683x < k5.f9683x && (i7 = k7.f9660H) != -1 && i7 <= this.f3773l && (i8 = k7.f9659G) != -1 && i8 <= this.f3772k && i7 < k5.f9660H) {
                return i9;
            }
        }
        return size;
    }

    @Override // W2.c, W2.q
    public final void q() {
        this.f3781u = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    @Override // W2.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(long r14, long r16, long r18, java.util.List r20, J2.c[] r21) {
        /*
            r13 = this;
            r0 = r13
            r1 = r21
            Z2.B r2 = r0.f3776p
            r2.getClass()
            long r2 = android.os.SystemClock.elapsedRealtime()
            int r4 = r0.f3778r
            int r5 = r1.length
            r6 = 0
            if (r4 >= r5) goto L28
            r4 = r1[r4]
            boolean r4 = r4.next()
            if (r4 == 0) goto L28
            int r4 = r0.f3778r
            r1 = r1[r4]
            long r4 = r1.d()
            long r7 = r1.f()
        L26:
            long r4 = r4 - r7
            goto L44
        L28:
            int r4 = r1.length
            r5 = r6
        L2a:
            if (r5 >= r4) goto L40
            r7 = r1[r5]
            boolean r8 = r7.next()
            if (r8 == 0) goto L3d
            long r4 = r7.d()
            long r7 = r7.f()
            goto L26
        L3d:
            int r5 = r5 + 1
            goto L2a
        L40:
            long r4 = x(r20)
        L44:
            int r1 = r0.f3779s
            if (r1 != 0) goto L52
            r1 = 1
            r0.f3779s = r1
            int r1 = r13.w(r2)
            r0.f3778r = r1
            return
        L52:
            int r7 = r0.f3778r
            boolean r8 = r20.isEmpty()
            e2.K[] r9 = r0.d
            r10 = -1
            if (r8 == 0) goto L5f
        L5d:
            r6 = r10
            goto L73
        L5f:
            java.lang.Object r8 = O3.AbstractC0072p.i(r20)
            J2.b r8 = (J2.b) r8
            e2.K r8 = r8.d
        L67:
            int r11 = r0.f3783b
            if (r6 >= r11) goto L5d
            r11 = r9[r6]
            if (r11 != r8) goto L70
            goto L73
        L70:
            int r6 = r6 + 1
            goto L67
        L73:
            if (r6 == r10) goto L7e
            java.lang.Object r1 = O3.AbstractC0072p.i(r20)
            J2.b r1 = (J2.b) r1
            int r1 = r1.f1320e
            r7 = r6
        L7e:
            int r6 = r13.w(r2)
            if (r6 == r7) goto Lc0
            boolean r2 = r13.o(r2, r7)
            if (r2 != 0) goto Lc0
            r2 = r9[r7]
            r3 = r9[r6]
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r10 = (r18 > r8 ? 1 : (r18 == r8 ? 0 : -1))
            long r11 = r0.f3769h
            if (r10 != 0) goto L9a
            goto Lac
        L9a:
            int r8 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r8 == 0) goto La1
            long r4 = r18 - r4
            goto La3
        La1:
            r4 = r18
        La3:
            float r4 = (float) r4
            float r5 = r0.n
            float r4 = r4 * r5
            long r4 = (long) r4
            long r11 = java.lang.Math.min(r4, r11)
        Lac:
            int r3 = r3.f9683x
            int r2 = r2.f9683x
            if (r3 <= r2) goto Lb7
            int r4 = (r16 > r11 ? 1 : (r16 == r11 ? 0 : -1))
            if (r4 >= 0) goto Lb7
            goto Lbf
        Lb7:
            if (r3 >= r2) goto Lc0
            long r2 = r0.f3770i
            int r2 = (r16 > r2 ? 1 : (r16 == r2 ? 0 : -1))
            if (r2 < 0) goto Lc0
        Lbf:
            r6 = r7
        Lc0:
            if (r6 != r7) goto Lc3
            goto Lc4
        Lc3:
            r1 = 3
        Lc4:
            r0.f3779s = r1
            r0.f3778r = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: W2.b.s(long, long, long, java.util.List, J2.c[]):void");
    }

    public final int w(long j7) {
        long j8;
        long j9;
        C0150t c0150t = (C0150t) this.f3768g;
        synchronized (c0150t) {
            j8 = c0150t.f4450l;
        }
        this.f3768g.getClass();
        long j10 = (((float) j8) * this.f3774m) / this.f3777q;
        if (!this.f3775o.isEmpty()) {
            int i7 = 1;
            while (i7 < this.f3775o.size() - 1 && ((a) this.f3775o.get(i7)).f3766a < j10) {
                i7++;
            }
            a aVar = (a) this.f3775o.get(i7 - 1);
            a aVar2 = (a) this.f3775o.get(i7);
            long j11 = aVar.f3766a;
            float f = ((float) (j10 - j11)) / ((float) (aVar2.f3766a - j11));
            j10 = aVar.f3767b + (f * ((float) (aVar2.f3767b - j9)));
        }
        int i8 = 0;
        for (int i9 = 0; i9 < this.f3783b; i9++) {
            if (j7 == Long.MIN_VALUE || !o(j7, i9)) {
                if (h(i9).f9683x <= j10) {
                    return i9;
                }
                i8 = i9;
            }
        }
        return i8;
    }
}
