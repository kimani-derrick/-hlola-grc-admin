package s3;

import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class F0 implements Runnable {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f13777q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ long f13778r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ C1212z0 f13779s;

    public /* synthetic */ F0(C1212z0 c1212z0, long j7, int i7) {
        this.f13777q = i7;
        this.f13778r = j7;
        this.f13779s = c1212z0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13777q) {
            case 0:
                C1212z0 c1212z0 = this.f13779s;
                Z2.A a7 = c1212z0.B().f13879B;
                long j7 = this.f13778r;
                a7.g(j7);
                C1154I b7 = c1212z0.b();
                b7.f13802C.c(Long.valueOf(j7), "Session timeout duration set");
                return;
            default:
                C1212z0 c1212z02 = this.f13779s;
                c1212z02.Y(true, this.f13778r);
                ((C1175g0) c1212z02.f2765q).r().L(new AtomicReference());
                return;
        }
    }
}
