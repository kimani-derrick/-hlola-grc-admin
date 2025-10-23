package M2;

import H2.U;
import Z2.AbstractC0156a;
import java.util.ArrayDeque;
import java.util.List;
/* loaded from: classes.dex */
public final class d extends i2.h implements h {

    /* renamed from: t  reason: collision with root package name */
    public h f2255t;

    /* renamed from: u  reason: collision with root package name */
    public long f2256u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ int f2257v;

    /* renamed from: w  reason: collision with root package name */
    public Object f2258w;

    public /* synthetic */ d() {
        this.f2257v = 2;
    }

    @Override // M2.h
    public final int a(long j7) {
        h hVar = this.f2255t;
        hVar.getClass();
        return hVar.a(j7 - this.f2256u);
    }

    @Override // i2.h
    public final void f() {
        boolean z7;
        switch (this.f2257v) {
            case 0:
                ArrayDeque arrayDeque = (ArrayDeque) ((f) this.f2258w).f2265e;
                if (arrayDeque.size() < 2) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                AbstractC0156a.k(z7);
                AbstractC0156a.f(!arrayDeque.contains(this));
                this.f11331r = 0;
                this.f2255t = null;
                arrayDeque.addFirst(this);
                return;
            case 1:
                g gVar = (g) this.f2258w;
                synchronized (gVar.f2267b) {
                    this.f11331r = 0;
                    this.f2255t = null;
                    int i7 = gVar.f2271h;
                    gVar.f2271h = i7 + 1;
                    gVar.f[i7] = this;
                    if (!gVar.f2268c.isEmpty() && gVar.f2271h > 0) {
                        gVar.f2267b.notify();
                    }
                }
                return;
            default:
                U u7 = (U) this.f2258w;
                u7.getClass();
                N2.i iVar = (N2.i) u7.f981r;
                iVar.getClass();
                this.f11331r = 0;
                this.f2255t = null;
                iVar.f2486b.add(this);
                return;
        }
    }

    public final void g(long j7, h hVar, long j8) {
        this.f11357s = j7;
        this.f2255t = hVar;
        if (j8 != Long.MAX_VALUE) {
            j7 = j8;
        }
        this.f2256u = j7;
    }

    @Override // M2.h
    public final List h(long j7) {
        h hVar = this.f2255t;
        hVar.getClass();
        return hVar.h(j7 - this.f2256u);
    }

    @Override // M2.h
    public final long k(int i7) {
        h hVar = this.f2255t;
        hVar.getClass();
        return hVar.k(i7) + this.f2256u;
    }

    @Override // M2.h
    public final int u() {
        h hVar = this.f2255t;
        hVar.getClass();
        return hVar.u();
    }

    public /* synthetic */ d(i iVar, int i7) {
        this.f2257v = i7;
        this.f2258w = iVar;
    }
}
