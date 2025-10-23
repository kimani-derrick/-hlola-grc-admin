package a3;

import Z2.AbstractC0156a;
import Z2.H;
import Z2.RunnableC0160e;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.Locale;
/* loaded from: classes.dex */
public final class j extends HandlerThread implements Handler.Callback {

    /* renamed from: q  reason: collision with root package name */
    public RunnableC0160e f5079q;

    /* renamed from: r  reason: collision with root package name */
    public Handler f5080r;

    /* renamed from: s  reason: collision with root package name */
    public Error f5081s;

    /* renamed from: t  reason: collision with root package name */
    public RuntimeException f5082t;

    /* renamed from: u  reason: collision with root package name */
    public k f5083u;

    public final void a(int i7) {
        boolean z7;
        boolean z8;
        boolean z9;
        EGLSurface eglCreatePbufferSurface;
        boolean z10;
        boolean z11 = true;
        this.f5079q.getClass();
        RunnableC0160e runnableC0160e = this.f5079q;
        runnableC0160e.getClass();
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay != null) {
            z7 = true;
        } else {
            z7 = false;
        }
        AbstractC0156a.h("eglGetDisplay failed", z7);
        int[] iArr = new int[2];
        AbstractC0156a.h("eglInitialize failed", EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1));
        runnableC0160e.f4629s = eglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eglGetDisplay, RunnableC0160e.f4626w, 0, eGLConfigArr, 0, 1, iArr2, 0);
        if (eglChooseConfig && iArr2[0] > 0 && eGLConfigArr[0] != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        Object[] objArr = {Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr2[0]), eGLConfigArr[0]};
        int i8 = H.f4603a;
        AbstractC0156a.h(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr), z8);
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eglCreateContext = EGL14.eglCreateContext(runnableC0160e.f4629s, eGLConfig, EGL14.EGL_NO_CONTEXT, i7 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        if (eglCreateContext != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        AbstractC0156a.h("eglCreateContext failed", z9);
        runnableC0160e.f4630t = eglCreateContext;
        EGLDisplay eGLDisplay = runnableC0160e.f4629s;
        if (i7 == 1) {
            eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i7 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            if (eglCreatePbufferSurface != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            AbstractC0156a.h("eglCreatePbufferSurface failed", z10);
        }
        AbstractC0156a.h("eglMakeCurrent failed", EGL14.eglMakeCurrent(eGLDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext));
        runnableC0160e.f4631u = eglCreatePbufferSurface;
        int[] iArr3 = runnableC0160e.f4628r;
        GLES20.glGenTextures(1, iArr3, 0);
        AbstractC0156a.g();
        SurfaceTexture surfaceTexture = new SurfaceTexture(iArr3[0]);
        runnableC0160e.f4632v = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(runnableC0160e);
        SurfaceTexture surfaceTexture2 = this.f5079q.f4632v;
        surfaceTexture2.getClass();
        if (i7 == 0) {
            z11 = false;
        }
        this.f5083u = new k(this, surfaceTexture2, z11);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [android.opengl.EGLContext, android.graphics.SurfaceTexture, android.opengl.EGLSurface, android.opengl.EGLDisplay] */
    public final void b() {
        this.f5079q.getClass();
        RunnableC0160e runnableC0160e = this.f5079q;
        runnableC0160e.f4627q.removeCallbacks(runnableC0160e);
        try {
            SurfaceTexture surfaceTexture = runnableC0160e.f4632v;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, runnableC0160e.f4628r, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = runnableC0160e.f4629s;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = runnableC0160e.f4629s;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = runnableC0160e.f4631u;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(runnableC0160e.f4629s, runnableC0160e.f4631u);
            }
            EGLContext eGLContext = runnableC0160e.f4630t;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(runnableC0160e.f4629s, eGLContext);
            }
            if (H.f4603a >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay3 = runnableC0160e.f4629s;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(runnableC0160e.f4629s);
            }
            runnableC0160e.f4629s = null;
            runnableC0160e.f4630t = null;
            runnableC0160e.f4631u = null;
            runnableC0160e.f4632v = null;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i7 = message.what;
        try {
            if (i7 != 1) {
                if (i7 != 2) {
                    return true;
                }
                try {
                    b();
                } finally {
                    try {
                        return true;
                    } finally {
                    }
                }
                return true;
            }
            try {
                a(message.arg1);
                synchronized (this) {
                    notify();
                }
            } catch (Z2.i e3) {
                AbstractC0156a.r("PlaceholderSurface", "Failed to initialize placeholder surface", e3);
                this.f5082t = new IllegalStateException(e3);
                synchronized (this) {
                    notify();
                }
            } catch (Error e7) {
                AbstractC0156a.r("PlaceholderSurface", "Failed to initialize placeholder surface", e7);
                this.f5081s = e7;
                synchronized (this) {
                    notify();
                }
            } catch (RuntimeException e8) {
                AbstractC0156a.r("PlaceholderSurface", "Failed to initialize placeholder surface", e8);
                this.f5082t = e8;
                synchronized (this) {
                    notify();
                }
            }
            return true;
        } catch (Throwable th) {
            synchronized (this) {
                notify();
                throw th;
            }
        }
    }
}
