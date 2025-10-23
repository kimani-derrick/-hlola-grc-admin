package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import o.C1051d;
import o.C1052e;
/* loaded from: classes.dex */
public final class U1 implements J1 {

    /* renamed from: w  reason: collision with root package name */
    public static final C1052e f8428w = new o.j(0);

    /* renamed from: q  reason: collision with root package name */
    public final SharedPreferences f8429q;

    /* renamed from: r  reason: collision with root package name */
    public final Runnable f8430r;

    /* renamed from: s  reason: collision with root package name */
    public final T1 f8431s;

    /* renamed from: t  reason: collision with root package name */
    public final Object f8432t;

    /* renamed from: u  reason: collision with root package name */
    public volatile Map f8433u;

    /* renamed from: v  reason: collision with root package name */
    public final ArrayList f8434v;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.measurement.T1, android.content.SharedPreferences$OnSharedPreferenceChangeListener, java.lang.Object] */
    public U1(SharedPreferences sharedPreferences, Q1 q12) {
        ?? obj = new Object();
        obj.f8424a = this;
        this.f8431s = obj;
        this.f8432t = new Object();
        this.f8434v = new ArrayList();
        this.f8429q = sharedPreferences;
        this.f8430r = q12;
        sharedPreferences.registerOnSharedPreferenceChangeListener(obj);
    }

    public static U1 a(Context context, String str, Q1 q12) {
        U1 u12;
        SharedPreferences sharedPreferences;
        if (E1.a() && !str.startsWith("direct_boot:") && E1.a() && !E1.b(context)) {
            return null;
        }
        synchronized (U1.class) {
            try {
                C1052e c1052e = f8428w;
                u12 = (U1) c1052e.get(str);
                if (u12 == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    if (str.startsWith("direct_boot:")) {
                        if (E1.a()) {
                            context = context.createDeviceProtectedStorageContext();
                        }
                        sharedPreferences = context.getSharedPreferences(str.substring(12), 0);
                    } else {
                        sharedPreferences = context.getSharedPreferences(str, 0);
                    }
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                    u12 = new U1(sharedPreferences, q12);
                    c1052e.put(str, u12);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return u12;
    }

    public static synchronized void c() {
        synchronized (U1.class) {
            try {
                Iterator it = ((C1051d) f8428w.values()).iterator();
                while (it.hasNext()) {
                    U1 u12 = (U1) it.next();
                    u12.f8429q.unregisterOnSharedPreferenceChangeListener(u12.f8431s);
                }
                f8428w.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.J1
    public final Object b(String str) {
        Map<String, ?> map = this.f8433u;
        if (map == null) {
            synchronized (this.f8432t) {
                try {
                    map = this.f8433u;
                    if (map == null) {
                        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        Map<String, ?> all = this.f8429q.getAll();
                        this.f8433u = all;
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        map = all;
                    }
                } finally {
                }
            }
        }
        if (map != null) {
            return map.get(str);
        }
        return null;
    }
}
