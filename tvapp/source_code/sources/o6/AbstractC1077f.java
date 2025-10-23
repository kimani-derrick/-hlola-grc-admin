package o6;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import v6.C1344i;
/* renamed from: o6.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1077f {

    /* renamed from: a  reason: collision with root package name */
    public static final C1074c[] f13012a;

    /* renamed from: b  reason: collision with root package name */
    public static final Map f13013b;

    static {
        C1074c c1074c = new C1074c(C1074c.f12996i, "");
        C1344i c1344i = C1074c.f;
        C1074c c1074c2 = new C1074c(c1344i, "GET");
        C1074c c1074c3 = new C1074c(c1344i, "POST");
        C1344i c1344i2 = C1074c.f12994g;
        C1074c c1074c4 = new C1074c(c1344i2, "/");
        C1074c c1074c5 = new C1074c(c1344i2, "/index.html");
        C1344i c1344i3 = C1074c.f12995h;
        C1074c c1074c6 = new C1074c(c1344i3, "http");
        C1074c c1074c7 = new C1074c(c1344i3, "https");
        C1344i c1344i4 = C1074c.f12993e;
        int i7 = 0;
        C1074c[] c1074cArr = {c1074c, c1074c2, c1074c3, c1074c4, c1074c5, c1074c6, c1074c7, new C1074c(c1344i4, "200"), new C1074c(c1344i4, "204"), new C1074c(c1344i4, "206"), new C1074c(c1344i4, "304"), new C1074c(c1344i4, "400"), new C1074c(c1344i4, "404"), new C1074c(c1344i4, "500"), new C1074c("accept-charset", ""), new C1074c("accept-encoding", "gzip, deflate"), new C1074c("accept-language", ""), new C1074c("accept-ranges", ""), new C1074c("accept", ""), new C1074c("access-control-allow-origin", ""), new C1074c("age", ""), new C1074c("allow", ""), new C1074c("authorization", ""), new C1074c("cache-control", ""), new C1074c("content-disposition", ""), new C1074c("content-encoding", ""), new C1074c("content-language", ""), new C1074c("content-length", ""), new C1074c("content-location", ""), new C1074c("content-range", ""), new C1074c("content-type", ""), new C1074c("cookie", ""), new C1074c("date", ""), new C1074c("etag", ""), new C1074c("expect", ""), new C1074c("expires", ""), new C1074c("from", ""), new C1074c("host", ""), new C1074c("if-match", ""), new C1074c("if-modified-since", ""), new C1074c("if-none-match", ""), new C1074c("if-range", ""), new C1074c("if-unmodified-since", ""), new C1074c("last-modified", ""), new C1074c("link", ""), new C1074c("location", ""), new C1074c("max-forwards", ""), new C1074c("proxy-authenticate", ""), new C1074c("proxy-authorization", ""), new C1074c("range", ""), new C1074c("referer", ""), new C1074c("refresh", ""), new C1074c("retry-after", ""), new C1074c("server", ""), new C1074c("set-cookie", ""), new C1074c("strict-transport-security", ""), new C1074c("transfer-encoding", ""), new C1074c("user-agent", ""), new C1074c("vary", ""), new C1074c("via", ""), new C1074c("www-authenticate", "")};
        f13012a = c1074cArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        while (i7 < 61) {
            int i8 = i7 + 1;
            if (!linkedHashMap.containsKey(c1074cArr[i7].f12997a)) {
                linkedHashMap.put(c1074cArr[i7].f12997a, Integer.valueOf(i7));
            }
            i7 = i8;
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        M5.g.e(unmodifiableMap, "unmodifiableMap(result)");
        f13013b = unmodifiableMap;
    }

    public static void a(C1344i c1344i) {
        M5.g.f(c1344i, "name");
        int d = c1344i.d();
        int i7 = 0;
        while (i7 < d) {
            int i8 = i7 + 1;
            byte i9 = c1344i.i(i7);
            if (65 <= i9 && i9 <= 90) {
                throw new IOException(M5.g.k(c1344i.q(), "PROTOCOL_ERROR response malformed: mixed case name: "));
            }
            i7 = i8;
        }
    }
}
