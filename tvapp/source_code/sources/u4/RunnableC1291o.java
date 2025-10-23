package u4;

import android.util.Log;
import z4.C1518b;
/* renamed from: u4.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1291o implements Runnable {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ long f15016q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ Throwable f15017r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ Thread f15018s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ C1292p f15019t;

    public RunnableC1291o(C1292p c1292p, long j7, Throwable th, Thread thread) {
        this.f15019t = c1292p;
        this.f15016q = j7;
        this.f15017r = th;
        this.f15018s = thread;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1292p c1292p = this.f15019t;
        u uVar = c1292p.n;
        if (uVar == null || !uVar.f15059e.get()) {
            long j7 = this.f15016q / 1000;
            String e3 = c1292p.e();
            if (e3 == null) {
                Log.w("FirebaseCrashlytics", "Tried to write a non-fatal exception while no session was open.", null);
                return;
            }
            C1518b c1518b = c1292p.f15031m;
            c1518b.getClass();
            String concat = "Persisting non-fatal event for session ".concat(e3);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", concat, null);
            }
            c1518b.r(this.f15017r, this.f15018s, e3, "error", j7, false);
        }
    }
}
