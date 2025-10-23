package V4;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import b2.InterfaceC0363b;
import java.util.HashMap;
import java.util.Map;
import t3.C1251o;
import t3.InterfaceC1237a;
/* loaded from: classes.dex */
public final /* synthetic */ class h implements InterfaceC1237a, InterfaceC0363b, a2.h {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ long f3683q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ Object f3684r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ Object f3685s;

    public /* synthetic */ h(long j7, Object obj, Object obj2) {
        this.f3684r = obj;
        this.f3685s = obj2;
        this.f3683q = j7;
    }

    @Override // a2.h
    public Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        W1.c cVar = (W1.c) this.f3685s;
        String num = Integer.toString(cVar.f3756q);
        String str = (String) this.f3684r;
        boolean booleanValue = ((Boolean) a2.j.x(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, num}), new A4.a(27))).booleanValue();
        long j7 = this.f3683q;
        int i7 = cVar.f3756q;
        if (!booleanValue) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(i7));
            contentValues.put("events_dropped_count", Long.valueOf(j7));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
        } else {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j7 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i7)});
        }
        return null;
    }

    @Override // t3.InterfaceC1237a
    public Object d(C1251o c1251o) {
        return ((k) this.f3684r).b(c1251o, this.f3683q, (Map) this.f3685s);
    }

    @Override // b2.InterfaceC0363b
    public Object e() {
        Z1.j jVar = (Z1.j) this.f3684r;
        a2.j jVar2 = (a2.j) jVar.f4574c;
        jVar2.getClass();
        jVar2.f(new a2.f(jVar.f4576g.a() + this.f3683q, (T1.i) this.f3685s));
        return null;
    }

    public /* synthetic */ h(k kVar, long j7, HashMap hashMap) {
        this.f3684r = kVar;
        this.f3683q = j7;
        this.f3685s = hashMap;
    }
}
