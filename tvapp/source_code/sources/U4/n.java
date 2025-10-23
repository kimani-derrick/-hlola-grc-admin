package U4;

import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import p4.ThreadFactoryC1087a;
/* loaded from: classes.dex */
public final /* synthetic */ class n implements M4.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3463a;

    public /* synthetic */ n(int i7) {
        this.f3463a = i7;
    }

    @Override // M4.b
    public final Object get() {
        switch (this.f3463a) {
            case 0:
                Random random = p.f3465j;
                return null;
            case 1:
                return Collections.emptySet();
            case 2:
                return null;
            case 3:
                o4.k kVar = ExecutorsRegistrar.f9169a;
                StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
                int i7 = Build.VERSION.SDK_INT;
                detectNetwork.detectResourceMismatches();
                if (i7 >= 26) {
                    detectNetwork.detectUnbufferedIo();
                }
                return new p4.f(Executors.newFixedThreadPool(4, new ThreadFactoryC1087a("Firebase Background", 10, detectNetwork.penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            case 4:
                o4.k kVar2 = ExecutorsRegistrar.f9169a;
                return new p4.f(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new ThreadFactoryC1087a("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            case 5:
                o4.k kVar3 = ExecutorsRegistrar.f9169a;
                return new p4.f(Executors.newCachedThreadPool(new ThreadFactoryC1087a("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            default:
                o4.k kVar4 = ExecutorsRegistrar.f9169a;
                return Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC1087a("Firebase Scheduler", 0, null));
        }
    }
}
