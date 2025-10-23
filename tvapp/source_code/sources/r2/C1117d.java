package r2;

import C2.n;
import Z2.H;
import Z2.y;
import g2.O;
import java.io.EOFException;
import k.C0852F;
import k2.C0942g;
import k2.C0943h;
import k2.C0945j;
import k2.C0952q;
import k2.InterfaceC0946k;
import k2.InterfaceC0947l;
import k2.InterfaceC0948m;
import k2.w;
import x2.C1461c;
import x2.InterfaceC1460b;
/* renamed from: r2.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1117d implements InterfaceC0946k {

    /* renamed from: u  reason: collision with root package name */
    public static final f2.d f13451u = new f2.d(29);

    /* renamed from: a  reason: collision with root package name */
    public final int f13452a;

    /* renamed from: b  reason: collision with root package name */
    public final long f13453b;

    /* renamed from: c  reason: collision with root package name */
    public final y f13454c;
    public final O d;

    /* renamed from: e  reason: collision with root package name */
    public final C0952q f13455e;
    public final C0852F f;

    /* renamed from: g  reason: collision with root package name */
    public final C0945j f13456g;

    /* renamed from: h  reason: collision with root package name */
    public InterfaceC0948m f13457h;

    /* renamed from: i  reason: collision with root package name */
    public w f13458i;

    /* renamed from: j  reason: collision with root package name */
    public w f13459j;

    /* renamed from: k  reason: collision with root package name */
    public int f13460k;

    /* renamed from: l  reason: collision with root package name */
    public C1461c f13461l;

    /* renamed from: m  reason: collision with root package name */
    public long f13462m;
    public long n;

    /* renamed from: o  reason: collision with root package name */
    public long f13463o;

    /* renamed from: p  reason: collision with root package name */
    public int f13464p;

    /* renamed from: q  reason: collision with root package name */
    public f f13465q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f13466r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f13467s;

    /* renamed from: t  reason: collision with root package name */
    public long f13468t;

    public C1117d() {
        this(-9223372036854775807L);
    }

    public static long c(C1461c c1461c) {
        if (c1461c != null) {
            int e3 = c1461c.e();
            for (int i7 = 0; i7 < e3; i7++) {
                InterfaceC1460b d = c1461c.d(i7);
                if (d instanceof n) {
                    n nVar = (n) d;
                    if (nVar.f405q.equals("TLEN")) {
                        return H.J(Long.parseLong((String) nVar.f417s.get(0)));
                    }
                }
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [k2.g, r2.a] */
    public final C1114a b(C0943h c0943h, boolean z7) {
        y yVar = this.f13454c;
        c0943h.i(yVar.f4691a, 0, 4, false);
        yVar.F(0);
        int g7 = yVar.g();
        O o7 = this.d;
        o7.b(g7);
        return new C0942g(c0943h.f12165s, c0943h.f12166t, o7.f10606e, o7.f10604b, z7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:138:0x032a, code lost:
        if ((r4 & 1) != 0) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0065, code lost:
        if (r6 != 1231971951) goto L185;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0084 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x024b  */
    /* JADX WARN: Type inference failed for: r0v66, types: [k2.o] */
    @Override // k2.InterfaceC0946k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int d(k2.InterfaceC0947l r41, U4.k r42) {
        /*
            Method dump skipped, instructions count: 1196
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r2.C1117d.d(k2.l, U4.k):int");
    }

    @Override // k2.InterfaceC0946k
    public final void e(InterfaceC0948m interfaceC0948m) {
        this.f13457h = interfaceC0948m;
        w q5 = interfaceC0948m.q(0, 1);
        this.f13458i = q5;
        this.f13459j = q5;
        this.f13457h.l();
    }

    public final boolean f(C0943h c0943h) {
        f fVar = this.f13465q;
        if (fVar != null) {
            long f = fVar.f();
            if (f != -1 && c0943h.j() > f - 4) {
                return true;
            }
        }
        try {
            return !c0943h.i(this.f13454c.f4691a, 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x009f, code lost:
        if (r19 == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a1, code lost:
        r18.d(r4 + r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a6, code lost:
        r18.f12168v = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a8, code lost:
        r17.f13460k = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00aa, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(k2.C0943h r18, boolean r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            if (r19 == 0) goto La
            r2 = 32768(0x8000, float:4.5918E-41)
            goto Lc
        La:
            r2 = 131072(0x20000, float:1.83671E-40)
        Lc:
            r3 = 0
            r1.f12168v = r3
            long r4 = r1.f12166t
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            r5 = 0
            if (r4 != 0) goto L3f
            int r4 = r0.f13452a
            r4 = r4 & 8
            if (r4 != 0) goto L20
            r4 = r5
            goto L22
        L20:
            f2.d r4 = r2.C1117d.f13451u
        L22:
            k.F r6 = r0.f
            x2.c r4 = r6.B(r1, r4)
            r0.f13461l = r4
            if (r4 == 0) goto L31
            k2.q r6 = r0.f13455e
            r6.b(r4)
        L31:
            long r6 = r18.j()
            int r4 = (int) r6
            if (r19 != 0) goto L3b
            r1.d(r4)
        L3b:
            r6 = r3
        L3c:
            r7 = r6
            r8 = r7
            goto L42
        L3f:
            r4 = r3
            r6 = r4
            goto L3c
        L42:
            boolean r9 = r17.f(r18)
            r10 = 1
            if (r9 == 0) goto L52
            if (r7 <= 0) goto L4c
            goto L9f
        L4c:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
        L52:
            Z2.y r9 = r0.f13454c
            r9.F(r3)
            int r9 = r9.g()
            if (r6 == 0) goto L6b
            long r11 = (long) r6
            r13 = -128000(0xfffffffffffe0c00, float:NaN)
            r13 = r13 & r9
            long r13 = (long) r13
            r15 = -128000(0xfffffffffffe0c00, double:NaN)
            long r11 = r11 & r15
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 != 0) goto L72
        L6b:
            int r11 = g2.AbstractC0710a.d(r9)
            r12 = -1
            if (r11 != r12) goto L91
        L72:
            int r6 = r8 + 1
            if (r8 != r2) goto L80
            if (r19 == 0) goto L79
            return r3
        L79:
            java.lang.String r1 = "Searched too many bytes."
            e2.m0 r1 = e2.m0.a(r1, r5)
            throw r1
        L80:
            if (r19 == 0) goto L8a
            r1.f12168v = r3
            int r7 = r4 + r6
            r1.a(r7, r3)
            goto L8d
        L8a:
            r1.d(r10)
        L8d:
            r7 = r3
            r8 = r6
            r6 = r7
            goto L42
        L91:
            int r7 = r7 + 1
            if (r7 != r10) goto L9c
            g2.O r6 = r0.d
            r6.b(r9)
            r6 = r9
            goto Lab
        L9c:
            r9 = 4
            if (r7 != r9) goto Lab
        L9f:
            if (r19 == 0) goto La6
            int r4 = r4 + r8
            r1.d(r4)
            goto La8
        La6:
            r1.f12168v = r3
        La8:
            r0.f13460k = r6
            return r10
        Lab:
            int r11 = r11 + (-4)
            r1.a(r11, r3)
            goto L42
        */
        throw new UnsupportedOperationException("Method not decompiled: r2.C1117d.g(k2.h, boolean):boolean");
    }

    @Override // k2.InterfaceC0946k
    public final void h(long j7, long j8) {
        this.f13460k = 0;
        this.f13462m = -9223372036854775807L;
        this.n = 0L;
        this.f13464p = 0;
        this.f13468t = j8;
        f fVar = this.f13465q;
        if ((fVar instanceof C1115b) && !((C1115b) fVar).a(j8)) {
            this.f13467s = true;
            this.f13459j = this.f13456g;
        }
    }

    @Override // k2.InterfaceC0946k
    public final boolean j(InterfaceC0947l interfaceC0947l) {
        return g((C0943h) interfaceC0947l, true);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [g2.O, java.lang.Object] */
    public C1117d(long j7) {
        this.f13452a = 0;
        this.f13453b = j7;
        this.f13454c = new y(10);
        this.d = new Object();
        this.f13455e = new C0952q();
        this.f13462m = -9223372036854775807L;
        this.f = new C0852F(1);
        C0945j c0945j = new C0945j();
        this.f13456g = c0945j;
        this.f13459j = c0945j;
    }

    @Override // k2.InterfaceC0946k
    public final void a() {
    }
}
