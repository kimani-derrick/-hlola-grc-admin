package u4;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.regex.Pattern;
/* renamed from: u4.A  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1273A implements InterfaceC1274B {

    /* renamed from: g  reason: collision with root package name */
    public static final Pattern f14970g = Pattern.compile("[^\\p{Alnum}]");

    /* renamed from: h  reason: collision with root package name */
    public static final String f14971h = Pattern.quote("/");

    /* renamed from: a  reason: collision with root package name */
    public final B0.d f14972a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f14973b;

    /* renamed from: c  reason: collision with root package name */
    public final String f14974c;
    public final N4.e d;

    /* renamed from: e  reason: collision with root package name */
    public final v f14975e;
    public C1279c f;

    public C1273A(Context context, String str, N4.e eVar, v vVar) {
        if (str != null) {
            this.f14973b = context;
            this.f14974c = str;
            this.d = eVar;
            this.f14975e = vVar;
            this.f14972a = new B0.d(9);
            return;
        }
        throw new IllegalArgumentException("appIdentifier must not be null");
    }

    public final synchronized String a(SharedPreferences sharedPreferences, String str) {
        String lowerCase;
        lowerCase = f14970g.matcher(UUID.randomUUID().toString()).replaceAll("").toLowerCase(Locale.US);
        String str2 = "Created new Crashlytics installation ID: " + lowerCase + " for FID: " + str;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str2, null);
        }
        sharedPreferences.edit().putString("crashlytics.installation.id", lowerCase).putString("firebase.installation.id", str).apply();
        return lowerCase;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(7:13|14|4|5|6|7|8)|3|4|5|6|7|8) */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
        android.util.Log.w("FirebaseCrashlytics", "Error getting Firebase installation id.", r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final u4.z b(boolean r5) {
        /*
            r4 = this;
            java.lang.String r0 = "FirebaseCrashlytics"
            N4.e r1 = r4.d
            r2 = 0
            if (r5 == 0) goto L1d
            r5 = r1
            N4.d r5 = (N4.d) r5     // Catch: java.lang.Exception -> L17
            t3.o r5 = r5.f()     // Catch: java.lang.Exception -> L17
            java.lang.Object r5 = u4.AbstractC1276D.a(r5)     // Catch: java.lang.Exception -> L17
            N4.a r5 = (N4.a) r5     // Catch: java.lang.Exception -> L17
            java.lang.String r5 = r5.f2516a     // Catch: java.lang.Exception -> L17
            goto L1e
        L17:
            r5 = move-exception
            java.lang.String r3 = "Error getting Firebase authentication token."
            android.util.Log.w(r0, r3, r5)
        L1d:
            r5 = r2
        L1e:
            N4.d r1 = (N4.d) r1     // Catch: java.lang.Exception -> L2c
            t3.o r1 = r1.d()     // Catch: java.lang.Exception -> L2c
            java.lang.Object r1 = u4.AbstractC1276D.a(r1)     // Catch: java.lang.Exception -> L2c
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L2c
            r2 = r1
            goto L32
        L2c:
            r1 = move-exception
            java.lang.String r3 = "Error getting Firebase installation id."
            android.util.Log.w(r0, r3, r1)
        L32:
            u4.z r0 = new u4.z
            r0.<init>(r2, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: u4.C1273A.b(boolean):u4.z");
    }

    public final synchronized C1279c c() {
        C1279c c1279c;
        C1279c c1279c2;
        String str;
        C1279c c1279c3 = this.f;
        if (c1279c3 != null && (c1279c3.f14989b != null || !this.f14975e.c())) {
            return this.f;
        }
        r4.c cVar = r4.c.f13480a;
        cVar.e("Determining Crashlytics installation ID...");
        SharedPreferences sharedPreferences = this.f14973b.getSharedPreferences("com.google.firebase.crashlytics", 0);
        String string = sharedPreferences.getString("firebase.installation.id", null);
        cVar.e("Cached Firebase Installation ID: " + string);
        if (this.f14975e.c()) {
            z b7 = b(false);
            cVar.e("Fetched Firebase Installation ID: " + b7.f15071a);
            if (b7.f15071a == null) {
                if (string == null) {
                    str = "SYN_" + UUID.randomUUID().toString();
                } else {
                    str = string;
                }
                b7 = new z(str, null);
            }
            if (Objects.equals(b7.f15071a, string)) {
                c1279c2 = new C1279c(sharedPreferences.getString("crashlytics.installation.id", null), b7.f15071a, b7.f15072b);
            } else {
                c1279c2 = new C1279c(a(sharedPreferences, b7.f15071a), b7.f15071a, b7.f15072b);
            }
            this.f = c1279c2;
        } else {
            if (string != null && string.startsWith("SYN_")) {
                c1279c = new C1279c(sharedPreferences.getString("crashlytics.installation.id", null), null, null);
            } else {
                c1279c = new C1279c(a(sharedPreferences, "SYN_" + UUID.randomUUID().toString()), null, null);
            }
            this.f = c1279c;
        }
        cVar.e("Install IDs: " + this.f);
        return this.f;
    }

    public final String d() {
        String str;
        B0.d dVar = this.f14972a;
        Context context = this.f14973b;
        synchronized (dVar) {
            try {
                if (dVar.f149r == null) {
                    String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    if (installerPackageName == null) {
                        installerPackageName = "";
                    }
                    dVar.f149r = installerPackageName;
                }
                if ("".equals(dVar.f149r)) {
                    str = null;
                } else {
                    str = dVar.f149r;
                }
            } finally {
            }
        }
        return str;
    }
}
