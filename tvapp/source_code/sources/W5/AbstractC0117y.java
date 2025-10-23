package W5;

import a.AbstractC0189a;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import k3.AbstractC0958a;
import n1.C1028c;
import z5.C1526h;
import z5.C1530l;
/* renamed from: W5.y */
/* loaded from: classes.dex */
public abstract class AbstractC0117y {

    /* renamed from: a */
    public static final B0.d f4034a = new B0.d(6, "RESUME_TOKEN", false);

    /* renamed from: b */
    public static final B0.d f4035b = new B0.d(6, "REMOVED_TASK", false);

    /* renamed from: c */
    public static final B0.d f4036c = new B0.d(6, "CLOSED_EMPTY", false);
    public static final B0.d d = new B0.d(6, "COMPLETING_ALREADY", false);

    /* renamed from: e */
    public static final B0.d f4037e = new B0.d(6, "COMPLETING_WAITING_CHILDREN", false);
    public static final B0.d f = new B0.d(6, "COMPLETING_RETRY", false);

    /* renamed from: g */
    public static final B0.d f4038g = new B0.d(6, "TOO_LATE_TO_CANCEL", false);

    /* renamed from: h */
    public static final B0.d f4039h = new B0.d(6, "SEALED", false);

    /* renamed from: i */
    public static final K f4040i = new K(false);

    /* renamed from: j */
    public static final K f4041j = new K(true);

    public static final b6.e a(D5.i iVar) {
        if (iVar.f(C0114v.f4028r) == null) {
            iVar = iVar.r(new d0(null));
        }
        return new b6.e(iVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [W5.q0, W5.d0] */
    public static q0 b() {
        return new d0(null);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [W5.a, W5.C] */
    public static C c(b6.e eVar, L5.p pVar) {
        ?? abstractC0092a = new AbstractC0092a(q(eVar, D5.j.f531q), true);
        abstractC0092a.d0(1, abstractC0092a, pVar);
        return abstractC0092a;
    }

    public static void d(b6.e eVar) {
        InterfaceC0093a0 interfaceC0093a0 = (InterfaceC0093a0) eVar.f7184q.f(C0114v.f4028r);
        if (interfaceC0093a0 != null) {
            interfaceC0093a0.b(null);
            return;
        }
        throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + eVar).toString());
    }

    public static final Object e(L5.p pVar, D5.d dVar) {
        b6.s sVar = new b6.s(dVar, dVar.k());
        return AbstractC0189a.H(sVar, sVar, pVar);
    }

    public static final Object f(long j7, D5.d dVar) {
        int i7 = (j7 > 0L ? 1 : (j7 == 0L ? 0 : -1));
        C1530l c1530l = C1530l.f16479a;
        if (i7 <= 0) {
            return c1530l;
        }
        C0100g c0100g = new C0100g(1, w4.l0.x(dVar));
        c0100g.w();
        if (j7 < Long.MAX_VALUE) {
            i(c0100g.f3988u).y(j7, c0100g);
        }
        Object v5 = c0100g.v();
        if (v5 == E5.a.f612q) {
            return v5;
        }
        return c1530l;
    }

    public static final void g(D5.i iVar) {
        InterfaceC0093a0 interfaceC0093a0 = (InterfaceC0093a0) iVar.f(C0114v.f4028r);
        if (interfaceC0093a0 != null && !interfaceC0093a0.a()) {
            throw ((j0) interfaceC0093a0).E();
        }
    }

    public static final D5.i h(D5.i iVar, D5.i iVar2, boolean z7) {
        Boolean bool = Boolean.FALSE;
        r rVar = r.f4016t;
        boolean booleanValue = ((Boolean) iVar.O(bool, rVar)).booleanValue();
        boolean booleanValue2 = ((Boolean) iVar2.O(bool, rVar)).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return iVar.r(iVar2);
        }
        D5.j jVar = D5.j.f531q;
        D5.i iVar3 = (D5.i) iVar.O(jVar, new r(2, 2));
        D5.i iVar4 = iVar2;
        if (booleanValue2) {
            iVar4 = iVar2.O(jVar, r.f4015s);
        }
        return iVar3.r(iVar4);
    }

    public static final D i(D5.i iVar) {
        D d7;
        D5.g f7 = iVar.f(D5.e.f529q);
        if (f7 instanceof D) {
            d7 = (D) f7;
        } else {
            d7 = null;
        }
        if (d7 == null) {
            return A.f3941a;
        }
        return d7;
    }

    public static final String j(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final InterfaceC0093a0 k(D5.i iVar) {
        InterfaceC0093a0 interfaceC0093a0 = (InterfaceC0093a0) iVar.f(C0114v.f4028r);
        if (interfaceC0093a0 != null) {
            return interfaceC0093a0;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + iVar).toString());
    }

    public static final C0100g l(D5.d dVar) {
        C0100g c0100g;
        C0100g c0100g2;
        if (!(dVar instanceof b6.h)) {
            return new C0100g(1, dVar);
        }
        b6.h hVar = (b6.h) dVar;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b6.h.f7187x;
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            B0.d dVar2 = b6.a.d;
            c0100g = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(hVar, dVar2);
                c0100g2 = null;
                break;
            } else if (obj instanceof C0100g) {
                while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, dVar2)) {
                    if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                        break;
                    }
                }
                c0100g2 = (C0100g) obj;
                break loop0;
            } else if (obj != dVar2 && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (c0100g2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C0100g.f3985w;
            Object obj2 = atomicReferenceFieldUpdater2.get(c0100g2);
            if ((obj2 instanceof C0108o) && ((C0108o) obj2).d != null) {
                c0100g2.s();
            } else {
                C0100g.f3984v.set(c0100g2, 536870911);
                atomicReferenceFieldUpdater2.set(c0100g2, C0094b.f3974q);
                c0100g = c0100g2;
            }
            if (c0100g != null) {
                return c0100g;
            }
        }
        return new C0100g(2, dVar);
    }

    public static final void m(D5.i iVar, Throwable th) {
        try {
            InterfaceC0115w interfaceC0115w = (InterfaceC0115w) iVar.f(C0114v.f4027q);
            if (interfaceC0115w != null) {
                interfaceC0115w.h(iVar, th);
            } else {
                b6.a.e(iVar, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                android.support.v4.media.session.b.a(runtimeException, th);
                th = runtimeException;
            }
            b6.a.e(iVar, th);
        }
    }

    public static /* synthetic */ I n(InterfaceC0093a0 interfaceC0093a0, boolean z7, e0 e0Var, int i7) {
        boolean z8 = false;
        if ((i7 & 1) != 0) {
            z7 = false;
        }
        if ((i7 & 2) != 0) {
            z8 = true;
        }
        return ((j0) interfaceC0093a0).P(z7, z8, e0Var);
    }

    public static final boolean o(int i7) {
        if (i7 == 1 || i7 == 2) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [W5.p0, W5.a] */
    /* JADX WARN: Type inference failed for: r3v8 */
    public static p0 p(InterfaceC0116x interfaceC0116x, AbstractC0113u abstractC0113u, int i7, L5.p pVar, int i8) {
        k0 k0Var;
        D5.i iVar = abstractC0113u;
        if ((i8 & 1) != 0) {
            iVar = D5.j.f531q;
        }
        if ((i8 & 2) != 0) {
            i7 = 1;
        }
        D5.i q5 = q(interfaceC0116x, iVar);
        if (i7 == 2) {
            k0Var = new k0(q5, pVar);
        } else {
            k0Var = new AbstractC0092a(q5, true);
        }
        k0Var.d0(i7, k0Var, pVar);
        return k0Var;
    }

    public static final D5.i q(InterfaceC0116x interfaceC0116x, D5.i iVar) {
        D5.i h7 = h(interfaceC0116x.n(), iVar, true);
        d6.d dVar = G.f3945a;
        if (h7 != dVar && h7.f(D5.e.f529q) == null) {
            return h7.r(dVar);
        }
        return h7;
    }

    public static final Object r(Object obj) {
        if (obj instanceof C0109p) {
            return AbstractC0958a.m(((C0109p) obj).f4012a);
        }
        return obj;
    }

    public static final void s(F f7, D5.d dVar, boolean z7) {
        Object f8;
        y0 y0Var;
        boolean e02;
        Object j7 = f7.j();
        Throwable e3 = f7.e(j7);
        if (e3 != null) {
            f8 = AbstractC0958a.m(e3);
        } else {
            f8 = f7.f(j7);
        }
        if (z7) {
            M5.g.d(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
            b6.h hVar = (b6.h) dVar;
            D5.d dVar2 = hVar.f7189u;
            D5.i k5 = dVar2.k();
            Object m7 = b6.a.m(k5, hVar.f7191w);
            if (m7 != b6.a.f) {
                y0Var = x(dVar2, k5, m7);
            } else {
                y0Var = null;
            }
            try {
                dVar2.m(f8);
                if (y0Var != null) {
                    if (!e02) {
                        return;
                    }
                }
                return;
            } finally {
                if (y0Var == null || y0Var.e0()) {
                    b6.a.h(k5, m7);
                }
            }
        }
        dVar.m(f8);
    }

    public static Object t(L5.p pVar) {
        Object obj;
        D5.i iVar;
        long j7;
        C0109p c0109p;
        Thread currentThread = Thread.currentThread();
        D5.e eVar = D5.e.f529q;
        Q a7 = s0.a();
        Boolean bool = Boolean.FALSE;
        r rVar = r.f4016t;
        boolean booleanValue = bool.booleanValue();
        boolean booleanValue2 = ((Boolean) a7.O(bool, rVar)).booleanValue();
        if (!booleanValue && !booleanValue2) {
            iVar = a7;
        } else {
            D5.j jVar = D5.j.f531q;
            if (booleanValue2) {
                obj = a7.O(jVar, r.f4015s);
            } else {
                obj = a7;
            }
            iVar = (D5.i) obj;
            jVar.r(iVar);
        }
        d6.d dVar = G.f3945a;
        if (iVar != dVar && iVar.f(eVar) == null) {
            iVar = iVar.r(dVar);
        }
        C0096c c0096c = new C0096c(iVar, currentThread, a7);
        c0096c.d0(1, c0096c, pVar);
        Q q5 = c0096c.f3977u;
        if (q5 != null) {
            int i7 = Q.f3960v;
            q5.a0(false);
        }
        while (!Thread.interrupted()) {
            try {
                if (q5 != null) {
                    j7 = q5.b0();
                } else {
                    j7 = Long.MAX_VALUE;
                }
                if (!(!(c0096c.K() instanceof W))) {
                    LockSupport.parkNanos(c0096c, j7);
                } else {
                    if (q5 != null) {
                        int i8 = Q.f3960v;
                        q5.Y(false);
                    }
                    Object w7 = w(c0096c.K());
                    if (w7 instanceof C0109p) {
                        c0109p = (C0109p) w7;
                    } else {
                        c0109p = null;
                    }
                    if (c0109p == null) {
                        return w7;
                    }
                    throw c0109p.f4012a;
                }
            } catch (Throwable th) {
                if (q5 != null) {
                    int i9 = Q.f3960v;
                    q5.Y(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        c0096c.v(interruptedException);
        throw interruptedException;
    }

    public static final Object u(v0 v0Var, C1028c c1028c) {
        Object c0109p;
        Object R6;
        v0Var.P(false, true, new J(0, i(v0Var.f7210t.k()).n(v0Var.f4029u, v0Var, v0Var.f3972s)));
        try {
            M5.r.b(2, c1028c);
            c0109p = c1028c.j(v0Var, v0Var);
        } catch (Throwable th) {
            c0109p = new C0109p(th, false);
        }
        E5.a aVar = E5.a.f612q;
        if (c0109p != aVar && (R6 = v0Var.R(c0109p)) != f4037e) {
            if (R6 instanceof C0109p) {
                Throwable th2 = ((C0109p) R6).f4012a;
                if ((th2 instanceof u0) && ((u0) th2).f4026q == v0Var) {
                    if (c0109p instanceof C0109p) {
                        throw ((C0109p) c0109p).f4012a;
                    }
                } else {
                    throw th2;
                }
            } else {
                c0109p = w(R6);
            }
            return c0109p;
        }
        return aVar;
    }

    public static final String v(D5.d dVar) {
        String str;
        if (dVar instanceof b6.h) {
            return dVar.toString();
        }
        try {
            str = dVar + '@' + j(dVar);
        } catch (Throwable th) {
            str = AbstractC0958a.m(th);
        }
        Throwable a7 = C1526h.a(str);
        String str2 = str;
        if (a7 != null) {
            str2 = dVar.getClass().getName() + '@' + j(dVar);
        }
        return (String) str2;
    }

    public static final Object w(Object obj) {
        X x7;
        W w7;
        if (obj instanceof X) {
            x7 = (X) obj;
        } else {
            x7 = null;
        }
        if (x7 != null && (w7 = x7.f3967a) != null) {
            return w7;
        }
        return obj;
    }

    public static final y0 x(D5.d dVar, D5.i iVar, Object obj) {
        y0 y0Var = null;
        if (!(dVar instanceof F5.d)) {
            return null;
        }
        if (iVar.f(z0.f4045q) != null) {
            F5.d dVar2 = (F5.d) dVar;
            while (true) {
                if (!(dVar2 instanceof E) && (dVar2 = dVar2.g()) != null) {
                    if (dVar2 instanceof y0) {
                        y0Var = (y0) dVar2;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (y0Var != null) {
                y0Var.f0(iVar, obj);
            }
        }
        return y0Var;
    }

    public static final Object y(D5.d dVar, D5.i iVar, L5.p pVar) {
        D5.i h7;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        D5.i k5 = dVar.k();
        if (!((Boolean) iVar.O(Boolean.FALSE, r.f4016t)).booleanValue()) {
            h7 = k5.r(iVar);
        } else {
            h7 = h(k5, iVar, false);
        }
        g(h7);
        if (h7 == k5) {
            b6.s sVar = new b6.s(dVar, h7);
            return AbstractC0189a.H(sVar, sVar, pVar);
        }
        D5.e eVar = D5.e.f529q;
        if (M5.g.a(h7.f(eVar), k5.f(eVar))) {
            y0 y0Var = new y0(dVar, h7);
            D5.i iVar2 = y0Var.f3972s;
            Object m7 = b6.a.m(iVar2, null);
            try {
                return AbstractC0189a.H(y0Var, y0Var, pVar);
            } finally {
                b6.a.h(iVar2, m7);
            }
        }
        b6.s sVar2 = new b6.s(dVar, h7);
        w4.l0.U(pVar, sVar2, sVar2);
        do {
            atomicIntegerFieldUpdater = E.f3943u;
            int i7 = atomicIntegerFieldUpdater.get(sVar2);
            if (i7 != 0) {
                if (i7 == 2) {
                    Object w7 = w(sVar2.K());
                    if (w7 instanceof C0109p) {
                        throw ((C0109p) w7).f4012a;
                    }
                    return w7;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(sVar2, 0, 1));
        return E5.a.f612q;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0064  */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, M5.o] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object z(long r7, n1.C1028c r9, D5.d r10) {
        /*
            boolean r0 = r10 instanceof W5.w0
            if (r0 == 0) goto L13
            r0 = r10
            W5.w0 r0 = (W5.w0) r0
            int r1 = r0.f4032v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4032v = r1
            goto L18
        L13:
            W5.w0 r0 = new W5.w0
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f4031u
            E5.a r1 = E5.a.f612q
            int r2 = r0.f4032v
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            M5.o r7 = r0.f4030t
            k3.AbstractC0958a.H(r10)     // Catch: W5.u0 -> L2a
            goto L58
        L2a:
            r8 = move-exception
            goto L5d
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            k3.AbstractC0958a.H(r10)
            r5 = 0
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 > 0) goto L3e
            return r3
        L3e:
            M5.o r10 = new M5.o
            r10.<init>()
            r0.getClass()     // Catch: W5.u0 -> L5b
            r0.f4030t = r10     // Catch: W5.u0 -> L5b
            r0.f4032v = r4     // Catch: W5.u0 -> L5b
            W5.v0 r2 = new W5.v0     // Catch: W5.u0 -> L5b
            r2.<init>(r7, r0)     // Catch: W5.u0 -> L5b
            r10.f2315q = r2     // Catch: W5.u0 -> L5b
            java.lang.Object r10 = u(r2, r9)     // Catch: W5.u0 -> L5b
            if (r10 != r1) goto L58
            return r1
        L58:
            return r10
        L59:
            r7 = r10
            goto L5d
        L5b:
            r8 = move-exception
            goto L59
        L5d:
            W5.a0 r9 = r8.f4026q
            java.lang.Object r7 = r7.f2315q
            if (r9 != r7) goto L64
            return r3
        L64:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: W5.AbstractC0117y.z(long, n1.c, D5.d):java.lang.Object");
    }
}
