package V4;

import java.util.concurrent.CountDownLatch;
import t3.InterfaceC1238b;
import t3.InterfaceC1240d;
import t3.InterfaceC1241e;
/* loaded from: classes.dex */
public final class d implements InterfaceC1241e, InterfaceC1240d, InterfaceC1238b {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f3667q;

    /* renamed from: r  reason: collision with root package name */
    public final CountDownLatch f3668r;

    public d(int i7) {
        this.f3667q = i7;
        switch (i7) {
            case 1:
                this.f3668r = new CountDownLatch(1);
                return;
            default:
                this.f3668r = new CountDownLatch(1);
                return;
        }
    }

    @Override // t3.InterfaceC1238b
    public final void b() {
        switch (this.f3667q) {
            case 0:
                this.f3668r.countDown();
                return;
            default:
                this.f3668r.countDown();
                return;
        }
    }

    @Override // t3.InterfaceC1240d
    public final void c(Exception exc) {
        switch (this.f3667q) {
            case 0:
                this.f3668r.countDown();
                return;
            default:
                this.f3668r.countDown();
                return;
        }
    }

    @Override // t3.InterfaceC1241e
    public final void f(Object obj) {
        switch (this.f3667q) {
            case 0:
                this.f3668r.countDown();
                return;
            default:
                this.f3668r.countDown();
                return;
        }
    }
}
