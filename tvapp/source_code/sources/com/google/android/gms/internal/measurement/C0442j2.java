package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.Cursor;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
/* renamed from: com.google.android.gms.internal.measurement.j2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0442j2 implements C2, H2 {

    /* renamed from: b  reason: collision with root package name */
    public static final C0442j2 f8588b = new C0442j2(0);

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8589a;

    public /* synthetic */ C0442j2(int i7) {
        this.f8589a = i7;
    }

    public static int c(M2 m22) {
        return m22.a();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.LinkedHashMap, com.google.android.gms.internal.measurement.B2] */
    public static B2 d(Object obj, Object obj2) {
        B2 b22 = (B2) obj;
        B2 b23 = (B2) obj2;
        if (!b23.isEmpty()) {
            if (!b22.f8233q) {
                if (b22.isEmpty()) {
                    b22 = new B2();
                } else {
                    ?? linkedHashMap = new LinkedHashMap(b22);
                    linkedHashMap.f8233q = true;
                    b22 = linkedHashMap;
                }
            }
            b22.c();
            if (!b23.isEmpty()) {
                b22.putAll(b23);
            }
        }
        return b22;
    }

    public static String e(ContentResolver contentResolver, String str) {
        Cursor query = contentResolver.query(A1.f8222a, null, null, new String[]{str}, null);
        try {
            if (query != null) {
                if (query.moveToFirst()) {
                    String string = query.getString(1);
                    query.close();
                    return string;
                }
                query.close();
                return null;
            }
            throw new Exception("Failed to connect to GservicesProvider");
        } catch (Throwable th) {
            if (query != null) {
                try {
                    query.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static HashMap f(ContentResolver contentResolver, String[] strArr, C0442j2 c0442j2) {
        Cursor query = contentResolver.query(A1.f8223b, null, null, strArr, null);
        try {
            if (query != null) {
                HashMap hashMap = new HashMap(query.getCount(), 1.0f);
                while (query.moveToNext()) {
                    hashMap.put(query.getString(0), query.getString(1));
                }
                query.close();
                return hashMap;
            }
            throw new Exception("Failed to connect to GservicesProvider");
        } catch (Throwable th) {
            if (query != null) {
                try {
                    query.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static void g(Object obj) {
        AbstractC0515y1.v(obj);
        throw new NoSuchMethodError();
    }

    public static void h(Object obj, Object obj2) {
        B2 b22 = (B2) obj;
        AbstractC0515y1.v(obj2);
        if (b22.isEmpty()) {
            return;
        }
        Iterator it = b22.entrySet().iterator();
        if (!it.hasNext()) {
            return;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.LinkedHashMap, com.google.android.gms.internal.measurement.B2] */
    public static B2 i() {
        B2 b22 = B2.f8232r;
        if (b22.isEmpty()) {
            return new B2();
        }
        ?? linkedHashMap = new LinkedHashMap(b22);
        linkedHashMap.f8233q = true;
        return linkedHashMap;
    }

    public static void j(long j7, Object obj) {
        W1 w12 = (W1) ((InterfaceC0481r2) Q2.o(j7, obj));
        if (w12.f8443q) {
            w12.f8443q = false;
        }
    }

    public static void k(Object obj) {
        ((B2) obj).f8233q = false;
    }

    public static B2 l(Object obj) {
        return (B2) obj;
    }

    public static M2 m(Object obj) {
        return ((AbstractC0457m2) obj).zzb;
    }

    public static void n(Object obj) {
        M2 m22 = ((AbstractC0457m2) obj).zzb;
        if (m22.f8379e) {
            m22.f8379e = false;
        }
    }

    public static boolean o(Object obj) {
        if (!((B2) obj).f8233q) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.C2
    public boolean a(Class cls) {
        switch (this.f8589a) {
            case 0:
                return AbstractC0457m2.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }

    @Override // com.google.android.gms.internal.measurement.C2
    public J2 b(Class cls) {
        switch (this.f8589a) {
            case 0:
                if (AbstractC0457m2.class.isAssignableFrom(cls)) {
                    try {
                        return (J2) AbstractC0457m2.d(cls.asSubclass(AbstractC0457m2.class)).g(3);
                    } catch (Exception e3) {
                        throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e3);
                    }
                }
                throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    public C0442j2(C0442j2 c0442j2) {
        this.f8589a = 5;
        Object obj = R1.f8403h;
    }
}
