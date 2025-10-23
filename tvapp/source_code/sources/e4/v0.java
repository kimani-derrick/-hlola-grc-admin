package e4;

import com.google.crypto.tink.shaded.protobuf.AbstractC0530h;
import com.google.crypto.tink.shaded.protobuf.AbstractC0543v;
import com.google.crypto.tink.shaded.protobuf.C0536n;
/* loaded from: classes.dex */
public final class v0 extends AbstractC0543v {
    private static final v0 DEFAULT_INSTANCE;
    private static volatile com.google.crypto.tink.shaded.protobuf.W PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int version_;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.crypto.tink.shaded.protobuf.v, e4.v0] */
    static {
        ?? abstractC0543v = new AbstractC0543v();
        DEFAULT_INSTANCE = abstractC0543v;
        AbstractC0543v.w(v0.class, abstractC0543v);
    }

    public static v0 A(AbstractC0530h abstractC0530h, C0536n c0536n) {
        return (v0) AbstractC0543v.u(DEFAULT_INSTANCE, abstractC0530h, c0536n);
    }

    public static v0 z() {
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
                return new com.google.crypto.tink.shaded.protobuf.a0(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"version_"});
            case 3:
                return new AbstractC0543v();
            case 4:
                return new K(DEFAULT_INSTANCE, 5);
            case 5:
                return DEFAULT_INSTANCE;
            case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                com.google.crypto.tink.shaded.protobuf.W w7 = PARSER;
                com.google.crypto.tink.shaded.protobuf.W w8 = w7;
                if (w7 == null) {
                    synchronized (v0.class) {
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
