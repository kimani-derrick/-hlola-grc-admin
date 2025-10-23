package q;

import T1.r;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class k implements R3.b {

    /* renamed from: q  reason: collision with root package name */
    public final WeakReference f13217q;

    /* renamed from: r  reason: collision with root package name */
    public final j f13218r = new j(this);

    public k(i iVar) {
        this.f13217q = new WeakReference(iVar);
    }

    @Override // R3.b
    public final void a(R3.a aVar, r rVar) {
        this.f13218r.a(aVar, rVar);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z7) {
        i iVar = (i) this.f13217q.get();
        boolean cancel = this.f13218r.cancel(z7);
        if (cancel && iVar != null) {
            iVar.f13213a = null;
            iVar.f13214b = null;
            iVar.f13215c.i(null);
        }
        return cancel;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f13218r.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f13218r.f13210q instanceof C1091a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f13218r.isDone();
    }

    public final String toString() {
        return this.f13218r.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j7, TimeUnit timeUnit) {
        return this.f13218r.get(j7, timeUnit);
    }
}
