package n6;

import M5.g;
import v6.C1341f;
import v6.D;
import v6.H;
import v6.InterfaceC1342g;
import v6.n;
/* loaded from: classes.dex */
public final class e implements D {

    /* renamed from: q  reason: collision with root package name */
    public final n f12775q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f12776r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ O4.a f12777s;

    public e(O4.a aVar) {
        g.f(aVar, "this$0");
        this.f12777s = aVar;
        this.f12775q = new n(((InterfaceC1342g) aVar.f2720e).d());
    }

    @Override // v6.D, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f12776r) {
            return;
        }
        this.f12776r = true;
        O4.a aVar = this.f12777s;
        aVar.getClass();
        n nVar = this.f12775q;
        H h7 = nVar.f15399e;
        nVar.f15399e = H.d;
        h7.a();
        h7.b();
        aVar.f2717a = 3;
    }

    @Override // v6.D
    public final H d() {
        return this.f12775q;
    }

    @Override // v6.D, java.io.Flushable
    public final void flush() {
        if (this.f12776r) {
            return;
        }
        ((InterfaceC1342g) this.f12777s.f2720e).flush();
    }

    @Override // v6.D
    public final void v(C1341f c1341f, long j7) {
        g.f(c1341f, "source");
        if (!this.f12776r) {
            i6.b.c(c1341f.f15388r, 0L, j7);
            ((InterfaceC1342g) this.f12777s.f2720e).v(c1341f, j7);
            return;
        }
        throw new IllegalStateException("closed".toString());
    }
}
