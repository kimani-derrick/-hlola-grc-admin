package a2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
public final class l extends SQLiteOpenHelper {

    /* renamed from: s  reason: collision with root package name */
    public static final String f5004s = "INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + ")";

    /* renamed from: t  reason: collision with root package name */
    public static final int f5005t = 5;

    /* renamed from: u  reason: collision with root package name */
    public static final List f5006u = Arrays.asList(new k(0), new k(1), new k(2), new k(3), new k(4));

    /* renamed from: q  reason: collision with root package name */
    public final int f5007q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f5008r;

    public l(int i7, Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i7);
        this.f5008r = false;
        this.f5007q = i7;
    }

    public static void a(SQLiteDatabase sQLiteDatabase, int i7, int i8) {
        List list = f5006u;
        if (i8 <= list.size()) {
            while (i7 < i8) {
                ((k) list.get(i7)).a(sQLiteDatabase);
                i7++;
            }
            return;
        }
        throw new IllegalArgumentException("Migration from " + i7 + " to " + i8 + " was requested, but cannot be performed. Only " + list.size() + " migrations are provided");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f5008r = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        if (!this.f5008r) {
            onConfigure(sQLiteDatabase);
        }
        a(sQLiteDatabase, 0, this.f5007q);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i7, int i8) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        if (!this.f5008r) {
            onConfigure(sQLiteDatabase);
        }
        a(sQLiteDatabase, 0, i8);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (!this.f5008r) {
            onConfigure(sQLiteDatabase);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i7, int i8) {
        if (!this.f5008r) {
            onConfigure(sQLiteDatabase);
        }
        a(sQLiteDatabase, i7, i8);
    }
}
