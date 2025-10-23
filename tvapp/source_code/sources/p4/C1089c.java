package p4;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import k.C0852F;
/* renamed from: p4.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1089c implements g {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f13144q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ f f13145r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ Runnable f13146s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ long f13147t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ long f13148u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ TimeUnit f13149v;

    public /* synthetic */ C1089c(f fVar, Runnable runnable, long j7, long j8, TimeUnit timeUnit, int i7) {
        this.f13144q = i7;
        this.f13145r = fVar;
        this.f13146s = runnable;
        this.f13147t = j7;
        this.f13148u = j8;
        this.f13149v = timeUnit;
    }

    @Override // p4.g
    public final ScheduledFuture a(C0852F c0852f) {
        switch (this.f13144q) {
            case 0:
                f fVar = this.f13145r;
                fVar.getClass();
                return fVar.f13158r.scheduleAtFixedRate(new RunnableC1090d(fVar, this.f13146s, c0852f, 0), this.f13147t, this.f13148u, this.f13149v);
            default:
                f fVar2 = this.f13145r;
                fVar2.getClass();
                return fVar2.f13158r.scheduleWithFixedDelay(new RunnableC1090d(fVar2, this.f13146s, c0852f, 2), this.f13147t, this.f13148u, this.f13149v);
        }
    }
}
