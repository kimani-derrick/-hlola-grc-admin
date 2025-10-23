package X;

import androidx.datastore.preferences.protobuf.AbstractC0241u;
import androidx.datastore.preferences.protobuf.AbstractC0243w;
import androidx.datastore.preferences.protobuf.B;
import androidx.datastore.preferences.protobuf.C0221a0;
import androidx.datastore.preferences.protobuf.C0229h;
import androidx.datastore.preferences.protobuf.C0230i;
import androidx.datastore.preferences.protobuf.C0235n;
import androidx.datastore.preferences.protobuf.InterfaceC0223b0;
import androidx.datastore.preferences.protobuf.M;
import androidx.datastore.preferences.protobuf.W;
import androidx.datastore.preferences.protobuf.Y;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
/* loaded from: classes.dex */
public final class e extends AbstractC0243w {
    private static final e DEFAULT_INSTANCE;
    private static volatile W PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private M preferences_ = M.f5709r;

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        AbstractC0243w.h(e.class, eVar);
    }

    public static M i(e eVar) {
        M m7 = eVar.preferences_;
        if (!m7.f5710q) {
            eVar.preferences_ = m7.c();
        }
        return eVar.preferences_;
    }

    public static c k() {
        return (c) ((AbstractC0241u) DEFAULT_INSTANCE.d(5));
    }

    public static e l(FileInputStream fileInputStream) {
        e eVar = DEFAULT_INSTANCE;
        C0229h c0229h = new C0229h(fileInputStream);
        C0235n a7 = C0235n.a();
        AbstractC0243w abstractC0243w = (AbstractC0243w) eVar.d(4);
        try {
            Y y3 = Y.f5733c;
            y3.getClass();
            InterfaceC0223b0 a8 = y3.a(abstractC0243w.getClass());
            C0230i c0230i = c0229h.d;
            if (c0230i == null) {
                c0230i = new C0230i(c0229h);
            }
            a8.h(abstractC0243w, c0230i, a7);
            a8.f(abstractC0243w);
            if (abstractC0243w.g()) {
                return (e) abstractC0243w;
            }
            throw new IOException(new F0.c().getMessage());
        } catch (IOException e3) {
            if (e3.getCause() instanceof B) {
                throw ((B) e3.getCause());
            }
            throw new IOException(e3.getMessage());
        } catch (RuntimeException e7) {
            if (e7.getCause() instanceof B) {
                throw ((B) e7.getCause());
            }
            throw e7;
        }
    }

    /* JADX WARN: Type inference failed for: r4v14, types: [java.lang.Object, androidx.datastore.preferences.protobuf.W] */
    @Override // androidx.datastore.preferences.protobuf.AbstractC0243w
    public final Object d(int i7) {
        switch (s.h.b(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C0221a0(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", d.f4051a});
            case 3:
                return new e();
            case 4:
                return new AbstractC0241u(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case i.STRING_SET_FIELD_NUMBER /* 6 */:
                W w7 = PARSER;
                W w8 = w7;
                if (w7 == null) {
                    synchronized (e.class) {
                        try {
                            W w9 = PARSER;
                            W w10 = w9;
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

    public final Map j() {
        return Collections.unmodifiableMap(this.preferences_);
    }
}
