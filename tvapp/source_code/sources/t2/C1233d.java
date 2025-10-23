package t2;

import Z2.H;
import Z2.y;
import e2.m0;
import k2.C0943h;
import k2.InterfaceC0946k;
import k2.InterfaceC0947l;
import k2.InterfaceC0948m;
/* renamed from: t2.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1233d implements InterfaceC0946k {

    /* renamed from: a  reason: collision with root package name */
    public InterfaceC0948m f14541a;

    /* renamed from: b  reason: collision with root package name */
    public j f14542b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f14543c;

    public final boolean b(C0943h c0943h) {
        j jVar;
        C1235f c1235f = new C1235f();
        if (c1235f.a(c0943h, true) && (c1235f.f14548a & 2) == 2) {
            int min = Math.min(c1235f.f14551e, 8);
            y yVar = new y(min);
            c0943h.i(yVar.f4691a, 0, min, false);
            yVar.F(0);
            if (yVar.a() >= 5 && yVar.u() == 127 && yVar.v() == 1179402563) {
                jVar = new j();
            } else {
                yVar.F(0);
                try {
                    if (h4.b.I(1, yVar, true)) {
                        jVar = new j();
                    }
                } catch (m0 unused) {
                }
                yVar.F(0);
                if (h.e(yVar, h.f14553o)) {
                    jVar = new j();
                }
            }
            this.f14542b = jVar;
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x017a  */
    @Override // k2.InterfaceC0946k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int d(k2.InterfaceC0947l r21, U4.k r22) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t2.C1233d.d(k2.l, U4.k):int");
    }

    @Override // k2.InterfaceC0946k
    public final void e(InterfaceC0948m interfaceC0948m) {
        this.f14541a = interfaceC0948m;
    }

    @Override // k2.InterfaceC0946k
    public final void h(long j7, long j8) {
        j jVar = this.f14542b;
        if (jVar != null) {
            C1234e c1234e = jVar.f14558a;
            C1235f c1235f = c1234e.f14544a;
            c1235f.f14548a = 0;
            c1235f.f14549b = 0L;
            c1235f.f14550c = 0;
            c1235f.d = 0;
            c1235f.f14551e = 0;
            c1234e.f14545b.C(0);
            c1234e.f14546c = -1;
            c1234e.f14547e = false;
            if (j7 == 0) {
                jVar.d(!jVar.f14567l);
            } else if (jVar.f14563h != 0) {
                long j9 = (jVar.f14564i * j8) / 1000000;
                jVar.f14561e = j9;
                InterfaceC1236g interfaceC1236g = jVar.d;
                int i7 = H.f4603a;
                interfaceC1236g.d(j9);
                jVar.f14563h = 2;
            }
        }
    }

    @Override // k2.InterfaceC0946k
    public final boolean j(InterfaceC0947l interfaceC0947l) {
        try {
            return b((C0943h) interfaceC0947l);
        } catch (m0 unused) {
            return false;
        }
    }

    @Override // k2.InterfaceC0946k
    public final void a() {
    }
}
