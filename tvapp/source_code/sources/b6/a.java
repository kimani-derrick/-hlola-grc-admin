package b6;

import W5.AbstractC0113u;
import W5.AbstractC0117y;
import W5.C0109p;
import W5.C0110q;
import W5.C0114v;
import W5.InterfaceC0093a0;
import W5.InterfaceC0115w;
import W5.Q;
import W5.j0;
import W5.r0;
import W5.s0;
import W5.y0;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k3.AbstractC0958a;
import r0.AbstractC1111a;
import z5.C1526h;
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final B0.d f7176a = new B0.d(6, "NO_DECISION", false);

    /* renamed from: b  reason: collision with root package name */
    public static final B0.d f7177b = new B0.d(6, "CLOSED", false);

    /* renamed from: c  reason: collision with root package name */
    public static final B0.d f7178c = new B0.d(6, "UNDEFINED", false);
    public static final B0.d d = new B0.d(6, "REUSABLE_CLAIMED", false);

    /* renamed from: e  reason: collision with root package name */
    public static final B0.d f7179e = new B0.d(6, "CONDITION_FALSE", false);
    public static final B0.d f = new B0.d(6, "NO_THREAD_ELEMENTS", false);

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.RuntimeException, F0.c] */
    public static final F0.c a(L5.l lVar, Object obj, F0.c cVar) {
        try {
            lVar.c(obj);
        } catch (Throwable th) {
            if (cVar != null && cVar.getCause() != th) {
                android.support.v4.media.session.b.a(cVar, th);
            } else {
                return new RuntimeException(AbstractC1111a.p(obj, "Exception in undelivered element handler for "), th);
            }
        }
        return cVar;
    }

    public static final void b(int i7) {
        if (i7 >= 1) {
            return;
        }
        throw new IllegalArgumentException(AbstractC0515y1.l("Expected positive parallelism level, but got ", i7).toString());
    }

    public static final Object c(t tVar, long j7, L5.p pVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        while (true) {
            if (tVar.f7212s >= j7 && !tVar.c()) {
                return tVar;
            }
            Object obj = d.f7182q.get(tVar);
            B0.d dVar = f7177b;
            if (obj == dVar) {
                return dVar;
            }
            t tVar2 = (t) ((d) obj);
            if (tVar2 == null) {
                tVar2 = (t) pVar.j(Long.valueOf(tVar.f7212s + 1), tVar);
                do {
                    atomicReferenceFieldUpdater = d.f7182q;
                    if (atomicReferenceFieldUpdater.compareAndSet(tVar, null, tVar2)) {
                        if (tVar.c()) {
                            tVar.d();
                        }
                    }
                } while (atomicReferenceFieldUpdater.get(tVar) == null);
            }
            tVar = tVar2;
        }
    }

    public static final t d(Object obj) {
        if (obj != f7177b) {
            return (t) obj;
        }
        throw new IllegalStateException("Does not contain segment".toString());
    }

    public static final void e(D5.i iVar, Throwable th) {
        Throwable runtimeException;
        for (InterfaceC0115w interfaceC0115w : f.f7185a) {
            try {
                interfaceC0115w.h(iVar, th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    android.support.v4.media.session.b.a(runtimeException, th);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            android.support.v4.media.session.b.a(th, new g(iVar));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    public static final boolean f(Object obj) {
        if (obj == f7177b) {
            return true;
        }
        return false;
    }

    public static final Object g(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static final void h(D5.i iVar, Object obj) {
        if (obj == f) {
            return;
        }
        if (obj instanceof y) {
            y yVar = (y) obj;
            r0[] r0VarArr = yVar.f7222b;
            int length = r0VarArr.length - 1;
            if (length < 0) {
                return;
            }
            r0 r0Var = r0VarArr[length];
            M5.g.c(null);
            Object obj2 = yVar.f7221a[length];
            throw null;
        }
        Object O5 = iVar.O(null, w.f7216t);
        M5.g.d(O5, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        AbstractC0515y1.v(O5);
        throw null;
    }

    public static final void i(D5.d dVar, Object obj, L5.l lVar) {
        Object c0109p;
        y0 y0Var;
        if (dVar instanceof h) {
            h hVar = (h) dVar;
            Throwable a7 = C1526h.a(obj);
            if (a7 == null) {
                if (lVar != null) {
                    c0109p = new C0110q(obj, lVar);
                } else {
                    c0109p = obj;
                }
            } else {
                c0109p = new C0109p(a7, false);
            }
            D5.d dVar2 = hVar.f7189u;
            dVar2.k();
            AbstractC0113u abstractC0113u = hVar.f7188t;
            if (abstractC0113u.W()) {
                hVar.f7190v = c0109p;
                hVar.f3944s = 1;
                abstractC0113u.V(dVar2.k(), hVar);
                return;
            }
            Q a8 = s0.a();
            if (a8.f3961s >= 4294967296L) {
                hVar.f7190v = c0109p;
                hVar.f3944s = 1;
                A5.i iVar = a8.f3963u;
                if (iVar == null) {
                    iVar = new A5.i();
                    a8.f3963u = iVar;
                }
                iVar.g(hVar);
                return;
            }
            a8.a0(true);
            try {
                InterfaceC0093a0 interfaceC0093a0 = (InterfaceC0093a0) dVar2.k().f(C0114v.f4028r);
                if (interfaceC0093a0 != null && !interfaceC0093a0.a()) {
                    CancellationException E4 = ((j0) interfaceC0093a0).E();
                    hVar.b(c0109p, E4);
                    hVar.m(AbstractC0958a.m(E4));
                } else {
                    Object obj2 = hVar.f7191w;
                    D5.i k5 = dVar2.k();
                    Object m7 = m(k5, obj2);
                    if (m7 != f) {
                        y0Var = AbstractC0117y.x(dVar2, k5, m7);
                    } else {
                        y0Var = null;
                    }
                    dVar2.m(obj);
                    if (y0Var == null || y0Var.e0()) {
                        h(k5, m7);
                    }
                }
                do {
                } while (a8.c0());
            } finally {
                try {
                    return;
                } finally {
                }
            }
            return;
        }
        dVar.m(obj);
    }

    public static final long j(String str, long j7, long j8, long j9) {
        String str2;
        int i7 = v.f7214a;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        if (str2 != null) {
            Long U6 = U5.m.U(str2);
            if (U6 != null) {
                long longValue = U6.longValue();
                if (j8 <= longValue && longValue <= j9) {
                    return longValue;
                }
                throw new IllegalStateException(("System property '" + str + "' should be in range " + j8 + ".." + j9 + ", but is '" + longValue + '\'').toString());
            }
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
        }
        return j7;
    }

    public static int k(String str, int i7, int i8, int i9, int i10) {
        if ((i10 & 4) != 0) {
            i8 = 1;
        }
        if ((i10 & 8) != 0) {
            i9 = Integer.MAX_VALUE;
        }
        return (int) j(str, i7, i8, i9);
    }

    public static final Object l(D5.i iVar) {
        Object O5 = iVar.O(0, w.f7215s);
        M5.g.c(O5);
        return O5;
    }

    public static final Object m(D5.i iVar, Object obj) {
        if (obj == null) {
            obj = l(iVar);
        }
        if (obj == 0) {
            return f;
        }
        if (obj instanceof Integer) {
            return iVar.O(new y(((Number) obj).intValue(), iVar), w.f7217u);
        }
        AbstractC0515y1.v(obj);
        throw null;
    }
}
