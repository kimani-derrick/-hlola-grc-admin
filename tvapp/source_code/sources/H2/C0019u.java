package H2;

import Z2.AbstractC0156a;
import e2.H0;
import e2.I0;
import e2.J0;
/* renamed from: H2.u  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0019u extends p0 {

    /* renamed from: l  reason: collision with root package name */
    public final boolean f1168l;

    /* renamed from: m  reason: collision with root package name */
    public final I0 f1169m;
    public final H0 n;

    /* renamed from: o  reason: collision with root package name */
    public C0017s f1170o;

    /* renamed from: p  reason: collision with root package name */
    public r f1171p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f1172q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f1173r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f1174s;

    public C0019u(AbstractC0000a abstractC0000a, boolean z7) {
        super(abstractC0000a);
        boolean z8;
        if (z7 && abstractC0000a.h()) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f1168l = z8;
        this.f1169m = new I0();
        this.n = new H0();
        J0 f = abstractC0000a.f();
        if (f != null) {
            this.f1170o = new C0017s(f, null, null);
            this.f1174s = true;
            return;
        }
        this.f1170o = new C0017s(new C0018t(abstractC0000a.g()), I0.f9561H, C0017s.f1164u);
    }

    public final void A(long j7) {
        r rVar = this.f1171p;
        int b7 = this.f1170o.b(rVar.f1157q.f1180a);
        if (b7 == -1) {
            return;
        }
        C0017s c0017s = this.f1170o;
        H0 h02 = this.n;
        c0017s.g(b7, h02, false);
        long j8 = h02.f9555t;
        if (j8 != -9223372036854775807L && j7 >= j8) {
            j7 = Math.max(0L, j8 - 1);
        }
        rVar.f1163w = j7;
    }

    @Override // H2.AbstractC0000a
    public final void m(InterfaceC0022x interfaceC0022x) {
        ((r) interfaceC0022x).c();
        if (interfaceC0022x == this.f1171p) {
            this.f1171p = null;
        }
    }

    @Override // H2.AbstractC0010k, H2.AbstractC0000a
    public final void o() {
        this.f1173r = false;
        this.f1172q = false;
        super.o();
    }

    @Override // H2.p0
    public final A w(A a7) {
        Object obj = a7.f1180a;
        Object obj2 = this.f1170o.f1166t;
        if (obj2 != null && obj2.equals(obj)) {
            obj = C0017s.f1164u;
        }
        return a7.b(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    @Override // H2.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x(e2.J0 r15) {
        /*
            Method dump skipped, instructions count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H2.C0019u.x(e2.J0):void");
    }

    @Override // H2.p0
    public final void y() {
        if (!this.f1168l) {
            this.f1172q = true;
            v(null, this.f1155k);
        }
    }

    @Override // H2.AbstractC0000a
    /* renamed from: z */
    public final r a(A a7, Y2.r rVar, long j7) {
        boolean z7;
        r rVar2 = new r(a7, rVar, j7);
        if (rVar2.f1160t == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        AbstractC0156a.k(z7);
        AbstractC0000a abstractC0000a = this.f1155k;
        rVar2.f1160t = abstractC0000a;
        if (this.f1173r) {
            Object obj = this.f1170o.f1166t;
            Object obj2 = a7.f1180a;
            if (obj != null && obj2.equals(C0017s.f1164u)) {
                obj2 = this.f1170o.f1166t;
            }
            rVar2.b(a7.b(obj2));
        } else {
            this.f1171p = rVar2;
            if (!this.f1172q) {
                this.f1172q = true;
                v(null, abstractC0000a);
            }
        }
        return rVar2;
    }

    @Override // H2.AbstractC0010k, H2.AbstractC0000a
    public final void i() {
    }
}
