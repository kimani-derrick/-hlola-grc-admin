package H2;

import Y2.C0148q;
import Y2.InterfaceC0143l;
import Y2.InterfaceC0144m;
import android.net.Uri;
import e2.D0;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class k0 implements InterfaceC0022x, Y2.I {

    /* renamed from: A  reason: collision with root package name */
    public final boolean f1103A;

    /* renamed from: B  reason: collision with root package name */
    public boolean f1104B;

    /* renamed from: C  reason: collision with root package name */
    public byte[] f1105C;

    /* renamed from: D  reason: collision with root package name */
    public int f1106D;

    /* renamed from: q  reason: collision with root package name */
    public final C0148q f1107q;

    /* renamed from: r  reason: collision with root package name */
    public final InterfaceC0143l f1108r;

    /* renamed from: s  reason: collision with root package name */
    public final Y2.W f1109s;

    /* renamed from: t  reason: collision with root package name */
    public final L4.f f1110t;

    /* renamed from: u  reason: collision with root package name */
    public final C.d f1111u;

    /* renamed from: v  reason: collision with root package name */
    public final n0 f1112v;

    /* renamed from: x  reason: collision with root package name */
    public final long f1114x;

    /* renamed from: z  reason: collision with root package name */
    public final e2.K f1116z;

    /* renamed from: w  reason: collision with root package name */
    public final ArrayList f1113w = new ArrayList();

    /* renamed from: y  reason: collision with root package name */
    public final Y2.N f1115y = new Y2.N("SingleSampleMediaPeriod");

    public k0(C0148q c0148q, InterfaceC0143l interfaceC0143l, Y2.W w7, e2.K k5, long j7, L4.f fVar, C.d dVar, boolean z7) {
        this.f1107q = c0148q;
        this.f1108r = interfaceC0143l;
        this.f1109s = w7;
        this.f1116z = k5;
        this.f1114x = j7;
        this.f1110t = fVar;
        this.f1111u = dVar;
        this.f1103A = z7;
        this.f1112v = new n0(new m0("", k5));
    }

    @Override // H2.InterfaceC0022x
    public final long B() {
        return -9223372036854775807L;
    }

    @Override // H2.f0
    public final boolean C(long j7) {
        if (!this.f1104B) {
            Y2.N n = this.f1115y;
            if (!n.b() && n.f4343c == null) {
                InterfaceC0144m f = this.f1108r.f();
                Y2.W w7 = this.f1109s;
                if (w7 != null) {
                    f.m(w7);
                }
                C0148q c0148q = this.f1107q;
                n.d(new j0(f, c0148q), this, this.f1110t.K(1));
                this.f1111u.s(new C0016q(c0148q), 1, -1, this.f1116z, 0, null, 0L, this.f1114x);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // H2.f0
    public final boolean a() {
        return this.f1115y.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, H2.q] */
    @Override // Y2.I
    public final void b(Y2.K k5) {
        j0 j0Var = (j0) k5;
        this.f1106D = (int) j0Var.f1098b.f4366r;
        byte[] bArr = j0Var.f1099c;
        bArr.getClass();
        this.f1105C = bArr;
        this.f1104B = true;
        Uri uri = j0Var.f1098b.f4367s;
        ?? obj = new Object();
        this.f1110t.getClass();
        this.f1111u.n(obj, 1, -1, this.f1116z, 0, null, 0L, this.f1114x);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, H2.q] */
    @Override // Y2.I
    public final void c(Y2.K k5, boolean z7) {
        Uri uri = ((j0) k5).f1098b.f4367s;
        ?? obj = new Object();
        this.f1110t.getClass();
        this.f1111u.l(obj, 1, -1, null, 0, null, 0L, this.f1114x);
    }

    @Override // H2.InterfaceC0022x
    public final void e(InterfaceC0021w interfaceC0021w, long j7) {
        interfaceC0021w.s(this);
    }

    @Override // H2.InterfaceC0022x
    public final n0 g() {
        return this.f1112v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007f  */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, H2.q] */
    @Override // Y2.I
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final Y2.H h(Y2.K r17, java.io.IOException r18, int r19) {
        /*
            r16 = this;
            r0 = r16
            r12 = r18
            r1 = r19
            r2 = 0
            r3 = 1
            r4 = r17
            H2.j0 r4 = (H2.j0) r4
            Y2.V r4 = r4.f1098b
            H2.q r5 = new H2.q
            android.net.Uri r4 = r4.f4367s
            r5.<init>()
            int r4 = Z2.H.f4603a
            L4.f r4 = r0.f1110t
            r4.getClass()
            boolean r6 = r12 instanceof e2.m0
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r6 != 0) goto L55
            boolean r6 = r12 instanceof java.io.FileNotFoundException
            if (r6 != 0) goto L55
            boolean r6 = r12 instanceof Y2.C
            if (r6 != 0) goto L55
            boolean r6 = r12 instanceof Y2.M
            if (r6 != 0) goto L55
            int r6 = Y2.C0145n.f4406r
            r6 = r12
        L34:
            if (r6 == 0) goto L49
            boolean r9 = r6 instanceof Y2.C0145n
            if (r9 == 0) goto L44
            r9 = r6
            Y2.n r9 = (Y2.C0145n) r9
            int r9 = r9.f4407q
            r10 = 2008(0x7d8, float:2.814E-42)
            if (r9 != r10) goto L44
            goto L55
        L44:
            java.lang.Throwable r6 = r6.getCause()
            goto L34
        L49:
            int r6 = r1 + (-1)
            int r6 = r6 * 1000
            r9 = 5000(0x1388, float:7.006E-42)
            int r6 = java.lang.Math.min(r6, r9)
            long r9 = (long) r6
            goto L56
        L55:
            r9 = r7
        L56:
            int r6 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r6 == 0) goto L63
            int r4 = r4.K(r3)
            if (r1 < r4) goto L61
            goto L63
        L61:
            r1 = r2
            goto L64
        L63:
            r1 = r3
        L64:
            boolean r4 = r0.f1103A
            if (r4 == 0) goto L77
            if (r1 == 0) goto L77
            java.lang.String r1 = "SingleSampleMediaPeriod"
            java.lang.String r4 = "Loading failed, treating as end-of-stream."
            Z2.AbstractC0156a.L(r1, r4, r12)
            r0.f1104B = r3
            Y2.H r1 = Y2.N.f4340e
        L75:
            r14 = r1
            goto L82
        L77:
            if (r6 == 0) goto L7f
            Y2.H r1 = new Y2.H
            r1.<init>(r2, r9, r2)
            goto L75
        L7f:
            Y2.H r1 = Y2.N.f
            goto L75
        L82:
            int r1 = r14.f4329a
            if (r1 == 0) goto L88
            if (r1 != r3) goto L89
        L88:
            r2 = r3
        L89:
            r13 = r2 ^ 1
            r8 = 0
            long r10 = r0.f1114x
            C.d r1 = r0.f1111u
            r3 = 1
            r4 = -1
            e2.K r6 = r0.f1116z
            r7 = 0
            r15 = 0
            r2 = r5
            r5 = r6
            r6 = r7
            r7 = r15
            r12 = r18
            r1.p(r2, r3, r4, r5, r6, r7, r8, r10, r12, r13)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: H2.k0.h(Y2.K, java.io.IOException, int):Y2.H");
    }

    @Override // H2.f0
    public final long m() {
        if (this.f1104B) {
            return Long.MIN_VALUE;
        }
        return 0L;
    }

    @Override // H2.InterfaceC0022x
    public final long v(long j7) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f1113w;
            if (i7 < arrayList.size()) {
                i0 i0Var = (i0) arrayList.get(i7);
                if (i0Var.f1091q == 2) {
                    i0Var.f1091q = 1;
                }
                i7++;
            } else {
                return j7;
            }
        }
    }

    @Override // H2.InterfaceC0022x
    public final long y(W2.q[] qVarArr, boolean[] zArr, d0[] d0VarArr, boolean[] zArr2, long j7) {
        for (int i7 = 0; i7 < qVarArr.length; i7++) {
            d0 d0Var = d0VarArr[i7];
            ArrayList arrayList = this.f1113w;
            if (d0Var != null && (qVarArr[i7] == null || !zArr[i7])) {
                arrayList.remove(d0Var);
                d0VarArr[i7] = null;
            }
            if (d0VarArr[i7] == null && qVarArr[i7] != null) {
                i0 i0Var = new i0(this);
                arrayList.add(i0Var);
                d0VarArr[i7] = i0Var;
                zArr2[i7] = true;
            }
        }
        return j7;
    }

    @Override // H2.f0
    public final long z() {
        if (!this.f1104B && !this.f1115y.b()) {
            return 0L;
        }
        return Long.MIN_VALUE;
    }

    @Override // H2.InterfaceC0022x
    public final void n() {
    }

    @Override // H2.f0
    public final void G(long j7) {
    }

    @Override // H2.InterfaceC0022x
    public final void w(long j7) {
    }

    @Override // H2.InterfaceC0022x
    public final long u(long j7, D0 d02) {
        return j7;
    }
}
