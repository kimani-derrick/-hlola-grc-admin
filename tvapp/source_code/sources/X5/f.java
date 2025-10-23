package X5;

import M5.g;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import k3.AbstractC0958a;
import z5.C1525g;
/* loaded from: classes.dex */
public abstract class f {
    private static volatile Choreographer choreographer;

    static {
        Object m7;
        try {
            m7 = new e(a(Looper.getMainLooper()));
        } catch (Throwable th) {
            m7 = AbstractC0958a.m(th);
        }
        if (m7 instanceof C1525g) {
            m7 = null;
        }
        e eVar = (e) m7;
    }

    public static final Handler a(Looper looper) {
        Object newInstance;
        if (Build.VERSION.SDK_INT >= 28) {
            newInstance = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            g.d(newInstance, "null cannot be cast to non-null type android.os.Handler");
        } else {
            try {
                newInstance = Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        return (Handler) newInstance;
    }
}
