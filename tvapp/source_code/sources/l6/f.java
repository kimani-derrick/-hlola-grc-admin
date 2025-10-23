package l6;

import h6.InterfaceC0755e;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public final class f implements Runnable {

    /* renamed from: q  reason: collision with root package name */
    public final InterfaceC0755e f12321q;

    /* renamed from: r  reason: collision with root package name */
    public volatile AtomicInteger f12322r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ i f12323s;

    public f(i iVar, InterfaceC0755e interfaceC0755e) {
        M5.g.f(iVar, "this$0");
        this.f12323s = iVar;
        this.f12321q = interfaceC0755e;
        this.f12322r = new AtomicInteger(0);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z7;
        Throwable th;
        IOException e3;
        C4.b bVar;
        String k5 = M5.g.k(this.f12323s.f12334r.f11070a.g(), "OkHttp ");
        i iVar = this.f12323s;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(k5);
        try {
            iVar.f12338v.h();
            try {
                z7 = true;
                try {
                    this.f12321q.g(iVar.i());
                    bVar = iVar.f12333q.f11264q;
                } catch (IOException e7) {
                    e3 = e7;
                    if (z7) {
                        p6.n nVar = p6.n.f13188a;
                        p6.n nVar2 = p6.n.f13188a;
                        String k7 = M5.g.k(i.b(iVar), "Callback failure for ");
                        nVar2.getClass();
                        p6.n.i(4, k7, e3);
                    } else {
                        this.f12321q.i(iVar, e3);
                    }
                    bVar = iVar.f12333q.f11264q;
                    bVar.x(this);
                } catch (Throwable th2) {
                    th = th2;
                    iVar.cancel();
                    if (!z7) {
                        IOException iOException = new IOException(M5.g.k(th, "canceled due to "));
                        android.support.v4.media.session.b.a(iOException, th);
                        this.f12321q.i(iVar, iOException);
                    }
                    throw th;
                }
            } catch (IOException e8) {
                z7 = false;
                e3 = e8;
            } catch (Throwable th3) {
                z7 = false;
                th = th3;
            }
            bVar.x(this);
        } finally {
            currentThread.setName(name);
        }
    }
}
