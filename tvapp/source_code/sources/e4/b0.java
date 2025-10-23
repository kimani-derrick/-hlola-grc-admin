package e4;

import com.google.crypto.tink.shaded.protobuf.AbstractC0530h;
import com.google.crypto.tink.shaded.protobuf.AbstractC0541t;
import com.google.crypto.tink.shaded.protobuf.AbstractC0543v;
import com.google.crypto.tink.shaded.protobuf.C0529g;
/* loaded from: classes.dex */
public final class b0 extends AbstractC0543v {
    private static final b0 DEFAULT_INSTANCE;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.W PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int outputPrefixType_;
    private String typeUrl_ = "";
    private AbstractC0530h value_ = AbstractC0530h.f9118r;

    static {
        b0 b0Var = new b0();
        DEFAULT_INSTANCE = b0Var;
        AbstractC0543v.w(b0.class, b0Var);
    }

    public static void A(b0 b0Var, C0529g c0529g) {
        b0Var.getClass();
        b0Var.value_ = c0529g;
    }

    public static void B(b0 b0Var, r0 r0Var) {
        b0Var.getClass();
        b0Var.outputPrefixType_ = r0Var.b();
    }

    public static b0 C() {
        return DEFAULT_INSTANCE;
    }

    public static a0 G() {
        return (a0) DEFAULT_INSTANCE.j();
    }

    public static void z(b0 b0Var, String str) {
        b0Var.getClass();
        str.getClass();
        b0Var.typeUrl_ = str;
    }

    public final r0 D() {
        r0 a7 = r0.a(this.outputPrefixType_);
        if (a7 == null) {
            return r0.f10141w;
        }
        return a7;
    }

    public final String E() {
        return this.typeUrl_;
    }

    public final AbstractC0530h F() {
        return this.value_;
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
                return new com.google.crypto.tink.shaded.protobuf.a0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "outputPrefixType_"});
            case 3:
                return new b0();
            case 4:
                return new AbstractC0541t(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                com.google.crypto.tink.shaded.protobuf.W w7 = PARSER;
                com.google.crypto.tink.shaded.protobuf.W w8 = w7;
                if (w7 == null) {
                    synchronized (b0.class) {
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
