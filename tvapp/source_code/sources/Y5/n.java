package Y5;

import W5.AbstractC0092a;
import W5.AbstractC0117y;
import W5.C0095b0;
import W5.C0109p;
import W5.h0;
import java.util.concurrent.CancellationException;
import z5.C1530l;
/* loaded from: classes.dex */
public final class n extends AbstractC0092a implements o, f {

    /* renamed from: t  reason: collision with root package name */
    public final f f4539t;

    public n(D5.i iVar, b bVar) {
        super(iVar, true);
        this.f4539t = bVar;
    }

    @Override // W5.AbstractC0092a, W5.j0, W5.InterfaceC0093a0
    public final boolean a() {
        return super.a();
    }

    @Override // W5.j0, W5.InterfaceC0093a0
    public final void b(CancellationException cancellationException) {
        Object K6 = K();
        if (!(K6 instanceof C0109p)) {
            if (!(K6 instanceof h0) || !((h0) K6).d()) {
                if (cancellationException == null) {
                    cancellationException = new C0095b0(z(), null, this);
                }
                w(cancellationException);
            }
        }
    }

    @Override // W5.AbstractC0092a
    public final void b0(Throwable th, boolean z7) {
        if (!this.f4539t.c(th) && !z7) {
            AbstractC0117y.m(this.f3972s, th);
        }
    }

    @Override // Y5.q
    public final boolean c(Throwable th) {
        return this.f4539t.c(th);
    }

    @Override // W5.AbstractC0092a
    public final void c0(Object obj) {
        C1530l c1530l = (C1530l) obj;
        this.f4539t.c(null);
    }

    @Override // Y5.q
    public final Object e(Object obj) {
        return this.f4539t.e(obj);
    }

    @Override // Y5.p
    public final a iterator() {
        return this.f4539t.iterator();
    }

    @Override // Y5.q
    public final Object p(D5.d dVar, Object obj) {
        return this.f4539t.p(dVar, obj);
    }

    @Override // W5.j0
    public final void w(CancellationException cancellationException) {
        this.f4539t.b(cancellationException);
        v(cancellationException);
    }
}
