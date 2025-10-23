package V4;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class g {

    /* renamed from: h  reason: collision with root package name */
    public static final Date f3677h = new Date(0);

    /* renamed from: a  reason: collision with root package name */
    public final JSONObject f3678a;

    /* renamed from: b  reason: collision with root package name */
    public final JSONObject f3679b;

    /* renamed from: c  reason: collision with root package name */
    public final Date f3680c;
    public final JSONArray d;

    /* renamed from: e  reason: collision with root package name */
    public final JSONObject f3681e;
    public final long f;

    /* renamed from: g  reason: collision with root package name */
    public final JSONArray f3682g;

    public g(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2, long j7, JSONArray jSONArray2) {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("configs_key", jSONObject);
        jSONObject3.put("fetch_time_key", date.getTime());
        jSONObject3.put("abt_experiments_key", jSONArray);
        jSONObject3.put("personalization_metadata_key", jSONObject2);
        jSONObject3.put("template_version_number_key", j7);
        jSONObject3.put("rollout_metadata_key", jSONArray2);
        this.f3679b = jSONObject;
        this.f3680c = date;
        this.d = jSONArray;
        this.f3681e = jSONObject2;
        this.f = j7;
        this.f3682g = jSONArray2;
        this.f3678a = jSONObject3;
    }

    public static g a(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("personalization_metadata_key");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        JSONObject jSONObject2 = optJSONObject;
        JSONArray optJSONArray = jSONObject.optJSONArray("rollout_metadata_key");
        if (optJSONArray == null) {
            optJSONArray = new JSONArray();
        }
        return new g(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"), jSONObject2, jSONObject.optLong("template_version_number_key"), optJSONArray);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [V4.f, java.lang.Object] */
    public static f c() {
        ?? obj = new Object();
        obj.f3673a = new JSONObject();
        obj.f3674b = f3677h;
        obj.f3675c = new JSONArray();
        obj.d = new JSONObject();
        obj.f3676e = 0L;
        obj.f = new JSONArray();
        return obj;
    }

    public final HashMap b() {
        HashMap hashMap = new HashMap();
        int i7 = 0;
        while (true) {
            JSONArray jSONArray = this.f3682g;
            if (i7 < jSONArray.length()) {
                JSONObject jSONObject = jSONArray.getJSONObject(i7);
                String string = jSONObject.getString("rolloutId");
                String string2 = jSONObject.getString("variantId");
                JSONArray jSONArray2 = jSONObject.getJSONArray("affectedParameterKeys");
                for (int i8 = 0; i8 < jSONArray2.length(); i8++) {
                    String string3 = jSONArray2.getString(i8);
                    if (!hashMap.containsKey(string3)) {
                        hashMap.put(string3, new HashMap());
                    }
                    Map map = (Map) hashMap.get(string3);
                    if (map != null) {
                        map.put(string, string2);
                    }
                }
                i7++;
            } else {
                return hashMap;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        return this.f3678a.toString().equals(((g) obj).f3678a.toString());
    }

    public final int hashCode() {
        return this.f3678a.hashCode();
    }

    public final String toString() {
        return this.f3678a.toString();
    }
}
