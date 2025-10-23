package H2;

import e2.J0;
/* loaded from: classes.dex */
public abstract class p0 extends AbstractC0010k {

    /* renamed from: k  reason: collision with root package name */
    public final AbstractC0000a f1155k;

    public p0(AbstractC0000a abstractC0000a) {
        this.f1155k = abstractC0000a;
    }

    @Override // H2.AbstractC0000a
    public final J0 f() {
        return this.f1155k.f();
    }

    @Override // H2.AbstractC0000a
    public final e2.Z g() {
        return this.f1155k.g();
    }

    @Override // H2.AbstractC0000a
    public final boolean h() {
        return this.f1155k.h();
    }

    @Override // H2.AbstractC0000a
    public final void k(Y2.W w7) {
        this.f1102j = w7;
        this.f1101i = Z2.H.n(null);
        y();
    }

    @Override // H2.AbstractC0010k
    public final A r(Object obj, A a7) {
        Void r12 = (Void) obj;
        return w(a7);
    }

    @Override // H2.AbstractC0010k
    public final long s(long j7, Object obj) {
        Void r3 = (Void) obj;
        return j7;
    }

    @Override // H2.AbstractC0010k
    public final int t(int i7, Object obj) {
        Void r22 = (Void) obj;
        return i7;
    }

    @Override // H2.AbstractC0010k
    public final void u(Object obj, AbstractC0000a abstractC0000a, J0 j02) {
        Void r12 = (Void) obj;
        x(j02);
    }

    public abstract void x(J0 j02);

    public void y() {
        v(null, this.f1155k);
    }

    public A w(A a7) {
        return a7;
    }
}
