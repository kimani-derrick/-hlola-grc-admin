package N4;

import android.util.Log;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;
import r0.AbstractC1111a;
/* loaded from: classes.dex */
public final /* synthetic */ class b implements M4.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2519a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f2520b;

    public /* synthetic */ b(int i7, Object obj) {
        this.f2519a = i7;
        this.f2520b = obj;
    }

    @Override // M4.b
    public final Object get() {
        switch (this.f2519a) {
            case 0:
                return new O4.c((h4.f) this.f2520b);
            case 1:
                String str = (String) this.f2520b;
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                    }
                    throw new RuntimeException("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                } catch (ClassNotFoundException unused) {
                    Log.w("ComponentDiscovery", "Class " + str + " is not an found.");
                    return null;
                } catch (IllegalAccessException e3) {
                    throw new RuntimeException(AbstractC1111a.r("Could not instantiate ", str, "."), e3);
                } catch (InstantiationException e7) {
                    throw new RuntimeException(AbstractC1111a.r("Could not instantiate ", str, "."), e7);
                } catch (NoSuchMethodException e8) {
                    throw new RuntimeException(AbstractC0515y1.x("Could not instantiate ", str), e8);
                } catch (InvocationTargetException e9) {
                    throw new RuntimeException(AbstractC0515y1.x("Could not instantiate ", str), e9);
                }
            default:
                return (ComponentRegistrar) this.f2520b;
        }
    }
}
