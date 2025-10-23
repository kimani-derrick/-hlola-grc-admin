package q6;

import A5.w;
import h6.z;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public static final CopyOnWriteArraySet f13398a = new CopyOnWriteArraySet();

    /* renamed from: b  reason: collision with root package name */
    public static final Map f13399b;

    static {
        String name;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r22 = z.class.getPackage();
        if (r22 == null) {
            name = null;
        } else {
            name = r22.getName();
        }
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(z.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(o6.g.class.getName(), "okhttp.Http2");
        linkedHashMap.put(k6.d.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f13399b = w.N(linkedHashMap);
    }
}
