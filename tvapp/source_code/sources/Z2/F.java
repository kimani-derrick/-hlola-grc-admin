package Z2;

import java.util.concurrent.ThreadFactory;
/* loaded from: classes.dex */
public final /* synthetic */ class F implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4601a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f4602b;

    public /* synthetic */ F(String str, int i7) {
        this.f4601a = i7;
        this.f4602b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f4601a) {
            case 0:
                return new Thread(runnable, this.f4602b);
            default:
                Thread thread = new Thread(runnable, this.f4602b);
                thread.setPriority(10);
                return thread;
        }
    }
}
