package b3;

import Z2.H;
import Z2.y;
import androidx.fragment.app.D;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import e2.AbstractC0600d;
import e2.K;
import java.nio.ByteBuffer;
/* renamed from: b3.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0366b extends AbstractC0600d {

    /* renamed from: E  reason: collision with root package name */
    public final i2.g f7062E;
    public final y F;

    /* renamed from: G  reason: collision with root package name */
    public long f7063G;

    /* renamed from: H  reason: collision with root package name */
    public InterfaceC0365a f7064H;

    /* renamed from: I  reason: collision with root package name */
    public long f7065I;

    public C0366b() {
        super(6);
        this.f7062E = new i2.g(1);
        this.F = new y();
    }

    @Override // e2.AbstractC0600d, e2.w0
    public final void c(int i7, Object obj) {
        if (i7 == 8) {
            this.f7064H = (InterfaceC0365a) obj;
        }
    }

    @Override // e2.AbstractC0600d
    public final String h() {
        return "CameraMotionRenderer";
    }

    @Override // e2.AbstractC0600d
    public final boolean j() {
        return i();
    }

    @Override // e2.AbstractC0600d
    public final boolean k() {
        return true;
    }

    @Override // e2.AbstractC0600d
    public final void l() {
        InterfaceC0365a interfaceC0365a = this.f7064H;
        if (interfaceC0365a != null) {
            interfaceC0365a.a();
        }
    }

    @Override // e2.AbstractC0600d
    public final void n(boolean z7, long j7) {
        this.f7065I = Long.MIN_VALUE;
        InterfaceC0365a interfaceC0365a = this.f7064H;
        if (interfaceC0365a != null) {
            interfaceC0365a.a();
        }
    }

    @Override // e2.AbstractC0600d
    public final void s(K[] kArr, long j7, long j8) {
        this.f7063G = j8;
    }

    @Override // e2.AbstractC0600d
    public final void u(long j7, long j8) {
        float[] fArr;
        while (!i() && this.f7065I < 100000 + j7) {
            i2.g gVar = this.f7062E;
            gVar.f();
            D d = this.f9933s;
            d.d();
            if (t(d, gVar, 0) == -4 && !gVar.d(4)) {
                this.f7065I = gVar.f11353v;
                if (this.f7064H != null && !gVar.d(Integer.MIN_VALUE)) {
                    gVar.j();
                    ByteBuffer byteBuffer = gVar.f11351t;
                    int i7 = H.f4603a;
                    if (byteBuffer.remaining() != 16) {
                        fArr = null;
                    } else {
                        byte[] array = byteBuffer.array();
                        int limit = byteBuffer.limit();
                        y yVar = this.F;
                        yVar.D(limit, array);
                        yVar.F(byteBuffer.arrayOffset() + 4);
                        float[] fArr2 = new float[3];
                        for (int i8 = 0; i8 < 3; i8++) {
                            fArr2[i8] = Float.intBitsToFloat(yVar.i());
                        }
                        fArr = fArr2;
                    }
                    if (fArr != null) {
                        this.f7064H.b(this.f7065I - this.f7063G, fArr);
                    }
                }
            } else {
                return;
            }
        }
    }

    @Override // e2.AbstractC0600d
    public final int y(K k5) {
        if ("application/x-camera-motion".equals(k5.f9655B)) {
            return AbstractC0515y1.b(4, 0, 0);
        }
        return AbstractC0515y1.b(0, 0, 0);
    }
}
