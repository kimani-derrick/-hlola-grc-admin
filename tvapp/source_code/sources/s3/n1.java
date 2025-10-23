package s3;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.j4;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class n1 extends l1 {
    /* JADX WARN: Type inference failed for: r0v11, types: [s3.r1, java.lang.Object] */
    public final Pair H(String str) {
        C1146A u02;
        String str2;
        j4.a();
        r1 r1Var = null;
        if (((C1175g0) this.f2765q).f14062w.O(null, AbstractC1203v.f14349u0)) {
            C();
            if (x1.I0(str)) {
                b().f13803D.d("sgtm feature flag enabled.");
                C1146A u03 = F().u0(str);
                if (u03 != null) {
                    String g7 = u03.g();
                    com.google.android.gms.internal.measurement.Q0 V6 = G().V(str);
                    if (V6 != null && (u02 = F().u0(str)) != null && ((V6.K() && V6.A().r() == 100) || C().G0(str, u02.l()) || (!TextUtils.isEmpty(g7) && g7.hashCode() % 100 < V6.A().r()))) {
                        if (u03.p()) {
                            b().f13803D.d("sgtm upload enabled in manifest.");
                            com.google.android.gms.internal.measurement.Q0 V7 = G().V(u03.f());
                            if (V7 != null && V7.K()) {
                                String u7 = V7.A().u();
                                if (!TextUtils.isEmpty(u7)) {
                                    String t5 = V7.A().t();
                                    C1154I b7 = b();
                                    if (TextUtils.isEmpty(t5)) {
                                        str2 = "Y";
                                    } else {
                                        str2 = "N";
                                    }
                                    b7.f13803D.b(u7, str2, "sgtm configured with upload_url, server_info");
                                    if (TextUtils.isEmpty(t5)) {
                                        r1Var = new r1(u7);
                                    } else {
                                        HashMap hashMap = new HashMap();
                                        hashMap.put("x-sgtm-server-info", t5);
                                        if (!TextUtils.isEmpty(u03.l())) {
                                            hashMap.put("x-gtm-server-preview", u03.l());
                                        }
                                        ?? obj = new Object();
                                        obj.f14222a = u7;
                                        obj.f14223b = hashMap;
                                        r1Var = obj;
                                    }
                                }
                            }
                        }
                        if (r1Var != null) {
                            return Pair.create(r1Var, Boolean.FALSE);
                        }
                    }
                }
                return Pair.create(new r1(I(str)), Boolean.TRUE);
            }
        }
        return Pair.create(new r1(I(str)), Boolean.TRUE);
    }

    public final String I(String str) {
        Z G6 = G();
        G6.D();
        G6.b0(str);
        String str2 = (String) G6.f13942B.get(str);
        if (!TextUtils.isEmpty(str2)) {
            Uri parse = Uri.parse((String) AbstractC1203v.f14342r.a(null));
            Uri.Builder buildUpon = parse.buildUpon();
            String authority = parse.getAuthority();
            buildUpon.authority(str2 + "." + authority);
            return buildUpon.build().toString();
        }
        return (String) AbstractC1203v.f14342r.a(null);
    }
}
