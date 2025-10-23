package p4;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import k.C0852F;
import q.C1091a;
/* loaded from: classes.dex */
public final class h extends q.h implements ScheduledFuture {

    /* renamed from: x  reason: collision with root package name */
    public final ScheduledFuture f13159x;

    public h(g gVar) {
        this.f13159x = gVar.a(new C0852F(8, this));
    }

    @Override // q.h
    public final void c() {
        boolean z7;
        ScheduledFuture scheduledFuture = this.f13159x;
        Object obj = this.f13210q;
        if ((obj instanceof C1091a) && ((C1091a) obj).f13191a) {
            z7 = true;
        } else {
            z7 = false;
        }
        scheduledFuture.cancel(z7);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.f13159x.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f13159x.getDelay(timeUnit);
    }
}
