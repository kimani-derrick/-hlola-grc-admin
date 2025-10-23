package W5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes.dex */
public class j0 implements InterfaceC0093a0, InterfaceC0105l, o0 {

    /* renamed from: q  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f4002q = AtomicReferenceFieldUpdater.newUpdater(j0.class, Object.class, "_state");

    /* renamed from: r  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f4003r = AtomicReferenceFieldUpdater.newUpdater(j0.class, Object.class, "_parentHandle");
    private volatile Object _parentHandle;
    private volatile Object _state;

    public j0(boolean z7) {
        K k5;
        if (z7) {
            k5 = AbstractC0117y.f4041j;
        } else {
            k5 = AbstractC0117y.f4040i;
        }
        this._state = k5;
    }

    public static C0104k T(b6.k kVar) {
        while (kVar.n()) {
            b6.k i7 = kVar.i();
            if (i7 == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b6.k.f7199r;
                Object obj = atomicReferenceFieldUpdater.get(kVar);
                while (true) {
                    kVar = (b6.k) obj;
                    if (!kVar.n()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(kVar);
                }
            } else {
                kVar = i7;
            }
        }
        while (true) {
            kVar = kVar.m();
            if (!kVar.n()) {
                if (kVar instanceof C0104k) {
                    return (C0104k) kVar;
                }
                if (kVar instanceof l0) {
                    return null;
                }
            }
        }
    }

    public static String Z(Object obj) {
        if (obj instanceof h0) {
            h0 h0Var = (h0) obj;
            if (h0Var.d()) {
                return "Cancelling";
            }
            if (!h0Var.e()) {
                return "Active";
            }
            return "Completing";
        } else if (obj instanceof W) {
            if (((W) obj).a()) {
                return "Active";
            }
            return "New";
        } else if (obj instanceof C0109p) {
            return "Cancelled";
        } else {
            return "Completed";
        }
    }

    public boolean A(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        if (v(th) && H()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.RuntimeException, F0.c] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Throwable, F0.c] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r7v0, types: [W5.j0, java.lang.Object] */
    public final void B(W w7, Object obj) {
        C0109p c0109p;
        Throwable th;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4003r;
        InterfaceC0103j interfaceC0103j = (InterfaceC0103j) atomicReferenceFieldUpdater.get(this);
        if (interfaceC0103j != null) {
            interfaceC0103j.d();
            atomicReferenceFieldUpdater.set(this, m0.f4006q);
        }
        ?? r12 = 0;
        if (obj instanceof C0109p) {
            c0109p = (C0109p) obj;
        } else {
            c0109p = null;
        }
        if (c0109p != null) {
            th = c0109p.f4012a;
        } else {
            th = null;
        }
        if (w7 instanceof e0) {
            try {
                ((e0) w7).p(th);
                return;
            } catch (Throwable th2) {
                M(new RuntimeException("Exception in completion handler " + w7 + " for " + ((Object) this), th2));
                return;
            }
        }
        l0 h7 = w7.h();
        if (h7 != null) {
            Object l7 = h7.l();
            M5.g.d(l7, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            b6.k kVar = (b6.k) l7;
            while (!M5.g.a(kVar, h7)) {
                if (kVar instanceof e0) {
                    e0 e0Var = (e0) kVar;
                    try {
                        e0Var.p(th);
                    } catch (Throwable th3) {
                        if (r12 != 0) {
                            android.support.v4.media.session.b.a(r12, th3);
                        } else {
                            r12 = new RuntimeException("Exception in completion handler " + e0Var + " for " + ((Object) this), th3);
                        }
                    }
                }
                kVar = kVar.m();
                r12 = r12;
            }
            if (r12 != 0) {
                M(r12);
            }
        }
    }

    public final Throwable C(Object obj) {
        Throwable th;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        j0 j0Var = (j0) ((o0) obj);
        Object K6 = j0Var.K();
        CancellationException cancellationException = null;
        if (K6 instanceof h0) {
            th = ((h0) K6).c();
        } else if (K6 instanceof C0109p) {
            th = ((C0109p) K6).f4012a;
        } else if (!(K6 instanceof W)) {
            th = null;
        } else {
            throw new IllegalStateException(("Cannot be cancelling child in this state: " + K6).toString());
        }
        if (th instanceof CancellationException) {
            cancellationException = th;
        }
        if (cancellationException == null) {
            cancellationException = new C0095b0("Parent job is ".concat(Z(K6)), th, j0Var);
        }
        return cancellationException;
    }

    public final Object D(h0 h0Var, Object obj) {
        C0109p c0109p;
        Throwable G6;
        Object obj2;
        Throwable th = null;
        if (obj instanceof C0109p) {
            c0109p = (C0109p) obj;
        } else {
            c0109p = null;
        }
        if (c0109p != null) {
            th = c0109p.f4012a;
        }
        synchronized (h0Var) {
            h0Var.d();
            ArrayList<Throwable> f = h0Var.f(th);
            G6 = G(h0Var, f);
            if (G6 != null && f.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(f.size()));
                for (Throwable th2 : f) {
                    if (th2 != G6 && th2 != G6 && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                        android.support.v4.media.session.b.a(G6, th2);
                    }
                }
            }
        }
        if (G6 != null && G6 != th) {
            obj = new C0109p(G6, false);
        }
        if (G6 != null && (y(G6) || L(G6))) {
            M5.g.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            C0109p.f4011b.compareAndSet((C0109p) obj, 0, 1);
        }
        V(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4002q;
        if (obj instanceof W) {
            obj2 = new X((W) obj);
        } else {
            obj2 = obj;
        }
        while (!atomicReferenceFieldUpdater.compareAndSet(this, h0Var, obj2) && atomicReferenceFieldUpdater.get(this) == h0Var) {
        }
        B(h0Var, obj);
        return obj;
    }

    public final CancellationException E() {
        Object K6 = K();
        CancellationException cancellationException = null;
        if (K6 instanceof h0) {
            Throwable c5 = ((h0) K6).c();
            if (c5 != null) {
                String concat = getClass().getSimpleName().concat(" is cancelling");
                if (c5 instanceof CancellationException) {
                    cancellationException = (CancellationException) c5;
                }
                if (cancellationException == null) {
                    if (concat == null) {
                        concat = z();
                    }
                    return new C0095b0(concat, c5, this);
                }
                return cancellationException;
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (!(K6 instanceof W)) {
            if (K6 instanceof C0109p) {
                Throwable th = ((C0109p) K6).f4012a;
                if (th instanceof CancellationException) {
                    cancellationException = (CancellationException) th;
                }
                if (cancellationException == null) {
                    return new C0095b0(z(), th, this);
                }
                return cancellationException;
            }
            return new C0095b0(getClass().getSimpleName().concat(" has completed normally"), null, this);
        } else {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
    }

    public final Object F() {
        Object K6 = K();
        if (!(K6 instanceof W)) {
            if (!(K6 instanceof C0109p)) {
                return AbstractC0117y.w(K6);
            }
            throw ((C0109p) K6).f4012a;
        }
        throw new IllegalStateException("This job has not completed yet".toString());
    }

    public final Throwable G(h0 h0Var, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (!h0Var.d()) {
                return null;
            }
            return new C0095b0(z(), null, this);
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (!(((Throwable) obj) instanceof CancellationException)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof u0) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                Throwable th3 = (Throwable) next;
                if (th3 != th2 && (th3 instanceof u0)) {
                    obj2 = next;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public boolean H() {
        return true;
    }

    public boolean I() {
        return this instanceof C0107n;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [W5.l0, b6.k] */
    public final l0 J(W w7) {
        l0 h7 = w7.h();
        if (h7 == null) {
            if (w7 instanceof K) {
                return new b6.k();
            }
            if (w7 instanceof e0) {
                X((e0) w7);
                return null;
            }
            throw new IllegalStateException(("State should have list: " + w7).toString());
        }
        return h7;
    }

    public final Object K() {
        while (true) {
            Object obj = f4002q.get(this);
            if (!(obj instanceof b6.p)) {
                return obj;
            }
            ((b6.p) obj).a(this);
        }
    }

    public boolean L(Throwable th) {
        return false;
    }

    public final void N(InterfaceC0093a0 interfaceC0093a0) {
        int Y6;
        m0 m0Var = m0.f4006q;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4003r;
        if (interfaceC0093a0 == null) {
            atomicReferenceFieldUpdater.set(this, m0Var);
            return;
        }
        j0 j0Var = (j0) interfaceC0093a0;
        do {
            Y6 = j0Var.Y(j0Var.K());
            if (Y6 == 0) {
                break;
            }
        } while (Y6 != 1);
        InterfaceC0103j interfaceC0103j = (InterfaceC0103j) AbstractC0117y.n(j0Var, true, new C0104k(this), 2);
        atomicReferenceFieldUpdater.set(this, interfaceC0103j);
        if (!(K() instanceof W)) {
            interfaceC0103j.d();
            atomicReferenceFieldUpdater.set(this, m0Var);
        }
    }

    @Override // D5.i
    public final Object O(Object obj, L5.p pVar) {
        return pVar.j(obj, this);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [W5.l0, b6.k] */
    public final I P(boolean z7, boolean z8, L5.l lVar) {
        e0 e0Var;
        V v5;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C0109p c0109p;
        Throwable th;
        Throwable th2 = null;
        if (z7) {
            if (lVar instanceof c0) {
                e0Var = (c0) lVar;
            } else {
                e0Var = null;
            }
            if (e0Var == null) {
                e0Var = new Z(lVar);
            }
        } else {
            if (lVar instanceof e0) {
                e0Var = (e0) lVar;
            } else {
                e0Var = null;
            }
            if (e0Var == null) {
                e0Var = new J(1, lVar);
            }
        }
        e0Var.f3982t = this;
        while (true) {
            Object K6 = K();
            if (K6 instanceof K) {
                K k5 = (K) K6;
                if (k5.f3950q) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f4002q;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, K6, e0Var)) {
                        if (atomicReferenceFieldUpdater2.get(this) != K6) {
                            break;
                        }
                    }
                    return e0Var;
                }
                ?? kVar = new b6.k();
                if (k5.f3950q) {
                    v5 = kVar;
                } else {
                    v5 = new V(kVar);
                }
                do {
                    atomicReferenceFieldUpdater = f4002q;
                    if (atomicReferenceFieldUpdater.compareAndSet(this, k5, v5)) {
                        break;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == k5);
            } else if (K6 instanceof W) {
                l0 h7 = ((W) K6).h();
                if (h7 == null) {
                    M5.g.d(K6, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    X((e0) K6);
                } else {
                    I i7 = m0.f4006q;
                    if (z7 && (K6 instanceof h0)) {
                        synchronized (K6) {
                            try {
                                th = ((h0) K6).c();
                                if (th != null) {
                                    if ((lVar instanceof C0104k) && !((h0) K6).e()) {
                                    }
                                }
                                if (s((W) K6, h7, e0Var)) {
                                    if (th == null) {
                                        return e0Var;
                                    }
                                    i7 = e0Var;
                                }
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    } else {
                        th = null;
                    }
                    if (th != null) {
                        if (z8) {
                            lVar.c(th);
                        }
                        return i7;
                    } else if (s((W) K6, h7, e0Var)) {
                        return e0Var;
                    }
                }
            } else {
                if (z8) {
                    if (K6 instanceof C0109p) {
                        c0109p = (C0109p) K6;
                    } else {
                        c0109p = null;
                    }
                    if (c0109p != null) {
                        th2 = c0109p.f4012a;
                    }
                    lVar.c(th2);
                }
                return m0.f4006q;
            }
        }
    }

    public boolean Q() {
        return this instanceof C0096c;
    }

    public final Object R(Object obj) {
        Object a02;
        C0109p c0109p;
        do {
            a02 = a0(K(), obj);
            if (a02 == AbstractC0117y.d) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                Throwable th = null;
                if (obj instanceof C0109p) {
                    c0109p = (C0109p) obj;
                } else {
                    c0109p = null;
                }
                if (c0109p != null) {
                    th = c0109p.f4012a;
                }
                throw new IllegalStateException(str, th);
            }
        } while (a02 == AbstractC0117y.f);
        return a02;
    }

    public String S() {
        return getClass().getSimpleName();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Throwable, F0.c] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r6v0, types: [W5.j0, java.lang.Object] */
    public final void U(l0 l0Var, Throwable th) {
        Object l7 = l0Var.l();
        M5.g.d(l7, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        b6.k kVar = (b6.k) l7;
        ?? r12 = 0;
        while (!M5.g.a(kVar, l0Var)) {
            if (kVar instanceof c0) {
                e0 e0Var = (e0) kVar;
                try {
                    e0Var.p(th);
                } catch (Throwable th2) {
                    if (r12 != 0) {
                        android.support.v4.media.session.b.a(r12, th2);
                    } else {
                        r12 = new RuntimeException("Exception in completion handler " + e0Var + " for " + ((Object) this), th2);
                    }
                }
            }
            kVar = kVar.m();
            r12 = r12;
        }
        if (r12 != 0) {
            M(r12);
        }
        y(th);
    }

    public final void X(e0 e0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        b6.k kVar = new b6.k();
        e0Var.getClass();
        b6.k.f7199r.lazySet(kVar, e0Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = b6.k.f7198q;
        atomicReferenceFieldUpdater2.lazySet(kVar, e0Var);
        loop0: while (true) {
            if (e0Var.l() == e0Var) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(e0Var, e0Var, kVar)) {
                    if (atomicReferenceFieldUpdater2.get(e0Var) != e0Var) {
                        break;
                    }
                }
                kVar.k(e0Var);
                break loop0;
            }
            break;
        }
        b6.k m7 = e0Var.m();
        do {
            atomicReferenceFieldUpdater = f4002q;
            if (atomicReferenceFieldUpdater.compareAndSet(this, e0Var, m7)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == e0Var);
    }

    public final int Y(Object obj) {
        boolean z7 = obj instanceof K;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4002q;
        if (z7) {
            if (((K) obj).f3950q) {
                return 0;
            }
            K k5 = AbstractC0117y.f4041j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, k5)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            W();
            return 1;
        } else if (!(obj instanceof V)) {
            return 0;
        } else {
            l0 l0Var = ((V) obj).f3966q;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, l0Var)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            W();
            return 1;
        }
    }

    @Override // W5.InterfaceC0093a0
    public boolean a() {
        Object K6 = K();
        if ((K6 instanceof W) && ((W) K6).a()) {
            return true;
        }
        return false;
    }

    public final Object a0(Object obj, Object obj2) {
        X x7;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        h0 h0Var;
        C0109p c0109p;
        C0104k c0104k;
        if (!(obj instanceof W)) {
            return AbstractC0117y.d;
        }
        if (((obj instanceof K) || (obj instanceof e0)) && !(obj instanceof C0104k) && !(obj2 instanceof C0109p)) {
            W w7 = (W) obj;
            if (obj2 instanceof W) {
                x7 = new X((W) obj2);
            } else {
                x7 = obj2;
            }
            do {
                atomicReferenceFieldUpdater = f4002q;
                if (atomicReferenceFieldUpdater.compareAndSet(this, w7, x7)) {
                    V(obj2);
                    B(w7, obj2);
                    return obj2;
                }
            } while (atomicReferenceFieldUpdater.get(this) == w7);
            return AbstractC0117y.f;
        }
        W w8 = (W) obj;
        l0 J6 = J(w8);
        if (J6 == null) {
            return AbstractC0117y.f;
        }
        C0104k c0104k2 = null;
        if (w8 instanceof h0) {
            h0Var = (h0) w8;
        } else {
            h0Var = null;
        }
        if (h0Var == null) {
            h0Var = new h0(J6, null);
        }
        synchronized (h0Var) {
            if (h0Var.e()) {
                return AbstractC0117y.d;
            }
            h0.f3994r.set(h0Var, 1);
            if (h0Var != w8) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f4002q;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, w8, h0Var)) {
                    if (atomicReferenceFieldUpdater2.get(this) != w8) {
                        return AbstractC0117y.f;
                    }
                }
            }
            boolean d = h0Var.d();
            if (obj2 instanceof C0109p) {
                c0109p = (C0109p) obj2;
            } else {
                c0109p = null;
            }
            if (c0109p != null) {
                h0Var.b(c0109p.f4012a);
            }
            Throwable c5 = h0Var.c();
            if (!(!d)) {
                c5 = null;
            }
            if (c5 != null) {
                U(J6, c5);
            }
            if (w8 instanceof C0104k) {
                c0104k = (C0104k) w8;
            } else {
                c0104k = null;
            }
            if (c0104k == null) {
                l0 h7 = w8.h();
                if (h7 != null) {
                    c0104k2 = T(h7);
                }
            } else {
                c0104k2 = c0104k;
            }
            if (c0104k2 != null) {
                while (AbstractC0117y.n(c0104k2.f4004u, false, new g0(this, h0Var, c0104k2, obj2), 1) == m0.f4006q) {
                    c0104k2 = T(c0104k2);
                    if (c0104k2 == null) {
                        return D(h0Var, obj2);
                    }
                }
                return AbstractC0117y.f4037e;
            }
            return D(h0Var, obj2);
        }
    }

    @Override // W5.InterfaceC0093a0
    public void b(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new C0095b0(z(), null, this);
        }
        w(cancellationException);
    }

    @Override // D5.i
    public final D5.g f(D5.h hVar) {
        return p6.d.j(this, hVar);
    }

    @Override // D5.g
    public final D5.h getKey() {
        return C0114v.f4028r;
    }

    public Object j() {
        return F();
    }

    @Override // D5.i
    public final D5.i r(D5.i iVar) {
        return p6.d.A(this, iVar);
    }

    public final boolean s(W w7, l0 l0Var, e0 e0Var) {
        boolean z7;
        i0 i0Var = new i0(e0Var, this, w7);
        do {
            b6.k i7 = l0Var.i();
            if (i7 == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b6.k.f7199r;
                Object obj = atomicReferenceFieldUpdater.get(l0Var);
                while (true) {
                    i7 = (b6.k) obj;
                    if (!i7.n()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(i7);
                }
            }
            b6.k.f7199r.lazySet(e0Var, i7);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = b6.k.f7198q;
            atomicReferenceFieldUpdater2.lazySet(e0Var, l0Var);
            i0Var.f4000c = l0Var;
            while (true) {
                if (atomicReferenceFieldUpdater2.compareAndSet(i7, l0Var, i0Var)) {
                    if (i0Var.a(i7) == null) {
                        z7 = true;
                    } else {
                        z7 = true;
                    }
                } else if (atomicReferenceFieldUpdater2.get(i7) != l0Var) {
                    z7 = false;
                    break;
                }
            }
            if (z7) {
                return true;
            }
        } while (!z7);
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(S() + '{' + Z(K()) + '}');
        sb.append('@');
        sb.append(AbstractC0117y.j(this));
        return sb.toString();
    }

    public void u(Object obj) {
        t(obj);
    }

    public final boolean v(Object obj) {
        B0.d dVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        B0.d dVar2 = AbstractC0117y.d;
        if (I()) {
            do {
                Object K6 = K();
                if ((K6 instanceof W) && (!(K6 instanceof h0) || !((h0) K6).e())) {
                    dVar2 = a0(K6, new C0109p(C(obj), false));
                } else {
                    dVar2 = AbstractC0117y.d;
                    break;
                }
            } while (dVar2 == AbstractC0117y.f);
            if (dVar2 == AbstractC0117y.f4037e) {
                return true;
            }
        }
        if (dVar2 == AbstractC0117y.d) {
            Throwable th = null;
            Throwable th2 = null;
            loop1: while (true) {
                Object K7 = K();
                if (K7 instanceof h0) {
                    synchronized (K7) {
                        try {
                            h0 h0Var = (h0) K7;
                            h0Var.getClass();
                            if (h0.f3996t.get(h0Var) == AbstractC0117y.f4039h) {
                                dVar = AbstractC0117y.f4038g;
                            } else {
                                boolean d = ((h0) K7).d();
                                if (th2 == null) {
                                    th2 = C(obj);
                                }
                                ((h0) K7).b(th2);
                                Throwable c5 = ((h0) K7).c();
                                if (!d) {
                                    th = c5;
                                }
                                if (th != null) {
                                    U(((h0) K7).f3997q, th);
                                }
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                } else if (K7 instanceof W) {
                    if (th2 == null) {
                        th2 = C(obj);
                    }
                    W w7 = (W) K7;
                    if (w7.a()) {
                        l0 J6 = J(w7);
                        if (J6 == null) {
                            continue;
                        } else {
                            h0 h0Var2 = new h0(J6, th2);
                            do {
                                atomicReferenceFieldUpdater = f4002q;
                                if (atomicReferenceFieldUpdater.compareAndSet(this, w7, h0Var2)) {
                                    U(J6, th2);
                                    break loop1;
                                }
                            } while (atomicReferenceFieldUpdater.get(this) == w7);
                        }
                    } else {
                        Object a02 = a0(K7, new C0109p(th2, false));
                        if (a02 != AbstractC0117y.d) {
                            if (a02 != AbstractC0117y.f) {
                                dVar2 = a02;
                                break;
                            }
                        } else {
                            throw new IllegalStateException(("Cannot happen in " + K7).toString());
                        }
                    }
                } else {
                    dVar = AbstractC0117y.f4038g;
                    break;
                }
            }
            dVar = AbstractC0117y.d;
            dVar2 = dVar;
        }
        if (dVar2 != AbstractC0117y.d && dVar2 != AbstractC0117y.f4037e) {
            if (dVar2 == AbstractC0117y.f4038g) {
                return false;
            }
            t(dVar2);
        }
        return true;
    }

    public void w(CancellationException cancellationException) {
        v(cancellationException);
    }

    @Override // D5.i
    public final D5.i x(D5.h hVar) {
        return p6.d.t(this, hVar);
    }

    public final boolean y(Throwable th) {
        if (Q()) {
            return true;
        }
        boolean z7 = th instanceof CancellationException;
        InterfaceC0103j interfaceC0103j = (InterfaceC0103j) f4003r.get(this);
        if (interfaceC0103j != null && interfaceC0103j != m0.f4006q) {
            if (interfaceC0103j.g(th) || z7) {
                return true;
            }
            return false;
        }
        return z7;
    }

    public String z() {
        return "Job was cancelled";
    }

    public void W() {
    }

    public void M(F0.c cVar) {
        throw cVar;
    }

    public void V(Object obj) {
    }

    public void t(Object obj) {
    }
}
