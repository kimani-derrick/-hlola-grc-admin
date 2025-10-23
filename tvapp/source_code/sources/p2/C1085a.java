package p2;

import M2.e;
import Z2.y;
import e2.C0593J;
import e2.K;
import k2.C0943h;
import k2.C0950o;
import k2.InterfaceC0946k;
import k2.InterfaceC0947l;
import k2.InterfaceC0948m;
import k2.w;
import s2.n;
import x2.C1461c;
import x2.InterfaceC1460b;
/* renamed from: p2.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1085a implements InterfaceC0946k {

    /* renamed from: b  reason: collision with root package name */
    public InterfaceC0948m f13122b;

    /* renamed from: c  reason: collision with root package name */
    public int f13123c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public int f13124e;

    /* renamed from: g  reason: collision with root package name */
    public D2.b f13125g;

    /* renamed from: h  reason: collision with root package name */
    public InterfaceC0947l f13126h;

    /* renamed from: i  reason: collision with root package name */
    public e f13127i;

    /* renamed from: j  reason: collision with root package name */
    public n f13128j;

    /* renamed from: a  reason: collision with root package name */
    public final y f13121a = new y(6);
    public long f = -1;

    @Override // k2.InterfaceC0946k
    public final void a() {
        n nVar = this.f13128j;
        if (nVar != null) {
            nVar.getClass();
        }
    }

    public final void b() {
        c(new InterfaceC1460b[0]);
        InterfaceC0948m interfaceC0948m = this.f13122b;
        interfaceC0948m.getClass();
        interfaceC0948m.l();
        this.f13122b.t(new C0950o(-9223372036854775807L));
        this.f13123c = 6;
    }

    public final void c(InterfaceC1460b... interfaceC1460bArr) {
        InterfaceC0948m interfaceC0948m = this.f13122b;
        interfaceC0948m.getClass();
        w q5 = interfaceC0948m.q(1024, 4);
        C0593J c0593j = new C0593J();
        c0593j.f9604j = "image/jpeg";
        c0593j.f9603i = new C1461c(interfaceC1460bArr);
        q5.e(new K(c0593j));
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x015b  */
    @Override // k2.InterfaceC0946k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int d(k2.InterfaceC0947l r26, U4.k r27) {
        /*
            Method dump skipped, instructions count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.C1085a.d(k2.l, U4.k):int");
    }

    @Override // k2.InterfaceC0946k
    public final void e(InterfaceC0948m interfaceC0948m) {
        this.f13122b = interfaceC0948m;
    }

    @Override // k2.InterfaceC0946k
    public final void h(long j7, long j8) {
        if (j7 == 0) {
            this.f13123c = 0;
            this.f13128j = null;
        } else if (this.f13123c == 5) {
            n nVar = this.f13128j;
            nVar.getClass();
            nVar.h(j7, j8);
        }
    }

    @Override // k2.InterfaceC0946k
    public final boolean j(InterfaceC0947l interfaceC0947l) {
        C0943h c0943h = (C0943h) interfaceC0947l;
        y yVar = this.f13121a;
        yVar.C(2);
        c0943h.i(yVar.f4691a, 0, 2, false);
        if (yVar.z() != 65496) {
            return false;
        }
        yVar.C(2);
        c0943h.i(yVar.f4691a, 0, 2, false);
        int z7 = yVar.z();
        this.d = z7;
        if (z7 == 65504) {
            yVar.C(2);
            c0943h.i(yVar.f4691a, 0, 2, false);
            c0943h.a(yVar.z() - 2, false);
            yVar.C(2);
            c0943h.i(yVar.f4691a, 0, 2, false);
            this.d = yVar.z();
        }
        if (this.d != 65505) {
            return false;
        }
        c0943h.a(2, false);
        yVar.C(6);
        c0943h.i(yVar.f4691a, 0, 6, false);
        if (yVar.v() != 1165519206 || yVar.z() != 0) {
            return false;
        }
        return true;
    }
}
