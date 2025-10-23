package Z1;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import b2.InterfaceC0363b;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import k.C0852F;
import p4.RunnableC1090d;
import r4.C1119a;
import w4.C1410c0;
/* loaded from: classes.dex */
public final /* synthetic */ class i implements InterfaceC0363b, p4.g, M4.a {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f4567q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ long f4568r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ Object f4569s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ Object f4570t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ Object f4571u;

    public /* synthetic */ i(j jVar, Iterable iterable, T1.i iVar, long j7) {
        this.f4567q = 0;
        this.f4569s = jVar;
        this.f4570t = iterable;
        this.f4571u = iVar;
        this.f4568r = j7;
    }

    @Override // p4.g
    public ScheduledFuture a(final C0852F c0852f) {
        switch (this.f4567q) {
            case 1:
                p4.f fVar = (p4.f) this.f4569s;
                fVar.getClass();
                return fVar.f13158r.schedule(new RunnableC1090d(fVar, (Runnable) this.f4570t, c0852f, 1), this.f4568r, (TimeUnit) this.f4571u);
            default:
                final p4.f fVar2 = (p4.f) this.f4569s;
                fVar2.getClass();
                final Callable callable = (Callable) this.f4570t;
                return fVar2.f13158r.schedule(new Callable() { // from class: p4.e
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        f fVar3 = f.this;
                        fVar3.getClass();
                        return fVar3.f13157q.submit(new A4.d(callable, 18, c0852f));
                    }
                }, this.f4568r, (TimeUnit) this.f4571u);
        }
    }

    @Override // b2.InterfaceC0363b
    public Object e() {
        Iterable iterable;
        j jVar = (j) this.f4569s;
        a2.j jVar2 = (a2.j) jVar.f4574c;
        jVar2.getClass();
        if (((Iterable) this.f4570t).iterator().hasNext()) {
            String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + a2.j.r(iterable);
            SQLiteDatabase a7 = jVar2.a();
            a7.beginTransaction();
            try {
                a7.compileStatement(str).execute();
                Cursor rawQuery = a7.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (rawQuery.moveToNext()) {
                    jVar2.j(rawQuery.getInt(0), W1.c.f3752v, rawQuery.getString(1));
                }
                rawQuery.close();
                a7.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                a7.setTransactionSuccessful();
            } finally {
                a7.endTransaction();
            }
        }
        jVar2.f(new a2.f(jVar.f4576g.a() + this.f4568r, (T1.i) this.f4571u));
        return null;
    }

    @Override // M4.a
    public void f(M4.b bVar) {
        ((C1119a) bVar.get()).d((String) this.f4569s, (String) this.f4570t, this.f4568r, (C1410c0) this.f4571u);
    }

    public /* synthetic */ i(Object obj, Object obj2, long j7, Object obj3, int i7) {
        this.f4567q = i7;
        this.f4569s = obj;
        this.f4570t = obj2;
        this.f4568r = j7;
        this.f4571u = obj3;
    }
}
