package L2;

import Y2.I;
import Y2.K;
import Y2.N;
import Y2.P;
import Z2.H;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import e2.C0593J;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes.dex */
public final class c implements I {

    /* renamed from: E  reason: collision with root package name */
    public static final A4.a f1933E = new A4.a(8);

    /* renamed from: A  reason: collision with root package name */
    public Uri f1934A;

    /* renamed from: B  reason: collision with root package name */
    public i f1935B;

    /* renamed from: C  reason: collision with root package name */
    public boolean f1936C;

    /* renamed from: q  reason: collision with root package name */
    public final T4.c f1938q;

    /* renamed from: r  reason: collision with root package name */
    public final p f1939r;

    /* renamed from: s  reason: collision with root package name */
    public final L4.f f1940s;

    /* renamed from: v  reason: collision with root package name */
    public C.d f1943v;

    /* renamed from: w  reason: collision with root package name */
    public N f1944w;

    /* renamed from: x  reason: collision with root package name */
    public Handler f1945x;

    /* renamed from: y  reason: collision with root package name */
    public r f1946y;

    /* renamed from: z  reason: collision with root package name */
    public l f1947z;

    /* renamed from: u  reason: collision with root package name */
    public final CopyOnWriteArrayList f1942u = new CopyOnWriteArrayList();

    /* renamed from: t  reason: collision with root package name */
    public final HashMap f1941t = new HashMap();

    /* renamed from: D  reason: collision with root package name */
    public long f1937D = -9223372036854775807L;

    public c(T4.c cVar, L4.f fVar, p pVar) {
        this.f1938q = cVar;
        this.f1939r = pVar;
        this.f1940s = fVar;
    }

    public final i a(Uri uri, boolean z7) {
        HashMap hashMap = this.f1941t;
        i iVar = ((b) hashMap.get(uri)).f1926t;
        if (iVar != null && z7 && !uri.equals(this.f1934A)) {
            List list = this.f1947z.f1994e;
            int i7 = 0;
            while (true) {
                if (i7 >= list.size()) {
                    break;
                } else if (uri.equals(((k) list.get(i7)).f1989a)) {
                    i iVar2 = this.f1935B;
                    if (iVar2 == null || !iVar2.f1978o) {
                        this.f1934A = uri;
                        b bVar = (b) hashMap.get(uri);
                        i iVar3 = bVar.f1926t;
                        if (iVar3 != null && iVar3.f1978o) {
                            this.f1935B = iVar3;
                            ((K2.m) this.f1946y).s(iVar3);
                        } else {
                            bVar.e(d(uri));
                        }
                    }
                } else {
                    i7++;
                }
            }
        }
        return iVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, H2.q] */
    @Override // Y2.I
    public final void b(K k5) {
        l lVar;
        P p3 = (P) k5;
        m mVar = (m) p3.f;
        boolean z7 = mVar instanceof i;
        if (z7) {
            String str = mVar.f2000a;
            l lVar2 = l.f1993l;
            Uri parse = Uri.parse(str);
            C0593J c0593j = new C0593J();
            c0593j.f9597a = "0";
            c0593j.f9604j = "application/x-mpegURL";
            lVar = new l("", Collections.emptyList(), Collections.singletonList(new k(parse, new e2.K(c0593j), null, null, null, null)), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, null, false, Collections.emptyMap(), Collections.emptyList());
        } else {
            lVar = (l) mVar;
        }
        this.f1947z = lVar;
        this.f1934A = ((k) lVar.f1994e.get(0)).f1989a;
        this.f1942u.add(new a(this));
        List list = lVar.d;
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            Uri uri = (Uri) list.get(i7);
            this.f1941t.put(uri, new b(this, uri));
        }
        Uri uri2 = p3.d.f4367s;
        ?? obj = new Object();
        b bVar = (b) this.f1941t.get(this.f1934A);
        if (z7) {
            bVar.f((i) mVar);
        } else {
            bVar.e(bVar.f1923q);
        }
        this.f1940s.getClass();
        this.f1943v.n(obj, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, H2.q] */
    @Override // Y2.I
    public final void c(K k5, boolean z7) {
        P p3 = (P) k5;
        long j7 = p3.f4344a;
        Uri uri = p3.d.f4367s;
        ?? obj = new Object();
        this.f1940s.getClass();
        this.f1943v.l(obj, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final Uri d(Uri uri) {
        e eVar;
        i iVar = this.f1935B;
        if (iVar != null && iVar.f1985v.f1969e && (eVar = (e) iVar.f1983t.get(uri)) != null) {
            Uri.Builder buildUpon = uri.buildUpon();
            buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(eVar.f1951b));
            int i7 = eVar.f1952c;
            if (i7 != -1) {
                buildUpon.appendQueryParameter("_HLS_part", String.valueOf(i7));
            }
            return buildUpon.build();
        }
        return uri;
    }

    public final boolean e(Uri uri) {
        int i7;
        b bVar = (b) this.f1941t.get(uri);
        if (bVar.f1926t == null) {
            return false;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long max = Math.max(30000L, H.S(bVar.f1926t.f1984u));
        i iVar = bVar.f1926t;
        if (!iVar.f1978o && (i7 = iVar.d) != 2 && i7 != 1 && bVar.f1927u + max <= elapsedRealtime) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0083  */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, H2.q] */
    @Override // Y2.I
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final Y2.H h(Y2.K r21, java.io.IOException r22, int r23) {
        /*
            r20 = this;
            r0 = r20
            r12 = r22
            r14 = 0
            r1 = r21
            Y2.P r1 = (Y2.P) r1
            H2.q r2 = new H2.q
            long r3 = r1.f4344a
            Y2.V r3 = r1.d
            android.net.Uri r3 = r3.f4367s
            r2.<init>()
            L4.f r3 = r0.f1940s
            r3.getClass()
            boolean r3 = r12 instanceof e2.m0
            r4 = 1
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r3 != 0) goto L54
            boolean r3 = r12 instanceof java.io.FileNotFoundException
            if (r3 != 0) goto L54
            boolean r3 = r12 instanceof Y2.C
            if (r3 != 0) goto L54
            boolean r3 = r12 instanceof Y2.M
            if (r3 != 0) goto L54
            int r3 = Y2.C0145n.f4406r
            r3 = r12
        L32:
            if (r3 == 0) goto L47
            boolean r7 = r3 instanceof Y2.C0145n
            if (r7 == 0) goto L42
            r7 = r3
            Y2.n r7 = (Y2.C0145n) r7
            int r7 = r7.f4407q
            r8 = 2008(0x7d8, float:2.814E-42)
            if (r7 != r8) goto L42
            goto L54
        L42:
            java.lang.Throwable r3 = r3.getCause()
            goto L32
        L47:
            int r3 = r23 + (-1)
            int r3 = r3 * 1000
            r7 = 5000(0x1388, float:7.006E-42)
            int r3 = java.lang.Math.min(r3, r7)
            long r7 = (long) r3
            r10 = r7
            goto L55
        L54:
            r10 = r5
        L55:
            int r3 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r3 != 0) goto L5b
            r15 = r4
            goto L5c
        L5b:
            r15 = r14
        L5c:
            C.d r3 = r0.f1943v
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = r1.f4346c
            r5 = -1
            r6 = 0
            r7 = 0
            r13 = 0
            r1 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r13
            r18 = r10
            r10 = r16
            r12 = r22
            r13 = r15
            r1.p(r2, r3, r4, r5, r6, r7, r8, r10, r12, r13)
            if (r15 == 0) goto L83
            Y2.H r1 = Y2.N.f
            goto L8a
        L83:
            Y2.H r1 = new Y2.H
            r5 = r18
            r1.<init>(r14, r5, r14)
        L8a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: L2.c.h(Y2.K, java.io.IOException, int):Y2.H");
    }
}
