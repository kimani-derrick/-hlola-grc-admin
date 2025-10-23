package p4;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
/* renamed from: p4.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC1087a implements ThreadFactory {

    /* renamed from: e  reason: collision with root package name */
    public static final ThreadFactory f13137e = Executors.defaultThreadFactory();

    /* renamed from: a  reason: collision with root package name */
    public final AtomicLong f13138a = new AtomicLong();

    /* renamed from: b  reason: collision with root package name */
    public final String f13139b;

    /* renamed from: c  reason: collision with root package name */
    public final int f13140c;
    public final StrictMode.ThreadPolicy d;

    public ThreadFactoryC1087a(String str, int i7, StrictMode.ThreadPolicy threadPolicy) {
        this.f13139b = str;
        this.f13140c = i7;
        this.d = threadPolicy;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = f13137e.newThread(new A4.d(this, 17, runnable));
        Locale locale = Locale.ROOT;
        long andIncrement = this.f13138a.getAndIncrement();
        newThread.setName(this.f13139b + " Thread #" + andIncrement);
        return newThread;
    }
}
