package e4;

import com.google.crypto.tink.shaded.protobuf.AbstractC0530h;
import com.google.crypto.tink.shaded.protobuf.AbstractC0541t;
import com.google.crypto.tink.shaded.protobuf.AbstractC0543v;
import com.google.crypto.tink.shaded.protobuf.C0536n;
/* renamed from: e4.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0644n extends AbstractC0543v {
    private static final C0644n DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile com.google.crypto.tink.shaded.protobuf.W PARSER;
    private int keySize_;
    private C0646p params_;

    /* JADX WARN: Type inference failed for: r0v0, types: [e4.n, com.google.crypto.tink.shaded.protobuf.v] */
    static {
        ?? abstractC0543v = new AbstractC0543v();
        DEFAULT_INSTANCE = abstractC0543v;
        AbstractC0543v.w(C0644n.class, abstractC0543v);
    }

    public static void A(C0644n c0644n, int i7) {
        c0644n.keySize_ = i7;
    }

    public static C0644n B() {
        return DEFAULT_INSTANCE;
    }

    public static C0643m E() {
        return (C0643m) DEFAULT_INSTANCE.j();
    }

    public static C0644n F(AbstractC0530h abstractC0530h, C0536n c0536n) {
        return (C0644n) AbstractC0543v.u(DEFAULT_INSTANCE, abstractC0530h, c0536n);
    }

    public static void z(C0644n c0644n, C0646p c0646p) {
        c0644n.getClass();
        c0644n.params_ = c0646p;
    }

    public final int C() {
        return this.keySize_;
    }

    public final C0646p D() {
        C0646p c0646p = this.params_;
        if (c0646p == null) {
            return C0646p.A();
        }
        return c0646p;
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
                return new com.google.crypto.tink.shaded.protobuf.a0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"params_", "keySize_"});
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
                    synchronized (C0644n.class) {
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
