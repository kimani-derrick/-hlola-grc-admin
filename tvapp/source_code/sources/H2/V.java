package H2;

import Y2.InterfaceC0143l;
import Z2.AbstractC0156a;
import k2.InterfaceC0949n;
/* loaded from: classes.dex */
public final class V implements InterfaceC0024z {

    /* renamed from: a  reason: collision with root package name */
    public final InterfaceC0143l f982a;

    /* renamed from: b  reason: collision with root package name */
    public final U f983b;

    /* renamed from: c  reason: collision with root package name */
    public g5.b f984c;
    public L4.f d;

    /* renamed from: e  reason: collision with root package name */
    public final int f985e;

    public V(InterfaceC0143l interfaceC0143l, InterfaceC0949n interfaceC0949n) {
        U u7 = new U(0, interfaceC0949n);
        g5.b bVar = new g5.b(3);
        L4.f fVar = new L4.f(12);
        this.f982a = interfaceC0143l;
        this.f983b = u7;
        this.f984c = bVar;
        this.d = fVar;
        this.f985e = 1048576;
    }

    @Override // H2.InterfaceC0024z
    public final InterfaceC0024z a(g5.b bVar) {
        AbstractC0156a.j(bVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.f984c = bVar;
        return this;
    }

    @Override // H2.InterfaceC0024z
    public final AbstractC0000a b(e2.Z z7) {
        z7.f9805r.getClass();
        return new W(z7, this.f982a, this.f983b, this.f984c.x(z7), this.d, this.f985e);
    }

    @Override // H2.InterfaceC0024z
    public final InterfaceC0024z c(L4.f fVar) {
        AbstractC0156a.j(fVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.d = fVar;
        return this;
    }
}
