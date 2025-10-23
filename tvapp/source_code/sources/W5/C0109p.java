package W5;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* renamed from: W5.p  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0109p {

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f4011b = AtomicIntegerFieldUpdater.newUpdater(C0109p.class, "_handled");
    private volatile int _handled;

    /* renamed from: a  reason: collision with root package name */
    public final Throwable f4012a;

    public C0109p(Throwable th, boolean z7) {
        this.f4012a = th;
        this._handled = z7 ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f4012a + ']';
    }
}
