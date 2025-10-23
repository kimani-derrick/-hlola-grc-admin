package f2;

import H2.A;
import H2.C0016q;
import H2.C0020v;
import H2.C0023y;
import H2.H;
import O3.C;
import O3.E;
import O3.U;
import O3.Z;
import W2.w;
import Z2.AbstractC0156a;
import Z2.B;
import Z2.D;
import Z2.p;
import a3.z;
import a4.C0214f;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import e2.C0585B;
import e2.C0597b0;
import e2.C0616l;
import e2.C0624t;
import e2.C0628x;
import e2.H0;
import e2.I0;
import e2.J0;
import e2.L0;
import e2.q0;
import e2.r0;
import e2.s0;
import e2.t0;
import e2.u0;
import e2.v0;
import j2.o;
import java.io.IOException;
import java.util.List;
import x2.C1461c;
import z4.C1518b;
/* loaded from: classes.dex */
public final class f implements t0, H, o {

    /* renamed from: q  reason: collision with root package name */
    public final B f10348q;

    /* renamed from: r  reason: collision with root package name */
    public final H0 f10349r;

    /* renamed from: s  reason: collision with root package name */
    public final I0 f10350s;

    /* renamed from: t  reason: collision with root package name */
    public final C1518b f10351t;

    /* renamed from: u  reason: collision with root package name */
    public final SparseArray f10352u;

    /* renamed from: v  reason: collision with root package name */
    public p f10353v;

    /* renamed from: w  reason: collision with root package name */
    public v0 f10354w;

    /* renamed from: x  reason: collision with root package name */
    public D f10355x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f10356y;

    /* JADX WARN: Type inference failed for: r0v2, types: [z4.b, java.lang.Object] */
    public f(B b7) {
        b7.getClass();
        this.f10348q = b7;
        int i7 = Z2.H.f4603a;
        Looper myLooper = Looper.myLooper();
        this.f10353v = new p(myLooper == null ? Looper.getMainLooper() : myLooper, b7, new b(9));
        H0 h02 = new H0();
        this.f10349r = h02;
        this.f10350s = new I0();
        ?? obj = new Object();
        obj.f16461a = h02;
        C c5 = E.f2597r;
        obj.f16462b = U.f2621u;
        obj.f16463c = Z.f2634w;
        this.f10351t = obj;
        this.f10352u = new SparseArray();
    }

    @Override // e2.t0
    public final void A(w wVar) {
        R(M(), 19, new d(2));
    }

    @Override // e2.t0
    public final void B(List list) {
        R(M(), 27, new b(14));
    }

    @Override // H2.H
    public final void C(int i7, A a7, C0016q c0016q, C0020v c0020v) {
        R(P(i7, a7), 1000, new b(22));
    }

    @Override // e2.t0
    public final void D(int i7, boolean z7) {
        R(M(), -1, new C0214f(28));
    }

    @Override // e2.t0
    public final void E(int i7, boolean z7) {
        R(M(), 5, new b(2));
    }

    @Override // j2.o
    public final void F(int i7, A a7, int i8) {
        C0695a P6 = P(i7, a7);
        R(P6, 1022, new d(P6, i8));
    }

    @Override // e2.t0
    public final void G(r0 r0Var) {
        R(M(), 13, new b(4));
    }

    @Override // j2.o
    public final void H(int i7, A a7) {
        R(P(i7, a7), 1025, new d(9));
    }

    @Override // e2.t0
    public final void I(int i7, u0 u0Var, u0 u0Var2) {
        if (i7 == 1) {
            this.f10356y = false;
        }
        v0 v0Var = this.f10354w;
        v0Var.getClass();
        C1518b c1518b = this.f10351t;
        c1518b.d = C1518b.l(v0Var, (E) c1518b.f16462b, (A) c1518b.f16464e, (H0) c1518b.f16461a);
        C0695a M6 = M();
        R(M6, 11, new C0624t(M6, i7, u0Var, u0Var2));
    }

    @Override // j2.o
    public final void J(int i7, A a7) {
        R(P(i7, a7), 1023, new d(8));
    }

    @Override // e2.t0
    public final void K(C1461c c1461c) {
        R(M(), 28, new b(25));
    }

    @Override // e2.t0
    public final void L(boolean z7) {
        R(M(), 7, new d(10));
    }

    public final C0695a M() {
        return N((A) this.f10351t.d);
    }

    public final C0695a N(A a7) {
        J0 j02;
        this.f10354w.getClass();
        if (a7 == null) {
            j02 = null;
        } else {
            j02 = (J0) ((Z) this.f10351t.f16463c).get(a7);
        }
        if (a7 != null && j02 != null) {
            return O(j02, j02.h(a7.f1180a, this.f10349r).f9554s, a7);
        }
        int K6 = ((C0585B) this.f10354w).K();
        J0 O5 = ((C0585B) this.f10354w).O();
        if (K6 >= O5.p()) {
            O5 = J0.f9620q;
        }
        return O(O5, K6, null);
    }

    public final C0695a O(J0 j02, int i7, A a7) {
        A a8;
        boolean z7;
        if (j02.q()) {
            a8 = null;
        } else {
            a8 = a7;
        }
        this.f10348q.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (j02.equals(((C0585B) this.f10354w).O()) && i7 == ((C0585B) this.f10354w).K()) {
            z7 = true;
        } else {
            z7 = false;
        }
        long j7 = 0;
        if (a8 != null && a8.a()) {
            if (z7 && ((C0585B) this.f10354w).I() == a8.f1181b && ((C0585B) this.f10354w).J() == a8.f1182c) {
                j7 = ((C0585B) this.f10354w).M();
            }
        } else if (z7) {
            C0585B c0585b = (C0585B) this.f10354w;
            c0585b.q0();
            j7 = c0585b.H(c0585b.f9472w0);
        } else if (!j02.q()) {
            j7 = Z2.H.S(j02.n(i7, this.f10350s, 0L).f9578C);
        }
        A a9 = (A) this.f10351t.d;
        J0 O5 = ((C0585B) this.f10354w).O();
        int K6 = ((C0585B) this.f10354w).K();
        long M6 = ((C0585B) this.f10354w).M();
        C0585B c0585b2 = (C0585B) this.f10354w;
        c0585b2.q0();
        return new C0695a(elapsedRealtime, j02, i7, a8, j7, O5, K6, a9, M6, Z2.H.S(c0585b2.f9472w0.f10056q));
    }

    public final C0695a P(int i7, A a7) {
        this.f10354w.getClass();
        if (a7 != null) {
            if (((J0) ((Z) this.f10351t.f16463c).get(a7)) != null) {
                return N(a7);
            }
            return O(J0.f9620q, i7, a7);
        }
        J0 O5 = ((C0585B) this.f10354w).O();
        if (i7 >= O5.p()) {
            O5 = J0.f9620q;
        }
        return O(O5, i7, null);
    }

    public final C0695a Q() {
        return N((A) this.f10351t.f);
    }

    public final void R(C0695a c0695a, int i7, Z2.m mVar) {
        this.f10352u.put(i7, c0695a);
        this.f10353v.e(i7, mVar);
    }

    public final void S(v0 v0Var, Looper looper) {
        boolean z7;
        if (this.f10354w != null && !((E) this.f10351t.f16462b).isEmpty()) {
            z7 = false;
        } else {
            z7 = true;
        }
        AbstractC0156a.k(z7);
        v0Var.getClass();
        this.f10354w = v0Var;
        this.f10355x = this.f10348q.a(looper, null);
        p pVar = this.f10353v;
        T4.d dVar = new T4.d(this, 10, v0Var);
        this.f10353v = new p(pVar.d, looper, pVar.f4648a, dVar, pVar.f4654i);
    }

    @Override // H2.H
    public final void a(int i7, A a7, C0016q c0016q, C0020v c0020v) {
        R(P(i7, a7), 1001, new b(29));
    }

    @Override // e2.t0
    public final void b(int i7) {
        R(M(), 6, new b(18));
    }

    @Override // e2.t0
    public final void c(int i7) {
        R(M(), 4, new b(7));
    }

    @Override // e2.t0
    public final void d(int i7) {
        v0 v0Var = this.f10354w;
        v0Var.getClass();
        C1518b c1518b = this.f10351t;
        c1518b.d = C1518b.l(v0Var, (E) c1518b.f16462b, (A) c1518b.f16464e, (H0) c1518b.f16461a);
        c1518b.y(((C0585B) v0Var).O());
        R(M(), 0, new b(24));
    }

    @Override // j2.o
    public final void e(int i7, A a7) {
        R(P(i7, a7), 1026, new d(6));
    }

    @Override // j2.o
    public final void f(int i7, A a7) {
        R(P(i7, a7), 1027, new d(3));
    }

    @Override // e2.t0
    public final void h(C0597b0 c0597b0) {
        R(M(), 14, new C0214f(26));
    }

    @Override // e2.t0
    public final void i(q0 q0Var) {
        R(M(), 12, new C0214f(27));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [H2.y, H2.A] */
    @Override // e2.t0
    public final void j(C0616l c0616l) {
        C0695a M6;
        C0023y c0023y;
        if ((c0616l instanceof C0616l) && (c0023y = c0616l.f10009x) != null) {
            M6 = N(new C0023y(c0023y));
        } else {
            M6 = M();
        }
        R(M6, 10, new H2.U(M6, c0616l, 17));
    }

    @Override // H2.H
    public final void k(int i7, A a7, C0020v c0020v) {
        C0695a P6 = P(i7, a7);
        R(P6, 1004, new T4.d(P6, 11, c0020v));
    }

    @Override // e2.t0
    public final void l(boolean z7) {
        R(M(), 9, new d(13));
    }

    @Override // e2.t0
    public final void m(L0 l02) {
        R(M(), 2, new b(15));
    }

    @Override // e2.t0
    public final void n(int i7, int i8) {
        R(Q(), 24, new b(0));
    }

    @Override // e2.t0
    public final void o(int i7) {
        R(M(), 8, new b(12));
    }

    @Override // H2.H
    public final void p(int i7, A a7, C0016q c0016q, C0020v c0020v, IOException iOException, boolean z7) {
        C0695a P6 = P(i7, a7);
        R(P6, 1003, new H2.U(P6, c0016q, c0020v, iOException, z7));
    }

    @Override // H2.H
    public final void q(int i7, A a7, C0020v c0020v) {
        R(P(i7, a7), 1005, new b(21));
    }

    @Override // j2.o
    public final void r(int i7, A a7, Exception exc) {
        R(P(i7, a7), 1024, new d(4));
    }

    @Override // e2.t0
    public final void s(e2.Z z7, int i7) {
        R(M(), 1, new b(1));
    }

    @Override // H2.H
    public final void t(int i7, A a7, C0016q c0016q, C0020v c0020v) {
        R(P(i7, a7), 1002, new b(27));
    }

    @Override // e2.t0
    public final void u(boolean z7) {
        C0695a M6 = M();
        R(M6, 3, new d(M6, z7));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [H2.y, H2.A] */
    @Override // e2.t0
    public final void w(C0616l c0616l) {
        C0695a M6;
        C0023y c0023y;
        if ((c0616l instanceof C0616l) && (c0023y = c0616l.f10009x) != null) {
            M6 = N(new C0023y(c0023y));
        } else {
            M6 = M();
        }
        R(M6, 10, new b(17));
    }

    @Override // e2.t0
    public final void x(M2.c cVar) {
        R(M(), 27, new b(3));
    }

    @Override // e2.t0
    public final void y(boolean z7) {
        R(Q(), 23, new d(7));
    }

    @Override // e2.t0
    public final void z(z zVar) {
        C0695a Q4 = Q();
        R(Q4, 25, new C0628x(Q4, zVar));
    }

    @Override // e2.t0
    public final void v() {
    }

    @Override // e2.t0
    public final void g(s0 s0Var) {
    }
}
