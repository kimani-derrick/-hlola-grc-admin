package a4;

import Z3.w;
import e4.O;
import e4.r0;
import g4.C0736a;
import java.security.GeneralSecurityException;
/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a  reason: collision with root package name */
    public static final Z3.l f5169a;

    /* renamed from: b  reason: collision with root package name */
    public static final Z3.k f5170b;

    /* renamed from: c  reason: collision with root package name */
    public static final Z3.c f5171c;
    public static final Z3.a d;

    static {
        C0736a b7 = w.b("type.googleapis.com/google.crypto.tink.HmacKey");
        f5169a = new Z3.l(l.class);
        f5170b = new Z3.k(b7);
        f5171c = new Z3.c(k.class);
        d = new Z3.a(b7, new C0214f(2));
    }

    public static C0212d a(O o7) {
        int ordinal = o7.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        if (ordinal == 5) {
                            return C0212d.f5148h;
                        }
                        throw new GeneralSecurityException("Unable to parse HashType: " + o7.b());
                    }
                    return C0212d.f5151k;
                }
                return C0212d.f5149i;
            }
            return C0212d.f5150j;
        }
        return C0212d.f5147g;
    }

    public static C0212d b(r0 r0Var) {
        int ordinal = r0Var.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal == 4) {
                        return C0212d.f5153m;
                    }
                    throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + r0Var.b());
                }
                return C0212d.f5154o;
            }
            return C0212d.n;
        }
        return C0212d.f5152l;
    }
}
