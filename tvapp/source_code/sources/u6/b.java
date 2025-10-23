package u6;

import M5.g;
import U5.n;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import f5.C0700a;
import h6.A;
import h6.B;
import h6.E;
import h6.G;
import h6.I;
import h6.r;
import h6.u;
import h6.v;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeUnit;
import l6.k;
import m6.d;
import m6.e;
import p6.l;
import r0.AbstractC1111a;
import v6.C1341f;
import v6.InterfaceC1343h;
import v6.o;
/* loaded from: classes.dex */
public final class b implements u {

    /* renamed from: a  reason: collision with root package name */
    public final a f15080a = a.f15079a;

    /* renamed from: b  reason: collision with root package name */
    public volatile int f15081b = 1;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v23, types: [java.lang.Object, v6.f] */
    /* JADX WARN: Type inference failed for: r4v17, types: [java.lang.Object, v6.f, v6.g] */
    @Override // h6.u
    public final G a(e eVar) {
        boolean z7;
        k kVar;
        String str;
        boolean z8;
        String str2;
        String str3;
        String str4;
        String str5;
        String x7;
        String str6;
        a aVar;
        String str7;
        String str8;
        Charset charset;
        Long l7;
        C1341f c1341f;
        Charset a7;
        Charset a8;
        a aVar2;
        StringBuilder sb;
        int i7 = this.f15081b;
        B b7 = eVar.f12450e;
        boolean z9 = true;
        if (i7 == 1) {
            return eVar.b(b7);
        }
        if (i7 == 4) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (!z7 && i7 != 3) {
            z9 = false;
        }
        E e3 = b7.d;
        C0700a c0700a = eVar.d;
        if (c0700a == null) {
            kVar = null;
        } else {
            kVar = (k) c0700a.f10433g;
        }
        StringBuilder sb2 = new StringBuilder("--> ");
        sb2.append(b7.f11071b);
        sb2.append(' ');
        sb2.append(b7.f11070a);
        if (kVar == null) {
            str = "";
        } else {
            A a9 = kVar.f;
            g.c(a9);
            str = g.k(a9, " ");
        }
        sb2.append(str);
        String sb3 = sb2.toString();
        if (!z9 && e3 != 0) {
            sb3 = sb3 + " (" + e3.a() + "-byte body)";
        }
        this.f15080a.a(sb3);
        if (z9) {
            r rVar = b7.f11072c;
            z8 = z9;
            if (e3 == 0) {
                str4 = " ";
            } else {
                v b8 = e3.b();
                str4 = " ";
                if (b8 != null && rVar.b("Content-Type") == null) {
                    this.f15080a.a(g.k(b8, "Content-Type: "));
                }
                if (e3.a() != -1 && rVar.b("Content-Length") == null) {
                    this.f15080a.a(g.k(Long.valueOf(e3.a()), "Content-Length: "));
                }
            }
            int size = rVar.size();
            for (int i8 = 0; i8 < size; i8++) {
                b(rVar, i8);
            }
            if (!z7 || e3 == 0) {
                str2 = "gzip";
                str3 = "UTF_8";
                this.f15080a.a(g.k(b7.f11071b, "--> END "));
            } else {
                String b9 = b7.f11072c.b("Content-Encoding");
                if (b9 != null && !n.W(b9, "identity") && !n.W(b9, "gzip")) {
                    this.f15080a.a(AbstractC1111a.t(new StringBuilder("--> END "), b7.f11071b, " (encoded body omitted)"));
                    str2 = "gzip";
                    str3 = "UTF_8";
                } else {
                    ?? obj = new Object();
                    e3.c(obj);
                    v b10 = e3.b();
                    if (b10 == null) {
                        a8 = null;
                    } else {
                        a8 = b10.a(StandardCharsets.UTF_8);
                    }
                    if (a8 == null) {
                        a8 = StandardCharsets.UTF_8;
                        g.e(a8, "UTF_8");
                    }
                    this.f15080a.a("");
                    if (h4.b.z(obj)) {
                        str2 = "gzip";
                        str3 = "UTF_8";
                        this.f15080a.a(obj.a0(obj.f15388r, a8));
                        aVar2 = this.f15080a;
                        sb = new StringBuilder("--> END ");
                        sb.append(b7.f11071b);
                        sb.append(" (");
                        sb.append(e3.a());
                        sb.append("-byte body)");
                    } else {
                        str2 = "gzip";
                        str3 = "UTF_8";
                        aVar2 = this.f15080a;
                        sb = new StringBuilder("--> END ");
                        sb.append(b7.f11071b);
                        sb.append(" (binary ");
                        sb.append(e3.a());
                        sb.append("-byte body omitted)");
                    }
                    aVar2.a(sb.toString());
                }
            }
        } else {
            z8 = z9;
            str2 = "gzip";
            str3 = "UTF_8";
            str4 = " ";
        }
        long nanoTime = System.nanoTime();
        try {
            G b11 = eVar.b(b7);
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
            I i9 = b11.f11101w;
            g.c(i9);
            long a10 = i9.a();
            if (a10 != -1) {
                str5 = a10 + "-byte";
            } else {
                str5 = "unknown-length";
            }
            a aVar3 = this.f15080a;
            StringBuilder sb4 = new StringBuilder("<-- ");
            sb4.append(b11.f11098t);
            if (b11.f11097s.length() == 0) {
                x7 = "";
            } else {
                x7 = AbstractC0515y1.x(str4, b11.f11097s);
            }
            sb4.append(x7);
            sb4.append(' ');
            sb4.append(b11.f11095q.f11070a);
            sb4.append(" (");
            sb4.append(millis);
            sb4.append("ms");
            if (z8) {
                str6 = "";
            } else {
                str6 = AbstractC1111a.r(", ", str5, " body");
            }
            sb4.append(str6);
            sb4.append(')');
            aVar3.a(sb4.toString());
            if (z8) {
                r rVar2 = b11.f11100v;
                int size2 = rVar2.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    b(rVar2, i10);
                }
                if (z7 && d.a(b11)) {
                    String b12 = b11.f11100v.b("Content-Encoding");
                    if (b12 == null || n.W(b12, "identity")) {
                        str8 = str2;
                    } else {
                        str8 = str2;
                        if (!n.W(b12, str8)) {
                            aVar = this.f15080a;
                            str7 = "<-- END HTTP (encoded body omitted)";
                        }
                    }
                    InterfaceC1343h f = i9.f();
                    f.t(Long.MAX_VALUE);
                    C1341f c5 = f.c();
                    if (n.W(str8, rVar2.b("Content-Encoding"))) {
                        l7 = Long.valueOf(c5.f15388r);
                        o oVar = new o(c5.clone());
                        try {
                            ?? obj2 = new Object();
                            obj2.h0(oVar);
                            charset = null;
                            l.i(oVar, null);
                            c1341f = obj2;
                        } finally {
                        }
                    } else {
                        charset = null;
                        l7 = null;
                        c1341f = c5;
                    }
                    v b13 = i9.b();
                    if (b13 == null) {
                        a7 = charset;
                    } else {
                        a7 = b13.a(StandardCharsets.UTF_8);
                    }
                    if (a7 == null) {
                        a7 = StandardCharsets.UTF_8;
                        g.e(a7, str3);
                    }
                    if (!h4.b.z(c1341f)) {
                        this.f15080a.a("");
                        this.f15080a.a(AbstractC1111a.s(new StringBuilder("<-- END HTTP (binary "), c1341f.f15388r, "-byte body omitted)"));
                        return b11;
                    }
                    if (a10 != 0) {
                        this.f15080a.a("");
                        a aVar4 = this.f15080a;
                        C1341f clone = c1341f.clone();
                        aVar4.a(clone.a0(clone.f15388r, a7));
                    }
                    if (l7 != null) {
                        this.f15080a.a("<-- END HTTP (" + c1341f.f15388r + "-byte, " + l7 + "-gzipped-byte body)");
                    } else {
                        aVar = this.f15080a;
                        str7 = AbstractC1111a.s(new StringBuilder("<-- END HTTP ("), c1341f.f15388r, "-byte body)");
                    }
                } else {
                    aVar = this.f15080a;
                    str7 = "<-- END HTTP";
                }
                aVar.a(str7);
            }
            return b11;
        } catch (Exception e7) {
            this.f15080a.a(g.k(e7, "<-- HTTP FAILED: "));
            throw e7;
        }
    }

    public final void b(r rVar, int i7) {
        String f = rVar.f(i7);
        if (f instanceof Void) {
            g.f((Void) f, "element");
        }
        String h7 = rVar.h(i7);
        this.f15080a.a(rVar.f(i7) + ": " + h7);
    }
}
