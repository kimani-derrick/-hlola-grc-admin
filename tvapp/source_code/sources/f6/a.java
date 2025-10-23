package f6;

import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class a implements Executor {

    /* renamed from: q  reason: collision with root package name */
    public static final a f10441q = new Object();

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
