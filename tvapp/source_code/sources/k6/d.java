package k6;

import M5.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;
import k.C0852F;
/* loaded from: classes.dex */
public final class d {

    /* renamed from: h  reason: collision with root package name */
    public static final d f12220h;

    /* renamed from: i  reason: collision with root package name */
    public static final Logger f12221i;

    /* renamed from: a  reason: collision with root package name */
    public final C0852F f12222a;

    /* renamed from: c  reason: collision with root package name */
    public boolean f12224c;
    public long d;

    /* renamed from: b  reason: collision with root package name */
    public int f12223b = 10000;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f12225e = new ArrayList();
    public final ArrayList f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public final P.b f12226g = new P.b(14, this);

    static {
        String k5 = g.k(" TaskRunner", i6.b.f11394g);
        g.f(k5, "name");
        f12220h = new d(new C0852F(new i6.a(k5, true)));
        Logger logger = Logger.getLogger(d.class.getName());
        g.e(logger, "getLogger(TaskRunner::class.java.name)");
        f12221i = logger;
    }

    public d(C0852F c0852f) {
        this.f12222a = c0852f;
    }

    public static final void a(d dVar, a aVar) {
        dVar.getClass();
        byte[] bArr = i6.b.f11390a;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(aVar.f12212a);
        try {
            long a7 = aVar.a();
            synchronized (dVar) {
                dVar.b(aVar, a7);
            }
            currentThread.setName(name);
        } catch (Throwable th) {
            synchronized (dVar) {
                dVar.b(aVar, -1L);
                currentThread.setName(name);
                throw th;
            }
        }
    }

    public final void b(a aVar, long j7) {
        byte[] bArr = i6.b.f11390a;
        c cVar = aVar.f12214c;
        g.c(cVar);
        if (cVar.d == aVar) {
            boolean z7 = cVar.f;
            cVar.f = false;
            cVar.d = null;
            this.f12225e.remove(cVar);
            if (j7 != -1 && !z7 && !cVar.f12218c) {
                cVar.d(aVar, j7, true);
            }
            if (!cVar.f12219e.isEmpty()) {
                this.f.add(cVar);
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final a c() {
        boolean z7;
        byte[] bArr = i6.b.f11390a;
        while (true) {
            ArrayList arrayList = this.f;
            if (arrayList.isEmpty()) {
                return null;
            }
            C0852F c0852f = this.f12222a;
            c0852f.getClass();
            long nanoTime = System.nanoTime();
            Iterator it = arrayList.iterator();
            long j7 = Long.MAX_VALUE;
            a aVar = null;
            while (true) {
                if (it.hasNext()) {
                    a aVar2 = (a) ((c) it.next()).f12219e.get(0);
                    long max = Math.max(0L, aVar2.d - nanoTime);
                    if (max > 0) {
                        j7 = Math.min(max, j7);
                    } else if (aVar != null) {
                        z7 = true;
                        break;
                    } else {
                        aVar = aVar2;
                    }
                } else {
                    z7 = false;
                    break;
                }
            }
            if (aVar != null) {
                byte[] bArr2 = i6.b.f11390a;
                aVar.d = -1L;
                c cVar = aVar.f12214c;
                g.c(cVar);
                cVar.f12219e.remove(aVar);
                arrayList.remove(cVar);
                cVar.d = aVar;
                this.f12225e.add(cVar);
                if (z7 || (!this.f12224c && (!arrayList.isEmpty()))) {
                    P.b bVar = this.f12226g;
                    g.f(bVar, "runnable");
                    ((ThreadPoolExecutor) c0852f.f11874r).execute(bVar);
                }
                return aVar;
            } else if (this.f12224c) {
                if (j7 < this.d - nanoTime) {
                    notify();
                }
                return null;
            } else {
                this.f12224c = true;
                this.d = nanoTime + j7;
                try {
                    try {
                        long j8 = j7 / 1000000;
                        Long.signum(j8);
                        long j9 = j7 - (1000000 * j8);
                        if (j8 > 0 || j7 > 0) {
                            wait(j8, (int) j9);
                        }
                    } catch (InterruptedException unused) {
                        d();
                    }
                    this.f12224c = false;
                } catch (Throwable th) {
                    this.f12224c = false;
                    throw th;
                }
            }
        }
    }

    public final void d() {
        ArrayList arrayList = this.f12225e;
        int size = arrayList.size() - 1;
        if (size >= 0) {
            while (true) {
                int i7 = size - 1;
                ((c) arrayList.get(size)).b();
                if (i7 < 0) {
                    break;
                }
                size = i7;
            }
        }
        ArrayList arrayList2 = this.f;
        int size2 = arrayList2.size() - 1;
        if (size2 < 0) {
            return;
        }
        while (true) {
            int i8 = size2 - 1;
            c cVar = (c) arrayList2.get(size2);
            cVar.b();
            if (cVar.f12219e.isEmpty()) {
                arrayList2.remove(size2);
            }
            if (i8 >= 0) {
                size2 = i8;
            } else {
                return;
            }
        }
    }

    public final void e(c cVar) {
        g.f(cVar, "taskQueue");
        byte[] bArr = i6.b.f11390a;
        if (cVar.d == null) {
            boolean z7 = !cVar.f12219e.isEmpty();
            ArrayList arrayList = this.f;
            if (z7) {
                g.f(arrayList, "<this>");
                if (!arrayList.contains(cVar)) {
                    arrayList.add(cVar);
                }
            } else {
                arrayList.remove(cVar);
            }
        }
        boolean z8 = this.f12224c;
        C0852F c0852f = this.f12222a;
        c0852f.getClass();
        if (z8) {
            notify();
            return;
        }
        P.b bVar = this.f12226g;
        g.f(bVar, "runnable");
        ((ThreadPoolExecutor) c0852f.f11874r).execute(bVar);
    }

    public final c f() {
        int i7;
        synchronized (this) {
            i7 = this.f12223b;
            this.f12223b = i7 + 1;
        }
        return new c(this, g.k(Integer.valueOf(i7), "Q"));
    }
}
