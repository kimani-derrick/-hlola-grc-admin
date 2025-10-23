package w6;

import java.io.IOException;
import v6.C1341f;
import v6.F;
import v6.m;
/* loaded from: classes.dex */
public final class b extends m {

    /* renamed from: r  reason: collision with root package name */
    public final long f16101r;

    /* renamed from: s  reason: collision with root package name */
    public final boolean f16102s;

    /* renamed from: t  reason: collision with root package name */
    public long f16103t;

    public b(F f, long j7, boolean z7) {
        super(f);
        this.f16101r = j7;
        this.f16102s = z7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, v6.f] */
    @Override // v6.m, v6.F
    public final long L(C1341f c1341f, long j7) {
        M5.g.f(c1341f, "sink");
        long j8 = this.f16103t;
        long j9 = this.f16101r;
        if (j8 > j9) {
            j7 = 0;
        } else if (this.f16102s) {
            long j10 = j9 - j8;
            if (j10 == 0) {
                return -1L;
            }
            j7 = Math.min(j7, j10);
        }
        long L6 = super.L(c1341f, j7);
        int i7 = (L6 > (-1L) ? 1 : (L6 == (-1L) ? 0 : -1));
        if (i7 != 0) {
            this.f16103t += L6;
        }
        long j11 = this.f16103t;
        int i8 = (j11 > j9 ? 1 : (j11 == j9 ? 0 : -1));
        if ((i8 < 0 && i7 == 0) || i8 > 0) {
            if (L6 > 0 && i8 > 0) {
                ?? obj = new Object();
                obj.h0(c1341f);
                c1341f.v(obj, c1341f.f15388r - (j11 - j9));
                obj.b();
            }
            throw new IOException("expected " + j9 + " bytes but got " + this.f16103t);
        }
        return L6;
    }
}
