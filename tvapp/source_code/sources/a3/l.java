package a3;

import Z2.AbstractC0156a;
import Z2.C0163h;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.util.Log;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
/* loaded from: classes.dex */
public final class l implements GLSurfaceView.Renderer {

    /* renamed from: x  reason: collision with root package name */
    public static final String[] f5089x = {"y_tex", "u_tex", "v_tex"};

    /* renamed from: y  reason: collision with root package name */
    public static final FloatBuffer f5090y = AbstractC0156a.o(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});

    /* renamed from: q  reason: collision with root package name */
    public final GLSurfaceView f5091q;

    /* renamed from: r  reason: collision with root package name */
    public final int[] f5092r = new int[3];

    /* renamed from: s  reason: collision with root package name */
    public final int[] f5093s = new int[3];

    /* renamed from: t  reason: collision with root package name */
    public final int[] f5094t = new int[3];

    /* renamed from: u  reason: collision with root package name */
    public final int[] f5095u = new int[3];

    /* renamed from: v  reason: collision with root package name */
    public final AtomicReference f5096v = new AtomicReference();

    /* renamed from: w  reason: collision with root package name */
    public C0163h f5097w;

    public l(GLSurfaceView gLSurfaceView) {
        this.f5091q = gLSurfaceView;
        for (int i7 = 0; i7 < 3; i7++) {
            int[] iArr = this.f5094t;
            this.f5095u[i7] = -1;
            iArr[i7] = -1;
        }
    }

    public final void a() {
        int[] iArr = this.f5092r;
        try {
            GLES20.glGenTextures(3, iArr, 0);
            for (int i7 = 0; i7 < 3; i7++) {
                C0163h c0163h = this.f5097w;
                GLES20.glUniform1i(GLES20.glGetUniformLocation(c0163h.f4635r, f5089x[i7]), i7);
                GLES20.glActiveTexture(33984 + i7);
                AbstractC0156a.c(3553, iArr[i7]);
            }
            AbstractC0156a.g();
        } catch (Z2.i e3) {
            Log.e("VideoDecoderGLSV", "Failed to set up the textures", e3);
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        AbstractC0515y1.v(this.f5096v.getAndSet(null));
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i7, int i8) {
        GLES20.glViewport(0, 0, i7, i8);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        int[] iArr = this.f5093s;
        try {
            C0163h c0163h = new C0163h("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");
            this.f5097w = c0163h;
            GLES20.glVertexAttribPointer(c0163h.g("in_pos"), 2, 5126, false, 0, (Buffer) f5090y);
            iArr[0] = this.f5097w.g("in_tc_y");
            iArr[1] = this.f5097w.g("in_tc_u");
            iArr[2] = this.f5097w.g("in_tc_v");
            GLES20.glGetUniformLocation(this.f5097w.f4635r, "mColorConversion");
            AbstractC0156a.g();
            a();
            AbstractC0156a.g();
        } catch (Z2.i e3) {
            Log.e("VideoDecoderGLSV", "Failed to set up the textures and program", e3);
        }
    }
}
