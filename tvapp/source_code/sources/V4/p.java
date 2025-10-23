package V4;

import android.content.Context;
import j3.C0837a;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k.V0;
/* loaded from: classes.dex */
public final class p {

    /* renamed from: p  reason: collision with root package name */
    public static final int[] f3712p = {2, 4, 8, 16, 32, 64, 128, 256};

    /* renamed from: q  reason: collision with root package name */
    public static final Pattern f3713q = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* renamed from: a  reason: collision with root package name */
    public final Set f3714a;

    /* renamed from: c  reason: collision with root package name */
    public int f3716c;
    public final ScheduledExecutorService f;

    /* renamed from: g  reason: collision with root package name */
    public final k f3718g;

    /* renamed from: h  reason: collision with root package name */
    public final h4.f f3719h;

    /* renamed from: i  reason: collision with root package name */
    public final N4.e f3720i;

    /* renamed from: j  reason: collision with root package name */
    public final e f3721j;

    /* renamed from: k  reason: collision with root package name */
    public final Context f3722k;

    /* renamed from: o  reason: collision with root package name */
    public final n f3725o;

    /* renamed from: b  reason: collision with root package name */
    public boolean f3715b = false;

    /* renamed from: m  reason: collision with root package name */
    public final Random f3724m = new Random();
    public final C0837a n = C0837a.f11847a;

    /* renamed from: l  reason: collision with root package name */
    public final String f3723l = "firebase";
    public boolean d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f3717e = false;

    public p(h4.f fVar, N4.e eVar, k kVar, e eVar2, Context context, LinkedHashSet linkedHashSet, n nVar, ScheduledExecutorService scheduledExecutorService) {
        this.f3714a = linkedHashSet;
        this.f = scheduledExecutorService;
        this.f3716c = Math.max(8 - nVar.b().f3705a, 1);
        this.f3719h = fVar;
        this.f3718g = kVar;
        this.f3720i = eVar;
        this.f3721j = eVar2;
        this.f3722k = context;
        this.f3725o = nVar;
    }

    public static void b(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            try {
                httpURLConnection.getInputStream().close();
                if (httpURLConnection.getErrorStream() != null) {
                    httpURLConnection.getErrorStream().close();
                }
            } catch (IOException unused) {
            }
        }
    }

    public static boolean d(int i7) {
        if (i7 != 408 && i7 != 429 && i7 != 502 && i7 != 503 && i7 != 504) {
            return false;
        }
        return true;
    }

    public static String f(InputStream inputStream) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
            }
        } catch (IOException unused) {
            if (sb.length() == 0) {
                return "Unable to connect to the server, access is forbidden. HTTP status code: 403";
            }
        }
        return sb.toString();
    }

    public final synchronized boolean a() {
        boolean z7;
        if (!this.f3714a.isEmpty() && !this.f3715b && !this.d) {
            if (!this.f3717e) {
                z7 = true;
            }
        }
        z7 = false;
        return z7;
    }

    public final String c(String str) {
        String str2;
        h4.f fVar = this.f3719h;
        fVar.a();
        Matcher matcher = f3713q.matcher(fVar.f10989c.f11001b);
        if (matcher.matches()) {
            str2 = matcher.group(1);
        } else {
            str2 = null;
        }
        return "https://firebaseremoteconfigrealtime.googleapis.com/v1/projects/" + str2 + "/namespaces/" + str + ":streamFetchInvalidations";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [h4.h, U4.h] */
    public final synchronized void e(long j7) {
        try {
            if (!a()) {
                return;
            }
            int i7 = this.f3716c;
            if (i7 > 0) {
                this.f3716c = i7 - 1;
                this.f.schedule(new P.b(2, this), j7, TimeUnit.MILLISECONDS);
            } else if (!this.f3717e) {
                g(new h4.h("Unable to connect to the server. Check your connection and try again."));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void g(U4.h hVar) {
        for (U4.b bVar : this.f3714a) {
            bVar.b(hVar);
        }
    }

    public final synchronized void h() {
        this.n.getClass();
        e(Math.max(0L, this.f3725o.b().f3706b.getTime() - new Date(System.currentTimeMillis()).getTime()));
    }

    public final synchronized void i(boolean z7) {
        this.f3715b = z7;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(java.net.HttpURLConnection r7, java.lang.String r8, java.lang.String r9) {
        /*
            r6 = this;
            java.lang.String r0 = "POST"
            r7.setRequestMethod(r0)
            java.lang.String r0 = "X-Goog-Firebase-Installations-Auth"
            r7.setRequestProperty(r0, r9)
            h4.f r9 = r6.f3719h
            r9.a()
            h4.i r0 = r9.f10989c
            java.lang.String r1 = r0.f11000a
            java.lang.String r2 = "X-Goog-Api-Key"
            r7.setRequestProperty(r2, r1)
            android.content.Context r1 = r6.f3722k
            java.lang.String r2 = r1.getPackageName()
            java.lang.String r3 = "X-Android-Package"
            r7.setRequestProperty(r3, r2)
            java.lang.String r2 = "FirebaseRemoteConfig"
            java.lang.String r3 = "Could not get fingerprint hash for package: "
            r4 = 0
            java.lang.String r5 = r1.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
            byte[] r5 = j3.AbstractC0838b.c(r1, r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
            if (r5 != 0) goto L47
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
            r5.<init>(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
            java.lang.String r3 = r1.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
            r5.append(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
            java.lang.String r3 = r5.toString()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
            android.util.Log.e(r2, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
        L45:
            r1 = r4
            goto L62
        L47:
            java.lang.String r1 = j3.AbstractC0838b.a(r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
            goto L62
        L4c:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "No such package: "
            r3.<init>(r5)
            java.lang.String r1 = r1.getPackageName()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            android.util.Log.i(r2, r1)
            goto L45
        L62:
            java.lang.String r2 = "X-Android-Cert"
            r7.setRequestProperty(r2, r1)
            java.lang.String r1 = "X-Google-GFE-Can-Retry"
            java.lang.String r2 = "yes"
            r7.setRequestProperty(r1, r2)
            java.lang.String r1 = "X-Accept-Response-Streaming"
            java.lang.String r2 = "true"
            r7.setRequestProperty(r1, r2)
            java.lang.String r1 = "Content-Type"
            java.lang.String r2 = "application/json"
            r7.setRequestProperty(r1, r2)
            java.lang.String r1 = "Accept"
            r7.setRequestProperty(r1, r2)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r9.a()
            java.lang.String r2 = r0.f11001b
            java.util.regex.Pattern r3 = V4.p.f3713q
            java.util.regex.Matcher r2 = r3.matcher(r2)
            boolean r3 = r2.matches()
            if (r3 == 0) goto L9c
            r3 = 1
            java.lang.String r4 = r2.group(r3)
        L9c:
            java.lang.String r2 = "project"
            r1.put(r2, r4)
            java.lang.String r2 = "namespace"
            java.lang.String r3 = r6.f3723l
            r1.put(r2, r3)
            V4.k r2 = r6.f3718g
            V4.n r2 = r2.f3700g
            android.content.SharedPreferences r2 = r2.f3708a
            java.lang.String r3 = "last_template_version"
            r4 = 0
            long r2 = r2.getLong(r3, r4)
            java.lang.String r2 = java.lang.Long.toString(r2)
            java.lang.String r3 = "lastKnownVersionNumber"
            r1.put(r3, r2)
            r9.a()
            java.lang.String r9 = "appId"
            java.lang.String r0 = r0.f11001b
            r1.put(r9, r0)
            java.lang.String r9 = "sdkVersion"
            java.lang.String r0 = "22.0.0"
            r1.put(r9, r0)
            java.lang.String r9 = "appInstanceId"
            r1.put(r9, r8)
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>(r1)
            java.lang.String r8 = r8.toString()
            java.lang.String r9 = "utf-8"
            byte[] r8 = r8.getBytes(r9)
            java.io.BufferedOutputStream r9 = new java.io.BufferedOutputStream
            java.io.OutputStream r7 = r7.getOutputStream()
            r9.<init>(r7)
            r9.write(r8)
            r9.flush()
            r9.close()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: V4.p.j(java.net.HttpURLConnection, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, k.V0] */
    public final synchronized V0 k(HttpURLConnection httpURLConnection) {
        ?? obj;
        o oVar = new o(this);
        k kVar = this.f3718g;
        e eVar = this.f3721j;
        Set set = this.f3714a;
        ScheduledExecutorService scheduledExecutorService = this.f;
        obj = new Object();
        obj.f11961b = httpURLConnection;
        obj.f11962c = kVar;
        obj.d = eVar;
        obj.f11960a = set;
        obj.f11963e = oVar;
        obj.f = scheduledExecutorService;
        obj.f11964g = new Random();
        return obj;
    }

    public final void l(Date date) {
        n nVar = this.f3725o;
        int i7 = nVar.b().f3705a + 1;
        int i8 = 8;
        if (i7 < 8) {
            i8 = i7;
        }
        long millis = TimeUnit.MINUTES.toMillis(f3712p[i8 - 1]);
        nVar.e(i7, new Date(date.getTime() + (millis / 2) + this.f3724m.nextInt((int) millis)));
    }
}
