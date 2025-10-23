package W5;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import z5.C1526h;
import z5.C1530l;
/* renamed from: W5.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0100g extends F implements InterfaceC0099f, F5.d, A0 {

    /* renamed from: v  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f3984v = AtomicIntegerFieldUpdater.newUpdater(C0100g.class, "_decisionAndIndex");

    /* renamed from: w  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f3985w = AtomicReferenceFieldUpdater.newUpdater(C0100g.class, Object.class, "_state");

    /* renamed from: x  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f3986x = AtomicReferenceFieldUpdater.newUpdater(C0100g.class, Object.class, "_parentHandle");
    private volatile int _decisionAndIndex;
    private volatile Object _parentHandle;
    private volatile Object _state;

    /* renamed from: t  reason: collision with root package name */
    public final D5.d f3987t;

    /* renamed from: u  reason: collision with root package name */
    public final D5.i f3988u;

    public C0100g(int i7, D5.d dVar) {
        super(i7);
        this.f3987t = dVar;
        this.f3988u = dVar.k();
        this._decisionAndIndex = 536870911;
        this._state = C0094b.f3974q;
    }

    public static void B(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    public static Object F(n0 n0Var, Object obj, int i7, L5.l lVar) {
        C0098e c0098e;
        if (!(obj instanceof C0109p) && AbstractC0117y.o(i7)) {
            if (lVar != null || (n0Var instanceof C0098e)) {
                if (n0Var instanceof C0098e) {
                    c0098e = (C0098e) n0Var;
                } else {
                    c0098e = null;
                }
                return new C0108o(obj, c0098e, lVar, (CancellationException) null, 16);
            }
            return obj;
        }
        return obj;
    }

    public final boolean A() {
        if (this.f3944s == 2) {
            D5.d dVar = this.f3987t;
            M5.g.d(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (b6.h.f7187x.get((b6.h) dVar) != null) {
                return true;
            }
        }
        return false;
    }

    public String C() {
        return "CancellableContinuation";
    }

    public final void D() {
        b6.h hVar;
        D5.d dVar = this.f3987t;
        Throwable th = null;
        if (dVar instanceof b6.h) {
            hVar = (b6.h) dVar;
        } else {
            hVar = null;
        }
        if (hVar != null) {
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b6.h.f7187x;
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                B0.d dVar2 = b6.a.d;
                if (obj == dVar2) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, dVar2, this)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != dVar2) {
                            break;
                        }
                    }
                    break loop0;
                } else if (obj instanceof Throwable) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                            throw new IllegalArgumentException("Failed requirement.".toString());
                        }
                    }
                    th = (Throwable) obj;
                } else {
                    throw new IllegalStateException(("Inconsistent state " + obj).toString());
                }
            }
            if (th != null) {
                s();
                q(th);
            }
        }
    }

    public final void E(int i7, L5.l lVar, Object obj) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3985w;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof n0) {
                Object F = F((n0) obj2, obj, i7, lVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, F)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!A()) {
                    s();
                }
                t(i7);
                return;
            }
            if (obj2 instanceof C0101h) {
                C0101h c0101h = (C0101h) obj2;
                c0101h.getClass();
                if (C0101h.f3993c.compareAndSet(c0101h, 0, 1)) {
                    if (lVar != null) {
                        p(lVar, c0101h.f4012a);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }

    @Override // W5.A0
    public final void a(b6.t tVar, int i7) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i8;
        do {
            atomicIntegerFieldUpdater = f3984v;
            i8 = atomicIntegerFieldUpdater.get(this);
            if ((i8 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once".toString());
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i8, ((i8 >> 29) << 29) + i7));
        z(tVar);
    }

    @Override // W5.F
    public final void b(Object obj, CancellationException cancellationException) {
        boolean z7;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3985w;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof n0)) {
                if (obj2 instanceof C0109p) {
                    return;
                }
                if (obj2 instanceof C0108o) {
                    C0108o c0108o = (C0108o) obj2;
                    if (c0108o.f4010e != null) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (!z7) {
                        C0108o a7 = C0108o.a(c0108o, null, cancellationException, 15);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, a7)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj2) {
                                break;
                            }
                        }
                        C0098e c0098e = c0108o.f4008b;
                        if (c0098e != null) {
                            n(c0098e, cancellationException);
                        }
                        L5.l lVar = c0108o.f4009c;
                        if (lVar != null) {
                            p(lVar, cancellationException);
                            return;
                        }
                        return;
                    }
                    throw new IllegalStateException("Must be called at most once".toString());
                }
                C0108o c0108o2 = new C0108o(obj2, (C0098e) null, (L5.l) null, cancellationException, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c0108o2)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                return;
            }
            throw new IllegalStateException("Not completed".toString());
        }
    }

    @Override // W5.F
    public final D5.d c() {
        return this.f3987t;
    }

    @Override // W5.InterfaceC0099f
    public final B0.d d(Object obj, L5.l lVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3985w;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            boolean z7 = obj2 instanceof n0;
            B0.d dVar = AbstractC0117y.f4034a;
            if (z7) {
                Object F = F((n0) obj2, obj, this.f3944s, lVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, F)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!A()) {
                    s();
                    return dVar;
                }
                return dVar;
            }
            boolean z8 = obj2 instanceof C0108o;
            return null;
        }
    }

    @Override // W5.F
    public final Throwable e(Object obj) {
        Throwable e3 = super.e(obj);
        if (e3 == null) {
            return null;
        }
        return e3;
    }

    @Override // W5.F
    public final Object f(Object obj) {
        if (obj instanceof C0108o) {
            return ((C0108o) obj).f4007a;
        }
        return obj;
    }

    @Override // F5.d
    public final F5.d g() {
        D5.d dVar = this.f3987t;
        if (dVar instanceof F5.d) {
            return (F5.d) dVar;
        }
        return null;
    }

    @Override // W5.InterfaceC0099f
    public final void i(Object obj, L5.l lVar) {
        E(this.f3944s, lVar, obj);
    }

    @Override // W5.F
    public final Object j() {
        return f3985w.get(this);
    }

    @Override // D5.d
    public final D5.i k() {
        return this.f3988u;
    }

    @Override // W5.InterfaceC0099f
    public final void l(AbstractC0113u abstractC0113u) {
        b6.h hVar;
        AbstractC0113u abstractC0113u2;
        int i7;
        C1530l c1530l = C1530l.f16479a;
        D5.d dVar = this.f3987t;
        if (dVar instanceof b6.h) {
            hVar = (b6.h) dVar;
        } else {
            hVar = null;
        }
        if (hVar != null) {
            abstractC0113u2 = hVar.f7188t;
        } else {
            abstractC0113u2 = null;
        }
        if (abstractC0113u2 == abstractC0113u) {
            i7 = 4;
        } else {
            i7 = this.f3944s;
        }
        E(i7, null, c1530l);
    }

    @Override // D5.d
    public final void m(Object obj) {
        Throwable a7 = C1526h.a(obj);
        if (a7 != null) {
            obj = new C0109p(a7, false);
        }
        E(this.f3944s, null, obj);
    }

    public final void n(C0098e c0098e, Throwable th) {
        try {
            c0098e.a(th);
        } catch (Throwable th2) {
            AbstractC0117y.m(this.f3988u, new RuntimeException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    @Override // W5.InterfaceC0099f
    public final void o(Object obj) {
        t(this.f3944s);
    }

    public final void p(L5.l lVar, Throwable th) {
        try {
            lVar.c(th);
        } catch (Throwable th2) {
            AbstractC0117y.m(this.f3988u, new RuntimeException("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    @Override // W5.InterfaceC0099f
    public final boolean q(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3985w;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z7 = false;
            if (!(obj instanceof n0)) {
                return false;
            }
            if ((obj instanceof C0098e) || (obj instanceof b6.t)) {
                z7 = true;
            }
            C0101h c0101h = new C0101h(this, th, z7);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0101h)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            n0 n0Var = (n0) obj;
            if (n0Var instanceof C0098e) {
                n((C0098e) obj, th);
            } else if (n0Var instanceof b6.t) {
                r((b6.t) obj, th);
            }
            if (!A()) {
                s();
            }
            t(this.f3944s);
            return true;
        }
    }

    public final void r(b6.t tVar, Throwable th) {
        D5.i iVar = this.f3988u;
        int i7 = f3984v.get(this) & 536870911;
        if (i7 != 536870911) {
            try {
                tVar.g(i7, iVar);
                return;
            } catch (Throwable th2) {
                AbstractC0117y.m(iVar, new RuntimeException("Exception in invokeOnCancellation handler for " + this, th2));
                return;
            }
        }
        throw new IllegalStateException("The index for Segment.onCancellation(..) is broken".toString());
    }

    public final void s() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3986x;
        I i7 = (I) atomicReferenceFieldUpdater.get(this);
        if (i7 == null) {
            return;
        }
        i7.d();
        atomicReferenceFieldUpdater.set(this, m0.f4006q);
    }

    public final void t(int i7) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i8;
        boolean z7;
        do {
            atomicIntegerFieldUpdater = f3984v;
            i8 = atomicIntegerFieldUpdater.get(this);
            int i9 = i8 >> 29;
            if (i9 != 0) {
                if (i9 == 1) {
                    if (i7 == 4) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    D5.d dVar = this.f3987t;
                    if (!z7 && (dVar instanceof b6.h) && AbstractC0117y.o(i7) == AbstractC0117y.o(this.f3944s)) {
                        AbstractC0113u abstractC0113u = ((b6.h) dVar).f7188t;
                        D5.i k5 = ((b6.h) dVar).f7189u.k();
                        if (abstractC0113u.W()) {
                            abstractC0113u.V(k5, this);
                            return;
                        }
                        Q a7 = s0.a();
                        if (a7.f3961s >= 4294967296L) {
                            A5.i iVar = a7.f3963u;
                            if (iVar == null) {
                                iVar = new A5.i();
                                a7.f3963u = iVar;
                            }
                            iVar.g(this);
                            return;
                        }
                        a7.a0(true);
                        try {
                            AbstractC0117y.s(this, dVar, true);
                            do {
                            } while (a7.c0());
                        } finally {
                            try {
                                return;
                            } finally {
                            }
                        }
                        return;
                    }
                    AbstractC0117y.s(this, dVar, z7);
                    return;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i8, 1073741824 + (536870911 & i8)));
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(C());
        sb.append('(');
        sb.append(AbstractC0117y.v(this.f3987t));
        sb.append("){");
        Object obj = f3985w.get(this);
        if (obj instanceof n0) {
            str = "Active";
        } else if (obj instanceof C0101h) {
            str = "Cancelled";
        } else {
            str = "Completed";
        }
        sb.append(str);
        sb.append("}@");
        sb.append(AbstractC0117y.j(this));
        return sb.toString();
    }

    public Throwable u(j0 j0Var) {
        return j0Var.E();
    }

    public final Object v() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i7;
        boolean A6 = A();
        do {
            atomicIntegerFieldUpdater = f3984v;
            i7 = atomicIntegerFieldUpdater.get(this);
            int i8 = i7 >> 29;
            if (i8 != 0) {
                if (i8 == 2) {
                    if (A6) {
                        D();
                    }
                    Object obj = f3985w.get(this);
                    if (!(obj instanceof C0109p)) {
                        if (AbstractC0117y.o(this.f3944s)) {
                            InterfaceC0093a0 interfaceC0093a0 = (InterfaceC0093a0) this.f3988u.f(C0114v.f4028r);
                            if (interfaceC0093a0 != null && !interfaceC0093a0.a()) {
                                CancellationException E4 = ((j0) interfaceC0093a0).E();
                                b(obj, E4);
                                throw E4;
                            }
                        }
                        return f(obj);
                    }
                    throw ((C0109p) obj).f4012a;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i7, 536870912 + (536870911 & i7)));
        if (((I) f3986x.get(this)) == null) {
            x();
        }
        if (A6) {
            D();
        }
        return E5.a.f612q;
    }

    public final void w() {
        I x7 = x();
        if (x7 != null && (!(f3985w.get(this) instanceof n0))) {
            x7.d();
            f3986x.set(this, m0.f4006q);
        }
    }

    public final I x() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        InterfaceC0093a0 interfaceC0093a0 = (InterfaceC0093a0) this.f3988u.f(C0114v.f4028r);
        if (interfaceC0093a0 == null) {
            return null;
        }
        I n = AbstractC0117y.n(interfaceC0093a0, true, new C0102i(this), 2);
        do {
            atomicReferenceFieldUpdater = f3986x;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, n)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return n;
    }

    public final void y(L5.l lVar) {
        C0098e c0098e;
        if (lVar instanceof C0098e) {
            c0098e = (C0098e) lVar;
        } else {
            c0098e = new C0098e(2, lVar);
        }
        z(c0098e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00ba, code lost:
        B(r10, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00bd, code lost:
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z(java.lang.Object r10) {
        /*
            r9 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = W5.C0100g.f3985w
            java.lang.Object r7 = r0.get(r9)
            boolean r1 = r7 instanceof W5.C0094b
            if (r1 == 0) goto L18
        La:
            boolean r1 = r0.compareAndSet(r9, r7, r10)
            if (r1 == 0) goto L11
            return
        L11:
            java.lang.Object r1 = r0.get(r9)
            if (r1 == r7) goto La
            goto L0
        L18:
            boolean r1 = r7 instanceof W5.C0098e
            r2 = 0
            if (r1 != 0) goto Lba
            boolean r1 = r7 instanceof b6.t
            if (r1 != 0) goto Lba
            boolean r1 = r7 instanceof W5.C0109p
            if (r1 == 0) goto L5c
            r0 = r7
            W5.p r0 = (W5.C0109p) r0
            r0.getClass()
            r1 = 1
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = W5.C0109p.f4011b
            r4 = 0
            boolean r1 = r3.compareAndSet(r0, r4, r1)
            if (r1 == 0) goto L58
            boolean r1 = r7 instanceof W5.C0101h
            if (r1 == 0) goto L57
            boolean r1 = r7 instanceof W5.C0109p
            if (r1 == 0) goto L3e
            goto L3f
        L3e:
            r0 = r2
        L3f:
            if (r0 == 0) goto L43
            java.lang.Throwable r2 = r0.f4012a
        L43:
            boolean r0 = r10 instanceof W5.C0098e
            if (r0 == 0) goto L4d
            W5.e r10 = (W5.C0098e) r10
            r9.n(r10, r2)
            goto L57
        L4d:
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>"
            M5.g.d(r10, r0)
            b6.t r10 = (b6.t) r10
            r9.r(r10, r2)
        L57:
            return
        L58:
            B(r10, r7)
            throw r2
        L5c:
            boolean r1 = r7 instanceof W5.C0108o
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler"
            if (r1 == 0) goto L95
            r1 = r7
            W5.o r1 = (W5.C0108o) r1
            W5.e r4 = r1.f4008b
            if (r4 != 0) goto L91
            boolean r4 = r10 instanceof b6.t
            if (r4 == 0) goto L6e
            return
        L6e:
            M5.g.d(r10, r3)
            r3 = r10
            W5.e r3 = (W5.C0098e) r3
            java.lang.Throwable r4 = r1.f4010e
            if (r4 == 0) goto L7c
            r9.n(r3, r4)
            return
        L7c:
            r4 = 29
            W5.o r1 = W5.C0108o.a(r1, r3, r2, r4)
        L82:
            boolean r2 = r0.compareAndSet(r9, r7, r1)
            if (r2 == 0) goto L89
            return
        L89:
            java.lang.Object r2 = r0.get(r9)
            if (r2 == r7) goto L82
            goto L0
        L91:
            B(r10, r7)
            throw r2
        L95:
            boolean r1 = r10 instanceof b6.t
            if (r1 == 0) goto L9a
            return
        L9a:
            M5.g.d(r10, r3)
            r3 = r10
            W5.e r3 = (W5.C0098e) r3
            W5.o r8 = new W5.o
            r4 = 0
            r5 = 0
            r6 = 28
            r1 = r8
            r2 = r7
            r1.<init>(r2, r3, r4, r5, r6)
        Lab:
            boolean r1 = r0.compareAndSet(r9, r7, r8)
            if (r1 == 0) goto Lb2
            return
        Lb2:
            java.lang.Object r1 = r0.get(r9)
            if (r1 == r7) goto Lab
            goto L0
        Lba:
            B(r10, r7)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: W5.C0100g.z(java.lang.Object):void");
    }
}
