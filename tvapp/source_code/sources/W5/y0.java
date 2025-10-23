package W5;

import z5.C1524f;
/* loaded from: classes.dex */
public final class y0 extends b6.s {
    private volatile boolean threadLocalIsSet;

    /* renamed from: u  reason: collision with root package name */
    public final ThreadLocal f4042u;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public y0(D5.d r3, D5.i r4) {
        /*
            r2 = this;
            W5.z0 r0 = W5.z0.f4045q
            D5.g r1 = r4.f(r0)
            if (r1 != 0) goto Ld
            D5.i r0 = r4.r(r0)
            goto Le
        Ld:
            r0 = r4
        Le:
            r2.<init>(r3, r0)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.f4042u = r0
            D5.i r3 = r3.k()
            D5.e r0 = D5.e.f529q
            D5.g r3 = r3.f(r0)
            boolean r3 = r3 instanceof W5.AbstractC0113u
            if (r3 != 0) goto L31
            r3 = 0
            java.lang.Object r3 = b6.a.m(r4, r3)
            b6.a.h(r4, r3)
            r2.f0(r4, r3)
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: W5.y0.<init>(D5.d, D5.i):void");
    }

    public final boolean e0() {
        boolean z7;
        if (this.threadLocalIsSet && this.f4042u.get() == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.f4042u.remove();
        return !z7;
    }

    public final void f0(D5.i iVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f4042u.set(new C1524f(iVar, obj));
    }

    @Override // b6.s, W5.j0
    public final void u(Object obj) {
        if (this.threadLocalIsSet) {
            C1524f c1524f = (C1524f) this.f4042u.get();
            if (c1524f != null) {
                b6.a.h((D5.i) c1524f.f16468q, c1524f.f16469r);
            }
            this.f4042u.remove();
        }
        Object r3 = AbstractC0117y.r(obj);
        D5.d dVar = this.f7210t;
        D5.i k5 = dVar.k();
        y0 y0Var = null;
        Object m7 = b6.a.m(k5, null);
        if (m7 != b6.a.f) {
            y0Var = AbstractC0117y.x(dVar, k5, m7);
        }
        try {
            this.f7210t.m(r3);
        } finally {
            if (y0Var == null || y0Var.e0()) {
                b6.a.h(k5, m7);
            }
        }
    }
}
