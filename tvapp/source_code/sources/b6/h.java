package b6;

import W5.AbstractC0113u;
import W5.AbstractC0117y;
import W5.C0109p;
import W5.C0110q;
import W5.F;
import W5.Q;
import W5.s0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import z5.C1526h;
/* loaded from: classes.dex */
public final class h extends F implements F5.d, D5.d {

    /* renamed from: x  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f7187x = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_reusableCancellableContinuation");
    private volatile Object _reusableCancellableContinuation;

    /* renamed from: t  reason: collision with root package name */
    public final AbstractC0113u f7188t;

    /* renamed from: u  reason: collision with root package name */
    public final D5.d f7189u;

    /* renamed from: v  reason: collision with root package name */
    public Object f7190v;

    /* renamed from: w  reason: collision with root package name */
    public final Object f7191w;

    public h(AbstractC0113u abstractC0113u, F5.c cVar) {
        super(-1);
        this.f7188t = abstractC0113u;
        this.f7189u = cVar;
        this.f7190v = a.f7178c;
        this.f7191w = a.l(cVar.k());
    }

    @Override // W5.F
    public final void b(Object obj, CancellationException cancellationException) {
        if (obj instanceof C0110q) {
            ((C0110q) obj).f4014b.c(cancellationException);
        }
    }

    @Override // F5.d
    public final F5.d g() {
        D5.d dVar = this.f7189u;
        if (dVar instanceof F5.d) {
            return (F5.d) dVar;
        }
        return null;
    }

    @Override // W5.F
    public final Object j() {
        Object obj = this.f7190v;
        this.f7190v = a.f7178c;
        return obj;
    }

    @Override // D5.d
    public final D5.i k() {
        return this.f7189u.k();
    }

    @Override // D5.d
    public final void m(Object obj) {
        Object c0109p;
        D5.d dVar = this.f7189u;
        D5.i k5 = dVar.k();
        Throwable a7 = C1526h.a(obj);
        if (a7 == null) {
            c0109p = obj;
        } else {
            c0109p = new C0109p(a7, false);
        }
        AbstractC0113u abstractC0113u = this.f7188t;
        if (abstractC0113u.W()) {
            this.f7190v = c0109p;
            this.f3944s = 0;
            abstractC0113u.V(k5, this);
            return;
        }
        Q a8 = s0.a();
        if (a8.f3961s >= 4294967296L) {
            this.f7190v = c0109p;
            this.f3944s = 0;
            A5.i iVar = a8.f3963u;
            if (iVar == null) {
                iVar = new A5.i();
                a8.f3963u = iVar;
            }
            iVar.g(this);
            return;
        }
        a8.a0(true);
        try {
            D5.i k7 = dVar.k();
            Object m7 = a.m(k7, this.f7191w);
            dVar.m(obj);
            a.h(k7, m7);
            do {
            } while (a8.c0());
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f7188t + ", " + AbstractC0117y.v(this.f7189u) + ']';
    }

    @Override // W5.F
    public final D5.d c() {
        return this;
    }
}
