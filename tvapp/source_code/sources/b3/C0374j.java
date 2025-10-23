package b3;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
/* renamed from: b3.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0374j implements GLSurfaceView.Renderer, InterfaceC0367c {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ k f7098A;

    /* renamed from: q  reason: collision with root package name */
    public final C0373i f7099q;

    /* renamed from: t  reason: collision with root package name */
    public final float[] f7102t;

    /* renamed from: u  reason: collision with root package name */
    public final float[] f7103u;

    /* renamed from: v  reason: collision with root package name */
    public final float[] f7104v;

    /* renamed from: w  reason: collision with root package name */
    public float f7105w;

    /* renamed from: x  reason: collision with root package name */
    public float f7106x;

    /* renamed from: r  reason: collision with root package name */
    public final float[] f7100r = new float[16];

    /* renamed from: s  reason: collision with root package name */
    public final float[] f7101s = new float[16];

    /* renamed from: y  reason: collision with root package name */
    public final float[] f7107y = new float[16];

    /* renamed from: z  reason: collision with root package name */
    public final float[] f7108z = new float[16];

    public C0374j(k kVar, C0373i c0373i) {
        this.f7098A = kVar;
        float[] fArr = new float[16];
        this.f7102t = fArr;
        float[] fArr2 = new float[16];
        this.f7103u = fArr2;
        float[] fArr3 = new float[16];
        this.f7104v = fArr3;
        this.f7099q = c0373i;
        Matrix.setIdentityM(fArr, 0);
        Matrix.setIdentityM(fArr2, 0);
        Matrix.setIdentityM(fArr3, 0);
        this.f7106x = 3.1415927f;
    }

    @Override // b3.InterfaceC0367c
    public final synchronized void a(float[] fArr, float f) {
        float[] fArr2 = this.f7102t;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        float f7 = -f;
        this.f7106x = f7;
        Matrix.setRotateM(this.f7103u, 0, -this.f7105w, (float) Math.cos(f7), (float) Math.sin(this.f7106x), 0.0f);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        synchronized (this) {
            Matrix.multiplyMM(this.f7108z, 0, this.f7102t, 0, this.f7104v, 0);
            Matrix.multiplyMM(this.f7107y, 0, this.f7103u, 0, this.f7108z, 0);
        }
        Matrix.multiplyMM(this.f7101s, 0, this.f7100r, 0, this.f7107y, 0);
        this.f7099q.c(this.f7101s);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i7, int i8) {
        float f;
        GLES20.glViewport(0, 0, i7, i8);
        float f7 = i7 / i8;
        if (f7 > 1.0f) {
            f = (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / f7)) * 2.0d);
        } else {
            f = 90.0f;
        }
        Matrix.perspectiveM(this.f7100r, 0, f, f7, 0.1f, 100.0f);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        k kVar = this.f7098A;
        kVar.f7115u.post(new A4.d(kVar, 9, this.f7099q.e()));
    }
}
