package P4;

import android.content.Context;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import h4.h;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class c {
    public static final Pattern d = Pattern.compile("[0-9]+s");

    /* renamed from: e  reason: collision with root package name */
    public static final Charset f2805e = Charset.forName("UTF-8");

    /* renamed from: a  reason: collision with root package name */
    public final Context f2806a;

    /* renamed from: b  reason: collision with root package name */
    public final M4.b f2807b;

    /* renamed from: c  reason: collision with root package name */
    public final d f2808c = new d();

    public c(Context context, M4.b bVar) {
        this.f2806a = context;
        this.f2807b = bVar;
    }

    public static URL a(String str) {
        try {
            return new URL("https://firebaseinstallations.googleapis.com/v1/" + str);
        } catch (MalformedURLException e3) {
            throw new h(e3.getMessage());
        }
    }

    public static void b(HttpURLConnection httpURLConnection, String str, String str2, String str3) {
        String x7;
        InputStream errorStream = httpURLConnection.getErrorStream();
        String str4 = null;
        if (errorStream != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, f2805e));
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                    sb.append('\n');
                }
                str4 = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb);
            } catch (IOException unused) {
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (IOException unused2) {
                }
                throw th;
            }
            try {
                bufferedReader.close();
            } catch (IOException unused3) {
            }
        }
        if (!TextUtils.isEmpty(str4)) {
            Log.w("Firebase-Installations", str4);
            if (TextUtils.isEmpty(str)) {
                x7 = "";
            } else {
                x7 = AbstractC0515y1.x(", ", str);
            }
            Log.w("Firebase-Installations", "Firebase options used while communicating with Firebase server APIs: " + str2 + ", " + str3 + x7);
        }
    }

    public static long d(String str) {
        if (d.matcher(str).matches()) {
            if (str != null && str.length() != 0) {
                return Long.parseLong(str.substring(0, str.length() - 1));
            }
            return 0L;
        }
        throw new IllegalArgumentException("Invalid Expiration Timestamp.");
    }

    public static a e(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f2805e));
        C.d a7 = b.a();
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        b bVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("name")) {
                str = jsonReader.nextString();
            } else if (nextName.equals("fid")) {
                str2 = jsonReader.nextString();
            } else if (nextName.equals("refreshToken")) {
                str3 = jsonReader.nextString();
            } else if (nextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if (nextName2.equals("token")) {
                        a7.f325s = jsonReader.nextString();
                    } else if (nextName2.equals("expiresIn")) {
                        a7.f326t = Long.valueOf(d(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                b b7 = a7.b();
                jsonReader.endObject();
                bVar = b7;
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return new a(str, str2, str3, bVar, 1);
    }

    public static b f(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f2805e));
        C.d a7 = b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("token")) {
                a7.f325s = jsonReader.nextString();
            } else if (nextName.equals("expiresIn")) {
                a7.f326t = Long.valueOf(d(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        a7.f324r = 1;
        return a7.b();
    }

    public static void g(HttpURLConnection httpURLConnection, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:17.2.0");
            i(httpURLConnection, jSONObject.toString().getBytes("UTF-8"));
        } catch (JSONException e3) {
            throw new IllegalStateException(e3);
        }
    }

    public static void h(HttpURLConnection httpURLConnection) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:17.2.0");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            i(httpURLConnection, jSONObject2.toString().getBytes("UTF-8"));
        } catch (JSONException e3) {
            throw new IllegalStateException(e3);
        }
    }

    public static void i(URLConnection uRLConnection, byte[] bArr) {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream != null) {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
            try {
                gZIPOutputStream.write(bArr);
                try {
                    return;
                } catch (IOException unused) {
                    return;
                }
            } finally {
                try {
                    gZIPOutputStream.close();
                    outputStream.close();
                } catch (IOException unused2) {
                }
            }
        }
        throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0072 A[Catch: NameNotFoundException -> 0x0086, TryCatch #0 {NameNotFoundException -> 0x0086, blocks: (B:15:0x0068, B:17:0x0072, B:20:0x0088), top: B:28:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0088 A[Catch: NameNotFoundException -> 0x0086, TRY_LEAVE, TryCatch #0 {NameNotFoundException -> 0x0086, blocks: (B:15:0x0068, B:17:0x0072, B:20:0x0088), top: B:28:0x0068 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.net.HttpURLConnection c(java.net.URL r7, java.lang.String r8) {
        /*
            r6 = this;
            java.lang.String r0 = "Failed to get heartbeats header"
            java.net.URLConnection r7 = r7.openConnection()     // Catch: java.io.IOException -> Lad
            java.net.HttpURLConnection r7 = (java.net.HttpURLConnection) r7     // Catch: java.io.IOException -> Lad
            r1 = 10000(0x2710, float:1.4013E-41)
            r7.setConnectTimeout(r1)
            r2 = 0
            r7.setUseCaches(r2)
            r7.setReadTimeout(r1)
            java.lang.String r1 = "Content-Type"
            java.lang.String r2 = "application/json"
            r7.addRequestProperty(r1, r2)
            java.lang.String r1 = "Accept"
            r7.addRequestProperty(r1, r2)
            java.lang.String r1 = "Content-Encoding"
            java.lang.String r2 = "gzip"
            r7.addRequestProperty(r1, r2)
            java.lang.String r1 = "Cache-Control"
            java.lang.String r2 = "no-cache"
            r7.addRequestProperty(r1, r2)
            android.content.Context r1 = r6.f2806a
            java.lang.String r2 = r1.getPackageName()
            java.lang.String r3 = "X-Android-Package"
            r7.addRequestProperty(r3, r2)
            M4.b r2 = r6.f2807b
            java.lang.Object r2 = r2.get()
            L4.g r2 = (L4.g) r2
            java.lang.String r3 = "ContentValues"
            if (r2 == 0) goto L65
            java.lang.String r4 = "x-firebase-client"
            L4.e r2 = (L4.e) r2     // Catch: java.lang.InterruptedException -> L57 java.util.concurrent.ExecutionException -> L59
            t3.o r2 = r2.a()     // Catch: java.lang.InterruptedException -> L57 java.util.concurrent.ExecutionException -> L59
            java.lang.Object r2 = m3.g.a(r2)     // Catch: java.lang.InterruptedException -> L57 java.util.concurrent.ExecutionException -> L59
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.InterruptedException -> L57 java.util.concurrent.ExecutionException -> L59
            r7.addRequestProperty(r4, r2)     // Catch: java.lang.InterruptedException -> L57 java.util.concurrent.ExecutionException -> L59
            goto L65
        L57:
            r2 = move-exception
            goto L5b
        L59:
            r2 = move-exception
            goto L62
        L5b:
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            r4.interrupt()
        L62:
            android.util.Log.w(r3, r0, r2)
        L65:
            java.lang.String r0 = "Could not get fingerprint hash for package: "
            r2 = 0
            java.lang.String r4 = r1.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L86
            byte[] r4 = j3.AbstractC0838b.c(r1, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L86
            if (r4 != 0) goto L88
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L86
            r4.<init>(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L86
            java.lang.String r0 = r1.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L86
            r4.append(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L86
            java.lang.String r0 = r4.toString()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L86
            android.util.Log.e(r3, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L86
            goto La2
        L86:
            r0 = move-exception
            goto L8d
        L88:
            java.lang.String r2 = j3.AbstractC0838b.a(r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L86
            goto La2
        L8d:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "No such package: "
            r4.<init>(r5)
            java.lang.String r1 = r1.getPackageName()
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            android.util.Log.e(r3, r1, r0)
        La2:
            java.lang.String r0 = "X-Android-Cert"
            r7.addRequestProperty(r0, r2)
            java.lang.String r0 = "x-goog-api-key"
            r7.addRequestProperty(r0, r8)
            return r7
        Lad:
            N4.f r7 = new N4.f
            java.lang.String r8 = "Firebase Installations Service is unavailable. Please try again later."
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: P4.c.c(java.net.URL, java.lang.String):java.net.HttpURLConnection");
    }
}
