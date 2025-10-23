package e4;

import com.google.crypto.tink.shaded.protobuf.AbstractC0530h;
import com.google.crypto.tink.shaded.protobuf.AbstractC0541t;
import com.google.crypto.tink.shaded.protobuf.AbstractC0543v;
import com.google.crypto.tink.shaded.protobuf.AbstractC0547z;
import com.google.crypto.tink.shaded.protobuf.C0529g;
import com.google.crypto.tink.shaded.protobuf.C0532j;
import com.google.crypto.tink.shaded.protobuf.C0536n;
import java.io.InputStream;
/* loaded from: classes.dex */
public final class N extends AbstractC0543v {
    private static final N DEFAULT_INSTANCE;
    public static final int ENCRYPTED_KEYSET_FIELD_NUMBER = 2;
    public static final int KEYSET_INFO_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.W PARSER;
    private AbstractC0530h encryptedKeyset_ = AbstractC0530h.f9118r;
    private k0 keysetInfo_;

    static {
        N n = new N();
        DEFAULT_INSTANCE = n;
        AbstractC0543v.w(N.class, n);
    }

    public static void A(N n, k0 k0Var) {
        n.getClass();
        n.keysetInfo_ = k0Var;
    }

    public static M C() {
        return (M) DEFAULT_INSTANCE.j();
    }

    public static N D(InputStream inputStream, C0536n c0536n) {
        B5.e c0532j;
        N n = DEFAULT_INSTANCE;
        if (inputStream == null) {
            byte[] bArr = AbstractC0547z.f9166b;
            c0532j = B5.e.l(bArr, 0, bArr.length, false);
        } else {
            c0532j = new C0532j(inputStream);
        }
        AbstractC0543v v5 = AbstractC0543v.v(n, c0532j, c0536n);
        AbstractC0543v.g(v5);
        return (N) v5;
    }

    public static void z(N n, C0529g c0529g) {
        n.getClass();
        n.encryptedKeyset_ = c0529g;
    }

    public final AbstractC0530h B() {
        return this.encryptedKeyset_;
    }

    /* JADX WARN: Type inference failed for: r4v14, types: [java.lang.Object, com.google.crypto.tink.shaded.protobuf.W] */
    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0543v
    public final Object k(int i7) {
        switch (s.h.b(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new com.google.crypto.tink.shaded.protobuf.a0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003\t", new Object[]{"encryptedKeyset_", "keysetInfo_"});
            case 3:
                return new N();
            case 4:
                return new AbstractC0541t(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                com.google.crypto.tink.shaded.protobuf.W w7 = PARSER;
                com.google.crypto.tink.shaded.protobuf.W w8 = w7;
                if (w7 == null) {
                    synchronized (N.class) {
                        try {
                            com.google.crypto.tink.shaded.protobuf.W w9 = PARSER;
                            com.google.crypto.tink.shaded.protobuf.W w10 = w9;
                            if (w9 == null) {
                                ?? obj = new Object();
                                PARSER = obj;
                                w10 = obj;
                            }
                        } finally {
                        }
                    }
                }
                return w8;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
