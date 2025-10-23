package e4;

import com.google.crypto.tink.shaded.protobuf.AbstractC0530h;
import com.google.crypto.tink.shaded.protobuf.AbstractC0541t;
import com.google.crypto.tink.shaded.protobuf.AbstractC0543v;
import com.google.crypto.tink.shaded.protobuf.C0529g;
import com.google.crypto.tink.shaded.protobuf.C0536n;
/* renamed from: e4.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0632b extends AbstractC0543v {
    private static final C0632b DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.W PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private AbstractC0530h keyValue_ = AbstractC0530h.f9118r;
    private C0636f params_;
    private int version_;

    static {
        C0632b c0632b = new C0632b();
        DEFAULT_INSTANCE = c0632b;
        AbstractC0543v.w(C0632b.class, c0632b);
    }

    public static void A(C0632b c0632b, C0529g c0529g) {
        c0632b.getClass();
        c0632b.keyValue_ = c0529g;
    }

    public static void B(C0632b c0632b, C0636f c0636f) {
        c0632b.getClass();
        c0636f.getClass();
        c0632b.params_ = c0636f;
    }

    public static C0631a F() {
        return (C0631a) DEFAULT_INSTANCE.j();
    }

    public static C0632b G(AbstractC0530h abstractC0530h, C0536n c0536n) {
        return (C0632b) AbstractC0543v.u(DEFAULT_INSTANCE, abstractC0530h, c0536n);
    }

    public static void z(C0632b c0632b) {
        c0632b.version_ = 0;
    }

    public final AbstractC0530h C() {
        return this.keyValue_;
    }

    public final C0636f D() {
        C0636f c0636f = this.params_;
        if (c0636f == null) {
            return C0636f.A();
        }
        return c0636f;
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
                return new com.google.crypto.tink.shaded.protobuf.a0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"version_", "keyValue_", "params_"});
            case 3:
                return new C0632b();
            case 4:
                return new AbstractC0541t(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                com.google.crypto.tink.shaded.protobuf.W w7 = PARSER;
                com.google.crypto.tink.shaded.protobuf.W w8 = w7;
                if (w7 == null) {
                    synchronized (C0632b.class) {
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
