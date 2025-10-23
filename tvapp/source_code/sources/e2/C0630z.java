package e2;

import android.media.MediaFormat;
import b3.InterfaceC0365a;
/* renamed from: e2.z  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0630z implements a3.o, InterfaceC0365a, w0 {

    /* renamed from: q  reason: collision with root package name */
    public a3.o f10097q;

    /* renamed from: r  reason: collision with root package name */
    public InterfaceC0365a f10098r;

    /* renamed from: s  reason: collision with root package name */
    public a3.o f10099s;

    /* renamed from: t  reason: collision with root package name */
    public InterfaceC0365a f10100t;

    @Override // b3.InterfaceC0365a
    public final void a() {
        InterfaceC0365a interfaceC0365a = this.f10100t;
        if (interfaceC0365a != null) {
            interfaceC0365a.a();
        }
        InterfaceC0365a interfaceC0365a2 = this.f10098r;
        if (interfaceC0365a2 != null) {
            interfaceC0365a2.a();
        }
    }

    @Override // b3.InterfaceC0365a
    public final void b(long j7, float[] fArr) {
        InterfaceC0365a interfaceC0365a = this.f10100t;
        if (interfaceC0365a != null) {
            interfaceC0365a.b(j7, fArr);
        }
        InterfaceC0365a interfaceC0365a2 = this.f10098r;
        if (interfaceC0365a2 != null) {
            interfaceC0365a2.b(j7, fArr);
        }
    }

    @Override // e2.w0
    public final void c(int i7, Object obj) {
        InterfaceC0365a cameraMotionListener;
        if (i7 != 7) {
            if (i7 != 8) {
                if (i7 == 10000) {
                    b3.k kVar = (b3.k) obj;
                    if (kVar == null) {
                        cameraMotionListener = null;
                        this.f10099s = null;
                    } else {
                        this.f10099s = kVar.getVideoFrameMetadataListener();
                        cameraMotionListener = kVar.getCameraMotionListener();
                    }
                    this.f10100t = cameraMotionListener;
                    return;
                }
                return;
            }
            this.f10098r = (InterfaceC0365a) obj;
            return;
        }
        this.f10097q = (a3.o) obj;
    }

    @Override // a3.o
    public final void d(long j7, long j8, K k5, MediaFormat mediaFormat) {
        a3.o oVar = this.f10099s;
        if (oVar != null) {
            oVar.d(j7, j8, k5, mediaFormat);
        }
        a3.o oVar2 = this.f10097q;
        if (oVar2 != null) {
            oVar2.d(j7, j8, k5, mediaFormat);
        }
    }
}
