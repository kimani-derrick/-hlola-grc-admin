package e4;

import com.google.crypto.tink.shaded.protobuf.AbstractC0530h;
import com.google.crypto.tink.shaded.protobuf.AbstractC0543v;
import com.google.crypto.tink.shaded.protobuf.C0536n;
/* loaded from: classes.dex */
public final class L extends AbstractC0543v {
    private static final L DEFAULT_INSTANCE;
    private static volatile com.google.crypto.tink.shaded.protobuf.W PARSER;

    /* JADX WARN: Type inference failed for: r0v0, types: [e4.L, com.google.crypto.tink.shaded.protobuf.v] */
    static {
        ?? abstractC0543v = new AbstractC0543v();
        DEFAULT_INSTANCE = abstractC0543v;
        AbstractC0543v.w(L.class, abstractC0543v);
    }

    public static L A(AbstractC0530h abstractC0530h, C0536n c0536n) {
        return (L) AbstractC0543v.u(DEFAULT_INSTANCE, abstractC0530h, c0536n);
    }

    public static L z() {
        return DEFAULT_INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object, com.google.crypto.tink.shaded.protobuf.W] */
    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0543v
    public final Object k(int i7) {
        switch (s.h.b(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new com.google.crypto.tink.shaded.protobuf.a0(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 3:
                return new AbstractC0543v();
            case 4:
                return new K(DEFAULT_INSTANCE, 0);
            case 5:
                return DEFAULT_INSTANCE;
            case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                com.google.crypto.tink.shaded.protobuf.W w7 = PARSER;
                com.google.crypto.tink.shaded.protobuf.W w8 = w7;
                if (w7 == null) {
                    synchronized (L.class) {
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
