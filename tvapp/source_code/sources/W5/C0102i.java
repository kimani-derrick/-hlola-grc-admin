package W5;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import z5.C1530l;
/* renamed from: W5.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0102i extends c0 {

    /* renamed from: u  reason: collision with root package name */
    public final C0100g f3998u;

    public C0102i(C0100g c0100g) {
        this.f3998u = c0100g;
    }

    @Override // L5.l
    public final /* bridge */ /* synthetic */ Object c(Object obj) {
        p((Throwable) obj);
        return C1530l.f16479a;
    }

    @Override // W5.e0
    public final void p(Throwable th) {
        j0 o7 = o();
        C0100g c0100g = this.f3998u;
        Throwable u7 = c0100g.u(o7);
        if (c0100g.A()) {
            D5.d dVar = c0100g.f3987t;
            M5.g.d(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            b6.h hVar = (b6.h) dVar;
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b6.h.f7187x;
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                B0.d dVar2 = b6.a.d;
                if (M5.g.a(obj, dVar2)) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, dVar2, u7)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != dVar2) {
                            break;
                        }
                    }
                    return;
                } else if (!(obj instanceof Throwable)) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                            break;
                        }
                    }
                    break loop0;
                } else {
                    return;
                }
            }
        }
        c0100g.q(u7);
        if (!c0100g.A()) {
            c0100g.s();
        }
    }
}
