package l;

import java.util.concurrent.Executor;
/* renamed from: l.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ExecutorC0961a implements Executor {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f12227q;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f12227q) {
            case 0:
                C0962b.K().f12229c.d.execute(runnable);
                return;
            default:
                runnable.run();
                return;
        }
    }
}
