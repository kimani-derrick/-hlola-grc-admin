package D0;

import android.database.sqlite.SQLiteStatement;
/* loaded from: classes.dex */
public final class k extends j implements C0.b {

    /* renamed from: r  reason: collision with root package name */
    public final SQLiteStatement f476r;

    public k(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f476r = sQLiteStatement;
    }

    public final long a() {
        return this.f476r.executeInsert();
    }

    public final int b() {
        return this.f476r.executeUpdateDelete();
    }
}
