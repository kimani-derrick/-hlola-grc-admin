package n2;

import C2.i;
import U4.k;
import Z2.y;
import k.C0852F;
import k2.C0943h;
import k2.C0951p;
import k2.InterfaceC0946k;
import k2.InterfaceC0947l;
import k2.InterfaceC0948m;
import k2.w;
import x2.C1461c;
/* renamed from: n2.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1031b implements InterfaceC0946k {

    /* renamed from: e  reason: collision with root package name */
    public InterfaceC0948m f12655e;
    public w f;

    /* renamed from: h  reason: collision with root package name */
    public C1461c f12657h;

    /* renamed from: i  reason: collision with root package name */
    public C0951p f12658i;

    /* renamed from: j  reason: collision with root package name */
    public int f12659j;

    /* renamed from: k  reason: collision with root package name */
    public int f12660k;

    /* renamed from: l  reason: collision with root package name */
    public C1030a f12661l;

    /* renamed from: m  reason: collision with root package name */
    public int f12662m;
    public long n;

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f12652a = new byte[42];

    /* renamed from: b  reason: collision with root package name */
    public final y f12653b = new y(0, new byte[32768]);

    /* renamed from: c  reason: collision with root package name */
    public final boolean f12654c = false;
    public final k d = new Object();

    /* renamed from: g  reason: collision with root package name */
    public int f12656g = 0;

    /* JADX WARN: Code restructure failed: missing block: B:64:0x010a, code lost:
        r1.F(r5);
        r5 = r11.f3459a;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0363 A[LOOP:3: B:116:0x024d->B:142:0x0363, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0368 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v30 */
    @Override // k2.InterfaceC0946k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int d(k2.InterfaceC0947l r30, U4.k r31) {
        /*
            Method dump skipped, instructions count: 1004
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.C1031b.d(k2.l, U4.k):int");
    }

    @Override // k2.InterfaceC0946k
    public final void e(InterfaceC0948m interfaceC0948m) {
        this.f12655e = interfaceC0948m;
        this.f = interfaceC0948m.q(0, 1);
        interfaceC0948m.l();
    }

    @Override // k2.InterfaceC0946k
    public final void h(long j7, long j8) {
        long j9 = 0;
        if (j7 == 0) {
            this.f12656g = 0;
        } else {
            C1030a c1030a = this.f12661l;
            if (c1030a != null) {
                c1030a.d(j8);
            }
        }
        if (j8 != 0) {
            j9 = -1;
        }
        this.n = j9;
        this.f12662m = 0;
        this.f12653b.C(0);
    }

    @Override // k2.InterfaceC0946k
    public final boolean j(InterfaceC0947l interfaceC0947l) {
        C0943h c0943h = (C0943h) interfaceC0947l;
        C1461c B6 = new C0852F(1).B(c0943h, i.f403b);
        if (B6 != null) {
            int length = B6.f16206q.length;
        }
        y yVar = new y(4);
        c0943h.i(yVar.f4691a, 0, 4, false);
        if (yVar.v() != 1716281667) {
            return false;
        }
        return true;
    }

    @Override // k2.InterfaceC0946k
    public final void a() {
    }
}
