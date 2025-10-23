package e4;

import com.google.crypto.tink.shaded.protobuf.AbstractC0541t;
import com.google.crypto.tink.shaded.protobuf.AbstractC0543v;
/* loaded from: classes.dex */
public final class f0 extends AbstractC0543v {
    private static final f0 DEFAULT_INSTANCE;
    public static final int KEY_DATA_FIELD_NUMBER = 1;
    public static final int KEY_ID_FIELD_NUMBER = 3;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
    private static volatile com.google.crypto.tink.shaded.protobuf.W PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 2;
    private Y keyData_;
    private int keyId_;
    private int outputPrefixType_;
    private int status_;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.crypto.tink.shaded.protobuf.v, e4.f0] */
    static {
        ?? abstractC0543v = new AbstractC0543v();
        DEFAULT_INSTANCE = abstractC0543v;
        AbstractC0543v.w(f0.class, abstractC0543v);
    }

    public static void A(f0 f0Var, r0 r0Var) {
        f0Var.getClass();
        f0Var.outputPrefixType_ = r0Var.b();
    }

    public static void B(f0 f0Var) {
        Z z7 = Z.f10130s;
        f0Var.getClass();
        f0Var.status_ = z7.a();
    }

    public static void C(f0 f0Var, int i7) {
        f0Var.keyId_ = i7;
    }

    public static e0 I() {
        return (e0) DEFAULT_INSTANCE.j();
    }

    public static void z(f0 f0Var, Y y3) {
        f0Var.getClass();
        f0Var.keyData_ = y3;
    }

    public final Y D() {
        Y y3 = this.keyData_;
        if (y3 == null) {
            return Y.C();
        }
        return y3;
    }

    public final int E() {
        return this.keyId_;
    }

    public final r0 F() {
        r0 a7 = r0.a(this.outputPrefixType_);
        if (a7 == null) {
            return r0.f10141w;
        }
        return a7;
    }

    public final Z G() {
        Z z7;
        int i7 = this.status_;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        z7 = null;
                    } else {
                        z7 = Z.f10132u;
                    }
                } else {
                    z7 = Z.f10131t;
                }
            } else {
                z7 = Z.f10130s;
            }
        } else {
            z7 = Z.f10129r;
        }
        if (z7 == null) {
            return Z.f10133v;
        }
        return z7;
    }

    public final boolean H() {
        if (this.keyData_ != null) {
            return true;
        }
        return false;
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
                return new com.google.crypto.tink.shaded.protobuf.a0(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"keyData_", "status_", "keyId_", "outputPrefixType_"});
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
                    synchronized (f0.class) {
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
