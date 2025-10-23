package n0;

import java.util.LinkedHashMap;
import r0.AbstractC1111a;
/* loaded from: classes.dex */
public final class O {

    /* renamed from: b  reason: collision with root package name */
    public static final LinkedHashMap f12513b = new LinkedHashMap();

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap f12514a = new LinkedHashMap();

    public final void a(N n) {
        M5.g.f(n, "navigator");
        String u7 = m3.g.u(n.getClass());
        if (u7.length() > 0) {
            LinkedHashMap linkedHashMap = this.f12514a;
            N n7 = (N) linkedHashMap.get(u7);
            if (!M5.g.a(n7, n)) {
                boolean z7 = false;
                if (n7 != null && n7.f12512b) {
                    z7 = true;
                }
                if (!z7) {
                    if (!n.f12512b) {
                        N n8 = (N) linkedHashMap.put(u7, n);
                        return;
                    }
                    throw new IllegalStateException(("Navigator " + n + " is already attached to another NavController").toString());
                }
                throw new IllegalStateException(("Navigator " + n + " is replacing an already attached " + n7).toString());
            }
            return;
        }
        throw new IllegalArgumentException("navigator name cannot be an empty string".toString());
    }

    public final N b(String str) {
        M5.g.f(str, "name");
        if (str.length() > 0) {
            N n = (N) this.f12514a.get(str);
            if (n != null) {
                return n;
            }
            throw new IllegalStateException(AbstractC1111a.r("Could not find Navigator with name \"", str, "\". You must call NavController.addNavigator() for each navigation type."));
        }
        throw new IllegalArgumentException("navigator name cannot be an empty string".toString());
    }
}
