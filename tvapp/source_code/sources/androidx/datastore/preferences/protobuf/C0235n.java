package androidx.datastore.preferences.protobuf;

import java.util.Collections;
/* renamed from: androidx.datastore.preferences.protobuf.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0235n {

    /* renamed from: a  reason: collision with root package name */
    public static volatile C0235n f5799a;

    /* renamed from: b  reason: collision with root package name */
    public static final C0235n f5800b;

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.datastore.preferences.protobuf.n, java.lang.Object] */
    static {
        try {
            Class.forName("androidx.datastore.preferences.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
        }
        ?? obj = new Object();
        Collections.emptyMap();
        f5800b = obj;
    }

    public static C0235n a() {
        C0235n c0235n = f5799a;
        if (c0235n == null) {
            synchronized (C0235n.class) {
                try {
                    c0235n = f5799a;
                    if (c0235n == null) {
                        Class cls = AbstractC0234m.f5797a;
                        if (cls != null) {
                            try {
                                c0235n = (C0235n) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                            } catch (Exception unused) {
                            }
                            f5799a = c0235n;
                        }
                        c0235n = f5800b;
                        f5799a = c0235n;
                    }
                } finally {
                }
            }
        }
        return c0235n;
    }
}
