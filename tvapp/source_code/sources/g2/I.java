package g2;

import android.os.Handler;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final /* synthetic */ class I implements Executor {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ Handler f10533q;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f10533q.post(runnable);
    }
}
