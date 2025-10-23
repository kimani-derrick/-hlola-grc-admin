package a4;

import com.google.crypto.tink.shaded.protobuf.AbstractC0523a;
import com.google.crypto.tink.shaded.protobuf.AbstractC0530h;
import com.google.crypto.tink.shaded.protobuf.C0536n;
import e4.C0632b;
import e4.C0634d;
import e4.C0636f;
import e4.O;
import e4.Q;
import e4.S;
import e4.T;
import e4.U;
import e4.V;
import e4.X;
import java.security.GeneralSecurityException;
/* renamed from: a4.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0211c extends Z3.e {

    /* renamed from: e  reason: collision with root package name */
    public static final Z3.m f5144e = new Z3.m(C0209a.class, new A4.a(29));
    public static final Z3.m f = new Z3.m(k.class, new C0214f(1));
    public final /* synthetic */ int d = 1;

    public C0211c() {
        super(Q.class, new T3.f(11, S3.j.class));
    }

    public static Z3.d l(int i7, int i8, O o7, int i9) {
        S E4 = T.E();
        U E6 = V.E();
        E6.i();
        V.z((V) E6.f9164r, o7);
        E6.i();
        V.A((V) E6.f9164r, i8);
        E4.i();
        T.z((T) E4.f9164r, (V) E6.c());
        E4.i();
        T.A((T) E4.f9164r, i7);
        return new Z3.d((T) E4.c(), i9);
    }

    public static void m(C0636f c0636f) {
        if (c0636f.B() >= 10) {
            if (c0636f.B() <= 16) {
                return;
            }
            throw new GeneralSecurityException("tag size too long");
        }
        throw new GeneralSecurityException("tag size too short");
    }

    public static void n(V v5) {
        if (v5.D() >= 10) {
            int ordinal = v5.C().ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal == 5) {
                                if (v5.D() > 28) {
                                    throw new GeneralSecurityException("tag size too big");
                                }
                                return;
                            }
                            throw new GeneralSecurityException("unknown hash type");
                        } else if (v5.D() > 64) {
                            throw new GeneralSecurityException("tag size too big");
                        } else {
                            return;
                        }
                    } else if (v5.D() > 32) {
                        throw new GeneralSecurityException("tag size too big");
                    } else {
                        return;
                    }
                } else if (v5.D() > 48) {
                    throw new GeneralSecurityException("tag size too big");
                } else {
                    return;
                }
            } else if (v5.D() <= 20) {
                return;
            } else {
                throw new GeneralSecurityException("tag size too big");
            }
        }
        throw new GeneralSecurityException("tag size too small");
    }

    @Override // Z3.e
    public int d() {
        switch (this.d) {
            case 1:
                return 2;
            default:
                return super.d();
        }
    }

    @Override // Z3.e
    public final String e() {
        switch (this.d) {
            case 0:
                return "type.googleapis.com/google.crypto.tink.AesCmacKey";
            default:
                return "type.googleapis.com/google.crypto.tink.HmacKey";
        }
    }

    @Override // Z3.e
    public final P1.c g() {
        switch (this.d) {
            case 0:
                return new P1.c(C0634d.class);
            default:
                return new T3.g(this);
        }
    }

    @Override // Z3.e
    public final X h() {
        switch (this.d) {
            case 0:
                return X.f10122s;
            default:
                return X.f10122s;
        }
    }

    @Override // Z3.e
    public final AbstractC0523a i(AbstractC0530h abstractC0530h) {
        switch (this.d) {
            case 0:
                return C0632b.G(abstractC0530h, C0536n.a());
            default:
                return Q.H(abstractC0530h, C0536n.a());
        }
    }

    @Override // Z3.e
    public final void k(AbstractC0523a abstractC0523a) {
        switch (this.d) {
            case 0:
                C0632b c0632b = (C0632b) abstractC0523a;
                f4.o.c(c0632b.E());
                if (c0632b.C().size() == 32) {
                    m(c0632b.D());
                    return;
                }
                throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
            default:
                Q q5 = (Q) abstractC0523a;
                f4.o.c(q5.F());
                if (q5.D().size() >= 16) {
                    n(q5.E());
                    return;
                }
                throw new GeneralSecurityException("key too short");
        }
    }

    public /* synthetic */ C0211c(Class cls, T3.f[] fVarArr) {
        super(cls, fVarArr);
    }
}
