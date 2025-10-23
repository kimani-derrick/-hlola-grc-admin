package u4;

import android.util.Log;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import r0.AbstractC1111a;
/* loaded from: classes.dex */
public final class y extends AbstractRunnableC1280d {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ String f15067q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ ExecutorService f15068r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ long f15069s = 2;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ TimeUnit f15070t;

    public y(String str, ExecutorService executorService, TimeUnit timeUnit) {
        this.f15067q = str;
        this.f15068r = executorService;
        this.f15070t = timeUnit;
    }

    @Override // u4.AbstractRunnableC1280d
    public final void a() {
        String str = this.f15067q;
        ExecutorService executorService = this.f15068r;
        try {
            String str2 = "Executing shutdown hook for " + str;
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, null);
            }
            executorService.shutdown();
            if (!executorService.awaitTermination(this.f15069s, this.f15070t)) {
                String str3 = str + " did not shut down in the allocated time. Requesting immediate shutdown.";
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", str3, null);
                }
                executorService.shutdownNow();
            }
        } catch (InterruptedException unused) {
            Locale locale = Locale.US;
            String r3 = AbstractC1111a.r("Interrupted while waiting for ", str, " to shut down. Requesting immediate shutdown.");
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", r3, null);
            }
            executorService.shutdownNow();
        }
    }
}
