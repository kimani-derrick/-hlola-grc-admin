package a2;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import d2.AbstractC0552a;
/* loaded from: classes.dex */
public final /* synthetic */ class f implements h {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ long f4992q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ T1.i f4993r;

    public /* synthetic */ f(long j7, T1.i iVar) {
        this.f4992q = j7;
        this.f4993r = iVar;
    }

    @Override // a2.h
    public final Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.f4992q));
        T1.i iVar = this.f4993r;
        String str = iVar.f3240a;
        Q1.c cVar = iVar.f3242c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(AbstractC0552a.a(cVar))}) < 1) {
            contentValues.put("backend_name", iVar.f3240a);
            contentValues.put("priority", Integer.valueOf(AbstractC0552a.a(cVar)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }
}
