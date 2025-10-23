package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashSet;
/* loaded from: classes.dex */
public abstract class V {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f6798a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final LinkedHashSet f6799b = new LinkedHashSet();

    /* renamed from: c  reason: collision with root package name */
    public volatile boolean f6800c = false;

    public static void a(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e3) {
                throw new RuntimeException(e3);
            }
        }
    }

    public void b() {
    }

    public final Object c(Object obj, String str) {
        Object obj2;
        synchronized (this.f6798a) {
            try {
                obj2 = this.f6798a.get(str);
                if (obj2 == null) {
                    this.f6798a.put(str, obj);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (obj2 != null) {
            obj = obj2;
        }
        if (this.f6800c) {
            a(obj);
        }
        return obj;
    }
}
