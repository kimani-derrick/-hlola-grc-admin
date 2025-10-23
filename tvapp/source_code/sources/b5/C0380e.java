package b5;

import H2.C0002c;
import L5.p;
import W5.InterfaceC0116x;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLConnection;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import k3.AbstractC0958a;
import org.json.JSONObject;
import z5.C1530l;
/* renamed from: b5.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0380e extends F5.i implements p {

    /* renamed from: u  reason: collision with root package name */
    public int f7143u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ C0002c f7144v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Map f7145w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ p f7146x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ p f7147y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0380e(C0002c c0002c, Map map, p pVar, p pVar2, D5.d dVar) {
        super(2, dVar);
        this.f7144v = c0002c;
        this.f7145w = map;
        this.f7146x = pVar;
        this.f7147y = pVar2;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new C0380e(this.f7144v, this.f7145w, this.f7146x, this.f7147y, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((C0380e) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        E5.a aVar = E5.a.f612q;
        int i7 = this.f7143u;
        p pVar = this.f7147y;
        try {
            if (i7 != 0) {
                if (i7 != 1 && i7 != 2) {
                    if (i7 == 3) {
                        AbstractC0958a.H(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC0958a.H(obj);
                }
            } else {
                AbstractC0958a.H(obj);
                URLConnection openConnection = C0002c.j(this.f7144v).openConnection();
                M5.g.d(openConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) openConnection;
                httpsURLConnection.setRequestMethod("GET");
                httpsURLConnection.setRequestProperty("Accept", "application/json");
                for (Map.Entry entry : this.f7145w.entrySet()) {
                    httpsURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                int responseCode = httpsURLConnection.getResponseCode();
                if (responseCode == 200) {
                    InputStream inputStream = httpsURLConnection.getInputStream();
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        sb.append(readLine);
                    }
                    bufferedReader.close();
                    inputStream.close();
                    JSONObject jSONObject = new JSONObject(sb.toString());
                    p pVar2 = this.f7146x;
                    this.f7143u = 1;
                    if (pVar2.j(jSONObject, this) == aVar) {
                        return aVar;
                    }
                } else {
                    String str = "Bad response code: " + responseCode;
                    this.f7143u = 2;
                    if (pVar.j(str, this) == aVar) {
                        return aVar;
                    }
                }
            }
        } catch (Exception e3) {
            String message = e3.getMessage();
            if (message == null) {
                message = e3.toString();
            }
            this.f7143u = 3;
            if (pVar.j(message, this) == aVar) {
                return aVar;
            }
        }
        return C1530l.f16479a;
    }
}
