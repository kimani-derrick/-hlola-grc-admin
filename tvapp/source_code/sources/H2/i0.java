package H2;

import java.io.IOException;
/* loaded from: classes.dex */
public final class i0 implements d0 {

    /* renamed from: q  reason: collision with root package name */
    public int f1091q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f1092r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ k0 f1093s;

    public i0(k0 k0Var) {
        this.f1093s = k0Var;
    }

    public final void a() {
        if (!this.f1092r) {
            k0 k0Var = this.f1093s;
            C.d dVar = k0Var.f1111u;
            int h7 = Z2.r.h(k0Var.f1116z.f9655B);
            dVar.getClass();
            dVar.f(new C0020v(1, h7, k0Var.f1116z, 0, null, Z2.H.S(0L), -9223372036854775807L));
            this.f1092r = true;
        }
    }

    @Override // H2.d0
    public final boolean g() {
        return this.f1093s.f1104B;
    }

    @Override // H2.d0
    public final int k(androidx.fragment.app.D d, i2.g gVar, int i7) {
        a();
        k0 k0Var = this.f1093s;
        boolean z7 = k0Var.f1104B;
        if (z7 && k0Var.f1105C == null) {
            this.f1091q = 2;
        }
        int i8 = this.f1091q;
        if (i8 == 2) {
            gVar.b(4);
            return -4;
        } else if ((i7 & 2) == 0 && i8 != 0) {
            if (!z7) {
                return -3;
            }
            k0Var.f1105C.getClass();
            gVar.b(1);
            gVar.f11353v = 0L;
            if ((i7 & 4) == 0) {
                gVar.i(k0Var.f1106D);
                gVar.f11351t.put(k0Var.f1105C, 0, k0Var.f1106D);
            }
            if ((i7 & 1) == 0) {
                this.f1091q = 2;
            }
            return -4;
        } else {
            d.f5884s = k0Var.f1116z;
            this.f1091q = 1;
            return -5;
        }
    }

    @Override // H2.d0
    public final void w() {
        IOException iOException;
        k0 k0Var = this.f1093s;
        if (!k0Var.f1103A) {
            Y2.N n = k0Var.f1115y;
            IOException iOException2 = n.f4343c;
            if (iOException2 == null) {
                Y2.J j7 = n.f4342b;
                if (j7 != null && (iOException = j7.f4334t) != null && j7.f4335u > j7.f4331q) {
                    throw iOException;
                }
                return;
            }
            throw iOException2;
        }
    }

    @Override // H2.d0
    public final int x(long j7) {
        a();
        if (j7 > 0 && this.f1091q != 2) {
            this.f1091q = 2;
            return 1;
        }
        return 0;
    }
}
