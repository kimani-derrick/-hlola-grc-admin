package s3;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
/* renamed from: s3.e0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1171e0 extends FutureTask implements Comparable {

    /* renamed from: q  reason: collision with root package name */
    public final long f14007q;

    /* renamed from: r  reason: collision with root package name */
    public final boolean f14008r;

    /* renamed from: s  reason: collision with root package name */
    public final String f14009s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ C1169d0 f14010t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1171e0(C1169d0 c1169d0, Runnable runnable, boolean z7, String str) {
        super(runnable, null);
        this.f14010t = c1169d0;
        long andIncrement = C1169d0.f13994A.getAndIncrement();
        this.f14007q = andIncrement;
        this.f14009s = str;
        this.f14008r = z7;
        if (andIncrement == Long.MAX_VALUE) {
            c1169d0.b().f13807v.d("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C1171e0 c1171e0 = (C1171e0) obj;
        boolean z7 = c1171e0.f14008r;
        boolean z8 = this.f14008r;
        if (z8 != z7) {
            if (!z8) {
                return 1;
            }
            return -1;
        }
        long j7 = this.f14007q;
        long j8 = c1171e0.f14007q;
        if (j7 < j8) {
            return -1;
        }
        if (j7 > j8) {
            return 1;
        }
        C1154I b7 = this.f14010t.b();
        b7.f13808w.c(Long.valueOf(j7), "Two tasks share the same index. index");
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th) {
        C1154I b7 = this.f14010t.b();
        b7.f13807v.c(th, this.f14009s);
        super.setException(th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1171e0(C1169d0 c1169d0, Callable callable, boolean z7) {
        super(callable);
        this.f14010t = c1169d0;
        long andIncrement = C1169d0.f13994A.getAndIncrement();
        this.f14007q = andIncrement;
        this.f14009s = "Task exception on worker thread";
        this.f14008r = z7;
        if (andIncrement == Long.MAX_VALUE) {
            c1169d0.b().f13807v.d("Tasks index overflow");
        }
    }
}
