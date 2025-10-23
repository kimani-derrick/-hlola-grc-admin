package J0;

import android.content.Context;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f1270a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static j f1271b;

    public static final j a(Context context) {
        j jVar = f1271b;
        if (jVar == null) {
            synchronized (f1270a) {
                j jVar2 = f1271b;
                if (jVar2 != null) {
                    return jVar2;
                }
                context.getApplicationContext();
                j i7 = h4.b.i(context);
                f1271b = i7;
                return i7;
            }
        }
        return jVar;
    }
}
