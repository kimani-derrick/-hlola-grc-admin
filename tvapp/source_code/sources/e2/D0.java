package e2;

import Z2.AbstractC0156a;
/* loaded from: classes.dex */
public final class D0 {

    /* renamed from: c  reason: collision with root package name */
    public static final D0 f9483c;

    /* renamed from: a  reason: collision with root package name */
    public final long f9484a;

    /* renamed from: b  reason: collision with root package name */
    public final long f9485b;

    static {
        D0 d02 = new D0(0L, 0L);
        new D0(Long.MAX_VALUE, Long.MAX_VALUE);
        new D0(Long.MAX_VALUE, 0L);
        new D0(0L, Long.MAX_VALUE);
        f9483c = d02;
    }

    public D0(long j7, long j8) {
        boolean z7;
        if (j7 >= 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        AbstractC0156a.f(z7);
        AbstractC0156a.f(j8 >= 0);
        this.f9484a = j7;
        this.f9485b = j8;
    }

    public final long a(long j7, long j8, long j9) {
        boolean z7;
        long j10 = this.f9484a;
        int i7 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        long j11 = this.f9485b;
        if (i7 == 0 && j11 == 0) {
            return j7;
        }
        int i8 = Z2.H.f4603a;
        long j12 = j7 - j10;
        if (((j10 ^ j7) & (j7 ^ j12)) < 0) {
            j12 = Long.MIN_VALUE;
        }
        long j13 = j7 + j11;
        if (((j11 ^ j13) & (j7 ^ j13)) < 0) {
            j13 = Long.MAX_VALUE;
        }
        boolean z8 = false;
        if (j12 <= j8 && j8 <= j13) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (j12 <= j9 && j9 <= j13) {
            z8 = true;
        }
        if (z7 && z8) {
            if (Math.abs(j8 - j7) <= Math.abs(j9 - j7)) {
                return j8;
            }
            return j9;
        } else if (z7) {
            return j8;
        } else {
            if (z8) {
                return j9;
            }
            return j12;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || D0.class != obj.getClass()) {
            return false;
        }
        D0 d02 = (D0) obj;
        if (this.f9484a == d02.f9484a && this.f9485b == d02.f9485b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f9484a) * 31) + ((int) this.f9485b);
    }
}
