package J3;

import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.util.List;
import w4.B;
import w4.C0;
import w4.D0;
import w4.E0;
import w4.H;
import w4.h0;
import w4.k0;
import w4.m0;
import w4.n0;
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public Object f1373a = new i();

    /* renamed from: b  reason: collision with root package name */
    public Object f1374b = new i();

    /* renamed from: c  reason: collision with root package name */
    public Object f1375c = new i();
    public Object d = new i();

    /* renamed from: e  reason: collision with root package name */
    public Object f1376e = new a(0.0f);
    public Object f = new a(0.0f);

    /* renamed from: g  reason: collision with root package name */
    public Object f1377g = new a(0.0f);

    /* renamed from: h  reason: collision with root package name */
    public Object f1378h = new a(0.0f);

    /* renamed from: i  reason: collision with root package name */
    public Object f1379i = new e(0);

    /* renamed from: j  reason: collision with root package name */
    public Object f1380j = new e(0);

    /* renamed from: k  reason: collision with root package name */
    public Object f1381k = new e(0);

    /* renamed from: l  reason: collision with root package name */
    public Object f1382l = new e(0);

    public static void d(m3.g gVar) {
        if (gVar instanceof i) {
            return;
        }
        boolean z7 = gVar instanceof d;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [J3.k, java.lang.Object] */
    public k a() {
        ?? obj = new Object();
        obj.f1383a = (m3.g) this.f1373a;
        obj.f1384b = (m3.g) this.f1374b;
        obj.f1385c = (m3.g) this.f1375c;
        obj.d = (m3.g) this.d;
        obj.f1386e = (c) this.f1376e;
        obj.f = (c) this.f;
        obj.f1387g = (c) this.f1377g;
        obj.f1388h = (c) this.f1378h;
        obj.f1389i = (e) this.f1379i;
        obj.f1390j = (e) this.f1380j;
        obj.f1391k = (e) this.f1381k;
        obj.f1392l = (e) this.f1382l;
        return obj;
    }

    public B b() {
        String str;
        if (((String) this.f1373a) == null) {
            str = " sdkVersion";
        } else {
            str = "";
        }
        if (((String) this.f1374b) == null) {
            str = str.concat(" gmpAppId");
        }
        if (((Integer) this.f1375c) == null) {
            str = AbstractC0515y1.m(str, " platform");
        }
        if (((String) this.d) == null) {
            str = AbstractC0515y1.m(str, " installationUuid");
        }
        if (((String) this.f1378h) == null) {
            str = AbstractC0515y1.m(str, " buildVersion");
        }
        if (((String) this.f1379i) == null) {
            str = AbstractC0515y1.m(str, " displayVersion");
        }
        if (str.isEmpty()) {
            return new B((String) this.f1373a, (String) this.f1374b, ((Integer) this.f1375c).intValue(), (String) this.d, (String) this.f1376e, (String) this.f, (String) this.f1377g, (String) this.f1378h, (String) this.f1379i, (E0) this.f1380j, (k0) this.f1381k, (h0) this.f1382l);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public H c() {
        String str;
        if (((String) this.f1373a) == null) {
            str = " generator";
        } else {
            str = "";
        }
        if (((String) this.f1374b) == null) {
            str = str.concat(" identifier");
        }
        if (((Long) this.d) == null) {
            str = AbstractC0515y1.m(str, " startedAt");
        }
        if (((Boolean) this.f) == null) {
            str = AbstractC0515y1.m(str, " crashed");
        }
        if (((m0) this.f1377g) == null) {
            str = AbstractC0515y1.m(str, " app");
        }
        if (((Integer) this.f1382l) == null) {
            str = AbstractC0515y1.m(str, " generatorType");
        }
        if (str.isEmpty()) {
            return new H((String) this.f1373a, (String) this.f1374b, (String) this.f1375c, ((Long) this.d).longValue(), (Long) this.f1376e, ((Boolean) this.f).booleanValue(), (m0) this.f1377g, (D0) this.f1378h, (C0) this.f1379i, (n0) this.f1380j, (List) this.f1381k, ((Integer) this.f1382l).intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
