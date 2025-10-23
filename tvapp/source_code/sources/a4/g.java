package a4;

import Z3.w;
import e4.r0;
import g4.C0736a;
import java.security.GeneralSecurityException;
/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a  reason: collision with root package name */
    public static final Z3.l f5160a;

    /* renamed from: b  reason: collision with root package name */
    public static final Z3.k f5161b;

    /* renamed from: c  reason: collision with root package name */
    public static final Z3.c f5162c;
    public static final Z3.a d;

    static {
        C0736a b7 = w.b("type.googleapis.com/google.crypto.tink.AesCmacKey");
        f5160a = new Z3.l(C0213e.class);
        f5161b = new Z3.k(b7);
        f5162c = new Z3.c(C0209a.class);
        d = new Z3.a(b7, new C0214f(0));
    }

    public static C0212d a(r0 r0Var) {
        int ordinal = r0Var.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal == 4) {
                        return C0212d.d;
                    }
                    throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + r0Var.b());
                }
                return C0212d.f;
            }
            return C0212d.f5146e;
        }
        return C0212d.f5145c;
    }
}
