package u2;

import k2.C0943h;
import k2.InterfaceC0946k;
import k2.InterfaceC0947l;
import k2.InterfaceC0948m;
/* renamed from: u2.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1268d implements InterfaceC0946k {
    public final Z2.y d;

    /* renamed from: e  reason: collision with root package name */
    public final N2.f f14746e;
    public InterfaceC0948m f;

    /* renamed from: g  reason: collision with root package name */
    public long f14747g;

    /* renamed from: j  reason: collision with root package name */
    public boolean f14750j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f14751k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f14752l;

    /* renamed from: a  reason: collision with root package name */
    public final int f14743a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final C1269e f14744b = new C1269e(true, null);

    /* renamed from: c  reason: collision with root package name */
    public final Z2.y f14745c = new Z2.y(2048);

    /* renamed from: i  reason: collision with root package name */
    public int f14749i = -1;

    /* renamed from: h  reason: collision with root package name */
    public long f14748h = -1;

    public C1268d() {
        Z2.y yVar = new Z2.y(10);
        this.d = yVar;
        byte[] bArr = yVar.f4691a;
        this.f14746e = new N2.f(bArr.length, bArr);
    }

    public final int b(C0943h c0943h) {
        int i7 = 0;
        while (true) {
            Z2.y yVar = this.d;
            c0943h.i(yVar.f4691a, 0, 10, false);
            yVar.F(0);
            if (yVar.w() != 4801587) {
                break;
            }
            yVar.G(3);
            int t5 = yVar.t();
            i7 += t5 + 10;
            c0943h.a(t5, false);
        }
        c0943h.f12168v = 0;
        c0943h.a(i7, false);
        if (this.f14748h == -1) {
            this.f14748h = i7;
        }
        return i7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x008a, code lost:
        r18.f14750j = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0094, code lost:
        throw e2.m0.a("Malformed ADTS stream", null);
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0113 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0115  */
    @Override // k2.InterfaceC0946k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int d(k2.InterfaceC0947l r19, U4.k r20) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u2.C1268d.d(k2.l, U4.k):int");
    }

    @Override // k2.InterfaceC0946k
    public final void e(InterfaceC0948m interfaceC0948m) {
        this.f = interfaceC0948m;
        this.f14744b.f(interfaceC0948m, new F(0, 1));
        interfaceC0948m.l();
    }

    @Override // k2.InterfaceC0946k
    public final void h(long j7, long j8) {
        this.f14751k = false;
        this.f14744b.a();
        this.f14747g = j8;
    }

    @Override // k2.InterfaceC0946k
    public final boolean j(InterfaceC0947l interfaceC0947l) {
        C0943h c0943h = (C0943h) interfaceC0947l;
        int b7 = b(c0943h);
        int i7 = b7;
        int i8 = 0;
        int i9 = 0;
        do {
            Z2.y yVar = this.d;
            c0943h.i(yVar.f4691a, 0, 2, false);
            yVar.F(0);
            if ((yVar.z() & 65526) == 65520) {
                i8++;
                if (i8 >= 4 && i9 > 188) {
                    return true;
                }
                c0943h.i(yVar.f4691a, 0, 4, false);
                N2.f fVar = this.f14746e;
                fVar.p(14);
                int i10 = fVar.i(13);
                if (i10 <= 6) {
                    i7++;
                    c0943h.f12168v = 0;
                } else {
                    c0943h.a(i10 - 6, false);
                    i9 += i10;
                }
            } else {
                i7++;
                c0943h.f12168v = 0;
            }
            c0943h.a(i7, false);
            i8 = 0;
            i9 = 0;
        } while (i7 - b7 < 8192);
        return false;
    }

    @Override // k2.InterfaceC0946k
    public final void a() {
    }
}
