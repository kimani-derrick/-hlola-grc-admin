package x6;

import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class K {

    /* renamed from: l  reason: collision with root package name */
    public static final char[] f16243l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: m  reason: collision with root package name */
    public static final Pattern f16244m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* renamed from: a  reason: collision with root package name */
    public final String f16245a;

    /* renamed from: b  reason: collision with root package name */
    public final h6.t f16246b;

    /* renamed from: c  reason: collision with root package name */
    public String f16247c;
    public h6.s d;

    /* renamed from: e  reason: collision with root package name */
    public final H.e f16248e = new H.e(6);
    public final h6.q f;

    /* renamed from: g  reason: collision with root package name */
    public h6.v f16249g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f16250h;

    /* renamed from: i  reason: collision with root package name */
    public final g5.b f16251i;

    /* renamed from: j  reason: collision with root package name */
    public final androidx.fragment.app.D f16252j;

    /* renamed from: k  reason: collision with root package name */
    public h6.E f16253k;

    public K(String str, h6.t tVar, String str2, h6.r rVar, h6.v vVar, boolean z7, boolean z8, boolean z9) {
        h6.q qVar;
        this.f16245a = str;
        this.f16246b = tVar;
        this.f16247c = str2;
        this.f16249g = vVar;
        this.f16250h = z7;
        if (rVar != null) {
            qVar = rVar.g();
        } else {
            qVar = new h6.q(0);
        }
        this.f = qVar;
        if (z8) {
            this.f16252j = new androidx.fragment.app.D(12);
        } else if (z9) {
            g5.b bVar = new g5.b(1);
            this.f16251i = bVar;
            h6.v vVar2 = h6.x.f;
            M5.g.f(vVar2, "type");
            if (M5.g.a(vVar2.f11214b, "multipart")) {
                bVar.f10842s = vVar2;
                return;
            }
            throw new IllegalArgumentException(M5.g.k(vVar2, "multipart != ").toString());
        }
    }

    public final void a(String str, String str2, boolean z7) {
        androidx.fragment.app.D d = this.f16252j;
        if (z7) {
            d.getClass();
            M5.g.f(str, "name");
            ((ArrayList) d.f5883r).add(h6.n.b(str, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, 83));
            ((ArrayList) d.f5884s).add(h6.n.b(str2, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, 83));
            return;
        }
        d.getClass();
        M5.g.f(str, "name");
        ((ArrayList) d.f5883r).add(h6.n.b(str, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, 91));
        ((ArrayList) d.f5884s).add(h6.n.b(str2, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, 91));
    }

    public final void b(String str, String str2) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            try {
                Pattern pattern = h6.v.d;
                this.f16249g = p6.l.r(str2);
                return;
            } catch (IllegalArgumentException e3) {
                throw new IllegalArgumentException(AbstractC0515y1.x("Malformed content type: ", str2), e3);
            }
        }
        this.f.a(str, str2);
    }

    public final void c(h6.r rVar, h6.E e3) {
        String b7;
        g5.b bVar = this.f16251i;
        bVar.getClass();
        M5.g.f(e3, "body");
        String str = null;
        if (rVar == null) {
            b7 = null;
        } else {
            b7 = rVar.b("Content-Type");
        }
        if (b7 == null) {
            if (rVar != null) {
                str = rVar.b("Content-Length");
            }
            if (str == null) {
                ((ArrayList) bVar.f10843t).add(new h6.w(rVar, e3));
                return;
            }
            throw new IllegalArgumentException("Unexpected header: Content-Length".toString());
        }
        throw new IllegalArgumentException("Unexpected header: Content-Type".toString());
    }

    public final void d(String str, String str2, boolean z7) {
        String str3 = this.f16247c;
        String str4 = null;
        if (str3 != null) {
            h6.t tVar = this.f16246b;
            h6.s f = tVar.f(str3);
            this.d = f;
            if (f != null) {
                this.f16247c = null;
            } else {
                throw new IllegalArgumentException("Malformed URL. Base: " + tVar + ", Relative: " + this.f16247c);
            }
        }
        if (z7) {
            h6.s sVar = this.d;
            sVar.getClass();
            M5.g.f(str, "encodedName");
            if (sVar.f11197b == null) {
                sVar.f11197b = new ArrayList();
            }
            List list = sVar.f11197b;
            M5.g.c(list);
            list.add(h6.n.b(str, 0, 0, " \"'<>#&=", true, false, true, false, 211));
            List list2 = sVar.f11197b;
            M5.g.c(list2);
            if (str2 != null) {
                str4 = h6.n.b(str2, 0, 0, " \"'<>#&=", true, false, true, false, 211);
            }
            list2.add(str4);
            return;
        }
        h6.s sVar2 = this.d;
        sVar2.getClass();
        M5.g.f(str, "name");
        if (sVar2.f11197b == null) {
            sVar2.f11197b = new ArrayList();
        }
        List list3 = sVar2.f11197b;
        M5.g.c(list3);
        list3.add(h6.n.b(str, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, 219));
        List list4 = sVar2.f11197b;
        M5.g.c(list4);
        if (str2 != null) {
            str4 = h6.n.b(str2, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, 219);
        }
        list4.add(str4);
    }
}
