package f1;

import W5.InterfaceC0116x;
import android.database.Cursor;
import b1.C0356c;
import com.boxhdo.android.data.local.AppDatabase;
import k3.AbstractC0958a;
import w4.l0;
import x0.C1458n;
import z5.C1530l;
/* renamed from: f1.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0676d extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ C0694v f10248u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ long f10249v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0676d(C0694v c0694v, long j7, D5.d dVar) {
        super(2, dVar);
        this.f10248u = c0694v;
        this.f10249v = j7;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new C0676d(this.f10248u, this.f10249v, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((C0676d) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        int i7;
        AbstractC0958a.H(obj);
        C0356c c0356c = this.f10248u.f10325e;
        c0356c.getClass();
        boolean z7 = true;
        C1458n a7 = C1458n.a("SELECT COUNT(movie_id) FROM tbl_continue_watch WHERE movie_id = ?", 1);
        a7.P(this.f10249v, 1);
        AppDatabase appDatabase = c0356c.f7045a;
        appDatabase.b();
        Cursor H6 = l0.H(appDatabase, a7);
        try {
            if (H6.moveToFirst()) {
                i7 = H6.getInt(0);
            } else {
                i7 = 0;
            }
            if (i7 <= 0) {
                z7 = false;
            }
            return new Y0.b(Boolean.valueOf(z7));
        } finally {
            H6.close();
            a7.h();
        }
    }
}
