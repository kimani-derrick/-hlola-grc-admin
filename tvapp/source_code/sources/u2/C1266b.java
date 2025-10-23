package u2;

import e2.K;
import k2.InterfaceC0948m;
/* renamed from: u2.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1266b implements h {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14729a;

    /* renamed from: b  reason: collision with root package name */
    public final N2.f f14730b;

    /* renamed from: c  reason: collision with root package name */
    public final Z2.y f14731c;
    public final String d;

    /* renamed from: e  reason: collision with root package name */
    public String f14732e;
    public k2.w f;

    /* renamed from: g  reason: collision with root package name */
    public int f14733g;

    /* renamed from: h  reason: collision with root package name */
    public int f14734h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f14735i;

    /* renamed from: j  reason: collision with root package name */
    public long f14736j;

    /* renamed from: k  reason: collision with root package name */
    public K f14737k;

    /* renamed from: l  reason: collision with root package name */
    public int f14738l;

    /* renamed from: m  reason: collision with root package name */
    public long f14739m;

    public C1266b(String str, int i7) {
        this.f14729a = i7;
        switch (i7) {
            case 1:
                N2.f fVar = new N2.f(16, new byte[16]);
                this.f14730b = fVar;
                this.f14731c = new Z2.y(fVar.f2472b);
                this.f14733g = 0;
                this.f14734h = 0;
                this.f14735i = false;
                this.f14739m = -9223372036854775807L;
                this.d = str;
                return;
            default:
                N2.f fVar2 = new N2.f(128, new byte[128]);
                this.f14730b = fVar2;
                this.f14731c = new Z2.y(fVar2.f2472b);
                this.f14733g = 0;
                this.f14739m = -9223372036854775807L;
                this.d = str;
                return;
        }
    }

    @Override // u2.h
    public final void a() {
        switch (this.f14729a) {
            case 0:
                this.f14733g = 0;
                this.f14734h = 0;
                this.f14735i = false;
                this.f14739m = -9223372036854775807L;
                return;
            default:
                this.f14733g = 0;
                this.f14734h = 0;
                this.f14735i = false;
                this.f14739m = -9223372036854775807L;
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:203:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0399  */
    @Override // u2.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(Z2.y r23) {
        /*
            Method dump skipped, instructions count: 1222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u2.C1266b.c(Z2.y):void");
    }

    @Override // u2.h
    public final void d() {
        int i7 = this.f14729a;
    }

    @Override // u2.h
    public final void e(long j7, int i7) {
        switch (this.f14729a) {
            case 0:
                if (j7 != -9223372036854775807L) {
                    this.f14739m = j7;
                    return;
                }
                return;
            default:
                if (j7 != -9223372036854775807L) {
                    this.f14739m = j7;
                    return;
                }
                return;
        }
    }

    @Override // u2.h
    public final void f(InterfaceC0948m interfaceC0948m, F f) {
        int i7 = this.f14729a;
        f.a();
        switch (i7) {
            case 0:
                f.b();
                this.f14732e = f.f14725e;
                f.b();
                this.f = interfaceC0948m.q(f.d, 1);
                return;
            default:
                f.b();
                this.f14732e = f.f14725e;
                f.b();
                this.f = interfaceC0948m.q(f.d, 1);
                return;
        }
    }

    private final void b() {
    }

    private final void g() {
    }
}
