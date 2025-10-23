package O4;

import M2.e;
import M5.g;
import U5.n;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import h6.A;
import h6.B;
import h6.G;
import h6.r;
import h6.t;
import h6.z;
import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import l6.k;
import m6.d;
import v6.D;
import v6.F;
import v6.InterfaceC1342g;
import v6.InterfaceC1343h;
import w4.l0;
/* loaded from: classes.dex */
public final class a implements m6.c {

    /* renamed from: a  reason: collision with root package name */
    public int f2717a;

    /* renamed from: b  reason: collision with root package name */
    public Object f2718b;

    /* renamed from: c  reason: collision with root package name */
    public Object f2719c;
    public Object d;

    /* renamed from: e  reason: collision with root package name */
    public Object f2720e;
    public Object f;

    /* renamed from: g  reason: collision with root package name */
    public Object f2721g;

    public a(z zVar, k kVar, InterfaceC1343h interfaceC1343h, InterfaceC1342g interfaceC1342g) {
        g.f(kVar, "connection");
        this.f2718b = zVar;
        this.f2719c = kVar;
        this.d = interfaceC1343h;
        this.f2720e = interfaceC1342g;
        this.f = new e(interfaceC1343h);
    }

    @Override // m6.c
    public void a(B b7) {
        String d;
        Proxy.Type type = ((k) this.f2719c).f12344b.f11110b.type();
        g.e(type, "connection.route().proxy.type()");
        StringBuilder sb = new StringBuilder();
        sb.append(b7.f11071b);
        sb.append(' ');
        t tVar = b7.f11070a;
        if (!tVar.f11211j && type == Proxy.Type.HTTP) {
            sb.append(tVar);
        } else {
            String b8 = tVar.b();
            if (tVar.d() != null) {
                b8 = b8 + '?' + ((Object) d);
            }
            sb.append(b8);
        }
        sb.append(" HTTP/1.1");
        String sb2 = sb.toString();
        g.e(sb2, "StringBuilder().apply(builderAction).toString()");
        l(b7.f11072c, sb2);
    }

    @Override // m6.c
    public long b(G g7) {
        if (!d.a(g7)) {
            return 0L;
        }
        if (n.W("chunked", G.b(g7, "Transfer-Encoding"))) {
            return -1L;
        }
        return i6.b.k(g7);
    }

    @Override // m6.c
    public D c(B b7, long j7) {
        if (n.W("chunked", b7.f11072c.b("Transfer-Encoding"))) {
            int i7 = this.f2717a;
            if (i7 == 1) {
                this.f2717a = 2;
                return new n6.b(this);
            }
            throw new IllegalStateException(g.k(Integer.valueOf(i7), "state: ").toString());
        } else if (j7 != -1) {
            int i8 = this.f2717a;
            if (i8 == 1) {
                this.f2717a = 2;
                return new n6.e(this);
            }
            throw new IllegalStateException(g.k(Integer.valueOf(i8), "state: ").toString());
        } else {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
    }

    @Override // m6.c
    public void cancel() {
        Socket socket = ((k) this.f2719c).f12345c;
        if (socket != null) {
            i6.b.e(socket);
        }
    }

    @Override // m6.c
    public void d() {
        ((InterfaceC1342g) this.f2720e).flush();
    }

    @Override // m6.c
    public F e(G g7) {
        if (!d.a(g7)) {
            return j(0L);
        }
        if (n.W("chunked", G.b(g7, "Transfer-Encoding"))) {
            t tVar = g7.f11095q.f11070a;
            int i7 = this.f2717a;
            if (i7 == 4) {
                this.f2717a = 5;
                return new n6.c(this, tVar);
            }
            throw new IllegalStateException(g.k(Integer.valueOf(i7), "state: ").toString());
        }
        long k5 = i6.b.k(g7);
        if (k5 != -1) {
            return j(k5);
        }
        int i8 = this.f2717a;
        if (i8 == 4) {
            this.f2717a = 5;
            ((k) this.f2719c).l();
            return new n6.a(this);
        }
        throw new IllegalStateException(g.k(Integer.valueOf(i8), "state: ").toString());
    }

    @Override // m6.c
    public void f() {
        ((InterfaceC1342g) this.f2720e).flush();
    }

    @Override // m6.c
    public h6.F g(boolean z7) {
        e eVar = (e) this.f;
        int i7 = this.f2717a;
        if (i7 != 1 && i7 != 2 && i7 != 3) {
            throw new IllegalStateException(g.k(Integer.valueOf(i7), "state: ").toString());
        }
        try {
            String o7 = ((InterfaceC1343h) eVar.f2261s).o(eVar.f2260r);
            eVar.f2260r -= o7.length();
            C.d G6 = l0.G(o7);
            int i8 = G6.f324r;
            h6.F f = new h6.F();
            A a7 = (A) G6.f325s;
            g.f(a7, "protocol");
            f.f11081b = a7;
            f.f11082c = i8;
            String str = (String) G6.f326t;
            g.f(str, "message");
            f.d = str;
            f.f = eVar.A().g();
            if (z7 && i8 == 100) {
                return null;
            }
            if (i8 != 100 && (102 > i8 || i8 >= 200)) {
                this.f2717a = 4;
                return f;
            }
            this.f2717a = 3;
            return f;
        } catch (EOFException e3) {
            throw new IOException(g.k(((k) this.f2719c).f12344b.f11109a.f11124h.g(), "unexpected end of stream on "), e3);
        }
    }

    @Override // m6.c
    public k h() {
        return (k) this.f2719c;
    }

    public b i() {
        String str;
        if (this.f2717a == 0) {
            str = " registrationStatus";
        } else {
            str = "";
        }
        if (((Long) this.f) == null) {
            str = str.concat(" expiresInSecs");
        }
        if (((Long) this.f2721g) == null) {
            str = AbstractC0515y1.m(str, " tokenCreationEpochInSecs");
        }
        if (str.isEmpty()) {
            return new b((String) this.f2718b, this.f2717a, (String) this.f2719c, (String) this.d, ((Long) this.f).longValue(), ((Long) this.f2721g).longValue(), (String) this.f2720e);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public n6.d j(long j7) {
        int i7 = this.f2717a;
        if (i7 == 4) {
            this.f2717a = 5;
            return new n6.d(this, j7);
        }
        throw new IllegalStateException(g.k(Integer.valueOf(i7), "state: ").toString());
    }

    public void k(int i7) {
        if (i7 != 0) {
            this.f2717a = i7;
            return;
        }
        throw new NullPointerException("Null registrationStatus");
    }

    public void l(r rVar, String str) {
        g.f(rVar, "headers");
        g.f(str, "requestLine");
        int i7 = this.f2717a;
        if (i7 == 0) {
            InterfaceC1342g interfaceC1342g = (InterfaceC1342g) this.f2720e;
            interfaceC1342g.G(str).G("\r\n");
            int size = rVar.size();
            for (int i8 = 0; i8 < size; i8++) {
                interfaceC1342g.G(rVar.f(i8)).G(": ").G(rVar.h(i8)).G("\r\n");
            }
            interfaceC1342g.G("\r\n");
            this.f2717a = 1;
            return;
        }
        throw new IllegalStateException(g.k(Integer.valueOf(i7), "state: ").toString());
    }
}
