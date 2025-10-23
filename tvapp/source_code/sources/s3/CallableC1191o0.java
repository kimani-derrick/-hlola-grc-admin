package s3;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.Y3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.Callable;
/* renamed from: s3.o0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class CallableC1191o0 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ m1 f14167a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Bundle f14168b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ BinderC1181j0 f14169c;

    public CallableC1191o0(BinderC1181j0 binderC1181j0, m1 m1Var, Bundle bundle) {
        this.f14167a = m1Var;
        this.f14168b = bundle;
        this.f14169c = binderC1181j0;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str;
        Collection collection;
        BinderC1181j0 binderC1181j0 = this.f14169c;
        binderC1181j0.d.a0();
        q1 q1Var = binderC1181j0.d;
        q1Var.d().D();
        Y3.a();
        C1170e R6 = q1Var.R();
        m1 m1Var = this.f14167a;
        if (R6.O(m1Var.f14143q, AbstractC1203v.f14263B0) && (str = m1Var.f14143q) != null) {
            Bundle bundle = this.f14168b;
            if (bundle != null) {
                int[] intArray = bundle.getIntArray("uriSources");
                long[] longArray = bundle.getLongArray("uriTimestamps");
                if (intArray != null) {
                    if (longArray != null && longArray.length == intArray.length) {
                        for (int i7 = 0; i7 < intArray.length; i7++) {
                            C1178i c1178i = q1Var.f14207s;
                            q1.z(c1178i);
                            int i8 = intArray[i7];
                            long j7 = longArray[i7];
                            g3.n.c(str);
                            c1178i.D();
                            c1178i.H();
                            try {
                                int delete = c1178i.K().delete("trigger_uris", "app_id=? and source=? and timestamp_millis<=?", new String[]{str, String.valueOf(i8), String.valueOf(j7)});
                                c1178i.b().f13803D.e("Pruned " + delete + " trigger URIs. appId, source, timestamp", str, Integer.valueOf(i8), Long.valueOf(j7));
                            } catch (SQLiteException e3) {
                                c1178i.b().f13807v.b(C1154I.J(str), e3, "Error pruning trigger URIs. appId");
                            }
                        }
                    } else {
                        q1Var.b().f13807v.d("Uri sources and timestamps do not match");
                    }
                }
            }
            C1178i c1178i2 = q1Var.f14207s;
            q1.z(c1178i2);
            g3.n.c(str);
            c1178i2.D();
            c1178i2.H();
            ArrayList arrayList = new ArrayList();
            Cursor cursor = null;
            try {
                try {
                    cursor = c1178i2.K().query("trigger_uris", new String[]{"trigger_uri", "timestamp_millis", "source"}, "app_id=?", new String[]{str}, null, null, "rowid", null);
                } catch (SQLiteException e7) {
                    c1178i2.b().f13807v.b(C1154I.J(str), e7, "Error querying trigger uris. appId");
                    Collection emptyList = Collections.emptyList();
                    collection = emptyList;
                    if (cursor != null) {
                        cursor.close();
                        collection = emptyList;
                    }
                }
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    collection = arrayList;
                    return collection;
                }
                do {
                    String string = cursor.getString(0);
                    if (string == null) {
                        string = "";
                    }
                    arrayList.add(new j1(cursor.getInt(2), cursor.getLong(1), string));
                } while (cursor.moveToNext());
                cursor.close();
                collection = arrayList;
                return collection;
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        }
        return new ArrayList();
    }
}
