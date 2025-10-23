package H2;

import Z2.AbstractC0156a;
import android.net.Uri;
import com.google.android.gms.internal.measurement.S1;
import e2.C0597b0;
import e2.H0;
import e2.J0;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
/* loaded from: classes.dex */
public final class h0 extends J0 {

    /* renamed from: D  reason: collision with root package name */
    public static final Object f1076D = new Object();

    /* renamed from: A  reason: collision with root package name */
    public final Object f1077A;

    /* renamed from: B  reason: collision with root package name */
    public final e2.Z f1078B;

    /* renamed from: C  reason: collision with root package name */
    public final e2.T f1079C;

    /* renamed from: r  reason: collision with root package name */
    public final long f1080r;

    /* renamed from: s  reason: collision with root package name */
    public final long f1081s;

    /* renamed from: t  reason: collision with root package name */
    public final long f1082t;

    /* renamed from: u  reason: collision with root package name */
    public final long f1083u;

    /* renamed from: v  reason: collision with root package name */
    public final long f1084v;

    /* renamed from: w  reason: collision with root package name */
    public final long f1085w;

    /* renamed from: x  reason: collision with root package name */
    public final boolean f1086x;

    /* renamed from: y  reason: collision with root package name */
    public final boolean f1087y;

    /* renamed from: z  reason: collision with root package name */
    public final boolean f1088z;

    static {
        boolean z7;
        e2.Q q5;
        e2.N n = new e2.N();
        S1 s12 = new S1();
        List emptyList = Collections.emptyList();
        O3.U u7 = O3.U.f2621u;
        e2.V v5 = e2.V.f9769s;
        Uri uri = Uri.EMPTY;
        if (s12.f8415a != null && ((UUID) s12.f8418e) == null) {
            z7 = false;
        } else {
            z7 = true;
        }
        AbstractC0156a.k(z7);
        if (uri != null) {
            if (((UUID) s12.f8418e) != null) {
                q5 = new e2.Q(s12);
            } else {
                q5 = null;
            }
            new e2.U(uri, null, q5, null, emptyList, null, u7, null);
        }
        n.a();
        C0597b0 c0597b0 = C0597b0.f9850Y;
    }

    public h0(long j7, long j8, long j9, long j10, long j11, long j12, boolean z7, boolean z8, boolean z9, K2.c cVar, e2.Z z10, e2.T t5) {
        this.f1080r = j7;
        this.f1081s = j8;
        this.f1082t = j9;
        this.f1083u = j10;
        this.f1084v = j11;
        this.f1085w = j12;
        this.f1086x = z7;
        this.f1087y = z8;
        this.f1088z = z9;
        this.f1077A = cVar;
        z10.getClass();
        this.f1078B = z10;
        this.f1079C = t5;
    }

    @Override // e2.J0
    public final int b(Object obj) {
        if (f1076D.equals(obj)) {
            return 0;
        }
        return -1;
    }

    @Override // e2.J0
    public final H0 g(int i7, H0 h02, boolean z7) {
        Object obj;
        AbstractC0156a.i(i7, 1);
        if (z7) {
            obj = f1076D;
        } else {
            obj = null;
        }
        Object obj2 = obj;
        h02.getClass();
        I2.b bVar = I2.b.f1233w;
        h02.j(null, obj2, 0, this.f1082t, -this.f1084v, bVar, false);
        return h02;
    }

    @Override // e2.J0
    public final int i() {
        return 1;
    }

    @Override // e2.J0
    public final Object m(int i7) {
        AbstractC0156a.i(i7, 1);
        return f1076D;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
        if (r1 > r3) goto L9;
     */
    @Override // e2.J0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final e2.I0 n(int r25, e2.I0 r26, long r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = 1
            r2 = r25
            Z2.AbstractC0156a.i(r2, r1)
            long r1 = r0.f1085w
            boolean r14 = r0.f1087y
            if (r14 == 0) goto L2d
            boolean r3 = r0.f1088z
            if (r3 != 0) goto L2d
            r3 = 0
            int r3 = (r27 > r3 ? 1 : (r27 == r3 ? 0 : -1))
            if (r3 == 0) goto L2d
            long r3 = r0.f1083u
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L26
        L23:
            r16 = r5
            goto L2f
        L26:
            long r1 = r1 + r27
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 <= 0) goto L2d
            goto L23
        L2d:
            r16 = r1
        L2f:
            java.lang.Object r4 = e2.I0.f9561H
            long r1 = r0.f1083u
            r18 = r1
            r20 = 0
            e2.Z r5 = r0.f1078B
            java.lang.Object r6 = r0.f1077A
            long r7 = r0.f1080r
            long r9 = r0.f1081s
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            boolean r13 = r0.f1086x
            e2.T r15 = r0.f1079C
            r21 = 0
            long r1 = r0.f1084v
            r22 = r1
            r3 = r26
            r3.b(r4, r5, r6, r7, r9, r11, r13, r14, r15, r16, r18, r20, r21, r22)
            return r26
        */
        throw new UnsupportedOperationException("Method not decompiled: H2.h0.n(int, e2.I0, long):e2.I0");
    }

    @Override // e2.J0
    public final int p() {
        return 1;
    }

    public h0(long j7, boolean z7, boolean z8, e2.Z z9) {
        this(-9223372036854775807L, -9223372036854775807L, j7, j7, 0L, 0L, z7, false, false, null, z9, z8 ? z9.f9806s : null);
    }
}
