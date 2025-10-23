package u4;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import t3.C1244h;
import z4.C1518b;
/* renamed from: u4.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class CallableC1289m implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ long f15009a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Throwable f15010b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Thread f15011c;
    public final /* synthetic */ B4.d d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ boolean f15012e = false;
    public final /* synthetic */ C1292p f;

    public CallableC1289m(C1292p c1292p, long j7, Throwable th, Thread thread, B4.d dVar) {
        this.f = c1292p;
        this.f15009a = j7;
        this.f15010b = th;
        this.f15011c = thread;
        this.d = dVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C1518b c1518b;
        String str;
        long j7 = this.f15009a;
        long j8 = j7 / 1000;
        C1292p c1292p = this.f;
        String e3 = c1292p.e();
        if (e3 == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
        } else {
            c1292p.f15023c.n();
            C1518b c1518b2 = c1292p.f15031m;
            c1518b2.getClass();
            String concat = "Persisting fatal event for session ".concat(e3);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", concat, null);
            }
            c1518b2.r(this.f15010b, this.f15011c, e3, "crash", j8, true);
            try {
                c1518b = c1292p.f15025g;
                str = ".ae" + j7;
                c1518b.getClass();
            } catch (IOException e7) {
                Log.w("FirebaseCrashlytics", "Could not create app exception marker file.", e7);
            }
            if (!new File((File) c1518b.f16462b, str).createNewFile()) {
                throw new IOException("Create new file failed.");
            }
            B4.d dVar = this.d;
            c1292p.c(false, dVar);
            new C1282f(c1292p.f);
            C1292p.a(c1292p, C1282f.f14995b, Boolean.valueOf(this.f15012e));
            if (c1292p.f15022b.c()) {
                Executor executor = (Executor) c1292p.f15024e.f421r;
                return ((C1244h) ((AtomicReference) dVar.f270i).get()).f14573a.j(executor, new C1286j(this, executor, e3));
            }
        }
        return m3.g.m(null);
    }
}
