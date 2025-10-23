package e4;

import com.google.crypto.tink.shaded.protobuf.AbstractC0530h;
import com.google.crypto.tink.shaded.protobuf.AbstractC0541t;
import com.google.crypto.tink.shaded.protobuf.AbstractC0543v;
import com.google.crypto.tink.shaded.protobuf.C0529g;
/* loaded from: classes.dex */
public final class Y extends AbstractC0543v {
    private static final Y DEFAULT_INSTANCE;
    public static final int KEY_MATERIAL_TYPE_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.W PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int keyMaterialType_;
    private String typeUrl_ = "";
    private AbstractC0530h value_ = AbstractC0530h.f9118r;

    static {
        Y y3 = new Y();
        DEFAULT_INSTANCE = y3;
        AbstractC0543v.w(Y.class, y3);
    }

    public static void A(Y y3, C0529g c0529g) {
        y3.getClass();
        y3.value_ = c0529g;
    }

    public static void B(Y y3, X x7) {
        y3.getClass();
        y3.keyMaterialType_ = x7.b();
    }

    public static Y C() {
        return DEFAULT_INSTANCE;
    }

    public static W G() {
        return (W) DEFAULT_INSTANCE.j();
    }

    public static void z(Y y3, String str) {
        y3.getClass();
        str.getClass();
        y3.typeUrl_ = str;
    }

    public final X D() {
        X a7 = X.a(this.keyMaterialType_);
        if (a7 == null) {
            return X.f10126w;
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
                return new com.google.crypto.tink.shaded.protobuf.a0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "keyMaterialType_"});
            case 3:
                return new Y();
            case 4:
                return new AbstractC0541t(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                com.google.crypto.tink.shaded.protobuf.W w7 = PARSER;
                com.google.crypto.tink.shaded.protobuf.W w8 = w7;
                if (w7 == null) {
                    synchronized (Y.class) {
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
