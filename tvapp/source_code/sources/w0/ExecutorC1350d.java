package w0;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
/* renamed from: w0.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC1350d implements Executor {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f15517q;

    /* renamed from: r  reason: collision with root package name */
    public final Handler f15518r;

    public ExecutorC1350d(int i7) {
        this.f15517q = i7;
        switch (i7) {
            case 1:
                this.f15518r = new Handler(Looper.getMainLooper());
                return;
            default:
                this.f15518r = new Handler(Looper.getMainLooper());
                return;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f15517q) {
            case 0:
                this.f15518r.post(runnable);
                return;
            default:
                this.f15518r.post(runnable);
                return;
        }
    }
}
