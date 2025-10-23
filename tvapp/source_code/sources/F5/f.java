package F5;

import android.os.Build;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public Method f733a;

    /* renamed from: b  reason: collision with root package name */
    public Method f734b;

    /* renamed from: c  reason: collision with root package name */
    public Method f735c;

    public /* synthetic */ f(Method method, Method method2, Method method3) {
        this.f733a = method;
        this.f734b = method2;
        this.f735c = method3;
    }

    public static void a() {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
    }
}
