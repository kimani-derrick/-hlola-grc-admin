package V4;

import android.content.SharedPreferences;
import java.util.Date;
/* loaded from: classes.dex */
public final class n {

    /* renamed from: e  reason: collision with root package name */
    public static final Date f3707e = new Date(-1);
    public static final Date f = new Date(-1);

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f3708a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f3709b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public final Object f3710c = new Object();
    public final Object d = new Object();

    public n(SharedPreferences sharedPreferences) {
        this.f3708a = sharedPreferences;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, V4.m] */
    public final m a() {
        ?? obj;
        synchronized (this.f3710c) {
            int i7 = this.f3708a.getInt("num_failed_fetches", 0);
            Date date = new Date(this.f3708a.getLong("backoff_end_time_in_millis", -1L));
            obj = new Object();
            obj.f3705a = i7;
            obj.f3706b = date;
        }
        return obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, V4.m] */
    public final m b() {
        ?? obj;
        synchronized (this.d) {
            int i7 = this.f3708a.getInt("num_failed_realtime_streams", 0);
            Date date = new Date(this.f3708a.getLong("realtime_backoff_end_time_in_millis", -1L));
            obj = new Object();
            obj.f3705a = i7;
            obj.f3706b = date;
        }
        return obj;
    }

    public final void c(int i7, Date date) {
        synchronized (this.f3710c) {
            this.f3708a.edit().putInt("num_failed_fetches", i7).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    public final void d(String str) {
        synchronized (this.f3709b) {
            this.f3708a.edit().putString("last_fetch_etag", str).apply();
        }
    }

    public final void e(int i7, Date date) {
        synchronized (this.d) {
            this.f3708a.edit().putInt("num_failed_realtime_streams", i7).putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    public final void f() {
        synchronized (this.f3709b) {
            this.f3708a.edit().putInt("last_fetch_status", 1).apply();
        }
    }

    public final void g() {
        synchronized (this.f3709b) {
            this.f3708a.edit().putInt("last_fetch_status", 2).apply();
        }
    }
}
