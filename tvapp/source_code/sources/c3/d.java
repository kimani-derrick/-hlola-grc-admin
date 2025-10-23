package c3;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class d extends Thread {

    /* renamed from: q  reason: collision with root package name */
    public final WeakReference f7265q;

    /* renamed from: r  reason: collision with root package name */
    public final long f7266r;

    /* renamed from: s  reason: collision with root package name */
    public final CountDownLatch f7267s = new CountDownLatch(1);

    /* renamed from: t  reason: collision with root package name */
    public boolean f7268t = false;

    public d(b bVar, long j7) {
        this.f7265q = new WeakReference(bVar);
        this.f7266r = j7;
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        b bVar;
        WeakReference weakReference = this.f7265q;
        try {
            if (!this.f7267s.await(this.f7266r, TimeUnit.MILLISECONDS) && (bVar = (b) weakReference.get()) != null) {
                bVar.b();
                this.f7268t = true;
            }
        } catch (InterruptedException unused) {
            b bVar2 = (b) weakReference.get();
            if (bVar2 != null) {
                bVar2.b();
                this.f7268t = true;
            }
        }
    }
}
