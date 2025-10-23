package Y2;

import Z2.AbstractC0156a;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
/* loaded from: classes.dex */
public final class J extends Handler implements Runnable {

    /* renamed from: q  reason: collision with root package name */
    public final int f4331q;

    /* renamed from: r  reason: collision with root package name */
    public final K f4332r;

    /* renamed from: s  reason: collision with root package name */
    public I f4333s;

    /* renamed from: t  reason: collision with root package name */
    public IOException f4334t;

    /* renamed from: u  reason: collision with root package name */
    public int f4335u;

    /* renamed from: v  reason: collision with root package name */
    public Thread f4336v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f4337w;

    /* renamed from: x  reason: collision with root package name */
    public volatile boolean f4338x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ N f4339y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(N n, Looper looper, K k5, I i7, int i8, long j7) {
        super(looper);
        this.f4339y = n;
        this.f4332r = k5;
        this.f4333s = i7;
        this.f4331q = i8;
    }

    public final void a(boolean z7) {
        this.f4338x = z7;
        this.f4334t = null;
        if (hasMessages(0)) {
            this.f4337w = true;
            removeMessages(0);
            if (!z7) {
                sendEmptyMessage(1);
            }
        } else {
            synchronized (this) {
                try {
                    this.f4337w = true;
                    this.f4332r.b();
                    Thread thread = this.f4336v;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z7) {
            this.f4339y.f4342b = null;
            SystemClock.elapsedRealtime();
            I i7 = this.f4333s;
            i7.getClass();
            i7.c(this.f4332r, true);
            this.f4333s = null;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.f4338x) {
            return;
        }
        int i7 = message.what;
        if (i7 == 0) {
            this.f4334t = null;
            N n = this.f4339y;
            ExecutorService executorService = n.f4341a;
            J j7 = n.f4342b;
            j7.getClass();
            executorService.execute(j7);
        } else if (i7 != 3) {
            this.f4339y.f4342b = null;
            SystemClock.elapsedRealtime();
            I i8 = this.f4333s;
            i8.getClass();
            if (this.f4337w) {
                i8.c(this.f4332r, false);
                return;
            }
            int i9 = message.what;
            boolean z7 = true;
            if (i9 != 1) {
                if (i9 == 2) {
                    IOException iOException = (IOException) message.obj;
                    this.f4334t = iOException;
                    int i10 = this.f4335u + 1;
                    this.f4335u = i10;
                    H h7 = i8.h(this.f4332r, iOException, i10);
                    int i11 = h7.f4329a;
                    if (i11 == 3) {
                        this.f4339y.f4343c = this.f4334t;
                        return;
                    } else if (i11 != 2) {
                        if (i11 == 1) {
                            this.f4335u = 1;
                        }
                        long j8 = h7.f4330b;
                        if (j8 == -9223372036854775807L) {
                            j8 = Math.min((this.f4335u - 1) * 1000, 5000);
                        }
                        N n7 = this.f4339y;
                        if (n7.f4342b != null) {
                            z7 = false;
                        }
                        AbstractC0156a.k(z7);
                        n7.f4342b = this;
                        if (j8 > 0) {
                            sendEmptyMessageDelayed(0, j8);
                            return;
                        }
                        this.f4334t = null;
                        n7.f4341a.execute(this);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            }
            try {
                i8.b(this.f4332r);
            } catch (RuntimeException e3) {
                AbstractC0156a.r("LoadTask", "Unexpected exception handling load completed", e3);
                this.f4339y.f4343c = new M(e3);
            }
        } else {
            throw ((Error) message.obj);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object m7;
        Message obtainMessage;
        boolean z7;
        try {
            synchronized (this) {
                z7 = !this.f4337w;
                this.f4336v = Thread.currentThread();
            }
            if (z7) {
                AbstractC0156a.b("load:".concat(this.f4332r.getClass().getSimpleName()));
                try {
                    this.f4332r.a();
                    AbstractC0156a.s();
                } catch (Throwable th) {
                    AbstractC0156a.s();
                    throw th;
                }
            }
            synchronized (this) {
                this.f4336v = null;
                Thread.interrupted();
            }
            if (!this.f4338x) {
                sendEmptyMessage(1);
            }
        } catch (IOException e3) {
            if (!this.f4338x) {
                obtainMessage = obtainMessage(2, e3);
                obtainMessage.sendToTarget();
            }
        } catch (OutOfMemoryError e7) {
            if (!this.f4338x) {
                AbstractC0156a.r("LoadTask", "OutOfMemory error loading stream", e7);
                m7 = new M(e7);
                obtainMessage = obtainMessage(2, m7);
                obtainMessage.sendToTarget();
            }
        } catch (Error e8) {
            if (!this.f4338x) {
                AbstractC0156a.r("LoadTask", "Unexpected error loading stream", e8);
                obtainMessage(3, e8).sendToTarget();
            }
            throw e8;
        } catch (Exception e9) {
            if (!this.f4338x) {
                AbstractC0156a.r("LoadTask", "Unexpected exception loading stream", e9);
                m7 = new M(e9);
                obtainMessage = obtainMessage(2, m7);
                obtainMessage.sendToTarget();
            }
        }
    }
}
