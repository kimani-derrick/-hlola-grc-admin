package b6;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: q  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f7182q = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_next");

    /* renamed from: r  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f7183r = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_prev");
    private volatile Object _next;
    private volatile Object _prev;

    public d(d dVar) {
        this._prev = dVar;
    }

    public final void a() {
        f7183r.lazySet(this, null);
    }

    public final d b() {
        Object obj = f7182q.get(this);
        if (obj == a.f7177b) {
            return null;
        }
        return (d) obj;
    }

    public abstract boolean c();

    public final void d() {
        d dVar;
        d b7;
        if (b() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7183r;
            d dVar2 = (d) atomicReferenceFieldUpdater.get(this);
            while (dVar2 != null && dVar2.c()) {
                dVar2 = (d) atomicReferenceFieldUpdater.get(dVar2);
            }
            d b8 = b();
            M5.g.c(b8);
            while (b8.c() && (b7 = b8.b()) != null) {
                b8 = b7;
            }
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(b8);
                if (((d) obj) == null) {
                    dVar = null;
                } else {
                    dVar = dVar2;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(b8, obj, dVar)) {
                    if (atomicReferenceFieldUpdater.get(b8) != obj) {
                        break;
                    }
                }
            }
            if (dVar2 != null) {
                f7182q.set(dVar2, b8);
            }
            if (!b8.c() || b8.b() == null) {
                if (dVar2 == null || !dVar2.c()) {
                    return;
                }
            }
        }
    }
}
