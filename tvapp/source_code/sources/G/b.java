package G;

import M5.g;
import android.os.Build;
import java.util.Locale;
/* loaded from: classes.dex */
public abstract class b {
    static {
        int i7 = Build.VERSION.SDK_INT;
        a aVar = a.f739a;
        if (i7 >= 30) {
            aVar.a(30);
        }
        if (i7 >= 30) {
            aVar.a(31);
        }
        if (i7 >= 30) {
            aVar.a(33);
        }
        if (i7 >= 30) {
            aVar.a(1000000);
        }
    }

    public static final boolean a() {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 33) {
            if (i7 >= 32) {
                String str = Build.VERSION.CODENAME;
                g.e(str, "CODENAME");
                if (!g.a("REL", str)) {
                    Locale locale = Locale.ROOT;
                    String upperCase = str.toUpperCase(locale);
                    g.e(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                    String upperCase2 = "Tiramisu".toUpperCase(locale);
                    g.e(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                    if (upperCase.compareTo(upperCase2) >= 0) {
                    }
                }
            }
            return false;
        }
        return true;
    }
}
