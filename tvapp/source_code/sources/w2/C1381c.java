package w2;

import Z2.AbstractC0156a;
import Z2.H;
import Z4.Q;
import a3.C0208h;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.Arrays;
/* renamed from: w2.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1381c implements InterfaceC1389k {

    /* renamed from: q  reason: collision with root package name */
    public final MediaCodec f15743q;

    /* renamed from: r  reason: collision with root package name */
    public final C1384f f15744r;

    /* renamed from: s  reason: collision with root package name */
    public final C1383e f15745s;

    /* renamed from: t  reason: collision with root package name */
    public final boolean f15746t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f15747u;

    /* renamed from: v  reason: collision with root package name */
    public int f15748v = 0;

    public C1381c(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z7) {
        this.f15743q = mediaCodec;
        this.f15744r = new C1384f(handlerThread);
        this.f15745s = new C1383e(mediaCodec, handlerThread2);
        this.f15746t = z7;
    }

    public static void b(C1381c c1381c, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto) {
        boolean z7;
        C1384f c1384f = c1381c.f15744r;
        if (c1384f.f15761c == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        AbstractC0156a.k(z7);
        HandlerThread handlerThread = c1384f.f15760b;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        MediaCodec mediaCodec = c1381c.f15743q;
        mediaCodec.setCallback(c1384f, handler);
        c1384f.f15761c = handler;
        AbstractC0156a.b("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, 0);
        AbstractC0156a.s();
        C1383e c1383e = c1381c.f15745s;
        if (!c1383e.f) {
            HandlerThread handlerThread2 = c1383e.f15756b;
            handlerThread2.start();
            c1383e.f15757c = new Q(c1383e, handlerThread2.getLooper(), 3);
            c1383e.f = true;
        }
        AbstractC0156a.b("startCodec");
        mediaCodec.start();
        AbstractC0156a.s();
        c1381c.f15748v = 1;
    }

    public static String c(String str, int i7) {
        String str2;
        StringBuilder sb = new StringBuilder(str);
        if (i7 == 1) {
            str2 = "Audio";
        } else if (i7 == 2) {
            str2 = "Video";
        } else {
            sb.append("Unknown(");
            sb.append(i7);
            str2 = ")";
        }
        sb.append(str2);
        return sb.toString();
    }

    @Override // w2.InterfaceC1389k
    public final void a() {
        try {
            if (this.f15748v == 1) {
                C1383e c1383e = this.f15745s;
                if (c1383e.f) {
                    c1383e.a();
                    c1383e.f15756b.quit();
                }
                c1383e.f = false;
                C1384f c1384f = this.f15744r;
                synchronized (c1384f.f15759a) {
                    c1384f.f15768l = true;
                    c1384f.f15760b.quit();
                    c1384f.a();
                }
            }
            this.f15748v = 2;
            if (!this.f15747u) {
                this.f15743q.release();
                this.f15747u = true;
            }
        } catch (Throwable th) {
            if (!this.f15747u) {
                this.f15743q.release();
                this.f15747u = true;
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0031 A[Catch: all -> 0x002f, TryCatch #0 {all -> 0x002f, blocks: (B:6:0x0012, B:8:0x0016, B:10:0x001a, B:12:0x0022, B:19:0x002d, B:23:0x0031, B:26:0x0038, B:28:0x003e, B:31:0x005b, B:33:0x0067, B:34:0x0069, B:35:0x006a, B:36:0x006c), top: B:40:0x0012 }] */
    @Override // w2.InterfaceC1389k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int d(android.media.MediaCodec.BufferInfo r11) {
        /*
            r10 = this;
            w2.e r0 = r10.f15745s
            java.util.concurrent.atomic.AtomicReference r0 = r0.d
            r1 = 0
            java.lang.Object r0 = r0.getAndSet(r1)
            java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0
            if (r0 != 0) goto L6f
            w2.f r0 = r10.f15744r
            java.lang.Object r2 = r0.f15759a
            monitor-enter(r2)
            java.lang.IllegalStateException r3 = r0.f15769m     // Catch: java.lang.Throwable -> L2f
            if (r3 != 0) goto L6a
            android.media.MediaCodec$CodecException r3 = r0.f15766j     // Catch: java.lang.Throwable -> L2f
            if (r3 != 0) goto L67
            long r3 = r0.f15767k     // Catch: java.lang.Throwable -> L2f
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 > 0) goto L29
            boolean r1 = r0.f15768l     // Catch: java.lang.Throwable -> L2f
            if (r1 == 0) goto L27
            goto L29
        L27:
            r1 = 0
            goto L2a
        L29:
            r1 = 1
        L2a:
            r3 = -1
            if (r1 == 0) goto L31
        L2d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2f
            goto L66
        L2f:
            r11 = move-exception
            goto L6d
        L31:
            s2.e r1 = r0.f15762e     // Catch: java.lang.Throwable -> L2f
            int r4 = r1.f13592c     // Catch: java.lang.Throwable -> L2f
            if (r4 != 0) goto L38
            goto L2d
        L38:
            int r3 = r1.e()     // Catch: java.lang.Throwable -> L2f
            if (r3 < 0) goto L58
            android.media.MediaFormat r1 = r0.f15764h     // Catch: java.lang.Throwable -> L2f
            Z2.AbstractC0156a.l(r1)     // Catch: java.lang.Throwable -> L2f
            java.util.ArrayDeque r0 = r0.f     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r0 = r0.remove()     // Catch: java.lang.Throwable -> L2f
            android.media.MediaCodec$BufferInfo r0 = (android.media.MediaCodec.BufferInfo) r0     // Catch: java.lang.Throwable -> L2f
            int r5 = r0.offset     // Catch: java.lang.Throwable -> L2f
            int r6 = r0.size     // Catch: java.lang.Throwable -> L2f
            long r7 = r0.presentationTimeUs     // Catch: java.lang.Throwable -> L2f
            int r9 = r0.flags     // Catch: java.lang.Throwable -> L2f
            r4 = r11
            r4.set(r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L2f
            goto L2d
        L58:
            r11 = -2
            if (r3 != r11) goto L2d
            java.util.ArrayDeque r11 = r0.f15763g     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r11 = r11.remove()     // Catch: java.lang.Throwable -> L2f
            android.media.MediaFormat r11 = (android.media.MediaFormat) r11     // Catch: java.lang.Throwable -> L2f
            r0.f15764h = r11     // Catch: java.lang.Throwable -> L2f
            goto L2d
        L66:
            return r3
        L67:
            r0.f15766j = r1     // Catch: java.lang.Throwable -> L2f
            throw r3     // Catch: java.lang.Throwable -> L2f
        L6a:
            r0.f15769m = r1     // Catch: java.lang.Throwable -> L2f
            throw r3     // Catch: java.lang.Throwable -> L2f
        L6d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2f
            throw r11
        L6f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.C1381c.d(android.media.MediaCodec$BufferInfo):int");
    }

    public final void e() {
        if (this.f15746t) {
            try {
                C1383e c1383e = this.f15745s;
                X0.j jVar = c1383e.f15758e;
                jVar.c();
                Q q5 = c1383e.f15757c;
                q5.getClass();
                q5.obtainMessage(2).sendToTarget();
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

    @Override // w2.InterfaceC1389k
    public final void f(long j7, int i7) {
        this.f15743q.releaseOutputBuffer(i7, j7);
    }

    @Override // w2.InterfaceC1389k
    public final void flush() {
        this.f15745s.a();
        this.f15743q.flush();
        C1384f c1384f = this.f15744r;
        synchronized (c1384f.f15759a) {
            c1384f.f15767k++;
            Handler handler = c1384f.f15761c;
            int i7 = H.f4603a;
            handler.post(new E1.b(21, c1384f));
        }
        this.f15743q.start();
    }

    @Override // w2.InterfaceC1389k
    public final ByteBuffer g(int i7) {
        return this.f15743q.getInputBuffer(i7);
    }

    @Override // w2.InterfaceC1389k
    public final void h(Surface surface) {
        e();
        this.f15743q.setOutputSurface(surface);
    }

    @Override // w2.InterfaceC1389k
    public final void i(Bundle bundle) {
        e();
        this.f15743q.setParameters(bundle);
    }

    @Override // w2.InterfaceC1389k
    public final void j(int i7, boolean z7) {
        this.f15743q.releaseOutputBuffer(i7, z7);
    }

    @Override // w2.InterfaceC1389k
    public final ByteBuffer k(int i7) {
        return this.f15743q.getOutputBuffer(i7);
    }

    @Override // w2.InterfaceC1389k
    public final void l(C0208h c0208h, Handler handler) {
        e();
        this.f15743q.setOnFrameRenderedListener(new C1379a(this, c0208h, 0), handler);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0031 A[Catch: all -> 0x002f, TryCatch #0 {all -> 0x002f, blocks: (B:6:0x0012, B:8:0x0016, B:10:0x001a, B:12:0x0022, B:19:0x002d, B:23:0x0031, B:26:0x0038, B:28:0x003e, B:29:0x0040, B:30:0x0041, B:31:0x0043), top: B:35:0x0012 }] */
    @Override // w2.InterfaceC1389k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m() {
        /*
            r7 = this;
            w2.e r0 = r7.f15745s
            java.util.concurrent.atomic.AtomicReference r0 = r0.d
            r1 = 0
            java.lang.Object r0 = r0.getAndSet(r1)
            java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0
            if (r0 != 0) goto L46
            w2.f r0 = r7.f15744r
            java.lang.Object r2 = r0.f15759a
            monitor-enter(r2)
            java.lang.IllegalStateException r3 = r0.f15769m     // Catch: java.lang.Throwable -> L2f
            if (r3 != 0) goto L41
            android.media.MediaCodec$CodecException r3 = r0.f15766j     // Catch: java.lang.Throwable -> L2f
            if (r3 != 0) goto L3e
            long r3 = r0.f15767k     // Catch: java.lang.Throwable -> L2f
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 > 0) goto L29
            boolean r1 = r0.f15768l     // Catch: java.lang.Throwable -> L2f
            if (r1 == 0) goto L27
            goto L29
        L27:
            r1 = 0
            goto L2a
        L29:
            r1 = 1
        L2a:
            r3 = -1
            if (r1 == 0) goto L31
        L2d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2f
            goto L3d
        L2f:
            r0 = move-exception
            goto L44
        L31:
            s2.e r0 = r0.d     // Catch: java.lang.Throwable -> L2f
            int r1 = r0.f13592c     // Catch: java.lang.Throwable -> L2f
            if (r1 != 0) goto L38
            goto L2d
        L38:
            int r3 = r0.e()     // Catch: java.lang.Throwable -> L2f
            goto L2d
        L3d:
            return r3
        L3e:
            r0.f15766j = r1     // Catch: java.lang.Throwable -> L2f
            throw r3     // Catch: java.lang.Throwable -> L2f
        L41:
            r0.f15769m = r1     // Catch: java.lang.Throwable -> L2f
            throw r3     // Catch: java.lang.Throwable -> L2f
        L44:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2f
            throw r0
        L46:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.C1381c.m():int");
    }

    @Override // w2.InterfaceC1389k
    public final void n(int i7) {
        e();
        this.f15743q.setVideoScalingMode(i7);
    }

    @Override // w2.InterfaceC1389k
    public final MediaFormat o() {
        MediaFormat mediaFormat;
        C1384f c1384f = this.f15744r;
        synchronized (c1384f.f15759a) {
            try {
                mediaFormat = c1384f.f15764h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    @Override // w2.InterfaceC1389k
    public final void p(int i7, int i8, long j7, int i9) {
        C1383e c1383e = this.f15745s;
        RuntimeException runtimeException = (RuntimeException) c1383e.d.getAndSet(null);
        if (runtimeException == null) {
            C1382d b7 = C1383e.b();
            b7.f15749a = i7;
            b7.f15750b = 0;
            b7.f15751c = i8;
            b7.f15752e = j7;
            b7.f = i9;
            Q q5 = c1383e.f15757c;
            int i10 = H.f4603a;
            q5.obtainMessage(0, b7).sendToTarget();
            return;
        }
        throw runtimeException;
    }

    @Override // w2.InterfaceC1389k
    public final void q(int i7, i2.c cVar, long j7) {
        C1383e c1383e = this.f15745s;
        RuntimeException runtimeException = (RuntimeException) c1383e.d.getAndSet(null);
        if (runtimeException == null) {
            C1382d b7 = C1383e.b();
            b7.f15749a = i7;
            b7.f15750b = 0;
            b7.f15751c = 0;
            b7.f15752e = j7;
            b7.f = 0;
            int i8 = cVar.f;
            MediaCodec.CryptoInfo cryptoInfo = b7.d;
            cryptoInfo.numSubSamples = i8;
            int[] iArr = cVar.d;
            int[] iArr2 = cryptoInfo.numBytesOfClearData;
            if (iArr != null) {
                if (iArr2 != null && iArr2.length >= iArr.length) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                } else {
                    iArr2 = Arrays.copyOf(iArr, iArr.length);
                }
            }
            cryptoInfo.numBytesOfClearData = iArr2;
            int[] iArr3 = cVar.f11335e;
            int[] iArr4 = cryptoInfo.numBytesOfEncryptedData;
            if (iArr3 != null) {
                if (iArr4 != null && iArr4.length >= iArr3.length) {
                    System.arraycopy(iArr3, 0, iArr4, 0, iArr3.length);
                } else {
                    iArr4 = Arrays.copyOf(iArr3, iArr3.length);
                }
            }
            cryptoInfo.numBytesOfEncryptedData = iArr4;
            byte[] bArr = cVar.f11333b;
            byte[] bArr2 = cryptoInfo.key;
            if (bArr != null) {
                if (bArr2 != null && bArr2.length >= bArr.length) {
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                } else {
                    bArr2 = Arrays.copyOf(bArr, bArr.length);
                }
            }
            bArr2.getClass();
            cryptoInfo.key = bArr2;
            byte[] bArr3 = cVar.f11332a;
            byte[] bArr4 = cryptoInfo.iv;
            if (bArr3 != null) {
                if (bArr4 != null && bArr4.length >= bArr3.length) {
                    System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                } else {
                    bArr4 = Arrays.copyOf(bArr3, bArr3.length);
                }
            }
            bArr4.getClass();
            cryptoInfo.iv = bArr4;
            cryptoInfo.mode = cVar.f11334c;
            if (H.f4603a >= 24) {
                B3.a.s();
                cryptoInfo.setPattern(B3.a.f(cVar.f11336g, cVar.f11337h));
            }
            c1383e.f15757c.obtainMessage(1, b7).sendToTarget();
            return;
        }
        throw runtimeException;
    }
}
