package u2;

import e2.K;
import k2.InterfaceC0948m;
/* loaded from: classes.dex */
public final class s implements h {

    /* renamed from: a  reason: collision with root package name */
    public final String f14886a;

    /* renamed from: b  reason: collision with root package name */
    public final Z2.y f14887b;

    /* renamed from: c  reason: collision with root package name */
    public final N2.f f14888c;
    public k2.w d;

    /* renamed from: e  reason: collision with root package name */
    public String f14889e;
    public K f;

    /* renamed from: g  reason: collision with root package name */
    public int f14890g;

    /* renamed from: h  reason: collision with root package name */
    public int f14891h;

    /* renamed from: i  reason: collision with root package name */
    public int f14892i;

    /* renamed from: j  reason: collision with root package name */
    public int f14893j;

    /* renamed from: k  reason: collision with root package name */
    public long f14894k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f14895l;

    /* renamed from: m  reason: collision with root package name */
    public int f14896m;
    public int n;

    /* renamed from: o  reason: collision with root package name */
    public int f14897o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f14898p;

    /* renamed from: q  reason: collision with root package name */
    public long f14899q;

    /* renamed from: r  reason: collision with root package name */
    public int f14900r;

    /* renamed from: s  reason: collision with root package name */
    public long f14901s;

    /* renamed from: t  reason: collision with root package name */
    public int f14902t;

    /* renamed from: u  reason: collision with root package name */
    public String f14903u;

    public s(String str) {
        this.f14886a = str;
        Z2.y yVar = new Z2.y(1024);
        this.f14887b = yVar;
        byte[] bArr = yVar.f4691a;
        this.f14888c = new N2.f(bArr.length, bArr);
        this.f14894k = -9223372036854775807L;
    }

    @Override // u2.h
    public final void a() {
        this.f14890g = 0;
        this.f14894k = -9223372036854775807L;
        this.f14895l = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0192, code lost:
        if (r23.f14895l == false) goto L26;
     */
    @Override // u2.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(Z2.y r24) {
        /*
            Method dump skipped, instructions count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u2.s.c(Z2.y):void");
    }

    @Override // u2.h
    public final void e(long j7, int i7) {
        if (j7 != -9223372036854775807L) {
            this.f14894k = j7;
        }
    }

    @Override // u2.h
    public final void f(InterfaceC0948m interfaceC0948m, F f) {
        f.a();
        f.b();
        this.d = interfaceC0948m.q(f.d, 1);
        f.b();
        this.f14889e = f.f14725e;
    }

    @Override // u2.h
    public final void d() {
    }
}
