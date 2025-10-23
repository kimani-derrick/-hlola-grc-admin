package u2;

import Z2.AbstractC0156a;
import k2.InterfaceC0948m;
/* loaded from: classes.dex */
public final class j implements h {

    /* renamed from: q  reason: collision with root package name */
    public static final double[] f14790q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a  reason: collision with root package name */
    public String f14791a;

    /* renamed from: b  reason: collision with root package name */
    public k2.w f14792b;

    /* renamed from: c  reason: collision with root package name */
    public final C1264B f14793c;
    public final Z2.y d;

    /* renamed from: e  reason: collision with root package name */
    public final u f14794e;
    public final boolean[] f = new boolean[4];

    /* renamed from: g  reason: collision with root package name */
    public final i f14795g;

    /* renamed from: h  reason: collision with root package name */
    public long f14796h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f14797i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f14798j;

    /* renamed from: k  reason: collision with root package name */
    public long f14799k;

    /* renamed from: l  reason: collision with root package name */
    public long f14800l;

    /* renamed from: m  reason: collision with root package name */
    public long f14801m;
    public long n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f14802o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f14803p;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, u2.i] */
    public j(C1264B c1264b) {
        Z2.y yVar;
        this.f14793c = c1264b;
        ?? obj = new Object();
        obj.d = new byte[128];
        this.f14795g = obj;
        if (c1264b != null) {
            this.f14794e = new u(178);
            yVar = new Z2.y();
        } else {
            yVar = null;
            this.f14794e = null;
        }
        this.d = yVar;
        this.f14800l = -9223372036854775807L;
        this.n = -9223372036854775807L;
    }

    @Override // u2.h
    public final void a() {
        AbstractC0156a.n(this.f);
        i iVar = this.f14795g;
        iVar.f14787a = false;
        iVar.f14788b = 0;
        iVar.f14789c = 0;
        u uVar = this.f14794e;
        if (uVar != null) {
            uVar.f();
        }
        this.f14796h = 0L;
        this.f14797i = false;
        this.f14800l = -9223372036854775807L;
        this.n = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0204  */
    @Override // u2.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(Z2.y r27) {
        /*
            Method dump skipped, instructions count: 527
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u2.j.c(Z2.y):void");
    }

    @Override // u2.h
    public final void e(long j7, int i7) {
        this.f14800l = j7;
    }

    @Override // u2.h
    public final void f(InterfaceC0948m interfaceC0948m, F f) {
        f.a();
        f.b();
        this.f14791a = f.f14725e;
        f.b();
        this.f14792b = interfaceC0948m.q(f.d, 2);
        C1264B c1264b = this.f14793c;
        if (c1264b != null) {
            c1264b.b(interfaceC0948m, f);
        }
    }

    @Override // u2.h
    public final void d() {
    }
}
