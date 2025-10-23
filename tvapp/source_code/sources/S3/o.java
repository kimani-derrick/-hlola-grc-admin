package S3;

import e4.Z;
import e4.f0;
import e4.g0;
import e4.h0;
import e4.i0;
import e4.j0;
import e4.k0;
import e4.r0;
import java.nio.charset.Charset;
/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f3159a = 0;

    static {
        Charset.forName("UTF-8");
    }

    public static k0 a(g0 g0Var) {
        h0 C3 = k0.C();
        int E4 = g0Var.E();
        C3.i();
        k0.z((k0) C3.f9164r, E4);
        for (f0 f0Var : g0Var.D()) {
            i0 E6 = j0.E();
            String E7 = f0Var.D().E();
            E6.i();
            j0.z((j0) E6.f9164r, E7);
            Z G6 = f0Var.G();
            E6.i();
            j0.B((j0) E6.f9164r, G6);
            r0 F = f0Var.F();
            E6.i();
            j0.A((j0) E6.f9164r, F);
            int E8 = f0Var.E();
            E6.i();
            j0.C((j0) E6.f9164r, E8);
            C3.i();
            k0.A((k0) C3.f9164r, (j0) E6.c());
        }
        return (k0) C3.c();
    }
}
