package Y5;

import W5.A0;
import W5.AbstractC0117y;
import W5.C0100g;
import b6.t;
import b6.u;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k3.AbstractC0958a;
import w4.l0;
/* loaded from: classes.dex */
public final class a implements A0 {

    /* renamed from: q  reason: collision with root package name */
    public Object f4500q = d.f4527p;

    /* renamed from: r  reason: collision with root package name */
    public C0100g f4501r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ b f4502s;

    public a(b bVar) {
        this.f4502s = bVar;
    }

    @Override // W5.A0
    public final void a(t tVar, int i7) {
        C0100g c0100g = this.f4501r;
        if (c0100g != null) {
            c0100g.a(tVar, i7);
        }
    }

    public final Object b(Z5.d dVar) {
        j jVar;
        Boolean bool;
        Object m7;
        j jVar2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b.f4509x;
        b bVar = this.f4502s;
        j jVar3 = (j) atomicReferenceFieldUpdater.get(bVar);
        while (true) {
            bVar.getClass();
            boolean z7 = true;
            if (bVar.t(true, b.f4504s.get(bVar))) {
                this.f4500q = d.f4524l;
                Throwable n = bVar.n();
                if (n == null) {
                    return Boolean.FALSE;
                }
                int i7 = u.f7213a;
                throw n;
            }
            long andIncrement = b.f4505t.getAndIncrement(bVar);
            long j7 = d.f4516b;
            long j8 = andIncrement / j7;
            int i8 = (int) (andIncrement % j7);
            if (jVar3.f7212s != j8) {
                j m8 = bVar.m(j8, jVar3);
                if (m8 == null) {
                    continue;
                } else {
                    jVar = m8;
                }
            } else {
                jVar = jVar3;
            }
            Object D6 = bVar.D(jVar, i8, andIncrement, null);
            B0.d dVar2 = d.f4525m;
            if (D6 != dVar2) {
                B0.d dVar3 = d.f4526o;
                if (D6 == dVar3) {
                    if (andIncrement < bVar.r()) {
                        jVar.a();
                    }
                    jVar3 = jVar;
                } else if (D6 == d.n) {
                    b bVar2 = this.f4502s;
                    C0100g l7 = AbstractC0117y.l(l0.x(dVar));
                    try {
                        this.f4501r = l7;
                        j jVar4 = jVar;
                        Object D7 = bVar2.D(jVar, i8, andIncrement, this);
                        if (D7 == dVar2) {
                            a(jVar4, i8);
                        } else {
                            T0.h hVar = null;
                            D5.i iVar = l7.f3988u;
                            L5.l lVar = bVar2.f4513r;
                            if (D7 == dVar3) {
                                if (andIncrement < bVar2.r()) {
                                    jVar4.a();
                                }
                                j jVar5 = (j) b.f4509x.get(bVar2);
                                while (true) {
                                    if (bVar2.t(z7, b.f4504s.get(bVar2))) {
                                        C0100g c0100g = this.f4501r;
                                        M5.g.c(c0100g);
                                        this.f4501r = null;
                                        this.f4500q = d.f4524l;
                                        Throwable n7 = bVar.n();
                                        if (n7 == null) {
                                            m7 = Boolean.FALSE;
                                        } else {
                                            m7 = AbstractC0958a.m(n7);
                                        }
                                        c0100g.m(m7);
                                    } else {
                                        long andIncrement2 = b.f4505t.getAndIncrement(bVar2);
                                        long j9 = d.f4516b;
                                        long j10 = andIncrement2 / j9;
                                        int i9 = (int) (andIncrement2 % j9);
                                        if (jVar5.f7212s != j10) {
                                            j m9 = bVar2.m(j10, jVar5);
                                            if (m9 != null) {
                                                jVar2 = m9;
                                            }
                                        } else {
                                            jVar2 = jVar5;
                                        }
                                        L5.l lVar2 = lVar;
                                        Object D8 = bVar2.D(jVar2, i9, andIncrement2, this);
                                        if (D8 == d.f4525m) {
                                            a(jVar2, i9);
                                            break;
                                        } else if (D8 == d.f4526o) {
                                            if (andIncrement2 < bVar2.r()) {
                                                jVar2.a();
                                            }
                                            jVar5 = jVar2;
                                            lVar = lVar2;
                                            z7 = true;
                                        } else if (D8 != d.n) {
                                            jVar2.a();
                                            this.f4500q = D8;
                                            this.f4501r = null;
                                            bool = Boolean.TRUE;
                                            if (lVar2 != null) {
                                                hVar = new T0.h(lVar2, D8, iVar, 2);
                                            }
                                        } else {
                                            throw new IllegalStateException("unexpected".toString());
                                        }
                                    }
                                }
                            } else {
                                jVar4.a();
                                this.f4500q = D7;
                                this.f4501r = null;
                                bool = Boolean.TRUE;
                                if (lVar != null) {
                                    hVar = new T0.h(lVar, D7, iVar, 2);
                                }
                            }
                            l7.i(bool, hVar);
                        }
                        return l7.v();
                    } catch (Throwable th) {
                        l7.D();
                        throw th;
                    }
                } else {
                    jVar.a();
                    this.f4500q = D6;
                    return Boolean.TRUE;
                }
            } else {
                throw new IllegalStateException("unreachable".toString());
            }
        }
    }
}
