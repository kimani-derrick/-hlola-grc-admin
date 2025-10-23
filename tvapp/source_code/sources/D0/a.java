package D0;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
/* loaded from: classes.dex */
public final /* synthetic */ class a implements SQLiteDatabase.CursorFactory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f450a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f451b;

    public /* synthetic */ a(int i7, Object obj) {
        this.f450a = i7;
        this.f451b = obj;
    }

    @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        switch (this.f450a) {
            case 0:
                C0.c cVar = (C0.c) this.f451b;
                M5.g.f(cVar, "$query");
                M5.g.c(sQLiteQuery);
                cVar.b(new j(sQLiteQuery));
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            default:
                b bVar = (b) this.f451b;
                M5.g.f(bVar, "$tmp0");
                M5.g.c(sQLiteQuery);
                bVar.f452r.b(new j(sQLiteQuery));
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }
}
