package u2;

import Z2.AbstractC0156a;
import k2.InterfaceC0948m;
/* loaded from: classes.dex */
public final class p implements h {

    /* renamed from: a  reason: collision with root package name */
    public final C1264B f14852a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f14853b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f14854c;

    /* renamed from: g  reason: collision with root package name */
    public long f14856g;

    /* renamed from: i  reason: collision with root package name */
    public String f14858i;

    /* renamed from: j  reason: collision with root package name */
    public k2.w f14859j;

    /* renamed from: k  reason: collision with root package name */
    public o f14860k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f14861l;
    public boolean n;

    /* renamed from: h  reason: collision with root package name */
    public final boolean[] f14857h = new boolean[3];
    public final u d = new u(7);

    /* renamed from: e  reason: collision with root package name */
    public final u f14855e = new u(8);
    public final u f = new u(6);

    /* renamed from: m  reason: collision with root package name */
    public long f14862m = -9223372036854775807L;

    /* renamed from: o  reason: collision with root package name */
    public final Z2.y f14863o = new Z2.y();

    public p(C1264B c1264b, boolean z7, boolean z8) {
        this.f14852a = c1264b;
        this.f14853b = z7;
        this.f14854c = z8;
    }

    @Override // u2.h
    public final void a() {
        this.f14856g = 0L;
        this.n = false;
        this.f14862m = -9223372036854775807L;
        AbstractC0156a.n(this.f14857h);
        this.d.f();
        this.f14855e.f();
        this.f.f();
        o oVar = this.f14860k;
        if (oVar != null) {
            oVar.f14845k = false;
            oVar.f14848o = false;
            n nVar = oVar.n;
            nVar.f14825b = false;
            nVar.f14824a = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(byte[] r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u2.p.b(byte[], int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x02cd, code lost:
        if (r2 != 1) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0218, code lost:
        if (r8.n != r9.n) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0229, code lost:
        if (r8.f14836p != r9.f14836p) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0237, code lost:
        if (r8.f14833l != r9.f14833l) goto L108;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0292 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0279  */
    @Override // u2.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(Z2.y r31) {
        /*
            Method dump skipped, instructions count: 768
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u2.p.c(Z2.y):void");
    }

    @Override // u2.h
    public final void e(long j7, int i7) {
        boolean z7;
        if (j7 != -9223372036854775807L) {
            this.f14862m = j7;
        }
        boolean z8 = this.n;
        if ((i7 & 2) != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.n = z8 | z7;
    }

    @Override // u2.h
    public final void f(InterfaceC0948m interfaceC0948m, F f) {
        f.a();
        f.b();
        this.f14858i = f.f14725e;
        f.b();
        k2.w q5 = interfaceC0948m.q(f.d, 2);
        this.f14859j = q5;
        this.f14860k = new o(q5, this.f14853b, this.f14854c);
        this.f14852a.b(interfaceC0948m, f);
    }

    @Override // u2.h
    public final void d() {
    }
}
