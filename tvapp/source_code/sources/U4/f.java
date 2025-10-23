package U4;

import com.google.android.gms.internal.measurement.K1;
import i4.C0774c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONArray;
import org.json.JSONObject;
import t3.C1251o;
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final C0774c f3451a;

    /* renamed from: b  reason: collision with root package name */
    public final Executor f3452b;

    /* renamed from: c  reason: collision with root package name */
    public final V4.e f3453c;
    public final V4.e d;

    /* renamed from: e  reason: collision with root package name */
    public final V4.k f3454e;
    public final V4.l f;

    /* renamed from: g  reason: collision with root package name */
    public final V4.n f3455g;

    /* renamed from: h  reason: collision with root package name */
    public final K1 f3456h;

    /* renamed from: i  reason: collision with root package name */
    public final C4.b f3457i;

    public f(C0774c c0774c, ScheduledExecutorService scheduledExecutorService, V4.e eVar, V4.e eVar2, V4.e eVar3, V4.k kVar, V4.l lVar, V4.n nVar, K1 k12, C4.b bVar) {
        this.f3451a = c0774c;
        this.f3452b = scheduledExecutorService;
        this.f3453c = eVar;
        this.d = eVar2;
        this.f3454e = kVar;
        this.f = lVar;
        this.f3455g = nVar;
        this.f3456h = k12;
        this.f3457i = bVar;
    }

    public static ArrayList d(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < jSONArray.length(); i7++) {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i7);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
            arrayList.add(hashMap);
        }
        return arrayList;
    }

    public final C1251o a() {
        V4.k kVar = this.f3454e;
        V4.n nVar = kVar.f3700g;
        nVar.getClass();
        long j7 = nVar.f3708a.getLong("minimum_fetch_interval_in_seconds", V4.k.f3694i);
        HashMap hashMap = new HashMap(kVar.f3701h);
        hashMap.put("X-Firebase-RC-Fetch-Type", "BASE/1");
        return kVar.f3699e.b().e(kVar.f3698c, new V4.h(kVar, j7, hashMap)).j(p4.i.f13160q, new A4.a(18)).j(this.f3452b, new d(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String b(java.lang.String r10) {
        /*
            r9 = this;
            V4.l r0 = r9.f
            V4.e r1 = r0.f3704c
            V4.g r1 = r1.c()
            r2 = 0
            if (r1 != 0) goto Ld
        Lb:
            r1 = r2
            goto L13
        Ld:
            org.json.JSONObject r1 = r1.f3679b     // Catch: org.json.JSONException -> Lb
            java.lang.String r1 = r1.getString(r10)     // Catch: org.json.JSONException -> Lb
        L13:
            if (r1 == 0) goto L45
            V4.e r2 = r0.f3704c
            V4.g r2 = r2.c()
            if (r2 != 0) goto L1e
            goto L72
        L1e:
            java.util.HashSet r3 = r0.f3702a
            monitor-enter(r3)
            java.util.HashSet r4 = r0.f3702a     // Catch: java.lang.Throwable -> L3f
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L3f
        L27:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L3f
            if (r5 == 0) goto L41
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L3f
            U4.m r5 = (U4.m) r5     // Catch: java.lang.Throwable -> L3f
            java.util.concurrent.Executor r6 = r0.f3703b     // Catch: java.lang.Throwable -> L3f
            H2.E r7 = new H2.E     // Catch: java.lang.Throwable -> L3f
            r8 = 1
            r7.<init>(r5, r10, r2, r8)     // Catch: java.lang.Throwable -> L3f
            r6.execute(r7)     // Catch: java.lang.Throwable -> L3f
            goto L27
        L3f:
            r10 = move-exception
            goto L43
        L41:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3f
            goto L72
        L43:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3f
            throw r10
        L45:
            V4.e r0 = r0.d
            V4.g r0 = r0.c()
            if (r0 != 0) goto L4e
            goto L54
        L4e:
            org.json.JSONObject r0 = r0.f3679b     // Catch: org.json.JSONException -> L54
            java.lang.String r2 = r0.getString(r10)     // Catch: org.json.JSONException -> L54
        L54:
            if (r2 == 0) goto L58
            r1 = r2
            goto L72
        L58:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "No value of type 'String' exists for parameter key '"
            r0.<init>(r1)
            r0.append(r10)
            java.lang.String r10 = "'."
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            java.lang.String r0 = "FirebaseRemoteConfig"
            android.util.Log.w(r0, r10)
            java.lang.String r1 = ""
        L72:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: U4.f.b(java.lang.String):java.lang.String");
    }

    public final void c(boolean z7) {
        K1 k12 = this.f3456h;
        synchronized (k12) {
            ((V4.p) k12.f8368s).f3717e = z7;
            if (!z7) {
                k12.q();
            }
        }
    }
}
