package l;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
/* renamed from: l.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC0963c implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicInteger f12230a = new AtomicInteger(0);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setName("arch_disk_io_" + this.f12230a.getAndIncrement());
        return thread;
    }
}
