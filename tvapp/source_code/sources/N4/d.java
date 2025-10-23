package N4;

import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import com.google.android.gms.internal.measurement.K1;
import g3.n;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
import t3.C1244h;
import t3.C1251o;
/* loaded from: classes.dex */
public final class d implements e {

    /* renamed from: m  reason: collision with root package name */
    public static final Object f2524m = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final h4.f f2525a;

    /* renamed from: b  reason: collision with root package name */
    public final P4.c f2526b;

    /* renamed from: c  reason: collision with root package name */
    public final K1 f2527c;
    public final k d;

    /* renamed from: e  reason: collision with root package name */
    public final o4.k f2528e;
    public final i f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f2529g;

    /* renamed from: h  reason: collision with root package name */
    public final ExecutorService f2530h;

    /* renamed from: i  reason: collision with root package name */
    public final Executor f2531i;

    /* renamed from: j  reason: collision with root package name */
    public String f2532j;

    /* renamed from: k  reason: collision with root package name */
    public final HashSet f2533k;

    /* renamed from: l  reason: collision with root package name */
    public final ArrayList f2534l;

    static {
        new AtomicInteger(1);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [N4.i, java.lang.Object] */
    public d(h4.f fVar, M4.b bVar, ExecutorService executorService, p4.j jVar) {
        fVar.a();
        P4.c cVar = new P4.c(fVar.f10987a, bVar);
        K1 k12 = new K1(fVar);
        if (J3.e.f1329r == null) {
            J3.e.f1329r = new J3.e(8);
        }
        J3.e eVar = J3.e.f1329r;
        if (k.d == null) {
            k.d = new k(eVar);
        }
        k kVar = k.d;
        o4.k kVar2 = new o4.k(new b(0, fVar));
        ?? obj = new Object();
        this.f2529g = new Object();
        this.f2533k = new HashSet();
        this.f2534l = new ArrayList();
        this.f2525a = fVar;
        this.f2526b = cVar;
        this.f2527c = k12;
        this.d = kVar;
        this.f2528e = kVar2;
        this.f = obj;
        this.f2530h = executorService;
        this.f2531i = jVar;
    }

    public static d e() {
        return (d) h4.f.c().b(e.class);
    }

    public final void a(j jVar) {
        synchronized (this.f2529g) {
            this.f2534l.add(jVar);
        }
    }

    public final void b(boolean z7) {
        O4.b I6;
        synchronized (f2524m) {
            try {
                h4.f fVar = this.f2525a;
                fVar.a();
                K1 m7 = K1.m(fVar.f10987a);
                I6 = this.f2527c.I();
                int i7 = I6.f2724b;
                if (i7 == 2 || i7 == 1) {
                    String i8 = i(I6);
                    K1 k12 = this.f2527c;
                    O4.a a7 = I6.a();
                    a7.f2718b = i8;
                    a7.k(3);
                    I6 = a7.i();
                    k12.D(I6);
                }
                if (m7 != null) {
                    m7.L();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z7) {
            O4.a a8 = I6.a();
            a8.f2719c = null;
            I6 = a8.i();
        }
        l(I6);
        this.f2531i.execute(new c(this, z7, 1));
    }

    public final O4.b c(O4.b bVar) {
        int responseCode;
        boolean z7;
        P4.b f;
        C.d a7;
        h4.f fVar = this.f2525a;
        fVar.a();
        String str = fVar.f10989c.f11000a;
        fVar.a();
        String str2 = fVar.f10989c.f11004g;
        String str3 = bVar.d;
        P4.c cVar = this.f2526b;
        P4.d dVar = cVar.f2808c;
        if (dVar.b()) {
            URL a8 = P4.c.a("projects/" + str2 + "/installations/" + bVar.f2723a + "/authTokens:generate");
            for (int i7 = 0; i7 <= 1; i7++) {
                TrafficStats.setThreadStatsTag(32771);
                HttpURLConnection c5 = cVar.c(a8, str);
                try {
                    c5.setRequestMethod("POST");
                    c5.addRequestProperty("Authorization", "FIS_v2 " + str3);
                    c5.setDoOutput(true);
                    P4.c.h(c5);
                    responseCode = c5.getResponseCode();
                    dVar.d(responseCode);
                    if (responseCode >= 200 && responseCode < 300) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                } catch (IOException | AssertionError unused) {
                } catch (Throwable th) {
                    c5.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
                if (z7) {
                    f = P4.c.f(c5);
                } else {
                    P4.c.b(c5, null, str, str2);
                    if (responseCode != 401 && responseCode != 404) {
                        if (responseCode != 429) {
                            if (responseCode < 500 || responseCode >= 600) {
                                Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                                a7 = P4.b.a();
                                a7.f324r = 2;
                            }
                            c5.disconnect();
                            TrafficStats.clearThreadStatsTag();
                        } else {
                            throw new h4.h("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                        }
                    } else {
                        a7 = P4.b.a();
                        a7.f324r = 3;
                    }
                    f = a7.b();
                }
                c5.disconnect();
                TrafficStats.clearThreadStatsTag();
                int b7 = s.h.b(f.f2804c);
                if (b7 != 0) {
                    if (b7 != 1) {
                        if (b7 == 2) {
                            m(null);
                            O4.a a9 = bVar.a();
                            a9.k(2);
                            return a9.i();
                        }
                        throw new h4.h("Firebase Installations Service is unavailable. Please try again later.");
                    }
                    O4.a a10 = bVar.a();
                    a10.f2720e = "BAD CONFIG";
                    a10.k(5);
                    return a10.i();
                }
                k kVar = this.d;
                kVar.getClass();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                kVar.f2542a.getClass();
                long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                O4.a a11 = bVar.a();
                a11.f2719c = f.f2802a;
                a11.f = Long.valueOf(f.f2803b);
                a11.f2721g = Long.valueOf(seconds);
                return a11.i();
            }
            throw new h4.h("Firebase Installations Service is unavailable. Please try again later.");
        }
        throw new h4.h("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final C1251o d() {
        String str;
        h();
        synchronized (this) {
            str = this.f2532j;
        }
        if (str != null) {
            return m3.g.m(str);
        }
        C1244h c1244h = new C1244h();
        a(new h(c1244h));
        C1251o c1251o = c1244h.f14573a;
        this.f2530h.execute(new E1.b(2, this));
        return c1251o;
    }

    public final C1251o f() {
        h();
        C1244h c1244h = new C1244h();
        a(new g(this.d, c1244h));
        this.f2530h.execute(new c(this));
        return c1244h.f14573a;
    }

    public final void g(O4.b bVar) {
        synchronized (f2524m) {
            try {
                h4.f fVar = this.f2525a;
                fVar.a();
                K1 m7 = K1.m(fVar.f10987a);
                this.f2527c.D(bVar);
                if (m7 != null) {
                    m7.L();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h() {
        h4.f fVar = this.f2525a;
        fVar.a();
        n.d(fVar.f10989c.f11001b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        fVar.a();
        n.d(fVar.f10989c.f11004g, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        fVar.a();
        n.d(fVar.f10989c.f11000a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        fVar.a();
        String str = fVar.f10989c.f11001b;
        Pattern pattern = k.f2541c;
        if (str.contains(":")) {
            fVar.a();
            if (k.f2541c.matcher(fVar.f10989c.f11000a).matches()) {
                return;
            }
            throw new IllegalArgumentException("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        }
        throw new IllegalArgumentException("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
        if ("[DEFAULT]".equals(r0.f10988b) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String i(O4.b r3) {
        /*
            r2 = this;
            h4.f r0 = r2.f2525a
            r0.a()
            java.lang.String r0 = r0.f10988b
            java.lang.String r1 = "CHIME_ANDROID_SDK"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1e
            h4.f r0 = r2.f2525a
            r0.a()
            java.lang.String r1 = "[DEFAULT]"
            java.lang.String r0 = r0.f10988b
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L4f
        L1e:
            r0 = 1
            int r3 = r3.f2724b
            if (r3 != r0) goto L4f
            o4.k r3 = r2.f2528e
            java.lang.Object r3 = r3.get()
            O4.c r3 = (O4.c) r3
            android.content.SharedPreferences r0 = r3.f2729a
            monitor-enter(r0)
            java.lang.String r1 = r3.a()     // Catch: java.lang.Throwable -> L36
            if (r1 == 0) goto L38
        L34:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
            goto L3d
        L36:
            r3 = move-exception
            goto L4d
        L38:
            java.lang.String r1 = r3.b()     // Catch: java.lang.Throwable -> L36
            goto L34
        L3d:
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 == 0) goto L4c
            N4.i r3 = r2.f
            r3.getClass()
            java.lang.String r1 = N4.i.a()
        L4c:
            return r1
        L4d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
            throw r3
        L4f:
            N4.i r3 = r2.f
            r3.getClass()
            java.lang.String r3 = N4.i.a()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: N4.d.i(O4.b):java.lang.String");
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [P4.c] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [P4.a] */
    public final O4.b j(O4.b bVar) {
        int responseCode;
        String str = bVar.f2723a;
        int i7 = 0;
        String str2 = null;
        if (str != null && str.length() == 11) {
            O4.c cVar = (O4.c) this.f2528e.get();
            synchronized (cVar.f2729a) {
                try {
                    String[] strArr = O4.c.f2728c;
                    int i8 = 0;
                    while (true) {
                        if (i8 >= 4) {
                            break;
                        }
                        String str3 = strArr[i8];
                        String string = cVar.f2729a.getString("|T|" + cVar.f2730b + "|" + str3, null);
                        if (string != null && !string.isEmpty()) {
                            if (string.startsWith("{")) {
                                try {
                                    str2 = new JSONObject(string).getString("token");
                                } catch (JSONException unused) {
                                }
                            } else {
                                str2 = string;
                            }
                        } else {
                            i8++;
                        }
                    }
                } finally {
                }
            }
        }
        P4.c cVar2 = this.f2526b;
        h4.f fVar = this.f2525a;
        fVar.a();
        String str4 = fVar.f10989c.f11000a;
        String str5 = bVar.f2723a;
        h4.f fVar2 = this.f2525a;
        fVar2.a();
        String str6 = fVar2.f10989c.f11004g;
        h4.f fVar3 = this.f2525a;
        fVar3.a();
        String str7 = fVar3.f10989c.f11001b;
        P4.d dVar = cVar2.f2808c;
        if (dVar.b()) {
            URL a7 = P4.c.a("projects/" + str6 + "/installations");
            P4.a aVar = cVar2;
            while (i7 <= 1) {
                TrafficStats.setThreadStatsTag(32769);
                HttpURLConnection c5 = aVar.c(a7, str4);
                try {
                    try {
                        c5.setRequestMethod("POST");
                        c5.setDoOutput(true);
                        if (str2 != null) {
                            c5.addRequestProperty("x-goog-fis-android-iid-migration-auth", str2);
                        }
                        P4.c.g(c5, str5, str7);
                        responseCode = c5.getResponseCode();
                        dVar.d(responseCode);
                    } finally {
                        c5.disconnect();
                        TrafficStats.clearThreadStatsTag();
                    }
                } catch (IOException | AssertionError unused2) {
                }
                if (responseCode >= 200 && responseCode < 300) {
                    P4.a e3 = P4.c.e(c5);
                    c5.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    aVar = e3;
                } else {
                    try {
                        P4.c.b(c5, str7, str4, str6);
                    } catch (IOException | AssertionError unused3) {
                        c5.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        i7++;
                        aVar = aVar;
                    }
                    if (responseCode != 429) {
                        if (responseCode >= 500 && responseCode < 600) {
                            c5.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            i7++;
                            aVar = aVar;
                        } else {
                            Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                            P4.a aVar2 = new P4.a(null, null, null, null, 2);
                            c5.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            aVar = aVar2;
                        }
                    } else {
                        throw new h4.h("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                        break;
                    }
                }
                int b7 = s.h.b(aVar.f2801e);
                if (b7 != 0) {
                    if (b7 == 1) {
                        O4.a a8 = bVar.a();
                        a8.f2720e = "BAD CONFIG";
                        a8.k(5);
                        return a8.i();
                    }
                    throw new h4.h("Firebase Installations Service is unavailable. Please try again later.");
                }
                String str8 = aVar.f2799b;
                String str9 = aVar.f2800c;
                k kVar = this.d;
                kVar.getClass();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                kVar.f2542a.getClass();
                long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                P4.b bVar2 = aVar.d;
                String str10 = bVar2.f2802a;
                long j7 = bVar2.f2803b;
                O4.a a9 = bVar.a();
                a9.f2718b = str8;
                a9.k(4);
                a9.f2719c = str10;
                a9.d = str9;
                a9.f = Long.valueOf(j7);
                a9.f2721g = Long.valueOf(seconds);
                return a9.i();
            }
            throw new h4.h("Firebase Installations Service is unavailable. Please try again later.");
        }
        throw new h4.h("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final void k(Exception exc) {
        synchronized (this.f2529g) {
            try {
                Iterator it = this.f2534l.iterator();
                while (it.hasNext()) {
                    if (((j) it.next()).b(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l(O4.b bVar) {
        synchronized (this.f2529g) {
            try {
                Iterator it = this.f2534l.iterator();
                while (it.hasNext()) {
                    if (((j) it.next()).a(bVar)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void m(String str) {
        this.f2532j = str;
    }

    public final synchronized void n(O4.b bVar, O4.b bVar2) {
        if (this.f2533k.size() != 0 && !TextUtils.equals(bVar.f2723a, bVar2.f2723a)) {
            Iterator it = this.f2533k.iterator();
            if (it.hasNext()) {
                AbstractC0515y1.v(it.next());
                throw null;
            }
        }
    }
}
