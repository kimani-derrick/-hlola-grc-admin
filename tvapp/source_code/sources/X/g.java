package X;

import androidx.datastore.preferences.protobuf.AbstractC0222b;
import androidx.datastore.preferences.protobuf.AbstractC0241u;
import androidx.datastore.preferences.protobuf.AbstractC0243w;
import androidx.datastore.preferences.protobuf.AbstractC0246z;
import androidx.datastore.preferences.protobuf.C0221a0;
import androidx.datastore.preferences.protobuf.C0228g;
import androidx.datastore.preferences.protobuf.E;
import androidx.datastore.preferences.protobuf.InterfaceC0245y;
import androidx.datastore.preferences.protobuf.W;
import androidx.datastore.preferences.protobuf.Z;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
/* loaded from: classes.dex */
public final class g extends AbstractC0243w {
    private static final g DEFAULT_INSTANCE;
    private static volatile W PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private InterfaceC0245y strings_ = Z.f5736t;

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        AbstractC0243w.h(g.class, gVar);
    }

    public static void i(g gVar, Set set) {
        int i7;
        InterfaceC0245y interfaceC0245y = gVar.strings_;
        if (!((AbstractC0222b) interfaceC0245y).f5742q) {
            int size = interfaceC0245y.size();
            if (size == 0) {
                i7 = 10;
            } else {
                i7 = size * 2;
            }
            gVar.strings_ = interfaceC0245y.j(i7);
        }
        InterfaceC0245y interfaceC0245y2 = gVar.strings_;
        Charset charset = AbstractC0246z.f5827a;
        set.getClass();
        if (set instanceof E) {
            List k5 = ((E) set).k();
            E e3 = (E) interfaceC0245y2;
            int size2 = interfaceC0245y2.size();
            for (Object obj : k5) {
                if (obj == null) {
                    String str = "Element at index " + (e3.size() - size2) + " is null.";
                    for (int size3 = e3.size() - 1; size3 >= size2; size3--) {
                        e3.remove(size3);
                    }
                    throw new NullPointerException(str);
                } else if (obj instanceof C0228g) {
                    e3.p((C0228g) obj);
                } else {
                    e3.add((String) obj);
                }
            }
            return;
        }
        if (interfaceC0245y2 instanceof ArrayList) {
            ((ArrayList) interfaceC0245y2).ensureCapacity(set.size() + interfaceC0245y2.size());
        }
        int size4 = interfaceC0245y2.size();
        for (Object obj2 : set) {
            if (obj2 == null) {
                String str2 = "Element at index " + (interfaceC0245y2.size() - size4) + " is null.";
                for (int size5 = interfaceC0245y2.size() - 1; size5 >= size4; size5--) {
                    interfaceC0245y2.remove(size5);
                }
                throw new NullPointerException(str2);
            }
            interfaceC0245y2.add(obj2);
        }
    }

    public static g j() {
        return DEFAULT_INSTANCE;
    }

    public static f l() {
        return (f) ((AbstractC0241u) DEFAULT_INSTANCE.d(5));
    }

    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object, androidx.datastore.preferences.protobuf.W] */
    @Override // androidx.datastore.preferences.protobuf.AbstractC0243w
    public final Object d(int i7) {
        switch (s.h.b(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C0221a0(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 3:
                return new g();
            case 4:
                return new AbstractC0241u(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case i.STRING_SET_FIELD_NUMBER /* 6 */:
                W w7 = PARSER;
                W w8 = w7;
                if (w7 == null) {
                    synchronized (g.class) {
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

    public final InterfaceC0245y k() {
        return this.strings_;
    }
}
