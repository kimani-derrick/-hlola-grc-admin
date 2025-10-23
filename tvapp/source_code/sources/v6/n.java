package v6;

import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class n extends H {

    /* renamed from: e  reason: collision with root package name */
    public H f15399e;

    public n(H h7) {
        M5.g.f(h7, "delegate");
        this.f15399e = h7;
    }

    @Override // v6.H
    public final H a() {
        return this.f15399e.a();
    }

    @Override // v6.H
    public final H b() {
        return this.f15399e.b();
    }

    @Override // v6.H
    public final long c() {
        return this.f15399e.c();
    }

    @Override // v6.H
    public final H d(long j7) {
        return this.f15399e.d(j7);
    }

    @Override // v6.H
    public final boolean e() {
        return this.f15399e.e();
    }

    @Override // v6.H
    public final void f() {
        this.f15399e.f();
    }

    @Override // v6.H
    public final H g(long j7, TimeUnit timeUnit) {
        M5.g.f(timeUnit, "unit");
        return this.f15399e.g(j7, timeUnit);
    }
}
