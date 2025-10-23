package v4;

import android.util.Log;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* renamed from: v4.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1326d {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f15328a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final int f15329b = 64;

    /* renamed from: c  reason: collision with root package name */
    public final int f15330c;

    public C1326d(int i7) {
        this.f15330c = i7;
    }

    public static String b(String str, int i7) {
        if (str != null) {
            String trim = str.trim();
            if (trim.length() > i7) {
                return trim.substring(0, i7);
            }
            return trim;
        }
        return str;
    }

    public final synchronized Map a() {
        return Collections.unmodifiableMap(new HashMap(this.f15328a));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
        if (r0.equals(r6) != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean c(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r0 = "Ignored entry \"com.crashlytics.version-control-info\" when adding custom keys. Maximum allowable: "
            java.lang.String r1 = "com.crashlytics.version-control-info"
            monitor-enter(r5)
            int r2 = r5.f15330c     // Catch: java.lang.Throwable -> L35
            java.lang.String r1 = b(r1, r2)     // Catch: java.lang.Throwable -> L35
            java.util.HashMap r2 = r5.f15328a     // Catch: java.lang.Throwable -> L35
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L35
            int r3 = r5.f15329b     // Catch: java.lang.Throwable -> L35
            r4 = 0
            if (r2 < r3) goto L37
            java.util.HashMap r2 = r5.f15328a     // Catch: java.lang.Throwable -> L35
            boolean r2 = r2.containsKey(r1)     // Catch: java.lang.Throwable -> L35
            if (r2 == 0) goto L1f
            goto L37
        L1f:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L35
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L35
            int r0 = r5.f15329b     // Catch: java.lang.Throwable -> L35
            r6.append(r0)     // Catch: java.lang.Throwable -> L35
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L35
            java.lang.String r0 = "FirebaseCrashlytics"
            r1 = 0
            android.util.Log.w(r0, r6, r1)     // Catch: java.lang.Throwable -> L35
            monitor-exit(r5)
            return r4
        L35:
            r6 = move-exception
            goto L5a
        L37:
            int r0 = r5.f15330c     // Catch: java.lang.Throwable -> L35
            java.lang.String r6 = b(r6, r0)     // Catch: java.lang.Throwable -> L35
            java.util.HashMap r0 = r5.f15328a     // Catch: java.lang.Throwable -> L35
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L35
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L35
            if (r0 != 0) goto L4a
            if (r6 != 0) goto L52
            goto L50
        L4a:
            boolean r0 = r0.equals(r6)     // Catch: java.lang.Throwable -> L35
            if (r0 == 0) goto L52
        L50:
            monitor-exit(r5)
            return r4
        L52:
            java.util.HashMap r0 = r5.f15328a     // Catch: java.lang.Throwable -> L35
            r0.put(r1, r6)     // Catch: java.lang.Throwable -> L35
            monitor-exit(r5)
            r6 = 1
            return r6
        L5a:
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: v4.C1326d.c(java.lang.String):boolean");
    }

    public final synchronized void d(Map map) {
        String b7;
        try {
            int i7 = 0;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str != null) {
                    String b8 = b(str, this.f15330c);
                    if (this.f15328a.size() >= this.f15329b && !this.f15328a.containsKey(b8)) {
                        i7++;
                    }
                    String str2 = (String) entry.getValue();
                    HashMap hashMap = this.f15328a;
                    if (str2 == null) {
                        b7 = "";
                    } else {
                        b7 = b(str2, this.f15330c);
                    }
                    hashMap.put(b8, b7);
                } else {
                    throw new IllegalArgumentException("Custom attribute key must not be null.");
                }
            }
            if (i7 > 0) {
                Log.w("FirebaseCrashlytics", "Ignored " + i7 + " entries when adding custom keys. Maximum allowable: " + this.f15329b, null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
