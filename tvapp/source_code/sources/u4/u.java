package u4;

import android.util.Log;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;
import k.C0852F;
import r4.C1119a;
/* loaded from: classes.dex */
public final class u implements Thread.UncaughtExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    public final C0852F f15056a;

    /* renamed from: b  reason: collision with root package name */
    public final B4.d f15057b;

    /* renamed from: c  reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f15058c;
    public final C1119a d;

    /* renamed from: e  reason: collision with root package name */
    public final AtomicBoolean f15059e = new AtomicBoolean(false);

    public u(C0852F c0852f, B4.d dVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, C1119a c1119a) {
        this.f15056a = c0852f;
        this.f15057b = dVar;
        this.f15058c = uncaughtExceptionHandler;
        this.d = c1119a;
    }

    public final boolean a(Thread thread, Throwable th) {
        if (thread == null) {
            Log.e("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; null thread", null);
            return false;
        } else if (th == null) {
            Log.e("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; null throwable", null);
            return false;
        } else if (this.d.b()) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; native crash exists for session.", null);
            }
            return false;
        } else {
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
        if (android.util.Log.isLoggable("FirebaseCrashlytics", 3) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
        android.util.Log.d("FirebaseCrashlytics", "Completed exception processing. Invoking default exception handler.", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
        r0.uncaughtException(r10, r11);
        r3.set(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
        if (android.util.Log.isLoggable("FirebaseCrashlytics", 3) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
        return;
     */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void uncaughtException(java.lang.Thread r10, java.lang.Throwable r11) {
        /*
            r9 = this;
            java.lang.Thread$UncaughtExceptionHandler r0 = r9.f15058c
            java.lang.String r1 = "Completed exception processing. Invoking default exception handler."
            java.lang.String r2 = "FirebaseCrashlytics"
            java.util.concurrent.atomic.AtomicBoolean r3 = r9.f15059e
            r4 = 1
            r3.set(r4)
            r4 = 3
            r5 = 0
            r6 = 0
            boolean r7 = r9.a(r10, r11)     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L1f
            if (r7 == 0) goto L21
            k.F r7 = r9.f15056a     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L1f
            B4.d r8 = r9.f15057b     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L1f
            r7.A(r8, r10, r11)     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L1f
            goto L2c
        L1d:
            r7 = move-exception
            goto L49
        L1f:
            r7 = move-exception
            goto L3c
        L21:
            java.lang.String r7 = "Uncaught exception will not be recorded by Crashlytics."
            boolean r8 = android.util.Log.isLoggable(r2, r4)     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L1f
            if (r8 == 0) goto L2c
            android.util.Log.d(r2, r7, r5)     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L1f
        L2c:
            boolean r4 = android.util.Log.isLoggable(r2, r4)
            if (r4 == 0) goto L35
        L32:
            android.util.Log.d(r2, r1, r5)
        L35:
            r0.uncaughtException(r10, r11)
            r3.set(r6)
            goto L48
        L3c:
            java.lang.String r8 = "An error occurred in the uncaught exception handler"
            android.util.Log.e(r2, r8, r7)     // Catch: java.lang.Throwable -> L1d
            boolean r4 = android.util.Log.isLoggable(r2, r4)
            if (r4 == 0) goto L35
            goto L32
        L48:
            return
        L49:
            boolean r4 = android.util.Log.isLoggable(r2, r4)
            if (r4 == 0) goto L52
            android.util.Log.d(r2, r1, r5)
        L52:
            r0.uncaughtException(r10, r11)
            r3.set(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: u4.u.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
    }
}
