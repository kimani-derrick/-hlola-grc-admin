package g6;

import L1.b;
import M5.g;
import P5.e;
import android.content.Context;
import androidx.annotation.Keep;
import com.boxhdo.android.tv.App;
@Keep
/* loaded from: classes.dex */
public final class a {
    public static final a INSTANCE = new a();

    private a() {
    }

    public static final void a(Context context, String str) {
        App app;
        g.f(context, "a");
        g.f(str, "c");
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof App) {
            app = (App) applicationContext;
        } else {
            app = null;
        }
        if (app == null) {
            return;
        }
        b bVar = app.f7772s;
        if (bVar != null) {
            String s6 = o.f10858a.s();
            B0.a aVar = (B0.a) bVar.f1901a.f4980a.edit();
            aVar.putString(s6, str);
            aVar.apply();
            return;
        }
        g.l("c");
        throw null;
    }

    public static final String b(long j7) {
        e.f2815q.getClass();
        return String.valueOf(e.f2816r.d(j7));
    }
}
