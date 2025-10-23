package k3;

import T1.j;
import android.content.Context;
/* renamed from: k3.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0959b {

    /* renamed from: b  reason: collision with root package name */
    public static final C0959b f12209b;

    /* renamed from: a  reason: collision with root package name */
    public j f12210a;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k3.b] */
    static {
        ?? obj = new Object();
        obj.f12210a = null;
        f12209b = obj;
    }

    public static j a(Context context) {
        j jVar;
        C0959b c0959b = f12209b;
        synchronized (c0959b) {
            try {
                if (c0959b.f12210a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    c0959b.f12210a = new j(context, (char) 0);
                }
                jVar = c0959b.f12210a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return jVar;
    }
}
