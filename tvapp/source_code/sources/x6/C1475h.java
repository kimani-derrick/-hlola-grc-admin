package x6;

import java.util.concurrent.CompletableFuture;
/* renamed from: x6.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1475h implements InterfaceC1473f {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f16307q;

    /* renamed from: r  reason: collision with root package name */
    public final CompletableFuture f16308r;

    public /* synthetic */ C1475h(C1477j c1477j, int i7) {
        this.f16307q = i7;
        this.f16308r = c1477j;
    }

    @Override // x6.InterfaceC1473f
    public final void e(InterfaceC1470c interfaceC1470c, N n) {
        switch (this.f16307q) {
            case 0:
                if (n.f16285a.f()) {
                    this.f16308r.complete(n.f16286b);
                    return;
                } else {
                    this.f16308r.completeExceptionally(new C1483p(n));
                    return;
                }
            default:
                this.f16308r.complete(n);
                return;
        }
    }

    @Override // x6.InterfaceC1473f
    public final void f(InterfaceC1470c interfaceC1470c, Throwable th) {
        switch (this.f16307q) {
            case 0:
                this.f16308r.completeExceptionally(th);
                return;
            default:
                this.f16308r.completeExceptionally(th);
                return;
        }
    }
}
