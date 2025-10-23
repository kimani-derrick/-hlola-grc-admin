package e4;

import com.google.crypto.tink.shaded.protobuf.AbstractC0530h;
import com.google.crypto.tink.shaded.protobuf.AbstractC0541t;
import com.google.crypto.tink.shaded.protobuf.AbstractC0543v;
import com.google.crypto.tink.shaded.protobuf.C0529g;
import com.google.crypto.tink.shaded.protobuf.C0536n;
/* loaded from: classes.dex */
public final class r extends AbstractC0543v {
    private static final r DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.W PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private AbstractC0530h keyValue_ = AbstractC0530h.f9118r;
    private C0651v params_;
    private int version_;

    static {
        r rVar = new r();
        DEFAULT_INSTANCE = rVar;
        AbstractC0543v.w(r.class, rVar);
    }

    public static void A(r rVar, C0651v c0651v) {
        rVar.getClass();
        c0651v.getClass();
        rVar.params_ = c0651v;
    }

    public static void B(r rVar, C0529g c0529g) {
        rVar.getClass();
        rVar.keyValue_ = c0529g;
    }

    public static C0647q F() {
        return (C0647q) DEFAULT_INSTANCE.j();
    }

    public static r G(AbstractC0530h abstractC0530h, C0536n c0536n) {
        return (r) AbstractC0543v.u(DEFAULT_INSTANCE, abstractC0530h, c0536n);
    }

    public static void z(r rVar) {
        rVar.version_ = 0;
    }

    public final AbstractC0530h C() {
        return this.keyValue_;
    }

    public final C0651v D() {
        C0651v c0651v = this.params_;
        if (c0651v == null) {
            return C0651v.A();
        }
        return c0651v;
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
                return new com.google.crypto.tink.shaded.protobuf.a0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            case 3:
                return new r();
            case 4:
                return new AbstractC0541t(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                com.google.crypto.tink.shaded.protobuf.W w7 = PARSER;
                com.google.crypto.tink.shaded.protobuf.W w8 = w7;
                if (w7 == null) {
                    synchronized (r.class) {
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
