package m2;

import F3.m;
import Z2.H;
import Z2.y;
import k2.C0943h;
import k2.InterfaceC0946k;
import k2.InterfaceC0947l;
import k2.InterfaceC0948m;
/* renamed from: m2.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0988b implements InterfaceC0946k {

    /* renamed from: c  reason: collision with root package name */
    public int f12387c;

    /* renamed from: e  reason: collision with root package name */
    public C0989c f12388e;

    /* renamed from: h  reason: collision with root package name */
    public long f12390h;

    /* renamed from: i  reason: collision with root package name */
    public C0991e f12391i;

    /* renamed from: m  reason: collision with root package name */
    public int f12395m;
    public boolean n;

    /* renamed from: a  reason: collision with root package name */
    public final y f12385a = new y(12);

    /* renamed from: b  reason: collision with root package name */
    public final m f12386b = new Object();
    public InterfaceC0948m d = new J3.e(27);

    /* renamed from: g  reason: collision with root package name */
    public C0991e[] f12389g = new C0991e[0];

    /* renamed from: k  reason: collision with root package name */
    public long f12393k = -1;

    /* renamed from: l  reason: collision with root package name */
    public long f12394l = -1;

    /* renamed from: j  reason: collision with root package name */
    public int f12392j = -1;
    public long f = -9223372036854775807L;

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0101  */
    @Override // k2.InterfaceC0946k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int d(k2.InterfaceC0947l r22, U4.k r23) {
        /*
            Method dump skipped, instructions count: 1068
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.C0988b.d(k2.l, U4.k):int");
    }

    @Override // k2.InterfaceC0946k
    public final void e(InterfaceC0948m interfaceC0948m) {
        this.f12387c = 0;
        this.d = interfaceC0948m;
        this.f12390h = -1L;
    }

    @Override // k2.InterfaceC0946k
    public final void h(long j7, long j8) {
        C0991e[] c0991eArr;
        this.f12390h = -1L;
        this.f12391i = null;
        for (C0991e c0991e : this.f12389g) {
            if (c0991e.f12410j == 0) {
                c0991e.f12408h = 0;
            } else {
                c0991e.f12408h = c0991e.f12412l[H.f(c0991e.f12411k, j7, true)];
            }
        }
        if (j7 == 0) {
            if (this.f12389g.length == 0) {
                this.f12387c = 0;
                return;
            } else {
                this.f12387c = 3;
                return;
            }
        }
        this.f12387c = 6;
    }

    @Override // k2.InterfaceC0946k
    public final boolean j(InterfaceC0947l interfaceC0947l) {
        y yVar = this.f12385a;
        ((C0943h) interfaceC0947l).i(yVar.f4691a, 0, 12, false);
        yVar.F(0);
        if (yVar.i() != 1179011410) {
            return false;
        }
        yVar.G(4);
        if (yVar.i() != 541677121) {
            return false;
        }
        return true;
    }

    @Override // k2.InterfaceC0946k
    public final void a() {
    }
}
