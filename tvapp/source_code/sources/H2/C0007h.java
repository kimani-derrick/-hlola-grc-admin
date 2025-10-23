package H2;

import Z2.AbstractC0156a;
import e2.I0;
import e2.J0;
import java.util.ArrayList;
/* renamed from: H2.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0007h extends p0 {

    /* renamed from: l  reason: collision with root package name */
    public final long f1066l;

    /* renamed from: m  reason: collision with root package name */
    public final long f1067m;
    public final boolean n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f1068o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f1069p;

    /* renamed from: q  reason: collision with root package name */
    public final ArrayList f1070q;

    /* renamed from: r  reason: collision with root package name */
    public final I0 f1071r;

    /* renamed from: s  reason: collision with root package name */
    public C0005f f1072s;

    /* renamed from: t  reason: collision with root package name */
    public C0006g f1073t;

    /* renamed from: u  reason: collision with root package name */
    public long f1074u;

    /* renamed from: v  reason: collision with root package name */
    public long f1075v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0007h(AbstractC0000a abstractC0000a, long j7, long j8, boolean z7, boolean z8, boolean z9) {
        super(abstractC0000a);
        boolean z10;
        abstractC0000a.getClass();
        if (j7 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        AbstractC0156a.f(z10);
        this.f1066l = j7;
        this.f1067m = j8;
        this.n = z7;
        this.f1068o = z8;
        this.f1069p = z9;
        this.f1070q = new ArrayList();
        this.f1071r = new I0();
    }

    @Override // H2.AbstractC0000a
    public final InterfaceC0022x a(A a7, Y2.r rVar, long j7) {
        C0004e c0004e = new C0004e(this.f1155k.a(a7, rVar, j7), this.n, this.f1074u, this.f1075v);
        this.f1070q.add(c0004e);
        return c0004e;
    }

    @Override // H2.AbstractC0010k, H2.AbstractC0000a
    public final void i() {
        C0006g c0006g = this.f1073t;
        if (c0006g == null) {
            super.i();
            return;
        }
        throw c0006g;
    }

    @Override // H2.AbstractC0000a
    public final void m(InterfaceC0022x interfaceC0022x) {
        ArrayList arrayList = this.f1070q;
        AbstractC0156a.k(arrayList.remove(interfaceC0022x));
        this.f1155k.m(((C0004e) interfaceC0022x).f1052q);
        if (arrayList.isEmpty() && !this.f1068o) {
            C0005f c0005f = this.f1072s;
            c0005f.getClass();
            z(c0005f.f1149r);
        }
    }

    @Override // H2.AbstractC0010k, H2.AbstractC0000a
    public final void o() {
        super.o();
        this.f1073t = null;
        this.f1072s = null;
    }

    @Override // H2.p0
    public final void x(J0 j02) {
        if (this.f1073t != null) {
            return;
        }
        z(j02);
    }

    public final void z(J0 j02) {
        long j7;
        long j8;
        long j9;
        I0 i02 = this.f1071r;
        j02.o(0, i02);
        long j10 = i02.f9581G;
        C0005f c0005f = this.f1072s;
        ArrayList arrayList = this.f1070q;
        long j11 = this.f1067m;
        long j12 = Long.MIN_VALUE;
        if (c0005f != null && !arrayList.isEmpty() && !this.f1068o) {
            long j13 = this.f1074u - j10;
            if (j11 != Long.MIN_VALUE) {
                j12 = this.f1075v - j10;
            }
            j9 = j12;
            j8 = j13;
        } else {
            boolean z7 = this.f1069p;
            long j14 = this.f1066l;
            if (z7) {
                long j15 = i02.f9578C;
                j14 += j15;
                j7 = j15 + j11;
            } else {
                j7 = j11;
            }
            this.f1074u = j10 + j14;
            if (j11 != Long.MIN_VALUE) {
                j12 = j10 + j7;
            }
            this.f1075v = j12;
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                C0004e c0004e = (C0004e) arrayList.get(i7);
                long j16 = this.f1074u;
                long j17 = this.f1075v;
                c0004e.f1056u = j16;
                c0004e.f1057v = j17;
            }
            j8 = j14;
            j9 = j7;
        }
        try {
            C0005f c0005f2 = new C0005f(j02, j8, j9);
            this.f1072s = c0005f2;
            l(c0005f2);
        } catch (C0006g e3) {
            this.f1073t = e3;
            for (int i8 = 0; i8 < arrayList.size(); i8++) {
                ((C0004e) arrayList.get(i8)).f1058w = this.f1073t;
            }
        }
    }
}
