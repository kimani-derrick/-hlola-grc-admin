package e4;

import com.google.crypto.tink.shaded.protobuf.AbstractC0530h;
import com.google.crypto.tink.shaded.protobuf.AbstractC0541t;
import com.google.crypto.tink.shaded.protobuf.AbstractC0543v;
import com.google.crypto.tink.shaded.protobuf.C0529g;
import com.google.crypto.tink.shaded.protobuf.C0536n;
/* renamed from: e4.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0642l extends AbstractC0543v {
    private static final C0642l DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.W PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private AbstractC0530h keyValue_ = AbstractC0530h.f9118r;
    private C0646p params_;
    private int version_;

    static {
        C0642l c0642l = new C0642l();
        DEFAULT_INSTANCE = c0642l;
        AbstractC0543v.w(C0642l.class, c0642l);
    }

    public static void A(C0642l c0642l, C0646p c0646p) {
        c0642l.getClass();
        c0646p.getClass();
        c0642l.params_ = c0646p;
    }

    public static void B(C0642l c0642l, C0529g c0529g) {
        c0642l.getClass();
        c0642l.keyValue_ = c0529g;
    }

    public static C0642l C() {
        return DEFAULT_INSTANCE;
    }

    public static C0641k G() {
        return (C0641k) DEFAULT_INSTANCE.j();
    }

    public static C0642l H(AbstractC0530h abstractC0530h, C0536n c0536n) {
        return (C0642l) AbstractC0543v.u(DEFAULT_INSTANCE, abstractC0530h, c0536n);
    }

    public static void z(C0642l c0642l) {
        c0642l.version_ = 0;
    }

    public final AbstractC0530h D() {
        return this.keyValue_;
    }

    public final C0646p E() {
        C0646p c0646p = this.params_;
        if (c0646p == null) {
            return C0646p.A();
        }
        return c0646p;
    }

    public final int F() {
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
                return new C0642l();
            case 4:
                return new AbstractC0541t(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                com.google.crypto.tink.shaded.protobuf.W w7 = PARSER;
                com.google.crypto.tink.shaded.protobuf.W w8 = w7;
                if (w7 == null) {
                    synchronized (C0642l.class) {
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
