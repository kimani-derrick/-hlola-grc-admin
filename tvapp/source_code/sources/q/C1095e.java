package q;

import a.AbstractC0189a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* renamed from: q.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1095e extends AbstractC0189a {

    /* renamed from: h  reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f13198h;

    /* renamed from: i  reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f13199i;

    /* renamed from: j  reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f13200j;

    /* renamed from: k  reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f13201k;

    /* renamed from: l  reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f13202l;

    public C1095e(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f13198h = atomicReferenceFieldUpdater;
        this.f13199i = atomicReferenceFieldUpdater2;
        this.f13200j = atomicReferenceFieldUpdater3;
        this.f13201k = atomicReferenceFieldUpdater4;
        this.f13202l = atomicReferenceFieldUpdater5;
    }

    @Override // a.AbstractC0189a
    public final void C(g gVar, g gVar2) {
        this.f13199i.lazySet(gVar, gVar2);
    }

    @Override // a.AbstractC0189a
    public final void D(g gVar, Thread thread) {
        this.f13198h.lazySet(gVar, thread);
    }

    @Override // a.AbstractC0189a
    public final boolean i(h hVar, C1094d c1094d, C1094d c1094d2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f13201k;
            if (atomicReferenceFieldUpdater.compareAndSet(hVar, c1094d, c1094d2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hVar) == c1094d);
        return false;
    }

    @Override // a.AbstractC0189a
    public final boolean j(h hVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f13202l;
            if (atomicReferenceFieldUpdater.compareAndSet(hVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hVar) == obj);
        return false;
    }

    @Override // a.AbstractC0189a
    public final boolean k(h hVar, g gVar, g gVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f13200j;
            if (atomicReferenceFieldUpdater.compareAndSet(hVar, gVar, gVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hVar) == gVar);
        return false;
    }
}
