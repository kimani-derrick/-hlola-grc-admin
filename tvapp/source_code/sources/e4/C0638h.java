package e4;

import com.google.crypto.tink.shaded.protobuf.AbstractC0530h;
import com.google.crypto.tink.shaded.protobuf.AbstractC0541t;
import com.google.crypto.tink.shaded.protobuf.AbstractC0543v;
import com.google.crypto.tink.shaded.protobuf.C0536n;
/* renamed from: e4.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0638h extends AbstractC0543v {
    public static final int AES_CTR_KEY_FIELD_NUMBER = 2;
    private static final C0638h DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.W PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private C0642l aesCtrKey_;
    private Q hmacKey_;
    private int version_;

    /* JADX WARN: Type inference failed for: r0v0, types: [e4.h, com.google.crypto.tink.shaded.protobuf.v] */
    static {
        ?? abstractC0543v = new AbstractC0543v();
        DEFAULT_INSTANCE = abstractC0543v;
        AbstractC0543v.w(C0638h.class, abstractC0543v);
    }

    public static void A(C0638h c0638h, C0642l c0642l) {
        c0638h.getClass();
        c0642l.getClass();
        c0638h.aesCtrKey_ = c0642l;
    }

    public static void B(C0638h c0638h, Q q5) {
        c0638h.getClass();
        q5.getClass();
        c0638h.hmacKey_ = q5;
    }

    public static C0637g F() {
        return (C0637g) DEFAULT_INSTANCE.j();
    }

    public static C0638h G(AbstractC0530h abstractC0530h, C0536n c0536n) {
        return (C0638h) AbstractC0543v.u(DEFAULT_INSTANCE, abstractC0530h, c0536n);
    }

    public static void z(C0638h c0638h) {
        c0638h.version_ = 0;
    }

    public final C0642l C() {
        C0642l c0642l = this.aesCtrKey_;
        if (c0642l == null) {
            return C0642l.C();
        }
        return c0642l;
    }

    public final Q D() {
        Q q5 = this.hmacKey_;
        if (q5 == null) {
            return Q.C();
        }
        return q5;
    }

    public final int E() {
        return this.version_;
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
                return new com.google.crypto.tink.shaded.protobuf.a0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"version_", "aesCtrKey_", "hmacKey_"});
            case 3:
                return new AbstractC0543v();
            case 4:
                return new AbstractC0541t(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                com.google.crypto.tink.shaded.protobuf.W w7 = PARSER;
                com.google.crypto.tink.shaded.protobuf.W w8 = w7;
                if (w7 == null) {
                    synchronized (C0638h.class) {
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
