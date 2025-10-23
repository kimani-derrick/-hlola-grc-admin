package e4;

import com.google.crypto.tink.shaded.protobuf.AbstractC0530h;
import com.google.crypto.tink.shaded.protobuf.AbstractC0541t;
import com.google.crypto.tink.shaded.protobuf.AbstractC0543v;
import com.google.crypto.tink.shaded.protobuf.C0536n;
/* renamed from: e4.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0640j extends AbstractC0543v {
    public static final int AES_CTR_KEY_FORMAT_FIELD_NUMBER = 1;
    private static final C0640j DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FORMAT_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.W PARSER;
    private C0644n aesCtrKeyFormat_;
    private T hmacKeyFormat_;

    /* JADX WARN: Type inference failed for: r0v0, types: [e4.j, com.google.crypto.tink.shaded.protobuf.v] */
    static {
        ?? abstractC0543v = new AbstractC0543v();
        DEFAULT_INSTANCE = abstractC0543v;
        AbstractC0543v.w(C0640j.class, abstractC0543v);
    }

    public static void A(C0640j c0640j, T t5) {
        c0640j.getClass();
        c0640j.hmacKeyFormat_ = t5;
    }

    public static C0639i D() {
        return (C0639i) DEFAULT_INSTANCE.j();
    }

    public static C0640j E(AbstractC0530h abstractC0530h, C0536n c0536n) {
        return (C0640j) AbstractC0543v.u(DEFAULT_INSTANCE, abstractC0530h, c0536n);
    }

    public static void z(C0640j c0640j, C0644n c0644n) {
        c0640j.getClass();
        c0640j.aesCtrKeyFormat_ = c0644n;
    }

    public final C0644n B() {
        C0644n c0644n = this.aesCtrKeyFormat_;
        if (c0644n == null) {
            return C0644n.B();
        }
        return c0644n;
    }

    public final T C() {
        T t5 = this.hmacKeyFormat_;
        if (t5 == null) {
            return T.B();
        }
        return t5;
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
                return new com.google.crypto.tink.shaded.protobuf.a0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"aesCtrKeyFormat_", "hmacKeyFormat_"});
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
                    synchronized (C0640j.class) {
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
