package e4;

import com.google.crypto.tink.shaded.protobuf.AbstractC0530h;
import com.google.crypto.tink.shaded.protobuf.AbstractC0541t;
import com.google.crypto.tink.shaded.protobuf.AbstractC0543v;
import com.google.crypto.tink.shaded.protobuf.C0536n;
/* loaded from: classes.dex */
public final class p0 extends AbstractC0543v {
    private static final p0 DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.W PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private q0 params_;
    private int version_;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.crypto.tink.shaded.protobuf.v, e4.p0] */
    static {
        ?? abstractC0543v = new AbstractC0543v();
        DEFAULT_INSTANCE = abstractC0543v;
        AbstractC0543v.w(p0.class, abstractC0543v);
    }

    public static void A(p0 p0Var, q0 q0Var) {
        p0Var.getClass();
        q0Var.getClass();
        p0Var.params_ = q0Var;
    }

    public static o0 D() {
        return (o0) DEFAULT_INSTANCE.j();
    }

    public static p0 E(AbstractC0530h abstractC0530h, C0536n c0536n) {
        return (p0) AbstractC0543v.u(DEFAULT_INSTANCE, abstractC0530h, c0536n);
    }

    public static void z(p0 p0Var) {
        p0Var.version_ = 0;
    }

    public final q0 B() {
        q0 q0Var = this.params_;
        if (q0Var == null) {
            return q0.z();
        }
        return q0Var;
    }

    public final int C() {
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
                return new com.google.crypto.tink.shaded.protobuf.a0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"version_", "params_"});
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
                    synchronized (p0.class) {
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
