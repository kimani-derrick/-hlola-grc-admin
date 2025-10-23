package v6;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import r0.AbstractC1111a;
/* loaded from: classes.dex */
public class H {
    public static final G d = new Object();

    /* renamed from: a  reason: collision with root package name */
    public boolean f15365a;

    /* renamed from: b  reason: collision with root package name */
    public long f15366b;

    /* renamed from: c  reason: collision with root package name */
    public long f15367c;

    public H a() {
        this.f15365a = false;
        return this;
    }

    public H b() {
        this.f15367c = 0L;
        return this;
    }

    public long c() {
        if (this.f15365a) {
            return this.f15366b;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    public H d(long j7) {
        this.f15365a = true;
        this.f15366b = j7;
        return this;
    }

    public boolean e() {
        return this.f15365a;
    }

    public void f() {
        if (!Thread.currentThread().isInterrupted()) {
            if (this.f15365a && this.f15366b - System.nanoTime() <= 0) {
                throw new InterruptedIOException("deadline reached");
            }
            return;
        }
        throw new InterruptedIOException("interrupted");
    }

    public H g(long j7, TimeUnit timeUnit) {
        M5.g.f(timeUnit, "unit");
        if (j7 >= 0) {
            this.f15367c = timeUnit.toNanos(j7);
            return this;
        }
        throw new IllegalArgumentException(AbstractC1111a.o(j7, "timeout < 0: ").toString());
    }
}
