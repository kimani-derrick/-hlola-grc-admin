package W5;
/* loaded from: classes.dex */
public final class v0 extends b6.s implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final long f4029u;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public v0(long r2, W5.w0 r4) {
        /*
            r1 = this;
            D5.i r0 = r4.f731r
            M5.g.c(r0)
            r1.<init>(r4, r0)
            r1.f4029u = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: W5.v0.<init>(long, W5.w0):void");
    }

    @Override // W5.AbstractC0092a, W5.j0
    public final String S() {
        return super.S() + "(timeMillis=" + this.f4029u + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC0117y.i(this.f3972s);
        v(new u0("Timed out waiting for " + this.f4029u + " ms", this));
    }
}
