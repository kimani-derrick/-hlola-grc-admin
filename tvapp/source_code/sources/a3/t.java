package a3;

import Z2.H;
import android.view.Surface;
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    public final C0204d f5107a;

    /* renamed from: b  reason: collision with root package name */
    public final q f5108b;

    /* renamed from: c  reason: collision with root package name */
    public final s f5109c;
    public boolean d;

    /* renamed from: e  reason: collision with root package name */
    public Surface f5110e;
    public float f;

    /* renamed from: g  reason: collision with root package name */
    public float f5111g;

    /* renamed from: h  reason: collision with root package name */
    public float f5112h;

    /* renamed from: i  reason: collision with root package name */
    public float f5113i;

    /* renamed from: j  reason: collision with root package name */
    public int f5114j;

    /* renamed from: k  reason: collision with root package name */
    public long f5115k;

    /* renamed from: l  reason: collision with root package name */
    public long f5116l;

    /* renamed from: m  reason: collision with root package name */
    public long f5117m;
    public long n;

    /* renamed from: o  reason: collision with root package name */
    public long f5118o;

    /* renamed from: p  reason: collision with root package name */
    public long f5119p;

    /* renamed from: q  reason: collision with root package name */
    public long f5120q;

    /* JADX WARN: Removed duplicated region for block: B:17:0x0055  */
    /* JADX WARN: Type inference failed for: r0v0, types: [a3.d, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public t(android.content.Context r6) {
        /*
            r5 = this;
            r5.<init>()
            a3.d r0 = new a3.d
            r0.<init>()
            a3.c r1 = new a3.c
            r1.<init>()
            r0.f5033a = r1
            a3.c r1 = new a3.c
            r1.<init>()
            r0.f5034b = r1
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.d = r1
            r5.f5107a = r0
            r0 = 0
            if (r6 == 0) goto L50
            android.content.Context r6 = r6.getApplicationContext()
            int r3 = Z2.H.f4603a
            r4 = 17
            if (r3 < r4) goto L3c
            java.lang.String r3 = "display"
            java.lang.Object r3 = r6.getSystemService(r3)
            android.hardware.display.DisplayManager r3 = (android.hardware.display.DisplayManager) r3
            if (r3 == 0) goto L3c
            a3.r r4 = new a3.r
            r4.<init>(r3)
            goto L3d
        L3c:
            r4 = r0
        L3d:
            if (r4 != 0) goto L51
            java.lang.String r3 = "window"
            java.lang.Object r6 = r6.getSystemService(r3)
            android.view.WindowManager r6 = (android.view.WindowManager) r6
            if (r6 == 0) goto L50
            Z5.n r3 = new Z5.n
            r3.<init>(r6)
            r4 = r3
            goto L51
        L50:
            r4 = r0
        L51:
            r5.f5108b = r4
            if (r4 == 0) goto L57
            a3.s r0 = a3.s.f5102u
        L57:
            r5.f5109c = r0
            r5.f5115k = r1
            r5.f5116l = r1
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r5.f = r6
            r6 = 1065353216(0x3f800000, float:1.0)
            r5.f5113i = r6
            r6 = 0
            r5.f5114j = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.t.<init>(android.content.Context):void");
    }

    public final long a(long j7) {
        long j8;
        s sVar;
        long j9;
        long j10;
        if (this.f5119p != -1 && this.f5107a.f5033a.a()) {
            C0204d c0204d = this.f5107a;
            if (c0204d.f5033a.a()) {
                C0203c c0203c = c0204d.f5033a;
                long j11 = c0203c.f5030e;
                if (j11 == 0) {
                    j10 = 0;
                } else {
                    j10 = c0203c.f / j11;
                }
            } else {
                j10 = -9223372036854775807L;
            }
            j8 = this.f5120q + (((float) ((this.f5117m - this.f5119p) * j10)) / this.f5113i);
            if (Math.abs(j7 - j8) > 20000000) {
                this.f5117m = 0L;
                this.f5119p = -1L;
                this.n = -1L;
            }
            this.n = this.f5117m;
            this.f5118o = j8;
            sVar = this.f5109c;
            if (sVar == null && this.f5115k != -9223372036854775807L) {
                long j12 = sVar.f5103q;
                if (j12 == -9223372036854775807L) {
                    return j8;
                }
                long j13 = this.f5115k;
                long j14 = (((j8 - j12) / j13) * j13) + j12;
                if (j8 <= j14) {
                    j9 = j14 - j13;
                } else {
                    j9 = j14;
                    j14 = j13 + j14;
                }
                if (j14 - j8 >= j8 - j9) {
                    j14 = j9;
                }
                return j14 - this.f5116l;
            }
            return j8;
        }
        j8 = j7;
        this.n = this.f5117m;
        this.f5118o = j8;
        sVar = this.f5109c;
        if (sVar == null) {
        }
        return j8;
    }

    public final void b() {
        Surface surface;
        if (H.f4603a >= 30 && (surface = this.f5110e) != null && this.f5114j != Integer.MIN_VALUE && this.f5112h != 0.0f) {
            this.f5112h = 0.0f;
            p.a(surface, 0.0f);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004f, code lost:
        if (r1.f5031g[(int) ((r6 - 1) % 15)] != false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(long r11) {
        /*
            r10 = this;
            long r0 = r10.n
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto Le
            r10.f5119p = r0
            long r0 = r10.f5118o
            r10.f5120q = r0
        Le:
            long r0 = r10.f5117m
            r2 = 1
            long r0 = r0 + r2
            r10.f5117m = r0
            r0 = 1000(0x3e8, double:4.94E-321)
            long r11 = r11 * r0
            a3.d r0 = r10.f5107a
            a3.c r1 = r0.f5033a
            r1.b(r11)
            a3.c r1 = r0.f5033a
            boolean r1 = r1.a()
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L2c
            r0.f5035c = r5
            goto L64
        L2c:
            long r6 = r0.d
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 == 0) goto L64
            boolean r1 = r0.f5035c
            if (r1 == 0) goto L51
            a3.c r1 = r0.f5034b
            long r6 = r1.d
            r8 = 0
            int r8 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r8 != 0) goto L46
            goto L5d
        L46:
            long r6 = r6 - r2
            r2 = 15
            long r6 = r6 % r2
            int r2 = (int) r6
            boolean[] r1 = r1.f5031g
            boolean r1 = r1[r2]
            if (r1 == 0) goto L5d
        L51:
            a3.c r1 = r0.f5034b
            r1.c()
            a3.c r1 = r0.f5034b
            long r2 = r0.d
            r1.b(r2)
        L5d:
            r0.f5035c = r4
            a3.c r1 = r0.f5034b
            r1.b(r11)
        L64:
            boolean r1 = r0.f5035c
            if (r1 == 0) goto L7a
            a3.c r1 = r0.f5034b
            boolean r1 = r1.a()
            if (r1 == 0) goto L7a
            a3.c r1 = r0.f5033a
            a3.c r2 = r0.f5034b
            r0.f5033a = r2
            r0.f5034b = r1
            r0.f5035c = r5
        L7a:
            r0.d = r11
            a3.c r11 = r0.f5033a
            boolean r11 = r11.a()
            if (r11 == 0) goto L85
            goto L89
        L85:
            int r11 = r0.f5036e
            int r5 = r11 + 1
        L89:
            r0.f5036e = r5
            r10.d()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.t.c(long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            r9 = this;
            int r0 = Z2.H.f4603a
            r1 = 30
            if (r0 < r1) goto L8d
            android.view.Surface r0 = r9.f5110e
            if (r0 != 0) goto Lc
            goto L8d
        Lc:
            a3.d r0 = r9.f5107a
            a3.c r2 = r0.f5033a
            boolean r2 = r2.a()
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r2 == 0) goto L39
            a3.c r2 = r0.f5033a
            boolean r2 = r2.a()
            if (r2 == 0) goto L37
            a3.c r2 = r0.f5033a
            long r4 = r2.f5030e
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L2b
            goto L2e
        L2b:
            long r6 = r2.f
            long r6 = r6 / r4
        L2e:
            double r4 = (double) r6
            r6 = 4741671816366391296(0x41cdcd6500000000, double:1.0E9)
            double r6 = r6 / r4
            float r2 = (float) r6
            goto L3b
        L37:
            r2 = r3
            goto L3b
        L39:
            float r2 = r9.f
        L3b:
            float r4 = r9.f5111g
            int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r5 != 0) goto L42
            return
        L42:
            int r5 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r5 == 0) goto L80
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 == 0) goto L80
            a3.c r1 = r0.f5033a
            boolean r1 = r1.a()
            if (r1 == 0) goto L71
            a3.c r1 = r0.f5033a
            boolean r1 = r1.a()
            if (r1 == 0) goto L5f
            a3.c r0 = r0.f5033a
            long r0 = r0.f
            goto L64
        L5f:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L64:
            r3 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto L71
            r0 = 1017370378(0x3ca3d70a, float:0.02)
            goto L73
        L71:
            r0 = 1065353216(0x3f800000, float:1.0)
        L73:
            float r1 = r9.f5111g
            float r1 = r2 - r1
            float r1 = java.lang.Math.abs(r1)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L8d
            goto L87
        L80:
            if (r5 == 0) goto L83
            goto L87
        L83:
            int r0 = r0.f5036e
            if (r0 < r1) goto L8d
        L87:
            r9.f5111g = r2
            r0 = 0
            r9.e(r0)
        L8d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.t.d():void");
    }

    public final void e(boolean z7) {
        Surface surface;
        float f;
        if (H.f4603a >= 30 && (surface = this.f5110e) != null && this.f5114j != Integer.MIN_VALUE) {
            if (this.d) {
                float f7 = this.f5111g;
                if (f7 != -1.0f) {
                    f = f7 * this.f5113i;
                    if (z7 && this.f5112h == f) {
                        return;
                    }
                    this.f5112h = f;
                    p.a(surface, f);
                }
            }
            f = 0.0f;
            if (z7) {
            }
            this.f5112h = f;
            p.a(surface, f);
        }
    }
}
