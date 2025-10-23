package D0;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.Pair;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
/* loaded from: classes.dex */
public final class g extends SQLiteOpenHelper {

    /* renamed from: x  reason: collision with root package name */
    public static final /* synthetic */ int f460x = 0;

    /* renamed from: q  reason: collision with root package name */
    public final Context f461q;

    /* renamed from: r  reason: collision with root package name */
    public final d f462r;

    /* renamed from: s  reason: collision with root package name */
    public final C.d f463s;

    /* renamed from: t  reason: collision with root package name */
    public final boolean f464t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f465u;

    /* renamed from: v  reason: collision with root package name */
    public final E0.a f466v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f467w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, String str, final d dVar, final C.d dVar2) {
        super(context, str, null, dVar2.f324r, new DatabaseErrorHandler() { // from class: D0.e
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                String path;
                M5.g.f(C.d.this, "$callback");
                d dVar3 = dVar;
                M5.g.f(dVar3, "$dbRef");
                int i7 = g.f460x;
                M5.g.e(sQLiteDatabase, "dbObj");
                c v5 = m3.g.v(dVar3, sQLiteDatabase);
                Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + v5 + ".path");
                SQLiteDatabase sQLiteDatabase2 = v5.f454q;
                if (!sQLiteDatabase2.isOpen()) {
                    path = sQLiteDatabase2.getPath();
                    if (path == null) {
                        return;
                    }
                } else {
                    List<Pair<String, String>> list = null;
                    try {
                        try {
                            list = sQLiteDatabase2.getAttachedDbs();
                        } catch (SQLiteException unused) {
                        }
                        try {
                            v5.close();
                        } catch (IOException unused2) {
                            if (list != null) {
                                Iterator<T> it = list.iterator();
                                while (it.hasNext()) {
                                    Object obj = ((Pair) it.next()).second;
                                    M5.g.e(obj, "p.second");
                                    C.d.e((String) obj);
                                }
                                return;
                            }
                            path = sQLiteDatabase2.getPath();
                            if (path == null) {
                                return;
                            }
                        }
                    } catch (Throwable th) {
                        if (list != null) {
                            Iterator<T> it2 = list.iterator();
                            while (it2.hasNext()) {
                                Object obj2 = ((Pair) it2.next()).second;
                                M5.g.e(obj2, "p.second");
                                C.d.e((String) obj2);
                            }
                        } else {
                            String path2 = sQLiteDatabase2.getPath();
                            if (path2 != null) {
                                C.d.e(path2);
                            }
                        }
                        throw th;
                    }
                }
                C.d.e(path);
            }
        });
        M5.g.f(context, "context");
        M5.g.f(dVar2, "callback");
        this.f461q = context;
        this.f462r = dVar;
        this.f463s = dVar2;
        this.f464t = false;
        if (str == null) {
            str = UUID.randomUUID().toString();
            M5.g.e(str, "randomUUID().toString()");
        }
        this.f466v = new E0.a(str, context.getCacheDir(), false);
    }

    public final c a(boolean z7) {
        boolean z8;
        E0.a aVar = this.f466v;
        try {
            if (!this.f467w && getDatabaseName() != null) {
                z8 = true;
            } else {
                z8 = false;
            }
            aVar.a(z8);
            this.f465u = false;
            SQLiteDatabase h7 = h(z7);
            if (this.f465u) {
                close();
                c a7 = a(z7);
                aVar.b();
                return a7;
            }
            c b7 = b(h7);
            aVar.b();
            return b7;
        } catch (Throwable th) {
            aVar.b();
            throw th;
        }
    }

    public final c b(SQLiteDatabase sQLiteDatabase) {
        M5.g.f(sQLiteDatabase, "sqLiteDatabase");
        return m3.g.v(this.f462r, sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        E0.a aVar = this.f466v;
        try {
            aVar.a(aVar.f533a);
            super.close();
            this.f462r.f455a = null;
            this.f467w = false;
        } finally {
            aVar.b();
        }
    }

    public final SQLiteDatabase f(boolean z7) {
        SQLiteDatabase readableDatabase;
        if (z7) {
            readableDatabase = getWritableDatabase();
        } else {
            readableDatabase = getReadableDatabase();
        }
        M5.g.e(readableDatabase, "{\n                super.…eDatabase()\n            }");
        return readableDatabase;
    }

    public final SQLiteDatabase h(boolean z7) {
        File parentFile;
        String databaseName = getDatabaseName();
        boolean z8 = this.f467w;
        Context context = this.f461q;
        if (databaseName != null && !z8 && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
            }
        }
        try {
            return f(z7);
        } catch (Throwable unused) {
            super.close();
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused2) {
            }
            try {
                return f(z7);
            } catch (Throwable th) {
                super.close();
                if (th instanceof f) {
                    f fVar = th;
                    int b7 = s.h.b(fVar.f458q);
                    Throwable th2 = fVar.f459r;
                    if (b7 != 0 && b7 != 1 && b7 != 2 && b7 != 3) {
                        if (!(th2 instanceof SQLiteException)) {
                            throw th2;
                        }
                    } else {
                        throw th2;
                    }
                } else if (th instanceof SQLiteException) {
                    if (databaseName == null || !this.f464t) {
                        throw th;
                    }
                } else {
                    throw th;
                }
                context.deleteDatabase(databaseName);
                try {
                    return f(z7);
                } catch (f e3) {
                    throw e3.f459r;
                }
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        M5.g.f(sQLiteDatabase, "db");
        boolean z7 = this.f465u;
        C.d dVar = this.f463s;
        if (!z7 && dVar.f324r != sQLiteDatabase.getVersion()) {
            sQLiteDatabase.setMaxSqlCacheSize(1);
        }
        try {
            dVar.u(b(sQLiteDatabase));
        } catch (Throwable th) {
            throw new f(1, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        M5.g.f(sQLiteDatabase, "sqLiteDatabase");
        try {
            this.f463s.v(b(sQLiteDatabase));
        } catch (Throwable th) {
            throw new f(2, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i7, int i8) {
        M5.g.f(sQLiteDatabase, "db");
        this.f465u = true;
        try {
            this.f463s.w(b(sQLiteDatabase), i7, i8);
        } catch (Throwable th) {
            throw new f(4, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        M5.g.f(sQLiteDatabase, "db");
        if (!this.f465u) {
            try {
                this.f463s.x(b(sQLiteDatabase));
            } catch (Throwable th) {
                throw new f(5, th);
            }
        }
        this.f467w = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i7, int i8) {
        M5.g.f(sQLiteDatabase, "sqLiteDatabase");
        this.f465u = true;
        try {
            this.f463s.y(b(sQLiteDatabase), i7, i8);
        } catch (Throwable th) {
            throw new f(3, th);
        }
    }
}
