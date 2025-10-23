package a3;

import Z2.AbstractC0156a;
import Z2.H;
import Z2.RunnableC0160e;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
/* loaded from: classes.dex */
public final class k extends Surface {

    /* renamed from: t  reason: collision with root package name */
    public static int f5084t;

    /* renamed from: u  reason: collision with root package name */
    public static boolean f5085u;

    /* renamed from: q  reason: collision with root package name */
    public final boolean f5086q;

    /* renamed from: r  reason: collision with root package name */
    public final j f5087r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f5088s;

    public k(j jVar, SurfaceTexture surfaceTexture, boolean z7) {
        super(surfaceTexture);
        this.f5087r = jVar;
        this.f5086q = z7;
    }

    public static int a(Context context) {
        String eglQueryString;
        String eglQueryString2;
        int i7 = H.f4603a;
        if (i7 < 24 || ((i7 < 26 && ("samsung".equals(H.f4605c) || "XT1650".equals(H.d))) || ((i7 < 26 && !context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) || (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) == null || !eglQueryString.contains("EGL_EXT_protected_content")))) {
            return 0;
        }
        if (i7 >= 17 && (eglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString2.contains("EGL_KHR_surfaceless_context")) {
            return 1;
        }
        return 2;
    }

    public static synchronized boolean d(Context context) {
        boolean z7;
        synchronized (k.class) {
            try {
                z7 = true;
                if (!f5085u) {
                    f5084t = a(context);
                    f5085u = true;
                }
                if (f5084t == 0) {
                    z7 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z7;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [a3.j, android.os.HandlerThread, java.lang.Thread, android.os.Handler$Callback, java.lang.Object] */
    public static k e(Context context, boolean z7) {
        boolean z8;
        int i7;
        boolean z9 = false;
        if (z7 && !d(context)) {
            z8 = false;
        } else {
            z8 = true;
        }
        AbstractC0156a.k(z8);
        ?? handlerThread = new HandlerThread("ExoPlayer:PlaceholderSurface");
        if (z7) {
            i7 = f5084t;
        } else {
            i7 = 0;
        }
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper(), handlerThread);
        handlerThread.f5080r = handler;
        handlerThread.f5079q = new RunnableC0160e(handler);
        synchronized (handlerThread) {
            handlerThread.f5080r.obtainMessage(1, i7, 0).sendToTarget();
            while (handlerThread.f5083u == null && handlerThread.f5082t == null && handlerThread.f5081s == null) {
                try {
                    handlerThread.wait();
                } catch (InterruptedException unused) {
                    z9 = true;
                }
            }
        }
        if (z9) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = handlerThread.f5082t;
        if (runtimeException == null) {
            Error error = handlerThread.f5081s;
            if (error == null) {
                k kVar = handlerThread.f5083u;
                kVar.getClass();
                return kVar;
            }
            throw error;
        }
        throw runtimeException;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f5087r) {
            try {
                if (!this.f5088s) {
                    j jVar = this.f5087r;
                    jVar.f5080r.getClass();
                    jVar.f5080r.sendEmptyMessage(2);
                    this.f5088s = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
