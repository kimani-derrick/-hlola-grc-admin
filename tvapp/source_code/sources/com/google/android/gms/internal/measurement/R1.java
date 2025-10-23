package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.util.Log;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class R1 {

    /* renamed from: h  reason: collision with root package name */
    public static final Object f8403h = new Object();

    /* renamed from: i  reason: collision with root package name */
    public static volatile H1 f8404i;

    /* renamed from: j  reason: collision with root package name */
    public static final C0442j2 f8405j;

    /* renamed from: k  reason: collision with root package name */
    public static final AtomicInteger f8406k;

    /* renamed from: a  reason: collision with root package name */
    public final S1 f8407a;

    /* renamed from: b  reason: collision with root package name */
    public final String f8408b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f8409c;
    public volatile int d = -1;

    /* renamed from: e  reason: collision with root package name */
    public volatile Object f8410e;
    public final boolean f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f8411g;

    static {
        new AtomicReference();
        f8405j = new C0442j2(new C0442j2(4));
        f8406k = new AtomicInteger();
    }

    public R1(S1 s12, String str, Object obj, int i7) {
        this.f8411g = i7;
        String str2 = (String) s12.f8418e;
        if (str2 == null && s12.f8415a == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        if (str2 != null && s12.f8415a != null) {
            throw new IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
        }
        this.f8407a = s12;
        this.f8408b = str;
        this.f8409c = obj;
        this.f = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
        if (r7 != null) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a() {
        /*
            r9 = this;
            boolean r0 = r9.f
            if (r0 != 0) goto L10
            com.google.android.gms.internal.measurement.j2 r0 = com.google.android.gms.internal.measurement.R1.f8405j
            java.lang.String r1 = r9.f8408b
            r0.getClass()
            java.lang.String r0 = "flagName must not be null"
            android.support.v4.media.session.b.k(r1, r0)
        L10:
            java.util.concurrent.atomic.AtomicInteger r0 = com.google.android.gms.internal.measurement.R1.f8406k
            int r0 = r0.get()
            int r1 = r9.d
            if (r1 >= r0) goto Lc2
            monitor-enter(r9)
            int r1 = r9.d     // Catch: java.lang.Throwable -> L7b
            if (r1 >= r0) goto Lbe
            com.google.android.gms.internal.measurement.H1 r1 = com.google.android.gms.internal.measurement.R1.f8404i     // Catch: java.lang.Throwable -> L7b
            N3.a r2 = N3.a.f2491q     // Catch: java.lang.Throwable -> L7b
            r3 = 0
            if (r1 == 0) goto L7d
            N3.l r2 = r1.f8353b     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L7b
            N3.g r2 = (N3.g) r2     // Catch: java.lang.Throwable -> L7b
            boolean r4 = r2.b()     // Catch: java.lang.Throwable -> L7b
            if (r4 == 0) goto L7d
            java.lang.Object r4 = r2.a()     // Catch: java.lang.Throwable -> L7b
            com.google.android.gms.internal.measurement.I1 r4 = (com.google.android.gms.internal.measurement.I1) r4     // Catch: java.lang.Throwable -> L7b
            com.google.android.gms.internal.measurement.S1 r5 = r9.f8407a     // Catch: java.lang.Throwable -> L7b
            android.net.Uri r6 = r5.f8415a     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r7 = r5.f8418e     // Catch: java.lang.Throwable -> L7b
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L7b
            java.io.Serializable r5 = r5.f8419g     // Catch: java.lang.Throwable -> L7b
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L7b
            java.lang.String r8 = r9.f8408b     // Catch: java.lang.Throwable -> L7b
            r4.getClass()     // Catch: java.lang.Throwable -> L7b
            if (r6 == 0) goto L52
            java.lang.String r7 = r6.toString()     // Catch: java.lang.Throwable -> L7b
            goto L54
        L52:
            if (r7 == 0) goto L58
        L54:
            o.j r4 = r4.f8357a     // Catch: java.lang.Throwable -> L7b
            if (r4 != 0) goto L5a
        L58:
            r4 = r3
            goto L60
        L5a:
            java.lang.Object r4 = r4.get(r7)     // Catch: java.lang.Throwable -> L7b
            o.j r4 = (o.j) r4     // Catch: java.lang.Throwable -> L7b
        L60:
            if (r4 != 0) goto L63
            goto L7d
        L63:
            if (r5 == 0) goto L74
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7b
            r3.<init>()     // Catch: java.lang.Throwable -> L7b
            r3.append(r5)     // Catch: java.lang.Throwable -> L7b
            r3.append(r8)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r8 = r3.toString()     // Catch: java.lang.Throwable -> L7b
        L74:
            java.lang.Object r3 = r4.get(r8)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L7b
            goto L7d
        L7b:
            r0 = move-exception
            goto Lc0
        L7d:
            if (r1 == 0) goto L81
            r4 = 1
            goto L82
        L81:
            r4 = 0
        L82:
            java.lang.String r5 = "Must call PhenotypeFlagInitializer.maybeInit() first"
            android.support.v4.media.session.b.o(r5, r4)     // Catch: java.lang.Throwable -> L7b
            com.google.android.gms.internal.measurement.S1 r4 = r9.f8407a     // Catch: java.lang.Throwable -> L7b
            boolean r4 = r4.f8417c     // Catch: java.lang.Throwable -> L7b
            if (r4 == 0) goto L9b
            java.lang.Object r4 = r9.b(r1)     // Catch: java.lang.Throwable -> L7b
            if (r4 == 0) goto L94
            goto Lab
        L94:
            java.lang.Object r4 = r9.d(r1)     // Catch: java.lang.Throwable -> L7b
            if (r4 == 0) goto La9
            goto Lab
        L9b:
            java.lang.Object r4 = r9.d(r1)     // Catch: java.lang.Throwable -> L7b
            if (r4 == 0) goto La2
            goto Lab
        La2:
            java.lang.Object r4 = r9.b(r1)     // Catch: java.lang.Throwable -> L7b
            if (r4 == 0) goto La9
            goto Lab
        La9:
            java.lang.Object r4 = r9.f8409c     // Catch: java.lang.Throwable -> L7b
        Lab:
            boolean r1 = r2.b()     // Catch: java.lang.Throwable -> L7b
            if (r1 == 0) goto Lba
            if (r3 != 0) goto Lb6
            java.lang.Object r4 = r9.f8409c     // Catch: java.lang.Throwable -> L7b
            goto Lba
        Lb6:
            java.lang.Object r4 = r9.c(r3)     // Catch: java.lang.Throwable -> L7b
        Lba:
            r9.f8410e = r4     // Catch: java.lang.Throwable -> L7b
            r9.d = r0     // Catch: java.lang.Throwable -> L7b
        Lbe:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L7b
            goto Lc2
        Lc0:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L7b
            throw r0
        Lc2:
            java.lang.Object r0 = r9.f8410e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.R1.a():java.lang.Object");
    }

    public final Object b(H1 h12) {
        N3.f fVar;
        K1 k12;
        String str;
        K1 k13;
        S1 s12 = this.f8407a;
        if (!s12.f8416b && ((fVar = (N3.f) s12.f8420h) == null || ((Boolean) fVar.apply(h12.f8352a)).booleanValue())) {
            Context context = h12.f8352a;
            synchronized (K1.class) {
                try {
                    if (K1.f8365t == null) {
                        if (android.support.v4.media.session.b.n(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0) {
                            k13 = new K1(context, 0);
                        } else {
                            k13 = new K1(0);
                        }
                        K1.f8365t = k13;
                    }
                    k12 = K1.f8365t;
                } catch (Throwable th) {
                    throw th;
                }
            }
            S1 s13 = this.f8407a;
            if (s13.f8416b) {
                str = null;
            } else {
                String str2 = (String) s13.f;
                str = this.f8408b;
                if (str2 == null || !str2.isEmpty()) {
                    str = AbstractC0515y1.m(str2, str);
                }
            }
            Object b7 = k12.b(str);
            if (b7 != null) {
                return c(b7);
            }
        }
        return null;
    }

    public final Object c(Object obj) {
        switch (this.f8411g) {
            case 0:
                if (obj instanceof Long) {
                    return (Long) obj;
                }
                if (obj instanceof String) {
                    try {
                        return Long.valueOf(Long.parseLong((String) obj));
                    } catch (NumberFormatException unused) {
                    }
                }
                String str = (String) this.f8407a.f8419g;
                String str2 = this.f8408b;
                if (str == null || !str.isEmpty()) {
                    str2 = AbstractC0515y1.m(str, str2);
                }
                String valueOf = String.valueOf(obj);
                Log.e("PhenotypeFlag", "Invalid long value for " + str2 + ": " + valueOf);
                return null;
            case 1:
                if (obj instanceof Double) {
                    return (Double) obj;
                }
                if (obj instanceof Float) {
                    return Double.valueOf(((Float) obj).doubleValue());
                }
                if (obj instanceof String) {
                    try {
                        return Double.valueOf(Double.parseDouble((String) obj));
                    } catch (NumberFormatException unused2) {
                    }
                }
                String str3 = (String) this.f8407a.f8419g;
                String str4 = this.f8408b;
                if (str3 == null || !str3.isEmpty()) {
                    str4 = AbstractC0515y1.m(str3, str4);
                }
                String valueOf2 = String.valueOf(obj);
                Log.e("PhenotypeFlag", "Invalid double value for " + str4 + ": " + valueOf2);
                return null;
            case 2:
                if (obj instanceof Boolean) {
                    return (Boolean) obj;
                }
                if (obj instanceof String) {
                    String str5 = (String) obj;
                    if (A1.f8224c.matcher(str5).matches()) {
                        return Boolean.TRUE;
                    }
                    if (A1.d.matcher(str5).matches()) {
                        return Boolean.FALSE;
                    }
                }
                String str6 = (String) this.f8407a.f8419g;
                String str7 = this.f8408b;
                if (str6 == null || !str6.isEmpty()) {
                    str7 = AbstractC0515y1.m(str6, str7);
                }
                String valueOf3 = String.valueOf(obj);
                Log.e("PhenotypeFlag", "Invalid boolean value for " + str7 + ": " + valueOf3);
                return null;
            default:
                if (obj instanceof String) {
                    return (String) obj;
                }
                return null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:39|(1:41)(7:53|(1:55)(1:60)|56|(1:58)|48|49|50)|42|43|44|45|(1:47)|48|49|50) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008d, code lost:
        if ("com.google.android.gms".equals(r3.packageName) != false) goto L42;
     */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.internal.measurement.Q1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, java.lang.Runnable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(com.google.android.gms.internal.measurement.H1 r9) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.R1.d(com.google.android.gms.internal.measurement.H1):java.lang.Object");
    }
}
