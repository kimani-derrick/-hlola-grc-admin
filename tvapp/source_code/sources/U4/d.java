package U4;

import android.util.Log;
import com.google.android.gms.internal.measurement.K1;
import i4.C0772a;
import i4.C0774c;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import t3.C1251o;
import t3.InterfaceC1237a;
import t3.InterfaceC1243g;
/* loaded from: classes.dex */
public final /* synthetic */ class d implements InterfaceC1243g, InterfaceC1237a {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ f f3446q;

    public /* synthetic */ d(f fVar) {
        this.f3446q = fVar;
    }

    @Override // t3.InterfaceC1243g
    public C1251o A(Object obj) {
        Void r62 = (Void) obj;
        f fVar = this.f3446q;
        C1251o b7 = fVar.f3453c.b();
        C1251o b8 = fVar.d.b();
        return m3.g.H(b7, b8).e(fVar.f3452b, new e(fVar, b7, b8, 0));
    }

    @Override // t3.InterfaceC1237a
    public Object d(C1251o c1251o) {
        boolean z7;
        f fVar = this.f3446q;
        fVar.getClass();
        if (c1251o.i()) {
            V4.e eVar = fVar.f3453c;
            synchronized (eVar) {
                eVar.f3672c = m3.g.m(null);
            }
            eVar.f3671b.a();
            V4.g gVar = (V4.g) c1251o.g();
            if (gVar != null) {
                JSONArray jSONArray = gVar.d;
                C0774c c0774c = fVar.f3451a;
                if (c0774c != null) {
                    try {
                        c0774c.c(f.d(jSONArray));
                    } catch (C0772a e3) {
                        Log.w("FirebaseRemoteConfig", "Could not update ABT experiments.", e3);
                    } catch (JSONException e7) {
                        Log.e("FirebaseRemoteConfig", "Could not parse ABT experiments from the JSON response.", e7);
                    }
                }
                C4.b bVar = fVar.f3457i;
                bVar.getClass();
                try {
                    Y4.d x7 = ((K1) bVar.f422s).x(gVar);
                    for (r4.b bVar2 : (Set) bVar.f424u) {
                        ((Executor) bVar.f423t).execute(new W4.a(bVar2, x7, 1));
                    }
                } catch (h e8) {
                    Log.w("FirebaseRemoteConfig", "Exception publishing RolloutsState to subscribers. Continuing to listen for changes.", e8);
                }
            } else {
                Log.e("FirebaseRemoteConfig", "Activated configs written to disk are null.");
            }
            z7 = true;
        } else {
            z7 = false;
        }
        return Boolean.valueOf(z7);
    }
}
