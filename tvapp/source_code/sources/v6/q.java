package v6;

import java.io.Closeable;
import java.io.RandomAccessFile;
import java.util.concurrent.locks.ReentrantLock;
/* loaded from: classes.dex */
public final class q implements Closeable {

    /* renamed from: q  reason: collision with root package name */
    public boolean f15409q;

    /* renamed from: r  reason: collision with root package name */
    public int f15410r;

    /* renamed from: s  reason: collision with root package name */
    public final ReentrantLock f15411s = new ReentrantLock();

    /* renamed from: t  reason: collision with root package name */
    public final RandomAccessFile f15412t;

    public q(RandomAccessFile randomAccessFile) {
        this.f15412t = randomAccessFile;
    }

    public final long a() {
        long length;
        ReentrantLock reentrantLock = this.f15411s;
        reentrantLock.lock();
        try {
            if (!this.f15409q) {
                synchronized (this) {
                    length = this.f15412t.length();
                }
                return length;
            }
            throw new IllegalStateException("closed".toString());
        } finally {
            reentrantLock.unlock();
        }
    }

    public final C1345j b(long j7) {
        ReentrantLock reentrantLock = this.f15411s;
        reentrantLock.lock();
        try {
            if (!this.f15409q) {
                this.f15410r++;
                reentrantLock.unlock();
                return new C1345j(this, j7);
            }
            throw new IllegalStateException("closed".toString());
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.f15411s;
        reentrantLock.lock();
        try {
            if (this.f15409q) {
                return;
            }
            this.f15409q = true;
            if (this.f15410r != 0) {
                return;
            }
            synchronized (this) {
                this.f15412t.close();
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
