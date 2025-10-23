package H;

import android.os.Process;
/* loaded from: classes.dex */
public final class l extends Thread {

    /* renamed from: q  reason: collision with root package name */
    public final int f799q;

    public l(Runnable runnable, String str, int i7) {
        super(runnable, str);
        this.f799q = i7;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f799q);
        super.run();
    }
}
