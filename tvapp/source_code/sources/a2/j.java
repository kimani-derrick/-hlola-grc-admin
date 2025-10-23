package a2;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import b2.InterfaceC0363b;
import b2.InterfaceC0364c;
import c2.C0391b;
import d2.AbstractC0552a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import y5.InterfaceC1496a;
/* loaded from: classes.dex */
public final class j implements d, InterfaceC0364c, InterfaceC0200c {

    /* renamed from: v  reason: collision with root package name */
    public static final Q1.b f4997v = new Q1.b("proto");

    /* renamed from: q  reason: collision with root package name */
    public final l f4998q;

    /* renamed from: r  reason: collision with root package name */
    public final C0391b f4999r;

    /* renamed from: s  reason: collision with root package name */
    public final C0391b f5000s;

    /* renamed from: t  reason: collision with root package name */
    public final C0198a f5001t;

    /* renamed from: u  reason: collision with root package name */
    public final InterfaceC1496a f5002u;

    public j(C0391b c0391b, C0391b c0391b2, C0198a c0198a, l lVar, InterfaceC1496a interfaceC1496a) {
        this.f4998q = lVar;
        this.f4999r = c0391b;
        this.f5000s = c0391b2;
        this.f5001t = c0198a;
        this.f5002u = interfaceC1496a;
    }

    public static Long b(SQLiteDatabase sQLiteDatabase, T1.i iVar) {
        Long valueOf;
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(iVar.f3240a, String.valueOf(AbstractC0552a.a(iVar.f3242c))));
        byte[] bArr = iVar.f3241b;
        if (bArr != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor query = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            if (!query.moveToNext()) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(query.getLong(0));
            }
            return valueOf;
        } finally {
            query.close();
        }
    }

    public static String r(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((C0199b) it.next()).f4986a);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static Object x(Cursor cursor, h hVar) {
        try {
            return hVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public final SQLiteDatabase a() {
        l lVar = this.f4998q;
        Objects.requireNonNull(lVar);
        C0391b c0391b = this.f5000s;
        long a7 = c0391b.a();
        while (true) {
            try {
                return lVar.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e3) {
                if (c0391b.a() < this.f5001t.f4984c + a7) {
                    SystemClock.sleep(50L);
                } else {
                    throw new RuntimeException("Timed out while trying to open db.", e3);
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f4998q.close();
    }

    public final Object f(h hVar) {
        SQLiteDatabase a7 = a();
        a7.beginTransaction();
        try {
            Object apply = hVar.apply(a7);
            a7.setTransactionSuccessful();
            return apply;
        } finally {
            a7.endTransaction();
        }
    }

    public final ArrayList h(SQLiteDatabase sQLiteDatabase, T1.i iVar, int i7) {
        ArrayList arrayList = new ArrayList();
        Long b7 = b(sQLiteDatabase, iVar);
        if (b7 == null) {
            return arrayList;
        }
        x(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{b7.toString()}, null, null, null, String.valueOf(i7)), new U4.e(this, arrayList, iVar, 5));
        return arrayList;
    }

    public final void j(long j7, W1.c cVar, String str) {
        f(new V4.h(j7, str, cVar));
    }

    public final Object n(InterfaceC0363b interfaceC0363b) {
        SQLiteDatabase a7 = a();
        C0391b c0391b = this.f5000s;
        long a8 = c0391b.a();
        while (true) {
            try {
                a7.beginTransaction();
                try {
                    Object e3 = interfaceC0363b.e();
                    a7.setTransactionSuccessful();
                    return e3;
                } finally {
                    a7.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e7) {
                if (c0391b.a() < this.f5001t.f4984c + a8) {
                    SystemClock.sleep(50L);
                } else {
                    throw new RuntimeException("Timed out while trying to acquire the lock.", e7);
                }
            }
        }
    }
}
