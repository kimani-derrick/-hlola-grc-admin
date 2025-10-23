package W5;

import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
/* loaded from: classes.dex */
public final class H implements I {

    /* renamed from: q  reason: collision with root package name */
    public final Future f3947q;

    public H(ScheduledFuture scheduledFuture) {
        this.f3947q = scheduledFuture;
    }

    @Override // W5.I
    public final void d() {
        this.f3947q.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f3947q + ']';
    }
}
