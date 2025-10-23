package n6;

import M5.g;
import v6.C1341f;
import v6.D;
import v6.H;
import v6.InterfaceC1342g;
import v6.n;
/* loaded from: classes.dex */
public final class b implements D {

    /* renamed from: q  reason: collision with root package name */
    public final n f12766q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f12767r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ O4.a f12768s;

    public b(O4.a aVar) {
        g.f(aVar, "this$0");
        this.f12768s = aVar;
        this.f12766q = new n(((InterfaceC1342g) aVar.f2720e).d());
    }

    @Override // v6.D, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f12767r) {
            return;
        }
        this.f12767r = true;
        ((InterfaceC1342g) this.f12768s.f2720e).G("0\r\n\r\n");
        O4.a aVar = this.f12768s;
        n nVar = this.f12766q;
        aVar.getClass();
        H h7 = nVar.f15399e;
        nVar.f15399e = H.d;
        h7.a();
        h7.b();
        this.f12768s.f2717a = 3;
    }

    @Override // v6.D
    public final H d() {
        return this.f12766q;
    }

    @Override // v6.D, java.io.Flushable
    public final synchronized void flush() {
        if (this.f12767r) {
            return;
        }
        ((InterfaceC1342g) this.f12768s.f2720e).flush();
    }

    @Override // v6.D
    public final void v(C1341f c1341f, long j7) {
        g.f(c1341f, "source");
        if (!this.f12767r) {
            if (j7 == 0) {
                return;
            }
            O4.a aVar = this.f12768s;
            ((InterfaceC1342g) aVar.f2720e).k(j7);
            InterfaceC1342g interfaceC1342g = (InterfaceC1342g) aVar.f2720e;
            interfaceC1342g.G("\r\n");
            interfaceC1342g.v(c1341f, j7);
            interfaceC1342g.G("\r\n");
            return;
        }
        throw new IllegalStateException("closed".toString());
    }
}
