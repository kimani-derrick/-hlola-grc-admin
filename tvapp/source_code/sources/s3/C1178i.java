package s3;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.C0411d1;
import com.google.android.gms.internal.measurement.C0416e1;
import com.google.android.gms.internal.measurement.C0426g1;
import com.google.android.gms.internal.measurement.C0431h1;
import com.google.android.gms.internal.measurement.C0451l1;
import com.google.android.gms.internal.measurement.C0456m1;
import com.google.android.gms.internal.measurement.C0490t1;
import com.google.android.gms.internal.measurement.C0514y0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import r0.AbstractC1111a;
/* renamed from: s3.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1178i extends o1 {

    /* renamed from: t  reason: collision with root package name */
    public final C1182k f14085t;

    /* renamed from: u  reason: collision with root package name */
    public final M2.e f14086u;

    /* renamed from: v  reason: collision with root package name */
    public static final String[] f14080v = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* renamed from: w  reason: collision with root package name */
    public static final String[] f14081w = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* renamed from: x  reason: collision with root package name */
    public static final String[] f14082x = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;"};

    /* renamed from: y  reason: collision with root package name */
    public static final String[] f14083y = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};

    /* renamed from: z  reason: collision with root package name */
    public static final String[] f14084z = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

    /* renamed from: A  reason: collision with root package name */
    public static final String[] f14075A = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: B  reason: collision with root package name */
    public static final String[] f14076B = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: C  reason: collision with root package name */
    public static final String[] f14077C = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* renamed from: D  reason: collision with root package name */
    public static final String[] f14078D = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};

    /* renamed from: E  reason: collision with root package name */
    public static final String[] f14079E = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};

    public C1178i(q1 q1Var) {
        super(q1Var);
        this.f14086u = new M2.e(((C1175g0) this.f2765q).f14037D);
        this.f14085t = new C1182k(this, ((C1175g0) this.f2765q).f14056q);
    }

    public static void X(ContentValues contentValues, Object obj) {
        g3.n.c("value");
        g3.n.g(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put("value", (Double) obj);
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    public final List A0(String str) {
        g3.n.c(str);
        D();
        H();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                cursor = K().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return arrayList;
                }
                do {
                    String string = cursor.getString(0);
                    String string2 = cursor.getString(1);
                    if (string2 == null) {
                        string2 = "";
                    }
                    String str2 = string2;
                    long j7 = cursor.getLong(2);
                    Object P6 = P(cursor, 3);
                    if (P6 == null) {
                        b().f13807v.c(C1154I.J(str), "Read invalid user property value, ignoring it. appId");
                    } else {
                        arrayList.add(new v1(str, str2, string, j7, P6));
                    }
                } while (cursor.moveToNext());
                cursor.close();
                return arrayList;
            } catch (SQLiteException e3) {
                b().f13807v.b(C1154I.J(str), e3, "Error querying user properties. appId");
                List emptyList = Collections.emptyList();
                if (cursor != null) {
                    cursor.close();
                }
                return emptyList;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final void B0(String str) {
        C1197s t02;
        z0("events_snapshot", str);
        Cursor cursor = null;
        try {
            try {
                cursor = K().query("events", (String[]) Collections.singletonList("name").toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return;
                }
                do {
                    String string = cursor.getString(0);
                    if (string != null && (t02 = t0("events", str, string)) != null) {
                        b0("events_snapshot", t02);
                    }
                } while (cursor.moveToNext());
                cursor.close();
            } catch (SQLiteException e3) {
                b().f13807v.b(C1154I.J(str), e3, "Error creating snapshot. appId");
                if (cursor != null) {
                    cursor.close();
                }
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final void C0() {
        H();
        K().beginTransaction();
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D0(java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.C1178i.D0(java.lang.String):void");
    }

    public final void E0() {
        H();
        K().endTransaction();
    }

    public final void F0() {
        D();
        H();
        C1175g0 c1175g0 = (C1175g0) this.f2765q;
        if (!c1175g0.f14056q.getDatabasePath("google_app_measurement.db").exists()) {
            return;
        }
        q1 q1Var = this.f14116r;
        long f = q1Var.f14213y.f13968u.f();
        c1175g0.f14037D.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (Math.abs(elapsedRealtime - f) > ((Long) AbstractC1203v.f14357z.a(null)).longValue()) {
            q1Var.f14213y.f13968u.g(elapsedRealtime);
            D();
            H();
            if (c1175g0.f14056q.getDatabasePath("google_app_measurement.db").exists()) {
                SQLiteDatabase K6 = K();
                c1175g0.f14037D.getClass();
                int delete = K6.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(C1170e.Q())});
                if (delete > 0) {
                    C1154I b7 = b();
                    b7.f13803D.c(Integer.valueOf(delete), "Deleted stale rows. rowsDeleted");
                }
            }
        }
    }

    public final void G0() {
        H();
        K().setTransactionSuccessful();
    }

    @Override // s3.o1
    public final boolean J() {
        return false;
    }

    public final SQLiteDatabase K() {
        D();
        try {
            return this.f14085t.getWritableDatabase();
        } catch (SQLiteException e3) {
            b().f13810y.c(e3, "Error opening database");
            throw e3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String L() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.K()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L22 android.database.sqlite.SQLiteException -> L27
            boolean r2 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L1a android.database.sqlite.SQLiteException -> L1c
            if (r2 == 0) goto L1e
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch: java.lang.Throwable -> L1a android.database.sqlite.SQLiteException -> L1c
            r0.close()
            return r1
        L1a:
            r1 = move-exception
            goto L3a
        L1c:
            r2 = move-exception
            goto L29
        L1e:
            r0.close()
            return r1
        L22:
            r0 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L3a
        L27:
            r2 = move-exception
            r0 = r1
        L29:
            s3.I r3 = r6.b()     // Catch: java.lang.Throwable -> L1a
            l6.b r3 = r3.f13807v     // Catch: java.lang.Throwable -> L1a
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.c(r2, r4)     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L39
            r0.close()
        L39:
            return r1
        L3a:
            if (r0 == 0) goto L3f
            r0.close()
        L3f:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.C1178i.L():java.lang.String");
    }

    public final long M(C0456m1 c0456m1) {
        D();
        H();
        g3.n.c(c0456m1.Z1());
        byte[] c5 = c0456m1.c();
        long L6 = E().L(c5);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", c0456m1.Z1());
        contentValues.put("metadata_fingerprint", Long.valueOf(L6));
        contentValues.put("metadata", c5);
        try {
            K().insertWithOnConflict("raw_events_metadata", null, contentValues, 4);
            return L6;
        } catch (SQLiteException e3) {
            C1154I b7 = b();
            b7.f13807v.b(C1154I.J(c0456m1.Z1()), e3, "Error storing raw event metadata. appId");
            throw e3;
        }
    }

    public final long N(String str) {
        g3.n.c(str);
        D();
        H();
        try {
            return K().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str, String.valueOf(Math.max(0, Math.min(1000000, ((C1175g0) this.f2765q).f14062w.I(str, AbstractC1203v.f14340q))))});
        } catch (SQLiteException e3) {
            C1154I b7 = b();
            b7.f13807v.b(C1154I.J(str), e3, "Error deleting over the limit events. appId");
            return 0L;
        }
    }

    public final long O(String str, String[] strArr, long j7) {
        Cursor cursor = null;
        try {
            try {
                cursor = K().rawQuery(str, strArr);
                if (cursor.moveToFirst()) {
                    long j8 = cursor.getLong(0);
                    cursor.close();
                    return j8;
                }
                cursor.close();
                return j7;
            } catch (SQLiteException e3) {
                b().f13807v.b(str, e3, "Database error");
                throw e3;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final Object P(Cursor cursor, int i7) {
        int type = cursor.getType(i7);
        if (type != 0) {
            if (type != 1) {
                if (type != 2) {
                    if (type != 3) {
                        if (type != 4) {
                            C1154I b7 = b();
                            b7.f13807v.c(Integer.valueOf(type), "Loaded invalid unknown value type, ignoring it");
                            return null;
                        }
                        b().f13807v.d("Loaded invalid blob type value, ignoring it");
                        return null;
                    }
                    return cursor.getString(i7);
                }
                return Double.valueOf(cursor.getDouble(i7));
            }
            return Long.valueOf(cursor.getLong(i7));
        }
        b().f13807v.d("Loaded invalid null value from database");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String Q(long r4) {
        /*
            r3 = this;
            r3.D()
            r3.H()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r3.K()     // Catch: java.lang.Throwable -> L3c android.database.sqlite.SQLiteException -> L3e
            java.lang.String r2 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L3c android.database.sqlite.SQLiteException -> L3e
            java.lang.String[] r4 = new java.lang.String[]{r4}     // Catch: java.lang.Throwable -> L3c android.database.sqlite.SQLiteException -> L3e
            android.database.Cursor r4 = r1.rawQuery(r2, r4)     // Catch: java.lang.Throwable -> L3c android.database.sqlite.SQLiteException -> L3e
            boolean r5 = r4.moveToFirst()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            if (r5 != 0) goto L33
            s3.I r5 = r3.b()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            l6.b r5 = r5.f13803D     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            java.lang.String r1 = "No expired configs for apps with pending events"
            r5.d(r1)     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            r4.close()
            return r0
        L2e:
            r5 = move-exception
            r0 = r4
            goto L51
        L31:
            r5 = move-exception
            goto L40
        L33:
            r5 = 0
            java.lang.String r5 = r4.getString(r5)     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            r4.close()
            return r5
        L3c:
            r5 = move-exception
            goto L51
        L3e:
            r5 = move-exception
            r4 = r0
        L40:
            s3.I r1 = r3.b()     // Catch: java.lang.Throwable -> L2e
            l6.b r1 = r1.f13807v     // Catch: java.lang.Throwable -> L2e
            java.lang.String r2 = "Error selecting expired configs"
            r1.c(r5, r2)     // Catch: java.lang.Throwable -> L2e
            if (r4 == 0) goto L50
            r4.close()
        L50:
            return r0
        L51:
            if (r0 == 0) goto L56
            r0.close()
        L56:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.C1178i.Q(long):java.lang.String");
    }

    public final String R(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                cursor = K().rawQuery(str, strArr);
                if (cursor.moveToFirst()) {
                    String string = cursor.getString(0);
                    cursor.close();
                    return string;
                }
                cursor.close();
                return "";
            } catch (SQLiteException e3) {
                b().f13807v.b(str, e3, "Database error");
                throw e3;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final List S(int i7, int i8, String str) {
        boolean z7;
        boolean z8;
        l6.b bVar;
        String str2;
        C1159N J6;
        byte[] p02;
        long j7;
        long j8;
        D();
        H();
        int i9 = 1;
        if (i7 > 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        g3.n.a(z7);
        if (i8 > 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        g3.n.a(z8);
        g3.n.c(str);
        Cursor cursor = null;
        try {
            try {
                Cursor query = K().query("queue", new String[]{"rowid", "data", "retry_count"}, "app_id=?", new String[]{str}, null, null, "rowid", String.valueOf(i7));
                if (!query.moveToFirst()) {
                    List emptyList = Collections.emptyList();
                    query.close();
                    return emptyList;
                }
                ArrayList arrayList = new ArrayList();
                int i10 = 0;
                while (true) {
                    long j9 = query.getLong(0);
                    try {
                        p02 = E().p0(query.getBlob(i9));
                    } catch (IOException e3) {
                        e = e3;
                        bVar = b().f13807v;
                        str2 = "Failed to unzip queued bundle. appId";
                        J6 = C1154I.J(str);
                    }
                    if (!arrayList.isEmpty() && p02.length + i10 > i8) {
                        break;
                    }
                    try {
                        C0451l1 c0451l1 = (C0451l1) C1160O.Q(C0456m1.X1(), p02);
                        if (!arrayList.isEmpty()) {
                            C0456m1 c0456m1 = (C0456m1) ((Pair) arrayList.get(0)).first;
                            C0456m1 c0456m12 = (C0456m1) c0451l1.c();
                            if (!c0456m1.H().equals(c0456m12.H()) || !c0456m1.G().equals(c0456m12.G()) || c0456m1.W() != c0456m12.W() || !c0456m1.I().equals(c0456m12.I())) {
                                break;
                            }
                            Iterator it = c0456m1.U().iterator();
                            while (true) {
                                j7 = -1;
                                if (it.hasNext()) {
                                    C0490t1 c0490t1 = (C0490t1) it.next();
                                    if ("_npa".equals(c0490t1.E())) {
                                        j8 = c0490t1.A();
                                        break;
                                    }
                                } else {
                                    j8 = -1;
                                    break;
                                }
                            }
                            Iterator it2 = c0456m12.U().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                C0490t1 c0490t12 = (C0490t1) it2.next();
                                if ("_npa".equals(c0490t12.E())) {
                                    j7 = c0490t12.A();
                                    break;
                                }
                            }
                            if (j8 != j7) {
                                break;
                            }
                        }
                        if (!query.isNull(2)) {
                            int i11 = query.getInt(2);
                            c0451l1.e();
                            C0456m1.u((C0456m1) c0451l1.f8609r, i11);
                        }
                        i10 += p02.length;
                        arrayList.add(Pair.create((C0456m1) c0451l1.c(), Long.valueOf(j9)));
                    } catch (IOException e7) {
                        e = e7;
                        bVar = b().f13807v;
                        str2 = "Failed to merge queued bundle. appId";
                        J6 = C1154I.J(str);
                        bVar.b(J6, e, str2);
                        if (query.moveToNext()) {
                            break;
                        }
                        i9 = 1;
                        query.close();
                        return arrayList;
                    }
                    if (query.moveToNext() || i10 > i8) {
                        break;
                        break;
                    }
                    i9 = 1;
                }
                query.close();
                return arrayList;
            } catch (SQLiteException e8) {
                b().f13807v.b(C1154I.J(str), e8, "Error querying bundles. appId");
                List emptyList2 = Collections.emptyList();
                if (0 != 0) {
                    cursor.close();
                }
                return emptyList2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final List T(String str, String str2, String str3) {
        g3.n.c(str);
        D();
        H();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(str3 + "*");
            sb.append(" and name glob ?");
        }
        return U(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0050, code lost:
        b().f13807v.c(1000, "Read more than the max allowed conditional properties, ignoring extra");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List U(java.lang.String r27, java.lang.String[] r28) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.C1178i.U(java.lang.String, java.lang.String[]):java.util.List");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [s3.j, java.lang.Object] */
    public final C1180j V(long j7, String str, long j8, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12) {
        g3.n.c(str);
        D();
        H();
        String[] strArr = {str};
        ?? obj = new Object();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase K6 = K();
                Cursor query = K6.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count", "daily_realtime_dcu_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (!query.moveToFirst()) {
                    b().f13810y.c(C1154I.J(str), "Not updating daily counts, app is not known. appId");
                    query.close();
                    return obj;
                }
                if (query.getLong(0) == j7) {
                    obj.f14092b = query.getLong(1);
                    obj.f14091a = query.getLong(2);
                    obj.f14093c = query.getLong(3);
                    obj.d = query.getLong(4);
                    obj.f14094e = query.getLong(5);
                    obj.f = query.getLong(6);
                }
                if (z7) {
                    obj.f14092b += j8;
                }
                if (z8) {
                    obj.f14091a += j8;
                }
                if (z9) {
                    obj.f14093c += j8;
                }
                if (z10) {
                    obj.d += j8;
                }
                if (z11) {
                    obj.f14094e += j8;
                }
                if (z12) {
                    obj.f += j8;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("day", Long.valueOf(j7));
                contentValues.put("daily_public_events_count", Long.valueOf(obj.f14091a));
                contentValues.put("daily_events_count", Long.valueOf(obj.f14092b));
                contentValues.put("daily_conversions_count", Long.valueOf(obj.f14093c));
                contentValues.put("daily_error_events_count", Long.valueOf(obj.d));
                contentValues.put("daily_realtime_events_count", Long.valueOf(obj.f14094e));
                contentValues.put("daily_realtime_dcu_count", Long.valueOf(obj.f));
                K6.update("apps", contentValues, "app_id=?", strArr);
                query.close();
                return obj;
            } catch (SQLiteException e3) {
                b().f13807v.b(C1154I.J(str), e3, "Error updating daily counts. appId");
                if (0 != 0) {
                    cursor.close();
                }
                return obj;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final void W(ContentValues contentValues) {
        try {
            SQLiteDatabase K6 = K();
            String asString = contentValues.getAsString("app_id");
            if (asString == null) {
                b().f13809x.c(C1154I.J("app_id"), "Value of the primary key is not set.");
            } else if (K6.update("consent_settings", contentValues, "app_id = ?", new String[]{asString}) == 0 && K6.insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                b().f13807v.b(C1154I.J("consent_settings"), C1154I.J("app_id"), "Failed to insert/update table (got -1). key");
            }
        } catch (SQLiteException e3) {
            C1154I b7 = b();
            b7.f13807v.e("Error storing into table. key", C1154I.J("consent_settings"), C1154I.J("app_id"), e3);
        }
    }

    public final void Y(C0456m1 c0456m1, boolean z7) {
        C1159N J6;
        l6.b bVar;
        String str;
        D();
        H();
        g3.n.c(c0456m1.Z1());
        if (c0456m1.r0()) {
            F0();
            ((C1175g0) this.f2765q).f14037D.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            if (c0456m1.H1() < currentTimeMillis - C1170e.Q() || c0456m1.H1() > C1170e.Q() + currentTimeMillis) {
                C1154I b7 = b();
                b7.f13810y.e("Storing bundle outside of the max uploading time span. appId, now, timestamp", C1154I.J(c0456m1.Z1()), Long.valueOf(currentTimeMillis), Long.valueOf(c0456m1.H1()));
            }
            try {
                byte[] n02 = E().n0(c0456m1.c());
                C1154I b8 = b();
                b8.f13803D.c(Integer.valueOf(n02.length), "Saving bundle, size");
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", c0456m1.Z1());
                contentValues.put("bundle_end_timestamp", Long.valueOf(c0456m1.H1()));
                contentValues.put("data", n02);
                contentValues.put("has_realtime", Integer.valueOf(z7 ? 1 : 0));
                if (c0456m1.y0()) {
                    contentValues.put("retry_count", Integer.valueOf(c0456m1.g1()));
                }
                try {
                    if (K().insert("queue", null, contentValues) == -1) {
                        b().f13807v.c(C1154I.J(c0456m1.Z1()), "Failed to insert bundle (got -1). appId");
                    }
                } catch (SQLiteException e3) {
                    e = e3;
                    C1154I b9 = b();
                    J6 = C1154I.J(c0456m1.Z1());
                    bVar = b9.f13807v;
                    str = "Error storing bundle. appId";
                    bVar.b(J6, e, str);
                }
            } catch (IOException e7) {
                e = e7;
                C1154I b10 = b();
                J6 = C1154I.J(c0456m1.Z1());
                bVar = b10.f13807v;
                str = "Data loss. Failed to serialize bundle. appId";
            }
        } else {
            throw new IllegalStateException();
        }
    }

    public final void Z(String str, Long l7, long j7, C0416e1 c0416e1) {
        D();
        H();
        g3.n.g(c0416e1);
        g3.n.c(str);
        byte[] c5 = c0416e1.c();
        C1154I b7 = b();
        b7.f13803D.b(((C1175g0) this.f2765q).f14036C.b(str), Integer.valueOf(c5.length), "Saving complex main event, appId, data size");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l7);
        contentValues.put("children_to_process", Long.valueOf(j7));
        contentValues.put("main_event", c5);
        try {
            if (K().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                b().f13807v.c(C1154I.J(str), "Failed to insert complex main event (got -1). appId");
            }
        } catch (SQLiteException e3) {
            C1154I b8 = b();
            b8.f13807v.b(C1154I.J(str), e3, "Error storing complex main event. appId");
        }
    }

    public final void a0(String str, String str2) {
        g3.n.c(str);
        g3.n.c(str2);
        D();
        H();
        try {
            K().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e3) {
            C1154I b7 = b();
            b7.f13807v.e("Error deleting conditional property", C1154I.J(str), ((C1175g0) this.f2765q).f14036C.g(str2), e3);
        }
    }

    public final void b0(String str, C1197s c1197s) {
        Long l7;
        g3.n.g(c1197s);
        D();
        H();
        ContentValues contentValues = new ContentValues();
        String str2 = c1197s.f14224a;
        contentValues.put("app_id", str2);
        contentValues.put("name", c1197s.f14225b);
        contentValues.put("lifetime_count", Long.valueOf(c1197s.f14226c));
        contentValues.put("current_bundle_count", Long.valueOf(c1197s.d));
        contentValues.put("last_fire_timestamp", Long.valueOf(c1197s.f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(c1197s.f14228g));
        contentValues.put("last_bundled_day", c1197s.f14229h);
        contentValues.put("last_sampled_complex_event_id", c1197s.f14230i);
        contentValues.put("last_sampling_rate", c1197s.f14231j);
        contentValues.put("current_session_count", Long.valueOf(c1197s.f14227e));
        Boolean bool = c1197s.f14232k;
        if (bool != null && bool.booleanValue()) {
            l7 = 1L;
        } else {
            l7 = null;
        }
        contentValues.put("last_exempt_from_sampling", l7);
        try {
            if (K().insertWithOnConflict(str, null, contentValues, 5) == -1) {
                b().f13807v.c(C1154I.J(str2), "Failed to insert/update event aggregates (got -1). appId");
            }
        } catch (SQLiteException e3) {
            b().f13807v.b(C1154I.J(str2), e3, "Error storing event aggregates. appId");
        }
    }

    public final void c0(String str, C1198s0 c1198s0) {
        g3.n.g(str);
        D();
        H();
        p0(str, y0(str));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("storage_consent_at_bundling", c1198s0.p());
        W(contentValues);
    }

    public final void d0(String str, j1 j1Var) {
        D();
        H();
        g3.n.c(str);
        ((C1175g0) this.f2765q).f14037D.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        long j7 = j1Var.f14097r;
        if (j7 < currentTimeMillis - C1170e.Q() || j7 > C1170e.Q() + currentTimeMillis) {
            C1154I b7 = b();
            b7.f13810y.e("Storing trigger URI outside of the max retention time span. appId, now, timestamp", C1154I.J(str), Long.valueOf(currentTimeMillis), Long.valueOf(j7));
        }
        b().f13803D.d("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("trigger_uri", j1Var.f14096q);
        contentValues.put("source", Integer.valueOf(j1Var.f14098s));
        contentValues.put("timestamp_millis", Long.valueOf(j7));
        try {
            if (K().insert("trigger_uris", null, contentValues) == -1) {
                b().f13807v.c(C1154I.J(str), "Failed to insert trigger URI (got -1). appId");
            }
        } catch (SQLiteException e3) {
            C1154I b8 = b();
            b8.f13807v.b(C1154I.J(str), e3, "Error storing trigger URI. appId");
        }
    }

    public final void e0(List list) {
        D();
        H();
        if (list.size() != 0) {
            if (!((C1175g0) this.f2765q).f14056q.getDatabasePath("google_app_measurement.db").exists()) {
                return;
            }
            String r3 = AbstractC1111a.r("(", TextUtils.join(",", list), ")");
            if (m0("SELECT COUNT(1) FROM queue WHERE rowid IN " + r3 + " AND retry_count =  2147483647 LIMIT 1", null) > 0) {
                b().f13810y.d("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase K6 = K();
                K6.execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + r3 + " AND (retry_count IS NULL OR retry_count < 2147483647)");
                return;
            } catch (SQLiteException e3) {
                b().f13807v.c(e3, "Error incrementing retry count. error");
                return;
            }
        }
        throw new IllegalArgumentException("Given Integer is zero");
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0043, code lost:
        if (r11.I(r3).i(r9) != false) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x035b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f0(s3.C1146A r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 954
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.C1178i.f0(s3.A, boolean):void");
    }

    public final boolean g0(String str, int i7, C0514y0 c0514y0) {
        Integer num;
        Boolean bool;
        H();
        D();
        g3.n.c(str);
        g3.n.g(c0514y0);
        Integer num2 = null;
        if (c0514y0.y().isEmpty()) {
            C1154I b7 = b();
            C1159N J6 = C1154I.J(str);
            Integer valueOf = Integer.valueOf(i7);
            if (c0514y0.E()) {
                num2 = Integer.valueOf(c0514y0.v());
            }
            b7.f13810y.e("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", J6, valueOf, String.valueOf(num2));
            return false;
        }
        byte[] c5 = c0514y0.c();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i7));
        if (c0514y0.E()) {
            num = Integer.valueOf(c0514y0.v());
        } else {
            num = null;
        }
        contentValues.put("filter_id", num);
        contentValues.put("event_name", c0514y0.y());
        if (c0514y0.F()) {
            bool = Boolean.valueOf(c0514y0.C());
        } else {
            bool = null;
        }
        contentValues.put("session_scoped", bool);
        contentValues.put("data", c5);
        try {
            if (K().insertWithOnConflict("event_filters", null, contentValues, 5) == -1) {
                b().f13807v.c(C1154I.J(str), "Failed to insert event filter (got -1). appId");
                return true;
            }
            return true;
        } catch (SQLiteException e3) {
            b().f13807v.b(C1154I.J(str), e3, "Error storing event filter. appId");
            return false;
        }
    }

    public final boolean h0(String str, int i7, com.google.android.gms.internal.measurement.E0 e02) {
        Integer num;
        Boolean bool;
        H();
        D();
        g3.n.c(str);
        g3.n.g(e02);
        Integer num2 = null;
        if (e02.v().isEmpty()) {
            C1154I b7 = b();
            C1159N J6 = C1154I.J(str);
            Integer valueOf = Integer.valueOf(i7);
            if (e02.z()) {
                num2 = Integer.valueOf(e02.r());
            }
            b7.f13810y.e("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", J6, valueOf, String.valueOf(num2));
            return false;
        }
        byte[] c5 = e02.c();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i7));
        if (e02.z()) {
            num = Integer.valueOf(e02.r());
        } else {
            num = null;
        }
        contentValues.put("filter_id", num);
        contentValues.put("property_name", e02.v());
        if (e02.A()) {
            bool = Boolean.valueOf(e02.y());
        } else {
            bool = null;
        }
        contentValues.put("session_scoped", bool);
        contentValues.put("data", c5);
        try {
            if (K().insertWithOnConflict("property_filters", null, contentValues, 5) == -1) {
                b().f13807v.c(C1154I.J(str), "Failed to insert property filter (got -1). appId");
                return false;
            }
            return true;
        } catch (SQLiteException e3) {
            b().f13807v.b(C1154I.J(str), e3, "Error storing property filter. appId");
            return false;
        }
    }

    public final boolean i0(C1168d c1168d) {
        D();
        H();
        String str = c1168d.f13984q;
        g3.n.g(str);
        if (v0(str, c1168d.f13986s.f14254r) == null && m0("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str}) >= 1000) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", c1168d.f13985r);
        contentValues.put("name", c1168d.f13986s.f14254r);
        Object a7 = c1168d.f13986s.a();
        g3.n.g(a7);
        X(contentValues, a7);
        contentValues.put("active", Boolean.valueOf(c1168d.f13988u));
        contentValues.put("trigger_event_name", c1168d.f13989v);
        contentValues.put("trigger_timeout", Long.valueOf(c1168d.f13991x));
        C();
        contentValues.put("timed_out_event", x1.t0(c1168d.f13990w));
        contentValues.put("creation_timestamp", Long.valueOf(c1168d.f13987t));
        C();
        contentValues.put("triggered_event", x1.t0(c1168d.f13992y));
        contentValues.put("triggered_timestamp", Long.valueOf(c1168d.f13986s.f14255s));
        contentValues.put("time_to_live", Long.valueOf(c1168d.f13993z));
        C();
        contentValues.put("expired_event", x1.t0(c1168d.f13983A));
        try {
            if (K().insertWithOnConflict("conditional_properties", null, contentValues, 5) == -1) {
                b().f13807v.c(C1154I.J(str), "Failed to insert/update conditional user property (got -1)");
                return true;
            }
            return true;
        } catch (SQLiteException e3) {
            C1154I b7 = b();
            b7.f13807v.b(C1154I.J(str), e3, "Error storing conditional user property");
            return true;
        }
    }

    public final boolean j0(C1190o c1190o, long j7, boolean z7) {
        D();
        H();
        String str = c1190o.f14163a;
        g3.n.c(str);
        C1160O E4 = E();
        C0411d1 E6 = C0416e1.E();
        E6.e();
        C0416e1.B(c1190o.f14166e, (C0416e1) E6.f8609r);
        r rVar = c1190o.f;
        rVar.getClass();
        Bundle bundle = rVar.f14215q;
        for (String str2 : bundle.keySet()) {
            C0426g1 F = C0431h1.F();
            F.k(str2);
            Object obj = bundle.get(str2);
            g3.n.g(obj);
            E4.c0(F, obj);
            E6.i(F);
        }
        byte[] c5 = ((C0416e1) E6.c()).c();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("name", c1190o.f14164b);
        contentValues.put("timestamp", Long.valueOf(c1190o.d));
        contentValues.put("metadata_fingerprint", Long.valueOf(j7));
        contentValues.put("data", c5);
        contentValues.put("realtime", Integer.valueOf(z7 ? 1 : 0));
        try {
            if (K().insert("raw_events", null, contentValues) == -1) {
                b().f13807v.c(C1154I.J(str), "Failed to insert raw event (got -1). appId");
                return false;
            }
            return true;
        } catch (SQLiteException e3) {
            C1154I b7 = b();
            b7.f13807v.b(C1154I.J(str), e3, "Error storing raw event. appId");
            return false;
        }
    }

    public final boolean k0(v1 v1Var) {
        D();
        H();
        String str = v1Var.f14368a;
        String str2 = v1Var.f14370c;
        v1 v02 = v0(str, str2);
        String str3 = v1Var.f14369b;
        if (v02 == null) {
            if (x1.M0(str2)) {
                if (m0("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{str}) >= Math.max(Math.min(((C1175g0) this.f2765q).f14062w.I(str, AbstractC1203v.f14272H), 100), 25)) {
                    return false;
                }
            } else if (!"_npa".equals(str2) && m0("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{str, str3}) >= 25) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", str3);
        contentValues.put("name", str2);
        contentValues.put("set_timestamp", Long.valueOf(v1Var.d));
        X(contentValues, v1Var.f14371e);
        try {
            if (K().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1) {
                b().f13807v.c(C1154I.J(str), "Failed to insert/update user property (got -1). appId");
                return true;
            }
            return true;
        } catch (SQLiteException e3) {
            C1154I b7 = b();
            b7.f13807v.b(C1154I.J(str), e3, "Error storing user property. appId");
            return true;
        }
    }

    public final long l0(String str) {
        g3.n.c(str);
        g3.n.c("first_open_count");
        D();
        H();
        SQLiteDatabase K6 = K();
        K6.beginTransaction();
        long j7 = 0;
        try {
            try {
                long O5 = O("select first_open_count from app2 where app_id=?", new String[]{str}, -1L);
                if (O5 == -1) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("app_id", str);
                    contentValues.put("first_open_count", (Integer) 0);
                    contentValues.put("previous_install_count", (Integer) 0);
                    if (K6.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                        b().f13807v.b(C1154I.J(str), "first_open_count", "Failed to insert column (got -1). appId");
                        return -1L;
                    }
                    O5 = 0;
                }
                try {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("app_id", str);
                    contentValues2.put("first_open_count", Long.valueOf(1 + O5));
                    if (K6.update("app2", contentValues2, "app_id = ?", new String[]{str}) == 0) {
                        b().f13807v.b(C1154I.J(str), "first_open_count", "Failed to update column (got 0). appId");
                        return -1L;
                    }
                    K6.setTransactionSuccessful();
                    return O5;
                } catch (SQLiteException e3) {
                    long j8 = O5;
                    e = e3;
                    j7 = j8;
                    b().f13807v.e("Error inserting column. appId", C1154I.J(str), "first_open_count", e);
                    K6.endTransaction();
                    return j7;
                }
            } finally {
                K6.endTransaction();
            }
        } catch (SQLiteException e7) {
            e = e7;
        }
    }

    public final long m0(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = K().rawQuery(str, strArr);
                if (rawQuery.moveToFirst()) {
                    long j7 = rawQuery.getLong(0);
                    rawQuery.close();
                    return j7;
                }
                throw new SQLiteException("Database returned empty set");
            } catch (SQLiteException e3) {
                b().f13807v.b(str, e3, "Database error");
                throw e3;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a1, code lost:
        b().f13807v.c(1000, "Read more than the max allowed user properties, ignoring excess");
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List n0(java.lang.String r23, java.lang.String r24, java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.C1178i.n0(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    public final void o0(String str, ArrayList arrayList) {
        g3.n.c(str);
        H();
        D();
        SQLiteDatabase K6 = K();
        try {
            long m02 = m0("select count(1) from audience_filter_values where app_id=?", new String[]{str});
            int max = Math.max(0, Math.min(2000, ((C1175g0) this.f2765q).f14062w.I(str, AbstractC1203v.f14271G)));
            if (m02 <= max) {
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                Integer num = (Integer) arrayList.get(i7);
                if (num == null) {
                    return;
                }
                arrayList2.add(Integer.toString(num.intValue()));
            }
            K6.delete("audience_filter_values", AbstractC1111a.r("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ", AbstractC1111a.r("(", TextUtils.join(",", arrayList2), ")"), " order by rowid desc limit -1 offset ?)"), new String[]{str, Integer.toString(max)});
        } catch (SQLiteException e3) {
            C1154I b7 = b();
            b7.f13807v.b(C1154I.J(str), e3, "Database error querying filters. appId");
        }
    }

    public final void p0(String str, C1198s0 c1198s0) {
        g3.n.g(str);
        g3.n.g(c1198s0);
        D();
        H();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", c1198s0.p());
        contentValues.put("consent_source", Integer.valueOf(c1198s0.f14235b));
        W(contentValues);
    }

    public final long q0(String str) {
        g3.n.c(str);
        D();
        H();
        return O("select first_open_count from app2 where app_id=?", new String[]{str}, -1L);
    }

    public final long r0(String str) {
        g3.n.c(str);
        return O("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final s3.C1168d s0(java.lang.String r28, java.lang.String r29) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.C1178i.s0(java.lang.String, java.lang.String):s3.d");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0135  */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final s3.C1197s t0(java.lang.String r29, java.lang.String r30, java.lang.String r31) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.C1178i.t0(java.lang.String, java.lang.String, java.lang.String):s3.s");
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0310 A[Catch: all -> 0x00af, SQLiteException -> 0x00b4, TryCatch #3 {SQLiteException -> 0x00b4, blocks: (B:4:0x0081, B:8:0x008b, B:9:0x008f, B:10:0x0094, B:13:0x00a4, B:21:0x00bf, B:23:0x00d2, B:26:0x00e6, B:28:0x0128, B:33:0x0132, B:37:0x017c, B:39:0x01ab, B:44:0x01b5, B:48:0x01c6, B:50:0x01cd, B:54:0x01e3, B:56:0x01ee, B:57:0x0200, B:59:0x020d, B:67:0x0248, B:69:0x0255, B:71:0x025e, B:73:0x0266, B:77:0x026f, B:81:0x0280, B:83:0x0287, B:85:0x0298, B:86:0x029e, B:90:0x02af, B:97:0x02bd, B:99:0x02da, B:100:0x02e0, B:104:0x02f1, B:106:0x02f8, B:109:0x0303, B:111:0x0310, B:113:0x0318, B:117:0x0321, B:121:0x0332, B:126:0x033d, B:134:0x0352, B:136:0x036a, B:138:0x0387, B:141:0x0391, B:144:0x03a0, B:148:0x03a9, B:150:0x03b3, B:152:0x03bb, B:153:0x03c3, B:158:0x03df, B:160:0x03e5, B:161:0x03ed, B:165:0x0407, B:167:0x0410, B:129:0x0345, B:133:0x034e, B:61:0x0217, B:63:0x0222, B:65:0x022c, B:66:0x0232, B:53:0x01df, B:36:0x0177, B:25:0x00de, B:20:0x00b8), top: B:195:0x0081 }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0345 A[Catch: all -> 0x00af, SQLiteException -> 0x00b4, TryCatch #3 {SQLiteException -> 0x00b4, blocks: (B:4:0x0081, B:8:0x008b, B:9:0x008f, B:10:0x0094, B:13:0x00a4, B:21:0x00bf, B:23:0x00d2, B:26:0x00e6, B:28:0x0128, B:33:0x0132, B:37:0x017c, B:39:0x01ab, B:44:0x01b5, B:48:0x01c6, B:50:0x01cd, B:54:0x01e3, B:56:0x01ee, B:57:0x0200, B:59:0x020d, B:67:0x0248, B:69:0x0255, B:71:0x025e, B:73:0x0266, B:77:0x026f, B:81:0x0280, B:83:0x0287, B:85:0x0298, B:86:0x029e, B:90:0x02af, B:97:0x02bd, B:99:0x02da, B:100:0x02e0, B:104:0x02f1, B:106:0x02f8, B:109:0x0303, B:111:0x0310, B:113:0x0318, B:117:0x0321, B:121:0x0332, B:126:0x033d, B:134:0x0352, B:136:0x036a, B:138:0x0387, B:141:0x0391, B:144:0x03a0, B:148:0x03a9, B:150:0x03b3, B:152:0x03bb, B:153:0x03c3, B:158:0x03df, B:160:0x03e5, B:161:0x03ed, B:165:0x0407, B:167:0x0410, B:129:0x0345, B:133:0x034e, B:61:0x0217, B:63:0x0222, B:65:0x022c, B:66:0x0232, B:53:0x01df, B:36:0x0177, B:25:0x00de, B:20:0x00b8), top: B:195:0x0081 }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0387 A[Catch: all -> 0x00af, SQLiteException -> 0x00b4, TryCatch #3 {SQLiteException -> 0x00b4, blocks: (B:4:0x0081, B:8:0x008b, B:9:0x008f, B:10:0x0094, B:13:0x00a4, B:21:0x00bf, B:23:0x00d2, B:26:0x00e6, B:28:0x0128, B:33:0x0132, B:37:0x017c, B:39:0x01ab, B:44:0x01b5, B:48:0x01c6, B:50:0x01cd, B:54:0x01e3, B:56:0x01ee, B:57:0x0200, B:59:0x020d, B:67:0x0248, B:69:0x0255, B:71:0x025e, B:73:0x0266, B:77:0x026f, B:81:0x0280, B:83:0x0287, B:85:0x0298, B:86:0x029e, B:90:0x02af, B:97:0x02bd, B:99:0x02da, B:100:0x02e0, B:104:0x02f1, B:106:0x02f8, B:109:0x0303, B:111:0x0310, B:113:0x0318, B:117:0x0321, B:121:0x0332, B:126:0x033d, B:134:0x0352, B:136:0x036a, B:138:0x0387, B:141:0x0391, B:144:0x03a0, B:148:0x03a9, B:150:0x03b3, B:152:0x03bb, B:153:0x03c3, B:158:0x03df, B:160:0x03e5, B:161:0x03ed, B:165:0x0407, B:167:0x0410, B:129:0x0345, B:133:0x034e, B:61:0x0217, B:63:0x0222, B:65:0x022c, B:66:0x0232, B:53:0x01df, B:36:0x0177, B:25:0x00de, B:20:0x00b8), top: B:195:0x0081 }] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03b3 A[Catch: all -> 0x00af, SQLiteException -> 0x00b4, TryCatch #3 {SQLiteException -> 0x00b4, blocks: (B:4:0x0081, B:8:0x008b, B:9:0x008f, B:10:0x0094, B:13:0x00a4, B:21:0x00bf, B:23:0x00d2, B:26:0x00e6, B:28:0x0128, B:33:0x0132, B:37:0x017c, B:39:0x01ab, B:44:0x01b5, B:48:0x01c6, B:50:0x01cd, B:54:0x01e3, B:56:0x01ee, B:57:0x0200, B:59:0x020d, B:67:0x0248, B:69:0x0255, B:71:0x025e, B:73:0x0266, B:77:0x026f, B:81:0x0280, B:83:0x0287, B:85:0x0298, B:86:0x029e, B:90:0x02af, B:97:0x02bd, B:99:0x02da, B:100:0x02e0, B:104:0x02f1, B:106:0x02f8, B:109:0x0303, B:111:0x0310, B:113:0x0318, B:117:0x0321, B:121:0x0332, B:126:0x033d, B:134:0x0352, B:136:0x036a, B:138:0x0387, B:141:0x0391, B:144:0x03a0, B:148:0x03a9, B:150:0x03b3, B:152:0x03bb, B:153:0x03c3, B:158:0x03df, B:160:0x03e5, B:161:0x03ed, B:165:0x0407, B:167:0x0410, B:129:0x0345, B:133:0x034e, B:61:0x0217, B:63:0x0222, B:65:0x022c, B:66:0x0232, B:53:0x01df, B:36:0x0177, B:25:0x00de, B:20:0x00b8), top: B:195:0x0081 }] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0410 A[Catch: all -> 0x00af, SQLiteException -> 0x00b4, TRY_LEAVE, TryCatch #3 {SQLiteException -> 0x00b4, blocks: (B:4:0x0081, B:8:0x008b, B:9:0x008f, B:10:0x0094, B:13:0x00a4, B:21:0x00bf, B:23:0x00d2, B:26:0x00e6, B:28:0x0128, B:33:0x0132, B:37:0x017c, B:39:0x01ab, B:44:0x01b5, B:48:0x01c6, B:50:0x01cd, B:54:0x01e3, B:56:0x01ee, B:57:0x0200, B:59:0x020d, B:67:0x0248, B:69:0x0255, B:71:0x025e, B:73:0x0266, B:77:0x026f, B:81:0x0280, B:83:0x0287, B:85:0x0298, B:86:0x029e, B:90:0x02af, B:97:0x02bd, B:99:0x02da, B:100:0x02e0, B:104:0x02f1, B:106:0x02f8, B:109:0x0303, B:111:0x0310, B:113:0x0318, B:117:0x0321, B:121:0x0332, B:126:0x033d, B:134:0x0352, B:136:0x036a, B:138:0x0387, B:141:0x0391, B:144:0x03a0, B:148:0x03a9, B:150:0x03b3, B:152:0x03bb, B:153:0x03c3, B:158:0x03df, B:160:0x03e5, B:161:0x03ed, B:165:0x0407, B:167:0x0410, B:129:0x0345, B:133:0x034e, B:61:0x0217, B:63:0x0222, B:65:0x022c, B:66:0x0232, B:53:0x01df, B:36:0x0177, B:25:0x00de, B:20:0x00b8), top: B:195:0x0081 }] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0177 A[Catch: all -> 0x00af, SQLiteException -> 0x00b4, TryCatch #3 {SQLiteException -> 0x00b4, blocks: (B:4:0x0081, B:8:0x008b, B:9:0x008f, B:10:0x0094, B:13:0x00a4, B:21:0x00bf, B:23:0x00d2, B:26:0x00e6, B:28:0x0128, B:33:0x0132, B:37:0x017c, B:39:0x01ab, B:44:0x01b5, B:48:0x01c6, B:50:0x01cd, B:54:0x01e3, B:56:0x01ee, B:57:0x0200, B:59:0x020d, B:67:0x0248, B:69:0x0255, B:71:0x025e, B:73:0x0266, B:77:0x026f, B:81:0x0280, B:83:0x0287, B:85:0x0298, B:86:0x029e, B:90:0x02af, B:97:0x02bd, B:99:0x02da, B:100:0x02e0, B:104:0x02f1, B:106:0x02f8, B:109:0x0303, B:111:0x0310, B:113:0x0318, B:117:0x0321, B:121:0x0332, B:126:0x033d, B:134:0x0352, B:136:0x036a, B:138:0x0387, B:141:0x0391, B:144:0x03a0, B:148:0x03a9, B:150:0x03b3, B:152:0x03bb, B:153:0x03c3, B:158:0x03df, B:160:0x03e5, B:161:0x03ed, B:165:0x0407, B:167:0x0410, B:129:0x0345, B:133:0x034e, B:61:0x0217, B:63:0x0222, B:65:0x022c, B:66:0x0232, B:53:0x01df, B:36:0x0177, B:25:0x00de, B:20:0x00b8), top: B:195:0x0081 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01ab A[Catch: all -> 0x00af, SQLiteException -> 0x00b4, TRY_LEAVE, TryCatch #3 {SQLiteException -> 0x00b4, blocks: (B:4:0x0081, B:8:0x008b, B:9:0x008f, B:10:0x0094, B:13:0x00a4, B:21:0x00bf, B:23:0x00d2, B:26:0x00e6, B:28:0x0128, B:33:0x0132, B:37:0x017c, B:39:0x01ab, B:44:0x01b5, B:48:0x01c6, B:50:0x01cd, B:54:0x01e3, B:56:0x01ee, B:57:0x0200, B:59:0x020d, B:67:0x0248, B:69:0x0255, B:71:0x025e, B:73:0x0266, B:77:0x026f, B:81:0x0280, B:83:0x0287, B:85:0x0298, B:86:0x029e, B:90:0x02af, B:97:0x02bd, B:99:0x02da, B:100:0x02e0, B:104:0x02f1, B:106:0x02f8, B:109:0x0303, B:111:0x0310, B:113:0x0318, B:117:0x0321, B:121:0x0332, B:126:0x033d, B:134:0x0352, B:136:0x036a, B:138:0x0387, B:141:0x0391, B:144:0x03a0, B:148:0x03a9, B:150:0x03b3, B:152:0x03bb, B:153:0x03c3, B:158:0x03df, B:160:0x03e5, B:161:0x03ed, B:165:0x0407, B:167:0x0410, B:129:0x0345, B:133:0x034e, B:61:0x0217, B:63:0x0222, B:65:0x022c, B:66:0x0232, B:53:0x01df, B:36:0x0177, B:25:0x00de, B:20:0x00b8), top: B:195:0x0081 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01df A[Catch: all -> 0x00af, SQLiteException -> 0x00b4, TryCatch #3 {SQLiteException -> 0x00b4, blocks: (B:4:0x0081, B:8:0x008b, B:9:0x008f, B:10:0x0094, B:13:0x00a4, B:21:0x00bf, B:23:0x00d2, B:26:0x00e6, B:28:0x0128, B:33:0x0132, B:37:0x017c, B:39:0x01ab, B:44:0x01b5, B:48:0x01c6, B:50:0x01cd, B:54:0x01e3, B:56:0x01ee, B:57:0x0200, B:59:0x020d, B:67:0x0248, B:69:0x0255, B:71:0x025e, B:73:0x0266, B:77:0x026f, B:81:0x0280, B:83:0x0287, B:85:0x0298, B:86:0x029e, B:90:0x02af, B:97:0x02bd, B:99:0x02da, B:100:0x02e0, B:104:0x02f1, B:106:0x02f8, B:109:0x0303, B:111:0x0310, B:113:0x0318, B:117:0x0321, B:121:0x0332, B:126:0x033d, B:134:0x0352, B:136:0x036a, B:138:0x0387, B:141:0x0391, B:144:0x03a0, B:148:0x03a9, B:150:0x03b3, B:152:0x03bb, B:153:0x03c3, B:158:0x03df, B:160:0x03e5, B:161:0x03ed, B:165:0x0407, B:167:0x0410, B:129:0x0345, B:133:0x034e, B:61:0x0217, B:63:0x0222, B:65:0x022c, B:66:0x0232, B:53:0x01df, B:36:0x0177, B:25:0x00de, B:20:0x00b8), top: B:195:0x0081 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01ee A[Catch: all -> 0x00af, SQLiteException -> 0x00b4, TryCatch #3 {SQLiteException -> 0x00b4, blocks: (B:4:0x0081, B:8:0x008b, B:9:0x008f, B:10:0x0094, B:13:0x00a4, B:21:0x00bf, B:23:0x00d2, B:26:0x00e6, B:28:0x0128, B:33:0x0132, B:37:0x017c, B:39:0x01ab, B:44:0x01b5, B:48:0x01c6, B:50:0x01cd, B:54:0x01e3, B:56:0x01ee, B:57:0x0200, B:59:0x020d, B:67:0x0248, B:69:0x0255, B:71:0x025e, B:73:0x0266, B:77:0x026f, B:81:0x0280, B:83:0x0287, B:85:0x0298, B:86:0x029e, B:90:0x02af, B:97:0x02bd, B:99:0x02da, B:100:0x02e0, B:104:0x02f1, B:106:0x02f8, B:109:0x0303, B:111:0x0310, B:113:0x0318, B:117:0x0321, B:121:0x0332, B:126:0x033d, B:134:0x0352, B:136:0x036a, B:138:0x0387, B:141:0x0391, B:144:0x03a0, B:148:0x03a9, B:150:0x03b3, B:152:0x03bb, B:153:0x03c3, B:158:0x03df, B:160:0x03e5, B:161:0x03ed, B:165:0x0407, B:167:0x0410, B:129:0x0345, B:133:0x034e, B:61:0x0217, B:63:0x0222, B:65:0x022c, B:66:0x0232, B:53:0x01df, B:36:0x0177, B:25:0x00de, B:20:0x00b8), top: B:195:0x0081 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x020d A[Catch: all -> 0x00af, SQLiteException -> 0x00b4, TryCatch #3 {SQLiteException -> 0x00b4, blocks: (B:4:0x0081, B:8:0x008b, B:9:0x008f, B:10:0x0094, B:13:0x00a4, B:21:0x00bf, B:23:0x00d2, B:26:0x00e6, B:28:0x0128, B:33:0x0132, B:37:0x017c, B:39:0x01ab, B:44:0x01b5, B:48:0x01c6, B:50:0x01cd, B:54:0x01e3, B:56:0x01ee, B:57:0x0200, B:59:0x020d, B:67:0x0248, B:69:0x0255, B:71:0x025e, B:73:0x0266, B:77:0x026f, B:81:0x0280, B:83:0x0287, B:85:0x0298, B:86:0x029e, B:90:0x02af, B:97:0x02bd, B:99:0x02da, B:100:0x02e0, B:104:0x02f1, B:106:0x02f8, B:109:0x0303, B:111:0x0310, B:113:0x0318, B:117:0x0321, B:121:0x0332, B:126:0x033d, B:134:0x0352, B:136:0x036a, B:138:0x0387, B:141:0x0391, B:144:0x03a0, B:148:0x03a9, B:150:0x03b3, B:152:0x03bb, B:153:0x03c3, B:158:0x03df, B:160:0x03e5, B:161:0x03ed, B:165:0x0407, B:167:0x0410, B:129:0x0345, B:133:0x034e, B:61:0x0217, B:63:0x0222, B:65:0x022c, B:66:0x0232, B:53:0x01df, B:36:0x0177, B:25:0x00de, B:20:0x00b8), top: B:195:0x0081 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0222 A[Catch: all -> 0x00af, SQLiteException -> 0x00b4, TryCatch #3 {SQLiteException -> 0x00b4, blocks: (B:4:0x0081, B:8:0x008b, B:9:0x008f, B:10:0x0094, B:13:0x00a4, B:21:0x00bf, B:23:0x00d2, B:26:0x00e6, B:28:0x0128, B:33:0x0132, B:37:0x017c, B:39:0x01ab, B:44:0x01b5, B:48:0x01c6, B:50:0x01cd, B:54:0x01e3, B:56:0x01ee, B:57:0x0200, B:59:0x020d, B:67:0x0248, B:69:0x0255, B:71:0x025e, B:73:0x0266, B:77:0x026f, B:81:0x0280, B:83:0x0287, B:85:0x0298, B:86:0x029e, B:90:0x02af, B:97:0x02bd, B:99:0x02da, B:100:0x02e0, B:104:0x02f1, B:106:0x02f8, B:109:0x0303, B:111:0x0310, B:113:0x0318, B:117:0x0321, B:121:0x0332, B:126:0x033d, B:134:0x0352, B:136:0x036a, B:138:0x0387, B:141:0x0391, B:144:0x03a0, B:148:0x03a9, B:150:0x03b3, B:152:0x03bb, B:153:0x03c3, B:158:0x03df, B:160:0x03e5, B:161:0x03ed, B:165:0x0407, B:167:0x0410, B:129:0x0345, B:133:0x034e, B:61:0x0217, B:63:0x0222, B:65:0x022c, B:66:0x0232, B:53:0x01df, B:36:0x0177, B:25:0x00de, B:20:0x00b8), top: B:195:0x0081 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0255 A[Catch: all -> 0x00af, SQLiteException -> 0x00b4, TryCatch #3 {SQLiteException -> 0x00b4, blocks: (B:4:0x0081, B:8:0x008b, B:9:0x008f, B:10:0x0094, B:13:0x00a4, B:21:0x00bf, B:23:0x00d2, B:26:0x00e6, B:28:0x0128, B:33:0x0132, B:37:0x017c, B:39:0x01ab, B:44:0x01b5, B:48:0x01c6, B:50:0x01cd, B:54:0x01e3, B:56:0x01ee, B:57:0x0200, B:59:0x020d, B:67:0x0248, B:69:0x0255, B:71:0x025e, B:73:0x0266, B:77:0x026f, B:81:0x0280, B:83:0x0287, B:85:0x0298, B:86:0x029e, B:90:0x02af, B:97:0x02bd, B:99:0x02da, B:100:0x02e0, B:104:0x02f1, B:106:0x02f8, B:109:0x0303, B:111:0x0310, B:113:0x0318, B:117:0x0321, B:121:0x0332, B:126:0x033d, B:134:0x0352, B:136:0x036a, B:138:0x0387, B:141:0x0391, B:144:0x03a0, B:148:0x03a9, B:150:0x03b3, B:152:0x03bb, B:153:0x03c3, B:158:0x03df, B:160:0x03e5, B:161:0x03ed, B:165:0x0407, B:167:0x0410, B:129:0x0345, B:133:0x034e, B:61:0x0217, B:63:0x0222, B:65:0x022c, B:66:0x0232, B:53:0x01df, B:36:0x0177, B:25:0x00de, B:20:0x00b8), top: B:195:0x0081 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02da A[Catch: all -> 0x00af, SQLiteException -> 0x00b4, TRY_LEAVE, TryCatch #3 {SQLiteException -> 0x00b4, blocks: (B:4:0x0081, B:8:0x008b, B:9:0x008f, B:10:0x0094, B:13:0x00a4, B:21:0x00bf, B:23:0x00d2, B:26:0x00e6, B:28:0x0128, B:33:0x0132, B:37:0x017c, B:39:0x01ab, B:44:0x01b5, B:48:0x01c6, B:50:0x01cd, B:54:0x01e3, B:56:0x01ee, B:57:0x0200, B:59:0x020d, B:67:0x0248, B:69:0x0255, B:71:0x025e, B:73:0x0266, B:77:0x026f, B:81:0x0280, B:83:0x0287, B:85:0x0298, B:86:0x029e, B:90:0x02af, B:97:0x02bd, B:99:0x02da, B:100:0x02e0, B:104:0x02f1, B:106:0x02f8, B:109:0x0303, B:111:0x0310, B:113:0x0318, B:117:0x0321, B:121:0x0332, B:126:0x033d, B:134:0x0352, B:136:0x036a, B:138:0x0387, B:141:0x0391, B:144:0x03a0, B:148:0x03a9, B:150:0x03b3, B:152:0x03bb, B:153:0x03c3, B:158:0x03df, B:160:0x03e5, B:161:0x03ed, B:165:0x0407, B:167:0x0410, B:129:0x0345, B:133:0x034e, B:61:0x0217, B:63:0x0222, B:65:0x022c, B:66:0x0232, B:53:0x01df, B:36:0x0177, B:25:0x00de, B:20:0x00b8), top: B:195:0x0081 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final s3.C1146A u0(java.lang.String r52) {
        /*
            Method dump skipped, instructions count: 1104
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.C1178i.u0(java.lang.String):s3.A");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final s3.v1 v0(java.lang.String r11, java.lang.String r12) {
        /*
            r10 = this;
            g3.n.c(r11)
            g3.n.c(r12)
            r10.D()
            r10.H()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r10.K()     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L72
            java.lang.String r2 = "user_attributes"
            java.lang.String r3 = "set_timestamp"
            java.lang.String r4 = "value"
            java.lang.String r5 = "origin"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4, r5}     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L72
            java.lang.String r4 = "app_id=? and name=?"
            java.lang.String[] r5 = new java.lang.String[]{r11, r12}     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L72
            r8 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L72
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            if (r2 != 0) goto L34
            r1.close()
            return r0
        L34:
            r2 = 0
            long r7 = r1.getLong(r2)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            r2 = 1
            java.lang.Object r9 = r10.P(r1, r2)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            if (r9 != 0) goto L44
            r1.close()
            return r0
        L44:
            r2 = 2
            java.lang.String r5 = r1.getString(r2)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            s3.v1 r2 = new s3.v1     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            r3 = r2
            r4 = r11
            r6 = r12
            r3.<init>(r4, r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            boolean r3 = r1.moveToNext()     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            if (r3 == 0) goto L6c
            s3.I r3 = r10.b()     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            l6.b r3 = r3.f13807v     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            java.lang.String r4 = "Got multiple records for user property, expected one. appId"
            s3.N r5 = s3.C1154I.J(r11)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            r3.c(r5, r4)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            goto L6c
        L67:
            r11 = move-exception
            r0 = r1
            goto L93
        L6a:
            r2 = move-exception
            goto L74
        L6c:
            r1.close()
            return r2
        L70:
            r11 = move-exception
            goto L93
        L72:
            r2 = move-exception
            r1 = r0
        L74:
            s3.I r3 = r10.b()     // Catch: java.lang.Throwable -> L67
            l6.b r3 = r3.f13807v     // Catch: java.lang.Throwable -> L67
            java.lang.String r4 = "Error querying user property. appId"
            s3.N r11 = s3.C1154I.J(r11)     // Catch: java.lang.Throwable -> L67
            java.lang.Object r5 = r10.f2765q     // Catch: java.lang.Throwable -> L67
            s3.g0 r5 = (s3.C1175g0) r5     // Catch: java.lang.Throwable -> L67
            s3.H r5 = r5.f14036C     // Catch: java.lang.Throwable -> L67
            java.lang.String r12 = r5.g(r12)     // Catch: java.lang.Throwable -> L67
            r3.e(r4, r11, r12, r2)     // Catch: java.lang.Throwable -> L67
            if (r1 == 0) goto L92
            r1.close()
        L92:
            return r0
        L93:
            if (r0 == 0) goto L98
            r0.close()
        L98:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.C1178i.v0(java.lang.String, java.lang.String):s3.v1");
    }

    public final C1198s0 w0(String str) {
        g3.n.g(str);
        D();
        H();
        return C1198s0.d(R("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new String[]{str}), 100);
    }

    public final void x0(String str, String str2) {
        g3.n.c(str);
        g3.n.c(str2);
        D();
        H();
        try {
            K().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e3) {
            C1154I b7 = b();
            b7.f13807v.e("Error deleting user property. appId", C1154I.J(str), ((C1175g0) this.f2765q).f14036C.g(str2), e3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
        if (r5 == null) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final s3.C1198s0 y0(java.lang.String r5) {
        /*
            r4 = this;
            g3.n.g(r5)
            r4.D()
            r4.H()
            java.lang.String r0 = "select consent_state, consent_source from consent_settings where app_id=? limit 1;"
            java.lang.String[] r5 = new java.lang.String[]{r5}
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r4.K()     // Catch: java.lang.Throwable -> L41 android.database.sqlite.SQLiteException -> L43
            android.database.Cursor r5 = r2.rawQuery(r0, r5)     // Catch: java.lang.Throwable -> L41 android.database.sqlite.SQLiteException -> L43
            boolean r0 = r5.moveToFirst()     // Catch: java.lang.Throwable -> L2d android.database.sqlite.SQLiteException -> L30
            if (r0 != 0) goto L32
            s3.I r0 = r4.b()     // Catch: java.lang.Throwable -> L2d android.database.sqlite.SQLiteException -> L30
            l6.b r0 = r0.f13803D     // Catch: java.lang.Throwable -> L2d android.database.sqlite.SQLiteException -> L30
            java.lang.String r2 = "No data found"
            r0.d(r2)     // Catch: java.lang.Throwable -> L2d android.database.sqlite.SQLiteException -> L30
        L29:
            r5.close()
            goto L53
        L2d:
            r0 = move-exception
            r1 = r5
            goto L59
        L30:
            r0 = move-exception
            goto L45
        L32:
            r0 = 0
            java.lang.String r0 = r5.getString(r0)     // Catch: java.lang.Throwable -> L2d android.database.sqlite.SQLiteException -> L30
            r2 = 1
            int r2 = r5.getInt(r2)     // Catch: java.lang.Throwable -> L2d android.database.sqlite.SQLiteException -> L30
            s3.s0 r1 = s3.C1198s0.d(r0, r2)     // Catch: java.lang.Throwable -> L2d android.database.sqlite.SQLiteException -> L30
            goto L29
        L41:
            r0 = move-exception
            goto L59
        L43:
            r0 = move-exception
            r5 = r1
        L45:
            s3.I r2 = r4.b()     // Catch: java.lang.Throwable -> L2d
            l6.b r2 = r2.f13807v     // Catch: java.lang.Throwable -> L2d
            java.lang.String r3 = "Error querying database."
            r2.c(r0, r3)     // Catch: java.lang.Throwable -> L2d
            if (r5 == 0) goto L53
            goto L29
        L53:
            if (r1 != 0) goto L58
            s3.s0 r5 = s3.C1198s0.f14233c
            return r5
        L58:
            return r1
        L59:
            if (r1 == 0) goto L5e
            r1.close()
        L5e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.C1178i.y0(java.lang.String):s3.s0");
    }

    public final void z0(String str, String str2) {
        g3.n.c(str2);
        D();
        H();
        try {
            K().delete(str, "app_id=?", new String[]{str2});
        } catch (SQLiteException e3) {
            C1154I b7 = b();
            b7.f13807v.b(C1154I.J(str2), e3, "Error deleting snapshot. appId");
        }
    }
}
