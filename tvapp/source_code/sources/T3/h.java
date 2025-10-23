package T3;

import a4.C0211c;
import com.google.crypto.tink.shaded.protobuf.AbstractC0523a;
import com.google.crypto.tink.shaded.protobuf.AbstractC0530h;
import com.google.crypto.tink.shaded.protobuf.C0536n;
import e4.B;
import e4.C;
import e4.C0638h;
import e4.C0639i;
import e4.C0640j;
import e4.C0642l;
import e4.C0643m;
import e4.C0644n;
import e4.C0645o;
import e4.C0646p;
import e4.C0648s;
import e4.C0649t;
import e4.C0650u;
import e4.C0651v;
import e4.C0653x;
import e4.C0654y;
import e4.C0655z;
import e4.D;
import e4.F;
import e4.J;
import e4.O;
import e4.Q;
import e4.S;
import e4.T;
import e4.U;
import e4.V;
import e4.X;
import e4.m0;
import e4.p0;
import e4.u0;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Collections;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class h extends Z3.e {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(int i7) {
        super(C0638h.class, new f(0, S3.a.class));
        this.d = i7;
        switch (i7) {
            case 1:
                super(C0642l.class, new f(1, f4.k.class));
                return;
            case 2:
                super(e4.r.class, new f(2, S3.a.class));
                return;
            case 3:
                super(C0653x.class, new f(3, S3.a.class));
                return;
            case 4:
                super(B.class, new f(4, S3.a.class));
                return;
            case 5:
                super(J.class, new f(5, S3.a.class));
                return;
            case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                super(m0.class, new f(6, S3.a.class));
                return;
            case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                super(p0.class, new f(7, S3.a.class));
                return;
            case 8:
                super(u0.class, new f(8, S3.a.class));
                return;
            case 9:
                super(F.class, new f(9, S3.c.class));
                return;
            default:
                return;
        }
    }

    public static Z3.d l(int i7, int i8) {
        C0648s D6 = C0649t.D();
        D6.i();
        C0649t.A((C0649t) D6.f9164r, i7);
        C0650u C3 = C0651v.C();
        C3.i();
        C0651v.z((C0651v) C3.f9164r);
        D6.i();
        C0649t.z((C0649t) D6.f9164r, (C0651v) C3.c());
        return new Z3.d((C0649t) D6.c(), i8);
    }

    public static Z3.d m(int i7, int i8, int i9) {
        O o7 = O.f10115u;
        C0643m E4 = C0644n.E();
        C0645o C3 = C0646p.C();
        C3.i();
        C0646p.z((C0646p) C3.f9164r);
        E4.i();
        C0644n.z((C0644n) E4.f9164r, (C0646p) C3.c());
        E4.i();
        C0644n.A((C0644n) E4.f9164r, i7);
        S E6 = T.E();
        U E7 = V.E();
        E7.i();
        V.z((V) E7.f9164r, o7);
        E7.i();
        V.A((V) E7.f9164r, i8);
        E6.i();
        T.z((T) E6.f9164r, (V) E7.c());
        E6.i();
        T.A((T) E6.f9164r, 32);
        C0639i D6 = C0640j.D();
        D6.i();
        C0640j.z((C0640j) D6.f9164r, (C0644n) E4.c());
        D6.i();
        C0640j.A((C0640j) D6.f9164r, (T) E6.c());
        return new Z3.d((C0640j) D6.c(), i9);
    }

    public static Z3.d n(int i7, int i8) {
        C0654y B6 = C0655z.B();
        B6.i();
        C0655z.z((C0655z) B6.f9164r, i7);
        return new Z3.d((C0655z) B6.c(), i8);
    }

    public static Z3.d o(int i7, int i8) {
        C B6 = D.B();
        B6.i();
        D.z((D) B6.f9164r, i7);
        return new Z3.d((D) B6.c(), i8);
    }

    @Override // Z3.e
    public int d() {
        switch (this.d) {
            case 0:
                return 2;
            case 3:
                return 2;
            default:
                return super.d();
        }
    }

    @Override // Z3.e
    public final String e() {
        switch (this.d) {
            case 0:
                return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
            case 1:
                return "type.googleapis.com/google.crypto.tink.AesCtrKey";
            case 2:
                return "type.googleapis.com/google.crypto.tink.AesEaxKey";
            case 3:
                return "type.googleapis.com/google.crypto.tink.AesGcmKey";
            case 4:
                return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
            case 5:
                return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
            case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
            case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
            case 8:
                return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
            default:
                return "type.googleapis.com/google.crypto.tink.AesSivKey";
        }
    }

    @Override // Z3.e
    public final P1.c g() {
        switch (this.d) {
            case 0:
                return new g(this);
            case 1:
                return new g(this, (byte) 0);
            case 2:
                return new g(this, (char) 0);
            case 3:
                return new g(this, 0);
            case 4:
                return new g(this, (short) 0);
            case 5:
                return new g(this, (byte) 0, false);
            case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                return new g(this, (byte) 0, (byte) 0);
            case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                return new g(this, (byte) 0, (char) 0);
            case 8:
                return new g(this, (byte) 0, 0);
            default:
                return new g(this, (byte) 0, (short) 0);
        }
    }

    @Override // Z3.e
    public final X h() {
        switch (this.d) {
            case 0:
                return X.f10122s;
            case 1:
                return X.f10122s;
            case 2:
                return X.f10122s;
            case 3:
                return X.f10122s;
            case 4:
                return X.f10122s;
            case 5:
                return X.f10122s;
            case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                return X.f10125v;
            case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                return X.f10125v;
            case 8:
                return X.f10122s;
            default:
                return X.f10122s;
        }
    }

    @Override // Z3.e
    public final AbstractC0523a i(AbstractC0530h abstractC0530h) {
        switch (this.d) {
            case 0:
                return C0638h.G(abstractC0530h, C0536n.a());
            case 1:
                return C0642l.H(abstractC0530h, C0536n.a());
            case 2:
                return e4.r.G(abstractC0530h, C0536n.a());
            case 3:
                return C0653x.E(abstractC0530h, C0536n.a());
            case 4:
                return B.E(abstractC0530h, C0536n.a());
            case 5:
                return J.E(abstractC0530h, C0536n.a());
            case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                return m0.E(abstractC0530h, C0536n.a());
            case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                return p0.E(abstractC0530h, C0536n.a());
            case 8:
                return u0.E(abstractC0530h, C0536n.a());
            default:
                return F.E(abstractC0530h, C0536n.a());
        }
    }

    @Override // Z3.e
    public final void k(AbstractC0523a abstractC0523a) {
        switch (this.d) {
            case 0:
                C0638h c0638h = (C0638h) abstractC0523a;
                f4.o.c(c0638h.E());
                f[] fVarArr = {new f(1, f4.k.class)};
                HashMap hashMap = new HashMap();
                for (int i7 = 0; i7 < 1; i7++) {
                    f fVar = fVarArr[i7];
                    boolean containsKey = hashMap.containsKey(fVar.f3332a);
                    Class cls = fVar.f3332a;
                    if (!containsKey) {
                        hashMap.put(cls, fVar);
                    } else {
                        throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + cls.getCanonicalName());
                    }
                }
                Class cls2 = fVarArr[0].f3332a;
                Collections.unmodifiableMap(hashMap);
                C0642l C3 = c0638h.C();
                f4.o.c(C3.F());
                f4.o.a(C3.D().size());
                C0646p E4 = C3.E();
                if (E4.B() >= 12 && E4.B() <= 16) {
                    f[] fVarArr2 = {new f(11, S3.j.class)};
                    HashMap hashMap2 = new HashMap();
                    f fVar2 = fVarArr2[0];
                    boolean containsKey2 = hashMap2.containsKey(fVar2.f3332a);
                    Class cls3 = fVar2.f3332a;
                    if (!containsKey2) {
                        hashMap2.put(cls3, fVar2);
                        Class cls4 = fVarArr2[0].f3332a;
                        Collections.unmodifiableMap(hashMap2);
                        Q D6 = c0638h.D();
                        f4.o.c(D6.F());
                        if (D6.D().size() >= 16) {
                            C0211c.n(D6.E());
                            return;
                        }
                        throw new GeneralSecurityException("key too short");
                    }
                    throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + cls3.getCanonicalName());
                }
                throw new GeneralSecurityException("invalid IV size");
            case 1:
                C0642l c0642l = (C0642l) abstractC0523a;
                f4.o.c(c0642l.F());
                f4.o.a(c0642l.D().size());
                C0646p E6 = c0642l.E();
                if (E6.B() >= 12 && E6.B() <= 16) {
                    return;
                }
                throw new GeneralSecurityException("invalid IV size");
            case 2:
                e4.r rVar = (e4.r) abstractC0523a;
                f4.o.c(rVar.E());
                f4.o.a(rVar.C().size());
                if (rVar.D().B() != 12 && rVar.D().B() != 16) {
                    throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
                }
                return;
            case 3:
                C0653x c0653x = (C0653x) abstractC0523a;
                f4.o.c(c0653x.C());
                f4.o.a(c0653x.B().size());
                return;
            case 4:
                B b7 = (B) abstractC0523a;
                f4.o.c(b7.C());
                f4.o.a(b7.B().size());
                return;
            case 5:
                J j7 = (J) abstractC0523a;
                f4.o.c(j7.C());
                if (j7.B().size() == 32) {
                    return;
                }
                throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
            case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                f4.o.c(((m0) abstractC0523a).C());
                return;
            case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                f4.o.c(((p0) abstractC0523a).C());
                return;
            case 8:
                u0 u0Var = (u0) abstractC0523a;
                f4.o.c(u0Var.C());
                if (u0Var.B().size() == 32) {
                    return;
                }
                throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
            default:
                F f = (F) abstractC0523a;
                f4.o.c(f.C());
                if (f.B().size() == 64) {
                    return;
                }
                throw new InvalidKeyException("invalid key size: " + f.B().size() + ". Valid keys must have 64 bytes.");
        }
    }
}
