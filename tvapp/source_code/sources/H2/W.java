package H2;

import Y2.InterfaceC0143l;
import Y2.InterfaceC0144m;
import Z2.AbstractC0156a;
import android.net.Uri;
import android.os.Looper;
import e2.J0;
import java.util.concurrent.CopyOnWriteArrayList;
import k2.InterfaceC0949n;
/* loaded from: classes.dex */
public final class W extends AbstractC0000a {

    /* renamed from: h  reason: collision with root package name */
    public final e2.Z f986h;

    /* renamed from: i  reason: collision with root package name */
    public final e2.U f987i;

    /* renamed from: j  reason: collision with root package name */
    public final InterfaceC0143l f988j;

    /* renamed from: k  reason: collision with root package name */
    public final U f989k;

    /* renamed from: l  reason: collision with root package name */
    public final j2.q f990l;

    /* renamed from: m  reason: collision with root package name */
    public final L4.f f991m;
    public final int n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f992o;

    /* renamed from: p  reason: collision with root package name */
    public long f993p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f994q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f995r;

    /* renamed from: s  reason: collision with root package name */
    public Y2.W f996s;

    public W(e2.Z z7, InterfaceC0143l interfaceC0143l, U u7, j2.q qVar, L4.f fVar, int i7) {
        e2.U u8 = z7.f9805r;
        u8.getClass();
        this.f987i = u8;
        this.f986h = z7;
        this.f988j = interfaceC0143l;
        this.f989k = u7;
        this.f990l = qVar;
        this.f991m = fVar;
        this.n = i7;
        this.f992o = true;
        this.f993p = -9223372036854775807L;
    }

    @Override // H2.AbstractC0000a
    public final InterfaceC0022x a(A a7, Y2.r rVar, long j7) {
        InterfaceC0144m f = this.f988j.f();
        Y2.W w7 = this.f996s;
        if (w7 != null) {
            f.m(w7);
        }
        e2.U u7 = this.f987i;
        Uri uri = u7.f9761q;
        AbstractC0156a.l(this.f1013g);
        return new S(uri, f, new C0002c((InterfaceC0949n) this.f989k.f981r), this.f990l, new j2.n(this.d.f11835c, 0, a7), this.f991m, new C.d((CopyOnWriteArrayList) this.f1011c.f326t, 0, a7), this, rVar, u7.f9766v, this.n);
    }

    @Override // H2.AbstractC0000a
    public final e2.Z g() {
        return this.f986h;
    }

    @Override // H2.AbstractC0000a
    public final void k(Y2.W w7) {
        this.f996s = w7;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        f2.m mVar = this.f1013g;
        AbstractC0156a.l(mVar);
        j2.q qVar = this.f990l;
        qVar.h(myLooper, mVar);
        qVar.m();
        r();
    }

    @Override // H2.AbstractC0000a
    public final void m(InterfaceC0022x interfaceC0022x) {
        c0[] c0VarArr;
        S s6 = (S) interfaceC0022x;
        if (s6.f954L) {
            for (c0 c0Var : s6.f951I) {
                c0Var.i();
                j2.k kVar = c0Var.f1031h;
                if (kVar != null) {
                    kVar.a(c0Var.f1029e);
                    c0Var.f1031h = null;
                    c0Var.f1030g = null;
                }
            }
        }
        s6.f944A.c(s6);
        s6.F.removeCallbacksAndMessages(null);
        s6.f949G = null;
        s6.f969b0 = true;
    }

    @Override // H2.AbstractC0000a
    public final void o() {
        this.f990l.a();
    }

    public final void r() {
        J0 h0Var = new h0(this.f993p, this.f994q, this.f995r, this.f986h);
        if (this.f992o) {
            h0Var = new AbstractC0014o(h0Var);
        }
        l(h0Var);
    }

    public final void s(long j7, boolean z7, boolean z8) {
        if (j7 == -9223372036854775807L) {
            j7 = this.f993p;
        }
        if (!this.f992o && this.f993p == j7 && this.f994q == z7 && this.f995r == z8) {
            return;
        }
        this.f993p = j7;
        this.f994q = z7;
        this.f995r = z8;
        this.f992o = false;
        r();
    }

    @Override // H2.AbstractC0000a
    public final void i() {
    }
}
