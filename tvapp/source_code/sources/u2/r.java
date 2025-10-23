package u2;

import Z2.AbstractC0156a;
import k2.InterfaceC0948m;
/* loaded from: classes.dex */
public final class r implements h {

    /* renamed from: a  reason: collision with root package name */
    public final C1264B f14875a;

    /* renamed from: b  reason: collision with root package name */
    public String f14876b;

    /* renamed from: c  reason: collision with root package name */
    public k2.w f14877c;
    public q d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f14878e;

    /* renamed from: l  reason: collision with root package name */
    public long f14884l;
    public final boolean[] f = new boolean[3];

    /* renamed from: g  reason: collision with root package name */
    public final u f14879g = new u(32);

    /* renamed from: h  reason: collision with root package name */
    public final u f14880h = new u(33);

    /* renamed from: i  reason: collision with root package name */
    public final u f14881i = new u(34);

    /* renamed from: j  reason: collision with root package name */
    public final u f14882j = new u(39);

    /* renamed from: k  reason: collision with root package name */
    public final u f14883k = new u(40);

    /* renamed from: m  reason: collision with root package name */
    public long f14885m = -9223372036854775807L;
    public final Z2.y n = new Z2.y();

    public r(C1264B c1264b) {
        this.f14875a = c1264b;
    }

    @Override // u2.h
    public final void a() {
        this.f14884l = 0L;
        this.f14885m = -9223372036854775807L;
        AbstractC0156a.n(this.f);
        this.f14879g.f();
        this.f14880h.f();
        this.f14881i.f();
        this.f14882j.f();
        this.f14883k.f();
        q qVar = this.d;
        if (qVar != null) {
            qVar.f = false;
            qVar.f14868g = false;
            qVar.f14869h = false;
            qVar.f14870i = false;
            qVar.f14871j = false;
        }
    }

    public final void b(byte[] bArr, int i7, int i8) {
        boolean z7;
        q qVar = this.d;
        if (qVar.f) {
            int i9 = qVar.d;
            int i10 = (i7 + 2) - i9;
            if (i10 < i8) {
                if ((bArr[i10] & 128) != 0) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                qVar.f14868g = z7;
                qVar.f = false;
            } else {
                qVar.d = (i8 - i7) + i9;
            }
        }
        if (!this.f14878e) {
            this.f14879g.a(bArr, i7, i8);
            this.f14880h.a(bArr, i7, i8);
            this.f14881i.a(bArr, i7, i8);
        }
        this.f14882j.a(bArr, i7, i8);
        this.f14883k.a(bArr, i7, i8);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0261 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0252  */
    @Override // u2.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(Z2.y r33) {
        /*
            Method dump skipped, instructions count: 631
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u2.r.c(Z2.y):void");
    }

    @Override // u2.h
    public final void e(long j7, int i7) {
        if (j7 != -9223372036854775807L) {
            this.f14885m = j7;
        }
    }

    @Override // u2.h
    public final void f(InterfaceC0948m interfaceC0948m, F f) {
        f.a();
        f.b();
        this.f14876b = f.f14725e;
        f.b();
        k2.w q5 = interfaceC0948m.q(f.d, 2);
        this.f14877c = q5;
        this.d = new q(q5);
        this.f14875a.b(interfaceC0948m, f);
    }

    @Override // u2.h
    public final void d() {
    }
}
