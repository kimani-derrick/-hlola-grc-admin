package x6;

import com.google.android.gms.internal.measurement.AbstractC0515y1;
import h6.InterfaceC0754d;
import java.io.IOException;
import java.util.ArrayList;
import k1.C0929b;
import v6.C1344i;
/* renamed from: x6.v  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1488v implements InterfaceC1470c {

    /* renamed from: q  reason: collision with root package name */
    public final M f16330q;

    /* renamed from: r  reason: collision with root package name */
    public final Object[] f16331r;

    /* renamed from: s  reason: collision with root package name */
    public final InterfaceC0754d f16332s;

    /* renamed from: t  reason: collision with root package name */
    public final InterfaceC1480m f16333t;

    /* renamed from: u  reason: collision with root package name */
    public volatile boolean f16334u;

    /* renamed from: v  reason: collision with root package name */
    public l6.i f16335v;

    /* renamed from: w  reason: collision with root package name */
    public Throwable f16336w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f16337x;

    public C1488v(M m7, Object[] objArr, InterfaceC0754d interfaceC0754d, InterfaceC1480m interfaceC1480m) {
        this.f16330q = m7;
        this.f16331r = objArr;
        this.f16332s = interfaceC0754d;
        this.f16333t = interfaceC1480m;
    }

    @Override // x6.InterfaceC1470c
    public final InterfaceC1470c a() {
        return new C1488v(this.f16330q, this.f16331r, this.f16332s, this.f16333t);
    }

    public final l6.i b() {
        h6.t a7;
        M m7 = this.f16330q;
        m7.getClass();
        Object[] objArr = this.f16331r;
        int length = objArr.length;
        V[] vArr = m7.f16283j;
        if (length == vArr.length) {
            K k5 = new K(m7.f16278c, m7.f16277b, m7.d, m7.f16279e, m7.f, m7.f16280g, m7.f16281h, m7.f16282i);
            if (m7.f16284k) {
                length--;
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i7 = 0; i7 < length; i7++) {
                arrayList.add(objArr[i7]);
                vArr[i7].a(k5, objArr[i7]);
            }
            h6.s sVar = k5.d;
            if (sVar != null) {
                a7 = sVar.a();
            } else {
                String str = k5.f16247c;
                h6.t tVar = k5.f16246b;
                tVar.getClass();
                M5.g.f(str, "link");
                h6.s f = tVar.f(str);
                if (f == null) {
                    a7 = null;
                } else {
                    a7 = f.a();
                }
                if (a7 == null) {
                    throw new IllegalArgumentException("Malformed URL. Base: " + tVar + ", Relative: " + k5.f16247c);
                }
            }
            h6.C c5 = k5.f16253k;
            if (c5 == null) {
                androidx.fragment.app.D d = k5.f16252j;
                if (d != null) {
                    c5 = new h6.o((ArrayList) d.f5883r, (ArrayList) d.f5884s);
                } else {
                    g5.b bVar = k5.f16251i;
                    if (bVar != null) {
                        ArrayList arrayList2 = (ArrayList) bVar.f10843t;
                        if (!arrayList2.isEmpty()) {
                            c5 = new h6.x((C1344i) bVar.f10841r, (h6.v) bVar.f10842s, i6.b.x(arrayList2));
                        } else {
                            throw new IllegalStateException("Multipart body must have at least one part.".toString());
                        }
                    } else if (k5.f16250h) {
                        long j7 = 0;
                        i6.b.c(j7, j7, j7);
                        c5 = new h6.D(null, 0, new byte[0], 0);
                    }
                }
            }
            h6.v vVar = k5.f16249g;
            h6.q qVar = k5.f;
            if (vVar != null) {
                if (c5 != null) {
                    c5 = new h6.C(c5, vVar);
                } else {
                    qVar.a("Content-Type", vVar.f11213a);
                }
            }
            H.e eVar = k5.f16248e;
            eVar.getClass();
            eVar.f778s = a7;
            eVar.f779t = qVar.c().g();
            eVar.A(k5.f16245a, c5);
            eVar.D(r.class, new r(m7.f16276a, arrayList));
            h6.B q5 = eVar.q();
            h6.z zVar = (h6.z) this.f16332s;
            zVar.getClass();
            return new l6.i(zVar, q5, false);
        }
        throw new IllegalArgumentException(AbstractC0515y1.n(AbstractC0515y1.o(length, "Argument count (", ") doesn't match expected count ("), vArr.length, ")"));
    }

    public final l6.i c() {
        l6.i iVar = this.f16335v;
        if (iVar != null) {
            return iVar;
        }
        Throwable th = this.f16336w;
        if (th != null) {
            if (!(th instanceof IOException)) {
                if (th instanceof RuntimeException) {
                    throw ((RuntimeException) th);
                }
                throw ((Error) th);
            }
            throw ((IOException) th);
        }
        try {
            l6.i b7 = b();
            this.f16335v = b7;
            return b7;
        } catch (IOException | Error | RuntimeException e3) {
            V.o(e3);
            this.f16336w = e3;
            throw e3;
        }
    }

    @Override // x6.InterfaceC1470c
    public final void cancel() {
        l6.i iVar;
        this.f16334u = true;
        synchronized (this) {
            iVar = this.f16335v;
        }
        if (iVar != null) {
            iVar.cancel();
        }
    }

    public final Object clone() {
        return new C1488v(this.f16330q, this.f16331r, this.f16332s, this.f16333t);
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, v6.h, v6.g] */
    public final N d(h6.G g7) {
        h6.F h7 = g7.h();
        h6.I i7 = g7.f11101w;
        h7.f11084g = new C1487u(i7.b(), i7.a());
        h6.G a7 = h7.a();
        int i8 = a7.f11098t;
        if (i8 >= 200 && i8 < 300) {
            if (i8 != 204 && i8 != 205) {
                C0929b c0929b = new C0929b(i7);
                try {
                    Object o7 = this.f16333t.o(c0929b);
                    if (a7.f()) {
                        return new N(a7, o7, null);
                    }
                    throw new IllegalArgumentException("rawResponse must be successful response");
                } catch (RuntimeException e3) {
                    IOException iOException = (IOException) c0929b.f12124t;
                    if (iOException == null) {
                        throw e3;
                    }
                    throw iOException;
                }
            }
            i7.close();
            if (a7.f()) {
                return new N(a7, null, null);
            }
            throw new IllegalArgumentException("rawResponse must be successful response");
        }
        try {
            ?? obj = new Object();
            i7.f().R(obj);
            h6.H h8 = new h6.H(i7.b(), i7.a(), obj, 0);
            if (!a7.f()) {
                return new N(a7, null, h8);
            }
            throw new IllegalArgumentException("rawResponse should not be successful response");
        } finally {
            i7.close();
        }
    }

    @Override // x6.InterfaceC1470c
    public final void f(InterfaceC1473f interfaceC1473f) {
        l6.i iVar;
        Throwable th;
        synchronized (this) {
            try {
                if (!this.f16337x) {
                    this.f16337x = true;
                    iVar = this.f16335v;
                    th = this.f16336w;
                    if (iVar == null && th == null) {
                        l6.i b7 = b();
                        this.f16335v = b7;
                        iVar = b7;
                    }
                } else {
                    throw new IllegalStateException("Already executed.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (th != null) {
            interfaceC1473f.f(this, th);
            return;
        }
        if (this.f16334u) {
            iVar.cancel();
        }
        iVar.e(new t2.i(this, 17, interfaceC1473f));
    }

    @Override // x6.InterfaceC1470c
    public final synchronized h6.B h() {
        try {
        } catch (IOException e3) {
            throw new RuntimeException("Unable to create request.", e3);
        }
        return c().f12334r;
    }

    @Override // x6.InterfaceC1470c
    public final boolean j() {
        boolean z7 = true;
        if (this.f16334u) {
            return true;
        }
        synchronized (this) {
            l6.i iVar = this.f16335v;
            if (iVar == null || !iVar.F) {
                z7 = false;
            }
        }
        return z7;
    }
}
