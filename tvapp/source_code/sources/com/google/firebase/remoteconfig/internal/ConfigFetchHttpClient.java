package com.google.firebase.remoteconfig.internal;

import B.a;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import h4.h;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class ConfigFetchHttpClient {

    /* renamed from: h  reason: collision with root package name */
    public static final Pattern f9175h = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* renamed from: a  reason: collision with root package name */
    public final Context f9176a;

    /* renamed from: b  reason: collision with root package name */
    public final String f9177b;

    /* renamed from: c  reason: collision with root package name */
    public final String f9178c;
    public final String d;

    /* renamed from: e  reason: collision with root package name */
    public final String f9179e;
    public final long f;

    /* renamed from: g  reason: collision with root package name */
    public final long f9180g;

    public ConfigFetchHttpClient(Context context, String str, String str2, long j7, long j8) {
        String str3;
        this.f9176a = context;
        this.f9177b = str;
        this.f9178c = str2;
        Matcher matcher = f9175h.matcher(str);
        if (matcher.matches()) {
            str3 = matcher.group(1);
        } else {
            str3 = null;
        }
        this.d = str3;
        this.f9179e = "firebase";
        this.f = j7;
        this.f9180g = j8;
    }

    public static JSONObject c(URLConnection uRLConnection) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(uRLConnection.getInputStream(), "utf-8"));
        StringBuilder sb = new StringBuilder();
        while (true) {
            int read = bufferedReader.read();
            if (read != -1) {
                sb.append((char) read);
            } else {
                return new JSONObject(sb.toString());
            }
        }
    }

    public static void d(HttpURLConnection httpURLConnection, byte[] bArr) {
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bArr);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    public final JSONObject a(String str, String str2, Map map, Long l7) {
        long j7;
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("appInstanceId", str);
            hashMap.put("appInstanceIdToken", str2);
            hashMap.put("appId", this.f9177b);
            Context context = this.f9176a;
            Locale locale = context.getResources().getConfiguration().locale;
            hashMap.put("countryCode", locale.getCountry());
            int i7 = Build.VERSION.SDK_INT;
            hashMap.put("languageCode", locale.toLanguageTag());
            hashMap.put("platformVersion", Integer.toString(i7));
            hashMap.put("timeZone", TimeZone.getDefault().getID());
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                if (packageInfo != null) {
                    hashMap.put("appVersion", packageInfo.versionName);
                    if (i7 >= 28) {
                        j7 = a.b(packageInfo);
                    } else {
                        j7 = packageInfo.versionCode;
                    }
                    hashMap.put("appBuild", Long.toString(j7));
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            hashMap.put("packageName", context.getPackageName());
            hashMap.put("sdkVersion", "22.0.0");
            hashMap.put("analyticsUserProperties", new JSONObject(map));
            if (l7 != null) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                hashMap.put("firstOpenTime", simpleDateFormat.format(l7));
            }
            return new JSONObject(hashMap);
        }
        throw new h("Fetch failed: Firebase installation id is null.");
    }

    public final HttpURLConnection b() {
        try {
            String str = this.d;
            String str2 = this.f9179e;
            return (HttpURLConnection) new URL("https://firebaseremoteconfig.googleapis.com/v1/projects/" + str + "/namespaces/" + str2 + ":fetch").openConnection();
        } catch (IOException e3) {
            throw new h(e3.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a3 A[LOOP:0: B:13:0x009d->B:15:0x00a3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00da A[Catch: all -> 0x01a3, IOException | JSONException -> 0x01a5, IOException -> 0x01a7, TRY_LEAVE, TryCatch #3 {all -> 0x01a3, blocks: (B:17:0x00be, B:19:0x00da, B:68:0x01a9, B:69:0x01b2, B:70:0x01b3, B:71:0x01ba), top: B:88:0x00be }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01a9 A[Catch: all -> 0x01a3, IOException | JSONException -> 0x01a5, IOException -> 0x01a7, TRY_ENTER, TryCatch #3 {all -> 0x01a3, blocks: (B:17:0x00be, B:19:0x00da, B:68:0x01a9, B:69:0x01b2, B:70:0x01b3, B:71:0x01ba), top: B:88:0x00be }] */
    @androidx.annotation.Keep
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public V4.j fetch(java.net.HttpURLConnection r14, java.lang.String r15, java.lang.String r16, java.util.Map<java.lang.String, java.lang.String> r17, java.lang.String r18, java.util.Map<java.lang.String, java.lang.String> r19, java.lang.Long r20, java.util.Date r21) {
        /*
            Method dump skipped, instructions count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient.fetch(java.net.HttpURLConnection, java.lang.String, java.lang.String, java.util.Map, java.lang.String, java.util.Map, java.lang.Long, java.util.Date):V4.j");
    }
}
