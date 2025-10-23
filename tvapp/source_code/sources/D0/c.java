package D0;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.os.CancellationSignal;
import java.io.Closeable;
/* loaded from: classes.dex */
public final class c implements Closeable {

    /* renamed from: r  reason: collision with root package name */
    public static final String[] f453r = new String[0];

    /* renamed from: q  reason: collision with root package name */
    public final SQLiteDatabase f454q;

    public c(SQLiteDatabase sQLiteDatabase) {
        M5.g.f(sQLiteDatabase, "delegate");
        this.f454q = sQLiteDatabase;
    }

    public final Cursor O(String str) {
        M5.g.f(str, "query");
        return x(new B0.d(str, 1));
    }

    public final void V() {
        this.f454q.setTransactionSuccessful();
    }

    public final void a() {
        this.f454q.beginTransaction();
    }

    public final void b() {
        this.f454q.beginTransactionNonExclusive();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f454q.close();
    }

    public final k f(String str) {
        M5.g.f(str, "sql");
        SQLiteStatement compileStatement = this.f454q.compileStatement(str);
        M5.g.e(compileStatement, "delegate.compileStatement(sql)");
        return new k(compileStatement);
    }

    public final void h() {
        this.f454q.endTransaction();
    }

    public final boolean isOpen() {
        return this.f454q.isOpen();
    }

    public final void j(String str) {
        M5.g.f(str, "sql");
        this.f454q.execSQL(str);
    }

    public final boolean n() {
        return this.f454q.inTransaction();
    }

    public final boolean r() {
        SQLiteDatabase sQLiteDatabase = this.f454q;
        M5.g.f(sQLiteDatabase, "sQLiteDatabase");
        return sQLiteDatabase.isWriteAheadLoggingEnabled();
    }

    public final Cursor x(C0.c cVar) {
        M5.g.f(cVar, "query");
        Cursor rawQueryWithFactory = this.f454q.rawQueryWithFactory(new a(1, new b(cVar)), cVar.f(), f453r, null);
        M5.g.e(rawQueryWithFactory, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
        return rawQueryWithFactory;
    }

    public final Cursor y(C0.c cVar, CancellationSignal cancellationSignal) {
        M5.g.f(cVar, "query");
        String f = cVar.f();
        String[] strArr = f453r;
        M5.g.c(cancellationSignal);
        a aVar = new a(0, cVar);
        SQLiteDatabase sQLiteDatabase = this.f454q;
        M5.g.f(sQLiteDatabase, "sQLiteDatabase");
        M5.g.f(f, "sql");
        Cursor rawQueryWithFactory = sQLiteDatabase.rawQueryWithFactory(aVar, f, strArr, null, cancellationSignal);
        M5.g.e(rawQueryWithFactory, "sQLiteDatabase.rawQueryW…ationSignal\n            )");
        return rawQueryWithFactory;
    }
}
