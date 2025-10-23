package L2;

import H2.C0016q;
import Y2.F;
import Y2.H;
import Y2.I;
import Y2.InterfaceC0143l;
import Y2.InterfaceC0144m;
import Y2.K;
import Y2.N;
import Y2.P;
import android.net.Uri;
import android.os.SystemClock;
import e2.m0;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public final class b implements I {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ c f1922A;

    /* renamed from: q  reason: collision with root package name */
    public final Uri f1923q;

    /* renamed from: r  reason: collision with root package name */
    public final N f1924r = new N("DefaultHlsPlaylistTracker:MediaPlaylist");

    /* renamed from: s  reason: collision with root package name */
    public final InterfaceC0144m f1925s;

    /* renamed from: t  reason: collision with root package name */
    public i f1926t;

    /* renamed from: u  reason: collision with root package name */
    public long f1927u;

    /* renamed from: v  reason: collision with root package name */
    public long f1928v;

    /* renamed from: w  reason: collision with root package name */
    public long f1929w;

    /* renamed from: x  reason: collision with root package name */
    public long f1930x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f1931y;

    /* renamed from: z  reason: collision with root package name */
    public IOException f1932z;

    public b(c cVar, Uri uri) {
        this.f1922A = cVar;
        this.f1923q = uri;
        this.f1925s = ((InterfaceC0143l) cVar.f1938q.f3382r).f();
    }

    public static boolean a(b bVar, long j7) {
        bVar.f1930x = SystemClock.elapsedRealtime() + j7;
        c cVar = bVar.f1922A;
        if (!bVar.f1923q.equals(cVar.f1934A)) {
            return false;
        }
        List list = cVar.f1947z.f1994e;
        int size = list.size();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i7 = 0; i7 < size; i7++) {
            b bVar2 = (b) cVar.f1941t.get(((k) list.get(i7)).f1989a);
            bVar2.getClass();
            if (elapsedRealtime > bVar2.f1930x) {
                Uri uri = bVar2.f1923q;
                cVar.f1934A = uri;
                bVar2.e(cVar.d(uri));
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, H2.q] */
    @Override // Y2.I
    public final void b(K k5) {
        P p3 = (P) k5;
        m mVar = (m) p3.f;
        Uri uri = p3.d.f4367s;
        ?? obj = new Object();
        if (mVar instanceof i) {
            f((i) mVar);
            this.f1922A.f1943v.n(obj, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else {
            m0 b7 = m0.b("Loaded playlist has unexpected type.");
            this.f1932z = b7;
            this.f1922A.f1943v.p(obj, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, b7, true);
        }
        this.f1922A.f1940s.getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, H2.q] */
    @Override // Y2.I
    public final void c(K k5, boolean z7) {
        P p3 = (P) k5;
        long j7 = p3.f4344a;
        Uri uri = p3.d.f4367s;
        ?? obj = new Object();
        c cVar = this.f1922A;
        cVar.f1940s.getClass();
        cVar.f1943v.l(obj, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void d(Uri uri) {
        c cVar = this.f1922A;
        P p3 = new P(this.f1925s, uri, cVar.f1939r.g(cVar.f1947z, this.f1926t));
        L4.f fVar = cVar.f1940s;
        int i7 = p3.f4346c;
        this.f1924r.d(p3, this, fVar.K(i7));
        cVar.f1943v.s(new C0016q(p3.f4345b), i7, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void e(Uri uri) {
        this.f1930x = 0L;
        if (!this.f1931y) {
            N n = this.f1924r;
            if (!n.b() && n.f4343c == null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j7 = this.f1929w;
                if (elapsedRealtime < j7) {
                    this.f1931y = true;
                    this.f1922A.f1945x.postDelayed(new A4.d(this, 3, uri), j7 - elapsedRealtime);
                    return;
                }
                d(uri);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x021b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(L2.i r65) {
        /*
            Method dump skipped, instructions count: 692
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: L2.b.f(L2.i):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, H2.q] */
    @Override // Y2.I
    public final H h(K k5, IOException iOException, int i7) {
        boolean z7;
        int i8;
        H h7;
        boolean z8 = false;
        P p3 = (P) k5;
        long j7 = p3.f4344a;
        Uri uri = p3.d.f4367s;
        ?? obj = new Object();
        if (uri.getQueryParameter("_HLS_msn") != null) {
            z7 = true;
        } else {
            z7 = false;
        }
        boolean z9 = iOException instanceof n;
        H h8 = N.f4340e;
        Uri uri2 = this.f1923q;
        c cVar = this.f1922A;
        int i9 = p3.f4346c;
        if (z7 || z9) {
            if (iOException instanceof F) {
                i8 = ((F) iOException).f4325t;
            } else {
                i8 = Integer.MAX_VALUE;
            }
            if (z9 || i8 == 400 || i8 == 503) {
                this.f1929w = SystemClock.elapsedRealtime();
                e(uri2);
                C.d dVar = cVar.f1943v;
                int i10 = Z2.H.f4603a;
                dVar.p(obj, i9, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, true);
                return h8;
            }
        }
        H.j jVar = new H.j(i7, (Object) iOException);
        Iterator it = cVar.f1942u.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= !((q) it.next()).c(uri2, jVar, false);
        }
        L4.f fVar = cVar.f1940s;
        if (z10) {
            fVar.getClass();
            long L6 = L4.f.L(jVar);
            if (L6 != -9223372036854775807L) {
                h7 = new H(0, L6, false);
            } else {
                h7 = N.f;
            }
            h8 = h7;
        }
        int i11 = h8.f4329a;
        if (i11 == 0 || i11 == 1) {
            z8 = true;
        }
        boolean z11 = !z8;
        cVar.f1943v.p(obj, i9, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z11);
        if (z11) {
            fVar.getClass();
        }
        return h8;
    }
}
