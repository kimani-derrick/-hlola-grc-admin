package x6;

import java.util.concurrent.Executor;
/* renamed from: x6.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1481n implements InterfaceC1470c {

    /* renamed from: q  reason: collision with root package name */
    public final Executor f16313q;

    /* renamed from: r  reason: collision with root package name */
    public final InterfaceC1470c f16314r;

    public C1481n(Executor executor, InterfaceC1470c interfaceC1470c) {
        this.f16313q = executor;
        this.f16314r = interfaceC1470c;
    }

    @Override // x6.InterfaceC1470c
    /* renamed from: a */
    public final InterfaceC1470c clone() {
        return new C1481n(this.f16313q, this.f16314r.a());
    }

    @Override // x6.InterfaceC1470c
    public final void cancel() {
        this.f16314r.cancel();
    }

    @Override // x6.InterfaceC1470c
    public final void f(InterfaceC1473f interfaceC1473f) {
        this.f16314r.f(new t2.i(this, 16, interfaceC1473f));
    }

    @Override // x6.InterfaceC1470c
    public final h6.B h() {
        return this.f16314r.h();
    }

    @Override // x6.InterfaceC1470c
    public final boolean j() {
        return this.f16314r.j();
    }
}
