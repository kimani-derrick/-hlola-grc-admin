package d0;

import M5.g;
import android.util.Log;
import androidx.fragment.app.ComponentCallbacksC0269x;
/* renamed from: d0.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0551d {

    /* renamed from: a  reason: collision with root package name */
    public static final C0550c f9213a = C0550c.f9212a;

    public static C0550c a(ComponentCallbacksC0269x componentCallbacksC0269x) {
        while (componentCallbacksC0269x != null) {
            if (componentCallbacksC0269x.z()) {
                componentCallbacksC0269x.t();
            }
            componentCallbacksC0269x = componentCallbacksC0269x.f6109M;
        }
        return f9213a;
    }

    public static void b(C0548a c0548a) {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(c0548a.f9206q.getClass().getName()), c0548a);
        }
    }

    public static final void c(ComponentCallbacksC0269x componentCallbacksC0269x, String str) {
        g.f(componentCallbacksC0269x, "fragment");
        g.f(str, "previousFragmentId");
        b(new C0548a(componentCallbacksC0269x, "Attempting to reuse fragment " + componentCallbacksC0269x + " with previous ID " + str));
        a(componentCallbacksC0269x).getClass();
        EnumC0549b enumC0549b = EnumC0549b.f9207q;
        if (enumC0549b instanceof Void) {
            Void r3 = (Void) enumC0549b;
        }
    }
}
