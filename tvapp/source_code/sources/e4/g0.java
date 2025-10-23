package e4;

import com.google.crypto.tink.shaded.protobuf.AbstractC0524b;
import com.google.crypto.tink.shaded.protobuf.AbstractC0541t;
import com.google.crypto.tink.shaded.protobuf.AbstractC0543v;
import com.google.crypto.tink.shaded.protobuf.AbstractC0547z;
import com.google.crypto.tink.shaded.protobuf.C0532j;
import com.google.crypto.tink.shaded.protobuf.C0536n;
import com.google.crypto.tink.shaded.protobuf.InterfaceC0546y;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
/* loaded from: classes.dex */
public final class g0 extends AbstractC0543v {
    private static final g0 DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.W PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private InterfaceC0546y key_ = com.google.crypto.tink.shaded.protobuf.Z.f9097t;
    private int primaryKeyId_;

    static {
        g0 g0Var = new g0();
        DEFAULT_INSTANCE = g0Var;
        AbstractC0543v.w(g0.class, g0Var);
    }

    public static void A(g0 g0Var, f0 f0Var) {
        int i7;
        g0Var.getClass();
        InterfaceC0546y interfaceC0546y = g0Var.key_;
        if (!((AbstractC0524b) interfaceC0546y).f9103q) {
            int size = interfaceC0546y.size();
            if (size == 0) {
                i7 = 10;
            } else {
                i7 = size * 2;
            }
            g0Var.key_ = interfaceC0546y.j(i7);
        }
        g0Var.key_.add(f0Var);
    }

    public static d0 F() {
        return (d0) DEFAULT_INSTANCE.j();
    }

    public static g0 G(InputStream inputStream, C0536n c0536n) {
        B5.e c0532j;
        g0 g0Var = DEFAULT_INSTANCE;
        if (inputStream == null) {
            byte[] bArr = AbstractC0547z.f9166b;
            c0532j = B5.e.l(bArr, 0, bArr.length, false);
        } else {
            c0532j = new C0532j(inputStream);
        }
        AbstractC0543v v5 = AbstractC0543v.v(g0Var, c0532j, c0536n);
        AbstractC0543v.g(v5);
        return (g0) v5;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [com.google.android.gms.internal.measurement.Z1, java.lang.Object] */
    public static g0 H(byte[] bArr, C0536n c0536n) {
        g0 g0Var = DEFAULT_INSTANCE;
        int length = bArr.length;
        AbstractC0543v t5 = g0Var.t();
        try {
            com.google.crypto.tink.shaded.protobuf.Y y3 = com.google.crypto.tink.shaded.protobuf.Y.f9094c;
            y3.getClass();
            com.google.crypto.tink.shaded.protobuf.b0 a7 = y3.a(t5.getClass());
            ?? obj = new Object();
            c0536n.getClass();
            a7.i(t5, bArr, 0, length, obj);
            a7.f(t5);
            AbstractC0543v.g(t5);
            return (g0) t5;
        } catch (com.google.crypto.tink.shaded.protobuf.B e3) {
            if (e3.f9051q) {
                throw new IOException(e3.getMessage(), e3);
            }
            throw e3;
        } catch (com.google.crypto.tink.shaded.protobuf.d0 e7) {
            throw new IOException(e7.getMessage());
        } catch (IOException e8) {
            if (e8.getCause() instanceof com.google.crypto.tink.shaded.protobuf.B) {
                throw ((com.google.crypto.tink.shaded.protobuf.B) e8.getCause());
            }
            throw new IOException(e8.getMessage(), e8);
        } catch (IndexOutOfBoundsException unused) {
            throw com.google.crypto.tink.shaded.protobuf.B.g();
        }
    }

    public static void z(g0 g0Var, int i7) {
        g0Var.primaryKeyId_ = i7;
    }

    public final f0 B(int i7) {
        return (f0) this.key_.get(i7);
    }

    public final int C() {
        return this.key_.size();
    }

    public final List D() {
        return this.key_;
    }

    public final int E() {
        return this.primaryKeyId_;
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
                return new com.google.crypto.tink.shaded.protobuf.a0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "key_", f0.class});
            case 3:
                return new g0();
            case 4:
                return new AbstractC0541t(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                com.google.crypto.tink.shaded.protobuf.W w7 = PARSER;
                com.google.crypto.tink.shaded.protobuf.W w8 = w7;
                if (w7 == null) {
                    synchronized (g0.class) {
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
