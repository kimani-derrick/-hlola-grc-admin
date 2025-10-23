package H2;

import e2.H0;
import e2.I0;
import e2.J0;
/* renamed from: H2.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0005f extends AbstractC0014o {

    /* renamed from: s  reason: collision with root package name */
    public final long f1059s;

    /* renamed from: t  reason: collision with root package name */
    public final long f1060t;

    /* renamed from: u  reason: collision with root package name */
    public final long f1061u;

    /* renamed from: v  reason: collision with root package name */
    public final boolean f1062v;

    public C0005f(J0 j02, long j7, long j8) {
        super(j02);
        long max;
        long j9;
        boolean z7 = false;
        if (j02.i() == 1) {
            I0 n = j02.n(0, new I0(), 0L);
            long max2 = Math.max(0L, j7);
            if (!n.f9577B && max2 != 0 && !n.f9589x) {
                throw new C0006g(1);
            }
            if (j8 == Long.MIN_VALUE) {
                max = n.f9579D;
            } else {
                max = Math.max(0L, j8);
            }
            long j10 = n.f9579D;
            if (j10 != -9223372036854775807L) {
                max = max > j10 ? j10 : max;
                if (max2 > max) {
                    throw new C0006g(2);
                }
            }
            this.f1059s = max2;
            this.f1060t = max;
            int i7 = (max > (-9223372036854775807L) ? 1 : (max == (-9223372036854775807L) ? 0 : -1));
            if (i7 == 0) {
                j9 = -9223372036854775807L;
            } else {
                j9 = max - max2;
            }
            this.f1061u = j9;
            if (n.f9590y && (i7 == 0 || (j10 != -9223372036854775807L && max == j10))) {
                z7 = true;
            }
            this.f1062v = z7;
            return;
        }
        throw new C0006g(0);
    }

    @Override // H2.AbstractC0014o, e2.J0
    public final H0 g(int i7, H0 h02, boolean z7) {
        long j7;
        this.f1149r.g(0, h02, z7);
        long j8 = h02.f9556u - this.f1059s;
        long j9 = this.f1061u;
        if (j9 == -9223372036854775807L) {
            j7 = -9223372036854775807L;
        } else {
            j7 = j9 - j8;
        }
        h02.j(h02.f9552q, h02.f9553r, 0, j7, j8, I2.b.f1233w, false);
        return h02;
    }

    @Override // H2.AbstractC0014o, e2.J0
    public final I0 n(int i7, I0 i02, long j7) {
        this.f1149r.n(0, i02, 0L);
        long j8 = i02.f9581G;
        long j9 = this.f1059s;
        i02.f9581G = j8 + j9;
        i02.f9579D = this.f1061u;
        i02.f9590y = this.f1062v;
        long j10 = i02.f9578C;
        if (j10 != -9223372036854775807L) {
            long max = Math.max(j10, j9);
            i02.f9578C = max;
            long j11 = this.f1060t;
            if (j11 != -9223372036854775807L) {
                max = Math.min(max, j11);
            }
            i02.f9578C = max - j9;
        }
        long S6 = Z2.H.S(j9);
        long j12 = i02.f9586u;
        if (j12 != -9223372036854775807L) {
            i02.f9586u = j12 + S6;
        }
        long j13 = i02.f9587v;
        if (j13 != -9223372036854775807L) {
            i02.f9587v = j13 + S6;
        }
        return i02;
    }
}
