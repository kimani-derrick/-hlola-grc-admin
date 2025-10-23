package x6;

import android.os.Build;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import w0.ExecutorC1350d;
/* loaded from: classes.dex */
public final class I extends J {
    @Override // x6.J
    public final Executor a() {
        return new ExecutorC1350d(1);
    }

    @Override // x6.J
    public final Object b(Method method, Class cls, Object obj, Object... objArr) {
        if (Build.VERSION.SDK_INT >= 26) {
            return super.b(method, cls, obj, objArr);
        }
        throw new UnsupportedOperationException("Calling default methods on API 24 and 25 is not supported");
    }
}
