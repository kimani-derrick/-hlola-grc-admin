package Z2;

import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;
/* renamed from: Z2.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0160e implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* renamed from: w  reason: collision with root package name */
    public static final int[] f4626w = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: q  reason: collision with root package name */
    public final Handler f4627q;

    /* renamed from: r  reason: collision with root package name */
    public final int[] f4628r = new int[1];

    /* renamed from: s  reason: collision with root package name */
    public EGLDisplay f4629s;

    /* renamed from: t  reason: collision with root package name */
    public EGLContext f4630t;

    /* renamed from: u  reason: collision with root package name */
    public EGLSurface f4631u;

    /* renamed from: v  reason: collision with root package name */
    public SurfaceTexture f4632v;

    public RunnableC0160e(Handler handler) {
        this.f4627q = handler;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f4627q.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceTexture surfaceTexture = this.f4632v;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
