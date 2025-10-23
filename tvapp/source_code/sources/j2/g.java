package j2;

import O3.U;
import O3.i0;
import Z2.AbstractC0156a;
import Z2.H;
import Z4.Q;
import android.media.ResourceBusyException;
import android.media.UnsupportedSchemeException;
import android.os.Handler;
import android.os.Looper;
import e2.AbstractC0606g;
import e2.K;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
/* loaded from: classes.dex */
public final class g implements q {

    /* renamed from: A  reason: collision with root package name */
    public final long f11795A;

    /* renamed from: B  reason: collision with root package name */
    public final ArrayList f11796B;

    /* renamed from: C  reason: collision with root package name */
    public final Set f11797C;

    /* renamed from: D  reason: collision with root package name */
    public final Set f11798D;

    /* renamed from: E  reason: collision with root package name */
    public int f11799E;
    public x F;

    /* renamed from: G  reason: collision with root package name */
    public C0834c f11800G;

    /* renamed from: H  reason: collision with root package name */
    public C0834c f11801H;

    /* renamed from: I  reason: collision with root package name */
    public Looper f11802I;

    /* renamed from: J  reason: collision with root package name */
    public Handler f11803J;

    /* renamed from: K  reason: collision with root package name */
    public int f11804K;

    /* renamed from: L  reason: collision with root package name */
    public byte[] f11805L;

    /* renamed from: M  reason: collision with root package name */
    public f2.m f11806M;

    /* renamed from: N  reason: collision with root package name */
    public volatile Q f11807N;

    /* renamed from: q  reason: collision with root package name */
    public final UUID f11808q;

    /* renamed from: r  reason: collision with root package name */
    public final A4.a f11809r;

    /* renamed from: s  reason: collision with root package name */
    public final L0.b f11810s;

    /* renamed from: t  reason: collision with root package name */
    public final HashMap f11811t;

    /* renamed from: u  reason: collision with root package name */
    public final boolean f11812u;

    /* renamed from: v  reason: collision with root package name */
    public final int[] f11813v;

    /* renamed from: w  reason: collision with root package name */
    public final boolean f11814w;

    /* renamed from: x  reason: collision with root package name */
    public final androidx.fragment.app.D f11815x;

    /* renamed from: y  reason: collision with root package name */
    public final L4.f f11816y;

    /* renamed from: z  reason: collision with root package name */
    public final C0835d f11817z;

    public g(UUID uuid, A4.a aVar, L0.b bVar, HashMap hashMap, boolean z7, int[] iArr, boolean z8, L4.f fVar, long j7) {
        uuid.getClass();
        AbstractC0156a.e("Use C.CLEARKEY_UUID instead", !AbstractC0606g.f9960b.equals(uuid));
        this.f11808q = uuid;
        this.f11809r = aVar;
        this.f11810s = bVar;
        this.f11811t = hashMap;
        this.f11812u = z7;
        this.f11813v = iArr;
        this.f11814w = z8;
        this.f11816y = fVar;
        this.f11815x = new androidx.fragment.app.D(15);
        this.f11817z = new C0835d(this);
        this.f11804K = 0;
        this.f11796B = new ArrayList();
        this.f11797C = Collections.newSetFromMap(new IdentityHashMap());
        this.f11798D = Collections.newSetFromMap(new IdentityHashMap());
        this.f11795A = j7;
    }

    public static boolean c(C0834c c0834c) {
        c0834c.p();
        if (c0834c.f11780p == 1) {
            if (H.f4603a < 19) {
                return true;
            }
            j f = c0834c.f();
            f.getClass();
            if (f.getCause() instanceof ResourceBusyException) {
                return true;
            }
        }
        return false;
    }

    public static ArrayList f(i iVar, UUID uuid, boolean z7) {
        ArrayList arrayList = new ArrayList(iVar.f11826t);
        for (int i7 = 0; i7 < iVar.f11826t; i7++) {
            h hVar = iVar.f11823q[i7];
            if ((hVar.a(uuid) || (AbstractC0606g.f9961c.equals(uuid) && hVar.a(AbstractC0606g.f9960b))) && (hVar.f11822u != null || z7)) {
                arrayList.add(hVar);
            }
        }
        return arrayList;
    }

    @Override // j2.q
    public final void a() {
        i(true);
        int i7 = this.f11799E - 1;
        this.f11799E = i7;
        if (i7 != 0) {
            return;
        }
        if (this.f11795A != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.f11796B);
            for (int i8 = 0; i8 < arrayList.size(); i8++) {
                ((C0834c) arrayList.get(i8)).a(null);
            }
        }
        i0 it = O3.H.s(this.f11797C).iterator();
        while (it.hasNext()) {
            ((f) it.next()).a();
        }
        g();
    }

    public final k b(Looper looper, n nVar, K k5, boolean z7) {
        ArrayList arrayList;
        if (this.f11807N == null) {
            this.f11807N = new Q(this, looper, 2);
        }
        i iVar = k5.f9658E;
        C0834c c0834c = null;
        if (iVar == null) {
            int h7 = Z2.r.h(k5.f9655B);
            x xVar = this.F;
            xVar.getClass();
            if (xVar.o() == 2 && y.d) {
                return null;
            }
            int[] iArr = this.f11813v;
            for (int i7 = 0; i7 < iArr.length; i7++) {
                if (iArr[i7] == h7) {
                    if (i7 == -1 || xVar.o() == 1) {
                        return null;
                    }
                    C0834c c0834c2 = this.f11800G;
                    if (c0834c2 == null) {
                        O3.C c5 = O3.E.f2597r;
                        C0834c e3 = e(U.f2621u, true, null, z7);
                        this.f11796B.add(e3);
                        this.f11800G = e3;
                    } else {
                        c0834c2.c(null);
                    }
                    return this.f11800G;
                }
            }
            return null;
        }
        if (this.f11805L == null) {
            arrayList = f(iVar, this.f11808q, false);
            if (arrayList.isEmpty()) {
                Exception exc = new Exception("Media does not support uuid: " + this.f11808q);
                AbstractC0156a.r("DefaultDrmSessionMgr", "DRM error", exc);
                if (nVar != null) {
                    nVar.e(exc);
                }
                return new u(new j(6003, exc));
            }
        } else {
            arrayList = null;
        }
        if (!this.f11812u) {
            c0834c = this.f11801H;
        } else {
            Iterator it = this.f11796B.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C0834c c0834c3 = (C0834c) it.next();
                if (H.a(c0834c3.f11768a, arrayList)) {
                    c0834c = c0834c3;
                    break;
                }
            }
        }
        if (c0834c == null) {
            c0834c = e(arrayList, false, nVar, z7);
            if (!this.f11812u) {
                this.f11801H = c0834c;
            }
            this.f11796B.add(c0834c);
        } else {
            c0834c.c(nVar);
        }
        return c0834c;
    }

    public final C0834c d(List list, boolean z7, n nVar) {
        this.F.getClass();
        x xVar = this.F;
        int i7 = this.f11804K;
        byte[] bArr = this.f11805L;
        Looper looper = this.f11802I;
        looper.getClass();
        f2.m mVar = this.f11806M;
        mVar.getClass();
        L0.b bVar = this.f11810s;
        L4.f fVar = this.f11816y;
        C0834c c0834c = new C0834c(this.f11808q, xVar, this.f11815x, this.f11817z, list, i7, this.f11814w | z7, z7, bArr, this.f11811t, bVar, looper, fVar, mVar);
        c0834c.c(nVar);
        if (this.f11795A != -9223372036854775807L) {
            c0834c.c(null);
        }
        return c0834c;
    }

    public final C0834c e(List list, boolean z7, n nVar, boolean z8) {
        C0834c d = d(list, z7, nVar);
        boolean c5 = c(d);
        long j7 = this.f11795A;
        Set set = this.f11798D;
        if (c5 && !set.isEmpty()) {
            i0 it = O3.H.s(set).iterator();
            while (it.hasNext()) {
                ((k) it.next()).a(null);
            }
            d.a(nVar);
            if (j7 != -9223372036854775807L) {
                d.a(null);
            }
            d = d(list, z7, nVar);
        }
        if (c(d) && z8) {
            Set set2 = this.f11797C;
            if (!set2.isEmpty()) {
                i0 it2 = O3.H.s(set2).iterator();
                while (it2.hasNext()) {
                    ((f) it2.next()).a();
                }
                if (!set.isEmpty()) {
                    i0 it3 = O3.H.s(set).iterator();
                    while (it3.hasNext()) {
                        ((k) it3.next()).a(null);
                    }
                }
                d.a(nVar);
                if (j7 != -9223372036854775807L) {
                    d.a(null);
                }
                return d(list, z7, nVar);
            }
            return d;
        }
        return d;
    }

    public final void g() {
        if (this.F != null && this.f11799E == 0 && this.f11796B.isEmpty() && this.f11797C.isEmpty()) {
            x xVar = this.F;
            xVar.getClass();
            xVar.a();
            this.F = null;
        }
    }

    @Override // j2.q
    public final void h(Looper looper, f2.m mVar) {
        boolean z7;
        synchronized (this) {
            try {
                Looper looper2 = this.f11802I;
                if (looper2 == null) {
                    this.f11802I = looper;
                    this.f11803J = new Handler(looper);
                } else {
                    if (looper2 == looper) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    AbstractC0156a.k(z7);
                    this.f11803J.getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f11806M = mVar;
    }

    public final void i(boolean z7) {
        if (z7 && this.f11802I == null) {
            AbstractC0156a.L("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        Thread currentThread = Thread.currentThread();
        Looper looper = this.f11802I;
        looper.getClass();
        if (currentThread != looper.getThread()) {
            AbstractC0156a.L("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.f11802I.getThread().getName(), new IllegalStateException());
        }
    }

    @Override // j2.q
    public final p k(n nVar, K k5) {
        boolean z7;
        if (this.f11799E > 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        AbstractC0156a.k(z7);
        AbstractC0156a.l(this.f11802I);
        f fVar = new f(this, nVar);
        Handler handler = this.f11803J;
        handler.getClass();
        handler.post(new A4.d(fVar, 14, k5));
        return fVar;
    }

    @Override // j2.q
    public final void m() {
        x fVar;
        i(true);
        int i7 = this.f11799E;
        this.f11799E = i7 + 1;
        if (i7 != 0) {
            return;
        }
        if (this.F == null) {
            UUID uuid = this.f11808q;
            this.f11809r.getClass();
            try {
                try {
                    fVar = new C0830B(uuid);
                } catch (E unused) {
                    AbstractC0156a.q("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
                    fVar = new L4.f(25);
                }
                this.F = fVar;
                fVar.i(new C0835d(this));
            } catch (UnsupportedSchemeException e3) {
                throw new Exception(e3);
            } catch (Exception e7) {
                throw new Exception(e7);
            }
        } else if (this.f11795A != -9223372036854775807L) {
            int i8 = 0;
            while (true) {
                ArrayList arrayList = this.f11796B;
                if (i8 < arrayList.size()) {
                    ((C0834c) arrayList.get(i8)).c(null);
                    i8++;
                } else {
                    return;
                }
            }
        }
    }

    @Override // j2.q
    public final int o(K k5) {
        i(false);
        x xVar = this.F;
        xVar.getClass();
        int o7 = xVar.o();
        i iVar = k5.f9658E;
        if (iVar == null) {
            int h7 = Z2.r.h(k5.f9655B);
            int i7 = 0;
            while (true) {
                int[] iArr = this.f11813v;
                if (i7 >= iArr.length) {
                    return 0;
                }
                if (iArr[i7] == h7) {
                    if (i7 == -1) {
                        return 0;
                    }
                    return o7;
                }
                i7++;
            }
        } else if (this.f11805L == null) {
            UUID uuid = this.f11808q;
            if (f(iVar, uuid, true).isEmpty()) {
                if (iVar.f11826t == 1 && iVar.f11823q[0].a(AbstractC0606g.f9960b)) {
                    AbstractC0156a.K("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + uuid);
                }
                return 1;
            }
            String str = iVar.f11825s;
            if (str != null && !"cenc".equals(str)) {
                if ("cbcs".equals(str)) {
                    if (H.f4603a >= 25) {
                        return o7;
                    }
                } else if (!"cbc1".equals(str) && !"cens".equals(str)) {
                    return o7;
                }
                return 1;
            }
            return o7;
        } else {
            return o7;
        }
    }

    @Override // j2.q
    public final k u(n nVar, K k5) {
        boolean z7 = false;
        i(false);
        if (this.f11799E > 0) {
            z7 = true;
        }
        AbstractC0156a.k(z7);
        AbstractC0156a.l(this.f11802I);
        return b(this.f11802I, nVar, k5, true);
    }
}
