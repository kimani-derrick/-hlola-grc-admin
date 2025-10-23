package M2;

import H2.U;
import O3.E;
import Z2.AbstractC0156a;
import Z2.H;
import Z2.r;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.fragment.app.D;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import e2.AbstractC0600d;
import e2.C0585B;
import e2.K;
import e2.SurfaceHolder$CallbackC0629y;
/* loaded from: classes.dex */
public final class m extends AbstractC0600d implements Handler.Callback {

    /* renamed from: E  reason: collision with root package name */
    public final Handler f2278E;
    public final SurfaceHolder$CallbackC0629y F;

    /* renamed from: G  reason: collision with root package name */
    public final k f2279G;

    /* renamed from: H  reason: collision with root package name */
    public final D f2280H;

    /* renamed from: I  reason: collision with root package name */
    public boolean f2281I;

    /* renamed from: J  reason: collision with root package name */
    public boolean f2282J;

    /* renamed from: K  reason: collision with root package name */
    public boolean f2283K;

    /* renamed from: L  reason: collision with root package name */
    public int f2284L;

    /* renamed from: M  reason: collision with root package name */
    public K f2285M;

    /* renamed from: N  reason: collision with root package name */
    public i f2286N;

    /* renamed from: O  reason: collision with root package name */
    public l f2287O;

    /* renamed from: P  reason: collision with root package name */
    public d f2288P;

    /* renamed from: Q  reason: collision with root package name */
    public d f2289Q;

    /* renamed from: R  reason: collision with root package name */
    public int f2290R;

    /* renamed from: S  reason: collision with root package name */
    public long f2291S;

    /* renamed from: T  reason: collision with root package name */
    public long f2292T;

    /* renamed from: U  reason: collision with root package name */
    public long f2293U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(SurfaceHolder$CallbackC0629y surfaceHolder$CallbackC0629y, Looper looper) {
        super(3);
        Handler handler;
        k kVar = k.f2276a;
        this.F = surfaceHolder$CallbackC0629y;
        if (looper == null) {
            handler = null;
        } else {
            int i7 = H.f4603a;
            handler = new Handler(looper, this);
        }
        this.f2278E = handler;
        this.f2279G = kVar;
        this.f2280H = new D(7, false);
        this.f2291S = -9223372036854775807L;
        this.f2292T = -9223372036854775807L;
        this.f2293U = -9223372036854775807L;
    }

    public final long A() {
        if (this.f2290R == -1) {
            return Long.MAX_VALUE;
        }
        this.f2288P.getClass();
        if (this.f2290R >= this.f2288P.u()) {
            return Long.MAX_VALUE;
        }
        return this.f2288P.k(this.f2290R);
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
        if (this.f2292T != -9223372036854775807L) {
            z8 = true;
        }
        AbstractC0156a.k(z8);
        return j7 - this.f2292T;
    }

    public final void C(c cVar) {
        E e3 = cVar.f2254q;
        SurfaceHolder$CallbackC0629y surfaceHolder$CallbackC0629y = this.F;
        surfaceHolder$CallbackC0629y.f10095q.f9421B.e(27, new U(13, e3));
        C0585B c0585b = surfaceHolder$CallbackC0629y.f10095q;
        c0585b.f9462r0 = cVar;
        c0585b.f9421B.e(27, new U(14, cVar));
    }

    public final void D() {
        this.f2287O = null;
        this.f2290R = -1;
        d dVar = this.f2288P;
        if (dVar != null) {
            dVar.f();
            this.f2288P = null;
        }
        d dVar2 = this.f2289Q;
        if (dVar2 != null) {
            dVar2.f();
            this.f2289Q = null;
        }
    }

    @Override // e2.AbstractC0600d
    public final String h() {
        return "TextRenderer";
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 0) {
            C((c) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    @Override // e2.AbstractC0600d
    public final boolean j() {
        return this.f2282J;
    }

    @Override // e2.AbstractC0600d
    public final boolean k() {
        return true;
    }

    @Override // e2.AbstractC0600d
    public final void l() {
        this.f2285M = null;
        this.f2291S = -9223372036854775807L;
        c cVar = new c(B(this.f2293U), O3.U.f2621u);
        Handler handler = this.f2278E;
        if (handler != null) {
            handler.obtainMessage(0, cVar).sendToTarget();
        } else {
            C(cVar);
        }
        this.f2292T = -9223372036854775807L;
        this.f2293U = -9223372036854775807L;
        D();
        i iVar = this.f2286N;
        iVar.getClass();
        iVar.a();
        this.f2286N = null;
        this.f2284L = 0;
    }

    @Override // e2.AbstractC0600d
    public final void n(boolean z7, long j7) {
        this.f2293U = j7;
        c cVar = new c(B(this.f2293U), O3.U.f2621u);
        Handler handler = this.f2278E;
        if (handler != null) {
            handler.obtainMessage(0, cVar).sendToTarget();
        } else {
            C(cVar);
        }
        this.f2281I = false;
        this.f2282J = false;
        this.f2291S = -9223372036854775807L;
        if (this.f2284L != 0) {
            D();
            i iVar = this.f2286N;
            iVar.getClass();
            iVar.a();
            this.f2286N = null;
            this.f2284L = 0;
            this.f2283K = true;
            K k5 = this.f2285M;
            k5.getClass();
            this.f2286N = this.f2279G.a(k5);
            return;
        }
        D();
        i iVar2 = this.f2286N;
        iVar2.getClass();
        iVar2.flush();
    }

    @Override // e2.AbstractC0600d
    public final void s(K[] kArr, long j7, long j8) {
        this.f2292T = j8;
        K k5 = kArr[0];
        this.f2285M = k5;
        if (this.f2286N != null) {
            this.f2284L = 1;
            return;
        }
        this.f2283K = true;
        k5.getClass();
        this.f2286N = this.f2279G.a(k5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x010b, code lost:
        if (r4 != false) goto L52;
     */
    @Override // e2.AbstractC0600d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u(long r20, long r22) {
        /*
            Method dump skipped, instructions count: 533
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M2.m.u(long, long):void");
    }

    @Override // e2.AbstractC0600d
    public final int y(K k5) {
        int i7;
        if (this.f2279G.b(k5)) {
            if (k5.W == 0) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            return AbstractC0515y1.b(i7, 0, 0);
        } else if (r.j(k5.f9655B)) {
            return AbstractC0515y1.b(1, 0, 0);
        } else {
            return AbstractC0515y1.b(0, 0, 0);
        }
    }
}
