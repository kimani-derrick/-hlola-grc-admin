package s3;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.SystemClock;
/* renamed from: s3.G  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1152G extends AbstractC1157L {

    /* renamed from: s  reason: collision with root package name */
    public final C1182k f13780s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f13781t;

    public C1152G(C1175g0 c1175g0) {
        super(c1175g0);
        this.f13780s = new C1182k(this, ((C1175g0) this.f2765q).f14056q);
    }

    public static long K(SQLiteDatabase sQLiteDatabase) {
        Cursor cursor = null;
        try {
            cursor = sQLiteDatabase.query("messages", new String[]{"rowid"}, "type=?", new String[]{"3"}, null, null, "rowid desc", "1");
            if (cursor.moveToFirst()) {
                long j7 = cursor.getLong(0);
                cursor.close();
                return j7;
            }
            cursor.close();
            return -1L;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    @Override // s3.AbstractC1157L
    public final boolean J() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x006b A[Catch: all -> 0x0056, SQLiteException -> 0x005a, SQLiteFullException -> 0x005c, SQLiteDatabaseLockedException -> 0x00b8, TRY_ENTER, TryCatch #7 {SQLiteDatabaseLockedException -> 0x00b8, SQLiteFullException -> 0x005c, SQLiteException -> 0x005a, all -> 0x0056, blocks: (B:23:0x004b, B:25:0x0051, B:36:0x006b, B:38:0x008d, B:39:0x00a5), top: B:88:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x011e  */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean L(int r17, byte[] r18) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.C1152G.L(int, byte[]):boolean");
    }

    public final void M() {
        int delete;
        D();
        try {
            SQLiteDatabase O5 = O();
            if (O5 != null && (delete = O5.delete("messages", null, null)) > 0) {
                b().f13803D.c(Integer.valueOf(delete), "Reset local analytics data. records");
            }
        } catch (SQLiteException e3) {
            b().f13807v.c(e3, "Error resetting local analytics data. error");
        }
    }

    public final boolean N() {
        D();
        if (this.f13781t || !((C1175g0) this.f2765q).f14056q.getDatabasePath("google_app_measurement_local.db").exists()) {
            return false;
        }
        int i7 = 5;
        for (int i8 = 0; i8 < 5; i8++) {
            SQLiteDatabase sQLiteDatabase = null;
            try {
                try {
                    try {
                        SQLiteDatabase O5 = O();
                        if (O5 == null) {
                            this.f13781t = true;
                            if (O5 != null) {
                                O5.close();
                            }
                            return false;
                        }
                        O5.beginTransaction();
                        O5.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                        O5.setTransactionSuccessful();
                        O5.endTransaction();
                        O5.close();
                        return true;
                    } catch (SQLiteException e3) {
                        if (0 != 0) {
                            try {
                                if (sQLiteDatabase.inTransaction()) {
                                    sQLiteDatabase.endTransaction();
                                }
                            } catch (Throwable th) {
                                if (0 != 0) {
                                    sQLiteDatabase.close();
                                }
                                throw th;
                            }
                        }
                        b().f13807v.c(e3, "Error deleting app launch break from local database");
                        this.f13781t = true;
                        if (0 != 0) {
                            sQLiteDatabase.close();
                        }
                    }
                } catch (SQLiteFullException e7) {
                    b().f13807v.c(e7, "Error deleting app launch break from local database");
                    this.f13781t = true;
                    if (0 == 0) {
                    }
                    sQLiteDatabase.close();
                }
            } catch (SQLiteDatabaseLockedException unused) {
                SystemClock.sleep(i7);
                i7 += 20;
                if (0 == 0) {
                }
                sQLiteDatabase.close();
            }
        }
        b().f13810y.d("Error deleting app launch break from local database in reasonable time");
        return false;
    }

    public final SQLiteDatabase O() {
        if (this.f13781t) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f13780s.getWritableDatabase();
        if (writableDatabase == null) {
            this.f13781t = true;
            return null;
        }
        return writableDatabase;
    }
}
