package u4;

import android.os.Process;
/* renamed from: u4.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC1280d implements Runnable {
    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        a();
    }
}
