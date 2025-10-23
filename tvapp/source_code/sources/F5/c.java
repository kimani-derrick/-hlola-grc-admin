package F5;

import W5.C0100g;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes.dex */
public abstract class c extends a {

    /* renamed from: r  reason: collision with root package name */
    public final D5.i f731r;

    /* renamed from: s  reason: collision with root package name */
    public transient D5.d f732s;

    public c(D5.d dVar) {
        this(dVar, dVar != null ? dVar.k() : null);
    }

    @Override // D5.d
    public D5.i k() {
        D5.i iVar = this.f731r;
        M5.g.c(iVar);
        return iVar;
    }

    @Override // F5.a
    public void r() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C0100g c0100g;
        D5.d dVar = this.f732s;
        if (dVar != null && dVar != this) {
            D5.g f = k().f(D5.e.f529q);
            M5.g.c(f);
            D5.f fVar = (D5.f) f;
            b6.h hVar = (b6.h) dVar;
            do {
                atomicReferenceFieldUpdater = b6.h.f7187x;
            } while (atomicReferenceFieldUpdater.get(hVar) == b6.a.d);
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            if (obj instanceof C0100g) {
                c0100g = (C0100g) obj;
            } else {
                c0100g = null;
            }
            if (c0100g != null) {
                c0100g.s();
            }
        }
        this.f732s = b.f730q;
    }

    public c(D5.d dVar, D5.i iVar) {
        super(dVar);
        this.f731r = iVar;
    }
}
