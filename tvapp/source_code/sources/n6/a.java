package n6;

import M5.g;
import java.io.IOException;
import l6.k;
import v6.C1341f;
import v6.F;
import v6.H;
import v6.InterfaceC1343h;
import v6.n;
/* loaded from: classes.dex */
public abstract class a implements F {

    /* renamed from: q  reason: collision with root package name */
    public final n f12763q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f12764r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ O4.a f12765s;

    public a(O4.a aVar) {
        g.f(aVar, "this$0");
        this.f12765s = aVar;
        this.f12763q = new n(((InterfaceC1343h) aVar.d).d());
    }

    @Override // v6.F
    public long L(C1341f c1341f, long j7) {
        O4.a aVar = this.f12765s;
        g.f(c1341f, "sink");
        try {
            return ((InterfaceC1343h) aVar.d).L(c1341f, j7);
        } catch (IOException e3) {
            ((k) aVar.f2719c).l();
            a();
            throw e3;
        }
    }

    public final void a() {
        O4.a aVar = this.f12765s;
        int i7 = aVar.f2717a;
        if (i7 == 6) {
            return;
        }
        if (i7 == 5) {
            n nVar = this.f12763q;
            H h7 = nVar.f15399e;
            nVar.f15399e = H.d;
            h7.a();
            h7.b();
            aVar.f2717a = 6;
            return;
        }
        throw new IllegalStateException(g.k(Integer.valueOf(aVar.f2717a), "state: "));
    }

    @Override // v6.F
    public final H d() {
        return this.f12763q;
    }
}
