package u4;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
/* loaded from: classes.dex */
public final class x implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f15065a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AtomicLong f15066b;

    public x(String str, AtomicLong atomicLong) {
        this.f15065a = str;
        this.f15066b = atomicLong;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = Executors.defaultThreadFactory().newThread(new w(runnable));
        newThread.setName(this.f15065a + this.f15066b.getAndIncrement());
        return newThread;
    }
}
