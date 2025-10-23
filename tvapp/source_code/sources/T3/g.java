package T3;

import a4.C0211c;
import com.google.crypto.tink.shaded.protobuf.AbstractC0523a;
import com.google.crypto.tink.shaded.protobuf.AbstractC0530h;
import com.google.crypto.tink.shaded.protobuf.C0529g;
import com.google.crypto.tink.shaded.protobuf.C0536n;
import e4.A;
import e4.B;
import e4.C0637g;
import e4.C0638h;
import e4.C0640j;
import e4.C0641k;
import e4.C0642l;
import e4.C0644n;
import e4.C0646p;
import e4.C0647q;
import e4.C0649t;
import e4.C0651v;
import e4.C0652w;
import e4.C0653x;
import e4.C0655z;
import e4.D;
import e4.E;
import e4.F;
import e4.G;
import e4.H;
import e4.I;
import e4.J;
import e4.L;
import e4.O;
import e4.P;
import e4.Q;
import e4.T;
import e4.V;
import e4.l0;
import e4.m0;
import e4.n0;
import e4.o0;
import e4.p0;
import e4.q0;
import e4.t0;
import e4.u0;
import e4.v0;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class g extends P1.c {

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ int f3334r = 0;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ Z3.e f3335s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar) {
        super(C0640j.class);
        this.f3335s = hVar;
    }

    @Override // P1.c
    public final void A(AbstractC0523a abstractC0523a) {
        H h7;
        switch (this.f3334r) {
            case 0:
                C0640j c0640j = (C0640j) abstractC0523a;
                f[] fVarArr = {new f(1, f4.k.class)};
                HashMap hashMap = new HashMap();
                for (f fVar : fVarArr) {
                    boolean containsKey = hashMap.containsKey(fVar.f3332a);
                    Class cls = fVar.f3332a;
                    if (!containsKey) {
                        hashMap.put(cls, fVar);
                    } else {
                        throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + cls.getCanonicalName());
                    }
                }
                if (fVarArr.length > 0) {
                    Class cls2 = fVarArr[0].f3332a;
                }
                Collections.unmodifiableMap(hashMap);
                C0644n B6 = c0640j.B();
                f4.o.a(B6.C());
                C0646p D6 = B6.D();
                if (D6.B() >= 12 && D6.B() <= 16) {
                    f[] fVarArr2 = {new f(11, S3.j.class)};
                    HashMap hashMap2 = new HashMap();
                    for (f fVar2 : fVarArr2) {
                        boolean containsKey2 = hashMap2.containsKey(fVar2.f3332a);
                        Class cls3 = fVar2.f3332a;
                        if (!containsKey2) {
                            hashMap2.put(cls3, fVar2);
                        } else {
                            throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + cls3.getCanonicalName());
                        }
                    }
                    if (fVarArr2.length > 0) {
                        Class cls4 = fVarArr2[0].f3332a;
                    }
                    Collections.unmodifiableMap(hashMap2);
                    T C3 = c0640j.C();
                    if (C3.C() >= 16) {
                        C0211c.n(C3.D());
                        f4.o.a(c0640j.B().C());
                        return;
                    }
                    throw new GeneralSecurityException("key too short");
                }
                throw new GeneralSecurityException("invalid IV size");
            case 1:
                C0644n c0644n = (C0644n) abstractC0523a;
                f4.o.a(c0644n.C());
                C0646p D7 = c0644n.D();
                ((h) this.f3335s).getClass();
                if (D7.B() >= 12 && D7.B() <= 16) {
                    return;
                }
                throw new GeneralSecurityException("invalid IV size");
            case 2:
                C0649t c0649t = (C0649t) abstractC0523a;
                f4.o.a(c0649t.B());
                if (c0649t.C().B() != 12 && c0649t.C().B() != 16) {
                    throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
                }
                return;
            case 3:
                f4.o.a(((C0655z) abstractC0523a).A());
                return;
            case 4:
                f4.o.a(((D) abstractC0523a).A());
                return;
            case 5:
                L l7 = (L) abstractC0523a;
                return;
            case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                n0 n0Var = (n0) abstractC0523a;
                return;
            case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                q0 q0Var = (q0) abstractC0523a;
                if (!q0Var.B().isEmpty() && q0Var.C()) {
                    return;
                }
                throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
            case 8:
                v0 v0Var = (v0) abstractC0523a;
                return;
            case 9:
                if (((H) abstractC0523a).A() == 64) {
                    return;
                }
                throw new InvalidAlgorithmParameterException("invalid key size: " + h7.A() + ". Valid keys must have 64 bytes.");
            default:
                T t5 = (T) abstractC0523a;
                if (t5.C() >= 16) {
                    C0211c.n(t5.D());
                    return;
                }
                throw new GeneralSecurityException("key too short");
        }
    }

    @Override // P1.c
    public final AbstractC0523a j(AbstractC0523a abstractC0523a) {
        Z3.e eVar = this.f3335s;
        switch (this.f3334r) {
            case 0:
                C0640j c0640j = (C0640j) abstractC0523a;
                f[] fVarArr = {new f(1, f4.k.class)};
                HashMap hashMap = new HashMap();
                for (f fVar : fVarArr) {
                    boolean containsKey = hashMap.containsKey(fVar.f3332a);
                    Class cls = fVar.f3332a;
                    if (!containsKey) {
                        hashMap.put(cls, fVar);
                    } else {
                        throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + cls.getCanonicalName());
                    }
                }
                if (fVarArr.length > 0) {
                    Class cls2 = fVarArr[0].f3332a;
                }
                Collections.unmodifiableMap(hashMap);
                C0644n B6 = c0640j.B();
                C0641k G6 = C0642l.G();
                C0646p D6 = B6.D();
                G6.i();
                C0642l.A((C0642l) G6.f9164r, D6);
                byte[] a7 = f4.n.a(B6.C());
                C0529g f = AbstractC0530h.f(a7, 0, a7.length);
                G6.i();
                C0642l.B((C0642l) G6.f9164r, f);
                G6.i();
                C0642l.z((C0642l) G6.f9164r);
                C0642l c0642l = (C0642l) G6.c();
                f[] fVarArr2 = {new f(11, S3.j.class)};
                HashMap hashMap2 = new HashMap();
                for (f fVar2 : fVarArr2) {
                    boolean containsKey2 = hashMap2.containsKey(fVar2.f3332a);
                    Class cls3 = fVar2.f3332a;
                    if (!containsKey2) {
                        hashMap2.put(cls3, fVar2);
                    } else {
                        throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + cls3.getCanonicalName());
                    }
                }
                if (fVarArr2.length > 0) {
                    Class cls4 = fVarArr2[0].f3332a;
                }
                Collections.unmodifiableMap(hashMap2);
                T C3 = c0640j.C();
                P G7 = Q.G();
                G7.i();
                Q.z((Q) G7.f9164r);
                V D7 = C3.D();
                G7.i();
                Q.A((Q) G7.f9164r, D7);
                byte[] a8 = f4.n.a(C3.C());
                C0529g f7 = AbstractC0530h.f(a8, 0, a8.length);
                G7.i();
                Q.B((Q) G7.f9164r, f7);
                C0637g F = C0638h.F();
                F.i();
                C0638h.A((C0638h) F.f9164r, c0642l);
                F.i();
                C0638h.B((C0638h) F.f9164r, (Q) G7.c());
                ((h) eVar).getClass();
                F.i();
                C0638h.z((C0638h) F.f9164r);
                return (C0638h) F.c();
            case 1:
                C0644n c0644n = (C0644n) abstractC0523a;
                C0641k G8 = C0642l.G();
                C0646p D8 = c0644n.D();
                G8.i();
                C0642l.A((C0642l) G8.f9164r, D8);
                byte[] a9 = f4.n.a(c0644n.C());
                C0529g f8 = AbstractC0530h.f(a9, 0, a9.length);
                G8.i();
                C0642l.B((C0642l) G8.f9164r, f8);
                ((h) eVar).getClass();
                G8.i();
                C0642l.z((C0642l) G8.f9164r);
                return (C0642l) G8.c();
            case 2:
                C0649t c0649t = (C0649t) abstractC0523a;
                C0647q F4 = e4.r.F();
                byte[] a10 = f4.n.a(c0649t.B());
                C0529g f9 = AbstractC0530h.f(a10, 0, a10.length);
                F4.i();
                e4.r.B((e4.r) F4.f9164r, f9);
                C0651v C6 = c0649t.C();
                F4.i();
                e4.r.A((e4.r) F4.f9164r, C6);
                ((h) eVar).getClass();
                F4.i();
                e4.r.z((e4.r) F4.f9164r);
                return (e4.r) F4.c();
            case 3:
                C0652w D9 = C0653x.D();
                byte[] a11 = f4.n.a(((C0655z) abstractC0523a).A());
                C0529g f10 = AbstractC0530h.f(a11, 0, a11.length);
                D9.i();
                C0653x.A((C0653x) D9.f9164r, f10);
                ((h) eVar).getClass();
                D9.i();
                C0653x.z((C0653x) D9.f9164r);
                return (C0653x) D9.c();
            case 4:
                A D10 = B.D();
                byte[] a12 = f4.n.a(((D) abstractC0523a).A());
                C0529g f11 = AbstractC0530h.f(a12, 0, a12.length);
                D10.i();
                B.A((B) D10.f9164r, f11);
                ((h) eVar).getClass();
                D10.i();
                B.z((B) D10.f9164r);
                return (B) D10.c();
            case 5:
                L l7 = (L) abstractC0523a;
                I D11 = J.D();
                ((h) eVar).getClass();
                D11.i();
                J.z((J) D11.f9164r);
                byte[] a13 = f4.n.a(32);
                C0529g f12 = AbstractC0530h.f(a13, 0, a13.length);
                D11.i();
                J.A((J) D11.f9164r, f12);
                return (J) D11.c();
            case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                l0 D12 = m0.D();
                D12.i();
                m0.A((m0) D12.f9164r, (n0) abstractC0523a);
                ((h) eVar).getClass();
                D12.i();
                m0.z((m0) D12.f9164r);
                return (m0) D12.c();
            case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                o0 D13 = p0.D();
                D13.i();
                p0.A((p0) D13.f9164r, (q0) abstractC0523a);
                ((h) eVar).getClass();
                D13.i();
                p0.z((p0) D13.f9164r);
                return (p0) D13.c();
            case 8:
                v0 v0Var = (v0) abstractC0523a;
                t0 D14 = u0.D();
                ((h) eVar).getClass();
                D14.i();
                u0.z((u0) D14.f9164r);
                byte[] a14 = f4.n.a(32);
                C0529g f13 = AbstractC0530h.f(a14, 0, a14.length);
                D14.i();
                u0.A((u0) D14.f9164r, f13);
                return (u0) D14.c();
            case 9:
                E D15 = F.D();
                byte[] a15 = f4.n.a(((H) abstractC0523a).A());
                C0529g f14 = AbstractC0530h.f(a15, 0, a15.length);
                D15.i();
                F.A((F) D15.f9164r, f14);
                ((h) eVar).getClass();
                D15.i();
                F.z((F) D15.f9164r);
                return (F) D15.c();
            default:
                T t5 = (T) abstractC0523a;
                P G9 = Q.G();
                ((C0211c) eVar).getClass();
                G9.i();
                Q.z((Q) G9.f9164r);
                V D16 = t5.D();
                G9.i();
                Q.A((Q) G9.f9164r, D16);
                byte[] a16 = f4.n.a(t5.C());
                C0529g f15 = AbstractC0530h.f(a16, 0, a16.length);
                G9.i();
                Q.B((Q) G9.f9164r, f15);
                return (Q) G9.c();
        }
    }

    @Override // P1.c
    public Map t() {
        switch (this.f3334r) {
            case 0:
                HashMap hashMap = new HashMap();
                hashMap.put("AES128_CTR_HMAC_SHA256", h.m(16, 16, 1));
                hashMap.put("AES128_CTR_HMAC_SHA256_RAW", h.m(16, 16, 3));
                hashMap.put("AES256_CTR_HMAC_SHA256", h.m(32, 32, 1));
                hashMap.put("AES256_CTR_HMAC_SHA256_RAW", h.m(32, 32, 3));
                return Collections.unmodifiableMap(hashMap);
            case 1:
            case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
            case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
            default:
                return super.t();
            case 2:
                HashMap hashMap2 = new HashMap();
                hashMap2.put("AES128_EAX", h.l(16, 1));
                hashMap2.put("AES128_EAX_RAW", h.l(16, 3));
                hashMap2.put("AES256_EAX", h.l(32, 1));
                hashMap2.put("AES256_EAX_RAW", h.l(32, 3));
                return Collections.unmodifiableMap(hashMap2);
            case 3:
                HashMap hashMap3 = new HashMap();
                hashMap3.put("AES128_GCM", h.n(16, 1));
                hashMap3.put("AES128_GCM_RAW", h.n(16, 3));
                hashMap3.put("AES256_GCM", h.n(32, 1));
                hashMap3.put("AES256_GCM_RAW", h.n(32, 3));
                return Collections.unmodifiableMap(hashMap3);
            case 4:
                HashMap hashMap4 = new HashMap();
                hashMap4.put("AES128_GCM_SIV", h.o(16, 1));
                hashMap4.put("AES128_GCM_SIV_RAW", h.o(16, 3));
                hashMap4.put("AES256_GCM_SIV", h.o(32, 1));
                hashMap4.put("AES256_GCM_SIV_RAW", h.o(32, 3));
                return Collections.unmodifiableMap(hashMap4);
            case 5:
                HashMap hashMap5 = new HashMap();
                hashMap5.put("CHACHA20_POLY1305", new Z3.d(L.z(), 1));
                hashMap5.put("CHACHA20_POLY1305_RAW", new Z3.d(L.z(), 3));
                return Collections.unmodifiableMap(hashMap5);
            case 8:
                HashMap hashMap6 = new HashMap();
                hashMap6.put("XCHACHA20_POLY1305", new Z3.d(v0.z(), 1));
                hashMap6.put("XCHACHA20_POLY1305_RAW", new Z3.d(v0.z(), 3));
                return Collections.unmodifiableMap(hashMap6);
            case 9:
                HashMap hashMap7 = new HashMap();
                G B6 = H.B();
                B6.i();
                H.z((H) B6.f9164r);
                hashMap7.put("AES256_SIV", new Z3.d((H) B6.c(), 1));
                G B7 = H.B();
                B7.i();
                H.z((H) B7.f9164r);
                hashMap7.put("AES256_SIV_RAW", new Z3.d((H) B7.c(), 3));
                return Collections.unmodifiableMap(hashMap7);
            case 10:
                HashMap hashMap8 = new HashMap();
                O o7 = O.f10115u;
                hashMap8.put("HMAC_SHA256_128BITTAG", C0211c.l(32, 16, o7, 1));
                hashMap8.put("HMAC_SHA256_128BITTAG_RAW", C0211c.l(32, 16, o7, 3));
                hashMap8.put("HMAC_SHA256_256BITTAG", C0211c.l(32, 32, o7, 1));
                hashMap8.put("HMAC_SHA256_256BITTAG_RAW", C0211c.l(32, 32, o7, 3));
                O o8 = O.f10116v;
                hashMap8.put("HMAC_SHA512_128BITTAG", C0211c.l(64, 16, o8, 1));
                hashMap8.put("HMAC_SHA512_128BITTAG_RAW", C0211c.l(64, 16, o8, 3));
                hashMap8.put("HMAC_SHA512_256BITTAG", C0211c.l(64, 32, o8, 1));
                hashMap8.put("HMAC_SHA512_256BITTAG_RAW", C0211c.l(64, 32, o8, 3));
                hashMap8.put("HMAC_SHA512_512BITTAG", C0211c.l(64, 64, o8, 1));
                hashMap8.put("HMAC_SHA512_512BITTAG_RAW", C0211c.l(64, 64, o8, 3));
                return Collections.unmodifiableMap(hashMap8);
        }
    }

    @Override // P1.c
    public final AbstractC0523a u(AbstractC0530h abstractC0530h) {
        switch (this.f3334r) {
            case 0:
                return C0640j.E(abstractC0530h, C0536n.a());
            case 1:
                return C0644n.F(abstractC0530h, C0536n.a());
            case 2:
                return C0649t.E(abstractC0530h, C0536n.a());
            case 3:
                return C0655z.C(abstractC0530h, C0536n.a());
            case 4:
                return D.C(abstractC0530h, C0536n.a());
            case 5:
                return L.A(abstractC0530h, C0536n.a());
            case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                return n0.B(abstractC0530h, C0536n.a());
            case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                return q0.D(abstractC0530h, C0536n.a());
            case 8:
                return v0.A(abstractC0530h, C0536n.a());
            case 9:
                return H.C(abstractC0530h, C0536n.a());
            default:
                return T.F(abstractC0530h, C0536n.a());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, byte b7) {
        super(C0644n.class);
        this.f3335s = hVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, byte b7, byte b8) {
        super(n0.class);
        this.f3335s = hVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, byte b7, char c5) {
        super(q0.class);
        this.f3335s = hVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, byte b7, int i7) {
        super(v0.class);
        this.f3335s = hVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, byte b7, short s6) {
        super(H.class);
        this.f3335s = hVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, byte b7, boolean z7) {
        super(L.class);
        this.f3335s = hVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, char c5) {
        super(C0649t.class);
        this.f3335s = hVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, int i7) {
        super(C0655z.class);
        this.f3335s = hVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, short s6) {
        super(D.class);
        this.f3335s = hVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(C0211c c0211c) {
        super(T.class);
        this.f3335s = c0211c;
    }
}
