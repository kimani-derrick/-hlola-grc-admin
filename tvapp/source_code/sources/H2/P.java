package H2;

import java.io.IOException;
/* loaded from: classes.dex */
public final class P implements d0 {

    /* renamed from: q  reason: collision with root package name */
    public final int f938q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ S f939r;

    public P(S s6, int i7) {
        this.f939r = s6;
        this.f938q = i7;
    }

    @Override // H2.d0
    public final boolean g() {
        S s6 = this.f939r;
        if (!s6.D() && s6.f951I[this.f938q].u(s6.f968a0)) {
            return true;
        }
        return false;
    }

    @Override // H2.d0
    public final int k(androidx.fragment.app.D d, i2.g gVar, int i7) {
        S s6 = this.f939r;
        if (s6.D()) {
            return -3;
        }
        int i8 = this.f938q;
        s6.r(i8);
        int y3 = s6.f951I[i8].y(d, gVar, i7, s6.f968a0);
        if (y3 == -3) {
            s6.s(i8);
        }
        return y3;
    }

    @Override // H2.d0
    public final void w() {
        S s6 = this.f939r;
        c0 c0Var = s6.f951I[this.f938q];
        j2.k kVar = c0Var.f1031h;
        if (kVar != null && kVar.getState() == 1) {
            j2.j f = c0Var.f1031h.f();
            f.getClass();
            throw f;
        }
        int K6 = s6.f973t.K(s6.f960R);
        Y2.N n = s6.f944A;
        IOException iOException = n.f4343c;
        if (iOException == null) {
            Y2.J j7 = n.f4342b;
            if (j7 != null) {
                if (K6 == Integer.MIN_VALUE) {
                    K6 = j7.f4331q;
                }
                IOException iOException2 = j7.f4334t;
                if (iOException2 != null && j7.f4335u > K6) {
                    throw iOException2;
                }
                return;
            }
            return;
        }
        throw iOException;
    }

    @Override // H2.d0
    public final int x(long j7) {
        S s6 = this.f939r;
        if (s6.D()) {
            return 0;
        }
        int i7 = this.f938q;
        s6.r(i7);
        c0 c0Var = s6.f951I[i7];
        int r3 = c0Var.r(s6.f968a0, j7);
        c0Var.D(r3);
        if (r3 == 0) {
            s6.s(i7);
            return r3;
        }
        return r3;
    }
}
