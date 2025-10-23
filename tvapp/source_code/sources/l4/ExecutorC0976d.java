package l4;

import java.util.concurrent.Executor;
/* renamed from: l4.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ExecutorC0976d implements Executor {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f12268q;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f12268q) {
            case 0:
                runnable.run();
                return;
            default:
                runnable.run();
                return;
        }
    }
}
