package D0;

import android.database.sqlite.SQLiteProgram;
/* loaded from: classes.dex */
public class j implements C0.b {

    /* renamed from: q  reason: collision with root package name */
    public final SQLiteProgram f475q;

    public j(SQLiteProgram sQLiteProgram) {
        M5.g.f(sQLiteProgram, "delegate");
        this.f475q = sQLiteProgram;
    }

    @Override // C0.b
    public final void A(int i7, byte[] bArr) {
        this.f475q.bindBlob(i7, bArr);
    }

    @Override // C0.b
    public final void B(int i7) {
        this.f475q.bindNull(i7);
    }

    @Override // C0.b
    public final void C(String str, int i7) {
        M5.g.f(str, "value");
        this.f475q.bindString(i7, str);
    }

    @Override // C0.b
    public final void E(int i7, double d) {
        this.f475q.bindDouble(i7, d);
    }

    @Override // C0.b
    public final void P(long j7, int i7) {
        this.f475q.bindLong(i7, j7);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f475q.close();
    }
}
