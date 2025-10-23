package H2;

import java.util.List;
/* loaded from: classes.dex */
public final class I implements W2.q {

    /* renamed from: a  reason: collision with root package name */
    public final W2.q f902a;

    /* renamed from: b  reason: collision with root package name */
    public final m0 f903b;

    public I(W2.q qVar, m0 m0Var) {
        this.f902a = qVar;
        this.f903b = m0Var;
    }

    @Override // W2.q
    public final int a() {
        return this.f902a.a();
    }

    @Override // W2.q
    public final m0 b() {
        return this.f903b;
    }

    @Override // W2.q
    public final boolean c(long j7, J2.a aVar, List list) {
        return this.f902a.c(j7, aVar, list);
    }

    @Override // W2.q
    public final void d(boolean z7) {
        this.f902a.d(z7);
    }

    @Override // W2.q
    public final e2.K e() {
        return this.f902a.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I)) {
            return false;
        }
        I i7 = (I) obj;
        if (this.f902a.equals(i7.f902a) && this.f903b.equals(i7.f903b)) {
            return true;
        }
        return false;
    }

    @Override // W2.q
    public final int f() {
        return this.f902a.f();
    }

    @Override // W2.q
    public final int g() {
        return this.f902a.g();
    }

    @Override // W2.q
    public final e2.K h(int i7) {
        return this.f902a.h(i7);
    }

    public final int hashCode() {
        return this.f902a.hashCode() + ((this.f903b.hashCode() + 527) * 31);
    }

    @Override // W2.q
    public final void i() {
        this.f902a.i();
    }

    @Override // W2.q
    public final void j(float f) {
        this.f902a.j(f);
    }

    @Override // W2.q
    public final int k(int i7) {
        return this.f902a.k(i7);
    }

    @Override // W2.q
    public final Object l() {
        return this.f902a.l();
    }

    @Override // W2.q
    public final int length() {
        return this.f902a.length();
    }

    @Override // W2.q
    public final void m() {
        this.f902a.m();
    }

    @Override // W2.q
    public final int n(long j7, List list) {
        return this.f902a.n(j7, list);
    }

    @Override // W2.q
    public final boolean o(long j7, int i7) {
        return this.f902a.o(j7, i7);
    }

    @Override // W2.q
    public final boolean p(long j7, int i7) {
        return this.f902a.p(j7, i7);
    }

    @Override // W2.q
    public final void q() {
        this.f902a.q();
    }

    @Override // W2.q
    public final void r() {
        this.f902a.r();
    }

    @Override // W2.q
    public final void s(long j7, long j8, long j9, List list, J2.c[] cVarArr) {
        this.f902a.s(j7, j8, j9, list, cVarArr);
    }

    @Override // W2.q
    public final int t(int i7) {
        return this.f902a.t(i7);
    }
}
