package j2;

import Z2.AbstractC0156a;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
/* renamed from: j2.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class HandlerC0832a extends Handler {

    /* renamed from: a  reason: collision with root package name */
    public boolean f11763a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0834c f11764b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC0832a(C0834c c0834c, Looper looper) {
        super(looper);
        this.f11764b = c0834c;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(android.os.Message r8, j2.D r9) {
        /*
            r7 = this;
            java.lang.Object r0 = r8.obj
            j2.b r0 = (j2.C0833b) r0
            boolean r1 = r0.f11766b
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            int r1 = r0.d
            r3 = 1
            int r1 = r1 + r3
            r0.d = r1
            j2.c r4 = r7.f11764b
            L4.f r4 = r4.f11775j
            r5 = 3
            int r4 = r4.K(r5)
            if (r1 <= r4) goto L1c
            return r2
        L1c:
            H2.q r1 = new H2.q
            android.os.SystemClock.elapsedRealtime()
            android.os.SystemClock.elapsedRealtime()
            java.lang.Throwable r1 = r9.getCause()
            boolean r1 = r1 instanceof java.io.IOException
            if (r1 == 0) goto L33
            java.lang.Throwable r9 = r9.getCause()
            java.io.IOException r9 = (java.io.IOException) r9
            goto L3d
        L33:
            H1.d r1 = new H1.d
            java.lang.Throwable r9 = r9.getCause()
            r1.<init>(r9)
            r9 = r1
        L3d:
            j2.c r1 = r7.f11764b
            L4.f r1 = r1.f11775j
            int r0 = r0.d
            r1.getClass()
            boolean r1 = r9 instanceof e2.m0
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L7d
            boolean r1 = r9 instanceof java.io.FileNotFoundException
            if (r1 != 0) goto L7d
            boolean r1 = r9 instanceof Y2.C
            if (r1 != 0) goto L7d
            boolean r1 = r9 instanceof Y2.M
            if (r1 != 0) goto L7d
            int r1 = Y2.C0145n.f4406r
        L5d:
            if (r9 == 0) goto L72
            boolean r1 = r9 instanceof Y2.C0145n
            if (r1 == 0) goto L6d
            r1 = r9
            Y2.n r1 = (Y2.C0145n) r1
            int r1 = r1.f4407q
            r6 = 2008(0x7d8, float:2.814E-42)
            if (r1 != r6) goto L6d
            goto L7d
        L6d:
            java.lang.Throwable r9 = r9.getCause()
            goto L5d
        L72:
            int r0 = r0 - r3
            int r0 = r0 * 1000
            r9 = 5000(0x1388, float:7.006E-42)
            int r9 = java.lang.Math.min(r0, r9)
            long r0 = (long) r9
            goto L7e
        L7d:
            r0 = r4
        L7e:
            int r9 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r9 != 0) goto L83
            return r2
        L83:
            monitor-enter(r7)
            boolean r9 = r7.f11763a     // Catch: java.lang.Throwable -> L91
            if (r9 != 0) goto L93
            android.os.Message r8 = android.os.Message.obtain(r8)     // Catch: java.lang.Throwable -> L91
            r7.sendMessageDelayed(r8, r0)     // Catch: java.lang.Throwable -> L91
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L91
            return r3
        L91:
            r8 = move-exception
            goto L95
        L93:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L91
            return r2
        L95:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L91
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.HandlerC0832a.a(android.os.Message, j2.D):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Throwable, java.lang.Exception] */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        byte[] bArr;
        C0833b c0833b = (C0833b) message.obj;
        try {
            int i7 = message.what;
            if (i7 != 0) {
                if (i7 == 1) {
                    C0834c c0834c = this.f11764b;
                    bArr = c0834c.f11777l.d(c0834c.f11778m, (v) c0833b.f11767c);
                } else {
                    throw new RuntimeException();
                }
            } else {
                bArr = this.f11764b.f11777l.f((w) c0833b.f11767c);
            }
        } catch (D e3) {
            boolean a7 = a(message, e3);
            bArr = e3;
            if (a7) {
                return;
            }
        } catch (Exception e7) {
            AbstractC0156a.L("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e7);
            bArr = e7;
        }
        L4.f fVar = this.f11764b.f11775j;
        long j7 = c0833b.f11765a;
        fVar.getClass();
        synchronized (this) {
            try {
                if (!this.f11763a) {
                    this.f11764b.f11779o.obtainMessage(message.what, Pair.create(c0833b.f11767c, bArr)).sendToTarget();
                }
            } finally {
            }
        }
    }
}
