package c3;

import M2.g;
import android.net.Uri;
import android.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class c extends Thread {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f7263q = 1;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ Object f7264r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g gVar) {
        super("ExoPlayer:SimpleDecoder");
        this.f7264r = gVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        StringBuilder sb;
        switch (this.f7263q) {
            case 0:
                Uri.Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
                Map map = (Map) this.f7264r;
                for (String str : map.keySet()) {
                    buildUpon.appendQueryParameter(str, (String) map.get(str));
                }
                String uri = buildUpon.build().toString();
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri).openConnection();
                    try {
                        int responseCode = httpURLConnection.getResponseCode();
                        if (responseCode < 200 || responseCode >= 300) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(uri).length() + 65);
                            sb2.append("Received non-success response code ");
                            sb2.append(responseCode);
                            sb2.append(" from pinging URL: ");
                            sb2.append(uri);
                            Log.w("HttpUrlPinger", sb2.toString());
                        }
                        httpURLConnection.disconnect();
                        return;
                    } catch (Throwable th) {
                        httpURLConnection.disconnect();
                        throw th;
                    }
                } catch (IOException e3) {
                    e = e3;
                    String message = e.getMessage();
                    sb = new StringBuilder(String.valueOf(message).length() + String.valueOf(uri).length() + 27);
                    sb.append("Error while pinging URL: ");
                    sb.append(uri);
                    sb.append(". ");
                    sb.append(message);
                    Log.w("HttpUrlPinger", sb.toString(), e);
                    return;
                } catch (IndexOutOfBoundsException e7) {
                    e = e7;
                    String message2 = e.getMessage();
                    sb = new StringBuilder(String.valueOf(message2).length() + String.valueOf(uri).length() + 32);
                    sb.append("Error while parsing ping URL: ");
                    sb.append(uri);
                    sb.append(". ");
                    sb.append(message2);
                    Log.w("HttpUrlPinger", sb.toString(), e);
                    return;
                } catch (RuntimeException e8) {
                    e = e8;
                    String message3 = e.getMessage();
                    sb = new StringBuilder(String.valueOf(message3).length() + String.valueOf(uri).length() + 27);
                    sb.append("Error while pinging URL: ");
                    sb.append(uri);
                    sb.append(". ");
                    sb.append(message3);
                    Log.w("HttpUrlPinger", sb.toString(), e);
                    return;
                } finally {
                }
            default:
                g gVar = (g) this.f7264r;
                gVar.getClass();
                do {
                    try {
                    } catch (InterruptedException e9) {
                        throw new IllegalStateException(e9);
                    }
                } while (gVar.h());
                return;
        }
    }

    public c(HashMap hashMap) {
        this.f7264r = hashMap;
    }
}
