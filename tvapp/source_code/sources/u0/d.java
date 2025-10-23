package u0;

import android.content.Context;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import l.ExecutorC0961a;
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f14658q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ Context f14659r;

    public /* synthetic */ d(Context context, int i7) {
        this.f14658q = i7;
        this.f14659r = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14658q) {
            case 0:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new d(this.f14659r, 1));
                return;
            default:
                c.t(this.f14659r, new ExecutorC0961a(1), c.f14650a, false);
                return;
        }
    }
}
