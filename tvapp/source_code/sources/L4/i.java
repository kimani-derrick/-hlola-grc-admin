package L4;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f2143a;

    public i(Context context, String str) {
        this.f2143a = context.getSharedPreferences("FirebaseHeartBeat" + str, 0);
    }

    public final synchronized void a() {
        try {
            long j7 = this.f2143a.getLong("fire-count", 0L);
            String str = "";
            String str2 = null;
            for (Map.Entry<String, ?> entry : this.f2143a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    for (String str3 : (Set) entry.getValue()) {
                        if (str2 != null && str2.compareTo(str3) <= 0) {
                        }
                        str = entry.getKey();
                        str2 = str3;
                    }
                }
            }
            HashSet hashSet = new HashSet(this.f2143a.getStringSet(str, new HashSet()));
            hashSet.remove(str2);
            this.f2143a.edit().putStringSet(str, hashSet).putLong("fire-count", j7 - 1).commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b() {
        try {
            SharedPreferences.Editor edit = this.f2143a.edit();
            int i7 = 0;
            for (Map.Entry<String, ?> entry : this.f2143a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    String d = d(System.currentTimeMillis());
                    String key = entry.getKey();
                    if (((Set) entry.getValue()).contains(d)) {
                        HashSet hashSet = new HashSet();
                        hashSet.add(d);
                        i7++;
                        edit.putStringSet(key, hashSet);
                    } else {
                        edit.remove(key);
                    }
                }
            }
            if (i7 == 0) {
                edit.remove("fire-count");
            } else {
                edit.putLong("fire-count", i7);
            }
            edit.commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized ArrayList c() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (Map.Entry<String, ?> entry : this.f2143a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(d(System.currentTimeMillis()));
                    if (!hashSet.isEmpty()) {
                        arrayList.add(new a(entry.getKey(), new ArrayList(hashSet)));
                    }
                }
            }
            h(System.currentTimeMillis());
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public final synchronized String d(long j7) {
        Instant instant;
        ZoneOffset zoneOffset;
        OffsetDateTime atOffset;
        LocalDateTime localDateTime;
        DateTimeFormatter dateTimeFormatter;
        String format;
        if (Build.VERSION.SDK_INT >= 26) {
            instant = new Date(j7).toInstant();
            zoneOffset = ZoneOffset.UTC;
            atOffset = instant.atOffset(zoneOffset);
            localDateTime = atOffset.toLocalDateTime();
            dateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE;
            format = localDateTime.format(dateTimeFormatter);
            return format;
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j7));
    }

    public final synchronized String e(String str) {
        for (Map.Entry<String, ?> entry : this.f2143a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                for (String str2 : (Set) entry.getValue()) {
                    if (str.equals(str2)) {
                        return entry.getKey();
                    }
                }
                continue;
            }
        }
        return null;
    }

    public final synchronized void f(String str) {
        SharedPreferences.Editor putStringSet;
        try {
            String e3 = e(str);
            if (e3 == null) {
                return;
            }
            HashSet hashSet = new HashSet(this.f2143a.getStringSet(e3, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                putStringSet = this.f2143a.edit().remove(e3);
            } else {
                putStringSet = this.f2143a.edit().putStringSet(e3, hashSet);
            }
            putStringSet.commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void g(long j7, String str) {
        String d = d(j7);
        if (this.f2143a.getString("last-used-date", "").equals(d)) {
            String e3 = e(d);
            if (e3 == null) {
                return;
            }
            if (e3.equals(str)) {
                return;
            }
            i(str, d);
            return;
        }
        long j8 = this.f2143a.getLong("fire-count", 0L);
        if (j8 + 1 == 30) {
            a();
            j8 = this.f2143a.getLong("fire-count", 0L);
        }
        HashSet hashSet = new HashSet(this.f2143a.getStringSet(str, new HashSet()));
        hashSet.add(d);
        this.f2143a.edit().putStringSet(str, hashSet).putLong("fire-count", j8 + 1).putString("last-used-date", d).commit();
    }

    public final synchronized void h(long j7) {
        this.f2143a.edit().putLong("fire-global", j7).commit();
    }

    public final synchronized void i(String str, String str2) {
        f(str2);
        HashSet hashSet = new HashSet(this.f2143a.getStringSet(str, new HashSet()));
        hashSet.add(str2);
        this.f2143a.edit().putStringSet(str, hashSet).commit();
    }
}
