package o2;

import Z2.y;
import k2.C0943h;
import k2.C0945j;
import k2.InterfaceC0946k;
import k2.InterfaceC0947l;
import k2.InterfaceC0948m;
/* renamed from: o2.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1064b implements InterfaceC0946k {

    /* renamed from: a  reason: collision with root package name */
    public final y f12894a = new y(4);

    /* renamed from: b  reason: collision with root package name */
    public final y f12895b = new y(9);

    /* renamed from: c  reason: collision with root package name */
    public final y f12896c = new y(11);
    public final y d = new y();

    /* renamed from: e  reason: collision with root package name */
    public final C1065c f12897e;
    public InterfaceC0948m f;

    /* renamed from: g  reason: collision with root package name */
    public int f12898g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f12899h;

    /* renamed from: i  reason: collision with root package name */
    public long f12900i;

    /* renamed from: j  reason: collision with root package name */
    public int f12901j;

    /* renamed from: k  reason: collision with root package name */
    public int f12902k;

    /* renamed from: l  reason: collision with root package name */
    public int f12903l;

    /* renamed from: m  reason: collision with root package name */
    public long f12904m;
    public boolean n;

    /* renamed from: o  reason: collision with root package name */
    public C1063a f12905o;

    /* renamed from: p  reason: collision with root package name */
    public C1066d f12906p;

    /* JADX WARN: Type inference failed for: r0v4, types: [P1.c, o2.c] */
    public C1064b() {
        ?? cVar = new P1.c(new C0945j());
        cVar.f12907r = -9223372036854775807L;
        cVar.f12908s = new long[0];
        cVar.f12909t = new long[0];
        this.f12897e = cVar;
        this.f12898g = 1;
    }

    public final y b(C0943h c0943h) {
        int i7 = this.f12903l;
        y yVar = this.d;
        byte[] bArr = yVar.f4691a;
        if (i7 > bArr.length) {
            yVar.D(0, new byte[Math.max(bArr.length * 2, i7)]);
        } else {
            yVar.F(0);
        }
        yVar.E(this.f12903l);
        c0943h.e(yVar.f4691a, 0, this.f12903l, false);
        return yVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00e4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v9, types: [P1.c, o2.a] */
    @Override // k2.InterfaceC0946k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int d(k2.InterfaceC0947l r16, U4.k r17) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o2.C1064b.d(k2.l, U4.k):int");
    }

    @Override // k2.InterfaceC0946k
    public final void e(InterfaceC0948m interfaceC0948m) {
        this.f = interfaceC0948m;
    }

    @Override // k2.InterfaceC0946k
    public final void h(long j7, long j8) {
        if (j7 == 0) {
            this.f12898g = 1;
            this.f12899h = false;
        } else {
            this.f12898g = 3;
        }
        this.f12901j = 0;
    }

    @Override // k2.InterfaceC0946k
    public final boolean j(InterfaceC0947l interfaceC0947l) {
        y yVar = this.f12894a;
        C0943h c0943h = (C0943h) interfaceC0947l;
        c0943h.i(yVar.f4691a, 0, 3, false);
        yVar.F(0);
        if (yVar.w() != 4607062) {
            return false;
        }
        c0943h.i(yVar.f4691a, 0, 2, false);
        yVar.F(0);
        if ((yVar.z() & 250) != 0) {
            return false;
        }
        c0943h.i(yVar.f4691a, 0, 4, false);
        yVar.F(0);
        int g7 = yVar.g();
        c0943h.f12168v = 0;
        c0943h.a(g7, false);
        c0943h.i(yVar.f4691a, 0, 4, false);
        yVar.F(0);
        if (yVar.g() != 0) {
            return false;
        }
        return true;
    }

    @Override // k2.InterfaceC0946k
    public final void a() {
    }
}
