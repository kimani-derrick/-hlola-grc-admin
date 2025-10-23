package e4;

import com.google.crypto.tink.shaded.protobuf.AbstractC0543v;
import com.google.crypto.tink.shaded.protobuf.InterfaceC0546y;
/* loaded from: classes.dex */
public final class s0 extends AbstractC0543v {
    public static final int CONFIG_NAME_FIELD_NUMBER = 1;
    private static final s0 DEFAULT_INSTANCE;
    public static final int ENTRY_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.W PARSER;
    private String configName_ = "";
    private InterfaceC0546y entry_ = com.google.crypto.tink.shaded.protobuf.Z.f9097t;

    static {
        s0 s0Var = new s0();
        DEFAULT_INSTANCE = s0Var;
        AbstractC0543v.w(s0.class, s0Var);
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
                return new com.google.crypto.tink.shaded.protobuf.a0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"configName_", "entry_", c0.class});
            case 3:
                return new s0();
            case 4:
                return new K(DEFAULT_INSTANCE, 4);
            case 5:
                return DEFAULT_INSTANCE;
            case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                com.google.crypto.tink.shaded.protobuf.W w7 = PARSER;
                com.google.crypto.tink.shaded.protobuf.W w8 = w7;
                if (w7 == null) {
                    synchronized (s0.class) {
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
