package h6;

import java.util.LinkedHashMap;
import java.util.Map;
import z5.C1524f;
/* loaded from: classes.dex */
public final class B {

    /* renamed from: a  reason: collision with root package name */
    public final t f11070a;

    /* renamed from: b  reason: collision with root package name */
    public final String f11071b;

    /* renamed from: c  reason: collision with root package name */
    public final r f11072c;
    public final E d;

    /* renamed from: e  reason: collision with root package name */
    public final Map f11073e;
    public C0753c f;

    public B(t tVar, String str, r rVar, E e3, Map map) {
        M5.g.f(str, "method");
        this.f11070a = tVar;
        this.f11071b = str;
        this.f11072c = rVar;
        this.d = e3;
        this.f11073e = map;
    }

    public final C0753c a() {
        C0753c c0753c = this.f;
        if (c0753c == null) {
            C0753c c0753c2 = C0753c.n;
            C0753c x02 = android.support.v4.media.session.b.x0(this.f11072c);
            this.f = x02;
            return x02;
        }
        return c0753c;
    }

    public final H.e b() {
        LinkedHashMap P6;
        H.e eVar = new H.e(false);
        eVar.f781v = new LinkedHashMap();
        eVar.f778s = this.f11070a;
        eVar.f777r = this.f11071b;
        eVar.f780u = this.d;
        Map map = this.f11073e;
        if (map.isEmpty()) {
            P6 = new LinkedHashMap();
        } else {
            P6 = A5.w.P(map);
        }
        eVar.f781v = P6;
        eVar.f779t = this.f11072c.g();
        return eVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{method=");
        sb.append(this.f11071b);
        sb.append(", url=");
        sb.append(this.f11070a);
        r rVar = this.f11072c;
        if (rVar.size() != 0) {
            sb.append(", headers=[");
            int i7 = 0;
            for (Object obj : rVar) {
                int i8 = i7 + 1;
                if (i7 >= 0) {
                    C1524f c1524f = (C1524f) obj;
                    String str = (String) c1524f.f16468q;
                    String str2 = (String) c1524f.f16469r;
                    if (i7 > 0) {
                        sb.append(", ");
                    }
                    sb.append(str);
                    sb.append(':');
                    sb.append(str2);
                    i7 = i8;
                } else {
                    A5.l.O();
                    throw null;
                }
            }
            sb.append(']');
        }
        Map map = this.f11073e;
        if (!map.isEmpty()) {
            sb.append(", tags=");
            sb.append(map);
        }
        sb.append('}');
        String sb2 = sb.toString();
        M5.g.e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
