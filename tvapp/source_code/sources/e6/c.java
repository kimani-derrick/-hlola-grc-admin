package e6;

import L5.l;
import W5.A0;
import W5.AbstractC0113u;
import W5.C0100g;
import W5.InterfaceC0099f;
import b6.t;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import z5.C1530l;
/* loaded from: classes.dex */
public final class c implements InterfaceC0099f, A0 {

    /* renamed from: q  reason: collision with root package name */
    public final C0100g f10180q;

    /* renamed from: r  reason: collision with root package name */
    public final Object f10181r = null;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ d f10182s;

    public c(d dVar, C0100g c0100g) {
        this.f10182s = dVar;
        this.f10180q = c0100g;
    }

    @Override // W5.A0
    public final void a(t tVar, int i7) {
        this.f10180q.a(tVar, i7);
    }

    @Override // W5.InterfaceC0099f
    public final B0.d d(Object obj, l lVar) {
        d dVar = this.f10182s;
        b bVar = new b(dVar, this, 1);
        B0.d d = this.f10180q.d((C1530l) obj, bVar);
        if (d != null) {
            d.f10183h.set(dVar, this.f10181r);
        }
        return d;
    }

    @Override // W5.InterfaceC0099f
    public final void i(Object obj, l lVar) {
        C1530l c1530l = C1530l.f16479a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f10183h;
        Object obj2 = this.f10181r;
        d dVar = this.f10182s;
        atomicReferenceFieldUpdater.set(dVar, obj2);
        this.f10180q.i(c1530l, new b(dVar, this, 0));
    }

    @Override // D5.d
    public final D5.i k() {
        return this.f10180q.f3988u;
    }

    @Override // W5.InterfaceC0099f
    public final void l(AbstractC0113u abstractC0113u) {
        this.f10180q.l(abstractC0113u);
    }

    @Override // D5.d
    public final void m(Object obj) {
        this.f10180q.m(obj);
    }

    @Override // W5.InterfaceC0099f
    public final void o(Object obj) {
        this.f10180q.o(obj);
    }

    @Override // W5.InterfaceC0099f
    public final boolean q(Throwable th) {
        return this.f10180q.q(th);
    }
}
