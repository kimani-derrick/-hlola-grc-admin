package k6;

import M5.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import k3.AbstractC0958a;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final d f12216a;

    /* renamed from: b  reason: collision with root package name */
    public final String f12217b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f12218c;
    public a d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f12219e;
    public boolean f;

    public c(d dVar, String str) {
        g.f(dVar, "taskRunner");
        g.f(str, "name");
        this.f12216a = dVar;
        this.f12217b = str;
        this.f12219e = new ArrayList();
    }

    public final void a() {
        byte[] bArr = i6.b.f11390a;
        synchronized (this.f12216a) {
            if (b()) {
                this.f12216a.e(this);
            }
        }
    }

    public final boolean b() {
        a aVar = this.d;
        if (aVar != null && aVar.f12213b) {
            this.f = true;
        }
        ArrayList arrayList = this.f12219e;
        int size = arrayList.size() - 1;
        boolean z7 = false;
        if (size >= 0) {
            while (true) {
                int i7 = size - 1;
                if (((a) arrayList.get(size)).f12213b) {
                    a aVar2 = (a) arrayList.get(size);
                    if (d.f12221i.isLoggable(Level.FINE)) {
                        AbstractC0958a.d(aVar2, this, "canceled");
                    }
                    arrayList.remove(size);
                    z7 = true;
                }
                if (i7 < 0) {
                    break;
                }
                size = i7;
            }
        }
        return z7;
    }

    public final void c(a aVar, long j7) {
        g.f(aVar, "task");
        synchronized (this.f12216a) {
            if (this.f12218c) {
                if (aVar.f12213b) {
                    d dVar = d.f12220h;
                    if (d.f12221i.isLoggable(Level.FINE)) {
                        AbstractC0958a.d(aVar, this, "schedule canceled (queue is shutdown)");
                    }
                    return;
                }
                d dVar2 = d.f12220h;
                if (d.f12221i.isLoggable(Level.FINE)) {
                    AbstractC0958a.d(aVar, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
            if (d(aVar, j7, false)) {
                this.f12216a.e(this);
            }
        }
    }

    public final boolean d(a aVar, long j7, boolean z7) {
        String r3;
        String str;
        g.f(aVar, "task");
        c cVar = aVar.f12214c;
        if (cVar != this) {
            if (cVar == null) {
                aVar.f12214c = this;
            } else {
                throw new IllegalStateException("task is in multiple queues".toString());
            }
        }
        this.f12216a.f12222a.getClass();
        long nanoTime = System.nanoTime();
        long j8 = nanoTime + j7;
        ArrayList arrayList = this.f12219e;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf != -1) {
            if (aVar.d <= j8) {
                if (d.f12221i.isLoggable(Level.FINE)) {
                    AbstractC0958a.d(aVar, this, "already scheduled");
                }
                return false;
            }
            arrayList.remove(indexOf);
        }
        aVar.d = j8;
        if (d.f12221i.isLoggable(Level.FINE)) {
            long j9 = j8 - nanoTime;
            if (z7) {
                r3 = AbstractC0958a.r(j9);
                str = "run again after ";
            } else {
                r3 = AbstractC0958a.r(j9);
                str = "scheduled after ";
            }
            AbstractC0958a.d(aVar, this, g.k(r3, str));
        }
        Iterator it = arrayList.iterator();
        int i7 = 0;
        while (true) {
            if (it.hasNext()) {
                if (((a) it.next()).d - nanoTime > j7) {
                    break;
                }
                i7++;
            } else {
                i7 = -1;
                break;
            }
        }
        if (i7 == -1) {
            i7 = arrayList.size();
        }
        arrayList.add(i7, aVar);
        if (i7 != 0) {
            return false;
        }
        return true;
    }

    public final void e() {
        byte[] bArr = i6.b.f11390a;
        synchronized (this.f12216a) {
            this.f12218c = true;
            if (b()) {
                this.f12216a.e(this);
            }
        }
    }

    public final String toString() {
        return this.f12217b;
    }
}
