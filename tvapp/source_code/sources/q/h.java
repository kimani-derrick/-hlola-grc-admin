package q;

import T1.r;
import a.AbstractC0189a;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public abstract class h implements R3.b {

    /* renamed from: t  reason: collision with root package name */
    public static final boolean f13206t = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: u  reason: collision with root package name */
    public static final Logger f13207u = Logger.getLogger(h.class.getName());

    /* renamed from: v  reason: collision with root package name */
    public static final AbstractC0189a f13208v;

    /* renamed from: w  reason: collision with root package name */
    public static final Object f13209w;

    /* renamed from: q  reason: collision with root package name */
    public volatile Object f13210q;

    /* renamed from: r  reason: collision with root package name */
    public volatile C1094d f13211r;

    /* renamed from: s  reason: collision with root package name */
    public volatile g f13212s;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [a.a] */
    /* JADX WARN: Type inference failed for: r2v7 */
    static {
        C1095e c1095e;
        try {
            th = null;
            c1095e = new C1095e(AtomicReferenceFieldUpdater.newUpdater(g.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(g.class, g.class, "b"), AtomicReferenceFieldUpdater.newUpdater(h.class, g.class, "s"), AtomicReferenceFieldUpdater.newUpdater(h.class, C1094d.class, "r"), AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "q"));
        } catch (Throwable th) {
            th = th;
            c1095e = new Object();
        }
        f13208v = c1095e;
        if (th != null) {
            f13207u.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f13209w = new Object();
    }

    public static void d(h hVar) {
        g gVar;
        C1094d c1094d;
        C1094d c1094d2;
        C1094d c1094d3;
        do {
            gVar = hVar.f13212s;
        } while (!f13208v.k(hVar, gVar, g.f13203c));
        while (true) {
            c1094d = null;
            if (gVar == null) {
                break;
            }
            Thread thread = gVar.f13204a;
            if (thread != null) {
                gVar.f13204a = null;
                LockSupport.unpark(thread);
            }
            gVar = gVar.f13205b;
        }
        hVar.c();
        do {
            c1094d2 = hVar.f13211r;
        } while (!f13208v.i(hVar, c1094d2, C1094d.d));
        while (true) {
            c1094d3 = c1094d;
            c1094d = c1094d2;
            if (c1094d == null) {
                break;
            }
            c1094d2 = c1094d.f13197c;
            c1094d.f13197c = c1094d3;
        }
        while (c1094d3 != null) {
            C1094d c1094d4 = c1094d3.f13197c;
            e(c1094d3.f13195a, c1094d3.f13196b);
            c1094d3 = c1094d4;
        }
    }

    public static void e(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e3) {
            Level level = Level.SEVERE;
            f13207u.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e3);
        }
    }

    public static Object f(Object obj) {
        if (!(obj instanceof C1091a)) {
            if (!(obj instanceof C1093c)) {
                if (obj == f13209w) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((C1093c) obj).f13194a);
        }
        Throwable th = ((C1091a) obj).f13192b;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(th);
        throw cancellationException;
    }

    @Override // R3.b
    public final void a(R3.a aVar, r rVar) {
        C1094d c1094d = this.f13211r;
        C1094d c1094d2 = C1094d.d;
        if (c1094d != c1094d2) {
            C1094d c1094d3 = new C1094d(aVar, rVar);
            do {
                c1094d3.f13197c = c1094d;
                if (f13208v.i(this, c1094d, c1094d3)) {
                    return;
                }
                c1094d = this.f13211r;
            } while (c1094d != c1094d2);
            e(aVar, rVar);
        }
        e(aVar, rVar);
    }

    public final void b(StringBuilder sb) {
        Object obj;
        String valueOf;
        String str = "]";
        boolean z7 = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (InterruptedException unused) {
                    z7 = true;
                } catch (Throwable th) {
                    if (z7) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException unused2) {
                str = "CANCELLED";
                sb.append(str);
                return;
            } catch (RuntimeException e3) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e3.getClass());
                str = " thrown from get()]";
                sb.append(str);
                return;
            } catch (ExecutionException e7) {
                sb.append("FAILURE, cause=[");
                sb.append(e7.getCause());
                sb.append(str);
                return;
            }
        }
        if (z7) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        if (obj == this) {
            valueOf = "this future";
        } else {
            valueOf = String.valueOf(obj);
        }
        sb.append(valueOf);
        sb.append("]");
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z7) {
        boolean z8;
        C1091a c1091a;
        Object obj = this.f13210q;
        if (obj == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            if (f13206t) {
                c1091a = new C1091a(new CancellationException("Future.cancel() was called."), z7);
            } else if (z7) {
                c1091a = C1091a.f13190c;
            } else {
                c1091a = C1091a.d;
            }
            if (f13208v.j(this, obj, c1091a)) {
                d(this);
                return true;
            }
        }
        return false;
    }

    public String g() {
        if (this instanceof ScheduledFuture) {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
        return null;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f13210q;
        if ((obj2 != null) && true) {
            return f(obj2);
        }
        g gVar = this.f13212s;
        g gVar2 = g.f13203c;
        if (gVar != gVar2) {
            g gVar3 = new g();
            do {
                AbstractC0189a abstractC0189a = f13208v;
                abstractC0189a.C(gVar3, gVar);
                if (abstractC0189a.k(this, gVar, gVar3)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            h(gVar3);
                            throw new InterruptedException();
                        }
                        obj = this.f13210q;
                    } while (!((obj != null) & true));
                    return f(obj);
                }
                gVar = this.f13212s;
            } while (gVar != gVar2);
            return f(this.f13210q);
        }
        return f(this.f13210q);
    }

    public final void h(g gVar) {
        gVar.f13204a = null;
        while (true) {
            g gVar2 = this.f13212s;
            if (gVar2 == g.f13203c) {
                return;
            }
            g gVar3 = null;
            while (gVar2 != null) {
                g gVar4 = gVar2.f13205b;
                if (gVar2.f13204a != null) {
                    gVar3 = gVar2;
                } else if (gVar3 != null) {
                    gVar3.f13205b = gVar4;
                    if (gVar3.f13204a == null) {
                        break;
                    }
                } else if (!f13208v.k(this, gVar2, gVar4)) {
                    break;
                }
                gVar2 = gVar4;
            }
            return;
        }
    }

    public boolean i(Object obj) {
        if (obj == null) {
            obj = f13209w;
        }
        if (f13208v.j(this, null, obj)) {
            d(this);
            return true;
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f13210q instanceof C1091a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        boolean z7;
        if (this.f13210q != null) {
            z7 = true;
        } else {
            z7 = false;
        }
        return z7 & true;
    }

    public boolean j(Throwable th) {
        th.getClass();
        if (f13208v.j(this, null, new C1093c(th))) {
            d(this);
            return true;
        }
        return false;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f13210q instanceof C1091a) {
            str2 = "CANCELLED";
        } else {
            if (!isDone()) {
                try {
                    str = g();
                } catch (RuntimeException e3) {
                    str = "Exception thrown from implementation: " + e3.getClass();
                }
                if (str != null && !str.isEmpty()) {
                    sb.append("PENDING, info=[");
                    sb.append(str);
                    sb.append("]");
                    sb.append("]");
                    return sb.toString();
                }
                str2 = isDone() ? "PENDING" : "PENDING";
            }
            b(sb);
            sb.append("]");
            return sb.toString();
        }
        sb.append(str2);
        sb.append("]");
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ac  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x009f -> B:36:0x006e). Please submit an issue!!! */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(long r20, java.util.concurrent.TimeUnit r22) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q.h.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    public void c() {
    }
}
