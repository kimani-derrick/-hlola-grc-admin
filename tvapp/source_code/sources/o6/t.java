package o6;

import h6.G;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import v6.C1344i;
import w4.l0;
/* loaded from: classes.dex */
public final class t implements m6.c {

    /* renamed from: g  reason: collision with root package name */
    public static final List f13065g = i6.b.l("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: h  reason: collision with root package name */
    public static final List f13066h = i6.b.l("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a  reason: collision with root package name */
    public final l6.k f13067a;

    /* renamed from: b  reason: collision with root package name */
    public final m6.e f13068b;

    /* renamed from: c  reason: collision with root package name */
    public final s f13069c;
    public volatile A d;

    /* renamed from: e  reason: collision with root package name */
    public final h6.A f13070e;
    public volatile boolean f;

    public t(h6.z zVar, l6.k kVar, m6.e eVar, s sVar) {
        M5.g.f(kVar, "connection");
        this.f13067a = kVar;
        this.f13068b = eVar;
        this.f13069c = sVar;
        h6.A a7 = h6.A.f11066v;
        this.f13070e = zVar.f11255H.contains(a7) ? a7 : h6.A.f11065u;
    }

    @Override // m6.c
    public final void a(h6.B b7) {
        boolean z7;
        String d;
        int i7;
        A a7;
        if (this.d != null) {
            return;
        }
        boolean z8 = true;
        if (b7.d != null) {
            z7 = true;
        } else {
            z7 = false;
        }
        h6.r rVar = b7.f11072c;
        ArrayList arrayList = new ArrayList(rVar.size() + 4);
        arrayList.add(new C1074c(C1074c.f, b7.f11071b));
        C1344i c1344i = C1074c.f12994g;
        h6.t tVar = b7.f11070a;
        M5.g.f(tVar, "url");
        String b8 = tVar.b();
        if (tVar.d() != null) {
            b8 = b8 + '?' + ((Object) d);
        }
        arrayList.add(new C1074c(c1344i, b8));
        String b9 = b7.f11072c.b("Host");
        if (b9 != null) {
            arrayList.add(new C1074c(C1074c.f12996i, b9));
        }
        arrayList.add(new C1074c(C1074c.f12995h, tVar.f11204a));
        int size = rVar.size();
        int i8 = 0;
        while (i8 < size) {
            int i9 = i8 + 1;
            String f = rVar.f(i8);
            Locale locale = Locale.US;
            M5.g.e(locale, "US");
            String lowerCase = f.toLowerCase(locale);
            M5.g.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (!f13065g.contains(lowerCase) || (M5.g.a(lowerCase, "te") && M5.g.a(rVar.h(i8), "trailers"))) {
                arrayList.add(new C1074c(lowerCase, rVar.h(i8)));
            }
            i8 = i9;
        }
        s sVar = this.f13069c;
        sVar.getClass();
        boolean z9 = !z7;
        synchronized (sVar.f13052O) {
            synchronized (sVar) {
                if (sVar.f13060v > 1073741823) {
                    sVar.n(EnumC1073b.f12989v);
                }
                if (!sVar.f13061w) {
                    i7 = sVar.f13060v;
                    sVar.f13060v = i7 + 2;
                    a7 = new A(i7, sVar, z9, false, null);
                    if (z7 && sVar.f13049L < sVar.f13050M && a7.f12963e < a7.f) {
                        z8 = false;
                    }
                    if (a7.i()) {
                        sVar.f13057s.put(Integer.valueOf(i7), a7);
                    }
                } else {
                    throw new IOException();
                }
            }
            sVar.f13052O.j(z9, i7, arrayList);
        }
        if (z8) {
            sVar.f13052O.flush();
        }
        this.d = a7;
        if (!this.f) {
            A a8 = this.d;
            M5.g.c(a8);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            a8.f12968k.g(this.f13068b.f12451g, timeUnit);
            A a9 = this.d;
            M5.g.c(a9);
            a9.f12969l.g(this.f13068b.f12452h, timeUnit);
            return;
        }
        A a10 = this.d;
        M5.g.c(a10);
        a10.e(EnumC1073b.f12990w);
        throw new IOException("Canceled");
    }

    @Override // m6.c
    public final long b(G g7) {
        if (!m6.d.a(g7)) {
            return 0L;
        }
        return i6.b.k(g7);
    }

    @Override // m6.c
    public final v6.D c(h6.B b7, long j7) {
        A a7 = this.d;
        M5.g.c(a7);
        return a7.g();
    }

    @Override // m6.c
    public final void cancel() {
        this.f = true;
        A a7 = this.d;
        if (a7 != null) {
            a7.e(EnumC1073b.f12990w);
        }
    }

    @Override // m6.c
    public final void d() {
        A a7 = this.d;
        M5.g.c(a7);
        a7.g().close();
    }

    @Override // m6.c
    public final v6.F e(G g7) {
        A a7 = this.d;
        M5.g.c(a7);
        return a7.f12966i;
    }

    @Override // m6.c
    public final void f() {
        this.f13069c.flush();
    }

    @Override // m6.c
    public final h6.F g(boolean z7) {
        h6.r rVar;
        A a7 = this.d;
        if (a7 != null) {
            synchronized (a7) {
                a7.f12968k.h();
                while (a7.f12964g.isEmpty() && a7.f12970m == null) {
                    a7.l();
                }
                a7.f12968k.l();
                if (!a7.f12964g.isEmpty()) {
                    Object removeFirst = a7.f12964g.removeFirst();
                    M5.g.e(removeFirst, "headersQueue.removeFirst()");
                    rVar = (h6.r) removeFirst;
                } else {
                    IOException iOException = a7.n;
                    if (iOException == null) {
                        EnumC1073b enumC1073b = a7.f12970m;
                        M5.g.c(enumC1073b);
                        throw new F(enumC1073b);
                    }
                    throw iOException;
                }
            }
            h6.A a8 = this.f13070e;
            M5.g.f(a8, "protocol");
            ArrayList arrayList = new ArrayList(20);
            int size = rVar.size();
            C.d dVar = null;
            int i7 = 0;
            while (i7 < size) {
                int i8 = i7 + 1;
                String f = rVar.f(i7);
                String h7 = rVar.h(i7);
                if (M5.g.a(f, ":status")) {
                    dVar = l0.G(M5.g.k(h7, "HTTP/1.1 "));
                } else if (!f13066h.contains(f)) {
                    M5.g.f(f, "name");
                    M5.g.f(h7, "value");
                    arrayList.add(f);
                    arrayList.add(U5.f.C0(h7).toString());
                }
                i7 = i8;
            }
            if (dVar != null) {
                h6.F f7 = new h6.F();
                f7.f11081b = a8;
                f7.f11082c = dVar.f324r;
                String str = (String) dVar.f326t;
                M5.g.f(str, "message");
                f7.d = str;
                Object[] array = arrayList.toArray(new String[0]);
                if (array != null) {
                    h6.q qVar = new h6.q(0);
                    ArrayList arrayList2 = qVar.f11194a;
                    M5.g.f(arrayList2, "<this>");
                    arrayList2.addAll(A5.j.M((String[]) array));
                    f7.f = qVar;
                    if (z7 && f7.f11082c == 100) {
                        return null;
                    }
                    return f7;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            throw new ProtocolException("Expected ':status' header not present");
        }
        throw new IOException("stream wasn't created");
    }

    @Override // m6.c
    public final l6.k h() {
        return this.f13067a;
    }
}
