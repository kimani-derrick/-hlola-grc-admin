package x0;

import android.database.sqlite.SQLiteException;
import android.util.Log;
import com.boxhdo.android.data.local.AppDatabase;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/* renamed from: x0.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1455k {

    /* renamed from: m  reason: collision with root package name */
    public static final String[] f16162m = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: a  reason: collision with root package name */
    public final AppDatabase f16163a;

    /* renamed from: b  reason: collision with root package name */
    public final Map f16164b;

    /* renamed from: c  reason: collision with root package name */
    public final LinkedHashMap f16165c;
    public final String[] d;

    /* renamed from: e  reason: collision with root package name */
    public final AtomicBoolean f16166e;
    public volatile boolean f;

    /* renamed from: g  reason: collision with root package name */
    public volatile D0.k f16167g;

    /* renamed from: h  reason: collision with root package name */
    public final L0.b f16168h;

    /* renamed from: i  reason: collision with root package name */
    public final m.f f16169i;

    /* renamed from: j  reason: collision with root package name */
    public final Object f16170j;

    /* renamed from: k  reason: collision with root package name */
    public final Object f16171k;

    /* renamed from: l  reason: collision with root package name */
    public final P.b f16172l;

    public C1455k(AppDatabase appDatabase, HashMap hashMap, HashMap hashMap2, String... strArr) {
        String str;
        M5.g.f(appDatabase, "database");
        this.f16163a = appDatabase;
        this.f16164b = hashMap;
        this.f16166e = new AtomicBoolean(false);
        this.f16168h = new L0.b(strArr.length);
        M5.g.e(Collections.newSetFromMap(new IdentityHashMap()), "newSetFromMap(IdentityHashMap())");
        this.f16169i = new m.f();
        this.f16170j = new Object();
        this.f16171k = new Object();
        this.f16165c = new LinkedHashMap();
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i7 = 0; i7 < length; i7++) {
            String str2 = strArr[i7];
            Locale locale = Locale.US;
            M5.g.e(locale, "US");
            String lowerCase = str2.toLowerCase(locale);
            M5.g.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            this.f16165c.put(lowerCase, Integer.valueOf(i7));
            String str3 = (String) this.f16164b.get(strArr[i7]);
            if (str3 != null) {
                str = str3.toLowerCase(locale);
                M5.g.e(str, "this as java.lang.String).toLowerCase(locale)");
            } else {
                str = null;
            }
            if (str != null) {
                lowerCase = str;
            }
            strArr2[i7] = lowerCase;
        }
        this.d = strArr2;
        for (Map.Entry entry : this.f16164b.entrySet()) {
            Locale locale2 = Locale.US;
            M5.g.e(locale2, "US");
            String lowerCase2 = ((String) entry.getValue()).toLowerCase(locale2);
            M5.g.e(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            if (this.f16165c.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(locale2);
                M5.g.e(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
                LinkedHashMap linkedHashMap = this.f16165c;
                M5.g.f(linkedHashMap, "<this>");
                Object obj = linkedHashMap.get(lowerCase2);
                if (obj == null && !linkedHashMap.containsKey(lowerCase2)) {
                    throw new NoSuchElementException("Key " + ((Object) lowerCase2) + " is missing in the map.");
                }
                linkedHashMap.put(lowerCase3, obj);
            }
        }
        this.f16172l = new P.b(23, this);
    }

    public final boolean a() {
        if (!this.f16163a.l()) {
            return false;
        }
        if (!this.f) {
            this.f16163a.g().K();
        }
        if (!this.f) {
            Log.e("ROOM", "database is not initialized even though it is open");
            return false;
        }
        return true;
    }

    public final void b(D0.c cVar, int i7) {
        String str;
        cVar.j("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i7 + ", 0)");
        String str2 = this.d[i7];
        String[] strArr = f16162m;
        for (int i8 = 0; i8 < 3; i8++) {
            String str3 = "CREATE TEMP TRIGGER IF NOT EXISTS " + AbstractC1448d.d(str2, str) + " AFTER " + strArr[i8] + " ON `" + str2 + "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = " + i7 + " AND invalidated = 0; END";
            M5.g.e(str3, "StringBuilder().apply(builderAction).toString()");
            cVar.j(str3);
        }
    }

    public final void c(D0.c cVar) {
        M5.g.f(cVar, "database");
        if (cVar.n()) {
            return;
        }
        try {
            ReentrantReadWriteLock.ReadLock readLock = this.f16163a.f7290i.readLock();
            M5.g.e(readLock, "readWriteLock.readLock()");
            readLock.lock();
            try {
                synchronized (this.f16170j) {
                    int[] h7 = this.f16168h.h();
                    if (h7 == null) {
                        return;
                    }
                    if (cVar.r()) {
                        cVar.b();
                    } else {
                        cVar.a();
                    }
                    int length = h7.length;
                    int i7 = 0;
                    int i8 = 0;
                    while (i7 < length) {
                        int i9 = h7[i7];
                        int i10 = i8 + 1;
                        if (i9 != 1) {
                            if (i9 == 2) {
                                String str = this.d[i8];
                                String[] strArr = f16162m;
                                for (int i11 = 0; i11 < 3; i11++) {
                                    String str2 = strArr[i11];
                                    String str3 = "DROP TRIGGER IF EXISTS " + AbstractC1448d.d(str, str2);
                                    M5.g.e(str3, "StringBuilder().apply(builderAction).toString()");
                                    cVar.j(str3);
                                }
                            }
                        } else {
                            b(cVar, i8);
                        }
                        i7++;
                        i8 = i10;
                    }
                    cVar.V();
                    cVar.h();
                }
            } finally {
                readLock.unlock();
            }
        } catch (SQLiteException | IllegalStateException e3) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e3);
        }
    }
}
