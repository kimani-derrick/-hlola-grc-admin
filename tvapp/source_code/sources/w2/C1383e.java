package w2;

import Z4.Q;
import android.media.MediaCodec;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: w2.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1383e {

    /* renamed from: g  reason: collision with root package name */
    public static final ArrayDeque f15753g = new ArrayDeque();

    /* renamed from: h  reason: collision with root package name */
    public static final Object f15754h = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final MediaCodec f15755a;

    /* renamed from: b  reason: collision with root package name */
    public final HandlerThread f15756b;

    /* renamed from: c  reason: collision with root package name */
    public Q f15757c;
    public final AtomicReference d;

    /* renamed from: e  reason: collision with root package name */
    public final X0.j f15758e;
    public boolean f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X0.j] */
    public C1383e(MediaCodec mediaCodec, HandlerThread handlerThread) {
        ?? obj = new Object();
        this.f15755a = mediaCodec;
        this.f15756b = handlerThread;
        this.f15758e = obj;
        this.d = new AtomicReference();
    }

    public static C1382d b() {
        ArrayDeque arrayDeque = f15753g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new C1382d();
                }
                return (C1382d) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void c(C1382d c1382d) {
        ArrayDeque arrayDeque = f15753g;
        synchronized (arrayDeque) {
            arrayDeque.add(c1382d);
        }
    }

    public final void a() {
        if (this.f) {
            try {
                Q q5 = this.f15757c;
                q5.getClass();
                q5.removeCallbacksAndMessages(null);
                X0.j jVar = this.f15758e;
                jVar.c();
                Q q7 = this.f15757c;
                q7.getClass();
                q7.obtainMessage(2).sendToTarget();
                synchronized (jVar) {
                    while (!jVar.f4072a) {
                        jVar.wait();
                    }
                }
            } catch (InterruptedException e3) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e3);
            }
        }
    }
}
