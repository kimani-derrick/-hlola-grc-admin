package e4;

import com.google.crypto.tink.shaded.protobuf.AbstractC0530h;
import com.google.crypto.tink.shaded.protobuf.AbstractC0541t;
import com.google.crypto.tink.shaded.protobuf.AbstractC0543v;
import com.google.crypto.tink.shaded.protobuf.C0529g;
import com.google.crypto.tink.shaded.protobuf.C0536n;
/* renamed from: e4.x  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0653x extends AbstractC0543v {
    private static final C0653x DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.W PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private AbstractC0530h keyValue_ = AbstractC0530h.f9118r;
    private int version_;

    static {
        C0653x c0653x = new C0653x();
        DEFAULT_INSTANCE = c0653x;
        AbstractC0543v.w(C0653x.class, c0653x);
    }

    public static void A(C0653x c0653x, C0529g c0529g) {
        c0653x.getClass();
        c0653x.keyValue_ = c0529g;
    }

    public static C0652w D() {
        return (C0652w) DEFAULT_INSTANCE.j();
    }

    public static C0653x E(AbstractC0530h abstractC0530h, C0536n c0536n) {
        return (C0653x) AbstractC0543v.u(DEFAULT_INSTANCE, abstractC0530h, c0536n);
    }

    public static void z(C0653x c0653x) {
        c0653x.version_ = 0;
    }

    public final AbstractC0530h B() {
        return this.keyValue_;
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
                return new com.google.crypto.tink.shaded.protobuf.a0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"version_", "keyValue_"});
            case 3:
                return new C0653x();
            case 4:
                return new AbstractC0541t(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                com.google.crypto.tink.shaded.protobuf.W w7 = PARSER;
                com.google.crypto.tink.shaded.protobuf.W w8 = w7;
                if (w7 == null) {
                    synchronized (C0653x.class) {
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
