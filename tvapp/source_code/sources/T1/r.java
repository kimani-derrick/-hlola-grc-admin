package T1;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.measurement.S;
import java.util.concurrent.Executor;
import s3.C1212z0;
/* loaded from: classes.dex */
public final class r implements Executor {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f3257q;

    /* renamed from: r  reason: collision with root package name */
    public final Object f3258r;

    public r() {
        this.f3257q = 2;
        Handler handler = new Handler(Looper.getMainLooper());
        Looper.getMainLooper();
        this.f3258r = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f3257q) {
            case 0:
                ((Executor) this.f3258r).execute(new q(runnable, 0));
                return;
            case 1:
                ((C1212z0) this.f3258r).d().M(runnable);
                return;
            default:
                ((S) this.f3258r).post(runnable);
                return;
        }
    }

    public /* synthetic */ r(int i7, Object obj) {
        this.f3257q = i7;
        this.f3258r = obj;
    }
}
