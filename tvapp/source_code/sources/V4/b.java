package V4;

import android.util.Log;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import k.V0;
import org.json.JSONObject;
import t3.C1251o;
import t3.InterfaceC1237a;
/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f3661q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ long f3662r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ V0 f3663s;

    public b(V0 v02, int i7, long j7) {
        this.f3663s = v02;
        this.f3661q = i7;
        this.f3662r = j7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final V0 v02 = this.f3663s;
        int i7 = this.f3661q;
        final long j7 = this.f3662r;
        synchronized (v02) {
            final int i8 = i7 - 1;
            final C1251o c5 = ((k) v02.f11962c).c(3 - i8);
            final C1251o b7 = ((e) v02.d).b();
            m3.g.H(c5, b7).e((ScheduledExecutorService) v02.f, new InterfaceC1237a() { // from class: V4.a
                @Override // t3.InterfaceC1237a
                public final Object d(C1251o c1251o) {
                    JSONObject jSONObject;
                    String str;
                    String str2;
                    V0 v03 = V0.this;
                    C1251o c1251o2 = c5;
                    C1251o c1251o3 = b7;
                    long j8 = j7;
                    int i9 = i8;
                    v03.getClass();
                    if (!c1251o2.i()) {
                        return m3.g.l(new h4.h("Failed to auto-fetch config update.", c1251o2.f()));
                    }
                    if (!c1251o3.i()) {
                        return m3.g.l(new h4.h("Failed to get activated config for auto-fetch", c1251o3.f()));
                    }
                    j jVar = (j) c1251o2.g();
                    g gVar = (g) c1251o3.g();
                    g gVar2 = jVar.f3692b;
                    boolean z7 = false;
                    if (gVar2 == null ? jVar.f3691a == 1 : gVar2.f >= j8) {
                        z7 = true;
                    }
                    if (!Boolean.valueOf(z7).booleanValue()) {
                        Log.d("FirebaseRemoteConfig", "Fetched template version is the same as SDK's current version. Retrying fetch.");
                        v03.a(j8, i9);
                    } else {
                        if (jVar.f3692b == null) {
                            str = "FirebaseRemoteConfig";
                            str2 = "The fetch succeeded, but the backend had no updates.";
                        } else {
                            if (gVar == null) {
                                f c6 = g.c();
                                gVar = new g(c6.f3673a, c6.f3674b, c6.f3675c, c6.d, c6.f3676e, c6.f);
                            }
                            g gVar3 = jVar.f3692b;
                            g a7 = g.a(new JSONObject(gVar3.f3678a.toString()));
                            HashMap b8 = gVar.b();
                            HashMap b9 = gVar3.b();
                            HashSet hashSet = new HashSet();
                            JSONObject jSONObject2 = gVar.f3679b;
                            Iterator<String> keys = jSONObject2.keys();
                            while (true) {
                                boolean hasNext = keys.hasNext();
                                jSONObject = a7.f3679b;
                                if (!hasNext) {
                                    break;
                                }
                                String next = keys.next();
                                JSONObject jSONObject3 = gVar3.f3679b;
                                if (jSONObject3.has(next) && jSONObject2.get(next).equals(jSONObject3.get(next))) {
                                    JSONObject jSONObject4 = gVar.f3681e;
                                    boolean has = jSONObject4.has(next);
                                    JSONObject jSONObject5 = gVar3.f3681e;
                                    if ((!has || jSONObject5.has(next)) && ((jSONObject4.has(next) || !jSONObject5.has(next)) && ((!jSONObject4.has(next) || !jSONObject5.has(next) || jSONObject4.getJSONObject(next).toString().equals(jSONObject5.getJSONObject(next).toString())) && b8.containsKey(next) == b9.containsKey(next) && (!b8.containsKey(next) || !b9.containsKey(next) || ((Map) b8.get(next)).equals(b9.get(next)))))) {
                                        jSONObject.remove(next);
                                    }
                                }
                                hashSet.add(next);
                            }
                            Iterator<String> keys2 = jSONObject.keys();
                            while (keys2.hasNext()) {
                                hashSet.add(keys2.next());
                            }
                            if (hashSet.isEmpty()) {
                                str = "FirebaseRemoteConfig";
                                str2 = "Config was fetched, but no params changed.";
                            } else {
                                U4.a aVar = new U4.a(hashSet);
                                synchronized (v03) {
                                    for (U4.b bVar : (Set) v03.f11960a) {
                                        bVar.a(aVar);
                                    }
                                }
                            }
                        }
                        Log.d(str, str2);
                    }
                    return m3.g.m(null);
                }
            });
        }
    }
}
