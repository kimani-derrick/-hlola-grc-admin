package x0;

import W5.AbstractC0113u;
import W5.AbstractC0117y;
import W5.C0100g;
import W5.T;
import W5.U;
import android.os.CancellationSignal;
import com.boxhdo.android.data.local.AppDatabase;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import w4.l0;
/* renamed from: x0.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1448d {
    public static final Object a(AppDatabase appDatabase, CancellationSignal cancellationSignal, Callable callable, D5.d dVar) {
        if (appDatabase.l() && appDatabase.g().K().n()) {
            return callable.call();
        }
        AbstractC0515y1.s(dVar.k().f(p.f16183q));
        Map map = appDatabase.f7292k;
        Object obj = map.get("QueryDispatcher");
        if (obj == null) {
            Executor executor = appDatabase.f7285b;
            if (executor != null) {
                obj = new T(executor);
                map.put("QueryDispatcher", obj);
            } else {
                M5.g.l("internalQueryExecutor");
                throw null;
            }
        }
        C0100g c0100g = new C0100g(1, l0.x(dVar));
        c0100g.w();
        c0100g.y(new X5.d(cancellationSignal, 5, AbstractC0117y.p(U.f3965q, (AbstractC0113u) obj, 0, new C1447c(callable, c0100g, null), 2)));
        return c0100g.v();
    }

    public static final Object b(AppDatabase appDatabase, Callable callable, D5.d dVar) {
        if (appDatabase.l() && appDatabase.g().K().n()) {
            return callable.call();
        }
        AbstractC0515y1.s(dVar.k().f(p.f16183q));
        return AbstractC0117y.y(dVar, c(appDatabase), new C1446b(callable, null));
    }

    public static final AbstractC0113u c(AppDatabase appDatabase) {
        Map map = appDatabase.f7292k;
        Object obj = map.get("TransactionDispatcher");
        if (obj == null) {
            q qVar = appDatabase.f7286c;
            if (qVar != null) {
                obj = new T(qVar);
                map.put("TransactionDispatcher", obj);
            } else {
                M5.g.l("internalTransactionExecutor");
                throw null;
            }
        }
        return (AbstractC0113u) obj;
    }

    public static String d(String str, String str2) {
        M5.g.f(str, "tableName");
        M5.g.f(str2, "triggerType");
        return "`room_table_modification_trigger_" + str + '_' + str2 + '`';
    }
}
