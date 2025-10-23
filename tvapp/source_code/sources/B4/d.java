package B4;

import android.util.Log;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.io.Serializable;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
import s.h;
import u4.C1288l;
import w4.C;
import w4.K;
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public Object f264a;

    /* renamed from: b  reason: collision with root package name */
    public Object f265b;

    /* renamed from: c  reason: collision with root package name */
    public Object f266c;
    public Object d;

    /* renamed from: e  reason: collision with root package name */
    public Object f267e;
    public Object f;

    /* renamed from: g  reason: collision with root package name */
    public Object f268g;

    /* renamed from: h  reason: collision with root package name */
    public Serializable f269h;

    /* renamed from: i  reason: collision with root package name */
    public Object f270i;

    public static void e(JSONObject jSONObject, String str) {
        String str2 = str + jSONObject.toString();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str2, null);
        }
    }

    public C a() {
        String str;
        if (((Integer) this.f264a) == null) {
            str = " pid";
        } else {
            str = "";
        }
        if (((String) this.f265b) == null) {
            str = str.concat(" processName");
        }
        if (((Integer) this.f266c) == null) {
            str = AbstractC0515y1.m(str, " reasonCode");
        }
        if (((Integer) this.d) == null) {
            str = AbstractC0515y1.m(str, " importance");
        }
        if (((Long) this.f267e) == null) {
            str = AbstractC0515y1.m(str, " pss");
        }
        if (((Long) this.f) == null) {
            str = AbstractC0515y1.m(str, " rss");
        }
        if (((Long) this.f268g) == null) {
            str = AbstractC0515y1.m(str, " timestamp");
        }
        if (str.isEmpty()) {
            return new C(((Integer) this.f264a).intValue(), (String) this.f265b, ((Integer) this.f266c).intValue(), ((Integer) this.d).intValue(), ((Long) this.f267e).longValue(), ((Long) this.f).longValue(), ((Long) this.f268g).longValue(), (String) this.f269h, (List) this.f270i);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public K b() {
        String str;
        if (((Integer) this.f264a) == null) {
            str = " arch";
        } else {
            str = "";
        }
        if (((String) this.f265b) == null) {
            str = str.concat(" model");
        }
        if (((Integer) this.f266c) == null) {
            str = AbstractC0515y1.m(str, " cores");
        }
        if (((Long) this.d) == null) {
            str = AbstractC0515y1.m(str, " ram");
        }
        if (((Long) this.f267e) == null) {
            str = AbstractC0515y1.m(str, " diskSpace");
        }
        if (((Boolean) this.f) == null) {
            str = AbstractC0515y1.m(str, " simulator");
        }
        if (((Integer) this.f268g) == null) {
            str = AbstractC0515y1.m(str, " state");
        }
        if (((String) this.f269h) == null) {
            str = AbstractC0515y1.m(str, " manufacturer");
        }
        if (((String) this.f270i) == null) {
            str = AbstractC0515y1.m(str, " modelClass");
        }
        if (str.isEmpty()) {
            return new K(((Integer) this.f264a).intValue(), (String) this.f265b, ((Integer) this.f266c).intValue(), ((Long) this.d).longValue(), ((Long) this.f267e).longValue(), ((Boolean) this.f).booleanValue(), ((Integer) this.f268g).intValue(), (String) this.f269h, (String) this.f270i);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public c c(int i7) {
        c cVar = null;
        try {
            if (!h.a(2, i7)) {
                JSONObject U6 = ((T4.c) this.f267e).U();
                if (U6 != null) {
                    c T6 = ((T4.c) this.f266c).T(U6);
                    e(U6, "Loaded cached settings: ");
                    ((C1288l) this.d).getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (!h.a(3, i7) && T6.f262c < currentTimeMillis) {
                        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                            Log.v("FirebaseCrashlytics", "Cached settings have expired.", null);
                        }
                    } else {
                        try {
                            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                Log.v("FirebaseCrashlytics", "Returning cached settings.", null);
                            }
                            cVar = T6;
                        } catch (Exception e3) {
                            e = e3;
                            cVar = T6;
                            Log.e("FirebaseCrashlytics", "Failed to get cached settings", e);
                            return cVar;
                        }
                    }
                } else if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "No cached settings data found.", null);
                }
            }
        } catch (Exception e7) {
            e = e7;
        }
        return cVar;
    }

    public c d() {
        return (c) ((AtomicReference) this.f269h).get();
    }
}
