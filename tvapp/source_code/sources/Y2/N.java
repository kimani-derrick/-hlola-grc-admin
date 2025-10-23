package Y2;

import Z2.AbstractC0156a;
import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* loaded from: classes.dex */
public final class N {
    public static final H d = new H(0, -9223372036854775807L, false);

    /* renamed from: e  reason: collision with root package name */
    public static final H f4340e = new H(2, -9223372036854775807L, false);
    public static final H f = new H(3, -9223372036854775807L, false);

    /* renamed from: a  reason: collision with root package name */
    public final ExecutorService f4341a;

    /* renamed from: b  reason: collision with root package name */
    public J f4342b;

    /* renamed from: c  reason: collision with root package name */
    public IOException f4343c;

    public N(String str) {
        String concat = "ExoPlayer:Loader:".concat(str);
        int i7 = Z2.H.f4603a;
        this.f4341a = Executors.newSingleThreadExecutor(new Z2.F(concat, 0));
    }

    public final void a() {
        J j7 = this.f4342b;
        AbstractC0156a.l(j7);
        j7.a(false);
    }

    public final boolean b() {
        if (this.f4342b != null) {
            return true;
        }
        return false;
    }

    public final void c(L l7) {
        J j7 = this.f4342b;
        if (j7 != null) {
            j7.a(true);
        }
        ExecutorService executorService = this.f4341a;
        if (l7 != null) {
            executorService.execute(new P.b(3, l7));
        }
        executorService.shutdown();
    }

    public final long d(K k5, I i7, int i8) {
        boolean z7;
        Looper myLooper = Looper.myLooper();
        AbstractC0156a.l(myLooper);
        this.f4343c = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        J j7 = new J(this, myLooper, k5, i7, i8, elapsedRealtime);
        if (this.f4342b == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        AbstractC0156a.k(z7);
        this.f4342b = j7;
        j7.f4334t = null;
        this.f4341a.execute(j7);
        return elapsedRealtime;
    }
}
