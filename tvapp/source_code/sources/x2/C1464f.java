package x2;

import H2.U;
import Z2.AbstractC0156a;
import Z2.H;
import Z2.p;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.fragment.app.D;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import e2.AbstractC0600d;
import e2.C0585B;
import e2.C0595a0;
import e2.C0597b0;
import e2.K;
import e2.SurfaceHolder$CallbackC0629y;
import i2.g;
import java.util.ArrayList;
/* renamed from: x2.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1464f extends AbstractC0600d implements Handler.Callback {

    /* renamed from: E  reason: collision with root package name */
    public final C1462d f16210E;
    public final SurfaceHolder$CallbackC0629y F;

    /* renamed from: G  reason: collision with root package name */
    public final Handler f16211G;

    /* renamed from: H  reason: collision with root package name */
    public final C1463e f16212H;

    /* renamed from: I  reason: collision with root package name */
    public h4.b f16213I;

    /* renamed from: J  reason: collision with root package name */
    public boolean f16214J;

    /* renamed from: K  reason: collision with root package name */
    public boolean f16215K;

    /* renamed from: L  reason: collision with root package name */
    public long f16216L;

    /* renamed from: M  reason: collision with root package name */
    public C1461c f16217M;

    /* renamed from: N  reason: collision with root package name */
    public long f16218N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v4, types: [i2.g, x2.e] */
    public C1464f(SurfaceHolder$CallbackC0629y surfaceHolder$CallbackC0629y, Looper looper) {
        super(5);
        Handler handler;
        C1462d c1462d = C1462d.f16208a;
        this.F = surfaceHolder$CallbackC0629y;
        if (looper == null) {
            handler = null;
        } else {
            int i7 = H.f4603a;
            handler = new Handler(looper, this);
        }
        this.f16211G = handler;
        this.f16210E = c1462d;
        this.f16212H = new g(1);
        this.f16218N = -9223372036854775807L;
    }

    public final void A(C1461c c1461c, ArrayList arrayList) {
        int i7 = 0;
        while (true) {
            InterfaceC1460b[] interfaceC1460bArr = c1461c.f16206q;
            if (i7 < interfaceC1460bArr.length) {
                K f = interfaceC1460bArr[i7].f();
                if (f != null) {
                    C1462d c1462d = this.f16210E;
                    if (c1462d.b(f)) {
                        h4.b a7 = c1462d.a(f);
                        byte[] b7 = interfaceC1460bArr[i7].b();
                        b7.getClass();
                        C1463e c1463e = this.f16212H;
                        c1463e.f();
                        c1463e.i(b7.length);
                        c1463e.f11351t.put(b7);
                        c1463e.j();
                        C1461c p3 = a7.p(c1463e);
                        if (p3 != null) {
                            A(p3, arrayList);
                        }
                        i7++;
                    }
                }
                arrayList.add(interfaceC1460bArr[i7]);
                i7++;
            } else {
                return;
            }
        }
    }

    public final long B(long j7) {
        boolean z7;
        boolean z8 = false;
        if (j7 != -9223372036854775807L) {
            z7 = true;
        } else {
            z7 = false;
        }
        AbstractC0156a.k(z7);
        if (this.f16218N != -9223372036854775807L) {
            z8 = true;
        }
        AbstractC0156a.k(z8);
        return j7 - this.f16218N;
    }

    public final void C(C1461c c1461c) {
        SurfaceHolder$CallbackC0629y surfaceHolder$CallbackC0629y = this.F;
        C0585B c0585b = surfaceHolder$CallbackC0629y.f10095q;
        C0595a0 a7 = c0585b.f9470v0.a();
        int i7 = 0;
        while (true) {
            InterfaceC1460b[] interfaceC1460bArr = c1461c.f16206q;
            if (i7 >= interfaceC1460bArr.length) {
                break;
            }
            interfaceC1460bArr[i7].c(a7);
            i7++;
        }
        c0585b.f9470v0 = new C0597b0(a7);
        C0597b0 E4 = c0585b.E();
        boolean equals = E4.equals(c0585b.f9447d0);
        p pVar = c0585b.f9421B;
        if (!equals) {
            c0585b.f9447d0 = E4;
            pVar.c(14, new U(15, surfaceHolder$CallbackC0629y));
        }
        pVar.c(28, new U(16, c1461c));
        pVar.b();
    }

    @Override // e2.AbstractC0600d
    public final String h() {
        return "MetadataRenderer";
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 0) {
            C((C1461c) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    @Override // e2.AbstractC0600d
    public final boolean j() {
        return this.f16215K;
    }

    @Override // e2.AbstractC0600d
    public final boolean k() {
        return true;
    }

    @Override // e2.AbstractC0600d
    public final void l() {
        this.f16217M = null;
        this.f16213I = null;
        this.f16218N = -9223372036854775807L;
    }

    @Override // e2.AbstractC0600d
    public final void n(boolean z7, long j7) {
        this.f16217M = null;
        this.f16214J = false;
        this.f16215K = false;
    }

    @Override // e2.AbstractC0600d
    public final void s(K[] kArr, long j7, long j8) {
        this.f16213I = this.f16210E.a(kArr[0]);
        C1461c c1461c = this.f16217M;
        if (c1461c != null) {
            long j9 = this.f16218N;
            long j10 = c1461c.f16207r;
            long j11 = (j9 + j10) - j8;
            if (j10 != j11) {
                c1461c = new C1461c(j11, c1461c.f16206q);
            }
            this.f16217M = c1461c;
        }
        this.f16218N = j8;
    }

    @Override // e2.AbstractC0600d
    public final void u(long j7, long j8) {
        boolean z7;
        do {
            z7 = false;
            if (!this.f16214J && this.f16217M == null) {
                C1463e c1463e = this.f16212H;
                c1463e.f();
                D d = this.f9933s;
                d.d();
                int t5 = t(d, c1463e, 0);
                if (t5 == -4) {
                    if (c1463e.d(4)) {
                        this.f16214J = true;
                    } else {
                        c1463e.f16209z = this.f16216L;
                        c1463e.j();
                        h4.b bVar = this.f16213I;
                        int i7 = H.f4603a;
                        C1461c p3 = bVar.p(c1463e);
                        if (p3 != null) {
                            ArrayList arrayList = new ArrayList(p3.f16206q.length);
                            A(p3, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.f16217M = new C1461c(B(c1463e.f11353v), (InterfaceC1460b[]) arrayList.toArray(new InterfaceC1460b[0]));
                            }
                        }
                    }
                } else if (t5 == -5) {
                    K k5 = (K) d.f5884s;
                    k5.getClass();
                    this.f16216L = k5.F;
                }
            }
            C1461c c1461c = this.f16217M;
            if (c1461c != null && c1461c.f16207r <= B(j7)) {
                C1461c c1461c2 = this.f16217M;
                Handler handler = this.f16211G;
                if (handler != null) {
                    handler.obtainMessage(0, c1461c2).sendToTarget();
                } else {
                    C(c1461c2);
                }
                this.f16217M = null;
                z7 = true;
            }
            if (this.f16214J && this.f16217M == null) {
                this.f16215K = true;
                continue;
            }
        } while (z7);
    }

    @Override // e2.AbstractC0600d
    public final int y(K k5) {
        int i7;
        if (this.f16210E.b(k5)) {
            if (k5.W == 0) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            return AbstractC0515y1.b(i7, 0, 0);
        }
        return AbstractC0515y1.b(0, 0, 0);
    }
}
