package L4;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2136a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e f2137b;

    public /* synthetic */ d(e eVar, int i7) {
        this.f2136a = i7;
        this.f2137b = eVar;
    }

    private final Object a() {
        String byteArrayOutputStream;
        e eVar = this.f2137b;
        synchronized (eVar) {
            try {
                i iVar = (i) eVar.f2138a.get();
                ArrayList c5 = iVar.c();
                iVar.b();
                JSONArray jSONArray = new JSONArray();
                for (int i7 = 0; i7 < c5.size(); i7++) {
                    a aVar = (a) c5.get(i7);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("agent", aVar.f2129a);
                    jSONObject.put("dates", new JSONArray((Collection) aVar.f2130b));
                    jSONArray.put(jSONObject);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("heartbeats", jSONArray);
                jSONObject2.put("version", "2");
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                gZIPOutputStream.close();
                base64OutputStream.close();
                byteArrayOutputStream = byteArrayOutputStream2.toString("UTF-8");
            } catch (Throwable th) {
                throw th;
            }
        }
        return byteArrayOutputStream;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        T4.c cVar;
        switch (this.f2136a) {
            case 0:
                return a();
            default:
                e eVar = this.f2137b;
                synchronized (eVar) {
                    i iVar = (i) eVar.f2138a.get();
                    long currentTimeMillis = System.currentTimeMillis();
                    T4.b bVar = (T4.b) eVar.f2140c.get();
                    boolean isEmpty = bVar.f3379b.M().isEmpty();
                    String str = bVar.f3378a;
                    if (!isEmpty) {
                        str = str + ' ' + T4.b.a(cVar.M());
                    }
                    iVar.g(currentTimeMillis, str);
                }
                return null;
        }
    }
}
