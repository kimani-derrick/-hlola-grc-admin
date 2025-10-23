package s3;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;
/* renamed from: s3.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1190o {

    /* renamed from: a  reason: collision with root package name */
    public final String f14163a;

    /* renamed from: b  reason: collision with root package name */
    public final String f14164b;

    /* renamed from: c  reason: collision with root package name */
    public final String f14165c;
    public final long d;

    /* renamed from: e  reason: collision with root package name */
    public final long f14166e;
    public final r f;

    public C1190o(C1175g0 c1175g0, String str, String str2, String str3, long j7, long j8, r rVar) {
        g3.n.c(str2);
        g3.n.c(str3);
        g3.n.g(rVar);
        this.f14163a = str2;
        this.f14164b = str3;
        this.f14165c = TextUtils.isEmpty(str) ? null : str;
        this.d = j7;
        this.f14166e = j8;
        if (j8 != 0 && j8 > j7) {
            C1154I c1154i = c1175g0.f14064y;
            C1175g0.i(c1154i);
            c1154i.f13810y.b(C1154I.J(str2), C1154I.J(str3), "Event created with reverse previous/current timestamps. appId, name");
        }
        this.f = rVar;
    }

    public final C1190o a(C1175g0 c1175g0, long j7) {
        return new C1190o(c1175g0, this.f14165c, this.f14163a, this.f14164b, this.d, j7, this.f);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f);
        return "Event{appId='" + this.f14163a + "', name='" + this.f14164b + "', params=" + valueOf + "}";
    }

    public C1190o(C1175g0 c1175g0, String str, String str2, String str3, long j7, Bundle bundle) {
        r rVar;
        g3.n.c(str2);
        g3.n.c(str3);
        this.f14163a = str2;
        this.f14164b = str3;
        this.f14165c = TextUtils.isEmpty(str) ? null : str;
        this.d = j7;
        this.f14166e = 0L;
        if (bundle.isEmpty()) {
            rVar = new r(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    C1154I c1154i = c1175g0.f14064y;
                    C1175g0.i(c1154i);
                    c1154i.f13807v.d("Param name can't be null");
                } else {
                    x1 x1Var = c1175g0.f14035B;
                    C1175g0.h(x1Var);
                    Object y0 = x1Var.y0(bundle2.get(next), next);
                    if (y0 == null) {
                        C1154I c1154i2 = c1175g0.f14064y;
                        C1175g0.i(c1154i2);
                        c1154i2.f13810y.c(c1175g0.f14036C.f(next), "Param value can't be null");
                    } else {
                        x1 x1Var2 = c1175g0.f14035B;
                        C1175g0.h(x1Var2);
                        x1Var2.W(bundle2, next, y0);
                    }
                }
                it.remove();
            }
            rVar = new r(bundle2);
        }
        this.f = rVar;
    }
}
