package x6;

import java.util.concurrent.CompletableFuture;
/* renamed from: x6.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1477j extends CompletableFuture {

    /* renamed from: q  reason: collision with root package name */
    public final InterfaceC1470c f16311q;

    public C1477j(C1488v c1488v) {
        this.f16311q = c1488v;
    }

    @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
    public final boolean cancel(boolean z7) {
        if (z7) {
            this.f16311q.cancel();
        }
        return super.cancel(z7);
    }
}
