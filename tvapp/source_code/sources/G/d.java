package G;

import W5.C0100g;
import android.os.OutcomeReceiver;
import java.util.concurrent.atomic.AtomicBoolean;
import k3.AbstractC0958a;
/* loaded from: classes.dex */
public final class d extends AtomicBoolean implements OutcomeReceiver {

    /* renamed from: q  reason: collision with root package name */
    public final D5.d f740q;

    public d(C0100g c0100g) {
        super(false);
        this.f740q = c0100g;
    }

    public final void onError(Throwable th) {
        if (compareAndSet(false, true)) {
            this.f740q.m(AbstractC0958a.m(th));
        }
    }

    public final void onResult(Object obj) {
        if (compareAndSet(false, true)) {
            this.f740q.m(obj);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public final String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
