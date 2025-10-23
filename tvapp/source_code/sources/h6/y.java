package h6;

import H2.U;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import k.C0852F;
import w4.l0;
/* loaded from: classes.dex */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    public final C4.b f11225a = new C4.b(16);

    /* renamed from: b  reason: collision with root package name */
    public final Z5.n f11226b = new Z5.n(26);

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f11227c = new ArrayList();
    public final ArrayList d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final U f11228e = new U();
    public boolean f = true;

    /* renamed from: g  reason: collision with root package name */
    public InterfaceC0752b f11229g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f11230h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f11231i;

    /* renamed from: j  reason: collision with root package name */
    public final n f11232j;

    /* renamed from: k  reason: collision with root package name */
    public final n f11233k;

    /* renamed from: l  reason: collision with root package name */
    public final n f11234l;

    /* renamed from: m  reason: collision with root package name */
    public final SocketFactory f11235m;
    public SSLSocketFactory n;

    /* renamed from: o  reason: collision with root package name */
    public X509TrustManager f11236o;

    /* renamed from: p  reason: collision with root package name */
    public final List f11237p;

    /* renamed from: q  reason: collision with root package name */
    public final List f11238q;

    /* renamed from: r  reason: collision with root package name */
    public HostnameVerifier f11239r;

    /* renamed from: s  reason: collision with root package name */
    public C0758h f11240s;

    /* renamed from: t  reason: collision with root package name */
    public l0 f11241t;

    /* renamed from: u  reason: collision with root package name */
    public int f11242u;

    /* renamed from: v  reason: collision with root package name */
    public int f11243v;

    /* renamed from: w  reason: collision with root package name */
    public int f11244w;

    /* renamed from: x  reason: collision with root package name */
    public int f11245x;

    /* renamed from: y  reason: collision with root package name */
    public C0852F f11246y;

    public y() {
        n nVar = InterfaceC0752b.f11127m;
        this.f11229g = nVar;
        this.f11230h = true;
        this.f11231i = true;
        this.f11232j = n.f11185q;
        this.f11233k = n.f11186r;
        this.f11234l = nVar;
        SocketFactory socketFactory = SocketFactory.getDefault();
        M5.g.e(socketFactory, "getDefault()");
        this.f11235m = socketFactory;
        this.f11237p = z.f11248R;
        this.f11238q = z.f11247Q;
        this.f11239r = t6.c.f14601a;
        this.f11240s = C0758h.f11147c;
        this.f11243v = 10000;
        this.f11244w = 10000;
        this.f11245x = 10000;
    }

    public final void a(u uVar) {
        M5.g.f(uVar, "interceptor");
        this.f11227c.add(uVar);
    }

    public final void b(TimeUnit timeUnit) {
        M5.g.f(timeUnit, "unit");
        this.f11242u = i6.b.b(1L, timeUnit);
    }

    public final void c(long j7, TimeUnit timeUnit) {
        M5.g.f(timeUnit, "unit");
        this.f11244w = i6.b.b(j7, timeUnit);
    }

    public final void d(SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager) {
        if (!M5.g.a(sSLSocketFactory, this.n) || !M5.g.a(x509TrustManager, this.f11236o)) {
            this.f11246y = null;
        }
        this.n = sSLSocketFactory;
        p6.n nVar = p6.n.f13188a;
        this.f11241t = p6.n.f13188a.b(x509TrustManager);
        this.f11236o = x509TrustManager;
    }
}
