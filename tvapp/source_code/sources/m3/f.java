package m3;

import android.os.Process;
import java.util.concurrent.locks.ReentrantLock;
import v6.C1338c;
/* loaded from: classes.dex */
public final class f extends Thread {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f12428q = 1;

    public /* synthetic */ f(String str) {
        super(str);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ReentrantLock reentrantLock;
        C1338c b7;
        switch (this.f12428q) {
            case 0:
                Process.setThreadPriority(19);
                synchronized (this) {
                    while (true) {
                        try {
                            wait();
                        } catch (InterruptedException unused) {
                            return;
                        }
                    }
                }
        }
        while (true) {
            try {
                reentrantLock = C1338c.f15378h;
                reentrantLock.lock();
                b7 = p6.d.b();
            } catch (InterruptedException unused2) {
            }
            if (b7 == C1338c.f15382l) {
                C1338c.f15382l = null;
                reentrantLock.unlock();
                return;
            }
            reentrantLock.unlock();
            if (b7 != null) {
                b7.k();
            }
        }
    }

    public /* synthetic */ f(ThreadGroup threadGroup, String str) {
        super(threadGroup, str);
    }
}
