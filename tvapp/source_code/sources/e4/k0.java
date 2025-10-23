package e4;

import com.google.crypto.tink.shaded.protobuf.AbstractC0524b;
import com.google.crypto.tink.shaded.protobuf.AbstractC0541t;
import com.google.crypto.tink.shaded.protobuf.AbstractC0543v;
import com.google.crypto.tink.shaded.protobuf.InterfaceC0546y;
/* loaded from: classes.dex */
public final class k0 extends AbstractC0543v {
    private static final k0 DEFAULT_INSTANCE;
    public static final int KEY_INFO_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.W PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private InterfaceC0546y keyInfo_ = com.google.crypto.tink.shaded.protobuf.Z.f9097t;
    private int primaryKeyId_;

    static {
        k0 k0Var = new k0();
        DEFAULT_INSTANCE = k0Var;
        AbstractC0543v.w(k0.class, k0Var);
    }

    public static void A(k0 k0Var, j0 j0Var) {
        int i7;
        k0Var.getClass();
        InterfaceC0546y interfaceC0546y = k0Var.keyInfo_;
        if (!((AbstractC0524b) interfaceC0546y).f9103q) {
            int size = interfaceC0546y.size();
            if (size == 0) {
                i7 = 10;
            } else {
                i7 = size * 2;
            }
            k0Var.keyInfo_ = interfaceC0546y.j(i7);
        }
        k0Var.keyInfo_.add(j0Var);
    }

    public static h0 C() {
        return (h0) DEFAULT_INSTANCE.j();
    }

    public static void z(k0 k0Var, int i7) {
        k0Var.primaryKeyId_ = i7;
    }

    public final j0 B() {
        return (j0) this.keyInfo_.get(0);
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
                return new com.google.crypto.tink.shaded.protobuf.a0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "keyInfo_", j0.class});
            case 3:
                return new k0();
            case 4:
                return new AbstractC0541t(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                com.google.crypto.tink.shaded.protobuf.W w7 = PARSER;
                com.google.crypto.tink.shaded.protobuf.W w8 = w7;
                if (w7 == null) {
                    synchronized (k0.class) {
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
