package e1;

import W5.AbstractC0117y;
import android.content.Context;
import android.util.Base64;
import h6.G;
import h6.t;
import h6.u;
import org.json.JSONObject;
/* renamed from: e1.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0572f implements u {

    /* renamed from: a  reason: collision with root package name */
    public final Context f9369a;

    /* renamed from: b  reason: collision with root package name */
    public int f9370b;

    public C0572f(Context context) {
        M5.g.f(context, "applicationContext");
        this.f9369a = context;
    }

    public static final String b(C0572f c0572f, t tVar) {
        c0572f.getClass();
        try {
            g6.o oVar = g6.o.f10858a;
            String b7 = tVar.b();
            String d = tVar.d();
            if (d == null) {
                d = "";
            }
            String encodeToString = Base64.encodeToString(oVar.k(b7, d, c0572f.f9369a), 2);
            M5.g.e(encodeToString, "{\n        val raw = o.ge…aw, Base64.NO_WRAP)\n    }");
            return encodeToString;
        } catch (Exception unused) {
            String jSONObject = new JSONObject().toString();
            M5.g.e(jSONObject, "{\n        JSONObject().toString()\n    }");
            return jSONObject;
        }
    }

    @Override // h6.u
    public final G a(m6.e eVar) {
        return (G) AbstractC0117y.t(new C0571e(eVar, this, null));
    }
}
