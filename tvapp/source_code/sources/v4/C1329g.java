package v4;

import android.util.Log;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import u4.AbstractC1284h;
import z4.C1518b;
/* renamed from: v4.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1329g {

    /* renamed from: b  reason: collision with root package name */
    public static final Charset f15334b = Charset.forName("UTF-8");

    /* renamed from: a  reason: collision with root package name */
    public final C1518b f15335a;

    public C1329g(C1518b c1518b) {
        this.f15335a = c1518b;
    }

    public static HashMap a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String str2 = null;
            if (!jSONObject.isNull(next)) {
                str2 = jSONObject.optString(next, null);
            }
            hashMap.put(next, str2);
        }
        return hashMap;
    }

    public static ArrayList b(String str) {
        String str2;
        JSONArray jSONArray = new JSONObject(str).getJSONArray("rolloutsState");
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < jSONArray.length(); i7++) {
            String string = jSONArray.getString(i7);
            try {
                T4.c cVar = AbstractC1335m.f15353a;
                JSONObject jSONObject = new JSONObject(string);
                String string2 = jSONObject.getString("rolloutId");
                String string3 = jSONObject.getString("parameterKey");
                String string4 = jSONObject.getString("parameterValue");
                String string5 = jSONObject.getString("variantId");
                long j7 = jSONObject.getLong("templateVersion");
                if (string4.length() > 256) {
                    str2 = string4.substring(0, 256);
                } else {
                    str2 = string4;
                }
                arrayList.add(new C1324b(string2, string3, str2, string5, j7));
            } catch (Exception e3) {
                Log.w("FirebaseCrashlytics", "Failed de-serializing rollouts state. " + string, e3);
            }
        }
        return arrayList;
    }

    public static String e(List list) {
        HashMap hashMap = new HashMap();
        JSONArray jSONArray = new JSONArray();
        for (int i7 = 0; i7 < list.size(); i7++) {
            try {
                jSONArray.put(new JSONObject(AbstractC1335m.f15353a.L(list.get(i7))));
            } catch (JSONException e3) {
                Log.w("FirebaseCrashlytics", "Exception parsing rollout assignment!", e3);
            }
        }
        hashMap.put("rolloutsState", jSONArray);
        return new JSONObject(hashMap).toString();
    }

    public static void f(File file) {
        if (file.exists() && file.delete()) {
            Log.i("FirebaseCrashlytics", "Deleted corrupt file: " + file.getAbsolutePath(), null);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [long] */
    public final Map c(String str, boolean z7) {
        File n;
        FileInputStream fileInputStream;
        Exception e3;
        C1518b c1518b = this.f15335a;
        if (z7) {
            n = c1518b.n(str, "internal-keys");
        } else {
            n = c1518b.n(str, "keys");
        }
        if (n.exists()) {
            ?? length = n.length();
            if (length != 0) {
                Closeable closeable = null;
                try {
                    try {
                        fileInputStream = new FileInputStream(n);
                        try {
                            HashMap a7 = a(AbstractC1284h.j(fileInputStream));
                            AbstractC1284h.c(fileInputStream, "Failed to close user metadata file.");
                            return a7;
                        } catch (Exception e7) {
                            e3 = e7;
                            Log.w("FirebaseCrashlytics", "Error deserializing user metadata.", e3);
                            f(n);
                            AbstractC1284h.c(fileInputStream, "Failed to close user metadata file.");
                            return Collections.emptyMap();
                        }
                    } catch (Throwable th) {
                        th = th;
                        closeable = length;
                        AbstractC1284h.c(closeable, "Failed to close user metadata file.");
                        throw th;
                    }
                } catch (Exception e8) {
                    fileInputStream = null;
                    e3 = e8;
                } catch (Throwable th2) {
                    th = th2;
                    AbstractC1284h.c(closeable, "Failed to close user metadata file.");
                    throw th;
                }
            }
        }
        f(n);
        return Collections.emptyMap();
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    public final String d(String str) {
        FileInputStream fileInputStream;
        String str2;
        File n = this.f15335a.n(str, "user-data");
        Closeable closeable = null;
        if (n.exists()) {
            ?? r3 = (n.length() > 0L ? 1 : (n.length() == 0L ? 0 : -1));
            try {
                if (r3 != 0) {
                    try {
                        fileInputStream = new FileInputStream(n);
                        try {
                            JSONObject jSONObject = new JSONObject(AbstractC1284h.j(fileInputStream));
                            if (!jSONObject.isNull("userId")) {
                                str2 = jSONObject.optString("userId", null);
                            } else {
                                str2 = null;
                            }
                            String str3 = "Loaded userId " + str2 + " for session " + str;
                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                Log.d("FirebaseCrashlytics", str3, null);
                            }
                            AbstractC1284h.c(fileInputStream, "Failed to close user metadata file.");
                            return str2;
                        } catch (Exception e3) {
                            e = e3;
                            Log.w("FirebaseCrashlytics", "Error deserializing user metadata.", e);
                            f(n);
                            AbstractC1284h.c(fileInputStream, "Failed to close user metadata file.");
                            return null;
                        }
                    } catch (Exception e7) {
                        e = e7;
                        fileInputStream = null;
                    } catch (Throwable th) {
                        th = th;
                        AbstractC1284h.c(closeable, "Failed to close user metadata file.");
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                closeable = r3;
            }
        }
        String x7 = AbstractC0515y1.x("No userId set for session ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", x7, null);
        }
        f(n);
        return null;
    }

    public final void g(String str, Map map, boolean z7) {
        File n;
        String jSONObject;
        BufferedWriter bufferedWriter;
        C1518b c1518b = this.f15335a;
        if (z7) {
            n = c1518b.n(str, "internal-keys");
        } else {
            n = c1518b.n(str, "keys");
        }
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                jSONObject = new JSONObject(map).toString();
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(n), f15334b));
            } catch (Exception e3) {
                e = e3;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            bufferedWriter.write(jSONObject);
            bufferedWriter.flush();
            AbstractC1284h.c(bufferedWriter, "Failed to close key/value metadata file.");
        } catch (Exception e7) {
            e = e7;
            bufferedWriter2 = bufferedWriter;
            Log.w("FirebaseCrashlytics", "Error serializing key/value metadata.", e);
            f(n);
            AbstractC1284h.c(bufferedWriter2, "Failed to close key/value metadata file.");
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            AbstractC1284h.c(bufferedWriter2, "Failed to close key/value metadata file.");
            throw th;
        }
    }

    public final void h(String str, List list) {
        String e3;
        BufferedWriter bufferedWriter;
        File n = this.f15335a.n(str, "rollouts-state");
        if (list.isEmpty()) {
            f(n);
            return;
        }
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                e3 = e(list);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(n), f15334b));
            } catch (Exception e7) {
                e = e7;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            bufferedWriter.write(e3);
            bufferedWriter.flush();
            AbstractC1284h.c(bufferedWriter, "Failed to close rollouts state file.");
        } catch (Exception e8) {
            e = e8;
            bufferedWriter2 = bufferedWriter;
            Log.w("FirebaseCrashlytics", "Error serializing rollouts state.", e);
            f(n);
            AbstractC1284h.c(bufferedWriter2, "Failed to close rollouts state file.");
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            AbstractC1284h.c(bufferedWriter2, "Failed to close rollouts state file.");
            throw th;
        }
    }

    public final void i(String str, String str2) {
        String obj;
        BufferedWriter bufferedWriter;
        File n = this.f15335a.n(str, "user-data");
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("userId", str2);
                obj = jSONObject.toString();
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(n), f15334b));
            } catch (Exception e3) {
                e = e3;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            bufferedWriter.write(obj);
            bufferedWriter.flush();
            AbstractC1284h.c(bufferedWriter, "Failed to close user metadata file.");
        } catch (Exception e7) {
            e = e7;
            bufferedWriter2 = bufferedWriter;
            Log.w("FirebaseCrashlytics", "Error serializing user metadata.", e);
            AbstractC1284h.c(bufferedWriter2, "Failed to close user metadata file.");
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            AbstractC1284h.c(bufferedWriter2, "Failed to close user metadata file.");
            throw th;
        }
    }
}
