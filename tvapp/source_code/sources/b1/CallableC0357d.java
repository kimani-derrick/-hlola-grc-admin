package b1;

import android.util.Log;
import c1.C0388b;
import c1.C0389c;
import com.boxhdo.android.data.local.AppDatabase;
import g3.n;
import java.io.File;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import s3.BinderC1181j0;
import s3.C1176h;
import s3.C1178i;
import s3.C1198s0;
import s3.EnumC1196r0;
import s3.m1;
import s3.q1;
import t2.i;
import t3.C1244h;
import t3.C1251o;
import u4.C1292p;
import u4.s;
import u4.v;
import z4.C1517a;
import z4.C1518b;
import z5.C1530l;
/* renamed from: b1.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class CallableC0357d implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7048a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f7049b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f7050c;

    public /* synthetic */ CallableC0357d(Object obj, int i7, Object obj2) {
        this.f7048a = i7;
        this.f7050c = obj;
        this.f7049b = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f7048a) {
            case 0:
                C0358e c0358e = (C0358e) this.f7050c;
                AppDatabase appDatabase = c0358e.f7051a;
                appDatabase.a();
                appDatabase.a();
                D0.c K6 = appDatabase.g().K();
                appDatabase.f7287e.c(K6);
                if (K6.r()) {
                    K6.b();
                } else {
                    K6.a();
                }
                try {
                    c0358e.f7052b.m((C0388b) this.f7049b);
                    appDatabase.g().K().V();
                    appDatabase.k();
                    return C1530l.f16479a;
                } catch (Throwable th) {
                    appDatabase.k();
                    throw th;
                }
            case 1:
                C0361h c0361h = (C0361h) this.f7050c;
                AppDatabase appDatabase2 = c0361h.f7059a;
                appDatabase2.a();
                appDatabase2.a();
                D0.c K7 = appDatabase2.g().K();
                appDatabase2.f7287e.c(K7);
                if (K7.r()) {
                    K7.b();
                } else {
                    K7.a();
                }
                try {
                    c0361h.f7060b.m((C0389c) this.f7049b);
                    appDatabase2.g().K().V();
                    appDatabase2.k();
                    return C1530l.f16479a;
                } catch (Throwable th2) {
                    appDatabase2.k();
                    throw th2;
                }
            case 2:
                BinderC1181j0 binderC1181j0 = (BinderC1181j0) this.f7050c;
                binderC1181j0.d.a0();
                return new C1176h(binderC1181j0.d.g(((m1) this.f7049b).f14143q));
            case 3:
                BinderC1181j0 binderC1181j02 = (BinderC1181j0) this.f7050c;
                binderC1181j02.d.a0();
                C1178i c1178i = binderC1181j02.d.f14207s;
                q1.z(c1178i);
                return c1178i.A0((String) this.f7049b);
            case 4:
                m1 m1Var = (m1) this.f7049b;
                String str = m1Var.f14143q;
                n.g(str);
                q1 q1Var = (q1) this.f7050c;
                C1198s0 I6 = q1Var.I(str);
                EnumC1196r0 enumC1196r0 = EnumC1196r0.f14217s;
                if (I6.i(enumC1196r0) && C1198s0.d(m1Var.f14132L, 100).i(enumC1196r0)) {
                    return q1Var.k(m1Var).g();
                }
                q1Var.b().f13803D.d("Analytics storage consent denied. Returning null app instance id");
                return null;
            case 5:
                Boolean bool = (Boolean) this.f7049b;
                boolean booleanValue = bool.booleanValue();
                i iVar = (i) this.f7050c;
                if (!booleanValue) {
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Deleting cached crash reports...", null);
                    }
                    for (File file : C1518b.u(((File) ((C1292p) iVar.f14557s).f15025g.f16462b).listFiles(C1292p.f15020r))) {
                        file.delete();
                    }
                    C1292p c1292p = (C1292p) iVar.f14557s;
                    C1518b c1518b = ((C1517a) c1292p.f15031m.f16462b).f16459b;
                    C1517a.a(C1518b.u(((File) c1518b.d).listFiles()));
                    C1517a.a(C1518b.u(((File) c1518b.f16464e).listFiles()));
                    C1517a.a(C1518b.u(((File) c1518b.f).listFiles()));
                    c1292p.f15034q.b(null);
                    return m3.g.m(null);
                }
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Sending cached crash reports...", null);
                }
                boolean booleanValue2 = bool.booleanValue();
                v vVar = ((C1292p) iVar.f14557s).f15022b;
                if (booleanValue2) {
                    ((C1244h) vVar.f15063e).b(null);
                    Executor executor = (Executor) ((C1292p) iVar.f14557s).f15024e.f421r;
                    return ((C1251o) iVar.f14556r).j(executor, new i(this, 3, executor));
                }
                vVar.getClass();
                throw new IllegalStateException("An invalid data collection token was used.");
            case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                C1292p.a((C1292p) this.f7050c, (String) this.f7049b, Boolean.FALSE);
                return null;
            default:
                return s.a((s) this.f7050c, (B4.d) this.f7049b);
        }
    }
}
