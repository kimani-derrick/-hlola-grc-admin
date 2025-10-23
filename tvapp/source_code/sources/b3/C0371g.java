package b3;

import Y2.C0152v;
import Z2.C0163h;
import android.opengl.GLES20;
import android.util.Log;
/* renamed from: b3.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0371g {

    /* renamed from: i  reason: collision with root package name */
    public static final float[] f7075i = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: j  reason: collision with root package name */
    public static final float[] f7076j = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: k  reason: collision with root package name */
    public static final float[] f7077k = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: a  reason: collision with root package name */
    public int f7078a;

    /* renamed from: b  reason: collision with root package name */
    public C0152v f7079b;

    /* renamed from: c  reason: collision with root package name */
    public C0163h f7080c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public int f7081e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public int f7082g;

    /* renamed from: h  reason: collision with root package name */
    public int f7083h;

    public static boolean b(C0370f c0370f) {
        C0152v[] c0152vArr = c0370f.f7072a.f7071a;
        if (c0152vArr.length != 1 || c0152vArr[0].f4463q != 0) {
            return false;
        }
        C0152v[] c0152vArr2 = c0370f.f7073b.f7071a;
        if (c0152vArr2.length != 1 || c0152vArr2[0].f4463q != 0) {
            return false;
        }
        return true;
    }

    public final void a() {
        try {
            C0163h c0163h = new C0163h("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
            this.f7080c = c0163h;
            this.d = GLES20.glGetUniformLocation(c0163h.f4635r, "uMvpMatrix");
            this.f7081e = GLES20.glGetUniformLocation(this.f7080c.f4635r, "uTexMatrix");
            this.f = this.f7080c.g("aPosition");
            this.f7082g = this.f7080c.g("aTexCoords");
            this.f7083h = GLES20.glGetUniformLocation(this.f7080c.f4635r, "uTexture");
        } catch (Z2.i e3) {
            Log.e("ProjectionRenderer", "Failed to initialize the program", e3);
        }
    }
}
