package b3;

import Y2.C0152v;
import Z2.AbstractC0156a;
import Z2.H;
import Z2.y;
import a3.o;
import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Log;
import e2.K;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
/* renamed from: b3.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0373i implements o, InterfaceC0365a {

    /* renamed from: C  reason: collision with root package name */
    public byte[] f7087C;

    /* renamed from: y  reason: collision with root package name */
    public int f7096y;

    /* renamed from: z  reason: collision with root package name */
    public SurfaceTexture f7097z;

    /* renamed from: q  reason: collision with root package name */
    public final AtomicBoolean f7088q = new AtomicBoolean();

    /* renamed from: r  reason: collision with root package name */
    public final AtomicBoolean f7089r = new AtomicBoolean(true);

    /* renamed from: s  reason: collision with root package name */
    public final C0371g f7090s = new Object();

    /* renamed from: t  reason: collision with root package name */
    public final L0.b f7091t = new L0.b();

    /* renamed from: u  reason: collision with root package name */
    public final C0152v f7092u = new C0152v(1);

    /* renamed from: v  reason: collision with root package name */
    public final C0152v f7093v = new C0152v(1);

    /* renamed from: w  reason: collision with root package name */
    public final float[] f7094w = new float[16];

    /* renamed from: x  reason: collision with root package name */
    public final float[] f7095x = new float[16];

    /* renamed from: A  reason: collision with root package name */
    public volatile int f7085A = 0;

    /* renamed from: B  reason: collision with root package name */
    public int f7086B = -1;

    @Override // b3.InterfaceC0365a
    public final void a() {
        this.f7092u.b();
        L0.b bVar = this.f7091t;
        ((C0152v) bVar.d).b();
        bVar.f1862a = false;
        this.f7089r.set(true);
    }

    @Override // b3.InterfaceC0365a
    public final void b(long j7, float[] fArr) {
        ((C0152v) this.f7091t.d).a(j7, fArr);
    }

    public final void c(float[] fArr) {
        float[] fArr2;
        Object d;
        GLES20.glClear(16384);
        try {
            AbstractC0156a.g();
        } catch (Z2.i e3) {
            AbstractC0156a.r("SceneRenderer", "Failed to draw a frame", e3);
        }
        if (this.f7088q.compareAndSet(true, false)) {
            SurfaceTexture surfaceTexture = this.f7097z;
            surfaceTexture.getClass();
            surfaceTexture.updateTexImage();
            try {
                AbstractC0156a.g();
            } catch (Z2.i e7) {
                AbstractC0156a.r("SceneRenderer", "Failed to draw a frame", e7);
            }
            if (this.f7089r.compareAndSet(true, false)) {
                Matrix.setIdentityM(this.f7094w, 0);
            }
            long timestamp = this.f7097z.getTimestamp();
            C0152v c0152v = this.f7092u;
            synchronized (c0152v) {
                d = c0152v.d(false, timestamp);
            }
            Long l7 = (Long) d;
            if (l7 != null) {
                L0.b bVar = this.f7091t;
                float[] fArr3 = this.f7094w;
                float[] fArr4 = (float[]) ((C0152v) bVar.d).e(l7.longValue());
                if (fArr4 != null) {
                    float f = fArr4[0];
                    float f7 = -fArr4[1];
                    float f8 = -fArr4[2];
                    float length = Matrix.length(f, f7, f8);
                    int i7 = (length > 0.0f ? 1 : (length == 0.0f ? 0 : -1));
                    float[] fArr5 = (float[]) bVar.f1864c;
                    if (i7 != 0) {
                        Matrix.setRotateM(fArr5, 0, (float) Math.toDegrees(length), f / length, f7 / length, f8 / length);
                    } else {
                        Matrix.setIdentityM(fArr5, 0);
                    }
                    if (!bVar.f1862a) {
                        L0.b.c((float[]) bVar.f1863b, (float[]) bVar.f1864c);
                        bVar.f1862a = true;
                    }
                    Matrix.multiplyMM(fArr3, 0, (float[]) bVar.f1863b, 0, (float[]) bVar.f1864c, 0);
                }
            }
            C0370f c0370f = (C0370f) this.f7093v.e(timestamp);
            if (c0370f != null) {
                C0371g c0371g = this.f7090s;
                c0371g.getClass();
                if (C0371g.b(c0370f)) {
                    c0371g.f7078a = c0370f.f7074c;
                    c0371g.f7079b = new C0152v(c0370f.f7072a.f7071a[0]);
                    if (!c0370f.d) {
                        new C0152v(c0370f.f7073b.f7071a[0]);
                    }
                    c0371g.getClass();
                }
            }
        }
        Matrix.multiplyMM(this.f7095x, 0, fArr, 0, this.f7094w, 0);
        C0371g c0371g2 = this.f7090s;
        int i8 = this.f7096y;
        float[] fArr6 = this.f7095x;
        C0152v c0152v2 = c0371g2.f7079b;
        if (c0152v2 != null) {
            int i9 = c0371g2.f7078a;
            if (i9 == 1) {
                fArr2 = C0371g.f7076j;
            } else if (i9 == 2) {
                fArr2 = C0371g.f7077k;
            } else {
                fArr2 = C0371g.f7075i;
            }
            GLES20.glUniformMatrix3fv(c0371g2.f7081e, 1, false, fArr2, 0);
            GLES20.glUniformMatrix4fv(c0371g2.d, 1, false, fArr6, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, i8);
            GLES20.glUniform1i(c0371g2.f7083h, 0);
            try {
                AbstractC0156a.g();
            } catch (Z2.i e8) {
                Log.e("ProjectionRenderer", "Failed to bind uniforms", e8);
            }
            GLES20.glVertexAttribPointer(c0371g2.f, 3, 5126, false, 12, (Buffer) ((FloatBuffer) c0152v2.f4465s));
            try {
                AbstractC0156a.g();
            } catch (Z2.i e9) {
                Log.e("ProjectionRenderer", "Failed to load position data", e9);
            }
            GLES20.glVertexAttribPointer(c0371g2.f7082g, 2, 5126, false, 8, (Buffer) ((FloatBuffer) c0152v2.f4466t));
            try {
                AbstractC0156a.g();
            } catch (Z2.i e10) {
                Log.e("ProjectionRenderer", "Failed to load texture data", e10);
            }
            GLES20.glDrawArrays(c0152v2.f4464r, 0, c0152v2.f4463q);
            try {
                AbstractC0156a.g();
            } catch (Z2.i e11) {
                Log.e("ProjectionRenderer", "Failed to render", e11);
            }
        }
    }

    @Override // a3.o
    public final void d(long j7, long j8, K k5, MediaFormat mediaFormat) {
        float f;
        int i7;
        int i8;
        int i9;
        int i10;
        ArrayList arrayList;
        int g7;
        int i11 = 1;
        this.f7092u.a(j8, Long.valueOf(j7));
        byte[] bArr = k5.f9664L;
        int i12 = k5.f9665M;
        byte[] bArr2 = this.f7087C;
        int i13 = this.f7086B;
        this.f7087C = bArr;
        if (i12 == -1) {
            i12 = this.f7085A;
        }
        this.f7086B = i12;
        if (i13 != i12 || !Arrays.equals(bArr2, this.f7087C)) {
            byte[] bArr3 = this.f7087C;
            C0370f c0370f = null;
            if (bArr3 != null) {
                int i14 = this.f7086B;
                y yVar = new y(bArr3);
                try {
                    yVar.G(4);
                    g7 = yVar.g();
                    yVar.F(0);
                } catch (ArrayIndexOutOfBoundsException unused) {
                }
                if (g7 == 1886547818) {
                    yVar.G(8);
                    int i15 = yVar.f4692b;
                    int i16 = yVar.f4693c;
                    while (i15 < i16) {
                        int g8 = yVar.g() + i15;
                        if (g8 <= i15 || g8 > i16) {
                            break;
                        }
                        int g9 = yVar.g();
                        if (g9 != 2037673328 && g9 != 1836279920) {
                            yVar.F(g8);
                            i15 = g8;
                        }
                        yVar.E(g8);
                        arrayList = p6.d.y(yVar);
                        break;
                    }
                    arrayList = null;
                } else {
                    arrayList = p6.d.y(yVar);
                }
                if (arrayList != null) {
                    int size = arrayList.size();
                    if (size != 1) {
                        if (size == 2) {
                            c0370f = new C0370f((C0369e) arrayList.get(0), (C0369e) arrayList.get(1), i14);
                        }
                    } else {
                        C0369e c0369e = (C0369e) arrayList.get(0);
                        c0370f = new C0370f(c0369e, c0369e, i14);
                    }
                }
            }
            if (c0370f == null || !C0371g.b(c0370f)) {
                int i17 = this.f7086B;
                float radians = (float) Math.toRadians(180.0f);
                float radians2 = (float) Math.toRadians(360.0f);
                float f7 = radians / 36;
                float f8 = radians2 / 72;
                float[] fArr = new float[15984];
                float[] fArr2 = new float[10656];
                int i18 = 0;
                int i19 = 0;
                int i20 = 0;
                for (int i21 = 36; i18 < i21; i21 = 36) {
                    float f9 = radians / 2.0f;
                    float f10 = (i18 * f7) - f9;
                    int i22 = i18 + 1;
                    float f11 = (i22 * f7) - f9;
                    int i23 = 0;
                    while (i23 < 73) {
                        float f12 = f11;
                        float f13 = f10;
                        int i24 = i22;
                        int i25 = i19;
                        int i26 = i20;
                        int i27 = 0;
                        int i28 = 2;
                        while (i27 < i28) {
                            if (i27 == 0) {
                                f = f13;
                            } else {
                                f = f12;
                            }
                            float f14 = i23 * f8;
                            float f15 = f8;
                            int i29 = i23;
                            float f16 = radians;
                            double d = 50.0f;
                            int i30 = i17;
                            double d7 = (3.1415927f + f14) - (radians2 / 2.0f);
                            double d8 = f;
                            int i31 = i27;
                            float f17 = f7;
                            fArr[i25] = -((float) (Math.cos(d8) * Math.sin(d7) * d));
                            int i32 = i18;
                            float[] fArr3 = fArr2;
                            fArr[i25 + 1] = (float) (Math.sin(d8) * d);
                            int i33 = i25 + 3;
                            fArr[i25 + 2] = (float) (Math.cos(d8) * Math.cos(d7) * d);
                            fArr3[i26] = f14 / radians2;
                            int i34 = i26 + 2;
                            fArr3[i26 + 1] = ((i32 + i31) * f17) / f16;
                            if (i29 != 0 || i31 != 0) {
                                i7 = i29;
                                i8 = i31;
                                i9 = 3;
                                if (i7 != 72 || i8 != 1) {
                                    i10 = 2;
                                    i26 = i34;
                                    i25 = i33;
                                    int i35 = i8 + 1;
                                    i23 = i7;
                                    fArr2 = fArr3;
                                    i28 = i10;
                                    f8 = f15;
                                    radians = f16;
                                    i17 = i30;
                                    i18 = i32;
                                    f7 = f17;
                                    i27 = i35;
                                }
                            } else {
                                i8 = i31;
                                i7 = i29;
                                i9 = 3;
                            }
                            System.arraycopy(fArr, i25, fArr, i33, i9);
                            i25 += 6;
                            i10 = 2;
                            System.arraycopy(fArr3, i26, fArr3, i34, 2);
                            i26 += 4;
                            int i352 = i8 + 1;
                            i23 = i7;
                            fArr2 = fArr3;
                            i28 = i10;
                            f8 = f15;
                            radians = f16;
                            i17 = i30;
                            i18 = i32;
                            f7 = f17;
                            i27 = i352;
                        }
                        i23++;
                        i20 = i26;
                        i19 = i25;
                        f10 = f13;
                        i22 = i24;
                        radians = radians;
                        i17 = i17;
                        f7 = f7;
                        f11 = f12;
                    }
                    i18 = i22;
                    i11 = 1;
                }
                int i36 = i17;
                C0152v[] c0152vArr = new C0152v[i11];
                c0152vArr[0] = new C0152v(0, fArr, fArr2, i11);
                C0369e c0369e2 = new C0369e(c0152vArr);
                c0370f = new C0370f(c0369e2, c0369e2, i36);
            }
            this.f7093v.a(j8, c0370f);
        }
    }

    public final SurfaceTexture e() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            AbstractC0156a.g();
            this.f7090s.a();
            AbstractC0156a.g();
            AbstractC0156a.h("No current context", !H.a(EGL14.eglGetCurrentContext(), EGL14.EGL_NO_CONTEXT));
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            AbstractC0156a.g();
            int i7 = iArr[0];
            AbstractC0156a.c(36197, i7);
            this.f7096y = i7;
        } catch (Z2.i e3) {
            AbstractC0156a.r("SceneRenderer", "Failed to initialize the renderer", e3);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f7096y);
        this.f7097z = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: b3.h
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                C0373i.this.f7088q.set(true);
            }
        });
        return this.f7097z;
    }
}
