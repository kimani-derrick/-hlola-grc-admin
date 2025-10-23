package s3;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.SystemClock;
import com.google.android.gms.internal.measurement.Y3;
import j3.C0837a;
/* renamed from: s3.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1182k extends SQLiteOpenHelper {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f14099q = 1;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ P1.c f14100r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1182k(C1178i c1178i, Context context) {
        super(context, "google_app_measurement.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.f14100r = c1178i;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        switch (this.f14099q) {
            case 0:
                C1178i c1178i = (C1178i) this.f14100r;
                M2.e eVar = c1178i.f14086u;
                if (eVar.f2260r != 0) {
                    ((C0837a) eVar.f2261s).getClass();
                    if (SystemClock.elapsedRealtime() - eVar.f2260r < 3600000) {
                        throw new SQLiteException("Database open failed");
                    }
                }
                try {
                    return super.getWritableDatabase();
                } catch (SQLiteException unused) {
                    M2.e eVar2 = c1178i.f14086u;
                    ((C0837a) eVar2.f2261s).getClass();
                    eVar2.f2260r = SystemClock.elapsedRealtime();
                    c1178i.b().f13807v.d("Opening the database failed, dropping and recreating it");
                    if (!((C1175g0) c1178i.f2765q).f14056q.getDatabasePath("google_app_measurement.db").delete()) {
                        c1178i.b().f13807v.c("google_app_measurement.db", "Failed to delete corrupted db file");
                    }
                    try {
                        SQLiteDatabase writableDatabase = super.getWritableDatabase();
                        eVar2.f2260r = 0L;
                        return writableDatabase;
                    } catch (SQLiteException e3) {
                        c1178i.b().f13807v.c(e3, "Failed to open freshly created database");
                        throw e3;
                    }
                }
            default:
                try {
                    return super.getWritableDatabase();
                } catch (SQLiteDatabaseLockedException e7) {
                    throw e7;
                } catch (SQLiteException unused2) {
                    C1152G c1152g = (C1152G) this.f14100r;
                    c1152g.b().f13807v.d("Opening the local database failed, dropping and recreating it");
                    if (!((C1175g0) c1152g.f2765q).f14056q.getDatabasePath("google_app_measurement_local.db").delete()) {
                        c1152g.b().f13807v.c("google_app_measurement_local.db", "Failed to delete corrupted local db file");
                    }
                    try {
                        return super.getWritableDatabase();
                    } catch (SQLiteException e8) {
                        c1152g.b().f13807v.c(e8, "Failed to open local database. Events will bypass local storage");
                        return null;
                    }
                }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        switch (this.f14099q) {
            case 0:
                AbstractC1204v0.f(((C1178i) this.f14100r).b(), sQLiteDatabase);
                return;
            default:
                AbstractC1204v0.f(((C1152G) this.f14100r).b(), sQLiteDatabase);
                return;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i7, int i8) {
        int i9 = this.f14099q;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        switch (this.f14099q) {
            case 0:
                C1178i c1178i = (C1178i) this.f14100r;
                AbstractC1204v0.g(c1178i.b(), sQLiteDatabase, "events", "CREATE TABLE IF NOT EXISTS events ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp", C1178i.f14080v);
                AbstractC1204v0.g(c1178i.b(), sQLiteDatabase, "events_snapshot", "CREATE TABLE IF NOT EXISTS events_snapshot ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, last_bundled_timestamp INTEGER, last_bundled_day INTEGER, last_sampled_complex_event_id INTEGER, last_sampling_rate INTEGER, last_exempt_from_sampling INTEGER, current_session_count INTEGER, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp,last_bundled_timestamp,last_bundled_day,last_sampled_complex_event_id,last_sampling_rate,last_exempt_from_sampling,current_session_count", null);
                AbstractC1204v0.g(c1178i.b(), sQLiteDatabase, "conditional_properties", "CREATE TABLE IF NOT EXISTS conditional_properties ( app_id TEXT NOT NULL, origin TEXT NOT NULL, name TEXT NOT NULL, value BLOB NOT NULL, creation_timestamp INTEGER NOT NULL, active INTEGER NOT NULL, trigger_event_name TEXT, trigger_timeout INTEGER NOT NULL, timed_out_event BLOB,triggered_event BLOB, triggered_timestamp INTEGER NOT NULL, time_to_live INTEGER NOT NULL, expired_event BLOB, PRIMARY KEY (app_id, name)) ;", "app_id,origin,name,value,active,trigger_event_name,trigger_timeout,creation_timestamp,timed_out_event,triggered_event,triggered_timestamp,time_to_live,expired_event", null);
                AbstractC1204v0.g(c1178i.b(), sQLiteDatabase, "user_attributes", "CREATE TABLE IF NOT EXISTS user_attributes ( app_id TEXT NOT NULL, name TEXT NOT NULL, set_timestamp INTEGER NOT NULL, value BLOB NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,set_timestamp,value", C1178i.f14081w);
                AbstractC1204v0.g(c1178i.b(), sQLiteDatabase, "apps", "CREATE TABLE IF NOT EXISTS apps ( app_id TEXT NOT NULL, app_instance_id TEXT, gmp_app_id TEXT, resettable_device_id_hash TEXT, last_bundle_index INTEGER NOT NULL, last_bundle_end_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id)) ;", "app_id,app_instance_id,gmp_app_id,resettable_device_id_hash,last_bundle_index,last_bundle_end_timestamp", C1178i.f14082x);
                AbstractC1204v0.g(c1178i.b(), sQLiteDatabase, "queue", "CREATE TABLE IF NOT EXISTS queue ( app_id TEXT NOT NULL, bundle_end_timestamp INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,bundle_end_timestamp,data", C1178i.f14084z);
                AbstractC1204v0.g(c1178i.b(), sQLiteDatabase, "raw_events_metadata", "CREATE TABLE IF NOT EXISTS raw_events_metadata ( app_id TEXT NOT NULL, metadata_fingerprint INTEGER NOT NULL, metadata BLOB NOT NULL, PRIMARY KEY (app_id, metadata_fingerprint));", "app_id,metadata_fingerprint,metadata", null);
                AbstractC1204v0.g(c1178i.b(), sQLiteDatabase, "raw_events", "CREATE TABLE IF NOT EXISTS raw_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, timestamp INTEGER NOT NULL, metadata_fingerprint INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,name,timestamp,metadata_fingerprint,data", C1178i.f14083y);
                AbstractC1204v0.g(c1178i.b(), sQLiteDatabase, "event_filters", "CREATE TABLE IF NOT EXISTS event_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, event_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, event_name, audience_id, filter_id));", "app_id,audience_id,filter_id,event_name,data", C1178i.f14075A);
                AbstractC1204v0.g(c1178i.b(), sQLiteDatabase, "property_filters", "CREATE TABLE IF NOT EXISTS property_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, property_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, property_name, audience_id, filter_id));", "app_id,audience_id,filter_id,property_name,data", C1178i.f14076B);
                AbstractC1204v0.g(c1178i.b(), sQLiteDatabase, "audience_filter_values", "CREATE TABLE IF NOT EXISTS audience_filter_values ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, current_results BLOB, PRIMARY KEY (app_id, audience_id));", "app_id,audience_id,current_results", null);
                AbstractC1204v0.g(c1178i.b(), sQLiteDatabase, "app2", "CREATE TABLE IF NOT EXISTS app2 ( app_id TEXT NOT NULL, first_open_count INTEGER NOT NULL, PRIMARY KEY (app_id));", "app_id,first_open_count", C1178i.f14077C);
                AbstractC1204v0.g(c1178i.b(), sQLiteDatabase, "main_event_params", "CREATE TABLE IF NOT EXISTS main_event_params ( app_id TEXT NOT NULL, event_id TEXT NOT NULL, children_to_process INTEGER NOT NULL, main_event BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,event_id,children_to_process,main_event", null);
                AbstractC1204v0.g(c1178i.b(), sQLiteDatabase, "default_event_params", "CREATE TABLE IF NOT EXISTS default_event_params ( app_id TEXT NOT NULL, parameters BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,parameters", null);
                AbstractC1204v0.g(c1178i.b(), sQLiteDatabase, "consent_settings", "CREATE TABLE IF NOT EXISTS consent_settings ( app_id TEXT NOT NULL, consent_state TEXT NOT NULL, PRIMARY KEY (app_id));", "app_id,consent_state", C1178i.f14078D);
                Y3.a();
                AbstractC1204v0.g(c1178i.b(), sQLiteDatabase, "trigger_uris", "CREATE TABLE IF NOT EXISTS trigger_uris ( app_id TEXT NOT NULL, trigger_uri TEXT NOT NULL, timestamp_millis INTEGER NOT NULL, source INTEGER NOT NULL);", "app_id,trigger_uri,source,timestamp_millis", C1178i.f14079E);
                return;
            default:
                AbstractC1204v0.g(((C1152G) this.f14100r).b(), sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", null);
                return;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i7, int i8) {
        int i9 = this.f14099q;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1182k(C1152G c1152g, Context context) {
        super(context, "google_app_measurement_local.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.f14100r = c1152g;
    }

    private final void a(SQLiteDatabase sQLiteDatabase, int i7, int i8) {
    }

    private final void b(SQLiteDatabase sQLiteDatabase, int i7, int i8) {
    }

    private final void f(SQLiteDatabase sQLiteDatabase, int i7, int i8) {
    }

    private final void h(SQLiteDatabase sQLiteDatabase, int i7, int i8) {
    }
}
