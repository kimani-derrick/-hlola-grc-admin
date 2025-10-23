package H2;

import Y2.C0148q;
import Y2.InterfaceC0144m;
import Z2.AbstractC0156a;
import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Map;
import k2.C0943h;
import k2.InterfaceC0946k;
import k2.InterfaceC0948m;
import r2.C1117d;
/* loaded from: classes.dex */
public final class O implements Y2.K {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f927a;

    /* renamed from: b  reason: collision with root package name */
    public final Y2.V f928b;

    /* renamed from: c  reason: collision with root package name */
    public final C0002c f929c;
    public final InterfaceC0948m d;

    /* renamed from: e  reason: collision with root package name */
    public final X0.j f930e;

    /* renamed from: g  reason: collision with root package name */
    public volatile boolean f931g;

    /* renamed from: i  reason: collision with root package name */
    public long f933i;

    /* renamed from: j  reason: collision with root package name */
    public C0148q f934j;

    /* renamed from: k  reason: collision with root package name */
    public c0 f935k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f936l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ S f937m;
    public final U4.k f = new Object();

    /* renamed from: h  reason: collision with root package name */
    public boolean f932h = true;

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, U4.k] */
    public O(S s6, Uri uri, InterfaceC0144m interfaceC0144m, C0002c c0002c, InterfaceC0948m interfaceC0948m, X0.j jVar) {
        this.f937m = s6;
        this.f927a = uri;
        this.f928b = new Y2.V(interfaceC0144m);
        this.f929c = c0002c;
        this.d = interfaceC0948m;
        this.f930e = jVar;
        C0016q.f1156a.getAndIncrement();
        this.f934j = c(0L);
    }

    @Override // Y2.K
    public final void a() {
        InterfaceC0144m interfaceC0144m;
        int i7;
        int i8 = 0;
        while (i8 == 0 && !this.f931g) {
            try {
                long j7 = this.f.f3459a;
                C0148q c5 = c(j7);
                this.f934j = c5;
                long c6 = this.f928b.c(c5);
                if (c6 != -1) {
                    c6 += j7;
                    S s6 = this.f937m;
                    s6.F.post(new N(s6, 2));
                }
                long j8 = c6;
                this.f937m.f950H = B2.b.a(this.f928b.f4365q.n());
                Y2.V v5 = this.f928b;
                B2.b bVar = this.f937m.f950H;
                if (bVar != null && (i7 = bVar.f186v) != -1) {
                    interfaceC0144m = new C0015p(v5, i7, this);
                    S s7 = this.f937m;
                    s7.getClass();
                    c0 x7 = s7.x(new Q(0, true));
                    this.f935k = x7;
                    x7.e(S.f943d0);
                } else {
                    interfaceC0144m = v5;
                }
                long j9 = j7;
                this.f929c.F(interfaceC0144m, this.f927a, this.f928b.f4365q.n(), j7, j8, this.d);
                if (this.f937m.f950H != null) {
                    InterfaceC0946k interfaceC0946k = (InterfaceC0946k) this.f929c.f1018s;
                    if (interfaceC0946k instanceof C1117d) {
                        ((C1117d) interfaceC0946k).f13466r = true;
                    }
                }
                if (this.f932h) {
                    C0002c c0002c = this.f929c;
                    long j10 = this.f933i;
                    InterfaceC0946k interfaceC0946k2 = (InterfaceC0946k) c0002c.f1018s;
                    interfaceC0946k2.getClass();
                    interfaceC0946k2.h(j9, j10);
                    this.f932h = false;
                }
                while (true) {
                    long j11 = j9;
                    while (i8 == 0 && !this.f931g) {
                        try {
                            X0.j jVar = this.f930e;
                            synchronized (jVar) {
                                while (!jVar.f4072a) {
                                    jVar.wait();
                                }
                            }
                            C0002c c0002c2 = this.f929c;
                            U4.k kVar = this.f;
                            InterfaceC0946k interfaceC0946k3 = (InterfaceC0946k) c0002c2.f1018s;
                            interfaceC0946k3.getClass();
                            C0943h c0943h = (C0943h) c0002c2.f1019t;
                            c0943h.getClass();
                            i8 = interfaceC0946k3.d(c0943h, kVar);
                            j9 = this.f929c.z();
                            if (j9 > this.f937m.f979z + j11) {
                                break;
                            }
                        } catch (InterruptedException unused) {
                            throw new InterruptedIOException();
                        }
                    }
                    this.f930e.c();
                    S s8 = this.f937m;
                    s8.F.post(s8.f948E);
                }
                if (i8 == 1) {
                    i8 = 0;
                } else if (this.f929c.z() != -1) {
                    this.f.f3459a = this.f929c.z();
                }
                p6.d.e(this.f928b);
            } catch (Throwable th) {
                if (i8 != 1 && this.f929c.z() != -1) {
                    this.f.f3459a = this.f929c.z();
                }
                p6.d.e(this.f928b);
                throw th;
            }
        }
    }

    @Override // Y2.K
    public final void b() {
        this.f931g = true;
    }

    public final C0148q c(long j7) {
        Collections.emptyMap();
        String str = this.f937m.f978y;
        Map map = S.f942c0;
        Uri uri = this.f927a;
        AbstractC0156a.m(uri, "The uri must be set.");
        return new C0148q(uri, 0L, 1, null, map, j7, -1L, str, 6, null);
    }
}
