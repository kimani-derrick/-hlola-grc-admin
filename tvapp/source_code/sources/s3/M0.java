package s3;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.F3;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final /* synthetic */ class M0 implements Runnable {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f13830q;

    /* renamed from: r  reason: collision with root package name */
    public /* synthetic */ int f13831r;

    /* renamed from: s  reason: collision with root package name */
    public /* synthetic */ Object f13832s;

    /* renamed from: t  reason: collision with root package name */
    public /* synthetic */ Object f13833t;

    /* renamed from: u  reason: collision with root package name */
    public /* synthetic */ Cloneable f13834u;

    public /* synthetic */ M0(int i7) {
        this.f13830q = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13830q) {
            case 0:
                C1175g0 c1175g0 = ((V) ((A4.e) this.f13832s).f106s).f13917b;
                C1170e c1170e = c1175g0.f14062w;
                int i7 = this.f13831r;
                Exception exc = (Exception) this.f13833t;
                C1154I c1154i = c1175g0.f14064y;
                if ((i7 == 200 || i7 == 204 || i7 == 304) && exc == null) {
                    T t5 = c1175g0.f14063x;
                    C1175g0.h(t5);
                    t5.f13887K.a(true);
                    byte[] bArr = (byte[]) this.f13834u;
                    if (bArr != null && bArr.length != 0) {
                        try {
                            JSONObject jSONObject = new JSONObject(new String(bArr));
                            String optString = jSONObject.optString("deeplink", "");
                            if (TextUtils.isEmpty(optString)) {
                                C1175g0.i(c1154i);
                                c1154i.f13802C.d("Deferred Deep Link is empty.");
                                return;
                            }
                            String optString2 = jSONObject.optString("gclid", "");
                            String optString3 = jSONObject.optString("gbraid", "");
                            String optString4 = jSONObject.optString("gad_source", "");
                            double optDouble = jSONObject.optDouble("timestamp", 0.0d);
                            Bundle bundle = new Bundle();
                            F3.a();
                            C1148C c1148c = AbstractC1203v.f14287O0;
                            boolean O5 = c1170e.O(null, c1148c);
                            x1 x1Var = c1175g0.f14035B;
                            if (O5) {
                                C1175g0.h(x1Var);
                                if (!x1Var.N0(optString)) {
                                    C1175g0.i(c1154i);
                                    c1154i.f13810y.e("Deferred Deep Link validation failed. gclid, gbraid, deep link", optString2, optString3, optString);
                                    return;
                                }
                                if (!TextUtils.isEmpty(optString3)) {
                                    bundle.putString("gbraid", optString3);
                                }
                                if (!TextUtils.isEmpty(optString4)) {
                                    bundle.putString("gad_source", optString4);
                                }
                                long longValue = Double.valueOf(optDouble).longValue();
                                if (longValue > 0) {
                                    bundle.putLong("click_timestamp", longValue);
                                }
                            } else {
                                C1175g0.h(x1Var);
                                if (!x1Var.N0(optString)) {
                                    C1175g0.i(c1154i);
                                    c1154i.f13810y.b(optString2, optString, "Deferred Deep Link validation failed. gclid, deep link");
                                    return;
                                }
                            }
                            F3.a();
                            c1170e.O(null, c1148c);
                            bundle.putString("gclid", optString2);
                            bundle.putString("_cis", "ddp");
                            c1175g0.F.i0("auto", "_cmp", bundle);
                            C1175g0.h(x1Var);
                            if (!TextUtils.isEmpty(optString) && x1Var.n0(optString, optDouble)) {
                                ((C1175g0) x1Var.f2765q).f14056q.sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
                                return;
                            }
                            return;
                        } catch (JSONException e3) {
                            C1175g0.i(c1154i);
                            c1154i.f13807v.c(e3, "Failed to parse the Deferred Deep Link response. exception");
                            return;
                        }
                    }
                    C1175g0.i(c1154i);
                    c1154i.f13802C.d("Deferred Deep Link response empty.");
                    return;
                }
                C1175g0.i(c1154i);
                c1154i.f13810y.b(Integer.valueOf(i7), exc, "Network Request for Deferred Deep Link failed. response, exception");
                return;
            default:
                T1.j jVar = (T1.j) this.f13832s;
                d1 d1Var = (d1) jVar.f3243a;
                int i8 = this.f13831r;
                if (d1Var.d(i8)) {
                    ((C1154I) this.f13833t).f13803D.c(Integer.valueOf(i8), "Local AppMeasurementService processed last upload request. StartId");
                    jVar.e().f13803D.d("Completed wakeful intent.");
                    d1Var.b((Intent) this.f13834u);
                    return;
                }
                return;
        }
    }
}
