package v6;

import java.util.concurrent.locks.ReentrantLock;
import r0.AbstractC1111a;
/* renamed from: v6.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1345j implements F {

    /* renamed from: q  reason: collision with root package name */
    public final q f15393q;

    /* renamed from: r  reason: collision with root package name */
    public long f15394r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f15395s;

    public C1345j(q qVar, long j7) {
        M5.g.f(qVar, "fileHandle");
        this.f15393q = qVar;
        this.f15394r = j7;
    }

    @Override // v6.F
    public final long L(C1341f c1341f, long j7) {
        long j8;
        long j9;
        long j10;
        int i7;
        M5.g.f(c1341f, "sink");
        int i8 = 1;
        if (!this.f15395s) {
            q qVar = this.f15393q;
            long j11 = this.f15394r;
            qVar.getClass();
            if (j7 >= 0) {
                long j12 = j7 + j11;
                long j13 = j11;
                while (true) {
                    if (j13 < j12) {
                        A e02 = c1341f.e0(i8);
                        byte[] bArr = e02.f15354a;
                        int i9 = e02.f15356c;
                        j8 = j11;
                        int min = (int) Math.min(j12 - j13, 8192 - i9);
                        synchronized (qVar) {
                            M5.g.f(bArr, "array");
                            qVar.f15412t.seek(j13);
                            i7 = 0;
                            while (true) {
                                if (i7 >= min) {
                                    break;
                                }
                                int read = qVar.f15412t.read(bArr, i9, min - i7);
                                if (read == -1) {
                                    if (i7 == 0) {
                                        i7 = -1;
                                    }
                                } else {
                                    i7 += read;
                                }
                            }
                        }
                        if (i7 == -1) {
                            if (e02.f15355b == e02.f15356c) {
                                c1341f.f15387q = e02.a();
                                B.a(e02);
                            }
                            if (j8 == j13) {
                                j10 = -1;
                                j9 = -1;
                            }
                        } else {
                            e02.f15356c += i7;
                            long j14 = i7;
                            j13 += j14;
                            c1341f.f15388r += j14;
                            j11 = j8;
                            i8 = 1;
                        }
                    } else {
                        j8 = j11;
                        break;
                    }
                }
                j9 = j13 - j8;
                j10 = -1;
                if (j9 != j10) {
                    this.f15394r += j9;
                }
                return j9;
            }
            throw new IllegalArgumentException(AbstractC1111a.o(j7, "byteCount < 0: ").toString());
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f15395s) {
            return;
        }
        this.f15395s = true;
        q qVar = this.f15393q;
        ReentrantLock reentrantLock = qVar.f15411s;
        reentrantLock.lock();
        try {
            int i7 = qVar.f15410r - 1;
            qVar.f15410r = i7;
            if (i7 == 0) {
                if (qVar.f15409q) {
                    synchronized (qVar) {
                        qVar.f15412t.close();
                    }
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // v6.F
    public final H d() {
        return H.d;
    }
}
