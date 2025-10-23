package androidx.datastore.preferences.protobuf;
/* renamed from: androidx.datastore.preferences.protobuf.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0224c {

    /* renamed from: a  reason: collision with root package name */
    public static final Class f5743a;

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f5744b;

    static {
        Class<?> cls;
        boolean z7;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f5743a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        if (cls2 != null) {
            z7 = true;
        } else {
            z7 = false;
        }
        f5744b = z7;
    }

    public static boolean a() {
        return (f5743a == null || f5744b) ? false : true;
    }
}
