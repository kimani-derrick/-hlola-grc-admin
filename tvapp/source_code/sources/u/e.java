package u;

import A5.u;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import g2.O;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import t.C1215a;
import t.C1218d;
import t.C1219e;
import v6.w;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14612a = 0;

    /* renamed from: b  reason: collision with root package name */
    public boolean f14613b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f14614c;
    public Object d;

    /* renamed from: e  reason: collision with root package name */
    public Object f14615e;
    public Serializable f;

    /* renamed from: g  reason: collision with root package name */
    public Serializable f14616g;

    /* renamed from: h  reason: collision with root package name */
    public Object f14617h;

    /* renamed from: i  reason: collision with root package name */
    public Object f14618i;

    public /* synthetic */ e() {
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [u.k, java.lang.Object] */
    public void a(f fVar, int i7, ArrayList arrayList, k kVar) {
        m mVar = fVar.d;
        if (mVar.f14637c == null) {
            C1219e c1219e = (C1219e) this.d;
            if (mVar != c1219e.d) {
                k kVar2 = kVar;
                if (mVar != c1219e.f14476e) {
                    if (kVar == null) {
                        ?? obj = new Object();
                        obj.f14631a = null;
                        obj.f14632b = new ArrayList();
                        obj.f14631a = mVar;
                        arrayList.add(obj);
                        kVar2 = obj;
                    }
                    mVar.f14637c = kVar2;
                    kVar2.f14632b.add(mVar);
                    f fVar2 = mVar.f14640h;
                    Iterator it = fVar2.f14627k.iterator();
                    while (it.hasNext()) {
                        d dVar = (d) it.next();
                        if (dVar instanceof f) {
                            a((f) dVar, i7, arrayList, kVar2);
                        }
                    }
                    f fVar3 = mVar.f14641i;
                    Iterator it2 = fVar3.f14627k.iterator();
                    while (it2.hasNext()) {
                        d dVar2 = (d) it2.next();
                        if (dVar2 instanceof f) {
                            a((f) dVar2, i7, arrayList, kVar2);
                        }
                    }
                    if (i7 == 1 && (mVar instanceof l)) {
                        Iterator it3 = ((l) mVar).f14633k.f14627k.iterator();
                        while (it3.hasNext()) {
                            d dVar3 = (d) it3.next();
                            if (dVar3 instanceof f) {
                                a((f) dVar3, i7, arrayList, kVar2);
                            }
                        }
                    }
                    Iterator it4 = fVar2.f14628l.iterator();
                    while (it4.hasNext()) {
                        a((f) it4.next(), i7, arrayList, kVar2);
                    }
                    Iterator it5 = fVar3.f14628l.iterator();
                    while (it5.hasNext()) {
                        a((f) it5.next(), i7, arrayList, kVar2);
                    }
                    if (i7 == 1 && (mVar instanceof l)) {
                        Iterator it6 = ((l) mVar).f14633k.f14628l.iterator();
                        while (it6.hasNext()) {
                            a((f) it6.next(), i7, arrayList, kVar2);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0064, code lost:
        if (r2.f14481k == 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00a9, code lost:
        if (r5 == 2) goto L165;
     */
    /* JADX WARN: Removed duplicated region for block: B:175:0x01f2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0008 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x016f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(t.C1219e r20) {
        /*
            Method dump skipped, instructions count: 614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u.e.b(t.e):void");
    }

    public void c() {
        m mVar;
        ArrayList arrayList = (ArrayList) this.f;
        arrayList.clear();
        C1219e c1219e = (C1219e) this.f14615e;
        c1219e.d.f();
        l lVar = c1219e.f14476e;
        lVar.f();
        arrayList.add(c1219e.d);
        arrayList.add(lVar);
        Iterator it = c1219e.f14496d0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            C1218d c1218d = (C1218d) it.next();
            if (c1218d instanceof t.f) {
                mVar = new m(c1218d);
                c1218d.d.f();
                c1218d.f14476e.f();
                mVar.f = ((t.f) c1218d).f14515h0;
            } else {
                if (c1218d.o()) {
                    if (c1218d.f14472b == null) {
                        c1218d.f14472b = new c(c1218d, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c1218d.f14472b);
                } else {
                    arrayList.add(c1218d.d);
                }
                if (c1218d.p()) {
                    if (c1218d.f14474c == null) {
                        c1218d.f14474c = new c(c1218d, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c1218d.f14474c);
                } else {
                    arrayList.add(c1218d.f14476e);
                }
                if (c1218d instanceof C1215a) {
                    mVar = new m(c1218d);
                }
            }
            arrayList.add(mVar);
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((m) it2.next()).f();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            m mVar2 = (m) it3.next();
            if (mVar2.f14636b != c1219e) {
                mVar2.d();
            }
        }
        ArrayList arrayList2 = (ArrayList) this.f14616g;
        arrayList2.clear();
        C1219e c1219e2 = (C1219e) this.d;
        e(c1219e2.d, 0, arrayList2);
        e(c1219e2.f14476e, 1, arrayList2);
        this.f14613b = false;
    }

    public int d(C1219e c1219e, int i7) {
        m mVar;
        m mVar2;
        ArrayList arrayList;
        int i8;
        int i9;
        long j7;
        long j8;
        long j9;
        float f;
        long j10;
        C1219e c1219e2 = c1219e;
        ArrayList arrayList2 = (ArrayList) this.f14616g;
        int size = arrayList2.size();
        int i10 = 0;
        long j11 = 0;
        while (i10 < size) {
            m mVar3 = ((k) arrayList2.get(i10)).f14631a;
            if (!(mVar3 instanceof c) ? !(i7 != 0 ? (mVar3 instanceof l) : (mVar3 instanceof j)) : ((c) mVar3).f != i7) {
                arrayList = arrayList2;
                i8 = size;
                i9 = i10;
                j7 = 0;
            } else {
                if (i7 == 0) {
                    mVar = c1219e2.d;
                } else {
                    mVar = c1219e2.f14476e;
                }
                f fVar = mVar.f14640h;
                if (i7 == 0) {
                    mVar2 = c1219e2.d;
                } else {
                    mVar2 = c1219e2.f14476e;
                }
                f fVar2 = mVar2.f14641i;
                boolean contains = mVar3.f14640h.f14628l.contains(fVar);
                f fVar3 = mVar3.f14641i;
                boolean contains2 = fVar3.f14628l.contains(fVar2);
                long j12 = mVar3.j();
                f fVar4 = mVar3.f14640h;
                if (contains && contains2) {
                    long b7 = k.b(fVar4, 0L);
                    ArrayList arrayList3 = arrayList2;
                    i8 = size;
                    long a7 = k.a(fVar3, 0L);
                    long j13 = b7 - j12;
                    int i11 = fVar3.f;
                    arrayList = arrayList3;
                    i9 = i10;
                    if (j13 >= (-i11)) {
                        j13 += i11;
                    }
                    long j14 = fVar4.f;
                    long j15 = ((-a7) - j12) - j14;
                    if (j15 >= j14) {
                        j15 -= j14;
                    }
                    C1218d c1218d = mVar3.f14636b;
                    if (i7 == 0) {
                        f = c1218d.f14463S;
                    } else if (i7 == 1) {
                        f = c1218d.f14464T;
                    } else {
                        c1218d.getClass();
                        f = -1.0f;
                    }
                    if (f > 0.0f) {
                        j10 = (((float) j13) / (1.0f - f)) + (((float) j15) / f);
                    } else {
                        j10 = 0;
                    }
                    float f7 = (float) j10;
                    j7 = (fVar4.f + ((((f7 * f) + 0.5f) + j12) + AbstractC0515y1.g(1.0f, f, f7, 0.5f))) - fVar3.f;
                } else {
                    arrayList = arrayList2;
                    i8 = size;
                    i9 = i10;
                    if (contains) {
                        j9 = k.b(fVar4, fVar4.f);
                        j8 = fVar4.f + j12;
                    } else if (contains2) {
                        j8 = (-fVar3.f) + j12;
                        j9 = -k.a(fVar3, fVar3.f);
                    } else {
                        j7 = (mVar3.j() + fVar4.f) - fVar3.f;
                    }
                    j7 = Math.max(j9, j8);
                }
            }
            j11 = Math.max(j11, j7);
            i10 = i9 + 1;
            c1219e2 = c1219e;
            size = i8;
            arrayList2 = arrayList;
        }
        return (int) j11;
    }

    public void e(m mVar, int i7, ArrayList arrayList) {
        f fVar;
        f fVar2;
        f fVar3;
        Iterator it = mVar.f14640h.f14627k.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            fVar = mVar.f14641i;
            if (!hasNext) {
                break;
            }
            d dVar = (d) it.next();
            if (dVar instanceof f) {
                fVar3 = (f) dVar;
            } else if (dVar instanceof m) {
                fVar3 = ((m) dVar).f14640h;
            }
            a(fVar3, i7, arrayList, null);
        }
        Iterator it2 = fVar.f14627k.iterator();
        while (it2.hasNext()) {
            d dVar2 = (d) it2.next();
            if (dVar2 instanceof f) {
                fVar2 = (f) dVar2;
            } else if (dVar2 instanceof m) {
                fVar2 = ((m) dVar2).f14641i;
            }
            a(fVar2, i7, arrayList, null);
        }
        if (i7 == 1) {
            Iterator it3 = ((l) mVar).f14633k.f14627k.iterator();
            while (it3.hasNext()) {
                d dVar3 = (d) it3.next();
                if (dVar3 instanceof f) {
                    a((f) dVar3, i7, arrayList, null);
                }
            }
        }
    }

    public void f(int i7, int i8, int i9, int i10, C1218d c1218d) {
        boolean z7;
        b bVar = (b) this.f14618i;
        bVar.f14602a = i7;
        bVar.f14603b = i9;
        bVar.f14604c = i8;
        bVar.d = i10;
        ((O) this.f14617h).a(c1218d, bVar);
        c1218d.v(bVar.f14605e);
        c1218d.s(bVar.f);
        c1218d.f14492w = bVar.f14607h;
        int i11 = bVar.f14606g;
        c1218d.f14460P = i11;
        if (i11 > 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        c1218d.f14492w = z7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0076, code lost:
        if (r11 == 3) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0078, code lost:
        r0.f14629m = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007b, code lost:
        r0.d(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0096, code lost:
        if (r9 == 3) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g() {
        /*
            r17 = this;
            r6 = r17
            java.lang.Object r0 = r6.d
            t.e r0 = (t.C1219e) r0
            java.util.ArrayList r0 = r0.f14496d0
            java.util.Iterator r7 = r0.iterator()
        Lc:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto La8
            java.lang.Object r0 = r7.next()
            r8 = r0
            t.d r8 = (t.C1218d) r8
            boolean r0 = r8.f14470a
            if (r0 == 0) goto L1e
            goto Lc
        L1e:
            int[] r0 = r8.f14475c0
            r1 = 0
            r9 = r0[r1]
            r10 = 1
            r11 = r0[r10]
            int r0 = r8.f14480j
            int r2 = r8.f14481k
            r3 = 2
            r12 = 3
            if (r9 == r3) goto L35
            if (r9 != r12) goto L33
            if (r0 != r10) goto L33
            goto L35
        L33:
            r0 = r1
            goto L36
        L35:
            r0 = r10
        L36:
            if (r11 == r3) goto L3c
            if (r11 != r12) goto L3d
            if (r2 != r10) goto L3d
        L3c:
            r1 = r10
        L3d:
            u.j r13 = r8.d
            u.g r2 = r13.f14638e
            boolean r4 = r2.f14626j
            u.l r14 = r8.f14476e
            u.g r5 = r14.f14638e
            boolean r15 = r5.f14626j
            r16 = 1
            if (r4 == 0) goto L60
            if (r15 == 0) goto L60
            int r2 = r2.f14623g
            int r4 = r5.f14623g
            r0 = r17
            r1 = r16
            r3 = r16
            r5 = r8
            r0.f(r1, r2, r3, r4, r5)
        L5d:
            r8.f14470a = r10
            goto L99
        L60:
            if (r4 == 0) goto L7f
            if (r1 == 0) goto L7f
            int r2 = r2.f14623g
            int r4 = r5.f14623g
            r0 = r17
            r1 = r16
            r5 = r8
            r0.f(r1, r2, r3, r4, r5)
            u.g r0 = r14.f14638e
            int r1 = r8.g()
            if (r11 != r12) goto L7b
        L78:
            r0.f14629m = r1
            goto L99
        L7b:
            r0.d(r1)
            goto L5d
        L7f:
            if (r15 == 0) goto L99
            if (r0 == 0) goto L99
            int r2 = r2.f14623g
            int r4 = r5.f14623g
            r0 = r17
            r1 = r3
            r3 = r16
            r5 = r8
            r0.f(r1, r2, r3, r4, r5)
            u.g r0 = r13.f14638e
            int r1 = r8.j()
            if (r9 != r12) goto L7b
            goto L78
        L99:
            boolean r0 = r8.f14470a
            if (r0 == 0) goto Lc
            u.a r0 = r14.f14634l
            if (r0 == 0) goto Lc
            int r1 = r8.f14460P
            r0.d(r1)
            goto Lc
        La8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u.e.g():void");
    }

    public String toString() {
        switch (this.f14612a) {
            case 1:
                ArrayList arrayList = new ArrayList();
                if (this.f14613b) {
                    arrayList.add("isRegularFile");
                }
                if (this.f14614c) {
                    arrayList.add("isDirectory");
                }
                Long l7 = (Long) this.f14615e;
                if (l7 != null) {
                    arrayList.add("byteCount=" + l7);
                }
                Long l8 = (Long) this.f;
                if (l8 != null) {
                    arrayList.add("createdAt=" + l8);
                }
                Long l9 = (Long) this.f14616g;
                if (l9 != null) {
                    arrayList.add("lastModifiedAt=" + l9);
                }
                Long l10 = (Long) this.f14617h;
                if (l10 != null) {
                    arrayList.add("lastAccessedAt=" + l10);
                }
                Map map = (Map) this.f14618i;
                if (!map.isEmpty()) {
                    arrayList.add("extras=" + map);
                }
                return A5.k.a0(arrayList, ", ", "FileMetadata(", ")", null, 56);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ e(boolean z7, boolean z8, w wVar, Long l7, Long l8, Long l9, Long l10) {
        this(z7, z8, wVar, l7, l8, l9, l10, u.f136q);
    }

    public e(boolean z7, boolean z8, w wVar, Long l7, Long l8, Long l9, Long l10, Map map) {
        M5.g.f(map, "extras");
        this.f14613b = z7;
        this.f14614c = z8;
        this.d = wVar;
        this.f14615e = l7;
        this.f = l8;
        this.f14616g = l9;
        this.f14617h = l10;
        this.f14618i = A5.w.N(map);
    }
}
