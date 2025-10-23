package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Binder;
import android.os.StrictMode;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import o.C1051d;
import o.C1052e;
/* loaded from: classes.dex */
public final class G1 implements J1 {

    /* renamed from: x  reason: collision with root package name */
    public static final C1052e f8339x = new o.j(0);

    /* renamed from: y  reason: collision with root package name */
    public static final String[] f8340y = {"key", "value"};

    /* renamed from: q  reason: collision with root package name */
    public final ContentResolver f8341q;

    /* renamed from: r  reason: collision with root package name */
    public final Uri f8342r;

    /* renamed from: s  reason: collision with root package name */
    public final Runnable f8343s;

    /* renamed from: t  reason: collision with root package name */
    public final Q.a f8344t;

    /* renamed from: u  reason: collision with root package name */
    public final Object f8345u;

    /* renamed from: v  reason: collision with root package name */
    public volatile Map f8346v;

    /* renamed from: w  reason: collision with root package name */
    public final ArrayList f8347w;

    public G1(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        Q.a aVar = new Q.a(2, this);
        this.f8344t = aVar;
        this.f8345u = new Object();
        this.f8347w = new ArrayList();
        contentResolver.getClass();
        uri.getClass();
        this.f8341q = contentResolver;
        this.f8342r = uri;
        this.f8343s = runnable;
        contentResolver.registerContentObserver(uri, false, aVar);
    }

    public static G1 a(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        G1 g12;
        synchronized (G1.class) {
            C1052e c1052e = f8339x;
            g12 = (G1) c1052e.get(uri);
            if (g12 == null) {
                try {
                    G1 g13 = new G1(contentResolver, uri, runnable);
                    try {
                        c1052e.put(uri, g13);
                    } catch (SecurityException unused) {
                    }
                    g12 = g13;
                } catch (SecurityException unused2) {
                }
            }
        }
        return g12;
    }

    public static synchronized void d() {
        synchronized (G1.class) {
            try {
                Iterator it = ((C1051d) f8339x.values()).iterator();
                while (it.hasNext()) {
                    G1 g12 = (G1) it.next();
                    g12.f8341q.unregisterContentObserver(g12.f8344t);
                }
                f8339x.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.J1
    public final /* synthetic */ Object b(String str) {
        return (String) c().get(str);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, com.google.android.gms.internal.measurement.y2] */
    public final Map c() {
        Map map;
        Object c5;
        Map map2 = this.f8346v;
        if (map2 == null) {
            synchronized (this.f8345u) {
                try {
                    map2 = this.f8346v;
                    if (map2 == null) {
                        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            ?? obj = new Object();
                            obj.f8717a = this;
                            try {
                                c5 = obj.c();
                            } catch (SecurityException unused) {
                                long clearCallingIdentity = Binder.clearCallingIdentity();
                                try {
                                    c5 = obj.c();
                                } finally {
                                    Binder.restoreCallingIdentity(clearCallingIdentity);
                                }
                            }
                            map = (Map) c5;
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                        } catch (SQLiteException | IllegalStateException | SecurityException unused2) {
                            Log.e("ConfigurationContentLdr", "PhenotypeFlag unable to load ContentProvider, using default values");
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            map = null;
                        }
                        this.f8346v = map;
                        map2 = map;
                    }
                } finally {
                }
            }
        }
        if (map2 != null) {
            return map2;
        }
        return Collections.emptyMap();
    }
}
