package Z2;

import android.os.SystemClock;
import java.util.concurrent.TimeoutException;
/* loaded from: classes.dex */
public final class E {

    /* renamed from: a  reason: collision with root package name */
    public long f4598a;

    /* renamed from: b  reason: collision with root package name */
    public long f4599b;

    /* renamed from: c  reason: collision with root package name */
    public long f4600c;
    public final ThreadLocal d = new ThreadLocal();

    public E(long j7) {
        f(j7);
    }

    public final synchronized long a(long j7) {
        if (j7 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (!e()) {
                long j8 = this.f4598a;
                if (j8 == 9223372036854775806L) {
                    Long l7 = (Long) this.d.get();
                    l7.getClass();
                    j8 = l7.longValue();
                }
                this.f4599b = j8 - j7;
                notifyAll();
            }
            this.f4600c = j7;
            return j7 + this.f4599b;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long b(long j7) {
        if (j7 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j8 = this.f4600c;
            if (j8 != -9223372036854775807L) {
                long j9 = (j8 * 90000) / 1000000;
                long j10 = (4294967296L + j9) / 8589934592L;
                long j11 = ((j10 - 1) * 8589934592L) + j7;
                long j12 = (j10 * 8589934592L) + j7;
                if (Math.abs(j11 - j9) < Math.abs(j12 - j9)) {
                    j7 = j11;
                } else {
                    j7 = j12;
                }
            }
            return a((j7 * 1000000) / 90000);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long c() {
        long j7;
        j7 = this.f4598a;
        return (j7 == Long.MAX_VALUE || j7 == 9223372036854775806L) ? -9223372036854775807L : -9223372036854775807L;
    }

    public final synchronized long d() {
        return this.f4599b;
    }

    public final synchronized boolean e() {
        boolean z7;
        if (this.f4599b != -9223372036854775807L) {
            z7 = true;
        } else {
            z7 = false;
        }
        return z7;
    }

    public final synchronized void f(long j7) {
        long j8;
        this.f4598a = j7;
        if (j7 == Long.MAX_VALUE) {
            j8 = 0;
        } else {
            j8 = -9223372036854775807L;
        }
        this.f4599b = j8;
        this.f4600c = -9223372036854775807L;
    }

    public final synchronized void g(boolean z7, long j7, long j8) {
        boolean z8;
        boolean z9;
        try {
            if (this.f4598a == 9223372036854775806L) {
                z8 = true;
            } else {
                z8 = false;
            }
            AbstractC0156a.k(z8);
            if (e()) {
                return;
            }
            if (z7) {
                this.d.set(Long.valueOf(j7));
            } else {
                long j9 = 0;
                long j10 = j8;
                while (!e()) {
                    if (j8 == 0) {
                        wait();
                    } else {
                        if (j10 > 0) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        AbstractC0156a.k(z9);
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        wait(j10);
                        j9 += SystemClock.elapsedRealtime() - elapsedRealtime;
                        if (j9 >= j8 && !e()) {
                            throw new TimeoutException("TimestampAdjuster failed to initialize in " + j8 + " milliseconds");
                        }
                        j10 = j8 - j9;
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
