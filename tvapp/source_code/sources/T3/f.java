package T3;

import H2.C0002c;
import a4.C0211c;
import com.google.crypto.tink.shaded.protobuf.AbstractC0523a;
import e4.B;
import e4.C0632b;
import e4.C0638h;
import e4.C0642l;
import e4.C0653x;
import e4.F;
import e4.J;
import e4.O;
import e4.Q;
import e4.m0;
import e4.p0;
import e4.u0;
import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final Class f3332a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f3333b;

    public f(int i7, Class cls) {
        this.f3333b = i7;
        this.f3332a = cls;
    }

    public final Object a(AbstractC0523a abstractC0523a) {
        switch (this.f3333b) {
            case 0:
                C0638h c0638h = (C0638h) abstractC0523a;
                return new f4.g((f4.k) new h(1).f(c0638h.C(), f4.k.class), (S3.j) new C0211c().f(c0638h.D(), S3.j.class), c0638h.D().E().D());
            case 1:
                C0642l c0642l = (C0642l) abstractC0523a;
                return new f4.a(c0642l.E().B(), c0642l.D().l());
            case 2:
                e4.r rVar = (e4.r) abstractC0523a;
                return new f4.b(rVar.D().B(), rVar.C().l());
            case 3:
                return new f4.c(0, ((C0653x) abstractC0523a).B().l());
            case 4:
                return new V3.a(((B) abstractC0523a).B().l());
            case 5:
                return new f4.c(1, ((J) abstractC0523a).B().l());
            case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                String A6 = ((m0) abstractC0523a).B().A();
                return S3.i.a(A6).c(A6);
            case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                p0 p0Var = (p0) abstractC0523a;
                String B6 = p0Var.B().B();
                return new v(p0Var.B().A(), S3.i.a(B6).c(B6));
            case 8:
                return new f4.c(2, ((u0) abstractC0523a).B().l());
            case 9:
                return new f4.d(((F) abstractC0523a).B().l());
            case 10:
                C0632b c0632b = (C0632b) abstractC0523a;
                return new f4.m(new C0002c(c0632b.C().l()), c0632b.D().B());
            default:
                Q q5 = (Q) abstractC0523a;
                O C3 = q5.E().C();
                SecretKeySpec secretKeySpec = new SecretKeySpec(q5.D().l(), "HMAC");
                int D6 = q5.E().D();
                int ordinal = C3.ordinal();
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            if (ordinal != 4) {
                                if (ordinal == 5) {
                                    return new f4.m(new Z2.x("HMACSHA224", secretKeySpec), D6);
                                }
                                throw new GeneralSecurityException("unknown hash");
                            }
                            return new f4.m(new Z2.x("HMACSHA512", secretKeySpec), D6);
                        }
                        return new f4.m(new Z2.x("HMACSHA256", secretKeySpec), D6);
                    }
                    return new f4.m(new Z2.x("HMACSHA384", secretKeySpec), D6);
                }
                return new f4.m(new Z2.x("HMACSHA1", secretKeySpec), D6);
        }
    }
}
