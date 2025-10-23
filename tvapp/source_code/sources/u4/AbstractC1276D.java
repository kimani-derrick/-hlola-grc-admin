package u4;

import H2.U;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import t3.C1251o;
/* renamed from: u4.D  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1276D {

    /* renamed from: a  reason: collision with root package name */
    public static final ExecutorService f14978a = AbstractC1284h.a("awaitEvenIfOnMainThread task continuation executor");

    public static Object a(C1251o c1251o) {
        long j7;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        c1251o.d(f14978a, new U(28, countDownLatch));
        if (Looper.getMainLooper() == Looper.myLooper()) {
            j7 = 3;
        } else {
            j7 = 4;
        }
        countDownLatch.await(j7, TimeUnit.SECONDS);
        if (c1251o.i()) {
            return c1251o.g();
        }
        if (!c1251o.d) {
            if (c1251o.h()) {
                throw new IllegalStateException(c1251o.f());
            }
            throw new TimeoutException();
        }
        throw new CancellationException("Task is already canceled");
    }
}
